package com.robinhood.android.support.call;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.support.call.ReviewCallDetailsDataState;
import com.robinhood.android.support.call.textanimator.ReviewCallDetailsEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CxVoiceContentIds;
import com.robinhood.librobinhood.data.store.SupportInquiryStore;
import com.robinhood.librobinhood.data.store.SupportInquiryStore2;
import com.robinhood.librobinhood.data.store.SupportPhoneIssueStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.api.ChannelType;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.models.p355ui.IssueDetail;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.support.contracts.ReviewCallDetailsFragmentKey;
import com.robinhood.staticcontent.model.p402cx.CxVoiceContent;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: ReviewCallDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 .2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001.BI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\u000e\u0010\"\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010#J\u000e\u0010%\u001a\u00020 H\u0082@¢\u0006\u0002\u0010#J\u0006\u0010&\u001a\u00020\u001bJ\u0006\u0010'\u001a\u00020\u001bJ\u000e\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*J\f\u0010+\u001a\u00020,*\u00020-H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState;", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState;", "Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "supportInquiryStore", "Lcom/robinhood/librobinhood/data/store/SupportInquiryStore;", "supportPhoneIssueStore", "Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "stateProvider", "Lcom/robinhood/android/support/call/ReviewCallDetailsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/SupportInquiryStore;Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/support/call/ReviewCallDetailsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setIssueDetailAndContent", "issueDetails", "Lcom/robinhood/models/ui/IssueDetail$Phone;", "content", "Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;", "setIssueDetailAndContent$feature_support_externalRelease", "fetchIssueDetail", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadStaticContentAndSetIssueDetail", "loadCxVoiceContent", "createNewIssue", "onPhoneNumberChangedInIdenti", "onPhoneNumberChanged", "phoneNumber", "", "asPhoneOrThrow", "Lcom/robinhood/models/ui/Issue$Phone;", "Lcom/robinhood/models/ui/Issue;", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ReviewCallDetailsDuxo extends BaseDuxo3<ReviewCallDetailsDataState, ReviewCallDetailsViewState, ReviewCallDetailsEvent> implements HasSavedState {
    private final AuthManager authManager;
    private final ProfileInfoStore profileInfoStore;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;
    private final SupportInquiryStore supportInquiryStore;
    private final SupportPhoneIssueStore supportPhoneIssueStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {97, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m3647m = "fetchIssueDetail")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$fetchIssueDetail$1 */
    static final class C288941 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C288941(Continuation<? super C288941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReviewCallDetailsDuxo.this.fetchIssueDetail(this);
        }
    }

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {120}, m3647m = "loadCxVoiceContent")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$loadCxVoiceContent$1 */
    static final class C288971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C288971(Continuation<? super C288971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReviewCallDetailsDuxo.this.loadCxVoiceContent(this);
        }
    }

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {111}, m3647m = "loadStaticContentAndSetIssueDetail")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$loadStaticContentAndSetIssueDetail$1 */
    static final class C288981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C288981(Continuation<? super C288981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReviewCallDetailsDuxo.this.loadStaticContentAndSetIssueDetail(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCallDetailsDuxo(StaticContentStore staticContentStore, SupportInquiryStore supportInquiryStore, SupportPhoneIssueStore supportPhoneIssueStore, ProfileInfoStore profileInfoStore, AuthManager authManager, ReviewCallDetailsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ReviewCallDetailsDataState(null, null, authManager.isLoggedIn(), null, ((ReviewCallDetailsFragmentKey) INSTANCE.getArgs(savedStateHandle)).getLoggedOutPhoneNumber(), 11, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(supportInquiryStore, "supportInquiryStore");
        Intrinsics.checkNotNullParameter(supportPhoneIssueStore, "supportPhoneIssueStore");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.staticContentStore = staticContentStore;
        this.supportInquiryStore = supportInquiryStore;
        this.supportPhoneIssueStore = supportPhoneIssueStore;
        this.profileInfoStore = profileInfoStore;
        this.authManager = authManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C289001(null));
    }

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo$onCreate$1", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {53, 55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$onCreate$1 */
    static final class C289001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C289001(Continuation<? super C289001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewCallDetailsDuxo.this.new C289001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C289001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r5.fetchIssueDetail(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        
            if (r5.loadStaticContentAndSetIssueDetail(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (((ReviewCallDetailsFragmentKey) ReviewCallDetailsDuxo.INSTANCE.getArgs((HasSavedState) ReviewCallDetailsDuxo.this)).getIssueDetail() == null) {
                    ReviewCallDetailsDuxo reviewCallDetailsDuxo = ReviewCallDetailsDuxo.this;
                    this.label = 1;
                } else {
                    ReviewCallDetailsDuxo reviewCallDetailsDuxo2 = ReviewCallDetailsDuxo.this;
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void setIssueDetailAndContent$feature_support_externalRelease(IssueDetail.Phone issueDetails, CxVoiceContent content) {
        String loggedOutPhoneNumber;
        String phoneNumber;
        String phoneNumber2;
        Intrinsics.checkNotNullParameter(issueDetails, "issueDetails");
        Intrinsics.checkNotNullParameter(content, "content");
        if (!issueDetails.getPhoneNumberEditable() && ((phoneNumber2 = issueDetails.getChannel().getPhoneNumber()) == null || StringsKt.isBlank(phoneNumber2))) {
            throw new IllegalStateException("We should never have a phone number uneditable and not provided");
        }
        if (issueDetails.getPhoneNumberEditable() && !this.authManager.isLoggedIn() && (((loggedOutPhoneNumber = ((ReviewCallDetailsFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getLoggedOutPhoneNumber()) == null || StringsKt.isBlank(loggedOutPhoneNumber)) && ((phoneNumber = issueDetails.getChannel().getPhoneNumber()) == null || StringsKt.isBlank(phoneNumber)))) {
            submit(ReviewCallDetailsEvent.NavigateToDefaultPhoneNumberEditor.INSTANCE);
        }
        applyMutation(new ReviewCallDetailsDuxo4(issueDetails, content, null));
    }

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo$fetchIssueDetail$2", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$fetchIssueDetail$2 */
    static final class C288952 extends ContinuationImpl7 implements Function2<ReviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C288952(Continuation<? super C288952> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C288952 c288952 = new C288952(continuation);
            c288952.L$0 = obj;
            return c288952;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReviewCallDetailsDataState reviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState> continuation) {
            return ((C288952) create(reviewCallDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ReviewCallDetailsDataState reviewCallDetailsDataState = (ReviewCallDetailsDataState) this.L$0;
            return reviewCallDetailsDataState.getIssueDetailLoadState() instanceof ReviewCallDetailsDataState.IssueDetailLoadState.Error ? ReviewCallDetailsDataState.copy$default(reviewCallDetailsDataState, ReviewCallDetailsDataState.IssueDetailLoadState.Loading.INSTANCE, null, false, null, null, 30, null) : reviewCallDetailsDataState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchIssueDetail(Continuation<? super Unit> continuation) {
        C288941 c288941;
        CxVoiceContent cxVoiceContent;
        if (continuation instanceof C288941) {
            c288941 = (C288941) continuation;
            int i = c288941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c288941.label = i - Integer.MIN_VALUE;
            } else {
                c288941 = new C288941(continuation);
            }
        }
        Object objLoadCxVoiceContent = c288941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c288941.label;
        try {
        } catch (Throwable th) {
            applyMutation(new C288963(th, null));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadCxVoiceContent);
            applyMutation(new C288952(null));
            c288941.label = 1;
            objLoadCxVoiceContent = loadCxVoiceContent(c288941);
            if (objLoadCxVoiceContent == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cxVoiceContent = (CxVoiceContent) c288941.L$0;
            ResultKt.throwOnFailure(objLoadCxVoiceContent);
            IssueDetail.Phone phone = (IssueDetail.Phone) objLoadCxVoiceContent;
            Intrinsics.checkNotNull(phone);
            setIssueDetailAndContent$feature_support_externalRelease(phone, cxVoiceContent);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objLoadCxVoiceContent);
        CxVoiceContent cxVoiceContent2 = (CxVoiceContent) objLoadCxVoiceContent;
        Single<IssueDetail.Phone> singleFetchPhoneIssueDetail = this.supportInquiryStore.fetchPhoneIssueDetail(((ReviewCallDetailsFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInquiryId());
        c288941.L$0 = cxVoiceContent2;
        c288941.label = 2;
        Object objAwait = RxAwait3.await(singleFetchPhoneIssueDetail, c288941);
        if (objAwait != coroutine_suspended) {
            cxVoiceContent = cxVoiceContent2;
            objLoadCxVoiceContent = objAwait;
            IssueDetail.Phone phone2 = (IssueDetail.Phone) objLoadCxVoiceContent;
            Intrinsics.checkNotNull(phone2);
            setIssueDetailAndContent$feature_support_externalRelease(phone2, cxVoiceContent);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo$fetchIssueDetail$3", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$fetchIssueDetail$3 */
    static final class C288963 extends ContinuationImpl7 implements Function2<ReviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Throwable f4973$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C288963(Throwable th, Continuation<? super C288963> continuation) {
            super(2, continuation);
            this.f4973$e = th;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C288963 c288963 = new C288963(this.f4973$e, continuation);
            c288963.L$0 = obj;
            return c288963;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReviewCallDetailsDataState reviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState> continuation) {
            return ((C288963) create(reviewCallDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ReviewCallDetailsDataState.copy$default((ReviewCallDetailsDataState) this.L$0, new ReviewCallDetailsDataState.IssueDetailLoadState.Error(this.f4973$e), null, false, null, null, 30, null);
        }
    }

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo$loadStaticContentAndSetIssueDetail$2", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$loadStaticContentAndSetIssueDetail$2 */
    static final class C288992 extends ContinuationImpl7 implements Function2<ReviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C288992(Continuation<? super C288992> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C288992 c288992 = new C288992(continuation);
            c288992.L$0 = obj;
            return c288992;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReviewCallDetailsDataState reviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState> continuation) {
            return ((C288992) create(reviewCallDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ReviewCallDetailsDataState.copy$default((ReviewCallDetailsDataState) this.L$0, ReviewCallDetailsDataState.IssueDetailLoadState.Loading.INSTANCE, null, false, null, null, 30, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadStaticContentAndSetIssueDetail(Continuation<? super Unit> continuation) {
        C288981 c288981;
        if (continuation instanceof C288981) {
            c288981 = (C288981) continuation;
            int i = c288981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c288981.label = i - Integer.MIN_VALUE;
            } else {
                c288981 = new C288981(continuation);
            }
        }
        Object objLoadCxVoiceContent = c288981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c288981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadCxVoiceContent);
            applyMutation(new C288992(null));
            c288981.label = 1;
            objLoadCxVoiceContent = loadCxVoiceContent(c288981);
            if (objLoadCxVoiceContent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoadCxVoiceContent);
        }
        CxVoiceContent cxVoiceContent = (CxVoiceContent) objLoadCxVoiceContent;
        IssueDetail.Phone issueDetail = ((ReviewCallDetailsFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getIssueDetail();
        if (issueDetail != null) {
            setIssueDetailAndContent$feature_support_externalRelease(issueDetail, cxVoiceContent);
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadCxVoiceContent(Continuation<? super CxVoiceContent> continuation) {
        C288971 c288971;
        if (continuation instanceof C288971) {
            c288971 = (C288971) continuation;
            int i = c288971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c288971.label = i - Integer.MIN_VALUE;
            } else {
                c288971 = new C288971(continuation);
            }
        }
        C288971 c2889712 = c288971;
        Object objLoadEntry$default = c2889712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2889712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadEntry$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            c2889712.label = 1;
            objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, CxVoiceContentIds.CX_VOICE_CONTENT_CONTENTFUL_ID, null, c2889712, 2, null);
            if (objLoadEntry$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoadEntry$default);
        }
        return ((EntryResource) objLoadEntry$default).getValue();
    }

    public final void createNewIssue() {
        withDataState(new Function1() { // from class: com.robinhood.android.support.call.ReviewCallDetailsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewCallDetailsDuxo.createNewIssue$lambda$1(this.f$0, (ReviewCallDetailsDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createNewIssue$lambda$1(ReviewCallDetailsDuxo reviewCallDetailsDuxo, ReviewCallDetailsDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        reviewCallDetailsDuxo.getLifecycleScope().launchWhenStarted(new ReviewCallDetailsDuxo2(reviewCallDetailsDuxo, it, null));
        return Unit.INSTANCE;
    }

    public final void onPhoneNumberChangedInIdenti() {
        Observable<UiProfileInfo> observableTake = this.profileInfoStore.streamProfileInfo().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.ReviewCallDetailsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewCallDetailsDuxo.onPhoneNumberChangedInIdenti$lambda$2(this.f$0, (UiProfileInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPhoneNumberChangedInIdenti$lambda$2(ReviewCallDetailsDuxo reviewCallDetailsDuxo, UiProfileInfo uiProfileInfo) {
        reviewCallDetailsDuxo.applyMutation(new ReviewCallDetailsDuxo3(uiProfileInfo, null));
        return Unit.INSTANCE;
    }

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo$onPhoneNumberChanged$1", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$onPhoneNumberChanged$1 */
    static final class C289011 extends ContinuationImpl7 implements Function2<ReviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState>, Object> {
        final /* synthetic */ String $phoneNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C289011(String str, Continuation<? super C289011> continuation) {
            super(2, continuation);
            this.$phoneNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C289011 c289011 = new C289011(this.$phoneNumber, continuation);
            c289011.L$0 = obj;
            return c289011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReviewCallDetailsDataState reviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState> continuation) {
            return ((C289011) create(reviewCallDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ReviewCallDetailsDataState.copy$default((ReviewCallDetailsDataState) this.L$0, null, null, false, this.$phoneNumber, null, 23, null);
        }
    }

    public final void onPhoneNumberChanged(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        applyMutation(new C289011(phoneNumber, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Issue.Phone asPhoneOrThrow(Issue issue) throws SupportInquiryStore2 {
        if (issue instanceof Issue.Phone) {
            return (Issue.Phone) issue;
        }
        throw new SupportInquiryStore2(ChannelType.PHONE, issue.getChannelType());
    }

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDuxo;", "Lcom/robinhood/shared/support/contracts/ReviewCallDetailsFragmentKey;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ReviewCallDetailsDuxo, ReviewCallDetailsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewCallDetailsFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (ReviewCallDetailsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewCallDetailsFragmentKey getArgs(ReviewCallDetailsDuxo reviewCallDetailsDuxo) {
            return (ReviewCallDetailsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, reviewCallDetailsDuxo);
        }
    }
}
