package com.robinhood.shared.crypto.staking.staking.summary;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.models.crypto.CurrencyDefinition;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingPosition;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingSummaryModel;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.shared.crypto.staking.staking.C37760R;
import com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryViewState;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoStakingSummaryDataState.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u00108\u001a\u00020\u00192\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001f\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010/\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006="}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryDataState;", "", "currencyPairId", "Ljava/util/UUID;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "summaryModel", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingSummaryModel;", "position", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingPosition;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/staking/CryptoStakingSummaryModel;Lcom/robinhood/models/crypto/db/staking/CryptoStakingPosition;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSummaryModel", "()Lcom/robinhood/models/crypto/db/staking/CryptoStakingSummaryModel;", "getPosition", "()Lcom/robinhood/models/crypto/db/staking/CryptoStakingPosition;", "currencySymbol", "", "getCurrencySymbol", "()Ljava/lang/String;", "isCurrencyPairLoading", "", "()Z", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "actionLabel", "getActionLabel", "chartState", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState;", "getChartState", "()Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState;", "infoRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getInfoRows", "()Lkotlinx/collections/immutable/ImmutableList;", "footerState", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$FooterState;", "getFooterState", "()Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$FooterState;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoStakingSummaryDataState {
    public static final int $stable = 8;
    private final UiCurrencyPair currencyPair;
    private final UUID currencyPairId;
    private final CryptoStakingPosition position;
    private final CryptoStakingSummaryModel summaryModel;

    public static /* synthetic */ CryptoStakingSummaryDataState copy$default(CryptoStakingSummaryDataState cryptoStakingSummaryDataState, UUID uuid, UiCurrencyPair uiCurrencyPair, CryptoStakingSummaryModel cryptoStakingSummaryModel, CryptoStakingPosition cryptoStakingPosition, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoStakingSummaryDataState.currencyPairId;
        }
        if ((i & 2) != 0) {
            uiCurrencyPair = cryptoStakingSummaryDataState.currencyPair;
        }
        if ((i & 4) != 0) {
            cryptoStakingSummaryModel = cryptoStakingSummaryDataState.summaryModel;
        }
        if ((i & 8) != 0) {
            cryptoStakingPosition = cryptoStakingSummaryDataState.position;
        }
        return cryptoStakingSummaryDataState.copy(uuid, uiCurrencyPair, cryptoStakingSummaryModel, cryptoStakingPosition);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoStakingSummaryModel getSummaryModel() {
        return this.summaryModel;
    }

    /* renamed from: component4, reason: from getter */
    public final CryptoStakingPosition getPosition() {
        return this.position;
    }

    public final CryptoStakingSummaryDataState copy(UUID currencyPairId, UiCurrencyPair currencyPair, CryptoStakingSummaryModel summaryModel, CryptoStakingPosition position) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return new CryptoStakingSummaryDataState(currencyPairId, currencyPair, summaryModel, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoStakingSummaryDataState)) {
            return false;
        }
        CryptoStakingSummaryDataState cryptoStakingSummaryDataState = (CryptoStakingSummaryDataState) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoStakingSummaryDataState.currencyPairId) && Intrinsics.areEqual(this.currencyPair, cryptoStakingSummaryDataState.currencyPair) && Intrinsics.areEqual(this.summaryModel, cryptoStakingSummaryDataState.summaryModel) && Intrinsics.areEqual(this.position, cryptoStakingSummaryDataState.position);
    }

    public int hashCode() {
        int iHashCode = this.currencyPairId.hashCode() * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode2 = (iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        CryptoStakingSummaryModel cryptoStakingSummaryModel = this.summaryModel;
        int iHashCode3 = (iHashCode2 + (cryptoStakingSummaryModel == null ? 0 : cryptoStakingSummaryModel.hashCode())) * 31;
        CryptoStakingPosition cryptoStakingPosition = this.position;
        return iHashCode3 + (cryptoStakingPosition != null ? cryptoStakingPosition.hashCode() : 0);
    }

    public String toString() {
        return "CryptoStakingSummaryDataState(currencyPairId=" + this.currencyPairId + ", currencyPair=" + this.currencyPair + ", summaryModel=" + this.summaryModel + ", position=" + this.position + ")";
    }

    public CryptoStakingSummaryDataState(UUID currencyPairId, UiCurrencyPair uiCurrencyPair, CryptoStakingSummaryModel cryptoStakingSummaryModel, CryptoStakingPosition cryptoStakingPosition) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        this.currencyPairId = currencyPairId;
        this.currencyPair = uiCurrencyPair;
        this.summaryModel = cryptoStakingSummaryModel;
        this.position = cryptoStakingPosition;
    }

    public /* synthetic */ CryptoStakingSummaryDataState(UUID uuid, UiCurrencyPair uiCurrencyPair, CryptoStakingSummaryModel cryptoStakingSummaryModel, CryptoStakingPosition cryptoStakingPosition, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : uiCurrencyPair, (i & 4) != 0 ? null : cryptoStakingSummaryModel, (i & 8) != 0 ? null : cryptoStakingPosition);
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final CryptoStakingSummaryModel getSummaryModel() {
        return this.summaryModel;
    }

    public final CryptoStakingPosition getPosition() {
        return this.position;
    }

    private final String getCurrencySymbol() {
        Currency assetCurrency;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair == null || (assetCurrency = uiCurrencyPair.getAssetCurrency()) == null) {
            return null;
        }
        return CurrencyDefinition.getCurrencySymbol$default(assetCurrency, null, 1, null);
    }

    public final boolean isCurrencyPairLoading() {
        return this.currencyPair == null;
    }

    public final StringResource getTitle() {
        String currencySymbol = getCurrencySymbol();
        if (currencySymbol != null) {
            return StringResource.INSTANCE.invoke(C37760R.string.staking_summary_title, currencySymbol);
        }
        return null;
    }

    public final StringResource getActionLabel() {
        String currencySymbol = getCurrencySymbol();
        if (currencySymbol != null) {
            return StringResource.INSTANCE.invoke(C37760R.string.staking_summary_action, currencySymbol);
        }
        return null;
    }

    public final CryptoStakingSummaryViewState.ChartState getChartState() {
        CryptoStakingPosition cryptoStakingPosition = this.position;
        CryptoStakingPosition.Staking staking = cryptoStakingPosition != null ? cryptoStakingPosition.getStaking() : null;
        if (this.currencyPair == null || staking == null) {
            return null;
        }
        return new CryptoStakingSummaryViewState.ChartState(staking.getDepositedPercentage() / 100.0f, new CryptoStakingSummaryViewState.ChartState.Entry(CurrencyDefinitions.formatCurrency$default(this.currencyPair.getAssetCurrencyForDisplay(), staking.getAvailableForDeposit(), false, false, null, 0, null, null, false, false, false, false, 2046, null), CurrencyDefinitions.formatCurrency$default(this.currencyPair.getQuoteCurrency(), staking.getFiatAvailableForDeposit(), false, false, null, 0, null, null, false, false, false, true, 1022, null)), new CryptoStakingSummaryViewState.ChartState.Entry(CurrencyDefinitions.formatCurrency$default(this.currencyPair.getAssetCurrencyForDisplay(), staking.getDeposited(), false, false, null, 0, null, null, false, false, false, false, 2046, null), CurrencyDefinitions.formatCurrency$default(this.currencyPair.getQuoteCurrency(), staking.getFiatDeposited(), false, false, null, 0, null, null, false, false, false, true, 1022, null)));
    }

    public final ImmutableList<UIComponent<GenericAction>> getInfoRows() {
        List<UIComponent<GenericAction>> infoRows;
        CryptoStakingSummaryModel cryptoStakingSummaryModel = this.summaryModel;
        if (cryptoStakingSummaryModel == null || (infoRows = cryptoStakingSummaryModel.getInfoRows()) == null) {
            return null;
        }
        return extensions2.toImmutableList(infoRows);
    }

    public final CryptoStakingSummaryViewState.FooterState getFooterState() {
        CryptoStakingSummaryModel cryptoStakingSummaryModel = this.summaryModel;
        if (cryptoStakingSummaryModel == null) {
            return null;
        }
        String disclosure = cryptoStakingSummaryModel.getDisclosure();
        boolean depositsEnabled = cryptoStakingSummaryModel.getDepositsEnabled();
        boolean withdrawalsEnabled = cryptoStakingSummaryModel.getWithdrawalsEnabled();
        Boolean depositsVisible = cryptoStakingSummaryModel.getDepositsVisible();
        boolean zBooleanValue = depositsVisible != null ? depositsVisible.booleanValue() : true;
        Boolean withdrawalsVisible = cryptoStakingSummaryModel.getWithdrawalsVisible();
        return new CryptoStakingSummaryViewState.FooterState(disclosure, zBooleanValue, depositsEnabled, withdrawalsEnabled, withdrawalsVisible != null ? withdrawalsVisible.booleanValue() : true);
    }

    public final CryptoStakingContext getLoggingContext() {
        CryptoStakingPosition cryptoStakingPosition;
        if (this.currencyPair == null || (cryptoStakingPosition = this.position) == null) {
            return null;
        }
        CryptoStakingPosition.Staking staking = cryptoStakingPosition.getStaking();
        return new CryptoStakingContext(CurrencyDefinition.getCurrencySymbol$default(this.currencyPair.getAssetCurrency(), null, 1, null), staking.getEstimatedRateApy(), staking.getAvailableForDeposit().doubleValue(), staking.getAvailableForWithdrawal().doubleValue(), staking.getDeposited().doubleValue(), staking.getPendingRewards().doubleValue(), staking.getLifetimeRewarded().doubleValue(), null, null, 384, null);
    }
}
