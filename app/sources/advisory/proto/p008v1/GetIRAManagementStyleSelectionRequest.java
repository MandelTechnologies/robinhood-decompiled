package advisory.proto.p008v1;

import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
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

/* compiled from: GetIRAManagementStyleSelectionRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Ladvisory/proto/v1/GetIRAManagementStyleSelectionRequest;", "Lcom/squareup/wire/Message;", "", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/BrokerageAccountType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/account/BrokerageAccountType;Lokio/ByteString;)V", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetIRAManagementStyleSelectionRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetIRAManagementStyleSelectionRequest> ADAPTER;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "brokerageAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BrokerageAccountType brokerage_account_type;

    /* JADX WARN: Multi-variable type inference failed */
    public GetIRAManagementStyleSelectionRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4453newBuilder();
    }

    public final BrokerageAccountType getBrokerage_account_type() {
        return this.brokerage_account_type;
    }

    public /* synthetic */ GetIRAManagementStyleSelectionRequest(BrokerageAccountType brokerageAccountType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetIRAManagementStyleSelectionRequest(BrokerageAccountType brokerage_account_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.brokerage_account_type = brokerage_account_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4453newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetIRAManagementStyleSelectionRequest)) {
            return false;
        }
        GetIRAManagementStyleSelectionRequest getIRAManagementStyleSelectionRequest = (GetIRAManagementStyleSelectionRequest) other;
        return Intrinsics.areEqual(unknownFields(), getIRAManagementStyleSelectionRequest.unknownFields()) && this.brokerage_account_type == getIRAManagementStyleSelectionRequest.brokerage_account_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.brokerage_account_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("brokerage_account_type=" + this.brokerage_account_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetIRAManagementStyleSelectionRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetIRAManagementStyleSelectionRequest copy$default(GetIRAManagementStyleSelectionRequest getIRAManagementStyleSelectionRequest, BrokerageAccountType brokerageAccountType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = getIRAManagementStyleSelectionRequest.brokerage_account_type;
        }
        if ((i & 2) != 0) {
            byteString = getIRAManagementStyleSelectionRequest.unknownFields();
        }
        return getIRAManagementStyleSelectionRequest.copy(brokerageAccountType, byteString);
    }

    public final GetIRAManagementStyleSelectionRequest copy(BrokerageAccountType brokerage_account_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetIRAManagementStyleSelectionRequest(brokerage_account_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetIRAManagementStyleSelectionRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetIRAManagementStyleSelectionRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetIRAManagementStyleSelectionRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetIRAManagementStyleSelectionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED ? size + BrokerageAccountType.ADAPTER.encodedSizeWithTag(1, value.getBrokerage_account_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetIRAManagementStyleSelectionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBrokerage_account_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetIRAManagementStyleSelectionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBrokerage_account_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetIRAManagementStyleSelectionRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BrokerageAccountType brokerageAccountTypeDecode = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetIRAManagementStyleSelectionRequest(brokerageAccountTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
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

            @Override // com.squareup.wire.ProtoAdapter
            public GetIRAManagementStyleSelectionRequest redact(GetIRAManagementStyleSelectionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetIRAManagementStyleSelectionRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
