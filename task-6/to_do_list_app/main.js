document.addEventListener("DOMContentLoaded", () => {
    const input = document.querySelector("#todo");
    const btn = document.querySelector("#btn");
    const listCon = document.querySelector("#list-con");

    function addTask() {
        if (input.value === "") {
            alert("You have to enter any task");
        } else {
            const li = document.createElement("li");
            li.innerHTML = input.value;
            listCon.appendChild(li);
            const span = document.createElement("span");
            span.innerHTML = "\u{1F5D1}";
            span.style.color = "red";
            li.appendChild(span);
        }
        input.value = "";
    }

    btn.addEventListener("click", () => {
        addTask();
    });
    listCon.addEventListener("click",(e)=>{
        if(e.target.tagName=== "LI"){
            e.target.classList.toggle("checked");
        }
        else if(e.target.tagName ==="SPAN"){
            e.target.parentElement.remove();
        }
    })
});