package com.potato.marketweb.bean;

/**
 * 设备信息bean
 *
 * @author desktop_spdb
 * @date 2022-12-06 11:10:59
 */
public class DeviceInfo {
    private String os_version;     //系统版本;
    private String board;     //获取设备基板名称;
    private String hardware;     //设备硬件名称,一般和基板名称一样（BOARD）;
    private String snNumber_build;
    private String MANUFACTURER;     //设备制造商;
    private String brand;     //获取设备品牌;
    private String radio;     //无线电固件版本;
    private String model;     //获取手机的型号 设备名称。如：SM-N9100（三星Note4）;
    private String cpu_abi;     //获取设备指令集名称（CPU的类型）;
    private String host;     //设备主机地址;
    private String device_driver;     //获取设备驱动名称;
    private String fingerprint;     //设备的唯一标识。由设备的多个信息拼接合成。;
    private String bootimage_build_fingerprint;
    private String os_version_id;     //设备版本号。;
    private String ro_build_date;
    private String ro_build_date_utc;
    private String ro_build_description;
    private String ro_build_fingerprint;
    private String build_version_sdk;
    private String bootimage_build_date;
    private String bootimage_build_date_utc;
    private String alarm_alert;
    private String notification_sound;
    private String ringtone;
    private String serialno_androidboot;
    private String product_build_date;
    private String product_build_date_utc;
    private String product_build_fingerprint;
    private String androidboot_vbmeta_digest;
    private String system_build_date;
    private String system_build_date_utc;
    private String system_build_fingerprint;
    private String system_ext_build_date;
    private String system_ext_build_date_utc;
    private String system_ext_build_fingerprint;
    private String vendor_build_date;
    private String vendor_build_date_utc;
    private String vendor_build_fingerprint;
    private String build_host;
    private String device_name;
    private String androidid;
    private String mi_health_id;
    private String gcbooster_uuid;
    private String key_mqs_uuid;
    private String ad_aaid;
    private String ro_boot_serialno;
    private String ro_serialno;
    private String screen_width;
    private String screen_height;
    private String insert_time;

