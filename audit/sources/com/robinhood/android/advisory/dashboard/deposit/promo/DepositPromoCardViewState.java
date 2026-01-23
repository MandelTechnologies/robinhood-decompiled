package com.robinhood.android.advisory.dashboard.deposit.promo;

import com.robinhood.models.advisory.p304db.card.StrategiesDashboardCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositPromoCardViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardViewState;", "", "Empty", "Loaded", "Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardViewState$Empty;", "Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardViewState$Loaded;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface DepositPromoCardViewState {

    /* compiled from: DepositPromoCardViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardViewState$Empty;", "Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty implements DepositPromoCardViewState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return -84601952;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
        }
    }

    /* compiled from: DepositPromoCardViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardViewState$Loaded;", "Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardViewState;", "card", "Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard;", "dismissable", "", "isRetirement", "<init>", "(Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard;ZZ)V", "getCard", "()Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard;", "getDismissable", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements DepositPromoCardViewState {
        public static final int $stable = 8;
        private final StrategiesDashboardCard card;
        private final boolean dismissable;
        private final boolean isRetirement;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, StrategiesDashboardCard strategiesDashboardCard, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                strategiesDashboardCard = loaded.card;
            }
            if ((i & 2) != 0) {
                z = loaded.dismissable;
            }
            if ((i & 4) != 0) {
                z2 = loaded.isRetirement;
            }
            return loaded.copy(strategiesDashboardCard, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final StrategiesDashboardCard getCard() {
            return this.card;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDismissable() {
            return this.dismissable;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRetirement() {
            return this.isRetirement;
        }

        public final Loaded copy(StrategiesDashboardCard card, boolean dismissable, boolean isRetirement) {
            Intrinsics.checkNotNullParameter(card, "card");
            return new Loaded(card, dismissable, isRetirement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.card, loaded.card) && this.dismissable == loaded.dismissable && this.isRetirement == loaded.isRetirement;
        }

        public int hashCode() {
            return (((this.card.hashCode() * 31) + Boolean.hashCode(this.dismissable)) * 31) + Boolean.hashCode(this.isRetirement);
        }

        public String toString() {
            return "Loaded(card=" + this.card + ", dismissable=" + this.dismissable + ", isRetirement=" + this.isRetirement + ")";
        }

        public Loaded(StrategiesDashboardCard card, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(card, "card");
            this.card = card;
            this.dismissable = z;
            this.isRetirement = z2;
        }

        public final StrategiesDashboardCard getCard() {
            return this.card;
        }

        public final boolean getDismissable() {
            return this.dismissable;
        }

        public final boolean isRetirement() {
            return this.isRetirement;
        }
    }
}
