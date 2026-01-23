package com.robinhood.android.settings.settings.margin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.margin.contracts.MarginInvestingSettingsKey;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.shared.settings.contracts.Constants6;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsPage;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginInvestingShimActivity.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/margin/MarginInvestingShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "getMarginSettingsStore", "()Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "setMarginSettingsStore", "(Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MarginInvestingShimActivity extends BaseActivity {
    public LeveredMarginSettingsStore marginSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MarginInvestingShimActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    public final LeveredMarginSettingsStore getMarginSettingsStore() {
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.marginSettingsStore;
        if (leveredMarginSettingsStore != null) {
            return leveredMarginSettingsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginSettingsStore");
        return null;
    }

    public final void setMarginSettingsStore(LeveredMarginSettingsStore leveredMarginSettingsStore) {
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "<set-?>");
        this.marginSettingsStore = leveredMarginSettingsStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Observable<MarginSettings> observableStreamMarginSettingsIndividual;
        super.onCreate(savedInstanceState);
        ShimmerLoadingFragment.Args.NavButtonType navButtonType = null;
        Object[] objArr = 0;
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.List(true, false, 8, 2, null), navButtonType, 2, objArr == true ? 1 : 0)));
        }
        final String accountNumber = ((MarginInvestingSettingsKey) INSTANCE.getExtras((Activity) this)).getAccountNumber();
        if (accountNumber != null) {
            observableStreamMarginSettingsIndividual = getMarginSettingsStore().streamMarginSettings(accountNumber);
        } else {
            observableStreamMarginSettingsIndividual = getMarginSettingsStore().streamMarginSettingsIndividual();
        }
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableStreamMarginSettingsIndividual), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.settings.settings.margin.MarginInvestingShimActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginInvestingShimActivity.onCreate$lambda$1(this.f$0, accountNumber, (MarginSettings) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.settings.settings.margin.MarginInvestingShimActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginInvestingShimActivity.onCreate$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(MarginInvestingShimActivity marginInvestingShimActivity, String str, MarginSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(marginInvestingShimActivity.getNavigator(), marginInvestingShimActivity, new SettingsPage(settings.isMarginInvestingEnabled() ? Constants6.MARGIN_SETTINGS_PAGE_ID : Constants6.ACCOUNT_INFO_PAGE_ID, str, null, 4, null), false, ((MarginInvestingSettingsKey) INSTANCE.getExtras((Activity) marginInvestingShimActivity)).getShowInTab(), false, null, false, false, false, false, false, null, false, 8180, null);
        intentCreateIntentForFragment$default.addFlags(335544320);
        marginInvestingShimActivity.startActivity(intentCreateIntentForFragment$default);
        marginInvestingShimActivity.overridePendingTransition(0, 0);
        marginInvestingShimActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(MarginInvestingShimActivity marginInvestingShimActivity, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(marginInvestingShimActivity.getNavigator(), marginInvestingShimActivity, new SettingsFragmentKey(null, false, false, false, null, null, null, null, false, 511, null), false, ((MarginInvestingSettingsKey) INSTANCE.getExtras((Activity) marginInvestingShimActivity)).getShowInTab(), false, null, false, false, false, false, false, null, false, 8180, null);
        intentCreateIntentForFragment$default.addFlags(335544320);
        marginInvestingShimActivity.startActivity(intentCreateIntentForFragment$default);
        marginInvestingShimActivity.finish();
        return Unit.INSTANCE;
    }

    /* compiled from: MarginInvestingShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/margin/MarginInvestingShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/settings/settings/margin/MarginInvestingShimActivity;", "Lcom/robinhood/android/margin/contracts/MarginInvestingSettingsKey;", "<init>", "()V", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<MarginInvestingShimActivity, MarginInvestingSettingsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public MarginInvestingSettingsKey getExtras(MarginInvestingShimActivity marginInvestingShimActivity) {
            return (MarginInvestingSettingsKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, marginInvestingShimActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, MarginInvestingSettingsKey marginInvestingSettingsKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, marginInvestingSettingsKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, MarginInvestingSettingsKey marginInvestingSettingsKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, marginInvestingSettingsKey);
        }
    }
}
