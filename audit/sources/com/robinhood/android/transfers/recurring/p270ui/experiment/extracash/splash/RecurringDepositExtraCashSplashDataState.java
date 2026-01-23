package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.splash;

import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositExtraCashSplashDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDataState;", "", "goldSubscriptionState", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;", "sweepsInterest", "Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "<init>", "(Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;Lcom/robinhood/models/db/mcduckling/SweepsInterest;)V", "getGoldSubscriptionState", "()Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;", "getSweepsInterest", "()Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecurringDepositExtraCashSplashDataState {
    public static final int $stable = 8;
    private final GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState;
    private final SweepsInterest sweepsInterest;

    /* JADX WARN: Multi-variable type inference failed */
    public RecurringDepositExtraCashSplashDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecurringDepositExtraCashSplashDataState copy$default(RecurringDepositExtraCashSplashDataState recurringDepositExtraCashSplashDataState, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, SweepsInterest sweepsInterest, int i, Object obj) {
        if ((i & 1) != 0) {
            goldSubscriptionState = recurringDepositExtraCashSplashDataState.goldSubscriptionState;
        }
        if ((i & 2) != 0) {
            sweepsInterest = recurringDepositExtraCashSplashDataState.sweepsInterest;
        }
        return recurringDepositExtraCashSplashDataState.copy(goldSubscriptionState, sweepsInterest);
    }

    /* renamed from: component1, reason: from getter */
    public final GoldSubscriptionStore.GoldSubscriptionState getGoldSubscriptionState() {
        return this.goldSubscriptionState;
    }

    /* renamed from: component2, reason: from getter */
    public final SweepsInterest getSweepsInterest() {
        return this.sweepsInterest;
    }

    public final RecurringDepositExtraCashSplashDataState copy(GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, SweepsInterest sweepsInterest) {
        return new RecurringDepositExtraCashSplashDataState(goldSubscriptionState, sweepsInterest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringDepositExtraCashSplashDataState)) {
            return false;
        }
        RecurringDepositExtraCashSplashDataState recurringDepositExtraCashSplashDataState = (RecurringDepositExtraCashSplashDataState) other;
        return this.goldSubscriptionState == recurringDepositExtraCashSplashDataState.goldSubscriptionState && Intrinsics.areEqual(this.sweepsInterest, recurringDepositExtraCashSplashDataState.sweepsInterest);
    }

    public int hashCode() {
        GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState = this.goldSubscriptionState;
        int iHashCode = (goldSubscriptionState == null ? 0 : goldSubscriptionState.hashCode()) * 31;
        SweepsInterest sweepsInterest = this.sweepsInterest;
        return iHashCode + (sweepsInterest != null ? sweepsInterest.hashCode() : 0);
    }

    public String toString() {
        return "RecurringDepositExtraCashSplashDataState(goldSubscriptionState=" + this.goldSubscriptionState + ", sweepsInterest=" + this.sweepsInterest + ")";
    }

    public RecurringDepositExtraCashSplashDataState(GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, SweepsInterest sweepsInterest) {
        this.goldSubscriptionState = goldSubscriptionState;
        this.sweepsInterest = sweepsInterest;
    }

    public /* synthetic */ RecurringDepositExtraCashSplashDataState(GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, SweepsInterest sweepsInterest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : goldSubscriptionState, (i & 2) != 0 ? null : sweepsInterest);
    }

    public final GoldSubscriptionStore.GoldSubscriptionState getGoldSubscriptionState() {
        return this.goldSubscriptionState;
    }

    public final SweepsInterest getSweepsInterest() {
        return this.sweepsInterest;
    }
}
