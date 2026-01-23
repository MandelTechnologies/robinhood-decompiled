package com.robinhood.android.lib.sweep;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayFragment;
import com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayViewState;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldSweepAgreementDisplayDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayDuxo$onCreate$1$2$1", m3645f = "GoldSweepAgreementDisplayDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayDuxo$onCreate$1$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class GoldSweepAgreementDisplayDuxo2 extends ContinuationImpl7 implements Function2<GoldSweepAgreementDisplayViewState, Continuation<? super GoldSweepAgreementDisplayViewState>, Object> {
    final /* synthetic */ UiAgreementWithContent $agreement;
    int label;
    final /* synthetic */ GoldSweepAgreementDisplayDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldSweepAgreementDisplayDuxo2(GoldSweepAgreementDisplayDuxo goldSweepAgreementDisplayDuxo, UiAgreementWithContent uiAgreementWithContent, Continuation<? super GoldSweepAgreementDisplayDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = goldSweepAgreementDisplayDuxo;
        this.$agreement = uiAgreementWithContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldSweepAgreementDisplayDuxo2(this.this$0, this.$agreement, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GoldSweepAgreementDisplayViewState goldSweepAgreementDisplayViewState, Continuation<? super GoldSweepAgreementDisplayViewState> continuation) {
        return ((GoldSweepAgreementDisplayDuxo2) create(goldSweepAgreementDisplayViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new GoldSweepAgreementDisplayViewState.Loaded(((GoldSweepAgreementDisplayFragment.Args) GoldSweepAgreementDisplayDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAgreementTitle(), this.$agreement.getContent());
    }
}
