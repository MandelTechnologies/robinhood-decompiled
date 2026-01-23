package com.robinhood.android.directdeposit.p101ui.redirect;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.prefs.HasShownT30RhsNoaRedirectSheetPref;
import com.robinhood.prefs.LongPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RedirectDirectDepositBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/redirect/RedirectDirectDepositBottomSheetDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/redirect/RedirectDirectDepositBottomSheetViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "hasShownT30RhsNoaRedirectSheetPref", "Lcom/robinhood/prefs/LongPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/prefs/LongPreference;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class RedirectDirectDepositBottomSheetDuxo extends OldBaseDuxo<RedirectDirectDepositBottomSheetViewState> implements HasSavedState {
    private final LongPreference hasShownT30RhsNoaRedirectSheetPref;
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
    public RedirectDirectDepositBottomSheetDuxo(@HasShownT30RhsNoaRedirectSheetPref LongPreference hasShownT30RhsNoaRedirectSheetPref, SavedStateHandle savedStateHandle) {
        super(new RedirectDirectDepositBottomSheetViewState(((LegacyDialogFragmentKey.RedirectDirectDeposit) INSTANCE.getArgs(savedStateHandle)).getStatus()), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(hasShownT30RhsNoaRedirectSheetPref, "hasShownT30RhsNoaRedirectSheetPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.hasShownT30RhsNoaRedirectSheetPref = hasShownT30RhsNoaRedirectSheetPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.hasShownT30RhsNoaRedirectSheetPref.set(((LegacyDialogFragmentKey.RedirectDirectDeposit) INSTANCE.getArgs((HasSavedState) this)).getStatus().getLatestRhsDdRelationshipTime());
    }

    /* compiled from: RedirectDirectDepositBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/redirect/RedirectDirectDepositBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/directdeposit/ui/redirect/RedirectDirectDepositBottomSheetDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$RedirectDirectDeposit;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RedirectDirectDepositBottomSheetDuxo, LegacyDialogFragmentKey.RedirectDirectDeposit> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.RedirectDirectDeposit getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyDialogFragmentKey.RedirectDirectDeposit) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.RedirectDirectDeposit getArgs(RedirectDirectDepositBottomSheetDuxo redirectDirectDepositBottomSheetDuxo) {
            return (LegacyDialogFragmentKey.RedirectDirectDeposit) DuxoCompanion.DefaultImpls.getArgs(this, redirectDirectDepositBottomSheetDuxo);
        }
    }
}
