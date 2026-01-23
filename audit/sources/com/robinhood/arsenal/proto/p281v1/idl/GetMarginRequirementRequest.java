package com.robinhood.arsenal.proto.p281v1.idl;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
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

/* compiled from: GetMarginRequirementRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequest;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "margin_type", "Lcom/robinhood/arsenal/proto/v1/idl/MarginType;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/arsenal/proto/v1/idl/AccountType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/MarginType;Lcom/robinhood/arsenal/proto/v1/idl/AccountType;Lokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getMargin_type", "()Lcom/robinhood/arsenal/proto/v1/idl/MarginType;", "getAccount_type", "()Lcom/robinhood/arsenal/proto/v1/idl/AccountType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class GetMarginRequirementRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetMarginRequirementRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.AccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AccountType account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.MarginType#ADAPTER", jsonName = "marginType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final MarginType margin_type;

    public GetMarginRequirementRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20163newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public /* synthetic */ GetMarginRequirementRequest(String str, MarginType marginType, AccountType accountType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MarginType.MARGIN_TYPE_UNSPECIFIED : marginType, (i & 4) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final MarginType getMargin_type() {
        return this.margin_type;
    }

    public final AccountType getAccount_type() {
        return this.account_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMarginRequirementRequest(String contract_id, MarginType margin_type, AccountType account_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(margin_type, "margin_type");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.margin_type = margin_type;
        this.account_type = account_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20163newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetMarginRequirementRequest)) {
            return false;
        }
        GetMarginRequirementRequest getMarginRequirementRequest = (GetMarginRequirementRequest) other;
        return Intrinsics.areEqual(unknownFields(), getMarginRequirementRequest.unknownFields()) && Intrinsics.areEqual(this.contract_id, getMarginRequirementRequest.contract_id) && this.margin_type == getMarginRequirementRequest.margin_type && this.account_type == getMarginRequirementRequest.account_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.margin_type.hashCode()) * 37) + this.account_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("margin_type=" + this.margin_type);
        arrayList.add("account_type=" + this.account_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMarginRequirementRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetMarginRequirementRequest copy$default(GetMarginRequirementRequest getMarginRequirementRequest, String str, MarginType marginType, AccountType accountType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getMarginRequirementRequest.contract_id;
        }
        if ((i & 2) != 0) {
            marginType = getMarginRequirementRequest.margin_type;
        }
        if ((i & 4) != 0) {
            accountType = getMarginRequirementRequest.account_type;
        }
        if ((i & 8) != 0) {
            byteString = getMarginRequirementRequest.unknownFields();
        }
        return getMarginRequirementRequest.copy(str, marginType, accountType, byteString);
    }

    public final GetMarginRequirementRequest copy(String contract_id, MarginType margin_type, AccountType account_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(margin_type, "margin_type");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetMarginRequirementRequest(contract_id, margin_type, account_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetMarginRequirementRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetMarginRequirementRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.GetMarginRequirementRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetMarginRequirementRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                if (value.getMargin_type() != MarginType.MARGIN_TYPE_UNSPECIFIED) {
                    size += MarginType.ADAPTER.encodedSizeWithTag(2, value.getMargin_type());
                }
                return value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED ? size + AccountType.ADAPTER.encodedSizeWithTag(3, value.getAccount_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetMarginRequirementRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (value.getMargin_type() != MarginType.MARGIN_TYPE_UNSPECIFIED) {
                    MarginType.ADAPTER.encodeWithTag(writer, 2, (int) value.getMargin_type());
                }
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAccount_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetMarginRequirementRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAccount_type());
                }
                if (value.getMargin_type() != MarginType.MARGIN_TYPE_UNSPECIFIED) {
                    MarginType.ADAPTER.encodeWithTag(writer, 2, (int) value.getMargin_type());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetMarginRequirementRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MarginType marginTypeDecode = MarginType.MARGIN_TYPE_UNSPECIFIED;
                AccountType accountTypeDecode = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetMarginRequirementRequest(strDecode, marginTypeDecode, accountTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            marginTypeDecode = MarginType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            accountTypeDecode = AccountType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMarginRequirementRequest redact(GetMarginRequirementRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetMarginRequirementRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
