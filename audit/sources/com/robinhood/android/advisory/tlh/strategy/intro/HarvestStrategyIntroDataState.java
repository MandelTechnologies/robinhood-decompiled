package com.robinhood.android.advisory.tlh.strategy.intro;

import com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesIntro;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesLoading;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HarvestStrategyIntroDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroDataState;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesIntro;", "enoughTimeHasPassedToShowLoadedState", "", "hasAvailableStrategies", "loading", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesLoading;", "<init>", "(Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesIntro;ZZLcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesLoading;)V", "getData", "()Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesIntro;", "getEnoughTimeHasPassedToShowLoadedState", "()Z", "getHasAvailableStrategies", "getLoading", "()Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesLoading;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HarvestStrategyIntroDataState {
    private final TaxLossHarvestStrategiesIntro data;
    private final boolean enoughTimeHasPassedToShowLoadedState;
    private final boolean hasAvailableStrategies;
    private final TaxLossHarvestStrategiesLoading loading;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public HarvestStrategyIntroDataState() {
        this(null, false, false, null, 15, null);
    }

    public static /* synthetic */ HarvestStrategyIntroDataState copy$default(HarvestStrategyIntroDataState harvestStrategyIntroDataState, TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro, boolean z, boolean z2, TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading, int i, Object obj) {
        if ((i & 1) != 0) {
            taxLossHarvestStrategiesIntro = harvestStrategyIntroDataState.data;
        }
        if ((i & 2) != 0) {
            z = harvestStrategyIntroDataState.enoughTimeHasPassedToShowLoadedState;
        }
        if ((i & 4) != 0) {
            z2 = harvestStrategyIntroDataState.hasAvailableStrategies;
        }
        if ((i & 8) != 0) {
            taxLossHarvestStrategiesLoading = harvestStrategyIntroDataState.loading;
        }
        return harvestStrategyIntroDataState.copy(taxLossHarvestStrategiesIntro, z, z2, taxLossHarvestStrategiesLoading);
    }

    /* renamed from: component1, reason: from getter */
    public final TaxLossHarvestStrategiesIntro getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnoughTimeHasPassedToShowLoadedState() {
        return this.enoughTimeHasPassedToShowLoadedState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasAvailableStrategies() {
        return this.hasAvailableStrategies;
    }

    /* renamed from: component4, reason: from getter */
    public final TaxLossHarvestStrategiesLoading getLoading() {
        return this.loading;
    }

    public final HarvestStrategyIntroDataState copy(TaxLossHarvestStrategiesIntro data, boolean enoughTimeHasPassedToShowLoadedState, boolean hasAvailableStrategies, TaxLossHarvestStrategiesLoading loading) {
        return new HarvestStrategyIntroDataState(data, enoughTimeHasPassedToShowLoadedState, hasAvailableStrategies, loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HarvestStrategyIntroDataState)) {
            return false;
        }
        HarvestStrategyIntroDataState harvestStrategyIntroDataState = (HarvestStrategyIntroDataState) other;
        return Intrinsics.areEqual(this.data, harvestStrategyIntroDataState.data) && this.enoughTimeHasPassedToShowLoadedState == harvestStrategyIntroDataState.enoughTimeHasPassedToShowLoadedState && this.hasAvailableStrategies == harvestStrategyIntroDataState.hasAvailableStrategies && Intrinsics.areEqual(this.loading, harvestStrategyIntroDataState.loading);
    }

    public int hashCode() {
        TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro = this.data;
        int iHashCode = (((((taxLossHarvestStrategiesIntro == null ? 0 : taxLossHarvestStrategiesIntro.hashCode()) * 31) + Boolean.hashCode(this.enoughTimeHasPassedToShowLoadedState)) * 31) + Boolean.hashCode(this.hasAvailableStrategies)) * 31;
        TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading = this.loading;
        return iHashCode + (taxLossHarvestStrategiesLoading != null ? taxLossHarvestStrategiesLoading.hashCode() : 0);
    }

    public String toString() {
        return "HarvestStrategyIntroDataState(data=" + this.data + ", enoughTimeHasPassedToShowLoadedState=" + this.enoughTimeHasPassedToShowLoadedState + ", hasAvailableStrategies=" + this.hasAvailableStrategies + ", loading=" + this.loading + ")";
    }

    public HarvestStrategyIntroDataState(TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro, boolean z, boolean z2, TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading) {
        this.data = taxLossHarvestStrategiesIntro;
        this.enoughTimeHasPassedToShowLoadedState = z;
        this.hasAvailableStrategies = z2;
        this.loading = taxLossHarvestStrategiesLoading;
    }

    public /* synthetic */ HarvestStrategyIntroDataState(TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro, boolean z, boolean z2, TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : taxLossHarvestStrategiesIntro, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : taxLossHarvestStrategiesLoading);
    }

    public final TaxLossHarvestStrategiesIntro getData() {
        return this.data;
    }

    public final boolean getEnoughTimeHasPassedToShowLoadedState() {
        return this.enoughTimeHasPassedToShowLoadedState;
    }

    public final boolean getHasAvailableStrategies() {
        return this.hasAvailableStrategies;
    }

    public final TaxLossHarvestStrategiesLoading getLoading() {
        return this.loading;
    }

    /* compiled from: HarvestStrategyIntroDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroDataState;", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState;", "<init>", "()V", "reduce", "dataState", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<HarvestStrategyIntroDataState, HarvestStrategyIntroViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public HarvestStrategyIntroViewState reduce(HarvestStrategyIntroDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getData() == null || !dataState.getEnoughTimeHasPassedToShowLoadedState()) {
                return new HarvestStrategyIntroViewState.Loading(dataState.getLoading());
            }
            return new HarvestStrategyIntroViewState.Loaded(dataState.getData().getTitle(), dataState.getData().getDescriptionMarkdown(), dataState.getData().getDisclosureMarkdown(), dataState.getData().getContinueCtaTitle(), dataState.getHasAvailableStrategies(), dataState.getData().getImageUrl());
        }
    }
}
