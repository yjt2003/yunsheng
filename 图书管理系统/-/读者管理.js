var top = document.querySelector(".bookManagementRegisterTop");
var checkclass = document.getElementById("promptcheckclass");
const container = document.querySelector(".bookManagementIndexContainer");
var demobgone = document.querySelector(".demo-bgone");
var demobgtwo = document.querySelector(".demo-bgtwo");
function check(aa,bb,cc,dd,ee,ff,gg) {
  const pass = document.getElementById("pass");
  const not_pass = document.getElementById("not_pass");
  //console.log(ob);
  pass.onclick = () => {
    axios({
      url: "http://dueg4e.natappfree.cc/Book_Management_System_war_exploded/userManage/servlet/useUserServlet/", //启用
      method: "POST",
      data: {
        "account": `${aa}`,
        "password": `${cc}`,
        "name": `${bb}`,
        "stuID": `${dd}`,
        "email": `${ee}`,
        "bookForReturn": `${ff}`,
        "status": `${gg}`,
      },
    }).then((res) => {
      alert(res.data);
    });
  };
  not_pass.onclick = () => {
    //alert(ob);//禁用
    axios({
      url: "http://dueg4e.natappfree.cc/Book_Management_System_war_exploded/userManage/servlet/banUserServlet/", //禁用
      method: "POST",
      data: {
        "bookName": `${aa}`,
        "borrower": `${cc}`,
        "borrowTime": `${bb}`,
        "howLong": `${dd}`,
        "returned": `${ee}`,
        "destoryed": `${ff}`,
        "compensated": `${gg}`,
      },
    }).then((res) => {
      alert(res.data);
    });
  };

  demobgtwo.style.display = "block";
  checkclass.style.display = "block";
  console.log("3");
}
function closetwo() {
  //alert(66);
  demobgtwo.style.display = "none";
  checkclass.style.display = "none";
}
