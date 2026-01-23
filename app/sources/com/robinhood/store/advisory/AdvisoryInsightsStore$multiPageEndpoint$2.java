package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryInsightDto;
import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetAdvisoryMultiPageInsightRequestDto;
import advisory.proto.p008v1.GetAdvisoryMultiPageInsightResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightKt;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryInsightsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "req", "Ladvisory/proto/v1/GetAdvisoryMultiPageInsightRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryInsightsStore$multiPageEndpoint$2", m3645f = "AdvisoryInsightsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class AdvisoryInsightsStore$multiPageEndpoint$2 extends ContinuationImpl7 implements Function2<GetAdvisoryMultiPageInsightRequestDto, Continuation<? super List<? extends AdvisoryInsight>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryInsightsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryInsightsStore$multiPageEndpoint$2(AdvisoryInsightsStore advisoryInsightsStore, Continuation<? super AdvisoryInsightsStore$multiPageEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = advisoryInsightsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryInsightsStore$multiPageEndpoint$2 advisoryInsightsStore$multiPageEndpoint$2 = new AdvisoryInsightsStore$multiPageEndpoint$2(this.this$0, continuation);
        advisoryInsightsStore$multiPageEndpoint$2.L$0 = obj;
        return advisoryInsightsStore$multiPageEndpoint$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(GetAdvisoryMultiPageInsightRequestDto getAdvisoryMultiPageInsightRequestDto, Continuation<? super List<AdvisoryInsight>> continuation) {
        return ((AdvisoryInsightsStore$multiPageEndpoint$2) create(getAdvisoryMultiPageInsightRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(GetAdvisoryMultiPageInsightRequestDto getAdvisoryMultiPageInsightRequestDto, Continuation<? super List<? extends AdvisoryInsight>> continuation) {
        return invoke2(getAdvisoryMultiPageInsightRequestDto, (Continuation<? super List<AdvisoryInsight>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        GetAdvisoryMultiPageInsightRequestDto getAdvisoryMultiPageInsightRequestDto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetAdvisoryMultiPageInsightRequestDto getAdvisoryMultiPageInsightRequestDto2 = (GetAdvisoryMultiPageInsightRequestDto) this.L$0;
            AdvisoryService advisoryService = this.this$0.advisoryService;
            GetAdvisoryMultiPageInsightRequestDto getAdvisoryMultiPageInsightRequestDto3 = new GetAdvisoryMultiPageInsightRequestDto(getAdvisoryMultiPageInsightRequestDto2.getInsight_id(), getAdvisoryMultiPageInsightRequestDto2.getAccount_number());
            this.L$0 = getAdvisoryMultiPageInsightRequestDto2;
            this.label = 1;
            Object objGetAdvisoryMultiPageInsight = advisoryService.GetAdvisoryMultiPageInsight(getAdvisoryMultiPageInsightRequestDto3, this);
            if (objGetAdvisoryMultiPageInsight == coroutine_suspended) {
                return coroutine_suspended;
            }
            getAdvisoryMultiPageInsightRequestDto = getAdvisoryMultiPageInsightRequestDto2;
            obj = objGetAdvisoryMultiPageInsight;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getAdvisoryMultiPageInsightRequestDto = (GetAdvisoryMultiPageInsightRequestDto) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        List<AdvisoryInsightDto> child_insights = ((GetAdvisoryMultiPageInsightResponseDto) obj).getChild_insights();
        AdvisoryInsightsStore advisoryInsightsStore = this.this$0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(child_insights, 10));
        int i2 = 0;
        for (Object obj2 : child_insights) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(AdvisoryInsightKt.toDbModel((AdvisoryInsightDto) obj2, getAdvisoryMultiPageInsightRequestDto.getAccount_number(), advisoryInsightsStore.clock, getAdvisoryMultiPageInsightRequestDto.getInsight_id(), i2));
            i2 = i3;
        }
        return arrayList;
    }
}
