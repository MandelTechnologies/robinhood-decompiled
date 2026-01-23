package bonfire.proto.idl.portfolio.p037v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.portfolio.p037v1.PositionDetailChartTypeDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.common.CurrencyDto;
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

/* compiled from: GetAccountPositionDetailsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041023B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequest;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto$Surrogate;)V", "", "account_number", "instrument_id", "display_type", "position_instrument_type", "instrument_type", "Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;", "chart_type", "Lcom/robinhood/rosetta/common/CurrencyDto;", "display_currency", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;Lcom/robinhood/rosetta/common/CurrencyDto;)V", "toProto", "()Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto$Surrogate;", "getAccount_number", "getInstrument_id", "getDisplay_type", "getPosition_instrument_type", "getInstrument_type", "getChart_type", "()Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;", "getDisplay_currency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetAccountPositionDetailsRequestDto implements Dto3<GetAccountPositionDetailsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAccountPositionDetailsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAccountPositionDetailsRequestDto, GetAccountPositionDetailsRequest>> binaryBase64Serializer$delegate;
    private static final GetAccountPositionDetailsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAccountPositionDetailsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAccountPositionDetailsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getDisplay_type() {
        return this.surrogate.getDisplay_type();
    }

    public final String getPosition_instrument_type() {
        return this.surrogate.getPosition_instrument_type();
    }

    public final String getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public final PositionDetailChartTypeDto getChart_type() {
        return this.surrogate.getChart_type();
    }

    public final CurrencyDto getDisplay_currency() {
        return this.surrogate.getDisplay_currency();
    }

    public /* synthetic */ GetAccountPositionDetailsRequestDto(String str, String str2, String str3, String str4, String str5, PositionDetailChartTypeDto positionDetailChartTypeDto, CurrencyDto currencyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : positionDetailChartTypeDto, (i & 64) != 0 ? null : currencyDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAccountPositionDetailsRequestDto(String account_number, String instrument_id, String display_type, String str, String str2, PositionDetailChartTypeDto positionDetailChartTypeDto, CurrencyDto currencyDto) {
        this(new Surrogate(account_number, instrument_id, display_type, str, str2, positionDetailChartTypeDto, currencyDto));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(display_type, "display_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetAccountPositionDetailsRequest toProto() {
        String account_number = this.surrogate.getAccount_number();
        String instrument_id = this.surrogate.getInstrument_id();
        String display_type = this.surrogate.getDisplay_type();
        String position_instrument_type = this.surrogate.getPosition_instrument_type();
        String instrument_type = this.surrogate.getInstrument_type();
        PositionDetailChartTypeDto chart_type = this.surrogate.getChart_type();
        PositionDetailChartType positionDetailChartType = chart_type != null ? (PositionDetailChartType) chart_type.toProto() : null;
        CurrencyDto display_currency = this.surrogate.getDisplay_currency();
        return new GetAccountPositionDetailsRequest(account_number, instrument_id, display_type, position_instrument_type, instrument_type, positionDetailChartType, display_currency != null ? (Currency) display_currency.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[GetAccountPositionDetailsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAccountPositionDetailsRequestDto) && Intrinsics.areEqual(((GetAccountPositionDetailsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAccountPositionDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010$\u0012\u0004\b/\u0010'\u001a\u0004\b.\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b7\u0010'\u001a\u0004\b5\u00106¨\u0006:"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto$Surrogate;", "", "", "account_number", "instrument_id", "display_type", "position_instrument_type", "instrument_type", "Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;", "chart_type", "Lcom/robinhood/rosetta/common/CurrencyDto;", "display_currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;Lcom/robinhood/rosetta/common/CurrencyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;Lcom/robinhood/rosetta/common/CurrencyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_portfolio_v1_externalRelease", "(Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "getInstrument_id", "getInstrument_id$annotations", "getDisplay_type", "getDisplay_type$annotations", "getPosition_instrument_type", "getPosition_instrument_type$annotations", "getInstrument_type", "getInstrument_type$annotations", "Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;", "getChart_type", "()Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;", "getChart_type$annotations", "Lcom/robinhood/rosetta/common/CurrencyDto;", "getDisplay_currency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getDisplay_currency$annotations", "Companion", "$serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final PositionDetailChartTypeDto chart_type;
        private final CurrencyDto display_currency;
        private final String display_type;
        private final String instrument_id;
        private final String instrument_type;
        private final String position_instrument_type;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (PositionDetailChartTypeDto) null, (CurrencyDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.display_type, surrogate.display_type) && Intrinsics.areEqual(this.position_instrument_type, surrogate.position_instrument_type) && Intrinsics.areEqual(this.instrument_type, surrogate.instrument_type) && this.chart_type == surrogate.chart_type && this.display_currency == surrogate.display_currency;
        }

        public int hashCode() {
            int iHashCode = ((((this.account_number.hashCode() * 31) + this.instrument_id.hashCode()) * 31) + this.display_type.hashCode()) * 31;
            String str = this.position_instrument_type;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.instrument_type;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PositionDetailChartTypeDto positionDetailChartTypeDto = this.chart_type;
            int iHashCode4 = (iHashCode3 + (positionDetailChartTypeDto == null ? 0 : positionDetailChartTypeDto.hashCode())) * 31;
            CurrencyDto currencyDto = this.display_currency;
            return iHashCode4 + (currencyDto != null ? currencyDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", instrument_id=" + this.instrument_id + ", display_type=" + this.display_type + ", position_instrument_type=" + this.position_instrument_type + ", instrument_type=" + this.instrument_type + ", chart_type=" + this.chart_type + ", display_currency=" + this.display_currency + ")";
        }

        /* compiled from: GetAccountPositionDetailsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto$Surrogate;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAccountPositionDetailsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, PositionDetailChartTypeDto positionDetailChartTypeDto, CurrencyDto currencyDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str2;
            }
            if ((i & 4) == 0) {
                this.display_type = "";
            } else {
                this.display_type = str3;
            }
            if ((i & 8) == 0) {
                this.position_instrument_type = null;
            } else {
                this.position_instrument_type = str4;
            }
            if ((i & 16) == 0) {
                this.instrument_type = null;
            } else {
                this.instrument_type = str5;
            }
            if ((i & 32) == 0) {
                this.chart_type = null;
            } else {
                this.chart_type = positionDetailChartTypeDto;
            }
            if ((i & 64) == 0) {
                this.display_currency = null;
            } else {
                this.display_currency = currencyDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_portfolio_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.display_type, "")) {
                output.encodeStringElement(serialDesc, 2, self.display_type);
            }
            String str = self.position_instrument_type;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            String str2 = self.instrument_type;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str2);
            }
            PositionDetailChartTypeDto positionDetailChartTypeDto = self.chart_type;
            if (positionDetailChartTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, PositionDetailChartTypeDto.Serializer.INSTANCE, positionDetailChartTypeDto);
            }
            CurrencyDto currencyDto = self.display_currency;
            if (currencyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, CurrencyDto.Serializer.INSTANCE, currencyDto);
            }
        }

        public Surrogate(String account_number, String instrument_id, String display_type, String str, String str2, PositionDetailChartTypeDto positionDetailChartTypeDto, CurrencyDto currencyDto) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(display_type, "display_type");
            this.account_number = account_number;
            this.instrument_id = instrument_id;
            this.display_type = display_type;
            this.position_instrument_type = str;
            this.instrument_type = str2;
            this.chart_type = positionDetailChartTypeDto;
            this.display_currency = currencyDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, PositionDetailChartTypeDto positionDetailChartTypeDto, CurrencyDto currencyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : positionDetailChartTypeDto, (i & 64) != 0 ? null : currencyDto);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final String getDisplay_type() {
            return this.display_type;
        }

        public final String getPosition_instrument_type() {
            return this.position_instrument_type;
        }

        public final String getInstrument_type() {
            return this.instrument_type;
        }

        public final PositionDetailChartTypeDto getChart_type() {
            return this.chart_type;
        }

        public final CurrencyDto getDisplay_currency() {
            return this.display_currency;
        }
    }

    /* compiled from: GetAccountPositionDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAccountPositionDetailsRequestDto, GetAccountPositionDetailsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAccountPositionDetailsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountPositionDetailsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountPositionDetailsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAccountPositionDetailsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAccountPositionDetailsRequest> getProtoAdapter() {
            return GetAccountPositionDetailsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountPositionDetailsRequestDto getZeroValue() {
            return GetAccountPositionDetailsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountPositionDetailsRequestDto fromProto(GetAccountPositionDetailsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            String instrument_id = proto.getInstrument_id();
            String display_type = proto.getDisplay_type();
            String position_instrument_type = proto.getPosition_instrument_type();
            String instrument_type = proto.getInstrument_type();
            PositionDetailChartType chart_type = proto.getChart_type();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PositionDetailChartTypeDto positionDetailChartTypeDtoFromProto = chart_type != null ? PositionDetailChartTypeDto.INSTANCE.fromProto(chart_type) : null;
            Currency display_currency = proto.getDisplay_currency();
            return new GetAccountPositionDetailsRequestDto(new Surrogate(account_number, instrument_id, display_type, position_instrument_type, instrument_type, positionDetailChartTypeDtoFromProto, display_currency != null ? CurrencyDto.INSTANCE.fromProto(display_currency) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.portfolio.v1.GetAccountPositionDetailsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAccountPositionDetailsRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetAccountPositionDetailsRequestDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAccountPositionDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAccountPositionDetailsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.portfolio.v1.GetAccountPositionDetailsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAccountPositionDetailsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAccountPositionDetailsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAccountPositionDetailsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAccountPositionDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.portfolio.v1.GetAccountPositionDetailsRequestDto";
        }
    }
}
