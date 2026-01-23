package microgram.contracts.mcw_cash_balances.proto.p497v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
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
import microgram.contracts.mcw_cash_balances.proto.p497v1.CtaDto;

/* compiled from: GetCashBalancesDetailsPageFooterResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\"¨\u0006("}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto$Surrogate;)V", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "(Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;)V", "toProto", "()Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto$Surrogate;", "getPrimary_cta", "()Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;", "getSecondary_cta", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class GetCashBalancesDetailsPageFooterResponseDto implements Dto3<GetCashBalancesDetailsPageFooterResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCashBalancesDetailsPageFooterResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCashBalancesDetailsPageFooterResponseDto, GetCashBalancesDetailsPageFooterResponse>> binaryBase64Serializer$delegate;
    private static final GetCashBalancesDetailsPageFooterResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCashBalancesDetailsPageFooterResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCashBalancesDetailsPageFooterResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CtaDto getPrimary_cta() {
        return this.surrogate.getPrimary_cta();
    }

    public final CtaDto getSecondary_cta() {
        return this.surrogate.getSecondary_cta();
    }

    public GetCashBalancesDetailsPageFooterResponseDto(CtaDto ctaDto, CtaDto ctaDto2) {
        this(new Surrogate(ctaDto, ctaDto2));
    }

    public /* synthetic */ GetCashBalancesDetailsPageFooterResponseDto(CtaDto ctaDto, CtaDto ctaDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ctaDto, (i & 2) != 0 ? null : ctaDto2);
    }

    @Override // com.robinhood.idl.Dto
    public GetCashBalancesDetailsPageFooterResponse toProto() {
        CtaDto primary_cta = this.surrogate.getPrimary_cta();
        Cta proto = primary_cta != null ? primary_cta.toProto() : null;
        CtaDto secondary_cta = this.surrogate.getSecondary_cta();
        return new GetCashBalancesDetailsPageFooterResponse(proto, secondary_cta != null ? secondary_cta.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[GetCashBalancesDetailsPageFooterResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCashBalancesDetailsPageFooterResponseDto) && Intrinsics.areEqual(((GetCashBalancesDetailsPageFooterResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCashBalancesDetailsPageFooterResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 ¨\u0006'"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto$Surrogate;", "", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "<init>", "(Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_mcw_cash_balances_proto_v1_externalRelease", "(Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;", "getPrimary_cta", "()Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;", "getPrimary_cta$annotations", "()V", "getSecondary_cta", "getSecondary_cta$annotations", "Companion", "$serializer", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CtaDto primary_cta;
        private final CtaDto secondary_cta;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((CtaDto) null, (CtaDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.primary_cta, surrogate.primary_cta) && Intrinsics.areEqual(this.secondary_cta, surrogate.secondary_cta);
        }

        public int hashCode() {
            CtaDto ctaDto = this.primary_cta;
            int iHashCode = (ctaDto == null ? 0 : ctaDto.hashCode()) * 31;
            CtaDto ctaDto2 = this.secondary_cta;
            return iHashCode + (ctaDto2 != null ? ctaDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(primary_cta=" + this.primary_cta + ", secondary_cta=" + this.secondary_cta + ")";
        }

        /* compiled from: GetCashBalancesDetailsPageFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto$Surrogate;", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCashBalancesDetailsPageFooterResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CtaDto ctaDto, CtaDto ctaDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.primary_cta = null;
            } else {
                this.primary_cta = ctaDto;
            }
            if ((i & 2) == 0) {
                this.secondary_cta = null;
            } else {
                this.secondary_cta = ctaDto2;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_mcw_cash_balances_proto_v1_externalRelease */
        public static final /* synthetic */ void m3775xb0f71e1e(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            CtaDto ctaDto = self.primary_cta;
            if (ctaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, CtaDto.Serializer.INSTANCE, ctaDto);
            }
            CtaDto ctaDto2 = self.secondary_cta;
            if (ctaDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CtaDto.Serializer.INSTANCE, ctaDto2);
            }
        }

        public Surrogate(CtaDto ctaDto, CtaDto ctaDto2) {
            this.primary_cta = ctaDto;
            this.secondary_cta = ctaDto2;
        }

        public /* synthetic */ Surrogate(CtaDto ctaDto, CtaDto ctaDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ctaDto, (i & 2) != 0 ? null : ctaDto2);
        }

        public final CtaDto getPrimary_cta() {
            return this.primary_cta;
        }

        public final CtaDto getSecondary_cta() {
            return this.secondary_cta;
        }
    }

    /* compiled from: GetCashBalancesDetailsPageFooterResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCashBalancesDetailsPageFooterResponseDto, GetCashBalancesDetailsPageFooterResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCashBalancesDetailsPageFooterResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCashBalancesDetailsPageFooterResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCashBalancesDetailsPageFooterResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCashBalancesDetailsPageFooterResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCashBalancesDetailsPageFooterResponse> getProtoAdapter() {
            return GetCashBalancesDetailsPageFooterResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCashBalancesDetailsPageFooterResponseDto getZeroValue() {
            return GetCashBalancesDetailsPageFooterResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCashBalancesDetailsPageFooterResponseDto fromProto(GetCashBalancesDetailsPageFooterResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Cta primary_cta = proto.getPrimary_cta();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CtaDto ctaDtoFromProto = primary_cta != null ? CtaDto.INSTANCE.fromProto(primary_cta) : null;
            Cta secondary_cta = proto.getSecondary_cta();
            return new GetCashBalancesDetailsPageFooterResponseDto(new Surrogate(ctaDtoFromProto, secondary_cta != null ? CtaDto.INSTANCE.fromProto(secondary_cta) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.mcw_cash_balances.proto.v1.GetCashBalancesDetailsPageFooterResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCashBalancesDetailsPageFooterResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetCashBalancesDetailsPageFooterResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCashBalancesDetailsPageFooterResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCashBalancesDetailsPageFooterResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.mcw_cash_balances.proto.v1.GetCashBalancesDetailsPageFooterResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCashBalancesDetailsPageFooterResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCashBalancesDetailsPageFooterResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCashBalancesDetailsPageFooterResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetCashBalancesDetailsPageFooterResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "microgram.contracts.mcw_cash_balances.proto.v1.GetCashBalancesDetailsPageFooterResponseDto";
        }
    }
}
