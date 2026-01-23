package com.robinhood.android.optionsupgrade;

import com.robinhood.android.common.options.C11303R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OptionOnboardingUpsellAlertViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertViewState;", "", "isEnablingAlert", "", "isLoadingNextScreensOnPositiveButton", "isLoadingNextScreensOnNegativeButton", "isSystemSettingsEnabled", "<init>", "(ZZZZ)V", "()Z", "positiveButtonTextResId", "", "getPositiveButtonTextResId", "()I", "isPositiveButtonLoading", "isNegativeButtonLoading", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingUpsellAlertViewState {
    public static final int $stable = 0;
    private final boolean isEnablingAlert;
    private final boolean isLoadingNextScreensOnNegativeButton;
    private final boolean isLoadingNextScreensOnPositiveButton;
    private final boolean isNegativeButtonLoading;
    private final boolean isPositiveButtonLoading;
    private final boolean isSystemSettingsEnabled;
    private final int positiveButtonTextResId;

    public OptionOnboardingUpsellAlertViewState() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ OptionOnboardingUpsellAlertViewState copy$default(OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = optionOnboardingUpsellAlertViewState.isEnablingAlert;
        }
        if ((i & 2) != 0) {
            z2 = optionOnboardingUpsellAlertViewState.isLoadingNextScreensOnPositiveButton;
        }
        if ((i & 4) != 0) {
            z3 = optionOnboardingUpsellAlertViewState.isLoadingNextScreensOnNegativeButton;
        }
        if ((i & 8) != 0) {
            z4 = optionOnboardingUpsellAlertViewState.isSystemSettingsEnabled;
        }
        return optionOnboardingUpsellAlertViewState.copy(z, z2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnablingAlert() {
        return this.isEnablingAlert;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoadingNextScreensOnPositiveButton() {
        return this.isLoadingNextScreensOnPositiveButton;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoadingNextScreensOnNegativeButton() {
        return this.isLoadingNextScreensOnNegativeButton;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSystemSettingsEnabled() {
        return this.isSystemSettingsEnabled;
    }

    public final OptionOnboardingUpsellAlertViewState copy(boolean isEnablingAlert, boolean isLoadingNextScreensOnPositiveButton, boolean isLoadingNextScreensOnNegativeButton, boolean isSystemSettingsEnabled) {
        return new OptionOnboardingUpsellAlertViewState(isEnablingAlert, isLoadingNextScreensOnPositiveButton, isLoadingNextScreensOnNegativeButton, isSystemSettingsEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingUpsellAlertViewState)) {
            return false;
        }
        OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState = (OptionOnboardingUpsellAlertViewState) other;
        return this.isEnablingAlert == optionOnboardingUpsellAlertViewState.isEnablingAlert && this.isLoadingNextScreensOnPositiveButton == optionOnboardingUpsellAlertViewState.isLoadingNextScreensOnPositiveButton && this.isLoadingNextScreensOnNegativeButton == optionOnboardingUpsellAlertViewState.isLoadingNextScreensOnNegativeButton && this.isSystemSettingsEnabled == optionOnboardingUpsellAlertViewState.isSystemSettingsEnabled;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isEnablingAlert) * 31) + Boolean.hashCode(this.isLoadingNextScreensOnPositiveButton)) * 31) + Boolean.hashCode(this.isLoadingNextScreensOnNegativeButton)) * 31) + Boolean.hashCode(this.isSystemSettingsEnabled);
    }

    public String toString() {
        return "OptionOnboardingUpsellAlertViewState(isEnablingAlert=" + this.isEnablingAlert + ", isLoadingNextScreensOnPositiveButton=" + this.isLoadingNextScreensOnPositiveButton + ", isLoadingNextScreensOnNegativeButton=" + this.isLoadingNextScreensOnNegativeButton + ", isSystemSettingsEnabled=" + this.isSystemSettingsEnabled + ")";
    }

    public OptionOnboardingUpsellAlertViewState(boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        this.isEnablingAlert = z;
        this.isLoadingNextScreensOnPositiveButton = z2;
        this.isLoadingNextScreensOnNegativeButton = z3;
        this.isSystemSettingsEnabled = z4;
        if (z4) {
            i = C11303R.string.option_alert_onboarding_positive_button;
        } else {
            i = C11303R.string.option_alert_go_to_settings_positive_button;
        }
        this.positiveButtonTextResId = i;
        this.isPositiveButtonLoading = z || z2;
        this.isNegativeButtonLoading = z3;
    }

    public /* synthetic */ OptionOnboardingUpsellAlertViewState(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? true : z4);
    }

    public final boolean isEnablingAlert() {
        return this.isEnablingAlert;
    }

    public final boolean isLoadingNextScreensOnPositiveButton() {
        return this.isLoadingNextScreensOnPositiveButton;
    }

    public final boolean isLoadingNextScreensOnNegativeButton() {
        return this.isLoadingNextScreensOnNegativeButton;
    }

    public final boolean isSystemSettingsEnabled() {
        return this.isSystemSettingsEnabled;
    }

    public final int getPositiveButtonTextResId() {
        return this.positiveButtonTextResId;
    }

    /* renamed from: isPositiveButtonLoading, reason: from getter */
    public final boolean getIsPositiveButtonLoading() {
        return this.isPositiveButtonLoading;
    }

    /* renamed from: isNegativeButtonLoading, reason: from getter */
    public final boolean getIsNegativeButtonLoading() {
        return this.isNegativeButtonLoading;
    }
}
