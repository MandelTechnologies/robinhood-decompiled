package com.robinhood.android.transfers.p271ui.retirement.contributions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.banking.util.DeactivatedAccountUtils;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.contracts.retirement.ContributionContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.transfers.contracts.CreateRetirementContribution;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountSelectionFragment;
import com.robinhood.android.transfers.p271ui.max.posttransfer.TransferSuccessActivity;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionFragment;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.transfers.contracts.TransferSuccessIntentKey;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateRetirementContributionActivity.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001*B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u001c\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001c\u0010'\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment$Callbacks;", "<init>", "()V", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "getTransferAccountStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "setTransferAccountStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "onContinue", "bundle", "Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "showGoldRejoinFlow", "", "onSuccessfulContribution", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "getTransferAccountSelectionFragment", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment;", "getCreateRetirementContributionFragment", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment;", "accountNumber", "", "onSourceAccountSelected", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "iraDistributionInfo", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "onSinkAccountSelected", "iraContributionInfo", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateRetirementContributionActivity extends BaseActivity implements RhDialogFragment.OnDismissListener, TransferAccountSelectionFragment.Callbacks, CreateRetirementContributionFragment.Callbacks {
    public TransferAccountStore transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.Callbacks
    public void onContinue(ContributionBundle bundle, boolean showGoldRejoinFlow) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSinkAccountSelected(TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, RecipientType recipientType, WireRoutingDetailsInputActivityResultContract3.Success success) {
        TransferAccountSelectionFragment.Callbacks.DefaultImpls.onSinkAccountSelected(this, transferAccount, iraContribution, recipientType, success);
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onUkAddAccountSelected(TransferAccount transferAccount) {
        TransferAccountSelectionFragment.Callbacks.DefaultImpls.onUkAddAccountSelected(this, transferAccount);
    }

    public CreateRetirementContributionActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    public final TransferAccountStore getTransferAccountStore() {
        TransferAccountStore transferAccountStore = this.transferAccountStore;
        if (transferAccountStore != null) {
            return transferAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transferAccountStore");
        return null;
    }

    public final void setTransferAccountStore(TransferAccountStore transferAccountStore) {
        Intrinsics.checkNotNullParameter(transferAccountStore, "<set-?>");
        this.transferAccountStore = transferAccountStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Fragment transferAccountSelectionFragment;
        super.onCreate(savedInstanceState);
        ScarletManager2.getScarletManager(this).putOverlay(AchromaticOverlay.INSTANCE, Boolean.FALSE);
        if (savedInstanceState == null) {
            DeactivatedAccountUtils.preventDeactivatedIraUsersFromProceeding(this, getTransferAccountStore(), C9631R.string.transfers_deactivated_account_message);
            String accountNumber = ((CreateRetirementContribution) INSTANCE.getExtras((Activity) this)).getAccountNumber();
            int i = C11048R.id.fragment_container;
            if (accountNumber != null) {
                transferAccountSelectionFragment = getCreateRetirementContributionFragment(accountNumber);
            } else {
                transferAccountSelectionFragment = getTransferAccountSelectionFragment();
            }
            setFragment(i, transferAccountSelectionFragment);
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C9631R.id.dialog_id_deactivated_account) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.transfers.p271ui.retirement.contributions.ContributionSubmitterCallbacks
    public void onSuccessfulContribution(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        if (!postTransferFlow.getPostTransferPages().isEmpty()) {
            finish();
            startActivity(TransferSuccessActivity.INSTANCE.getIntentWithExtras((Context) this, (Parcelable) new TransferSuccessIntentKey(postTransferFlow, null, 2, 0 == true ? 1 : 0)));
            return;
        }
        NavigationActivityResultContract3.finishWithResult(this, new ContributionContract.Result.Completed(postTransferFlow.getTransferId()));
    }

    private final TransferAccountSelectionFragment getTransferAccountSelectionFragment() {
        return (TransferAccountSelectionFragment) TransferAccountSelectionFragment.INSTANCE.newInstance((Parcelable) new TransferAccountSelectionKey(null, TransferAccountDirection.SINK, CollectionsKt.emptyList(), null, true, null, IraContributionType.ONE_TIME_CONTRIBUTION, true, null, null, null, null, null, null, null, null, 65281, null));
    }

    private final CreateRetirementContributionFragment getCreateRetirementContributionFragment(String accountNumber) {
        CreateRetirementContributionFragment.Companion companion = CreateRetirementContributionFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        return (CreateRetirementContributionFragment) companion.newInstance((Parcelable) new CreateRetirementContributionFragment.Args(accountNumber, ((CreateRetirementContribution) companion2.getExtras((Activity) this)).getAmount(), ((CreateRetirementContribution) companion2.getExtras((Activity) this)).getShowCelebration(), ((CreateRetirementContribution) companion2.getExtras((Activity) this)).getShowFrequencyRow(), ((CreateRetirementContribution) companion2.getExtras((Activity) this)).getEntryPoint(), null, null, false, false, false, 992, null));
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSourceAccountSelected(TransferAccount account, IraDistributionQuestionnaireResult.IraDistribution iraDistributionInfo) {
        throw new IllegalStateException("CreateRetirementContributionActivity doesn't handle source account!");
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSinkAccountSelected(TransferAccount account, IraContributionQuestionnaireResult.IraContribution iraContributionInfo) {
        String accountNumber;
        if (account == null || (accountNumber = account.getAccountNumber()) == null) {
            return;
        }
        replaceFragment(getCreateRetirementContributionFragment(accountNumber));
    }

    /* compiled from: CreateRetirementContributionActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionActivity;", "Lcom/robinhood/android/transfers/contracts/CreateRetirementContribution;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CreateRetirementContributionActivity, CreateRetirementContribution> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CreateRetirementContribution getExtras(CreateRetirementContributionActivity createRetirementContributionActivity) {
            return (CreateRetirementContribution) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, createRetirementContributionActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CreateRetirementContribution createRetirementContribution) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, createRetirementContribution);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CreateRetirementContribution createRetirementContribution) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, createRetirementContribution);
        }
    }
}
