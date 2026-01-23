package com.robinhood.android.recommendations.lib.p221ui.recurringhook.ordertype;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.recommendations.lib.p221ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsAllocationWeightsStore;
import com.robinhood.recommendations.models.api.allocationweights.ApiRecommendationsAllocationWeightsResponse;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsRecurringHookOrderTypeSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/recommendations/lib/ui/recurringhook/ordertype/RecommendationsRecurringHookOrderTypeSelectionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recommendations/lib/ui/recurringhook/ordertype/RecommendationsRecurringHookOrderTypeSelectionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "recsAllocationWeightsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsAllocationWeightsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsAllocationWeightsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "applyRecommendationsSplitToRecurringOrder", "", "Companion", "feature-lib-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RecommendationsRecurringHookOrderTypeSelectionDuxo extends OldBaseDuxo<RecommendationsRecurringHookOrderTypeSelectionViewState> implements HasSavedState {
    private final RecommendationsAllocationWeightsStore recsAllocationWeightsStore;
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
    public RecommendationsRecurringHookOrderTypeSelectionDuxo(RecommendationsAllocationWeightsStore recsAllocationWeightsStore, SavedStateHandle savedStateHandle) {
        super(new RecommendationsRecurringHookOrderTypeSelectionViewState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(recsAllocationWeightsStore, "recsAllocationWeightsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.recsAllocationWeightsStore = recsAllocationWeightsStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void applyRecommendationsSplitToRecurringOrder() {
        Observable<List<ApiRecommendationsAllocationWeightsResponse.Weight>> observableRefCount = this.recsAllocationWeightsStore.getAllocationWeights(((RecommendationsRecurringHookOrderTypeSelectionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getRecommendationId()).toObservable().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRecurringHookOrderTypeSelectionDuxo.applyRecommendationsSplitToRecurringOrder$lambda$1(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyRecommendationsSplitToRecurringOrder$lambda$1(RecommendationsRecurringHookOrderTypeSelectionDuxo recommendationsRecurringHookOrderTypeSelectionDuxo, final List list) {
        recommendationsRecurringHookOrderTypeSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRecurringHookOrderTypeSelectionDuxo.applyRecommendationsSplitToRecurringOrder$lambda$1$lambda$0(list, (RecommendationsRecurringHookOrderTypeSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsRecurringHookOrderTypeSelectionViewState applyRecommendationsSplitToRecurringOrder$lambda$1$lambda$0(List list, RecommendationsRecurringHookOrderTypeSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(new UiEvent<>(list));
    }

    /* compiled from: RecommendationsRecurringHookOrderTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/lib/ui/recurringhook/ordertype/RecommendationsRecurringHookOrderTypeSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recommendations/lib/ui/recurringhook/ordertype/RecommendationsRecurringHookOrderTypeSelectionDuxo;", "Lcom/robinhood/android/recommendations/lib/ui/recurringhook/ordertype/RecommendationsRecurringHookOrderTypeSelectionFragment$Args;", "<init>", "()V", "feature-lib-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecommendationsRecurringHookOrderTypeSelectionDuxo, RecommendationsRecurringHookOrderTypeSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsRecurringHookOrderTypeSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecommendationsRecurringHookOrderTypeSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsRecurringHookOrderTypeSelectionFragment.Args getArgs(RecommendationsRecurringHookOrderTypeSelectionDuxo recommendationsRecurringHookOrderTypeSelectionDuxo) {
            return (RecommendationsRecurringHookOrderTypeSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recommendationsRecurringHookOrderTypeSelectionDuxo);
        }
    }
}
