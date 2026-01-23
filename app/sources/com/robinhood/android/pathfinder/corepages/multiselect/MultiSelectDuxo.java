package com.robinhood.android.pathfinder.corepages.multiselect;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.support.contracts.pathfinder.MultiSelectFragmentKey;
import com.robinhood.utils.extensions.Throwables;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: MultiSelectDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001eB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0002\b\u0014J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState;", "Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "sendInput", "", "options", "", "", "sendInput$feature_pathfinder_core_pages_externalDebug", "updateOption", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "checked", "", "updateOption$feature_pathfinder_core_pages_externalDebug", "handleInputError", "t", "", "handleInputError$feature_pathfinder_core_pages_externalDebug", "Companion", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class MultiSelectDuxo extends BaseDuxo5<MultiSelectViewState, MultiSelectEvent> implements HasSavedState {
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
    public MultiSelectDuxo(PathfinderStore pathfinderStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new MultiSelectViewState(((UserViewStatePageContext.MultiSelect) ((MultiSelectFragmentKey) INSTANCE.getArgs(savedStateHandle)).getUserViewState().getTypeContext()).getContext(), false, null, 6, null), duxoBundle);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void sendInput$feature_pathfinder_core_pages_externalDebug(List<String> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new MultiSelectDuxo2(this, options, null), 3, null);
    }

    public final void updateOption$feature_pathfinder_core_pages_externalDebug(String option, boolean checked) {
        Intrinsics.checkNotNullParameter(option, "option");
        applyMutation(new MultiSelectDuxo3(checked, option, null));
    }

    public final boolean handleInputError$feature_pathfinder_core_pages_externalDebug(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        boolean zIsNetworkRelated = Throwables.isNetworkRelated(t);
        if (zIsNetworkRelated) {
            submit(new MultiSelectEvent.SendInputErrorEvent(t));
        }
        return zIsNetworkRelated;
    }

    /* compiled from: MultiSelectDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectDuxo;", "Lcom/robinhood/shared/support/contracts/pathfinder/MultiSelectFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MultiSelectDuxo, MultiSelectFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MultiSelectFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (MultiSelectFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MultiSelectFragmentKey getArgs(MultiSelectDuxo multiSelectDuxo) {
            return (MultiSelectFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, multiSelectDuxo);
        }
    }
}
