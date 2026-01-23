package com.robinhood.android.transfers.p271ui.max.accounts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionResult;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountSelectionFragment;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TransferAccountSelectionActivity.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u001c\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSourceAccountSelected", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "iraDistributionInfo", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "onSinkAccountSelected", "iraContributionInfo", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferAccountSelectionActivity extends BaseActivity implements TransferAccountSelectionFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSinkAccountSelected(TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, RecipientType recipientType, WireRoutingDetailsInputActivityResultContract3.Success success) {
        TransferAccountSelectionFragment.Callbacks.DefaultImpls.onSinkAccountSelected(this, transferAccount, iraContribution, recipientType, success);
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onUkAddAccountSelected(TransferAccount transferAccount) {
        TransferAccountSelectionFragment.Callbacks.DefaultImpls.onUkAddAccountSelected(this, transferAccount);
    }

    public TransferAccountSelectionActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, TransferAccountSelectionFragment.INSTANCE.newInstance(INSTANCE.getExtras((Activity) this)));
        }
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSourceAccountSelected(TransferAccount account, IraDistributionQuestionnaireResult.IraDistribution iraDistributionInfo) {
        NavigationActivityResultContract3.finishWithResult(this, new TransferAccountSelectionResult.Source(account, iraDistributionInfo));
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSinkAccountSelected(TransferAccount account, IraContributionQuestionnaireResult.IraContribution iraContributionInfo) {
        NavigationActivityResultContract3.finishWithResult(this, new TransferAccountSelectionResult.Sink(account, iraContributionInfo));
    }

    /* compiled from: TransferAccountSelectionActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionActivity;", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<TransferAccountSelectionActivity, TransferAccountSelectionKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public TransferAccountSelectionKey getExtras(TransferAccountSelectionActivity transferAccountSelectionActivity) {
            return (TransferAccountSelectionKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, transferAccountSelectionActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, TransferAccountSelectionKey transferAccountSelectionKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, transferAccountSelectionKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, TransferAccountSelectionKey transferAccountSelectionKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, transferAccountSelectionKey);
        }
    }
}
