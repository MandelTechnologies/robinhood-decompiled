package com.robinhood.android.recommendations.retirement.lib.p222ui;

import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecsRetirementUnavailableContent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt$UnavailableContent$1$1", m3645f = "RecsRetirementUnavailableContent.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt$UnavailableContent$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class RecsRetirementUnavailableContent7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnavailableContentState $state;
    final /* synthetic */ SystemUiController $uiController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecsRetirementUnavailableContent7(SystemUiController systemUiController, UnavailableContentState unavailableContentState, Continuation<? super RecsRetirementUnavailableContent7> continuation) {
        super(2, continuation);
        this.$uiController = systemUiController;
        this.$state = unavailableContentState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecsRetirementUnavailableContent7(this.$uiController, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecsRetirementUnavailableContent7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$uiController.setStatusBarDarkContentEnabled(true);
        SystemUiController.m9212setStatusBarColorek8zF_U$default(this.$uiController, this.$state.m17804getBackgroundColor0d7_KjU(), false, null, 6, null);
        return Unit.INSTANCE;
    }
}
