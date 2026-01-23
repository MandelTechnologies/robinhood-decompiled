package com.robinhood.ceres.p284v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
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

/* compiled from: GetCurrentAggregatedPositionsRequest.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010*\u001a\u00020\u0002H\u0017J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020\bH\u0016J\b\u0010/\u001a\u00020\u0004H\u0016J\u0097\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u00101R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\t\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u00063"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "contract_id", "cursor", "page_size", "", "is_download_csv", "", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractType;", "account_number", "start_oldest_event_date", "end_oldest_event_date", "shard_region", "Lcom/robinhood/ceres/v1/ShardRegion;", "shard_number", "Lcom/robinhood/ceres/v1/ShardNumber;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegion;Lcom/robinhood/ceres/v1/ShardNumber;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getContract_id", "getCursor", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractType;", "getAccount_number", "getStart_oldest_event_date", "getEnd_oldest_event_date", "getShard_region", "()Lcom/robinhood/ceres/v1/ShardRegion;", "getShard_number", "()Lcom/robinhood/ceres/v1/ShardNumber;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegion;Lcom/robinhood/ceres/v1/ShardNumber;Lokio/ByteString;)Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequest;", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetCurrentAggregatedPositionsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetCurrentAggregatedPositionsRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", schemaIndex = 6, tag = 7)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", schemaIndex = 1, tag = 2)
    private final String contract_id;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesContractType#ADAPTER", jsonName = "contractType", schemaIndex = 5, tag = 6)
    private final FuturesContractType contract_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endOldestEventDate", schemaIndex = 8, tag = 9)
    private final String end_oldest_event_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDownloadCsv", schemaIndex = 4, tag = 5)
    private final Boolean is_download_csv;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", schemaIndex = 3, tag = 4)
    private final Integer page_size;

    @WireField(adapter = "com.robinhood.ceres.v1.ShardNumber#ADAPTER", jsonName = "shardNumber", schemaIndex = 10, tag = 11)
    private final ShardNumber shard_number;

    @WireField(adapter = "com.robinhood.ceres.v1.ShardRegion#ADAPTER", jsonName = "shardRegion", schemaIndex = 9, tag = 10)
    private final ShardRegion shard_region;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startOldestEventDate", schemaIndex = 7, tag = 8)
    private final String start_oldest_event_date;

    public GetCurrentAggregatedPositionsRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20348newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ GetCurrentAggregatedPositionsRequest(String str, String str2, String str3, Integer num, Boolean bool, FuturesContractType futuresContractType, String str4, String str5, String str6, ShardRegion shardRegion, ShardNumber shardNumber, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : futuresContractType, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : shardRegion, (i & 1024) != 0 ? null : shardNumber, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getPage_size() {
        return this.page_size;
    }

    /* renamed from: is_download_csv, reason: from getter */
    public final Boolean getIs_download_csv() {
        return this.is_download_csv;
    }

    public final FuturesContractType getContract_type() {
        return this.contract_type;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getStart_oldest_event_date() {
        return this.start_oldest_event_date;
    }

    public final String getEnd_oldest_event_date() {
        return this.end_oldest_event_date;
    }

    public final ShardRegion getShard_region() {
        return this.shard_region;
    }

    public final ShardNumber getShard_number() {
        return this.shard_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCurrentAggregatedPositionsRequest(String account_id, String str, String str2, Integer num, Boolean bool, FuturesContractType futuresContractType, String str3, String str4, String str5, ShardRegion shardRegion, ShardNumber shardNumber, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.contract_id = str;
        this.cursor = str2;
        this.page_size = num;
        this.is_download_csv = bool;
        this.contract_type = futuresContractType;
        this.account_number = str3;
        this.start_oldest_event_date = str4;
        this.end_oldest_event_date = str5;
        this.shard_region = shardRegion;
        this.shard_number = shardNumber;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20348newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCurrentAggregatedPositionsRequest)) {
            return false;
        }
        GetCurrentAggregatedPositionsRequest getCurrentAggregatedPositionsRequest = (GetCurrentAggregatedPositionsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getCurrentAggregatedPositionsRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getCurrentAggregatedPositionsRequest.account_id) && Intrinsics.areEqual(this.contract_id, getCurrentAggregatedPositionsRequest.contract_id) && Intrinsics.areEqual(this.cursor, getCurrentAggregatedPositionsRequest.cursor) && Intrinsics.areEqual(this.page_size, getCurrentAggregatedPositionsRequest.page_size) && Intrinsics.areEqual(this.is_download_csv, getCurrentAggregatedPositionsRequest.is_download_csv) && this.contract_type == getCurrentAggregatedPositionsRequest.contract_type && Intrinsics.areEqual(this.account_number, getCurrentAggregatedPositionsRequest.account_number) && Intrinsics.areEqual(this.start_oldest_event_date, getCurrentAggregatedPositionsRequest.start_oldest_event_date) && Intrinsics.areEqual(this.end_oldest_event_date, getCurrentAggregatedPositionsRequest.end_oldest_event_date) && this.shard_region == getCurrentAggregatedPositionsRequest.shard_region && this.shard_number == getCurrentAggregatedPositionsRequest.shard_number;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37;
        String str = this.contract_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cursor;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Boolean bool = this.is_download_csv;
        int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 37;
        FuturesContractType futuresContractType = this.contract_type;
        int iHashCode6 = (iHashCode5 + (futuresContractType != null ? futuresContractType.hashCode() : 0)) * 37;
        String str3 = this.account_number;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.start_oldest_event_date;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.end_oldest_event_date;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        ShardRegion shardRegion = this.shard_region;
        int iHashCode10 = (iHashCode9 + (shardRegion != null ? shardRegion.hashCode() : 0)) * 37;
        ShardNumber shardNumber = this.shard_number;
        int iHashCode11 = iHashCode10 + (shardNumber != null ? shardNumber.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        String str = this.contract_id;
        if (str != null) {
            arrayList.add("contract_id=" + Internal.sanitize(str));
        }
        String str2 = this.cursor;
        if (str2 != null) {
            arrayList.add("cursor=" + Internal.sanitize(str2));
        }
        Integer num = this.page_size;
        if (num != null) {
            arrayList.add("page_size=" + num);
        }
        Boolean bool = this.is_download_csv;
        if (bool != null) {
            arrayList.add("is_download_csv=" + bool);
        }
        FuturesContractType futuresContractType = this.contract_type;
        if (futuresContractType != null) {
            arrayList.add("contract_type=" + futuresContractType);
        }
        String str3 = this.account_number;
        if (str3 != null) {
            arrayList.add("account_number=" + Internal.sanitize(str3));
        }
        String str4 = this.start_oldest_event_date;
        if (str4 != null) {
            arrayList.add("start_oldest_event_date=" + Internal.sanitize(str4));
        }
        String str5 = this.end_oldest_event_date;
        if (str5 != null) {
            arrayList.add("end_oldest_event_date=" + Internal.sanitize(str5));
        }
        ShardRegion shardRegion = this.shard_region;
        if (shardRegion != null) {
            arrayList.add("shard_region=" + shardRegion);
        }
        ShardNumber shardNumber = this.shard_number;
        if (shardNumber != null) {
            arrayList.add("shard_number=" + shardNumber);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCurrentAggregatedPositionsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCurrentAggregatedPositionsRequest copy$default(GetCurrentAggregatedPositionsRequest getCurrentAggregatedPositionsRequest, String str, String str2, String str3, Integer num, Boolean bool, FuturesContractType futuresContractType, String str4, String str5, String str6, ShardRegion shardRegion, ShardNumber shardNumber, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCurrentAggregatedPositionsRequest.account_id;
        }
        if ((i & 2) != 0) {
            str2 = getCurrentAggregatedPositionsRequest.contract_id;
        }
        if ((i & 4) != 0) {
            str3 = getCurrentAggregatedPositionsRequest.cursor;
        }
        if ((i & 8) != 0) {
            num = getCurrentAggregatedPositionsRequest.page_size;
        }
        if ((i & 16) != 0) {
            bool = getCurrentAggregatedPositionsRequest.is_download_csv;
        }
        if ((i & 32) != 0) {
            futuresContractType = getCurrentAggregatedPositionsRequest.contract_type;
        }
        if ((i & 64) != 0) {
            str4 = getCurrentAggregatedPositionsRequest.account_number;
        }
        if ((i & 128) != 0) {
            str5 = getCurrentAggregatedPositionsRequest.start_oldest_event_date;
        }
        if ((i & 256) != 0) {
            str6 = getCurrentAggregatedPositionsRequest.end_oldest_event_date;
        }
        if ((i & 512) != 0) {
            shardRegion = getCurrentAggregatedPositionsRequest.shard_region;
        }
        if ((i & 1024) != 0) {
            shardNumber = getCurrentAggregatedPositionsRequest.shard_number;
        }
        if ((i & 2048) != 0) {
            byteString = getCurrentAggregatedPositionsRequest.unknownFields();
        }
        ShardNumber shardNumber2 = shardNumber;
        ByteString byteString2 = byteString;
        String str7 = str6;
        ShardRegion shardRegion2 = shardRegion;
        String str8 = str4;
        String str9 = str5;
        Boolean bool2 = bool;
        FuturesContractType futuresContractType2 = futuresContractType;
        return getCurrentAggregatedPositionsRequest.copy(str, str2, str3, num, bool2, futuresContractType2, str8, str9, str7, shardRegion2, shardNumber2, byteString2);
    }

    public final GetCurrentAggregatedPositionsRequest copy(String account_id, String contract_id, String cursor, Integer page_size, Boolean is_download_csv, FuturesContractType contract_type, String account_number, String start_oldest_event_date, String end_oldest_event_date, ShardRegion shard_region, ShardNumber shard_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCurrentAggregatedPositionsRequest(account_id, contract_id, cursor, page_size, is_download_csv, contract_type, account_number, start_oldest_event_date, end_oldest_event_date, shard_region, shard_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCurrentAggregatedPositionsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCurrentAggregatedPositionsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetCurrentAggregatedPositionsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCurrentAggregatedPositionsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(2, value.getContract_id()) + protoAdapter.encodedSizeWithTag(3, value.getCursor()) + ProtoAdapter.INT32.encodedSizeWithTag(4, value.getPage_size()) + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.getIs_download_csv()) + FuturesContractType.ADAPTER.encodedSizeWithTag(6, value.getContract_type()) + protoAdapter.encodedSizeWithTag(7, value.getAccount_number()) + protoAdapter.encodedSizeWithTag(8, value.getStart_oldest_event_date()) + protoAdapter.encodedSizeWithTag(9, value.getEnd_oldest_event_date()) + ShardRegion.ADAPTER.encodedSizeWithTag(10, value.getShard_region()) + ShardNumber.ADAPTER.encodedSizeWithTag(11, value.getShard_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCurrentAggregatedPositionsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getContract_id());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getCursor());
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getPage_size());
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getIs_download_csv());
                FuturesContractType.ADAPTER.encodeWithTag(writer, 6, (int) value.getContract_type());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getAccount_number());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getStart_oldest_event_date());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getEnd_oldest_event_date());
                ShardRegion.ADAPTER.encodeWithTag(writer, 10, (int) value.getShard_region());
                ShardNumber.ADAPTER.encodeWithTag(writer, 11, (int) value.getShard_number());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCurrentAggregatedPositionsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ShardNumber.ADAPTER.encodeWithTag(writer, 11, (int) value.getShard_number());
                ShardRegion.ADAPTER.encodeWithTag(writer, 10, (int) value.getShard_region());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 9, (int) value.getEnd_oldest_event_date());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getStart_oldest_event_date());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getAccount_number());
                FuturesContractType.ADAPTER.encodeWithTag(writer, 6, (int) value.getContract_type());
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getIs_download_csv());
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getPage_size());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getCursor());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getContract_id());
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCurrentAggregatedPositionsRequest redact(GetCurrentAggregatedPositionsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCurrentAggregatedPositionsRequest.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 2047, null);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0020. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public com.robinhood.ceres.p284v1.GetCurrentAggregatedPositionsRequest decode(com.squareup.wire.ProtoReader r29) {
                /*
                    Method dump skipped, instructions count: 326
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.ceres.p284v1.GetCurrentAggregatedPositionsRequest2.decode(com.squareup.wire.ProtoReader):com.robinhood.ceres.v1.GetCurrentAggregatedPositionsRequest");
            }
        };
    }
}
