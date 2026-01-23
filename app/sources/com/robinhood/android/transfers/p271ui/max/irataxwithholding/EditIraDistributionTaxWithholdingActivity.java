package com.robinhood.android.transfers.p271ui.max.irataxwithholding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.contract.ActivityResultContract;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.activity.ActivityCompanion3;
import io.noties.markwon.Markwon;
import java.math.BigDecimal;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditIraDistributionTaxWithholdingActivity.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002&'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\t\u0010 \u001a\u00020\u0017H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingFragment$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onEditIraDistributionTaxWithholding", "federalWithholdingPercent", "Ljava/math/BigDecimal;", "stateWithholdingPercent", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "ResultContract", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EditIraDistributionTaxWithholdingActivity extends BaseActivity implements RegionGated, EditIraDistributionTaxWithholdingFragment.Callbacks {
    private static final String ARGS_LOGGING_IDENTIFIER = "loggingIdentifier";
    private static final String EXTRA_RESULT = "extraEditIraTaxWithholdingResult";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public EventLogger eventLogger;
    public Markwon markwon;

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

    public EditIraDistributionTaxWithholdingActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, EditIraDistributionTaxWithholdingFragment.INSTANCE.newInstance(INSTANCE.getExtras((Activity) this)));
        }
        ApiIraDistributionTaxWithholding.DistributionAlert pre_edit_alert = ((EditIraDistributionTaxWithholdingLaunchMode) INSTANCE.getExtras((Activity) this)).getIraDistributionTaxWithholding().getPre_edit_alert();
        if (pre_edit_alert != null) {
            Screen screen = new Screen(Screen.Name.EDIT_IRA_TAX_WITHHOLDINGS, null, null, null, 14, null);
            Component.ComponentType componentType = Component.ComponentType.ALERT;
            String logging_identifier = pre_edit_alert.getLogging_identifier();
            EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, screen, new Component(componentType, logging_identifier, null, 4, null), null, null, 25, null);
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(this).setId(C30065R.id.dialog_id_ira_distribution_pre_edit).setTitle(pre_edit_alert.getTitle()).setMessage(getMarkwon().toMarkdown(pre_edit_alert.getBody_markdown())).setPositiveButton(pre_edit_alert.getConfirm_button_title()).setNegativeButton(pre_edit_alert.getDismiss_button_title());
            Bundle bundle = new Bundle();
            bundle.putString(ARGS_LOGGING_IDENTIFIER, pre_edit_alert.getLogging_identifier());
            RhDialogFragment.Builder passthroughArgs = negativeButton.setPassthroughArgs(bundle);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(passthroughArgs, supportFragmentManager, pre_edit_alert.getLogging_identifier(), false, 4, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30065R.id.dialog_id_ira_distribution_pre_edit) {
            String string2 = passthroughArgs != null ? passthroughArgs.getString(ARGS_LOGGING_IDENTIFIER) : null;
            if (string2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.EDIT_IRA_TAX_WITHHOLDINGS, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, string2, null, 4, null), null, null, false, 56, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30065R.id.dialog_id_ira_distribution_pre_edit) {
            String string2 = passthroughArgs != null ? passthroughArgs.getString(ARGS_LOGGING_IDENTIFIER) : null;
            if (string2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.EDIT_IRA_TAX_WITHHOLDINGS, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, string2, null, 4, null), null, null, false, 56, null);
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment.Callbacks
    public void onEditIraDistributionTaxWithholding(BigDecimal federalWithholdingPercent, BigDecimal stateWithholdingPercent) {
        Intrinsics.checkNotNullParameter(federalWithholdingPercent, "federalWithholdingPercent");
        Intrinsics.checkNotNullParameter(stateWithholdingPercent, "stateWithholdingPercent");
        Intent intent = new Intent();
        intent.putExtra(EXTRA_RESULT, new EditIraDistributionTaxWithholdingResult(federalWithholdingPercent, stateWithholdingPercent));
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    /* compiled from: EditIraDistributionTaxWithholdingActivity.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingActivity$ResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ResultContract extends ActivityResultContract<EditIraDistributionTaxWithholdingLaunchMode, EditIraDistributionTaxWithholdingResult> {
        public static final ResultContract INSTANCE = new ResultContract();
        public static final int $stable = 8;

        private ResultContract() {
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public Intent createIntent(Context context, EditIraDistributionTaxWithholdingLaunchMode input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return EditIraDistributionTaxWithholdingActivity.INSTANCE.getIntentWithExtras(context, (Parcelable) input);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public EditIraDistributionTaxWithholdingResult parseResult(int resultCode, Intent intent) {
            if (resultCode != -1 || intent == null) {
                return null;
            }
            return (EditIraDistributionTaxWithholdingResult) intent.getParcelableExtra(EditIraDistributionTaxWithholdingActivity.EXTRA_RESULT);
        }
    }

    /* compiled from: EditIraDistributionTaxWithholdingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingActivity$Companion;", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingActivity;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode;", "<init>", "()V", "EXTRA_RESULT", "", "ARGS_LOGGING_IDENTIFIER", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements ActivityCompanion3<EditIraDistributionTaxWithholdingActivity, EditIraDistributionTaxWithholdingLaunchMode> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public EditIraDistributionTaxWithholdingLaunchMode getExtras(EditIraDistributionTaxWithholdingActivity editIraDistributionTaxWithholdingActivity) {
            return (EditIraDistributionTaxWithholdingLaunchMode) ActivityCompanion3.DefaultImpls.getExtras(this, editIraDistributionTaxWithholdingActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, EditIraDistributionTaxWithholdingLaunchMode editIraDistributionTaxWithholdingLaunchMode) {
            return ActivityCompanion3.DefaultImpls.getIntentWithExtras(this, context, editIraDistributionTaxWithholdingLaunchMode);
        }
    }
}
