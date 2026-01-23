package com.robinhood.android.employment.p114ui;

import com.robinhood.models.p355ui.bonfire.UiEmployerType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ChooseEmploymentLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/employment/ui/ChooseEmploymentLoadingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.employment.ui.ChooseEmploymentLoadingDuxo$loadEmployerTypes$2$1", m3645f = "ChooseEmploymentLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentLoadingDuxo$loadEmployerTypes$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ChooseEmploymentLoadingDuxo3 extends ContinuationImpl7 implements Function2<ChooseEmploymentLoadingViewState, Continuation<? super ChooseEmploymentLoadingViewState>, Object> {
    final /* synthetic */ UiEmployerType $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChooseEmploymentLoadingDuxo3(UiEmployerType uiEmployerType, Continuation<? super ChooseEmploymentLoadingDuxo3> continuation) {
        super(2, continuation);
        this.$it = uiEmployerType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChooseEmploymentLoadingDuxo3 chooseEmploymentLoadingDuxo3 = new ChooseEmploymentLoadingDuxo3(this.$it, continuation);
        chooseEmploymentLoadingDuxo3.L$0 = obj;
        return chooseEmploymentLoadingDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChooseEmploymentLoadingViewState chooseEmploymentLoadingViewState, Continuation<? super ChooseEmploymentLoadingViewState> continuation) {
        return ((ChooseEmploymentLoadingDuxo3) create(chooseEmploymentLoadingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((ChooseEmploymentLoadingViewState) this.L$0).copy(this.$it);
    }
}
