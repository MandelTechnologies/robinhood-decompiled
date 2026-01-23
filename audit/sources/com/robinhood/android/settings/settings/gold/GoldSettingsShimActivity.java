package com.robinhood.android.settings.settings.gold;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.gold.contracts.GoldHubIntentKey;
import com.robinhood.android.gold.contracts.GoldSettingsIntentKey;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.settings.settings.C28321R;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSettingsShimActivity.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/gold/GoldSettingsShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "getMarginSubscriptionStore", "()Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "setMarginSubscriptionStore", "(Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;)V", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class GoldSettingsShimActivity extends BaseActivity {
    public ExperimentsStore experimentStore;
    public MarginSubscriptionStore marginSubscriptionStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public GoldSettingsShimActivity() {
        super(C28321R.layout.fragment_gold_settings_shim);
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

    public final ExperimentsStore getExperimentStore() {
        ExperimentsStore experimentsStore = this.experimentStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentStore");
        return null;
    }

    public final void setExperimentStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentStore = experimentsStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        View viewFindViewById = findViewById(C28321R.id.shimmer_loading_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(viewFindViewById, InsetSides.INSTANCE.m26684getVerticalXedK2Rk());
        Companion companion = INSTANCE;
        if (((GoldSettingsIntentKey) companion.getExtras((Activity) this)).getSkipGoldCheck()) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new GoldHubIntentKey(((GoldSettingsIntentKey) companion.getExtras((Activity) this)).getScrollTarget()), null, true, null, null, 52, null);
            finish();
        } else {
            IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_SETTINGS_LOADING, true);
            Observable observable = MarginSubscriptionStore.checkCurrentMarginSubscription$default(getMarginSubscriptionStore(), false, 1, null).toObservable();
            Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
            ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observable), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.settings.settings.gold.GoldSettingsShimActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldSettingsShimActivity.onCreate$lambda$0(this.f$0, (Optional) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.settings.settings.gold.GoldSettingsShimActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldSettingsShimActivity.onCreate$lambda$2(this.f$0, (Throwable) obj);
                }
            }, null, null, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(GoldSettingsShimActivity goldSettingsShimActivity, Optional optional) {
        MarginSubscription marginSubscription = (MarginSubscription) optional.component1();
        if (marginSubscription != null && marginSubscription.is24Karat()) {
            Navigator.DefaultImpls.startActivity$default(goldSettingsShimActivity.getNavigator(), goldSettingsShimActivity, new GoldHubIntentKey(((GoldSettingsIntentKey) INSTANCE.getExtras((Activity) goldSettingsShimActivity)).getScrollTarget()), null, true, null, null, 52, null);
        } else {
            Navigator.DefaultImpls.startActivity$default(goldSettingsShimActivity.getNavigator(), goldSettingsShimActivity, new GoldUpgradeIntentKey("gold_settings_redirect", "settings", null, null, null, false, 60, null), null, false, null, null, 60, null);
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_SETTINGS_LOADING, false);
        goldSettingsShimActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(GoldSettingsShimActivity goldSettingsShimActivity, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(goldSettingsShimActivity.getNavigator(), goldSettingsShimActivity, new SettingsFragmentKey(null, false, false, false, null, null, null, null, false, 511, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
        intentCreateIntentForFragment$default.addFlags(335544320);
        goldSettingsShimActivity.startActivity(intentCreateIntentForFragment$default);
        IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_SETTINGS_LOADING, false);
        goldSettingsShimActivity.finish();
        return Unit.INSTANCE;
    }

    /* compiled from: GoldSettingsShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/gold/GoldSettingsShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/settings/settings/gold/GoldSettingsShimActivity;", "Lcom/robinhood/android/gold/contracts/GoldSettingsIntentKey;", "<init>", "()V", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GoldSettingsShimActivity, GoldSettingsIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public GoldSettingsIntentKey getExtras(GoldSettingsShimActivity goldSettingsShimActivity) {
            return (GoldSettingsIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, goldSettingsShimActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, GoldSettingsIntentKey goldSettingsIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, goldSettingsIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, GoldSettingsIntentKey goldSettingsIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, goldSettingsIntentKey);
        }
    }
}
