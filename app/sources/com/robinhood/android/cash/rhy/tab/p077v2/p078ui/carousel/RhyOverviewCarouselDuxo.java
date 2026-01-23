package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel;

import com.robinhood.android.lib.creditcard.CreditCardSolidGoldReferralProgramTermination;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.rhy.RhyTabCarouselStore;
import com.robinhood.librobinhood.store.RhyOverviewAccountStore;
import com.robinhood.models.p320db.rhy.RhyTabCarouselItem;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOverviewCarouselDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselDataState;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState;", "rhyTabCarouselStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyTabCarouselStore;", "rhyOverviewAccountStore", "Lcom/robinhood/librobinhood/store/RhyOverviewAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stateProvider", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/rhy/RhyTabCarouselStore;Lcom/robinhood/librobinhood/store/RhyOverviewAccountStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "dismissCarouselItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/models/db/rhy/RhyTabCarouselItem;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyOverviewCarouselDuxo extends BaseDuxo<RhyOverviewCarouselDataState, RhyOverviewCarouselViewState> {
    public static final int $stable = 8;
    private final ExperimentsStore experimentsStore;
    private final RhyOverviewAccountStore rhyOverviewAccountStore;
    private final RhyTabCarouselStore rhyTabCarouselStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyOverviewCarouselDuxo(RhyTabCarouselStore rhyTabCarouselStore, RhyOverviewAccountStore rhyOverviewAccountStore, ExperimentsStore experimentsStore, RhyOverviewCarouselStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new RhyOverviewCarouselDataState(null, null, null, false, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(rhyTabCarouselStore, "rhyTabCarouselStore");
        Intrinsics.checkNotNullParameter(rhyOverviewAccountStore, "rhyOverviewAccountStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rhyTabCarouselStore = rhyTabCarouselStore;
        this.rhyOverviewAccountStore = rhyOverviewAccountStore;
        this.experimentsStore = experimentsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.rhyTabCarouselStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.rhyOverviewAccountStore.streamRhyAndMinervaAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewCarouselDuxo.onStart$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
        Observable<List<RhyTabCarouselItem>> observableDistinctUntilChanged = this.rhyTabCarouselStore.streamRhyTabCarousel().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewCarouselDuxo.onStart$lambda$1(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{CreditCardSolidGoldReferralProgramTermination.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewCarouselDuxo.onStart$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RhyOverviewCarouselDuxo rhyOverviewCarouselDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        rhyOverviewCarouselDuxo.applyMutation(new RhyOverviewCarouselDuxo2((Optional) tuples2.component1(), (Optional) tuples2.component2(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyOverviewCarouselDuxo rhyOverviewCarouselDuxo, List list) {
        rhyOverviewCarouselDuxo.applyMutation(new RhyOverviewCarouselDuxo3(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(RhyOverviewCarouselDuxo rhyOverviewCarouselDuxo, boolean z) {
        rhyOverviewCarouselDuxo.applyMutation(new RhyOverviewCarouselDuxo4(z, null));
        return Unit.INSTANCE;
    }

    public final void dismissCarouselItem(RhyTabCarouselItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        LifecycleHost.DefaultImpls.bind$default(this, this.rhyTabCarouselStore.dismissItem(item), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewCarouselDuxo.dismissCarouselItem$lambda$3(this.f$0, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dismissCarouselItem$lambda$3(RhyOverviewCarouselDuxo rhyOverviewCarouselDuxo, Unit unit) {
        rhyOverviewCarouselDuxo.rhyTabCarouselStore.refresh(true);
        return Unit.INSTANCE;
    }
}
