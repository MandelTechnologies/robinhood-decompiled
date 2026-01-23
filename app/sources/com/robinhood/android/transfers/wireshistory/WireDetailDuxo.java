package com.robinhood.android.transfers.wireshistory;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.transfers.contracts.WireDetailFragmentKey;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.gold.hub.GoldDepositBoostAdjustment;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.shared.models.history.GoldDepositBoostAdjustmentTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.store.history.HistoryTransactionStore;
import com.robinhood.transfers.api.ApiGracePeriodContent;
import com.robinhood.utils.p409ui.images.ImageReference;
import io.reactivex.Observable;
import java.util.List;
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

/* compiled from: WireDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/wireshistory/WireDetailDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/wireshistory/WireDetailState;", "Lcom/robinhood/android/udf/HasSavedState;", "historyTransactionStore", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "minervaTransactionFormatters", "Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/store/history/HistoryTransactionStore;Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "Companion", "feature-wires-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WireDetailDuxo extends BaseDuxo4<WireDetailState> implements HasSavedState {
    private final HistoryTransactionStore historyTransactionStore;
    private final AggregatedHistoryTransactionFormatter minervaTransactionFormatters;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WireDetailDuxo(HistoryTransactionStore historyTransactionStore, AggregatedHistoryTransactionFormatter minervaTransactionFormatters, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new WireDetailState(null, null, null, null, false, 31, null), duxoBundle);
        Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
        Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.historyTransactionStore = historyTransactionStore;
        this.minervaTransactionFormatters = minervaTransactionFormatters;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        Observable<? extends MinervaTransaction> observableDistinctUntilChanged = this.historyTransactionStore.fromReference(((WireDetailFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getTransactionReference()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailDuxo.onResume.1
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
                HistoryEvent event = minervaTransaction.getEvent();
                PaymentTransfer paymentTransfer = event instanceof PaymentTransfer ? (PaymentTransfer) event : null;
                ApiGracePeriodContent gracePeriodContent = paymentTransfer != null ? paymentTransfer.getGracePeriodContent() : null;
                WireDetailDuxo wireDetailDuxo = WireDetailDuxo.this;
                wireDetailDuxo.applyMutation(new AnonymousClass1(wireDetailDuxo, minervaTransaction, z4, z, z2, z3, gracePeriodContent, null));
            }

            /* compiled from: WireDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/wireshistory/WireDetailState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.wireshistory.WireDetailDuxo$onResume$1$1", m3645f = "WireDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.wireshistory.WireDetailDuxo$onResume$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<WireDetailState, Continuation<? super WireDetailState>, Object> {
                final /* synthetic */ ApiGracePeriodContent $gracePeriodContent;
                final /* synthetic */ boolean $isCardTransaction;
                final /* synthetic */ boolean $isGoldDepositBoostAdjustment;
                final /* synthetic */ boolean $isInterEntityTransfer;
                final /* synthetic */ boolean $isInternalTransfer;
                final /* synthetic */ MinervaTransaction $transaction;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ WireDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(WireDetailDuxo wireDetailDuxo, MinervaTransaction minervaTransaction, boolean z, boolean z2, boolean z3, boolean z4, ApiGracePeriodContent apiGracePeriodContent, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = wireDetailDuxo;
                    this.$transaction = minervaTransaction;
                    this.$isGoldDepositBoostAdjustment = z;
                    this.$isCardTransaction = z2;
                    this.$isInterEntityTransfer = z3;
                    this.$isInternalTransfer = z4;
                    this.$gracePeriodContent = apiGracePeriodContent;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$transaction, this.$isGoldDepositBoostAdjustment, this.$isCardTransaction, this.$isInterEntityTransfer, this.$isInternalTransfer, this.$gracePeriodContent, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(WireDetailState wireDetailState, Continuation<? super WireDetailState> continuation) {
                    return ((AnonymousClass1) create(wireDetailState, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    WireDetailState wireDetailState = (WireDetailState) this.L$0;
                    ImageReference.Resource resource = new ImageReference.Resource(C11183R.drawable.ic_transaction_generic);
                    AggregatedHistoryTransactionFormatter aggregatedHistoryTransactionFormatter = this.this$0.minervaTransactionFormatters;
                    MinervaTransaction minervaTransaction = this.$transaction;
                    Intrinsics.checkNotNull(minervaTransaction);
                    CharSequence primaryText = aggregatedHistoryTransactionFormatter.getPrimaryText(minervaTransaction);
                    if (!this.$isGoldDepositBoostAdjustment) {
                        AggregatedHistoryTransactionFormatter aggregatedHistoryTransactionFormatter2 = this.this$0.minervaTransactionFormatters;
                        HistoryEvent event2 = this.$transaction.getEvent();
                        boolean z = true;
                        boolean z2 = this.$isCardTransaction || this.$isInterEntityTransfer || this.$isInternalTransfer;
                        if (!this.$isInterEntityTransfer && !this.$isInternalTransfer) {
                            z = false;
                        }
                        amountText = aggregatedHistoryTransactionFormatter2.getAmountText(event2, z2, z);
                    } else {
                        MinervaTransaction minervaTransaction2 = this.$transaction;
                        GoldDepositBoostAdjustmentTransaction goldDepositBoostAdjustmentTransaction = minervaTransaction2 instanceof GoldDepositBoostAdjustmentTransaction ? (GoldDepositBoostAdjustmentTransaction) minervaTransaction2 : null;
                        if (goldDepositBoostAdjustmentTransaction == null || (event = goldDepositBoostAdjustmentTransaction.getEvent()) == null || (amountText = event.getDescription()) == null) {
                            amountText = "";
                        }
                    }
                    CharSequence charSequence = amountText;
                    AggregatedHistoryTransactionFormatter aggregatedHistoryTransactionFormatter3 = this.this$0.minervaTransactionFormatters;
                    MinervaTransaction minervaTransaction3 = this.$transaction;
                    Intrinsics.checkNotNull(minervaTransaction3);
                    List<TransactionLineItem> listMo25632getLineItems = aggregatedHistoryTransactionFormatter3.mo25632getLineItems(minervaTransaction3);
                    AggregatedHistoryTransactionFormatter aggregatedHistoryTransactionFormatter4 = this.this$0.minervaTransactionFormatters;
                    MinervaTransaction minervaTransaction4 = this.$transaction;
                    Intrinsics.checkNotNull(minervaTransaction4);
                    return WireDetailState.copy$default(wireDetailState, new WireOverview(resource, primaryText, charSequence, listMo25632getLineItems, aggregatedHistoryTransactionFormatter4.getMerchantName(minervaTransaction4), this.$gracePeriodContent), this.$transaction, null, null, false, 28, null);
                }
            }
        });
    }

    /* compiled from: WireDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/wireshistory/WireDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/wireshistory/WireDetailDuxo;", "Lcom/robinhood/android/transfers/contracts/WireDetailFragmentKey;", "<init>", "()V", "feature-wires-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<WireDetailDuxo, WireDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public WireDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (WireDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public WireDetailFragmentKey getArgs(WireDetailDuxo wireDetailDuxo) {
            return (WireDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, wireDetailDuxo);
        }
    }
}
