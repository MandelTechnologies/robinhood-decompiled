package com.robinhood.store.advisory;

import advisory.proto.p008v1.MarkAdvisoryInsightAsSeenRequestDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: AdvisoryInsightsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Ladvisory/proto/v1/MarkAdvisoryInsightAsSeenRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryInsightsStore$markAsSeenEndpoint$2", m3645f = "AdvisoryInsightsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AdvisoryInsightsStore$markAsSeenEndpoint$2 extends ContinuationImpl7 implements Function3<MarkAdvisoryInsightAsSeenRequestDto, Unit, Continuation<? super Unit>, Object> {
    int label;

    AdvisoryInsightsStore$markAsSeenEndpoint$2(Continuation<? super AdvisoryInsightsStore$markAsSeenEndpoint$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(MarkAdvisoryInsightAsSeenRequestDto markAdvisoryInsightAsSeenRequestDto, Unit unit, Continuation<? super Unit> continuation) {
        return new AdvisoryInsightsStore$markAsSeenEndpoint$2(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
