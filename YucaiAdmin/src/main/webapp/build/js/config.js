var message;
	var app;
	var x = 555;
	var active;
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


	
	
	layui.use('element', function(){
		  var $ = layui.jquery
		  ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块
		  
		  //触发事件
		  active = {
		    tabAdd: function(){
		      //新增一个Tab项
		      element.tabAdd('kitTab', {
		        title: '新选项'+ (Math.random()*1000|0) //用于演示
		        ,content: '内容'+ (Math.random()*1000|0)
		        ,id: new Date().getTime() //实际使用一般是规定好的id，这里以时间戳模拟下
		      })
		    }
		    ,tabDelete: function(othis){
		      //删除指定Tab项
		      element.tabDelete('demo', '44'); //删除：“商品管理”
		      
		      
		      othis.addClass('layui-btn-disabled');
		    }
		    ,tabChange: function(){
		      //切换到指定Tab项
		      element.tabChange('kitTab', '22'); //切换到：用户管理
		    }
		  };
		  $('.site-demo-active').on('click', function(){
			    var othis = $(this), type = othis.data('type');
			    console.log(othis);
			    console.log(type);
			    active[type] ? active[type].call(this, othis) : '';
		  });
		  
	});