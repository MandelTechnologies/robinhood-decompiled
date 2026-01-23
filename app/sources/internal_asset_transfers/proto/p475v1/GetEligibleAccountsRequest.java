package internal_asset_transfers.proto.p475v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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
import rosetta.account.BrokerageAccountType;

/* compiled from: GetEligibleAccountsRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetEligibleAccountsRequest;", "Lcom/squareup/wire/Message;", "", "account_type_filter", "Lrosetta/account/BrokerageAccountType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/account/BrokerageAccountType;Lokio/ByteString;)V", "getAccount_type_filter", "()Lrosetta/account/BrokerageAccountType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetEligibleAccountsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetEligibleAccountsRequest> ADAPTER;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "accountTypeFilter", schemaIndex = 0, tag = 1)
    private final BrokerageAccountType account_type_filter;

    /* JADX WARN: Multi-variable type inference failed */
    public GetEligibleAccountsRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28446newBuilder();
    }

    public final BrokerageAccountType getAccount_type_filter() {
        return this.account_type_filter;
    }

    public /* synthetic */ GetEligibleAccountsRequest(BrokerageAccountType brokerageAccountType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : brokerageAccountType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEligibleAccountsRequest(BrokerageAccountType brokerageAccountType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_type_filter = brokerageAccountType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28446newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetEligibleAccountsRequest)) {
            return false;
        }
        GetEligibleAccountsRequest getEligibleAccountsRequest = (GetEligibleAccountsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getEligibleAccountsRequest.unknownFields()) && this.account_type_filter == getEligibleAccountsRequest.account_type_filter;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BrokerageAccountType brokerageAccountType = this.account_type_filter;
        int iHashCode2 = iHashCode + (brokerageAccountType != null ? brokerageAccountType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        BrokerageAccountType brokerageAccountType = this.account_type_filter;
        if (brokerageAccountType != null) {
            arrayList.add("account_type_filter=" + brokerageAccountType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEligibleAccountsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetEligibleAccountsRequest copy$default(GetEligibleAccountsRequest getEligibleAccountsRequest, BrokerageAccountType brokerageAccountType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = getEligibleAccountsRequest.account_type_filter;
        }
        if ((i & 2) != 0) {
            byteString = getEligibleAccountsRequest.unknownFields();
        }
        return getEligibleAccountsRequest.copy(brokerageAccountType, byteString);
    }

    public final GetEligibleAccountsRequest copy(BrokerageAccountType account_type_filter, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetEligibleAccountsRequest(account_type_filter, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetEligibleAccountsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetEligibleAccountsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: internal_asset_transfers.proto.v1.GetEligibleAccountsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetEligibleAccountsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + BrokerageAccountType.ADAPTER.encodedSizeWithTag(1, value.getAccount_type_filter());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetEligibleAccountsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_type_filter());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetEligibleAccountsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_type_filter());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetEligibleAccountsRequest redact(GetEligibleAccountsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetEligibleAccountsRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetEligibleAccountsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BrokerageAccountType brokerageAccountTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetEligibleAccountsRequest(brokerageAccountTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
