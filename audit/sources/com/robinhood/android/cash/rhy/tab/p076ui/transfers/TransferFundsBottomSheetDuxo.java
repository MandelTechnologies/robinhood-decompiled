package com.robinhood.android.cash.rhy.tab.p076ui.transfers;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.cushion.annotation.HasVisitedCashCushionUpsellPref;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore;
import com.robinhood.models.api.minerva.ApiCardShipmentEligibility;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferFundsBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B+\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "hasVisitedCashCushionUpsellPref", "Lcom/robinhood/prefs/BooleanPreference;", "cashCushionStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "skipButtonClicked", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class TransferFundsBottomSheetDuxo extends OldBaseDuxo<TransferFundsBottomSheetViewState> implements HasSavedState {
    private final CashCushionStatusStore cashCushionStatusStore;
    private final BooleanPreference hasVisitedCashCushionUpsellPref;
    private final MinervaAccountStore minervaAccountStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransferFundsBottomSheetDuxo(@HasVisitedCashCushionUpsellPref BooleanPreference hasVisitedCashCushionUpsellPref, CashCushionStatusStore cashCushionStatusStore, MinervaAccountStore minervaAccountStore, SavedStateHandle savedStateHandle) {
        super(new TransferFundsBottomSheetViewState(null, ((LegacyDialogFragmentKey.TransferFundsBottomSheet) INSTANCE.getArgs(savedStateHandle)).getPromptCashCushionWhenSkipped(), false, null, null, false, 61, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(hasVisitedCashCushionUpsellPref, "hasVisitedCashCushionUpsellPref");
        Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.hasVisitedCashCushionUpsellPref = hasVisitedCashCushionUpsellPref;
        this.cashCushionStatusStore = cashCushionStatusStore;
        this.minervaAccountStore = minervaAccountStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.cashCushionStatusStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.cashCushionStatusStore.stream()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferFundsBottomSheetDuxo.onStart$lambda$1(this.f$0, (CashCushionStatus) obj);
            }
        });
        this.minervaAccountStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.minervaAccountStore.getRhyCardShipmentEligibility(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferFundsBottomSheetDuxo.onStart$lambda$3(this.f$0, (ApiCardShipmentEligibility) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.hasVisitedCashCushionUpsellPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferFundsBottomSheetDuxo.onStart$lambda$5(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(TransferFundsBottomSheetDuxo transferFundsBottomSheetDuxo, final CashCushionStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        transferFundsBottomSheetDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferFundsBottomSheetDuxo.onStart$lambda$1$lambda$0(it, (TransferFundsBottomSheetViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransferFundsBottomSheetViewState onStart$lambda$1$lambda$0(CashCushionStatus cashCushionStatus, TransferFundsBottomSheetViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TransferFundsBottomSheetViewState.copy$default(applyMutation, cashCushionStatus, false, false, null, null, false, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(TransferFundsBottomSheetDuxo transferFundsBottomSheetDuxo, final ApiCardShipmentEligibility eligibility) {
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        transferFundsBottomSheetDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferFundsBottomSheetDuxo.onStart$lambda$3$lambda$2(eligibility, (TransferFundsBottomSheetViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransferFundsBottomSheetViewState onStart$lambda$3$lambda$2(ApiCardShipmentEligibility apiCardShipmentEligibility, TransferFundsBottomSheetViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TransferFundsBottomSheetViewState.copy$default(applyMutation, null, false, false, null, null, apiCardShipmentEligibility.getIs_pending_funding_requirement(), 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(TransferFundsBottomSheetDuxo transferFundsBottomSheetDuxo, final boolean z) {
        transferFundsBottomSheetDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferFundsBottomSheetDuxo.onStart$lambda$5$lambda$4(z, (TransferFundsBottomSheetViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransferFundsBottomSheetViewState onStart$lambda$5$lambda$4(boolean z, TransferFundsBottomSheetViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TransferFundsBottomSheetViewState.copy$default(applyMutation, null, false, z, null, null, false, 59, null);
    }

    public final void skipButtonClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferFundsBottomSheetDuxo.skipButtonClicked$lambda$6((TransferFundsBottomSheetViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransferFundsBottomSheetViewState skipButtonClicked$lambda$6(TransferFundsBottomSheetViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TransferFundsBottomSheetViewState.copy$default(applyMutation, null, false, false, applyMutation.getShouldShowCashCushionUpsell() ? new UiEvent(Unit.INSTANCE) : null, new UiEvent(Unit.INSTANCE), false, 39, null);
    }

    /* compiled from: TransferFundsBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$TransferFundsBottomSheet;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<TransferFundsBottomSheetDuxo, LegacyDialogFragmentKey.TransferFundsBottomSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.TransferFundsBottomSheet getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyDialogFragmentKey.TransferFundsBottomSheet) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.TransferFundsBottomSheet getArgs(TransferFundsBottomSheetDuxo transferFundsBottomSheetDuxo) {
            return (LegacyDialogFragmentKey.TransferFundsBottomSheet) DuxoCompanion.DefaultImpls.getArgs(this, transferFundsBottomSheetDuxo);
        }
    }
}
