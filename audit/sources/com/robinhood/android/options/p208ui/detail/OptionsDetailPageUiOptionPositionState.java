package com.robinhood.android.options.p208ui.detail;

import com.robinhood.models.api.ApiOptionPositionReturnRequest;
import com.robinhood.models.api.ApiOptionPositionReturnRequestLegacy;
import com.robinhood.models.api.ApiOptionStrategyBreakevenRequest;
import com.robinhood.models.api.ApiOptionStrategyBreakevenRequestLegacy;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.GenericOptionsPositionPricing;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageUiOptionPositionState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageUiOptionPositionState;", "", "position", "Lcom/robinhood/models/ui/GenericOptionsPositionPricing;", "strategyCode", "", "optionQuote", "Lcom/robinhood/models/db/OptionQuote;", "<init>", "(Lcom/robinhood/models/ui/GenericOptionsPositionPricing;Ljava/lang/String;Lcom/robinhood/models/db/OptionQuote;)V", "getPosition", "()Lcom/robinhood/models/ui/GenericOptionsPositionPricing;", "getStrategyCode", "()Ljava/lang/String;", "getOptionQuote", "()Lcom/robinhood/models/db/OptionQuote;", "breakevenRequestLegacy", "Lcom/robinhood/models/api/ApiOptionStrategyBreakevenRequestLegacy;", "getBreakevenRequestLegacy", "()Lcom/robinhood/models/api/ApiOptionStrategyBreakevenRequestLegacy;", "breakevenRequest", "Lcom/robinhood/models/api/ApiOptionStrategyBreakevenRequest;", "getBreakevenRequest", "()Lcom/robinhood/models/api/ApiOptionStrategyBreakevenRequest;", "todayTotalReturnRequestLegacy", "Lcom/robinhood/models/api/ApiOptionPositionReturnRequestLegacy;", "getTodayTotalReturnRequestLegacy", "()Lcom/robinhood/models/api/ApiOptionPositionReturnRequestLegacy;", "todayTotalReturnRequest", "Lcom/robinhood/models/api/ApiOptionPositionReturnRequest;", "getTodayTotalReturnRequest", "()Lcom/robinhood/models/api/ApiOptionPositionReturnRequest;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsDetailPageUiOptionPositionState {
    public static final int $stable = 8;
    private final OptionQuote optionQuote;
    private final GenericOptionsPositionPricing position;
    private final String strategyCode;

    public static /* synthetic */ OptionsDetailPageUiOptionPositionState copy$default(OptionsDetailPageUiOptionPositionState optionsDetailPageUiOptionPositionState, GenericOptionsPositionPricing genericOptionsPositionPricing, String str, OptionQuote optionQuote, int i, Object obj) {
        if ((i & 1) != 0) {
            genericOptionsPositionPricing = optionsDetailPageUiOptionPositionState.position;
        }
        if ((i & 2) != 0) {
            str = optionsDetailPageUiOptionPositionState.strategyCode;
        }
        if ((i & 4) != 0) {
            optionQuote = optionsDetailPageUiOptionPositionState.optionQuote;
        }
        return optionsDetailPageUiOptionPositionState.copy(genericOptionsPositionPricing, str, optionQuote);
    }

    /* renamed from: component1, reason: from getter */
    public final GenericOptionsPositionPricing getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionQuote getOptionQuote() {
        return this.optionQuote;
    }

    public final OptionsDetailPageUiOptionPositionState copy(GenericOptionsPositionPricing position, String strategyCode, OptionQuote optionQuote) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        return new OptionsDetailPageUiOptionPositionState(position, strategyCode, optionQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsDetailPageUiOptionPositionState)) {
            return false;
        }
        OptionsDetailPageUiOptionPositionState optionsDetailPageUiOptionPositionState = (OptionsDetailPageUiOptionPositionState) other;
        return Intrinsics.areEqual(this.position, optionsDetailPageUiOptionPositionState.position) && Intrinsics.areEqual(this.strategyCode, optionsDetailPageUiOptionPositionState.strategyCode) && Intrinsics.areEqual(this.optionQuote, optionsDetailPageUiOptionPositionState.optionQuote);
    }

    public int hashCode() {
        int iHashCode = ((this.position.hashCode() * 31) + this.strategyCode.hashCode()) * 31;
        OptionQuote optionQuote = this.optionQuote;
        return iHashCode + (optionQuote == null ? 0 : optionQuote.hashCode());
    }

    public String toString() {
        return "OptionsDetailPageUiOptionPositionState(position=" + this.position + ", strategyCode=" + this.strategyCode + ", optionQuote=" + this.optionQuote + ")";
    }

    public OptionsDetailPageUiOptionPositionState(GenericOptionsPositionPricing position, String strategyCode, OptionQuote optionQuote) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        this.position = position;
        this.strategyCode = strategyCode;
        this.optionQuote = optionQuote;
    }

    public final GenericOptionsPositionPricing getPosition() {
        return this.position;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final OptionQuote getOptionQuote() {
        return this.optionQuote;
    }

    public final ApiOptionStrategyBreakevenRequestLegacy getBreakevenRequestLegacy() {
        return new ApiOptionStrategyBreakevenRequestLegacy(this.strategyCode, new Money(Currencies.USD, this.position.getAverageStrategyPrice()));
    }

    public final ApiOptionStrategyBreakevenRequest getBreakevenRequest() {
        BigDecimal clearingRunningQuantity;
        BigDecimal bigDecimalAbs;
        OrderDirection clearingDirection;
        String str = this.strategyCode;
        BigDecimal clearingCostBasis = this.position.getClearingCostBasis();
        if (clearingCostBasis == null || (clearingRunningQuantity = this.position.getClearingRunningQuantity()) == null || (bigDecimalAbs = clearingRunningQuantity.abs()) == null || (clearingDirection = this.position.getClearingDirection()) == null) {
            return null;
        }
        return new ApiOptionStrategyBreakevenRequest(str, clearingCostBasis, bigDecimalAbs, clearingDirection);
    }

    public final ApiOptionPositionReturnRequestLegacy getTodayTotalReturnRequestLegacy() {
        OptionQuote optionQuote = this.optionQuote;
        if (optionQuote != null) {
            return ApiOptionPositionReturnRequestLegacy.INSTANCE.from(optionQuote, this.position);
        }
        return null;
    }

    public final ApiOptionPositionReturnRequest getTodayTotalReturnRequest() {
        OptionQuote optionQuote = this.optionQuote;
        if (optionQuote != null) {
            return ApiOptionPositionReturnRequest.INSTANCE.from(optionQuote, this.position);
        }
        return null;
    }
}
