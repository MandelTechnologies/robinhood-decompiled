package com.robinhood.android.acatsin;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onStart$7$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
final class AcatsInDuxo$onStart$7$1 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
    final /* synthetic */ List<String> $dtcsRequiringCoOwnerSignature;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInDuxo$onStart$7$1(List<String> list, Continuation<? super AcatsInDuxo$onStart$7$1> continuation) {
        super(2, continuation);
        this.$dtcsRequiringCoOwnerSignature = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInDuxo$onStart$7$1 acatsInDuxo$onStart$7$1 = new AcatsInDuxo$onStart$7$1(this.$dtcsRequiringCoOwnerSignature, continuation);
        acatsInDuxo$onStart$7$1.L$0 = obj;
        return acatsInDuxo$onStart$7$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
        return ((AcatsInDuxo$onStart$7$1) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsInDataState acatsInDataState = (AcatsInDataState) this.L$0;
        List<String> list = this.$dtcsRequiringCoOwnerSignature;
        Intrinsics.checkNotNull(list);
        return AcatsInDataState.copy$default(acatsInDataState, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, list, false, false, false, false, false, null, false, false, false, false, -33554433, 15, null);
    }
}
