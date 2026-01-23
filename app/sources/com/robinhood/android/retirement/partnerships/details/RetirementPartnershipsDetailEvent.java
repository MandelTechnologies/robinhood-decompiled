package com.robinhood.android.retirement.partnerships.details;

import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.RetirementPartnershipDetailAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementPartnershipsDetailEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent;", "", "Deeplink", "ClaimError", "DisplayAlert", "NoPartnership", "ClaimComplete", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent$ClaimComplete;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent$ClaimError;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent$Deeplink;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent$DisplayAlert;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent$NoPartnership;", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementPartnershipsDetailEvent {

    /* compiled from: RetirementPartnershipsDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent$Deeplink;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent;", "deeplink", "", "<init>", "(Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Deeplink implements RetirementPartnershipsDetailEvent {
        public static final int $stable = 0;
        private final String deeplink;

        public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deeplink.deeplink;
            }
            return deeplink.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Deeplink copy(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new Deeplink(deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Deeplink) && Intrinsics.areEqual(this.deeplink, ((Deeplink) other).deeplink);
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        public String toString() {
            return "Deeplink(deeplink=" + this.deeplink + ")";
        }

        public Deeplink(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }
    }

    /* compiled from: RetirementPartnershipsDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent$ClaimError;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ClaimError implements RetirementPartnershipsDetailEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ ClaimError copy$default(ClaimError claimError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = claimError.error;
            }
            return claimError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final ClaimError copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new ClaimError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClaimError) && Intrinsics.areEqual(this.error, ((ClaimError) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ClaimError(error=" + this.error + ")";
        }

        public ClaimError(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: RetirementPartnershipsDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent$DisplayAlert;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent;", "alert", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/RetirementPartnershipDetailAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;)V", "getAlert", "()Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisplayAlert implements RetirementPartnershipsDetailEvent {
        public static final int $stable = 8;
        private final AlertAction<RetirementPartnershipDetailAction> alert;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayAlert copy$default(DisplayAlert displayAlert, AlertAction alertAction, int i, Object obj) {
            if ((i & 1) != 0) {
                alertAction = displayAlert.alert;
            }
            return displayAlert.copy(alertAction);
        }

        public final AlertAction<RetirementPartnershipDetailAction> component1() {
            return this.alert;
        }

        public final DisplayAlert copy(AlertAction<? extends RetirementPartnershipDetailAction> alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new DisplayAlert(alert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayAlert) && Intrinsics.areEqual(this.alert, ((DisplayAlert) other).alert);
        }

        public int hashCode() {
            return this.alert.hashCode();
        }

        public String toString() {
            return "DisplayAlert(alert=" + this.alert + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DisplayAlert(AlertAction<? extends RetirementPartnershipDetailAction> alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final AlertAction<RetirementPartnershipDetailAction> getAlert() {
            return this.alert;
        }
    }

    /* compiled from: RetirementPartnershipsDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent$NoPartnership;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NoPartnership implements RetirementPartnershipsDetailEvent {
        public static final int $stable = 0;
        public static final NoPartnership INSTANCE = new NoPartnership();

        public boolean equals(Object other) {
            return this == other || (other instanceof NoPartnership);
        }

        public int hashCode() {
            return -1700932212;
        }

        public String toString() {
            return "NoPartnership";
        }

        private NoPartnership() {
        }
    }

    /* compiled from: RetirementPartnershipsDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent$ClaimComplete;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ClaimComplete implements RetirementPartnershipsDetailEvent {
        public static final int $stable = 0;
        public static final ClaimComplete INSTANCE = new ClaimComplete();

        public boolean equals(Object other) {
            return this == other || (other instanceof ClaimComplete);
        }

        public int hashCode() {
            return 1147198622;
        }

        public String toString() {
            return "ClaimComplete";
        }

        private ClaimComplete() {
        }
    }
}
