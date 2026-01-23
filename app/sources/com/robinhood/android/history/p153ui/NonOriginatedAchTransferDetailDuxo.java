package com.robinhood.android.history.p153ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.history.p153ui.NonOriginatedAchTransferDetailFragment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.p320db.NonOriginatedAchTransfer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonOriginatedAchTransferDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "transferId", "Ljava/util/UUID;", "onResume", "", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class NonOriginatedAchTransferDetailDuxo extends BaseDuxo4<NonOriginatedAchTransferDetailViewState> implements HasSavedState {
    private final PaymentTransferStore paymentTransferStore;
    private final SavedStateHandle savedStateHandle;
    private final UUID transferId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NonOriginatedAchTransferDetailDuxo(PaymentTransferStore paymentTransferStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new NonOriginatedAchTransferDetailViewState(null, 1, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.paymentTransferStore = paymentTransferStore;
        this.savedStateHandle = savedStateHandle;
        this.transferId = ((NonOriginatedAchTransferDetailFragment.Args) INSTANCE.getArgs(getSavedStateHandle())).getTransferId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.paymentTransferStore.getNonOriginatedAchTransfer(this.transferId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.NonOriginatedAchTransferDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonOriginatedAchTransferDetailDuxo.onResume$lambda$0(this.f$0, (NonOriginatedAchTransfer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(NonOriginatedAchTransferDetailDuxo nonOriginatedAchTransferDetailDuxo, NonOriginatedAchTransfer transfer) {
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        nonOriginatedAchTransferDetailDuxo.applyMutation(new NonOriginatedAchTransferDetailDuxo2(transfer, null));
        return Unit.INSTANCE;
    }

    /* compiled from: NonOriginatedAchTransferDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailDuxo;", "Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<NonOriginatedAchTransferDetailDuxo, NonOriginatedAchTransferDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NonOriginatedAchTransferDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (NonOriginatedAchTransferDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NonOriginatedAchTransferDetailFragment.Args getArgs(NonOriginatedAchTransferDetailDuxo nonOriginatedAchTransferDetailDuxo) {
            return (NonOriginatedAchTransferDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, nonOriginatedAchTransferDetailDuxo);
        }
    }
}
