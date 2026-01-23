package com.robinhood.android.psp;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment;
import com.robinhood.android.psp.ProgramEnrollmentCelebrationViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgramEnrollmentCelebrationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProgramEnrollmentCelebrationDuxo extends OldBaseDuxo<ProgramEnrollmentCelebrationViewState> implements HasSavedState {
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
    public ProgramEnrollmentCelebrationDuxo(SavedStateHandle savedStateHandle) {
        super(ProgramEnrollmentCelebrationViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        applyMutation(new Function1() { // from class: com.robinhood.android.psp.ProgramEnrollmentCelebrationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramEnrollmentCelebrationDuxo.onStart$lambda$0(this.f$0, (ProgramEnrollmentCelebrationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgramEnrollmentCelebrationViewState onStart$lambda$0(ProgramEnrollmentCelebrationDuxo programEnrollmentCelebrationDuxo, ProgramEnrollmentCelebrationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new ProgramEnrollmentCelebrationViewState.Loaded(((ProgramEnrollmentCelebrationFragment.Args) INSTANCE.getArgs((HasSavedState) programEnrollmentCelebrationDuxo)).getEnrollmentResponse());
    }

    /* compiled from: ProgramEnrollmentCelebrationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationDuxo;", "Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationFragment$Args;", "<init>", "()V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ProgramEnrollmentCelebrationDuxo, ProgramEnrollmentCelebrationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ProgramEnrollmentCelebrationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ProgramEnrollmentCelebrationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ProgramEnrollmentCelebrationFragment.Args getArgs(ProgramEnrollmentCelebrationDuxo programEnrollmentCelebrationDuxo) {
            return (ProgramEnrollmentCelebrationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, programEnrollmentCelebrationDuxo);
        }
    }
}
