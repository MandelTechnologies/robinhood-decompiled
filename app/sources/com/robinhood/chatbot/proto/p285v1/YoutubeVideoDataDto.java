package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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

/* compiled from: YoutubeVideoDataDto.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/YoutubeVideoData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto$Surrogate;)V", "target", "", "video_id", "thumbnail_url", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTarget", "()Ljava/lang/String;", "getVideo_id", "getThumbnail_url", "getDescription", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class YoutubeVideoDataDto implements Dto3<YoutubeVideoData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<YoutubeVideoDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<YoutubeVideoDataDto, YoutubeVideoData>> binaryBase64Serializer$delegate;
    private static final YoutubeVideoDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ YoutubeVideoDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private YoutubeVideoDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTarget() {
        return this.surrogate.getTarget();
    }

    public final String getVideo_id() {
        return this.surrogate.getVideo_id();
    }

    public final String getThumbnail_url() {
        return this.surrogate.getThumbnail_url();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public /* synthetic */ YoutubeVideoDataDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YoutubeVideoDataDto(String target, String video_id, String thumbnail_url, String description) {
        this(new Surrogate(target, video_id, thumbnail_url, description));
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(video_id, "video_id");
        Intrinsics.checkNotNullParameter(thumbnail_url, "thumbnail_url");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    public static /* synthetic */ YoutubeVideoDataDto copy$default(YoutubeVideoDataDto youtubeVideoDataDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = youtubeVideoDataDto.surrogate.getTarget();
        }
        if ((i & 2) != 0) {
            str2 = youtubeVideoDataDto.surrogate.getVideo_id();
        }
        if ((i & 4) != 0) {
            str3 = youtubeVideoDataDto.surrogate.getThumbnail_url();
        }
        if ((i & 8) != 0) {
            str4 = youtubeVideoDataDto.surrogate.getDescription();
        }
        return youtubeVideoDataDto.copy(str, str2, str3, str4);
    }

    public final YoutubeVideoDataDto copy(String target, String video_id, String thumbnail_url, String description) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(video_id, "video_id");
        Intrinsics.checkNotNullParameter(thumbnail_url, "thumbnail_url");
        Intrinsics.checkNotNullParameter(description, "description");
        return new YoutubeVideoDataDto(new Surrogate(target, video_id, thumbnail_url, description));
    }

    @Override // com.robinhood.idl.Dto
    public YoutubeVideoData toProto() {
        return new YoutubeVideoData(this.surrogate.getTarget(), this.surrogate.getVideo_id(), this.surrogate.getThumbnail_url(), this.surrogate.getDescription(), null, 16, null);
    }

    public String toString() {
        return "[YoutubeVideoDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof YoutubeVideoDataDto) && Intrinsics.areEqual(((YoutubeVideoDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: YoutubeVideoDataDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002*+B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006,"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto$Surrogate;", "", "target", "", "video_id", "thumbnail_url", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTarget$annotations", "()V", "getTarget", "()Ljava/lang/String;", "getVideo_id$annotations", "getVideo_id", "getThumbnail_url$annotations", "getThumbnail_url", "getDescription$annotations", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String description;
        private final String target;
        private final String thumbnail_url;
        private final String video_id;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.target;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.video_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.thumbnail_url;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.description;
            }
            return surrogate.copy(str, str2, str3, str4);
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("target")
        @JsonAnnotations2(names = {"target"})
        public static /* synthetic */ void getTarget$annotations() {
        }

        @SerialName("thumbnailUrl")
        @JsonAnnotations2(names = {"thumbnail_url"})
        public static /* synthetic */ void getThumbnail_url$annotations() {
        }

        @SerialName("videoId")
        @JsonAnnotations2(names = {"video_id"})
        public static /* synthetic */ void getVideo_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVideo_id() {
            return this.video_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getThumbnail_url() {
            return this.thumbnail_url;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Surrogate copy(String target, String video_id, String thumbnail_url, String description) {
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(video_id, "video_id");
            Intrinsics.checkNotNullParameter(thumbnail_url, "thumbnail_url");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Surrogate(target, video_id, thumbnail_url, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.target, surrogate.target) && Intrinsics.areEqual(this.video_id, surrogate.video_id) && Intrinsics.areEqual(this.thumbnail_url, surrogate.thumbnail_url) && Intrinsics.areEqual(this.description, surrogate.description);
        }

        public int hashCode() {
            return (((((this.target.hashCode() * 31) + this.video_id.hashCode()) * 31) + this.thumbnail_url.hashCode()) * 31) + this.description.hashCode();
        }

        public String toString() {
            return "Surrogate(target=" + this.target + ", video_id=" + this.video_id + ", thumbnail_url=" + this.thumbnail_url + ", description=" + this.description + ")";
        }

        /* compiled from: YoutubeVideoDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return YoutubeVideoDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.target = "";
            } else {
                this.target = str;
            }
            if ((i & 2) == 0) {
                this.video_id = "";
            } else {
                this.video_id = str2;
            }
            if ((i & 4) == 0) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str3;
            }
            if ((i & 8) == 0) {
                this.description = "";
            } else {
                this.description = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.target, "")) {
                output.encodeStringElement(serialDesc, 0, self.target);
            }
            if (!Intrinsics.areEqual(self.video_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.video_id);
            }
            if (!Intrinsics.areEqual(self.thumbnail_url, "")) {
                output.encodeStringElement(serialDesc, 2, self.thumbnail_url);
            }
            if (Intrinsics.areEqual(self.description, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.description);
        }

        public Surrogate(String target, String video_id, String thumbnail_url, String description) {
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(video_id, "video_id");
            Intrinsics.checkNotNullParameter(thumbnail_url, "thumbnail_url");
            Intrinsics.checkNotNullParameter(description, "description");
            this.target = target;
            this.video_id = video_id;
            this.thumbnail_url = thumbnail_url;
            this.description = description;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }

        public final String getTarget() {
            return this.target;
        }

        public final String getVideo_id() {
            return this.video_id;
        }

        public final String getThumbnail_url() {
            return this.thumbnail_url;
        }

        public final String getDescription() {
            return this.description;
        }
    }

    /* compiled from: YoutubeVideoDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;", "Lcom/robinhood/chatbot/proto/v1/YoutubeVideoData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<YoutubeVideoDataDto, YoutubeVideoData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<YoutubeVideoDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<YoutubeVideoDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<YoutubeVideoDataDto> getBinaryBase64Serializer() {
            return (KSerializer) YoutubeVideoDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<YoutubeVideoData> getProtoAdapter() {
            return YoutubeVideoData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public YoutubeVideoDataDto getZeroValue() {
            return YoutubeVideoDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public YoutubeVideoDataDto fromProto(YoutubeVideoData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new YoutubeVideoDataDto(new Surrogate(proto.getTarget(), proto.getVideo_id(), proto.getThumbnail_url(), proto.getDescription()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.YoutubeVideoDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YoutubeVideoDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new YoutubeVideoDataDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: YoutubeVideoDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<YoutubeVideoDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.YoutubeVideoData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, YoutubeVideoDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public YoutubeVideoDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new YoutubeVideoDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: YoutubeVideoDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/YoutubeVideoDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.YoutubeVideoDataDto";
        }
    }
}
