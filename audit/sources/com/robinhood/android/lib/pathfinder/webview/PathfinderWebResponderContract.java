package com.robinhood.android.lib.pathfinder.webview;

import android.webkit.ValueCallback;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.lib.webview.WebContracts2;
import com.robinhood.android.lib.webview.data.WebConfig;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.utils.moshi.LazyMoshi;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderWebResponderContract.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eH\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebResponderContract;", "Lcom/robinhood/android/lib/webview/WebResponderContract;", "renderUserView", "", "inquiryId", "Ljava/util/UUID;", "stateMap", "", "", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "rawJson", "callback", "Landroid/webkit/ValueCallback;", "Companion", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface PathfinderWebResponderContract extends WebContracts2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void renderUserView(LazyMoshi moshi, UUID inquiryId, String rawJson, ValueCallback<String> callback);

    void renderUserView(UUID inquiryId, Map<String, ? extends Object> stateMap);

    /* compiled from: PathfinderWebResponderContract.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void setAccessibleColors(PathfinderWebResponderContract pathfinderWebResponderContract, ColorScheme colors) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            WebContracts2.DefaultImpls.setAccessibleColors(pathfinderWebResponderContract, colors);
        }

        public static void setInitialConfig(PathfinderWebResponderContract pathfinderWebResponderContract, WebConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            WebContracts2.DefaultImpls.setInitialConfig(pathfinderWebResponderContract, config);
        }

        public static void setInitialConfig(PathfinderWebResponderContract pathfinderWebResponderContract, String str, String str2, String str3, String appVersion, Theme theme, NightModeManager2 currentDayNightMode, ColorScheme accessibleColors) {
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(currentDayNightMode, "currentDayNightMode");
            Intrinsics.checkNotNullParameter(accessibleColors, "accessibleColors");
            WebContracts2.DefaultImpls.setInitialConfig(pathfinderWebResponderContract, str, str2, str3, appVersion, theme, currentDayNightMode, accessibleColors);
        }

        public static void setTheme(PathfinderWebResponderContract pathfinderWebResponderContract, Theme theme, NightModeManager2 currentDayNightMode) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(currentDayNightMode, "currentDayNightMode");
            WebContracts2.DefaultImpls.setTheme(pathfinderWebResponderContract, theme, currentDayNightMode);
        }

        public static void setToken(PathfinderWebResponderContract pathfinderWebResponderContract, OAuthToken authToken) {
            Intrinsics.checkNotNullParameter(authToken, "authToken");
            WebContracts2.DefaultImpls.setToken(pathfinderWebResponderContract, authToken);
        }

        public static void updatePageData(PathfinderWebResponderContract pathfinderWebResponderContract) {
            WebContracts2.DefaultImpls.updatePageData(pathfinderWebResponderContract);
        }

        public static void renderUserView(PathfinderWebResponderContract pathfinderWebResponderContract, UUID inquiryId, Map<String, ? extends Object> stateMap) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(stateMap, "stateMap");
            WebContracts2.DefaultImpls.sendWebMessage$default(pathfinderWebResponderContract, "renderUserView", MapsKt.mapOf(Tuples4.m3642to("inquiryId", inquiryId.toString()), Tuples4.m3642to("inquiryState", stateMap)), (ValueCallback) null, 4, (Object) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void renderUserView$default(PathfinderWebResponderContract pathfinderWebResponderContract, LazyMoshi lazyMoshi, UUID uuid, String str, ValueCallback valueCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderUserView");
            }
            if ((i & 8) != 0) {
                valueCallback = null;
            }
            pathfinderWebResponderContract.renderUserView(lazyMoshi, uuid, str, valueCallback);
        }

        public static void renderUserView(PathfinderWebResponderContract pathfinderWebResponderContract, LazyMoshi moshi, UUID inquiryId, String rawJson, ValueCallback<String> valueCallback) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(rawJson, "rawJson");
            pathfinderWebResponderContract.sendWebMessage("renderUserView", MapsKt.mapOf(Tuples4.m3642to("inquiryId", inquiryId.toString()), Tuples4.m3642to("inquiryState", moshi.adapter(Map.class).fromJson(rawJson))), valueCallback);
        }
    }

    /* compiled from: PathfinderWebResponderContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebResponderContract$Companion;", "", "<init>", "()V", "NAME_RENDER_USER_VIEW", "", "ARG_INQUIRY_ID", "ARG_INQUIRY_STATE", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String ARG_INQUIRY_ID = "inquiryId";
        private static final String ARG_INQUIRY_STATE = "inquiryState";
        private static final String NAME_RENDER_USER_VIEW = "renderUserView";

        private Companion() {
        }
    }
}
