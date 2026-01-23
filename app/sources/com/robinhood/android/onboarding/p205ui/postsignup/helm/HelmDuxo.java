package com.robinhood.android.onboarding.p205ui.postsignup.helm;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.helm.Helm;
import com.robinhood.android.onboarding.contracts.HelmIntentKey;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEvent;
import com.robinhood.android.onboarding.p205ui.postsignup.helm.HelmDuxoEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.FundAccountScreenStore;
import com.robinhood.librobinhood.data.store.UserApplicationStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.TimberLogger;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: HelmDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\"\b\u0007\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00011BQ\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0082@¢\u0006\u0002\u0010*J\u000e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-J \u0010.\u001a\u00020%*\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010/\u001a\u0004\u0018\u000100H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmState;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxoEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "fundAccountScreenStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "helm", "Lcom/robinhood/android/helm/Helm;", "userApplicationStore", "Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/common/util/CardManager;Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;Lcom/robinhood/android/helm/Helm;Lcom/robinhood/librobinhood/data/store/UserApplicationStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "didStartObservations", "", "getDidStartObservations", "()Z", "setDidStartObservations", "(Z)V", "helmCallback", "com/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo$helmCallback$1", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo$helmCallback$1;", "onCreate", "", "onStart", "getDocumentsToUpload", "", "Lcom/robinhood/models/ui/DocumentRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleEvent", "event", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "logPostSignUpNavigation", "destination", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class HelmDuxo extends BaseDuxo5<HelmState, HelmDuxoEvent> implements HasSavedState {
    private static final String POST_ONBOARDING_LAUNCH_SOURCE = "post-onboarding";
    private static final String SAVED_STATE = "saved_post_signup_duxo";
    private final AnalyticsLogger analytics;
    private final CardManager cardManager;
    private boolean didStartObservations;
    private final DocumentRequestStore documentRequestStore;
    private final FundAccountScreenStore fundAccountScreenStore;
    private final Helm helm;
    private final HelmDuxo5 helmCallback;
    private final SavedStateHandle savedStateHandle;
    private final BaseSortingHatStore sortingHatStore;
    private final UserApplicationStore userApplicationStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HelmDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo", m3645f = "HelmDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "getDocumentsToUpload")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$getDocumentsToUpload$1 */
    static final class C228821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C228821(Continuation<? super C228821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HelmDuxo.this.getDocumentsToUpload(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HelmDuxo(AnalyticsLogger analytics, CardManager cardManager, DocumentRequestStore documentRequestStore, FundAccountScreenStore fundAccountScreenStore, Helm helm, UserApplicationStore userApplicationStore, BaseSortingHatStore sortingHatStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(fundAccountScreenStore, "fundAccountScreenStore");
        Intrinsics.checkNotNullParameter(helm, "helm");
        Intrinsics.checkNotNullParameter(userApplicationStore, "userApplicationStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        HelmState helmState = (HelmState) savedStateHandle.get(SAVED_STATE);
        super(helmState == null ? new HelmState(false, null, null, 7, null) : helmState, duxoBundle);
        this.analytics = analytics;
        this.cardManager = cardManager;
        this.documentRequestStore = documentRequestStore;
        this.fundAccountScreenStore = fundAccountScreenStore;
        this.helm = helm;
        this.userApplicationStore = userApplicationStore;
        this.sortingHatStore = sortingHatStore;
        this.savedStateHandle = savedStateHandle;
        this.helmCallback = new HelmDuxo5(this);
    }

    public final boolean getDidStartObservations() {
        return this.didStartObservations;
    }

    public final void setDidStartObservations(boolean z) {
        this.didStartObservations = z;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        this.didStartObservations = false;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.fundAccountScreenStore.fetchIfEmpty();
        if (this.didStartObservations) {
            return;
        }
        this.didStartObservations = true;
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C228831(null), 3, null);
    }

    /* compiled from: HelmDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$onStart$1", m3645f = "HelmDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$onStart$1 */
    static final class C228831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C228831(Continuation<? super C228831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HelmDuxo.this.new C228831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: HelmDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$onStart$1$1", m3645f = "HelmDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HelmState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HelmDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HelmDuxo helmDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = helmDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HelmState helmState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(helmState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getSavedStateHandle().set(HelmDuxo.SAVED_STATE, (HelmState) this.L$0);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<HelmState> stateFlow = HelmDuxo.this.getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HelmDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDocumentsToUpload(Continuation<? super List<DocumentRequest>> continuation) {
        C228821 c228821;
        if (continuation instanceof C228821) {
            c228821 = (C228821) continuation;
            int i = c228821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c228821.label = i - Integer.MIN_VALUE;
            } else {
                c228821 = new C228821(continuation);
            }
        }
        C228821 c2288212 = c228821;
        Object obj = c2288212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2288212.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            DocumentRequestStore documentRequestStore = this.documentRequestStore;
            ApiDocumentRequest.State state = ApiDocumentRequest.State.PENDING_UPLOAD;
            c2288212.label = 1;
            Object documentRequests$default = DocumentRequestStore.getDocumentRequests$default(documentRequestStore, null, state, c2288212, 1, null);
            return documentRequests$default == coroutine_suspended ? coroutine_suspended : documentRequests$default;
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, true, null, 4, null);
            return CollectionsKt.emptyList();
        }
    }

    public final void handleEvent(final PostSignUpEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        logPostSignUpNavigation(this.analytics, event, null);
        TimberLogger.INSTANCE.mo1679d("[Helm] Duxo handle event: " + event, new Object[0]);
        withDataState(new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelmDuxo.handleEvent$lambda$0(event, this, (HelmState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleEvent$lambda$0(PostSignUpEvent postSignUpEvent, HelmDuxo helmDuxo, HelmState state) {
        Map<String, String> mapEmptyMap;
        PostSignUpDestination postSignUpDestination;
        Intrinsics.checkNotNullParameter(state, "state");
        if (postSignUpEvent instanceof PostSignUpEvent.LoadingComplete) {
            helmDuxo.helm.start(POST_ONBOARDING_LAUNCH_SOURCE, helmDuxo.helmCallback);
        } else if (postSignUpEvent instanceof PostSignUpEvent.BankLinkFinished) {
            helmDuxo.applyMutation(new HelmDuxo2(postSignUpEvent, null));
            if (((PostSignUpEvent.BankLinkFinished) postSignUpEvent).isCompleted()) {
                Helm.onSubFlowFinished$default(helmDuxo.helm, state.getFlowId(), HelmSubFlow.BANK_LINKING.getId(), null, 4, null);
            } else {
                TimberLogger.INSTANCE.mo1681e("[Helm] Bank link failed, let user re-start bank linking by tapping CTA again", new Object[0]);
            }
        } else if (Intrinsics.areEqual(postSignUpEvent, PostSignUpEvent.GoldNativeFundingUpsellCompleted.INSTANCE)) {
            Helm.onSubFlowFinished$default(helmDuxo.helm, state.getFlowId(), HelmSubFlow.NATIVE_FUNDING_UPSELL.getId(), null, 4, null);
        } else if (postSignUpEvent instanceof PostSignUpEvent.UkQueuedDepositCompleted) {
            helmDuxo.applyMutation(new HelmDuxo3(postSignUpEvent, null));
            if (((PostSignUpEvent.UkQueuedDepositCompleted) postSignUpEvent).getDepositSucceeded()) {
                Helm.onSubFlowFinished$default(helmDuxo.helm, state.getFlowId(), HelmSubFlow.GB_QUEUED_DEPOSIT.getId(), null, 4, null);
            }
        } else if (Intrinsics.areEqual(postSignUpEvent, PostSignUpEvent.UkVerifyIdentityCompleted.INSTANCE)) {
            Helm.onSubFlowFinished$default(helmDuxo.helm, state.getFlowId(), HelmSubFlow.GB_VERIFY_IDENTITY.getId(), null, 4, null);
        } else if (Intrinsics.areEqual(postSignUpEvent, PostSignUpEvent.DocUploadComplete.INSTANCE)) {
            Helm.onSubFlowFinished$default(helmDuxo.helm, state.getFlowId(), HelmSubFlow.DOC_UPLOAD.getId(), null, 4, null);
        } else if (Intrinsics.areEqual(postSignUpEvent, PostSignUpEvent.ReferralComplete.INSTANCE)) {
            Helm.onSubFlowFinished$default(helmDuxo.helm, state.getFlowId(), HelmSubFlow.REFERRAL.getId(), null, 4, null);
        } else if (Intrinsics.areEqual(postSignUpEvent, PostSignUpEvent.PostFundUpsellCancel.INSTANCE) || Intrinsics.areEqual(postSignUpEvent, PostSignUpEvent.PostFundUpsellComplete.INSTANCE)) {
            Helm.onSubFlowFinished$default(helmDuxo.helm, state.getFlowId(), HelmSubFlow.POST_FUNDING_UPSELL.getId(), null, 4, null);
        } else if (Intrinsics.areEqual(postSignUpEvent, PostSignUpEvent.ThanksExit.INSTANCE)) {
            Helm.onSubFlowFinished$default(helmDuxo.helm, state.getFlowId(), HelmSubFlow.THANK_YOU.getId(), null, 4, null);
        } else if ((postSignUpEvent instanceof PostSignUpEvent.PreFundDetails.Continue) || (postSignUpEvent instanceof PostSignUpEvent.PreFundDetails.Exit)) {
            boolean z = postSignUpEvent instanceof PostSignUpEvent.PreFundDetails.Exit;
            Helm helm = helmDuxo.helm;
            String flowId = state.getFlowId();
            String id = HelmSubFlow.INTRO.getId();
            if (z) {
                mapEmptyMap = MapsKt.mapOf(Tuples4.m3642to("intro_skip_funding", "true"));
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            helm.onSubFlowFinished(flowId, id, mapEmptyMap);
        } else if (postSignUpEvent instanceof PostSignUpEvent.FundingComplete) {
            if (((PostSignUpEvent.FundingComplete) postSignUpEvent).getTransferAmount() != null) {
                helmDuxo.applyMutation(new HelmDuxo4(postSignUpEvent, null));
                Helm.onSubFlowFinished$default(helmDuxo.helm, state.getFlowId(), HelmSubFlow.FIRST_DEPOSIT.getId(), null, 4, null);
            }
        } else if (postSignUpEvent instanceof PostSignUpEvent.RecurringAutomaticDepositComplete) {
            Helm.onSubFlowFinished$default(helmDuxo.helm, state.getFlowId(), HelmSubFlow.RECURRING_DEPOSIT.getId(), null, 4, null);
        } else if (Intrinsics.areEqual(postSignUpEvent, PostSignUpEvent.PreFundSplashComplete.INSTANCE)) {
            if (((HelmIntentKey) INSTANCE.getExtras((HasSavedState) helmDuxo)).getIsRhy()) {
                Helm.onSubFlowFinished$default(helmDuxo.helm, state.getFlowId(), HelmSubFlow.INTRO.getId(), null, 4, null);
                postSignUpDestination = PostSignUpDestination.HelmDrivenSubFlow.INSTANCE;
            } else {
                postSignUpDestination = PostSignUpDestination.PreFundDetails.INSTANCE;
            }
            helmDuxo.logPostSignUpNavigation(helmDuxo.analytics, null, postSignUpDestination);
            helmDuxo.submit(new HelmDuxoEvent.ProcessDestination(postSignUpDestination));
        } else {
            if (!(postSignUpEvent instanceof PostSignUpEvent.DisplayThanks) && !(postSignUpEvent instanceof PostSignUpEvent.DepositQueuedMessageShown) && !(postSignUpEvent instanceof PostSignUpEvent.RecurringAutomaticDeposit)) {
                throw new NoWhenBranchMatchedException();
            }
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException(postSignUpEvent + " is not expected in Helm flow"), true, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPostSignUpNavigation(AnalyticsLogger analyticsLogger, PostSignUpEvent postSignUpEvent, PostSignUpDestination postSignUpDestination) {
        String str;
        AnalyticsLogger analyticsLogger2;
        if (((HelmIntentKey) INSTANCE.getExtras((HasSavedState) this)).getIsRhy()) {
            str = AnalyticsStrings.USER_ACTION_RHY_POST_SIGN_UP_NAVIGATION;
        } else {
            str = AnalyticsStrings.USER_ACTION_POST_SIGN_UP_NAVIGATION;
        }
        String str2 = str;
        if (postSignUpEvent != null) {
            analyticsLogger2 = analyticsLogger;
            AnalyticsLogger.DefaultImpls.logUserAction$default(analyticsLogger2, str2, null, null, postSignUpEvent.getAnalyticsString(), 6, null);
        } else {
            analyticsLogger2 = analyticsLogger;
        }
        if (postSignUpDestination != null) {
            AnalyticsLogger.DefaultImpls.logUserAction$default(analyticsLogger2, str2, null, postSignUpDestination.getAnalyticsString(), null, 10, null);
        }
    }

    /* compiled from: HelmDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo;", "Lcom/robinhood/android/onboarding/contracts/HelmIntentKey;", "<init>", "()V", "SAVED_STATE", "", "POST_ONBOARDING_LAUNCH_SOURCE", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<HelmDuxo, HelmIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public HelmIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (HelmIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public HelmIntentKey getExtras(HelmDuxo helmDuxo) {
            return (HelmIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, helmDuxo);
        }
    }
}
