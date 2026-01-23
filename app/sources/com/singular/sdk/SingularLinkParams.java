package com.singular.sdk;

import android.net.Uri;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.Utils;
import com.singular.sdk.internal.utils.UriUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes12.dex */
public class SingularLinkParams {
    private String deeplink;
    private boolean isDeferred;
    private String passthrough;
    private Uri url;
    private HashMap<String, String> urlParameters;

    public SingularLinkParams(String str, String str2, boolean z, Uri uri) {
        this.deeplink = attachValidQueryParams(str, uri);
        this.passthrough = str2;
        this.isDeferred = z;
        this.url = uri;
    }

    private String attachValidQueryParams(String str, Uri uri) {
        if (Utils.isEmptyOrNull(str) || Utils.isEmptyOrNull(uri.toString())) {
            return str;
        }
        Uri uri2 = Uri.parse(str);
        Uri.Builder builderBuildUpon = uri2.buildUpon();
        String queryParameter = uri.getQueryParameter("_forward_params");
        if (Utils.isEmptyOrNull(queryParameter) || !queryParameter.equals(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED)) {
            return str;
        }
        HashSet hashSet = new HashSet(uri2.getQueryParameterNames());
        for (String str2 : uri.getQueryParameterNames()) {
            if (!Constants.KEYS_TO_FILTER.contains(str2) && !hashSet.contains(str2)) {
                builderBuildUpon.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        return builderBuildUpon.build().toString();
    }

    public String getDeeplink() {
        return this.deeplink;
    }

    public String getPassthrough() {
        return this.passthrough;
    }

    public boolean isDeferred() {
        return this.isDeferred;
    }

    public HashMap<String, String> getUrlParameters() {
        if (this.urlParameters == null && UriUtils.isValid(this.url)) {
            Set<String> queryParameterNames = this.url.getQueryParameterNames();
            this.urlParameters = new HashMap<>(queryParameterNames.size());
            for (String str : queryParameterNames) {
                this.urlParameters.put(str, this.url.getQueryParameter(str));
            }
        }
        HashMap<String, String> map = this.urlParameters;
        return map != null ? map : new HashMap<>();
    }
}
