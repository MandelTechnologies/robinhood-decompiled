package com.robinhood.android.acatsin.p058ui;

import android.content.res.Resources;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.AcatsFlowStep2;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsFlowStepFragment.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/acatsin/ui/AcatsFlowStepFragment;", "layoutRes", "", "flow", "Lcom/robinhood/android/acatsin/util/AcatsFlow;", "step", "Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "<init>", "(ILcom/robinhood/android/acatsin/util/AcatsFlow;Lcom/robinhood/android/acatsin/util/AcatsFlowStep;)V", "getFlow", "()Lcom/robinhood/android/acatsin/util/AcatsFlow;", "getStep", "()Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.ui.BaseAcatsFlowStepFragment, reason: use source file name */
/* loaded from: classes24.dex */
public class AcatsFlowStepFragment3 extends BaseFragment implements AcatsFlowStepFragment {
    public static final int $stable = BaseFragment.$stable;
    private final AcatsFlowStep2 flow;
    private final AcatsFlowStep step;

    public /* synthetic */ AcatsFlowStepFragment3(int i, AcatsFlowStep2 acatsFlowStep2, AcatsFlowStep acatsFlowStep, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? AcatsFlowStep2.ACATS_IN_PRIMARY : acatsFlowStep2, acatsFlowStep);
    }

    @Override // com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment
    public AcatsFlowStep2 getFlow() {
        return this.flow;
    }

    @Override // com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment
    public AcatsFlowStep getStep() {
        return this.step;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsFlowStepFragment3(int i, AcatsFlowStep2 flow, AcatsFlowStep step) {
        super(i);
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(step, "step");
        this.flow = flow;
        this.step = step;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        AcatsFlowStepFragment.DefaultImpls.configureToolbar(this, toolbar);
    }
}
