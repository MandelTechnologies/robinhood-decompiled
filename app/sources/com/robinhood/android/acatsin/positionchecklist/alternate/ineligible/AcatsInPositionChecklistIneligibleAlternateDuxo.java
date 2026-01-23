package com.robinhood.android.acatsin.positionchecklist.alternate.ineligible;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateContract;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPositionChecklistIneligibleAlternateDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\fB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPositionChecklistIneligibleAlternateDuxo extends BaseDuxo4<AcatsInPositionChecklistIneligibleAlternateViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInPositionChecklistIneligibleAlternateDuxo(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new AcatsInPositionChecklistIneligibleAlternateViewState(((AcatsInPositionChecklistIneligibleAlternateContract.Key) companion.getArgs(savedStateHandle)).getAccountType(), ((AcatsInPositionChecklistIneligibleAlternateContract.Key) companion.getArgs(savedStateHandle)).getPartialContents()), duxoBundle);
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: AcatsInPositionChecklistIneligibleAlternateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateDuxo;", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInPositionChecklistIneligibleAlternateDuxo, AcatsInPositionChecklistIneligibleAlternateContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPositionChecklistIneligibleAlternateContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInPositionChecklistIneligibleAlternateContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPositionChecklistIneligibleAlternateContract.Key getArgs(AcatsInPositionChecklistIneligibleAlternateDuxo acatsInPositionChecklistIneligibleAlternateDuxo) {
            return (AcatsInPositionChecklistIneligibleAlternateContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInPositionChecklistIneligibleAlternateDuxo);
        }
    }
}
