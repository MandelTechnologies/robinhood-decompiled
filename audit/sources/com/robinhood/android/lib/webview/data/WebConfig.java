package com.robinhood.android.lib.webview.data;

import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebConfig.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J5\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/data/WebConfig;", "", "oAuthToken", "Lcom/robinhood/models/api/OAuthToken;", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "", "appVersionString", "displayInfo", "Lcom/robinhood/android/lib/webview/data/DisplayInfo;", "<init>", "(Lcom/robinhood/models/api/OAuthToken;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/lib/webview/data/DisplayInfo;)V", "getOAuthToken", "()Lcom/robinhood/models/api/OAuthToken;", "getDeviceId", "()Ljava/lang/String;", "getAppVersionString", "getDisplayInfo", "()Lcom/robinhood/android/lib/webview/data/DisplayInfo;", "displayInfoCopy", "theme", "Lcom/robinhood/android/designsystem/prefs/Theme;", "colorScheme", "Lcom/robinhood/android/designsystem/style/ColorScheme;", "dayNightMode", "Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class WebConfig {
    private final String appVersionString;
    private final String deviceId;
    private final DisplayInfo displayInfo;
    private final OAuthToken oAuthToken;

    public static /* synthetic */ WebConfig copy$default(WebConfig webConfig, OAuthToken oAuthToken, String str, String str2, DisplayInfo displayInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            oAuthToken = webConfig.oAuthToken;
        }
        if ((i & 2) != 0) {
            str = webConfig.deviceId;
        }
        if ((i & 4) != 0) {
            str2 = webConfig.appVersionString;
        }
        if ((i & 8) != 0) {
            displayInfo = webConfig.displayInfo;
        }
        return webConfig.copy(oAuthToken, str, str2, displayInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final OAuthToken getOAuthToken() {
        return this.oAuthToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppVersionString() {
        return this.appVersionString;
    }

    /* renamed from: component4, reason: from getter */
    public final DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    public final WebConfig copy(OAuthToken oAuthToken, String deviceId, String appVersionString, DisplayInfo displayInfo) {
        Intrinsics.checkNotNullParameter(appVersionString, "appVersionString");
        Intrinsics.checkNotNullParameter(displayInfo, "displayInfo");
        return new WebConfig(oAuthToken, deviceId, appVersionString, displayInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebConfig)) {
            return false;
        }
        WebConfig webConfig = (WebConfig) other;
        return Intrinsics.areEqual(this.oAuthToken, webConfig.oAuthToken) && Intrinsics.areEqual(this.deviceId, webConfig.deviceId) && Intrinsics.areEqual(this.appVersionString, webConfig.appVersionString) && Intrinsics.areEqual(this.displayInfo, webConfig.displayInfo);
    }

    public int hashCode() {
        OAuthToken oAuthToken = this.oAuthToken;
        int iHashCode = (oAuthToken == null ? 0 : oAuthToken.hashCode()) * 31;
        String str = this.deviceId;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.appVersionString.hashCode()) * 31) + this.displayInfo.hashCode();
    }

    public String toString() {
        return "WebConfig(oAuthToken=" + this.oAuthToken + ", deviceId=" + this.deviceId + ", appVersionString=" + this.appVersionString + ", displayInfo=" + this.displayInfo + ")";
    }

    public WebConfig(OAuthToken oAuthToken, String str, String appVersionString, DisplayInfo displayInfo) {
        Intrinsics.checkNotNullParameter(appVersionString, "appVersionString");
        Intrinsics.checkNotNullParameter(displayInfo, "displayInfo");
        this.oAuthToken = oAuthToken;
        this.deviceId = str;
        this.appVersionString = appVersionString;
        this.displayInfo = displayInfo;
    }

    public final OAuthToken getOAuthToken() {
        return this.oAuthToken;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getAppVersionString() {
        return this.appVersionString;
    }

    public final DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    public static /* synthetic */ WebConfig displayInfoCopy$default(WebConfig webConfig, Theme theme, ColorScheme colorScheme, NightModeManager2 nightModeManager2, int i, Object obj) {
        if ((i & 1) != 0) {
            theme = webConfig.displayInfo.getTheme();
        }
        if ((i & 2) != 0) {
            colorScheme = webConfig.displayInfo.getColorScheme();
        }
        if ((i & 4) != 0) {
            nightModeManager2 = webConfig.displayInfo.getDayNightMode();
        }
        return webConfig.displayInfoCopy(theme, colorScheme, nightModeManager2);
    }

    public final WebConfig displayInfoCopy(Theme theme, ColorScheme colorScheme, NightModeManager2 dayNightMode) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Intrinsics.checkNotNullParameter(dayNightMode, "dayNightMode");
        return copy$default(this, null, null, null, this.displayInfo.copy(theme, colorScheme, dayNightMode), 7, null);
    }
}
