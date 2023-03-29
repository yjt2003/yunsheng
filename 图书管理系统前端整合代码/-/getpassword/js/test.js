//axios.defaults.baseURL = '/Book_Manage_System/';

const sid = document.getElementById("schoolid");
const pwd = document.getElementById("password");
const usn = document.getElementById("username");
const eml = document.getElementById("email");
const sebtn = document.getElementById("bookManagementRetrievesendbtn");
const rebtn = document.getElementById("bookManagementRetrieveButton");


function myFunctionRetrieve() {//此处是注册的总函数
    var stuidv = document.getElementById("schoolid").value;
    var namev = document.getElementById("username").value;
    var pwdv = document.getElementById("password").value;
    var cfmpwdv = document.getElementById("confirmpassword").value;
    var emlv = document.getElementById("email").value;
    var emailverification = document.getElementById("emailverification").value;
    function retrieve(stuidv, namev, pwdv, cfmpwdv, emlv,emailverification) {
        let a = /^[1-9][0-9]{4,10}@qq.com$/;
        let b = a.test(emlv);
        // 密码为6-20位数字、字母或下划线，至少包括其中两种，以字母开头!
        const passwordReg = /^[a-zA-Z](?![a-zA-Z]+$)\w{5,19}$/;
        const pwddetection = passwordReg.test(pwdv);
        if (b != false) {
            if (stuidv.length == 10) {//这里未来要通过接口传去学号获得姓名并进行一系列验证
                if (pwddetection != false) {
                    if (pwdv == cfmpwdv) {

                        function async1() {
                            
                            //尝试插入接口
                            //第一个接口
                            axios({
                                url: 'http://vne6sz.natappfree.cc/findPasswordServlet',
                                dataType: "JSON",
                                method: 'POST',
                                data:{
                                    "method": "post",
                                    "stuID": `${stuidv}`,
                                    "name": `${namev}`,
                                    "password": `${pwdv}`,
                                    "Email": `${emlv}`,
                                    "userCaptcha": `${emailverification}`,
                                }
                            })
                                .then((res) => {
                                    console.log("传递数据成功！！！！！");
                                })
      
                                .catch((res) => {
                                    console.log("传递数据失败！！！！！");
                                });
                            
                            async2();
                        }   


                        function async2() {
                            //第二个接口判断学号姓名是否对应
                            axios({
                                url: 'http://vne6sz.natappfree.cc/findPasswordSendStatusServlet',
                                dataType: "json",
                                method: 'GET',
                            })
                                .then(function(res) {
                                    console.log("接收数据成功！！！！！");
                                    
                                    console.log(res['data']);
                                    
                                    var jieguo = res['data'];

                                    if ( jieguo.status== " 1") {
                                        console.log("姓名学号匹配成功");
                                        var information = "找回成功！";
                                        document.getElementById("bookManagementRetrievePasswordinformation").innerText = information;
                                    }
                                    else {
                                        var information = "您输入的学号有误！";
                                        document.getElementById("bookManagementRetrievePasswordinformation").innerText = information;
                                    }
                                })
      
                                .catch((res) => {
                                    console.log("接收数据失败！！！！！");
                                });
                            
                            return 0;
                        }
                        async1();
                    }

                    else {
                        var information = "两次输入密码不同！请重新输入";
                        document.getElementById("bookManagementRetrievePasswordinformation").innerText = information;
                    }
                }
                else {
                    var information = "您输入的密码格式不符！";
                    document.getElementById("bookManagementRetrievePasswordinformation").innerText = information;
                }
            }
            else {
                var information = "您输入的学号长度有误！";
                document.getElementById("bookManagementRetrievePasswordinformation").innerText = information;
            }
        }
        else {
            var information = "您输入的QQ邮箱有误！";
            document.getElementById("bookManagementRetrievePasswordinformation").innerText = information;
        }

    }
    retrieve(stuidv, namev, pwdv, cfmpwdv, emlv,emailverification);
}