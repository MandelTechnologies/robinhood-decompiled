package com.robinhood.store.advisor.marketplace;

import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorMatchesResponse;
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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorMatchesResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisor.marketplace.AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$2", m3645f = "AdvisorMarketplaceOnboardingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$2 extends ContinuationImpl7 implements Function2<AdvisorMatchesResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisorMarketplaceOnboardingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$2(AdvisorMarketplaceOnboardingStore advisorMarketplaceOnboardingStore, Continuation<? super AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = advisorMarketplaceOnboardingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$2 advisorMarketplaceOnboardingStore$advisorMatchesEndpoint$2 = new AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$2(this.this$0, continuation);
        advisorMarketplaceOnboardingStore$advisorMatchesEndpoint$2.L$0 = obj;
        return advisorMarketplaceOnboardingStore$advisorMatchesEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdvisorMatchesResponse advisorMatchesResponse, Continuation<? super Unit> continuation) {
        return ((AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$2) create(advisorMatchesResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AdvisorMatchesResponse advisorMatchesResponse = (AdvisorMatchesResponse) this.L$0;
            StateFlow2 stateFlow2 = this.this$0.activeAdvisorMatchesResponse;
            do {
                value = stateFlow2.getValue();
            } while (!stateFlow2.compareAndSet(value, advisorMatchesResponse));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
