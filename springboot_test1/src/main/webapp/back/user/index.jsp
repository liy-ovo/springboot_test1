<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>



<script>
	$(function(){
		
		$("#userDataGrid").datagrid({
			url:'/easyui_day3/back/user/users.json',//查询所有用户信息  json  rows total
			fit:true,
			pagination:true,
			fitColumns:true,
			toolbar:'#tb',
			columns:[[
			         {title:'ID',field:'id',width:100,},
			         {title:'姓名',field:'name',width:100,},
			         {title:'年龄',field:'age',width:150,},
			         {title:'生日',field:'bir',width:200,},
			         {title:'操作',field:'options',width:100,
			        	formatter:function(value,row,index){
			        		return "<a href='javascript:;' class='btn' onClick=\"delUserInfo('"+ row.id +"');\"  data-options=\"iconCls:'icon-remove'\" >删除</a>&nbsp;&nbsp;"
	            			  +"<a data-options=\"iconCls:'icon-edit'\" onClick=\"openUpdateDialog('"+ row.id +"');\" href='javascript:;' class='btn'>修改</a>";
			        	}	 
			         },
			]],
			onLoadSuccess:function(){
				$(".btn").linkbutton({plain:true});
			}
		});
		
		
	});
</script>


<table id="userDataGrid" class="easyui-datagrid"></table>


<div id="tb">
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">添加</a>
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除选中</a>
</div>