    public String getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(String insert_time) {
        this.insert_time = insert_time;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getSnNumber_build() {
        return snNumber_build;
    }

    public void setSnNumber_build(String snNumber_build) {
        this.snNumber_build = snNumber_build;
    }

    public String getMANUFACTURER() {
        return MANUFACTURER;
    }

    public void setMANUFACTURER(String MANUFACTURER) {
        this.MANUFACTURER = MANUFACTURER;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu_abi() {
        return cpu_abi;
    }

    public void setCpu_abi(String cpu_abi) {
        this.cpu_abi = cpu_abi;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDevice_driver() {
        return device_driver;
    }

    public void setDevice_driver(String device_driver) {
        this.device_driver = device_driver;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getBootimage_build_fingerprint() {
        return bootimage_build_fingerprint;
    }

    public void setBootimage_build_fingerprint(String bootimage_build_fingerprint) {
        this.bootimage_build_fingerprint = bootimage_build_fingerprint;
    }

    public String getOs_version_id() {
        return os_version_id;
    }

    public void setOs_version_id(String os_version_id) {
        this.os_version_id = os_version_id;
    }

    public String getRo_build_date() {
        return ro_build_date;
    }

    public void setRo_build_date(String ro_build_date) {
        this.ro_build_date = ro_build_date;
    }

    public String getRo_build_date_utc() {
        return ro_build_date_utc;
    }

    public void setRo_build_date_utc(String ro_build_date_utc) {
        this.ro_build_date_utc = ro_build_date_utc;
    }

    public String getRo_build_description() {
        return ro_build_description;
    }

    public void setRo_build_description(String ro_build_description) {
        this.ro_build_description = ro_build_description;
    }

    public String getRo_build_fingerprint() {
        return ro_build_fingerprint;
    }

    public void setRo_build_fingerprint(String ro_build_fingerprint) {
        this.ro_build_fingerprint = ro_build_fingerprint;
    }

    public String getBuild_version_sdk() {
        return build_version_sdk;
    }

    public void setBuild_version_sdk(String build_version_sdk) {
        this.build_version_sdk = build_version_sdk;
    }

    public String getBootimage_build_date() {
        return bootimage_build_date;
    }

    public void setBootimage_build_date(String bootimage_build_date) {
        this.bootimage_build_date = bootimage_build_date;
    }

    public String getBootimage_build_date_utc() {
        return bootimage_build_date_utc;
    }

    public void setBootimage_build_date_utc(String bootimage_build_date_utc) {
        this.bootimage_build_date_utc = bootimage_build_date_utc;
    }

    public String getAlarm_alert() {
        return alarm_alert;
    }

    public void setAlarm_alert(String alarm_alert) {
        this.alarm_alert = alarm_alert;
    }

    public String getNotification_sound() {
        return notification_sound;
    }

    public void setNotification_sound(String notification_sound) {
        this.notification_sound = notification_sound;
    }

    public String getRingtone() {
        return ringtone;
    }

    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
    }

    public String getSerialno_androidboot() {
        return serialno_androidboot;
    }

    public void setSerialno_androidboot(String serialno_androidboot) {
        this.serialno_androidboot = serialno_androidboot;
    }

    public String getProduct_build_date() {
        return product_build_date;
    }

    public void setProduct_build_date(String product_build_date) {
        this.product_build_date = product_build_date;
    }

    public String getProduct_build_date_utc() {
        return product_build_date_utc;
    }

    public void setProduct_build_date_utc(String product_build_date_utc) {
        this.product_build_date_utc = product_build_date_utc;
    }

    public String getProduct_build_fingerprint() {
        return product_build_fingerprint;
    }

    public void setProduct_build_fingerprint(String product_build_fingerprint) {
        this.product_build_fingerprint = product_build_fingerprint;
    }

    public String getAndroidboot_vbmeta_digest() {
        return androidboot_vbmeta_digest;
    }

    public void setAndroidboot_vbmeta_digest(String androidboot_vbmeta_digest) {
        this.androidboot_vbmeta_digest = androidboot_vbmeta_digest;
    }

    public String getSystem_build_date() {
        return system_build_date;
    }

    public void setSystem_build_date(String system_build_date) {
        this.system_build_date = system_build_date;
    }

    public String getSystem_build_date_utc() {
        return system_build_date_utc;
    }

    public void setSystem_build_date_utc(String system_build_date_utc) {
        this.system_build_date_utc = system_build_date_utc;
    }

    public String getSystem_build_fingerprint() {
        return system_build_fingerprint;
    }

    public void setSystem_build_fingerprint(String system_build_fingerprint) {
        this.system_build_fingerprint = system_build_fingerprint;
    }

    public String getSystem_ext_build_date() {
        return system_ext_build_date;
    }

    public void setSystem_ext_build_date(String system_ext_build_date) {
        this.system_ext_build_date = system_ext_build_date;
    }

    public String getSystem_ext_build_date_utc() {
        return system_ext_build_date_utc;
    }

    public void setSystem_ext_build_date_utc(String system_ext_build_date_utc) {
        this.system_ext_build_date_utc = system_ext_build_date_utc;
    }

    public String getSystem_ext_build_fingerprint() {
        return system_ext_build_fingerprint;
    }

    public void setSystem_ext_build_fingerprint(String system_ext_build_fingerprint) {
        this.system_ext_build_fingerprint = system_ext_build_fingerprint;
    }

    public String getVendor_build_date() {
        return vendor_build_date;
    }

    public void setVendor_build_date(String vendor_build_date) {
        this.vendor_build_date = vendor_build_date;
    }

    public String getVendor_build_date_utc() {
        return vendor_build_date_utc;
    }

    public void setVendor_build_date_utc(String vendor_build_date_utc) {
        this.vendor_build_date_utc = vendor_build_date_utc;
    }

    public String getVendor_build_fingerprint() {
        return vendor_build_fingerprint;
    }

    public void setVendor_build_fingerprint(String vendor_build_fingerprint) {
        this.vendor_build_fingerprint = vendor_build_fingerprint;
    }

    public String getBuild_host() {
        return build_host;
    }

    public void setBuild_host(String build_host) {
        this.build_host = build_host;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    public String getAndroidid() {
        return androidid;
    }

    public void setAndroidid(String androidid) {
        this.androidid = androidid;
    }

    public String getMi_health_id() {
        return mi_health_id;
    }

    public void setMi_health_id(String mi_health_id) {
        this.mi_health_id = mi_health_id;
    }

    public String getGcbooster_uuid() {
        return gcbooster_uuid;
    }

    public void setGcbooster_uuid(String gcbooster_uuid) {
        this.gcbooster_uuid = gcbooster_uuid;
    }

    public String getKey_mqs_uuid() {
        return key_mqs_uuid;
    }

    public void setKey_mqs_uuid(String key_mqs_uuid) {
        this.key_mqs_uuid = key_mqs_uuid;
    }

    public String getAd_aaid() {
        return ad_aaid;
    }

    public void setAd_aaid(String ad_aaid) {
        this.ad_aaid = ad_aaid;
    }

    public String getRo_boot_serialno() {
        return ro_boot_serialno;
    }

    public void setRo_boot_serialno(String ro_boot_serialno) {
        this.ro_boot_serialno = ro_boot_serialno;
    }

    public String getRo_serialno() {
        return ro_serialno;
    }

    public void setRo_serialno(String ro_serialno) {
        this.ro_serialno = ro_serialno;
    }

    public String getScreen_width() {
        return screen_width;
    }

    public void setScreen_width(String screen_width) {
        this.screen_width = screen_width;
    }

    public String getScreen_height() {
        return screen_height;
    }

    public void setScreen_height(String screen_height) {
        this.screen_height = screen_height;
    }

    @Override
    public String toString() {
        return "DeviceInfo{" +
                "os_version='" + os_version + '\'' +
                ", board='" + board + '\'' +
                ", hardware='" + hardware + '\'' +
                ", snNumber_build='" + snNumber_build + '\'' +
                ", MANUFACTURER='" + MANUFACTURER + '\'' +
                ", brand='" + brand + '\'' +
                ", radio='" + radio + '\'' +
                ", model='" + model + '\'' +
                ", cpu_abi='" + cpu_abi + '\'' +
                ", host='" + host + '\'' +
                ", device_driver='" + device_driver + '\'' +
                ", fingerprint='" + fingerprint + '\'' +
                ", bootimage_build_fingerprint='" + bootimage_build_fingerprint + '\'' +
                ", os_version_id='" + os_version_id + '\'' +
                ", ro_build_date='" + ro_build_date + '\'' +
                ", ro_build_date_utc='" + ro_build_date_utc + '\'' +
                ", ro_build_description='" + ro_build_description + '\'' +
                ", ro_build_fingerprint='" + ro_build_fingerprint + '\'' +
                ", build_version_sdk='" + build_version_sdk + '\'' +
                ", bootimage_build_date='" + bootimage_build_date + '\'' +
                ", bootimage_build_date_utc='" + bootimage_build_date_utc + '\'' +
                ", alarm_alert='" + alarm_alert + '\'' +
                ", notification_sound='" + notification_sound + '\'' +
                ", ringtone='" + ringtone + '\'' +
                ", serialno_androidboot='" + serialno_androidboot + '\'' +
                ", product_build_date='" + product_build_date + '\'' +
                ", product_build_date_utc='" + product_build_date_utc + '\'' +
                ", product_build_fingerprint='" + product_build_fingerprint + '\'' +
                ", androidboot_vbmeta_digest='" + androidboot_vbmeta_digest + '\'' +
                ", system_build_date='" + system_build_date + '\'' +
                ", system_build_date_utc='" + system_build_date_utc + '\'' +
                ", system_build_fingerprint='" + system_build_fingerprint + '\'' +
                ", system_ext_build_date='" + system_ext_build_date + '\'' +
                ", system_ext_build_date_utc='" + system_ext_build_date_utc + '\'' +
                ", system_ext_build_fingerprint='" + system_ext_build_fingerprint + '\'' +
                ", vendor_build_date='" + vendor_build_date + '\'' +
                ", vendor_build_date_utc='" + vendor_build_date_utc + '\'' +
                ", vendor_build_fingerprint='" + vendor_build_fingerprint + '\'' +
                ", build_host='" + build_host + '\'' +
                ", device_name='" + device_name + '\'' +
                ", androidid='" + androidid + '\'' +
                ", mi_health_id='" + mi_health_id + '\'' +
                ", gcbooster_uuid='" + gcbooster_uuid + '\'' +
                ", key_mqs_uuid='" + key_mqs_uuid + '\'' +
                ", ad_aaid='" + ad_aaid + '\'' +
                ", ro_boot_serialno='" + ro_boot_serialno + '\'' +
                ", ro_serialno='" + ro_serialno + '\'' +
                ", screen_width='" + screen_width + '\'' +
                ", screen_height='" + screen_height + '\'' +
                ", insert_time='" + insert_time + '\'' +
                '}';
    }
}
