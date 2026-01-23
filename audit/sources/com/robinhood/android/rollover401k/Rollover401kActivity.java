package com.robinhood.android.rollover401k;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.Retirement401kRollover;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys3;
import com.robinhood.android.retirement.contracts.RetirementMatchRateSelection;
import com.robinhood.android.rollover401k.Rollover401kAuthenticationFragment;
import com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment;
import com.robinhood.android.rollover401k.steps.Rollover401kCapitalizeFragment;
import com.robinhood.android.rollover401k.steps.Rollover401kDiyFragment;
import com.robinhood.android.rollover401k.steps.Rollover401kEducationFragment;
import com.robinhood.android.rollover401k.steps.Rollover401kMethodSelectionFragment;
import com.robinhood.android.rollover401k.steps.Rollover401kQuestionsFragment;
import com.robinhood.android.rollover401k.steps.Rollover401kTermsFragment;
import com.robinhood.android.rollover401k.steps.finder.Finder401kFragment;
import com.robinhood.android.rollover401k.steps.interstitial.Rollover401kInterstitialFragment;
import com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment;
import com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment;
import com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rollover401kActivity.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00019B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020%H\u0016J\u0012\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0014J\u0010\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u000eH\u0002J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u000202H\u0002J\t\u00103\u001a\u00020\u0019H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/Rollover401kActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rollover401k/Rollover401kAuthenticationFragment$Callbacks;", "Lcom/robinhood/android/rollover401k/steps/Rollover401kAccountNumbersFragment$Callbacks;", "<init>", "()V", "retirement401kRolloverStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "getRetirement401kRolloverStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "setRetirement401kRolloverStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;)V", "initialStep", "Lcom/robinhood/android/retirement/contracts/Retirement401kRollover$Step;", "getInitialStep", "()Lcom/robinhood/android/retirement/contracts/Retirement401kRollover$Step;", "initialStep$delegate", "Lkotlin/Lazy;", "source", "", "getSource", "()Ljava/lang/String;", "source$delegate", Rollover401kActivity.HIDE_PROMO, "", "getHidePromo", "()Z", "hidePromo$delegate", "matchRateSelectionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/retirement/contracts/RetirementMatchRateSelection;", "onSecondaryAuthenticationSuccess", "", "isForCapitalize", "pendingAccount", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$AccountNumberRow;", "onRequestAuthentication", "account", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "setCurrentFragment", Rollover401kActivity.STEP, "setFragment", "fragment", "Landroidx/fragment/app/Fragment;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class Rollover401kActivity extends BaseActivity implements RegionGated, Rollover401kAuthenticationFragment.Callbacks, Rollover401kAccountNumbersFragment.Callbacks {
    private static final String AUTH_DIALOG = "SecondaryAuthHandler";
    private static final String HIDE_PROMO = "hidePromo";
    private static final String NUMBERS_DIALOG = "Rollover401kAccountNumbers";
    private static final String SOURCE = "source";
    private static final String STEP = "step";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: hidePromo$delegate, reason: from kotlin metadata */
    private final Lazy hidePromo;

    /* renamed from: initialStep$delegate, reason: from kotlin metadata */
    private final Lazy initialStep;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<RetirementMatchRateSelection>> matchRateSelectionLauncher;
    public Retirement401kRolloverStore retirement401kRolloverStore;

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source;

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

    public Rollover401kActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
        this.initialStep = Activity.intentExtra(this, STEP);
        this.source = Activity.intentExtra(this, "source");
        this.hidePromo = Activity.intentExtra(this, HIDE_PROMO);
        this.matchRateSelectionLauncher = registerForActivityResult(new RetirementIntentKeys3(new Function0() { // from class: com.robinhood.android.rollover401k.Rollover401kActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.rollover401k.Rollover401kActivity$matchRateSelectionLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(RetirementIntentKeys3.Result result) {
                if (result instanceof RetirementIntentKeys3.Result.Success) {
                    this.this$0.setCurrentFragment(Retirement401kRollover.Step.Capitalize.INSTANCE);
                } else if (!(result instanceof RetirementIntentKeys3.Result.Canceled) && result != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    public final Retirement401kRolloverStore getRetirement401kRolloverStore() {
        Retirement401kRolloverStore retirement401kRolloverStore = this.retirement401kRolloverStore;
        if (retirement401kRolloverStore != null) {
            return retirement401kRolloverStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retirement401kRolloverStore");
        return null;
    }

    public final void setRetirement401kRolloverStore(Retirement401kRolloverStore retirement401kRolloverStore) {
        Intrinsics.checkNotNullParameter(retirement401kRolloverStore, "<set-?>");
        this.retirement401kRolloverStore = retirement401kRolloverStore;
    }

    private final Retirement401kRollover.Step getInitialStep() {
        return (Retirement401kRollover.Step) this.initialStep.getValue();
    }

    private final String getSource() {
        return (String) this.source.getValue();
    }

    private final boolean getHidePromo() {
        return ((Boolean) this.hidePromo.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.rollover401k.Rollover401kAuthenticationFragment.Callbacks
    public void onSecondaryAuthenticationSuccess(boolean isForCapitalize, Retirement401kRolloverViewModel.AccountNumberRow pendingAccount) throws Resources.NotFoundException {
        if (pendingAccount != null) {
            ContextSystemServices.getClipboardManager(this).setPrimaryClip(ClipData.newPlainText(pendingAccount.getAccountName(), pendingAccount.getAccountNumber()));
            ContextsUiExtensions.showShortToast(this, C41827R.string.general_copied_to_clipboard);
        }
        Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment = (Rollover401kAccountNumbersFragment) Rollover401kAccountNumbersFragment.INSTANCE.newInstance((Parcelable) new Rollover401kAccountNumbersFragment.Args(isForCapitalize, true));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        rollover401kAccountNumbersFragment.show(supportFragmentManager, NUMBERS_DIALOG);
    }

    @Override // com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment.Callbacks
    public void onRequestAuthentication(Retirement401kRolloverViewModel.AccountNumberRow account) {
        Intrinsics.checkNotNullParameter(account, "account");
        Rollover401kAuthenticationFragment rollover401kAuthenticationFragment = (Rollover401kAuthenticationFragment) Rollover401kAuthenticationFragment.INSTANCE.newInstance((Parcelable) new Rollover401kAuthenticationFragment.Args(true, account));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        rollover401kAuthenticationFragment.show(supportFragmentManager, AUTH_DIALOG);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getRetirement401kRolloverStore().forceRefreshRolloverInfo(getHidePromo());
        if (savedInstanceState == null) {
            setCurrentFragment(getInitialStep());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Retirement401kRollover.Step step;
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (Build.VERSION.SDK_INT >= 33) {
            step = (Retirement401kRollover.Step) intent.getParcelableExtra(STEP, Retirement401kRollover.Step.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra(STEP);
            Intrinsics.checkNotNull(parcelableExtra);
            step = (Retirement401kRollover.Step) parcelableExtra;
        }
        if (step == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        setCurrentFragment(step);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentFragment(Retirement401kRollover.Step step) {
        if (Intrinsics.areEqual(step, Retirement401kRollover.Step.Education.INSTANCE)) {
            popEntireFragmentBackstack();
            replaceFragmentWithoutBackStack(Rollover401kEducationFragment.INSTANCE.newInstance((Parcelable) new Rollover401kEducationFragment.Args(getSource(), getHidePromo())));
            return;
        }
        if (Intrinsics.areEqual(step, Retirement401kRollover.Step.Terms.INSTANCE)) {
            setFragment(Rollover401kTermsFragment.INSTANCE.newInstance());
            return;
        }
        if (Intrinsics.areEqual(step, Retirement401kRollover.Step.Capitalize.INSTANCE)) {
            setFragment(Rollover401kCapitalizeFragment.INSTANCE.newInstance());
            return;
        }
        if (Intrinsics.areEqual(step, Retirement401kRollover.Step.Diy.INSTANCE)) {
            setFragment(Rollover401kDiyFragment.INSTANCE.newInstance());
            return;
        }
        if (Intrinsics.areEqual(step, Retirement401kRollover.Step.Questions.INSTANCE)) {
            setFragment(Rollover401kQuestionsFragment.INSTANCE.newInstance());
            return;
        }
        if (Intrinsics.areEqual(step, Retirement401kRollover.Step.CapitalizeAccountNumbers.INSTANCE)) {
            Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment = (Rollover401kAccountNumbersFragment) Rollover401kAccountNumbersFragment.INSTANCE.newInstance((Parcelable) new Rollover401kAccountNumbersFragment.Args(true, false));
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            rollover401kAccountNumbersFragment.show(supportFragmentManager, NUMBERS_DIALOG);
            return;
        }
        if (Intrinsics.areEqual(step, Retirement401kRollover.Step.DiyAccountNumbers.INSTANCE)) {
            Rollover401kAuthenticationFragment rollover401kAuthenticationFragment = (Rollover401kAuthenticationFragment) Rollover401kAuthenticationFragment.INSTANCE.newInstance((Parcelable) new Rollover401kAuthenticationFragment.Args(false, null));
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
            rollover401kAuthenticationFragment.show(supportFragmentManager2, AUTH_DIALOG);
            return;
        }
        if (Intrinsics.areEqual(step, Retirement401kRollover.Step.MatchRateSelection.INSTANCE)) {
            NavigationActivityResultContract3.launch$default(this.matchRateSelectionLauncher, new RetirementMatchRateSelection(ApiMatchRateSelection6.ROLLOVER), null, false, 6, null);
            return;
        }
        if (Intrinsics.areEqual(step, Retirement401kRollover.Step.MethodSelection.INSTANCE)) {
            setFragment(Rollover401kMethodSelectionFragment.INSTANCE.newInstance());
            return;
        }
        if (Intrinsics.areEqual(step, Retirement401kRollover.Step.VerifyInfo.INSTANCE)) {
            setFragment(Rollover401kVerifyInfoFragment.INSTANCE.newInstance());
            return;
        }
        if (step instanceof Retirement401kRollover.Step.Interstitial) {
            Retirement401kRollover.Step.Interstitial interstitial = (Retirement401kRollover.Step.Interstitial) step;
            setFragment(Rollover401kInterstitialFragment.INSTANCE.newInstance((Parcelable) new Rollover401kInterstitialFragment.Args(interstitial.getType(), interstitial.getTransactionId())));
        } else if (step instanceof Retirement401kRollover.Step.WebView) {
            setFragment(Rollover401kWebViewFragment.INSTANCE.newInstance((Parcelable) new Rollover401kWebViewFragment.Args(((Retirement401kRollover.Step.WebView) step).getUrl())));
        } else {
            if (!(step instanceof Retirement401kRollover.Step.AccountFinder)) {
                throw new NoWhenBranchMatchedException();
            }
            setFragment(Finder401kFragment.INSTANCE.newInstance());
        }
    }

    private final void setFragment(Fragment fragment) {
        if (getCurrentFragment() == null) {
            replaceFragmentWithoutBackStack(fragment);
        } else {
            replaceFragment(fragment);
        }
    }

    /* compiled from: Rollover401kActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/Rollover401kActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/retirement/contracts/Retirement401kRollover;", "<init>", "()V", "STEP", "", "SOURCE", "HIDE_PROMO", "NUMBERS_DIALOG", "AUTH_DIALOG", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<Retirement401kRollover> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, Retirement401kRollover key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) Rollover401kActivity.class);
            intent.putExtra(Rollover401kActivity.STEP, key.getStep());
            intent.putExtra("source", key.getSource());
            intent.putExtra(Rollover401kActivity.HIDE_PROMO, key.getHidePromo());
            return intent;
        }
    }
}
