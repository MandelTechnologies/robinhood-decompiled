package com.robinhood.android.trade.options.textinput;

import androidx.compose.p011ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionOrderInputComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt$OptionOrderInputComposable$2$1", m3645f = "OptionOrderInputComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt$OptionOrderInputComposable$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class OptionOrderInputComposable5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ Function0<Unit> $onInputFocused;
    final /* synthetic */ boolean $shouldRequestFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOrderInputComposable5(boolean z, FocusRequester focusRequester, Function0<Unit> function0, Continuation<? super OptionOrderInputComposable5> continuation) {
        super(2, continuation);
        this.$shouldRequestFocus = z;
        this.$focusRequester = focusRequester;
        this.$onInputFocused = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionOrderInputComposable5(this.$shouldRequestFocus, this.$focusRequester, this.$onInputFocused, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionOrderInputComposable5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$shouldRequestFocus) {
            FocusRequester.m6497requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
            this.$onInputFocused.invoke();
        }
        return Unit.INSTANCE;
    }
}
