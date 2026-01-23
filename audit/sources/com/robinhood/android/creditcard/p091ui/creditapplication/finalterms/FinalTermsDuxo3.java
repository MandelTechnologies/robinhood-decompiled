package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FinalTermsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onContinue$1$1$agreement$1", m3645f = "FinalTermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onContinue$1$1$agreement$1, reason: use source file name */
/* loaded from: classes2.dex */
final class FinalTermsDuxo3 extends ContinuationImpl7 implements Function2<FinalTermsViewState, Continuation<? super FinalTermsViewState>, Object> {
    final /* synthetic */ UiAgreementWithContent $agreement;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinalTermsDuxo3(UiAgreementWithContent uiAgreementWithContent, Continuation<? super FinalTermsDuxo3> continuation) {
        super(2, continuation);
        this.$agreement = uiAgreementWithContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FinalTermsDuxo3 finalTermsDuxo3 = new FinalTermsDuxo3(this.$agreement, continuation);
        finalTermsDuxo3.L$0 = obj;
        return finalTermsDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FinalTermsViewState finalTermsViewState, Continuation<? super FinalTermsViewState> continuation) {
        return ((FinalTermsDuxo3) create(finalTermsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return FinalTermsViewState.copy$default((FinalTermsViewState) this.L$0, false, false, null, this.$agreement, null, null, false, null, false, 503, null);
    }
}
