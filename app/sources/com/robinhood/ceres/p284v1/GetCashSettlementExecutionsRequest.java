package com.robinhood.ceres.p284v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: GetCashSettlementExecutionsRequest.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u0007H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016Ji\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010'R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\t\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "cursor", "page_size", "", "contract_id", "is_download_csv", "", "shard_region", "Lcom/robinhood/ceres/v1/ShardRegion;", "shard_number", "Lcom/robinhood/ceres/v1/ShardNumber;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/ShardRegion;Lcom/robinhood/ceres/v1/ShardNumber;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getCursor", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContract_id", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShard_region", "()Lcom/robinhood/ceres/v1/ShardRegion;", "getShard_number", "()Lcom/robinhood/ceres/v1/ShardNumber;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/ShardRegion;Lcom/robinhood/ceres/v1/ShardNumber;Lokio/ByteString;)Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequest;", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetCashSettlementExecutionsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetCashSettlementExecutionsRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", schemaIndex = 3, tag = 4)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDownloadCsv", schemaIndex = 4, tag = 5)
    private final Boolean is_download_csv;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", schemaIndex = 2, tag = 3)
    private final Integer page_size;

    @WireField(adapter = "com.robinhood.ceres.v1.ShardNumber#ADAPTER", jsonName = "shardNumber", schemaIndex = 6, tag = 7)
    private final ShardNumber shard_number;

    @WireField(adapter = "com.robinhood.ceres.v1.ShardRegion#ADAPTER", jsonName = "shardRegion", schemaIndex = 5, tag = 6)
    private final ShardRegion shard_region;

    public GetCashSettlementExecutionsRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20339newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getPage_size() {
        return this.page_size;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    /* renamed from: is_download_csv, reason: from getter */
    public final Boolean getIs_download_csv() {
        return this.is_download_csv;
    }

    public final ShardRegion getShard_region() {
        return this.shard_region;
    }

    public final ShardNumber getShard_number() {
        return this.shard_number;
    }

    public /* synthetic */ GetCashSettlementExecutionsRequest(String str, String str2, Integer num, String str3, Boolean bool, ShardRegion shardRegion, ShardNumber shardNumber, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : shardRegion, (i & 64) != 0 ? null : shardNumber, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCashSettlementExecutionsRequest(String str, String str2, Integer num, String str3, Boolean bool, ShardRegion shardRegion, ShardNumber shardNumber, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = str;
        this.cursor = str2;
        this.page_size = num;
        this.contract_id = str3;
        this.is_download_csv = bool;
        this.shard_region = shardRegion;
        this.shard_number = shardNumber;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20339newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCashSettlementExecutionsRequest)) {
            return false;
        }
        GetCashSettlementExecutionsRequest getCashSettlementExecutionsRequest = (GetCashSettlementExecutionsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getCashSettlementExecutionsRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getCashSettlementExecutionsRequest.account_id) && Intrinsics.areEqual(this.cursor, getCashSettlementExecutionsRequest.cursor) && Intrinsics.areEqual(this.page_size, getCashSettlementExecutionsRequest.page_size) && Intrinsics.areEqual(this.contract_id, getCashSettlementExecutionsRequest.contract_id) && Intrinsics.areEqual(this.is_download_csv, getCashSettlementExecutionsRequest.is_download_csv) && this.shard_region == getCashSettlementExecutionsRequest.shard_region && this.shard_number == getCashSettlementExecutionsRequest.shard_number;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.account_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cursor;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        String str3 = this.contract_id;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.is_download_csv;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        ShardRegion shardRegion = this.shard_region;
        int iHashCode7 = (iHashCode6 + (shardRegion != null ? shardRegion.hashCode() : 0)) * 37;
        ShardNumber shardNumber = this.shard_number;
        int iHashCode8 = iHashCode7 + (shardNumber != null ? shardNumber.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.account_id;
        if (str != null) {
            arrayList.add("account_id=" + Internal.sanitize(str));
        }
        String str2 = this.cursor;
        if (str2 != null) {
            arrayList.add("cursor=" + Internal.sanitize(str2));
        }
        Integer num = this.page_size;
        if (num != null) {
            arrayList.add("page_size=" + num);
        }
        String str3 = this.contract_id;
        if (str3 != null) {
            arrayList.add("contract_id=" + Internal.sanitize(str3));
        }
        Boolean bool = this.is_download_csv;
        if (bool != null) {
            arrayList.add("is_download_csv=" + bool);
        }
        ShardRegion shardRegion = this.shard_region;
        if (shardRegion != null) {
            arrayList.add("shard_region=" + shardRegion);
        }
        ShardNumber shardNumber = this.shard_number;
        if (shardNumber != null) {
            arrayList.add("shard_number=" + shardNumber);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCashSettlementExecutionsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCashSettlementExecutionsRequest copy$default(GetCashSettlementExecutionsRequest getCashSettlementExecutionsRequest, String str, String str2, Integer num, String str3, Boolean bool, ShardRegion shardRegion, ShardNumber shardNumber, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCashSettlementExecutionsRequest.account_id;
        }
        if ((i & 2) != 0) {
            str2 = getCashSettlementExecutionsRequest.cursor;
        }
        if ((i & 4) != 0) {
            num = getCashSettlementExecutionsRequest.page_size;
        }
        if ((i & 8) != 0) {
            str3 = getCashSettlementExecutionsRequest.contract_id;
        }
        if ((i & 16) != 0) {
            bool = getCashSettlementExecutionsRequest.is_download_csv;
        }
        if ((i & 32) != 0) {
            shardRegion = getCashSettlementExecutionsRequest.shard_region;
        }
        if ((i & 64) != 0) {
            shardNumber = getCashSettlementExecutionsRequest.shard_number;
        }
        if ((i & 128) != 0) {
            byteString = getCashSettlementExecutionsRequest.unknownFields();
        }
        ShardNumber shardNumber2 = shardNumber;
        ByteString byteString2 = byteString;
        Boolean bool2 = bool;
        ShardRegion shardRegion2 = shardRegion;
        return getCashSettlementExecutionsRequest.copy(str, str2, num, str3, bool2, shardRegion2, shardNumber2, byteString2);
    }

    public final GetCashSettlementExecutionsRequest copy(String account_id, String cursor, Integer page_size, String contract_id, Boolean is_download_csv, ShardRegion shard_region, ShardNumber shard_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCashSettlementExecutionsRequest(account_id, cursor, page_size, contract_id, is_download_csv, shard_region, shard_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCashSettlementExecutionsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCashSettlementExecutionsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetCashSettlementExecutionsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCashSettlementExecutionsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getAccount_id()) + protoAdapter.encodedSizeWithTag(2, value.getCursor()) + ProtoAdapter.INT32.encodedSizeWithTag(3, value.getPage_size()) + protoAdapter.encodedSizeWithTag(4, value.getContract_id()) + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.getIs_download_csv()) + ShardRegion.ADAPTER.encodedSizeWithTag(6, value.getShard_region()) + ShardNumber.ADAPTER.encodedSizeWithTag(7, value.getShard_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCashSettlementExecutionsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getCursor());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getPage_size());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getContract_id());
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getIs_download_csv());
                ShardRegion.ADAPTER.encodeWithTag(writer, 6, (int) value.getShard_region());
                ShardNumber.ADAPTER.encodeWithTag(writer, 7, (int) value.getShard_number());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCashSettlementExecutionsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ShardNumber.ADAPTER.encodeWithTag(writer, 7, (int) value.getShard_number());
                ShardRegion.ADAPTER.encodeWithTag(writer, 6, (int) value.getShard_region());
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getIs_download_csv());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getContract_id());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getPage_size());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getCursor());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCashSettlementExecutionsRequest redact(GetCashSettlementExecutionsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCashSettlementExecutionsRequest.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCashSettlementExecutionsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                Integer numDecode = null;
                String strDecode3 = null;
                Boolean boolDecode = null;
                ShardRegion shardRegionDecode = null;
                ShardNumber shardNumberDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 6:
                                try {
                                    shardRegionDecode = ShardRegion.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 7:
                                try {
                                    shardNumberDecode = ShardNumber.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetCashSettlementExecutionsRequest(strDecode, strDecode2, numDecode, strDecode3, boolDecode, shardRegionDecode, shardNumberDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
