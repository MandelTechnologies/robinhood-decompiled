package com.robinhood.android.transfers.recurring.p270ui.experiment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.RecurringDepositsHub;
import com.robinhood.android.transfers.contracts.TransferSuccessCallbacks;
import com.robinhood.android.transfers.recurring.p270ui.experiment.RecurringDepositHubFragment;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.create.CreateComposable5;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.shared.transfers.contracts.TransferSuccessKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositHubActivity.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/RecurringDepositHubActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateCallbacks;", "Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", "<init>", "()V", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showPostTransferFlow", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onTransferConfirmationComplete", "Companion", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringDepositHubActivity extends BaseActivity implements CreateComposable5, TransferSuccessCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public RecurringDepositHubActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFragment(C11048R.id.fragment_container, RecurringDepositHubFragment.INSTANCE.newInstance((Parcelable) new RecurringDepositHubFragment.Args(((RecurringDepositsHub) INSTANCE.getExtras((Activity) this)).getLaunchRecurringExtraCashOnStart())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.create.CreateComposable5
    public void showPostTransferFlow(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new TransferSuccessKey(postTransferFlow, null, 2, 0 == true ? 1 : 0), null, 2, null));
    }

    @Override // com.robinhood.android.transfers.contracts.TransferSuccessCallbacks
    public void onTransferConfirmationComplete(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        popLastFragment();
    }

    /* compiled from: RecurringDepositHubActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/RecurringDepositHubActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/RecurringDepositHubActivity;", "Lcom/robinhood/android/transfers/contracts/RecurringDepositsHub;", "<init>", "()V", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<RecurringDepositHubActivity, RecurringDepositsHub> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public RecurringDepositsHub getExtras(RecurringDepositHubActivity recurringDepositHubActivity) {
            return (RecurringDepositsHub) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, recurringDepositHubActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RecurringDepositsHub recurringDepositsHub) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, recurringDepositsHub);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, RecurringDepositsHub recurringDepositsHub) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, recurringDepositsHub);
        }
    }
}
