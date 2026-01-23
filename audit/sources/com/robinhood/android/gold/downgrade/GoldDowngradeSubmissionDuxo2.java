package com.robinhood.android.gold.downgrade;

import com.robinhood.android.gold.subscription.api.GoldUnsubscribeResponse;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* compiled from: GoldDowngradeSubmissionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/subscription/api/GoldUnsubscribeResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.downgrade.GoldDowngradeSubmissionDuxo$onCreate$1$goldUnsubscribeResponse$1", m3645f = "GoldDowngradeSubmissionDuxo.kt", m3646l = {46}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.downgrade.GoldDowngradeSubmissionDuxo$onCreate$1$goldUnsubscribeResponse$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldDowngradeSubmissionDuxo2 extends ContinuationImpl7 implements Function1<Continuation<? super GoldUnsubscribeResponse>, Object> {
    final /* synthetic */ UUID $subscriptionId;
    int label;
    final /* synthetic */ GoldDowngradeSubmissionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldDowngradeSubmissionDuxo2(GoldDowngradeSubmissionDuxo goldDowngradeSubmissionDuxo, UUID uuid, Continuation<? super GoldDowngradeSubmissionDuxo2> continuation) {
        super(1, continuation);
        this.this$0 = goldDowngradeSubmissionDuxo;
        this.$subscriptionId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new GoldDowngradeSubmissionDuxo2(this.this$0, this.$subscriptionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super GoldUnsubscribeResponse> continuation) {
        return ((GoldDowngradeSubmissionDuxo2) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        GoldSubscriptionStore goldSubscriptionStore = this.this$0.goldSubscriptionStore;
        UUID uuid = this.$subscriptionId;
        this.label = 1;
        Object objUnsubscribe = goldSubscriptionStore.unsubscribe(uuid, this);
        return objUnsubscribe == coroutine_suspended ? coroutine_suspended : objUnsubscribe;
    }
}
