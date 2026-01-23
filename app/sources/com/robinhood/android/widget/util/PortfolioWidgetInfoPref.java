package com.robinhood.android.widget.util;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PortfolioWidgetInfoPref.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0086\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo;", "<init>", "(Landroid/content/SharedPreferences;Lcom/squareup/moshi/JsonAdapter;)V", "get", "appWidgetId", "", "set", "", SduiFeatureDiscovery3.INFO_TAG, "isSet", "", AnalyticsStrings.BUTTON_LIST_DELETE, "getKey", "", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class PortfolioWidgetInfoPref {
    private static final String KEY_PREFIX = "portfolioWidgetPref_";
    private final JsonAdapter<PortfolioWidgetInfo> adapter;
    private final SharedPreferences sharedPreferences;

    public PortfolioWidgetInfoPref(SharedPreferences sharedPreferences, JsonAdapter<PortfolioWidgetInfo> adapter) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.sharedPreferences = sharedPreferences;
        this.adapter = adapter;
    }

    public final PortfolioWidgetInfo get(int appWidgetId) {
        PortfolioWidgetInfo portfolioWidgetInfoFromJson;
        String string2 = this.sharedPreferences.getString(getKey(appWidgetId), null);
        return (string2 == null || (portfolioWidgetInfoFromJson = this.adapter.fromJson(string2)) == null) ? new PortfolioWidgetInfo(null, null, null, null, null, null, null, 0, 0, 0, 0, 2047, null) : portfolioWidgetInfoFromJson;
    }

    public final void set(int appWidgetId, PortfolioWidgetInfo info) {
        this.sharedPreferences.edit().putString(getKey(appWidgetId), this.adapter.toJson(info)).apply();
    }

    public final boolean isSet(int appWidgetId) {
        return this.sharedPreferences.contains(getKey(appWidgetId));
    }

    public final void delete(int appWidgetId) {
        this.sharedPreferences.edit().remove(getKey(appWidgetId)).apply();
    }

    private final String getKey(int appWidgetId) {
        return KEY_PREFIX + appWidgetId;
    }
}
