package com.robinhood.android.feature.margin.hub;

import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuyingPowerHubEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubEvent;", "", "ShowOnboardingAlert", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubEvent$ShowOnboardingAlert;", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface BuyingPowerHubEvent {

    /* compiled from: BuyingPowerHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubEvent$ShowOnboardingAlert;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubEvent;", "onboardingAlert", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;)V", "getOnboardingAlert", "()Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowOnboardingAlert implements BuyingPowerHubEvent {
        public static final int $stable = 8;
        private final AlertAction<GenericAction> onboardingAlert;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowOnboardingAlert copy$default(ShowOnboardingAlert showOnboardingAlert, AlertAction alertAction, int i, Object obj) {
            if ((i & 1) != 0) {
                alertAction = showOnboardingAlert.onboardingAlert;
            }
            return showOnboardingAlert.copy(alertAction);
        }

        public final AlertAction<GenericAction> component1() {
            return this.onboardingAlert;
        }

        public final ShowOnboardingAlert copy(AlertAction<? extends GenericAction> onboardingAlert) {
            Intrinsics.checkNotNullParameter(onboardingAlert, "onboardingAlert");
            return new ShowOnboardingAlert(onboardingAlert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowOnboardingAlert) && Intrinsics.areEqual(this.onboardingAlert, ((ShowOnboardingAlert) other).onboardingAlert);
        }

        public int hashCode() {
            return this.onboardingAlert.hashCode();
        }

        public String toString() {
            return "ShowOnboardingAlert(onboardingAlert=" + this.onboardingAlert + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ShowOnboardingAlert(AlertAction<? extends GenericAction> onboardingAlert) {
            Intrinsics.checkNotNullParameter(onboardingAlert, "onboardingAlert");
            this.onboardingAlert = onboardingAlert;
        }

        public final AlertAction<GenericAction> getOnboardingAlert() {
            return this.onboardingAlert;
        }
    }
}
