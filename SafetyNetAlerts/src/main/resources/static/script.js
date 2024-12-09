// src/main/resources/static/script.js
document.getElementById("firestationForm").addEventListener("submit", async function (e) {
    e.preventDefault();

    const stationNumber = document.getElementById("stationNumber").value;
    const resultDiv = document.getElementById("result");

    try {
        const response = await fetch(`/firestation?stationNumber=${stationNumber}`);
        if (!response.ok) {
            throw new Error("Failed to fetch people");
        }

        const people = await response.json();
        if (people.length === 0) {
            resultDiv.innerHTML = "<p>No people found for this fire station.</p>";
        } else {
            const list = document.createElement("ul");
            people.forEach(person => {
                const listItem = document.createElement("li");
                listItem.textContent = `${person.firstName} ${person.lastName} - ${person.phone}`;
                list.appendChild(listItem);
            });
            resultDiv.innerHTML = "";
            resultDiv.appendChild(list);
        }
    } catch (error) {
        resultDiv.innerHTML = `<p>Error: ${error.message}</p>`;
    }
});
