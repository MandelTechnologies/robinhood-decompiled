package com.salesforce.android.smi.remote.internal.dto.response;

import com.squareup.moshi.JsonClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationEntryEventResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/response/ConversationEntryEventResponse;", "", "channelPlatformKey", "", "conversationId", "Ljava/util/UUID;", "channelType", "conversationEntry", "Lcom/salesforce/android/smi/remote/internal/dto/response/ConversationEntrySerializedPayloadResponse;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/salesforce/android/smi/remote/internal/dto/response/ConversationEntrySerializedPayloadResponse;)V", "getChannelPlatformKey", "()Ljava/lang/String;", "getConversationId", "()Ljava/util/UUID;", "getChannelType", "getConversationEntry", "()Lcom/salesforce/android/smi/remote/internal/dto/response/ConversationEntrySerializedPayloadResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConversationEntryEventResponse {
    private final String channelPlatformKey;
    private final String channelType;
    private final ConversationEntrySerializedPayloadResponse conversationEntry;
    private final UUID conversationId;

    public static /* synthetic */ ConversationEntryEventResponse copy$default(ConversationEntryEventResponse conversationEntryEventResponse, String str, UUID uuid, String str2, ConversationEntrySerializedPayloadResponse conversationEntrySerializedPayloadResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationEntryEventResponse.channelPlatformKey;
        }
        if ((i & 2) != 0) {
            uuid = conversationEntryEventResponse.conversationId;
        }
        if ((i & 4) != 0) {
            str2 = conversationEntryEventResponse.channelType;
        }
        if ((i & 8) != 0) {
            conversationEntrySerializedPayloadResponse = conversationEntryEventResponse.conversationEntry;
        }
        return conversationEntryEventResponse.copy(str, uuid, str2, conversationEntrySerializedPayloadResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannelPlatformKey() {
        return this.channelPlatformKey;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* renamed from: component4, reason: from getter */
    public final ConversationEntrySerializedPayloadResponse getConversationEntry() {
        return this.conversationEntry;
    }

    public final ConversationEntryEventResponse copy(String channelPlatformKey, UUID conversationId, String channelType, ConversationEntrySerializedPayloadResponse conversationEntry) {
        Intrinsics.checkNotNullParameter(channelPlatformKey, "channelPlatformKey");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(channelType, "channelType");
        Intrinsics.checkNotNullParameter(conversationEntry, "conversationEntry");
        return new ConversationEntryEventResponse(channelPlatformKey, conversationId, channelType, conversationEntry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationEntryEventResponse)) {
            return false;
        }
        ConversationEntryEventResponse conversationEntryEventResponse = (ConversationEntryEventResponse) other;
        return Intrinsics.areEqual(this.channelPlatformKey, conversationEntryEventResponse.channelPlatformKey) && Intrinsics.areEqual(this.conversationId, conversationEntryEventResponse.conversationId) && Intrinsics.areEqual(this.channelType, conversationEntryEventResponse.channelType) && Intrinsics.areEqual(this.conversationEntry, conversationEntryEventResponse.conversationEntry);
    }

    public int hashCode() {
        return (((((this.channelPlatformKey.hashCode() * 31) + this.conversationId.hashCode()) * 31) + this.channelType.hashCode()) * 31) + this.conversationEntry.hashCode();
    }

    public String toString() {
        return "ConversationEntryEventResponse(channelPlatformKey=" + this.channelPlatformKey + ", conversationId=" + this.conversationId + ", channelType=" + this.channelType + ", conversationEntry=" + this.conversationEntry + ")";
    }

    public ConversationEntryEventResponse(String channelPlatformKey, UUID conversationId, String channelType, ConversationEntrySerializedPayloadResponse conversationEntry) {
        Intrinsics.checkNotNullParameter(channelPlatformKey, "channelPlatformKey");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(channelType, "channelType");
        Intrinsics.checkNotNullParameter(conversationEntry, "conversationEntry");
        this.channelPlatformKey = channelPlatformKey;
        this.conversationId = conversationId;
        this.channelType = channelType;
        this.conversationEntry = conversationEntry;
    }

    public final String getChannelPlatformKey() {
        return this.channelPlatformKey;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final ConversationEntrySerializedPayloadResponse getConversationEntry() {
        return this.conversationEntry;
    }
}
