package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.MediaMessageTypeDto;
import com.robinhood.chatbot.proto.p285v1.YoutubeVideoDataDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: MediaMessageAttributesDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributes;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$Surrogate;)V", "type", "Lcom/robinhood/chatbot/proto/v1/MediaMessageTypeDto;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$DataDto;", "(Lcom/robinhood/chatbot/proto/v1/MediaMessageTypeDto;Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$DataDto;)V", "getType", "()Lcom/robinhood/chatbot/proto/v1/MediaMessageTypeDto;", "getData", "()Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$DataDto;", "youtube_video_data", "Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;", "getYoutube_video_data", "()Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DataDto", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class MediaMessageAttributesDto implements Dto3<MediaMessageAttributes>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MediaMessageAttributesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MediaMessageAttributesDto, MediaMessageAttributes>> binaryBase64Serializer$delegate;
    private static final MediaMessageAttributesDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MediaMessageAttributesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MediaMessageAttributesDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MediaMessageTypeDto getType() {
        return this.surrogate.getType();
    }

    public final DataDto getData() {
        if (this.surrogate.getYoutube_video_data() != null) {
            return new DataDto.YoutubeVideoData(this.surrogate.getYoutube_video_data());
        }
        return null;
    }

    public final YoutubeVideoDataDto getYoutube_video_data() {
        return this.surrogate.getYoutube_video_data();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaMessageAttributesDto(MediaMessageTypeDto type2, DataDto dataDto) {
        Intrinsics.checkNotNullParameter(type2, "type");
        DataDto.YoutubeVideoData youtubeVideoData = dataDto instanceof DataDto.YoutubeVideoData ? (DataDto.YoutubeVideoData) dataDto : null;
        this(new Surrogate(type2, youtubeVideoData != null ? youtubeVideoData.getValue() : null));
    }

    public /* synthetic */ MediaMessageAttributesDto(MediaMessageTypeDto mediaMessageTypeDto, DataDto dataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MediaMessageTypeDto.INSTANCE.getZeroValue() : mediaMessageTypeDto, (i & 2) != 0 ? null : dataDto);
    }

    public static /* synthetic */ MediaMessageAttributesDto copy$default(MediaMessageAttributesDto mediaMessageAttributesDto, MediaMessageTypeDto mediaMessageTypeDto, DataDto dataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaMessageTypeDto = mediaMessageAttributesDto.surrogate.getType();
        }
        if ((i & 2) != 0) {
            dataDto = mediaMessageAttributesDto.getData();
        }
        return mediaMessageAttributesDto.copy(mediaMessageTypeDto, dataDto);
    }

    public final MediaMessageAttributesDto copy(MediaMessageTypeDto type2, DataDto data) {
        Intrinsics.checkNotNullParameter(type2, "type");
        DataDto.YoutubeVideoData youtubeVideoData = data instanceof DataDto.YoutubeVideoData ? (DataDto.YoutubeVideoData) data : null;
        return new MediaMessageAttributesDto(new Surrogate(type2, youtubeVideoData != null ? youtubeVideoData.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MediaMessageAttributes toProto() {
        MediaMessageType mediaMessageType = (MediaMessageType) this.surrogate.getType().toProto();
        YoutubeVideoDataDto youtube_video_data = this.surrogate.getYoutube_video_data();
        return new MediaMessageAttributes(mediaMessageType, youtube_video_data != null ? youtube_video_data.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[MediaMessageAttributesDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MediaMessageAttributesDto) && Intrinsics.areEqual(((MediaMessageAttributesDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaMessageAttributesDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$Surrogate;", "", "type", "Lcom/robinhood/chatbot/proto/v1/MediaMessageTypeDto;", "youtube_video_data", "Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/MediaMessageTypeDto;Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/chatbot/proto/v1/MediaMessageTypeDto;Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Lcom/robinhood/chatbot/proto/v1/MediaMessageTypeDto;", "getYoutube_video_data$annotations", "getYoutube_video_data", "()Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MediaMessageTypeDto type;
        private final YoutubeVideoDataDto youtube_video_data;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((MediaMessageTypeDto) null, (YoutubeVideoDataDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MediaMessageTypeDto mediaMessageTypeDto, YoutubeVideoDataDto youtubeVideoDataDto, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaMessageTypeDto = surrogate.type;
            }
            if ((i & 2) != 0) {
                youtubeVideoDataDto = surrogate.youtube_video_data;
            }
            return surrogate.copy(mediaMessageTypeDto, youtubeVideoDataDto);
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("youtubeVideoData")
        @JsonAnnotations2(names = {"youtube_video_data"})
        public static /* synthetic */ void getYoutube_video_data$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MediaMessageTypeDto getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final YoutubeVideoDataDto getYoutube_video_data() {
            return this.youtube_video_data;
        }

        public final Surrogate copy(MediaMessageTypeDto type2, YoutubeVideoDataDto youtube_video_data) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Surrogate(type2, youtube_video_data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.type == surrogate.type && Intrinsics.areEqual(this.youtube_video_data, surrogate.youtube_video_data);
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            YoutubeVideoDataDto youtubeVideoDataDto = this.youtube_video_data;
            return iHashCode + (youtubeVideoDataDto == null ? 0 : youtubeVideoDataDto.hashCode());
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", youtube_video_data=" + this.youtube_video_data + ")";
        }

        /* compiled from: MediaMessageAttributesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MediaMessageAttributesDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MediaMessageTypeDto mediaMessageTypeDto, YoutubeVideoDataDto youtubeVideoDataDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.type = (i & 1) == 0 ? MediaMessageTypeDto.INSTANCE.getZeroValue() : mediaMessageTypeDto;
            if ((i & 2) == 0) {
                this.youtube_video_data = null;
            } else {
                this.youtube_video_data = youtubeVideoDataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.type != MediaMessageTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, MediaMessageTypeDto.Serializer.INSTANCE, self.type);
            }
            YoutubeVideoDataDto youtubeVideoDataDto = self.youtube_video_data;
            if (youtubeVideoDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, YoutubeVideoDataDto.Serializer.INSTANCE, youtubeVideoDataDto);
            }
        }

        public Surrogate(MediaMessageTypeDto type2, YoutubeVideoDataDto youtubeVideoDataDto) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
            this.youtube_video_data = youtubeVideoDataDto;
        }

        public final MediaMessageTypeDto getType() {
            return this.type;
        }

        public /* synthetic */ Surrogate(MediaMessageTypeDto mediaMessageTypeDto, YoutubeVideoDataDto youtubeVideoDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MediaMessageTypeDto.INSTANCE.getZeroValue() : mediaMessageTypeDto, (i & 2) != 0 ? null : youtubeVideoDataDto);
        }

        public final YoutubeVideoDataDto getYoutube_video_data() {
            return this.youtube_video_data;
        }
    }

    /* compiled from: MediaMessageAttributesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributes;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MediaMessageAttributesDto, MediaMessageAttributes> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MediaMessageAttributesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MediaMessageAttributesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MediaMessageAttributesDto> getBinaryBase64Serializer() {
            return (KSerializer) MediaMessageAttributesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MediaMessageAttributes> getProtoAdapter() {
            return MediaMessageAttributes.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MediaMessageAttributesDto getZeroValue() {
            return MediaMessageAttributesDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MediaMessageAttributesDto fromProto(MediaMessageAttributes proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            MediaMessageTypeDto mediaMessageTypeDtoFromProto = MediaMessageTypeDto.INSTANCE.fromProto(proto.getType());
            YoutubeVideoData youtube_video_data = proto.getYoutube_video_data();
            return new MediaMessageAttributesDto(new Surrogate(mediaMessageTypeDtoFromProto, youtube_video_data != null ? YoutubeVideoDataDto.INSTANCE.fromProto(youtube_video_data) : null), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.MediaMessageAttributesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaMessageAttributesDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MediaMessageAttributesDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MediaMessageAttributesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$DataDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "YoutubeVideoData", "Companion", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$DataDto$YoutubeVideoData;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DataDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DataDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DataDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: MediaMessageAttributesDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$DataDto$YoutubeVideoData;", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$DataDto;", "value", "Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class YoutubeVideoData extends DataDto {
            private final YoutubeVideoDataDto value;

            public static /* synthetic */ YoutubeVideoData copy$default(YoutubeVideoData youtubeVideoData, YoutubeVideoDataDto youtubeVideoDataDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    youtubeVideoDataDto = youtubeVideoData.value;
                }
                return youtubeVideoData.copy(youtubeVideoDataDto);
            }

            /* renamed from: component1, reason: from getter */
            public final YoutubeVideoDataDto getValue() {
                return this.value;
            }

            public final YoutubeVideoData copy(YoutubeVideoDataDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new YoutubeVideoData(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof YoutubeVideoData) && Intrinsics.areEqual(this.value, ((YoutubeVideoData) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "YoutubeVideoData(value=" + this.value + ")";
            }

            public final YoutubeVideoDataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public YoutubeVideoData(YoutubeVideoDataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MediaMessageAttributesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$DataDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$DataDto;", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributes;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DataDto, MediaMessageAttributes> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MediaMessageAttributes> getProtoAdapter() {
                return MediaMessageAttributes.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DataDto fromProto(MediaMessageAttributes proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getYoutube_video_data() != null) {
                    return new YoutubeVideoData(YoutubeVideoDataDto.INSTANCE.fromProto(proto.getYoutube_video_data()));
                }
                return null;
            }
        }
    }

    /* compiled from: MediaMessageAttributesDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MediaMessageAttributesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.MediaMessageAttributes", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MediaMessageAttributesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MediaMessageAttributesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MediaMessageAttributesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: MediaMessageAttributesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.MediaMessageAttributesDto";
        }
    }
}
