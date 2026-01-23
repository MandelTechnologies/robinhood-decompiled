package com.robinhood.android.acats.retries.activity;

import com.robinhood.models.p320db.Instrument;
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

/* compiled from: AcatsRetriesDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getInstruments$3$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getInstruments$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsRetriesDuxo2 extends ContinuationImpl7 implements Function2<AcatsRetriesDataState, Continuation<? super AcatsRetriesDataState>, Object> {
    final /* synthetic */ List<Instrument> $instruments;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsRetriesDuxo2(List<Instrument> list, Continuation<? super AcatsRetriesDuxo2> continuation) {
        super(2, continuation);
        this.$instruments = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsRetriesDuxo2 acatsRetriesDuxo2 = new AcatsRetriesDuxo2(this.$instruments, continuation);
        acatsRetriesDuxo2.L$0 = obj;
        return acatsRetriesDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsRetriesDataState acatsRetriesDataState, Continuation<? super AcatsRetriesDataState> continuation) {
        return ((AcatsRetriesDuxo2) create(acatsRetriesDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsRetriesDataState acatsRetriesDataState = (AcatsRetriesDataState) this.L$0;
        List<Instrument> list = this.$instruments;
        Intrinsics.checkNotNull(list);
        return AcatsRetriesDataState.copy$default(acatsRetriesDataState, null, null, null, null, null, false, list, null, null, null, 959, null);
    }
}
