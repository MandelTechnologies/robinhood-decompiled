package com.robinhood.android.feature.margin.hub;

import com.robinhood.android.lib.margin.hub.p168db.models.BuyingPowerHubView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuyingPowerHubState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState;", "", "<init>", "()V", "shouldShowCurrencySwitcher", "", "getShouldShowCurrencySwitcher", "()Z", "Loading", "Loaded", "Failure", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState$Failure;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState$Loaded;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState$Loading;", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubViewState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class BuyingPowerHubState3 {
    public static final int $stable = 0;

    public /* synthetic */ BuyingPowerHubState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BuyingPowerHubState3() {
    }

    /* compiled from: BuyingPowerHubState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState$Loading;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubViewState$Loading */
    public static final /* data */ class Loading extends BuyingPowerHubState3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 779503105;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: BuyingPowerHubState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState$Loaded;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState;", "buyingPowerHubResponse", "Lcom/robinhood/android/lib/margin/hub/db/models/BuyingPowerHubView;", "showCurrencySwitcher", "", "<init>", "(Lcom/robinhood/android/lib/margin/hub/db/models/BuyingPowerHubView;Z)V", "getBuyingPowerHubResponse", "()Lcom/robinhood/android/lib/margin/hub/db/models/BuyingPowerHubView;", "getShowCurrencySwitcher", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends BuyingPowerHubState3 {
        public static final int $stable = 8;
        private final BuyingPowerHubView buyingPowerHubResponse;
        private final boolean showCurrencySwitcher;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, BuyingPowerHubView buyingPowerHubView, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                buyingPowerHubView = loaded.buyingPowerHubResponse;
            }
            if ((i & 2) != 0) {
                z = loaded.showCurrencySwitcher;
            }
            return loaded.copy(buyingPowerHubView, z);
        }

        /* renamed from: component1, reason: from getter */
        public final BuyingPowerHubView getBuyingPowerHubResponse() {
            return this.buyingPowerHubResponse;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowCurrencySwitcher() {
            return this.showCurrencySwitcher;
        }

        public final Loaded copy(BuyingPowerHubView buyingPowerHubResponse, boolean showCurrencySwitcher) {
            Intrinsics.checkNotNullParameter(buyingPowerHubResponse, "buyingPowerHubResponse");
            return new Loaded(buyingPowerHubResponse, showCurrencySwitcher);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.buyingPowerHubResponse, loaded.buyingPowerHubResponse) && this.showCurrencySwitcher == loaded.showCurrencySwitcher;
        }

        public int hashCode() {
            return (this.buyingPowerHubResponse.hashCode() * 31) + Boolean.hashCode(this.showCurrencySwitcher);
        }

        public String toString() {
            return "Loaded(buyingPowerHubResponse=" + this.buyingPowerHubResponse + ", showCurrencySwitcher=" + this.showCurrencySwitcher + ")";
        }

        public final BuyingPowerHubView getBuyingPowerHubResponse() {
            return this.buyingPowerHubResponse;
        }

        public final boolean getShowCurrencySwitcher() {
            return this.showCurrencySwitcher;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(BuyingPowerHubView buyingPowerHubResponse, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(buyingPowerHubResponse, "buyingPowerHubResponse");
            this.buyingPowerHubResponse = buyingPowerHubResponse;
            this.showCurrencySwitcher = z;
        }
    }

    /* compiled from: BuyingPowerHubState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState$Failure;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubViewState$Failure, reason: from toString */
    public static final /* data */ class Failure extends BuyingPowerHubState3 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.throwable;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Failure copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Failure(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.throwable, ((Failure) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Failure(throwable=" + this.throwable + ")";
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }

    public final boolean getShouldShowCurrencySwitcher() {
        if (!(this instanceof Loaded)) {
            return false;
        }
        Loaded loaded = (Loaded) this;
        return loaded.getShowCurrencySwitcher() && !Intrinsics.areEqual(loaded.getBuyingPowerHubResponse().isInDeficit(), Boolean.TRUE);
    }
}
