package com.robinhood.android.gdpr.consent.bottomSheet;

import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PrivacySettingsBottomSheetEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/bottomSheet/PrivacySettingsBottomSheetEvent;", "", "<init>", "()V", BentoAlertSheet6.button2Title, "OpenPrivacySettingsFragment", "Lcom/robinhood/android/gdpr/consent/bottomSheet/PrivacySettingsBottomSheetEvent$Dismiss;", "Lcom/robinhood/android/gdpr/consent/bottomSheet/PrivacySettingsBottomSheetEvent$OpenPrivacySettingsFragment;", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class PrivacySettingsBottomSheetEvent {
    public static final int $stable = 0;

    public /* synthetic */ PrivacySettingsBottomSheetEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PrivacySettingsBottomSheetEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/bottomSheet/PrivacySettingsBottomSheetEvent$Dismiss;", "Lcom/robinhood/android/gdpr/consent/bottomSheet/PrivacySettingsBottomSheetEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Dismiss extends PrivacySettingsBottomSheetEvent {
        public static final int $stable = 0;
        public static final Dismiss INSTANCE = new Dismiss();

        public boolean equals(Object other) {
            return this == other || (other instanceof Dismiss);
        }

        public int hashCode() {
            return 1804072196;
        }

        public String toString() {
            return BentoAlertSheet6.button2Title;
        }

        private Dismiss() {
            super(null);
        }
    }

    private PrivacySettingsBottomSheetEvent() {
    }

    /* compiled from: PrivacySettingsBottomSheetEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/bottomSheet/PrivacySettingsBottomSheetEvent$OpenPrivacySettingsFragment;", "Lcom/robinhood/android/gdpr/consent/bottomSheet/PrivacySettingsBottomSheetEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenPrivacySettingsFragment extends PrivacySettingsBottomSheetEvent {
        public static final int $stable = 0;
        public static final OpenPrivacySettingsFragment INSTANCE = new OpenPrivacySettingsFragment();

        public boolean equals(Object other) {
            return this == other || (other instanceof OpenPrivacySettingsFragment);
        }

        public int hashCode() {
            return 2035418891;
        }

        public String toString() {
            return "OpenPrivacySettingsFragment";
        }

        private OpenPrivacySettingsFragment() {
            super(null);
        }
    }
}
