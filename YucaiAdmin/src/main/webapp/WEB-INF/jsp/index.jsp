<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>誉材网后台管理页面</title>
    <script src="${pageContext.request.contextPath}/build/js/url.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="http://cdn.bootcss.com/font-awesome/4.6.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/build/css/index.css" media="all">
</head>
<body>
    <div class="layui-layout layui-layout-admin kit-layout-admin">
        <div class="layui-header">
            <div class="layui-logo">誉 材 网 LOGO</div>
            <div class="layui-logo kit-logo-mobile">誉 材</div>
            <ul class="layui-nav layui-layout-right kit-nav">
                <!-- <li class="layui-nav-item">
                    <a href="javascript:;">
                        <img src="http://m.zhengjinfan.cn/images/0.jpg" class="layui-nav-img"> Van
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">基本资料</a></dd>
                        <dd><a href="javascript:;">安全设置</a></dd>
                    </dl>
                </li> -->
                <li class="layui-nav-item"><a href="javascript:;"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a></li>
            </ul>
        </div>

        <div class="layui-side layui-bg-black kit-side">
            <div class="layui-side-scroll">
                <div class="kit-side-fold"><i class="fa fa-navicon" aria-hidden="true"></i></div>
                <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
                <ul class="layui-nav layui-nav-tree" lay-filter="kitNavbar" kit-navbar>
                    <!-- <li class="layui-nav-item layui-nav-itemed">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 基本元素</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" kit-target data-options="{url:'test.html',icon:'&#xe6c6;',title:'表格',id:'1'}">
                                    <i class="layui-icon">&#xe6c6;</i><span> 表格</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="form.html" data-icon="fa-user" data-title="表单" kit-target data-id='2'><i class="fa fa-user" aria-hidden="true"></i><span> 表单</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="nav.html" data-icon="&#xe628;" data-title="导航栏" kit-target data-id='3'><i class="layui-icon">&#xe628;</i><span> 导航栏</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="list4.html" data-icon="&#xe614;" data-title="列表四" kit-target data-id='4'><i class="layui-icon">&#xe614;</i><span> 列表四</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&#xe658;</i><span> 百度一下</span></a>
                            </dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 组件</span></a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:;" kit-target data-options="{url:'navbar.html',icon:'&#xe658;',title:'Navbar',id:'6'}"><i class="layui-icon">&#xe658;</i><span> Navbar</span></a></dd>
                            <dd><a href="javascript:;" kit-target data-options="{url:'tab.html',icon:'&#xe658;',title:'TAB',id:'7'}"><i class="layui-icon">&#xe658;</i><span> Tab</span></a></dd>
                            <dd><a href="javascript:;" kit-target data-options="{url:'onelevel.html',icon:'&#xe658;',title:'OneLevel',id:'50'}"><i class="layui-icon">&#xe658;</i><span> OneLevel</span></a></dd>
                            <dd><a href="javascript:;" kit-target data-options="{url:'app.html',icon:'&#xe658;',title:'App',id:'8'}"><i class="layui-icon">&#xe658;</i><span> app.js主入口</span></a></dd>
                        </dl>
                    </li> -->
                    <li class="layui-nav-item">
                        <a class="" href="javascript:;"> <i class="layui-icon">&#xe63c;</i><span> 新闻管理</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" kit-target data-options="{url:'newsRelease.action',icon:'&#xe6b2;',title:'新闻发布',id:'1'}">
                                <i class="layui-icon">&#xe6b2;</i><span> 新闻发布</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" kit-target data-options="{url:'newsList.action',icon:'&#xe66b;',title:'新闻列表',id:'2'}">
                                <i class="layui-icon">&#xe66b;</i><span> 新闻列表</span></a>
                            </dd>
                        </dl>
                    </li>
                    
                    
                    <li class="layui-nav-item layui-nav-itemed">
                        <a class="" href="javascript:;"> <i class="layui-icon">&#xe63c;</i><span> 课程管理</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" kit-target data-options="{url:'courseRelease.action',icon:'&#xe6b2;',title:'发布课程',id:'3'}">
                                <i class="layui-icon">&#xe6b2;</i><span>发布课程</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" kit-target data-options="{url:'courseList.action',icon:'&#xe6b2;',title:'课程列表',id:'4'}">
                                <i class="layui-icon">&#xe6b2;</i><span>课程列表</span></a>
                            </dd>
                        </dl>
                    </li>
                    
                </ul>
            </div>
        </div>
        <div class="layui-body" id="container">
            <!-- 内容主体区域 -->
            <div style="padding: 15px;">主体内容加载中,请稍等...</div>
        </div>

        <div class="layui-footer">
            <!-- 底部固定区域 -->
            2018 &copy;
            <a href="#">誉材网</a>&nbsp;&nbsp;www.121ugrow.com
        </div>
        
    </div>
    
    <!-- 模态框（Modal） -->
	<div class="modal fade" id="previewNewsModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" 
							aria-hidden="true">×
					</button>
					<h4 class="modal-title" id="myModalLabel">
						新闻内容预览
					</h4>
				</div>
				<div class="modal-body previewBody">
					hello world
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" 
							data-dismiss="modal">关闭
					</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
</body>
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/plugins/layui/layui.js"></script>
	<link href="https://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script>
	//先到js里面
	function previewNews(content){
		//通过js方法进行调用jquery的方法
		$().previewNewsJQuery(content);
	}
	$(function(){
		//通过js指向到这里，然后就可以实现了
		$.fn.previewNewsJQuery = function(content) {
			$(".previewBody").html(content);
			$("#previewNewsModal").modal('show');
		}
	})
	layui.config({
	    base: 'build/js/'
	}).use(['app', 'message'], function() {
	        app = layui.app,
	        $ = layui.jquery,
	        layer = layui.layer;
	    //将message设置为全局以便子页面调用
	    message = layui.message;
	    //主入口
	    app.set({
	        type: 'iframe'
	    }).init();
	});

	</script>
    <style>
    	/* 设置动画 */
    	.layui-side,#container{
    		-webkit-transition: 0.7s ease;
    	}
        /* 设置选项卡最右边的样式，使其在最右面 */
        .kit-tab .kit-tab-tool{
          right: 0px;
        }
        .kit-tab .layui-tab-title {
            width: calc(100% - 61px);
            padding-right: 0;
            position: absolute;
        }
        dd{
          padding-left: 17%;
        }
        /* 去掉主页的纵向滚动条 */
        .kit-layout-admin .layui-body {
		    overflow: hidden;
		}
		/* 模态框 */
		.modal-dialog {
		    width: 92%;
		    margin: 30px auto;
		}
		a:link,a:hover,a:active,a:visited {
			text-decoration:none;
		} 
        @media only screen and (max-width:900px){
          dd{
            padding-left: 0px;
          }
        }
    </style>

</html>