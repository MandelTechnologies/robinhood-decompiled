package advisory.proto.p008v1;

import advisory.proto.p008v1.TaxLossHarvestChooseAccountsDto;
import advisory.proto.p008v1.TaxLossHarvestStrategiesIntroDto;
import advisory.proto.p008v1.TaxLossHarvestStrategiesLoadingDto;
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

/* compiled from: GetTaxLossHarvestFlowResponseDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetTaxLossHarvestFlowResponse;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto$Surrogate;)V", "Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;", "intro", "Ladvisory/proto/v1/TaxLossHarvestChooseAccountsDto;", "choose_accounts", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;", "loading", "(Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;Ladvisory/proto/v1/TaxLossHarvestChooseAccountsDto;Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;)V", "toProto", "()Ladvisory/proto/v1/GetTaxLossHarvestFlowResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto$Surrogate;", "getIntro", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;", "getChoose_accounts", "()Ladvisory/proto/v1/TaxLossHarvestChooseAccountsDto;", "getLoading", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class GetTaxLossHarvestFlowResponseDto implements Dto3<GetTaxLossHarvestFlowResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetTaxLossHarvestFlowResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetTaxLossHarvestFlowResponseDto, GetTaxLossHarvestFlowResponse>> binaryBase64Serializer$delegate;
    private static final GetTaxLossHarvestFlowResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetTaxLossHarvestFlowResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetTaxLossHarvestFlowResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TaxLossHarvestStrategiesIntroDto getIntro() {
        return this.surrogate.getIntro();
    }

    public final TaxLossHarvestChooseAccountsDto getChoose_accounts() {
        return this.surrogate.getChoose_accounts();
    }

    public final TaxLossHarvestStrategiesLoadingDto getLoading() {
        return this.surrogate.getLoading();
    }

    public /* synthetic */ GetTaxLossHarvestFlowResponseDto(TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto, TaxLossHarvestChooseAccountsDto taxLossHarvestChooseAccountsDto, TaxLossHarvestStrategiesLoadingDto taxLossHarvestStrategiesLoadingDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : taxLossHarvestStrategiesIntroDto, (i & 2) != 0 ? null : taxLossHarvestChooseAccountsDto, (i & 4) != 0 ? null : taxLossHarvestStrategiesLoadingDto);
    }

    public GetTaxLossHarvestFlowResponseDto(TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto, TaxLossHarvestChooseAccountsDto taxLossHarvestChooseAccountsDto, TaxLossHarvestStrategiesLoadingDto taxLossHarvestStrategiesLoadingDto) {
        this(new Surrogate(taxLossHarvestStrategiesIntroDto, taxLossHarvestChooseAccountsDto, taxLossHarvestStrategiesLoadingDto));
    }

    @Override // com.robinhood.idl.Dto
    public GetTaxLossHarvestFlowResponse toProto() {
        TaxLossHarvestStrategiesIntroDto intro = this.surrogate.getIntro();
        TaxLossHarvestStrategiesIntro proto = intro != null ? intro.toProto() : null;
        TaxLossHarvestChooseAccountsDto choose_accounts = this.surrogate.getChoose_accounts();
        TaxLossHarvestChooseAccounts proto2 = choose_accounts != null ? choose_accounts.toProto() : null;
        TaxLossHarvestStrategiesLoadingDto loading = this.surrogate.getLoading();
        return new GetTaxLossHarvestFlowResponse(proto, proto2, loading != null ? loading.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[GetTaxLossHarvestFlowResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetTaxLossHarvestFlowResponseDto) && Intrinsics.areEqual(((GetTaxLossHarvestFlowResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetTaxLossHarvestFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto$Surrogate;", "", "Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;", "intro", "Ladvisory/proto/v1/TaxLossHarvestChooseAccountsDto;", "choose_accounts", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;", "loading", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;Ladvisory/proto/v1/TaxLossHarvestChooseAccountsDto;Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;Ladvisory/proto/v1/TaxLossHarvestChooseAccountsDto;Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;", "getIntro", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;", "getIntro$annotations", "()V", "Ladvisory/proto/v1/TaxLossHarvestChooseAccountsDto;", "getChoose_accounts", "()Ladvisory/proto/v1/TaxLossHarvestChooseAccountsDto;", "getChoose_accounts$annotations", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;", "getLoading", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;", "getLoading$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TaxLossHarvestChooseAccountsDto choose_accounts;
        private final TaxLossHarvestStrategiesIntroDto intro;
        private final TaxLossHarvestStrategiesLoadingDto loading;

        public Surrogate() {
            this((TaxLossHarvestStrategiesIntroDto) null, (TaxLossHarvestChooseAccountsDto) null, (TaxLossHarvestStrategiesLoadingDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.intro, surrogate.intro) && Intrinsics.areEqual(this.choose_accounts, surrogate.choose_accounts) && Intrinsics.areEqual(this.loading, surrogate.loading);
        }

        public int hashCode() {
            TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto = this.intro;
            int iHashCode = (taxLossHarvestStrategiesIntroDto == null ? 0 : taxLossHarvestStrategiesIntroDto.hashCode()) * 31;
            TaxLossHarvestChooseAccountsDto taxLossHarvestChooseAccountsDto = this.choose_accounts;
            int iHashCode2 = (iHashCode + (taxLossHarvestChooseAccountsDto == null ? 0 : taxLossHarvestChooseAccountsDto.hashCode())) * 31;
            TaxLossHarvestStrategiesLoadingDto taxLossHarvestStrategiesLoadingDto = this.loading;
            return iHashCode2 + (taxLossHarvestStrategiesLoadingDto != null ? taxLossHarvestStrategiesLoadingDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(intro=" + this.intro + ", choose_accounts=" + this.choose_accounts + ", loading=" + this.loading + ")";
        }

        /* compiled from: GetTaxLossHarvestFlowResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetTaxLossHarvestFlowResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto, TaxLossHarvestChooseAccountsDto taxLossHarvestChooseAccountsDto, TaxLossHarvestStrategiesLoadingDto taxLossHarvestStrategiesLoadingDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.intro = null;
            } else {
                this.intro = taxLossHarvestStrategiesIntroDto;
            }
            if ((i & 2) == 0) {
                this.choose_accounts = null;
            } else {
                this.choose_accounts = taxLossHarvestChooseAccountsDto;
            }
            if ((i & 4) == 0) {
                this.loading = null;
            } else {
                this.loading = taxLossHarvestStrategiesLoadingDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto = self.intro;
            if (taxLossHarvestStrategiesIntroDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, TaxLossHarvestStrategiesIntroDto.Serializer.INSTANCE, taxLossHarvestStrategiesIntroDto);
            }
            TaxLossHarvestChooseAccountsDto taxLossHarvestChooseAccountsDto = self.choose_accounts;
            if (taxLossHarvestChooseAccountsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TaxLossHarvestChooseAccountsDto.Serializer.INSTANCE, taxLossHarvestChooseAccountsDto);
            }
            TaxLossHarvestStrategiesLoadingDto taxLossHarvestStrategiesLoadingDto = self.loading;
            if (taxLossHarvestStrategiesLoadingDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TaxLossHarvestStrategiesLoadingDto.Serializer.INSTANCE, taxLossHarvestStrategiesLoadingDto);
            }
        }

        public Surrogate(TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto, TaxLossHarvestChooseAccountsDto taxLossHarvestChooseAccountsDto, TaxLossHarvestStrategiesLoadingDto taxLossHarvestStrategiesLoadingDto) {
            this.intro = taxLossHarvestStrategiesIntroDto;
            this.choose_accounts = taxLossHarvestChooseAccountsDto;
            this.loading = taxLossHarvestStrategiesLoadingDto;
        }

        public /* synthetic */ Surrogate(TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto, TaxLossHarvestChooseAccountsDto taxLossHarvestChooseAccountsDto, TaxLossHarvestStrategiesLoadingDto taxLossHarvestStrategiesLoadingDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : taxLossHarvestStrategiesIntroDto, (i & 2) != 0 ? null : taxLossHarvestChooseAccountsDto, (i & 4) != 0 ? null : taxLossHarvestStrategiesLoadingDto);
        }

        public final TaxLossHarvestStrategiesIntroDto getIntro() {
            return this.intro;
        }

        public final TaxLossHarvestChooseAccountsDto getChoose_accounts() {
            return this.choose_accounts;
        }

        public final TaxLossHarvestStrategiesLoadingDto getLoading() {
            return this.loading;
        }
    }

    /* compiled from: GetTaxLossHarvestFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto;", "Ladvisory/proto/v1/GetTaxLossHarvestFlowResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetTaxLossHarvestFlowResponseDto, GetTaxLossHarvestFlowResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetTaxLossHarvestFlowResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxLossHarvestFlowResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxLossHarvestFlowResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetTaxLossHarvestFlowResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetTaxLossHarvestFlowResponse> getProtoAdapter() {
            return GetTaxLossHarvestFlowResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxLossHarvestFlowResponseDto getZeroValue() {
            return GetTaxLossHarvestFlowResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxLossHarvestFlowResponseDto fromProto(GetTaxLossHarvestFlowResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            TaxLossHarvestStrategiesIntro intro = proto.getIntro();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDtoFromProto = intro != null ? TaxLossHarvestStrategiesIntroDto.INSTANCE.fromProto(intro) : null;
            TaxLossHarvestChooseAccounts choose_accounts = proto.getChoose_accounts();
            TaxLossHarvestChooseAccountsDto taxLossHarvestChooseAccountsDtoFromProto = choose_accounts != null ? TaxLossHarvestChooseAccountsDto.INSTANCE.fromProto(choose_accounts) : null;
            TaxLossHarvestStrategiesLoading loading = proto.getLoading();
            return new GetTaxLossHarvestFlowResponseDto(new Surrogate(taxLossHarvestStrategiesIntroDtoFromProto, taxLossHarvestChooseAccountsDtoFromProto, loading != null ? TaxLossHarvestStrategiesLoadingDto.INSTANCE.fromProto(loading) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetTaxLossHarvestFlowResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTaxLossHarvestFlowResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetTaxLossHarvestFlowResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetTaxLossHarvestFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetTaxLossHarvestFlowResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetTaxLossHarvestFlowResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetTaxLossHarvestFlowResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetTaxLossHarvestFlowResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetTaxLossHarvestFlowResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetTaxLossHarvestFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetTaxLossHarvestFlowResponseDto";
        }
    }
}
