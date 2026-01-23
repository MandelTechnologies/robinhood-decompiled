package com.robinhood.android.internalassettransfers.history;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.assettransfers.contracts.InternalAssetTransferHistory;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryEvent;
import com.robinhood.android.internalassettransfers.history.models.UiAssetTransferRecord;
import com.robinhood.android.internalassettransfers.history.models.UiAssetTransferRecord2;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.internalassettransfers.p193db.AssetTransferRecord;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.jointaccounts.api.users.ApiJointUsers;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: InternalAssetTransferHistoryDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001#BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\b\u0010 \u001a\u00020\u001cH\u0002J\u0006\u0010!\u001a\u00020\u001cJ\u0006\u0010\"\u001a\u00020\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "internalAssetTransfersStore", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "jointAccountsApi", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "assetTransferRecordFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/internalassettransfers/history/models/UiAssetTransferRecord;", "onStart", "", "dismissDialog", "showDialog", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "loadRequest", "cancelRequest", "showAssetList", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InternalAssetTransferHistoryDuxo extends BaseDuxo3<InternalAssetTransferHistoryDataState, InternalAssetTransferHistoryViewState, InternalAssetTransferHistoryEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final StateFlow2<UiAssetTransferRecord> assetTransferRecordFlow;
    private final InternalAssetTransfersStore internalAssetTransfersStore;
    private final JointAccountsApi jointAccountsApi;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalAssetTransferHistoryDuxo(InternalAssetTransfersStore internalAssetTransfersStore, JointAccountsApi jointAccountsApi, UserStore userStore, AccountProvider accountProvider, InternalAssetTransferHistoryStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new InternalAssetTransferHistoryDataState(((InternalAssetTransferHistory) INSTANCE.getArgs(savedStateHandle)).getAssetTransferUuid(), null, false, null, false, null, null, null, null, 510, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
        Intrinsics.checkNotNullParameter(jointAccountsApi, "jointAccountsApi");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.internalAssetTransfersStore = internalAssetTransfersStore;
        this.jointAccountsApi = jointAccountsApi;
        this.userStore = userStore;
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
        this.assetTransferRecordFlow = StateFlow4.MutableStateFlow(null);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.CREATED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C191961(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C191972(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C191983(null));
        LifecycleHostCoroutineScope lifecycleScope2 = getLifecycleScope();
        LifecycleState lifecycleState2 = LifecycleState.STARTED;
        lifecycleScope2.repeatOnLifecycle(lifecycleState2, new C191994(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState2, new C192005(null));
    }

    /* compiled from: InternalAssetTransferHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$1 */
    static final class C191961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C191961(Continuation<? super C191961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferHistoryDuxo.this.new C191961(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C191961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InternalAssetTransferHistoryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/internalassettransfers/history/models/UiAssetTransferRecord;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$1$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiAssetTransferRecord, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternalAssetTransferHistoryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternalAssetTransferHistoryDuxo internalAssetTransferHistoryDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferHistoryDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiAssetTransferRecord uiAssetTransferRecord, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiAssetTransferRecord, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternalAssetTransferHistoryDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$1$1$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502221 extends ContinuationImpl7 implements Function2<InternalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState>, Object> {
                final /* synthetic */ UiAssetTransferRecord $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502221(UiAssetTransferRecord uiAssetTransferRecord, Continuation<? super C502221> continuation) {
                    super(2, continuation);
                    this.$it = uiAssetTransferRecord;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502221 c502221 = new C502221(this.$it, continuation);
                    c502221.L$0 = obj;
                    return c502221;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternalAssetTransferHistoryDataState internalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState> continuation) {
                    return ((C502221) create(internalAssetTransferHistoryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternalAssetTransferHistoryDataState.copy$default((InternalAssetTransferHistoryDataState) this.L$0, null, this.$it, false, null, false, null, null, null, null, 509, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502221((UiAssetTransferRecord) this.L$0, null));
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
                StateFlow2 stateFlow2 = InternalAssetTransferHistoryDuxo.this.assetTransferRecordFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternalAssetTransferHistoryDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow2, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: InternalAssetTransferHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$2", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {88}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$2 */
    static final class C191972 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C191972(Continuation<? super C191972> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferHistoryDuxo.this.new C191972(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C191972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowMapLatest = FlowKt.mapLatest(FlowKt.filterNotNull(InternalAssetTransferHistoryDuxo.this.assetTransferRecordFlow), new AnonymousClass1(InternalAssetTransferHistoryDuxo.this, null));
                this.label = 1;
                if (FlowKt.collect(flowMapLatest, this) == coroutine_suspended) {
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

        /* compiled from: InternalAssetTransferHistoryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/internalassettransfers/history/models/UiAssetTransferRecord;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$2$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {83}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiAssetTransferRecord, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternalAssetTransferHistoryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternalAssetTransferHistoryDuxo internalAssetTransferHistoryDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferHistoryDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiAssetTransferRecord uiAssetTransferRecord, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiAssetTransferRecord, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                String sinkRhfAccountNumber;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UiAssetTransferRecord uiAssetTransferRecord = (UiAssetTransferRecord) this.L$0;
                    BrokerageAccountType sourceBrokerageAccountType = uiAssetTransferRecord.getSourceBrokerageAccountType();
                    BrokerageAccountType brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
                    boolean z = false;
                    boolean z2 = sourceBrokerageAccountType == brokerageAccountType && !uiAssetTransferRecord.isSinkOwner();
                    if (uiAssetTransferRecord.getSinkBrokerageAccountType() == brokerageAccountType && !uiAssetTransferRecord.isSourceOwner()) {
                        z = true;
                    }
                    if (z2) {
                        sinkRhfAccountNumber = uiAssetTransferRecord.getSourceRhfAccountNumber();
                    } else {
                        sinkRhfAccountNumber = z ? uiAssetTransferRecord.getSinkRhfAccountNumber() : null;
                    }
                    if ((z || z2) && sinkRhfAccountNumber != null) {
                        JointAccountsApi jointAccountsApi = this.this$0.jointAccountsApi;
                        this.label = 1;
                        obj = jointAccountsApi.getJointUsers(sinkRhfAccountNumber, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C502231((ApiJointUsers) obj, null));
                return Unit.INSTANCE;
            }

            /* compiled from: InternalAssetTransferHistoryDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$2$1$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502231 extends ContinuationImpl7 implements Function2<InternalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState>, Object> {
                final /* synthetic */ ApiJointUsers $jointUsers;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502231(ApiJointUsers apiJointUsers, Continuation<? super C502231> continuation) {
                    super(2, continuation);
                    this.$jointUsers = apiJointUsers;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502231 c502231 = new C502231(this.$jointUsers, continuation);
                    c502231.L$0 = obj;
                    return c502231;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternalAssetTransferHistoryDataState internalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState> continuation) {
                    return ((C502231) create(internalAssetTransferHistoryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternalAssetTransferHistoryDataState.copy$default((InternalAssetTransferHistoryDataState) this.L$0, null, null, false, null, false, this.$jointUsers, null, null, null, 479, null);
                }
            }
        }
    }

    /* compiled from: InternalAssetTransferHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$3", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {92}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$3 */
    static final class C191983 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C191983(Continuation<? super C191983> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferHistoryDuxo.this.new C191983(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C191983) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InternalAssetTransferHistoryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$3$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<User, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternalAssetTransferHistoryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternalAssetTransferHistoryDuxo internalAssetTransferHistoryDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferHistoryDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(User user, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(user, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternalAssetTransferHistoryDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$3$1$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502241 extends ContinuationImpl7 implements Function2<InternalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState>, Object> {
                final /* synthetic */ User $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502241(User user, Continuation<? super C502241> continuation) {
                    super(2, continuation);
                    this.$it = user;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502241 c502241 = new C502241(this.$it, continuation);
                    c502241.L$0 = obj;
                    return c502241;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternalAssetTransferHistoryDataState internalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState> continuation) {
                    return ((C502241) create(internalAssetTransferHistoryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternalAssetTransferHistoryDataState.copy$default((InternalAssetTransferHistoryDataState) this.L$0, null, null, false, null, false, null, this.$it.getId(), null, null, 447, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502241((User) this.L$0, null));
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
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(InternalAssetTransferHistoryDuxo.this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternalAssetTransferHistoryDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: InternalAssetTransferHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$4", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {107}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$4 */
    static final class C191994 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C191994(Continuation<? super C191994> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferHistoryDuxo.this.new C191994(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C191994) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.mapLatest(FlowKt.filterNotNull(InternalAssetTransferHistoryDuxo.this.assetTransferRecordFlow), new AnonymousClass1(null)), new C19194x3c727890(null, InternalAssetTransferHistoryDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(InternalAssetTransferHistoryDuxo.this, null);
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

        /* compiled from: InternalAssetTransferHistoryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/internalassettransfers/history/models/UiAssetTransferRecord;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$4$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiAssetTransferRecord, Continuation<? super String>, Object> {
            /* synthetic */ Object L$0;
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
            public final Object invoke(UiAssetTransferRecord uiAssetTransferRecord, Continuation<? super String> continuation) {
                return ((AnonymousClass1) create(uiAssetTransferRecord, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((UiAssetTransferRecord) this.L$0).getSourceRhfAccountNumber();
            }
        }

        /* compiled from: InternalAssetTransferHistoryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$4$3", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$4$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternalAssetTransferHistoryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(InternalAssetTransferHistoryDuxo internalAssetTransferHistoryDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferHistoryDuxo;
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

            /* compiled from: InternalAssetTransferHistoryDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$4$3$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState>, Object> {
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
                public final Object invoke(InternalAssetTransferHistoryDataState internalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState> continuation) {
                    return ((AnonymousClass1) create(internalAssetTransferHistoryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternalAssetTransferHistoryDataState.copy$default((InternalAssetTransferHistoryDataState) this.L$0, null, null, false, null, false, null, null, this.$account, null, 383, null);
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

    /* compiled from: InternalAssetTransferHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$5", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$5 */
    static final class C192005 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C192005(Continuation<? super C192005> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferHistoryDuxo.this.new C192005(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C192005) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.mapLatest(FlowKt.filterNotNull(InternalAssetTransferHistoryDuxo.this.assetTransferRecordFlow), new AnonymousClass1(null)), new C19195x9390696f(null, InternalAssetTransferHistoryDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(InternalAssetTransferHistoryDuxo.this, null);
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

        /* compiled from: InternalAssetTransferHistoryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/internalassettransfers/history/models/UiAssetTransferRecord;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$5$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiAssetTransferRecord, Continuation<? super String>, Object> {
            /* synthetic */ Object L$0;
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
            public final Object invoke(UiAssetTransferRecord uiAssetTransferRecord, Continuation<? super String> continuation) {
                return ((AnonymousClass1) create(uiAssetTransferRecord, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((UiAssetTransferRecord) this.L$0).getSinkRhfAccountNumber();
            }
        }

        /* compiled from: InternalAssetTransferHistoryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$5$3", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$5$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternalAssetTransferHistoryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(InternalAssetTransferHistoryDuxo internalAssetTransferHistoryDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferHistoryDuxo;
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

            /* compiled from: InternalAssetTransferHistoryDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$5$3$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$5$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState>, Object> {
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
                public final Object invoke(InternalAssetTransferHistoryDataState internalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState> continuation) {
                    return ((AnonymousClass1) create(internalAssetTransferHistoryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternalAssetTransferHistoryDataState.copy$default((InternalAssetTransferHistoryDataState) this.L$0, null, null, false, null, false, null, null, null, this.$account, 255, null);
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        loadRequest();
    }

    /* compiled from: InternalAssetTransferHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$dismissDialog$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$dismissDialog$1 */
    static final class C192021 extends ContinuationImpl7 implements Function2<InternalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C192021(Continuation<? super C192021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C192021 c192021 = new C192021(continuation);
            c192021.L$0 = obj;
            return c192021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferHistoryDataState internalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState> continuation) {
            return ((C192021) create(internalAssetTransferHistoryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferHistoryDataState.copy$default((InternalAssetTransferHistoryDataState) this.L$0, null, null, false, null, false, null, null, null, null, 507, null);
        }
    }

    public final void dismissDialog() {
        applyMutation(new C192021(null));
    }

    /* compiled from: InternalAssetTransferHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$showDialog$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$showDialog$1 */
    static final class C192041 extends ContinuationImpl7 implements Function2<InternalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C192041(Continuation<? super C192041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C192041 c192041 = new C192041(continuation);
            c192041.L$0 = obj;
            return c192041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferHistoryDataState internalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState> continuation) {
            return ((C192041) create(internalAssetTransferHistoryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferHistoryDataState.copy$default((InternalAssetTransferHistoryDataState) this.L$0, null, null, true, null, false, null, null, null, null, 507, null);
        }
    }

    public final void showDialog() {
        applyMutation(new C192041(null));
    }

    public final void retry() {
        loadRequest();
    }

    /* compiled from: InternalAssetTransferHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$loadRequest$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {147}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$loadRequest$1 */
    static final class C192031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C192031(Continuation<? super C192031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferHistoryDuxo.this.new C192031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C192031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    InternalAssetTransfersStore internalAssetTransfersStore = InternalAssetTransferHistoryDuxo.this.internalAssetTransfersStore;
                    String string2 = ((InternalAssetTransferHistory) InternalAssetTransferHistoryDuxo.INSTANCE.getArgs(InternalAssetTransferHistoryDuxo.this.getSavedStateHandle())).getAssetTransferUuid().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    this.label = 1;
                    obj = internalAssetTransfersStore.getAssetTransferDetails(string2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                UiAssetTransferRecord uiModel = UiAssetTransferRecord2.toUiModel((AssetTransferRecord) obj);
                StateFlow2 stateFlow2 = InternalAssetTransferHistoryDuxo.this.assetTransferRecordFlow;
                do {
                    value = stateFlow2.getValue();
                } while (!stateFlow2.compareAndSet(value, uiModel));
            } catch (Exception e) {
                if (Throwables.isNetworkRelated(e)) {
                    InternalAssetTransferHistoryDuxo.this.applyMutation(new AnonymousClass2(e, null));
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: InternalAssetTransferHistoryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$loadRequest$1$2", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$loadRequest$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InternalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState>, Object> {
            final /* synthetic */ Exception $exception;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$exception = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$exception, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InternalAssetTransferHistoryDataState internalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState> continuation) {
                return ((AnonymousClass2) create(internalAssetTransferHistoryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InternalAssetTransferHistoryDataState.copy$default((InternalAssetTransferHistoryDataState) this.L$0, null, null, false, this.$exception, false, null, null, null, null, 503, null);
            }
        }
    }

    private final void loadRequest() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C192031(null), 3, null);
    }

    /* compiled from: InternalAssetTransferHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$cancelRequest$1", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$cancelRequest$1 */
    static final class C192011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C192011(Continuation<? super C192011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferHistoryDuxo.this.new C192011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C192011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    InternalAssetTransfersStore internalAssetTransfersStore = InternalAssetTransferHistoryDuxo.this.internalAssetTransfersStore;
                    String string2 = ((InternalAssetTransferHistory) InternalAssetTransferHistoryDuxo.INSTANCE.getArgs(InternalAssetTransferHistoryDuxo.this.getSavedStateHandle())).getAssetTransferUuid().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    this.label = 1;
                    obj = internalAssetTransfersStore.cancelAssetTransfer(string2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                UiAssetTransferRecord uiModel = UiAssetTransferRecord2.toUiModel((AssetTransferRecord) obj);
                StateFlow2 stateFlow2 = InternalAssetTransferHistoryDuxo.this.assetTransferRecordFlow;
                do {
                    value = stateFlow2.getValue();
                } while (!stateFlow2.compareAndSet(value, uiModel));
            } catch (Exception e) {
                if (Throwables.isNetworkRelated(e)) {
                    InternalAssetTransferHistoryDuxo.this.applyMutation(new AnonymousClass2(e, null));
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: InternalAssetTransferHistoryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$cancelRequest$1$2", m3645f = "InternalAssetTransferHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$cancelRequest$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InternalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState>, Object> {
            final /* synthetic */ Exception $exception;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$exception = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$exception, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InternalAssetTransferHistoryDataState internalAssetTransferHistoryDataState, Continuation<? super InternalAssetTransferHistoryDataState> continuation) {
                return ((AnonymousClass2) create(internalAssetTransferHistoryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InternalAssetTransferHistoryDataState.copy$default((InternalAssetTransferHistoryDataState) this.L$0, null, null, false, this.$exception, false, null, null, null, null, 503, null);
            }
        }
    }

    public final void cancelRequest() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C192011(null), 3, null);
    }

    public final void showAssetList() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferHistoryDuxo.showAssetList$lambda$0(this.f$0, (InternalAssetTransferHistoryDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAssetList$lambda$0(InternalAssetTransferHistoryDuxo internalAssetTransferHistoryDuxo, InternalAssetTransferHistoryDataState it) {
        UiAssets eligibleAssets;
        Intrinsics.checkNotNullParameter(it, "it");
        UiAssetTransferRecord assetTransferRecord = it.getAssetTransferRecord();
        if (assetTransferRecord == null || (eligibleAssets = assetTransferRecord.getEligibleAssets()) == null) {
            return Unit.INSTANCE;
        }
        internalAssetTransferHistoryDuxo.submit(new InternalAssetTransferHistoryEvent.NavigateToAssetList(eligibleAssets));
        return Unit.INSTANCE;
    }

    /* compiled from: InternalAssetTransferHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDuxo;", "Lcom/robinhood/android/assettransfers/contracts/InternalAssetTransferHistory;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InternalAssetTransferHistoryDuxo, InternalAssetTransferHistory> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferHistory getArgs(SavedStateHandle savedStateHandle) {
            return (InternalAssetTransferHistory) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferHistory getArgs(InternalAssetTransferHistoryDuxo internalAssetTransferHistoryDuxo) {
            return (InternalAssetTransferHistory) DuxoCompanion.DefaultImpls.getArgs(this, internalAssetTransferHistoryDuxo);
        }
    }
}
