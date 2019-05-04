package cn.edu.sdu.JT808Server.util;

import java.nio.charset.Charset;

public final class JT808Const {

    public static final int retransmission = 4;

    public static final int responseTimeout = 5;

    private static final String string_encoding = "GBK";

    public static final Charset string_charset = Charset.forName(string_encoding);

    // 客户端发呆30秒后,服务器主动断开连接
    public static final int tcp_client_idle_seconds = 300;

    // 标识位
    public static final int pkg_delimiter = 0x7e;


    /**
     * 消息
     */
    // 1, 终端通用应答
    public static final int msg_id_terminal_common_resp = 0x0001;
    // 2, 平台通用应答
    public static final int cmd_common_resp = 0x8001;
    // 3, 终端心跳
    public static final int msg_id_terminal_heart_beat = 0x0002;
    // 4, 补传分包请求
    public static final int cmd_reload_message_request = 0x8003;
    // 5, 终端注册
    public static final int msg_id_terminal_register = 0x0100;
    // 6, 终端注册应答
    public static final int cmd_terminal_register_resp = 0x8100;
    // 7, 终端注销
    public static final int msg_id_terminal_log_out = 0x0101;
    // 8, 终端鉴权
    public static final int msg_id_terminal_authentication = 0x0102;
    // 9, 设置终端参数
    public static final int cmd_terminal_param_settings = 0X8103;
    // 10, 查询终端参数
    public static final int cmd_terminal_param_query = 0x8104;
    // 11,查询终端参数应答
    public static final int msg_id_terminal_param_query_resp = 0x0104;
    // 12, 终端控制
    public static final int cmd_terminal_control = 0x8105;
    // 13, 查询指定终端参数
    public static final int cmd_terminal_appoint_param_query = 0x8106;
    // 14, 查询终端属性
    public static final int cmd_terminal_attribute_query = 0x8107;
    // 15, 查询终端属性应答
    public static final int msg_id_terminal_attribute_query_resp = 0x0107;
    // 16, 下发终端升级包
    public static final int cmd_dowload_terminal_upgrade = 0x8108;
    // 17, 终端升级结果通知
    public static final int msg_id_terminal_upgrade_result = 0x0108;
    // 18, 位置信息汇报
    public static final int msg_id_terminal_location = 0x0200;
    // 19, 位置信息查询
    public static final int cmd_terminal_location_query = 0x8201;
    // 20, 位置信息查询应答
    public static final int msg_id_terminal_location_query_resp = 0x0201;
    // 21, 临时位置跟踪控制
    public static final int cmd_temp_location_control = 0x8202;
    // 22, 人工确认报警消息
    public static final int cmd_human_verify_warning_msg = 0x8203;
    // 23, 文本信息下发
    public static final int cmd_text_download = 0x8300;
    // 24, 事件设置
    public static final int cmd_event_setting = 0x8301;
    // 25, 事件报告
    public static final int msg_id_event_report = 0x0301;
    // 26, 提问下发
    public static final int cmd_ask_download = 0x8302;
    // 27, 提问应答
    public static final int msg_id_ask_answer = 0x0302;
    // 28, 信息点播菜单设置
    public static final int cmd_message_request_setting = 0x8303;
    // 29, 信息点播/取消
    public static final int msg_id_message_request_cancel = 0x0303;
    // 30, 信息服务
    public static final int cmd_message_service = 0x8304;
    // 31, 电话回拨
    public static final int cmd_phone_recall = 0x8400;
    // 32, 设置电话本
    public static final int cmd_set_telephone_book = 0x8401;
    // 33, 车辆控制
    public static final int cmd_car_control = 0x8500;
    // 34, 车辆控制应答
    public static final int msg_id_car_control_resp = 0x0500;
    // 35, 设置圆形区域
    public static final int cmd_set_circle_area = 0x8600;
    // 36, 删除圆形区域
    public static final int cmd_delete_circle_area = 0x8601;
    // 37, 设置矩形区域
    public static final int cmd_set_rectangle_area = 0x8602;
    // 38, 删除矩形区域
    public static final int cmd_delete_rectangle_area = 0x8603;
    // 39, 设置多边形区域
    public static final int cmd_set_polygon_area = 0x8604;
    // 40, 删除多边形区域
    public static final int cmd_delete_polygon_area = 0x8605;
    // 41, 设置路线
    public static final int cmd_set_route = 0x8606;
    // 42, 删除路线
    public static final int cmd_delete_route = 0x8607;
    // 43, 行驶记录仪数据采集命令
    public static final int cmd_recorder_data_request = 0x8700;
    // 44, 行驶记录仪数据上传
    public static final int msg_id_recorder_data_upload = 0x0700;
    // 45, 行驶记录仪参数下传命令
    public static final int cmd_recorder_param_down = 0x8701;
    // 46, 电子运单上报
    public static final int msg_id_digital_data_upload = 0x0701;
    // 47, 驾驶员身份信息采集上报
    public static final int msg_id_Identity_information_upload = 0x0702;
    // 48, 上报驾驶员身份信息请求
    public static final int cmd_Identity_information_request = 0x8702;
    // 49, 定位数据批量上传
    public static final int msg_id_bulk_location_upload = 0x0704;
    // 50, CAN 总线数据上传
    public static final int msg_id_CAN_data_upload = 0x0705;
    // 51, 多媒体事件信息上传
    public static final int msg_id_media_event_upload = 0x0800;
    // 52, 多媒体数据上传
    public static final int msg_id_media_upload = 0x0801;
    // 53, 多媒体数据上传应答
    public static final int cmd_media_upload_resp = 0x8800;
    // 54, 摄像头立即拍摄命令
    public static final int cmd_camera_photo = 0x8801;
    // 55, 摄像头立即拍摄命令应答
    public static final int msg_id_camera_photo_response = 0x0805;
    // 56, 存储多媒体数据检索
    public static final int cmd_saved_media_request = 0x8802;
    // 57, 存储多媒体数据检索应答
    public static final int msg_id_saved_media_response = 0x0802;
    // 58, 存储多媒体数据上传
    public static final int cmd_saved_media_upload = 0x8803;
    // 59, 录音开始命令
    public static final int cmd_record_start = 0x8804;
    // 60, 单条存储多媒体数据检索上传命令
    public static final int cmd_single_saved_media_request_upload = 0x8805;
    // 61, 数据下行透传
    public static final int cmd_data_download = 0x8900;
    // 62, 数据上行透传
    public static final int msg_id_data_upload = 0x0900;
    // 63, 数据压缩上报
    public static final int msg_id_data_zip_upload = 0x0901;
    // 63, 平台 RSA 公钥
    public static final int cmd_platform_RSA = 0x8A00;
    // 64, 终端 RSA 公钥
    public static final int msg_id_terminal_RSA = 0x0A00;


