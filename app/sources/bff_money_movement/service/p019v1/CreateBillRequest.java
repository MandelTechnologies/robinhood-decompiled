package bff_money_movement.service.p019v1;

import billing.service.bill.p022v1.BillType;
import billing.service.bill.p022v1.Biller;
import com.robinhood.rosetta.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: CreateBillRequest.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010'\u001a\u00020\u0002H\u0017J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0006H\u0016J~\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00061"}, m3636d2 = {"Lbff_money_movement/service/v1/CreateBillRequest;", "Lcom/squareup/wire/Message;", "", "bill_type", "Lbilling/service/bill/v1/BillType;", "ref_id", "", "biller", "Lbilling/service/bill/v1/Biller;", "entered_amount", "Lcom/robinhood/rosetta/common/Money;", "payments", "", "Lbff_money_movement/service/v1/PaymentRequest;", "crypto_requests", "Lbff_money_movement/service/v1/CryptoRequest;", "context_metadata_headers", "", "stock_request", "Lbff_money_movement/service/v1/StockRequest;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbilling/service/bill/v1/BillType;Ljava/lang/String;Lbilling/service/bill/v1/Biller;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lbff_money_movement/service/v1/StockRequest;Lokio/ByteString;)V", "getBill_type", "()Lbilling/service/bill/v1/BillType;", "getRef_id", "()Ljava/lang/String;", "getBiller", "()Lbilling/service/bill/v1/Biller;", "getEntered_amount", "()Lcom/robinhood/rosetta/common/Money;", "getStock_request", "()Lbff_money_movement/service/v1/StockRequest;", "getPayments", "()Ljava/util/List;", "getCrypto_requests", "getContext_metadata_headers", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CreateBillRequest extends Message {

    @WireField(adapter = "billing.service.bill.v1.BillType#ADAPTER", jsonName = "billType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BillType bill_type;

    @WireField(adapter = "billing.service.bill.v1.Biller#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Biller biller;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contextMetadataHeaders", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final Map<String, String> context_metadata_headers;

    @WireField(adapter = "bff_money_movement.service.v1.CryptoRequest#ADAPTER", jsonName = "cryptoRequests", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<CryptoRequest> crypto_requests;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "enteredAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money entered_amount;

    @WireField(adapter = "bff_money_movement.service.v1.PaymentRequest#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<PaymentRequest> payments;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ref_id;

    @WireField(adapter = "bff_money_movement.service.v1.StockRequest#ADAPTER", jsonName = "stockRequest", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final StockRequest stock_request;

    @JvmField
    public static final ProtoAdapter<CreateBillRequest> ADAPTER = new CreateBillRequest2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(CreateBillRequest.class), Syntax.PROTO_3);

    public CreateBillRequest() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8396newBuilder();
    }

    public final BillType getBill_type() {
        return this.bill_type;
    }

    public /* synthetic */ CreateBillRequest(BillType billType, String str, Biller biller, Money money, List list, List list2, Map map, StockRequest stockRequest, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BillType.BILL_TYPE_UNSPECIFIED : billType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : biller, (i & 8) != 0 ? null : money, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? MapsKt.emptyMap() : map, (i & 128) != 0 ? null : stockRequest, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final Biller getBiller() {
        return this.biller;
    }

    public final Money getEntered_amount() {
        return this.entered_amount;
    }

    public final StockRequest getStock_request() {
        return this.stock_request;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBillRequest(BillType bill_type, String ref_id, Biller biller, Money money, List<PaymentRequest> payments, List<CryptoRequest> crypto_requests, Map<String, String> context_metadata_headers, StockRequest stockRequest, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(bill_type, "bill_type");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(crypto_requests, "crypto_requests");
        Intrinsics.checkNotNullParameter(context_metadata_headers, "context_metadata_headers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bill_type = bill_type;
        this.ref_id = ref_id;
        this.biller = biller;
        this.entered_amount = money;
        this.stock_request = stockRequest;
        this.payments = Internal.immutableCopyOf("payments", payments);
        this.crypto_requests = Internal.immutableCopyOf("crypto_requests", crypto_requests);
        this.context_metadata_headers = Internal.immutableCopyOf("context_metadata_headers", context_metadata_headers);
    }

    public final List<PaymentRequest> getPayments() {
        return this.payments;
    }

    public final List<CryptoRequest> getCrypto_requests() {
        return this.crypto_requests;
    }

    public final Map<String, String> getContext_metadata_headers() {
        return this.context_metadata_headers;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8396newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateBillRequest)) {
            return false;
        }
        CreateBillRequest createBillRequest = (CreateBillRequest) other;
        return Intrinsics.areEqual(unknownFields(), createBillRequest.unknownFields()) && this.bill_type == createBillRequest.bill_type && Intrinsics.areEqual(this.ref_id, createBillRequest.ref_id) && Intrinsics.areEqual(this.biller, createBillRequest.biller) && Intrinsics.areEqual(this.entered_amount, createBillRequest.entered_amount) && Intrinsics.areEqual(this.payments, createBillRequest.payments) && Intrinsics.areEqual(this.crypto_requests, createBillRequest.crypto_requests) && Intrinsics.areEqual(this.context_metadata_headers, createBillRequest.context_metadata_headers) && Intrinsics.areEqual(this.stock_request, createBillRequest.stock_request);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.bill_type.hashCode()) * 37) + this.ref_id.hashCode()) * 37;
        Biller biller = this.biller;
        int iHashCode2 = (iHashCode + (biller != null ? biller.hashCode() : 0)) * 37;
        Money money = this.entered_amount;
        int iHashCode3 = (((((((iHashCode2 + (money != null ? money.hashCode() : 0)) * 37) + this.payments.hashCode()) * 37) + this.crypto_requests.hashCode()) * 37) + this.context_metadata_headers.hashCode()) * 37;
        StockRequest stockRequest = this.stock_request;
        int iHashCode4 = iHashCode3 + (stockRequest != null ? stockRequest.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("bill_type=" + this.bill_type);
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        Biller biller = this.biller;
        if (biller != null) {
            arrayList.add("biller=" + biller);
        }
        Money money = this.entered_amount;
        if (money != null) {
            arrayList.add("entered_amount=" + money);
        }
        if (!this.payments.isEmpty()) {
            arrayList.add("payments=" + this.payments);
        }
        if (!this.crypto_requests.isEmpty()) {
            arrayList.add("crypto_requests=" + this.crypto_requests);
        }
        if (!this.context_metadata_headers.isEmpty()) {
            arrayList.add("context_metadata_headers=" + this.context_metadata_headers);
        }
        StockRequest stockRequest = this.stock_request;
        if (stockRequest != null) {
            arrayList.add("stock_request=" + stockRequest);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateBillRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateBillRequest copy$default(CreateBillRequest createBillRequest, BillType billType, String str, Biller biller, Money money, List list, List list2, Map map, StockRequest stockRequest, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            billType = createBillRequest.bill_type;
        }
        if ((i & 2) != 0) {
            str = createBillRequest.ref_id;
        }
        if ((i & 4) != 0) {
            biller = createBillRequest.biller;
        }
        if ((i & 8) != 0) {
            money = createBillRequest.entered_amount;
        }
        if ((i & 16) != 0) {
            list = createBillRequest.payments;
        }
        if ((i & 32) != 0) {
            list2 = createBillRequest.crypto_requests;
        }
        if ((i & 64) != 0) {
            map = createBillRequest.context_metadata_headers;
        }
        if ((i & 128) != 0) {
            stockRequest = createBillRequest.stock_request;
        }
        if ((i & 256) != 0) {
            byteString = createBillRequest.unknownFields();
        }
        StockRequest stockRequest2 = stockRequest;
        ByteString byteString2 = byteString;
        List list3 = list2;
        Map map2 = map;
        List list4 = list;
        Biller biller2 = biller;
        return createBillRequest.copy(billType, str, biller2, money, list4, list3, map2, stockRequest2, byteString2);
    }

    public final CreateBillRequest copy(BillType bill_type, String ref_id, Biller biller, Money entered_amount, List<PaymentRequest> payments, List<CryptoRequest> crypto_requests, Map<String, String> context_metadata_headers, StockRequest stock_request, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(bill_type, "bill_type");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(crypto_requests, "crypto_requests");
        Intrinsics.checkNotNullParameter(context_metadata_headers, "context_metadata_headers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateBillRequest(bill_type, ref_id, biller, entered_amount, payments, crypto_requests, context_metadata_headers, stock_request, unknownFields);
    }
}
