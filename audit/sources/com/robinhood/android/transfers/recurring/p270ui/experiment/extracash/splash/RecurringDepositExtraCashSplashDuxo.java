package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.splash;

import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositExtraCashSplashDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDataState;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashViewState;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "sweepInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "stateProvider", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashSplashDuxo extends BaseDuxo<RecurringDepositExtraCashSplashDataState, RecurringDepositExtraCashSplashViewState> {
    public static final int $stable = 8;
    private final GoldSubscriptionStore goldSubscriptionStore;
    private final SweepsInterestStore sweepInterestStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringDepositExtraCashSplashDuxo(GoldSubscriptionStore goldSubscriptionStore, SweepsInterestStore sweepInterestStore, RecurringDepositExtraCashSplashStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new RecurringDepositExtraCashSplashDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(sweepInterestStore, "sweepInterestStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldSubscriptionStore = goldSubscriptionStore;
        this.sweepInterestStore = sweepInterestStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.goldSubscriptionStore.streamGoldSubscriptionState(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringDepositExtraCashSplashDuxo.onCreate$lambda$0(this.f$0, (GoldSubscriptionStore.GoldSubscriptionState) obj);
            }
        });
        SweepsInterestStore.refreshNoAccountNumber$default(this.sweepInterestStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.sweepInterestStore.streamNoAccountNumber(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringDepositExtraCashSplashDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(RecurringDepositExtraCashSplashDuxo recurringDepositExtraCashSplashDuxo, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState) {
        Intrinsics.checkNotNullParameter(goldSubscriptionState, "goldSubscriptionState");
        recurringDepositExtraCashSplashDuxo.applyMutation(new RecurringDepositExtraCashSplashDuxo2(goldSubscriptionState, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RecurringDepositExtraCashSplashDuxo recurringDepositExtraCashSplashDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        recurringDepositExtraCashSplashDuxo.applyMutation(new RecurringDepositExtraCashSplashDuxo3((SweepsInterest) optional.component1(), null));
        return Unit.INSTANCE;
    }
}
