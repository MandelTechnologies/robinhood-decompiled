package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import nummus.p512v1.CostBasisBottomSheetDto;
import nummus.p512v1.CostBasisLotDto;
import nummus.p512v1.CostBasisLotsSummaryDto;
import nummus.p512v1.CostBasisStatusDto;
import nummus.p512v1.GetCostBasisDetailsResponseDto;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: GetCostBasisDetailsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004JIKLB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÅ\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b\u0006\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010(H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020,H\u0016¢\u0006\u0004\b5\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u0010'R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010'R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010'R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010'R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b=\u0010'R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u0010'R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0019\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020!0 8F¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, m3636d2 = {"Lnummus/v1/GetCostBasisDetailsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/GetCostBasisDetailsResponse;", "Landroid/os/Parcelable;", "Lnummus/v1/GetCostBasisDetailsResponseDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/GetCostBasisDetailsResponseDto$Surrogate;)V", "", "source_id", "source_type", "account_id", "year", "Lnummus/v1/CostBasisStatusDto;", "status", "status_display_text", "currency_pair_id", "currency_code", "currency_name", "Lcom/robinhood/idl/IdlDecimal;", "deposit_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "deposit_date", "estimated_fiat_value", "", "is_editable", "Lnummus/v1/CostBasisLotsSummaryDto;", ErrorBundle.SUMMARY_ENTRY, "", "Lnummus/v1/CostBasisLotDto;", "lots", "", "Lnummus/v1/CostBasisBottomSheetDto;", "bottom_sheets", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CostBasisStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;ZLnummus/v1/CostBasisLotsSummaryDto;Ljava/util/List;Ljava/util/Map;)V", "toProto", "()Lnummus/v1/GetCostBasisDetailsResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/GetCostBasisDetailsResponseDto$Surrogate;", "getSource_id", "getSource_type", "getAccount_id", "getStatus", "()Lnummus/v1/CostBasisStatusDto;", "getStatus_display_text", "getCurrency_pair_id", "getCurrency_code", "getDeposit_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getDeposit_date", "()Lj$/time/Instant;", "getSummary", "()Lnummus/v1/CostBasisLotsSummaryDto;", "getLots", "()Ljava/util/List;", "getBottom_sheets", "()Ljava/util/Map;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class GetCostBasisDetailsResponseDto implements Dto3<GetCostBasisDetailsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCostBasisDetailsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCostBasisDetailsResponseDto, GetCostBasisDetailsResponse>> binaryBase64Serializer$delegate;
    private static final GetCostBasisDetailsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCostBasisDetailsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCostBasisDetailsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getSource_id() {
        return this.surrogate.getSource_id();
    }

    public final String getSource_type() {
        return this.surrogate.getSource_type();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final CostBasisStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final String getStatus_display_text() {
        return this.surrogate.getStatus_display_text();
    }

    public final String getCurrency_pair_id() {
        return this.surrogate.getCurrency_pair_id();
    }

    public final String getCurrency_code() {
        return this.surrogate.getCurrency_code();
    }

    public final IdlDecimal getDeposit_amount() {
        return this.surrogate.getDeposit_amount();
    }

    public final Instant getDeposit_date() {
        return this.surrogate.getDeposit_date();
    }

    public final CostBasisLotsSummaryDto getSummary() {
        return this.surrogate.getSummary();
    }

    public final List<CostBasisLotDto> getLots() {
        return this.surrogate.getLots();
    }

    public final Map<String, CostBasisBottomSheetDto> getBottom_sheets() {
        return this.surrogate.getBottom_sheets();
    }

    public /* synthetic */ GetCostBasisDetailsResponseDto(String str, String str2, String str3, String str4, CostBasisStatusDto costBasisStatusDto, String str5, String str6, String str7, String str8, IdlDecimal idlDecimal, Instant instant, IdlDecimal idlDecimal2, boolean z, CostBasisLotsSummaryDto costBasisLotsSummaryDto, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CostBasisStatusDto.INSTANCE.getZeroValue() : costBasisStatusDto, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal, (i & 1024) != 0 ? null : instant, (i & 2048) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4096) != 0 ? false : z, (i & 8192) == 0 ? costBasisLotsSummaryDto : null, (i & 16384) != 0 ? CollectionsKt.emptyList() : list, (i & 32768) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCostBasisDetailsResponseDto(String source_id, String source_type, String account_id, String year, CostBasisStatusDto status, String status_display_text, String currency_pair_id, String currency_code, String currency_name, IdlDecimal deposit_amount, Instant instant, IdlDecimal estimated_fiat_value, boolean z, CostBasisLotsSummaryDto costBasisLotsSummaryDto, List<CostBasisLotDto> lots, Map<String, CostBasisBottomSheetDto> bottom_sheets) {
        this(new Surrogate(source_id, source_type, account_id, year, status, status_display_text, currency_pair_id, currency_code, currency_name, deposit_amount, instant, estimated_fiat_value, z, costBasisLotsSummaryDto, lots, bottom_sheets));
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(status_display_text, "status_display_text");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(currency_name, "currency_name");
        Intrinsics.checkNotNullParameter(deposit_amount, "deposit_amount");
        Intrinsics.checkNotNullParameter(estimated_fiat_value, "estimated_fiat_value");
        Intrinsics.checkNotNullParameter(lots, "lots");
        Intrinsics.checkNotNullParameter(bottom_sheets, "bottom_sheets");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetCostBasisDetailsResponse toProto() {
        String source_id = this.surrogate.getSource_id();
        String source_type = this.surrogate.getSource_type();
        String account_id = this.surrogate.getAccount_id();
        String year = this.surrogate.getYear();
        CostBasisStatus costBasisStatus = (CostBasisStatus) this.surrogate.getStatus().toProto();
        String status_display_text = this.surrogate.getStatus_display_text();
        String currency_pair_id = this.surrogate.getCurrency_pair_id();
        String currency_code = this.surrogate.getCurrency_code();
        String currency_name = this.surrogate.getCurrency_name();
        String stringValue = this.surrogate.getDeposit_amount().getStringValue();
        Instant deposit_date = this.surrogate.getDeposit_date();
        String stringValue2 = this.surrogate.getEstimated_fiat_value().getStringValue();
        boolean is_editable = this.surrogate.getIs_editable();
        CostBasisLotsSummaryDto summary = this.surrogate.getSummary();
        CostBasisLotsSummary proto = summary != null ? summary.toProto() : null;
        List<CostBasisLotDto> lots = this.surrogate.getLots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lots, 10));
        Iterator<T> it = lots.iterator();
        while (it.hasNext()) {
            arrayList.add(((CostBasisLotDto) it.next()).toProto());
        }
        Set<Map.Entry<String, CostBasisBottomSheetDto>> setEntrySet = this.surrogate.getBottom_sheets().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), ((CostBasisBottomSheetDto) entry.getValue()).toProto());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return new GetCostBasisDetailsResponse(source_id, source_type, account_id, year, costBasisStatus, status_display_text, currency_pair_id, currency_code, currency_name, stringValue, deposit_date, stringValue2, is_editable, proto, arrayList, linkedHashMap, null, 65536, null);
    }

    public String toString() {
        return "[GetCostBasisDetailsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCostBasisDetailsResponseDto) && Intrinsics.areEqual(((GetCostBasisDetailsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCostBasisDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b<\b\u0083\b\u0018\u0000 g2\u00020\u0001:\u0002hgBÿ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012.\b\u0002\u0010\u0015\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0014\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"BË\u0001\b\u0010\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b!\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020#HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u00102R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00108\u0012\u0004\b=\u0010;\u001a\u0004\b<\u00102R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00108\u0012\u0004\b?\u0010;\u001a\u0004\b>\u00102R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00108\u0012\u0004\bA\u0010;\u001a\u0004\b@\u00102R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010B\u0012\u0004\bE\u0010;\u001a\u0004\bC\u0010DR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\bG\u0010;\u001a\u0004\bF\u00102R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00108\u0012\u0004\bI\u0010;\u001a\u0004\bH\u00102R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\bK\u0010;\u001a\u0004\bJ\u00102R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00108\u0012\u0004\bM\u0010;\u001a\u0004\bL\u00102R/\u0010\u0011\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010N\u0012\u0004\bQ\u0010;\u001a\u0004\bO\u0010PRF\u0010\u0015\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010R\u0012\u0004\bU\u0010;\u001a\u0004\bS\u0010TR/\u0010\u0016\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010N\u0012\u0004\bW\u0010;\u001a\u0004\bV\u0010PR \u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010X\u0012\u0004\bZ\u0010;\u001a\u0004\b\u0018\u0010YR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010[\u0012\u0004\b^\u0010;\u001a\u0004\b\\\u0010]R&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010_\u0012\u0004\bb\u0010;\u001a\u0004\b`\u0010aR,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010c\u0012\u0004\bf\u0010;\u001a\u0004\bd\u0010e¨\u0006i"}, m3636d2 = {"Lnummus/v1/GetCostBasisDetailsResponseDto$Surrogate;", "", "", "source_id", "source_type", "account_id", "year", "Lnummus/v1/CostBasisStatusDto;", "status", "status_display_text", "currency_pair_id", "currency_code", "currency_name", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "deposit_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "deposit_date", "estimated_fiat_value", "", "is_editable", "Lnummus/v1/CostBasisLotsSummaryDto;", ErrorBundle.SUMMARY_ENTRY, "", "Lnummus/v1/CostBasisLotDto;", "lots", "", "Lnummus/v1/CostBasisBottomSheetDto;", "bottom_sheets", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CostBasisStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;ZLnummus/v1/CostBasisLotsSummaryDto;Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CostBasisStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;ZLnummus/v1/CostBasisLotsSummaryDto;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/GetCostBasisDetailsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource_id", "getSource_id$annotations", "()V", "getSource_type", "getSource_type$annotations", "getAccount_id", "getAccount_id$annotations", "getYear", "getYear$annotations", "Lnummus/v1/CostBasisStatusDto;", "getStatus", "()Lnummus/v1/CostBasisStatusDto;", "getStatus$annotations", "getStatus_display_text", "getStatus_display_text$annotations", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "getCurrency_code", "getCurrency_code$annotations", "getCurrency_name", "getCurrency_name$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getDeposit_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getDeposit_amount$annotations", "Lj$/time/Instant;", "getDeposit_date", "()Lj$/time/Instant;", "getDeposit_date$annotations", "getEstimated_fiat_value", "getEstimated_fiat_value$annotations", "Z", "()Z", "is_editable$annotations", "Lnummus/v1/CostBasisLotsSummaryDto;", "getSummary", "()Lnummus/v1/CostBasisLotsSummaryDto;", "getSummary$annotations", "Ljava/util/List;", "getLots", "()Ljava/util/List;", "getLots$annotations", "Ljava/util/Map;", "getBottom_sheets", "()Ljava/util/Map;", "getBottom_sheets$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final Map<String, CostBasisBottomSheetDto> bottom_sheets;
        private final String currency_code;
        private final String currency_name;
        private final String currency_pair_id;
        private final IdlDecimal deposit_amount;
        private final Instant deposit_date;
        private final IdlDecimal estimated_fiat_value;
        private final boolean is_editable;
        private final List<CostBasisLotDto> lots;
        private final String source_id;
        private final String source_type;
        private final CostBasisStatusDto status;
        private final String status_display_text;
        private final CostBasisLotsSummaryDto summary;
        private final String year;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (CostBasisStatusDto) null, (String) null, (String) null, (String) null, (String) null, (IdlDecimal) null, (Instant) null, (IdlDecimal) null, false, (CostBasisLotsSummaryDto) null, (List) null, (Map) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(CostBasisLotDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, CostBasisBottomSheetDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.source_id, surrogate.source_id) && Intrinsics.areEqual(this.source_type, surrogate.source_type) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.year, surrogate.year) && this.status == surrogate.status && Intrinsics.areEqual(this.status_display_text, surrogate.status_display_text) && Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id) && Intrinsics.areEqual(this.currency_code, surrogate.currency_code) && Intrinsics.areEqual(this.currency_name, surrogate.currency_name) && Intrinsics.areEqual(this.deposit_amount, surrogate.deposit_amount) && Intrinsics.areEqual(this.deposit_date, surrogate.deposit_date) && Intrinsics.areEqual(this.estimated_fiat_value, surrogate.estimated_fiat_value) && this.is_editable == surrogate.is_editable && Intrinsics.areEqual(this.summary, surrogate.summary) && Intrinsics.areEqual(this.lots, surrogate.lots) && Intrinsics.areEqual(this.bottom_sheets, surrogate.bottom_sheets);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((this.source_id.hashCode() * 31) + this.source_type.hashCode()) * 31) + this.account_id.hashCode()) * 31) + this.year.hashCode()) * 31) + this.status.hashCode()) * 31) + this.status_display_text.hashCode()) * 31) + this.currency_pair_id.hashCode()) * 31) + this.currency_code.hashCode()) * 31) + this.currency_name.hashCode()) * 31) + this.deposit_amount.hashCode()) * 31;
            Instant instant = this.deposit_date;
            int iHashCode2 = (((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.estimated_fiat_value.hashCode()) * 31) + Boolean.hashCode(this.is_editable)) * 31;
            CostBasisLotsSummaryDto costBasisLotsSummaryDto = this.summary;
            return ((((iHashCode2 + (costBasisLotsSummaryDto != null ? costBasisLotsSummaryDto.hashCode() : 0)) * 31) + this.lots.hashCode()) * 31) + this.bottom_sheets.hashCode();
        }

        public String toString() {
            return "Surrogate(source_id=" + this.source_id + ", source_type=" + this.source_type + ", account_id=" + this.account_id + ", year=" + this.year + ", status=" + this.status + ", status_display_text=" + this.status_display_text + ", currency_pair_id=" + this.currency_pair_id + ", currency_code=" + this.currency_code + ", currency_name=" + this.currency_name + ", deposit_amount=" + this.deposit_amount + ", deposit_date=" + this.deposit_date + ", estimated_fiat_value=" + this.estimated_fiat_value + ", is_editable=" + this.is_editable + ", summary=" + this.summary + ", lots=" + this.lots + ", bottom_sheets=" + this.bottom_sheets + ")";
        }

        /* compiled from: GetCostBasisDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/GetCostBasisDetailsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/GetCostBasisDetailsResponseDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCostBasisDetailsResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: nummus.v1.GetCostBasisDetailsResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCostBasisDetailsResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: nummus.v1.GetCostBasisDetailsResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCostBasisDetailsResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, CostBasisStatusDto costBasisStatusDto, String str5, String str6, String str7, String str8, IdlDecimal idlDecimal, Instant instant, IdlDecimal idlDecimal2, boolean z, CostBasisLotsSummaryDto costBasisLotsSummaryDto, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.source_id = "";
            } else {
                this.source_id = str;
            }
            if ((i & 2) == 0) {
                this.source_type = "";
            } else {
                this.source_type = str2;
            }
            if ((i & 4) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str3;
            }
            if ((i & 8) == 0) {
                this.year = "";
            } else {
                this.year = str4;
            }
            if ((i & 16) == 0) {
                this.status = CostBasisStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = costBasisStatusDto;
            }
            if ((i & 32) == 0) {
                this.status_display_text = "";
            } else {
                this.status_display_text = str5;
            }
            if ((i & 64) == 0) {
                this.currency_pair_id = "";
            } else {
                this.currency_pair_id = str6;
            }
            if ((i & 128) == 0) {
                this.currency_code = "";
            } else {
                this.currency_code = str7;
            }
            if ((i & 256) == 0) {
                this.currency_name = "";
            } else {
                this.currency_name = str8;
            }
            if ((i & 512) == 0) {
                this.deposit_amount = new IdlDecimal("");
            } else {
                this.deposit_amount = idlDecimal;
            }
            if ((i & 1024) == 0) {
                this.deposit_date = null;
            } else {
                this.deposit_date = instant;
            }
            if ((i & 2048) == 0) {
                this.estimated_fiat_value = new IdlDecimal("");
            } else {
                this.estimated_fiat_value = idlDecimal2;
            }
            this.is_editable = (i & 4096) == 0 ? false : z;
            if ((i & 8192) == 0) {
                this.summary = null;
            } else {
                this.summary = costBasisLotsSummaryDto;
            }
            this.lots = (i & 16384) == 0 ? CollectionsKt.emptyList() : list;
            this.bottom_sheets = (i & 32768) == 0 ? MapsKt.emptyMap() : map;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.source_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.source_id);
            }
            if (!Intrinsics.areEqual(self.source_type, "")) {
                output.encodeStringElement(serialDesc, 1, self.source_type);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.account_id);
            }
            if (!Intrinsics.areEqual(self.year, "")) {
                output.encodeStringElement(serialDesc, 3, self.year);
            }
            if (self.status != CostBasisStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, CostBasisStatusDto.Serializer.INSTANCE, self.status);
            }
            if (!Intrinsics.areEqual(self.status_display_text, "")) {
                output.encodeStringElement(serialDesc, 5, self.status_display_text);
            }
            if (!Intrinsics.areEqual(self.currency_pair_id, "")) {
                output.encodeStringElement(serialDesc, 6, self.currency_pair_id);
            }
            if (!Intrinsics.areEqual(self.currency_code, "")) {
                output.encodeStringElement(serialDesc, 7, self.currency_code);
            }
            if (!Intrinsics.areEqual(self.currency_name, "")) {
                output.encodeStringElement(serialDesc, 8, self.currency_name);
            }
            if (!Intrinsics.areEqual(self.deposit_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, self.deposit_amount);
            }
            Instant instant = self.deposit_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.estimated_fiat_value, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, self.estimated_fiat_value);
            }
            boolean z = self.is_editable;
            if (z) {
                output.encodeBooleanElement(serialDesc, 12, z);
            }
            CostBasisLotsSummaryDto costBasisLotsSummaryDto = self.summary;
            if (costBasisLotsSummaryDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, CostBasisLotsSummaryDto.Serializer.INSTANCE, costBasisLotsSummaryDto);
            }
            if (!Intrinsics.areEqual(self.lots, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 14, lazyArr[14].getValue(), self.lots);
            }
            if (Intrinsics.areEqual(self.bottom_sheets, MapsKt.emptyMap())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 15, lazyArr[15].getValue(), self.bottom_sheets);
        }

        public Surrogate(String source_id, String source_type, String account_id, String year, CostBasisStatusDto status, String status_display_text, String currency_pair_id, String currency_code, String currency_name, IdlDecimal deposit_amount, Instant instant, IdlDecimal estimated_fiat_value, boolean z, CostBasisLotsSummaryDto costBasisLotsSummaryDto, List<CostBasisLotDto> lots, Map<String, CostBasisBottomSheetDto> bottom_sheets) {
            Intrinsics.checkNotNullParameter(source_id, "source_id");
            Intrinsics.checkNotNullParameter(source_type, "source_type");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(year, "year");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(status_display_text, "status_display_text");
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
            Intrinsics.checkNotNullParameter(currency_name, "currency_name");
            Intrinsics.checkNotNullParameter(deposit_amount, "deposit_amount");
            Intrinsics.checkNotNullParameter(estimated_fiat_value, "estimated_fiat_value");
            Intrinsics.checkNotNullParameter(lots, "lots");
            Intrinsics.checkNotNullParameter(bottom_sheets, "bottom_sheets");
            this.source_id = source_id;
            this.source_type = source_type;
            this.account_id = account_id;
            this.year = year;
            this.status = status;
            this.status_display_text = status_display_text;
            this.currency_pair_id = currency_pair_id;
            this.currency_code = currency_code;
            this.currency_name = currency_name;
            this.deposit_amount = deposit_amount;
            this.deposit_date = instant;
            this.estimated_fiat_value = estimated_fiat_value;
            this.is_editable = z;
            this.summary = costBasisLotsSummaryDto;
            this.lots = lots;
            this.bottom_sheets = bottom_sheets;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, CostBasisStatusDto costBasisStatusDto, String str5, String str6, String str7, String str8, IdlDecimal idlDecimal, Instant instant, IdlDecimal idlDecimal2, boolean z, CostBasisLotsSummaryDto costBasisLotsSummaryDto, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CostBasisStatusDto.INSTANCE.getZeroValue() : costBasisStatusDto, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal, (i & 1024) != 0 ? null : instant, (i & 2048) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4096) != 0 ? false : z, (i & 8192) == 0 ? costBasisLotsSummaryDto : null, (i & 16384) != 0 ? CollectionsKt.emptyList() : list, (i & 32768) != 0 ? MapsKt.emptyMap() : map);
        }

        public final String getSource_id() {
            return this.source_id;
        }

        public final String getSource_type() {
            return this.source_type;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final String getYear() {
            return this.year;
        }

        public final CostBasisStatusDto getStatus() {
            return this.status;
        }

        public final String getStatus_display_text() {
            return this.status_display_text;
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        public final String getCurrency_code() {
            return this.currency_code;
        }

        public final String getCurrency_name() {
            return this.currency_name;
        }

        public final IdlDecimal getDeposit_amount() {
            return this.deposit_amount;
        }

        public final Instant getDeposit_date() {
            return this.deposit_date;
        }

        public final IdlDecimal getEstimated_fiat_value() {
            return this.estimated_fiat_value;
        }

        /* renamed from: is_editable, reason: from getter */
        public final boolean getIs_editable() {
            return this.is_editable;
        }

        public final CostBasisLotsSummaryDto getSummary() {
            return this.summary;
        }

        public final List<CostBasisLotDto> getLots() {
            return this.lots;
        }

        public final Map<String, CostBasisBottomSheetDto> getBottom_sheets() {
            return this.bottom_sheets;
        }
    }

    /* compiled from: GetCostBasisDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/GetCostBasisDetailsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/GetCostBasisDetailsResponseDto;", "Lnummus/v1/GetCostBasisDetailsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/GetCostBasisDetailsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCostBasisDetailsResponseDto, GetCostBasisDetailsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCostBasisDetailsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCostBasisDetailsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCostBasisDetailsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCostBasisDetailsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCostBasisDetailsResponse> getProtoAdapter() {
            return GetCostBasisDetailsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCostBasisDetailsResponseDto getZeroValue() {
            return GetCostBasisDetailsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCostBasisDetailsResponseDto fromProto(GetCostBasisDetailsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String source_id = proto.getSource_id();
            String source_type = proto.getSource_type();
            String account_id = proto.getAccount_id();
            String year = proto.getYear();
            CostBasisStatusDto costBasisStatusDtoFromProto = CostBasisStatusDto.INSTANCE.fromProto(proto.getStatus());
            String status_display_text = proto.getStatus_display_text();
            String currency_pair_id = proto.getCurrency_pair_id();
            String currency_code = proto.getCurrency_code();
            String currency_name = proto.getCurrency_name();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getDeposit_amount());
            Instant deposit_date = proto.getDeposit_date();
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getEstimated_fiat_value());
            boolean zIs_editable = proto.getIs_editable();
            CostBasisLotsSummary summary = proto.getSummary();
            CostBasisLotsSummaryDto costBasisLotsSummaryDtoFromProto = summary != null ? CostBasisLotsSummaryDto.INSTANCE.fromProto(summary) : null;
            List<CostBasisLot> lots = proto.getLots();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lots, 10));
            Iterator<T> it = lots.iterator();
            while (it.hasNext()) {
                arrayList.add(CostBasisLotDto.INSTANCE.fromProto((CostBasisLot) it.next()));
            }
            Set<Map.Entry<String, CostBasisBottomSheet>> setEntrySet = proto.getBottom_sheets().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Iterator it3 = it2;
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), CostBasisBottomSheetDto.INSTANCE.fromProto((CostBasisBottomSheet) entry.getValue()));
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                it2 = it3;
                arrayList = arrayList;
            }
            return new GetCostBasisDetailsResponseDto(new Surrogate(source_id, source_type, account_id, year, costBasisStatusDtoFromProto, status_display_text, currency_pair_id, currency_code, currency_name, idlDecimal, deposit_date, idlDecimal2, zIs_editable, costBasisLotsSummaryDtoFromProto, arrayList, linkedHashMap), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.GetCostBasisDetailsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCostBasisDetailsResponseDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new GetCostBasisDetailsResponseDto(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCostBasisDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/GetCostBasisDetailsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/GetCostBasisDetailsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/GetCostBasisDetailsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCostBasisDetailsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.GetCostBasisDetailsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCostBasisDetailsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCostBasisDetailsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCostBasisDetailsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCostBasisDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/GetCostBasisDetailsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "nummus.v1.GetCostBasisDetailsResponseDto";
        }
    }
}
