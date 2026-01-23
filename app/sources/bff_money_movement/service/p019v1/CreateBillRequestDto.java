package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.CreateBillRequestDto;
import bff_money_movement.service.p019v1.CryptoRequestDto;
import bff_money_movement.service.p019v1.PaymentRequestDto;
import bff_money_movement.service.p019v1.StockRequestDto;
import billing.service.bill.p022v1.BillType;
import billing.service.bill.p022v1.BillTypeDto;
import billing.service.bill.p022v1.Biller;
import billing.service.bill.p022v1.BillerDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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

/* compiled from: CreateBillRequestDto.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bw\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0006\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-¨\u00062"}, m3636d2 = {"Lbff_money_movement/service/v1/CreateBillRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/CreateBillRequest;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/CreateBillRequestDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/CreateBillRequestDto$Surrogate;)V", "Lbilling/service/bill/v1/BillTypeDto;", "bill_type", "", "ref_id", "Lbilling/service/bill/v1/BillerDto;", "biller", "Lcom/robinhood/rosetta/common/MoneyDto;", "entered_amount", "", "Lbff_money_movement/service/v1/PaymentRequestDto;", "payments", "Lbff_money_movement/service/v1/CryptoRequestDto;", "crypto_requests", "", "context_metadata_headers", "Lbff_money_movement/service/v1/StockRequestDto;", "stock_request", "(Lbilling/service/bill/v1/BillTypeDto;Ljava/lang/String;Lbilling/service/bill/v1/BillerDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lbff_money_movement/service/v1/StockRequestDto;)V", "toProto", "()Lbff_money_movement/service/v1/CreateBillRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/CreateBillRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class CreateBillRequestDto implements Dto3<CreateBillRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateBillRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateBillRequestDto, CreateBillRequest>> binaryBase64Serializer$delegate;
    private static final CreateBillRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateBillRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateBillRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CreateBillRequestDto(billing.service.bill.p022v1.BillTypeDto r2, java.lang.String r3, billing.service.bill.p022v1.BillerDto r4, com.robinhood.rosetta.common.MoneyDto r5, java.util.List r6, java.util.List r7, java.util.Map r8, bff_money_movement.service.p019v1.StockRequestDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto La
            billing.service.bill.v1.BillTypeDto$Companion r2 = billing.service.bill.p022v1.BillTypeDto.INSTANCE
            billing.service.bill.v1.BillTypeDto r2 = r2.getZeroValue()
        La:
            r11 = r10 & 2
            if (r11 == 0) goto L10
            java.lang.String r3 = ""
        L10:
            r11 = r10 & 4
            r0 = 0
            if (r11 == 0) goto L16
            r4 = r0
        L16:
            r11 = r10 & 8
            if (r11 == 0) goto L1b
            r5 = r0
        L1b:
            r11 = r10 & 16
            if (r11 == 0) goto L23
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
        L23:
            r11 = r10 & 32
            if (r11 == 0) goto L2b
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L2b:
            r11 = r10 & 64
            if (r11 == 0) goto L33
            java.util.Map r8 = kotlin.collections.MapsKt.emptyMap()
        L33:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L41
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L4a
        L41:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L4a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bff_money_movement.service.p019v1.CreateBillRequestDto.<init>(billing.service.bill.v1.BillTypeDto, java.lang.String, billing.service.bill.v1.BillerDto, com.robinhood.rosetta.common.MoneyDto, java.util.List, java.util.List, java.util.Map, bff_money_movement.service.v1.StockRequestDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateBillRequestDto(BillTypeDto bill_type, String ref_id, BillerDto billerDto, MoneyDto moneyDto, List<PaymentRequestDto> payments, List<CryptoRequestDto> crypto_requests, Map<String, String> context_metadata_headers, StockRequestDto stockRequestDto) {
        this(new Surrogate(bill_type, ref_id, billerDto, moneyDto, payments, crypto_requests, context_metadata_headers, stockRequestDto));
        Intrinsics.checkNotNullParameter(bill_type, "bill_type");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(crypto_requests, "crypto_requests");
        Intrinsics.checkNotNullParameter(context_metadata_headers, "context_metadata_headers");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CreateBillRequest toProto() {
        BillType billType = (BillType) this.surrogate.getBill_type().toProto();
        String ref_id = this.surrogate.getRef_id();
        BillerDto biller = this.surrogate.getBiller();
        Biller proto = biller != null ? biller.toProto() : null;
        MoneyDto entered_amount = this.surrogate.getEntered_amount();
        Money proto2 = entered_amount != null ? entered_amount.toProto() : null;
        List<PaymentRequestDto> payments = this.surrogate.getPayments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(payments, 10));
        Iterator<T> it = payments.iterator();
        while (it.hasNext()) {
            arrayList.add(((PaymentRequestDto) it.next()).toProto());
        }
        List<CryptoRequestDto> crypto_requests = this.surrogate.getCrypto_requests();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(crypto_requests, 10));
        Iterator<T> it2 = crypto_requests.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CryptoRequestDto) it2.next()).toProto());
        }
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getContext_metadata_headers().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        StockRequestDto stock_request = this.surrogate.getStock_request();
        return new CreateBillRequest(billType, ref_id, proto, proto2, arrayList, arrayList2, linkedHashMap, stock_request != null ? stock_request.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[CreateBillRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateBillRequestDto) && Intrinsics.areEqual(((CreateBillRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreateBillRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b#\b\u0083\b\u0018\u0000 I2\u00020\u0001:\u0002JIBu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b6\u0010/\u001a\u0004\b4\u00105R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b:\u0010/\u001a\u0004\b8\u00109R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010;\u0012\u0004\b>\u0010/\u001a\u0004\b<\u0010=R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\b@\u0010/\u001a\u0004\b?\u0010=R,\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010A\u0012\u0004\bD\u0010/\u001a\u0004\bB\u0010CR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010E\u0012\u0004\bH\u0010/\u001a\u0004\bF\u0010G¨\u0006K"}, m3636d2 = {"Lbff_money_movement/service/v1/CreateBillRequestDto$Surrogate;", "", "Lbilling/service/bill/v1/BillTypeDto;", "bill_type", "", "ref_id", "Lbilling/service/bill/v1/BillerDto;", "biller", "Lcom/robinhood/rosetta/common/MoneyDto;", "entered_amount", "", "Lbff_money_movement/service/v1/PaymentRequestDto;", "payments", "Lbff_money_movement/service/v1/CryptoRequestDto;", "crypto_requests", "", "context_metadata_headers", "Lbff_money_movement/service/v1/StockRequestDto;", "stock_request", "<init>", "(Lbilling/service/bill/v1/BillTypeDto;Ljava/lang/String;Lbilling/service/bill/v1/BillerDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lbff_money_movement/service/v1/StockRequestDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbilling/service/bill/v1/BillTypeDto;Ljava/lang/String;Lbilling/service/bill/v1/BillerDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lbff_money_movement/service/v1/StockRequestDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/CreateBillRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbilling/service/bill/v1/BillTypeDto;", "getBill_type", "()Lbilling/service/bill/v1/BillTypeDto;", "getBill_type$annotations", "()V", "Ljava/lang/String;", "getRef_id", "getRef_id$annotations", "Lbilling/service/bill/v1/BillerDto;", "getBiller", "()Lbilling/service/bill/v1/BillerDto;", "getBiller$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getEntered_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getEntered_amount$annotations", "Ljava/util/List;", "getPayments", "()Ljava/util/List;", "getPayments$annotations", "getCrypto_requests", "getCrypto_requests$annotations", "Ljava/util/Map;", "getContext_metadata_headers", "()Ljava/util/Map;", "getContext_metadata_headers$annotations", "Lbff_money_movement/service/v1/StockRequestDto;", "getStock_request", "()Lbff_money_movement/service/v1/StockRequestDto;", "getStock_request$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BillTypeDto bill_type;
        private final BillerDto biller;
        private final Map<String, String> context_metadata_headers;
        private final List<CryptoRequestDto> crypto_requests;
        private final MoneyDto entered_amount;
        private final List<PaymentRequestDto> payments;
        private final String ref_id;
        private final StockRequestDto stock_request;

        public Surrogate() {
            this((BillTypeDto) null, (String) null, (BillerDto) null, (MoneyDto) null, (List) null, (List) null, (Map) null, (StockRequestDto) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PaymentRequestDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(CryptoRequestDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.bill_type == surrogate.bill_type && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.biller, surrogate.biller) && Intrinsics.areEqual(this.entered_amount, surrogate.entered_amount) && Intrinsics.areEqual(this.payments, surrogate.payments) && Intrinsics.areEqual(this.crypto_requests, surrogate.crypto_requests) && Intrinsics.areEqual(this.context_metadata_headers, surrogate.context_metadata_headers) && Intrinsics.areEqual(this.stock_request, surrogate.stock_request);
        }

        public int hashCode() {
            int iHashCode = ((this.bill_type.hashCode() * 31) + this.ref_id.hashCode()) * 31;
            BillerDto billerDto = this.biller;
            int iHashCode2 = (iHashCode + (billerDto == null ? 0 : billerDto.hashCode())) * 31;
            MoneyDto moneyDto = this.entered_amount;
            int iHashCode3 = (((((((iHashCode2 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.payments.hashCode()) * 31) + this.crypto_requests.hashCode()) * 31) + this.context_metadata_headers.hashCode()) * 31;
            StockRequestDto stockRequestDto = this.stock_request;
            return iHashCode3 + (stockRequestDto != null ? stockRequestDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(bill_type=" + this.bill_type + ", ref_id=" + this.ref_id + ", biller=" + this.biller + ", entered_amount=" + this.entered_amount + ", payments=" + this.payments + ", crypto_requests=" + this.crypto_requests + ", context_metadata_headers=" + this.context_metadata_headers + ", stock_request=" + this.stock_request + ")";
        }

        /* compiled from: CreateBillRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/CreateBillRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/CreateBillRequestDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateBillRequestDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_money_movement.service.v1.CreateBillRequestDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateBillRequestDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_money_movement.service.v1.CreateBillRequestDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateBillRequestDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_money_movement.service.v1.CreateBillRequestDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateBillRequestDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, BillTypeDto billTypeDto, String str, BillerDto billerDto, MoneyDto moneyDto, List list, List list2, Map map, StockRequestDto stockRequestDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.bill_type = (i & 1) == 0 ? BillTypeDto.INSTANCE.getZeroValue() : billTypeDto;
            if ((i & 2) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str;
            }
            if ((i & 4) == 0) {
                this.biller = null;
            } else {
                this.biller = billerDto;
            }
            if ((i & 8) == 0) {
                this.entered_amount = null;
            } else {
                this.entered_amount = moneyDto;
            }
            if ((i & 16) == 0) {
                this.payments = CollectionsKt.emptyList();
            } else {
                this.payments = list;
            }
            if ((i & 32) == 0) {
                this.crypto_requests = CollectionsKt.emptyList();
            } else {
                this.crypto_requests = list2;
            }
            if ((i & 64) == 0) {
                this.context_metadata_headers = MapsKt.emptyMap();
            } else {
                this.context_metadata_headers = map;
            }
            if ((i & 128) == 0) {
                this.stock_request = null;
            } else {
                this.stock_request = stockRequestDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.bill_type != BillTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, BillTypeDto.Serializer.INSTANCE, self.bill_type);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.ref_id);
            }
            BillerDto billerDto = self.biller;
            if (billerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BillerDto.Serializer.INSTANCE, billerDto);
            }
            MoneyDto moneyDto = self.entered_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.payments, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.payments);
            }
            if (!Intrinsics.areEqual(self.crypto_requests, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.crypto_requests);
            }
            if (!Intrinsics.areEqual(self.context_metadata_headers, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.context_metadata_headers);
            }
            StockRequestDto stockRequestDto = self.stock_request;
            if (stockRequestDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StockRequestDto.Serializer.INSTANCE, stockRequestDto);
            }
        }

        public Surrogate(BillTypeDto bill_type, String ref_id, BillerDto billerDto, MoneyDto moneyDto, List<PaymentRequestDto> payments, List<CryptoRequestDto> crypto_requests, Map<String, String> context_metadata_headers, StockRequestDto stockRequestDto) {
            Intrinsics.checkNotNullParameter(bill_type, "bill_type");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(payments, "payments");
            Intrinsics.checkNotNullParameter(crypto_requests, "crypto_requests");
            Intrinsics.checkNotNullParameter(context_metadata_headers, "context_metadata_headers");
            this.bill_type = bill_type;
            this.ref_id = ref_id;
            this.biller = billerDto;
            this.entered_amount = moneyDto;
            this.payments = payments;
            this.crypto_requests = crypto_requests;
            this.context_metadata_headers = context_metadata_headers;
            this.stock_request = stockRequestDto;
        }

        public final BillTypeDto getBill_type() {
            return this.bill_type;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(billing.service.bill.p022v1.BillTypeDto r2, java.lang.String r3, billing.service.bill.p022v1.BillerDto r4, com.robinhood.rosetta.common.MoneyDto r5, java.util.List r6, java.util.List r7, java.util.Map r8, bff_money_movement.service.p019v1.StockRequestDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto La
                billing.service.bill.v1.BillTypeDto$Companion r2 = billing.service.bill.p022v1.BillTypeDto.INSTANCE
                billing.service.bill.v1.BillTypeDto r2 = r2.getZeroValue()
            La:
                r11 = r10 & 2
                if (r11 == 0) goto L10
                java.lang.String r3 = ""
            L10:
                r11 = r10 & 4
                r0 = 0
                if (r11 == 0) goto L16
                r4 = r0
            L16:
                r11 = r10 & 8
                if (r11 == 0) goto L1b
                r5 = r0
            L1b:
                r11 = r10 & 16
                if (r11 == 0) goto L23
                java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            L23:
                r11 = r10 & 32
                if (r11 == 0) goto L2b
                java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            L2b:
                r11 = r10 & 64
                if (r11 == 0) goto L33
                java.util.Map r8 = kotlin.collections.MapsKt.emptyMap()
            L33:
                r10 = r10 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L41
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L4a
            L41:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L4a:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bff_money_movement.service.p019v1.CreateBillRequestDto.Surrogate.<init>(billing.service.bill.v1.BillTypeDto, java.lang.String, billing.service.bill.v1.BillerDto, com.robinhood.rosetta.common.MoneyDto, java.util.List, java.util.List, java.util.Map, bff_money_movement.service.v1.StockRequestDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final BillerDto getBiller() {
            return this.biller;
        }

        public final MoneyDto getEntered_amount() {
            return this.entered_amount;
        }

        public final List<PaymentRequestDto> getPayments() {
            return this.payments;
        }

        public final List<CryptoRequestDto> getCrypto_requests() {
            return this.crypto_requests;
        }

        public final Map<String, String> getContext_metadata_headers() {
            return this.context_metadata_headers;
        }

        public final StockRequestDto getStock_request() {
            return this.stock_request;
        }
    }

    /* compiled from: CreateBillRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/CreateBillRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/CreateBillRequestDto;", "Lbff_money_movement/service/v1/CreateBillRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/CreateBillRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreateBillRequestDto, CreateBillRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateBillRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateBillRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateBillRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateBillRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateBillRequest> getProtoAdapter() {
            return CreateBillRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateBillRequestDto getZeroValue() {
            return CreateBillRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateBillRequestDto fromProto(CreateBillRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            BillTypeDto billTypeDtoFromProto = BillTypeDto.INSTANCE.fromProto(proto.getBill_type());
            String ref_id = proto.getRef_id();
            Biller biller = proto.getBiller();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BillerDto billerDtoFromProto = biller != null ? BillerDto.INSTANCE.fromProto(biller) : null;
            Money entered_amount = proto.getEntered_amount();
            MoneyDto moneyDtoFromProto = entered_amount != null ? MoneyDto.INSTANCE.fromProto(entered_amount) : null;
            List<PaymentRequest> payments = proto.getPayments();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(payments, 10));
            Iterator<T> it = payments.iterator();
            while (it.hasNext()) {
                arrayList.add(PaymentRequestDto.INSTANCE.fromProto((PaymentRequest) it.next()));
            }
            List<CryptoRequest> crypto_requests = proto.getCrypto_requests();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(crypto_requests, 10));
            Iterator<T> it2 = crypto_requests.iterator();
            while (it2.hasNext()) {
                arrayList2.add(CryptoRequestDto.INSTANCE.fromProto((CryptoRequest) it2.next()));
            }
            Set<Map.Entry<String, String>> setEntrySet = proto.getContext_metadata_headers().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it3 = setEntrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            StockRequest stock_request = proto.getStock_request();
            return new CreateBillRequestDto(new Surrogate(billTypeDtoFromProto, ref_id, billerDtoFromProto, moneyDtoFromProto, arrayList, arrayList2, linkedHashMap, stock_request != null ? StockRequestDto.INSTANCE.fromProto(stock_request) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.CreateBillRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateBillRequestDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new CreateBillRequestDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateBillRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/CreateBillRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/CreateBillRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/CreateBillRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreateBillRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.CreateBillRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateBillRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateBillRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateBillRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateBillRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/CreateBillRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.CreateBillRequestDto";
        }
    }
}
