async function fetchBooks() {
    const res = await fetch('http://localhost:8080/getBooks');

    const data = await res.json();
    console.log(data);
}
fetchBooks();