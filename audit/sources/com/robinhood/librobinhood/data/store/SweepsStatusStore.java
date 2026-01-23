package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.models.api.ApiSweepsTimelineSummary;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.models.p320db.mcduckling.SweepsTimelineSummary;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepsStatusStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsTimelineSummaryStore", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/store/StoreBundle;)V", "stream", "Lio/reactivex/Observable;", "Lcom/robinhood/librobinhood/data/store/SweepsStatus;", "refresh", "", "force", "", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SweepsStatusStore extends Store {
    private final AccountProvider accountProvider;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsInterestStore sweepsInterestStore;
    private final SweepsTimelineSummaryStore sweepsTimelineSummaryStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SweepsStatusStore(AccountProvider accountProvider, SweepEnrollmentStore sweepEnrollmentStore, SweepsTimelineSummaryStore sweepsTimelineSummaryStore, SweepsInterestStore sweepsInterestStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsTimelineSummaryStore = sweepsTimelineSummaryStore;
        this.sweepsInterestStore = sweepsInterestStore;
    }

    public final Observable<SweepsStatus> stream() {
        Observable observableSwitchMap = this.accountProvider.streamIndividualAccountNumberOptional().distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.SweepsStatusStore.stream.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends SweepsStatus> apply(Optional<String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String orNull = it.getOrNull();
                if (orNull != null) {
                    Observables observables = Observables.INSTANCE;
                    Observable<R> map = SweepsTimelineSummaryStore.getTimelineSummary$default(SweepsStatusStore.this.sweepsTimelineSummaryStore, orNull, null, 2, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.SweepsStatusStore.stream.1.1
                        @Override // io.reactivex.functions.Function
                        public final Boolean apply(SweepsTimelineSummary timeline) {
                            Intrinsics.checkNotNullParameter(timeline, "timeline");
                            return Boolean.valueOf(timeline.getStatus() != ApiSweepsTimelineSummary.Status.PAUSED);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    Observable observableCombineLatest = Observable.combineLatest(map, SweepsStatusStore.this.sweepEnrollmentStore.getSweepEnrollmentObservable(orNull), SweepsStatusStore.this.sweepsInterestStore.streamNoAccountNumber(), new Function3<T1, T2, T3, R>() { // from class: com.robinhood.librobinhood.data.store.SweepsStatusStore$stream$1$apply$$inlined$combineLatest$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // io.reactivex.functions.Function3
                        public final R apply(T1 t1, T2 t2, T3 t3) {
                            Intrinsics.checkParameterIsNotNull(t1, "t1");
                            Intrinsics.checkParameterIsNotNull(t2, "t2");
                            Intrinsics.checkParameterIsNotNull(t3, "t3");
                            ApiSweepEnrollment apiSweepEnrollment = (ApiSweepEnrollment) t2;
                            return (R) new SweepsStatus(((Boolean) t1).booleanValue(), apiSweepEnrollment, (Optional<SweepsInterest>) t3);
                        }
                    });
                    Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
                    return observableCombineLatest;
                }
                Observable observableJust = Observable.just(new SweepsStatus(false, new ApiSweepEnrollment(false), (SweepsInterest) null));
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public static /* synthetic */ void refresh$default(SweepsStatusStore sweepsStatusStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        sweepsStatusStore.refresh(z);
    }

    public final void refresh(boolean force) {
        this.accountProvider.refresh(force);
        SweepEnrollmentStore.refreshSweepSplash$default(this.sweepEnrollmentStore, null, force, 1, null);
        this.sweepsInterestStore.refreshNoAccountNumber(force);
    }
}
