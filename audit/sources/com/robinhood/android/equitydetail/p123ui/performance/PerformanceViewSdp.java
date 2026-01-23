package com.robinhood.android.equitydetail.p123ui.performance;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.equitydetail.databinding.MergePerformanceViewContentBinding;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceViewSdp.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0016B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/performance/PerformanceViewSdp;", "Lcom/robinhood/android/common/equitydetail/performance/PerformanceView;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView;", "Lcom/robinhood/android/common/util/UiCallbacks$Clearable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "analyticsCallbacks", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "getAnalyticsCallbacks", "()Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "setAnalyticsCallbacks", "(Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;)V", "clear", "", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class PerformanceViewSdp extends Hammer_PerformanceViewSdp implements LoggableSdpView, UiCallbacks.Clearable {
    private LoggableSdpView.Callbacks analyticsCallbacks;
    private final Component.ComponentType componentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewAttachedToWindow(this, view);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewDetachedFromWindow(this, view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceViewSdp(Context context, AttributeSet attrs) {
        super(context, attrs, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.componentType = Component.ComponentType.PERFORMANCE_SECTION;
        MergePerformanceViewContentBinding binding = getBinding();
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewsKt.setEducationTourId(root, EducationTourElementIds.ETP_PERF_RETURN_SUMMARY_ELEMENT_ID);
        ComposeView performanceDataSegmentedControl = binding.performanceDataSegmentedControl;
        Intrinsics.checkNotNullExpressionValue(performanceDataSegmentedControl, "performanceDataSegmentedControl");
        ViewsKt.setEducationTourId(performanceDataSegmentedControl, EducationTourElementIds.ETP_PERF_SEGMENTED_CONTROL_ELEMENT_ID);
        RhTextView performanceReturnHeader = binding.performanceReturnHeader;
        Intrinsics.checkNotNullExpressionValue(performanceReturnHeader, "performanceReturnHeader");
        ViewsKt.setEducationTourId(performanceReturnHeader, EducationTourElementIds.ETP_PERF_RETURN_HEADER_PRICE_ELEMENT_ID);
        RhTextView performanceNavReturnHeader = binding.performanceNavReturnHeader;
        Intrinsics.checkNotNullExpressionValue(performanceNavReturnHeader, "performanceNavReturnHeader");
        ViewsKt.setEducationTourId(performanceNavReturnHeader, EducationTourElementIds.ETP_PERF_RETURN_HEADER_NAV_ELEMENT_ID);
        RhTextView performance1yRowHeader = binding.performance1yRowHeader;
        Intrinsics.checkNotNullExpressionValue(performance1yRowHeader, "performance1yRowHeader");
        ViewsKt.setEducationTourId(performance1yRowHeader, EducationTourElementIds.ETP_PERF_1Y_RETURN_LABEL_ELEMENT_ID);
        RhTextView performance1yReturn = binding.performance1yReturn;
        Intrinsics.checkNotNullExpressionValue(performance1yReturn, "performance1yReturn");
        ViewsKt.setEducationTourId(performance1yReturn, EducationTourElementIds.ETP_PERF_1Y_RETURN_PRICE_ELEMENT_ID);
        RhTextView performance1yNavReturn = binding.performance1yNavReturn;
        Intrinsics.checkNotNullExpressionValue(performance1yNavReturn, "performance1yNavReturn");
        ViewsKt.setEducationTourId(performance1yNavReturn, EducationTourElementIds.ETP_PERF_1Y_RETURN_NAV_ELEMENT_ID);
        RhTextView performance3yRowHeader = binding.performance3yRowHeader;
        Intrinsics.checkNotNullExpressionValue(performance3yRowHeader, "performance3yRowHeader");
        ViewsKt.setEducationTourId(performance3yRowHeader, EducationTourElementIds.ETP_PERF_3Y_RETURN_LABEL_ELEMENT_ID);
        RhTextView performance3yReturn = binding.performance3yReturn;
        Intrinsics.checkNotNullExpressionValue(performance3yReturn, "performance3yReturn");
        ViewsKt.setEducationTourId(performance3yReturn, EducationTourElementIds.ETP_PERF_3Y_RETURN_PRICE_ELEMENT_ID);
        RhTextView performance3yNavReturn = binding.performance3yNavReturn;
        Intrinsics.checkNotNullExpressionValue(performance3yNavReturn, "performance3yNavReturn");
        ViewsKt.setEducationTourId(performance3yNavReturn, EducationTourElementIds.ETP_PERF_3Y_RETURN_NAV_ELEMENT_ID);
        RhTextView performance5yRowHeader = binding.performance5yRowHeader;
        Intrinsics.checkNotNullExpressionValue(performance5yRowHeader, "performance5yRowHeader");
        ViewsKt.setEducationTourId(performance5yRowHeader, EducationTourElementIds.ETP_PERF_5Y_RETURN_LABEL_ELEMENT_ID);
        RhTextView performance5yReturn = binding.performance5yReturn;
        Intrinsics.checkNotNullExpressionValue(performance5yReturn, "performance5yReturn");
        ViewsKt.setEducationTourId(performance5yReturn, EducationTourElementIds.ETP_PERF_5Y_RETURN_PRICE_ELEMENT_ID);
        RhTextView performance5yNavReturn = binding.performance5yNavReturn;
        Intrinsics.checkNotNullExpressionValue(performance5yNavReturn, "performance5yNavReturn");
        ViewsKt.setEducationTourId(performance5yNavReturn, EducationTourElementIds.ETP_PERF_5Y_RETURN_NAV_ELEMENT_ID);
        RhTextView performance10yRowHeader = binding.performance10yRowHeader;
        Intrinsics.checkNotNullExpressionValue(performance10yRowHeader, "performance10yRowHeader");
        ViewsKt.setEducationTourId(performance10yRowHeader, EducationTourElementIds.ETP_PERF_10Y_RETURN_LABEL_ELEMENT_ID);
        RhTextView performance10yReturn = binding.performance10yReturn;
        Intrinsics.checkNotNullExpressionValue(performance10yReturn, "performance10yReturn");
        ViewsKt.setEducationTourId(performance10yReturn, EducationTourElementIds.ETP_PERF_10Y_RETURN_PRICE_ELEMENT_ID);
        RhTextView performance10yNavReturn = binding.performance10yNavReturn;
        Intrinsics.checkNotNullExpressionValue(performance10yNavReturn, "performance10yNavReturn");
        ViewsKt.setEducationTourId(performance10yNavReturn, EducationTourElementIds.ETP_PERF_10Y_RETURN_NAV_ELEMENT_ID);
        RhTextView performanceInceptionRowHeader = binding.performanceInceptionRowHeader;
        Intrinsics.checkNotNullExpressionValue(performanceInceptionRowHeader, "performanceInceptionRowHeader");
        ViewsKt.setEducationTourId(performanceInceptionRowHeader, EducationTourElementIds.ETP_PERF_SINCE_INCEPTION_LABEL_ELEMENT_ID);
        RhTextView performanceInceptionReturn = binding.performanceInceptionReturn;
        Intrinsics.checkNotNullExpressionValue(performanceInceptionReturn, "performanceInceptionReturn");
        ViewsKt.setEducationTourId(performanceInceptionReturn, EducationTourElementIds.ETP_PERF_SINCE_INCEPTION_PRICE_ELEMENT_ID);
        RhTextView performanceInceptionNavReturn = binding.performanceInceptionNavReturn;
        Intrinsics.checkNotNullExpressionValue(performanceInceptionNavReturn, "performanceInceptionNavReturn");
        ViewsKt.setEducationTourId(performanceInceptionNavReturn, EducationTourElementIds.ETP_PERF_SINCE_INCEPTION_NAV_ELEMENT_ID);
        RhTextView performanceEndDate = binding.performanceEndDate;
        Intrinsics.checkNotNullExpressionValue(performanceEndDate, "performanceEndDate");
        ViewsKt.setEducationTourId(performanceEndDate, EducationTourElementIds.ETP_PERF_AS_OF_DATE_ELEMENT_ID);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public Component.ComponentType getComponentType() {
        return this.componentType;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public LoggableSdpView.Callbacks getAnalyticsCallbacks() {
        return this.analyticsCallbacks;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public void setAnalyticsCallbacks(LoggableSdpView.Callbacks callbacks) {
        this.analyticsCallbacks = callbacks;
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.Clearable
    public void clear() {
        MergePerformanceViewContentBinding binding = getBinding();
        binding.performance1yReturn.setText(getDefaultCellStr());
        binding.performance3yReturn.setText(getDefaultCellStr());
        binding.performance5yReturn.setText(getDefaultCellStr());
        binding.performance10yReturn.setText(getDefaultCellStr());
        binding.performanceInceptionReturn.setText(getDefaultCellStr());
        binding.performance1yNavReturn.setText(getDefaultCellStr());
        binding.performance3yNavReturn.setText(getDefaultCellStr());
        binding.performance5yNavReturn.setText(getDefaultCellStr());
        binding.performance10yNavReturn.setText(getDefaultCellStr());
        binding.performanceInceptionNavReturn.setText(getDefaultCellStr());
        setPreviousState(null);
    }

    /* compiled from: PerformanceViewSdp.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/performance/PerformanceViewSdp$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/performance/PerformanceViewSdp;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<PerformanceViewSdp> {
        private final /* synthetic */ Inflater<PerformanceViewSdp> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public PerformanceViewSdp inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (PerformanceViewSdp) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_performance_view_sdp);
        }
    }
}
