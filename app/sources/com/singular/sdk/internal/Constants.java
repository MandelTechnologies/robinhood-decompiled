package com.singular.sdk.internal;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.singular.sdk.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes12.dex */
public interface Constants {
    public static final String ADMON_AD_GROUP_ID = "ad_group_id";
    public static final String ADMON_AD_GROUP_NAME = "ad_group_name";
    public static final String ADMON_AD_GROUP_PRIORITY = "ad_group_priority";
    public static final String ADMON_AD_GROUP_TYPE = "ad_group_type";
    public static final String ADMON_AD_PLACEMENT_NAME = "ad_placement_name";
    public static final String ADMON_AD_PLATFORM = "ad_platform";
    public static final String ADMON_AD_TYPE = "ad_type";
    public static final String ADMON_AD_UNIT_ID = "ad_unit_id";
    public static final String ADMON_AD_UNIT_NAME = "ad_unit_name";
    public static final String ADMON_COUNT = "admon_count";
    public static final String ADMON_CURRENCY = "ad_currency";
    public static final String ADMON_EVENT_DEBUG_PARAM = "_de";
    public static final String ADMON_FIRST_UPDATE_TIMESTAMP = "first_update_timestamp";
    public static final String ADMON_IMPRESSION_ID = "ad_impression_id";
    public static final String ADMON_IS_ADMON_REVENUE = "is_admon_revenue";
    public static final String ADMON_LAST_UPDATE_TIMESTAMP = "last_update_timestamp";
    public static final String ADMON_NETWORK_NAME = "ad_mediation_platform";
    public static final String ADMON_PLACEMENT_ID = "ad_placement_id";
    public static final String ADMON_PRECISION = "ad_precision";
    public static final String ADMON_REVENUE = "ad_revenue";
    public static final String ADMON_REVENUE_EVENT_NAME = "__ADMON_USER_LEVEL_REVENUE__";
    public static final long AD_ID_TIMEOUT = 1;
    public static final String AMAZON_ADVERTISING_ID = "advertising_id";
    public static final String AMAZON_LIMIT_AD_TRACKING = "limit_ad_tracking";
    public static final String API_ENDPOINT = "https://sdk-api-v1.singular.net/api/v1";
    public static final String API_TYPE_CONFIG = "CONFIG";
    public static final String API_TYPE_CUSTOM_USER_ID = "CUSTOM_USER_ID";
    public static final String API_TYPE_EVENT = "EVENT";
    public static final String API_TYPE_GDPR_CONSENT = "GDPR_CONSENT";
    public static final String API_TYPE_GDPR_UNDER_13 = "GDPR_UNDER_13";
    public static final String API_TYPE_SESSION_START = "SESSION_START";
    public static final String CONFIG_MANAGER_CONFIG_KEY = "config_manager_config";
    public static final String CONFIG_MANAGER_CONFIG_REQUEST_LAST_ENQUEUED = "config_manager_config_request_last_enqueued";
    public static final String CUSTOM_SDID_KEY = "custom-sdid";
    public static final String CUSTOM_USER_ID_KEY = "custom_user_id";
    public static final String DATA_SHARING_OPTIONS = "data_sharing_options";
    public static final long DDL_HANDLER_TIMEOUT_SEC = 60;
    public static final String DEFAULT_SINGULAR_LINK_DOMAIN = "sng.link";
    public static final String DEVICE_ATTRIBUTION_INFO_KEY = "attribution_info";
    public static final String DID_MIGRATE_EVENT_TO_SDID_DEBUG_PARAM = "mg";
    public static final String DID_SEND_START_SESSION_WITH_SDID = "DID_SEND_START_SESSION_WITH_SDID";
    public static final String DID_SET_CUSTOM_SDID_KEY = "cs";
    public static final String DT_CONTENT_PROVIDER_INTENT_ACTION_NAME = "com.singular.preinstall.READ_PERMISSION_SINGULAR";
    public static final String DT_INSTALL_REFERRER_KEY = "dt_referrer";
    public static final String ENCODING = "UTF-8";
    public static final String ENCRYPTED_KEY_SUFFIX = "_sl";
    public static final String ENV = "PROD";
    public static final String EVENT_INDEX = "event_index";
    public static final int EVENT_MAX_PAYLOAD_ACCEPT_LENGTH = 3746;
    public static final String FACEBOOK_CONTENT_URI_STRING = "com.facebook.katana.provider.InstallReferrerProvider";
    public static final String FCM_DEVICE_TOKEN_KEY = "fcm_device_token_key";
    public static final String GCM_DEVICE_TOKEN_KEY = "gcm_device_token_key";
    public static final String GLOBAL_PROPERTIES_KEY = "global_properties";
    public static final String HIGH = "high";
    public static final int HTTP_CONNECTION_TIMEOUT = 10000;
    public static final int HTTP_READ_TIMEOUT = 10000;
    public static final String HTTP_USER_AGENT;
    public static final String INSTAGRAM_CONTENT_URI_STRING = "com.instagram.contentprovider.InstallReferrerProvider";
    public static final long INSTALL_REFERRER_BEGIN_TIMESTAMP_SERVER_SECONDS = -1;
    public static final long INSTALL_REFERRER_CLICK_TIMESTAMP_SERVER_SECONDS = -1;
    public static final long INSTALL_REFERRER_TIMEOUT = 3;
    public static final int INVALID = -1;
    public static final String IS_REVENUE_EVENT_KEY = "is_revenue_event";
    public static final Set<String> KEYS_TO_FILTER;
    public static final String LARGE = "large";
    public static final String LICENSING_API_KEY = "singular-licensing-api";
    public static final String LIMIT_DATA_SHARING = "limit_data_sharing";
    public static final String LIMIT_DATA_SHARING_KEY = "limit_data_sharing";
    public static final String LONG = "long";
    public static final String LOW = "low";
    public static final int MAX_LICENSING_ATTEMPTS = 3;
    public static final String MEDIUM = "medium";
    public static final String NORMAL = "normal";
    public static final String PARAM_APP_OPENED_FROM_PUSH_NOTIFICATION = "pu";
    public static final String PLATFORM = "Android";
    public static final String PREF_ADMON_EVENT_INDEX = "pref-admon-event-index";
    public static final String PREF_ADMON_EVENT_INDEX_KEY = "admon-event-index";
    public static final String PREF_BATCH_SEND_ID = "batch_send_id";
    public static final String PREF_CONFIG_MANAGER = "singular-pref-config-manager";
    public static final String PREF_CSI_REFERRER_KEY = "openUri";
    public static final String PREF_EVENT_INDEX = "pref-event-index";
    public static final String PREF_EVENT_INDEX_KEY = "event-index";
    public static final String PREF_FIRST_INSTALL = "singular-first-install";
    public static final String PREF_INSTALL_REFERRER = "install-openUri";
    public static final String PREF_REQUEST_RETRY_COUNT = "pref_retry_count";
    public static final String PREF_SESSION = "singular-pref-session";
    public static final String PREF_SINGULAR_DEVICE_ID_KEY = "pref-singular-device-id";
    public static final String PREF_SINGULAR_ID = "pref-singular-id";
    public static final String PREF_SINGULAR_ID_KEY = "singular-id";
    public static final String PREINSTALL_CONTENT_URI_PATH = "trackers";
    public static final String PRELOAD_CAMPAIGN = "SINGULAR_PRELOAD_CAMPAIGN";
    public static final String PRELOAD_GROUP = "SINGULAR_PRELOAD_GROUP";
    public static final String PRELOAD_SOURCE = "SINGULAR_PRELOAD_SOURCE";
    public static final String QUERY_ANDROID_DEEPLINK = "_android_dl";
    public static final String QUERY_DEEPLINK = "_dl";
    public static final String QUERY_DEEPLINK_PASSTHROUGH = "_p";
    public static final int QUEUE_ELEMENT_MAX_SIZE = 32768;
    public static final int QUEUE_MAX_SIZE = 10000;
    public static final String REFERRER_LINK_REQ_BODY_KEY = "long_link";
    public static final String REFERRER_LINK_REQ_BODY_URL_QUERY_PARAM_KEY_REF_ID = "referring_user_id";
    public static final String REFERRER_LINK_REQ_BODY_URL_QUERY_PARAM_KEY_REF_NAME = "referring_user_name";
    public static final String REFERRER_LINK_RES_BODY_KEY = "short_link";
    public static final String RESOLVED_SINGULAR_LINK = "resolved_singular_link";
    public static final String RETRY_COUNT = "rc";
    public static final int RETRY_COUNT_THRESHOLD = 3;
    public static final String REVENUE_AMOUNT_KEY = "r";
    public static final String REVENUE_CURRENCY_KEY = "pcc";
    public static final String REVENUE_EVENT_NAME = "__iap__";
    public static final String REVENUE_PRODUCT_CATEGORY_KEY = "pc";
    public static final String REVENUE_PRODUCT_NAME_KEY = "pn";
    public static final String REVENUE_PRODUCT_PRICE_KEY = "pp";
    public static final String REVENUE_PRODUCT_QUANTITY_KEY = "pq";
    public static final String REVENUE_PRODUCT_SKU_KEY = "pk";
    public static final String REVENUE_RECEIPT_KEY = "receipt";
    public static final String REVENUE_RECEIPT_SIGNATURE = "receipt_signature";
    public static final String SDID_KEY = "sdid";
    public static final String SDK_BUILD_INFO;
    public static final String SDK_VERSION;
    public static final long SESSION_DEFAULT_TIMEOUT_SECONDS = 60;
    public static final long SHORT_LINK_RESOLVE_TIMEOUT_SECONDS = 10;
    public static final String SINGULAR_INSTALL_ID = "singular_install_id";
    public static final String SINGULAR_LINK = "singular_link";
    public static final String SINGULAR_LINK_RESOLVE_REQUIRED = "singular_link_resolve_required";
    public static final String SINGULAR_LINK_RESOLVE_TIMEOUT = "singular_link_resolve_timeout";
    public static final String SMALL = "small";
    public static final String STOP_ALL_TRACKING_KEY = "stop_all_tracking";
    public static final String TRACKER_EXCEPTION_ENDPOINT = "https://exceptions.singular.net/v2/exceptions/android";
    public static final String UNKNOWN = "unknown";
    public static final String UPPERCASE_SDID_KEY = "SDID";
    public static final String VERSION_NAME = "12.9.0";
    public static final String WAS_OPENED_AFTER_INSTALL = "wasOpenedAfterInstall";
    public static final String WIFI = "wifi";
    public static final String WWAN = "wwan";
    public static final String XLARGE = "xlarge";

