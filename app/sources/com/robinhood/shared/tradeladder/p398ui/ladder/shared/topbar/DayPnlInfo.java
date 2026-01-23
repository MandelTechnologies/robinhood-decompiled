package com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailContent.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/DayPnlInfo;", "", "showTooltip", "", "tooltipContent", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(ZLcom/robinhood/utils/resource/StringResource;)V", "getShowTooltip", "()Z", "getTooltipContent", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DayPnlInfo {
    public static final int $stable = StringResource.$stable;
    private final boolean showTooltip;
    private final StringResource tooltipContent;

    public static /* synthetic */ DayPnlInfo copy$default(DayPnlInfo dayPnlInfo, boolean z, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dayPnlInfo.showTooltip;
        }
        if ((i & 2) != 0) {
            stringResource = dayPnlInfo.tooltipContent;
        }
        return dayPnlInfo.copy(z, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowTooltip() {
        return this.showTooltip;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getTooltipContent() {
        return this.tooltipContent;
    }

    public final DayPnlInfo copy(boolean showTooltip, StringResource tooltipContent) {
        Intrinsics.checkNotNullParameter(tooltipContent, "tooltipContent");
        return new DayPnlInfo(showTooltip, tooltipContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayPnlInfo)) {
            return false;
        }
        DayPnlInfo dayPnlInfo = (DayPnlInfo) other;
        return this.showTooltip == dayPnlInfo.showTooltip && Intrinsics.areEqual(this.tooltipContent, dayPnlInfo.tooltipContent);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.showTooltip) * 31) + this.tooltipContent.hashCode();
    }

    public String toString() {
        return "DayPnlInfo(showTooltip=" + this.showTooltip + ", tooltipContent=" + this.tooltipContent + ")";
    }

    public DayPnlInfo(boolean z, StringResource tooltipContent) {
        Intrinsics.checkNotNullParameter(tooltipContent, "tooltipContent");
        this.showTooltip = z;
        this.tooltipContent = tooltipContent;
    }

    public final boolean getShowTooltip() {
        return this.showTooltip;
    }

    public final StringResource getTooltipContent() {
        return this.tooltipContent;
    }
}
