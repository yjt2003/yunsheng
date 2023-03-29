const table = document.getElementById("table1");//拿表格
const tbody = document.getElementsByTagName("tbody");//拿元素
// Window.addaddEventListener("load")
function getdataone() {
    axios({
        url: 'http://vne6sz.natappfree.cc/borrow',
        dataType: 'json',
        method: 'GET',
    })
        .then(response => {
            console.log("接收数据成功！！！！！");
            //var dataStr = res['responseJSON'];
            var dataStr = JSON.stringify(res);
            var dataStrone = dataStr.response;
            var dataStrtwo = dataStrone.data;
            var dataStrthree = dataStrtwo(0);
            console.log(dataStrthree);
            totalPage = data.totalPage;
            writeFromone(dataStrthree);
            changePageText();
        })
        .catch(err => {
            console.log("加载数据失败");
            console.log(response);

            var dataStr = JSON.stringify(response);
            var datastr = JSON.parse(dataStr);
            console.log(datastr);
            var dataStrone = datastr.response;
            var dataStrtwo = dataStrone.data;
            var dataStrthree = Object.values(dataStrtwo);
            var dataStrfour = JSON.stringify(dataStrthree);
            console.log(dataStrone);
            console.log(dataStrfour);
            //console.log(error.response.message);
        })

    }

/*
function getdatatwo() {
    $.ajax({
        url: "http://vne6sz.natappfree.cc/borrow",
        dataType: 'json',
        type: 'get',
        success: function (data) {
            var dataStr = JSON.stringify(data);
            data = $.parseJSON(dataStr);
            totalPage = data.totalPage;
            writeFromone(data);
            changePageText();
        },
        error: function (arg1) {
            alert("加载数据失败");
            console.log(arg1);
        }

    })
}
/*

function writeFromone(data) {
    var mytableone = document.getElementById('table1');
    var tbody = document.getElementById('tdbody'); 
    var columm=mytableone.rows[0].cells.length;//获取表头列数
        
    var rowStr = "";  //行的字符串的代码
    var k=1;
    for(var j=0;j<data.length;j++){
        var tdStr = "";
        for(var i=0;i<columm-1;i++)
        {  
            if(i==0){
                tdStr+="<td>"+k+"</td>";
            }
                tdStr += "<td>"+data.data[j][i]+"</td>";
        }
            k++;
            rowStr = rowStr + tdStr + "</tr>"; 
        }
        tbody.innerHTML=rowStr; 
}
/*
function writeFromtwo(data) {
    var mytabletwo = document.getElementById('table2');
    var tbody = document.getElementById('tdbody');
    var columm = mytabletwo.rows[0].cells.length; //获取表头列数

    var rowStr = ""; //行的字符串的代码
    var k = 1;
    for (var j = 0; j < data.data.length; j++) {
        var tdStr = "";
        for (var i = 0; i < columm - 1; i++) {
            if (i == 0) {
                tdStr += "<td>" + k + "</td>";
            }
            tdStr += "<td>" + data.data[j][i] + "</td>";
        }
        k++;
        rowStr = rowStr + tdStr + "</tr>";
    }
    tbody.innerHTML = rowStr;
}


function getdatathree() {
    $.ajax({
        url: "http://vne6sz.natappfree.cc/borrow",
        dataType: 'json',
        type: 'get',
        success: function (data) {
            var dataStr = JSON.stringify(data);
            data = $.parseJSON(dataStr);
            totalPage = data.totalPage;
            writeFromone(data);
            changePageText();
        },
        error: function (arg1) {
            alert("加载数据失败");
            console.log(arg1);
        }

    })
}

/*
function writeFromthree(data) {
    var mytablethree = document.getElementById('table3');
    var tbody = document.getElementById('tdbody');
    var columm = mytablethree.rows[0].cells.length; //获取表头列数

    var rowStr = ""; //行的字符串的代码
    var k = 1;
    for (var j = 0; j < data.data.length; j++) {
        var tdStr = "";
        for (var i = 0; i < columm - 1; i++) {
            if (i == 0) {
                tdStr += "<td>" + k + "</td>";
            }
            tdStr += "<td>" + data.data[j][i] + "</td>";
        }
        k++;
        rowStr = rowStr + tdStr + "</tr>";
    }
    tbody.innerHTML = rowStr;
}
*/
/*
$(document).ready(function getdata() {
    $.ajax({
        url: "地址", //后台请求的数据
        dataType: 'json', //数据格式
        type: "post", //请求方式
        async: true, //是否异步请求
        success: function (data) { //如果请求成功，返回数据。
            var tt = data.data; //第一个data代表json,第二个data代表json里的数组或对象
            var str1 = ""; //声明str1，防止产生undefined

            for (var i = 0; i < tt.length; i++) { //遍历
                str1 += "<tr cate-id='0' fid='0'>" +
                    "<td>" + tt[i] .1 + "</td>" + //i代表下标，获取数据中的下标为i的1的值
                    "<td>" + tt[i] .2 + "</td>" + //i代表下标，获取数据中的下标为i的2的值
                    "<td>" + tt[i] .3 + "</td>" + //i代表下标，获取数据中的下标为i的3的值
                    //.....
                    "<td>" + tt[i].n + "</td>"; //i代表下标，获取数据中的下标为i的n的值，1-n是属性名
            }
            test.innerHTML = str1; //将数据写入html中
        },
        error: function (arg1) {
            alert("加载数据失败");
            console.log(arg1);
        }
    })
})




*/




