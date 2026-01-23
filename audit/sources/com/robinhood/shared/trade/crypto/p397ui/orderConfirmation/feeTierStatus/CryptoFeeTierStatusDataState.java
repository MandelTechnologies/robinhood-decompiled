package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus;

import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTier;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoPostTradeFeeTierStatusContext;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoFeeTiers;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusViewState;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeTierStatusDataState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b(J\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b*J-\u0010+\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\rHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0019\u0010\"\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDataState;", "", "feeTierInfoResult", "Lkotlin/Result;", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "canSkipNotificationPromptResult", "", "<init>", "(Lkotlin/Result;Lkotlin/Result;)V", "getFeeTierInfoResult-xLWZpok", "()Lkotlin/Result;", "getCanSkipNotificationPromptResult-xLWZpok", "currentTierFeeText", "", "getCurrentTierFeeText", "()Ljava/lang/String;", "nextTierFeeText", "getNextTierFeeText", "currentProgressText", "Lcom/robinhood/utils/resource/StringResource;", "getCurrentProgressText", "()Lcom/robinhood/utils/resource/StringResource;", "feeTierProgress", "", "getFeeTierProgress", "()Ljava/lang/Float;", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState$PrimaryButton;", "getPrimaryButton", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState$PrimaryButton;", "isContentLoading", "()Z", "showError", "getShowError", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component1-xLWZpok", "component2", "component2-xLWZpok", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoFeeTierStatusDataState {
    public static final int $stable = 8;
    private final Result<Boolean> canSkipNotificationPromptResult;
    private final Result<CryptoFeeTierInfo> feeTierInfoResult;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoFeeTierStatusDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoFeeTierStatusDataState copy$default(CryptoFeeTierStatusDataState cryptoFeeTierStatusDataState, Result result, Result result2, int i, Object obj) {
        if ((i & 1) != 0) {
            result = cryptoFeeTierStatusDataState.feeTierInfoResult;
        }
        if ((i & 2) != 0) {
            result2 = cryptoFeeTierStatusDataState.canSkipNotificationPromptResult;
        }
        return cryptoFeeTierStatusDataState.copy(result, result2);
    }

    /* renamed from: component1-xLWZpok, reason: not valid java name */
    public final Result<CryptoFeeTierInfo> m25883component1xLWZpok() {
        return this.feeTierInfoResult;
    }

    /* renamed from: component2-xLWZpok, reason: not valid java name */
    public final Result<Boolean> m25884component2xLWZpok() {
        return this.canSkipNotificationPromptResult;
    }

    public final CryptoFeeTierStatusDataState copy(Result<CryptoFeeTierInfo> feeTierInfoResult, Result<Boolean> canSkipNotificationPromptResult) {
        return new CryptoFeeTierStatusDataState(feeTierInfoResult, canSkipNotificationPromptResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoFeeTierStatusDataState)) {
            return false;
        }
        CryptoFeeTierStatusDataState cryptoFeeTierStatusDataState = (CryptoFeeTierStatusDataState) other;
        return Intrinsics.areEqual(this.feeTierInfoResult, cryptoFeeTierStatusDataState.feeTierInfoResult) && Intrinsics.areEqual(this.canSkipNotificationPromptResult, cryptoFeeTierStatusDataState.canSkipNotificationPromptResult);
    }

    public int hashCode() {
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        int iM28554hashCodeimpl = (result == null ? 0 : Result.m28554hashCodeimpl(result.getValue())) * 31;
        Result<Boolean> result2 = this.canSkipNotificationPromptResult;
        return iM28554hashCodeimpl + (result2 != null ? Result.m28554hashCodeimpl(result2.getValue()) : 0);
    }

    public String toString() {
        return "CryptoFeeTierStatusDataState(feeTierInfoResult=" + this.feeTierInfoResult + ", canSkipNotificationPromptResult=" + this.canSkipNotificationPromptResult + ")";
    }

    public CryptoFeeTierStatusDataState(Result<CryptoFeeTierInfo> result, Result<Boolean> result2) {
        this.feeTierInfoResult = result;
        this.canSkipNotificationPromptResult = result2;
    }

    public /* synthetic */ CryptoFeeTierStatusDataState(Result result, Result result2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : result, (i & 2) != 0 ? null : result2);
    }

    /* renamed from: getFeeTierInfoResult-xLWZpok, reason: not valid java name */
    public final Result<CryptoFeeTierInfo> m25886getFeeTierInfoResultxLWZpok() {
        return this.feeTierInfoResult;
    }

    /* renamed from: getCanSkipNotificationPromptResult-xLWZpok, reason: not valid java name */
    public final Result<Boolean> m25885getCanSkipNotificationPromptResultxLWZpok() {
        return this.canSkipNotificationPromptResult;
    }

    public final String getCurrentTierFeeText() {
        CryptoFeeTier currentFeeTier;
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) value;
            if (cryptoFeeTierInfo != null && (currentFeeTier = cryptoFeeTierInfo.getCurrentFeeTier()) != null) {
                return CryptoFeeTiers.getFeeRateText(currentFeeTier);
            }
        }
        return null;
    }

    public final String getNextTierFeeText() {
        CryptoFeeTier nextFeeTier;
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) value;
            if (cryptoFeeTierInfo != null && (nextFeeTier = cryptoFeeTierInfo.getNextFeeTier()) != null) {
                return CryptoFeeTiers.getFeeRateText(nextFeeTier);
            }
        }
        return null;
    }

    public final StringResource getCurrentProgressText() {
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) value;
            if (cryptoFeeTierInfo != null) {
                return StringResource.INSTANCE.invoke(C40095R.string.f6282x938d957, Money.format$default(cryptoFeeTierInfo.getCurrentPeriodTradingAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), Integer.valueOf(cryptoFeeTierInfo.getEvaluationPeriodDays()));
            }
        }
        return null;
    }

    public final Float getFeeTierProgress() {
        BigDecimal tradingVolumeTierProgress;
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) value;
            if (cryptoFeeTierInfo != null && (tradingVolumeTierProgress = cryptoFeeTierInfo.getTradingVolumeTierProgress()) != null) {
                return Float.valueOf(tradingVolumeTierProgress.floatValue());
            }
        }
        return null;
    }

    public final CryptoFeeTierStatusViewState.PrimaryButton getPrimaryButton() {
        Result<Boolean> result;
        if (isContentLoading() || (result = this.canSkipNotificationPromptResult) == null) {
            return null;
        }
        Object value = result.getValue();
        if (Result.m28553exceptionOrNullimpl(value) != null) {
            return CryptoFeeTierStatusViewState.PrimaryButton.DONE;
        }
        if (((Boolean) value).booleanValue()) {
            return CryptoFeeTierStatusViewState.PrimaryButton.DONE;
        }
        return CryptoFeeTierStatusViewState.PrimaryButton.CONTINUE;
    }

    public final boolean isContentLoading() {
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        if (result != null) {
            Object value = result.getValue();
            obj = (CryptoFeeTierInfo) (Result.m28555isFailureimpl(value) ? null : value);
        }
        return obj == null;
    }

    public final boolean getShowError() {
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        return result != null && Result.m28555isFailureimpl(result.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Context getEventContext() {
        BigDecimal bigDecimalCompat;
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) value;
            if (cryptoFeeTierInfo != null) {
                double dDoubleValue = cryptoFeeTierInfo.getCurrentFeeTier().getFeeRatio().doubleValue();
                Money requiredTradingAmountForNextTier = cryptoFeeTierInfo.getRequiredTradingAmountForNextTier();
                return new Context(0, 0, 0, null, null, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoPostTradeFeeTierStatusContext(dDoubleValue, (requiredTradingAmountForNextTier == null || (bigDecimalCompat = Money3.getBigDecimalCompat(requiredTradingAmountForNextTier)) == null) ? 0.0d : bigDecimalCompat.doubleValue(), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -134217729, 16383, null);
            }
        }
        return null;
    }
}
