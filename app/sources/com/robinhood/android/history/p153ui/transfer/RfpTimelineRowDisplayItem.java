package com.robinhood.android.history.p153ui.transfer;

import com.robinhood.compose.bento.component.rows.Timeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RfpTimelineInstantTransferDetailComponent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/history/ui/transfer/RfpTimelineRowDisplayItem;", "", "status", "Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "position", "Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", "title", "", "metadata", "colorOverrides", "Lcom/robinhood/compose/bento/component/rows/Timeline$ColorOverrides;", "<init>", "(Lcom/robinhood/compose/bento/component/rows/Timeline$Status;Lcom/robinhood/compose/bento/component/rows/Timeline$Position;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/Timeline$ColorOverrides;)V", "getStatus", "()Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "getPosition", "()Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", "getTitle", "()Ljava/lang/String;", "getMetadata", "getColorOverrides", "()Lcom/robinhood/compose/bento/component/rows/Timeline$ColorOverrides;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RfpTimelineRowDisplayItem {
    public static final int $stable = Timeline.ColorOverrides.$stable;
    private final Timeline.ColorOverrides colorOverrides;
    private final String metadata;
    private final Timeline.Position position;
    private final Timeline.Status status;
    private final String title;

    public static /* synthetic */ RfpTimelineRowDisplayItem copy$default(RfpTimelineRowDisplayItem rfpTimelineRowDisplayItem, Timeline.Status status, Timeline.Position position, String str, String str2, Timeline.ColorOverrides colorOverrides, int i, Object obj) {
        if ((i & 1) != 0) {
            status = rfpTimelineRowDisplayItem.status;
        }
        if ((i & 2) != 0) {
            position = rfpTimelineRowDisplayItem.position;
        }
        if ((i & 4) != 0) {
            str = rfpTimelineRowDisplayItem.title;
        }
        if ((i & 8) != 0) {
            str2 = rfpTimelineRowDisplayItem.metadata;
        }
        if ((i & 16) != 0) {
            colorOverrides = rfpTimelineRowDisplayItem.colorOverrides;
        }
        Timeline.ColorOverrides colorOverrides2 = colorOverrides;
        String str3 = str;
        return rfpTimelineRowDisplayItem.copy(status, position, str3, str2, colorOverrides2);
    }

    /* renamed from: component1, reason: from getter */
    public final Timeline.Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final Timeline.Position getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    /* renamed from: component5, reason: from getter */
    public final Timeline.ColorOverrides getColorOverrides() {
        return this.colorOverrides;
    }

    public final RfpTimelineRowDisplayItem copy(Timeline.Status status, Timeline.Position position, String title, String metadata, Timeline.ColorOverrides colorOverrides) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(colorOverrides, "colorOverrides");
        return new RfpTimelineRowDisplayItem(status, position, title, metadata, colorOverrides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RfpTimelineRowDisplayItem)) {
            return false;
        }
        RfpTimelineRowDisplayItem rfpTimelineRowDisplayItem = (RfpTimelineRowDisplayItem) other;
        return this.status == rfpTimelineRowDisplayItem.status && this.position == rfpTimelineRowDisplayItem.position && Intrinsics.areEqual(this.title, rfpTimelineRowDisplayItem.title) && Intrinsics.areEqual(this.metadata, rfpTimelineRowDisplayItem.metadata) && Intrinsics.areEqual(this.colorOverrides, rfpTimelineRowDisplayItem.colorOverrides);
    }

    public int hashCode() {
        return (((((((this.status.hashCode() * 31) + this.position.hashCode()) * 31) + this.title.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.colorOverrides.hashCode();
    }

    public String toString() {
        return "RfpTimelineRowDisplayItem(status=" + this.status + ", position=" + this.position + ", title=" + this.title + ", metadata=" + this.metadata + ", colorOverrides=" + this.colorOverrides + ")";
    }

    public RfpTimelineRowDisplayItem(Timeline.Status status, Timeline.Position position, String title, String metadata, Timeline.ColorOverrides colorOverrides) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(colorOverrides, "colorOverrides");
        this.status = status;
        this.position = position;
        this.title = title;
        this.metadata = metadata;
        this.colorOverrides = colorOverrides;
    }

    public final Timeline.Status getStatus() {
        return this.status;
    }

    public final Timeline.Position getPosition() {
        return this.position;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final Timeline.ColorOverrides getColorOverrides() {
        return this.colorOverrides;
    }
}
