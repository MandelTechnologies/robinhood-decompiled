package com.robinhood.android.transfers.history.internaltransfer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.transfers.contracts.InternalTransferHistoryDetailDisplayKey;
import com.robinhood.android.transfers.history.C30262R;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.gold.hub.GoldDepositBoostAdjustment;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.shared.models.history.GoldDepositBoostAdjustmentTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.RhyInternalTransferTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.store.history.HistoryTransactionStore;
import com.robinhood.transfers.api.Direction;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.utils.p409ui.images.ImageReference;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: InternalTransferHistoryDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001'B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\f\u0010\"\u001a\u00020\u001f*\u00020#H\u0002J\f\u0010$\u001a\u00020\u001f*\u00020#H\u0002J\u0006\u0010%\u001a\u00020\u0017J\b\u0010&\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u001e\u001a\u00020\u001f*\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010!¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/transfers/history/internaltransfer/InternalTransferHistoryDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/history/internaltransfer/InternalTransferHistoryDetailDataState;", "Lcom/robinhood/android/transfers/history/internaltransfer/InternalTransferHistoryDetailViewState;", "Lcom/robinhood/android/transfers/history/internaltransfer/InternalTransferHistoryDetailEvents;", "Lcom/robinhood/android/udf/HasSavedState;", "historyTransactionStore", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "minervaTransactionFormatters", "Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/store/history/HistoryTransactionStore;Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "paymentTransfer", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "onResume", "", "redraw", "additionalInfoText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "getAdditionalInfoText", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Lcom/robinhood/utils/resource/StringResource;", "isManagedTransaction", "", "Lcom/robinhood/shared/models/history/RhyInternalTransferTransaction;", "(Lcom/robinhood/shared/models/history/RhyInternalTransferTransaction;)Z", "isManaged", "", "isDigitsOnly", "cancelSelected", "cancelTransfer", "Companion", "feature-transfer-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InternalTransferHistoryDetailDuxo extends BaseDuxo3<InternalTransferHistoryDetailDataState, InternalTransferHistoryDetailViewState, InternalTransferHistoryDetailEvents> implements HasSavedState {
    private final HistoryTransactionStore historyTransactionStore;
    private final AggregatedHistoryTransactionFormatter minervaTransactionFormatters;
    private PaymentTransfer paymentTransfer;
    private final PaymentTransferStore paymentTransferStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalTransferHistoryDetailDuxo(HistoryTransactionStore historyTransactionStore, AggregatedHistoryTransactionFormatter minervaTransactionFormatters, PaymentTransferStore paymentTransferStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new InternalTransferHistoryDetailDataState(null, null, null, null, false, false, false, null, null, null, 1023, null), new InternalTransferHistoryDetailStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
        Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.historyTransactionStore = historyTransactionStore;
        this.minervaTransactionFormatters = minervaTransactionFormatters;
        this.paymentTransferStore = paymentTransferStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        redraw();
    }

    private final void redraw() {
        Observable<? extends MinervaTransaction> observableDistinctUntilChanged = this.historyTransactionStore.fromReference(((InternalTransferHistoryDetailDisplayKey) INSTANCE.getArgs((HasSavedState) this)).getTransactionReference()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.history.internaltransfer.InternalTransferHistoryDetailDuxo.redraw.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((MinervaTransaction) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(MinervaTransaction minervaTransaction) {
                boolean z = minervaTransaction instanceof MinervaTransaction.FromCard;
                boolean z2 = minervaTransaction.getType() == HistoryTransactionType.RHY_INTER_ENTITY_TRANSFER;
                boolean z3 = minervaTransaction.getType() == HistoryTransactionType.INTERNAL_TRANSFER;
                boolean z4 = minervaTransaction.getType() == HistoryTransactionType.GOLD_DEPOSIT_BOOST_ADJUSTMENT;
                InternalTransferHistoryDetailDuxo internalTransferHistoryDetailDuxo = InternalTransferHistoryDetailDuxo.this;
                HistoryEvent event = minervaTransaction.getEvent();
                internalTransferHistoryDetailDuxo.paymentTransfer = event instanceof PaymentTransfer ? (PaymentTransfer) event : null;
                InternalTransferHistoryDetailDuxo internalTransferHistoryDetailDuxo2 = InternalTransferHistoryDetailDuxo.this;
                internalTransferHistoryDetailDuxo2.applyMutation(new AnonymousClass1(internalTransferHistoryDetailDuxo2, minervaTransaction, z4, z, z2, z3, null));
            }

            /* compiled from: InternalTransferHistoryDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/history/internaltransfer/InternalTransferHistoryDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.history.internaltransfer.InternalTransferHistoryDetailDuxo$redraw$1$1", m3645f = "InternalTransferHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.history.internaltransfer.InternalTransferHistoryDetailDuxo$redraw$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternalTransferHistoryDetailDataState, Continuation<? super InternalTransferHistoryDetailDataState>, Object> {
                final /* synthetic */ boolean $isCardTransaction;
                final /* synthetic */ boolean $isGoldDepositBoostAdjustment;
                final /* synthetic */ boolean $isInterEntityTransfer;
                final /* synthetic */ boolean $isInternalTransfer;
                final /* synthetic */ MinervaTransaction $transaction;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InternalTransferHistoryDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InternalTransferHistoryDetailDuxo internalTransferHistoryDetailDuxo, MinervaTransaction minervaTransaction, boolean z, boolean z2, boolean z3, boolean z4, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = internalTransferHistoryDetailDuxo;
                    this.$transaction = minervaTransaction;
                    this.$isGoldDepositBoostAdjustment = z;
                    this.$isCardTransaction = z2;
                    this.$isInterEntityTransfer = z3;
                    this.$isInternalTransfer = z4;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$transaction, this.$isGoldDepositBoostAdjustment, this.$isCardTransaction, this.$isInterEntityTransfer, this.$isInternalTransfer, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternalTransferHistoryDetailDataState internalTransferHistoryDetailDataState, Continuation<? super InternalTransferHistoryDetailDataState> continuation) {
                    return ((AnonymousClass1) create(internalTransferHistoryDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    CharSequence amountText;
                    GoldDepositBoostAdjustment event;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    InternalTransferHistoryDetailDataState internalTransferHistoryDetailDataState = (InternalTransferHistoryDetailDataState) this.L$0;
                    ImageReference.Resource resource = new ImageReference.Resource(C11183R.drawable.ic_transaction_generic);
                    AggregatedHistoryTransactionFormatter aggregatedHistoryTransactionFormatter = this.this$0.minervaTransactionFormatters;
                    MinervaTransaction minervaTransaction = this.$transaction;
                    Intrinsics.checkNotNull(minervaTransaction);
                    CharSequence primaryText = aggregatedHistoryTransactionFormatter.getPrimaryText(minervaTransaction);
                    if (this.$isGoldDepositBoostAdjustment) {
                        MinervaTransaction minervaTransaction2 = this.$transaction;
                        GoldDepositBoostAdjustmentTransaction goldDepositBoostAdjustmentTransaction = minervaTransaction2 instanceof GoldDepositBoostAdjustmentTransaction ? (GoldDepositBoostAdjustmentTransaction) minervaTransaction2 : null;
                        if (goldDepositBoostAdjustmentTransaction == null || (event = goldDepositBoostAdjustmentTransaction.getEvent()) == null || (amountText = event.getDescription()) == null) {
                            amountText = "";
                        }
                    } else {
                        amountText = this.this$0.minervaTransactionFormatters.getAmountText(this.$transaction.getEvent(), this.$isCardTransaction || this.$isInterEntityTransfer || this.$isInternalTransfer, this.$isInterEntityTransfer || this.$isInternalTransfer);
                    }
                    CharSequence charSequence = amountText;
                    AggregatedHistoryTransactionFormatter aggregatedHistoryTransactionFormatter2 = this.this$0.minervaTransactionFormatters;
                    MinervaTransaction minervaTransaction3 = this.$transaction;
                    Intrinsics.checkNotNull(minervaTransaction3);
                    List<TransactionLineItem> listMo25632getLineItems = aggregatedHistoryTransactionFormatter2.mo25632getLineItems(minervaTransaction3);
                    AggregatedHistoryTransactionFormatter aggregatedHistoryTransactionFormatter3 = this.this$0.minervaTransactionFormatters;
                    MinervaTransaction minervaTransaction4 = this.$transaction;
                    Intrinsics.checkNotNull(minervaTransaction4);
                    TransactionOverview transactionOverview = new TransactionOverview(resource, primaryText, charSequence, listMo25632getLineItems, aggregatedHistoryTransactionFormatter3.getMerchantName(minervaTransaction4));
                    MinervaTransaction minervaTransaction5 = this.$transaction;
                    RhyInternalTransferTransaction rhyInternalTransferTransaction = minervaTransaction5 instanceof RhyInternalTransferTransaction ? (RhyInternalTransferTransaction) minervaTransaction5 : null;
                    boolean z = rhyInternalTransferTransaction != null && this.this$0.isManagedTransaction(rhyInternalTransferTransaction) && CollectionsKt.listOf((Object[]) new TransferState[]{TransferState.PAUSED, TransferState.PENDING}).contains(((RhyInternalTransferTransaction) this.$transaction).getEvent().getState());
                    InternalTransferHistoryDetailDuxo internalTransferHistoryDetailDuxo = this.this$0;
                    MinervaTransaction minervaTransaction6 = this.$transaction;
                    Intrinsics.checkNotNull(minervaTransaction6);
                    return InternalTransferHistoryDetailDataState.copy$default(internalTransferHistoryDetailDataState, transactionOverview, this.$transaction, null, null, false, z, false, null, null, internalTransferHistoryDetailDuxo.getAdditionalInfoText(minervaTransaction6), 476, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringResource getAdditionalInfoText(MinervaTransaction minervaTransaction) {
        PaymentTransfer event;
        String originatingAccountId;
        RhyInternalTransferTransaction rhyInternalTransferTransaction = minervaTransaction instanceof RhyInternalTransferTransaction ? (RhyInternalTransferTransaction) minervaTransaction : null;
        if (rhyInternalTransferTransaction == null || (event = rhyInternalTransferTransaction.getEvent()) == null || (originatingAccountId = event.getOriginatingAccountId()) == null || !isManaged(originatingAccountId) || ((RhyInternalTransferTransaction) minervaTransaction).getEvent().getDirection() != Direction.PUSH) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C30262R.string.managed_internal_transfer_withdraw_info, new Object[0]);
    }

    public final boolean isManagedTransaction(RhyInternalTransferTransaction rhyInternalTransferTransaction) {
        Intrinsics.checkNotNullParameter(rhyInternalTransferTransaction, "<this>");
        return isManaged(rhyInternalTransferTransaction.getEvent().getOriginatingAccountId()) || isManaged(rhyInternalTransferTransaction.getEvent().getReceivingAccountId());
    }

    private final boolean isManaged(String str) {
        return isDigitsOnly(str) && str.length() == 12 && StringsKt.startsWith$default(str, "18", false, 2, (Object) null);
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

    public final void cancelSelected() {
        cancelTransfer();
    }

    private final void cancelTransfer() {
        PaymentTransfer paymentTransfer = this.paymentTransfer;
        if (paymentTransfer != null) {
            applyMutation(new InternalTransferHistoryDetailDuxo2(null));
            LifecycleHost.DefaultImpls.bind$default(this, CompletableDelay2.minTimeInFlight$default(this.paymentTransferStore.cancelTransfer(paymentTransfer.getId()), 1000L, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.transfers.history.internaltransfer.InternalTransferHistoryDetailDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InternalTransferHistoryDetailDuxo.cancelTransfer$lambda$3$lambda$1(this.f$0);
                }
            }, new Function1() { // from class: com.robinhood.android.transfers.history.internaltransfer.InternalTransferHistoryDetailDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InternalTransferHistoryDetailDuxo.cancelTransfer$lambda$3$lambda$2(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTransfer$lambda$3$lambda$1(InternalTransferHistoryDetailDuxo internalTransferHistoryDetailDuxo) {
        internalTransferHistoryDetailDuxo.paymentTransfer = null;
        internalTransferHistoryDetailDuxo.applyMutation(new InternalTransferHistoryDetailDuxo3(null));
        internalTransferHistoryDetailDuxo.redraw();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTransfer$lambda$3$lambda$2(InternalTransferHistoryDetailDuxo internalTransferHistoryDetailDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        internalTransferHistoryDetailDuxo.applyMutation(new InternalTransferHistoryDetailDuxo4(throwable, null));
        return Unit.INSTANCE;
    }

    /* compiled from: InternalTransferHistoryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/internaltransfer/InternalTransferHistoryDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/history/internaltransfer/InternalTransferHistoryDetailDuxo;", "Lcom/robinhood/android/transfers/contracts/InternalTransferHistoryDetailDisplayKey;", "<init>", "()V", "feature-transfer-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InternalTransferHistoryDetailDuxo, InternalTransferHistoryDetailDisplayKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalTransferHistoryDetailDisplayKey getArgs(SavedStateHandle savedStateHandle) {
            return (InternalTransferHistoryDetailDisplayKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalTransferHistoryDetailDisplayKey getArgs(InternalTransferHistoryDetailDuxo internalTransferHistoryDetailDuxo) {
            return (InternalTransferHistoryDetailDisplayKey) DuxoCompanion.DefaultImpls.getArgs(this, internalTransferHistoryDetailDuxo);
        }
    }
}
