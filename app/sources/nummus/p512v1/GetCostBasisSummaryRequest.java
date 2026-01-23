package nummus.p512v1;

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

/* compiled from: GetCostBasisSummaryRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u000bH\u0016J\b\u0010&\u001a\u00020\u0004H\u0016Jj\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, m3636d2 = {"Lnummus/v1/GetCostBasisSummaryRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "source_id", "source_type", "currency_pair_id", "status", "Lnummus/v1/CostBasisStatus;", "year", "", "limit", "cursor", "allow_correction", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CostBasisStatus;IILjava/lang/String;ZLokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getSource_id", "getSource_type", "getCurrency_pair_id", "getStatus", "()Lnummus/v1/CostBasisStatus;", "getYear", "()I", "getLimit", "getCursor", "getAllow_correction", "()Z", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GetCostBasisSummaryRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetCostBasisSummaryRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "allowCorrection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final boolean allow_correction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String currency_pair_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String source_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String source_type;

    @WireField(adapter = "nummus.v1.CostBasisStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CostBasisStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int year;

    public GetCostBasisSummaryRequest() {
        this(null, null, null, null, null, 0, 0, null, false, null, 1023, null);
    }

    public /* synthetic */ GetCostBasisSummaryRequest(String str, String str2, String str3, String str4, CostBasisStatus costBasisStatus, int i, int i2, String str5, boolean z, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? CostBasisStatus.COST_BASIS_STATUS_UNSPECIFIED : costBasisStatus, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? "" : str5, (i3 & 256) != 0 ? false : z, (i3 & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29428newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getSource_id() {
        return this.source_id;
    }

    public final String getSource_type() {
        return this.source_type;
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public final CostBasisStatus getStatus() {
        return this.status;
    }

    public final int getYear() {
        return this.year;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final boolean getAllow_correction() {
        return this.allow_correction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCostBasisSummaryRequest(String account_id, String source_id, String source_type, String currency_pair_id, CostBasisStatus status, int i, int i2, String cursor, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.source_id = source_id;
        this.source_type = source_type;
        this.currency_pair_id = currency_pair_id;
        this.status = status;
        this.year = i;
        this.limit = i2;
        this.cursor = cursor;
        this.allow_correction = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29428newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCostBasisSummaryRequest)) {
            return false;
        }
        GetCostBasisSummaryRequest getCostBasisSummaryRequest = (GetCostBasisSummaryRequest) other;
        return Intrinsics.areEqual(unknownFields(), getCostBasisSummaryRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getCostBasisSummaryRequest.account_id) && Intrinsics.areEqual(this.source_id, getCostBasisSummaryRequest.source_id) && Intrinsics.areEqual(this.source_type, getCostBasisSummaryRequest.source_type) && Intrinsics.areEqual(this.currency_pair_id, getCostBasisSummaryRequest.currency_pair_id) && this.status == getCostBasisSummaryRequest.status && this.year == getCostBasisSummaryRequest.year && this.limit == getCostBasisSummaryRequest.limit && Intrinsics.areEqual(this.cursor, getCostBasisSummaryRequest.cursor) && this.allow_correction == getCostBasisSummaryRequest.allow_correction;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.source_id.hashCode()) * 37) + this.source_type.hashCode()) * 37) + this.currency_pair_id.hashCode()) * 37) + this.status.hashCode()) * 37) + Integer.hashCode(this.year)) * 37) + Integer.hashCode(this.limit)) * 37) + this.cursor.hashCode()) * 37) + Boolean.hashCode(this.allow_correction);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("source_id=" + Internal.sanitize(this.source_id));
        arrayList.add("source_type=" + Internal.sanitize(this.source_type));
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        arrayList.add("status=" + this.status);
        arrayList.add("year=" + this.year);
        arrayList.add("limit=" + this.limit);
        arrayList.add("cursor=" + Internal.sanitize(this.cursor));
        arrayList.add("allow_correction=" + this.allow_correction);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCostBasisSummaryRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCostBasisSummaryRequest copy$default(GetCostBasisSummaryRequest getCostBasisSummaryRequest, String str, String str2, String str3, String str4, CostBasisStatus costBasisStatus, int i, int i2, String str5, boolean z, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = getCostBasisSummaryRequest.account_id;
        }
        if ((i3 & 2) != 0) {
            str2 = getCostBasisSummaryRequest.source_id;
        }
        if ((i3 & 4) != 0) {
            str3 = getCostBasisSummaryRequest.source_type;
        }
        if ((i3 & 8) != 0) {
            str4 = getCostBasisSummaryRequest.currency_pair_id;
        }
        if ((i3 & 16) != 0) {
            costBasisStatus = getCostBasisSummaryRequest.status;
        }
        if ((i3 & 32) != 0) {
            i = getCostBasisSummaryRequest.year;
        }
        if ((i3 & 64) != 0) {
            i2 = getCostBasisSummaryRequest.limit;
        }
        if ((i3 & 128) != 0) {
            str5 = getCostBasisSummaryRequest.cursor;
        }
        if ((i3 & 256) != 0) {
            z = getCostBasisSummaryRequest.allow_correction;
        }
        if ((i3 & 512) != 0) {
            byteString = getCostBasisSummaryRequest.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        int i4 = i2;
        String str6 = str5;
        CostBasisStatus costBasisStatus2 = costBasisStatus;
        int i5 = i;
        return getCostBasisSummaryRequest.copy(str, str2, str3, str4, costBasisStatus2, i5, i4, str6, z2, byteString2);
    }

    public final GetCostBasisSummaryRequest copy(String account_id, String source_id, String source_type, String currency_pair_id, CostBasisStatus status, int year, int limit, String cursor, boolean allow_correction, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCostBasisSummaryRequest(account_id, source_id, source_type, currency_pair_id, status, year, limit, cursor, allow_correction, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCostBasisSummaryRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCostBasisSummaryRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.GetCostBasisSummaryRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCostBasisSummaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getSource_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSource_id());
                }
                if (!Intrinsics.areEqual(value.getSource_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSource_type());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCurrency_pair_id());
                }
                if (value.getStatus() != CostBasisStatus.COST_BASIS_STATUS_UNSPECIFIED) {
                    size += CostBasisStatus.ADAPTER.encodedSizeWithTag(5, value.getStatus());
                }
                if (value.getYear() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getYear()));
                }
                if (value.getLimit() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getLimit()));
                }
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getCursor());
                }
                return value.getAllow_correction() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getAllow_correction())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCostBasisSummaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getSource_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource_id());
                }
                if (!Intrinsics.areEqual(value.getSource_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSource_type());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCurrency_pair_id());
                }
                if (value.getStatus() != CostBasisStatus.COST_BASIS_STATUS_UNSPECIFIED) {
                    CostBasisStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                if (value.getYear() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getYear()));
                }
                if (value.getLimit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getLimit()));
                }
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCursor());
                }
                if (value.getAllow_correction()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getAllow_correction()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCostBasisSummaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAllow_correction()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getAllow_correction()));
                }
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCursor());
                }
                if (value.getLimit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getLimit()));
                }
                if (value.getYear() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getYear()));
                }
                if (value.getStatus() != CostBasisStatus.COST_BASIS_STATUS_UNSPECIFIED) {
                    CostBasisStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCurrency_pair_id());
                }
                if (!Intrinsics.areEqual(value.getSource_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSource_type());
                }
                if (!Intrinsics.areEqual(value.getSource_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource_id());
                }
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCostBasisSummaryRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CostBasisStatus costBasisStatus = CostBasisStatus.COST_BASIS_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                int iIntValue = 0;
                int iIntValue2 = 0;
                boolean zBooleanValue = false;
                CostBasisStatus costBasisStatusDecode = costBasisStatus;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                try {
                                    costBasisStatusDecode = CostBasisStatus.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 7:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetCostBasisSummaryRequest(strDecode5, strDecode, strDecode2, strDecode3, costBasisStatusDecode, iIntValue, iIntValue2, strDecode4, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCostBasisSummaryRequest redact(GetCostBasisSummaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCostBasisSummaryRequest.copy$default(value, null, null, null, null, null, 0, 0, null, false, ByteString.EMPTY, 511, null);
            }
        };
    }
}