    public interface DeviceIdentifierKeyspaceKeys {
        public static final String AIFA_KEYSPACE_KEY = "aifa";
        public static final String AMID_KEYSPACE_KEY = "amid";
        public static final String ANDI_KEYSPACE_KEY = "andi";
        public static final String ASID_KEYSPACE_KEY = "asid";
        public static final String IMEI_KEYSPACE_KEY = "imei";
        public static final String OAID_KEYSPACE_KEY = "oaid";
    }

    public interface DeviceIdentifierKeyspaceValues {
        public static final String AIFA_KEYSPACE_VALUE = "AIFA";
        public static final String AMID_KEYSPACE_VALUE = "AMID";
        public static final String ANDI_KEYSPACE_VALUE = "ANDI";
        public static final String ASID_KEYSPACE_VALUE = "ASID";
        public static final String IMEI_KEYSPACE_VALUE = "IMEI";
        public static final String OAID_KEYSPACE_VALUE = "OAID";
    }

    public interface LimitedAdvertisingIdentifiers {
        public static final String LIMITED_ADVERTISING_IDENTIFIERS_STATUS = "lim";
        public static final Set<String> FORBIDDEN_REQUEST_KEYS = new HashSet(Arrays.asList(DeviceIdentifierKeyspaceKeys.AIFA_KEYSPACE_KEY, DeviceIdentifierKeyspaceKeys.IMEI_KEYSPACE_KEY, DeviceIdentifierKeyspaceKeys.ANDI_KEYSPACE_KEY));
        public static final Set<String> FORBIDDEN_KEYSPACE_VALUES = new HashSet(Arrays.asList(DeviceIdentifierKeyspaceValues.AIFA_KEYSPACE_VALUE, DeviceIdentifierKeyspaceValues.IMEI_KEYSPACE_VALUE, DeviceIdentifierKeyspaceValues.ANDI_KEYSPACE_VALUE));
    }

