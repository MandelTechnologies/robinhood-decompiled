package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.TransferSuccessCallbacks;
import com.robinhood.android.transfers.contracts.UkQueuedDeposit;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositFragment;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationFragment;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow2;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.transfers.contracts.TransferSuccessKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkQueuedDepositActivity.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationFragment$Callbacks;", "Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onMandateAuthorized", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "postTransferPage", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "onStandardDepositCreated", "response", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "onTransferConfirmationComplete", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onFlowCompleted", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class UkQueuedDepositActivity extends BaseActivity implements UkQueuedDepositFragment.Callbacks, UkQueuedDepositConfirmationFragment.Callbacks, TransferSuccessCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public UkQueuedDepositActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, UkQueuedDepositFragment.INSTANCE.newInstance((Parcelable) new UkQueuedDepositFragment.Args(((UkQueuedDeposit) INSTANCE.getExtras((Activity) this)).getEntryPoint())));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ToolbarExt2.configureMaxActivity(toolbar, OnboardingProgress.FUND_ACCOUNT_DEPOSIT, ((UkQueuedDeposit) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding());
    }

    @Override // com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment.Callbacks
    public void onMandateAuthorized(Context eventContext, UiPostTransferPage.UkQueuedDeposit postTransferPage) {
        Intrinsics.checkNotNullParameter(postTransferPage, "postTransferPage");
        replaceFragmentWithoutBackStack(UkQueuedDepositConfirmationFragment.INSTANCE.newInstance((Parcelable) new UkQueuedDepositConfirmationFragment.Args(eventContext, postTransferPage)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment.Callbacks
    public void onStandardDepositCreated(ApiCreateTransferResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        replaceFragmentWithoutBackStack(Navigator.DefaultImpls.createFragment$default(getNavigator(), new TransferSuccessKey(PostTransferFlow2.toUiModel(response, ApiTransferAccount.TransferAccountType.RHS), null, 2, 0 == true ? 1 : 0), null, 2, null));
    }

    @Override // com.robinhood.android.transfers.contracts.TransferSuccessCallbacks
    public void onTransferConfirmationComplete(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        onFlowCompleted();
    }

    @Override // com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment.Callbacks, com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationFragment.Callbacks
    public void onFlowCompleted() {
        Uri exitDeeplink = ((UkQueuedDeposit) INSTANCE.getExtras((Activity) this)).getExitDeeplink();
        if (exitDeeplink != null) {
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, exitDeeplink, null, null, false, null, 60, null);
        }
        setResult(-1);
        finish();
    }

    /* compiled from: UkQueuedDepositActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositActivity;", "Lcom/robinhood/android/transfers/contracts/UkQueuedDeposit;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<UkQueuedDepositActivity, UkQueuedDeposit> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public UkQueuedDeposit getExtras(UkQueuedDepositActivity ukQueuedDepositActivity) {
            return (UkQueuedDeposit) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, ukQueuedDepositActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, UkQueuedDeposit ukQueuedDeposit) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, ukQueuedDeposit);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(android.content.Context context, UkQueuedDeposit ukQueuedDeposit) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, ukQueuedDeposit);
        }
    }
}
