package com.robinhood.android.pathfinder.corepages.supportlanding;

import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDataState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SupportLandingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$fetchAccounts$1", m3645f = "SupportLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$fetchAccounts$1, reason: use source file name */
/* loaded from: classes11.dex */
final class SupportLandingDuxo2 extends ContinuationImpl7 implements Function2<SupportLandingDataState, Continuation<? super SupportLandingDataState>, Object> {
    final /* synthetic */ String $accountType;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportLandingDuxo2(String str, Continuation<? super SupportLandingDuxo2> continuation) {
        super(2, continuation);
        this.$accountType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportLandingDuxo2 supportLandingDuxo2 = new SupportLandingDuxo2(this.$accountType, continuation);
        supportLandingDuxo2.L$0 = obj;
        return supportLandingDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SupportLandingDataState supportLandingDataState, Continuation<? super SupportLandingDataState> continuation) {
        return ((SupportLandingDuxo2) create(supportLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SupportLandingDataState supportLandingDataState = (SupportLandingDataState) this.L$0;
        return SupportLandingDataState.copy$default(supportLandingDataState, null, null, MapsKt.plus(supportLandingDataState.getAccountTypeToTabStatus(), Tuples4.m3642to(this.$accountType, SupportLandingDataState.TabContentStatus.Loading.INSTANCE)), null, false, 27, null);
    }
}
