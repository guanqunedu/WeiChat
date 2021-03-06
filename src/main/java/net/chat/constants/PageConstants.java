package net.chat.constants;

import java.util.ArrayList;
import java.util.List;

import net.chat.formbean.SimpleBean;

public final class PageConstants {

	/**
	 * 登录页面
	 */
	public static final String PAGE_LOGIN = "redirect:/login";

	/**
	 * 用户注册页面
	 */
	public static final String PAGE_REGISTER = "register";

	/**
	 * 首页
	 */

	public static final String PAGE_INDEX = "index";

	/**
	 * 帐号列表
	 */
	public static final String PAGE_ACCOUNT_LIST = "account/accountList";

	/**
	 * 帐号详细信息
	 */
	public static final String PAGE_ACCOUNT_DETAIL = "account/accountDetail";

	/**
	 * 自动信息回复-列表
	 */
	public static final String PAGE_RELPY_MSG = "autoreply/list";

	/**
	 * 自动信息回复-详情
	 */
	public static final String PAGE_RELPY_MSG_DETAIL = "autoreply/detail";

	/**
	 * 信息内容管理-列表
	 */
	public static final String PAGE_MESSAGE_LIST = "msg/messageList";

	/**
	 * 信息内容管理-查看页面
	 */
	public static final String PAGE_MESSAGE_VIEW = "msg/view";

	/**
	 * 信息内容管理--文本
	 */
	public static final String PAGE_MESSAGE_TEXT = "msg/textDetail";

	/**
	 * 信息内容管理--多媒体，包括音乐，视频
	 */
	public static final String PAGE_MESSAGE_MULTIMEDIA = "msg/multimediaDetail";

	/**
	 * 应用管理-列表
	 */
	public static final String PAGE_GAME_LIST = "game/gameList";

	/**
	 * 多媒体应用
	 */

	public static final String PAGE_CONTENT_DETAIL = "content/contentDetail";

	/**
	 * 素材管理-列表
	 */

	public static final String PAGE_CONTENT_LIST = "content/list";

	/**
	 * 素材管理-详细信息
	 */

	public static final String PAGE_CONTENT_DETAIL_1 = "content/detail";

	/**
	 * 应用管理-投票
	 */
	public static final String PAGE_GAME_VOTE = "game/vote";

	/**
	 * 应用管理-投票详情
	 */
	public static final String PAGE_GAME_VOTE_DETAIL = "game/voteDetail";

	/**
	 * 应用管理-聊天机器人
	 */
	public static final String PAGE_GAME_ROBOT = "game/robot";

	/**
	 * 应用管理-刮刮乐
	 */
	public static final String PAGE_GAME_LOTTERY = "game/lottery";

	/**
	 * 应用管理-刮刮乐
	 */
	public static final String PAGE_GAME_LOTTERY_DETAIL = "game/lotteryDetail";

	/**
	 * 注册用户管理
	 */
	public static final String PAGE_REGISTER_USER = "user/registerUser";

	/**
	 * 智能客服回复-列表
	 */
	public static final String PAGE_KEYWORD_LIST = "cmd/list";

	/**
	 * 智能客服-详细
	 */
	public static final String PAGE_KEYWORD_DETAIL = "cmd/detail";

	/**
	 * 智能客服回复-列表
	 */
	public static final String PAGE_CUSTOMMENU_LIST = "custommenu/list";

	/**
	 * 智能客服-详细
	 */
	public static final String PAGE_CUSTOMMENU_DETAIL = "custommenu/detail";

	/**
	 * lbs-设置
	 */
	public static final String PAGE_LBS = "lbs/detail";

	/**
	 * 商城首页
	 */
	public static final String PAGE_MALL_INDEX = "mall/index";

	/**
	 * 商品类别页面
	 */
	public static final String PAGE_MALL_CATEGORY = "mall/category";

	/**
	 * 商品列表页面
	 */
	public static final String PAGE_MALL_LIST = "mall/list";

	/**
	 * 商品详细页面
	 */
	public static final String PAGE_MALL_DETAIL = "mall/detail";

	/**
	 * 购物车
	 */
	public static final String PAGE_MALL_CART = "mall/cart";

	/**
	 * 登录
	 */
	public static final String PAGE_MALL_LOGIN = "mall/login";

	/**
	 * 注册
	 */
	public static final String PAGE_MALL_REGIST = "mall/regist";

	public static String PAGE_MALL_PREORDER = "mall/preorder";

	public static String PAGE_MALL_MYORDER = "mall/orderlist";

	public static String PAGE_MALL_ORDER = "mall/vieworder";

	public static String PAGE_MALL_TENPAY = "mall/tenpay";
	
	public static String PAGE_MALL_PAY_RETURN = "mall/payreturn";
	
	public static String PAGE_MALL_PAY_NOTICE = "mall/paynotice";
	/**
	 * 门店设置-初始页面
	 */
	public static String PAGE_MALL_SET = "mallset/init";

	/**
	 * 门店设置-商品类别
	 */
	public static String PAGE_MALL_CATE = "mallset/category";

	/**
	 * 门店设置-商品类别详情
	 */
	public static String PAGE_MALL_CATEDETAIL = "mallset/categoryDetail";

