package com.robinhood.android.retirement;

import com.robinhood.android.models.retirement.p194db.RetirementDashboardState;
import com.robinhood.android.retirement.RetirementDashboardAccessManager2;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementDashboardStateStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementDashboardAccessManager.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ6\u0010\f\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\b0\b \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u0007*\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/retirement/RetirementDashboardAccessManager;", "", "retirementDashboardStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementDashboardStateStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementDashboardStateStore;)V", "streamRetirementDashboardAccessState", "Lio/reactivex/Observable;", "Lcom/robinhood/android/retirement/RetirementDashboardAccessState;", "forceRefresh", "Lio/reactivex/Single;", "Lcom/robinhood/android/models/retirement/db/RetirementDashboardState;", "mapToRetirementAccessState", "kotlin.jvm.PlatformType", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementDashboardAccessManager {
    public static final int $stable = 8;
    private final RetirementDashboardStateStore retirementDashboardStateStore;

    public RetirementDashboardAccessManager(RetirementDashboardStateStore retirementDashboardStateStore) {
        Intrinsics.checkNotNullParameter(retirementDashboardStateStore, "retirementDashboardStateStore");
        this.retirementDashboardStateStore = retirementDashboardStateStore;
    }

    public final Observable<RetirementDashboardAccessManager2> streamRetirementDashboardAccessState() {
        Observable<RetirementDashboardAccessManager2> observableOnErrorReturnItem = this.retirementDashboardStateStore.streamRetirementDashboardState().take(1L).switchMap(new Function() { // from class: com.robinhood.android.retirement.RetirementDashboardAccessManager.streamRetirementDashboardAccessState.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RetirementDashboardAccessManager2> apply(Optional<RetirementDashboardState> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                RetirementDashboardState retirementDashboardStateComponent1 = optional.component1();
                if (retirementDashboardStateComponent1 == null) {
                    RetirementDashboardAccessManager retirementDashboardAccessManager = RetirementDashboardAccessManager.this;
                    Observable<RetirementDashboardState> observable = retirementDashboardAccessManager.retirementDashboardStateStore.forceFetchRetirementDashboardState().toObservable();
                    Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
                    return retirementDashboardAccessManager.mapToRetirementAccessState(observable);
                }
                RetirementDashboardAccessManager retirementDashboardAccessManager2 = RetirementDashboardAccessManager.this;
                Observable observableJust = Observable.just(retirementDashboardStateComponent1);
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                return retirementDashboardAccessManager2.mapToRetirementAccessState(observableJust);
            }
        }).concatWith(mapToRetirementAccessState(ObservablesKt.filterIsPresent(this.retirementDashboardStateStore.streamRetirementDashboardState()))).onErrorReturnItem(RetirementDashboardAccessManager2.UnableToLoad.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
        return observableOnErrorReturnItem;
    }

    public final Single<RetirementDashboardState> forceRefresh() {
        return this.retirementDashboardStateStore.forceFetchRetirementDashboardState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<RetirementDashboardAccessManager2> mapToRetirementAccessState(Observable<RetirementDashboardState> observable) {
        return observable.map(new Function() { // from class: com.robinhood.android.retirement.RetirementDashboardAccessManager.mapToRetirementAccessState.1
            @Override // io.reactivex.functions.Function
            public final RetirementDashboardAccessManager2 apply(RetirementDashboardState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new RetirementDashboardAccessManager2.HasAccess(it.getState());
            }
        });
    }
}
