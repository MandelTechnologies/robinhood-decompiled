package com.robinhood.store.advisor.marketplace;

import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorMarketplaceService;
import bonfire.proto.idl.advisor_marketplace.p029v1.GetAdvisorMatchesRequestDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.GetAdvisorMatchesResponseDto;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorMatchesResponse;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorMatchesResponse2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisorMarketplaceOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorMatchesResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisor.marketplace.AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$1", m3645f = "AdvisorMarketplaceOnboardingStore.kt", m3646l = {82}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super AdvisorMatchesResponse>, Object> {
    int label;
    final /* synthetic */ AdvisorMarketplaceOnboardingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$1(AdvisorMarketplaceOnboardingStore advisorMarketplaceOnboardingStore, Continuation<? super AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = advisorMarketplaceOnboardingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super AdvisorMatchesResponse> continuation) {
        return ((AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AdvisorMarketplaceService advisorMarketplaceService = this.this$0.advisorMarketplaceService;
            GetAdvisorMatchesRequestDto getAdvisorMatchesRequestDto = new GetAdvisorMatchesRequestDto();
            this.label = 1;
            obj = advisorMarketplaceService.GetAdvisorMatches(getAdvisorMatchesRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return AdvisorMatchesResponse2.toUiModel((GetAdvisorMatchesResponseDto) obj);
    }
}
