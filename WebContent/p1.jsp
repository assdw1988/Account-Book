<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="css/mmss.css"/>
    <link rel="stylesheet" href="css/font-awesome.min.css"/>
    <style>
    </style>
</head>
<body>
<div class="container-fluid">
        <div class="row">
            <div>
                <br/>
                <ol class="breadcrumb">
                    <li><a href="index.html"><span class="glyphicon glyphicon-home"></span>&nbsp;ホームページ</a></li>
                    <li class="active">系统管理 - 表格</li>
                </ol>
            
            
                <div class="input-group line left">
                    <span class="input-group-addon" id="basic-addon2"><span class="glyphicon glyphicon-search"></span></span>
                    <input type="text" class="form-control" placeholder="输入关键字搜索" aria-describedby="basic-addon2">
                </div>
                <select class="form-control line left">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
                <a href="#" class=" btn btn-primary "><span class="glyphicon glyphicon-search"></span></a>
                <a href="#" class=" btn btn-primary "><span class="glyphicon glyphicon-download"></span></a>
                <br/><br/>
                <table id="mytable" class="table table-bordered table-striped text-center bg-info">
                    <thead >
                    <tr class="info">
                        <th class="text-center">日付</th>
                        <th class="text-center">種類</th>
                        <th class="text-center">金額</th>
                        <th class="text-center">領収書コード</th>
                        <th class="text-center">備考</th>
                        <th class="text-center">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <!-- Modal begin-->
                        <!--添加-->
                        <div class="modal fade" id="add1" tabindex="-1" role="dialog" aria-labelledby="add11">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                        <h4 class="modal-title" id="add11">添加</h4>
                                    </div>
                                    <div class="modal-body">
                                        <ul>
                                            <li>
                                                <label><span>序号 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>用户名 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>姓名 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>性别 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>身份证 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>职位 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>邮箱 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>备注 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default btn-sm" data-dismiss="modal">取消</button>
                                        <button type="button" class="btn btn-primary btn-sm">保存</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="edit" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                        <h4 class="modal-title" id="myModalLabel1">编辑</h4>
                                    </div>
                                    <div class="modal-body">
                                        <ul>
                                            <li>
                                                <label><span>序号 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>用户名 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>姓名 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>性别 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>身份证 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>职位 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>邮箱 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>备注 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default btn-sm" data-dismiss="modal">取消</button>
                                        <button type="button" class="btn btn-primary btn-sm">保存</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--Modal end-->
                    </tr>
                    
                    
                    </tbody>
                </table>
                <ul class="pagination right">
                    <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>
                    </li>
                    <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
                </ul>
            </div>
            <!--右侧内容结束-->
        </div>
</div>


<script src="js/jquery-1.11.3.js"></script>
<script src="js/bootstrap.js"></script>
<script>
    $(function(){
      $("tbody").prepend("<tr><td>2017/09/25</td><td>外食</td><td>1160円</td><td>123456789</td><td>なし</td><td><a href=\"#\" class=\"btn btn-primary btn-sm\" data-toggle=\"modal\" data-target=\"#add1\">追加</a>&nbsp&nbsp<a href=\"#\" class=\"btn btn-primary btn-sm\" data-toggle=\"modal\" data-target=\"#edit\">更新</a>&nbsp&nbsp<a href=\"#\" class=\"btn btn-primary btn-sm\" >削除</a></td></tr><tr><td>2017/09/25</td><td>外食</td><td>1260円</td><td>123456789</td><td>なし</td><td><a href=\"#\" class=\"btn btn-primary btn-sm\" data-toggle=\"modal\" data-target=\"#add1\">追加</a>&nbsp&nbsp<a href=\"#\" class=\"btn btn-primary btn-sm\" data-toggle=\"modal\" data-target=\"#edit\">更新</a>&nbsp&nbsp<a href=\"#\" class=\"btn btn-primary btn-sm\" >削除</a></td></tr>");
    })

    $('#add').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) // Button that triggered the modal
        var recipient = button.data('whatever') // Extract info from data-* attributes
        // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
        // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
        var modal = $(this)
        modal.find('.modal-title').text('' + recipient)
        modal.find('.modal-body input').val(recipient)
    })
</script>
</body>
</html>