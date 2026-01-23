package com.robinhood.android.account.p060ui.margin;

import com.robinhood.android.account.overview.C8159R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginInvestingLearnMoreDialogDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialogDuxo$onCreate$3$1", m3645f = "MarginInvestingLearnMoreDialogDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialogDuxo$onCreate$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class MarginInvestingLearnMoreDialogDuxo4 extends ContinuationImpl7 implements Function2<MarginInvestingLearnMoreDialogViewState, Continuation<? super MarginInvestingLearnMoreDialogViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    MarginInvestingLearnMoreDialogDuxo4(Continuation<? super MarginInvestingLearnMoreDialogDuxo4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginInvestingLearnMoreDialogDuxo4 marginInvestingLearnMoreDialogDuxo4 = new MarginInvestingLearnMoreDialogDuxo4(continuation);
        marginInvestingLearnMoreDialogDuxo4.L$0 = obj;
        return marginInvestingLearnMoreDialogDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginInvestingLearnMoreDialogViewState marginInvestingLearnMoreDialogViewState, Continuation<? super MarginInvestingLearnMoreDialogViewState> continuation) {
        return ((MarginInvestingLearnMoreDialogDuxo4) create(marginInvestingLearnMoreDialogViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MarginInvestingLearnMoreDialogViewState.copy$default((MarginInvestingLearnMoreDialogViewState) this.L$0, null, boxing.boxInt(C8159R.string.account_overview_gold_section_learn_more_error), 1, null);
    }
}
