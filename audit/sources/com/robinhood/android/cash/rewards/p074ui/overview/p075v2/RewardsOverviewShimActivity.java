package com.robinhood.android.cash.rewards.p074ui.overview.p075v2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment2;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardsOverviewShimActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\t\u0010\u0015\u001a\u00020\u0016H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "getMinervaAccountStore", "()Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "setMinervaAccountStore", "(Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;)V", "roundupEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "getRoundupEnrollmentStore", "()Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "setRoundupEnrollmentStore", "(Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsOverviewShimActivity extends BaseActivity implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public MinervaAccountStore minervaAccountStore;
    public RoundupEnrollmentStore roundupEnrollmentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RewardsOverviewShimActivity() {
        super(C11839R.layout.activity_rds_loading);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    }

    public final MinervaAccountStore getMinervaAccountStore() {
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore;
        if (minervaAccountStore != null) {
            return minervaAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("minervaAccountStore");
        return null;
    }

    public final void setMinervaAccountStore(MinervaAccountStore minervaAccountStore) {
        Intrinsics.checkNotNullParameter(minervaAccountStore, "<set-?>");
        this.minervaAccountStore = minervaAccountStore;
    }

    public final RoundupEnrollmentStore getRoundupEnrollmentStore() {
        RoundupEnrollmentStore roundupEnrollmentStore = this.roundupEnrollmentStore;
        if (roundupEnrollmentStore != null) {
            return roundupEnrollmentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("roundupEnrollmentStore");
        return null;
    }

    public final void setRoundupEnrollmentStore(RoundupEnrollmentStore roundupEnrollmentStore) {
        Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "<set-?>");
        this.roundupEnrollmentStore = roundupEnrollmentStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Observables observables = Observables.INSTANCE;
        Observable<Boolean> observableHasAccount = getMinervaAccountStore().hasAccount(ApiMinervaAccount.Type.RHY_SPENDING);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable<Boolean> observableOnErrorReturn = observableHasAccount.timeout(5L, timeUnit).onErrorReturn(new Function() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewShimActivity.onCreate.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.FALSE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
        Observable observableOnErrorReturn2 = getRoundupEnrollmentStore().stream().timeout(5L, timeUnit).map(new Function() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewShimActivity.onCreate.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(RoundupEnrollment it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!Intrinsics.areEqual(RoundupEnrollment2.toDbModel(RoundupEnrollmentStore.INSTANCE.getROUNDUP_ENROLLMENT_INITIAL_STATE()), it));
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewShimActivity.onCreate.3
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.FALSE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn2, "onErrorReturn(...)");
        Observable observableCombineLatest = Observable.combineLatest(observableOnErrorReturn, observableOnErrorReturn2, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewShimActivity$onCreate$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) Tuples4.m3642to((Boolean) t1, (Boolean) t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservableDelay2.minTimeInFlight$default(observableCombineLatest, 1000L, null, 2, null)), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewShimActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewShimActivity.onCreate$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewShimActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewShimActivity.onCreate$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RewardsOverviewShimActivity rewardsOverviewShimActivity, Tuples2 tuples2) {
        RewardsOverviewShimActivity rewardsOverviewShimActivity2;
        Intent intentCreateIntent$default;
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        Boolean bool = (Boolean) tuples2.component1();
        Boolean bool2 = (Boolean) tuples2.component2();
        if (bool.booleanValue()) {
            if (bool2.booleanValue()) {
                rewardsOverviewShimActivity2 = rewardsOverviewShimActivity;
                intentCreateIntent$default = Navigator.DefaultImpls.createIntentForFragment$default(rewardsOverviewShimActivity.getNavigator(), rewardsOverviewShimActivity2, LegacyFragmentKey.RoundupRewardsOverviewV2.INSTANCE, false, false, false, null, false, false, false, false, false, null, false, 8180, null);
            } else {
                rewardsOverviewShimActivity2 = rewardsOverviewShimActivity;
                intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(rewardsOverviewShimActivity.getNavigator(), rewardsOverviewShimActivity2, new LegacyIntentKey.RewardsOnboarding(LegacyIntentKey.RewardsOnboarding.Action.CREATE_ENROLLMENT), null, false, 12, null);
            }
        } else {
            rewardsOverviewShimActivity2 = rewardsOverviewShimActivity;
            intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(rewardsOverviewShimActivity.getNavigator(), rewardsOverviewShimActivity2, new TabLinkIntentKey.McDuckling(null, false, null, 7, null), null, false, 12, null);
        }
        rewardsOverviewShimActivity2.startActivity(intentCreateIntent$default);
        rewardsOverviewShimActivity2.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(RewardsOverviewShimActivity rewardsOverviewShimActivity, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(rewardsOverviewShimActivity.getNavigator(), rewardsOverviewShimActivity, new LegacyFragmentKey.RhyOverviewV2(null, 1, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
        intentCreateIntentForFragment$default.addFlags(335544320);
        rewardsOverviewShimActivity.startActivity(intentCreateIntentForFragment$default);
        rewardsOverviewShimActivity.finish();
        return Unit.INSTANCE;
    }

    /* compiled from: RewardsOverviewShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsShimActivity;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.RoundupRewardsShimActivity> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.RoundupRewardsShimActivity key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return new Intent(context, (Class<?>) RewardsOverviewShimActivity.class);
        }
    }
}
