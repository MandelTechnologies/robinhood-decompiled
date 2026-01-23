package com.plaid.link.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C5987V3;
import com.robinhood.models.api.ErrorResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, m3636d2 = {"Lcom/plaid/link/event/LinkEvent;", "Landroid/os/Parcelable;", "eventName", "Lcom/plaid/link/event/LinkEventName;", "metadata", "Lcom/plaid/link/event/LinkEventMetadata;", "(Lcom/plaid/link/event/LinkEventName;Lcom/plaid/link/event/LinkEventMetadata;)V", "getEventName", "()Lcom/plaid/link/event/LinkEventName;", "getMetadata", "()Lcom/plaid/link/event/LinkEventMetadata;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class LinkEvent implements Parcelable {
    private final LinkEventName eventName;
    private final LinkEventMetadata metadata;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkEvent> CREATOR = new Creator();

    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0000¢\u0006\u0002\b\bJ\b\u0010\t\u001a\u00020\u0007H\u0002¨\u0006\n"}, m3636d2 = {"Lcom/plaid/link/event/LinkEvent$Companion;", "", "()V", "fromMap", "Lcom/plaid/link/event/LinkEvent;", "linkData", "", "", "fromMap$link_sdk_release", "getTimestamp", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getTimestamp() {
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ENGLISH).format(new Date());
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        public final LinkEvent fromMap$link_sdk_release(Map<String, String> linkData) {
            Intrinsics.checkNotNullParameter(linkData, "linkData");
            return new LinkEvent(LinkEventName.INSTANCE.fromString$link_sdk_release(C5987V3.m1330a(linkData, "event_name", "")), new LinkEventMetadata(null, C5987V3.m1330a(linkData, ErrorResponse.ERROR_CODE, ""), C5987V3.m1330a(linkData, "error_message", ""), C5987V3.m1330a(linkData, "error_type", ""), C5987V3.m1330a(linkData, "exit_status", ""), C5987V3.m1330a(linkData, "institution_id", ""), C5987V3.m1330a(linkData, "institution_name", ""), C5987V3.m1330a(linkData, "institution_search_query", ""), C5987V3.m1330a(linkData, "issue_description", ""), C5987V3.m1330a(linkData, "issue_detected_at", ""), C5987V3.m1330a(linkData, "issue_id", ""), C5987V3.m1330a(linkData, "link_session_id", ""), C5987V3.m1330a(linkData, "mfa_type", ""), C5987V3.m1330a(linkData, "request_id", ""), null, C5987V3.m1330a(linkData, "timestamp", getTimestamp()), LinkEventViewName.INSTANCE.fromString$link_sdk_release(C5987V3.m1330a(linkData, "view_name", "")), C5987V3.m1330a(linkData, "metadata_json", ""), null, linkData.containsKey("is_update_mode") ? linkData.get("is_update_mode") : null, linkData.containsKey("match_reason") ? linkData.get("match_reason") : null, linkData.containsKey("account_number_mask") ? linkData.get("account_number_mask") : null, 278529, null));
        }

        private Companion() {
        }
    }

    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEvent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkEvent((LinkEventName) parcel.readParcelable(LinkEvent.class.getClassLoader()), LinkEventMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEvent[] newArray(int i) {
            return new LinkEvent[i];
        }
    }

    public LinkEvent(LinkEventName eventName, LinkEventMetadata metadata) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.eventName = eventName;
        this.metadata = metadata;
    }

    public static /* synthetic */ LinkEvent copy$default(LinkEvent linkEvent, LinkEventName linkEventName, LinkEventMetadata linkEventMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            linkEventName = linkEvent.eventName;
        }
        if ((i & 2) != 0) {
            linkEventMetadata = linkEvent.metadata;
        }
        return linkEvent.copy(linkEventName, linkEventMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final LinkEventName getEventName() {
        return this.eventName;
    }

    /* renamed from: component2, reason: from getter */
    public final LinkEventMetadata getMetadata() {
        return this.metadata;
    }

    public final LinkEvent copy(LinkEventName eventName, LinkEventMetadata metadata) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkEvent(eventName, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkEvent)) {
            return false;
        }
        LinkEvent linkEvent = (LinkEvent) other;
        return Intrinsics.areEqual(this.eventName, linkEvent.eventName) && Intrinsics.areEqual(this.metadata, linkEvent.metadata);
    }

    public final LinkEventName getEventName() {
        return this.eventName;
    }

    public final LinkEventMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.eventName.hashCode() * 31);
    }

    public String toString() {
        return "LinkEvent(eventName=" + this.eventName + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.eventName, flags);
        this.metadata.writeToParcel(parcel, flags);
    }
}
