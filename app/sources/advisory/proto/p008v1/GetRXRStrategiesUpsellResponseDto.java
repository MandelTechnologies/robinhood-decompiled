package advisory.proto.p008v1;

import advisory.proto.p008v1.GetRXRStrategiesBannerDto;
import advisory.proto.p008v1.GetRXRStrategiesIntroDto;
import advisory.proto.p008v1.GetRXRStrategiesValuePropsDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
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

/* compiled from: GetRXRStrategiesUpsellResponseDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, m3636d2 = {"Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetRXRStrategiesUpsellResponse;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto$Surrogate;)V", "", "account_number", "Ladvisory/proto/v1/GetRXRStrategiesValuePropsDto;", "value_props", "Ladvisory/proto/v1/GetRXRStrategiesIntroDto;", "intro", "Ladvisory/proto/v1/GetRXRStrategiesBannerDto;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "(Ljava/lang/String;Ladvisory/proto/v1/GetRXRStrategiesValuePropsDto;Ladvisory/proto/v1/GetRXRStrategiesIntroDto;Ladvisory/proto/v1/GetRXRStrategiesBannerDto;)V", "toProto", "()Ladvisory/proto/v1/GetRXRStrategiesUpsellResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto$Surrogate;", "getAccount_number", "getValue_props", "()Ladvisory/proto/v1/GetRXRStrategiesValuePropsDto;", "getIntro", "()Ladvisory/proto/v1/GetRXRStrategiesIntroDto;", "getBanner", "()Ladvisory/proto/v1/GetRXRStrategiesBannerDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class GetRXRStrategiesUpsellResponseDto implements Dto3<GetRXRStrategiesUpsellResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetRXRStrategiesUpsellResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetRXRStrategiesUpsellResponseDto, GetRXRStrategiesUpsellResponse>> binaryBase64Serializer$delegate;
    private static final GetRXRStrategiesUpsellResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetRXRStrategiesUpsellResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetRXRStrategiesUpsellResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final GetRXRStrategiesValuePropsDto getValue_props() {
        return this.surrogate.getValue_props();
    }

    public final GetRXRStrategiesIntroDto getIntro() {
        return this.surrogate.getIntro();
    }

    public final GetRXRStrategiesBannerDto getBanner() {
        return this.surrogate.getBanner();
    }

    public /* synthetic */ GetRXRStrategiesUpsellResponseDto(String str, GetRXRStrategiesValuePropsDto getRXRStrategiesValuePropsDto, GetRXRStrategiesIntroDto getRXRStrategiesIntroDto, GetRXRStrategiesBannerDto getRXRStrategiesBannerDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : getRXRStrategiesValuePropsDto, (i & 4) != 0 ? null : getRXRStrategiesIntroDto, (i & 8) != 0 ? null : getRXRStrategiesBannerDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetRXRStrategiesUpsellResponseDto(String account_number, GetRXRStrategiesValuePropsDto getRXRStrategiesValuePropsDto, GetRXRStrategiesIntroDto getRXRStrategiesIntroDto, GetRXRStrategiesBannerDto getRXRStrategiesBannerDto) {
        this(new Surrogate(account_number, getRXRStrategiesValuePropsDto, getRXRStrategiesIntroDto, getRXRStrategiesBannerDto));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
    }

    @Override // com.robinhood.idl.Dto
    public GetRXRStrategiesUpsellResponse toProto() {
        String account_number = this.surrogate.getAccount_number();
        GetRXRStrategiesValuePropsDto value_props = this.surrogate.getValue_props();
        GetRXRStrategiesValueProps proto = value_props != null ? value_props.toProto() : null;
        GetRXRStrategiesIntroDto intro = this.surrogate.getIntro();
        GetRXRStrategiesIntro proto2 = intro != null ? intro.toProto() : null;
        GetRXRStrategiesBannerDto banner = this.surrogate.getBanner();
        return new GetRXRStrategiesUpsellResponse(account_number, proto, proto2, banner != null ? banner.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[GetRXRStrategiesUpsellResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetRXRStrategiesUpsellResponseDto) && Intrinsics.areEqual(((GetRXRStrategiesUpsellResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetRXRStrategiesUpsellResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010%\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto$Surrogate;", "", "", "account_number", "Ladvisory/proto/v1/GetRXRStrategiesValuePropsDto;", "value_props", "Ladvisory/proto/v1/GetRXRStrategiesIntroDto;", "intro", "Ladvisory/proto/v1/GetRXRStrategiesBannerDto;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "<init>", "(Ljava/lang/String;Ladvisory/proto/v1/GetRXRStrategiesValuePropsDto;Ladvisory/proto/v1/GetRXRStrategiesIntroDto;Ladvisory/proto/v1/GetRXRStrategiesBannerDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ladvisory/proto/v1/GetRXRStrategiesValuePropsDto;Ladvisory/proto/v1/GetRXRStrategiesIntroDto;Ladvisory/proto/v1/GetRXRStrategiesBannerDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Ladvisory/proto/v1/GetRXRStrategiesValuePropsDto;", "getValue_props", "()Ladvisory/proto/v1/GetRXRStrategiesValuePropsDto;", "getValue_props$annotations", "Ladvisory/proto/v1/GetRXRStrategiesIntroDto;", "getIntro", "()Ladvisory/proto/v1/GetRXRStrategiesIntroDto;", "getIntro$annotations", "Ladvisory/proto/v1/GetRXRStrategiesBannerDto;", "getBanner", "()Ladvisory/proto/v1/GetRXRStrategiesBannerDto;", "getBanner$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final GetRXRStrategiesBannerDto banner;
        private final GetRXRStrategiesIntroDto intro;
        private final GetRXRStrategiesValuePropsDto value_props;

        public Surrogate() {
            this((String) null, (GetRXRStrategiesValuePropsDto) null, (GetRXRStrategiesIntroDto) null, (GetRXRStrategiesBannerDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.value_props, surrogate.value_props) && Intrinsics.areEqual(this.intro, surrogate.intro) && Intrinsics.areEqual(this.banner, surrogate.banner);
        }

        public int hashCode() {
            int iHashCode = this.account_number.hashCode() * 31;
            GetRXRStrategiesValuePropsDto getRXRStrategiesValuePropsDto = this.value_props;
            int iHashCode2 = (iHashCode + (getRXRStrategiesValuePropsDto == null ? 0 : getRXRStrategiesValuePropsDto.hashCode())) * 31;
            GetRXRStrategiesIntroDto getRXRStrategiesIntroDto = this.intro;
            int iHashCode3 = (iHashCode2 + (getRXRStrategiesIntroDto == null ? 0 : getRXRStrategiesIntroDto.hashCode())) * 31;
            GetRXRStrategiesBannerDto getRXRStrategiesBannerDto = this.banner;
            return iHashCode3 + (getRXRStrategiesBannerDto != null ? getRXRStrategiesBannerDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", value_props=" + this.value_props + ", intro=" + this.intro + ", banner=" + this.banner + ")";
        }

        /* compiled from: GetRXRStrategiesUpsellResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetRXRStrategiesUpsellResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, GetRXRStrategiesValuePropsDto getRXRStrategiesValuePropsDto, GetRXRStrategiesIntroDto getRXRStrategiesIntroDto, GetRXRStrategiesBannerDto getRXRStrategiesBannerDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.value_props = null;
            } else {
                this.value_props = getRXRStrategiesValuePropsDto;
            }
            if ((i & 4) == 0) {
                this.intro = null;
            } else {
                this.intro = getRXRStrategiesIntroDto;
            }
            if ((i & 8) == 0) {
                this.banner = null;
            } else {
                this.banner = getRXRStrategiesBannerDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            GetRXRStrategiesValuePropsDto getRXRStrategiesValuePropsDto = self.value_props;
            if (getRXRStrategiesValuePropsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, GetRXRStrategiesValuePropsDto.Serializer.INSTANCE, getRXRStrategiesValuePropsDto);
            }
            GetRXRStrategiesIntroDto getRXRStrategiesIntroDto = self.intro;
            if (getRXRStrategiesIntroDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, GetRXRStrategiesIntroDto.Serializer.INSTANCE, getRXRStrategiesIntroDto);
            }
            GetRXRStrategiesBannerDto getRXRStrategiesBannerDto = self.banner;
            if (getRXRStrategiesBannerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, GetRXRStrategiesBannerDto.Serializer.INSTANCE, getRXRStrategiesBannerDto);
            }
        }

        public Surrogate(String account_number, GetRXRStrategiesValuePropsDto getRXRStrategiesValuePropsDto, GetRXRStrategiesIntroDto getRXRStrategiesIntroDto, GetRXRStrategiesBannerDto getRXRStrategiesBannerDto) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            this.account_number = account_number;
            this.value_props = getRXRStrategiesValuePropsDto;
            this.intro = getRXRStrategiesIntroDto;
            this.banner = getRXRStrategiesBannerDto;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public /* synthetic */ Surrogate(String str, GetRXRStrategiesValuePropsDto getRXRStrategiesValuePropsDto, GetRXRStrategiesIntroDto getRXRStrategiesIntroDto, GetRXRStrategiesBannerDto getRXRStrategiesBannerDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : getRXRStrategiesValuePropsDto, (i & 4) != 0 ? null : getRXRStrategiesIntroDto, (i & 8) != 0 ? null : getRXRStrategiesBannerDto);
        }

        public final GetRXRStrategiesValuePropsDto getValue_props() {
            return this.value_props;
        }

        public final GetRXRStrategiesIntroDto getIntro() {
            return this.intro;
        }

        public final GetRXRStrategiesBannerDto getBanner() {
            return this.banner;
        }
    }

    /* compiled from: GetRXRStrategiesUpsellResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto;", "Ladvisory/proto/v1/GetRXRStrategiesUpsellResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetRXRStrategiesUpsellResponseDto, GetRXRStrategiesUpsellResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetRXRStrategiesUpsellResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetRXRStrategiesUpsellResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetRXRStrategiesUpsellResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetRXRStrategiesUpsellResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetRXRStrategiesUpsellResponse> getProtoAdapter() {
            return GetRXRStrategiesUpsellResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetRXRStrategiesUpsellResponseDto getZeroValue() {
            return GetRXRStrategiesUpsellResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetRXRStrategiesUpsellResponseDto fromProto(GetRXRStrategiesUpsellResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            GetRXRStrategiesValueProps value_props = proto.getValue_props();
            DefaultConstructorMarker defaultConstructorMarker = null;
            GetRXRStrategiesValuePropsDto getRXRStrategiesValuePropsDtoFromProto = value_props != null ? GetRXRStrategiesValuePropsDto.INSTANCE.fromProto(value_props) : null;
            GetRXRStrategiesIntro intro = proto.getIntro();
            GetRXRStrategiesIntroDto getRXRStrategiesIntroDtoFromProto = intro != null ? GetRXRStrategiesIntroDto.INSTANCE.fromProto(intro) : null;
            GetRXRStrategiesBanner banner = proto.getBanner();
            return new GetRXRStrategiesUpsellResponseDto(new Surrogate(account_number, getRXRStrategiesValuePropsDtoFromProto, getRXRStrategiesIntroDtoFromProto, banner != null ? GetRXRStrategiesBannerDto.INSTANCE.fromProto(banner) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetRXRStrategiesUpsellResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetRXRStrategiesUpsellResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetRXRStrategiesUpsellResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetRXRStrategiesUpsellResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetRXRStrategiesUpsellResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetRXRStrategiesUpsellResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetRXRStrategiesUpsellResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetRXRStrategiesUpsellResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetRXRStrategiesUpsellResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetRXRStrategiesUpsellResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetRXRStrategiesUpsellResponseDto";
        }
    }
}
