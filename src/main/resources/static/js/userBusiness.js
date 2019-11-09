function updateUser(id,obj) {
    $.ajax({
        "url":"/getUserbyId",
        "data":{"uId":id},
        "type":"post",
        "dataType":"json",
        success:function (data) {
            if (date!=null){
                // $(obj).parent().remove();
                location.href="/user/toAdd";
            }
        },
        error:function (e) {
            alert("数据错误!"+e);
        }
    });
}
function deleteUser(id,obj) {
    $.ajax({
        "url":"/delete",
        "data":{"uId":id},
        "type":"get",
        "dataType":"json",
        success:function (data) {
            if (date!=null){
                $(obj).parent().parent().remove();
                // location.href="/user/toAdd";
            }
        },
        error:function (e) {
            alert("数据错误!"+e);
        }
    });
}