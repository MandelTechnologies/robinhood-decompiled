package com.singular.sdk.internal;

import com.singular.sdk.SingularConfig;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
abstract class BaseApi extends SingularMap implements Api {
    static final String TIMESTAMP_KEY = "__TIMESTAMP__";
    static final String TYPE_KEY = "__TYPE__";
    private static final SingularLog logger = SingularLog.getLogger(BaseApi.class.getSimpleName());
    protected boolean canUseSdidBeforeStartSessionWasSentWithSdid = false;

    public BaseApi(String str, long j) {
        put(TYPE_KEY, str);
        put(TIMESTAMP_KEY, String.valueOf(j));
    }

    Map<String, String> getParams() {
        HashMap map = new HashMap(this);
        map.remove(TYPE_KEY);
        map.remove(TIMESTAMP_KEY);
        return map;
    }

    public boolean isAdmonEvent() {
        try {
            String str = get(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY);
            if (str != null) {
                return new JSONObject(str).getBoolean(Constants.ADMON_IS_ADMON_REVENUE);
            }
            return false;
        } catch (Throwable th) {
            logger.debug("Not an admon event: " + th.getMessage());
            return false;
        }
    }

    void addParams(Map<String, String> map) {
        if (map == null) {
            return;
        }
        putAll(map);
    }

    public String getType() {
        return get(TYPE_KEY);
    }

    public long getTimestamp() {
        String str = get(TIMESTAMP_KEY);
        if (Utils.isEmptyOrNull(str)) {
            return -1L;
        }
        return Long.parseLong(str);
    }

    public String getUrl() {
        return "https://sdk-api-v1.singular.net/api/v1" + getPath();
    }

