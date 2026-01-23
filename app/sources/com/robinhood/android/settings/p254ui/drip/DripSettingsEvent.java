package com.robinhood.android.settings.p254ui.drip;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DripSettingsEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent;", "", "ShowIneligibleDialog", "ShowOnboardingFlow", "SettingsUpdateSuccess", "Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent$SettingsUpdateSuccess;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent$ShowIneligibleDialog;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent$ShowOnboardingFlow;", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface DripSettingsEvent {

    /* compiled from: DripSettingsEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent$ShowIneligibleDialog;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowIneligibleDialog implements DripSettingsEvent {
        public static final int $stable = 0;
        public static final ShowIneligibleDialog INSTANCE = new ShowIneligibleDialog();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowIneligibleDialog);
        }

        public int hashCode() {
            return 209371651;
        }

        public String toString() {
            return "ShowIneligibleDialog";
        }

        private ShowIneligibleDialog() {
        }
    }

    /* compiled from: DripSettingsEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent$ShowOnboardingFlow;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowOnboardingFlow implements DripSettingsEvent {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ ShowOnboardingFlow copy$default(ShowOnboardingFlow showOnboardingFlow, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showOnboardingFlow.accountNumber;
            }
            return showOnboardingFlow.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ShowOnboardingFlow copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new ShowOnboardingFlow(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowOnboardingFlow) && Intrinsics.areEqual(this.accountNumber, ((ShowOnboardingFlow) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "ShowOnboardingFlow(accountNumber=" + this.accountNumber + ")";
        }

        public ShowOnboardingFlow(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: DripSettingsEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent$SettingsUpdateSuccess;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SettingsUpdateSuccess implements DripSettingsEvent {
        public static final int $stable = 0;
        public static final SettingsUpdateSuccess INSTANCE = new SettingsUpdateSuccess();

        public boolean equals(Object other) {
            return this == other || (other instanceof SettingsUpdateSuccess);
        }

        public int hashCode() {
            return 252559701;
        }

        public String toString() {
            return "SettingsUpdateSuccess";
        }

        private SettingsUpdateSuccess() {
        }
    }
}
