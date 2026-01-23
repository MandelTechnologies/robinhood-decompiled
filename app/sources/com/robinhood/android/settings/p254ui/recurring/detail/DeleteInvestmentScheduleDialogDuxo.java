package com.robinhood.android.settings.p254ui.recurring.detail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.settings.p254ui.recurring.detail.DeleteInvestmentScheduleDialogFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.udf.UiEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteInvestmentScheduleDialogDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "investmentScheduleId", "Ljava/util/UUID;", "deleteInvestmentSchedule", "", "Companion", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DeleteInvestmentScheduleDialogDuxo extends OldBaseDuxo<DeleteInvestmentScheduleDialogViewState> implements HasSavedState {
    private final UUID investmentScheduleId;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
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
    public DeleteInvestmentScheduleDialogDuxo(TraderInvestmentScheduleStore investmentScheduleStore, SavedStateHandle savedStateHandle) {
        super(new DeleteInvestmentScheduleDialogViewState(false, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.investmentScheduleStore = investmentScheduleStore;
        this.savedStateHandle = savedStateHandle;
        UUID id = ((DeleteInvestmentScheduleDialogFragment.Args) INSTANCE.getArgs(getSavedStateHandle())).getInvestmentSchedule().getId();
        if (id == null) {
            throw new IllegalStateException("Cannot create InvestmentScheduleSettingsDuxo without investmentScheduleId");
        }
        this.investmentScheduleId = id;
    }

    public final void deleteInvestmentSchedule() {
        applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteInvestmentScheduleDialogDuxo.deleteInvestmentSchedule$lambda$1((DeleteInvestmentScheduleDialogViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.investmentScheduleStore.deleteInvestmentSchedule(this.investmentScheduleId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteInvestmentScheduleDialogDuxo.deleteInvestmentSchedule$lambda$3(this.f$0, (InvestmentSchedule) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteInvestmentScheduleDialogDuxo.deleteInvestmentSchedule$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeleteInvestmentScheduleDialogViewState deleteInvestmentSchedule$lambda$1(DeleteInvestmentScheduleDialogViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DeleteInvestmentScheduleDialogViewState.copy$default(applyMutation, true, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteInvestmentSchedule$lambda$3(DeleteInvestmentScheduleDialogDuxo deleteInvestmentScheduleDialogDuxo, InvestmentSchedule it) {
        Intrinsics.checkNotNullParameter(it, "it");
        deleteInvestmentScheduleDialogDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteInvestmentScheduleDialogDuxo.deleteInvestmentSchedule$lambda$3$lambda$2((DeleteInvestmentScheduleDialogViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeleteInvestmentScheduleDialogViewState deleteInvestmentSchedule$lambda$3$lambda$2(DeleteInvestmentScheduleDialogViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DeleteInvestmentScheduleDialogViewState.copy$default(applyMutation, false, new UiEvent(Unit.INSTANCE), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteInvestmentSchedule$lambda$5(DeleteInvestmentScheduleDialogDuxo deleteInvestmentScheduleDialogDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        deleteInvestmentScheduleDialogDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteInvestmentScheduleDialogDuxo.deleteInvestmentSchedule$lambda$5$lambda$4(t, (DeleteInvestmentScheduleDialogViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeleteInvestmentScheduleDialogViewState deleteInvestmentSchedule$lambda$5$lambda$4(Throwable th, DeleteInvestmentScheduleDialogViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DeleteInvestmentScheduleDialogViewState.copy$default(applyMutation, false, null, new UiEvent(th), 2, null);
    }

    /* compiled from: DeleteInvestmentScheduleDialogDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogDuxo;", "Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Args;", "<init>", "()V", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DeleteInvestmentScheduleDialogDuxo, DeleteInvestmentScheduleDialogFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DeleteInvestmentScheduleDialogFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DeleteInvestmentScheduleDialogFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DeleteInvestmentScheduleDialogFragment.Args getArgs(DeleteInvestmentScheduleDialogDuxo deleteInvestmentScheduleDialogDuxo) {
            return (DeleteInvestmentScheduleDialogFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, deleteInvestmentScheduleDialogDuxo);
        }
    }
}
