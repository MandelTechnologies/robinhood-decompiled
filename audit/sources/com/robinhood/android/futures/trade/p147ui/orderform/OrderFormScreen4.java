package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormViewState;
import com.robinhood.android.futures.trade.p147ui.orderform.OrderSubmissionState;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderFormScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.orderform.OrderFormScreenKt$OrderFormScreen$1$3, reason: use source file name */
/* loaded from: classes10.dex */
final class OrderFormScreen4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onDone;
    final /* synthetic */ Function1<UUID, Unit> $onViewOrder;
    final /* synthetic */ OrderForm6 $orderFormState;
    final /* synthetic */ FuturesOrderFormViewState $state;

    /* JADX WARN: Multi-variable type inference failed */
    OrderFormScreen4(FuturesOrderFormViewState futuresOrderFormViewState, OrderForm6 orderForm6, Function0<Unit> function0, Function1<? super UUID, Unit> function1) {
        this.$state = futuresOrderFormViewState;
        this.$orderFormState = orderForm6;
        this.$onDone = function0;
        this.$onViewOrder = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-37864341, i, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormScreen.<anonymous>.<anonymous> (OrderFormScreen.kt:131)");
        }
        Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE);
        FuturesOrderFormViewState.OrderReceiptContentData orderReceiptContentData = this.$state.getOrderReceiptContentData();
        OrderForm6 orderForm6 = this.$orderFormState;
        Function0<Unit> function0 = this.$onDone;
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$onViewOrder) | composer.changed(this.$onDone);
        final FuturesOrderFormViewState futuresOrderFormViewState = this.$state;
        final Function1<UUID, Unit> function1 = this.$onViewOrder;
        final Function0<Unit> function02 = this.$onDone;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormScreenKt$OrderFormScreen$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderFormScreen4.invoke$lambda$1$lambda$0(futuresOrderFormViewState, function1, function02);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        OrderReceipt.OrderReceipt(orderForm6, orderReceiptContentData, function0, (Function0) objRememberedValue, modifierSystemBarsPadding, composer, StringResource.$stable << 3, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(FuturesOrderFormViewState futuresOrderFormViewState, Function1 function1, Function0 function0) {
        if ((futuresOrderFormViewState.getOrderSubmissionState() instanceof OrderSubmissionState.Submitting) && (((OrderSubmissionState.Submitting) futuresOrderFormViewState.getOrderSubmissionState()).getResult() instanceof OrderSubmissionManager.Result.Submitted)) {
            function1.invoke(((UiFuturesOrder) ((OrderSubmissionManager.Result.Submitted) ((OrderSubmissionState.Submitting) futuresOrderFormViewState.getOrderSubmissionState()).getResult()).getData()).getOrder().getOrderId());
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
