package com.robinhood.android.acatsin;

import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onStart$5$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
final class AcatsInDuxo$onStart$5$1 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
    final /* synthetic */ Optional<String> $variant;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInDuxo$onStart$5$1(Optional<String> optional, Continuation<? super AcatsInDuxo$onStart$5$1> continuation) {
        super(2, continuation);
        this.$variant = optional;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInDuxo$onStart$5$1 acatsInDuxo$onStart$5$1 = new AcatsInDuxo$onStart$5$1(this.$variant, continuation);
        acatsInDuxo$onStart$5$1.L$0 = obj;
        return acatsInDuxo$onStart$5$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
        return ((AcatsInDuxo$onStart$5$1) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, this.$variant.getOrNull(), false, false, false, false, Integer.MAX_VALUE, 15, null);
    }
}
