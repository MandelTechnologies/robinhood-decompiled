package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.MarkAdvisoryInsightAsSeenBodyDto;
import advisory.proto.p008v1.MarkAdvisoryInsightAsSeenRequestDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryInsightsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "request", "Ladvisory/proto/v1/MarkAdvisoryInsightAsSeenRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryInsightsStore$markAsSeenEndpoint$1", m3645f = "AdvisoryInsightsStore.kt", m3646l = {128}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AdvisoryInsightsStore$markAsSeenEndpoint$1 extends ContinuationImpl7 implements Function2<MarkAdvisoryInsightAsSeenRequestDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryInsightsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryInsightsStore$markAsSeenEndpoint$1(AdvisoryInsightsStore advisoryInsightsStore, Continuation<? super AdvisoryInsightsStore$markAsSeenEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = advisoryInsightsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryInsightsStore$markAsSeenEndpoint$1 advisoryInsightsStore$markAsSeenEndpoint$1 = new AdvisoryInsightsStore$markAsSeenEndpoint$1(this.this$0, continuation);
        advisoryInsightsStore$markAsSeenEndpoint$1.L$0 = obj;
        return advisoryInsightsStore$markAsSeenEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarkAdvisoryInsightAsSeenRequestDto markAdvisoryInsightAsSeenRequestDto, Continuation<? super Unit> continuation) {
        return ((AdvisoryInsightsStore$markAsSeenEndpoint$1) create(markAdvisoryInsightAsSeenRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String account_number;
        String insight_id;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MarkAdvisoryInsightAsSeenRequestDto markAdvisoryInsightAsSeenRequestDto = (MarkAdvisoryInsightAsSeenRequestDto) this.L$0;
            AdvisoryService advisoryService = this.this$0.advisoryService;
            MarkAdvisoryInsightAsSeenBodyDto body = markAdvisoryInsightAsSeenRequestDto.getBody();
            String str = "";
            if (body == null || (account_number = body.getAccount_number()) == null) {
                account_number = "";
            }
            MarkAdvisoryInsightAsSeenBodyDto body2 = markAdvisoryInsightAsSeenRequestDto.getBody();
            if (body2 != null && (insight_id = body2.getInsight_id()) != null) {
                str = insight_id;
            }
            MarkAdvisoryInsightAsSeenRequestDto markAdvisoryInsightAsSeenRequestDto2 = new MarkAdvisoryInsightAsSeenRequestDto(new MarkAdvisoryInsightAsSeenBodyDto(str, account_number));
            this.label = 1;
            if (advisoryService.MarkAdvisoryInsightAsSeen(markAdvisoryInsightAsSeenRequestDto2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
