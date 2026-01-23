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
import rh_server_driven_ui.p531v1.UIComponent;
import rh_server_driven_ui.p531v1.UIComponentDto;
import ventures.trailer.proto.p551v1.PrivateCompanyAboutSectionDto;
import ventures.trailer.proto.p551v1.PrivateCompanyFundingSectionDto;
import ventures.trailer.proto.p551v1.PrivateCompanyValuationChartSectionDto;

/* compiled from: GetPrivateCompanyDetailResponseDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006,"}, m3636d2 = {"Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponse;", "Landroid/os/Parcelable;", "Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto$Surrogate;", "surrogate", "<init>", "(Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto$Surrogate;)V", "", "id", "parent_id", "Lventures/trailer/proto/v1/PrivateCompanyValuationChartSectionDto;", "valuation_chart_section", "Lventures/trailer/proto/v1/PrivateCompanyAboutSectionDto;", "about_section", "Lventures/trailer/proto/v1/PrivateCompanyFundingSectionDto;", "funding_section", "Lrh_server_driven_ui/v1/UIComponentDto;", "disclosure_component", "(Ljava/lang/String;Ljava/lang/String;Lventures/trailer/proto/v1/PrivateCompanyValuationChartSectionDto;Lventures/trailer/proto/v1/PrivateCompanyAboutSectionDto;Lventures/trailer/proto/v1/PrivateCompanyFundingSectionDto;Lrh_server_driven_ui/v1/UIComponentDto;)V", "toProto", "()Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public final class GetPrivateCompanyDetailResponseDto implements Dto3<GetPrivateCompanyDetailResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetPrivateCompanyDetailResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetPrivateCompanyDetailResponseDto, GetPrivateCompanyDetailResponse>> binaryBase64Serializer$delegate;
    private static final GetPrivateCompanyDetailResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetPrivateCompanyDetailResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetPrivateCompanyDetailResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ GetPrivateCompanyDetailResponseDto(String str, String str2, PrivateCompanyValuationChartSectionDto privateCompanyValuationChartSectionDto, PrivateCompanyAboutSectionDto privateCompanyAboutSectionDto, PrivateCompanyFundingSectionDto privateCompanyFundingSectionDto, UIComponentDto uIComponentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : privateCompanyValuationChartSectionDto, (i & 8) != 0 ? null : privateCompanyAboutSectionDto, (i & 16) != 0 ? null : privateCompanyFundingSectionDto, (i & 32) != 0 ? null : uIComponentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPrivateCompanyDetailResponseDto(String id, String parent_id, PrivateCompanyValuationChartSectionDto privateCompanyValuationChartSectionDto, PrivateCompanyAboutSectionDto privateCompanyAboutSectionDto, PrivateCompanyFundingSectionDto privateCompanyFundingSectionDto, UIComponentDto uIComponentDto) {
        this(new Surrogate(id, parent_id, privateCompanyValuationChartSectionDto, privateCompanyAboutSectionDto, privateCompanyFundingSectionDto, uIComponentDto));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parent_id, "parent_id");
    }

    @Override // com.robinhood.idl.Dto
    public GetPrivateCompanyDetailResponse toProto() {
        String id = this.surrogate.getId();
        String parent_id = this.surrogate.getParent_id();
        PrivateCompanyValuationChartSectionDto valuation_chart_section = this.surrogate.getValuation_chart_section();
        PrivateCompanyValuationChartSection proto = valuation_chart_section != null ? valuation_chart_section.toProto() : null;
        PrivateCompanyAboutSectionDto about_section = this.surrogate.getAbout_section();
        PrivateCompanyAboutSection proto2 = about_section != null ? about_section.toProto() : null;
        PrivateCompanyFundingSectionDto funding_section = this.surrogate.getFunding_section();
        PrivateCompanyFundingSection proto3 = funding_section != null ? funding_section.toProto() : null;
        UIComponentDto disclosure_component = this.surrogate.getDisclosure_component();
        return new GetPrivateCompanyDetailResponse(id, parent_id, proto, proto2, proto3, disclosure_component != null ? disclosure_component.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[GetPrivateCompanyDetailResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetPrivateCompanyDetailResponseDto) && Intrinsics.areEqual(((GetPrivateCompanyDetailResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetPrivateCompanyDetailResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b.\u0010(\u001a\u0004\b,\u0010-R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u0010(\u001a\u0004\b0\u00101R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b6\u0010(\u001a\u0004\b4\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010(\u001a\u0004\b8\u00109¨\u0006="}, m3636d2 = {"Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto$Surrogate;", "", "", "id", "parent_id", "Lventures/trailer/proto/v1/PrivateCompanyValuationChartSectionDto;", "valuation_chart_section", "Lventures/trailer/proto/v1/PrivateCompanyAboutSectionDto;", "about_section", "Lventures/trailer/proto/v1/PrivateCompanyFundingSectionDto;", "funding_section", "Lrh_server_driven_ui/v1/UIComponentDto;", "disclosure_component", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lventures/trailer/proto/v1/PrivateCompanyValuationChartSectionDto;Lventures/trailer/proto/v1/PrivateCompanyAboutSectionDto;Lventures/trailer/proto/v1/PrivateCompanyFundingSectionDto;Lrh_server_driven_ui/v1/UIComponentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lventures/trailer/proto/v1/PrivateCompanyValuationChartSectionDto;Lventures/trailer/proto/v1/PrivateCompanyAboutSectionDto;Lventures/trailer/proto/v1/PrivateCompanyFundingSectionDto;Lrh_server_driven_ui/v1/UIComponentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_ventures_proto_v1_externalRelease", "(Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getParent_id", "getParent_id$annotations", "Lventures/trailer/proto/v1/PrivateCompanyValuationChartSectionDto;", "getValuation_chart_section", "()Lventures/trailer/proto/v1/PrivateCompanyValuationChartSectionDto;", "getValuation_chart_section$annotations", "Lventures/trailer/proto/v1/PrivateCompanyAboutSectionDto;", "getAbout_section", "()Lventures/trailer/proto/v1/PrivateCompanyAboutSectionDto;", "getAbout_section$annotations", "Lventures/trailer/proto/v1/PrivateCompanyFundingSectionDto;", "getFunding_section", "()Lventures/trailer/proto/v1/PrivateCompanyFundingSectionDto;", "getFunding_section$annotations", "Lrh_server_driven_ui/v1/UIComponentDto;", "getDisclosure_component", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getDisclosure_component$annotations", "Companion", "$serializer", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final PrivateCompanyAboutSectionDto about_section;
        private final UIComponentDto disclosure_component;
        private final PrivateCompanyFundingSectionDto funding_section;
        private final String id;
        private final String parent_id;
        private final PrivateCompanyValuationChartSectionDto valuation_chart_section;

        public Surrogate() {
            this((String) null, (String) null, (PrivateCompanyValuationChartSectionDto) null, (PrivateCompanyAboutSectionDto) null, (PrivateCompanyFundingSectionDto) null, (UIComponentDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.parent_id, surrogate.parent_id) && Intrinsics.areEqual(this.valuation_chart_section, surrogate.valuation_chart_section) && Intrinsics.areEqual(this.about_section, surrogate.about_section) && Intrinsics.areEqual(this.funding_section, surrogate.funding_section) && Intrinsics.areEqual(this.disclosure_component, surrogate.disclosure_component);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.parent_id.hashCode()) * 31;
            PrivateCompanyValuationChartSectionDto privateCompanyValuationChartSectionDto = this.valuation_chart_section;
            int iHashCode2 = (iHashCode + (privateCompanyValuationChartSectionDto == null ? 0 : privateCompanyValuationChartSectionDto.hashCode())) * 31;
            PrivateCompanyAboutSectionDto privateCompanyAboutSectionDto = this.about_section;
            int iHashCode3 = (iHashCode2 + (privateCompanyAboutSectionDto == null ? 0 : privateCompanyAboutSectionDto.hashCode())) * 31;
            PrivateCompanyFundingSectionDto privateCompanyFundingSectionDto = this.funding_section;
            int iHashCode4 = (iHashCode3 + (privateCompanyFundingSectionDto == null ? 0 : privateCompanyFundingSectionDto.hashCode())) * 31;
            UIComponentDto uIComponentDto = this.disclosure_component;
            return iHashCode4 + (uIComponentDto != null ? uIComponentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", parent_id=" + this.parent_id + ", valuation_chart_section=" + this.valuation_chart_section + ", about_section=" + this.about_section + ", funding_section=" + this.funding_section + ", disclosure_component=" + this.disclosure_component + ")";
        }

        /* compiled from: GetPrivateCompanyDetailResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto$Surrogate;", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetPrivateCompanyDetailResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, PrivateCompanyValuationChartSectionDto privateCompanyValuationChartSectionDto, PrivateCompanyAboutSectionDto privateCompanyAboutSectionDto, PrivateCompanyFundingSectionDto privateCompanyFundingSectionDto, UIComponentDto uIComponentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.parent_id = "";
            } else {
                this.parent_id = str2;
            }
            if ((i & 4) == 0) {
                this.valuation_chart_section = null;
            } else {
                this.valuation_chart_section = privateCompanyValuationChartSectionDto;
            }
            if ((i & 8) == 0) {
                this.about_section = null;
            } else {
                this.about_section = privateCompanyAboutSectionDto;
            }
            if ((i & 16) == 0) {
                this.funding_section = null;
            } else {
                this.funding_section = privateCompanyFundingSectionDto;
            }
            if ((i & 32) == 0) {
                this.disclosure_component = null;
            } else {
                this.disclosure_component = uIComponentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_contracts_ventures_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.parent_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.parent_id);
            }
            PrivateCompanyValuationChartSectionDto privateCompanyValuationChartSectionDto = self.valuation_chart_section;
            if (privateCompanyValuationChartSectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, PrivateCompanyValuationChartSectionDto.Serializer.INSTANCE, privateCompanyValuationChartSectionDto);
            }
            PrivateCompanyAboutSectionDto privateCompanyAboutSectionDto = self.about_section;
            if (privateCompanyAboutSectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, PrivateCompanyAboutSectionDto.Serializer.INSTANCE, privateCompanyAboutSectionDto);
            }
            PrivateCompanyFundingSectionDto privateCompanyFundingSectionDto = self.funding_section;
            if (privateCompanyFundingSectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, PrivateCompanyFundingSectionDto.Serializer.INSTANCE, privateCompanyFundingSectionDto);
            }
            UIComponentDto uIComponentDto = self.disclosure_component;
            if (uIComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, UIComponentDto.Serializer.INSTANCE, uIComponentDto);
            }
        }

        public Surrogate(String id, String parent_id, PrivateCompanyValuationChartSectionDto privateCompanyValuationChartSectionDto, PrivateCompanyAboutSectionDto privateCompanyAboutSectionDto, PrivateCompanyFundingSectionDto privateCompanyFundingSectionDto, UIComponentDto uIComponentDto) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parent_id, "parent_id");
            this.id = id;
            this.parent_id = parent_id;
            this.valuation_chart_section = privateCompanyValuationChartSectionDto;
            this.about_section = privateCompanyAboutSectionDto;
            this.funding_section = privateCompanyFundingSectionDto;
            this.disclosure_component = uIComponentDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, PrivateCompanyValuationChartSectionDto privateCompanyValuationChartSectionDto, PrivateCompanyAboutSectionDto privateCompanyAboutSectionDto, PrivateCompanyFundingSectionDto privateCompanyFundingSectionDto, UIComponentDto uIComponentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : privateCompanyValuationChartSectionDto, (i & 8) != 0 ? null : privateCompanyAboutSectionDto, (i & 16) != 0 ? null : privateCompanyFundingSectionDto, (i & 32) != 0 ? null : uIComponentDto);
        }

        public final String getId() {
            return this.id;
        }

        public final String getParent_id() {
            return this.parent_id;
        }

        public final PrivateCompanyValuationChartSectionDto getValuation_chart_section() {
            return this.valuation_chart_section;
        }

        public final PrivateCompanyAboutSectionDto getAbout_section() {
            return this.about_section;
        }

        public final PrivateCompanyFundingSectionDto getFunding_section() {
            return this.funding_section;
        }

        public final UIComponentDto getDisclosure_component() {
            return this.disclosure_component;
        }
    }

    /* compiled from: GetPrivateCompanyDetailResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto;", "Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetPrivateCompanyDetailResponseDto, GetPrivateCompanyDetailResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetPrivateCompanyDetailResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetPrivateCompanyDetailResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetPrivateCompanyDetailResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetPrivateCompanyDetailResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetPrivateCompanyDetailResponse> getProtoAdapter() {
            return GetPrivateCompanyDetailResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetPrivateCompanyDetailResponseDto getZeroValue() {
            return GetPrivateCompanyDetailResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetPrivateCompanyDetailResponseDto fromProto(GetPrivateCompanyDetailResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String parent_id = proto.getParent_id();
            PrivateCompanyValuationChartSection valuation_chart_section = proto.getValuation_chart_section();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PrivateCompanyValuationChartSectionDto privateCompanyValuationChartSectionDtoFromProto = valuation_chart_section != null ? PrivateCompanyValuationChartSectionDto.INSTANCE.fromProto(valuation_chart_section) : null;
            PrivateCompanyAboutSection about_section = proto.getAbout_section();
            PrivateCompanyAboutSectionDto privateCompanyAboutSectionDtoFromProto = about_section != null ? PrivateCompanyAboutSectionDto.INSTANCE.fromProto(about_section) : null;
            PrivateCompanyFundingSection funding_section = proto.getFunding_section();
            PrivateCompanyFundingSectionDto privateCompanyFundingSectionDtoFromProto = funding_section != null ? PrivateCompanyFundingSectionDto.INSTANCE.fromProto(funding_section) : null;
            UIComponent disclosure_component = proto.getDisclosure_component();
            return new GetPrivateCompanyDetailResponseDto(new Surrogate(id, parent_id, privateCompanyValuationChartSectionDtoFromProto, privateCompanyAboutSectionDtoFromProto, privateCompanyFundingSectionDtoFromProto, disclosure_component != null ? UIComponentDto.INSTANCE.fromProto(disclosure_component) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: ventures.trailer.proto.v1.GetPrivateCompanyDetailResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetPrivateCompanyDetailResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetPrivateCompanyDetailResponseDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetPrivateCompanyDetailResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto;", "<init>", "()V", "surrogateSerializer", "Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetPrivateCompanyDetailResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ventures.trailer.proto.v1.GetPrivateCompanyDetailResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetPrivateCompanyDetailResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetPrivateCompanyDetailResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetPrivateCompanyDetailResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetPrivateCompanyDetailResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "ventures.trailer.proto.v1.GetPrivateCompanyDetailResponseDto";
        }
    }
}
