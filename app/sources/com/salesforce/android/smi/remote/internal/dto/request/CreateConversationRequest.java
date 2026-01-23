package com.salesforce.android.smi.remote.internal.dto.request;

import com.squareup.moshi.JsonClass;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateConversationRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/CreateConversationRequest;", "", "conversationId", "Ljava/util/UUID;", "channelAddressIdentifier", "", "routingAttributes", "", "language", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getConversationId", "()Ljava/util/UUID;", "getChannelAddressIdentifier", "()Ljava/lang/String;", "getRoutingAttributes", "()Ljava/util/Map;", "getLanguage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreateConversationRequest {
    private final String channelAddressIdentifier;
    private final UUID conversationId;
    private final String language;
    private final Map<String, Object> routingAttributes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateConversationRequest copy$default(CreateConversationRequest createConversationRequest, UUID uuid, String str, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = createConversationRequest.conversationId;
        }
        if ((i & 2) != 0) {
            str = createConversationRequest.channelAddressIdentifier;
        }
        if ((i & 4) != 0) {
            map = createConversationRequest.routingAttributes;
        }
        if ((i & 8) != 0) {
            str2 = createConversationRequest.language;
        }
        return createConversationRequest.copy(uuid, str, map, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChannelAddressIdentifier() {
        return this.channelAddressIdentifier;
    }

    public final Map<String, Object> component3() {
        return this.routingAttributes;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final CreateConversationRequest copy(UUID conversationId, String channelAddressIdentifier, Map<String, ? extends Object> routingAttributes, String language) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        return new CreateConversationRequest(conversationId, channelAddressIdentifier, routingAttributes, language);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateConversationRequest)) {
            return false;
        }
        CreateConversationRequest createConversationRequest = (CreateConversationRequest) other;
        return Intrinsics.areEqual(this.conversationId, createConversationRequest.conversationId) && Intrinsics.areEqual(this.channelAddressIdentifier, createConversationRequest.channelAddressIdentifier) && Intrinsics.areEqual(this.routingAttributes, createConversationRequest.routingAttributes) && Intrinsics.areEqual(this.language, createConversationRequest.language);
    }

    public int hashCode() {
        int iHashCode = this.conversationId.hashCode() * 31;
        String str = this.channelAddressIdentifier;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.routingAttributes;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.language;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CreateConversationRequest(conversationId=" + this.conversationId + ", channelAddressIdentifier=" + this.channelAddressIdentifier + ", routingAttributes=" + this.routingAttributes + ", language=" + this.language + ")";
    }

    public CreateConversationRequest(UUID conversationId, String str, Map<String, ? extends Object> map, String str2) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.conversationId = conversationId;
        this.channelAddressIdentifier = str;
        this.routingAttributes = map;
        this.language = str2;
    }

    public /* synthetic */ CreateConversationRequest(UUID uuid, String str, Map map, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : str2);
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final String getChannelAddressIdentifier() {
        return this.channelAddressIdentifier;
    }

    public final Map<String, Object> getRoutingAttributes() {
        return this.routingAttributes;
    }

    public final String getLanguage() {
        return this.language;
    }
}