    public boolean makeRequest(SingularInstance singularInstance) throws IOException {
        tryMigrateEventToSdid(singularInstance);
        sanitizeRequestIfNeeded(singularInstance);
        return SingularRequestHandler.makeRequest(singularInstance, getUrl(), getParams(), getTimestamp(), getOnApiCallback());
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    void sanitizeRequestIfNeeded(SingularInstance singularInstance) {
        boolean z;
        SingularConfig singularConfig = singularInstance.getSingularConfig();
        if (singularConfig == null) {
            logger.debug("sanitizeRequestIfNeeded: config null. skipping.");
            return;
        }
        if (!singularConfig.limitAdvertisingIdentifiers.booleanValue()) {
            logger.debug("sanitizeRequestIfNeeded: not needed. skipping.");
            return;
        }
        if (!containsKey(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY)) {
            logger.debug("sanitizeRequestIfNeeded: no k param in request. skipping.");
            return;
        }
        String str = (String) get(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY);
        if (Utils.isEmptyOrNull(str)) {
            logger.debug("sanitizeRequestIfNeeded: no &k= value. skipping.");
            return;
        }
        boolean z2 = false;
        if (Constants.LimitedAdvertisingIdentifiers.FORBIDDEN_KEYSPACE_VALUES.contains(str)) {
            logger.debug("sanitizeRequestIfNeeded: limited identifier found, removing &k=" + str + " and &u= params.");
            remove(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY);
            remove(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY);
            z = true;
        } else {
            z = false;
        }
        for (String str2 : Constants.LimitedAdvertisingIdentifiers.FORBIDDEN_REQUEST_KEYS) {
            if (containsKey(str2)) {
                logger.debug("sanitizeRequestIfNeeded: limited identifier found, removing param &" + str2);
                remove(str2);
                z2 = true;
            }
        }
        if (z || z2) {
            logger.debug("sanitizeRequestIfNeeded: updating request params from withDeviceInfo according to current state of limitAdvertisingIdentifiers.");
            putAll(new SingularParamsBase().withDeviceInfo(singularInstance, this.canUseSdidBeforeStartSessionWasSentWithSdid));
        }
        ?? BooleanValue = singularConfig.limitAdvertisingIdentifiers.booleanValue();
        int i = BooleanValue;
        if (z) {
            i = BooleanValue + 2;
        }
        if (z2) {
            i += 4;
        }
        put(Constants.LimitedAdvertisingIdentifiers.LIMITED_ADVERTISING_IDENTIFIERS_STATUS, String.valueOf(i));
        logger.debug("sanitizeRequestIfNeeded: added sanitize result: &lim=" + i);
    }

    private void tryMigrateEventToSdid(SingularInstance singularInstance) {
        try {
            if (!getParams().containsKey(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY)) {
                put(Constants.DID_MIGRATE_EVENT_TO_SDID_DEBUG_PARAM, Constants.SdidMigrationStatusCodes.MISSING_PARAMS);
                logger.debug("BaseApi: this api has no 'k' param, skipping migration.");
                return;
            }
            if (DeviceIDManager.getInstance().getActualSdid(ConfigManager.getInstance(), singularInstance.getContext()) != null) {
                if (getParams().get(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY).equalsIgnoreCase("sdid")) {
                    put(Constants.DID_MIGRATE_EVENT_TO_SDID_DEBUG_PARAM, Constants.SdidMigrationStatusCodes.ALREADY_SDID);
                    logger.debug("BaseApi: not migrated, this api already has k=SDID, skipping migration.");
                    return;
                } else if (!this.canUseSdidBeforeStartSessionWasSentWithSdid && !DeviceIDManager.getInstance().didSendStartSessionWithSdid(singularInstance.getContext())) {
                    put(Constants.DID_MIGRATE_EVENT_TO_SDID_DEBUG_PARAM, Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
                    logger.debug("BaseApi: no session sent with SDID yet, skipping migration.");
                    return;
                } else {
                    putAll(new SingularParamsBase().withDeviceInfo(singularInstance, this.canUseSdidBeforeStartSessionWasSentWithSdid));
                    put(Constants.DID_MIGRATE_EVENT_TO_SDID_DEBUG_PARAM, Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED);
                    logger.debug("BaseApi: migrated api to k=SDID");
                    return;
                }
            }
            put(Constants.DID_MIGRATE_EVENT_TO_SDID_DEBUG_PARAM, "0");
            logger.debug("BaseApi: no SDID model available in device id manager, skipping migration.");
        } catch (Throwable unused) {
            put(Constants.DID_MIGRATE_EVENT_TO_SDID_DEBUG_PARAM, Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION);
            logger.error("BaseApi: failed to migrate event to SDID");
        }
    }

    public String toJsonAsString() {
        return new JSONObject((Map<?, ?>) this).toString();
    }

    public static BaseApi from(String str) throws IOException, NullPointerException {
        if (str == null) {
            throw new NullPointerException("api string cannot be null");
        }
        Map<String, String> mapFromString = fromString(str);
        String str2 = mapFromString.get(TYPE_KEY);
        String str3 = mapFromString.get(TIMESTAMP_KEY);
        long j = !Utils.isEmptyOrNull(str3) ? Long.parseLong(str3) : -1L;
        int andIncrementRetryCountForKey = Utils.getAndIncrementRetryCountForKey(SingularInstance.getInstance().getContext(), str3);
        if (andIncrementRetryCountForKey > 3) {
            mapFromString.put(Constants.RETRY_COUNT, String.valueOf(andIncrementRetryCountForKey));
        }
        if (Constants.API_TYPE_CONFIG.equalsIgnoreCase(str2)) {
            ApiConfig apiConfig = new ApiConfig(j);
            apiConfig.addParams(mapFromString);
            return apiConfig;
        }
        if (Constants.API_TYPE_EVENT.equalsIgnoreCase(str2)) {
            ApiSubmitEvent apiSubmitEvent = new ApiSubmitEvent(j);
            apiSubmitEvent.addParams(mapFromString);
            return apiSubmitEvent;
        }
        if (Constants.API_TYPE_SESSION_START.equalsIgnoreCase(str2)) {
            ApiStartSession apiStartSession = new ApiStartSession(j);
            apiStartSession.addParams(mapFromString);
            return apiStartSession;
        }
        if (Constants.API_TYPE_GDPR_CONSENT.equalsIgnoreCase(str2)) {
            ApiGDPRConsent apiGDPRConsent = new ApiGDPRConsent(j);
            apiGDPRConsent.addParams(mapFromString);
            return apiGDPRConsent;
        }
        if (Constants.API_TYPE_GDPR_UNDER_13.equalsIgnoreCase(str2)) {
            ApiGDPRUnder13 apiGDPRUnder13 = new ApiGDPRUnder13(j);
            apiGDPRUnder13.addParams(mapFromString);
            return apiGDPRUnder13;
        }
        if (Constants.API_TYPE_CUSTOM_USER_ID.equalsIgnoreCase(str2)) {
            ApiCustomUserId apiCustomUserId = new ApiCustomUserId(j);
            apiCustomUserId.addParams(mapFromString);
            return apiCustomUserId;
        }
        throw new InvalidPropertiesFormatException(String.format("Unknown type = %s", str2));
    }

    private static Map<String, String> fromString(String str) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, (String) jSONObject.get(next));
            }
            return map;
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