	/**
	 * 门店设置-商品子类别
	 */
	public static String PAGE_MALL_SUB_CATE = "mallset/subcategory";

	/**
	 * 门店设置-商品类别详情
	 */
	public static String PAGE_MALL_SUB_CATEDETAIL = "mallset/subcategoryDetail";

	/**
	 * 门店设置-商品子类别
	 */
	public static String PAGE_MALL_PRODUCT = "mallset/product";

	/**
	 * 门店设置-商品详情
	 */
	public static String PAGE_MALL_PRODUCT_DETAIL = "mallset/productDetail";

	/**
	 * 门店设置-商品额外信息，包括价格和图片
	 */
	public static String PAGE_MALL_PRODUCT_EXTENTION = "mallset/productExtention";

	/**
	 * 
	 * 智能客服-匹配类型
	 */
	public static List<SimpleBean> buildCtypeList() {
		List<SimpleBean> ctypeList = new ArrayList<SimpleBean>(5);
		ctypeList.add(new SimpleBean("whole", "完全匹配"));
		ctypeList.add(new SimpleBean("startwith", "以这个词开头"));
		return ctypeList;
	}

	/**
	 * 自动回复类型
	 */
	public static List<SimpleBean> buildActionTypesList() {
		List<SimpleBean> lst = new ArrayList<SimpleBean>(5);
		lst.add(new SimpleBean("program", "自定义处理"));
		lst.add(new SimpleBean("direct", "直接回复"));
		return lst;
	}

	/**
	 * 用户发送类型类型
	 */
	public static List<SimpleBean> buildSendTypesList() {
		List<SimpleBean> lst = new ArrayList<SimpleBean>(6);
		lst.add(new SimpleBean("text", "文本"));
		lst.add(new SimpleBean("image", "图片"));
		lst.add(new SimpleBean("voice", "语音"));
		lst.add(new SimpleBean("subscribe", "订购"));
		lst.add(new SimpleBean("video", "视频"));
		lst.add(new SimpleBean("unsubscribe", "退订"));
		return lst;
	}

	/**
	 * 用户发送类型类型
	 */
	public static List<SimpleBean> buildContentTypesList() {
		List<SimpleBean> lst = new ArrayList<SimpleBean>(3);
		lst.add(new SimpleBean("image", "图片"));
		lst.add(new SimpleBean("voice", "音频"));
		lst.add(new SimpleBean("video", "视频"));
		return lst;
	}

	/**
	 * 用户发送类型类型
	 */
	public static List<SimpleBean> buildContentTypesListByType(String msgType) {
		List<SimpleBean> lst = new ArrayList<SimpleBean>(1);
		if ("image".equals(msgType))
			lst.add(new SimpleBean("image", "图片"));
		else if ("voice".equals(msgType))
			lst.add(new SimpleBean("voice", "音频"));
		else if ("video".equals(msgType))
			lst.add(new SimpleBean("video", "视频"));
		else
			lst.add(new SimpleBean("text", "文本"));
		return lst;
	}

	/**
	 * 自定义菜单事件类型
	 */
	public static List<SimpleBean> buildEventTypesList() {
		List<SimpleBean> lst = new ArrayList<SimpleBean>(1);
		lst.add(new SimpleBean("url", "超链接"));
		lst.add(new SimpleBean("message", "回复消息"));
		return lst;
	}

	/**
	 * 用户发送类型类型
	 */
	public static List<SimpleBean> buildMessageTypesList() {
		List<SimpleBean> lst = PageConstants.buildContentTypesList();
		lst.add(0, new SimpleBean("text", "文本"));
		return lst;
	}

	/**
	 * 用户发送类型类型
	 */
	public static List<SimpleBean> buildPayTypesList() {
		List<SimpleBean> lst = new ArrayList<SimpleBean>(4);
		lst.add(0, new SimpleBean("1", "财付通"));
		// lst.add(1, new SimpleBean("2", "网银"));
		// lst.add(2, new SimpleBean("3", "支付宝"));
		// lst.add(3, new SimpleBean("4", "转账"));
		return lst;
	}

	/**
	 * 订单状态 (0:待支付,1:支付完成,2:发货,3:已签收,99:已取消)
	 */
	public static List<SimpleBean> buildOrderStatusList() {
		List<SimpleBean> lst = new ArrayList<SimpleBean>(4);
		lst.add(0, new SimpleBean("0", "待支付"));
		lst.add(1, new SimpleBean("1", "支付完成"));
		lst.add(2, new SimpleBean("2", "发货"));
		lst.add(3, new SimpleBean("3", "已签收"));
		lst.add(3, new SimpleBean("99", "已取消"));
		return lst;
	}

	/**
	 * 
	 */
	public static List<SimpleBean> buildCategoryStyleList() {
		List<SimpleBean> lst = new ArrayList<SimpleBean>(4);
		lst.add(0, new SimpleBean("1", "图片:文字=5:5"));
		lst.add(1, new SimpleBean("2", "图片:文字=6:4"));
		lst.add(2, new SimpleBean("3", "图片在上文字在下"));
		return lst;
	}
}
