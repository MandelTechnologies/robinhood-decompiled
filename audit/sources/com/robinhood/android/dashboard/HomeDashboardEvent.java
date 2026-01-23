package com.robinhood.android.dashboard;

import com.robinhood.android.home.iac.events.store.Alert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeDashboardEvent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/dashboard/HomeDashboardEvent;", "", "IacAlert", "ScrollToTop", "feature-account-home_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface HomeDashboardEvent {

    /* compiled from: HomeDashboardEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/dashboard/HomeDashboardEvent$IacAlert;", "Lcom/robinhood/android/dashboard/HomeDashboardEvent;", "alert", "Lcom/robinhood/android/home/iac/events/store/Alert;", "<init>", "(Lcom/robinhood/android/home/iac/events/store/Alert;)V", "getAlert", "()Lcom/robinhood/android/home/iac/events/store/Alert;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-home_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IacAlert implements HomeDashboardEvent {
        public static final int $stable = 8;
        private final Alert alert;

        public static /* synthetic */ IacAlert copy$default(IacAlert iacAlert, Alert alert, int i, Object obj) {
            if ((i & 1) != 0) {
                alert = iacAlert.alert;
            }
            return iacAlert.copy(alert);
        }

        /* renamed from: component1, reason: from getter */
        public final Alert getAlert() {
            return this.alert;
        }

        public final IacAlert copy(Alert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new IacAlert(alert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IacAlert) && Intrinsics.areEqual(this.alert, ((IacAlert) other).alert);
        }

        public int hashCode() {
            return this.alert.hashCode();
        }

        public String toString() {
            return "IacAlert(alert=" + this.alert + ")";
        }

        public IacAlert(Alert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final Alert getAlert() {
            return this.alert;
        }
    }

    /* compiled from: HomeDashboardEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/dashboard/HomeDashboardEvent$ScrollToTop;", "Lcom/robinhood/android/dashboard/HomeDashboardEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-home_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScrollToTop implements HomeDashboardEvent {
        public static final int $stable = 0;
        public static final ScrollToTop INSTANCE = new ScrollToTop();

        public boolean equals(Object other) {
            return this == other || (other instanceof ScrollToTop);
        }

        public int hashCode() {
            return -1596423246;
        }

        public String toString() {
            return "ScrollToTop";
        }

        private ScrollToTop() {
        }
    }
}
