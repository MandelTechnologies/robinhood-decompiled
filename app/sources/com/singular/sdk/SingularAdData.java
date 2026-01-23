package com.singular.sdk;

import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.SingularLog;
import com.singular.sdk.internal.Utils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class SingularAdData extends JSONObject {
    private static final SingularLog logger = SingularLog.getLogger(SingularAdData.class.getSimpleName());
    private final String[] RequiredParams = {Constants.ADMON_AD_PLATFORM, Constants.ADMON_CURRENCY, Constants.ADMON_REVENUE};

    public final class AdPlatforms {
        public static final String MOPUB = "mopub";

        public AdPlatforms() {
        }
    }

    public SingularAdData(String str, String str2, double d) {
        try {
            put(Constants.ADMON_AD_PLATFORM, str);
            put(Constants.ADMON_CURRENCY, str2);
            put(Constants.ADMON_REVENUE, d);
            put(Constants.REVENUE_AMOUNT_KEY, d);
            put(Constants.REVENUE_CURRENCY_KEY, str2);
            put(Constants.ADMON_IS_ADMON_REVENUE, true);
            put(Constants.IS_REVENUE_EVENT_KEY, true);
            put(Constants.ADMON_NETWORK_NAME, str);
        } catch (JSONException e) {
            logger.error("Error in constructing ad data", e);
        }
    }

    public SingularAdData withNetworkName(String str) {
        try {
            put(Constants.ADMON_NETWORK_NAME, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting network name", e);
            return this;
        }
    }

    public SingularAdData withAdType(String str) {
        try {
            put(Constants.ADMON_AD_TYPE, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting ad type", e);
            return this;
        }
    }

    public SingularAdData withAdGroupType(String str) {
        try {
            put(Constants.ADMON_AD_GROUP_TYPE, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting ad group Type", e);
            return this;
        }
    }

    public SingularAdData withImpressionId(String str) {
        try {
            put(Constants.ADMON_IMPRESSION_ID, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting impression id", e);
            return this;
        }
    }

    public SingularAdData withAdPlacementName(String str) {
        try {
            put(Constants.ADMON_AD_PLACEMENT_NAME, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting ad placement name id", e);
            return this;
        }
    }

    public SingularAdData withAdUnitId(String str) {
        try {
            put(Constants.ADMON_AD_UNIT_ID, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting ad unit id", e);
            return this;
        }
    }

    public SingularAdData withAdUnitName(String str) {
        try {
            put(Constants.ADMON_AD_UNIT_NAME, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting ad unit name", e);
            return this;
        }
    }

    public SingularAdData withAdGroupId(String str) {
        try {
            put(Constants.ADMON_AD_GROUP_ID, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting ad group id", e);
            return this;
        }
    }

    public SingularAdData withAdGroupName(String str) {
        try {
            put(Constants.ADMON_AD_GROUP_NAME, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting ad group name", e);
            return this;
        }
    }

    public SingularAdData withAdGroupPriority(String str) {
        try {
            put(Constants.ADMON_AD_GROUP_PRIORITY, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting ad group priority", e);
            return this;
        }
    }

    public SingularAdData withPrecision(String str) {
        try {
            put(Constants.ADMON_PRECISION, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting precision", e);
            return this;
        }
    }

    public SingularAdData withPlacementId(String str) {
        try {
            put(Constants.ADMON_PLACEMENT_ID, str);
            return this;
        } catch (JSONException e) {
            logger.error("Error in setting placement id", e);
            return this;
        }
    }

    boolean hasRequiredParams() {
        for (String str : this.RequiredParams) {
            if (!has(str) || Utils.isEmptyOrNull(get(str).toString())) {
                return false;
            }
        }
        return true;
    }
}
