package com.twilio.conversations.media;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: MediaTransport.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/twilio/conversations/media/MediaResponse;", "", "sid", "", "links", "Lcom/twilio/conversations/media/Links;", "<init>", "(Ljava/lang/String;Lcom/twilio/conversations/media/Links;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/twilio/conversations/media/Links;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSid", "()Ljava/lang/String;", "getLinks", "()Lcom/twilio/conversations/media/Links;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$convo_android_release", "$serializer", "Companion", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
final /* data */ class MediaResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Links links;
    private final String sid;

    public static /* synthetic */ MediaResponse copy$default(MediaResponse mediaResponse, String str, Links links, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaResponse.sid;
        }
        if ((i & 2) != 0) {
            links = mediaResponse.links;
        }
        return mediaResponse.copy(str, links);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* renamed from: component2, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    public final MediaResponse copy(String sid, Links links) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(links, "links");
        return new MediaResponse(sid, links);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaResponse)) {
            return false;
        }
        MediaResponse mediaResponse = (MediaResponse) other;
        return Intrinsics.areEqual(this.sid, mediaResponse.sid) && Intrinsics.areEqual(this.links, mediaResponse.links);
    }

    public int hashCode() {
        return (this.sid.hashCode() * 31) + this.links.hashCode();
    }

    public String toString() {
        return "MediaResponse(sid=" + this.sid + ", links=" + this.links + ')';
    }

    /* compiled from: MediaTransport.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/twilio/conversations/media/MediaResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/conversations/media/MediaResponse;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MediaResponse> serializer() {
            return MediaResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MediaResponse(int i, String str, Links links, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, MediaResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.sid = str;
        this.links = links;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$convo_android_release(MediaResponse self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.sid);
        output.encodeSerializableElement(serialDesc, 1, Links$$serializer.INSTANCE, self.links);
    }

    public MediaResponse(String sid, Links links) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(links, "links");
        this.sid = sid;
        this.links = links;
    }

    public final String getSid() {
        return this.sid;
    }

    public final Links getLinks() {
        return this.links;
    }
}
