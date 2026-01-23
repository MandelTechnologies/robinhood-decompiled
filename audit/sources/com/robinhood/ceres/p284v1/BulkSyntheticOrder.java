package com.robinhood.ceres.p284v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: BulkSyntheticOrder.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020\fH\u0016J\b\u0010'\u001a\u00020\u0004H\u0016Jz\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/ceres/v1/BulkSyntheticOrder;", "Lcom/squareup/wire/Message;", "", "id", "", "file_id", "employee_alias", "ref_id", "notes", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractType;", "num_failed_orders", "", "num_successful_orders", "detailed_report_file_url", "last_generated_at", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractType;IILjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getFile_id", "getEmployee_alias", "getRef_id", "getNotes", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractType;", "getNum_failed_orders", "()I", "getNum_successful_orders", "getDetailed_report_file_url", "getLast_generated_at", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BulkSyntheticOrder extends Message {

    @JvmField
    public static final ProtoAdapter<BulkSyntheticOrder> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesContractType#ADAPTER", jsonName = "contractType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final FuturesContractType contract_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "detailedReportFileUrl", schemaIndex = 8, tag = 9)
    private final String detailed_report_file_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "employeeAlias", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String employee_alias;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fileId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String file_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastGeneratedAt", schemaIndex = 9, tag = 10)
    private final String last_generated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String notes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numFailedOrders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int num_failed_orders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numSuccessfulOrders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final int num_successful_orders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String ref_id;

    public BulkSyntheticOrder() {
        this(null, null, null, null, null, null, 0, 0, null, null, null, 2047, null);
    }

    public /* synthetic */ BulkSyntheticOrder(String str, String str2, String str3, String str4, String str5, FuturesContractType futuresContractType, int i, int i2, String str6, String str7, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED : futuresContractType, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? null : str6, (i3 & 512) != 0 ? null : str7, (i3 & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20260newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getFile_id() {
        return this.file_id;
    }

    public final String getEmployee_alias() {
        return this.employee_alias;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final FuturesContractType getContract_type() {
        return this.contract_type;
    }

    public final int getNum_failed_orders() {
        return this.num_failed_orders;
    }

    public final int getNum_successful_orders() {
        return this.num_successful_orders;
    }

    public final String getDetailed_report_file_url() {
        return this.detailed_report_file_url;
    }

    public final String getLast_generated_at() {
        return this.last_generated_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkSyntheticOrder(String id, String file_id, String employee_alias, String ref_id, String str, FuturesContractType contract_type, int i, int i2, String str2, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file_id, "file_id");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.file_id = file_id;
        this.employee_alias = employee_alias;
        this.ref_id = ref_id;
        this.notes = str;
        this.contract_type = contract_type;
        this.num_failed_orders = i;
        this.num_successful_orders = i2;
        this.detailed_report_file_url = str2;
        this.last_generated_at = str3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20260newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BulkSyntheticOrder)) {
            return false;
        }
        BulkSyntheticOrder bulkSyntheticOrder = (BulkSyntheticOrder) other;
        return Intrinsics.areEqual(unknownFields(), bulkSyntheticOrder.unknownFields()) && Intrinsics.areEqual(this.id, bulkSyntheticOrder.id) && Intrinsics.areEqual(this.file_id, bulkSyntheticOrder.file_id) && Intrinsics.areEqual(this.employee_alias, bulkSyntheticOrder.employee_alias) && Intrinsics.areEqual(this.ref_id, bulkSyntheticOrder.ref_id) && Intrinsics.areEqual(this.notes, bulkSyntheticOrder.notes) && this.contract_type == bulkSyntheticOrder.contract_type && this.num_failed_orders == bulkSyntheticOrder.num_failed_orders && this.num_successful_orders == bulkSyntheticOrder.num_successful_orders && Intrinsics.areEqual(this.detailed_report_file_url, bulkSyntheticOrder.detailed_report_file_url) && Intrinsics.areEqual(this.last_generated_at, bulkSyntheticOrder.last_generated_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.file_id.hashCode()) * 37) + this.employee_alias.hashCode()) * 37) + this.ref_id.hashCode()) * 37;
        String str = this.notes;
        int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.contract_type.hashCode()) * 37) + Integer.hashCode(this.num_failed_orders)) * 37) + Integer.hashCode(this.num_successful_orders)) * 37;
        String str2 = this.detailed_report_file_url;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.last_generated_at;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("file_id=" + Internal.sanitize(this.file_id));
        arrayList.add("employee_alias=" + Internal.sanitize(this.employee_alias));
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        String str = this.notes;
        if (str != null) {
            arrayList.add("notes=" + Internal.sanitize(str));
        }
        arrayList.add("contract_type=" + this.contract_type);
        arrayList.add("num_failed_orders=" + this.num_failed_orders);
        arrayList.add("num_successful_orders=" + this.num_successful_orders);
        String str2 = this.detailed_report_file_url;
        if (str2 != null) {
            arrayList.add("detailed_report_file_url=" + Internal.sanitize(str2));
        }
        String str3 = this.last_generated_at;
        if (str3 != null) {
            arrayList.add("last_generated_at=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BulkSyntheticOrder{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BulkSyntheticOrder copy$default(BulkSyntheticOrder bulkSyntheticOrder, String str, String str2, String str3, String str4, String str5, FuturesContractType futuresContractType, int i, int i2, String str6, String str7, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bulkSyntheticOrder.id;
        }
        if ((i3 & 2) != 0) {
            str2 = bulkSyntheticOrder.file_id;
        }
        if ((i3 & 4) != 0) {
            str3 = bulkSyntheticOrder.employee_alias;
        }
        if ((i3 & 8) != 0) {
            str4 = bulkSyntheticOrder.ref_id;
        }
        if ((i3 & 16) != 0) {
            str5 = bulkSyntheticOrder.notes;
        }
        if ((i3 & 32) != 0) {
            futuresContractType = bulkSyntheticOrder.contract_type;
        }
        if ((i3 & 64) != 0) {
            i = bulkSyntheticOrder.num_failed_orders;
        }
        if ((i3 & 128) != 0) {
            i2 = bulkSyntheticOrder.num_successful_orders;
        }
        if ((i3 & 256) != 0) {
            str6 = bulkSyntheticOrder.detailed_report_file_url;
        }
        if ((i3 & 512) != 0) {
            str7 = bulkSyntheticOrder.last_generated_at;
        }
        if ((i3 & 1024) != 0) {
            byteString = bulkSyntheticOrder.unknownFields();
        }
        String str8 = str7;
        ByteString byteString2 = byteString;
        int i4 = i2;
        String str9 = str6;
        FuturesContractType futuresContractType2 = futuresContractType;
        int i5 = i;
        String str10 = str5;
        String str11 = str3;
        return bulkSyntheticOrder.copy(str, str2, str11, str4, str10, futuresContractType2, i5, i4, str9, str8, byteString2);
    }

    public final BulkSyntheticOrder copy(String id, String file_id, String employee_alias, String ref_id, String notes, FuturesContractType contract_type, int num_failed_orders, int num_successful_orders, String detailed_report_file_url, String last_generated_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file_id, "file_id");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BulkSyntheticOrder(id, file_id, employee_alias, ref_id, notes, contract_type, num_failed_orders, num_successful_orders, detailed_report_file_url, last_generated_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BulkSyntheticOrder.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BulkSyntheticOrder>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.BulkSyntheticOrder$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BulkSyntheticOrder value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getFile_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFile_id());
                }
                if (!Intrinsics.areEqual(value.getEmployee_alias(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getEmployee_alias());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRef_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(5, value.getNotes());
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += FuturesContractType.ADAPTER.encodedSizeWithTag(6, value.getContract_type());
                }
                if (value.getNum_failed_orders() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getNum_failed_orders()));
                }
                if (value.getNum_successful_orders() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(8, Integer.valueOf(value.getNum_successful_orders()));
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(9, value.getDetailed_report_file_url()) + protoAdapter.encodedSizeWithTag(10, value.getLast_generated_at());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BulkSyntheticOrder value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getFile_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFile_id());
                }
                if (!Intrinsics.areEqual(value.getEmployee_alias(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEmployee_alias());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRef_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getNotes());
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    FuturesContractType.ADAPTER.encodeWithTag(writer, 6, (int) value.getContract_type());
                }
                if (value.getNum_failed_orders() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getNum_failed_orders()));
                }
                if (value.getNum_successful_orders() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getNum_successful_orders()));
                }
                protoAdapter.encodeWithTag(writer, 9, (int) value.getDetailed_report_file_url());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getLast_generated_at());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BulkSyntheticOrder value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getLast_generated_at());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getDetailed_report_file_url());
                if (value.getNum_successful_orders() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getNum_successful_orders()));
                }
                if (value.getNum_failed_orders() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getNum_failed_orders()));
                }
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    FuturesContractType.ADAPTER.encodeWithTag(writer, 6, (int) value.getContract_type());
                }
                protoAdapter.encodeWithTag(writer, 5, (int) value.getNotes());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getEmployee_alias(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getEmployee_alias());
                }
                if (!Intrinsics.areEqual(value.getFile_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getFile_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BulkSyntheticOrder decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesContractType futuresContractType = FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = null;
                int iIntValue = 0;
                int iIntValue2 = 0;
                FuturesContractType futuresContractTypeDecode = futuresContractType;
                String strDecode6 = strDecode2;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                try {
                                    futuresContractTypeDecode = FuturesContractType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 7:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 8:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 9:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new BulkSyntheticOrder(strDecode6, strDecode7, strDecode, strDecode2, strDecode3, futuresContractTypeDecode, iIntValue, iIntValue2, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BulkSyntheticOrder redact(BulkSyntheticOrder value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BulkSyntheticOrder.copy$default(value, null, null, null, null, null, null, 0, 0, null, null, ByteString.EMPTY, 1023, null);
            }
        };
    }
}
