package com.robinhood.android.beneficiaries.p067ui.individualflow;

import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseBeneficiaryCreateStepFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\t\u0010\u0015\u001a\u00020\u0016H\u0096\u0001R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/BaseBeneficiaryCreateStepFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "layoutRes", "", "<init>", "(I)V", "step", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", "getStep", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "getConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "getTotalSegments", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class BaseBeneficiaryCreateStepFragment extends BaseRhBottomSheetDialogHostFragment implements RegionGated, AutoLoggableFragment {
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    public abstract ApiCreateBeneficiaryConfiguration getConfiguration();

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    public abstract BeneficiaryCreateStep getStep();

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public BaseBeneficiaryCreateStepFragment(int i) {
        super(i);
        this.$$delegate_0 = new RegionGated2(BeneficiariesRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        int i;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (getConfiguration().isEditing()) {
            i = C9637R.string.beneficiary_create_steps_title_edit;
        } else {
            i = C9637R.string.beneficiary_create_steps_title_create;
        }
        toolbar.setTitle(i);
        toolbar.getProgressBar().setVisibility(0);
        toolbar.getProgressBar().setNumSegments(getTotalSegments());
        toolbar.getProgressBar().setProgress(getStep().getSegmentIndex(), getStep().getSegmentProgress(), true);
    }

    private final int getTotalSegments() {
        return getConfiguration().getAccount_view_model() == null ? 4 : 5;
    }
}
