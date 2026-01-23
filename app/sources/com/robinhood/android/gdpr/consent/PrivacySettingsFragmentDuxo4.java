package com.robinhood.android.gdpr.consent;

import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;

/* compiled from: PrivacySettingsFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"cookiePolicyLink", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/shared/app/type/AppType;", "getCookiePolicyLink", "(Lcom/robinhood/shared/app/type/AppType;)Lcom/robinhood/utils/resource/StringResource;", "privacyPolicyLink", "getPrivacyPolicyLink", "feature-gdpr-consent_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxoKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PrivacySettingsFragmentDuxo4 {

    /* compiled from: PrivacySettingsFragmentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StringResource getCookiePolicyLink(AppType appType) {
        int i = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C17671R.string.privacy_settings_cookie_policy_link_eu, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C17671R.string.privacy_settings_cookie_policy_link_gb, new Object[0]);
        }
        throw new IllegalStateException("Unsupported app type using privacy settings");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StringResource getPrivacyPolicyLink(AppType appType) {
        int i = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C17671R.string.privacy_settings_privacy_policy_link_eu, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C17671R.string.privacy_settings_privacy_policy_link_gb, new Object[0]);
        }
        throw new IllegalStateException("Unsupported app type using privacy settings");
    }
}
