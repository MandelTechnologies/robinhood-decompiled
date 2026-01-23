package com.robinhood.android.history.p153ui.transfer;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RfpTimelineInstantTransferDetailComponent.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transfer/RfpTimelineInstantTransferDetailComponentDisplayData;", "", "title", "", "subtitle", "timelineItems", "", "Lcom/robinhood/android/history/ui/transfer/RfpTimelineRowDisplayItem;", "disclaimerText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getTimelineItems", "()Ljava/util/List;", "getDisclaimerText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RfpTimelineInstantTransferDetailComponentDisplayData {
    public static final int $stable = 8;
    private final String disclaimerText;
    private final String subtitle;
    private final List<RfpTimelineRowDisplayItem> timelineItems;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RfpTimelineInstantTransferDetailComponentDisplayData copy$default(RfpTimelineInstantTransferDetailComponentDisplayData rfpTimelineInstantTransferDetailComponentDisplayData, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rfpTimelineInstantTransferDetailComponentDisplayData.title;
        }
        if ((i & 2) != 0) {
            str2 = rfpTimelineInstantTransferDetailComponentDisplayData.subtitle;
        }
        if ((i & 4) != 0) {
            list = rfpTimelineInstantTransferDetailComponentDisplayData.timelineItems;
        }
        if ((i & 8) != 0) {
            str3 = rfpTimelineInstantTransferDetailComponentDisplayData.disclaimerText;
        }
        return rfpTimelineInstantTransferDetailComponentDisplayData.copy(str, str2, list, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<RfpTimelineRowDisplayItem> component3() {
        return this.timelineItems;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclaimerText() {
        return this.disclaimerText;
    }

    public final RfpTimelineInstantTransferDetailComponentDisplayData copy(String title, String subtitle, List<RfpTimelineRowDisplayItem> timelineItems, String disclaimerText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(timelineItems, "timelineItems");
        Intrinsics.checkNotNullParameter(disclaimerText, "disclaimerText");
        return new RfpTimelineInstantTransferDetailComponentDisplayData(title, subtitle, timelineItems, disclaimerText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RfpTimelineInstantTransferDetailComponentDisplayData)) {
            return false;
        }
        RfpTimelineInstantTransferDetailComponentDisplayData rfpTimelineInstantTransferDetailComponentDisplayData = (RfpTimelineInstantTransferDetailComponentDisplayData) other;
        return Intrinsics.areEqual(this.title, rfpTimelineInstantTransferDetailComponentDisplayData.title) && Intrinsics.areEqual(this.subtitle, rfpTimelineInstantTransferDetailComponentDisplayData.subtitle) && Intrinsics.areEqual(this.timelineItems, rfpTimelineInstantTransferDetailComponentDisplayData.timelineItems) && Intrinsics.areEqual(this.disclaimerText, rfpTimelineInstantTransferDetailComponentDisplayData.disclaimerText);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.timelineItems.hashCode()) * 31) + this.disclaimerText.hashCode();
    }

    public String toString() {
        return "RfpTimelineInstantTransferDetailComponentDisplayData(title=" + this.title + ", subtitle=" + this.subtitle + ", timelineItems=" + this.timelineItems + ", disclaimerText=" + this.disclaimerText + ")";
    }

    public RfpTimelineInstantTransferDetailComponentDisplayData(String title, String subtitle, List<RfpTimelineRowDisplayItem> timelineItems, String disclaimerText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(timelineItems, "timelineItems");
        Intrinsics.checkNotNullParameter(disclaimerText, "disclaimerText");
        this.title = title;
        this.subtitle = subtitle;
        this.timelineItems = timelineItems;
        this.disclaimerText = disclaimerText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<RfpTimelineRowDisplayItem> getTimelineItems() {
        return this.timelineItems;
    }

    public final String getDisclaimerText() {
        return this.disclaimerText;
    }
}
