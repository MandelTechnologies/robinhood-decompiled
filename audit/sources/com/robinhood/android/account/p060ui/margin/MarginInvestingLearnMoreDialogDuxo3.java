package com.robinhood.android.account.p060ui.margin;

import android.text.Spanned;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginInvestingLearnMoreDialogDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialogDuxo$onCreate$2$1", m3645f = "MarginInvestingLearnMoreDialogDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialogDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class MarginInvestingLearnMoreDialogDuxo3 extends ContinuationImpl7 implements Function2<MarginInvestingLearnMoreDialogViewState, Continuation<? super MarginInvestingLearnMoreDialogViewState>, Object> {
    final /* synthetic */ Spanned $content;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginInvestingLearnMoreDialogDuxo3(Spanned spanned, Continuation<? super MarginInvestingLearnMoreDialogDuxo3> continuation) {
        super(2, continuation);
        this.$content = spanned;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginInvestingLearnMoreDialogDuxo3 marginInvestingLearnMoreDialogDuxo3 = new MarginInvestingLearnMoreDialogDuxo3(this.$content, continuation);
        marginInvestingLearnMoreDialogDuxo3.L$0 = obj;
        return marginInvestingLearnMoreDialogDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginInvestingLearnMoreDialogViewState marginInvestingLearnMoreDialogViewState, Continuation<? super MarginInvestingLearnMoreDialogViewState> continuation) {
        return ((MarginInvestingLearnMoreDialogDuxo3) create(marginInvestingLearnMoreDialogViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MarginInvestingLearnMoreDialogViewState.copy$default((MarginInvestingLearnMoreDialogViewState) this.L$0, this.$content, null, 2, null);
    }
}
