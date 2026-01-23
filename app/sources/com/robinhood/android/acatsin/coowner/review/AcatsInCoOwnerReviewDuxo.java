package com.robinhood.android.acatsin.coowner.review;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.acats.p027v1.AcatsService;
import bonfire.proto.idl.acats.p027v1.CancelPendingJointAccountACATSRequestDto;
import com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewContract;
import com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewState2;
import com.robinhood.android.acatsin.util.names.FetchAccountNamesUseCase;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: AcatsInCoOwnerReviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001!BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDataState;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "fetchAccountNamesUseCase", "Lcom/robinhood/android/acatsin/util/names/FetchAccountNamesUseCase;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "acatsService", "Lbonfire/proto/idl/acats/v1/AcatsService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;Lcom/robinhood/android/acatsin/util/names/FetchAccountNamesUseCase;Lcom/robinhood/android/lib/account/AccountProvider;Lbonfire/proto/idl/acats/v1/AcatsService;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onCancelAcatRequest", "acatId", "Ljava/util/UUID;", "isCancelRequestInProgress", "", "coOwnerName", "", "Companion", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInCoOwnerReviewDuxo extends BaseDuxo3<AcatsInCoOwnerReviewDataState, AcatsInCoOwnerReviewState5, AcatsInCoOwnerReviewState2> implements HasSavedState {
    private final AcatsService acatsService;
    private final AcatsTransferStore acatsTransferStore;
    private final AccountProvider accountProvider;
    private final FetchAccountNamesUseCase fetchAccountNamesUseCase;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInCoOwnerReviewDuxo(AcatsTransferStore acatsTransferStore, FetchAccountNamesUseCase fetchAccountNamesUseCase, AccountProvider accountProvider, AcatsService acatsService, SavedStateHandle savedStateHandle, AcatsInCoOwnerReviewState4 stateProvider, DuxoBundle duxoBundle) {
        super(new AcatsInCoOwnerReviewDataState(null, null, null, false, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
        Intrinsics.checkNotNullParameter(fetchAccountNamesUseCase, "fetchAccountNamesUseCase");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(acatsService, "acatsService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsTransferStore = acatsTransferStore;
        this.fetchAccountNamesUseCase = fetchAccountNamesUseCase;
        this.accountProvider = accountProvider;
        this.acatsService = acatsService;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C78951(FlowKt.shareIn(this.acatsTransferStore.streamAcatsTransfer(((AcatsInCoOwnerReviewContract.Key) INSTANCE.getArgs((HasSavedState) this)).getAcatsId()), getLifecycleScope(), SharingStarted.INSTANCE.getEagerly(), 1), null));
    }

    /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1 */
    static final class C78951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<AcatsTransfer> $acatsTransferFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C78951(SharedFlow<AcatsTransfer> sharedFlow, Continuation<? super C78951> continuation) {
            super(2, continuation);
            this.$acatsTransferFlow = sharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C78951 c78951 = AcatsInCoOwnerReviewDuxo.this.new C78951(this.$acatsTransferFlow, continuation);
            c78951.L$0 = obj;
            return c78951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C78951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                AcatsInCoOwnerReviewDuxo.this.acatsTransferStore.refresh(true);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$acatsTransferFlow, AcatsInCoOwnerReviewDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$acatsTransferFlow, AcatsInCoOwnerReviewDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.$acatsTransferFlow, AcatsInCoOwnerReviewDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$1", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {59}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<AcatsTransfer> $acatsTransferFlow;
            int label;
            final /* synthetic */ AcatsInCoOwnerReviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<AcatsTransfer> sharedFlow, AcatsInCoOwnerReviewDuxo acatsInCoOwnerReviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$acatsTransferFlow = sharedFlow;
                this.this$0 = acatsInCoOwnerReviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$acatsTransferFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "acatsTransfer", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$1$1", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495021 extends ContinuationImpl7 implements Function2<AcatsTransfer, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AcatsInCoOwnerReviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495021(AcatsInCoOwnerReviewDuxo acatsInCoOwnerReviewDuxo, Continuation<? super C495021> continuation) {
                    super(2, continuation);
                    this.this$0 = acatsInCoOwnerReviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495021 c495021 = new C495021(this.this$0, continuation);
                    c495021.L$0 = obj;
                    return c495021;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AcatsTransfer acatsTransfer, Continuation<? super Unit> continuation) {
                    return ((C495021) create(acatsTransfer, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$1$1$1", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495031 extends ContinuationImpl7 implements Function2<AcatsInCoOwnerReviewDataState, Continuation<? super AcatsInCoOwnerReviewDataState>, Object> {
                    final /* synthetic */ AcatsTransfer $acatsTransfer;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495031(AcatsTransfer acatsTransfer, Continuation<? super C495031> continuation) {
                        super(2, continuation);
                        this.$acatsTransfer = acatsTransfer;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495031 c495031 = new C495031(this.$acatsTransfer, continuation);
                        c495031.L$0 = obj;
                        return c495031;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AcatsInCoOwnerReviewDataState acatsInCoOwnerReviewDataState, Continuation<? super AcatsInCoOwnerReviewDataState> continuation) {
                        return ((C495031) create(acatsInCoOwnerReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AcatsInCoOwnerReviewDataState.copy$default((AcatsInCoOwnerReviewDataState) this.L$0, this.$acatsTransfer, null, null, false, 14, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495031((AcatsTransfer) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<AcatsTransfer> sharedFlow = this.$acatsTransferFlow;
                    C495021 c495021 = new C495021(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c495021, this) == coroutine_suspended) {
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

        /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$2", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<AcatsTransfer> $acatsTransferFlow;
            int label;
            final /* synthetic */ AcatsInCoOwnerReviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<AcatsTransfer> sharedFlow, AcatsInCoOwnerReviewDuxo acatsInCoOwnerReviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$acatsTransferFlow = sharedFlow;
                this.this$0 = acatsInCoOwnerReviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$acatsTransferFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final SharedFlow<AcatsTransfer> sharedFlow = this.$acatsTransferFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<String>() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    String rhsAccountNumber = ((AcatsTransfer) obj).getRhsAccountNumber();
                                    if (rhsAccountNumber != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(rhsAccountNumber, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }, new C7890x4b435508(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$2$3", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AcatsInCoOwnerReviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(AcatsInCoOwnerReviewDuxo acatsInCoOwnerReviewDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = acatsInCoOwnerReviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$2$3$1", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInCoOwnerReviewDataState, Continuation<? super AcatsInCoOwnerReviewDataState>, Object> {
                    final /* synthetic */ Account $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$account = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$account, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AcatsInCoOwnerReviewDataState acatsInCoOwnerReviewDataState, Continuation<? super AcatsInCoOwnerReviewDataState> continuation) {
                        return ((AnonymousClass1) create(acatsInCoOwnerReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AcatsInCoOwnerReviewDataState.copy$default((AcatsInCoOwnerReviewDataState) this.L$0, null, this.$account, null, false, 13, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {84}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<AcatsTransfer> $acatsTransferFlow;
            int label;
            final /* synthetic */ AcatsInCoOwnerReviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SharedFlow<AcatsTransfer> sharedFlow, AcatsInCoOwnerReviewDuxo acatsInCoOwnerReviewDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$acatsTransferFlow = sharedFlow;
                this.this$0 = acatsInCoOwnerReviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$acatsTransferFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final SharedFlow<AcatsTransfer> sharedFlow = this.$acatsTransferFlow;
                    Flow flowMapLatest = FlowKt.mapLatest(new Flow<String>() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    String rhsAccountNumber = ((AcatsTransfer) obj).getRhsAccountNumber();
                                    if (rhsAccountNumber != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(rhsAccountNumber, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }, new AnonymousClass2(this.this$0, null));
                    C495043 c495043 = new C495043(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowMapLatest, c495043, this) == coroutine_suspended) {
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

            /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "rhsAccountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3$2", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {79}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<String, Continuation<? super NamesOnAccount>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AcatsInCoOwnerReviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AcatsInCoOwnerReviewDuxo acatsInCoOwnerReviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = acatsInCoOwnerReviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super NamesOnAccount> continuation) {
                    return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    FetchAccountNamesUseCase fetchAccountNamesUseCase = this.this$0.fetchAccountNamesUseCase;
                    BrokerageAccountType brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
                    this.label = 1;
                    Object objInvoke = fetchAccountNamesUseCase.invoke(str, brokerageAccountType, this);
                    return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
                }
            }

            /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "namesOnAccount", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3$3", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3$3, reason: invalid class name and collision with other inner class name */
            static final class C495043 extends ContinuationImpl7 implements Function2<NamesOnAccount, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AcatsInCoOwnerReviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495043(AcatsInCoOwnerReviewDuxo acatsInCoOwnerReviewDuxo, Continuation<? super C495043> continuation) {
                    super(2, continuation);
                    this.this$0 = acatsInCoOwnerReviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495043 c495043 = new C495043(this.this$0, continuation);
                    c495043.L$0 = obj;
                    return c495043;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(NamesOnAccount namesOnAccount, Continuation<? super Unit> continuation) {
                    return ((C495043) create(namesOnAccount, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3$3$1", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCreate$1$3$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInCoOwnerReviewDataState, Continuation<? super AcatsInCoOwnerReviewDataState>, Object> {
                    final /* synthetic */ NamesOnAccount $namesOnAccount;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(NamesOnAccount namesOnAccount, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$namesOnAccount = namesOnAccount;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$namesOnAccount, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AcatsInCoOwnerReviewDataState acatsInCoOwnerReviewDataState, Continuation<? super AcatsInCoOwnerReviewDataState> continuation) {
                        return ((AnonymousClass1) create(acatsInCoOwnerReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AcatsInCoOwnerReviewDataState.copy$default((AcatsInCoOwnerReviewDataState) this.L$0, null, null, this.$namesOnAccount, false, 11, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((NamesOnAccount) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCancelAcatRequest$1", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCancelAcatRequest$1 */
    static final class C78931 extends ContinuationImpl7 implements Function2<AcatsInCoOwnerReviewDataState, Continuation<? super AcatsInCoOwnerReviewDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C78931(Continuation<? super C78931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C78931 c78931 = new C78931(continuation);
            c78931.L$0 = obj;
            return c78931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInCoOwnerReviewDataState acatsInCoOwnerReviewDataState, Continuation<? super AcatsInCoOwnerReviewDataState> continuation) {
            return ((C78931) create(acatsInCoOwnerReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInCoOwnerReviewDataState.copy$default((AcatsInCoOwnerReviewDataState) this.L$0, null, null, null, true, 7, null);
        }
    }

    public final void onCancelAcatRequest(UUID acatId, boolean isCancelRequestInProgress, String coOwnerName) {
        Intrinsics.checkNotNullParameter(acatId, "acatId");
        Intrinsics.checkNotNullParameter(coOwnerName, "coOwnerName");
        if (isCancelRequestInProgress) {
            return;
        }
        applyMutation(new C78931(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C78942(acatId, coOwnerName, null), 3, null);
    }

    /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCancelAcatRequest$2", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {102}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCancelAcatRequest$2 */
    static final class C78942 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $acatId;
        final /* synthetic */ String $coOwnerName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C78942(UUID uuid, String str, Continuation<? super C78942> continuation) {
            super(2, continuation);
            this.$acatId = uuid;
            this.$coOwnerName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInCoOwnerReviewDuxo.this.new C78942(this.$acatId, this.$coOwnerName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C78942) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AcatsInCoOwnerReviewDuxo acatsInCoOwnerReviewDuxo;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AcatsService acatsService = AcatsInCoOwnerReviewDuxo.this.acatsService;
                    String string2 = this.$acatId.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    CancelPendingJointAccountACATSRequestDto cancelPendingJointAccountACATSRequestDto = new CancelPendingJointAccountACATSRequestDto(string2);
                    this.label = 1;
                    if (acatsService.CancelPendingJointAccountACATS(cancelPendingJointAccountACATSRequestDto, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AcatsInCoOwnerReviewDuxo.this.submit(new AcatsInCoOwnerReviewState2.AcatRequestCancelled(this.$coOwnerName));
                acatsInCoOwnerReviewDuxo = AcatsInCoOwnerReviewDuxo.this;
                anonymousClass1 = new AnonymousClass1(null);
            } catch (Throwable th) {
                try {
                    Throwables.rethrowIfNotNetworkRelated(th);
                    acatsInCoOwnerReviewDuxo = AcatsInCoOwnerReviewDuxo.this;
                    anonymousClass1 = new AnonymousClass1(null);
                } catch (Throwable th2) {
                    AcatsInCoOwnerReviewDuxo.this.applyMutation(new AnonymousClass1(null));
                    throw th2;
                }
            }
            acatsInCoOwnerReviewDuxo.applyMutation(anonymousClass1);
            return Unit.INSTANCE;
        }

        /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCancelAcatRequest$2$1", m3645f = "AcatsInCoOwnerReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewDuxo$onCancelAcatRequest$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInCoOwnerReviewDataState, Continuation<? super AcatsInCoOwnerReviewDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInCoOwnerReviewDataState acatsInCoOwnerReviewDataState, Continuation<? super AcatsInCoOwnerReviewDataState> continuation) {
                return ((AnonymousClass1) create(acatsInCoOwnerReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AcatsInCoOwnerReviewDataState.copy$default((AcatsInCoOwnerReviewDataState) this.L$0, null, null, null, false, 7, null);
            }
        }
    }

    /* compiled from: AcatsInCoOwnerReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDuxo;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewContract$Key;", "<init>", "()V", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInCoOwnerReviewDuxo, AcatsInCoOwnerReviewContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInCoOwnerReviewContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInCoOwnerReviewContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInCoOwnerReviewContract.Key getArgs(AcatsInCoOwnerReviewDuxo acatsInCoOwnerReviewDuxo) {
            return (AcatsInCoOwnerReviewContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInCoOwnerReviewDuxo);
        }
    }
}
