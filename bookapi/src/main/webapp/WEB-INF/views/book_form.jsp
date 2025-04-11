<form action="/admin/books/save" method="post">
    <input type="hidden" name="id" value="${book.id}">
    Title: <input type="text" name="title" value="${book.title}" required><br>
    Author: <input type="text" name="author" value="${book.author}" required><br>
    Price: <input type="number" step="0.01" name="price" value="${book.price}" required><br>
    <button type="submit">Save</button>
</form>