    /**
     * 音视频部分
     */

    // 1, 查询终端音视频属性
    public static final int cmd_Terminal_media_attribute_query = 0x9003;
    // 2, 终端上传音视频属性
    public static final int msg_id_Terminal_upload_media_attribute = 0x1003;
    // 3, 实时音视频传输请求
    public static final int cmd_real_time_media_transmission_request = 0x9101;
    // 4, 终端上传乘客流量
    public static final int msg_id_Terminal_upload_passenger_flow = 0x1005;
    // 5, 音视频实时传输控制
    public static final int cmd_real_time_media_transmission_control = 0x9102;

    // 7, 实时音视频传输状态通知
    public static final int cmd_real_time_media_transmission_state = 0x9105;
    // 8, 查询资源列表
    public static final int cmd_media_resources_query = 0x9205;
    // 9, 终端上传音视频资源列表
    public static final int msg_id_Terminal_upload_media_resourse_list = 0x1205;
    // 10, 平台下发远程录像回放请求
    public static final int cmd_remote_replay_theater_request = 0x9201;
    // 11, 平台下发远程录像回放控制
    public static final int cmd_remote_replay_theater_control = 0x9202;
    // 12, 文件上传指令
    public static final int cmd_file_upload = 0x9206;
    // 13, 文件上传完成通知
    public static final int msg_id_file_upload_complete = 0x1206;
    // 14, 文件上传控制
    public static final int cmd_file_upload_control = 0x9207;
}
