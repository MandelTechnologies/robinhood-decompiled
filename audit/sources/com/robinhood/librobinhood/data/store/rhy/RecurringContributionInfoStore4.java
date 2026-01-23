package com.robinhood.librobinhood.data.store.rhy;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.ApiRecurringIraContributionInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecurringContributionInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;", "achDepositScheduleId", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$contributionInfoEndpoint$1", m3645f = "RecurringContributionInfoStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$contributionInfoEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RecurringContributionInfoStore4 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiRecurringIraContributionInfo>, Object> {
    final /* synthetic */ TransfersBonfireApi $transfersBonfireApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecurringContributionInfoStore4(TransfersBonfireApi transfersBonfireApi, Continuation<? super RecurringContributionInfoStore4> continuation) {
        super(2, continuation);
        this.$transfersBonfireApi = transfersBonfireApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecurringContributionInfoStore4 recurringContributionInfoStore4 = new RecurringContributionInfoStore4(this.$transfersBonfireApi, continuation);
        recurringContributionInfoStore4.L$0 = obj;
        return recurringContributionInfoStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiRecurringIraContributionInfo> continuation) {
        return ((RecurringContributionInfoStore4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        String str = (String) this.L$0;
        TransfersBonfireApi transfersBonfireApi = this.$transfersBonfireApi;
        this.label = 1;
        Object recurringIraContributionInfo = transfersBonfireApi.getRecurringIraContributionInfo(str, this);
        return recurringIraContributionInfo == coroutine_suspended ? coroutine_suspended : recurringIraContributionInfo;
    }
}
