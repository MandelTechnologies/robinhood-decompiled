package com.robinhood.android.gold.upgrade.unified.screen;

import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldUnifiedSingleAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onReviewed$1$1", m3645f = "GoldUnifiedSingleAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onReviewed$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldUnifiedSingleAgreementDuxo3 extends ContinuationImpl7 implements Function2<GoldUnifiedSingleAgreementViewState, Continuation<? super GoldUnifiedSingleAgreementViewState>, Object> {
    final /* synthetic */ GoldUnifiedSingleAgreementViewState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldUnifiedSingleAgreementDuxo3(GoldUnifiedSingleAgreementViewState goldUnifiedSingleAgreementViewState, Continuation<? super GoldUnifiedSingleAgreementDuxo3> continuation) {
        super(2, continuation);
        this.$state = goldUnifiedSingleAgreementViewState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldUnifiedSingleAgreementDuxo3(this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GoldUnifiedSingleAgreementViewState goldUnifiedSingleAgreementViewState, Continuation<? super GoldUnifiedSingleAgreementViewState> continuation) {
        return ((GoldUnifiedSingleAgreementDuxo3) create(goldUnifiedSingleAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return GoldUnifiedSingleAgreementViewState.Loaded.copy$default((GoldUnifiedSingleAgreementViewState.Loaded) this.$state, null, GoldUnifiedSingleAgreementViewState2.REVIEWED, 1, null);
    }
}
