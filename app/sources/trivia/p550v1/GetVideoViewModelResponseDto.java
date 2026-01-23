package trivia.p550v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GetVideoViewModelResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010&R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010&¨\u0006."}, m3636d2 = {"Ltrivia/v1/GetVideoViewModelResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ltrivia/v1/GetVideoViewModelResponse;", "Landroid/os/Parcelable;", "Ltrivia/v1/GetVideoViewModelResponseDto$Surrogate;", "surrogate", "<init>", "(Ltrivia/v1/GetVideoViewModelResponseDto$Surrogate;)V", "", "video_url", "", "is_video_playing", "", "video_start_offset_ms", "is_video_full_screen", "asset_url", "is_gold_styled", "(Ljava/lang/String;ZJZLjava/lang/String;Z)V", "toProto", "()Ltrivia/v1/GetVideoViewModelResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ltrivia/v1/GetVideoViewModelResponseDto$Surrogate;", "getVideo_url", "()Z", "getVideo_start_offset_ms", "()J", "getAsset_url", "Companion", "Surrogate", "Serializer", "MultibindingModule", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class GetVideoViewModelResponseDto implements Dto3<GetVideoViewModelResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetVideoViewModelResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetVideoViewModelResponseDto, GetVideoViewModelResponse>> binaryBase64Serializer$delegate;
    private static final GetVideoViewModelResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetVideoViewModelResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetVideoViewModelResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getVideo_url() {
        return this.surrogate.getVideo_url();
    }

    public final boolean is_video_playing() {
        return this.surrogate.getIs_video_playing();
    }

    public final long getVideo_start_offset_ms() {
        return this.surrogate.getVideo_start_offset_ms();
    }

    public final String getAsset_url() {
        return this.surrogate.getAsset_url();
    }

    public final boolean is_gold_styled() {
        return this.surrogate.getIs_gold_styled();
    }

    public /* synthetic */ GetVideoViewModelResponseDto(String str, boolean z, long j, boolean z2, String str2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z3);
    }

    public GetVideoViewModelResponseDto(String str, boolean z, long j, boolean z2, String str2, boolean z3) {
        this(new Surrogate(str, z, j, z2, str2, z3));
    }

    @Override // com.robinhood.idl.Dto
    public GetVideoViewModelResponse toProto() {
        return new GetVideoViewModelResponse(this.surrogate.getVideo_url(), this.surrogate.getIs_video_playing(), this.surrogate.getVideo_start_offset_ms(), this.surrogate.getIs_video_full_screen(), this.surrogate.getAsset_url(), this.surrogate.getIs_gold_styled(), null, 64, null);
    }

    public String toString() {
        return "[GetVideoViewModelResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetVideoViewModelResponseDto) && Intrinsics.areEqual(((GetVideoViewModelResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetVideoViewModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254BV\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fBO\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b\u0005\u0010*R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.R \u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010)\u0012\u0004\b0\u0010(\u001a\u0004\b\u000b\u0010*R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010%\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010\u001fR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010)\u0012\u0004\b3\u0010(\u001a\u0004\b\r\u0010*¨\u00066"}, m3636d2 = {"Ltrivia/v1/GetVideoViewModelResponseDto$Surrogate;", "", "", "video_url", "", "is_video_playing", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "video_start_offset_ms", "is_video_full_screen", "asset_url", "is_gold_styled", "<init>", "(Ljava/lang/String;ZJZLjava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZJZLjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$trivia_v1_externalRelease", "(Ltrivia/v1/GetVideoViewModelResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVideo_url", "getVideo_url$annotations", "()V", "Z", "()Z", "is_video_playing$annotations", "J", "getVideo_start_offset_ms", "()J", "getVideo_start_offset_ms$annotations", "is_video_full_screen$annotations", "getAsset_url", "getAsset_url$annotations", "is_gold_styled$annotations", "Companion", "$serializer", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String asset_url;
        private final boolean is_gold_styled;
        private final boolean is_video_full_screen;
        private final boolean is_video_playing;
        private final long video_start_offset_ms;
        private final String video_url;

        public Surrogate() {
            this((String) null, false, 0L, false, (String) null, false, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.video_url, surrogate.video_url) && this.is_video_playing == surrogate.is_video_playing && this.video_start_offset_ms == surrogate.video_start_offset_ms && this.is_video_full_screen == surrogate.is_video_full_screen && Intrinsics.areEqual(this.asset_url, surrogate.asset_url) && this.is_gold_styled == surrogate.is_gold_styled;
        }

        public int hashCode() {
            String str = this.video_url;
            int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.is_video_playing)) * 31) + Long.hashCode(this.video_start_offset_ms)) * 31) + Boolean.hashCode(this.is_video_full_screen)) * 31;
            String str2 = this.asset_url;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.is_gold_styled);
        }

        public String toString() {
            return "Surrogate(video_url=" + this.video_url + ", is_video_playing=" + this.is_video_playing + ", video_start_offset_ms=" + this.video_start_offset_ms + ", is_video_full_screen=" + this.is_video_full_screen + ", asset_url=" + this.asset_url + ", is_gold_styled=" + this.is_gold_styled + ")";
        }

        /* compiled from: GetVideoViewModelResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ltrivia/v1/GetVideoViewModelResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ltrivia/v1/GetVideoViewModelResponseDto$Surrogate;", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetVideoViewModelResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, boolean z, long j, boolean z2, String str2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.video_url = null;
            } else {
                this.video_url = str;
            }
            if ((i & 2) == 0) {
                this.is_video_playing = false;
            } else {
                this.is_video_playing = z;
            }
            if ((i & 4) == 0) {
                this.video_start_offset_ms = 0L;
            } else {
                this.video_start_offset_ms = j;
            }
            if ((i & 8) == 0) {
                this.is_video_full_screen = false;
            } else {
                this.is_video_full_screen = z2;
            }
            if ((i & 16) == 0) {
                this.asset_url = null;
            } else {
                this.asset_url = str2;
            }
            if ((i & 32) == 0) {
                this.is_gold_styled = false;
            } else {
                this.is_gold_styled = z3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$trivia_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.video_url;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            boolean z = self.is_video_playing;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            long j = self.video_start_offset_ms;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            boolean z2 = self.is_video_full_screen;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 3, z2);
            }
            String str2 = self.asset_url;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str2);
            }
            boolean z3 = self.is_gold_styled;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 5, z3);
            }
        }

        public Surrogate(String str, boolean z, long j, boolean z2, String str2, boolean z3) {
            this.video_url = str;
            this.is_video_playing = z;
            this.video_start_offset_ms = j;
            this.is_video_full_screen = z2;
            this.asset_url = str2;
            this.is_gold_styled = z3;
        }

        public /* synthetic */ Surrogate(String str, boolean z, long j, boolean z2, String str2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z3);
        }

        public final String getVideo_url() {
            return this.video_url;
        }

        /* renamed from: is_video_playing, reason: from getter */
        public final boolean getIs_video_playing() {
            return this.is_video_playing;
        }

        public final long getVideo_start_offset_ms() {
            return this.video_start_offset_ms;
        }

        /* renamed from: is_video_full_screen, reason: from getter */
        public final boolean getIs_video_full_screen() {
            return this.is_video_full_screen;
        }

        public final String getAsset_url() {
            return this.asset_url;
        }

        /* renamed from: is_gold_styled, reason: from getter */
        public final boolean getIs_gold_styled() {
            return this.is_gold_styled;
        }
    }

    /* compiled from: GetVideoViewModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ltrivia/v1/GetVideoViewModelResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ltrivia/v1/GetVideoViewModelResponseDto;", "Ltrivia/v1/GetVideoViewModelResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ltrivia/v1/GetVideoViewModelResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetVideoViewModelResponseDto, GetVideoViewModelResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetVideoViewModelResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetVideoViewModelResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetVideoViewModelResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetVideoViewModelResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetVideoViewModelResponse> getProtoAdapter() {
            return GetVideoViewModelResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetVideoViewModelResponseDto getZeroValue() {
            return GetVideoViewModelResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetVideoViewModelResponseDto fromProto(GetVideoViewModelResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetVideoViewModelResponseDto(new Surrogate(proto.getVideo_url(), proto.getIs_video_playing(), proto.getVideo_start_offset_ms(), proto.getIs_video_full_screen(), proto.getAsset_url(), proto.getIs_gold_styled()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: trivia.v1.GetVideoViewModelResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetVideoViewModelResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetVideoViewModelResponseDto(null, false, 0L, false, null, false, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetVideoViewModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ltrivia/v1/GetVideoViewModelResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ltrivia/v1/GetVideoViewModelResponseDto;", "<init>", "()V", "surrogateSerializer", "Ltrivia/v1/GetVideoViewModelResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes28.dex */
    public static final class Serializer implements KSerializer<GetVideoViewModelResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/trivia.v1.GetVideoViewModelResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetVideoViewModelResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetVideoViewModelResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetVideoViewModelResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetVideoViewModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ltrivia/v1/GetVideoViewModelResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "trivia.v1.GetVideoViewModelResponseDto";
        }
    }
}
