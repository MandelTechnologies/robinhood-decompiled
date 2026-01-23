package ventures.trailer.proto.p551v1;

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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import ventures.trailer.proto.p551v1.PostTrailerScreenDto;
import ventures.trailer.proto.p551v1.TrailerLandingScreenDto;
import ventures.trailer.proto.p551v1.TrailerScreenDto;

/* compiled from: GetTrailerResponseDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0014¨\u00060"}, m3636d2 = {"Lventures/trailer/proto/v1/GetTrailerResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lventures/trailer/proto/v1/GetTrailerResponse;", "Landroid/os/Parcelable;", "Lventures/trailer/proto/v1/GetTrailerResponseDto$Surrogate;", "surrogate", "<init>", "(Lventures/trailer/proto/v1/GetTrailerResponseDto$Surrogate;)V", "Lventures/trailer/proto/v1/TrailerLandingScreenDto;", "landing_screen", "Lventures/trailer/proto/v1/TrailerScreenDto;", "trailer_screen", "Lventures/trailer/proto/v1/PostTrailerScreenDto;", "post_trailer_screen", "", "redirect_deeplink_url", "(Lventures/trailer/proto/v1/TrailerLandingScreenDto;Lventures/trailer/proto/v1/TrailerScreenDto;Lventures/trailer/proto/v1/PostTrailerScreenDto;Ljava/lang/String;)V", "toProto", "()Lventures/trailer/proto/v1/GetTrailerResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lventures/trailer/proto/v1/GetTrailerResponseDto$Surrogate;", "getLanding_screen", "()Lventures/trailer/proto/v1/TrailerLandingScreenDto;", "getTrailer_screen", "()Lventures/trailer/proto/v1/TrailerScreenDto;", "getPost_trailer_screen", "()Lventures/trailer/proto/v1/PostTrailerScreenDto;", "getRedirect_deeplink_url", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public final class GetTrailerResponseDto implements Dto3<GetTrailerResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetTrailerResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetTrailerResponseDto, GetTrailerResponse>> binaryBase64Serializer$delegate;
    private static final GetTrailerResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetTrailerResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetTrailerResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TrailerLandingScreenDto getLanding_screen() {
        return this.surrogate.getLanding_screen();
    }

    public final TrailerScreenDto getTrailer_screen() {
        return this.surrogate.getTrailer_screen();
    }

    public final PostTrailerScreenDto getPost_trailer_screen() {
        return this.surrogate.getPost_trailer_screen();
    }

    public final String getRedirect_deeplink_url() {
        return this.surrogate.getRedirect_deeplink_url();
    }

    public /* synthetic */ GetTrailerResponseDto(TrailerLandingScreenDto trailerLandingScreenDto, TrailerScreenDto trailerScreenDto, PostTrailerScreenDto postTrailerScreenDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : trailerLandingScreenDto, (i & 2) != 0 ? null : trailerScreenDto, (i & 4) != 0 ? null : postTrailerScreenDto, (i & 8) != 0 ? null : str);
    }

    public GetTrailerResponseDto(TrailerLandingScreenDto trailerLandingScreenDto, TrailerScreenDto trailerScreenDto, PostTrailerScreenDto postTrailerScreenDto, String str) {
        this(new Surrogate(trailerLandingScreenDto, trailerScreenDto, postTrailerScreenDto, str));
    }

    @Override // com.robinhood.idl.Dto
    public GetTrailerResponse toProto() {
        TrailerLandingScreenDto landing_screen = this.surrogate.getLanding_screen();
        TrailerLandingScreen proto = landing_screen != null ? landing_screen.toProto() : null;
        TrailerScreenDto trailer_screen = this.surrogate.getTrailer_screen();
        TrailerScreen proto2 = trailer_screen != null ? trailer_screen.toProto() : null;
        PostTrailerScreenDto post_trailer_screen = this.surrogate.getPost_trailer_screen();
        return new GetTrailerResponse(proto, proto2, post_trailer_screen != null ? post_trailer_screen.toProto() : null, this.surrogate.getRedirect_deeplink_url(), null, 16, null);
    }

    public String toString() {
        return "[GetTrailerResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetTrailerResponseDto) && Intrinsics.areEqual(((GetTrailerResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetTrailerResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b1\u0010&\u001a\u0004\b0\u0010\u001b¨\u00064"}, m3636d2 = {"Lventures/trailer/proto/v1/GetTrailerResponseDto$Surrogate;", "", "Lventures/trailer/proto/v1/TrailerLandingScreenDto;", "landing_screen", "Lventures/trailer/proto/v1/TrailerScreenDto;", "trailer_screen", "Lventures/trailer/proto/v1/PostTrailerScreenDto;", "post_trailer_screen", "", "redirect_deeplink_url", "<init>", "(Lventures/trailer/proto/v1/TrailerLandingScreenDto;Lventures/trailer/proto/v1/TrailerScreenDto;Lventures/trailer/proto/v1/PostTrailerScreenDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILventures/trailer/proto/v1/TrailerLandingScreenDto;Lventures/trailer/proto/v1/TrailerScreenDto;Lventures/trailer/proto/v1/PostTrailerScreenDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_ventures_proto_v1_externalRelease", "(Lventures/trailer/proto/v1/GetTrailerResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lventures/trailer/proto/v1/TrailerLandingScreenDto;", "getLanding_screen", "()Lventures/trailer/proto/v1/TrailerLandingScreenDto;", "getLanding_screen$annotations", "()V", "Lventures/trailer/proto/v1/TrailerScreenDto;", "getTrailer_screen", "()Lventures/trailer/proto/v1/TrailerScreenDto;", "getTrailer_screen$annotations", "Lventures/trailer/proto/v1/PostTrailerScreenDto;", "getPost_trailer_screen", "()Lventures/trailer/proto/v1/PostTrailerScreenDto;", "getPost_trailer_screen$annotations", "Ljava/lang/String;", "getRedirect_deeplink_url", "getRedirect_deeplink_url$annotations", "Companion", "$serializer", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TrailerLandingScreenDto landing_screen;
        private final PostTrailerScreenDto post_trailer_screen;
        private final String redirect_deeplink_url;
        private final TrailerScreenDto trailer_screen;

        public Surrogate() {
            this((TrailerLandingScreenDto) null, (TrailerScreenDto) null, (PostTrailerScreenDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.landing_screen, surrogate.landing_screen) && Intrinsics.areEqual(this.trailer_screen, surrogate.trailer_screen) && Intrinsics.areEqual(this.post_trailer_screen, surrogate.post_trailer_screen) && Intrinsics.areEqual(this.redirect_deeplink_url, surrogate.redirect_deeplink_url);
        }

        public int hashCode() {
            TrailerLandingScreenDto trailerLandingScreenDto = this.landing_screen;
            int iHashCode = (trailerLandingScreenDto == null ? 0 : trailerLandingScreenDto.hashCode()) * 31;
            TrailerScreenDto trailerScreenDto = this.trailer_screen;
            int iHashCode2 = (iHashCode + (trailerScreenDto == null ? 0 : trailerScreenDto.hashCode())) * 31;
            PostTrailerScreenDto postTrailerScreenDto = this.post_trailer_screen;
            int iHashCode3 = (iHashCode2 + (postTrailerScreenDto == null ? 0 : postTrailerScreenDto.hashCode())) * 31;
            String str = this.redirect_deeplink_url;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(landing_screen=" + this.landing_screen + ", trailer_screen=" + this.trailer_screen + ", post_trailer_screen=" + this.post_trailer_screen + ", redirect_deeplink_url=" + this.redirect_deeplink_url + ")";
        }

        /* compiled from: GetTrailerResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lventures/trailer/proto/v1/GetTrailerResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lventures/trailer/proto/v1/GetTrailerResponseDto$Surrogate;", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetTrailerResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TrailerLandingScreenDto trailerLandingScreenDto, TrailerScreenDto trailerScreenDto, PostTrailerScreenDto postTrailerScreenDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.landing_screen = null;
            } else {
                this.landing_screen = trailerLandingScreenDto;
            }
            if ((i & 2) == 0) {
                this.trailer_screen = null;
            } else {
                this.trailer_screen = trailerScreenDto;
            }
            if ((i & 4) == 0) {
                this.post_trailer_screen = null;
            } else {
                this.post_trailer_screen = postTrailerScreenDto;
            }
            if ((i & 8) == 0) {
                this.redirect_deeplink_url = null;
            } else {
                this.redirect_deeplink_url = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_contracts_ventures_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            TrailerLandingScreenDto trailerLandingScreenDto = self.landing_screen;
            if (trailerLandingScreenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, TrailerLandingScreenDto.Serializer.INSTANCE, trailerLandingScreenDto);
            }
            TrailerScreenDto trailerScreenDto = self.trailer_screen;
            if (trailerScreenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TrailerScreenDto.Serializer.INSTANCE, trailerScreenDto);
            }
            PostTrailerScreenDto postTrailerScreenDto = self.post_trailer_screen;
            if (postTrailerScreenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, PostTrailerScreenDto.Serializer.INSTANCE, postTrailerScreenDto);
            }
            String str = self.redirect_deeplink_url;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(TrailerLandingScreenDto trailerLandingScreenDto, TrailerScreenDto trailerScreenDto, PostTrailerScreenDto postTrailerScreenDto, String str) {
            this.landing_screen = trailerLandingScreenDto;
            this.trailer_screen = trailerScreenDto;
            this.post_trailer_screen = postTrailerScreenDto;
            this.redirect_deeplink_url = str;
        }

        public /* synthetic */ Surrogate(TrailerLandingScreenDto trailerLandingScreenDto, TrailerScreenDto trailerScreenDto, PostTrailerScreenDto postTrailerScreenDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : trailerLandingScreenDto, (i & 2) != 0 ? null : trailerScreenDto, (i & 4) != 0 ? null : postTrailerScreenDto, (i & 8) != 0 ? null : str);
        }

        public final TrailerLandingScreenDto getLanding_screen() {
            return this.landing_screen;
        }

        public final TrailerScreenDto getTrailer_screen() {
            return this.trailer_screen;
        }

        public final PostTrailerScreenDto getPost_trailer_screen() {
            return this.post_trailer_screen;
        }

        public final String getRedirect_deeplink_url() {
            return this.redirect_deeplink_url;
        }
    }

    /* compiled from: GetTrailerResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lventures/trailer/proto/v1/GetTrailerResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lventures/trailer/proto/v1/GetTrailerResponseDto;", "Lventures/trailer/proto/v1/GetTrailerResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lventures/trailer/proto/v1/GetTrailerResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetTrailerResponseDto, GetTrailerResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetTrailerResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTrailerResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTrailerResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetTrailerResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetTrailerResponse> getProtoAdapter() {
            return GetTrailerResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTrailerResponseDto getZeroValue() {
            return GetTrailerResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTrailerResponseDto fromProto(GetTrailerResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            TrailerLandingScreen landing_screen = proto.getLanding_screen();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TrailerLandingScreenDto trailerLandingScreenDtoFromProto = landing_screen != null ? TrailerLandingScreenDto.INSTANCE.fromProto(landing_screen) : null;
            TrailerScreen trailer_screen = proto.getTrailer_screen();
            TrailerScreenDto trailerScreenDtoFromProto = trailer_screen != null ? TrailerScreenDto.INSTANCE.fromProto(trailer_screen) : null;
            PostTrailerScreen post_trailer_screen = proto.getPost_trailer_screen();
            return new GetTrailerResponseDto(new Surrogate(trailerLandingScreenDtoFromProto, trailerScreenDtoFromProto, post_trailer_screen != null ? PostTrailerScreenDto.INSTANCE.fromProto(post_trailer_screen) : null, proto.getRedirect_deeplink_url()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: ventures.trailer.proto.v1.GetTrailerResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTrailerResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetTrailerResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetTrailerResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lventures/trailer/proto/v1/GetTrailerResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lventures/trailer/proto/v1/GetTrailerResponseDto;", "<init>", "()V", "surrogateSerializer", "Lventures/trailer/proto/v1/GetTrailerResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetTrailerResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ventures.trailer.proto.v1.GetTrailerResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetTrailerResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetTrailerResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetTrailerResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetTrailerResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lventures/trailer/proto/v1/GetTrailerResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "ventures.trailer.proto.v1.GetTrailerResponseDto";
        }
    }
}
