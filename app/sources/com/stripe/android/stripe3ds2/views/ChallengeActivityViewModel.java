package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import androidx.lifecycle.ViewModelProvider;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ChallengeActivityViewModel.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002VWB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001fJ\u0015\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b#\u0010\u001dJ\u0015\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0011R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0019028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u0010\u0011R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020$028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00104R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020$0\u000e8\u0006¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010\u0011R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00104R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020>0\u000e8\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010\u0011R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\u000e8\u0006¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u0010\u0011R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020(0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010ER\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020(0\u000e8\u0006¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bJ\u0010\u0011R\"\u0010K\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006X"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "imageCache", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/lifecycle/LiveData;", "", "getTimeout", "()Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "imageData", "", "densityDpi", "Landroid/graphics/Bitmap;", "getImage", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;I)Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "action", "", "submit", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;)V", "stopTimer", "()V", "onMemoryEvent", "onRefreshUi", "challengeAction", "onSubmitClicked", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "challengeResult", "onFinish", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "cres", "onNextScreen", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "Lcom/stripe/android/stripe3ds2/views/ImageRepository;", "imageRepository", "Lcom/stripe/android/stripe3ds2/views/ImageRepository;", "Landroidx/lifecycle/MutableLiveData;", "_refreshUi", "Landroidx/lifecycle/MutableLiveData;", "refreshUi", "Landroidx/lifecycle/LiveData;", "getRefreshUi", "_submitClicked", "submitClicked", "getSubmitClicked", "_shouldFinish", "shouldFinish", "getShouldFinish", "", "_challengeText", "challengeText", "getChallengeText", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "_challengeRequestResult", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;", "challengeRequestResult", "getChallengeRequestResult", "_nextScreen", "nextScreen", "getNextScreen", "shouldRefreshUi", "Z", "getShouldRefreshUi", "()Z", "setShouldRefreshUi", "(Z)V", "Lkotlinx/coroutines/Job;", "transactionTimerJob", "Lkotlinx/coroutines/Job;", "getTransactionTimerJob$3ds2sdk_release", "()Lkotlinx/coroutines/Job;", "Factory", "OnInactiveAwareMutableLiveData", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ChallengeActivityViewModel extends ViewModel {
    private final OnInactiveAwareMutableLiveData<ChallengeRequestResult> _challengeRequestResult;
    private final MutableLiveData<String> _challengeText;
    private final OnInactiveAwareMutableLiveData<ChallengeResponseData> _nextScreen;
    private final MutableLiveData<Unit> _refreshUi;
    private final MutableLiveData<ChallengeResult> _shouldFinish;
    private final MutableLiveData<ChallengeAction> _submitClicked;
    private final ChallengeActionHandler challengeActionHandler;
    private final LiveData<ChallengeRequestResult> challengeRequestResult;
    private final LiveData<String> challengeText;
    private final ImageCache imageCache;
    private final ImageRepository imageRepository;
    private final LiveData<ChallengeResponseData> nextScreen;
    private final LiveData<Unit> refreshUi;
    private final LiveData<ChallengeResult> shouldFinish;
    private boolean shouldRefreshUi;
    private final LiveData<ChallengeAction> submitClicked;
    private final TransactionTimer transactionTimer;
    private final Job transactionTimerJob;

    public /* synthetic */ ChallengeActivityViewModel(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, ImageCache imageCache, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(challengeActionHandler, transactionTimer, errorReporter, (i & 8) != 0 ? ImageCache.Default.INSTANCE : imageCache, coroutineContext);
    }

    public ChallengeActivityViewModel(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, ImageCache imageCache, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(challengeActionHandler, "challengeActionHandler");
        Intrinsics.checkNotNullParameter(transactionTimer, "transactionTimer");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.challengeActionHandler = challengeActionHandler;
        this.transactionTimer = transactionTimer;
        this.imageCache = imageCache;
        this.imageRepository = new ImageRepository(errorReporter, workContext);
        MutableLiveData<Unit> mutableLiveData = new MutableLiveData<>();
        this._refreshUi = mutableLiveData;
        this.refreshUi = mutableLiveData;
        MutableLiveData<ChallengeAction> mutableLiveData2 = new MutableLiveData<>();
        this._submitClicked = mutableLiveData2;
        this.submitClicked = mutableLiveData2;
        MutableLiveData<ChallengeResult> mutableLiveData3 = new MutableLiveData<>();
        this._shouldFinish = mutableLiveData3;
        this.shouldFinish = mutableLiveData3;
        MutableLiveData<String> mutableLiveData4 = new MutableLiveData<>();
        this._challengeText = mutableLiveData4;
        this.challengeText = mutableLiveData4;
        OnInactiveAwareMutableLiveData<ChallengeRequestResult> onInactiveAwareMutableLiveData = new OnInactiveAwareMutableLiveData<>();
        this._challengeRequestResult = onInactiveAwareMutableLiveData;
        this.challengeRequestResult = onInactiveAwareMutableLiveData;
        OnInactiveAwareMutableLiveData<ChallengeResponseData> onInactiveAwareMutableLiveData2 = new OnInactiveAwareMutableLiveData<>();
        this._nextScreen = onInactiveAwareMutableLiveData2;
        this.nextScreen = onInactiveAwareMutableLiveData2;
        this.transactionTimerJob = BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C426321(null), 3, null);
    }

    public final LiveData<Unit> getRefreshUi() {
        return this.refreshUi;
    }

    public final LiveData<ChallengeAction> getSubmitClicked() {
        return this.submitClicked;
    }

    public final LiveData<ChallengeResult> getShouldFinish() {
        return this.shouldFinish;
    }

    public final LiveData<String> getChallengeText() {
        return this.challengeText;
    }

    public final LiveData<ChallengeRequestResult> getChallengeRequestResult() {
        return this.challengeRequestResult;
    }

    public final LiveData<ChallengeResponseData> getNextScreen() {
        return this.nextScreen;
    }

    public final boolean getShouldRefreshUi() {
        return this.shouldRefreshUi;
    }

    public final void setShouldRefreshUi(boolean z) {
        this.shouldRefreshUi = z;
    }

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$1", m3645f = "ChallengeActivityViewModel.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$1 */
    static final class C426321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C426321(Continuation<? super C426321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChallengeActivityViewModel.this.new C426321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransactionTimer transactionTimer = ChallengeActivityViewModel.this.transactionTimer;
                this.label = 1;
                if (transactionTimer.start(this) == coroutine_suspended) {
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

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1", m3645f = "ChallengeActivityViewModel.kt", m3646l = {61, 60}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1 */
    static final class C426341 extends ContinuationImpl7 implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C426341(Continuation<? super C426341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C426341 c426341 = ChallengeActivityViewModel.this.new C426341(continuation);
            c426341.L$0 = obj;
            return c426341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C426341) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.L$0;
                Flow<Boolean> timeout = ChallengeActivityViewModel.this.transactionTimer.getTimeout();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.L$0 = liveDataScope;
                this.label = 1;
                obj = FlowKt.firstOrNull(timeout, anonymousClass1, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            liveDataScope = (LiveDataScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }

        /* compiled from: ChallengeActivityViewModel.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "", "isTimeout"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1$1", m3645f = "ChallengeActivityViewModel.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(this.Z$0);
            }
        }
    }

    public final LiveData<Boolean> getTimeout() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C426341(null), 3, (Object) null);
    }

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Landroid/graphics/Bitmap;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getImage$1", m3645f = "ChallengeActivityViewModel.kt", m3646l = {70, 69}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getImage$1 */
    static final class C426331 extends ContinuationImpl7 implements Function2<LiveDataScope<Bitmap>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $densityDpi;
        final /* synthetic */ ChallengeResponseData.Image $imageData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C426331(ChallengeResponseData.Image image, int i, Continuation<? super C426331> continuation) {
            super(2, continuation);
            this.$imageData = image;
            this.$densityDpi = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C426331 c426331 = ChallengeActivityViewModel.this.new C426331(this.$imageData, this.$densityDpi, continuation);
            c426331.L$0 = obj;
            return c426331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Bitmap> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C426331) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.L$0;
                ImageRepository imageRepository = ChallengeActivityViewModel.this.imageRepository;
                ChallengeResponseData.Image image = this.$imageData;
                String urlForDensity = image != null ? image.getUrlForDensity(this.$densityDpi) : null;
                this.L$0 = liveDataScope;
                this.label = 1;
                obj = imageRepository.getImage$3ds2sdk_release(urlForDensity, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            liveDataScope = (LiveDataScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    public final LiveData<Bitmap> getImage(ChallengeResponseData.Image imageData, int densityDpi) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C426331(imageData, densityDpi, null), 3, (Object) null);
    }

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$submit$1", m3645f = "ChallengeActivityViewModel.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$submit$1 */
    static final class C426351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChallengeAction $action;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C426351(ChallengeAction challengeAction, Continuation<? super C426351> continuation) {
            super(2, continuation);
            this.$action = challengeAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChallengeActivityViewModel.this.new C426351(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData2 = ChallengeActivityViewModel.this._challengeRequestResult;
                ChallengeActionHandler challengeActionHandler = ChallengeActivityViewModel.this.challengeActionHandler;
                ChallengeAction challengeAction = this.$action;
                this.L$0 = onInactiveAwareMutableLiveData2;
                this.label = 1;
                Object objSubmit = challengeActionHandler.submit(challengeAction, this);
                if (objSubmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
                onInactiveAwareMutableLiveData = onInactiveAwareMutableLiveData2;
                obj = objSubmit;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                onInactiveAwareMutableLiveData = (OnInactiveAwareMutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            onInactiveAwareMutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    public final void submit(ChallengeAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C426351(action, null), 3, null);
    }

    public final void stopTimer() {
        Job.DefaultImpls.cancel$default(this.transactionTimerJob, null, 1, null);
    }

    public final void onMemoryEvent() {
        this.imageCache.clear();
    }

    public final void onRefreshUi() {
        this._refreshUi.setValue(Unit.INSTANCE);
    }

    public final void onSubmitClicked(ChallengeAction challengeAction) {
        Intrinsics.checkNotNullParameter(challengeAction, "challengeAction");
        this._submitClicked.postValue(challengeAction);
    }

    public final void onFinish(ChallengeResult challengeResult) {
        Intrinsics.checkNotNullParameter(challengeResult, "challengeResult");
        this._shouldFinish.postValue(challengeResult);
    }

    public final void onNextScreen(ChallengeResponseData cres) {
        Intrinsics.checkNotNullParameter(cres, "cres");
        this._nextScreen.setValue(cres);
    }

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "()V", "onInactive", "", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class OnInactiveAwareMutableLiveData<T> extends MutableLiveData<T> {
        @Override // androidx.lifecycle.LiveData
        protected void onInactive() {
            super.onInactive();
            setValue(null);
        }
    }

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final ChallengeActionHandler challengeActionHandler;
        private final ErrorReporter errorReporter;
        private final TransactionTimer transactionTimer;
        private final CoroutineContext workContext;

        public Factory(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(challengeActionHandler, "challengeActionHandler");
            Intrinsics.checkNotNullParameter(transactionTimer, "transactionTimer");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.challengeActionHandler = challengeActionHandler;
            this.transactionTimer = transactionTimer;
            this.errorReporter = errorReporter;
            this.workContext = workContext;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new ChallengeActivityViewModel(this.challengeActionHandler, this.transactionTimer, this.errorReporter, null, this.workContext, 8, null);
        }
    }
}
