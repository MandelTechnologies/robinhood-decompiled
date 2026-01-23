package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.p375ui.trade.validator.ServerDrivenCryptoOrderValidator;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderEvent;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoQuoteOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onValidationSucceed$2$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {896}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onValidationSucceed$2$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoQuoteOrderDuxo5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoQuoteOrderViewState $dataState;
    final /* synthetic */ CryptoOrderContext $orderContext;
    int label;
    final /* synthetic */ CryptoQuoteOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoQuoteOrderDuxo5(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, CryptoOrderContext cryptoOrderContext, Continuation<? super CryptoQuoteOrderDuxo5> continuation) {
        super(2, continuation);
        this.$dataState = cryptoQuoteOrderViewState;
        this.this$0 = cryptoQuoteOrderDuxo;
        this.$orderContext = cryptoOrderContext;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoQuoteOrderDuxo5(this.$dataState, this.this$0, this.$orderContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoQuoteOrderDuxo5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CryptoQuoteOrderDuxo5 cryptoQuoteOrderDuxo5;
        Throwable th;
        final GenericAlertContent alert;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoOrderMonetizationModel cryptoOrderMonetizationModelM2888x5cfb4369 = this.$dataState.m2888x5cfb4369();
            if (cryptoOrderMonetizationModelM2888x5cfb4369 != null && cryptoOrderMonetizationModelM2888x5cfb4369.isMonetizationModelEligible() && this.this$0.appType == AppType.TRADER) {
                try {
                    ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator = this.this$0.serverDrivenCryptoOrderValidator;
                    UUID id = this.$orderContext.getRequestContext().getCurrencyPair().getId();
                    MonetizationModel monetizationModel = this.$orderContext.getRequestContext().getRequestInputs().getMonetizationModel();
                    OrderSide side = this.$orderContext.getRequestContext().getRequestInputs().getSide();
                    CryptoOrderType orderType = this.$orderContext.getRequestContext().getRequestInputs().getOrderPrices().getOrderType();
                    this.label = 1;
                    cryptoQuoteOrderDuxo5 = this;
                    try {
                        obj = ServerDrivenCryptoOrderValidator.validate$default(serverDrivenCryptoOrderValidator, id, monetizationModel, side, orderType, null, null, cryptoQuoteOrderDuxo5, 48, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!Throwables.isNetworkRelated(th)) {
                        }
                        if (alert != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cryptoQuoteOrderDuxo5 = this;
                    th = th;
                    if (!Throwables.isNetworkRelated(th)) {
                    }
                    if (alert != null) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                cryptoQuoteOrderDuxo5 = this;
                if (alert != null) {
                    cryptoQuoteOrderDuxo5.this$0.applyMutation(new C406241(null));
                    final CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo = cryptoQuoteOrderDuxo5.this$0;
                    cryptoQuoteOrderDuxo.withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onValidationSucceed$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CryptoQuoteOrderDuxo5.invokeSuspend$lambda$0(cryptoQuoteOrderDuxo, alert, (CryptoQuoteOrderViewState) obj2);
                        }
                    });
                } else {
                    cryptoQuoteOrderDuxo5.this$0.fetchTradeBonusEligibility(cryptoQuoteOrderDuxo5.$orderContext);
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.throwOnFailure(obj);
                cryptoQuoteOrderDuxo5 = this;
            } catch (Throwable th4) {
                th = th4;
                cryptoQuoteOrderDuxo5 = this;
                if (!Throwables.isNetworkRelated(th)) {
                    throw th;
                }
                if (alert != null) {
                }
                return Unit.INSTANCE;
            }
        }
        AlertAction alertAction = (AlertAction) obj;
        alert = alertAction != null ? alertAction.getAlert() : null;
        if (alert != null) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onValidationSucceed$2$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onValidationSucceed$2$1$1 */
    static final class C406241 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C406241(Continuation<? super C406241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406241 c406241 = new C406241(continuation);
            c406241.L$0 = obj;
            return c406241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406241) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388575, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, GenericAlertContent genericAlertContent, CryptoQuoteOrderViewState cryptoQuoteOrderViewState) {
        cryptoQuoteOrderDuxo.submit(new CryptoQuoteOrderEvent.ShowSduiValidationAlert(genericAlertContent));
        return Unit.INSTANCE;
    }
}
