package com.robinhood.shared.unverifiedaccountrecovery.email.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.shared.support.contracts.pathfinder.EmailConfirmationFragmentKey;
import com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationEvent;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: EmailConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001cB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationDataState;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationViewState;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "stateProvider", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "sendUserInput", "", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationInputOption;", "sendUserInput$feature_unverified_account_recovery_externalDebug", "handleInputError", "", "throwable", "", "handleInputError$feature_unverified_account_recovery_externalDebug", "Companion", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EmailConfirmationDuxo extends BaseDuxo3<EmailConfirmationDataState, EmailConfirmationViewState, EmailConfirmationEvent> implements HasSavedState {
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailConfirmationDuxo(PathfinderStore pathfinderStore, EmailConfirmationStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new EmailConfirmationDataState((EmailConfirmationFragmentKey) INSTANCE.getArgs(savedStateHandle), null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void sendUserInput$feature_unverified_account_recovery_externalDebug(EmailConfirmationInputOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new EmailConfirmationDuxo2(this, option, null), 3, null);
    }

    /* renamed from: handleInputError$feature_unverified_account_recovery_externalDebug */
    public final boolean m2960xe95d987(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        boolean zIsNetworkRelated = Throwables.isNetworkRelated(throwable);
        if (zIsNetworkRelated) {
            submit(new EmailConfirmationEvent.SendInputErrorEvent(throwable));
        }
        return zIsNetworkRelated;
    }

    /* compiled from: EmailConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationDuxo;", "Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EmailConfirmationDuxo, EmailConfirmationFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EmailConfirmationFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (EmailConfirmationFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EmailConfirmationFragmentKey getArgs(EmailConfirmationDuxo emailConfirmationDuxo) {
            return (EmailConfirmationFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, emailConfirmationDuxo);
        }
    }
}
