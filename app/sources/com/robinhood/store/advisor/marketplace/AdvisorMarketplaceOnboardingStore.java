package com.robinhood.store.advisor.marketplace;

import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorMarketplaceService;
import bonfire.proto.idl.advisor_marketplace.p029v1.GetScheduleMeetingFlowRequestDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.GetScheduleMeetingFlowResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardState;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorMatchesResponse;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.MeetingsHubResponse;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.ScheduleMeetingFlowResponse;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.ScheduleMeetingFlowResponse2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Clock;

/* compiled from: AdvisorMarketplaceOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0086@¢\u0006\u0002\u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00190\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/store/advisor/marketplace/AdvisorMarketplaceOnboardingStore;", "Lcom/robinhood/store/Store;", "advisorMarketplaceService", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceService;Lcom/robinhood/store/StoreBundle;)V", "activeDashboardState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState;", "dashboardStateEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "dashboardStateQuery", "Lcom/robinhood/android/moria/db/Query;", "streamDashboardState", "Lkotlinx/coroutines/flow/Flow;", "refreshDashboardState", "activeAdvisorMatchesResponse", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorMatchesResponse;", "advisorMatchesEndpoint", "advisorMatchesQuery", "streamAdvisorMatches", "activeMeetingsHubResponse", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/MeetingsHubResponse;", "meetingsHubEndpoint", "meetingsHubQuery", "streamMeetingsHub", "fetchScheduleMeetingFlow", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/ScheduleMeetingFlowResponse;", "advisorId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-advisor-marketplace_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AdvisorMarketplaceOnboardingStore extends Store {
    private final StateFlow2<AdvisorMatchesResponse> activeAdvisorMatchesResponse;
    private final StateFlow2<AdvisorDashboardState> activeDashboardState;
    private final StateFlow2<MeetingsHubResponse> activeMeetingsHubResponse;
    private final AdvisorMarketplaceService advisorMarketplaceService;
    private final Endpoint<Unit, AdvisorMatchesResponse> advisorMatchesEndpoint;
    private final Query<Unit, AdvisorMatchesResponse> advisorMatchesQuery;
    private final Endpoint<Unit, AdvisorDashboardState> dashboardStateEndpoint;
    private final Query<Unit, AdvisorDashboardState> dashboardStateQuery;
    private final Endpoint<Unit, MeetingsHubResponse> meetingsHubEndpoint;
    private final Query<Unit, MeetingsHubResponse> meetingsHubQuery;

    /* compiled from: AdvisorMarketplaceOnboardingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.advisor.marketplace.AdvisorMarketplaceOnboardingStore", m3645f = "AdvisorMarketplaceOnboardingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "fetchScheduleMeetingFlow")
    /* renamed from: com.robinhood.store.advisor.marketplace.AdvisorMarketplaceOnboardingStore$fetchScheduleMeetingFlow$1 */
    static final class C413031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C413031(Continuation<? super C413031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisorMarketplaceOnboardingStore.this.fetchScheduleMeetingFlow(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorMarketplaceOnboardingStore(AdvisorMarketplaceService advisorMarketplaceService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advisorMarketplaceService, "advisorMarketplaceService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisorMarketplaceService = advisorMarketplaceService;
        this.activeDashboardState = StateFlow4.MutableStateFlow(null);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Durations durations = Durations.INSTANCE;
        Endpoint<Unit, AdvisorDashboardState> endpointCreate = companion.create(new AdvisorMarketplaceOnboardingStore$dashboardStateEndpoint$1(this, null), logoutKillswitch, new AdvisorMarketplaceOnboardingStore$dashboardStateEndpoint$2(this, null), clock, new DefaultStaleDecider(durations.getONE_MINUTE(), storeBundle.getClock()));
        this.dashboardStateEndpoint = endpointCreate;
        Query.Companion companion2 = Query.INSTANCE;
        this.dashboardStateQuery = Store.create$default(this, companion2, "advisorMarketplaceDashboardStateQuery", CollectionsKt.listOf(new RefreshEach(new AdvisorMarketplaceOnboardingStore$dashboardStateQuery$1(endpointCreate))), new Function1() { // from class: com.robinhood.store.advisor.marketplace.AdvisorMarketplaceOnboardingStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisorMarketplaceOnboardingStore.dashboardStateQuery$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.activeAdvisorMatchesResponse = StateFlow4.MutableStateFlow(null);
        Endpoint<Unit, AdvisorMatchesResponse> endpointCreate2 = companion.create(new AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$1(this, null), getLogoutKillswitch(), new AdvisorMarketplaceOnboardingStore$advisorMatchesEndpoint$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getONE_MINUTE(), storeBundle.getClock()));
        this.advisorMatchesEndpoint = endpointCreate2;
        this.advisorMatchesQuery = Store.create$default(this, companion2, "advisorMatchesQuery", CollectionsKt.listOf(new RefreshEach(new AdvisorMarketplaceOnboardingStore$advisorMatchesQuery$1(endpointCreate2))), new Function1() { // from class: com.robinhood.store.advisor.marketplace.AdvisorMarketplaceOnboardingStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisorMarketplaceOnboardingStore.advisorMatchesQuery$lambda$2(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.activeMeetingsHubResponse = StateFlow4.MutableStateFlow(null);
        Endpoint<Unit, MeetingsHubResponse> endpointCreate3 = companion.create(new AdvisorMarketplaceOnboardingStore$meetingsHubEndpoint$1(this, null), getLogoutKillswitch(), new AdvisorMarketplaceOnboardingStore$meetingsHubEndpoint$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getONE_MINUTE(), storeBundle.getClock()));
        this.meetingsHubEndpoint = endpointCreate3;
        this.meetingsHubQuery = Store.create$default(this, companion2, "meetingsHubQuery", CollectionsKt.listOf(new RefreshEach(new AdvisorMarketplaceOnboardingStore$meetingsHubQuery$1(endpointCreate3))), new Function1() { // from class: com.robinhood.store.advisor.marketplace.AdvisorMarketplaceOnboardingStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisorMarketplaceOnboardingStore.meetingsHubQuery$lambda$4(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow dashboardStateQuery$lambda$0(AdvisorMarketplaceOnboardingStore advisorMarketplaceOnboardingStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return advisorMarketplaceOnboardingStore.activeDashboardState;
    }

    public final Flow<AdvisorDashboardState> streamDashboardState() {
        return this.dashboardStateQuery.asFlow(Unit.INSTANCE);
    }

    public final void refreshDashboardState() {
        Endpoint8.refresh$default(this.dashboardStateEndpoint, true, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow advisorMatchesQuery$lambda$2(AdvisorMarketplaceOnboardingStore advisorMarketplaceOnboardingStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return advisorMarketplaceOnboardingStore.activeAdvisorMatchesResponse;
    }

    public final Flow<AdvisorMatchesResponse> streamAdvisorMatches() {
        return this.advisorMatchesQuery.asFlow(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow meetingsHubQuery$lambda$4(AdvisorMarketplaceOnboardingStore advisorMarketplaceOnboardingStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return advisorMarketplaceOnboardingStore.activeMeetingsHubResponse;
    }

    public final Flow<MeetingsHubResponse> streamMeetingsHub() {
        return this.meetingsHubQuery.asFlow(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchScheduleMeetingFlow(String str, Continuation<? super ScheduleMeetingFlowResponse> continuation) {
        C413031 c413031;
        if (continuation instanceof C413031) {
            c413031 = (C413031) continuation;
            int i = c413031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413031.label = i - Integer.MIN_VALUE;
            } else {
                c413031 = new C413031(continuation);
            }
        }
        Object objGetScheduleMeetingFlow = c413031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c413031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetScheduleMeetingFlow);
            AdvisorMarketplaceService advisorMarketplaceService = this.advisorMarketplaceService;
            GetScheduleMeetingFlowRequestDto getScheduleMeetingFlowRequestDto = new GetScheduleMeetingFlowRequestDto(str);
            c413031.label = 1;
            objGetScheduleMeetingFlow = advisorMarketplaceService.GetScheduleMeetingFlow(getScheduleMeetingFlowRequestDto, c413031);
            if (objGetScheduleMeetingFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetScheduleMeetingFlow);
        }
        return ScheduleMeetingFlowResponse2.toUiModel((GetScheduleMeetingFlowResponseDto) objGetScheduleMeetingFlow);
    }
}
