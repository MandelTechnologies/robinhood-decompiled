package com.salesforce.android.smi.remote.internal.dto.request;

import com.squareup.moshi.JsonClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileEntryRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001cJv\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u000b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006/"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/FileEntryRequest;", "", "id", "", "fileId", "channelAddressIdentifier", "message", "inReplyToMessageId", "routingAttributes", "", "language", "isNewMessagingSession", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getFileId", "getChannelAddressIdentifier", "getMessage", "getInReplyToMessageId", "getRoutingAttributes", "()Ljava/util/Map;", "setRoutingAttributes", "(Ljava/util/Map;)V", "getLanguage", "setLanguage", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setNewMessagingSession", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/salesforce/android/smi/remote/internal/dto/request/FileEntryRequest;", "equals", "other", "hashCode", "", "toString", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FileEntryRequest {
    private final String channelAddressIdentifier;
    private final String fileId;
    private final String id;
    private final String inReplyToMessageId;
    private Boolean isNewMessagingSession;
    private String language;
    private final String message;
    private Map<String, ? extends Object> routingAttributes;

    public static /* synthetic */ FileEntryRequest copy$default(FileEntryRequest fileEntryRequest, String str, String str2, String str3, String str4, String str5, Map map, String str6, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileEntryRequest.id;
        }
        if ((i & 2) != 0) {
            str2 = fileEntryRequest.fileId;
        }
        if ((i & 4) != 0) {
            str3 = fileEntryRequest.channelAddressIdentifier;
        }
        if ((i & 8) != 0) {
            str4 = fileEntryRequest.message;
        }
        if ((i & 16) != 0) {
            str5 = fileEntryRequest.inReplyToMessageId;
        }
        if ((i & 32) != 0) {
            map = fileEntryRequest.routingAttributes;
        }
        if ((i & 64) != 0) {
            str6 = fileEntryRequest.language;
        }
        if ((i & 128) != 0) {
            bool = fileEntryRequest.isNewMessagingSession;
        }
        String str7 = str6;
        Boolean bool2 = bool;
        String str8 = str5;
        Map map2 = map;
        return fileEntryRequest.copy(str, str2, str3, str4, str8, map2, str7, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChannelAddressIdentifier() {
        return this.channelAddressIdentifier;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInReplyToMessageId() {
        return this.inReplyToMessageId;
    }

    public final Map<String, Object> component6() {
        return this.routingAttributes;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsNewMessagingSession() {
        return this.isNewMessagingSession;
    }

    public final FileEntryRequest copy(String id, String fileId, String channelAddressIdentifier, String message, String inReplyToMessageId, Map<String, ? extends Object> routingAttributes, String language, Boolean isNewMessagingSession) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        return new FileEntryRequest(id, fileId, channelAddressIdentifier, message, inReplyToMessageId, routingAttributes, language, isNewMessagingSession);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileEntryRequest)) {
            return false;
        }
        FileEntryRequest fileEntryRequest = (FileEntryRequest) other;
        return Intrinsics.areEqual(this.id, fileEntryRequest.id) && Intrinsics.areEqual(this.fileId, fileEntryRequest.fileId) && Intrinsics.areEqual(this.channelAddressIdentifier, fileEntryRequest.channelAddressIdentifier) && Intrinsics.areEqual(this.message, fileEntryRequest.message) && Intrinsics.areEqual(this.inReplyToMessageId, fileEntryRequest.inReplyToMessageId) && Intrinsics.areEqual(this.routingAttributes, fileEntryRequest.routingAttributes) && Intrinsics.areEqual(this.language, fileEntryRequest.language) && Intrinsics.areEqual(this.isNewMessagingSession, fileEntryRequest.isNewMessagingSession);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.fileId.hashCode()) * 31;
        String str = this.channelAddressIdentifier;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inReplyToMessageId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, ? extends Object> map = this.routingAttributes;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.language;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isNewMessagingSession;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "FileEntryRequest(id=" + this.id + ", fileId=" + this.fileId + ", channelAddressIdentifier=" + this.channelAddressIdentifier + ", message=" + this.message + ", inReplyToMessageId=" + this.inReplyToMessageId + ", routingAttributes=" + this.routingAttributes + ", language=" + this.language + ", isNewMessagingSession=" + this.isNewMessagingSession + ")";
    }

    public FileEntryRequest(String id, String fileId, String str, String str2, String str3, Map<String, ? extends Object> map, String str4, Boolean bool) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        this.id = id;
        this.fileId = fileId;
        this.channelAddressIdentifier = str;
        this.message = str2;
        this.inReplyToMessageId = str3;
        this.routingAttributes = map;
        this.language = str4;
        this.isNewMessagingSession = bool;
    }

    public final String getId() {
        return this.id;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getChannelAddressIdentifier() {
        return this.channelAddressIdentifier;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getInReplyToMessageId() {
        return this.inReplyToMessageId;
    }

    public final Map<String, Object> getRoutingAttributes() {
        return this.routingAttributes;
    }

    public final void setRoutingAttributes(Map<String, ? extends Object> map) {
        this.routingAttributes = map;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public /* synthetic */ FileEntryRequest(String str, String str2, String str3, String str4, String str5, Map map, String str6, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? Boolean.FALSE : bool);
    }

    public final Boolean isNewMessagingSession() {
        return this.isNewMessagingSession;
    }

    public final void setNewMessagingSession(Boolean bool) {
        this.isNewMessagingSession = bool;
    }
}
