package com.robinhood.android.lib.webview;

import android.webkit.ValueCallback;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.lib.webview.data.WebConfig;
import com.robinhood.android.lib.webview.extensions.ColorSchemes;
import com.robinhood.android.lib.webview.extensions.Themes2;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: WebContracts.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fJ.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH&J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016JF\u0010\u000b\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebResponderContract;", "", "sendWebMessage", "", "name", "", CarResultComposable2.BODY, "resultCallback", "Landroid/webkit/ValueCallback;", "bodyMap", "", "setInitialConfig", "config", "Lcom/robinhood/android/lib/webview/data/WebConfig;", "authToken", "authExpiration", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "appVersion", "theme", "Lcom/robinhood/android/designsystem/prefs/Theme;", "currentDayNightMode", "Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "accessibleColors", "Lcom/robinhood/android/designsystem/style/ColorScheme;", "setToken", "Lcom/robinhood/models/api/OAuthToken;", "setTheme", "setAccessibleColors", "colors", "updatePageData", "themeForCurrentMode", "Companion", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.webview.WebResponderContract, reason: use source file name */
/* loaded from: classes8.dex */
public interface WebContracts2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: WebContracts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.webview.WebResponderContract$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NightModeManager2.values().length];
            try {
                iArr[NightModeManager2.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NightModeManager2.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Theme.values().length];
            try {
                iArr2[Theme.SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    void sendWebMessage(String name, String body, ValueCallback<String> resultCallback);

    void sendWebMessage(String name, Map<String, ? extends Object> bodyMap, ValueCallback<String> resultCallback);

    void setAccessibleColors(ColorScheme colors);

    void setInitialConfig(WebConfig config);

    void setInitialConfig(String authToken, String authExpiration, String deviceId, String appVersion, Theme theme, NightModeManager2 currentDayNightMode, ColorScheme accessibleColors);

    void setTheme(Theme theme, NightModeManager2 currentDayNightMode);

    void setToken(OAuthToken authToken);

    void updatePageData();

    /* compiled from: WebContracts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.webview.WebResponderContract$DefaultImpls */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendWebMessage$default(WebContracts2 webContracts2, String str, String str2, ValueCallback valueCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendWebMessage");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                valueCallback = null;
            }
            webContracts2.sendWebMessage(str, str2, (ValueCallback<String>) valueCallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendWebMessage$default(WebContracts2 webContracts2, String str, Map map, ValueCallback valueCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendWebMessage");
            }
            if ((i & 4) != 0) {
                valueCallback = null;
            }
            webContracts2.sendWebMessage(str, (Map<String, ? extends Object>) map, (ValueCallback<String>) valueCallback);
        }

        public static void setInitialConfig(WebContracts2 webContracts2, WebConfig config) {
            Instant expiresAt;
            Intrinsics.checkNotNullParameter(config, "config");
            OAuthToken oAuthToken = config.getOAuthToken();
            String string2 = null;
            String accessToken = oAuthToken != null ? oAuthToken.getAccessToken() : null;
            OAuthToken oAuthToken2 = config.getOAuthToken();
            if (oAuthToken2 != null && (expiresAt = oAuthToken2.getExpiresAt()) != null) {
                string2 = expiresAt.toString();
            }
            webContracts2.setInitialConfig(accessToken, string2, config.getDeviceId(), config.getAppVersionString(), config.getDisplayInfo().getTheme(), config.getDisplayInfo().getDayNightMode(), config.getDisplayInfo().getColorScheme());
        }

        public static void setInitialConfig(WebContracts2 webContracts2, String str, String str2, String str3, String appVersion, Theme theme, NightModeManager2 currentDayNightMode, ColorScheme accessibleColors) {
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(currentDayNightMode, "currentDayNightMode");
            Intrinsics.checkNotNullParameter(accessibleColors, "accessibleColors");
            Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to("authToken", str != null ? MapsKt.mapOf(Tuples4.m3642to("accessToken", str), Tuples4.m3642to("expiresAt", str2)) : null), Tuples4.m3642to(CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, str3), Tuples4.m3642to("appVersion", appVersion), Tuples4.m3642to("theme", Themes2.getJsonName(themeForCurrentMode(webContracts2, theme, currentDayNightMode))), Tuples4.m3642to("accessibleColors", ColorSchemes.getJsonName(accessibleColors)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapMapOf.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            sendWebMessage$default(webContracts2, "setInitialConfig", linkedHashMap, (ValueCallback) null, 4, (Object) null);
        }

        public static void setToken(WebContracts2 webContracts2, OAuthToken authToken) {
            Intrinsics.checkNotNullParameter(authToken, "authToken");
            sendWebMessage$default(webContracts2, "setToken", MapsKt.mapOf(Tuples4.m3642to("accessToken", authToken.getAccessToken()), Tuples4.m3642to("expiresAt", authToken.getExpiresAt())), (ValueCallback) null, 4, (Object) null);
        }

        public static void setTheme(WebContracts2 webContracts2, Theme theme, NightModeManager2 currentDayNightMode) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(currentDayNightMode, "currentDayNightMode");
            sendWebMessage$default(webContracts2, "setTheme", Themes2.getJsonName(themeForCurrentMode(webContracts2, theme, currentDayNightMode)), (ValueCallback) null, 4, (Object) null);
        }

        public static void setAccessibleColors(WebContracts2 webContracts2, ColorScheme colors) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            sendWebMessage$default(webContracts2, "setAccessibleColors", ColorSchemes.getJsonName(colors), (ValueCallback) null, 4, (Object) null);
        }

        public static void updatePageData(WebContracts2 webContracts2) {
            sendWebMessage$default(webContracts2, "updatePageData", (String) null, (ValueCallback) null, 6, (Object) null);
        }

        private static Theme themeForCurrentMode(WebContracts2 webContracts2, Theme theme, NightModeManager2 nightModeManager2) {
            if (WhenMappings.$EnumSwitchMapping$1[theme.ordinal()] != 1) {
                return theme;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[nightModeManager2.ordinal()];
            if (i == 1) {
                return Theme.DAY;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Theme.NIGHT;
        }
    }

    /* compiled from: WebContracts.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebResponderContract$Companion;", "", "<init>", "()V", "NAME_SET_ACCESS_TOKEN", "", "NAME_SET_INITIAL_CONFIG", "NAME_SET_THEME", "NAME_SET_ACCESSIBLE_COLORS", "NAME_UPDATE_PAGE_DATA", "ARG_ACCESS_TOKEN_MAP", "ARG_ACCESS_TOKEN", "ARG_ACCESSIBLE_COLORS", "ARG_APP_VERSION", "ARG_DEVICE_ID", "ARG_EXPIRES_AT", "ARG_THEME", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.webview.WebResponderContract$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String ARG_ACCESSIBLE_COLORS = "accessibleColors";
        private static final String ARG_ACCESS_TOKEN = "accessToken";
        private static final String ARG_ACCESS_TOKEN_MAP = "authToken";
        private static final String ARG_APP_VERSION = "appVersion";
        private static final String ARG_DEVICE_ID = "deviceId";
        private static final String ARG_EXPIRES_AT = "expiresAt";
        private static final String ARG_THEME = "theme";
        private static final String NAME_SET_ACCESSIBLE_COLORS = "setAccessibleColors";
        private static final String NAME_SET_ACCESS_TOKEN = "setToken";
        private static final String NAME_SET_INITIAL_CONFIG = "setInitialConfig";
        private static final String NAME_SET_THEME = "setTheme";
        private static final String NAME_UPDATE_PAGE_DATA = "updatePageData";

        private Companion() {
        }
    }
}
