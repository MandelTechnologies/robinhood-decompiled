package com.robinhood.android.feature.margin.hub.deficit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment;
import com.robinhood.android.margin.contracts.BuyingPowerHubIntentKey;
import com.robinhood.android.margin.contracts.CheckBuyingPowerDeficitIntentKey;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CheckBuyingPowerDeficitActivity.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0015J\u001a\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNavigateToDestinationEventReceived", "accountNumber", "", "showMarginResolutionScreen", "", "Companion", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class CheckBuyingPowerDeficitActivity extends BaseActivity implements CheckBuyingPowerDeficitFragment.Callbacks {
    private static final String INTENT_KEY_ENTRY_POINT = "watchlist";
    private static final String MARGIN_RESOLUTION_FLOW_URL = "robinhood://margin_call_resolve?account_number=";
    private static final String MICROGRAM_APPLICATION_IDENTIFIER = "app-margin-calls";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public CheckBuyingPowerDeficitActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"CommitTransaction"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().add(C11048R.id.fragment_container, new CheckBuyingPowerDeficitFragment()).commitAllowingStateLoss();
    }

    @Override // com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment.Callbacks
    public void onNavigateToDestinationEventReceived(String accountNumber, boolean showMarginResolutionScreen) {
        if (showMarginResolutionScreen) {
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), this, new MicrogramRouterFragmentKey(new RemoteMicrogramApplication("app-margin-calls", null, 2, null), MARGIN_RESOLUTION_FLOW_URL + accountNumber, null, null, null, 28, null), false, false, false, false, null, false, null, null, 1020, null);
        } else {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new BuyingPowerHubIntentKey(accountNumber, "watchlist", null, 4, null), null, false, null, null, 60, null);
        }
        finish();
        overridePendingTransition(0, 0);
    }

    /* compiled from: CheckBuyingPowerDeficitActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitActivity;", "Lcom/robinhood/android/margin/contracts/CheckBuyingPowerDeficitIntentKey;", "<init>", "()V", "INTENT_KEY_ENTRY_POINT", "", "MICROGRAM_APPLICATION_IDENTIFIER", "MARGIN_RESOLUTION_FLOW_URL", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CheckBuyingPowerDeficitActivity, CheckBuyingPowerDeficitIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CheckBuyingPowerDeficitIntentKey getExtras(CheckBuyingPowerDeficitActivity checkBuyingPowerDeficitActivity) {
            return (CheckBuyingPowerDeficitIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, checkBuyingPowerDeficitActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CheckBuyingPowerDeficitIntentKey checkBuyingPowerDeficitIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, checkBuyingPowerDeficitIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CheckBuyingPowerDeficitIntentKey checkBuyingPowerDeficitIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, checkBuyingPowerDeficitIntentKey);
        }
    }
}
