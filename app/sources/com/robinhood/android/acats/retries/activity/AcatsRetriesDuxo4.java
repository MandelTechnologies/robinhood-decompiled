package com.robinhood.android.acats.retries.activity;

import com.robinhood.models.p320db.Instrument;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsRetriesDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getOptions$5$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getOptions$5$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsRetriesDuxo4 extends ContinuationImpl7 implements Function2<AcatsRetriesDataState, Continuation<? super AcatsRetriesDataState>, Object> {
    final /* synthetic */ Instrument $instrument;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsRetriesDuxo4(Instrument instrument, Continuation<? super AcatsRetriesDuxo4> continuation) {
        super(2, continuation);
        this.$instrument = instrument;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsRetriesDuxo4 acatsRetriesDuxo4 = new AcatsRetriesDuxo4(this.$instrument, continuation);
        acatsRetriesDuxo4.L$0 = obj;
        return acatsRetriesDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsRetriesDataState acatsRetriesDataState, Continuation<? super AcatsRetriesDataState> continuation) {
        return ((AcatsRetriesDuxo4) create(acatsRetriesDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsRetriesDataState acatsRetriesDataState = (AcatsRetriesDataState) this.L$0;
        List mutableList = CollectionsKt.toMutableList((Collection) acatsRetriesDataState.getRetryOptionsInstruments());
        Instrument instrument = this.$instrument;
        Intrinsics.checkNotNull(instrument);
        mutableList.add(instrument);
        return AcatsRetriesDataState.copy$default(acatsRetriesDataState, null, null, null, null, null, false, null, null, CollectionsKt.distinct(mutableList), null, 767, null);
    }
}
