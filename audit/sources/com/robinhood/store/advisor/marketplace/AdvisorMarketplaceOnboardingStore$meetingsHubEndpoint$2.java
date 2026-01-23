package com.robinhood.store.advisor.marketplace;

import com.robinhood.models.advisor.marketplace.p303db.onboarding.MeetingsHubResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: AdvisorMarketplaceOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/MeetingsHubResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisor.marketplace.AdvisorMarketplaceOnboardingStore$meetingsHubEndpoint$2", m3645f = "AdvisorMarketplaceOnboardingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class AdvisorMarketplaceOnboardingStore$meetingsHubEndpoint$2 extends ContinuationImpl7 implements Function2<MeetingsHubResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisorMarketplaceOnboardingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisorMarketplaceOnboardingStore$meetingsHubEndpoint$2(AdvisorMarketplaceOnboardingStore advisorMarketplaceOnboardingStore, Continuation<? super AdvisorMarketplaceOnboardingStore$meetingsHubEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = advisorMarketplaceOnboardingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisorMarketplaceOnboardingStore$meetingsHubEndpoint$2 advisorMarketplaceOnboardingStore$meetingsHubEndpoint$2 = new AdvisorMarketplaceOnboardingStore$meetingsHubEndpoint$2(this.this$0, continuation);
        advisorMarketplaceOnboardingStore$meetingsHubEndpoint$2.L$0 = obj;
        return advisorMarketplaceOnboardingStore$meetingsHubEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MeetingsHubResponse meetingsHubResponse, Continuation<? super Unit> continuation) {
        return ((AdvisorMarketplaceOnboardingStore$meetingsHubEndpoint$2) create(meetingsHubResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MeetingsHubResponse meetingsHubResponse = (MeetingsHubResponse) this.L$0;
            StateFlow2 stateFlow2 = this.this$0.activeMeetingsHubResponse;
            do {
                value = stateFlow2.getValue();
            } while (!stateFlow2.compareAndSet(value, meetingsHubResponse));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
