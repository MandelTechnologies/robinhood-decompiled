package com.robinhood.android.acatsin.p058ui;

import android.content.res.Resources;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.AcatsFlowStep2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.scarlet.ScarletManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsFlowStepFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepComposeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/acatsin/ui/AcatsFlowStepFragment;", "flow", "Lcom/robinhood/android/acatsin/util/AcatsFlow;", "step", "Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsFlow;Lcom/robinhood/android/acatsin/util/AcatsFlowStep;)V", "getFlow", "()Lcom/robinhood/android/acatsin/util/AcatsFlow;", "getStep", "()Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "onStart", "", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.ui.BaseAcatsFlowStepComposeFragment, reason: use source file name */
/* loaded from: classes24.dex */
public abstract class AcatsFlowStepFragment2 extends GenericComposeFragment implements AcatsFlowStepFragment {
    public static final int $stable = GenericComposeFragment.$stable;
    private final AcatsFlowStep2 flow;
    private final AcatsFlowStep step;

    public /* synthetic */ AcatsFlowStepFragment2(AcatsFlowStep2 acatsFlowStep2, AcatsFlowStep acatsFlowStep, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AcatsFlowStep2.ACATS_IN_PRIMARY : acatsFlowStep2, acatsFlowStep);
    }

    public AcatsFlowStep2 getFlow() {
        return this.flow;
    }

    @Override // com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment
    public AcatsFlowStep getStep() {
        return this.step;
    }

    public AcatsFlowStepFragment2(AcatsFlowStep2 flow, AcatsFlowStep step) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(step, "step");
        this.flow = flow;
        this.step = step;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        AcatsFlowStepFragment.DefaultImpls.configureToolbar(this, toolbar);
    }
}
