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

/* compiled from: GetAccountsRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010 R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetAccountsRequest;", "Lcom/squareup/wire/Message;", "", "rhs_account_number", "", "cursor", "page_size", "", "client_type", "Lcom/robinhood/ceres/v1/AccountClientType;", "account_number", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/ceres/v1/AccountClientType;Ljava/lang/String;Lokio/ByteString;)V", "getRhs_account_number", "()Ljava/lang/String;", "getCursor", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClient_type", "()Lcom/robinhood/ceres/v1/AccountClientType;", "getAccount_number", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/ceres/v1/AccountClientType;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/ceres/v1/GetAccountsRequest;", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetAccountsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountsRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", schemaIndex = 4, tag = 5)
    private final String account_number;

    @WireField(adapter = "com.robinhood.ceres.v1.AccountClientType#ADAPTER", jsonName = "clientType", schemaIndex = 3, tag = 4)
    private final AccountClientType client_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", schemaIndex = 2, tag = 3)
    private final Integer page_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", schemaIndex = 0, tag = 1)
    private final String rhs_account_number;

    public GetAccountsRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20331newBuilder();
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getPage_size() {
        return this.page_size;
    }

    public final AccountClientType getClient_type() {
        return this.client_type;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetAccountsRequest(String str, String str2, Integer num, AccountClientType accountClientType, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : accountClientType, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountsRequest(String str, String str2, Integer num, AccountClientType accountClientType, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rhs_account_number = str;
        this.cursor = str2;
        this.page_size = num;
        this.client_type = accountClientType;
        this.account_number = str3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20331newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountsRequest)) {
            return false;
        }
        GetAccountsRequest getAccountsRequest = (GetAccountsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getAccountsRequest.unknownFields()) && Intrinsics.areEqual(this.rhs_account_number, getAccountsRequest.rhs_account_number) && Intrinsics.areEqual(this.cursor, getAccountsRequest.cursor) && Intrinsics.areEqual(this.page_size, getAccountsRequest.page_size) && this.client_type == getAccountsRequest.client_type && Intrinsics.areEqual(this.account_number, getAccountsRequest.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.rhs_account_number;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cursor;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        AccountClientType accountClientType = this.client_type;
        int iHashCode5 = (iHashCode4 + (accountClientType != null ? accountClientType.hashCode() : 0)) * 37;
        String str3 = this.account_number;
        int iHashCode6 = iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.rhs_account_number;
        if (str != null) {
            arrayList.add("rhs_account_number=" + Internal.sanitize(str));
        }
        String str2 = this.cursor;
        if (str2 != null) {
            arrayList.add("cursor=" + Internal.sanitize(str2));
        }
        Integer num = this.page_size;
        if (num != null) {
            arrayList.add("page_size=" + num);
        }
        AccountClientType accountClientType = this.client_type;
        if (accountClientType != null) {
            arrayList.add("client_type=" + accountClientType);
        }
        String str3 = this.account_number;
        if (str3 != null) {
            arrayList.add("account_number=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAccountsRequest copy$default(GetAccountsRequest getAccountsRequest, String str, String str2, Integer num, AccountClientType accountClientType, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAccountsRequest.rhs_account_number;
        }
        if ((i & 2) != 0) {
            str2 = getAccountsRequest.cursor;
        }
        if ((i & 4) != 0) {
            num = getAccountsRequest.page_size;
        }
        if ((i & 8) != 0) {
            accountClientType = getAccountsRequest.client_type;
        }
        if ((i & 16) != 0) {
            str3 = getAccountsRequest.account_number;
        }
        if ((i & 32) != 0) {
            byteString = getAccountsRequest.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        return getAccountsRequest.copy(str, str2, num, accountClientType, str4, byteString2);
    }

    public final GetAccountsRequest copy(String rhs_account_number, String cursor, Integer page_size, AccountClientType client_type, String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountsRequest(rhs_account_number, cursor, page_size, client_type, account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetAccountsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getRhs_account_number()) + protoAdapter.encodedSizeWithTag(2, value.getCursor()) + ProtoAdapter.INT32.encodedSizeWithTag(3, value.getPage_size()) + AccountClientType.ADAPTER.encodedSizeWithTag(4, value.getClient_type()) + protoAdapter.encodedSizeWithTag(5, value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getCursor());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getPage_size());
                AccountClientType.ADAPTER.encodeWithTag(writer, 4, (int) value.getClient_type());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getAccount_number());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getAccount_number());
                AccountClientType.ADAPTER.encodeWithTag(writer, 4, (int) value.getClient_type());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getPage_size());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getCursor());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountsRequest redact(GetAccountsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAccountsRequest.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                Integer numDecode = null;
                AccountClientType accountClientTypeDecode = null;
                String strDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAccountsRequest(strDecode, strDecode2, numDecode, accountClientTypeDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 4) {
                        try {
                            accountClientTypeDecode = AccountClientType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 5) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
