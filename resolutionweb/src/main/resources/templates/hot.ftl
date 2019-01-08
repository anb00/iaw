<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Web and JPA sample</title>
    <meta charset="UTF-8" />
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container" style="background-color: #e5e5e5;width: 800px;height: 100%;margin-left: auto;margin-right: auto">
    <h1>Main Menu</h1>

    <div><a th:href="@{/stars/create}">New</a></div>
    <table class="table table-striped table-dark">
        <tr>
            <thead class="thead-dark">
            <th>Photo</th>
            <td>&nbsp;</td>
            <th>•</th>
            <th>Id</th>
            <td>&nbsp;</td>
            <th>•</th>
            <th>Name</th>
            <td>&nbsp;</td>
            <th>•</th>
            <th>Type</th>
            <td>&nbsp;</td>
            <th>•</th>
            <th>Price</th>
            <td>&nbsp;</td>
            <th>•</th>
            <th></th>
            </thead>
        </tr>
        <tr th:each="item : ${items}">
            <td colspan="3"><img src="http://lorempixel.com/400/200/nature" style="width: 100px;height: 90px;border-radius: 5px;"></td>
            <td>&nbsp;</td>
            <td th:text="${item.id}">0</td>
            <td th:text="${item.name}" colspan="4">Default name</td>
            <td th:text="${item.description}" colspan="3">Default type</td>
            <td></td>
            <td th:text="${item.price}" colspan="3">Default Price</td>
            <td><a th:href="@{/items/{id}(id=${item.id})}">Detail</a></td>
            <td><a th:href="@{/items/update/{id}(id=${item.id})}">Update</a></td>
            <td><a th:href="@{/items/delete/{id}(id=${item.id})}">Delete</a></td>
        </tr>
    </table>

</div>
<hr>
<table class="table table-striped table-dark">
    <tr>
        <thead class="thead-dark">
        <th>Photo</th>
        <td>&nbsp;</td>
        <th>•</th>
        <th>Id</th>
        <td>&nbsp;</td>
        <th>•</th>
        <th>Name</th>
        <td>&nbsp;</td>
        <th>•</th>
        <th>Type</th>
        <td>&nbsp;</td>
        <th>•</th>
        <th>Price</th>
        <td>&nbsp;</td>
        <th>•</th>
        <th></th>
        </thead>
    </tr>
    <tr th:each="item : ${i}">
        <td colspan="3"><img src="http://lorempixel.com/400/200/nature" style="width: 100px;height: 90px;border-radius: 5px;"></td>
        <td>&nbsp;</td>
        <td th:text="${item.id}">0</td>
        <td th:text="${item.name}" colspan="4">Default name</td>
        <td th:text="${item.description}" colspan="3">Default type</td>
        <td></td>
        <td th:text="${item.price}" colspan="3">Default Price</td>
        <td><a th:href="@{/items/{id}(id=${item.id})}">Detail</a></td>
        <td><a th:href="@{/items/update/{id}(id=${item.id})}">Update</a></td>
        <td><a th:href="@{/items/delete/{id}(id=${item.id})}">Delete</a></td>
    </tr>
</table>
<hr>
<#list item as i>
${i.name}: ${i.description}
</#list>
<#list items as cars>
    ${cars.name}: ${cars.description}
</#list>
<#list hotels as hot>
    ${hot.name}: ${hot.description}
</#list>
<#list Product  as car>
    ${car.name}: ${car.description}
</#list>
<hr>
<#if item??>
    <ul>
        <#list item as i>
            <li>${i!""}</li>
        </#list>
    </ul>
</#if>
<hr>
<#if items??>
    <ul>
        <#list item as item>
            <li>${item!""}</li>
        </#list>
    </ul>
</#if>
</body>
</html>