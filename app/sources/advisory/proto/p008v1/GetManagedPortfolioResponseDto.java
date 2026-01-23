package advisory.proto.p008v1;

import advisory.proto.p008v1.AccountStateDto;
import advisory.proto.p008v1.BreakdownUnitDto;
import advisory.proto.p008v1.ManagedPortfolioDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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

/* compiled from: GetManagedPortfolioResponseDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetManagedPortfolioResponse;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetManagedPortfolioResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetManagedPortfolioResponseDto$Surrogate;)V", "", "account_number", "Ladvisory/proto/v1/ManagedPortfolioDto;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Ladvisory/proto/v1/AccountStateDto;", "state", "disclosure_text", "Ladvisory/proto/v1/BreakdownUnitDto;", "default_breakdown_unit", "(Ljava/lang/String;Ladvisory/proto/v1/ManagedPortfolioDto;Ladvisory/proto/v1/AccountStateDto;Ljava/lang/String;Ladvisory/proto/v1/BreakdownUnitDto;)V", "toProto", "()Ladvisory/proto/v1/GetManagedPortfolioResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetManagedPortfolioResponseDto$Surrogate;", "getAccount_number", "getPortfolio", "()Ladvisory/proto/v1/ManagedPortfolioDto;", "getState", "()Ladvisory/proto/v1/AccountStateDto;", "getDisclosure_text", "getDefault_breakdown_unit", "()Ladvisory/proto/v1/BreakdownUnitDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class GetManagedPortfolioResponseDto implements Dto3<GetManagedPortfolioResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetManagedPortfolioResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetManagedPortfolioResponseDto, GetManagedPortfolioResponse>> binaryBase64Serializer$delegate;
    private static final GetManagedPortfolioResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetManagedPortfolioResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetManagedPortfolioResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final ManagedPortfolioDto getPortfolio() {
        return this.surrogate.getPortfolio();
    }

    public final AccountStateDto getState() {
        return this.surrogate.getState();
    }

    public final String getDisclosure_text() {
        return this.surrogate.getDisclosure_text();
    }

    public final BreakdownUnitDto getDefault_breakdown_unit() {
        return this.surrogate.getDefault_breakdown_unit();
    }

    public /* synthetic */ GetManagedPortfolioResponseDto(String str, ManagedPortfolioDto managedPortfolioDto, AccountStateDto accountStateDto, String str2, BreakdownUnitDto breakdownUnitDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : managedPortfolioDto, (i & 4) != 0 ? AccountStateDto.INSTANCE.getZeroValue() : accountStateDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? BreakdownUnitDto.INSTANCE.getZeroValue() : breakdownUnitDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetManagedPortfolioResponseDto(String account_number, ManagedPortfolioDto managedPortfolioDto, AccountStateDto state, String str, BreakdownUnitDto default_breakdown_unit) {
        this(new Surrogate(account_number, managedPortfolioDto, state, str, default_breakdown_unit));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(default_breakdown_unit, "default_breakdown_unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetManagedPortfolioResponse toProto() {
        String account_number = this.surrogate.getAccount_number();
        ManagedPortfolioDto portfolio = this.surrogate.getPortfolio();
        return new GetManagedPortfolioResponse(account_number, portfolio != null ? portfolio.toProto() : null, (AccountState) this.surrogate.getState().toProto(), this.surrogate.getDisclosure_text(), (BreakdownUnit) this.surrogate.getDefault_breakdown_unit().toProto(), null, 32, null);
    }

    public String toString() {
        return "[GetManagedPortfolioResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetManagedPortfolioResponseDto) && Intrinsics.areEqual(((GetManagedPortfolioResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetManagedPortfolioResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010\u001cR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010&\u001a\u0004\b2\u00103¨\u00067"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioResponseDto$Surrogate;", "", "", "account_number", "Ladvisory/proto/v1/ManagedPortfolioDto;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Ladvisory/proto/v1/AccountStateDto;", "state", "disclosure_text", "Ladvisory/proto/v1/BreakdownUnitDto;", "default_breakdown_unit", "<init>", "(Ljava/lang/String;Ladvisory/proto/v1/ManagedPortfolioDto;Ladvisory/proto/v1/AccountStateDto;Ljava/lang/String;Ladvisory/proto/v1/BreakdownUnitDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ladvisory/proto/v1/ManagedPortfolioDto;Ladvisory/proto/v1/AccountStateDto;Ljava/lang/String;Ladvisory/proto/v1/BreakdownUnitDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetManagedPortfolioResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Ladvisory/proto/v1/ManagedPortfolioDto;", "getPortfolio", "()Ladvisory/proto/v1/ManagedPortfolioDto;", "getPortfolio$annotations", "Ladvisory/proto/v1/AccountStateDto;", "getState", "()Ladvisory/proto/v1/AccountStateDto;", "getState$annotations", "getDisclosure_text", "getDisclosure_text$annotations", "Ladvisory/proto/v1/BreakdownUnitDto;", "getDefault_breakdown_unit", "()Ladvisory/proto/v1/BreakdownUnitDto;", "getDefault_breakdown_unit$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final BreakdownUnitDto default_breakdown_unit;
        private final String disclosure_text;
        private final ManagedPortfolioDto portfolio;
        private final AccountStateDto state;

        public Surrogate() {
            this((String) null, (ManagedPortfolioDto) null, (AccountStateDto) null, (String) null, (BreakdownUnitDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.portfolio, surrogate.portfolio) && this.state == surrogate.state && Intrinsics.areEqual(this.disclosure_text, surrogate.disclosure_text) && this.default_breakdown_unit == surrogate.default_breakdown_unit;
        }

        public int hashCode() {
            int iHashCode = this.account_number.hashCode() * 31;
            ManagedPortfolioDto managedPortfolioDto = this.portfolio;
            int iHashCode2 = (((iHashCode + (managedPortfolioDto == null ? 0 : managedPortfolioDto.hashCode())) * 31) + this.state.hashCode()) * 31;
            String str = this.disclosure_text;
            return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.default_breakdown_unit.hashCode();
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", portfolio=" + this.portfolio + ", state=" + this.state + ", disclosure_text=" + this.disclosure_text + ", default_breakdown_unit=" + this.default_breakdown_unit + ")";
        }

        /* compiled from: GetManagedPortfolioResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetManagedPortfolioResponseDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetManagedPortfolioResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ManagedPortfolioDto managedPortfolioDto, AccountStateDto accountStateDto, String str2, BreakdownUnitDto breakdownUnitDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.portfolio = null;
            } else {
                this.portfolio = managedPortfolioDto;
            }
            if ((i & 4) == 0) {
                this.state = AccountStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = accountStateDto;
            }
            if ((i & 8) == 0) {
                this.disclosure_text = null;
            } else {
                this.disclosure_text = str2;
            }
            if ((i & 16) == 0) {
                this.default_breakdown_unit = BreakdownUnitDto.INSTANCE.getZeroValue();
            } else {
                this.default_breakdown_unit = breakdownUnitDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            ManagedPortfolioDto managedPortfolioDto = self.portfolio;
            if (managedPortfolioDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ManagedPortfolioDto.Serializer.INSTANCE, managedPortfolioDto);
            }
            if (self.state != AccountStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, AccountStateDto.Serializer.INSTANCE, self.state);
            }
            String str = self.disclosure_text;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            if (self.default_breakdown_unit != BreakdownUnitDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, BreakdownUnitDto.Serializer.INSTANCE, self.default_breakdown_unit);
            }
        }

        public Surrogate(String account_number, ManagedPortfolioDto managedPortfolioDto, AccountStateDto state, String str, BreakdownUnitDto default_breakdown_unit) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(default_breakdown_unit, "default_breakdown_unit");
            this.account_number = account_number;
            this.portfolio = managedPortfolioDto;
            this.state = state;
            this.disclosure_text = str;
            this.default_breakdown_unit = default_breakdown_unit;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public /* synthetic */ Surrogate(String str, ManagedPortfolioDto managedPortfolioDto, AccountStateDto accountStateDto, String str2, BreakdownUnitDto breakdownUnitDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : managedPortfolioDto, (i & 4) != 0 ? AccountStateDto.INSTANCE.getZeroValue() : accountStateDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? BreakdownUnitDto.INSTANCE.getZeroValue() : breakdownUnitDto);
        }

        public final ManagedPortfolioDto getPortfolio() {
            return this.portfolio;
        }

        public final AccountStateDto getState() {
            return this.state;
        }

        public final String getDisclosure_text() {
            return this.disclosure_text;
        }

        public final BreakdownUnitDto getDefault_breakdown_unit() {
            return this.default_breakdown_unit;
        }
    }

    /* compiled from: GetManagedPortfolioResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetManagedPortfolioResponseDto;", "Ladvisory/proto/v1/GetManagedPortfolioResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetManagedPortfolioResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetManagedPortfolioResponseDto, GetManagedPortfolioResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetManagedPortfolioResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetManagedPortfolioResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetManagedPortfolioResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetManagedPortfolioResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetManagedPortfolioResponse> getProtoAdapter() {
            return GetManagedPortfolioResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetManagedPortfolioResponseDto getZeroValue() {
            return GetManagedPortfolioResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetManagedPortfolioResponseDto fromProto(GetManagedPortfolioResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            ManagedPortfolio portfolio = proto.getPortfolio();
            return new GetManagedPortfolioResponseDto(new Surrogate(account_number, portfolio != null ? ManagedPortfolioDto.INSTANCE.fromProto(portfolio) : null, AccountStateDto.INSTANCE.fromProto(proto.getState()), proto.getDisclosure_text(), BreakdownUnitDto.INSTANCE.fromProto(proto.getDefault_breakdown_unit())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetManagedPortfolioResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetManagedPortfolioResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetManagedPortfolioResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetManagedPortfolioResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetManagedPortfolioResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetManagedPortfolioResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public static final class Serializer implements KSerializer<GetManagedPortfolioResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetManagedPortfolioResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetManagedPortfolioResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetManagedPortfolioResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetManagedPortfolioResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetManagedPortfolioResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetManagedPortfolioResponseDto";
        }
    }
}
