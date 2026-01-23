package com.robinhood.analytics;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsPrefs.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0015\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0018\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\nR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/analytics/AnalyticsPrefs;", "", "context", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "lastKnownUsername", "", "getLastKnownUsername", "()Ljava/lang/String;", "lastKnownUserSecret", "getLastKnownUserSecret", "saveLastKnownUserInfo", "", "username", "userSecret", "screenRes", "getScreenRes", "saveScreenRes", "densityIndependentScreenRes", "getDensityIndependentScreenRes", "saveDensityIndependentScreenRes", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AnalyticsPrefs {
    private static final String KEY_ANALYTICS_LAST_KNOWN_USERNAME = "analytics-last-known-username";
    private static final String KEY_ANALYTICS_LAST_KNOWN_USER_SECRET = "analytics-last-known-user-secret";
    private static final String KEY_ANALYTICS_REQUEST = "analytics-request-";
    private static final String KEY_ANALYTICS_REQUEST_INDEX = "analytics-request-index";
    private static final String KEY_ANALYTICS_RETRY_JSON = "analytics-retry-json-";
    private static final String KEY_ANALYTICS_RETRY_JSON_END = "analytics-retry-json-end-index";
    private static final String KEY_ANALYTICS_RETRY_JSON_START = "analytics-retry-json-start-index";
    private static final String KEY_DENSITY_INDEPENDENT_SCREEN_RES = "analytics-density-independent-screen-res";
    private static final String KEY_SCREEN_RES = "analytics-screen-res";
    private static final String PREF_NAME = "robinhood-analytics-prefs";
    private final SharedPreferences sharedPreferences;

    public AnalyticsPrefs(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, 0);
        if (sharedPreferences.contains(KEY_ANALYTICS_REQUEST_INDEX)) {
            int i = sharedPreferences.getInt(KEY_ANALYTICS_REQUEST_INDEX, 0);
            int i2 = sharedPreferences.getInt(KEY_ANALYTICS_RETRY_JSON_END, 0);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (int i3 = 0; i3 < i; i3++) {
                editorEdit.remove(KEY_ANALYTICS_REQUEST + i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                editorEdit.remove(KEY_ANALYTICS_RETRY_JSON + i4);
            }
            editorEdit.remove(KEY_ANALYTICS_REQUEST_INDEX);
            editorEdit.remove(KEY_ANALYTICS_RETRY_JSON_START);
            editorEdit.remove(KEY_ANALYTICS_RETRY_JSON_END);
            editorEdit.apply();
        }
        this.sharedPreferences = sharedPreferences;
    }

    public final String getLastKnownUsername() {
        return this.sharedPreferences.getString(KEY_ANALYTICS_LAST_KNOWN_USERNAME, null);
    }

    public final String getLastKnownUserSecret() {
        return this.sharedPreferences.getString(KEY_ANALYTICS_LAST_KNOWN_USER_SECRET, null);
    }

    public final void saveLastKnownUserInfo(String username, String userSecret) {
        this.sharedPreferences.edit().putString(KEY_ANALYTICS_LAST_KNOWN_USERNAME, username).putString(KEY_ANALYTICS_LAST_KNOWN_USER_SECRET, userSecret).apply();
    }

    public final String getScreenRes() {
        return this.sharedPreferences.getString(KEY_SCREEN_RES, null);
    }

    public final void saveScreenRes(String screenRes) {
        this.sharedPreferences.edit().putString(KEY_SCREEN_RES, screenRes).apply();
    }

    public final String getDensityIndependentScreenRes() {
        return this.sharedPreferences.getString(KEY_DENSITY_INDEPENDENT_SCREEN_RES, null);
    }

    public final void saveDensityIndependentScreenRes(String screenRes) {
        this.sharedPreferences.edit().putString(KEY_DENSITY_INDEPENDENT_SCREEN_RES, screenRes).apply();
    }
}
