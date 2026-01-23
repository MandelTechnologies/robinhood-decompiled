package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.FundAccountScreenStore;
import com.robinhood.librobinhood.data.store.UserApplicationStore;
import com.robinhood.models.api.PostOnboardingFundAccountContentResponse;
import com.robinhood.models.p355ui.identi.UiApplication;
import com.robinhood.utils.Optional;
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

/* compiled from: PostSignUpFundAccountSplashDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashDataModel;", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashViewModel;", "fundAccountStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "applicationStore", "Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "stateProvider", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;Lcom/robinhood/librobinhood/data/store/UserApplicationStore;Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PostSignUpFundAccountSplashDuxo extends BaseDuxo<PostSignUpFundAccountSplashDataModel, PostSignUpFundAccountSplashViewModel> {
    public static final int $stable = 8;
    private final UserApplicationStore applicationStore;
    private final FundAccountScreenStore fundAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostSignUpFundAccountSplashDuxo(FundAccountScreenStore fundAccountStore, UserApplicationStore applicationStore, PostSignUpFundAccountSplashState2 stateProvider, DuxoBundle duxoBundle) {
        super(new PostSignUpFundAccountSplashDataModel(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(fundAccountStore, "fundAccountStore");
        Intrinsics.checkNotNullParameter(applicationStore, "applicationStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.fundAccountStore = fundAccountStore;
        this.applicationStore = applicationStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C228731(null), 3, null);
    }

    /* compiled from: PostSignUpFundAccountSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashDuxo$onCreate$1", m3645f = "PostSignUpFundAccountSplashDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashDuxo$onCreate$1 */
    static final class C228731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C228731(Continuation<? super C228731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostSignUpFundAccountSplashDuxo.this.new C228731(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PostSignUpFundAccountSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/PostOnboardingFundAccountContentResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashDuxo$onCreate$1$1", m3645f = "PostSignUpFundAccountSplashDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PostOnboardingFundAccountContentResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PostSignUpFundAccountSplashDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PostSignUpFundAccountSplashDuxo postSignUpFundAccountSplashDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = postSignUpFundAccountSplashDuxo;
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
                this.this$0.applyMutation(new C503081(r1, uiApplication, null));
                return Unit.INSTANCE;
            }

            /* compiled from: PostSignUpFundAccountSplashDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashDataModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashDuxo$onCreate$1$1$1", m3645f = "PostSignUpFundAccountSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503081 extends ContinuationImpl7 implements Function2<PostSignUpFundAccountSplashDataModel, Continuation<? super PostSignUpFundAccountSplashDataModel>, Object> {
                final /* synthetic */ UiApplication $application;
                final /* synthetic */ PostOnboardingFundAccountContentResponse $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503081(PostOnboardingFundAccountContentResponse postOnboardingFundAccountContentResponse, UiApplication uiApplication, Continuation<? super C503081> continuation) {
                    super(2, continuation);
                    this.$it = postOnboardingFundAccountContentResponse;
                    this.$application = uiApplication;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503081 c503081 = new C503081(this.$it, this.$application, continuation);
                    c503081.L$0 = obj;
                    return c503081;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PostSignUpFundAccountSplashDataModel postSignUpFundAccountSplashDataModel, Continuation<? super PostSignUpFundAccountSplashDataModel> continuation) {
                    return ((C503081) create(postSignUpFundAccountSplashDataModel, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PostSignUpFundAccountSplashDataModel postSignUpFundAccountSplashDataModel = (PostSignUpFundAccountSplashDataModel) this.L$0;
                    PostOnboardingFundAccountContentResponse postOnboardingFundAccountContentResponse = this.$it;
                    return postSignUpFundAccountSplashDataModel.copy(postOnboardingFundAccountContentResponse != null ? postOnboardingFundAccountContentResponse.getSplashScreen() : null, this.$application);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<PostOnboardingFundAccountContentResponse> flowStreamFundAccountScreenResponse = PostSignUpFundAccountSplashDuxo.this.fundAccountStore.streamFundAccountScreenResponse();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PostSignUpFundAccountSplashDuxo.this, null);
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
}
