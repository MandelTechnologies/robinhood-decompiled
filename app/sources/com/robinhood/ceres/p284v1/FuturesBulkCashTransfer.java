package com.robinhood.ceres.p284v1;

import com.robinhood.rosetta.common.Date;
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

/* compiled from: FuturesBulkCashTransfer.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020\fH\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\u0084\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u0006,"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesBulkCashTransfer;", "Lcom/squareup/wire/Message;", "", "id", "", "file_id", "initiated_by_alias", "ref_id", "cash_transfer_reason", "record_date", "Lcom/robinhood/rosetta/common/Date;", "num_cash_transfers_pending", "", "num_cash_transfers_confirmed", "num_cash_transfers_rejected", "detailed_report_file_url", "last_generated_at", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Date;IIILjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getFile_id", "getInitiated_by_alias", "getRef_id", "getCash_transfer_reason", "getRecord_date", "()Lcom/robinhood/rosetta/common/Date;", "getNum_cash_transfers_pending", "()I", "getNum_cash_transfers_confirmed", "getNum_cash_transfers_rejected", "getDetailed_report_file_url", "getLast_generated_at", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesBulkCashTransfer extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesBulkCashTransfer> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cashTransferReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String cash_transfer_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "detailedReportFileUrl", schemaIndex = 9, tag = 10)
    private final String detailed_report_file_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fileId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String file_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "initiatedByAlias", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String initiated_by_alias;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastGeneratedAt", schemaIndex = 10, tag = 11)
    private final String last_generated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numCashTransfersConfirmed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final int num_cash_transfers_confirmed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numCashTransfersPending", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int num_cash_transfers_pending;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numCashTransfersRejected", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final int num_cash_transfers_rejected;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "recordDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Date record_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String ref_id;

    public FuturesBulkCashTransfer() {
        this(null, null, null, null, null, null, 0, 0, 0, null, null, null, 4095, null);
    }

    public /* synthetic */ FuturesBulkCashTransfer(String str, String str2, String str3, String str4, String str5, Date date, int i, int i2, int i3, String str6, String str7, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) == 0 ? str5 : "", (i4 & 32) != 0 ? null : date, (i4 & 64) != 0 ? 0 : i, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) != 0 ? null : str6, (i4 & 1024) == 0 ? str7 : null, (i4 & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20317newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getFile_id() {
        return this.file_id;
    }

    public final String getInitiated_by_alias() {
        return this.initiated_by_alias;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getCash_transfer_reason() {
        return this.cash_transfer_reason;
    }

    public final Date getRecord_date() {
        return this.record_date;
    }

    public final int getNum_cash_transfers_pending() {
        return this.num_cash_transfers_pending;
    }

    public final int getNum_cash_transfers_confirmed() {
        return this.num_cash_transfers_confirmed;
    }

    public final int getNum_cash_transfers_rejected() {
        return this.num_cash_transfers_rejected;
    }

    public final String getDetailed_report_file_url() {
        return this.detailed_report_file_url;
    }

    public final String getLast_generated_at() {
        return this.last_generated_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesBulkCashTransfer(String id, String file_id, String initiated_by_alias, String ref_id, String cash_transfer_reason, Date date, int i, int i2, int i3, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file_id, "file_id");
        Intrinsics.checkNotNullParameter(initiated_by_alias, "initiated_by_alias");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(cash_transfer_reason, "cash_transfer_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.file_id = file_id;
        this.initiated_by_alias = initiated_by_alias;
        this.ref_id = ref_id;
        this.cash_transfer_reason = cash_transfer_reason;
        this.record_date = date;
        this.num_cash_transfers_pending = i;
        this.num_cash_transfers_confirmed = i2;
        this.num_cash_transfers_rejected = i3;
        this.detailed_report_file_url = str;
        this.last_generated_at = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20317newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesBulkCashTransfer)) {
            return false;
        }
        FuturesBulkCashTransfer futuresBulkCashTransfer = (FuturesBulkCashTransfer) other;
        return Intrinsics.areEqual(unknownFields(), futuresBulkCashTransfer.unknownFields()) && Intrinsics.areEqual(this.id, futuresBulkCashTransfer.id) && Intrinsics.areEqual(this.file_id, futuresBulkCashTransfer.file_id) && Intrinsics.areEqual(this.initiated_by_alias, futuresBulkCashTransfer.initiated_by_alias) && Intrinsics.areEqual(this.ref_id, futuresBulkCashTransfer.ref_id) && Intrinsics.areEqual(this.cash_transfer_reason, futuresBulkCashTransfer.cash_transfer_reason) && Intrinsics.areEqual(this.record_date, futuresBulkCashTransfer.record_date) && this.num_cash_transfers_pending == futuresBulkCashTransfer.num_cash_transfers_pending && this.num_cash_transfers_confirmed == futuresBulkCashTransfer.num_cash_transfers_confirmed && this.num_cash_transfers_rejected == futuresBulkCashTransfer.num_cash_transfers_rejected && Intrinsics.areEqual(this.detailed_report_file_url, futuresBulkCashTransfer.detailed_report_file_url) && Intrinsics.areEqual(this.last_generated_at, futuresBulkCashTransfer.last_generated_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.file_id.hashCode()) * 37) + this.initiated_by_alias.hashCode()) * 37) + this.ref_id.hashCode()) * 37) + this.cash_transfer_reason.hashCode()) * 37;
        Date date = this.record_date;
        int iHashCode2 = (((((((iHashCode + (date != null ? date.hashCode() : 0)) * 37) + Integer.hashCode(this.num_cash_transfers_pending)) * 37) + Integer.hashCode(this.num_cash_transfers_confirmed)) * 37) + Integer.hashCode(this.num_cash_transfers_rejected)) * 37;
        String str = this.detailed_report_file_url;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.last_generated_at;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("file_id=" + Internal.sanitize(this.file_id));
        arrayList.add("initiated_by_alias=" + Internal.sanitize(this.initiated_by_alias));
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("cash_transfer_reason=" + Internal.sanitize(this.cash_transfer_reason));
        Date date = this.record_date;
        if (date != null) {
            arrayList.add("record_date=" + date);
        }
        arrayList.add("num_cash_transfers_pending=" + this.num_cash_transfers_pending);
        arrayList.add("num_cash_transfers_confirmed=" + this.num_cash_transfers_confirmed);
        arrayList.add("num_cash_transfers_rejected=" + this.num_cash_transfers_rejected);
        String str = this.detailed_report_file_url;
        if (str != null) {
            arrayList.add("detailed_report_file_url=" + Internal.sanitize(str));
        }
        String str2 = this.last_generated_at;
        if (str2 != null) {
            arrayList.add("last_generated_at=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesBulkCashTransfer{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesBulkCashTransfer copy$default(FuturesBulkCashTransfer futuresBulkCashTransfer, String str, String str2, String str3, String str4, String str5, Date date, int i, int i2, int i3, String str6, String str7, ByteString byteString, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = futuresBulkCashTransfer.id;
        }
        if ((i4 & 2) != 0) {
            str2 = futuresBulkCashTransfer.file_id;
        }
        if ((i4 & 4) != 0) {
            str3 = futuresBulkCashTransfer.initiated_by_alias;
        }
        if ((i4 & 8) != 0) {
            str4 = futuresBulkCashTransfer.ref_id;
        }
        if ((i4 & 16) != 0) {
            str5 = futuresBulkCashTransfer.cash_transfer_reason;
        }
        if ((i4 & 32) != 0) {
            date = futuresBulkCashTransfer.record_date;
        }
        if ((i4 & 64) != 0) {
            i = futuresBulkCashTransfer.num_cash_transfers_pending;
        }
        if ((i4 & 128) != 0) {
            i2 = futuresBulkCashTransfer.num_cash_transfers_confirmed;
        }
        if ((i4 & 256) != 0) {
            i3 = futuresBulkCashTransfer.num_cash_transfers_rejected;
        }
        if ((i4 & 512) != 0) {
            str6 = futuresBulkCashTransfer.detailed_report_file_url;
        }
        if ((i4 & 1024) != 0) {
            str7 = futuresBulkCashTransfer.last_generated_at;
        }
        if ((i4 & 2048) != 0) {
            byteString = futuresBulkCashTransfer.unknownFields();
        }
        String str8 = str7;
        ByteString byteString2 = byteString;
        int i5 = i3;
        String str9 = str6;
        int i6 = i;
        int i7 = i2;
        String str10 = str5;
        Date date2 = date;
        return futuresBulkCashTransfer.copy(str, str2, str3, str4, str10, date2, i6, i7, i5, str9, str8, byteString2);
    }

    public final FuturesBulkCashTransfer copy(String id, String file_id, String initiated_by_alias, String ref_id, String cash_transfer_reason, Date record_date, int num_cash_transfers_pending, int num_cash_transfers_confirmed, int num_cash_transfers_rejected, String detailed_report_file_url, String last_generated_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file_id, "file_id");
        Intrinsics.checkNotNullParameter(initiated_by_alias, "initiated_by_alias");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(cash_transfer_reason, "cash_transfer_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesBulkCashTransfer(id, file_id, initiated_by_alias, ref_id, cash_transfer_reason, record_date, num_cash_transfers_pending, num_cash_transfers_confirmed, num_cash_transfers_rejected, detailed_report_file_url, last_generated_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesBulkCashTransfer.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesBulkCashTransfer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesBulkCashTransfer$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesBulkCashTransfer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getFile_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFile_id());
                }
                if (!Intrinsics.areEqual(value.getInitiated_by_alias(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInitiated_by_alias());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getCash_transfer_reason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCash_transfer_reason());
                }
                if (value.getRecord_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(6, value.getRecord_date());
                }
                if (value.getNum_cash_transfers_pending() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getNum_cash_transfers_pending()));
                }
                if (value.getNum_cash_transfers_confirmed() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(8, Integer.valueOf(value.getNum_cash_transfers_confirmed()));
                }
                if (value.getNum_cash_transfers_rejected() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.getNum_cash_transfers_rejected()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(10, value.getDetailed_report_file_url()) + protoAdapter.encodedSizeWithTag(11, value.getLast_generated_at());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesBulkCashTransfer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getFile_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFile_id());
                }
                if (!Intrinsics.areEqual(value.getInitiated_by_alias(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInitiated_by_alias());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getCash_transfer_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCash_transfer_reason());
                }
                if (value.getRecord_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 6, (int) value.getRecord_date());
                }
                if (value.getNum_cash_transfers_pending() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getNum_cash_transfers_pending()));
                }
                if (value.getNum_cash_transfers_confirmed() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getNum_cash_transfers_confirmed()));
                }
                if (value.getNum_cash_transfers_rejected() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getNum_cash_transfers_rejected()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getDetailed_report_file_url());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getLast_generated_at());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesBulkCashTransfer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 11, (int) value.getLast_generated_at());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getDetailed_report_file_url());
                if (value.getNum_cash_transfers_rejected() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getNum_cash_transfers_rejected()));
                }
                if (value.getNum_cash_transfers_confirmed() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getNum_cash_transfers_confirmed()));
                }
                if (value.getNum_cash_transfers_pending() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getNum_cash_transfers_pending()));
                }
                if (value.getRecord_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 6, (int) value.getRecord_date());
                }
                if (!Intrinsics.areEqual(value.getCash_transfer_reason(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getCash_transfer_reason());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getInitiated_by_alias(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getInitiated_by_alias());
                }
                if (!Intrinsics.areEqual(value.getFile_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getFile_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesBulkCashTransfer redact(FuturesBulkCashTransfer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Date record_date = value.getRecord_date();
                return FuturesBulkCashTransfer.copy$default(value, null, null, null, null, null, record_date != null ? Date.ADAPTER.redact(record_date) : null, 0, 0, 0, null, null, ByteString.EMPTY, 2015, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesBulkCashTransfer decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                Date dateDecode = null;
                String strDecode4 = null;
                String strDecode5 = null;
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                String strDecode6 = strDecode3;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                dateDecode = Date.ADAPTER.decode(reader);
                                break;
                            case 7:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 8:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 9:
                                iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 10:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new FuturesBulkCashTransfer(strDecode, strDecode6, strDecode7, strDecode2, strDecode3, dateDecode, iIntValue, iIntValue2, iIntValue3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
