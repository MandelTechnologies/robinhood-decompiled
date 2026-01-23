package com.robinhood.android.rhy.referral.fund.splash;

import com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundSplashDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashDataState;", "Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashViewState;", "Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashEvent;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "stateProvider", "Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralFundSplashDuxo extends BaseDuxo3<RhyReferralFundSplashDataState, RhyReferralFundSplashViewState, RhyReferralFundSplashEvent> {
    public static final int $stable = 8;
    private final MinervaAccountStore minervaAccountStore;
    private final TransferAccountStore transferAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralFundSplashDuxo(MinervaAccountStore minervaAccountStore, TransferAccountStore transferAccountStore, RhyReferralFundSplashStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new RhyReferralFundSplashDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.minervaAccountStore = minervaAccountStore;
        this.transferAccountStore = transferAccountStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.transferAccountStore.refresh(true);
        this.minervaAccountStore.refresh(true);
        Observable observableDistinctUntilChanged = ObservablesKt.toOptionals(ObservablesKt.filterIsPresent(this.minervaAccountStore.streamAccountOptional(ApiMinervaAccount.Type.RHY_SPENDING))).timeout(10L, TimeUnit.SECONDS, Observable.just(Optional2.INSTANCE)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundSplashDuxo.onStart$lambda$0(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundSplashDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RhyReferralFundSplashDuxo rhyReferralFundSplashDuxo, Optional optional) {
        rhyReferralFundSplashDuxo.applyMutation(new RhyReferralFundSplashDuxo2((MinervaAccount) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyReferralFundSplashDuxo rhyReferralFundSplashDuxo, Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Throwables.isNetworkRelated(it)) {
            throw it;
        }
        rhyReferralFundSplashDuxo.submit(new RhyReferralFundSplashEvent.Error(it));
        return Unit.INSTANCE;
    }
}
