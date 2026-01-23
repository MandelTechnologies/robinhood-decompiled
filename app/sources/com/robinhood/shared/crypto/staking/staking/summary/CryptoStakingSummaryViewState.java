package com.robinhood.shared.crypto.staking.staking.summary;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoStakingSummaryViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u000223B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jq\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010,\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState;", "", "currencyPairId", "Ljava/util/UUID;", "isCurrencyPairLoading", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "actionLabel", "chartState", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState;", "infoRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "footerState", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$FooterState;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "<init>", "(Ljava/util/UUID;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$FooterState;Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "()Z", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getActionLabel", "getChartState", "()Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState;", "getInfoRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getFooterState", "()Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$FooterState;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "ChartState", "FooterState", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoStakingSummaryViewState {
    public static final int $stable = 8;
    private final StringResource actionLabel;
    private final ChartState chartState;
    private final UUID currencyPairId;
    private final FooterState footerState;
    private final ImmutableList<UIComponent<GenericAction>> infoRows;
    private final boolean isCurrencyPairLoading;
    private final CryptoStakingContext loggingContext;
    private final StringResource title;

    public static /* synthetic */ CryptoStakingSummaryViewState copy$default(CryptoStakingSummaryViewState cryptoStakingSummaryViewState, UUID uuid, boolean z, StringResource stringResource, StringResource stringResource2, ChartState chartState, ImmutableList immutableList, FooterState footerState, CryptoStakingContext cryptoStakingContext, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoStakingSummaryViewState.currencyPairId;
        }
        if ((i & 2) != 0) {
            z = cryptoStakingSummaryViewState.isCurrencyPairLoading;
        }
        if ((i & 4) != 0) {
            stringResource = cryptoStakingSummaryViewState.title;
        }
        if ((i & 8) != 0) {
            stringResource2 = cryptoStakingSummaryViewState.actionLabel;
        }
        if ((i & 16) != 0) {
            chartState = cryptoStakingSummaryViewState.chartState;
        }
        if ((i & 32) != 0) {
            immutableList = cryptoStakingSummaryViewState.infoRows;
        }
        if ((i & 64) != 0) {
            footerState = cryptoStakingSummaryViewState.footerState;
        }
        if ((i & 128) != 0) {
            cryptoStakingContext = cryptoStakingSummaryViewState.loggingContext;
        }
        FooterState footerState2 = footerState;
        CryptoStakingContext cryptoStakingContext2 = cryptoStakingContext;
        ChartState chartState2 = chartState;
        ImmutableList immutableList2 = immutableList;
        return cryptoStakingSummaryViewState.copy(uuid, z, stringResource, stringResource2, chartState2, immutableList2, footerState2, cryptoStakingContext2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCurrencyPairLoading() {
        return this.isCurrencyPairLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getActionLabel() {
        return this.actionLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final ChartState getChartState() {
        return this.chartState;
    }

    public final ImmutableList<UIComponent<GenericAction>> component6() {
        return this.infoRows;
    }

    /* renamed from: component7, reason: from getter */
    public final FooterState getFooterState() {
        return this.footerState;
    }

    /* renamed from: component8, reason: from getter */
    public final CryptoStakingContext getLoggingContext() {
        return this.loggingContext;
    }

    public final CryptoStakingSummaryViewState copy(UUID currencyPairId, boolean isCurrencyPairLoading, StringResource title, StringResource actionLabel, ChartState chartState, ImmutableList<? extends UIComponent<? extends GenericAction>> infoRows, FooterState footerState, CryptoStakingContext loggingContext) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return new CryptoStakingSummaryViewState(currencyPairId, isCurrencyPairLoading, title, actionLabel, chartState, infoRows, footerState, loggingContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoStakingSummaryViewState)) {
            return false;
        }
        CryptoStakingSummaryViewState cryptoStakingSummaryViewState = (CryptoStakingSummaryViewState) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoStakingSummaryViewState.currencyPairId) && this.isCurrencyPairLoading == cryptoStakingSummaryViewState.isCurrencyPairLoading && Intrinsics.areEqual(this.title, cryptoStakingSummaryViewState.title) && Intrinsics.areEqual(this.actionLabel, cryptoStakingSummaryViewState.actionLabel) && Intrinsics.areEqual(this.chartState, cryptoStakingSummaryViewState.chartState) && Intrinsics.areEqual(this.infoRows, cryptoStakingSummaryViewState.infoRows) && Intrinsics.areEqual(this.footerState, cryptoStakingSummaryViewState.footerState) && Intrinsics.areEqual(this.loggingContext, cryptoStakingSummaryViewState.loggingContext);
    }

    public int hashCode() {
        int iHashCode = ((this.currencyPairId.hashCode() * 31) + Boolean.hashCode(this.isCurrencyPairLoading)) * 31;
        StringResource stringResource = this.title;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.actionLabel;
        int iHashCode3 = (iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        ChartState chartState = this.chartState;
        int iHashCode4 = (iHashCode3 + (chartState == null ? 0 : chartState.hashCode())) * 31;
        ImmutableList<UIComponent<GenericAction>> immutableList = this.infoRows;
        int iHashCode5 = (iHashCode4 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        FooterState footerState = this.footerState;
        int iHashCode6 = (iHashCode5 + (footerState == null ? 0 : footerState.hashCode())) * 31;
        CryptoStakingContext cryptoStakingContext = this.loggingContext;
        return iHashCode6 + (cryptoStakingContext != null ? cryptoStakingContext.hashCode() : 0);
    }

    public String toString() {
        return "CryptoStakingSummaryViewState(currencyPairId=" + this.currencyPairId + ", isCurrencyPairLoading=" + this.isCurrencyPairLoading + ", title=" + this.title + ", actionLabel=" + this.actionLabel + ", chartState=" + this.chartState + ", infoRows=" + this.infoRows + ", footerState=" + this.footerState + ", loggingContext=" + this.loggingContext + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoStakingSummaryViewState(UUID currencyPairId, boolean z, StringResource stringResource, StringResource stringResource2, ChartState chartState, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, FooterState footerState, CryptoStakingContext cryptoStakingContext) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        this.currencyPairId = currencyPairId;
        this.isCurrencyPairLoading = z;
        this.title = stringResource;
        this.actionLabel = stringResource2;
        this.chartState = chartState;
        this.infoRows = immutableList;
        this.footerState = footerState;
        this.loggingContext = cryptoStakingContext;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final boolean isCurrencyPairLoading() {
        return this.isCurrencyPairLoading;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getActionLabel() {
        return this.actionLabel;
    }

    public final ChartState getChartState() {
        return this.chartState;
    }

    public final ImmutableList<UIComponent<GenericAction>> getInfoRows() {
        return this.infoRows;
    }

    public final FooterState getFooterState() {
        return this.footerState;
    }

    public final CryptoStakingContext getLoggingContext() {
        return this.loggingContext;
    }

    /* compiled from: CryptoStakingSummaryViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState;", "", "stakedPercentage", "", "availableToStakeEntry", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState$Entry;", "stakedEntry", "<init>", "(FLcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState$Entry;Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState$Entry;)V", "getStakedPercentage", "()F", "getAvailableToStakeEntry", "()Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState$Entry;", "getStakedEntry", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Entry", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChartState {
        public static final int $stable = 0;
        private final Entry availableToStakeEntry;
        private final Entry stakedEntry;
        private final float stakedPercentage;

        public static /* synthetic */ ChartState copy$default(ChartState chartState, float f, Entry entry, Entry entry2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = chartState.stakedPercentage;
            }
            if ((i & 2) != 0) {
                entry = chartState.availableToStakeEntry;
            }
            if ((i & 4) != 0) {
                entry2 = chartState.stakedEntry;
            }
            return chartState.copy(f, entry, entry2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getStakedPercentage() {
            return this.stakedPercentage;
        }

        /* renamed from: component2, reason: from getter */
        public final Entry getAvailableToStakeEntry() {
            return this.availableToStakeEntry;
        }

        /* renamed from: component3, reason: from getter */
        public final Entry getStakedEntry() {
            return this.stakedEntry;
        }

        public final ChartState copy(float stakedPercentage, Entry availableToStakeEntry, Entry stakedEntry) {
            Intrinsics.checkNotNullParameter(availableToStakeEntry, "availableToStakeEntry");
            Intrinsics.checkNotNullParameter(stakedEntry, "stakedEntry");
            return new ChartState(stakedPercentage, availableToStakeEntry, stakedEntry);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChartState)) {
                return false;
            }
            ChartState chartState = (ChartState) other;
            return Float.compare(this.stakedPercentage, chartState.stakedPercentage) == 0 && Intrinsics.areEqual(this.availableToStakeEntry, chartState.availableToStakeEntry) && Intrinsics.areEqual(this.stakedEntry, chartState.stakedEntry);
        }

        public int hashCode() {
            return (((Float.hashCode(this.stakedPercentage) * 31) + this.availableToStakeEntry.hashCode()) * 31) + this.stakedEntry.hashCode();
        }

        public String toString() {
            return "ChartState(stakedPercentage=" + this.stakedPercentage + ", availableToStakeEntry=" + this.availableToStakeEntry + ", stakedEntry=" + this.stakedEntry + ")";
        }

        public ChartState(float f, Entry availableToStakeEntry, Entry stakedEntry) {
            Intrinsics.checkNotNullParameter(availableToStakeEntry, "availableToStakeEntry");
            Intrinsics.checkNotNullParameter(stakedEntry, "stakedEntry");
            this.stakedPercentage = f;
            this.availableToStakeEntry = availableToStakeEntry;
            this.stakedEntry = stakedEntry;
        }

        public final float getStakedPercentage() {
            return this.stakedPercentage;
        }

        public final Entry getAvailableToStakeEntry() {
            return this.availableToStakeEntry;
        }

        public final Entry getStakedEntry() {
            return this.stakedEntry;
        }

        /* compiled from: CryptoStakingSummaryViewState.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState$Entry;", "", "amount", "", "amountInFiat", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getAmountInFiat", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Entry {
            public static final int $stable = 0;
            private final String amount;
            private final String amountInFiat;

            public static /* synthetic */ Entry copy$default(Entry entry, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = entry.amount;
                }
                if ((i & 2) != 0) {
                    str2 = entry.amountInFiat;
                }
                return entry.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAmount() {
                return this.amount;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAmountInFiat() {
                return this.amountInFiat;
            }

            public final Entry copy(String amount, String amountInFiat) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(amountInFiat, "amountInFiat");
                return new Entry(amount, amountInFiat);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) other;
                return Intrinsics.areEqual(this.amount, entry.amount) && Intrinsics.areEqual(this.amountInFiat, entry.amountInFiat);
            }

            public int hashCode() {
                return (this.amount.hashCode() * 31) + this.amountInFiat.hashCode();
            }

            public String toString() {
                return "Entry(amount=" + this.amount + ", amountInFiat=" + this.amountInFiat + ")";
            }

            public Entry(String amount, String amountInFiat) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(amountInFiat, "amountInFiat");
                this.amount = amount;
                this.amountInFiat = amountInFiat;
            }

            public final String getAmount() {
                return this.amount;
            }

            public final String getAmountInFiat() {
                return this.amountInFiat;
            }
        }
    }

    /* compiled from: CryptoStakingSummaryViewState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$FooterState;", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "", "stakeButtonVisible", "", "stakeButtonEnabled", "unstakeButtonEnabled", "unstakeButtonVisible", "<init>", "(Ljava/lang/String;ZZZZ)V", "getDisclosure", "()Ljava/lang/String;", "getStakeButtonVisible", "()Z", "getStakeButtonEnabled", "getUnstakeButtonEnabled", "getUnstakeButtonVisible", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FooterState {
        public static final int $stable = 0;
        private final String disclosure;
        private final boolean stakeButtonEnabled;
        private final boolean stakeButtonVisible;
        private final boolean unstakeButtonEnabled;
        private final boolean unstakeButtonVisible;

        public static /* synthetic */ FooterState copy$default(FooterState footerState, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = footerState.disclosure;
            }
            if ((i & 2) != 0) {
                z = footerState.stakeButtonVisible;
            }
            if ((i & 4) != 0) {
                z2 = footerState.stakeButtonEnabled;
            }
            if ((i & 8) != 0) {
                z3 = footerState.unstakeButtonEnabled;
            }
            if ((i & 16) != 0) {
                z4 = footerState.unstakeButtonVisible;
            }
            boolean z5 = z4;
            boolean z6 = z2;
            return footerState.copy(str, z, z6, z3, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getStakeButtonVisible() {
            return this.stakeButtonVisible;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getStakeButtonEnabled() {
            return this.stakeButtonEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getUnstakeButtonEnabled() {
            return this.unstakeButtonEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getUnstakeButtonVisible() {
            return this.unstakeButtonVisible;
        }

        public final FooterState copy(String disclosure, boolean stakeButtonVisible, boolean stakeButtonEnabled, boolean unstakeButtonEnabled, boolean unstakeButtonVisible) {
            return new FooterState(disclosure, stakeButtonVisible, stakeButtonEnabled, unstakeButtonEnabled, unstakeButtonVisible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FooterState)) {
                return false;
            }
            FooterState footerState = (FooterState) other;
            return Intrinsics.areEqual(this.disclosure, footerState.disclosure) && this.stakeButtonVisible == footerState.stakeButtonVisible && this.stakeButtonEnabled == footerState.stakeButtonEnabled && this.unstakeButtonEnabled == footerState.unstakeButtonEnabled && this.unstakeButtonVisible == footerState.unstakeButtonVisible;
        }

        public int hashCode() {
            String str = this.disclosure;
            return ((((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.stakeButtonVisible)) * 31) + Boolean.hashCode(this.stakeButtonEnabled)) * 31) + Boolean.hashCode(this.unstakeButtonEnabled)) * 31) + Boolean.hashCode(this.unstakeButtonVisible);
        }

        public String toString() {
            return "FooterState(disclosure=" + this.disclosure + ", stakeButtonVisible=" + this.stakeButtonVisible + ", stakeButtonEnabled=" + this.stakeButtonEnabled + ", unstakeButtonEnabled=" + this.unstakeButtonEnabled + ", unstakeButtonVisible=" + this.unstakeButtonVisible + ")";
        }

        public FooterState(String str, boolean z, boolean z2, boolean z3, boolean z4) {
            this.disclosure = str;
            this.stakeButtonVisible = z;
            this.stakeButtonEnabled = z2;
            this.unstakeButtonEnabled = z3;
            this.unstakeButtonVisible = z4;
        }

        public final String getDisclosure() {
            return this.disclosure;
        }

        public final boolean getStakeButtonVisible() {
            return this.stakeButtonVisible;
        }

        public final boolean getStakeButtonEnabled() {
            return this.stakeButtonEnabled;
        }

        public final boolean getUnstakeButtonEnabled() {
            return this.unstakeButtonEnabled;
        }

        public final boolean getUnstakeButtonVisible() {
            return this.unstakeButtonVisible;
        }
    }
}
