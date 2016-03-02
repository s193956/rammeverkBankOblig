<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Withdraw</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h1>Bank</h1>
<a href="balance">Show account balance</a>
<form id="withdrawRequest-form" role="form" th:action="@{/withdraw}" method="post" th:object="${withdrawRequest}">
    <p>Withdraw amount: <input  type="text" id="amount" name="amount" th:field="*{amount}" /></p>
    <p><input type="submit" value="Withdraw" /> <input type="reset" value="Reset" /></p>
</form>
</body>
</html>