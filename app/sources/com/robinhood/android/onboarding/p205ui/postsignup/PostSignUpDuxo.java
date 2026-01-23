package com.robinhood.android.onboarding.p205ui.postsignup;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.onboarding.p205ui.postsignup.PostSignUpDuxo;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEvent;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEventReducer;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.FundAccountScreenStore;
import com.robinhood.librobinhood.data.store.UserApplicationStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.identi.UiApplication;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PostSignUpDuxo.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00017BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0006\u0010%\u001a\u00020#J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0'J\u0006\u0010(\u001a\u00020#J\u000e\u0010)\u001a\u00020#H\u0086@¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020#J\u000e\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u00100\u001a\u00020#J\u000e\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u001bJ\u0006\u00103\u001a\u00020#J\u0006\u00102\u001a\u00020#J \u00104\u001a\u00020#2\u0006\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;", "Lcom/robinhood/android/udf/HasSavedState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "fundAccountScreenStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "userApplicationStore", "Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/android/common/util/CardManager;Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;Lcom/robinhood/librobinhood/data/store/UserApplicationStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "signUpContext", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpContext;", "isRhy", "", "()Z", "setRhy", "(Z)V", "didStartObservations", "getDidStartObservations", "setDidStartObservations", "onCreate", "", "onStart", "onFinishFlow", "hasApprovedAchRelationship", "Lio/reactivex/Observable;", "setIsDocUploadFlowVisited", "refreshLatestDocUpload", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showedCreateIav", "handleEvent", "event", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "setSignUpContext", "processedDestination", "loadNextScreen", "hasExitedIavRelationship", "signUpActivityDestroyed", "makeDocumentRequestAndNavigate", "destinationDefault", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PostSignUpDuxo extends BaseDuxo4<PostSignUpState> implements HasSavedState {
    private static final String SAVED_STATE = "saved_post_signup_duxo";
    private final AchRelationshipStore achRelationshipStore;
    private final CardManager cardManager;
    private boolean didStartObservations;
    private final DocumentRequestStore documentRequestStore;
    private final FundAccountScreenStore fundAccountScreenStore;
    private boolean isRhy;
    private final SavedStateHandle savedStateHandle;
    private PostSignUpContext signUpContext;
    private final BaseSortingHatStore sortingHatStore;
    private final UserApplicationStore userApplicationStore;
    public static final int $stable = 8;

    /* compiled from: PostSignUpDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo", m3645f = "PostSignUpDuxo.kt", m3646l = {123}, m3647m = "refreshLatestDocUpload")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$refreshLatestDocUpload$1 */
    static final class C228471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C228471(Continuation<? super C228471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PostSignUpDuxo.this.refreshLatestDocUpload(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PostSignUpDuxo(AchRelationshipStore achRelationshipStore, CardManager cardManager, DocumentRequestStore documentRequestStore, FundAccountScreenStore fundAccountScreenStore, UserApplicationStore userApplicationStore, BaseSortingHatStore sortingHatStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(fundAccountScreenStore, "fundAccountScreenStore");
        Intrinsics.checkNotNullParameter(userApplicationStore, "userApplicationStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        PostSignUpState postSignUpState = (PostSignUpState) savedStateHandle.get(SAVED_STATE);
        super(postSignUpState == null ? new PostSignUpState(null, null, false, false, false, false, null, null, false, false, false, 2047, null) : postSignUpState, duxoBundle);
        this.achRelationshipStore = achRelationshipStore;
        this.cardManager = cardManager;
        this.documentRequestStore = documentRequestStore;
        this.fundAccountScreenStore = fundAccountScreenStore;
        this.userApplicationStore = userApplicationStore;
        this.sortingHatStore = sortingHatStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* renamed from: isRhy, reason: from getter */
    public final boolean getIsRhy() {
        return this.isRhy;
    }

    public final void setRhy(boolean z) {
        this.isRhy = z;
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
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C228451(null), 3, null);
    }

    /* compiled from: PostSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1", m3645f = "PostSignUpDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1 */
    static final class C228451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C228451(Continuation<? super C228451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostSignUpDuxo.this.new C228451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<PostSignUpState> stateFlow = PostSignUpDuxo.this.getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PostSignUpDuxo.this, null);
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

        /* compiled from: PostSignUpDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1$1", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PostSignUpDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PostSignUpDuxo postSignUpDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = postSignUpDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PostSignUpState postSignUpState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PostSignUpState postSignUpState = (PostSignUpState) this.L$0;
                this.this$0.getSavedStateHandle().set(PostSignUpDuxo.SAVED_STATE, postSignUpState);
                if (postSignUpState.getShouldPollDocumentRequests() && !postSignUpState.isPollingDocuments()) {
                    this.this$0.applyMutation(new C503051(null));
                    PostSignUpDuxo postSignUpDuxo = this.this$0;
                    ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(postSignUpDuxo, DocumentRequestStore.pollDocumentRequests$default(postSignUpDuxo.documentRequestStore, null, ApiDocumentRequest.State.PENDING_UPLOAD, null, 5, null), (LifecycleEvent) null, 1, (Object) null);
                    final PostSignUpDuxo postSignUpDuxo2 = this.this$0;
                    scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PostSignUpDuxo.C228451.AnonymousClass1.invokeSuspend$lambda$0(postSignUpDuxo2, (List) obj2);
                        }
                    });
                }
                if (postSignUpState.getShouldPollApplication() && !this.this$0.getIsRhy() && !postSignUpState.isPollingApplication()) {
                    this.this$0.applyMutation(new AnonymousClass3(null));
                    PostSignUpDuxo postSignUpDuxo3 = this.this$0;
                    ScopedObservable scopedObservableBind$default2 = LifecycleHost.DefaultImpls.bind$default(postSignUpDuxo3, UserApplicationStore.pollApplicationUntilFinalObservable$default(postSignUpDuxo3.userApplicationStore, null, 1, null), (LifecycleEvent) null, 1, (Object) null);
                    final PostSignUpDuxo postSignUpDuxo4 = this.this$0;
                    scopedObservableBind$default2.subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PostSignUpDuxo.C228451.AnonymousClass1.invokeSuspend$lambda$1(postSignUpDuxo4, (UiApplication) obj2);
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            /* compiled from: PostSignUpDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1$1$1", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503051 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C503051(Continuation<? super C503051> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503051 c503051 = new C503051(continuation);
                    c503051.L$0 = obj;
                    return c503051;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
                    return ((C503051) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PostSignUpState.copy$default((PostSignUpState) this.L$0, null, null, false, false, false, false, null, null, true, false, false, 1791, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(PostSignUpDuxo postSignUpDuxo, List list) {
                postSignUpDuxo.applyMutation(new PostSignUpDuxo2(list, null));
                return Unit.INSTANCE;
            }

            /* compiled from: PostSignUpDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1$1$3", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
                    return ((AnonymousClass3) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PostSignUpState.copy$default((PostSignUpState) this.L$0, null, null, false, false, false, false, null, null, false, true, false, 1535, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(PostSignUpDuxo postSignUpDuxo, UiApplication uiApplication) {
                postSignUpDuxo.applyMutation(new PostSignUpDuxo3(uiApplication, null));
                return Unit.INSTANCE;
            }
        }
    }

    public final void onFinishFlow() {
        this.cardManager.invalidateCardsBestEffort();
        this.sortingHatStore.invalidateSortingHatCacheIfNeeded();
    }

    public final Observable<Boolean> hasApprovedAchRelationship() {
        Observable<Boolean> observableSubscribeOn = this.achRelationshipStore.getLinkedRelationshipsByState(SetsKt.setOf(ApiAchRelationship.State.APPROVED)).map(new Function() { // from class: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo.hasApprovedAchRelationship.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<AchRelationship> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    /* compiled from: PostSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$setIsDocUploadFlowVisited$1", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$setIsDocUploadFlowVisited$1 */
    static final class C228491 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C228491(Continuation<? super C228491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C228491 c228491 = new C228491(continuation);
            c228491.L$0 = obj;
            return c228491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
            return ((C228491) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PostSignUpState.copy$default((PostSignUpState) this.L$0, null, null, true, false, false, false, null, null, false, false, false, 2043, null);
        }
    }

    public final void setIsDocUploadFlowVisited() {
        applyMutation(new C228491(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshLatestDocUpload(Continuation<? super Unit> continuation) {
        C228471 c228471;
        if (continuation instanceof C228471) {
            c228471 = (C228471) continuation;
            int i = c228471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c228471.label = i - Integer.MIN_VALUE;
            } else {
                c228471 = new C228471(continuation);
            }
        }
        C228471 c2284712 = c228471;
        Object documentRequests$default = c2284712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2284712.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(documentRequests$default);
                DocumentRequestStore documentRequestStore = this.documentRequestStore;
                ApiDocumentRequest.State state = ApiDocumentRequest.State.PENDING_UPLOAD;
                c2284712.label = 1;
                documentRequests$default = DocumentRequestStore.getDocumentRequests$default(documentRequestStore, null, state, c2284712, 1, null);
                if (documentRequests$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(documentRequests$default);
            }
            applyMutation(new C228482((List) documentRequests$default, null));
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PostSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$refreshLatestDocUpload$2", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$refreshLatestDocUpload$2 */
    static final class C228482 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
        final /* synthetic */ List<DocumentRequest> $documentRequestResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C228482(List<DocumentRequest> list, Continuation<? super C228482> continuation) {
            super(2, continuation);
            this.$documentRequestResult = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C228482 c228482 = new C228482(this.$documentRequestResult, continuation);
            c228482.L$0 = obj;
            return c228482;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
            return ((C228482) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PostSignUpState.copy$default((PostSignUpState) this.L$0, this.$documentRequestResult, null, false, false, false, false, null, null, false, false, false, 2046, null);
        }
    }

    /* compiled from: PostSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$showedCreateIav$1", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$showedCreateIav$1 */
    static final class C228511 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C228511(Continuation<? super C228511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C228511 c228511 = new C228511(continuation);
            c228511.L$0 = obj;
            return c228511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
            return ((C228511) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PostSignUpState.copy$default((PostSignUpState) this.L$0, null, null, false, true, false, false, null, null, false, false, false, 2039, null);
        }
    }

    public final void showedCreateIav() {
        applyMutation(new C228511(null));
    }

    /* compiled from: PostSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$handleEvent$1", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$handleEvent$1 */
    static final class C228411 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
        final /* synthetic */ PostSignUpEvent $event;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C228411(PostSignUpEvent postSignUpEvent, Continuation<? super C228411> continuation) {
            super(2, continuation);
            this.$event = postSignUpEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C228411 c228411 = PostSignUpDuxo.this.new C228411(this.$event, continuation);
            c228411.L$0 = obj;
            return c228411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
            return ((C228411) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [T, com.robinhood.android.onboarding.ui.postsignup.PostSignUpState] */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, com.robinhood.android.onboarding.ui.postsignup.PostSignUpState] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ?? r0 = (PostSignUpState) this.L$0;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r0;
            PostSignUpContext postSignUpContext = PostSignUpDuxo.this.signUpContext;
            if (postSignUpContext != null) {
                PostSignUpEvent postSignUpEvent = this.$event;
                PostSignUpDuxo postSignUpDuxo = PostSignUpDuxo.this;
                PostSignUpDestination postSignUpDestinationReduce = PostSignUpEventReducer.INSTANCE.reduce(postSignUpEvent, r0, postSignUpContext, postSignUpDuxo.getIsRhy());
                if (Intrinsics.areEqual(postSignUpDestinationReduce, new PostSignUpDestination.Thanks(true))) {
                    postSignUpDuxo.makeDocumentRequestAndNavigate(postSignUpDestinationReduce, postSignUpEvent, postSignUpContext);
                } else {
                    objectRef.element = PostSignUpState.copy$default(r0, null, null, false, false, false, false, postSignUpDestinationReduce, postSignUpDestinationReduce, false, false, false, 1855, null);
                }
            }
            return objectRef.element;
        }
    }

    public final void handleEvent(PostSignUpEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        applyMutation(new C228411(event, null));
    }

    /* compiled from: PostSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$setSignUpContext$1", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$setSignUpContext$1 */
    static final class C228501 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
        final /* synthetic */ PostSignUpContext $signUpContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C228501(PostSignUpContext postSignUpContext, Continuation<? super C228501> continuation) {
            super(2, continuation);
            this.$signUpContext = postSignUpContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C228501 c228501 = new C228501(this.$signUpContext, continuation);
            c228501.L$0 = obj;
            return c228501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
            return ((C228501) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PostSignUpState.copy$default((PostSignUpState) this.L$0, null, null, false, false, false, Intrinsics.areEqual(this.$signUpContext.getLocality(), CountryCode.Supported.UnitedStates.INSTANCE), null, null, false, false, false, 2015, null);
        }
    }

    public final void setSignUpContext(PostSignUpContext signUpContext) {
        Intrinsics.checkNotNullParameter(signUpContext, "signUpContext");
        this.signUpContext = signUpContext;
        applyMutation(new C228501(signUpContext, null));
    }

    /* compiled from: PostSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$processedDestination$1", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$processedDestination$1 */
    static final class C228461 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C228461(Continuation<? super C228461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C228461 c228461 = new C228461(continuation);
            c228461.L$0 = obj;
            return c228461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
            return ((C228461) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PostSignUpState.copy$default((PostSignUpState) this.L$0, null, null, false, false, false, false, null, null, false, false, false, 1919, null);
        }
    }

    public final void processedDestination() {
        applyMutation(new C228461(null));
    }

    public final void loadNextScreen(final boolean hasExitedIavRelationship) {
        withDataState(new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostSignUpDuxo.loadNextScreen$lambda$0(hasExitedIavRelationship, this, (PostSignUpState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadNextScreen$lambda$0(boolean z, PostSignUpDuxo postSignUpDuxo, PostSignUpState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (Intrinsics.areEqual(dataState.getLastDestination(), PostSignUpDestination.CreateIavRelationship.INSTANCE) && z) {
            postSignUpDuxo.handleEvent(PostSignUpEvent.PreFundDetails.Continue.INSTANCE);
        } else if (dataState.getActivityWasDestroyedDuringFunding() && !dataState.getShouldPromptForFundingAgain()) {
            postSignUpDuxo.handleEvent(PostSignUpEvent.PreFundDetails.Exit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PostSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$signUpActivityDestroyed$1", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$signUpActivityDestroyed$1 */
    static final class C228521 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C228521(Continuation<? super C228521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C228521 c228521 = new C228521(continuation);
            c228521.L$0 = obj;
            return c228521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
            return ((C228521) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PostSignUpState.copy$default((PostSignUpState) this.L$0, null, null, false, false, false, false, null, null, false, false, true, 1023, null);
        }
    }

    public final void signUpActivityDestroyed() {
        applyMutation(new C228521(null));
    }

    /* compiled from: PostSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$hasExitedIavRelationship$1", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$hasExitedIavRelationship$1 */
    static final class C228431 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C228431(Continuation<? super C228431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C228431 c228431 = new C228431(continuation);
            c228431.L$0 = obj;
            return c228431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
            return ((C228431) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PostSignUpState.copy$default((PostSignUpState) this.L$0, null, null, false, false, true, false, null, null, false, false, false, 2031, null);
        }
    }

    public final void hasExitedIavRelationship() {
        applyMutation(new C228431(null));
    }

    /* compiled from: PostSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$makeDocumentRequestAndNavigate$1", m3645f = "PostSignUpDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$makeDocumentRequestAndNavigate$1 */
    static final class C228441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PostSignUpDestination $destinationDefault;
        final /* synthetic */ PostSignUpEvent $event;
        final /* synthetic */ PostSignUpContext $signUpContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C228441(PostSignUpEvent postSignUpEvent, PostSignUpContext postSignUpContext, PostSignUpDestination postSignUpDestination, Continuation<? super C228441> continuation) {
            super(2, continuation);
            this.$event = postSignUpEvent;
            this.$signUpContext = postSignUpContext;
            this.$destinationDefault = postSignUpDestination;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostSignUpDuxo.this.new C228441(this.$event, this.$signUpContext, this.$destinationDefault, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C228441 c228441;
            DocumentRequestStore documentRequestStore;
            ApiDocumentRequest.State state;
            Exception exc;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    documentRequestStore = PostSignUpDuxo.this.documentRequestStore;
                    state = ApiDocumentRequest.State.PENDING_UPLOAD;
                    this.label = 1;
                    c228441 = this;
                } catch (Exception e) {
                    e = e;
                    c228441 = this;
                    exc = e;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 4, null);
                    PostSignUpDuxo.this.applyMutation(new AnonymousClass3(c228441.$destinationDefault, null));
                    return Unit.INSTANCE;
                }
                try {
                    obj = DocumentRequestStore.getDocumentRequests$default(documentRequestStore, null, state, c228441, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 4, null);
                    PostSignUpDuxo.this.applyMutation(new AnonymousClass3(c228441.$destinationDefault, null));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c228441 = this;
                } catch (Exception e3) {
                    exc = e3;
                    c228441 = this;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 4, null);
                    PostSignUpDuxo.this.applyMutation(new AnonymousClass3(c228441.$destinationDefault, null));
                    return Unit.INSTANCE;
                }
            }
            PostSignUpDuxo.this.applyMutation(new AnonymousClass1((List) obj, null));
            PostSignUpDuxo postSignUpDuxo = PostSignUpDuxo.this;
            postSignUpDuxo.applyMutation(new AnonymousClass2(c228441.$event, c228441.$signUpContext, postSignUpDuxo, null));
            return Unit.INSTANCE;
        }

        /* compiled from: PostSignUpDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$makeDocumentRequestAndNavigate$1$1", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$makeDocumentRequestAndNavigate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
            final /* synthetic */ List<DocumentRequest> $documentRequestResult;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<DocumentRequest> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$documentRequestResult = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$documentRequestResult, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
                return ((AnonymousClass1) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PostSignUpState.copy$default((PostSignUpState) this.L$0, this.$documentRequestResult, null, false, false, false, false, null, null, false, false, false, 2046, null);
            }
        }

        /* compiled from: PostSignUpDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$makeDocumentRequestAndNavigate$1$2", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$makeDocumentRequestAndNavigate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
            final /* synthetic */ PostSignUpEvent $event;
            final /* synthetic */ PostSignUpContext $signUpContext;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PostSignUpDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PostSignUpEvent postSignUpEvent, PostSignUpContext postSignUpContext, PostSignUpDuxo postSignUpDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$event = postSignUpEvent;
                this.$signUpContext = postSignUpContext;
                this.this$0 = postSignUpDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$event, this.$signUpContext, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
                return ((AnonymousClass2) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PostSignUpState postSignUpState = (PostSignUpState) this.L$0;
                PostSignUpDestination postSignUpDestinationReduce = PostSignUpEventReducer.INSTANCE.reduce(this.$event, postSignUpState, this.$signUpContext, this.this$0.getIsRhy());
                return PostSignUpState.copy$default(postSignUpState, null, null, false, false, false, false, postSignUpDestinationReduce, postSignUpDestinationReduce, false, false, false, 1855, null);
            }
        }

        /* compiled from: PostSignUpDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$makeDocumentRequestAndNavigate$1$3", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$makeDocumentRequestAndNavigate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
            final /* synthetic */ PostSignUpDestination $destinationDefault;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PostSignUpDestination postSignUpDestination, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$destinationDefault = postSignUpDestination;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$destinationDefault, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
                return ((AnonymousClass3) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PostSignUpState postSignUpState = (PostSignUpState) this.L$0;
                PostSignUpDestination postSignUpDestination = this.$destinationDefault;
                return PostSignUpState.copy$default(postSignUpState, null, null, false, false, false, false, postSignUpDestination, postSignUpDestination, false, false, false, 1855, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void makeDocumentRequestAndNavigate(PostSignUpDestination destinationDefault, PostSignUpEvent event, PostSignUpContext signUpContext) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C228441(event, signUpContext, destinationDefault, null), 3, null);
    }
}
