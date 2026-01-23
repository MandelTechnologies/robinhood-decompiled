package com.robinhood.librobinhood.data.store.rhy;

import com.robinhood.models.api.bonfire.ApiRecurringIraContributionInfo;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: RecurringContributionInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "achDepositScheduleId", "", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$contributionInfoEndpoint$2", m3645f = "RecurringContributionInfoStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$contributionInfoEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RecurringContributionInfoStore5 extends ContinuationImpl7 implements Function3<String, ApiRecurringIraContributionInfo, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ RecurringContributionInfoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecurringContributionInfoStore5(RecurringContributionInfoStore recurringContributionInfoStore, Continuation<? super RecurringContributionInfoStore5> continuation) {
        super(3, continuation);
        this.this$0 = recurringContributionInfoStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(String str, ApiRecurringIraContributionInfo apiRecurringIraContributionInfo, Continuation<? super Unit> continuation) {
        RecurringContributionInfoStore5 recurringContributionInfoStore5 = new RecurringContributionInfoStore5(this.this$0, continuation);
        recurringContributionInfoStore5.L$0 = str;
        recurringContributionInfoStore5.L$1 = apiRecurringIraContributionInfo;
        return recurringContributionInfoStore5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            ApiRecurringIraContributionInfo apiRecurringIraContributionInfo = (ApiRecurringIraContributionInfo) this.L$1;
            this.this$0.contributionInfoCache.put(str, apiRecurringIraContributionInfo);
            this.this$0.contributionInfoRelay.accept(Tuples4.m3642to(str, apiRecurringIraContributionInfo));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
