package com.twilio.conversations.media;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: MediaTransport.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/twilio/conversations/media/MediaSetItem;", "", "mediaResponse", "Lcom/twilio/conversations/media/MediaResponse;", "<init>", "(Lcom/twilio/conversations/media/MediaResponse;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/twilio/conversations/media/MediaResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMediaResponse$annotations", "()V", "getMediaResponse", "()Lcom/twilio/conversations/media/MediaResponse;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$convo_android_release", "$serializer", "Companion", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
final /* data */ class MediaSetItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final MediaResponse mediaResponse;

    public static /* synthetic */ MediaSetItem copy$default(MediaSetItem mediaSetItem, MediaResponse mediaResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaResponse = mediaSetItem.mediaResponse;
        }
        return mediaSetItem.copy(mediaResponse);
    }

    @SerialName("media_record")
    public static /* synthetic */ void getMediaResponse$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final MediaResponse getMediaResponse() {
        return this.mediaResponse;
    }

    public final MediaSetItem copy(MediaResponse mediaResponse) {
        Intrinsics.checkNotNullParameter(mediaResponse, "mediaResponse");
        return new MediaSetItem(mediaResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MediaSetItem) && Intrinsics.areEqual(this.mediaResponse, ((MediaSetItem) other).mediaResponse);
    }

    public int hashCode() {
        return this.mediaResponse.hashCode();
    }

    public String toString() {
        return "MediaSetItem(mediaResponse=" + this.mediaResponse + ')';
    }

    /* compiled from: MediaTransport.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/twilio/conversations/media/MediaSetItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/conversations/media/MediaSetItem;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MediaSetItem> serializer() {
            return MediaSetItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MediaSetItem(int i, MediaResponse mediaResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, MediaSetItem$$serializer.INSTANCE.getDescriptor());
        }
        this.mediaResponse = mediaResponse;
    }

    public MediaSetItem(MediaResponse mediaResponse) {
        Intrinsics.checkNotNullParameter(mediaResponse, "mediaResponse");
        this.mediaResponse = mediaResponse;
    }

    public final MediaResponse getMediaResponse() {
        return this.mediaResponse;
    }
}
