var btn2 = document.getElementById("navTwo");
var btn3 = document.getElementById("navThree");
var btn4 = document.getElementById("navFour");
var btn5 = document.getElementById("navFive");
var search = document.getElementById("searchSkip");
var about = document.getElementById("about");
var btn1 = document.getElementById("navOne");
btn2.addEventListener('click',()=>{
  //alert(2);
  window.location.href="读者管理.html";
})
btn3.addEventListener("click", () => {
  //alert(3);
  window.location.href="图书管理.html";
});
btn4.addEventListener("click", () => {
  //alert(4);
  window.location.href="借阅管理.html";
});
btn5.addEventListener("click", () => {
  //alert(5);
  window.location.href="公告管理.html";
});
search.addEventListener('click',()=>{//----------------------------------链接
  alert(555);
})
about.addEventListener('click',()=>{//-------------------------------------链接
  window.location.href="关于.html";
})













   



















