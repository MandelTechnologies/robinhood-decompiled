package com.robinhood.tooltips;

import com.robinhood.tooltips.TooltipManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.tooltips.ModifiersKt$tooltip$1$3$1", m3645f = "Modifiers.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ModifiersKt$tooltip$1$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    final /* synthetic */ TooltipData $tooltipData;
    final /* synthetic */ TooltipManager $tooltipManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModifiersKt$tooltip$1$3$1(TooltipData tooltipData, TooltipManager tooltipManager, String str, Continuation<? super ModifiersKt$tooltip$1$3$1> continuation) {
        super(2, continuation);
        this.$tooltipData = tooltipData;
        this.$tooltipManager = tooltipManager;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModifiersKt$tooltip$1$3$1(this.$tooltipData, this.$tooltipManager, this.$id, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModifiersKt$tooltip$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TooltipData tooltipData = this.$tooltipData;
        if (tooltipData != null) {
            TooltipManager.DefaultImpls.addTooltip$default(this.$tooltipManager, false, tooltipData, 1, null);
        } else {
            this.$tooltipManager.removeTooltip(this.$id);
        }
        return Unit.INSTANCE;
    }
}
