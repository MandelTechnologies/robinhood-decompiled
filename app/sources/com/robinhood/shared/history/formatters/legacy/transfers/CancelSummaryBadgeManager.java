package com.robinhood.shared.history.formatters.legacy.transfers;

import com.robinhood.android.banking.experiments.OutgoingWiresRevampKillswitch;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CancelSummaryBadgeManager.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;", "", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "isInTransfersHub", "", "()Z", "setInTransfersHub", "(Z)V", "shouldShowCancelSummaryBadge", "transfer", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/transfers/models/db/AchTransfer;", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CancelSummaryBadgeManager {
    private final ExperimentsStore experimentsStore;
    private boolean isInTransfersHub;

    public CancelSummaryBadgeManager(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.experimentsStore = experimentsStore;
    }

    /* renamed from: isInTransfersHub, reason: from getter */
    public final boolean getIsInTransfersHub() {
        return this.isInTransfersHub;
    }

    public final void setInTransfersHub(boolean z) {
        this.isInTransfersHub = z;
    }

    public final boolean shouldShowCancelSummaryBadge(Either<AchTransfer, PaymentTransfer> transfer) {
        boolean zIsCancelable;
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        if (this.isInTransfersHub) {
            if (transfer instanceof Either.Left) {
                zIsCancelable = ((AchTransfer) ((Either.Left) transfer).getValue()).getCancellable();
            } else {
                if (!(transfer instanceof Either.Right)) {
                    throw new NoWhenBranchMatchedException();
                }
                Either.Right right = (Either.Right) transfer;
                if (((PaymentTransfer) right.getValue()).getDetails() instanceof ApiPaymentTransferDetails.ApiOutgoingWireTransfer) {
                    zIsCancelable = ((PaymentTransfer) right.getValue()).isCancelable() && ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new C390071(null), 1, null)).booleanValue();
                } else {
                    zIsCancelable = ((PaymentTransfer) right.getValue()).isCancelable();
                }
            }
            if (zIsCancelable) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: CancelSummaryBadgeManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.history.formatters.legacy.transfers.CancelSummaryBadgeManager$shouldShowCancelSummaryBadge$1", m3645f = "CancelSummaryBadgeManager.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.history.formatters.legacy.transfers.CancelSummaryBadgeManager$shouldShowCancelSummaryBadge$1 */
    static final class C390071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C390071(Continuation<? super C390071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CancelSummaryBadgeManager.this.new C390071(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C390071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(CancelSummaryBadgeManager.this.experimentsStore, new Experiment[]{OutgoingWiresRevampKillswitch.INSTANCE}, false, null, 6, null);
            this.label = 1;
            Object objFirst = FlowKt.first(flowStreamStateFlow$default, this);
            return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
        }
    }
}
