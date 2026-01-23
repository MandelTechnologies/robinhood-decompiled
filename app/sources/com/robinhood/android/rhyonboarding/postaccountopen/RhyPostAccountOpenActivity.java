package com.robinhood.android.rhyonboarding.postaccountopen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.ActionBar;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.mcduckling.prefs.ShouldResetCashTabPref;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhyonboarding.contracts.RhyPostAccountOpenFragmentKey;
import com.robinhood.android.rhyonboarding.contracts.RhyPostAccountOpenIntentKey;
import com.robinhood.android.rhyonboarding.postaccountopen.RhyPostAccountOpenParentFragment;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyPostAccountOpenActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0012H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenParentFragment$Callbacks;", "<init>", "()V", "shouldResetCashTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShouldResetCashTabPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShouldResetCashTabPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "pollingComplete", "spendingAccountCreated", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyPostAccountOpenActivity extends BaseActivity implements RegionGated, RhyPostAccountOpenParentFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    @ShouldResetCashTabPref
    public BooleanPreference shouldResetCashTabPref;

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

    public RhyPostAccountOpenActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    }

    public final BooleanPreference getShouldResetCashTabPref() {
        BooleanPreference booleanPreference = this.shouldResetCashTabPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldResetCashTabPref");
        return null;
    }

    public final void setShouldResetCashTabPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.shouldResetCashTabPref = booleanPreference;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getShouldResetCashTabPref().set(true);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowHomeEnabled(false);
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, RhyPostAccountOpenParentFragment.INSTANCE.newInstance((Parcelable) new RhyPostAccountOpenFragmentKey(((RhyPostAccountOpenIntentKey) INSTANCE.getExtras((Activity) this)).getExitDeepLinkOverride())));
        }
    }

    @Override // com.robinhood.android.rhyonboarding.postaccountopen.RhyPostAccountOpenParentFragment.Callbacks
    public void pollingComplete(boolean spendingAccountCreated) {
        if (spendingAccountCreated) {
            Companion companion = INSTANCE;
            if (((RhyPostAccountOpenIntentKey) companion.getExtras((Activity) this)).getExitDeepLinkOverride() != null) {
                Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, ((RhyPostAccountOpenIntentKey) companion.getExtras((Activity) this)).getExitDeepLinkOverride(), null, null, false, null, 60, null);
            } else {
                startActivity(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new TabLinkIntentKey.McDuckling(null, false, null, 7, null), null, false, 12, null).addFlags(268468224));
            }
        }
        finish();
    }

    /* compiled from: RhyPostAccountOpenActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenActivity;", "Lcom/robinhood/android/rhyonboarding/contracts/RhyPostAccountOpenIntentKey;", "<init>", "()V", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<RhyPostAccountOpenActivity, RhyPostAccountOpenIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public RhyPostAccountOpenIntentKey getExtras(RhyPostAccountOpenActivity rhyPostAccountOpenActivity) {
            return (RhyPostAccountOpenIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, rhyPostAccountOpenActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RhyPostAccountOpenIntentKey rhyPostAccountOpenIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, rhyPostAccountOpenIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, RhyPostAccountOpenIntentKey rhyPostAccountOpenIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, rhyPostAccountOpenIntentKey);
        }
    }
}
