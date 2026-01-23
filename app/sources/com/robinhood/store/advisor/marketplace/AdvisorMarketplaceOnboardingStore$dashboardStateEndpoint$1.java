package com.robinhood.store.advisor.marketplace;

import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardStateDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorMarketplaceService;
import bonfire.proto.idl.advisor_marketplace.p029v1.GetAdvisorDashboardStateRequestDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.GetAdvisorDashboardStateResponseDto;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardState;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardState3;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisorMarketplaceOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisor.marketplace.AdvisorMarketplaceOnboardingStore$dashboardStateEndpoint$1", m3645f = "AdvisorMarketplaceOnboardingStore.kt", m3646l = {40}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AdvisorMarketplaceOnboardingStore$dashboardStateEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super AdvisorDashboardState>, Object> {
    int label;
    final /* synthetic */ AdvisorMarketplaceOnboardingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisorMarketplaceOnboardingStore$dashboardStateEndpoint$1(AdvisorMarketplaceOnboardingStore advisorMarketplaceOnboardingStore, Continuation<? super AdvisorMarketplaceOnboardingStore$dashboardStateEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = advisorMarketplaceOnboardingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvisorMarketplaceOnboardingStore$dashboardStateEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super AdvisorDashboardState> continuation) {
        return ((AdvisorMarketplaceOnboardingStore$dashboardStateEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisorMarketplaceService advisorMarketplaceService = this.this$0.advisorMarketplaceService;
                GetAdvisorDashboardStateRequestDto getAdvisorDashboardStateRequestDto = new GetAdvisorDashboardStateRequestDto();
                this.label = 1;
                obj = advisorMarketplaceService.GetAdvisorDashboardState(getAdvisorDashboardStateRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AdvisorDashboardStateDto state = ((GetAdvisorDashboardStateResponseDto) obj).getState();
            if (state != null) {
                return AdvisorDashboardState3.toUiModel(state);
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            return AdvisorDashboardState.Error.INSTANCE;
        }
    }
}
