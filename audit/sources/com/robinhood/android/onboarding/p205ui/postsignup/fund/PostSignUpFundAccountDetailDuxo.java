package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.directipo.models.api.ApiDirectIpoDspFundAccount;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.FundAccountScreenStore;
import com.robinhood.librobinhood.data.store.UserApplicationStore;
import com.robinhood.models.api.PostOnboardingFundAccountContentResponse;
import com.robinhood.models.p355ui.identi.UiApplication;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: PostSignUpFundAccountDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailDataState;", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailViewState;", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/ContinueEvent;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "applicationStore", "Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "fundAccountStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "stateProvider", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;Lcom/robinhood/librobinhood/data/store/UserApplicationStore;Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "onContinueButtonClicked", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PostSignUpFundAccountDetailDuxo extends BaseDuxo3<PostSignUpFundAccountDetailDataState, PostSignUpFundAccountDetailViewState, PostSignUpFundAccountDetailState> {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final DirectIpoApi api;
    private final UserApplicationStore applicationStore;
    private final FundAccountScreenStore fundAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostSignUpFundAccountDetailDuxo(AnalyticsLogger analytics, DirectIpoApi api, UserApplicationStore applicationStore, FundAccountScreenStore fundAccountStore, PostSignUpFundAccountDetailState4 stateProvider, DuxoBundle duxoBundle) {
        super(new PostSignUpFundAccountDetailDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(applicationStore, "applicationStore");
        Intrinsics.checkNotNullParameter(fundAccountStore, "fundAccountStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.analytics = analytics;
        this.api = api;
        this.applicationStore = applicationStore;
        this.fundAccountStore = fundAccountStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C228581(null), 3, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C228592(null));
    }

    /* compiled from: PostSignUpFundAccountDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailDuxo$onCreate$1", m3645f = "PostSignUpFundAccountDetailDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailDuxo$onCreate$1 */
    static final class C228581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C228581(Continuation<? super C228581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostSignUpFundAccountDetailDuxo.this.new C228581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PostSignUpFundAccountDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/PostOnboardingFundAccountContentResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailDuxo$onCreate$1$1", m3645f = "PostSignUpFundAccountDetailDuxo.kt", m3646l = {81}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PostOnboardingFundAccountContentResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PostSignUpFundAccountDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PostSignUpFundAccountDetailDuxo postSignUpFundAccountDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = postSignUpFundAccountDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PostOnboardingFundAccountContentResponse postOnboardingFundAccountContentResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(postOnboardingFundAccountContentResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v2, types: [com.robinhood.models.api.PostOnboardingFundAccountContentResponse] */
            /* JADX WARN: Type inference failed for: r1v4, types: [com.robinhood.models.api.PostOnboardingFundAccountContentResponse, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v7, types: [com.robinhood.models.api.PostOnboardingFundAccountContentResponse] */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                UiApplication uiApplication;
                ?? r1;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ?? r12 = (PostOnboardingFundAccountContentResponse) this.L$0;
                        Single<Optional<UiApplication>> application = this.this$0.applicationStore.getApplication();
                        this.L$0 = r12;
                        this.label = 1;
                        obj = RxAwait3.await(application, this);
                        i = r12;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r13 = (PostOnboardingFundAccountContentResponse) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        i = r13;
                    }
                    uiApplication = (UiApplication) ((Optional) obj).getOrNull();
                    r1 = i;
                } catch (Exception e) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
                    uiApplication = null;
                    r1 = i;
                }
                this.this$0.applyMutation(new C503071(r1, uiApplication, null));
                return Unit.INSTANCE;
            }

            /* compiled from: PostSignUpFundAccountDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailDuxo$onCreate$1$1$1", m3645f = "PostSignUpFundAccountDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503071 extends ContinuationImpl7 implements Function2<PostSignUpFundAccountDetailDataState, Continuation<? super PostSignUpFundAccountDetailDataState>, Object> {
                final /* synthetic */ UiApplication $application;
                final /* synthetic */ PostOnboardingFundAccountContentResponse $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503071(PostOnboardingFundAccountContentResponse postOnboardingFundAccountContentResponse, UiApplication uiApplication, Continuation<? super C503071> continuation) {
                    super(2, continuation);
                    this.$it = postOnboardingFundAccountContentResponse;
                    this.$application = uiApplication;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503071 c503071 = new C503071(this.$it, this.$application, continuation);
                    c503071.L$0 = obj;
                    return c503071;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PostSignUpFundAccountDetailDataState postSignUpFundAccountDetailDataState, Continuation<? super PostSignUpFundAccountDetailDataState> continuation) {
                    return ((C503071) create(postSignUpFundAccountDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PostSignUpFundAccountDetailDataState postSignUpFundAccountDetailDataState = (PostSignUpFundAccountDetailDataState) this.L$0;
                    PostOnboardingFundAccountContentResponse postOnboardingFundAccountContentResponse = this.$it;
                    return PostSignUpFundAccountDetailDataState.copy$default(postSignUpFundAccountDetailDataState, null, postOnboardingFundAccountContentResponse != null ? postOnboardingFundAccountContentResponse.getDetailScreen() : null, this.$application, 1, null);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<PostOnboardingFundAccountContentResponse> flowStreamFundAccountScreenResponse = PostSignUpFundAccountDetailDuxo.this.fundAccountStore.streamFundAccountScreenResponse();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PostSignUpFundAccountDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamFundAccountScreenResponse, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: PostSignUpFundAccountDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailDuxo$onCreate$2", m3645f = "PostSignUpFundAccountDetailDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailDuxo$onCreate$2 */
    static final class C228592 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C228592(Continuation<? super C228592> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostSignUpFundAccountDetailDuxo.this.new C228592(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228592) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DirectIpoApi directIpoApi = PostSignUpFundAccountDetailDuxo.this.api;
                    this.label = 1;
                    obj = directIpoApi.getIpoAccessDspFundAccount(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                PostSignUpFundAccountDetailDuxo.this.applyMutation(new AnonymousClass1((ApiDirectIpoDspFundAccount) obj, null));
            } catch (Throwable th) {
                Integer httpStatusCode = Throwables.getHttpStatusCode(th);
                if (httpStatusCode == null || httpStatusCode.intValue() != 404) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: PostSignUpFundAccountDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailDuxo$onCreate$2$1", m3645f = "PostSignUpFundAccountDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PostSignUpFundAccountDetailDataState, Continuation<? super PostSignUpFundAccountDetailDataState>, Object> {
            final /* synthetic */ ApiDirectIpoDspFundAccount $account;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiDirectIpoDspFundAccount apiDirectIpoDspFundAccount, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$account = apiDirectIpoDspFundAccount;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$account, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PostSignUpFundAccountDetailDataState postSignUpFundAccountDetailDataState, Continuation<? super PostSignUpFundAccountDetailDataState> continuation) {
                return ((AnonymousClass1) create(postSignUpFundAccountDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PostSignUpFundAccountDetailDataState.copy$default((PostSignUpFundAccountDetailDataState) this.L$0, this.$account, null, null, 6, null);
            }
        }
    }

    public final void onContinueButtonClicked() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_ONBOARDING_FUND_ACCOUNT_INTRO, "continue", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        submit(PostSignUpFundAccountDetailState.INSTANCE);
    }
}
