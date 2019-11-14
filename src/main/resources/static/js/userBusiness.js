function updateUser(id, obj) {
    $.ajax({
        "url": "/user/getUserbyId",
        "data": {"uId": id},
        "type": "post",
        "dataType": "json",
        success: function (data) {
            // $(obj).parent().remove();
            request.setAttribute("erpUser", data);
            location.href = "/user/updateUser";
        },
        error: function () {
            alert("数据错误!");
        }
    });
}

function deleteUser(id, obj) {
    if (confirm("确定要删除此用户吗？")) {
        $.ajax({
            "url": "/user/deleteErpUserById",
            "data": {"uId": id},
            "type": "get",
            "dataType": "json",
            success: function (data) {
                if (data == true) {
                    $(obj).parent().parent().remove();
                    // location.href="/user/toAdd";
                }
            },
            error: function (e) {
                alert("数据错误!" + e);
            }
        });
    }
}