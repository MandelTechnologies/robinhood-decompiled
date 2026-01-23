package com.robinhood.shared.support.supportchat;

import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: ChatListItem.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001aJ\u008a\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010#J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b\u0005\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b8\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010!R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b?\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010&R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\bB\u0010\u001aR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\bC\u0010\u001aR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\bD\u0010\u001aR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u00105\u001a\u0004\bF\u0010\u001a¨\u0006G"}, m3636d2 = {"Lcom/robinhood/shared/support/supportchat/ChatListItem;", "", "Ljava/util/UUID;", "id", "", "isActive", "j$/time/Instant", "created", "updated", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "chatMode", "Lcom/robinhood/utils/resource/StringResource;", "chatTitle", "", "chatAvatarColor", "chatPreview", "", "unreadMessageCount", "displayAsInboxRow", "hasImpression", "canLogImpression", "<init>", "(Ljava/util/UUID;ZLj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;JZZZ)V", "component1", "()Ljava/util/UUID;", "component2", "()Z", "component3", "()Lj$/time/Instant;", "component4", "component5", "()Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "component6", "()Lcom/robinhood/utils/resource/StringResource;", "component7", "()Ljava/lang/String;", "component8", "component9", "()J", "component10", "component11", "component12", "copy", "(Ljava/util/UUID;ZLj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;JZZZ)Lcom/robinhood/shared/support/supportchat/ChatListItem;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "Z", "Lj$/time/Instant;", "getCreated", "getUpdated", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "getChatMode", "Lcom/robinhood/utils/resource/StringResource;", "getChatTitle", "Ljava/lang/String;", "getChatAvatarColor", "getChatPreview", "J", "getUnreadMessageCount", "getDisplayAsInboxRow", "getHasImpression", "getCanLogImpression", "hasUnreadMessage", "getHasUnreadMessage", "lib-support-chat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ChatListItem {
    public static final int $stable = 8;
    private final boolean canLogImpression;
    private final String chatAvatarColor;
    private final ChatMode chatMode;
    private final StringResource chatPreview;
    private final StringResource chatTitle;
    private final Instant created;
    private final boolean displayAsInboxRow;
    private final boolean hasImpression;
    private final boolean hasUnreadMessage;
    private final UUID id;
    private final boolean isActive;
    private final long unreadMessageCount;
    private final Instant updated;

    public static /* synthetic */ ChatListItem copy$default(ChatListItem chatListItem, UUID uuid, boolean z, Instant instant, Instant instant2, ChatMode chatMode, StringResource stringResource, String str, StringResource stringResource2, long j, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = chatListItem.id;
        }
        return chatListItem.copy(uuid, (i & 2) != 0 ? chatListItem.isActive : z, (i & 4) != 0 ? chatListItem.created : instant, (i & 8) != 0 ? chatListItem.updated : instant2, (i & 16) != 0 ? chatListItem.chatMode : chatMode, (i & 32) != 0 ? chatListItem.chatTitle : stringResource, (i & 64) != 0 ? chatListItem.chatAvatarColor : str, (i & 128) != 0 ? chatListItem.chatPreview : stringResource2, (i & 256) != 0 ? chatListItem.unreadMessageCount : j, (i & 512) != 0 ? chatListItem.displayAsInboxRow : z2, (i & 1024) != 0 ? chatListItem.hasImpression : z3, (i & 2048) != 0 ? chatListItem.canLogImpression : z4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getDisplayAsInboxRow() {
        return this.displayAsInboxRow;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHasImpression() {
        return this.hasImpression;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getCanLogImpression() {
        return this.canLogImpression;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: component3, reason: from getter */
    public final Instant getCreated() {
        return this.created;
    }

    /* renamed from: component4, reason: from getter */
    public final Instant getUpdated() {
        return this.updated;
    }

    /* renamed from: component5, reason: from getter */
    public final ChatMode getChatMode() {
        return this.chatMode;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getChatTitle() {
        return this.chatTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getChatAvatarColor() {
        return this.chatAvatarColor;
    }

    /* renamed from: component8, reason: from getter */
    public final StringResource getChatPreview() {
        return this.chatPreview;
    }

    /* renamed from: component9, reason: from getter */
    public final long getUnreadMessageCount() {
        return this.unreadMessageCount;
    }

    public final ChatListItem copy(UUID id, boolean isActive, Instant created, Instant updated, ChatMode chatMode, StringResource chatTitle, String chatAvatarColor, StringResource chatPreview, long unreadMessageCount, boolean displayAsInboxRow, boolean hasImpression, boolean canLogImpression) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(created, "created");
        Intrinsics.checkNotNullParameter(updated, "updated");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(chatTitle, "chatTitle");
        Intrinsics.checkNotNullParameter(chatAvatarColor, "chatAvatarColor");
        return new ChatListItem(id, isActive, created, updated, chatMode, chatTitle, chatAvatarColor, chatPreview, unreadMessageCount, displayAsInboxRow, hasImpression, canLogImpression);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatListItem)) {
            return false;
        }
        ChatListItem chatListItem = (ChatListItem) other;
        return Intrinsics.areEqual(this.id, chatListItem.id) && this.isActive == chatListItem.isActive && Intrinsics.areEqual(this.created, chatListItem.created) && Intrinsics.areEqual(this.updated, chatListItem.updated) && Intrinsics.areEqual(this.chatMode, chatListItem.chatMode) && Intrinsics.areEqual(this.chatTitle, chatListItem.chatTitle) && Intrinsics.areEqual(this.chatAvatarColor, chatListItem.chatAvatarColor) && Intrinsics.areEqual(this.chatPreview, chatListItem.chatPreview) && this.unreadMessageCount == chatListItem.unreadMessageCount && this.displayAsInboxRow == chatListItem.displayAsInboxRow && this.hasImpression == chatListItem.hasImpression && this.canLogImpression == chatListItem.canLogImpression;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.id.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + this.created.hashCode()) * 31) + this.updated.hashCode()) * 31) + this.chatMode.hashCode()) * 31) + this.chatTitle.hashCode()) * 31) + this.chatAvatarColor.hashCode()) * 31;
        StringResource stringResource = this.chatPreview;
        return ((((((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Long.hashCode(this.unreadMessageCount)) * 31) + Boolean.hashCode(this.displayAsInboxRow)) * 31) + Boolean.hashCode(this.hasImpression)) * 31) + Boolean.hashCode(this.canLogImpression);
    }

    public String toString() {
        return "ChatListItem(id=" + this.id + ", isActive=" + this.isActive + ", created=" + this.created + ", updated=" + this.updated + ", chatMode=" + this.chatMode + ", chatTitle=" + this.chatTitle + ", chatAvatarColor=" + this.chatAvatarColor + ", chatPreview=" + this.chatPreview + ", unreadMessageCount=" + this.unreadMessageCount + ", displayAsInboxRow=" + this.displayAsInboxRow + ", hasImpression=" + this.hasImpression + ", canLogImpression=" + this.canLogImpression + ")";
    }

    public ChatListItem(UUID id, boolean z, Instant created, Instant updated, ChatMode chatMode, StringResource chatTitle, String chatAvatarColor, StringResource stringResource, long j, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(created, "created");
        Intrinsics.checkNotNullParameter(updated, "updated");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(chatTitle, "chatTitle");
        Intrinsics.checkNotNullParameter(chatAvatarColor, "chatAvatarColor");
        this.id = id;
        this.isActive = z;
        this.created = created;
        this.updated = updated;
        this.chatMode = chatMode;
        this.chatTitle = chatTitle;
        this.chatAvatarColor = chatAvatarColor;
        this.chatPreview = stringResource;
        this.unreadMessageCount = j;
        this.displayAsInboxRow = z2;
        this.hasImpression = z3;
        this.canLogImpression = z4;
        this.hasUnreadMessage = j > 0;
    }

    public final UUID getId() {
        return this.id;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final Instant getCreated() {
        return this.created;
    }

    public final Instant getUpdated() {
        return this.updated;
    }

    public final ChatMode getChatMode() {
        return this.chatMode;
    }

    public final StringResource getChatTitle() {
        return this.chatTitle;
    }

    public final String getChatAvatarColor() {
        return this.chatAvatarColor;
    }

    public final StringResource getChatPreview() {
        return this.chatPreview;
    }

    public final long getUnreadMessageCount() {
        return this.unreadMessageCount;
    }

    public final boolean getDisplayAsInboxRow() {
        return this.displayAsInboxRow;
    }

    public final boolean getHasImpression() {
        return this.hasImpression;
    }

    public final boolean getCanLogImpression() {
        return this.canLogImpression;
    }

    public final boolean getHasUnreadMessage() {
        return this.hasUnreadMessage;
    }
}
