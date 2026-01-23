package md_server_proxy.service.p483v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformer;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import md_server_proxy.service.p483v1.BoundsDto;
import md_server_proxy.service.p483v1.KeyInfoDocumentDto;

/* compiled from: FundamentalDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004MLNOB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008f\u0003\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0013\u0012\b\b\u0002\u0010 \u001a\u00020\u0013\u0012\b\b\u0002\u0010!\u001a\u00020\u0013\u0012\b\b\u0002\u0010\"\u001a\u00020\u0013\u0012\b\b\u0002\u0010#\u001a\u00020\u0013\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010+\u001a\u00020\u0013\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010/J\u000f\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104H\u0096\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020$H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020$H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020$H\u0016¢\u0006\u0004\bA\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR\u0011\u0010\u001d\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bC\u00103R\u0011\u0010\u001f\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bD\u00103R\u0011\u0010 \u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bE\u00103R\u0011\u0010!\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bF\u00103R\u0013\u0010%\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010&\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\bI\u0010HR\u0013\u0010-\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006P"}, m3636d2 = {"Lmd_server_proxy/service/v1/FundamentalDto;", "Lcom/robinhood/idl/MessageDto;", "Lmd_server_proxy/service/v1/Fundamental;", "Landroid/os/Parcelable;", "Lmd_server_proxy/service/v1/FundamentalDto$Surrogate;", "surrogate", "<init>", "(Lmd_server_proxy/service/v1/FundamentalDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "open", "high", "low", SduiChartZoomTransformer.VOLUME_IDENTIFIER, "Lmd_server_proxy/service/v1/BoundsDto;", "bounds", "average_volume_2_weeks", "average_volume_52_weeks", "average_volume_30_days", "high_52_weeks", "", "high_52_weeks_date", "dividend_yield", "float", "low_52_weeks", "low_52_weeks_date", "market_cap", "pb_ratio", "pe_ratio", "shares_outstanding", "description", "instrument", "ceo", "headquarters_city", "headquarters_state", "sector", "industry", "", "num_employees", "year_founded", "payable_date", "ex_dividend_date", "financial_status_indicator", "financial_status_description", "instrument_id", "Lmd_server_proxy/service/v1/KeyInfoDocumentDto;", "key_info_document", "overnight_volume", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lmd_server_proxy/service/v1/BoundsDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/KeyInfoDocumentDto;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmd_server_proxy/service/v1/Fundamental;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmd_server_proxy/service/v1/FundamentalDto$Surrogate;", "getDescription", "getCeo", "getHeadquarters_city", "getHeadquarters_state", "getNum_employees", "()Ljava/lang/Integer;", "getYear_founded", "getKey_info_document", "()Lmd_server_proxy/service/v1/KeyInfoDocumentDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class FundamentalDto implements Dto3<Fundamental>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FundamentalDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FundamentalDto, Fundamental>> binaryBase64Serializer$delegate;
    private static final FundamentalDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FundamentalDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FundamentalDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getCeo() {
        return this.surrogate.getCeo();
    }

    public final String getHeadquarters_city() {
        return this.surrogate.getHeadquarters_city();
    }

    public final String getHeadquarters_state() {
        return this.surrogate.getHeadquarters_state();
    }

    public final Integer getNum_employees() {
        return this.surrogate.getNum_employees();
    }

    public final Integer getYear_founded() {
        return this.surrogate.getYear_founded();
    }

    public final KeyInfoDocumentDto getKey_info_document() {
        return this.surrogate.getKey_info_document();
    }

    public /* synthetic */ FundamentalDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, BoundsDto boundsDto, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, String str, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, IdlDecimal idlDecimal11, String str2, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, IdlDecimal idlDecimal15, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, String str11, String str12, String str13, String str14, KeyInfoDocumentDto keyInfoDocumentDto, IdlDecimal idlDecimal16, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : idlDecimal2, (i & 4) != 0 ? null : idlDecimal3, (i & 8) != 0 ? null : idlDecimal4, (i & 16) != 0 ? BoundsDto.INSTANCE.getZeroValue() : boundsDto, (i & 32) != 0 ? null : idlDecimal5, (i & 64) != 0 ? null : idlDecimal6, (i & 128) != 0 ? null : idlDecimal7, (i & 256) != 0 ? null : idlDecimal8, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? null : idlDecimal9, (i & 2048) != 0 ? null : idlDecimal10, (i & 4096) != 0 ? null : idlDecimal11, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : idlDecimal12, (i & 32768) != 0 ? null : idlDecimal13, (i & 65536) != 0 ? null : idlDecimal14, (i & 131072) != 0 ? null : idlDecimal15, (i & 262144) != 0 ? "" : str3, (i & 524288) != 0 ? "" : str4, (i & 1048576) != 0 ? "" : str5, (i & 2097152) != 0 ? "" : str6, (i & 4194304) != 0 ? "" : str7, (i & 8388608) != 0 ? "" : str8, (i & 16777216) != 0 ? "" : str9, (i & 33554432) != 0 ? null : num, (i & 67108864) != 0 ? null : num2, (i & 134217728) != 0 ? null : str10, (i & 268435456) != 0 ? null : str11, (i & 536870912) != 0 ? null : str12, (i & 1073741824) != 0 ? null : str13, (i & Integer.MIN_VALUE) == 0 ? str14 : "", (i2 & 1) != 0 ? null : keyInfoDocumentDto, (i2 & 2) != 0 ? null : idlDecimal16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FundamentalDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, BoundsDto bounds, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, String str, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, IdlDecimal idlDecimal11, String str2, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, IdlDecimal idlDecimal15, String description, String instrument, String ceo, String headquarters_city, String headquarters_state, String sector, String industry, Integer num, Integer num2, String str3, String str4, String str5, String str6, String instrument_id, KeyInfoDocumentDto keyInfoDocumentDto, IdlDecimal idlDecimal16) {
        this(new Surrogate(idlDecimal, idlDecimal2, idlDecimal3, idlDecimal4, bounds, idlDecimal5, idlDecimal6, idlDecimal7, idlDecimal8, str, idlDecimal9, idlDecimal10, idlDecimal11, str2, idlDecimal12, idlDecimal13, idlDecimal14, idlDecimal15, description, instrument, ceo, headquarters_city, headquarters_state, sector, industry, num, num2, str3, str4, str5, str6, instrument_id, keyInfoDocumentDto, idlDecimal16));
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(ceo, "ceo");
        Intrinsics.checkNotNullParameter(headquarters_city, "headquarters_city");
        Intrinsics.checkNotNullParameter(headquarters_state, "headquarters_state");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(industry, "industry");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Fundamental toProto() {
        IdlDecimal open = this.surrogate.getOpen();
        String stringValue = open != null ? open.getStringValue() : null;
        IdlDecimal high = this.surrogate.getHigh();
        String stringValue2 = high != null ? high.getStringValue() : null;
        IdlDecimal low = this.surrogate.getLow();
        String stringValue3 = low != null ? low.getStringValue() : null;
        IdlDecimal volume = this.surrogate.getVolume();
        String stringValue4 = volume != null ? volume.getStringValue() : null;
        Bounds bounds = (Bounds) this.surrogate.getBounds().toProto();
        IdlDecimal average_volume_2_weeks = this.surrogate.getAverage_volume_2_weeks();
        String stringValue5 = average_volume_2_weeks != null ? average_volume_2_weeks.getStringValue() : null;
        IdlDecimal average_volume_52_weeks = this.surrogate.getAverage_volume_52_weeks();
        String stringValue6 = average_volume_52_weeks != null ? average_volume_52_weeks.getStringValue() : null;
        IdlDecimal average_volume_30_days = this.surrogate.getAverage_volume_30_days();
        String stringValue7 = average_volume_30_days != null ? average_volume_30_days.getStringValue() : null;
        IdlDecimal high_52_weeks = this.surrogate.getHigh_52_weeks();
        String stringValue8 = high_52_weeks != null ? high_52_weeks.getStringValue() : null;
        String high_52_weeks_date = this.surrogate.getHigh_52_weeks_date();
        IdlDecimal dividend_yield = this.surrogate.getDividend_yield();
        String stringValue9 = dividend_yield != null ? dividend_yield.getStringValue() : null;
        IdlDecimal idlDecimal = this.surrogate.getFloat();
        String stringValue10 = idlDecimal != null ? idlDecimal.getStringValue() : null;
        IdlDecimal low_52_weeks = this.surrogate.getLow_52_weeks();
        String stringValue11 = low_52_weeks != null ? low_52_weeks.getStringValue() : null;
        String low_52_weeks_date = this.surrogate.getLow_52_weeks_date();
        IdlDecimal market_cap = this.surrogate.getMarket_cap();
        String stringValue12 = market_cap != null ? market_cap.getStringValue() : null;
        IdlDecimal pb_ratio = this.surrogate.getPb_ratio();
        String stringValue13 = pb_ratio != null ? pb_ratio.getStringValue() : null;
        IdlDecimal pe_ratio = this.surrogate.getPe_ratio();
        String stringValue14 = pe_ratio != null ? pe_ratio.getStringValue() : null;
        IdlDecimal shares_outstanding = this.surrogate.getShares_outstanding();
        String stringValue15 = shares_outstanding != null ? shares_outstanding.getStringValue() : null;
        String description = this.surrogate.getDescription();
        String instrument = this.surrogate.getInstrument();
        String ceo = this.surrogate.getCeo();
        String headquarters_city = this.surrogate.getHeadquarters_city();
        String headquarters_state = this.surrogate.getHeadquarters_state();
        String sector = this.surrogate.getSector();
        String industry = this.surrogate.getIndustry();
        Integer num_employees = this.surrogate.getNum_employees();
        Integer year_founded = this.surrogate.getYear_founded();
        String payable_date = this.surrogate.getPayable_date();
        String ex_dividend_date = this.surrogate.getEx_dividend_date();
        String financial_status_indicator = this.surrogate.getFinancial_status_indicator();
        String financial_status_description = this.surrogate.getFinancial_status_description();
        String instrument_id = this.surrogate.getInstrument_id();
        KeyInfoDocumentDto key_info_document = this.surrogate.getKey_info_document();
        KeyInfoDocument proto = key_info_document != null ? key_info_document.toProto() : null;
        IdlDecimal overnight_volume = this.surrogate.getOvernight_volume();
        return new Fundamental(stringValue, stringValue2, stringValue3, stringValue4, bounds, stringValue5, stringValue6, stringValue7, stringValue8, high_52_weeks_date, stringValue9, stringValue10, stringValue11, low_52_weeks_date, stringValue12, stringValue13, stringValue14, stringValue15, description, instrument, ceo, headquarters_city, headquarters_state, sector, industry, num_employees, year_founded, payable_date, ex_dividend_date, financial_status_indicator, financial_status_description, instrument_id, proto, overnight_volume != null ? overnight_volume.getStringValue() : null, null, 0, 4, null);
    }

    public String toString() {
        return "[FundamentalDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FundamentalDto) && Intrinsics.areEqual(((FundamentalDto) other).surrogate, this.surrogate);
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
    /* compiled from: FundamentalDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bS\b\u0083\b\u0018\u0000 \u0093\u00012\u00020\u0001:\u0004\u0094\u0001\u0093\u0001B\u009b\u0005\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\b\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\r\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u000e\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u000f\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0019\b\u0002\u0010\u0012\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0013\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0014\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\u0019\b\u0002\u0010\u0016\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0017\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0018\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0019\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\b\b\u0002\u0010 \u001a\u00020\u0010\u0012\u0019\b\u0002\u0010#\u001a\u0013\u0018\u00010!¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\"\u0012\u0019\b\u0002\u0010$\u001a\u0013\u0018\u00010!¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010)\u001a\u00020\u0010\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\u0019\b\u0002\u0010,\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b-\u0010.B÷\u0002\b\u0010\u0012\u0006\u0010/\u001a\u00020!\u0012\u0006\u00100\u001a\u00020!\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0010\u0012\b\u0010#\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010!\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b-\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010=\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020!HÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bC\u0010DR1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010E\u0012\u0004\bH\u0010I\u001a\u0004\bF\u0010GR1\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010E\u0012\u0004\bK\u0010I\u001a\u0004\bJ\u0010GR1\u0010\b\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010E\u0012\u0004\bM\u0010I\u001a\u0004\bL\u0010GR1\u0010\t\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010E\u0012\u0004\bO\u0010I\u001a\u0004\bN\u0010GR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010P\u0012\u0004\bS\u0010I\u001a\u0004\bQ\u0010RR1\u0010\f\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010E\u0012\u0004\bU\u0010I\u001a\u0004\bT\u0010GR1\u0010\r\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010E\u0012\u0004\bW\u0010I\u001a\u0004\bV\u0010GR1\u0010\u000e\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010E\u0012\u0004\bY\u0010I\u001a\u0004\bX\u0010GR1\u0010\u000f\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010E\u0012\u0004\b[\u0010I\u001a\u0004\bZ\u0010GR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\\\u0012\u0004\b^\u0010I\u001a\u0004\b]\u0010>R1\u0010\u0012\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010E\u0012\u0004\b`\u0010I\u001a\u0004\b_\u0010GR1\u0010\u0013\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010E\u0012\u0004\bb\u0010I\u001a\u0004\ba\u0010GR1\u0010\u0014\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010E\u0012\u0004\bd\u0010I\u001a\u0004\bc\u0010GR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\\\u0012\u0004\bf\u0010I\u001a\u0004\be\u0010>R1\u0010\u0016\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010E\u0012\u0004\bh\u0010I\u001a\u0004\bg\u0010GR1\u0010\u0017\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010E\u0012\u0004\bj\u0010I\u001a\u0004\bi\u0010GR1\u0010\u0018\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010E\u0012\u0004\bl\u0010I\u001a\u0004\bk\u0010GR1\u0010\u0019\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010E\u0012\u0004\bn\u0010I\u001a\u0004\bm\u0010GR \u0010\u001a\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\\\u0012\u0004\bp\u0010I\u001a\u0004\bo\u0010>R \u0010\u001b\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\\\u0012\u0004\br\u0010I\u001a\u0004\bq\u0010>R \u0010\u001c\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\\\u0012\u0004\bt\u0010I\u001a\u0004\bs\u0010>R \u0010\u001d\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\\\u0012\u0004\bv\u0010I\u001a\u0004\bu\u0010>R \u0010\u001e\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\\\u0012\u0004\bx\u0010I\u001a\u0004\bw\u0010>R \u0010\u001f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\\\u0012\u0004\bz\u0010I\u001a\u0004\by\u0010>R \u0010 \u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\\\u0012\u0004\b|\u0010I\u001a\u0004\b{\u0010>R2\u0010#\u001a\u0013\u0018\u00010!¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\"8\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b#\u0010}\u0012\u0005\b\u0080\u0001\u0010I\u001a\u0004\b~\u0010\u007fR3\u0010$\u001a\u0013\u0018\u00010!¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\"8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b$\u0010}\u0012\u0005\b\u0082\u0001\u0010I\u001a\u0005\b\u0081\u0001\u0010\u007fR$\u0010%\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b%\u0010\\\u0012\u0005\b\u0084\u0001\u0010I\u001a\u0005\b\u0083\u0001\u0010>R$\u0010&\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b&\u0010\\\u0012\u0005\b\u0086\u0001\u0010I\u001a\u0005\b\u0085\u0001\u0010>R$\u0010'\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b'\u0010\\\u0012\u0005\b\u0088\u0001\u0010I\u001a\u0005\b\u0087\u0001\u0010>R$\u0010(\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b(\u0010\\\u0012\u0005\b\u008a\u0001\u0010I\u001a\u0005\b\u0089\u0001\u0010>R\"\u0010)\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b)\u0010\\\u0012\u0005\b\u008c\u0001\u0010I\u001a\u0005\b\u008b\u0001\u0010>R&\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b+\u0010\u008d\u0001\u0012\u0005\b\u0090\u0001\u0010I\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R3\u0010,\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b,\u0010E\u0012\u0005\b\u0092\u0001\u0010I\u001a\u0005\b\u0091\u0001\u0010G¨\u0006\u0095\u0001"}, m3636d2 = {"Lmd_server_proxy/service/v1/FundamentalDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "open", "high", "low", SduiChartZoomTransformer.VOLUME_IDENTIFIER, "Lmd_server_proxy/service/v1/BoundsDto;", "bounds", "average_volume_2_weeks", "average_volume_52_weeks", "average_volume_30_days", "high_52_weeks", "", "high_52_weeks_date", "dividend_yield", "float", "low_52_weeks", "low_52_weeks_date", "market_cap", "pb_ratio", "pe_ratio", "shares_outstanding", "description", "instrument", "ceo", "headquarters_city", "headquarters_state", "sector", "industry", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "num_employees", "year_founded", "payable_date", "ex_dividend_date", "financial_status_indicator", "financial_status_description", "instrument_id", "Lmd_server_proxy/service/v1/KeyInfoDocumentDto;", "key_info_document", "overnight_volume", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lmd_server_proxy/service/v1/BoundsDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/KeyInfoDocumentDto;Lcom/robinhood/idl/IdlDecimal;)V", "seen0", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lmd_server_proxy/service/v1/BoundsDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/KeyInfoDocumentDto;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$md_server_proxy_service_v1_externalRelease", "(Lmd_server_proxy/service/v1/FundamentalDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getOpen", "()Lcom/robinhood/idl/IdlDecimal;", "getOpen$annotations", "()V", "getHigh", "getHigh$annotations", "getLow", "getLow$annotations", "getVolume", "getVolume$annotations", "Lmd_server_proxy/service/v1/BoundsDto;", "getBounds", "()Lmd_server_proxy/service/v1/BoundsDto;", "getBounds$annotations", "getAverage_volume_2_weeks", "getAverage_volume_2_weeks$annotations", "getAverage_volume_52_weeks", "getAverage_volume_52_weeks$annotations", "getAverage_volume_30_days", "getAverage_volume_30_days$annotations", "getHigh_52_weeks", "getHigh_52_weeks$annotations", "Ljava/lang/String;", "getHigh_52_weeks_date", "getHigh_52_weeks_date$annotations", "getDividend_yield", "getDividend_yield$annotations", "getFloat", "getFloat$annotations", "getLow_52_weeks", "getLow_52_weeks$annotations", "getLow_52_weeks_date", "getLow_52_weeks_date$annotations", "getMarket_cap", "getMarket_cap$annotations", "getPb_ratio", "getPb_ratio$annotations", "getPe_ratio", "getPe_ratio$annotations", "getShares_outstanding", "getShares_outstanding$annotations", "getDescription", "getDescription$annotations", "getInstrument", "getInstrument$annotations", "getCeo", "getCeo$annotations", "getHeadquarters_city", "getHeadquarters_city$annotations", "getHeadquarters_state", "getHeadquarters_state$annotations", "getSector", "getSector$annotations", "getIndustry", "getIndustry$annotations", "Ljava/lang/Integer;", "getNum_employees", "()Ljava/lang/Integer;", "getNum_employees$annotations", "getYear_founded", "getYear_founded$annotations", "getPayable_date", "getPayable_date$annotations", "getEx_dividend_date", "getEx_dividend_date$annotations", "getFinancial_status_indicator", "getFinancial_status_indicator$annotations", "getFinancial_status_description", "getFinancial_status_description$annotations", "getInstrument_id", "getInstrument_id$annotations", "Lmd_server_proxy/service/v1/KeyInfoDocumentDto;", "getKey_info_document", "()Lmd_server_proxy/service/v1/KeyInfoDocumentDto;", "getKey_info_document$annotations", "getOvernight_volume", "getOvernight_volume$annotations", "Companion", "$serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal average_volume_2_weeks;
        private final IdlDecimal average_volume_30_days;
        private final IdlDecimal average_volume_52_weeks;
        private final BoundsDto bounds;
        private final String ceo;
        private final String description;
        private final IdlDecimal dividend_yield;
        private final String ex_dividend_date;
        private final String financial_status_description;
        private final String financial_status_indicator;
        private final IdlDecimal float;
        private final String headquarters_city;
        private final String headquarters_state;
        private final IdlDecimal high;
        private final IdlDecimal high_52_weeks;
        private final String high_52_weeks_date;
        private final String industry;
        private final String instrument;
        private final String instrument_id;
        private final KeyInfoDocumentDto key_info_document;
        private final IdlDecimal low;
        private final IdlDecimal low_52_weeks;
        private final String low_52_weeks_date;
        private final IdlDecimal market_cap;
        private final Integer num_employees;
        private final IdlDecimal open;
        private final IdlDecimal overnight_volume;
        private final String payable_date;
        private final IdlDecimal pb_ratio;
        private final IdlDecimal pe_ratio;
        private final String sector;
        private final IdlDecimal shares_outstanding;
        private final IdlDecimal volume;
        private final Integer year_founded;

        public Surrogate() {
            this((IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (BoundsDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (KeyInfoDocumentDto) null, (IdlDecimal) null, -1, 3, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.open, surrogate.open) && Intrinsics.areEqual(this.high, surrogate.high) && Intrinsics.areEqual(this.low, surrogate.low) && Intrinsics.areEqual(this.volume, surrogate.volume) && this.bounds == surrogate.bounds && Intrinsics.areEqual(this.average_volume_2_weeks, surrogate.average_volume_2_weeks) && Intrinsics.areEqual(this.average_volume_52_weeks, surrogate.average_volume_52_weeks) && Intrinsics.areEqual(this.average_volume_30_days, surrogate.average_volume_30_days) && Intrinsics.areEqual(this.high_52_weeks, surrogate.high_52_weeks) && Intrinsics.areEqual(this.high_52_weeks_date, surrogate.high_52_weeks_date) && Intrinsics.areEqual(this.dividend_yield, surrogate.dividend_yield) && Intrinsics.areEqual(this.float, surrogate.float) && Intrinsics.areEqual(this.low_52_weeks, surrogate.low_52_weeks) && Intrinsics.areEqual(this.low_52_weeks_date, surrogate.low_52_weeks_date) && Intrinsics.areEqual(this.market_cap, surrogate.market_cap) && Intrinsics.areEqual(this.pb_ratio, surrogate.pb_ratio) && Intrinsics.areEqual(this.pe_ratio, surrogate.pe_ratio) && Intrinsics.areEqual(this.shares_outstanding, surrogate.shares_outstanding) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.instrument, surrogate.instrument) && Intrinsics.areEqual(this.ceo, surrogate.ceo) && Intrinsics.areEqual(this.headquarters_city, surrogate.headquarters_city) && Intrinsics.areEqual(this.headquarters_state, surrogate.headquarters_state) && Intrinsics.areEqual(this.sector, surrogate.sector) && Intrinsics.areEqual(this.industry, surrogate.industry) && Intrinsics.areEqual(this.num_employees, surrogate.num_employees) && Intrinsics.areEqual(this.year_founded, surrogate.year_founded) && Intrinsics.areEqual(this.payable_date, surrogate.payable_date) && Intrinsics.areEqual(this.ex_dividend_date, surrogate.ex_dividend_date) && Intrinsics.areEqual(this.financial_status_indicator, surrogate.financial_status_indicator) && Intrinsics.areEqual(this.financial_status_description, surrogate.financial_status_description) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.key_info_document, surrogate.key_info_document) && Intrinsics.areEqual(this.overnight_volume, surrogate.overnight_volume);
        }

        public int hashCode() {
            IdlDecimal idlDecimal = this.open;
            int iHashCode = (idlDecimal == null ? 0 : idlDecimal.hashCode()) * 31;
            IdlDecimal idlDecimal2 = this.high;
            int iHashCode2 = (iHashCode + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            IdlDecimal idlDecimal3 = this.low;
            int iHashCode3 = (iHashCode2 + (idlDecimal3 == null ? 0 : idlDecimal3.hashCode())) * 31;
            IdlDecimal idlDecimal4 = this.volume;
            int iHashCode4 = (((iHashCode3 + (idlDecimal4 == null ? 0 : idlDecimal4.hashCode())) * 31) + this.bounds.hashCode()) * 31;
            IdlDecimal idlDecimal5 = this.average_volume_2_weeks;
            int iHashCode5 = (iHashCode4 + (idlDecimal5 == null ? 0 : idlDecimal5.hashCode())) * 31;
            IdlDecimal idlDecimal6 = this.average_volume_52_weeks;
            int iHashCode6 = (iHashCode5 + (idlDecimal6 == null ? 0 : idlDecimal6.hashCode())) * 31;
            IdlDecimal idlDecimal7 = this.average_volume_30_days;
            int iHashCode7 = (iHashCode6 + (idlDecimal7 == null ? 0 : idlDecimal7.hashCode())) * 31;
            IdlDecimal idlDecimal8 = this.high_52_weeks;
            int iHashCode8 = (iHashCode7 + (idlDecimal8 == null ? 0 : idlDecimal8.hashCode())) * 31;
            String str = this.high_52_weeks_date;
            int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
            IdlDecimal idlDecimal9 = this.dividend_yield;
            int iHashCode10 = (iHashCode9 + (idlDecimal9 == null ? 0 : idlDecimal9.hashCode())) * 31;
            IdlDecimal idlDecimal10 = this.float;
            int iHashCode11 = (iHashCode10 + (idlDecimal10 == null ? 0 : idlDecimal10.hashCode())) * 31;
            IdlDecimal idlDecimal11 = this.low_52_weeks;
            int iHashCode12 = (iHashCode11 + (idlDecimal11 == null ? 0 : idlDecimal11.hashCode())) * 31;
            String str2 = this.low_52_weeks_date;
            int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            IdlDecimal idlDecimal12 = this.market_cap;
            int iHashCode14 = (iHashCode13 + (idlDecimal12 == null ? 0 : idlDecimal12.hashCode())) * 31;
            IdlDecimal idlDecimal13 = this.pb_ratio;
            int iHashCode15 = (iHashCode14 + (idlDecimal13 == null ? 0 : idlDecimal13.hashCode())) * 31;
            IdlDecimal idlDecimal14 = this.pe_ratio;
            int iHashCode16 = (iHashCode15 + (idlDecimal14 == null ? 0 : idlDecimal14.hashCode())) * 31;
            IdlDecimal idlDecimal15 = this.shares_outstanding;
            int iHashCode17 = (((((((((((((((iHashCode16 + (idlDecimal15 == null ? 0 : idlDecimal15.hashCode())) * 31) + this.description.hashCode()) * 31) + this.instrument.hashCode()) * 31) + this.ceo.hashCode()) * 31) + this.headquarters_city.hashCode()) * 31) + this.headquarters_state.hashCode()) * 31) + this.sector.hashCode()) * 31) + this.industry.hashCode()) * 31;
            Integer num = this.num_employees;
            int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.year_founded;
            int iHashCode19 = (iHashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.payable_date;
            int iHashCode20 = (iHashCode19 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.ex_dividend_date;
            int iHashCode21 = (iHashCode20 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.financial_status_indicator;
            int iHashCode22 = (iHashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.financial_status_description;
            int iHashCode23 = (((iHashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.instrument_id.hashCode()) * 31;
            KeyInfoDocumentDto keyInfoDocumentDto = this.key_info_document;
            int iHashCode24 = (iHashCode23 + (keyInfoDocumentDto == null ? 0 : keyInfoDocumentDto.hashCode())) * 31;
            IdlDecimal idlDecimal16 = this.overnight_volume;
            return iHashCode24 + (idlDecimal16 != null ? idlDecimal16.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(open=" + this.open + ", high=" + this.high + ", low=" + this.low + ", volume=" + this.volume + ", bounds=" + this.bounds + ", average_volume_2_weeks=" + this.average_volume_2_weeks + ", average_volume_52_weeks=" + this.average_volume_52_weeks + ", average_volume_30_days=" + this.average_volume_30_days + ", high_52_weeks=" + this.high_52_weeks + ", high_52_weeks_date=" + this.high_52_weeks_date + ", dividend_yield=" + this.dividend_yield + ", float=" + this.float + ", low_52_weeks=" + this.low_52_weeks + ", low_52_weeks_date=" + this.low_52_weeks_date + ", market_cap=" + this.market_cap + ", pb_ratio=" + this.pb_ratio + ", pe_ratio=" + this.pe_ratio + ", shares_outstanding=" + this.shares_outstanding + ", description=" + this.description + ", instrument=" + this.instrument + ", ceo=" + this.ceo + ", headquarters_city=" + this.headquarters_city + ", headquarters_state=" + this.headquarters_state + ", sector=" + this.sector + ", industry=" + this.industry + ", num_employees=" + this.num_employees + ", year_founded=" + this.year_founded + ", payable_date=" + this.payable_date + ", ex_dividend_date=" + this.ex_dividend_date + ", financial_status_indicator=" + this.financial_status_indicator + ", financial_status_description=" + this.financial_status_description + ", instrument_id=" + this.instrument_id + ", key_info_document=" + this.key_info_document + ", overnight_volume=" + this.overnight_volume + ")";
        }

        /* compiled from: FundamentalDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmd_server_proxy/service/v1/FundamentalDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/FundamentalDto$Surrogate;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FundamentalDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, BoundsDto boundsDto, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, String str, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, IdlDecimal idlDecimal11, String str2, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, IdlDecimal idlDecimal15, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, String str11, String str12, String str13, String str14, KeyInfoDocumentDto keyInfoDocumentDto, IdlDecimal idlDecimal16, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.open = null;
            } else {
                this.open = idlDecimal;
            }
            if ((i & 2) == 0) {
                this.high = null;
            } else {
                this.high = idlDecimal2;
            }
            if ((i & 4) == 0) {
                this.low = null;
            } else {
                this.low = idlDecimal3;
            }
            if ((i & 8) == 0) {
                this.volume = null;
            } else {
                this.volume = idlDecimal4;
            }
            if ((i & 16) == 0) {
                this.bounds = BoundsDto.INSTANCE.getZeroValue();
            } else {
                this.bounds = boundsDto;
            }
            if ((i & 32) == 0) {
                this.average_volume_2_weeks = null;
            } else {
                this.average_volume_2_weeks = idlDecimal5;
            }
            if ((i & 64) == 0) {
                this.average_volume_52_weeks = null;
            } else {
                this.average_volume_52_weeks = idlDecimal6;
            }
            if ((i & 128) == 0) {
                this.average_volume_30_days = null;
            } else {
                this.average_volume_30_days = idlDecimal7;
            }
            if ((i & 256) == 0) {
                this.high_52_weeks = null;
            } else {
                this.high_52_weeks = idlDecimal8;
            }
            if ((i & 512) == 0) {
                this.high_52_weeks_date = null;
            } else {
                this.high_52_weeks_date = str;
            }
            if ((i & 1024) == 0) {
                this.dividend_yield = null;
            } else {
                this.dividend_yield = idlDecimal9;
            }
            if ((i & 2048) == 0) {
                this.float = null;
            } else {
                this.float = idlDecimal10;
            }
            if ((i & 4096) == 0) {
                this.low_52_weeks = null;
            } else {
                this.low_52_weeks = idlDecimal11;
            }
            if ((i & 8192) == 0) {
                this.low_52_weeks_date = null;
            } else {
                this.low_52_weeks_date = str2;
            }
            if ((i & 16384) == 0) {
                this.market_cap = null;
            } else {
                this.market_cap = idlDecimal12;
            }
            if ((32768 & i) == 0) {
                this.pb_ratio = null;
            } else {
                this.pb_ratio = idlDecimal13;
            }
            if ((65536 & i) == 0) {
                this.pe_ratio = null;
            } else {
                this.pe_ratio = idlDecimal14;
            }
            if ((131072 & i) == 0) {
                this.shares_outstanding = null;
            } else {
                this.shares_outstanding = idlDecimal15;
            }
            if ((262144 & i) == 0) {
                this.description = "";
            } else {
                this.description = str3;
            }
            if ((524288 & i) == 0) {
                this.instrument = "";
            } else {
                this.instrument = str4;
            }
            if ((1048576 & i) == 0) {
                this.ceo = "";
            } else {
                this.ceo = str5;
            }
            if ((2097152 & i) == 0) {
                this.headquarters_city = "";
            } else {
                this.headquarters_city = str6;
            }
            if ((4194304 & i) == 0) {
                this.headquarters_state = "";
            } else {
                this.headquarters_state = str7;
            }
            if ((8388608 & i) == 0) {
                this.sector = "";
            } else {
                this.sector = str8;
            }
            if ((16777216 & i) == 0) {
                this.industry = "";
            } else {
                this.industry = str9;
            }
            if ((33554432 & i) == 0) {
                this.num_employees = null;
            } else {
                this.num_employees = num;
            }
            if ((67108864 & i) == 0) {
                this.year_founded = null;
            } else {
                this.year_founded = num2;
            }
            if ((134217728 & i) == 0) {
                this.payable_date = null;
            } else {
                this.payable_date = str10;
            }
            if ((268435456 & i) == 0) {
                this.ex_dividend_date = null;
            } else {
                this.ex_dividend_date = str11;
            }
            if ((536870912 & i) == 0) {
                this.financial_status_indicator = null;
            } else {
                this.financial_status_indicator = str12;
            }
            if ((1073741824 & i) == 0) {
                this.financial_status_description = null;
            } else {
                this.financial_status_description = str13;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str14;
            }
            if ((i2 & 1) == 0) {
                this.key_info_document = null;
            } else {
                this.key_info_document = keyInfoDocumentDto;
            }
            if ((i2 & 2) == 0) {
                this.overnight_volume = null;
            } else {
                this.overnight_volume = idlDecimal16;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$md_server_proxy_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            IdlDecimal idlDecimal = self.open;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            IdlDecimal idlDecimal2 = self.high;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            IdlDecimal idlDecimal3 = self.low;
            if (idlDecimal3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, idlDecimal3);
            }
            IdlDecimal idlDecimal4 = self.volume;
            if (idlDecimal4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, idlDecimal4);
            }
            if (self.bounds != BoundsDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, BoundsDto.Serializer.INSTANCE, self.bounds);
            }
            IdlDecimal idlDecimal5 = self.average_volume_2_weeks;
            if (idlDecimal5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, idlDecimal5);
            }
            IdlDecimal idlDecimal6 = self.average_volume_52_weeks;
            if (idlDecimal6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, idlDecimal6);
            }
            IdlDecimal idlDecimal7 = self.average_volume_30_days;
            if (idlDecimal7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, idlDecimal7);
            }
            IdlDecimal idlDecimal8 = self.high_52_weeks;
            if (idlDecimal8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, idlDecimal8);
            }
            String str = self.high_52_weeks_date;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str);
            }
            IdlDecimal idlDecimal9 = self.dividend_yield;
            if (idlDecimal9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, IdlDecimalSerializer.INSTANCE, idlDecimal9);
            }
            IdlDecimal idlDecimal10 = self.float;
            if (idlDecimal10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, idlDecimal10);
            }
            IdlDecimal idlDecimal11 = self.low_52_weeks;
            if (idlDecimal11 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, idlDecimal11);
            }
            String str2 = self.low_52_weeks_date;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str2);
            }
            IdlDecimal idlDecimal12 = self.market_cap;
            if (idlDecimal12 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, IdlDecimalSerializer.INSTANCE, idlDecimal12);
            }
            IdlDecimal idlDecimal13 = self.pb_ratio;
            if (idlDecimal13 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, IdlDecimalSerializer.INSTANCE, idlDecimal13);
            }
            IdlDecimal idlDecimal14 = self.pe_ratio;
            if (idlDecimal14 != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, IdlDecimalSerializer.INSTANCE, idlDecimal14);
            }
            IdlDecimal idlDecimal15 = self.shares_outstanding;
            if (idlDecimal15 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, IdlDecimalSerializer.INSTANCE, idlDecimal15);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 18, self.description);
            }
            if (!Intrinsics.areEqual(self.instrument, "")) {
                output.encodeStringElement(serialDesc, 19, self.instrument);
            }
            if (!Intrinsics.areEqual(self.ceo, "")) {
                output.encodeStringElement(serialDesc, 20, self.ceo);
            }
            if (!Intrinsics.areEqual(self.headquarters_city, "")) {
                output.encodeStringElement(serialDesc, 21, self.headquarters_city);
            }
            if (!Intrinsics.areEqual(self.headquarters_state, "")) {
                output.encodeStringElement(serialDesc, 22, self.headquarters_state);
            }
            if (!Intrinsics.areEqual(self.sector, "")) {
                output.encodeStringElement(serialDesc, 23, self.sector);
            }
            if (!Intrinsics.areEqual(self.industry, "")) {
                output.encodeStringElement(serialDesc, 24, self.industry);
            }
            Integer num = self.num_employees;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            Integer num2 = self.year_founded;
            if (num2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, SignedIntAsNumberSerializer.INSTANCE, num2);
            }
            String str3 = self.payable_date;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.ex_dividend_date;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.financial_status_indicator;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, StringSerializer.INSTANCE, str5);
            }
            String str6 = self.financial_status_description;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, StringSerializer.INSTANCE, str6);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 31, self.instrument_id);
            }
            KeyInfoDocumentDto keyInfoDocumentDto = self.key_info_document;
            if (keyInfoDocumentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 32, KeyInfoDocumentDto.Serializer.INSTANCE, keyInfoDocumentDto);
            }
            IdlDecimal idlDecimal16 = self.overnight_volume;
            if (idlDecimal16 != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, IdlDecimalSerializer.INSTANCE, idlDecimal16);
            }
        }

        public Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, BoundsDto bounds, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, String str, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, IdlDecimal idlDecimal11, String str2, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, IdlDecimal idlDecimal15, String description, String instrument, String ceo, String headquarters_city, String headquarters_state, String sector, String industry, Integer num, Integer num2, String str3, String str4, String str5, String str6, String instrument_id, KeyInfoDocumentDto keyInfoDocumentDto, IdlDecimal idlDecimal16) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(ceo, "ceo");
            Intrinsics.checkNotNullParameter(headquarters_city, "headquarters_city");
            Intrinsics.checkNotNullParameter(headquarters_state, "headquarters_state");
            Intrinsics.checkNotNullParameter(sector, "sector");
            Intrinsics.checkNotNullParameter(industry, "industry");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            this.open = idlDecimal;
            this.high = idlDecimal2;
            this.low = idlDecimal3;
            this.volume = idlDecimal4;
            this.bounds = bounds;
            this.average_volume_2_weeks = idlDecimal5;
            this.average_volume_52_weeks = idlDecimal6;
            this.average_volume_30_days = idlDecimal7;
            this.high_52_weeks = idlDecimal8;
            this.high_52_weeks_date = str;
            this.dividend_yield = idlDecimal9;
            this.float = idlDecimal10;
            this.low_52_weeks = idlDecimal11;
            this.low_52_weeks_date = str2;
            this.market_cap = idlDecimal12;
            this.pb_ratio = idlDecimal13;
            this.pe_ratio = idlDecimal14;
            this.shares_outstanding = idlDecimal15;
            this.description = description;
            this.instrument = instrument;
            this.ceo = ceo;
            this.headquarters_city = headquarters_city;
            this.headquarters_state = headquarters_state;
            this.sector = sector;
            this.industry = industry;
            this.num_employees = num;
            this.year_founded = num2;
            this.payable_date = str3;
            this.ex_dividend_date = str4;
            this.financial_status_indicator = str5;
            this.financial_status_description = str6;
            this.instrument_id = instrument_id;
            this.key_info_document = keyInfoDocumentDto;
            this.overnight_volume = idlDecimal16;
        }

        public final IdlDecimal getOpen() {
            return this.open;
        }

        public final IdlDecimal getHigh() {
            return this.high;
        }

        public final IdlDecimal getLow() {
            return this.low;
        }

        public final IdlDecimal getVolume() {
            return this.volume;
        }

        public final BoundsDto getBounds() {
            return this.bounds;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, BoundsDto boundsDto, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, String str, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, IdlDecimal idlDecimal11, String str2, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, IdlDecimal idlDecimal15, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, String str11, String str12, String str13, String str14, KeyInfoDocumentDto keyInfoDocumentDto, IdlDecimal idlDecimal16, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : idlDecimal2, (i & 4) != 0 ? null : idlDecimal3, (i & 8) != 0 ? null : idlDecimal4, (i & 16) != 0 ? BoundsDto.INSTANCE.getZeroValue() : boundsDto, (i & 32) != 0 ? null : idlDecimal5, (i & 64) != 0 ? null : idlDecimal6, (i & 128) != 0 ? null : idlDecimal7, (i & 256) != 0 ? null : idlDecimal8, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? null : idlDecimal9, (i & 2048) != 0 ? null : idlDecimal10, (i & 4096) != 0 ? null : idlDecimal11, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : idlDecimal12, (i & 32768) != 0 ? null : idlDecimal13, (i & 65536) != 0 ? null : idlDecimal14, (i & 131072) != 0 ? null : idlDecimal15, (i & 262144) != 0 ? "" : str3, (i & 524288) != 0 ? "" : str4, (i & 1048576) != 0 ? "" : str5, (i & 2097152) != 0 ? "" : str6, (i & 4194304) != 0 ? "" : str7, (i & 8388608) != 0 ? "" : str8, (i & 16777216) != 0 ? "" : str9, (i & 33554432) != 0 ? null : num, (i & 67108864) != 0 ? null : num2, (i & 134217728) != 0 ? null : str10, (i & 268435456) != 0 ? null : str11, (i & 536870912) != 0 ? null : str12, (i & 1073741824) != 0 ? null : str13, (i & Integer.MIN_VALUE) == 0 ? str14 : "", (i2 & 1) != 0 ? null : keyInfoDocumentDto, (i2 & 2) != 0 ? null : idlDecimal16);
        }

        public final IdlDecimal getAverage_volume_2_weeks() {
            return this.average_volume_2_weeks;
        }

        public final IdlDecimal getAverage_volume_52_weeks() {
            return this.average_volume_52_weeks;
        }

        public final IdlDecimal getAverage_volume_30_days() {
            return this.average_volume_30_days;
        }

        public final IdlDecimal getHigh_52_weeks() {
            return this.high_52_weeks;
        }

        public final String getHigh_52_weeks_date() {
            return this.high_52_weeks_date;
        }

        public final IdlDecimal getDividend_yield() {
            return this.dividend_yield;
        }

        public final IdlDecimal getFloat() {
            return this.float;
        }

        public final IdlDecimal getLow_52_weeks() {
            return this.low_52_weeks;
        }

        public final String getLow_52_weeks_date() {
            return this.low_52_weeks_date;
        }

        public final IdlDecimal getMarket_cap() {
            return this.market_cap;
        }

        public final IdlDecimal getPb_ratio() {
            return this.pb_ratio;
        }

        public final IdlDecimal getPe_ratio() {
            return this.pe_ratio;
        }

        public final IdlDecimal getShares_outstanding() {
            return this.shares_outstanding;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getInstrument() {
            return this.instrument;
        }

        public final String getCeo() {
            return this.ceo;
        }

        public final String getHeadquarters_city() {
            return this.headquarters_city;
        }

        public final String getHeadquarters_state() {
            return this.headquarters_state;
        }

        public final String getSector() {
            return this.sector;
        }

        public final String getIndustry() {
            return this.industry;
        }

        public final Integer getNum_employees() {
            return this.num_employees;
        }

        public final Integer getYear_founded() {
            return this.year_founded;
        }

        public final String getPayable_date() {
            return this.payable_date;
        }

        public final String getEx_dividend_date() {
            return this.ex_dividend_date;
        }

        public final String getFinancial_status_indicator() {
            return this.financial_status_indicator;
        }

        public final String getFinancial_status_description() {
            return this.financial_status_description;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final KeyInfoDocumentDto getKey_info_document() {
            return this.key_info_document;
        }

        public final IdlDecimal getOvernight_volume() {
            return this.overnight_volume;
        }
    }

    /* compiled from: FundamentalDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmd_server_proxy/service/v1/FundamentalDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmd_server_proxy/service/v1/FundamentalDto;", "Lmd_server_proxy/service/v1/Fundamental;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmd_server_proxy/service/v1/FundamentalDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FundamentalDto, Fundamental> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FundamentalDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FundamentalDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FundamentalDto> getBinaryBase64Serializer() {
            return (KSerializer) FundamentalDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Fundamental> getProtoAdapter() {
            return Fundamental.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FundamentalDto getZeroValue() {
            return FundamentalDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FundamentalDto fromProto(Fundamental proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String open = proto.getOpen();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal = open != null ? new IdlDecimal(open) : null;
            String high = proto.getHigh();
            IdlDecimal idlDecimal2 = high != null ? new IdlDecimal(high) : null;
            String low = proto.getLow();
            IdlDecimal idlDecimal3 = low != null ? new IdlDecimal(low) : null;
            String volume = proto.getVolume();
            IdlDecimal idlDecimal4 = volume != null ? new IdlDecimal(volume) : null;
            BoundsDto boundsDtoFromProto = BoundsDto.INSTANCE.fromProto(proto.getBounds());
            String average_volume_2_weeks = proto.getAverage_volume_2_weeks();
            IdlDecimal idlDecimal5 = average_volume_2_weeks != null ? new IdlDecimal(average_volume_2_weeks) : null;
            String average_volume_52_weeks = proto.getAverage_volume_52_weeks();
            IdlDecimal idlDecimal6 = average_volume_52_weeks != null ? new IdlDecimal(average_volume_52_weeks) : null;
            String average_volume_30_days = proto.getAverage_volume_30_days();
            IdlDecimal idlDecimal7 = average_volume_30_days != null ? new IdlDecimal(average_volume_30_days) : null;
            String high_52_weeks = proto.getHigh_52_weeks();
            IdlDecimal idlDecimal8 = high_52_weeks != null ? new IdlDecimal(high_52_weeks) : null;
            String high_52_weeks_date = proto.getHigh_52_weeks_date();
            String dividend_yield = proto.getDividend_yield();
            IdlDecimal idlDecimal9 = dividend_yield != null ? new IdlDecimal(dividend_yield) : null;
            String str = proto.getFloat();
            IdlDecimal idlDecimal10 = str != null ? new IdlDecimal(str) : null;
            String low_52_weeks = proto.getLow_52_weeks();
            IdlDecimal idlDecimal11 = low_52_weeks != null ? new IdlDecimal(low_52_weeks) : null;
            String low_52_weeks_date = proto.getLow_52_weeks_date();
            String market_cap = proto.getMarket_cap();
            IdlDecimal idlDecimal12 = market_cap != null ? new IdlDecimal(market_cap) : null;
            String pb_ratio = proto.getPb_ratio();
            IdlDecimal idlDecimal13 = pb_ratio != null ? new IdlDecimal(pb_ratio) : null;
            String pe_ratio = proto.getPe_ratio();
            IdlDecimal idlDecimal14 = pe_ratio != null ? new IdlDecimal(pe_ratio) : null;
            String shares_outstanding = proto.getShares_outstanding();
            IdlDecimal idlDecimal15 = shares_outstanding != null ? new IdlDecimal(shares_outstanding) : null;
            String description = proto.getDescription();
            String instrument = proto.getInstrument();
            String ceo = proto.getCeo();
            String headquarters_city = proto.getHeadquarters_city();
            String headquarters_state = proto.getHeadquarters_state();
            String sector = proto.getSector();
            String industry = proto.getIndustry();
            Integer num_employees = proto.getNum_employees();
            Integer year_founded = proto.getYear_founded();
            String payable_date = proto.getPayable_date();
            String ex_dividend_date = proto.getEx_dividend_date();
            String financial_status_indicator = proto.getFinancial_status_indicator();
            String financial_status_description = proto.getFinancial_status_description();
            String instrument_id = proto.getInstrument_id();
            KeyInfoDocument key_info_document = proto.getKey_info_document();
            KeyInfoDocumentDto keyInfoDocumentDtoFromProto = key_info_document != null ? KeyInfoDocumentDto.INSTANCE.fromProto(key_info_document) : null;
            String overnight_volume = proto.getOvernight_volume();
            return new FundamentalDto(new Surrogate(idlDecimal, idlDecimal2, idlDecimal3, idlDecimal4, boundsDtoFromProto, idlDecimal5, idlDecimal6, idlDecimal7, idlDecimal8, high_52_weeks_date, idlDecimal9, idlDecimal10, idlDecimal11, low_52_weeks_date, idlDecimal12, idlDecimal13, idlDecimal14, idlDecimal15, description, instrument, ceo, headquarters_city, headquarters_state, sector, industry, num_employees, year_founded, payable_date, ex_dividend_date, financial_status_indicator, financial_status_description, instrument_id, keyInfoDocumentDtoFromProto, overnight_volume != null ? new IdlDecimal(overnight_volume) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: md_server_proxy.service.v1.FundamentalDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundamentalDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FundamentalDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FundamentalDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmd_server_proxy/service/v1/FundamentalDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/FundamentalDto;", "<init>", "()V", "surrogateSerializer", "Lmd_server_proxy/service/v1/FundamentalDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FundamentalDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/md_server_proxy.service.v1.Fundamental", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FundamentalDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FundamentalDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FundamentalDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FundamentalDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmd_server_proxy/service/v1/FundamentalDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "md_server_proxy.service.v1.FundamentalDto";
        }
    }
}
