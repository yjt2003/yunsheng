//const rgsbtn = document.getElementsById("bookManagementRegisterButton");

//接口访问
//axios.defaults.baseURL = 'http://pb46rc.natappfree.cc/';

const sid = document.getElementById("schoolid");
const pwd = document.getElementById("password");
const eml = document.getElementById("email");
const sebtn = document.getElementById("bookManagementRegistersendbtn");
const rebtn = document.getElementById("bookManagementRegisterButton");



function myFunctionRegister() {//此处是注册的总函数
    var stuidv = document.getElementById("schoolid").value;
    var pwdv = document.getElementById("password").value;
    var cfmpwdv = document.getElementById("confirmpassword").value;
    var emlv = document.getElementById("email").value;
    var emailverification = document.getElementById("emailverification").value;
    const usn = document.getElementById("username").value;
    function check(stuidv,pwdv,cfmpwdv,emlv,emailverification,usn) {
        let a = /^[1-9][0-9]{4,10}@qq.com$/;
        let b = a.test(emlv);
        // 密码为6-20位数字、字母或下划线，至少包括其中两种，以字母开头!
        const passwordReg = /^[a-zA-Z](?![a-zA-Z]+$)\w{5,19}$/;
        const pwddetection = passwordReg.test(pwdv);
        if(b != false) {
            if (stuidv.length == 10) {//这里未来要通过接口传去学号获得姓名并进行一系列验证
                if (pwddetection != false) {
                    if (pwdv == cfmpwdv) {
                        var information = "注册成功！";
                        document.getElementById("bookManagementRetrievePasswordinformation").innerText= information; 


                        //尝试插入接口
                        axios({
                            url: 'http://pb46rc.natappfree.cc/register',
                            dataType:"JSON",
                            method: 'POST',
                            data: {
                                "method": "post",
                                "stuID": `${stuidv}`,
                                "name": `${usn}`,
                                "password": `${pwdv}`,
                                "Email": `${emlv}`,
                                "userCaptcha": `${emailverification}`,
                            }
                        })
                            .then((res) => {
                                console.log("注册成功！！！！！", res);
                            })
                            .catch((res) => {
                                console.log("注册失败！！！！！");
                            });
 
                    }
                    else {
                        var information = "两次输入密码不同！请重新输入";
                        document.getElementById("bookManagementRetrievePasswordinformation").innerText= information;  
                    }
                }
                else {
                        var information = "您输入的密码格式不符！";
                        document.getElementById("bookManagementRetrievePasswordinformation").innerText= information;
                    }
            }
            else {
                var information = "您输入的学号长度有误！";
                    document.getElementById("bookManagementRetrievePasswordinformation").innerText= information;
            }
        }
        else {
            var information = "您输入的QQ邮箱有误！";
            document.getElementById("bookManagementRetrievePasswordinformation").innerText = information;
        }
    }
    check(stuidv, pwdv, cfmpwdv, emlv,emailverification,usn);
}
    