function menuSub() {
    var menu1 = document.getElementById('div1')
    var content = document.getElementById('libraryMenu')
    var menu2 = document.getElementById('div2')
    var menu3 = document.getElementById('div3')
    var menu4 = document.getElementById('div4')
    if (menu1.style.display == 'none') {
        menu1.style.display = 'block'
    }
    else
        menu1.style.display = 'none'
        content.style.display = 'none'
        menu2.style.display = 'none'
        menu3.style.display = 'none'
        menu4.style.display = 'none'
}
function menuContent() {
    var menu1 = document.getElementById('div1')
    var content = document.getElementById('libraryMenu')
    var menu2 = document.getElementById('div2')
    var menu3 = document.getElementById('div3')
    var menu4 = document.getElementById('div4')
    if (content.style.display == 'none') {
        content.style.display = 'block'
    }
    else
        content.style.display = 'none'
}
function menuSub1() {
    var menu1 = document.getElementById('div1')
    var content = document.getElementById('libraryMenu')
    var menu2 = document.getElementById('div2')
    var menu3 = document.getElementById('div3')
    var menu4 = document.getElementById('div4')
    if (menu2.style.display == 'none') {
        menu2.style.display = 'block'
        menu1.style.display = 'none'
        content.style.display = 'none'
    }
    else {
        menu2.style.display = 'none'
        menu3.style.display = 'none'
        menu4.style.display = 'none'
    }
    getdataone();
}
function menyInformation() {
    var menu1 = document.getElementById('div1')
    var content = document.getElementById('libraryMenu')
    var menu2 = document.getElementById('div2')
    var menu3 = document.getElementById('div3')
    var menu4 = document.getElementById('div4')
    if (menu3.style.display == 'none') {
        menu3.style.display = 'block'
        menu1.style.display = 'none'
        content.style.display = 'none'
    }
    else
        menu3.style.display = 'none'
        menu2.style.display = 'none'
        menu4.style.display = 'none'
}
function userInformation() {
    var menu1 = document.getElementById('div1')
    var content = document.getElementById('libraryMenu')
    var menu2 = document.getElementById('div2')
    var menu3 = document.getElementById('div3')
    var menu4 = document.getElementById('div4')
    if (menu4.style.display == 'none') {
        menu4.style.display = 'block'
        menu1.style.display = 'none'
        content.style.display = 'none'
    }
    else
        menu4.style.display = 'none'
        menu3.style.display = 'none'
        menu2.style.display = 'none'
}