package com.robinhood.android.store.matcha;

import com.robinhood.android.store.matcha.prefs.HasSeenBadgePref;
import com.robinhood.android.store.matcha.prefs.LastBadgeSeenTransactionCountPref;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function5;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaBadgeStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaBadgeStore;", "Lcom/robinhood/store/Store;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "treatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "pendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "hasSeenBadgePref", "Lcom/robinhood/prefs/BooleanPreference;", "lastSeenTransactionCountPref", "Lcom/robinhood/prefs/IntPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/store/StoreBundle;)V", "streamShouldBadge", "Lio/reactivex/Observable;", "", "markBadgeSeen", "", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MatchaBadgeStore extends Store {
    private final BooleanPreference hasSeenBadgePref;
    private final IntPreference lastSeenTransactionCountPref;
    private final MatchaPendingTransactionStore pendingTransactionStore;
    private final RhyAccountStore rhyAccountStore;
    private final MatchaTreatmentStore treatmentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaBadgeStore(RhyAccountStore rhyAccountStore, MatchaTreatmentStore treatmentStore, MatchaPendingTransactionStore pendingTransactionStore, @HasSeenBadgePref BooleanPreference hasSeenBadgePref, @LastBadgeSeenTransactionCountPref IntPreference lastSeenTransactionCountPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(treatmentStore, "treatmentStore");
        Intrinsics.checkNotNullParameter(pendingTransactionStore, "pendingTransactionStore");
        Intrinsics.checkNotNullParameter(hasSeenBadgePref, "hasSeenBadgePref");
        Intrinsics.checkNotNullParameter(lastSeenTransactionCountPref, "lastSeenTransactionCountPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.rhyAccountStore = rhyAccountStore;
        this.treatmentStore = treatmentStore;
        this.pendingTransactionStore = pendingTransactionStore;
        this.hasSeenBadgePref = hasSeenBadgePref;
        this.lastSeenTransactionCountPref = lastSeenTransactionCountPref;
    }

    public final Observable<Boolean> streamShouldBadge() {
        MatchaPendingTransactionStore.refresh$default(this.pendingTransactionStore, false, 1, null);
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(this.pendingTransactionStore.streamPendingTransactionCount(), this.rhyAccountStore.streamAccounts(), this.treatmentStore.streamCanInitiate(), this.lastSeenTransactionCountPref.getChanges(), this.hasSeenBadgePref.getChanges(), new Function5<T1, T2, T3, T4, T5, R>() { // from class: com.robinhood.android.store.matcha.MatchaBadgeStore$streamShouldBadge$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                boolean zBooleanValue = ((Boolean) t5).booleanValue();
                int iIntValue = ((Number) t4).intValue();
                boolean zBooleanValue2 = ((Boolean) t3).booleanValue();
                List list = (List) t2;
                int iIntValue2 = ((Number) t1).intValue();
                return (R) Boolean.valueOf((iIntValue2 > 0 && iIntValue2 != iIntValue) || (list.isEmpty() && zBooleanValue2 && !zBooleanValue));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        Observable<Boolean> observableDistinctUntilChanged = observableCombineLatest.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final void markBadgeSeen() {
        this.hasSeenBadgePref.set(true);
        Single<Integer> singleFirst = this.pendingTransactionStore.streamPendingTransactionCount().first(0);
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        ScopedSubscriptionKt.subscribeIn(singleFirst, getStoreScope(), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaBadgeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaBadgeStore.markBadgeSeen$lambda$1(this.f$0, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit markBadgeSeen$lambda$1(MatchaBadgeStore matchaBadgeStore, Integer num) {
        IntPreference intPreference = matchaBadgeStore.lastSeenTransactionCountPref;
        Intrinsics.checkNotNull(num);
        intPreference.set(num.intValue());
        return Unit.INSTANCE;
    }
}
