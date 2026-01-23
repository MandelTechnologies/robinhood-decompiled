package com.robinhood.android.gdpr.consent;

import com.robinhood.android.gdpr.GdprConsent;
import com.robinhood.android.gdpr.GdprConsentStatus;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrivacySettingsFragmentViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m3636d2 = {"gdprConsent", "Lcom/robinhood/android/gdpr/GdprConsent;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentViewState;", "getGdprConsent", "(Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentViewState;)Lcom/robinhood/android/gdpr/GdprConsent;", "gdprConsentStatus", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "", "Lcom/robinhood/android/gdpr/consent/PrivacySetting;", "setting", "feature-gdpr-consent_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentViewStateKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PrivacySettingsFragmentViewState2 {
    public static final GdprConsent getGdprConsent(PrivacySettingsFragmentViewState privacySettingsFragmentViewState) {
        Intrinsics.checkNotNullParameter(privacySettingsFragmentViewState, "<this>");
        return new GdprConsent(gdprConsentStatus(privacySettingsFragmentViewState.getEnabledSet(), PrivacySetting.FUNCTIONAL), gdprConsentStatus(privacySettingsFragmentViewState.getEnabledSet(), PrivacySetting.MARKETING), gdprConsentStatus(privacySettingsFragmentViewState.getEnabledSet(), PrivacySetting.PERFORMANCE));
    }

    private static final GdprConsentStatus gdprConsentStatus(Set<? extends PrivacySetting> set, PrivacySetting privacySetting) {
        return set.contains(privacySetting) ? GdprConsentStatus.GRANTED : GdprConsentStatus.REJECTED;
    }
}
