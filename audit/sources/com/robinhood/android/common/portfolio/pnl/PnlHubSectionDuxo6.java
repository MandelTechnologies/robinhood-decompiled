package com.robinhood.android.common.portfolio.pnl;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.portfolio.pnl.PnlHubSectionEvent;
import com.robinhood.utils.datetime.Instants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.Month;

/* compiled from: PnlHubSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$bind$3", m3645f = "PnlHubSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$bind$3, reason: use source file name */
/* loaded from: classes2.dex */
final class PnlHubSectionDuxo6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PnlHubSectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PnlHubSectionDuxo6(PnlHubSectionDuxo pnlHubSectionDuxo, Continuation<? super PnlHubSectionDuxo6> continuation) {
        super(2, continuation);
        this.this$0 = pnlHubSectionDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PnlHubSectionDuxo6(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PnlHubSectionDuxo6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Boolean> flowStreamCryptoPnlHubExperiment = this.this$0.cryptoExperimentsStore.streamCryptoPnlHubExperiment();
            this.label = 1;
            obj = FlowKt.firstOrNull(flowStreamCryptoPnlHubExperiment, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        boolean z = this.this$0.nowIncludesCryptoTooltipShownPref.get();
        Instant instant = this.this$0.clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        boolean zIsBefore = Instants.toLocalDate$default(instant, null, 1, null).isBefore(LocalDate.m3378of(2026, Month.JULY, 1));
        if (zBooleanValue && !z && zIsBefore) {
            this.this$0.submit(PnlHubSectionEvent.ShowNowIncludesCryptoTooltip.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
