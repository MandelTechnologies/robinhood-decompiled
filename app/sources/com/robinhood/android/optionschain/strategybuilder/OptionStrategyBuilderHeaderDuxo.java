package com.robinhood.android.optionschain.strategybuilder;

import android.view.View;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionStrategyBuilderHeaderDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderHeaderDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderHeaderViewState;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "hostView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/android/indexes/store/IndexStore;Landroid/view/View;)V", "onStart", "", "bindUiOptionChains", "uiOptionChains", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionChain;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStrategyBuilderHeaderDuxo extends ViewDuxo<OptionStrategyBuilderHeaderViewState> {
    public static final int $stable = 8;
    private final IndexStore indexStore;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionStrategyBuilderHeaderDuxo(IndexStore indexStore, View hostView) {
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Scheduler scheduler = null;
        super(hostView, new OptionStrategyBuilderHeaderViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), scheduler, 4, null);
        this.indexStore = indexStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderDuxo$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionStrategyBuilderHeaderViewState) it).getApiIndexValueDetailRequest());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionStrategyBuilderHeaderDuxo$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(map).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends IndexValue> apply(ApiIndexValueDetailRequest.ApiIndexValueRequestById it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionStrategyBuilderHeaderDuxo optionStrategyBuilderHeaderDuxo = OptionStrategyBuilderHeaderDuxo.this;
                return optionStrategyBuilderHeaderDuxo.asObservable(optionStrategyBuilderHeaderDuxo.indexStore.streamIndexValue(it));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderHeaderDuxo.onStart$lambda$2(this.f$0, (IndexValue) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(OptionStrategyBuilderHeaderDuxo optionStrategyBuilderHeaderDuxo, final IndexValue indexValue) {
        optionStrategyBuilderHeaderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderHeaderDuxo.onStart$lambda$2$lambda$1(indexValue, (OptionStrategyBuilderHeaderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderHeaderViewState onStart$lambda$2$lambda$1(IndexValue indexValue, OptionStrategyBuilderHeaderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderHeaderViewState.copy$default(applyMutation, null, indexValue, 1, null);
    }

    public final void bindUiOptionChains(final ImmutableList<UiOptionChain> uiOptionChains) {
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderHeaderDuxo.bindUiOptionChains$lambda$3(uiOptionChains, (OptionStrategyBuilderHeaderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderHeaderViewState bindUiOptionChains$lambda$3(ImmutableList immutableList, OptionStrategyBuilderHeaderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderHeaderViewState.copy$default(applyMutation, immutableList, null, 2, null);
    }
}
