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

/* compiled from: GetCurrentPositionsRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCurrentPositionsRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "cursor", "page_size", "", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/ceres/v1/FuturesContractType;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getCursor", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractType;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/ceres/v1/FuturesContractType;Lokio/ByteString;)Lcom/robinhood/ceres/v1/GetCurrentPositionsRequest;", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetCurrentPositionsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetCurrentPositionsRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesContractType#ADAPTER", jsonName = "contractType", schemaIndex = 3, tag = 4)
    private final FuturesContractType contract_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", schemaIndex = 2, tag = 3)
    private final Integer page_size;

    public GetCurrentPositionsRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20356newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ GetCurrentPositionsRequest(String str, String str2, Integer num, FuturesContractType futuresContractType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : futuresContractType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getPage_size() {
        return this.page_size;
    }

    public final FuturesContractType getContract_type() {
        return this.contract_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCurrentPositionsRequest(String account_id, String str, Integer num, FuturesContractType futuresContractType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.cursor = str;
        this.page_size = num;
        this.contract_type = futuresContractType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20356newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCurrentPositionsRequest)) {
            return false;
        }
        GetCurrentPositionsRequest getCurrentPositionsRequest = (GetCurrentPositionsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getCurrentPositionsRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getCurrentPositionsRequest.account_id) && Intrinsics.areEqual(this.cursor, getCurrentPositionsRequest.cursor) && Intrinsics.areEqual(this.page_size, getCurrentPositionsRequest.page_size) && this.contract_type == getCurrentPositionsRequest.contract_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37;
        String str = this.cursor;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        FuturesContractType futuresContractType = this.contract_type;
        int iHashCode4 = iHashCode3 + (futuresContractType != null ? futuresContractType.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        String str = this.cursor;
        if (str != null) {
            arrayList.add("cursor=" + Internal.sanitize(str));
        }
        Integer num = this.page_size;
        if (num != null) {
            arrayList.add("page_size=" + num);
        }
        FuturesContractType futuresContractType = this.contract_type;
        if (futuresContractType != null) {
            arrayList.add("contract_type=" + futuresContractType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCurrentPositionsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCurrentPositionsRequest copy$default(GetCurrentPositionsRequest getCurrentPositionsRequest, String str, String str2, Integer num, FuturesContractType futuresContractType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCurrentPositionsRequest.account_id;
        }
        if ((i & 2) != 0) {
            str2 = getCurrentPositionsRequest.cursor;
        }
        if ((i & 4) != 0) {
            num = getCurrentPositionsRequest.page_size;
        }
        if ((i & 8) != 0) {
            futuresContractType = getCurrentPositionsRequest.contract_type;
        }
        if ((i & 16) != 0) {
            byteString = getCurrentPositionsRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        Integer num2 = num;
        return getCurrentPositionsRequest.copy(str, str2, num2, futuresContractType, byteString2);
    }

    public final GetCurrentPositionsRequest copy(String account_id, String cursor, Integer page_size, FuturesContractType contract_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCurrentPositionsRequest(account_id, cursor, page_size, contract_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCurrentPositionsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCurrentPositionsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetCurrentPositionsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCurrentPositionsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCursor()) + ProtoAdapter.INT32.encodedSizeWithTag(3, value.getPage_size()) + FuturesContractType.ADAPTER.encodedSizeWithTag(4, value.getContract_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCurrentPositionsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCursor());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getPage_size());
                FuturesContractType.ADAPTER.encodeWithTag(writer, 4, (int) value.getContract_type());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCurrentPositionsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FuturesContractType.ADAPTER.encodeWithTag(writer, 4, (int) value.getContract_type());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getPage_size());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getCursor());
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCurrentPositionsRequest redact(GetCurrentPositionsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCurrentPositionsRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCurrentPositionsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                Integer numDecode = null;
                FuturesContractType futuresContractTypeDecode = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetCurrentPositionsRequest(str, strDecode2, numDecode, futuresContractTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                numDecode = ProtoAdapter.INT32.decode(reader);
                            } else if (iNextTag == 4) {
                                try {
                                    futuresContractTypeDecode = FuturesContractType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }
        };
    }
}
