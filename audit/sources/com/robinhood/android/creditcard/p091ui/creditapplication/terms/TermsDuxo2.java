package com.robinhood.android.creditcard.p091ui.creditapplication.terms;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TermsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$doneLoading$1", m3645f = "TermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$doneLoading$1, reason: use source file name */
/* loaded from: classes2.dex */
final class TermsDuxo2 extends ContinuationImpl7 implements Function2<TermsViewState, Continuation<? super TermsViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    TermsDuxo2(Continuation<? super TermsDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TermsDuxo2 termsDuxo2 = new TermsDuxo2(continuation);
        termsDuxo2.L$0 = obj;
        return termsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TermsViewState termsViewState, Continuation<? super TermsViewState> continuation) {
        return ((TermsDuxo2) create(termsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((TermsViewState) this.L$0).copy(false, false, null);
    }
}
