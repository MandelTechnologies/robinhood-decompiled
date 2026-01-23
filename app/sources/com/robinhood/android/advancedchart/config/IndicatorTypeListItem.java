package com.robinhood.android.advancedchart.config;

import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartAddIndicatorViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/IndicatorTypeListItem;", "", "type", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "<init>", "(Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getType", "()Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class IndicatorTypeListItem {
    public static final int $stable = StringResource.$stable;
    private final StringResource primaryText;
    private final StringResource secondaryText;
    private final ApiTechnicalIndicator.Type type;

    public static /* synthetic */ IndicatorTypeListItem copy$default(IndicatorTypeListItem indicatorTypeListItem, ApiTechnicalIndicator.Type type2, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = indicatorTypeListItem.type;
        }
        if ((i & 2) != 0) {
            stringResource = indicatorTypeListItem.primaryText;
        }
        if ((i & 4) != 0) {
            stringResource2 = indicatorTypeListItem.secondaryText;
        }
        return indicatorTypeListItem.copy(type2, stringResource, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiTechnicalIndicator.Type getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final IndicatorTypeListItem copy(ApiTechnicalIndicator.Type type2, StringResource primaryText, StringResource secondaryText) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        return new IndicatorTypeListItem(type2, primaryText, secondaryText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorTypeListItem)) {
            return false;
        }
        IndicatorTypeListItem indicatorTypeListItem = (IndicatorTypeListItem) other;
        return this.type == indicatorTypeListItem.type && Intrinsics.areEqual(this.primaryText, indicatorTypeListItem.primaryText) && Intrinsics.areEqual(this.secondaryText, indicatorTypeListItem.secondaryText);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode();
    }

    public String toString() {
        return "IndicatorTypeListItem(type=" + this.type + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ")";
    }

    public IndicatorTypeListItem(ApiTechnicalIndicator.Type type2, StringResource primaryText, StringResource secondaryText) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        this.type = type2;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
    }

    public final ApiTechnicalIndicator.Type getType() {
        return this.type;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }
}
