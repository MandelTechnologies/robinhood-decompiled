package com.robinhood.android.history.p153ui.detail.shim;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.history.p153ui.detail.shim.DetailShimFragment;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.models.history.shared.TransactionReference;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailShimDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/history/ui/detail/shim/DetailShimDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/history/ui/detail/shim/DetailShimViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/shared/history/navigation/HistoryNavigator;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DetailShimDuxo extends BaseDuxo4<DetailShimViewState> implements HasSavedState {
    private final HistoryNavigator historyNavigator;
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
    public DetailShimDuxo(PaymentTransferStore paymentTransferStore, HistoryNavigator historyNavigator, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new DetailShimViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.paymentTransferStore = paymentTransferStore;
        this.historyNavigator = historyNavigator;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        final UUID transferId = ((DetailShimFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTransferId();
        if (transferId == null) {
            throw new IllegalStateException("transferId is required for detail shim");
        }
        Observable map = PaymentTransferStore.getPaymentTransfer$default(this.paymentTransferStore, transferId, false, 2, null).take(1L).map(new Function() { // from class: com.robinhood.android.history.ui.detail.shim.DetailShimDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final FragmentKey apply(PaymentTransfer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return HistoryNavigator.resolve$default(DetailShimDuxo.this.historyNavigator, new TransactionReference(transferId, it.getTransferType().getHistoryTransactionType(), null, null, false, 28, null), false, ((DetailShimFragment.Args) DetailShimDuxo.INSTANCE.getArgs((HasSavedState) DetailShimDuxo.this)).getFromDeepLink(), 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.detail.shim.DetailShimDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DetailShimDuxo.onStart$lambda$1(this.f$0, (FragmentKey) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(DetailShimDuxo detailShimDuxo, FragmentKey fragmentKey) {
        detailShimDuxo.applyMutation(new DetailShimDuxo2(fragmentKey, null));
        return Unit.INSTANCE;
    }

    /* compiled from: DetailShimDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/detail/shim/DetailShimDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/history/ui/detail/shim/DetailShimDuxo;", "Lcom/robinhood/android/history/ui/detail/shim/DetailShimFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DetailShimDuxo, DetailShimFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DetailShimFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DetailShimFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DetailShimFragment.Args getArgs(DetailShimDuxo detailShimDuxo) {
            return (DetailShimFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, detailShimDuxo);
        }
    }
}
