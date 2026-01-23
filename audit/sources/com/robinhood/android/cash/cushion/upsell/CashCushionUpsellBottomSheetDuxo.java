package com.robinhood.android.cash.cushion.upsell;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashCushionUpsellBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onContinue", "Companion", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CashCushionUpsellBottomSheetDuxo extends OldBaseDuxo<CashCushionUpsellBottomSheetViewState> implements HasSavedState {
    private final RhyAccountLoggingStore rhyAccountLoggingStore;
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
    public CashCushionUpsellBottomSheetDuxo(RhyAccountLoggingStore rhyAccountLoggingStore, SavedStateHandle savedStateHandle) {
        super(new CashCushionUpsellBottomSheetViewState(false, null, null, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rhyAccountLoggingStore = rhyAccountLoggingStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.rhyAccountLoggingStore.refresh(true);
    }

    public final void onContinue() {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CashCushionUpsellBottomSheetDuxo.onContinue$lambda$0(this.f$0, (CashCushionUpsellBottomSheetViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CashCushionUpsellBottomSheetViewState onContinue$lambda$0(CashCushionUpsellBottomSheetDuxo cashCushionUpsellBottomSheetDuxo, CashCushionUpsellBottomSheetViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CashCushionUpsellBottomSheetViewState.copy$default(applyMutation, false, null, new UiEvent(new LegacyIntentKey.CashCushionDetails(((LegacyDialogFragmentKey.CashCushionUpsell) INSTANCE.getArgs((HasSavedState) cashCushionUpsellBottomSheetDuxo)).getEntryPoint(), false, 2, null)), null, 11, null);
    }

    /* compiled from: CashCushionUpsellBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$CashCushionUpsell;", "<init>", "()V", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CashCushionUpsellBottomSheetDuxo, LegacyDialogFragmentKey.CashCushionUpsell> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.CashCushionUpsell getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyDialogFragmentKey.CashCushionUpsell) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.CashCushionUpsell getArgs(CashCushionUpsellBottomSheetDuxo cashCushionUpsellBottomSheetDuxo) {
            return (LegacyDialogFragmentKey.CashCushionUpsell) DuxoCompanion.DefaultImpls.getArgs(this, cashCushionUpsellBottomSheetDuxo);
        }
    }
}
