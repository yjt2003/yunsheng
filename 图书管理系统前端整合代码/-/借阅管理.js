var btn1 = document.getElementById("navOne");
var btn2 = document.getElementById("navTwo");
var btn3 = document.getElementById("navThree");
var btn4 = document.getElementById("navFour");
var btn5 = document.getElementById("navFive");
function check(aa,bb,cc,dd,ee,ff,gg){
  console.log(aa);
  console.log(bb);
  console.log(cc);
  console.log(dd);
  axios({
    url:"http://dueg4e.natappfree.cc/Book_Management_System_war_exploded/record/servlet/addRecordServlet/",
    method:"POST",
    data:{
      "bookName":`${aa}`,
      "borrower":`${cc}`,
      "borrowTime":`${bb}`,
      "howLong":`${dd}`,
      "returned":`${ee}`,
      "destoryed":`${ff}`,
      "compensated":`${gg}`,
    },
    headers: {
      'Content-Type': 'application/json'
    }
  }).then((res) =>{
    alert(res.data);
    window.location.href="借阅管理.html";
  })
}
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