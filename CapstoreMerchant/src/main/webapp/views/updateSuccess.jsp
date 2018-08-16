<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="" method="post">
<table>
<tr>
<td>Product Name: <input type="text" name="ProductName">
</td>
</tr>
<tr>
<td>Description: <input type="text" name="productDesc">
</td>
</tr>
<tr>
<td><input type="text" name="productImageURL"></td>
</tr>
<tr>
<td><input type="text" name="productBannerURL"></td>
</tr>
<tr>
<td>Price: <input type="text" name="productPrice">
</td>
</tr>
<tr>
<td>Quantity: <input type="text" name="productQuantityAvailable">
</td>
</tr>

<tr>
<td>Brand Name: <input type="text" name="brand">
</td>
</tr>
<tr>
<td>Product Views: <input type="text" name="productViews">
</td>
</tr>
<tr>
<td>Status: <input type="text" name="productStatus">
</td>
</tr>
<tr>
<td>Category :<select id="dropdown">
<option value="Select Category" selected>Select Category</option>
<option value="Electronic Devices">Electronic Devices
<option value="Clothing">Clothing
<option value="Accessories">Accessories
<option value="Books">Books
<option value="Groceries">Groceries
</select></td>
</tr>
<tr>
<td><input type="submit" name="submit" value="Update">
</td>
<td><input type="reset" name="reset" value="reset"></td>
</tr>
</table>
</form>
</body>
</html>