package com.robinhood.android.gold.hub.boost;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.gold.contracts.GoldDepositBoostEducationIntentKey;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: GoldDepositBoostEducationShimActivity.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostEducationShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "getMarginSubscriptionStore", "()Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "setMarginSubscriptionStore", "(Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldDepositBoostEducationShimActivity extends BaseActivity {
    public MarginSubscriptionStore marginSubscriptionStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public GoldDepositBoostEducationShimActivity() {
        super(C11839R.layout.activity_rds_loading);
    }

    public final MarginSubscriptionStore getMarginSubscriptionStore() {
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore;
        if (marginSubscriptionStore != null) {
            return marginSubscriptionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginSubscriptionStore");
        return null;
    }

    public final void setMarginSubscriptionStore(MarginSubscriptionStore marginSubscriptionStore) {
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "<set-?>");
        this.marginSubscriptionStore = marginSubscriptionStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        Observable observable = MarginSubscriptionStore.checkCurrentMarginSubscription$default(getMarginSubscriptionStore(), false, 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observable), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostEducationShimActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldDepositBoostEducationShimActivity.onCreate$lambda$0(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostEducationShimActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldDepositBoostEducationShimActivity.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(GoldDepositBoostEducationShimActivity goldDepositBoostEducationShimActivity, Optional optional) {
        MarginSubscription marginSubscription = (MarginSubscription) optional.component1();
        if (marginSubscription != null && marginSubscription.is24Karat()) {
            goldDepositBoostEducationShimActivity.startActivity(Navigator.DefaultImpls.createIntentForFragment$default(goldDepositBoostEducationShimActivity.getNavigator(), goldDepositBoostEducationShimActivity, new MicrogramRouterFragmentKey(new RemoteMicrogramApplication("app-gold-deposit-education", null, 2, null), ((GoldDepositBoostEducationIntentKey) INSTANCE.getExtras((Activity) goldDepositBoostEducationShimActivity)).getDeeplink(), null, null, null, 28, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null));
        } else {
            Navigator.DefaultImpls.startActivity$default(goldDepositBoostEducationShimActivity.getNavigator(), goldDepositBoostEducationShimActivity, new GoldUpgradeIntentKey("gold_deposit_boost_education_redirect", GoldFeature.DEPOSIT_BOOST, null, null, null, false, 60, null), null, false, null, null, 60, null);
        }
        goldDepositBoostEducationShimActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(GoldDepositBoostEducationShimActivity goldDepositBoostEducationShimActivity, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        goldDepositBoostEducationShimActivity.finish();
        return Unit.INSTANCE;
    }

    /* compiled from: GoldDepositBoostEducationShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostEducationShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostEducationShimActivity;", "Lcom/robinhood/android/gold/contracts/GoldDepositBoostEducationIntentKey;", "<init>", "()V", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GoldDepositBoostEducationShimActivity, GoldDepositBoostEducationIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public GoldDepositBoostEducationIntentKey getExtras(GoldDepositBoostEducationShimActivity goldDepositBoostEducationShimActivity) {
            return (GoldDepositBoostEducationIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, goldDepositBoostEducationShimActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, GoldDepositBoostEducationIntentKey goldDepositBoostEducationIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, goldDepositBoostEducationIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, GoldDepositBoostEducationIntentKey goldDepositBoostEducationIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, goldDepositBoostEducationIntentKey);
        }
    }
}
