<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common.jsp"%>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8" />
	<title>微信公共平台</title>

	<script type="text/javascript">
		$(document).ready(function() {
			$("#submitbtn").click(function() {
				if(!validate()){return false;}
				$('#messageForm').attr('action', '${ctx}/message/submit');
				$('#messageForm').submit();
			});
		});
		function changeMessageType() {
			var msgType = $("#msgType").val();
			if (msgType != '' && msgType != 'text')
				window.location.href = "${ctx}/message/addMultimedia/" + msgType;
			else
				window.location.href = "${ctx}/message/addtext";
		}
		function validate(){
			var flag=true;
			if(""==$("#accountId").val()){
				$("#eaccount").show();
				flag=false;
			}else {$("#eaccount").hide();}
			if(""==$("#msgType").val()){
				$("#emsgtype").show();
				flag=false;
			}else {$("#emsgtype").hide();}
			if(""==$("#msgName").val()){
				$("#emsgname").show();
				flag=false;
			}else {$("#emsgname").hide();}
			if(""==$("#content").val()){
				$("#econtent").show();
				flag=false;
			}else {$("#econtent").hide();}
			return flag;
		}
	</script>
</head>
<body>
	<form:form id="messageForm" method="post" modelAttribute="wxMessage">
		<form:hidden path="id"/>
		<div class="b_con">
	<div class="by_box">
		<%@include file="../menu.jsp"%>
		<table width="967" border="0" align="center" cellpadding="0" cellspacing="0">
			
			<tr>
				<td height="10">&nbsp;</td>
			</tr>
			<!-- 正文开始 -->
			<tr>
				<td>
					<table width="942" border="0" align="center" cellpadding="0" cellspacing="0">
						<tr>
							<td height="53" background="${images}/shan.png">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="2%">&nbsp;</td>
										<td width="4%"><img src="${images}/oic_3.png" width="30" height="21" /></td>
										<td width="94%" class="biao">我的信息</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td height="350" valign="top" background="${images}/he.png">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="120" valign="top">
											<table width="100%"	border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td height="40" >
														<div align="center">
															<a href="${ctx }/message/init" class="biao1">我的信息</a>
														</div>
													</td>
												</tr>
												<tr>
													<td height="40" bgcolor="#e87352">
														<div align="center" class="biao">
															添加信息
														</div>
													</td>
												</tr>
											</table>
										</td>
										<td width="1" bgcolor="#999999"><img src="${images}/su.png" width="1" height="257" /></td>
										<td width="770" valign="top">
											<table width="96%" border="0" align="center" cellpadding="0" cellspacing="0">
											
													<tr>
														<td height="40">
															<table width="100%" border="0" cellspacing="0" cellpadding="0">
																<tr>
																	<td width="20%" height="40" class="biao">公众帐号名</td>
																	<td>
																		<form:select path="accountId" id="accountId" style="width: 150px;">
																			<c:forEach items="${accounts}" var="account">
																				<form:option value="${account.id }">${account.name}</form:option>
																			</c:forEach>
																		</form:select> &nbsp;<span id="eaccount" style="display:none" class="error">请选择公共帐号!</span>
																	</td>
																</tr>
																<tr>
																	<td width="20%" height="40" class="biao">自动回复信息类型</td>
																	<td>
																		<form:select path="msgType" id="msgType" onchange="javascript:changeMessageType()"	style="width: 150px;">
																			<c:forEach items="${messageTypes}" var="messageType">
																				<form:option value="${messageType.key}">${messageType.value}</form:option>
																			</c:forEach>
																		</form:select> &nbsp;<span id="emsgtype" style="display:none"  class="error">请选择自动回复信息类型!</span>
																	</td>
																</tr>
																<tr>
																	<td width="20%" height="40" class="biao">标题 <font color="red">*</font></td>
																	<td>
																		<form:input path="msgName" style="width: 300px;" />&nbsp;
																		<span id="emsgname" style="display:none"  class="error">请输入标题!</span>
																	</td>
																</tr>
															</table>
														</td>
													</tr>
													<tr>
														<td>
															<table width="729" border="0" cellpadding="0" cellspacing="0" background="${images}/dd.png">
																<tr>
																	<td height="320" valign="top">
																		<table width="100%" border="0" cellspacing="0" cellpadding="0">
																			<tr>
																				<td height="40">
																					<table width="100%" border="0" cellspacing="0" cellpadding="0">
																						<tr>
																							<td width="3%">&nbsp;</td>
																							<td width="10%" class="biao">备注 <font color="red">*</font></td>
																							<td width="87%"></td>
																						</tr>
																					</table>
																				</td>
																			</tr>
																			<tr>
																				<td height="260">
																					<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#999999" bgcolor="#FFFFFF">
																						<tr>
																							<td height="200" valign="top">
																								<form:textarea	path="content" cols="90" rows="14" />
																								<span id="econtent" style="display:none"  class="error">请输入备注</span>
																								</td>
																						</tr>
																					</table>
																				</td>
																			</tr>
																		</table>
																	</td>
																</tr>
															</table>
														</td>
													</tr>
													<tr>
														<td height="50">
															<form:button id="submitbtn" class="btn-primary" >提交</form:button>
														</td>
														<td height="50"></td>
													</tr>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td><img src="${images}/xia_zu.png" width="942" height="14" /></td>
						</tr>
					
					</table>
				</td>
			</tr>
		</table><%@include file="../bottom.jsp"%>
	</div>
</div>
	</form:form>
</body>
</html>