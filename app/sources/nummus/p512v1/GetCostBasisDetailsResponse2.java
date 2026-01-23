package nummus.p512v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: GetCostBasisDetailsResponse.kt */
@Metadata(m3635d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m3636d2 = {"nummus/v1/GetCostBasisDetailsResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lnummus/v1/GetCostBasisDetailsResponse;", "bottom_sheetsAdapter", "", "", "Lnummus/v1/CostBasisBottomSheet;", "getBottom_sheetsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "bottom_sheetsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: nummus.v1.GetCostBasisDetailsResponse$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes25.dex */
public final class GetCostBasisDetailsResponse2 extends ProtoAdapter<GetCostBasisDetailsResponse> {

    /* renamed from: bottom_sheetsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy bottom_sheetsAdapter;

    GetCostBasisDetailsResponse2(FieldEncoding fieldEncoding, KClass<GetCostBasisDetailsResponse> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/nummus.v1.GetCostBasisDetailsResponse", syntax, (Object) null, "nummus/nummus/proto/v1/cost_basis.proto");
        this.bottom_sheetsAdapter = LazyKt.lazy(new Function0() { // from class: nummus.v1.GetCostBasisDetailsResponse$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCostBasisDetailsResponse2.bottom_sheetsAdapter_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter bottom_sheetsAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, CostBasisBottomSheet.ADAPTER);
    }

    private final ProtoAdapter<Map<String, CostBasisBottomSheet>> getBottom_sheetsAdapter() {
        return (ProtoAdapter) this.bottom_sheetsAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(GetCostBasisDetailsResponse value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getSource_id(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSource_id());
        }
        if (!Intrinsics.areEqual(value.getSource_type(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSource_type());
        }
        if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_id());
        }
        if (!Intrinsics.areEqual(value.getYear(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getYear());
        }
        if (value.getStatus() != CostBasisStatus.COST_BASIS_STATUS_UNSPECIFIED) {
            size += CostBasisStatus.ADAPTER.encodedSizeWithTag(5, value.getStatus());
        }
        if (!Intrinsics.areEqual(value.getStatus_display_text(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getStatus_display_text());
        }
        if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getCurrency_pair_id());
        }
        if (!Intrinsics.areEqual(value.getCurrency_code(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getCurrency_code());
        }
        if (!Intrinsics.areEqual(value.getCurrency_name(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getCurrency_name());
        }
        if (!Intrinsics.areEqual(value.getDeposit_amount(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getDeposit_amount());
        }
        if (value.getDeposit_date() != null) {
            size += ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getDeposit_date());
        }
        if (!Intrinsics.areEqual(value.getEstimated_fiat_value(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getEstimated_fiat_value());
        }
        if (value.getIs_editable()) {
            size += ProtoAdapter.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.getIs_editable()));
        }
        if (value.getSummary() != null) {
            size += CostBasisLotsSummary.ADAPTER.encodedSizeWithTag(14, value.getSummary());
        }
        return size + CostBasisLot.ADAPTER.asRepeated().encodedSizeWithTag(15, value.getLots()) + getBottom_sheetsAdapter().encodedSizeWithTag(16, value.getBottom_sheets());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, GetCostBasisDetailsResponse value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getSource_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSource_id());
        }
        if (!Intrinsics.areEqual(value.getSource_type(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource_type());
        }
        if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_id());
        }
        if (!Intrinsics.areEqual(value.getYear(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getYear());
        }
        if (value.getStatus() != CostBasisStatus.COST_BASIS_STATUS_UNSPECIFIED) {
            CostBasisStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
        }
        if (!Intrinsics.areEqual(value.getStatus_display_text(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getStatus_display_text());
        }
        if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCurrency_pair_id());
        }
        if (!Intrinsics.areEqual(value.getCurrency_code(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCurrency_code());
        }
        if (!Intrinsics.areEqual(value.getCurrency_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCurrency_name());
        }
        if (!Intrinsics.areEqual(value.getDeposit_amount(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDeposit_amount());
        }
        if (value.getDeposit_date() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getDeposit_date());
        }
        if (!Intrinsics.areEqual(value.getEstimated_fiat_value(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getEstimated_fiat_value());
        }
        if (value.getIs_editable()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) Boolean.valueOf(value.getIs_editable()));
        }
        if (value.getSummary() != null) {
            CostBasisLotsSummary.ADAPTER.encodeWithTag(writer, 14, (int) value.getSummary());
        }
        CostBasisLot.ADAPTER.asRepeated().encodeWithTag(writer, 15, (int) value.getLots());
        getBottom_sheetsAdapter().encodeWithTag(writer, 16, (int) value.getBottom_sheets());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, GetCostBasisDetailsResponse value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getBottom_sheetsAdapter().encodeWithTag(writer, 16, (int) value.getBottom_sheets());
        CostBasisLot.ADAPTER.asRepeated().encodeWithTag(writer, 15, (int) value.getLots());
        if (value.getSummary() != null) {
            CostBasisLotsSummary.ADAPTER.encodeWithTag(writer, 14, (int) value.getSummary());
        }
        if (value.getIs_editable()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) Boolean.valueOf(value.getIs_editable()));
        }
        if (!Intrinsics.areEqual(value.getEstimated_fiat_value(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getEstimated_fiat_value());
        }
        if (value.getDeposit_date() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getDeposit_date());
        }
        if (!Intrinsics.areEqual(value.getDeposit_amount(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDeposit_amount());
        }
        if (!Intrinsics.areEqual(value.getCurrency_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCurrency_name());
        }
        if (!Intrinsics.areEqual(value.getCurrency_code(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCurrency_code());
        }
        if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCurrency_pair_id());
        }
        if (!Intrinsics.areEqual(value.getStatus_display_text(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getStatus_display_text());
        }
        if (value.getStatus() != CostBasisStatus.COST_BASIS_STATUS_UNSPECIFIED) {
            CostBasisStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
        }
        if (!Intrinsics.areEqual(value.getYear(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getYear());
        }
        if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_id());
        }
        if (!Intrinsics.areEqual(value.getSource_type(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource_type());
        }
        if (Intrinsics.areEqual(value.getSource_id(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSource_id());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public GetCostBasisDetailsResponse decode(ProtoReader reader) throws IOException {
        ArrayList arrayList;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(reader, "reader");
        CostBasisStatus costBasisStatus = CostBasisStatus.COST_BASIS_STATUS_UNSPECIFIED;
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        CostBasisStatus costBasisStatusDecode = costBasisStatus;
        String strDecode = "";
        String strDecode2 = strDecode;
        String strDecode3 = strDecode2;
        String strDecode4 = strDecode3;
        String strDecode5 = strDecode4;
        String strDecode6 = strDecode5;
        String strDecode7 = strDecode6;
        String strDecode8 = strDecode7;
        Instant instantDecode = null;
        CostBasisLotsSummary costBasisLotsSummaryDecode = null;
        boolean zBooleanValue = false;
        String strDecode9 = strDecode8;
        String strDecode10 = strDecode9;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag != -1) {
                switch (iNextTag) {
                    case 1:
                        arrayList = arrayList2;
                        strDecode9 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        arrayList = arrayList2;
                        strDecode10 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        arrayList = arrayList2;
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        arrayList = arrayList2;
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        try {
                            costBasisStatusDecode = CostBasisStatus.ADAPTER.decode(reader);
                            arrayList = arrayList2;
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            arrayList = arrayList2;
                            str = strDecode9;
                            str2 = strDecode10;
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 6:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        arrayList = arrayList2;
                        break;
                    case 7:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        arrayList = arrayList2;
                        break;
                    case 8:
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        arrayList = arrayList2;
                        break;
                    case 9:
                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                        arrayList = arrayList2;
                        break;
                    case 10:
                        strDecode7 = ProtoAdapter.STRING.decode(reader);
                        arrayList = arrayList2;
                        break;
                    case 11:
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        arrayList = arrayList2;
                        break;
                    case 12:
                        strDecode8 = ProtoAdapter.STRING.decode(reader);
                        arrayList = arrayList2;
                        break;
                    case 13:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        arrayList = arrayList2;
                        break;
                    case 14:
                        costBasisLotsSummaryDecode = CostBasisLotsSummary.ADAPTER.decode(reader);
                        arrayList = arrayList2;
                        break;
                    case 15:
                        arrayList2.add(CostBasisLot.ADAPTER.decode(reader));
                        arrayList = arrayList2;
                        str = strDecode9;
                        str2 = strDecode10;
                        strDecode9 = str;
                        strDecode10 = str2;
                        break;
                    case 16:
                        linkedHashMap.putAll(getBottom_sheetsAdapter().decode(reader));
                        arrayList = arrayList2;
                        str = strDecode9;
                        str2 = strDecode10;
                        strDecode9 = str;
                        strDecode10 = str2;
                        break;
                    default:
                        reader.readUnknownField(iNextTag);
                        arrayList = arrayList2;
                        str = strDecode9;
                        str2 = strDecode10;
                        strDecode9 = str;
                        strDecode10 = str2;
                        break;
                }
                arrayList2 = arrayList;
            } else {
                return new GetCostBasisDetailsResponse(strDecode9, strDecode10, strDecode, strDecode2, costBasisStatusDecode, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, instantDecode, strDecode8, zBooleanValue, costBasisLotsSummaryDecode, arrayList2, linkedHashMap, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public GetCostBasisDetailsResponse redact(GetCostBasisDetailsResponse value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Instant deposit_date = value.getDeposit_date();
        Instant instantRedact = deposit_date != null ? ProtoAdapter.INSTANT.redact(deposit_date) : null;
        CostBasisLotsSummary summary = value.getSummary();
        return value.copy((7167 & 1) != 0 ? value.source_id : null, (7167 & 2) != 0 ? value.source_type : null, (7167 & 4) != 0 ? value.account_id : null, (7167 & 8) != 0 ? value.year : null, (7167 & 16) != 0 ? value.status : null, (7167 & 32) != 0 ? value.status_display_text : null, (7167 & 64) != 0 ? value.currency_pair_id : null, (7167 & 128) != 0 ? value.currency_code : null, (7167 & 256) != 0 ? value.currency_name : null, (7167 & 512) != 0 ? value.deposit_amount : null, (7167 & 1024) != 0 ? value.deposit_date : instantRedact, (7167 & 2048) != 0 ? value.estimated_fiat_value : null, (7167 & 4096) != 0 ? value.is_editable : false, (7167 & 8192) != 0 ? value.summary : summary != null ? CostBasisLotsSummary.ADAPTER.redact(summary) : null, (7167 & 16384) != 0 ? value.lots : Internal.m26823redactElements(value.getLots(), CostBasisLot.ADAPTER), (7167 & 32768) != 0 ? value.bottom_sheets : Internal.m26824redactElements(value.getBottom_sheets(), CostBasisBottomSheet.ADAPTER), (7167 & 65536) != 0 ? value.unknownFields() : ByteString.EMPTY);
    }
}
