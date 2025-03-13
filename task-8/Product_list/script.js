document.addEventListener("DOMContentLoaded", fetchProducts);

function fetchProducts() {
    fetch("https://fakestoreapi.com/products")
        .then(response => response.json())
        .then(data => displayProducts(data))
        .catch(error => console.error("Error fetching products:", error));
}

function displayProducts(products) {
    const productContainer = document.getElementById("product-list");

    products.forEach(product => {
        const productElement = document.createElement("div");
        productElement.classList.add("product");

        productElement.innerHTML = `
            <img src="${product.image}" alt="${product.title}">
            <h2>${product.title}</h2>
            <p>$${product.price}</p>
        `;

        productContainer.appendChild(productElement);
    });
}
