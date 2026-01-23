package com.robinhood.android.gold.rejoin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.gold.contracts.GoldRejoinIntentKey;
import com.robinhood.android.gold.contracts.GoldSettingsIntentKey;
import com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract;
import com.robinhood.android.gold.contracts.GoldUpgradeConfirmationFragmentContract;
import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import com.robinhood.android.gold.lib.rejoin.api.ApiGoldRejoinFlow;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment;
import com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationFragment;
import com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.models.api.bonfire.ApiGoldPaymentInstrument;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.GoldUpgradeType;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldRejoinActivity.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u00018B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0019\u0010\u0019\u001a\u00020\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'H\u0016J\u001a\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010,\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010-\u001a\u00020\u0016H\u0016J\u001f\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u0002002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u00101J\u0010\u00102\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0016J\b\u00103\u001a\u00020\u0016H\u0016J\u0018\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001bH\u0016J\b\u00107\u001a\u00020\u0016H\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingFragment$Callbacks;", "Lcom/robinhood/android/common/gold/LegacyGoldUpgradeAgreementFragment$Callbacks;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeAgreementsFragmentContract$Callbacks;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment$Callbacks;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeConfirmationFragmentContract$Callbacks;", "<init>", "()V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "goldRejoinFlow", "Lcom/robinhood/android/gold/lib/rejoin/api/ApiGoldRejoinFlow;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "navigateToRejoinSubmission", "enableSweep", "", "(Ljava/lang/Boolean;)V", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onRejoinFlowLoaded", "onRejoinFlowFailed", "error", "", "onClickFullAgreement", "agreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "onClickAgreementsCta", "isSweepChecked", "selectedPlanId", "Ljava/util/UUID;", "onDisclosureAccepted", "onDisclosureFailedToLoad", "onRejoinLoaded", "outcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "(Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;Ljava/lang/Boolean;)V", "onRejoinFailed", "onBackPressed", "onClickConfirmationCta", "isSweepEnabled", "isActionHandled", "onClickConfirmationFailedCta", "Companion", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldRejoinActivity extends BaseActivity implements GoldRejoinLoadingFragment.Callbacks, LegacyGoldUpgradeAgreementFragment.Callbacks, GoldUpgradeAgreementsFragmentContract.Callbacks, GoldRejoinSubmissionFragment.Callbacks, GoldUpgradeConfirmationFragmentContract.Callbacks {
    private ApiGoldRejoinFlow goldRejoinFlow;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public GoldRejoinActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "GoldRejoinActivity";
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        String source = ((GoldRejoinIntentKey) INSTANCE.getExtras((Activity) this)).getSource();
        return source == null ? "" : source;
    }

    private final Context getLoggingContext() {
        String source = ((GoldRejoinIntentKey) INSTANCE.getExtras((Activity) this)).getSource();
        if (source == null) {
            source = "";
        }
        GoldUpgradeType goldUpgradeType = GoldUpgradeType.REJOIN;
        return new Context(0, 0, 0, null, null, null, null, Context.ProductTag.GOLD, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, goldUpgradeType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -1, -1, -1, -33554433, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.goldRejoinFlow == null) {
            int i = C11048R.id.fragment_container;
            GoldRejoinLoadingFragment.Companion companion = GoldRejoinLoadingFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new GoldRejoinLoadingFragment.Args(((GoldRejoinIntentKey) companion2.getExtras((Activity) this)).getSource(), ((GoldRejoinIntentKey) companion2.getExtras((Activity) this)).getFeature())));
        }
    }

    static /* synthetic */ void navigateToRejoinSubmission$default(GoldRejoinActivity goldRejoinActivity, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        goldRejoinActivity.navigateToRejoinSubmission(bool);
    }

    private final void navigateToRejoinSubmission(Boolean enableSweep) {
        List listListOfNotNull;
        ApiGoldSweepAgreement goldAgreement;
        ApiGoldSweepAgreement goldAgreement2;
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements;
        ApiGoldRejoinFlow apiGoldRejoinFlow;
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements2;
        ApiGoldSweepAgreement sweepFullAgreement;
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements3;
        ApiGoldSweepAgreement goldFullAgreement;
        boolean z = enableSweep != null;
        GoldRejoinSubmissionFragment.Companion companion = GoldRejoinSubmissionFragment.INSTANCE;
        Context loggingContext = getLoggingContext();
        ApiGoldPaymentInstrument backupPaymentInstrument = null;
        if (z) {
            ApiGoldRejoinFlow apiGoldRejoinFlow2 = this.goldRejoinFlow;
            listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{(apiGoldRejoinFlow2 == null || (goldSweepAgreements3 = apiGoldRejoinFlow2.getGoldSweepAgreements()) == null || (goldFullAgreement = goldSweepAgreements3.getGoldFullAgreement()) == null) ? null : goldFullAgreement.getAgreementType(), (!Intrinsics.areEqual(enableSweep, Boolean.TRUE) || (apiGoldRejoinFlow = this.goldRejoinFlow) == null || (goldSweepAgreements2 = apiGoldRejoinFlow.getGoldSweepAgreements()) == null || (sweepFullAgreement = goldSweepAgreements2.getSweepFullAgreement()) == null) ? null : sweepFullAgreement.getAgreementType()});
        } else {
            ApiGoldRejoinFlow apiGoldRejoinFlow3 = this.goldRejoinFlow;
            listListOfNotNull = CollectionsKt.listOfNotNull((apiGoldRejoinFlow3 == null || (goldAgreement = apiGoldRejoinFlow3.getGoldAgreement()) == null) ? null : goldAgreement.getAgreementType());
        }
        if (z) {
            ApiGoldRejoinFlow apiGoldRejoinFlow4 = this.goldRejoinFlow;
            if (apiGoldRejoinFlow4 != null && (goldSweepAgreements = apiGoldRejoinFlow4.getGoldSweepAgreements()) != null) {
                backupPaymentInstrument = goldSweepAgreements.getBackupPaymentInstrument();
            }
        } else {
            ApiGoldRejoinFlow apiGoldRejoinFlow5 = this.goldRejoinFlow;
            if (apiGoldRejoinFlow5 != null && (goldAgreement2 = apiGoldRejoinFlow5.getGoldAgreement()) != null) {
                backupPaymentInstrument = goldAgreement2.getBackupPaymentInstrument();
            }
        }
        replaceFragment(companion.newInstance((Parcelable) new GoldRejoinSubmissionFragment.Args(enableSweep, loggingContext, listListOfNotNull, backupPaymentInstrument)));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    @Override // com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment.Callbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onRejoinFlowLoaded(ApiGoldRejoinFlow goldRejoinFlow) {
        Fragment fragmentCreateFragment$default;
        Intrinsics.checkNotNullParameter(goldRejoinFlow, "goldRejoinFlow");
        this.goldRejoinFlow = goldRejoinFlow;
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements = goldRejoinFlow.getGoldSweepAgreements();
        if (goldSweepAgreements != null) {
            fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), new GoldUpgradeAgreementsFragmentContract.Key(goldSweepAgreements, getLoggingContext(), null, false, !(goldSweepAgreements.getDisableSparkleButtonStyling() != null ? r4.booleanValue() : false), 12, null), null, 2, null);
            if (fragmentCreateFragment$default == null) {
                ApiGoldSweepAgreement goldAgreement = goldRejoinFlow.getGoldAgreement();
                if (goldAgreement == null) {
                    throw new IllegalStateException("Invalid state: no goldAgreement or goldSweepAgreements");
                }
                fragmentCreateFragment$default = (LegacyGoldUpgradeAgreementFragment) LegacyGoldUpgradeAgreementFragment.INSTANCE.newInstance((Parcelable) new LegacyGoldUpgradeAgreementFragment.Args(goldAgreement));
            }
        }
        replaceFragmentWithoutAnimation(fragmentCreateFragment$default);
    }

    @Override // com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment.Callbacks
    public void onRejoinFlowFailed(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), error, false, 2, null);
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract.Callbacks
    public void onClickFullAgreement(ApiGoldSweepAgreement agreement) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        replaceFragment(GoldSweepAgreementDisplayFragment.INSTANCE.newInstance((Parcelable) new GoldSweepAgreementDisplayFragment.Args(agreement.getAgreementType(), agreement.getTitle(), null, null, 8, null)));
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract.Callbacks
    public void onClickAgreementsCta(boolean isSweepChecked, UUID selectedPlanId) {
        navigateToRejoinSubmission(Boolean.valueOf(isSweepChecked));
    }

    @Override // com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment.Callbacks
    public void onDisclosureAccepted(UUID selectedPlanId) {
        navigateToRejoinSubmission$default(this, null, 1, null);
    }

    @Override // com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment.Callbacks
    public void onDisclosureFailedToLoad() {
        popLastFragment();
    }

    @Override // com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment.Callbacks
    public void onRejoinLoaded(GoldUpgradeOutcome outcome, Boolean enableSweep) {
        ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation;
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        ApiGoldRejoinFlow apiGoldRejoinFlow = this.goldRejoinFlow;
        if (apiGoldRejoinFlow != null && (goldConfirmation = apiGoldRejoinFlow.getGoldConfirmation()) != null) {
            replaceFragmentWithoutAnimation(LegacyGoldUpgradeConfirmationFragment.INSTANCE.newInstance((Parcelable) new GoldUpgradeConfirmationFragmentContract.Key(outcome, getLoggingContext(), goldConfirmation, enableSweep == null || enableSweep.booleanValue())));
            return;
        }
        if (outcome.isComplete()) {
            setResult(-1);
        }
        finish();
    }

    @Override // com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment.Callbacks
    public void onRejoinFailed(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        popLastFragment();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment instanceof LegacyGoldUpgradeAgreementFragment) || (currentFragment instanceof LegacyGoldUpgradeAgreementsFragment) || (currentFragment instanceof LegacyGoldUpgradeConfirmationFragment) || (currentFragment instanceof GoldRejoinSubmissionFragment)) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeConfirmationFragmentContract.Callbacks
    public void onClickConfirmationCta(boolean isSweepEnabled, boolean isActionHandled) {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new GoldSettingsIntentKey(false, false, null, 7, null), null, false, null, null, 60, null);
        finish();
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeConfirmationFragmentContract.Callbacks
    public void onClickConfirmationFailedCta() {
        finish();
    }

    /* compiled from: GoldRejoinActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinActivity;", "Lcom/robinhood/android/gold/contracts/GoldRejoinIntentKey;", "<init>", "()V", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GoldRejoinActivity, GoldRejoinIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public GoldRejoinIntentKey getExtras(GoldRejoinActivity goldRejoinActivity) {
            return (GoldRejoinIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, goldRejoinActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, GoldRejoinIntentKey goldRejoinIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, goldRejoinIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(android.content.Context context, GoldRejoinIntentKey goldRejoinIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, goldRejoinIntentKey);
        }
    }
}
