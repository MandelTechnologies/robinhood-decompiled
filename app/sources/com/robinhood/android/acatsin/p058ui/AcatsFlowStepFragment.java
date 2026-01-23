package com.robinhood.android.acatsin.p058ui;

import android.content.res.Resources;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.AcatsFlowStep2;
import com.robinhood.android.acatsin.util.AcatsFlowStep3;
import com.robinhood.android.acatsin.util.RhToolbars;
import com.robinhood.android.common.p088ui.RhFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsFlowStepFragment.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/acatsin/ui/AcatsFlowStepFragment;", "Lcom/robinhood/android/common/ui/RhFragment;", "flow", "Lcom/robinhood/android/acatsin/util/AcatsFlow;", "getFlow", "()Lcom/robinhood/android/acatsin/util/AcatsFlow;", "step", "Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "getStep", "()Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AcatsFlowStepFragment extends RhFragment {
    @Override // com.robinhood.android.common.p088ui.RhFragment
    void configureToolbar(RhToolbar toolbar);

    AcatsFlowStep2 getFlow();

    AcatsFlowStep getStep();

    /* compiled from: AcatsFlowStepFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static void configureToolbar(AcatsFlowStepFragment acatsFlowStepFragment, RhToolbar toolbar) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(toolbar, "toolbar");
            String string2 = toolbar.getResources().getString(C7686R.string.acats_page_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            RhToolbars.setCenteredTitle(toolbar, string2);
            toolbar.getProgressBar().setNumSegments(1);
            RdsSegmentedProgressBar.setProgressByAbsolutePosition$default(toolbar.getProgressBar(), AcatsFlowStep3.getDisplayStep(acatsFlowStepFragment.getFlow(), acatsFlowStepFragment.getStep()) / acatsFlowStepFragment.getFlow().getTotalSteps(), false, 2, null);
            toolbar.getProgressBar().setVisibility(0);
        }
    }
}
