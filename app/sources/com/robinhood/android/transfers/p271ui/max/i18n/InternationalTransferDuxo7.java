package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.models.p320db.Portfolio;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InternationalTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$4$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$4$1, reason: use source file name */
/* loaded from: classes9.dex */
final class InternationalTransferDuxo7 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
    final /* synthetic */ Portfolio $portfolio;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternationalTransferDuxo7(Portfolio portfolio, Continuation<? super InternationalTransferDuxo7> continuation) {
        super(2, continuation);
        this.$portfolio = portfolio;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternationalTransferDuxo7 internationalTransferDuxo7 = new InternationalTransferDuxo7(this.$portfolio, continuation);
        internationalTransferDuxo7.L$0 = obj;
        return internationalTransferDuxo7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
        return ((InternationalTransferDuxo7) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InternationalTransferDataState.copy$default((InternationalTransferDataState) this.L$0, null, null, null, null, null, false, null, false, null, false, null, false, null, null, null, null, null, null, null, this.$portfolio, null, null, null, 7864319, null);
    }
}
