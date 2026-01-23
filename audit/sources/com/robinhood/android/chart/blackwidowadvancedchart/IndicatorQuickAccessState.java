package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: BlackWidowAdvancedChartViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/IndicatorQuickAccessState;", "", "selectedIndicators", "Lkotlinx/collections/immutable/ImmutableList;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "selectedTemplate", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "availableTemplates", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;Lkotlinx/collections/immutable/ImmutableList;)V", "getSelectedIndicators", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedTemplate", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "getAvailableTemplates", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class IndicatorQuickAccessState {
    public static final int $stable = 8;
    private final ImmutableList<TemplateDto> availableTemplates;
    private final ImmutableList<IndicatorStateDto> selectedIndicators;
    private final TemplateDto selectedTemplate;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndicatorQuickAccessState copy$default(IndicatorQuickAccessState indicatorQuickAccessState, ImmutableList immutableList, TemplateDto templateDto, ImmutableList immutableList2, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = indicatorQuickAccessState.selectedIndicators;
        }
        if ((i & 2) != 0) {
            templateDto = indicatorQuickAccessState.selectedTemplate;
        }
        if ((i & 4) != 0) {
            immutableList2 = indicatorQuickAccessState.availableTemplates;
        }
        return indicatorQuickAccessState.copy(immutableList, templateDto, immutableList2);
    }

    public final ImmutableList<IndicatorStateDto> component1() {
        return this.selectedIndicators;
    }

    /* renamed from: component2, reason: from getter */
    public final TemplateDto getSelectedTemplate() {
        return this.selectedTemplate;
    }

    public final ImmutableList<TemplateDto> component3() {
        return this.availableTemplates;
    }

    public final IndicatorQuickAccessState copy(ImmutableList<IndicatorStateDto> selectedIndicators, TemplateDto selectedTemplate, ImmutableList<TemplateDto> availableTemplates) {
        Intrinsics.checkNotNullParameter(selectedIndicators, "selectedIndicators");
        return new IndicatorQuickAccessState(selectedIndicators, selectedTemplate, availableTemplates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorQuickAccessState)) {
            return false;
        }
        IndicatorQuickAccessState indicatorQuickAccessState = (IndicatorQuickAccessState) other;
        return Intrinsics.areEqual(this.selectedIndicators, indicatorQuickAccessState.selectedIndicators) && Intrinsics.areEqual(this.selectedTemplate, indicatorQuickAccessState.selectedTemplate) && Intrinsics.areEqual(this.availableTemplates, indicatorQuickAccessState.availableTemplates);
    }

    public int hashCode() {
        int iHashCode = this.selectedIndicators.hashCode() * 31;
        TemplateDto templateDto = this.selectedTemplate;
        int iHashCode2 = (iHashCode + (templateDto == null ? 0 : templateDto.hashCode())) * 31;
        ImmutableList<TemplateDto> immutableList = this.availableTemplates;
        return iHashCode2 + (immutableList != null ? immutableList.hashCode() : 0);
    }

    public String toString() {
        return "IndicatorQuickAccessState(selectedIndicators=" + this.selectedIndicators + ", selectedTemplate=" + this.selectedTemplate + ", availableTemplates=" + this.availableTemplates + ")";
    }

    public IndicatorQuickAccessState(ImmutableList<IndicatorStateDto> selectedIndicators, TemplateDto templateDto, ImmutableList<TemplateDto> immutableList) {
        Intrinsics.checkNotNullParameter(selectedIndicators, "selectedIndicators");
        this.selectedIndicators = selectedIndicators;
        this.selectedTemplate = templateDto;
        this.availableTemplates = immutableList;
    }

    public final ImmutableList<IndicatorStateDto> getSelectedIndicators() {
        return this.selectedIndicators;
    }

    public final TemplateDto getSelectedTemplate() {
        return this.selectedTemplate;
    }

    public final ImmutableList<TemplateDto> getAvailableTemplates() {
        return this.availableTemplates;
    }
}
