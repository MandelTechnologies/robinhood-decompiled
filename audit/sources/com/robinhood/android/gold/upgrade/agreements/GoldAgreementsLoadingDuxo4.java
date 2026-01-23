package com.robinhood.android.gold.upgrade.agreements;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldAgreementsLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingDuxo$onCreate$3$1", m3645f = "GoldAgreementsLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingDuxo$onCreate$3$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldAgreementsLoadingDuxo4 extends ContinuationImpl7 implements Function2<GoldAgreementsLoadingDataState, Continuation<? super GoldAgreementsLoadingDataState>, Object> {
    int label;

    GoldAgreementsLoadingDuxo4(Continuation<? super GoldAgreementsLoadingDuxo4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldAgreementsLoadingDuxo4(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GoldAgreementsLoadingDataState goldAgreementsLoadingDataState, Continuation<? super GoldAgreementsLoadingDataState> continuation) {
        return ((GoldAgreementsLoadingDuxo4) create(goldAgreementsLoadingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new GoldAgreementsLoadingDataState(false, null, null, null, null, false, null, null, false, null, false, 2038, null);
    }
}
