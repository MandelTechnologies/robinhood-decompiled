package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.EnterDepositScheduleAmountFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnterDepositScheduleAmountDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EnterDepositScheduleAmountDuxo extends OldBaseDuxo<EnterDepositScheduleAmountViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterDepositScheduleAmountDuxo(AchRelationshipStore achRelationshipStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new EnterDepositScheduleAmountViewState(null, ((EnterDepositScheduleAmountFragment.Args) companion.getArgs(savedStateHandle)).getTransferContext().showDepositFrequencyButton(), ((EnterDepositScheduleAmountFragment.Args) companion.getArgs(savedStateHandle)).getTransferContext().getIsDepositFrequencyButtonClickable(), ((EnterDepositScheduleAmountFragment.Args) companion.getArgs(savedStateHandle)).getEnterAmountArgs(), 1, null), null, 2, 0 == true ? 1 : 0);
        this.achRelationshipStore = achRelationshipStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.achRelationshipStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(this.achRelationshipStore.getDefaultAchRelationship()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterDepositScheduleAmountDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EnterDepositScheduleAmountDuxo.onResume$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(EnterDepositScheduleAmountDuxo enterDepositScheduleAmountDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final AchRelationship achRelationship = (AchRelationship) optional.component1();
        enterDepositScheduleAmountDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterDepositScheduleAmountDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EnterDepositScheduleAmountDuxo.onResume$lambda$1$lambda$0(achRelationship, (EnterDepositScheduleAmountViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterDepositScheduleAmountViewState onResume$lambda$1$lambda$0(AchRelationship achRelationship, EnterDepositScheduleAmountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EnterDepositScheduleAmountViewState.copy$default(applyMutation, achRelationship, false, false, null, 14, null);
    }

    /* compiled from: EnterDepositScheduleAmountDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountDuxo;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EnterDepositScheduleAmountDuxo, EnterDepositScheduleAmountFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EnterDepositScheduleAmountFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EnterDepositScheduleAmountFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EnterDepositScheduleAmountFragment.Args getArgs(EnterDepositScheduleAmountDuxo enterDepositScheduleAmountDuxo) {
            return (EnterDepositScheduleAmountFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, enterDepositScheduleAmountDuxo);
        }
    }
}
