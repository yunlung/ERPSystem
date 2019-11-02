function showContent(url) {
    $.ajax({
        "url": url,
        "type": "post",
        "dataType": "JSON",
        "success": function (data) {
            if (data == "table_content") {
                $("#content_table").attr("th:replace","common/tables_lists :: table_content");
            }
        },
        "error": function () {
            alert("地址错误！");
        }
    });
}
