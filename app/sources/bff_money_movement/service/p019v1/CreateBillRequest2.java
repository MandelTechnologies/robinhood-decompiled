package bff_money_movement.service.p019v1;

import billing.service.bill.p022v1.BillType;
import billing.service.bill.p022v1.Biller;
import com.robinhood.rosetta.common.Money;
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
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CreateBillRequest.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"bff_money_movement/service/v1/CreateBillRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/CreateBillRequest;", "context_metadata_headersAdapter", "", "", "getContext_metadata_headersAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "context_metadata_headersAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: bff_money_movement.service.v1.CreateBillRequest$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes16.dex */
public final class CreateBillRequest2 extends ProtoAdapter<CreateBillRequest> {

    /* renamed from: context_metadata_headersAdapter$delegate, reason: from kotlin metadata */
    private final Lazy context_metadata_headersAdapter;

    CreateBillRequest2(FieldEncoding fieldEncoding, KClass<CreateBillRequest> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/bff_money_movement.service.v1.CreateBillRequest", syntax, (Object) null, "bff-money-movement/bff_money_movement/proto/v1/service.proto");
        this.context_metadata_headersAdapter = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.CreateBillRequest$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateBillRequest2.context_metadata_headersAdapter_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter context_metadata_headersAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, String>> getContext_metadata_headersAdapter() {
        return (ProtoAdapter) this.context_metadata_headersAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(CreateBillRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (value.getBill_type() != BillType.BILL_TYPE_UNSPECIFIED) {
            size += BillType.ADAPTER.encodedSizeWithTag(1, value.getBill_type());
        }
        if (!Intrinsics.areEqual(value.getRef_id(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRef_id());
        }
        if (value.getBiller() != null) {
            size += Biller.ADAPTER.encodedSizeWithTag(3, value.getBiller());
        }
        if (value.getEntered_amount() != null) {
            size += Money.ADAPTER.encodedSizeWithTag(4, value.getEntered_amount());
        }
        int iEncodedSizeWithTag = size + PaymentRequest.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getPayments()) + CryptoRequest.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getCrypto_requests()) + getContext_metadata_headersAdapter().encodedSizeWithTag(7, value.getContext_metadata_headers());
        return value.getStock_request() != null ? iEncodedSizeWithTag + StockRequest.ADAPTER.encodedSizeWithTag(8, value.getStock_request()) : iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, CreateBillRequest value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getBill_type() != BillType.BILL_TYPE_UNSPECIFIED) {
            BillType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBill_type());
        }
        if (!Intrinsics.areEqual(value.getRef_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRef_id());
        }
        if (value.getBiller() != null) {
            Biller.ADAPTER.encodeWithTag(writer, 3, (int) value.getBiller());
        }
        if (value.getEntered_amount() != null) {
            Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getEntered_amount());
        }
        PaymentRequest.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getPayments());
        CryptoRequest.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getCrypto_requests());
        getContext_metadata_headersAdapter().encodeWithTag(writer, 7, (int) value.getContext_metadata_headers());
        if (value.getStock_request() != null) {
            StockRequest.ADAPTER.encodeWithTag(writer, 8, (int) value.getStock_request());
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, CreateBillRequest value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        if (value.getStock_request() != null) {
            StockRequest.ADAPTER.encodeWithTag(writer, 8, (int) value.getStock_request());
        }
        getContext_metadata_headersAdapter().encodeWithTag(writer, 7, (int) value.getContext_metadata_headers());
        CryptoRequest.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getCrypto_requests());
        PaymentRequest.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getPayments());
        if (value.getEntered_amount() != null) {
            Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getEntered_amount());
        }
        if (value.getBiller() != null) {
            Biller.ADAPTER.encodeWithTag(writer, 3, (int) value.getBiller());
        }
        if (!Intrinsics.areEqual(value.getRef_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRef_id());
        }
        if (value.getBill_type() != BillType.BILL_TYPE_UNSPECIFIED) {
            BillType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBill_type());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public CreateBillRequest decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        BillType billTypeDecode = BillType.BILL_TYPE_UNSPECIFIED;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        Biller billerDecode = null;
        Money moneyDecode = null;
        StockRequest stockRequestDecode = null;
        String strDecode = "";
        while (true) {
            BillType billType = billTypeDecode;
            while (true) {
                int iNextTag = reader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                billTypeDecode = BillType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 2:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            billerDecode = Biller.ADAPTER.decode(reader);
                            break;
                        case 4:
                            moneyDecode = Money.ADAPTER.decode(reader);
                            break;
                        case 5:
                            arrayList.add(PaymentRequest.ADAPTER.decode(reader));
                            break;
                        case 6:
                            arrayList2.add(CryptoRequest.ADAPTER.decode(reader));
                            break;
                        case 7:
                            linkedHashMap.putAll(getContext_metadata_headersAdapter().decode(reader));
                            break;
                        case 8:
                            stockRequestDecode = StockRequest.ADAPTER.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                } else {
                    return new CreateBillRequest(billType, strDecode, billerDecode, moneyDecode, arrayList, arrayList2, linkedHashMap, stockRequestDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public CreateBillRequest redact(CreateBillRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Biller biller = value.getBiller();
        Biller billerRedact = biller != null ? Biller.ADAPTER.redact(biller) : null;
        Money entered_amount = value.getEntered_amount();
        Money moneyRedact = entered_amount != null ? Money.ADAPTER.redact(entered_amount) : null;
        List listM26823redactElements = Internal.m26823redactElements(value.getPayments(), PaymentRequest.ADAPTER);
        List listM26823redactElements2 = Internal.m26823redactElements(value.getCrypto_requests(), CryptoRequest.ADAPTER);
        StockRequest stock_request = value.getStock_request();
        return CreateBillRequest.copy$default(value, null, null, billerRedact, moneyRedact, listM26823redactElements, listM26823redactElements2, null, stock_request != null ? StockRequest.ADAPTER.redact(stock_request) : null, ByteString.EMPTY, 67, null);
    }
}
