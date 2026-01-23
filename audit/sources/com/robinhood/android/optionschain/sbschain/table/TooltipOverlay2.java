package com.robinhood.android.optionschain.sbschain.table;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TooltipOverlay.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$TooltipOverlay$2$1", m3645f = "TooltipOverlay.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$TooltipOverlay$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class TooltipOverlay2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<SpreadSelectionState, Unit> $logSpreadTooltipAppear;
    final /* synthetic */ Function0<Unit> $setSeenSpreadTooltip;
    final /* synthetic */ SpreadSelectionState $spreadSelectionState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TooltipOverlay2(Function0<Unit> function0, Function1<? super SpreadSelectionState, Unit> function1, SpreadSelectionState spreadSelectionState, Continuation<? super TooltipOverlay2> continuation) {
        super(2, continuation);
        this.$setSeenSpreadTooltip = function0;
        this.$logSpreadTooltipAppear = function1;
        this.$spreadSelectionState = spreadSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TooltipOverlay2(this.$setSeenSpreadTooltip, this.$logSpreadTooltipAppear, this.$spreadSelectionState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TooltipOverlay2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$setSeenSpreadTooltip.invoke();
        this.$logSpreadTooltipAppear.invoke(this.$spreadSelectionState);
        return Unit.INSTANCE;
    }
}