    public interface RequestBody {
        public static final String EXTRA_ATTRIBUTES_KEY = "e";
        public static final String INSTALL_REFERRER_KEY = "referrer_data";
    }

    public interface RequestParamsKeys {
        public static final String APP_NAME_KEY = "n";
        public static final String DEVELOPER_API_KEY = "a";
        public static final String IDENTIFIER_KEYSPACE_KEY = "k";
        public static final String IDENTIFIER_UNIQUE_ID_KEY = "u";
        public static final String PACKAGE_NAME_KEY = "i";
        public static final String PLATFORM_KEY = "p";
        public static final String SDK_VERSION_KEY = "sdk";
        public static final String SESSION_ID_KEY = "s";
    }

    public interface SdidMigrationStatusCodes {
        public static final String ALREADY_SDID = "1";
        public static final String CAUGHT_EXCEPTION = "5";
        public static final String DID_NOT_SEND_START_SESSION_WITH_SDID_YET = "3";
        public static final String MISSING_PARAMS = "4";
        public static final String NO_SDID_MODEL_AVAILABLE_YET = "0";
        public static final String SUCCESSFULLY_MIGRATED = "2";
    }

    static {
        Locale locale = Locale.US;
        SDK_BUILD_INFO = String.format(locale, "%s; %s", BuildConfig.GIT_INFO, Utils.formatTimestamp(BuildConfig.BUILD_TIME));
        SDK_VERSION = String.format(locale, "Singular/v%s", "12.9.0");
        HTTP_USER_AGENT = String.format(locale, "Singular/SDK-v%s.%s", "12.9.0", "PROD");
        KEYS_TO_FILTER = Collections.unmodifiableSet(new HashSet(Arrays.asList("st", "h", "stul", RequestParamsKeys.PLATFORM_KEY, "os", RequestParamsKeys.DEVELOPER_API_KEY, "ca", "an", RequestParamsKeys.PACKAGE_NAME_KEY, "udid", "op", "su", "ve", "murl", RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, "wurl", "singular_click_id", com.adjust.sdk.Constants.REFERRER, "ip", "ipv6", RequestParamsKeys.SESSION_ID_KEY, "redirect", "rt", "pl", "dkeys", "cur", "amt", "utime", "ut", "t", "av", "app_v", "c", RequestParamsKeys.APP_NAME_KEY, "v", RequestParamsKeys.SDK_VERSION_KEY, "dnt", "de", "br", "ab", "ma", "mo", "pr", "lag", "ddl_to", "is", "ddl_enabled", "ddl enabled", "install", "first", "idfa", "idfv", DeviceIdentifierKeyspaceKeys.AIFA_KEYSPACE_KEY, DeviceIdentifierKeyspaceKeys.ANDI_KEYSPACE_KEY, "sing", CUSTOM_USER_ID_KEY, "apid", "re", "_is_sl_click", "add_referrer", "web_gclid", "_no_hash_validation", "_hash_validated", "_api_key_validated", "_rejected_hash", "_rejected_api_key", "_rejected_no_adnetwork", "message_id", "trace_id", "request_id", SINGULAR_LINK, "openuri", "preload", "atr_settings", QUERY_DEEPLINK_PASSTHROUGH, "country_code", PlaceTypes.COUNTRY, "singular_device_id", "singular_custom_id", "SCID", "lc", SINGULAR_LINK_RESOLVE_REQUIRED, "ua", "device_user_agent", "original_keyspace", "original_device_key", "original_message_id", "sng_debug_enabled", "_ddlUrl", "_ddlErr", "_ddlSource", "_attribution_info_network", "_attribution_info_source", MatchaQrCodeDuxo6.USER_ID_KEY, "_web_params", "_link_type", "originated_in_touchpoint_store", "_forward_params", QUERY_DEEPLINK, QUERY_ANDROID_DEEPLINK, "_ios_dl", "_ddl", "_force_redirect", "_android_force_redirect", "_ch", "__ch_enabled", "skan_postback_payload", "_no_traffic_filtering", "esp_link", "esp_domains", "_smtype", "att_authorization_status", "bd", "sng_ref", ADMON_IS_ADMON_REVENUE, RequestBody.EXTRA_ATTRIBUTES_KEY, "apns_token", "tok", "fcm", "fi", "gcm", "ri", "sh", "sw", IS_REVENUE_EVENT_KEY, "purchase_receipt", "ecid", "install_ref", "attribution_token", "attr_ts", "attr_type", "adv_id", "adv_keyspace", "fps_status", "_samsung_redirect", "_fire_redirect", "lookup_platform", "touchpoint_platform", "ch_parsed", "conversion_event", "conversion_value", "counter_banner_showed", "install_id", "sdid", GLOBAL_PROPERTIES_KEY, "dont_send_click_to_unilogs", "global_timeout", "ptix", "pshid", "ipon", "ci")));
    }
}
