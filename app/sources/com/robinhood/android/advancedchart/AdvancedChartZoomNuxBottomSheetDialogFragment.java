package com.robinhood.android.advancedchart;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartZoomNuxBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u0017X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartZoomNuxBottomSheetDialogFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "iconDrawableRes", "", "getIconDrawableRes", "()Ljava/lang/Integer;", "titleTextLabel", "", "getTitleTextLabel", "()Ljava/lang/String;", "descriptionTextLabel", "getDescriptionTextLabel", "primaryButtonLabel", "getPrimaryButtonLabel", "forAchromatic", "", "getForAchromatic", "()Z", "onStart", "", "Companion", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AdvancedChartZoomNuxBottomSheetDialogFragment extends RhBottomSheetDialogFragment {
    private static final String ADVANCED_CHART_ZOOM_NUX_SCREEN_IDENTIFIER = "EQUITY_ADVANCED_CHARTS_ZOOM_NUX";
    public EventLogger eventLogger;
    private final boolean forAchromatic = true;
    public static final int $stable = 8;

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

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected Integer getIconDrawableRes() {
        return Integer.valueOf(C8502R.drawable.pict_expand);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getTitleTextLabel() {
        String string2 = getString(C8502R.string.advanced_chart_zoom_nux_bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getDescriptionTextLabel() {
        String string2 = getString(C8502R.string.advanced_chart_zoom_nux_bottom_sheet_body);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getPrimaryButtonLabel() {
        String string2 = getString(C11048R.string.general_label_got_it);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected boolean getForAchromatic() {
        return this.forAchromatic;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(null, null, ADVANCED_CHART_ZOOM_NUX_SCREEN_IDENTIFIER, null, 11, null), null, null, null, 29, null);
    }
}
