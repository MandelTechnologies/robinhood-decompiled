package com.withpersona.sdk2.inquiry.internal;

import android.os.Bundle;
import androidx.core.os.BundleCompat;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InquiryArguments.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 L2\u00020\u0001:\u0001LB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010 \u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010$\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010*\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b)\u0010\u000bR\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0013\u00102\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b1\u0010\u000bR\u0011\u00104\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b3\u0010-R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010:\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u0010\u000bR\u0011\u0010<\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b;\u0010\u000bR\u0011\u0010>\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b=\u0010\u000bR\u0013\u0010@\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b?\u0010\u000bR\u0011\u0010B\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bA\u0010-R\u0011\u0010C\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bC\u0010-R\u0011\u0010E\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bD\u0010-R\u0011\u0010G\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bF\u0010-R\u0013\u0010I\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bH\u0010\u000bR\u0011\u0010K\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bJ\u0010-¨\u0006M"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryArguments;", "", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "", "getRequestKey", "()Ljava/lang/String;", "requestKey", "getTemplateId", "templateId", "getTemplateVersion", "templateVersion", "getInquiryId", "inquiryId", "getSessionToken", "sessionToken", "getReferenceId", "referenceId", "getAccountId", "accountId", "Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;", "getFieldsWrapper", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;", "fieldsWrapper", "", "getTheme", "()Ljava/lang/Integer;", "theme", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "getStaticInquiryTemplate", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "getEnvironment", "()Lcom/withpersona/sdk2/inquiry/internal/Environment;", "environment", "getEnvironmentId", "environmentId", "", "getEnableErrorLogging", "()Z", "enableErrorLogging", "getUseServerStyles", "useServerStyles", "getLocale", "locale", "getReturnCollectedData", "returnCollectedData", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "getFallbackMode", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "getServerEndpoint", "serverEndpoint", "getWebRtcServerEndpoint", "webRtcServerEndpoint", "getFallbackModeServerEndpoint", "fallbackModeServerEndpoint", "getThemeSetId", "themeSetId", "getConsumeExceptions", "consumeExceptions", "isNavBarEnabled", "getControlNavigationBar", "controlNavigationBar", "getControlStatusBar", "controlStatusBar", "getOneTimeLinkCode", "oneTimeLinkCode", "getHandleBackPress", "handleBackPress", "Companion", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class InquiryArguments {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Bundle bundle;

    public InquiryArguments(Bundle bundle) {
        this.bundle = bundle;
    }

    public final String getRequestKey() {
        String string2;
        Bundle bundle = this.bundle;
        return (bundle == null || (string2 = bundle.getString("REQUEST_KEY")) == null) ? "com.withpersona.sdk2.request_key" : string2;
    }

    public final String getTemplateId() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("TEMPLATE_ID_KEY");
        }
        return null;
    }

    public final String getTemplateVersion() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("TEMPLATE_VERSION_KEY");
        }
        return null;
    }

    public final String getInquiryId() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("INQUIRY_ID_KEY");
        }
        return null;
    }

    public final String getSessionToken() {
        String string2;
        Bundle bundle = this.bundle;
        if (bundle == null || (string2 = bundle.getString("SESSION_TOKEN_KEY")) == null) {
            return null;
        }
        return "Bearer " + string2;
    }

    public final String getReferenceId() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("REFERENCE_ID_KEY");
        }
        return null;
    }

    public final String getAccountId() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ACCOUNT_ID_KEY");
        }
        return null;
    }

    public final InquiryFieldsMap getFieldsWrapper() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return (InquiryFieldsMap) BundleCompat.getParcelable(bundle, "FIELDS_MAP_KEY", InquiryFieldsMap.class);
        }
        return null;
    }

    public final Integer getTheme() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return Integer.valueOf(bundle.getInt("THEME_KEY"));
        }
        return null;
    }

    public final StaticInquiryTemplate getStaticInquiryTemplate() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return (StaticInquiryTemplate) BundleCompat.getParcelable(bundle, "STATIC_INQUIRY_TEMPLATE_KEY", StaticInquiryTemplate.class);
        }
        return null;
    }

    public final Environment getEnvironment() {
        Bundle bundle = this.bundle;
        String string2 = bundle != null ? bundle.getString("ENVIRONMENT_KEY") : null;
        if (string2 != null) {
            int iHashCode = string2.hashCode();
            if (iHashCode != -2056856391) {
                if (iHashCode == -1711584601 && string2.equals("SANDBOX")) {
                    return Environment.SANDBOX;
                }
            } else if (string2.equals("PRODUCTION")) {
                return Environment.PRODUCTION;
            }
        }
        return Environment.PRODUCTION;
    }

    public final String getEnvironmentId() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ENVIRONMENT_ID_KEY");
        }
        return null;
    }

    public final boolean getEnableErrorLogging() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("ENABLE_ERROR_LOGGING", true);
        }
        return true;
    }

    public final boolean getUseServerStyles() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("USE_SERVER_STYLES", true);
        }
        return true;
    }

    public final String getLocale() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("LOCALE");
        }
        return null;
    }

    public final boolean getReturnCollectedData() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("RETURN_COLLECTED_DATA", false);
        }
        return false;
    }

    public final FallbackMode getFallbackMode() {
        Bundle bundle = this.bundle;
        String string2 = bundle != null ? bundle.getString("FALLBACK_MODE") : null;
        if (string2 != null) {
            int iHashCode = string2.hashCode();
            if (iHashCode != 64924498) {
                if (iHashCode != 74175084) {
                    if (iHashCode == 1933739535 && string2.equals("ALWAYS")) {
                        return FallbackMode.ALWAYS;
                    }
                } else if (string2.equals("NEVER")) {
                    return FallbackMode.NEVER;
                }
            } else if (string2.equals("DEFER")) {
                return FallbackMode.DEFER;
            }
        }
        return FallbackMode.NEVER;
    }

    public final String getServerEndpoint() {
        String string2;
        Bundle bundle = this.bundle;
        return (bundle == null || (string2 = bundle.getString("SERVER_ENDPOINT", "https://withpersona.com")) == null) ? "https://withpersona.com" : string2;
    }

    public final String getWebRtcServerEndpoint() {
        String string2;
        Bundle bundle = this.bundle;
        return (bundle == null || (string2 = bundle.getString("WEB_RTC_SERVER_ENDPOINT", "https://webrtc-consumer.withpersona.com")) == null) ? "https://webrtc-consumer.withpersona.com" : string2;
    }

    public final String getFallbackModeServerEndpoint() {
        String string2;
        Bundle bundle = this.bundle;
        return (bundle == null || (string2 = bundle.getString("FALLBACK_MODE_SERVER_ENDPOINT", "https://inquiry-fallback.withpersona.com")) == null) ? "https://inquiry-fallback.withpersona.com" : string2;
    }

    public final String getThemeSetId() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("THEME_SET_ID_KEY");
        }
        return null;
    }

    public final boolean getConsumeExceptions() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONSUME_EXCEPTIONS", false);
        }
        return false;
    }

    public final boolean isNavBarEnabled() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("IS_NAV_BAR_ENABLED", true);
        }
        return true;
    }

    public final boolean getControlNavigationBar() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONTROL_NAVIGATION_BAR", true);
        }
        return true;
    }

    public final boolean getControlStatusBar() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONTROL_STATUS_BAR", true);
        }
        return true;
    }

    public final String getOneTimeLinkCode() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ONE_TIME_LINK_CODE");
        }
        return null;
    }

    public final boolean getHandleBackPress() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("HANDLE_BACK_PRESS", true);
        }
        return true;
    }

    /* compiled from: InquiryArguments.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryArguments$Companion;", "", "<init>", "()V", "removeBearer", "", "DEFAULT_SERVER_ENDPOINT", "DEFAULT_WEB_RTC_SERVER_ENDPOINT", "DEFAULT_FALLBACK_MODE_SERVER_ENDPOINT", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String removeBearer(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return StringsKt.substringAfter$default(str, "Bearer ", (String) null, 2, (Object) null);
        }
    }
}
