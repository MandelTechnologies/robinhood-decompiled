package com.robinhood.android.psp.history;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.psp.history.PspGiftHistoryDetailFragment;
import com.robinhood.android.psp.history.PspGiftHistoryDetailViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.PspStore;
import com.robinhood.models.p320db.bonfire.PspGiftHistoryDetail;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PspGiftHistoryDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/psp/history/PspGiftHistoryDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pspStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PspStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/PspStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "refresh", "fetchDetail", "Companion", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PspGiftHistoryDetailDuxo extends OldBaseDuxo<PspGiftHistoryDetailViewState> implements HasSavedState {
    private final PspStore pspStore;
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
    public PspGiftHistoryDetailDuxo(PspStore pspStore, SavedStateHandle savedStateHandle) {
        super(new PspGiftHistoryDetailViewState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pspStore, "pspStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pspStore = pspStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        fetchDetail();
    }

    public final void refresh() {
        applyMutation(new Function1() { // from class: com.robinhood.android.psp.history.PspGiftHistoryDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PspGiftHistoryDetailDuxo.refresh$lambda$0((PspGiftHistoryDetailViewState) obj);
            }
        });
        fetchDetail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PspGiftHistoryDetailViewState refresh$lambda$0(PspGiftHistoryDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(PspGiftHistoryDetailViewState.Result.Loading.INSTANCE);
    }

    private final void fetchDetail() {
        LifecycleHost.DefaultImpls.bind$default(this, this.pspStore.getHistoryDetail(((PspGiftHistoryDetailFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getProgramId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.psp.history.PspGiftHistoryDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PspGiftHistoryDetailDuxo.fetchDetail$lambda$2(this.f$0, (PspGiftHistoryDetail) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchDetail$lambda$2(PspGiftHistoryDetailDuxo pspGiftHistoryDetailDuxo, final PspGiftHistoryDetail pspGiftItemDetail) {
        Intrinsics.checkNotNullParameter(pspGiftItemDetail, "pspGiftItemDetail");
        pspGiftHistoryDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.psp.history.PspGiftHistoryDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PspGiftHistoryDetailDuxo.fetchDetail$lambda$2$lambda$1(pspGiftItemDetail, (PspGiftHistoryDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PspGiftHistoryDetailViewState fetchDetail$lambda$2$lambda$1(PspGiftHistoryDetail pspGiftHistoryDetail, PspGiftHistoryDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(new PspGiftHistoryDetailViewState.Result.Success(pspGiftHistoryDetail));
    }

    /* compiled from: PspGiftHistoryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/psp/history/PspGiftHistoryDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/psp/history/PspGiftHistoryDetailDuxo;", "Lcom/robinhood/android/psp/history/PspGiftHistoryDetailFragment$Args;", "<init>", "()V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PspGiftHistoryDetailDuxo, PspGiftHistoryDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PspGiftHistoryDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PspGiftHistoryDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PspGiftHistoryDetailFragment.Args getArgs(PspGiftHistoryDetailDuxo pspGiftHistoryDetailDuxo) {
            return (PspGiftHistoryDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, pspGiftHistoryDetailDuxo);
        }
    }
}
