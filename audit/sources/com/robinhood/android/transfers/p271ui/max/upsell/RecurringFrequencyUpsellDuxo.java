package com.robinhood.android.transfers.p271ui.max.upsell;

import com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.librobinhood.data.store.SweepsStatusStore;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringFrequencyUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDataState;", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState;", "sweepsStatusStore", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringFrequencyUpsellDuxo extends BaseDuxo<RecurringFrequencyUpsellDataState, RecurringFrequencyUpsellViewState> {
    public static final int $stable = 8;
    private final GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore;
    private final SweepsStatusStore sweepsStatusStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringFrequencyUpsellDuxo(SweepsStatusStore sweepsStatusStore, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, DuxoBundle duxoBundle) {
        super(new RecurringFrequencyUpsellDataState(null, null, 3, null), RecurringFrequencyUpsellDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
        Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.sweepsStatusStore = sweepsStatusStore;
        this.goldDepositBoostMaxAwarenessStore = goldDepositBoostMaxAwarenessStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Observable observableDistinctUntilChanged = Observables.INSTANCE.combineLatest(this.goldDepositBoostMaxAwarenessStore.streamGoldDepositBoostMaxAwareness(), this.sweepsStatusStore.stream()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringFrequencyUpsellDuxo.onCreate$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(RecurringFrequencyUpsellDuxo recurringFrequencyUpsellDuxo, Tuples2 tuples2) {
        recurringFrequencyUpsellDuxo.applyMutation(new RecurringFrequencyUpsellDuxo2((SweepsStatus) tuples2.component2(), ((Boolean) tuples2.component1()).booleanValue(), null));
        return Unit.INSTANCE;
    }
}
