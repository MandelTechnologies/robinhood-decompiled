package com.robinhood.shared.rewards.store;

import com.robinhood.shared.rewards.models.api.ApiRewardsSummary;
import com.robinhood.shared.rewards.models.p394db.RewardsSummary2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: RewardsSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/shared/rewards/models/api/ApiRewardsSummary;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.rewards.store.RewardsSummaryStore$endpoint$2", m3645f = "RewardsSummaryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.rewards.store.RewardsSummaryStore$endpoint$2, reason: use source file name */
/* loaded from: classes6.dex */
final class RewardsSummaryStore3 extends ContinuationImpl7 implements Function2<ApiRewardsSummary, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RewardsSummaryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsSummaryStore3(RewardsSummaryStore rewardsSummaryStore, Continuation<? super RewardsSummaryStore3> continuation) {
        super(2, continuation);
        this.this$0 = rewardsSummaryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RewardsSummaryStore3 rewardsSummaryStore3 = new RewardsSummaryStore3(this.this$0, continuation);
        rewardsSummaryStore3.L$0 = obj;
        return rewardsSummaryStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiRewardsSummary apiRewardsSummary, Continuation<? super Unit> continuation) {
        return ((RewardsSummaryStore3) create(apiRewardsSummary, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.rewardsSummaryDao.insert(RewardsSummary2.toDbModel((ApiRewardsSummary) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
