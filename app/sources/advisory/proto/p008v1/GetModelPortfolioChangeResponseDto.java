package advisory.proto.p008v1;

import advisory.proto.p008v1.ModelPortfolioChangeDetailsDto;
import advisory.proto.p008v1.ModelPortfolioNoChangeDetailsDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: GetModelPortfolioChangeResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005(')*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006,"}, m3636d2 = {"Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponse;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$Surrogate;)V", "", "account_number", "title", "subtitle", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto;", ErrorBundle.DETAIL_ENTRY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto;)V", "toProto", "()Ladvisory/proto/v1/GetModelPortfolioChangeResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$Surrogate;", "getTitle", "getSubtitle", "getDetails", "()Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto;", "Companion", "Surrogate", "DetailsDto", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class GetModelPortfolioChangeResponseDto implements Dto3<GetModelPortfolioChangeResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetModelPortfolioChangeResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetModelPortfolioChangeResponseDto, GetModelPortfolioChangeResponse>> binaryBase64Serializer$delegate;
    private static final GetModelPortfolioChangeResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetModelPortfolioChangeResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetModelPortfolioChangeResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final DetailsDto getDetails() {
        if (this.surrogate.getNo_change_details() != null) {
            return new DetailsDto.NoChangeDetails(this.surrogate.getNo_change_details());
        }
        if (this.surrogate.getChange_details() != null) {
            return new DetailsDto.ChangeDetails(this.surrogate.getChange_details());
        }
        return null;
    }

    public /* synthetic */ GetModelPortfolioChangeResponseDto(String str, String str2, String str3, DetailsDto detailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : detailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GetModelPortfolioChangeResponseDto(String account_number, String title, String subtitle, DetailsDto detailsDto) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        DetailsDto.NoChangeDetails noChangeDetails = detailsDto instanceof DetailsDto.NoChangeDetails ? (DetailsDto.NoChangeDetails) detailsDto : null;
        ModelPortfolioNoChangeDetailsDto value = noChangeDetails != null ? noChangeDetails.getValue() : null;
        DetailsDto.ChangeDetails changeDetails = detailsDto instanceof DetailsDto.ChangeDetails ? (DetailsDto.ChangeDetails) detailsDto : null;
        this(new Surrogate(account_number, title, subtitle, value, changeDetails != null ? changeDetails.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public GetModelPortfolioChangeResponse toProto() {
        String account_number = this.surrogate.getAccount_number();
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        ModelPortfolioNoChangeDetailsDto no_change_details = this.surrogate.getNo_change_details();
        ModelPortfolioNoChangeDetails proto = no_change_details != null ? no_change_details.toProto() : null;
        ModelPortfolioChangeDetailsDto change_details = this.surrogate.getChange_details();
        return new GetModelPortfolioChangeResponse(account_number, title, subtitle, proto, change_details != null ? change_details.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[GetModelPortfolioChangeResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetModelPortfolioChangeResponseDto) && Intrinsics.areEqual(((GetModelPortfolioChangeResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetModelPortfolioChangeResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010%\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$Surrogate;", "", "", "account_number", "title", "subtitle", "Ladvisory/proto/v1/ModelPortfolioNoChangeDetailsDto;", "no_change_details", "Ladvisory/proto/v1/ModelPortfolioChangeDetailsDto;", "change_details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/ModelPortfolioNoChangeDetailsDto;Ladvisory/proto/v1/ModelPortfolioChangeDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/ModelPortfolioNoChangeDetailsDto;Ladvisory/proto/v1/ModelPortfolioChangeDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Ladvisory/proto/v1/ModelPortfolioNoChangeDetailsDto;", "getNo_change_details", "()Ladvisory/proto/v1/ModelPortfolioNoChangeDetailsDto;", "getNo_change_details$annotations", "Ladvisory/proto/v1/ModelPortfolioChangeDetailsDto;", "getChange_details", "()Ladvisory/proto/v1/ModelPortfolioChangeDetailsDto;", "getChange_details$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final ModelPortfolioChangeDetailsDto change_details;
        private final ModelPortfolioNoChangeDetailsDto no_change_details;
        private final String subtitle;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (ModelPortfolioNoChangeDetailsDto) null, (ModelPortfolioChangeDetailsDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.no_change_details, surrogate.no_change_details) && Intrinsics.areEqual(this.change_details, surrogate.change_details);
        }

        public int hashCode() {
            int iHashCode = ((((this.account_number.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
            ModelPortfolioNoChangeDetailsDto modelPortfolioNoChangeDetailsDto = this.no_change_details;
            int iHashCode2 = (iHashCode + (modelPortfolioNoChangeDetailsDto == null ? 0 : modelPortfolioNoChangeDetailsDto.hashCode())) * 31;
            ModelPortfolioChangeDetailsDto modelPortfolioChangeDetailsDto = this.change_details;
            return iHashCode2 + (modelPortfolioChangeDetailsDto != null ? modelPortfolioChangeDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", title=" + this.title + ", subtitle=" + this.subtitle + ", no_change_details=" + this.no_change_details + ", change_details=" + this.change_details + ")";
        }

        /* compiled from: GetModelPortfolioChangeResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetModelPortfolioChangeResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, ModelPortfolioNoChangeDetailsDto modelPortfolioNoChangeDetailsDto, ModelPortfolioChangeDetailsDto modelPortfolioChangeDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str2;
            }
            if ((i & 4) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str3;
            }
            if ((i & 8) == 0) {
                this.no_change_details = null;
            } else {
                this.no_change_details = modelPortfolioNoChangeDetailsDto;
            }
            if ((i & 16) == 0) {
                this.change_details = null;
            } else {
                this.change_details = modelPortfolioChangeDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 1, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 2, self.subtitle);
            }
            ModelPortfolioNoChangeDetailsDto modelPortfolioNoChangeDetailsDto = self.no_change_details;
            if (modelPortfolioNoChangeDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ModelPortfolioNoChangeDetailsDto.Serializer.INSTANCE, modelPortfolioNoChangeDetailsDto);
            }
            ModelPortfolioChangeDetailsDto modelPortfolioChangeDetailsDto = self.change_details;
            if (modelPortfolioChangeDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ModelPortfolioChangeDetailsDto.Serializer.INSTANCE, modelPortfolioChangeDetailsDto);
            }
        }

        public Surrogate(String account_number, String title, String subtitle, ModelPortfolioNoChangeDetailsDto modelPortfolioNoChangeDetailsDto, ModelPortfolioChangeDetailsDto modelPortfolioChangeDetailsDto) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.account_number = account_number;
            this.title = title;
            this.subtitle = subtitle;
            this.no_change_details = modelPortfolioNoChangeDetailsDto;
            this.change_details = modelPortfolioChangeDetailsDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, ModelPortfolioNoChangeDetailsDto modelPortfolioNoChangeDetailsDto, ModelPortfolioChangeDetailsDto modelPortfolioChangeDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : modelPortfolioNoChangeDetailsDto, (i & 16) != 0 ? null : modelPortfolioChangeDetailsDto);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final ModelPortfolioNoChangeDetailsDto getNo_change_details() {
            return this.no_change_details;
        }

        public final ModelPortfolioChangeDetailsDto getChange_details() {
            return this.change_details;
        }
    }

    /* compiled from: GetModelPortfolioChangeResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetModelPortfolioChangeResponseDto, GetModelPortfolioChangeResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetModelPortfolioChangeResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetModelPortfolioChangeResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetModelPortfolioChangeResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetModelPortfolioChangeResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetModelPortfolioChangeResponse> getProtoAdapter() {
            return GetModelPortfolioChangeResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetModelPortfolioChangeResponseDto getZeroValue() {
            return GetModelPortfolioChangeResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetModelPortfolioChangeResponseDto fromProto(GetModelPortfolioChangeResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            ModelPortfolioNoChangeDetails no_change_details = proto.getNo_change_details();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ModelPortfolioNoChangeDetailsDto modelPortfolioNoChangeDetailsDtoFromProto = no_change_details != null ? ModelPortfolioNoChangeDetailsDto.INSTANCE.fromProto(no_change_details) : null;
            ModelPortfolioChangeDetails change_details = proto.getChange_details();
            return new GetModelPortfolioChangeResponseDto(new Surrogate(account_number, title, subtitle, modelPortfolioNoChangeDetailsDtoFromProto, change_details != null ? ModelPortfolioChangeDetailsDto.INSTANCE.fromProto(change_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetModelPortfolioChangeResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetModelPortfolioChangeResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetModelPortfolioChangeResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetModelPortfolioChangeResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "NoChangeDetails", "ChangeDetails", "Companion", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto$ChangeDetails;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto$NoChangeDetails;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: GetModelPortfolioChangeResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto$NoChangeDetails;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto;", "Ladvisory/proto/v1/ModelPortfolioNoChangeDetailsDto;", "value", "<init>", "(Ladvisory/proto/v1/ModelPortfolioNoChangeDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/ModelPortfolioNoChangeDetailsDto;", "getValue", "()Ladvisory/proto/v1/ModelPortfolioNoChangeDetailsDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoChangeDetails extends DetailsDto {
            private final ModelPortfolioNoChangeDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoChangeDetails) && Intrinsics.areEqual(this.value, ((NoChangeDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NoChangeDetails(value=" + this.value + ")";
            }

            public final ModelPortfolioNoChangeDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoChangeDetails(ModelPortfolioNoChangeDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetModelPortfolioChangeResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto$ChangeDetails;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto;", "Ladvisory/proto/v1/ModelPortfolioChangeDetailsDto;", "value", "<init>", "(Ladvisory/proto/v1/ModelPortfolioChangeDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/ModelPortfolioChangeDetailsDto;", "getValue", "()Ladvisory/proto/v1/ModelPortfolioChangeDetailsDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ChangeDetails extends DetailsDto {
            private final ModelPortfolioChangeDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ChangeDetails) && Intrinsics.areEqual(this.value, ((ChangeDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ChangeDetails(value=" + this.value + ")";
            }

            public final ModelPortfolioChangeDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChangeDetails(ModelPortfolioChangeDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetModelPortfolioChangeResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$DetailsDto;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DetailsDto, GetModelPortfolioChangeResponse> {
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
            public ProtoAdapter<GetModelPortfolioChangeResponse> getProtoAdapter() {
                return GetModelPortfolioChangeResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DetailsDto fromProto(GetModelPortfolioChangeResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getNo_change_details() != null) {
                    return new NoChangeDetails(ModelPortfolioNoChangeDetailsDto.INSTANCE.fromProto(proto.getNo_change_details()));
                }
                if (proto.getChange_details() != null) {
                    return new ChangeDetails(ModelPortfolioChangeDetailsDto.INSTANCE.fromProto(proto.getChange_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: GetModelPortfolioChangeResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetModelPortfolioChangeResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetModelPortfolioChangeResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetModelPortfolioChangeResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetModelPortfolioChangeResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetModelPortfolioChangeResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetModelPortfolioChangeResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetModelPortfolioChangeResponseDto";
        }
    }
}
