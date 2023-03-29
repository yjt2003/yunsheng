var btn1 = document.getElementById("navOne");
var btn2 = document.getElementById("navTwo");
var btn3 = document.getElementById("navThree");
var btn4 = document.getElementById("navFour");
var btn5 = document.getElementById("navFive");



var top = document.querySelector(".bookManagementRegisterTop");
var checkclass = document.getElementById("promptcheckclass");
const container = document.querySelector(".bookManagementIndexContainer");
//const content_name = document.getElementsById("promptEditContentname");
var demobgone = document.querySelector(".demo-bgone");
var demobgtwo = document.querySelector(".demo-bgtwo");
btn1.addEventListener('click',()=>{
  window.location.href="";
})
btn2.addEventListener('click',()=>{
  window.location.href="";
})
btn3.addEventListener("click", () => {
  window.location.href="";
});
btn4.addEventListener("click", () => {
  window.location.href="";
});
btn5.addEventListener("click", () => {
  window.location.href="";
});
search.addEventListener('click',()=>{//----------------------------------链接
  alert(555);
})
about.addEventListener('click',()=>{//-------------------------------------链接
  alert(555);
})


function dele(time){
    //alert(time);
    axios({
    url:"http://dueg4e.natappfree.cc/Book_Management_System_war_exploded/announcement/servlet/deleteAnnouncementServlet/",
    method:"POST",
    params:{
      "time":time,
    }
  }).then((res) =>{
    alert(res.data);
    window.location.href="公告管理.html";
  })
}
function edit(nam,id) {
    const editclass = document.getElementById("promptEditclass");
    //const input_id=document.getElementById("input_id");
    const input_name = document.getElementById("input_name");
    console.log("1");
    editclass.style.display = "block";
    demobgone.style.display = "block";
    input_id.value=id;
    input_name.value=nam;
}
function closeone() {
    const editclass = document.getElementById("promptEditclass");
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
    const time = document.getElementsByClassName("timer")[0];
    const person = document.getElementsByClassName("person")[0];
    const area = document.getElementById("annouse");
    console.log(person.value);
    axios({
      url:"http://dueg4e.natappfree.cc/Book_Management_System_war_exploded/announcement/servlet/addAnnouncementServlet/",
      method:"POST",
      data:{
        "publisher":`${person.value}`,
        "time":`${time.value}`,
        "content":`${area.value}`,     
      }
    }).then((res) =>{
      console.log(res);
    })
    demobgtwo.style.display = "none";
    checkclass.style.display = "none";
    //alert(66);
}