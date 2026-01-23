package com.robinhood.compose.bento.component;

import com.robinhood.compose.bento.util.ToggleableInteractionSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BentoButton.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.compose.bento.component.BentoButtonKt$BentoButton$7$1", m3645f = "BentoButton.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BentoButtonKt$BentoButton$7$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ToggleableInteractionSource $interactionSource;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ boolean $showRippleEffectOnClick;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BentoButtonKt$BentoButton$7$1(ToggleableInteractionSource toggleableInteractionSource, boolean z, boolean z2, Continuation<? super BentoButtonKt$BentoButton$7$1> continuation) {
        super(2, continuation);
        this.$interactionSource = toggleableInteractionSource;
        this.$showRippleEffectOnClick = z;
        this.$loading = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BentoButtonKt$BentoButton$7$1(this.$interactionSource, this.$showRippleEffectOnClick, this.$loading, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BentoButtonKt$BentoButton$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$interactionSource.setShowRippleEffectOnClick(this.$showRippleEffectOnClick);
        this.$interactionSource.setLoading(this.$loading);
        return Unit.INSTANCE;
    }
}
