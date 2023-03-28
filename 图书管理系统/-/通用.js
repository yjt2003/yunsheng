function landing() {//此处是登录的总函数
    const one = document.getElementById("one").value;
    const two = document.getElementById("two").value;
    //const three = document.getElementById("three").value;
    let obj = {
        "account":`${one}`,
        "password":`${two}`,
        "stuID":null,
        "email":null,
        "bookforreturn":null,
        "status":null,
    }
    const three_one = document.getElementById("three_one").checked;// 读者
    const three_two = document.getElementById("three_two").checked;//管理员
        if(one && two !== false){
            //尝试插入接
            //alert(one);
            //alert(two);
            axios({
                url: 'http://dueg4e.natappfree.cc/Book_Management_System_war_exploded/userManage/servlet/LoginServlet/',
                method: 'POST',
                data: {
                    "account":`${one}`,
                    "password":`${two}`,
                },
                headers: {
                    'Content-Type': 'application/json'
                }
            })
            .then((res) => {
                console.log(res);
                if(res.data==1){
                    window.location.href="root/searchTwo.html";
                }else if(res.data==2){
                    window.location.href="读者管理.html";
                }else if(res.data==0){
                    alert("账号或密码输入错误");
                }else if(three_two==true||three_one==false){
                    alert("请勾选您的身份");
                }else if(res.data==3){
                    alert("账号已被封禁！")
                }
            })
        }
        
}

















