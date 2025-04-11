<%@ page contentType="text/html;charset=UTF-8" %>
<table class="table">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Price</th>
        <th>Actions</th>
    </tr>
 <c:forEach items="${books_list}" var="book">
    <tr>
        <td>${book.id}</td>
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>$${book.price}</td>
        <td>
            <a href="/admin/books/edit/${book.id}">Edit</a>
            <a href="/admin/books/delete/${book.id}" 
               onclick="return confirm('Are you sure?')">Delete</a>
        </td>
    </tr>
</c:forEach>
</table>
<a href="/admin/books/new">Add New Book</a>