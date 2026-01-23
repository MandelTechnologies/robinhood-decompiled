package com.robinhood.android.gdpr.consent.bottomSheet;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.gdpr.GdprConsent;
import com.robinhood.android.gdpr.consent.bottomSheet.PrivacySettingsBottomSheetEvent;
import com.robinhood.android.gdpr.manager.GdprManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrivacySettingsBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/bottomSheet/PrivacySettingsBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/gdpr/consent/bottomSheet/PrivacySettingsBottomSheetEvent;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "gdprManager", "Lcom/robinhood/android/gdpr/manager/GdprManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/gdpr/manager/GdprManager;Lcom/robinhood/android/udf/DuxoBundle;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "shouldImplicitlyDeclineOnDismiss", "", "onAcceptAllButtonTapped", "onRejectAllButtonTapped", "onManageSettingsButtonTapped", "onBottomSheetDismissed", "Companion", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PrivacySettingsBottomSheetDuxo extends BaseDuxo5<Unit, PrivacySettingsBottomSheetEvent> {
    private final EventLogger eventLogger;
    private final GdprManager gdprManager;
    private boolean shouldImplicitlyDeclineOnDismiss;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final String ACCEPT_ALL_BUTTON_IDENTIFIER = "GDPR_ACCEPT_ALL";
    private static final String REJECT_ALL_BUTTON_IDENTIFIER = "GDPR_REJECT_ALL";
    private static final String MANAGE_SETTINGS_BUTTON_IDENTIFIER = "GDPR_MANAGE_SETTINGS";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacySettingsBottomSheetDuxo(EventLogger eventLogger, GdprManager gdprManager, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(gdprManager, "gdprManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.eventLogger = eventLogger;
        this.gdprManager = gdprManager;
        this.shouldImplicitlyDeclineOnDismiss = true;
    }

    public final Screen getEventScreen() {
        return new Screen(Screen.Name.WELCOME_MAIN, null, null, null, 14, null);
    }

    public final void onAcceptAllButtonTapped() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, getEventScreen(), new Component(Component.ComponentType.BUTTON, ACCEPT_ALL_BUTTON_IDENTIFIER, null, 4, null), null, null, false, 57, null);
        this.shouldImplicitlyDeclineOnDismiss = false;
        this.gdprManager.setConsent(GdprConsent.INSTANCE.getALL_GRANTED());
        submit(PrivacySettingsBottomSheetEvent.Dismiss.INSTANCE);
    }

    public final void onRejectAllButtonTapped() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, getEventScreen(), new Component(Component.ComponentType.BUTTON, REJECT_ALL_BUTTON_IDENTIFIER, null, 4, null), null, null, false, 57, null);
        this.shouldImplicitlyDeclineOnDismiss = false;
        this.gdprManager.setConsent(GdprConsent.INSTANCE.getALL_REJECTED());
        submit(PrivacySettingsBottomSheetEvent.Dismiss.INSTANCE);
    }

    public final void onManageSettingsButtonTapped() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, getEventScreen(), new Component(Component.ComponentType.BUTTON, MANAGE_SETTINGS_BUTTON_IDENTIFIER, null, 4, null), null, null, false, 57, null);
        this.shouldImplicitlyDeclineOnDismiss = false;
        submit(PrivacySettingsBottomSheetEvent.OpenPrivacySettingsFragment.INSTANCE);
    }

    public final void onBottomSheetDismissed() {
        if (this.shouldImplicitlyDeclineOnDismiss) {
            this.gdprManager.setConsent(GdprConsent.INSTANCE.getALL_REJECTED());
        }
    }

    /* compiled from: PrivacySettingsBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\u00058\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/bottomSheet/PrivacySettingsBottomSheetDuxo$Companion;", "", "<init>", "()V", "ACCEPT_ALL_BUTTON_IDENTIFIER", "", "getACCEPT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations", "getACCEPT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug", "()Ljava/lang/String;", "REJECT_ALL_BUTTON_IDENTIFIER", "getREJECT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations", "getREJECT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug", "MANAGE_SETTINGS_BUTTON_IDENTIFIER", "getMANAGE_SETTINGS_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations", "getMANAGE_SETTINGS_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getACCEPT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations */
        public static /* synthetic */ void m2040x86ea1bf9() {
        }

        /* renamed from: getMANAGE_SETTINGS_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations */
        public static /* synthetic */ void m2041xf5abdad2() {
        }

        /* renamed from: getREJECT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations */
        public static /* synthetic */ void m2042x12781bc2() {
        }

        private Companion() {
        }

        /* renamed from: getACCEPT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug */
        public final String m2043x3c820cf9() {
            return PrivacySettingsBottomSheetDuxo.ACCEPT_ALL_BUTTON_IDENTIFIER;
        }

        /* renamed from: getREJECT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug */
        public final String m2045xd182b242() {
            return PrivacySettingsBottomSheetDuxo.REJECT_ALL_BUTTON_IDENTIFIER;
        }

        /* renamed from: getMANAGE_SETTINGS_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug */
        public final String m2044x6d908952() {
            return PrivacySettingsBottomSheetDuxo.MANAGE_SETTINGS_BUTTON_IDENTIFIER;
        }
    }
}
