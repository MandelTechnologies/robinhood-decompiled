package com.robinhood.android.matchrateselection;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.view.WindowCompat;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.gold.contracts.GoldRejoinIntentKey;
import com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment;
import com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys3;
import com.robinhood.android.retirement.contracts.RetirementMatchRateSelection;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchRateSelectionActivity.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u0016\u001a\u00020\nH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/MatchRateSelectionActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionFragment$Callbacks;", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsFragment$Callbacks;", "<init>", "()V", "goldRejoinAgreementLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMatchRateSelect", "isGoldSelected", "", "showGoldRejoinFlow", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "onAgreementsSigned", "Companion", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchRateSelectionActivity extends BaseActivity implements MatchRateSelectionFragment.Callbacks, MatchAgreementsFragment.Callbacks {
    private static final int GOLD_REJOIN_FLOW_REQUEST_CODE = 130;
    private static final String RETIREMENT_FLOW = "2024_tax_season_promo";
    private static final String RETIREMENT_MATCH_RATE_PENDING_DOWNGRADE = "retirement_match_rate_pending_downgrade";
    private final ActivityResultLauncher<Intent> goldRejoinAgreementLauncher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MatchRateSelectionActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.goldRejoinAgreementLauncher = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.matchrateselection.MatchRateSelectionActivity$goldRejoinAgreementLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.onAgreementsSigned();
                }
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        if (((RetirementMatchRateSelection) companion.getExtras((Activity) this)).getEntryPoint() == ApiMatchRateSelection6.ROLLOVER) {
            WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        }
        if (savedInstanceState == null) {
            replaceFragmentWithoutBackStack(MatchRateSelectionFragment.INSTANCE.newInstance((Parcelable) new MatchRateSelectionFragment.Args(((RetirementMatchRateSelection) companion.getExtras((Activity) this)).getEntryPoint())));
        }
    }

    @Override // com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment.Callbacks
    public void onMatchRateSelect(boolean isGoldSelected, boolean showGoldRejoinFlow) {
        if (!isGoldSelected) {
            NavigationActivityResultContract3.setResult(this, RetirementIntentKeys3.Result.Success.INSTANCE);
            finish();
        } else if (showGoldRejoinFlow) {
            this.goldRejoinAgreementLauncher.launch(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new GoldRejoinIntentKey(RETIREMENT_FLOW, RETIREMENT_MATCH_RATE_PENDING_DOWNGRADE), null, false, 12, null));
        } else {
            replaceFragment(MatchAgreementsFragment.INSTANCE.newInstance((Parcelable) new MatchAgreementsFragment.Args(((RetirementMatchRateSelection) INSTANCE.getExtras((Activity) this)).getEntryPoint())));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 130 && resultCode == -1) {
            onAgreementsSigned();
        }
    }

    @Override // com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment.Callbacks
    public void onAgreementsSigned() {
        NavigationActivityResultContract3.setResult(this, RetirementIntentKeys3.Result.Success.INSTANCE);
        finish();
    }

    /* compiled from: MatchRateSelectionActivity.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/MatchRateSelectionActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/matchrateselection/MatchRateSelectionActivity;", "Lcom/robinhood/android/retirement/contracts/RetirementMatchRateSelection;", "<init>", "()V", "GOLD_REJOIN_FLOW_REQUEST_CODE", "", "RETIREMENT_MATCH_RATE_PENDING_DOWNGRADE", "", "RETIREMENT_FLOW", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<MatchRateSelectionActivity, RetirementMatchRateSelection> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public RetirementMatchRateSelection getExtras(MatchRateSelectionActivity matchRateSelectionActivity) {
            return (RetirementMatchRateSelection) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, matchRateSelectionActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RetirementMatchRateSelection retirementMatchRateSelection) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, retirementMatchRateSelection);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, RetirementMatchRateSelection retirementMatchRateSelection) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, retirementMatchRateSelection);
        }
    }
}
