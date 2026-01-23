package com.robinhood.android.inbox.p156ui.messages;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import p479j$.time.Instant;

/* compiled from: ThreadListViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJx\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b/\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b\u000b\u0010\u001bR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b\f\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b\u000f\u0010\u001bR\u0011\u00104\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u0010\u0013¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/MessageThread;", "", "", "id", "displayName", "avatarText", "Lokhttp3/HttpUrl;", "avatarUrl", "avatarColor", "mostRecentMessage", "", "isCritical", "isUnread", "j$/time/Instant", "updatedAt", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;ZZLj$/time/Instant;Z)V", "component5", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Lokhttp3/HttpUrl;", "component6", "component7", "()Z", "component8", "component9", "()Lj$/time/Instant;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;ZZLj$/time/Instant;Z)Lcom/robinhood/android/inbox/ui/messages/MessageThread;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getDisplayName", "getAvatarText", "Lokhttp3/HttpUrl;", "getAvatarUrl", "getMostRecentMessage", "Z", "Lj$/time/Instant;", "getUpdatedAt", "getMobiusAvatarColor", "mobiusAvatarColor", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MessageThread {
    private final String avatarColor;
    private final String avatarText;
    private final HttpUrl avatarUrl;
    private final String displayName;
    private final String id;
    private final boolean isCritical;
    private final boolean isSelected;
    private final boolean isUnread;
    private final String mostRecentMessage;
    private final Instant updatedAt;

    /* renamed from: component5, reason: from getter */
    private final String getAvatarColor() {
        return this.avatarColor;
    }

    public static /* synthetic */ MessageThread copy$default(MessageThread messageThread, String str, String str2, String str3, HttpUrl httpUrl, String str4, String str5, boolean z, boolean z2, Instant instant, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageThread.id;
        }
        if ((i & 2) != 0) {
            str2 = messageThread.displayName;
        }
        if ((i & 4) != 0) {
            str3 = messageThread.avatarText;
        }
        if ((i & 8) != 0) {
            httpUrl = messageThread.avatarUrl;
        }
        if ((i & 16) != 0) {
            str4 = messageThread.avatarColor;
        }
        if ((i & 32) != 0) {
            str5 = messageThread.mostRecentMessage;
        }
        if ((i & 64) != 0) {
            z = messageThread.isCritical;
        }
        if ((i & 128) != 0) {
            z2 = messageThread.isUnread;
        }
        if ((i & 256) != 0) {
            instant = messageThread.updatedAt;
        }
        if ((i & 512) != 0) {
            z3 = messageThread.isSelected;
        }
        Instant instant2 = instant;
        boolean z4 = z3;
        boolean z5 = z;
        boolean z6 = z2;
        String str6 = str4;
        String str7 = str5;
        return messageThread.copy(str, str2, str3, httpUrl, str6, str7, z5, z6, instant2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarText() {
        return this.avatarText;
    }

    /* renamed from: component4, reason: from getter */
    public final HttpUrl getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMostRecentMessage() {
        return this.mostRecentMessage;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCritical() {
        return this.isCritical;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsUnread() {
        return this.isUnread;
    }

    /* renamed from: component9, reason: from getter */
    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public final MessageThread copy(String id, String displayName, String avatarText, HttpUrl avatarUrl, String avatarColor, String mostRecentMessage, boolean isCritical, boolean isUnread, Instant updatedAt, boolean isSelected) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(avatarText, "avatarText");
        Intrinsics.checkNotNullParameter(avatarColor, "avatarColor");
        Intrinsics.checkNotNullParameter(mostRecentMessage, "mostRecentMessage");
        return new MessageThread(id, displayName, avatarText, avatarUrl, avatarColor, mostRecentMessage, isCritical, isUnread, updatedAt, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageThread)) {
            return false;
        }
        MessageThread messageThread = (MessageThread) other;
        return Intrinsics.areEqual(this.id, messageThread.id) && Intrinsics.areEqual(this.displayName, messageThread.displayName) && Intrinsics.areEqual(this.avatarText, messageThread.avatarText) && Intrinsics.areEqual(this.avatarUrl, messageThread.avatarUrl) && Intrinsics.areEqual(this.avatarColor, messageThread.avatarColor) && Intrinsics.areEqual(this.mostRecentMessage, messageThread.mostRecentMessage) && this.isCritical == messageThread.isCritical && this.isUnread == messageThread.isUnread && Intrinsics.areEqual(this.updatedAt, messageThread.updatedAt) && this.isSelected == messageThread.isSelected;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.avatarText.hashCode()) * 31;
        HttpUrl httpUrl = this.avatarUrl;
        int iHashCode2 = (((((((((iHashCode + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31) + this.avatarColor.hashCode()) * 31) + this.mostRecentMessage.hashCode()) * 31) + Boolean.hashCode(this.isCritical)) * 31) + Boolean.hashCode(this.isUnread)) * 31;
        Instant instant = this.updatedAt;
        return ((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "MessageThread(id=" + this.id + ", displayName=" + this.displayName + ", avatarText=" + this.avatarText + ", avatarUrl=" + this.avatarUrl + ", avatarColor=" + this.avatarColor + ", mostRecentMessage=" + this.mostRecentMessage + ", isCritical=" + this.isCritical + ", isUnread=" + this.isUnread + ", updatedAt=" + this.updatedAt + ", isSelected=" + this.isSelected + ")";
    }

    public MessageThread(String id, String displayName, String avatarText, HttpUrl httpUrl, String avatarColor, String mostRecentMessage, boolean z, boolean z2, Instant instant, boolean z3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(avatarText, "avatarText");
        Intrinsics.checkNotNullParameter(avatarColor, "avatarColor");
        Intrinsics.checkNotNullParameter(mostRecentMessage, "mostRecentMessage");
        this.id = id;
        this.displayName = displayName;
        this.avatarText = avatarText;
        this.avatarUrl = httpUrl;
        this.avatarColor = avatarColor;
        this.mostRecentMessage = mostRecentMessage;
        this.isCritical = z;
        this.isUnread = z2;
        this.updatedAt = instant;
        this.isSelected = z3;
    }

    public final String getId() {
        return this.id;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getAvatarText() {
        return this.avatarText;
    }

    public final HttpUrl getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getMostRecentMessage() {
        return this.mostRecentMessage;
    }

    public final boolean isCritical() {
        return this.isCritical;
    }

    public final boolean isUnread() {
        return this.isUnread;
    }

    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final String getMobiusAvatarColor() {
        return Intrinsics.areEqual(this.avatarColor, "#21CE99") ? "#00C805" : this.avatarColor;
    }
}
