package com.robinhood.android.history.p153ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.history.p153ui.AchTransferDetailDuxo;
import com.robinhood.android.history.p153ui.AchTransferDetailFragment;
import com.robinhood.android.history.p153ui.AchTransferDetailViewState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.transfer.shared.AccountType;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import com.robinhood.store.base.InvestmentScheduleEventStore;
import com.robinhood.transfers.api.AchTransferRhsState;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AchTransferDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u0019\u001a\u00020\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170\u001bJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002J\f\u0010 \u001a\u00020!*\u00020\"H\u0002J\f\u0010#\u001a\u00020!*\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AchTransferDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/history/ui/AchTransferDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "investmentScheduleEventStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/store/base/InvestmentScheduleEventStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "transferId", "Ljava/util/UUID;", "onCreate", "", "onResume", "cancelTransfer", "doOnCancellable", "Lkotlin/Function1;", "Lcom/robinhood/transfers/models/db/AchTransfer;", "cancelOrAbortTransfer", "Lio/reactivex/Completable;", "achTransfer", "isManaged", "", "", "isDigitsOnly", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AchTransferDetailDuxo extends OldBaseDuxo<AchTransferDetailViewState> implements HasSavedState {
    private static final int MANAGED_ACCOUNT_ID_LENGTH = 12;
    private static final String MANAGED_ENTITY_18_DIGIT_PREFIX = "18";
    private final AccountProvider accountProvider;
    private final AchRelationshipStore achRelationshipStore;
    private final InvestmentScheduleEventStore investmentScheduleEventStore;
    private final PaymentTransferStore paymentTransferStore;
    private final SavedStateHandle savedStateHandle;
    private final UUID transferId;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AchTransferDetailDuxo(AccountProvider accountProvider, AchRelationshipStore achRelationshipStore, InvestmentScheduleEventStore investmentScheduleEventStore, PaymentTransferStore paymentTransferStore, TransfersBonfireApi transfersBonfireApi, SavedStateHandle savedStateHandle) {
        super(new AchTransferDetailViewState(null, null, null, null, null, null, null, null, 255, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.achRelationshipStore = achRelationshipStore;
        this.investmentScheduleEventStore = investmentScheduleEventStore;
        this.paymentTransferStore = paymentTransferStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.savedStateHandle = savedStateHandle;
        this.transferId = ((AchTransferDetailFragment.Args) INSTANCE.getArgs(getSavedStateHandle())).getTransferId();
    }

    /* compiled from: AchTransferDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.AchTransferDetailDuxo$onCreate$1", m3645f = "AchTransferDetailDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.AchTransferDetailDuxo$onCreate$1 */
    static final class C183711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C183711(Continuation<? super C183711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AchTransferDetailDuxo.this.new C183711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C183711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvestmentScheduleEventStore investmentScheduleEventStore = AchTransferDetailDuxo.this.investmentScheduleEventStore;
                Companion companion = AchTransferDetailDuxo.INSTANCE;
                investmentScheduleEventStore.refreshByAchTransfer(false, ((AchTransferDetailFragment.Args) companion.getArgs((HasSavedState) AchTransferDetailDuxo.this)).getTransferId());
                Flow<UiInvestmentScheduleEvent> flowStreamInvestmentScheduleEventByAchTransfer = AchTransferDetailDuxo.this.investmentScheduleEventStore.streamInvestmentScheduleEventByAchTransfer(((AchTransferDetailFragment.Args) companion.getArgs((HasSavedState) AchTransferDetailDuxo.this)).getTransferId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AchTransferDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamInvestmentScheduleEventByAchTransfer, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: AchTransferDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiInvestmentScheduleEvent", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.history.ui.AchTransferDetailDuxo$onCreate$1$1", m3645f = "AchTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.history.ui.AchTransferDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiInvestmentScheduleEvent, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AchTransferDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AchTransferDetailDuxo achTransferDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = achTransferDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiInvestmentScheduleEvent uiInvestmentScheduleEvent, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiInvestmentScheduleEvent, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final UiInvestmentScheduleEvent uiInvestmentScheduleEvent = (UiInvestmentScheduleEvent) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$onCreate$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AchTransferDetailDuxo.C183711.AnonymousClass1.invokeSuspend$lambda$0(uiInvestmentScheduleEvent, (AchTransferDetailViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AchTransferDetailViewState invokeSuspend$lambda$0(UiInvestmentScheduleEvent uiInvestmentScheduleEvent, AchTransferDetailViewState achTransferDetailViewState) {
                return AchTransferDetailViewState.copy$default(achTransferDetailViewState, null, null, null, uiInvestmentScheduleEvent, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C183711(null));
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Observable observableRefCount = PaymentTransferStore.getPaymentTransfer$default(this.paymentTransferStore, this.transferId, false, 2, null).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        this.accountProvider.refresh(false);
        Observable observableFlatMap = observableRefCount.take(1L).flatMap(new Function() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(PaymentTransfer transfer) {
                Intrinsics.checkNotNullParameter(transfer, "transfer");
                return AchTransferDetailDuxo.this.accountProvider.streamAccount(transfer.getOriginatingAccountId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferDetailDuxo.onResume$lambda$1(this.f$0, (Account) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferDetailDuxo.onResume$lambda$4(this.f$0, (PaymentTransfer) obj);
            }
        });
        this.achRelationshipStore.refresh(false);
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final Optional<AchTransfer> apply(AchTransferDetailViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getAchTransfer());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(map).take(1L).switchMap(new Function() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo.onResume.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends AchRelationship> apply(AchTransfer achTransfer) {
                Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
                return AchTransferDetailDuxo.this.achRelationshipStore.getAchRelationship(achTransfer.getAchRelationshipId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferDetailDuxo.onResume$lambda$6(this.f$0, (AchRelationship) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(AchTransferDetailDuxo achTransferDetailDuxo, final Account account) {
        achTransferDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferDetailDuxo.onResume$lambda$1$lambda$0(account, (AchTransferDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchTransferDetailViewState onResume$lambda$1$lambda$0(Account account, AchTransferDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchTransferDetailViewState.copy$default(applyMutation, account, null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(AchTransferDetailDuxo achTransferDetailDuxo, final PaymentTransfer paymentTransfer) {
        AccountType originatingAccountType = paymentTransfer.getOriginatingAccountType();
        AccountType accountType = AccountType.RHS_ACCOUNT;
        if (originatingAccountType != accountType && paymentTransfer.getReceivingAccountType() != accountType) {
            achTransferDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AchTransferDetailDuxo.onResume$lambda$4$lambda$2(paymentTransfer, (AchTransferDetailViewState) obj);
                }
            });
        } else {
            achTransferDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AchTransferDetailDuxo.onResume$lambda$4$lambda$3(paymentTransfer, (AchTransferDetailViewState) obj);
                }
            });
        }
        try {
            if (achTransferDetailDuxo.isManaged(paymentTransfer.getOriginatingAccountId())) {
                BuildersKt__Builders_commonKt.launch$default(achTransferDetailDuxo.getLifecycleScope(), null, null, new AchTransferDetailDuxo2(achTransferDetailDuxo, paymentTransfer, null), 3, null);
            }
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchTransferDetailViewState onResume$lambda$4$lambda$2(PaymentTransfer paymentTransfer, AchTransferDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchTransferDetailViewState.copy$default(applyMutation, null, null, null, null, null, null, applyMutation.getManagedByPaymentHubEvent() == null ? new UiEvent(paymentTransfer.getId()) : null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchTransferDetailViewState onResume$lambda$4$lambda$3(PaymentTransfer paymentTransfer, AchTransferDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchTransferDetailViewState.copy$default(applyMutation, null, null, paymentTransfer, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(AchTransferDetailDuxo achTransferDetailDuxo, final AchRelationship achRelationship) {
        achTransferDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferDetailDuxo.onResume$lambda$6$lambda$5(achRelationship, (AchTransferDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchTransferDetailViewState onResume$lambda$6$lambda$5(AchRelationship achRelationship, AchTransferDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchTransferDetailViewState.copy$default(applyMutation, null, achRelationship, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    public final void cancelTransfer(final Function1<? super AchTransfer, Unit> doOnCancellable) {
        Intrinsics.checkNotNullParameter(doOnCancellable, "doOnCancellable");
        Completable completableFlatMapCompletable = getStates().firstOrError().flatMapCompletable(new Function() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo.cancelTransfer.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(final AchTransferDetailViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (state.getAchTransfer() != null && state.getAchTransfer().getCancellable()) {
                    Completable completableCancelOrAbortTransfer = AchTransferDetailDuxo.this.cancelOrAbortTransfer(state.getAchTransfer());
                    final Function1<AchTransfer, Unit> function1 = doOnCancellable;
                    Completable completableDoOnSubscribe = completableCancelOrAbortTransfer.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo.cancelTransfer.1.1
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Disposable disposable) {
                            function1.invoke(state.getAchTransfer());
                        }
                    }).doOnSubscribe(new AnonymousClass2(AchTransferDetailDuxo.this));
                    Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
                    return CompletableDelay2.minTimeInFlight$default(completableDoOnSubscribe, 1000L, null, 2, null);
                }
                return Completable.error(new IllegalStateException("Cancel transfer button should not be visible!"));
            }

            /* compiled from: AchTransferDetailDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.history.ui.AchTransferDetailDuxo$cancelTransfer$1$2, reason: invalid class name */
            static final class AnonymousClass2<T> implements Consumer {
                final /* synthetic */ AchTransferDetailDuxo this$0;

                AnonymousClass2(AchTransferDetailDuxo achTransferDetailDuxo) {
                    this.this$0 = achTransferDetailDuxo;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Disposable disposable) {
                    this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$cancelTransfer$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AchTransferDetailDuxo.C183701.AnonymousClass2.accept$lambda$0((AchTransferDetailViewState) obj);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final AchTransferDetailViewState accept$lambda$0(AchTransferDetailViewState applyMutation) {
                    Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                    return AchTransferDetailViewState.copy$default(applyMutation, null, null, null, null, AchTransferDetailViewState.CancelTransferState.CANCEL_REQUEST_IN_FLIGHT, null, null, null, 239, null);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableFlatMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AchTransferDetailDuxo.cancelTransfer$lambda$8(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferDetailDuxo.cancelTransfer$lambda$10(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTransfer$lambda$8(AchTransferDetailDuxo achTransferDetailDuxo) {
        achTransferDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferDetailDuxo.cancelTransfer$lambda$8$lambda$7((AchTransferDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchTransferDetailViewState cancelTransfer$lambda$8$lambda$7(AchTransferDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchTransferDetailViewState.copy$default(applyMutation, null, null, null, null, AchTransferDetailViewState.CancelTransferState.SUCCESSFULLY_CANCELLED, new UiEvent(new Either.Left(Unit.INSTANCE)), null, null, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTransfer$lambda$10(AchTransferDetailDuxo achTransferDetailDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        achTransferDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferDetailDuxo.cancelTransfer$lambda$10$lambda$9(throwable, (AchTransferDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchTransferDetailViewState cancelTransfer$lambda$10$lambda$9(Throwable th, AchTransferDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchTransferDetailViewState.copy$default(applyMutation, null, null, null, null, AchTransferDetailViewState.CancelTransferState.NO_ACTION_TAKEN, new UiEvent(new Either.Right(th)), null, null, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Completable cancelOrAbortTransfer(AchTransfer achTransfer) {
        if (achTransfer.getRhsState() == AchTransferRhsState.PENDING_CONFIRMATION) {
            return this.paymentTransferStore.abortAchTransfer(((AchTransferDetailFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTransferId());
        }
        return this.paymentTransferStore.cancelTransfer(((AchTransferDetailFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTransferId());
    }

    private final boolean isManaged(String str) {
        return isDigitsOnly(str) && str.length() == 12 && StringsKt.startsWith$default(str, MANAGED_ENTITY_18_DIGIT_PREFIX, false, 2, (Object) null);
    }

    private final boolean isDigitsOnly(String str) {
        Character chValueOf;
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        int length = charArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                chValueOf = null;
                break;
            }
            char c = charArray[i];
            if (!Character.isDigit(c)) {
                chValueOf = Character.valueOf(c);
                break;
            }
            i++;
        }
        return chValueOf == null;
    }

    /* compiled from: AchTransferDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AchTransferDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/history/ui/AchTransferDetailDuxo;", "Lcom/robinhood/android/history/ui/AchTransferDetailFragment$Args;", "<init>", "()V", "MANAGED_ACCOUNT_ID_LENGTH", "", "MANAGED_ENTITY_18_DIGIT_PREFIX", "", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AchTransferDetailDuxo, AchTransferDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AchTransferDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AchTransferDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AchTransferDetailFragment.Args getArgs(AchTransferDetailDuxo achTransferDetailDuxo) {
            return (AchTransferDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, achTransferDetailDuxo);
        }
    }
}
