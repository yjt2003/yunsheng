var top = document.querySelector(".bookManagementRegisterTop");
var checkclass = document.getElementById("promptcheckclass");
const container = document.querySelector(".bookManagementIndexContainer");
var demobgone = document.querySelector(".demo-bgone");
var demobgtwo = document.querySelector(".demo-bgtwo");
function dele(name){
  alert(66)
    axios({
        url:"http://dueg4e.natappfree.cc/Book_Management_System_war_exploded/bookManage/servlet/deleteBookServlet/",
        method:"POST",
        params:{
          'name':`${name}`,
        },
        headers: {
          'Content-Type': 'application/json'
        }
      }).then((res) =>{
        alert(res.data);
        window.location.href="图书管理.html";
      })
}
function edit() {
    const editclass = document.getElementById("promptEditclass");
    const inputName = document.getElementById("inputName");
    const inputIntroduction = document.getElementById("inputIntroduction");
    const aut = document.getElementById("author");
    const num = document.getElementById("number");
    const restNumber = document.getElementById("restNumber");
    //console.log("1");
    editclass.style.display = "block";
    demobgone.style.display = "block";
}
function closeone() {
   const bookName = document.getElementsByClassName("promptEditContentname")[0];
   const author = document.getElementsByClassName("promptEditContentgender")[0];
   const brief = document.getElementsByClassName("promptEditContentclass")[0];
   const num = document.getElementsByClassName("promptEditContentschoolid")[0];
   const restnumber = document.getElementsByClassName("promptEditContentidid")[0];
    alert(num.value);//可以拿到用户的数码了
    axios({
        url:"http://yxsenn.natappfree.cc/Book_Management_System_war_exploded/bookManage/servlet/updateBookServlet/",
        method:"POST",
        data:{
          "name":`${bookName.value}`,
          "author":`${author.value}`,
          "introduction":`${brief.value}`,
          "number":`${num.value}`,
          "restNumber":`${restnumber.value}`,
        },
        headers: {
          'Content-Type': 'application/json'
        }
      }).then((res) =>{
        console.log(res);
      })
    editclass.style.display = "none";
    demobgone.style.display = "none";
    console.log("2");
}
function check(){
    demobgtwo.style.display = "block";
    checkclass.style.display = "block";
    console.log("3");
}
function closetwo() {
    demobgtwo.style.display = "none";
    checkclass.style.display = "none";
}