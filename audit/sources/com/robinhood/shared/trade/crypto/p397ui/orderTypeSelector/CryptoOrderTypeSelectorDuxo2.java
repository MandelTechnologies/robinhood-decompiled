package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.shared.crypto.p375ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment;
import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorEvent;
import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorFragment;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoOrderTypeSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$handleRecurringInvestmentTapped$1$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$handleRecurringInvestmentTapped$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderTypeSelectorDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoOrderTypeSelectorDataState $dataState;
    final /* synthetic */ InstrumentRecurringTradability $tradability;
    int label;
    final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderTypeSelectorDuxo2(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, InstrumentRecurringTradability instrumentRecurringTradability, CryptoOrderTypeSelectorDataState cryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoOrderTypeSelectorDuxo;
        this.$tradability = instrumentRecurringTradability;
        this.$dataState = cryptoOrderTypeSelectorDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoOrderTypeSelectorDuxo2(this.this$0, this.$tradability, this.$dataState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoOrderTypeSelectorDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        InstrumentRecurringTradability instrumentRecurringTradability;
        Currency assetCurrency;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider = this.this$0.cryptoOrderMonetizationModelProvider;
            UUID currencyPairId = ((CryptoOrderTypeSelectorFragment.Args) CryptoOrderTypeSelectorDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getCurrencyPairId();
            this.label = 1;
            obj = cryptoOrderMonetizationModelProvider.get(currencyPairId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CryptoOrderMonetizationModel cryptoOrderMonetizationModel = (CryptoOrderMonetizationModel) obj;
        InstrumentRecurringTradability instrumentRecurringTradability2 = this.$tradability;
        String code = null;
        InstrumentRecurringTradability.RecurringTradableReason reason = instrumentRecurringTradability2 != null ? instrumentRecurringTradability2.getReason() : null;
        boolean z = cryptoOrderMonetizationModel instanceof CryptoOrderMonetizationModel.Fee;
        if (z && !this.$dataState.m2874x225649c1()) {
            CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo = this.this$0;
            UiCurrencyPair currencyPair = this.$dataState.getCurrencyPair();
            if (currencyPair != null && (assetCurrency = currencyPair.getAssetCurrency()) != null) {
                code = assetCurrency.getCode();
            }
            if (code == null) {
                code = "";
            }
            cryptoOrderTypeSelectorDuxo.submit(new CryptoOrderTypeSelectorEvent.ShowCryptoFeeUnsupportedRecurringAlert(code, CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction.CONTINUE_WITH_RECURRING));
        } else if (z || (instrumentRecurringTradability = this.$tradability) == null || instrumentRecurringTradability.isRecurringTradable()) {
            this.this$0.submit(CryptoOrderTypeSelectorEvent.EnterRecurringOrderFlow.INSTANCE);
        } else if (reason != null) {
            this.this$0.submit(new CryptoOrderTypeSelectorEvent.ShowRecurringIneligibleAlert(reason));
        }
        return Unit.INSTANCE;
    }
}
