package com.robinhood.android.acats.history;

import acats_aggregation.service.p001v1.AcatsAggregationService;
import acats_aggregation.service.p001v1.FeeReimbursementsHistoryDetailsRequestDto;
import acats_aggregation.service.p001v1.FeeReimbursementsHistoryDetailsResponseDto;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.acats.contracts.AcatsReimbursementDetails;
import com.robinhood.android.acats.history.AcatsReimbursementDetailEvent;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore;
import com.robinhood.models.acats.p299db.bonfire.AcatsReimbursement;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: AcatsReimbursementDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001eB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/acats/history/AcatsReimbursementDetailDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/acats/history/AcatsReimbursementDetailViewState;", "Lcom/robinhood/android/acats/history/AcatsReimbursementDetailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lacats_aggregation/service/v1/AcatsAggregationService;", "acatsAggregationService", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsReimbursementStore;", "acatsReimbursementStore", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lacats_aggregation/service/v1/AcatsAggregationService;Lcom/robinhood/librobinhood/data/store/bonfire/AcatsReimbursementStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "accountNumber", "itemId", "j$/time/Instant", "completionDate", "", "fetchReimbursementDetails", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", "()V", "Lacats_aggregation/service/v1/AcatsAggregationService;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsReimbursementStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-acats-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsReimbursementDetailDuxo extends BaseDuxo5<AcatsReimbursementDetailViewState, AcatsReimbursementDetailEvent> implements HasSavedState {
    private final AcatsAggregationService acatsAggregationService;
    private final AcatsReimbursementStore acatsReimbursementStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsReimbursementDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.history.AcatsReimbursementDetailDuxo", m3645f = "AcatsReimbursementDetailDuxo.kt", m3646l = {49}, m3647m = "fetchReimbursementDetails")
    /* renamed from: com.robinhood.android.acats.history.AcatsReimbursementDetailDuxo$fetchReimbursementDetails$1 */
    static final class C74081 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C74081(Continuation<? super C74081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcatsReimbursementDetailDuxo.this.fetchReimbursementDetails(null, null, null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AcatsReimbursementDetailDuxo(AcatsAggregationService acatsAggregationService, AcatsReimbursementStore acatsReimbursementStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AcatsReimbursementDetailViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(acatsAggregationService, "acatsAggregationService");
        Intrinsics.checkNotNullParameter(acatsReimbursementStore, "acatsReimbursementStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.acatsAggregationService = acatsAggregationService;
        this.acatsReimbursementStore = acatsReimbursementStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C74101(null));
    }

    /* compiled from: AcatsReimbursementDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.history.AcatsReimbursementDetailDuxo$onStart$1", m3645f = "AcatsReimbursementDetailDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.history.AcatsReimbursementDetailDuxo$onStart$1 */
    static final class C74101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C74101(Continuation<? super C74101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsReimbursementDetailDuxo.this.new C74101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C74101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<AcatsReimbursement> reimbursementItem = AcatsReimbursementDetailDuxo.this.acatsReimbursementStore.getReimbursementItem(((AcatsReimbursementDetails) AcatsReimbursementDetailDuxo.INSTANCE.getArgs((HasSavedState) AcatsReimbursementDetailDuxo.this)).getId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsReimbursementDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(reimbursementItem, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: AcatsReimbursementDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/models/acats/db/bonfire/AcatsReimbursement;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acats.history.AcatsReimbursementDetailDuxo$onStart$1$1", m3645f = "AcatsReimbursementDetailDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acats.history.AcatsReimbursementDetailDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsReimbursement, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AcatsReimbursementDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsReimbursementDetailDuxo acatsReimbursementDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsReimbursementDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsReimbursement acatsReimbursement, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(acatsReimbursement, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AcatsReimbursement acatsReimbursement = (AcatsReimbursement) this.L$0;
                    AcatsReimbursementDetailDuxo acatsReimbursementDetailDuxo = this.this$0;
                    String accountNumber = acatsReimbursement.getAccountNumber();
                    String reimbursementId = acatsReimbursement.getReimbursementId();
                    Instant completionDate = acatsReimbursement.getCompletionDate();
                    this.label = 1;
                    if (acatsReimbursementDetailDuxo.fetchReimbursementDetails(accountNumber, reimbursementId, completionDate, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchReimbursementDetails(String str, String str2, Instant instant, Continuation<? super Unit> continuation) {
        C74081 c74081;
        if (continuation instanceof C74081) {
            c74081 = (C74081) continuation;
            int i = c74081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c74081.label = i - Integer.MIN_VALUE;
            } else {
                c74081 = new C74081(continuation);
            }
        }
        Object objFeeReimbursementsHistoryDetails = c74081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c74081.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFeeReimbursementsHistoryDetails);
                AcatsAggregationService acatsAggregationService = this.acatsAggregationService;
                FeeReimbursementsHistoryDetailsRequestDto feeReimbursementsHistoryDetailsRequestDto = new FeeReimbursementsHistoryDetailsRequestDto(str, str2);
                c74081.L$0 = instant;
                c74081.label = 1;
                objFeeReimbursementsHistoryDetails = acatsAggregationService.FeeReimbursementsHistoryDetails(feeReimbursementsHistoryDetailsRequestDto, c74081);
                if (objFeeReimbursementsHistoryDetails == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                instant = (Instant) c74081.L$0;
                ResultKt.throwOnFailure(objFeeReimbursementsHistoryDetails);
            }
            applyMutation(new C74092((FeeReimbursementsHistoryDetailsResponseDto) objFeeReimbursementsHistoryDetails, instant, null));
        } catch (Exception e) {
            submit(new AcatsReimbursementDetailEvent.Error(e));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsReimbursementDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/history/AcatsReimbursementDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.history.AcatsReimbursementDetailDuxo$fetchReimbursementDetails$2", m3645f = "AcatsReimbursementDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.history.AcatsReimbursementDetailDuxo$fetchReimbursementDetails$2 */
    static final class C74092 extends ContinuationImpl7 implements Function2<AcatsReimbursementDetailViewState, Continuation<? super AcatsReimbursementDetailViewState>, Object> {
        final /* synthetic */ Instant $completionDate;
        final /* synthetic */ FeeReimbursementsHistoryDetailsResponseDto $response;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C74092(FeeReimbursementsHistoryDetailsResponseDto feeReimbursementsHistoryDetailsResponseDto, Instant instant, Continuation<? super C74092> continuation) {
            super(2, continuation);
            this.$response = feeReimbursementsHistoryDetailsResponseDto;
            this.$completionDate = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74092 c74092 = new C74092(this.$response, this.$completionDate, continuation);
            c74092.L$0 = obj;
            return c74092;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsReimbursementDetailViewState acatsReimbursementDetailViewState, Continuation<? super AcatsReimbursementDetailViewState> continuation) {
            return ((C74092) create(acatsReimbursementDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((AcatsReimbursementDetailViewState) this.L$0).copy(this.$response, this.$completionDate);
        }
    }

    /* compiled from: AcatsReimbursementDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/history/AcatsReimbursementDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acats/history/AcatsReimbursementDetailDuxo;", "Lcom/robinhood/android/acats/contracts/AcatsReimbursementDetails;", "<init>", "()V", "feature-acats-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsReimbursementDetailDuxo, AcatsReimbursementDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsReimbursementDetails getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsReimbursementDetails) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsReimbursementDetails getArgs(AcatsReimbursementDetailDuxo acatsReimbursementDetailDuxo) {
            return (AcatsReimbursementDetails) DuxoCompanion.DefaultImpls.getArgs(this, acatsReimbursementDetailDuxo);
        }
    }
}
