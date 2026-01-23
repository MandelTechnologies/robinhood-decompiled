package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoQuoteOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$2$1$1", m3645f = "CryptoQuoteOrderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CryptoQuoteOrderFragment$bindViewState$2$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoQuoteOrderViewState $viewState;
    int label;
    final /* synthetic */ CryptoQuoteOrderFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoQuoteOrderFragment$bindViewState$2$1$1(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, CryptoQuoteOrderFragment cryptoQuoteOrderFragment, Continuation<? super CryptoQuoteOrderFragment$bindViewState$2$1$1> continuation) {
        super(2, continuation);
        this.$viewState = cryptoQuoteOrderViewState;
        this.this$0 = cryptoQuoteOrderFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoQuoteOrderFragment$bindViewState$2$1$1(this.$viewState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoQuoteOrderFragment$bindViewState$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CryptoOrderContext cryptoOrderContext;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$viewState.getCryptoOrderAnimatedBentoNumpadState().getBackspaceOverrideText() != null) {
            EventLogger eventLogger = this.this$0.getEventLogger();
            Screen eventScreen = this.this$0.getEventScreen();
            Component component = new Component(Component.ComponentType.BUTTON, AnalyticsStrings.MAX_WELCOME_TAG, null, 4, null);
            CryptoQuoteOrderViewState.OrderContextViewState orderContextViewState = this.$viewState.getOrderContextViewState();
            EventLogger.DefaultImpls.logAppear$default(eventLogger, null, eventScreen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (orderContextViewState == null || (cryptoOrderContext = orderContextViewState.getCryptoOrderContext()) == null) ? null : cryptoOrderContext.getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 9, null);
        }
        return Unit.INSTANCE;
    }
}
