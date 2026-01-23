package com.robinhood.shared.common.earnings;

import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ChartGroupDto;

/* compiled from: EarningsDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/common/earnings/EarningsDataState;", "", "uiEarnings", "Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;", "showHeader", "", "headerOverride", "", "chartData", "Lrh_server_driven_ui/v1/ChartGroupDto;", "noEarnings", "<init>", "(Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;ZLjava/lang/String;Lrh_server_driven_ui/v1/ChartGroupDto;Z)V", "getUiEarnings", "()Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;", "getShowHeader", "()Z", "getHeaderOverride", "()Ljava/lang/String;", "getChartData", "()Lrh_server_driven_ui/v1/ChartGroupDto;", "getNoEarnings", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-earnings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class EarningsDataState {
    public static final int $stable = 8;
    private final ChartGroupDto chartData;
    private final String headerOverride;
    private final boolean noEarnings;
    private final boolean showHeader;
    private final UiEarnings uiEarnings;

    public EarningsDataState() {
        this(null, false, null, null, false, 31, null);
    }

    public static /* synthetic */ EarningsDataState copy$default(EarningsDataState earningsDataState, UiEarnings uiEarnings, boolean z, String str, ChartGroupDto chartGroupDto, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEarnings = earningsDataState.uiEarnings;
        }
        if ((i & 2) != 0) {
            z = earningsDataState.showHeader;
        }
        if ((i & 4) != 0) {
            str = earningsDataState.headerOverride;
        }
        if ((i & 8) != 0) {
            chartGroupDto = earningsDataState.chartData;
        }
        if ((i & 16) != 0) {
            z2 = earningsDataState.noEarnings;
        }
        boolean z3 = z2;
        String str2 = str;
        return earningsDataState.copy(uiEarnings, z, str2, chartGroupDto, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final UiEarnings getUiEarnings() {
        return this.uiEarnings;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowHeader() {
        return this.showHeader;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHeaderOverride() {
        return this.headerOverride;
    }

    /* renamed from: component4, reason: from getter */
    public final ChartGroupDto getChartData() {
        return this.chartData;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getNoEarnings() {
        return this.noEarnings;
    }

    public final EarningsDataState copy(UiEarnings uiEarnings, boolean showHeader, String headerOverride, ChartGroupDto chartData, boolean noEarnings) {
        return new EarningsDataState(uiEarnings, showHeader, headerOverride, chartData, noEarnings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarningsDataState)) {
            return false;
        }
        EarningsDataState earningsDataState = (EarningsDataState) other;
        return Intrinsics.areEqual(this.uiEarnings, earningsDataState.uiEarnings) && this.showHeader == earningsDataState.showHeader && Intrinsics.areEqual(this.headerOverride, earningsDataState.headerOverride) && Intrinsics.areEqual(this.chartData, earningsDataState.chartData) && this.noEarnings == earningsDataState.noEarnings;
    }

    public int hashCode() {
        UiEarnings uiEarnings = this.uiEarnings;
        int iHashCode = (((uiEarnings == null ? 0 : uiEarnings.hashCode()) * 31) + Boolean.hashCode(this.showHeader)) * 31;
        String str = this.headerOverride;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ChartGroupDto chartGroupDto = this.chartData;
        return ((iHashCode2 + (chartGroupDto != null ? chartGroupDto.hashCode() : 0)) * 31) + Boolean.hashCode(this.noEarnings);
    }

    public String toString() {
        return "EarningsDataState(uiEarnings=" + this.uiEarnings + ", showHeader=" + this.showHeader + ", headerOverride=" + this.headerOverride + ", chartData=" + this.chartData + ", noEarnings=" + this.noEarnings + ")";
    }

    public EarningsDataState(UiEarnings uiEarnings, boolean z, String str, ChartGroupDto chartGroupDto, boolean z2) {
        this.uiEarnings = uiEarnings;
        this.showHeader = z;
        this.headerOverride = str;
        this.chartData = chartGroupDto;
        this.noEarnings = z2;
    }

    public /* synthetic */ EarningsDataState(UiEarnings uiEarnings, boolean z, String str, ChartGroupDto chartGroupDto, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEarnings, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : chartGroupDto, (i & 16) != 0 ? false : z2);
    }

    public final UiEarnings getUiEarnings() {
        return this.uiEarnings;
    }

    public final boolean getShowHeader() {
        return this.showHeader;
    }

    public final String getHeaderOverride() {
        return this.headerOverride;
    }

    public final ChartGroupDto getChartData() {
        return this.chartData;
    }

    public final boolean getNoEarnings() {
        return this.noEarnings;
    }
}
