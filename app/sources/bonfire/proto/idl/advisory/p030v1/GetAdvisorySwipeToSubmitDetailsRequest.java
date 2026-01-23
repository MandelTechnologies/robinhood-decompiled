package bonfire.proto.idl.advisory.p030v1;

import bonfire.proto.idl.transfers.p040v1.TransferAccountType;
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

/* compiled from: GetAdvisorySwipeToSubmitDetailsRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+BM\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010\u001bR \u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequest;", "Lcom/squareup/wire/Message;", "", "", "account_number", "transfer_amount_display_string", "source_account_display_name", "transfer_account_type", "Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContext;", "context", "Lbonfire/proto/idl/transfers/v1/TransferAccountType;", "source_transfer_account_type", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContext;Lbonfire/proto/idl/transfers/v1/TransferAccountType;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContext;Lbonfire/proto/idl/transfers/v1/TransferAccountType;Lokio/ByteString;)Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequest;", "Ljava/lang/String;", "getAccount_number", "getTransfer_amount_display_string", "getSource_account_display_name", "getTransfer_account_type", "getTransfer_account_type$annotations", "()V", "Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContext;", "getContext", "()Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContext;", "Lbonfire/proto/idl/transfers/v1/TransferAccountType;", "getSource_transfer_account_type", "()Lbonfire/proto/idl/transfers/v1/TransferAccountType;", "Companion", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetAdvisorySwipeToSubmitDetailsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetAdvisorySwipeToSubmitDetailsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "bonfire.proto.idl.advisory.v1.SwipeToSubmitDetailsContext#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final SwipeToSubmitDetailsContext context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceAccountDisplayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String source_account_display_name;

    @WireField(adapter = "bonfire.proto.idl.transfers.v1.TransferAccountType#ADAPTER", jsonName = "sourceTransferAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final TransferAccountType source_transfer_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transferAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String transfer_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transferAmountDisplayString", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String transfer_amount_display_string;

    public GetAdvisorySwipeToSubmitDetailsRequest() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ GetAdvisorySwipeToSubmitDetailsRequest(String str, String str2, String str3, String str4, SwipeToSubmitDetailsContext swipeToSubmitDetailsContext, TransferAccountType transferAccountType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? SwipeToSubmitDetailsContext.CONTEXT_UNSPECIFIED : swipeToSubmitDetailsContext, (i & 32) != 0 ? TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED : transferAccountType, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8795newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getTransfer_amount_display_string() {
        return this.transfer_amount_display_string;
    }

    public final String getSource_account_display_name() {
        return this.source_account_display_name;
    }

    public final String getTransfer_account_type() {
        return this.transfer_account_type;
    }

    public final SwipeToSubmitDetailsContext getContext() {
        return this.context;
    }

    public final TransferAccountType getSource_transfer_account_type() {
        return this.source_transfer_account_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAdvisorySwipeToSubmitDetailsRequest(String account_number, String transfer_amount_display_string, String source_account_display_name, String transfer_account_type, SwipeToSubmitDetailsContext context, TransferAccountType source_transfer_account_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(transfer_amount_display_string, "transfer_amount_display_string");
        Intrinsics.checkNotNullParameter(source_account_display_name, "source_account_display_name");
        Intrinsics.checkNotNullParameter(transfer_account_type, "transfer_account_type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source_transfer_account_type, "source_transfer_account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.transfer_amount_display_string = transfer_amount_display_string;
        this.source_account_display_name = source_account_display_name;
        this.transfer_account_type = transfer_account_type;
        this.context = context;
        this.source_transfer_account_type = source_transfer_account_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8795newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAdvisorySwipeToSubmitDetailsRequest)) {
            return false;
        }
        GetAdvisorySwipeToSubmitDetailsRequest getAdvisorySwipeToSubmitDetailsRequest = (GetAdvisorySwipeToSubmitDetailsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getAdvisorySwipeToSubmitDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, getAdvisorySwipeToSubmitDetailsRequest.account_number) && Intrinsics.areEqual(this.transfer_amount_display_string, getAdvisorySwipeToSubmitDetailsRequest.transfer_amount_display_string) && Intrinsics.areEqual(this.source_account_display_name, getAdvisorySwipeToSubmitDetailsRequest.source_account_display_name) && Intrinsics.areEqual(this.transfer_account_type, getAdvisorySwipeToSubmitDetailsRequest.transfer_account_type) && this.context == getAdvisorySwipeToSubmitDetailsRequest.context && this.source_transfer_account_type == getAdvisorySwipeToSubmitDetailsRequest.source_transfer_account_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.transfer_amount_display_string.hashCode()) * 37) + this.source_account_display_name.hashCode()) * 37) + this.transfer_account_type.hashCode()) * 37) + this.context.hashCode()) * 37) + this.source_transfer_account_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("transfer_amount_display_string=" + Internal.sanitize(this.transfer_amount_display_string));
        arrayList.add("source_account_display_name=" + Internal.sanitize(this.source_account_display_name));
        arrayList.add("transfer_account_type=" + Internal.sanitize(this.transfer_account_type));
        arrayList.add("context=" + this.context);
        arrayList.add("source_transfer_account_type=" + this.source_transfer_account_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAdvisorySwipeToSubmitDetailsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAdvisorySwipeToSubmitDetailsRequest copy$default(GetAdvisorySwipeToSubmitDetailsRequest getAdvisorySwipeToSubmitDetailsRequest, String str, String str2, String str3, String str4, SwipeToSubmitDetailsContext swipeToSubmitDetailsContext, TransferAccountType transferAccountType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAdvisorySwipeToSubmitDetailsRequest.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getAdvisorySwipeToSubmitDetailsRequest.transfer_amount_display_string;
        }
        if ((i & 4) != 0) {
            str3 = getAdvisorySwipeToSubmitDetailsRequest.source_account_display_name;
        }
        if ((i & 8) != 0) {
            str4 = getAdvisorySwipeToSubmitDetailsRequest.transfer_account_type;
        }
        if ((i & 16) != 0) {
            swipeToSubmitDetailsContext = getAdvisorySwipeToSubmitDetailsRequest.context;
        }
        if ((i & 32) != 0) {
            transferAccountType = getAdvisorySwipeToSubmitDetailsRequest.source_transfer_account_type;
        }
        if ((i & 64) != 0) {
            byteString = getAdvisorySwipeToSubmitDetailsRequest.unknownFields();
        }
        TransferAccountType transferAccountType2 = transferAccountType;
        ByteString byteString2 = byteString;
        SwipeToSubmitDetailsContext swipeToSubmitDetailsContext2 = swipeToSubmitDetailsContext;
        String str5 = str3;
        return getAdvisorySwipeToSubmitDetailsRequest.copy(str, str2, str5, str4, swipeToSubmitDetailsContext2, transferAccountType2, byteString2);
    }

    public final GetAdvisorySwipeToSubmitDetailsRequest copy(String account_number, String transfer_amount_display_string, String source_account_display_name, String transfer_account_type, SwipeToSubmitDetailsContext context, TransferAccountType source_transfer_account_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(transfer_amount_display_string, "transfer_amount_display_string");
        Intrinsics.checkNotNullParameter(source_account_display_name, "source_account_display_name");
        Intrinsics.checkNotNullParameter(transfer_account_type, "transfer_account_type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source_transfer_account_type, "source_transfer_account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAdvisorySwipeToSubmitDetailsRequest(account_number, transfer_amount_display_string, source_account_display_name, transfer_account_type, context, source_transfer_account_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAdvisorySwipeToSubmitDetailsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAdvisorySwipeToSubmitDetailsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisory.v1.GetAdvisorySwipeToSubmitDetailsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAdvisorySwipeToSubmitDetailsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTransfer_amount_display_string(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTransfer_amount_display_string());
                }
                if (!Intrinsics.areEqual(value.getSource_account_display_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSource_account_display_name());
                }
                if (!Intrinsics.areEqual(value.getTransfer_account_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTransfer_account_type());
                }
                if (value.getContext() != SwipeToSubmitDetailsContext.CONTEXT_UNSPECIFIED) {
                    size += SwipeToSubmitDetailsContext.ADAPTER.encodedSizeWithTag(5, value.getContext());
                }
                return value.getSource_transfer_account_type() != TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED ? size + TransferAccountType.ADAPTER.encodedSizeWithTag(6, value.getSource_transfer_account_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAdvisorySwipeToSubmitDetailsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTransfer_amount_display_string(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTransfer_amount_display_string());
                }
                if (!Intrinsics.areEqual(value.getSource_account_display_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSource_account_display_name());
                }
                if (!Intrinsics.areEqual(value.getTransfer_account_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTransfer_account_type());
                }
                if (value.getContext() != SwipeToSubmitDetailsContext.CONTEXT_UNSPECIFIED) {
                    SwipeToSubmitDetailsContext.ADAPTER.encodeWithTag(writer, 5, (int) value.getContext());
                }
                if (value.getSource_transfer_account_type() != TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED) {
                    TransferAccountType.ADAPTER.encodeWithTag(writer, 6, (int) value.getSource_transfer_account_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAdvisorySwipeToSubmitDetailsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSource_transfer_account_type() != TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED) {
                    TransferAccountType.ADAPTER.encodeWithTag(writer, 6, (int) value.getSource_transfer_account_type());
                }
                if (value.getContext() != SwipeToSubmitDetailsContext.CONTEXT_UNSPECIFIED) {
                    SwipeToSubmitDetailsContext.ADAPTER.encodeWithTag(writer, 5, (int) value.getContext());
                }
                if (!Intrinsics.areEqual(value.getTransfer_account_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTransfer_account_type());
                }
                if (!Intrinsics.areEqual(value.getSource_account_display_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSource_account_display_name());
                }
                if (!Intrinsics.areEqual(value.getTransfer_amount_display_string(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTransfer_amount_display_string());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAdvisorySwipeToSubmitDetailsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SwipeToSubmitDetailsContext swipeToSubmitDetailsContextDecode = SwipeToSubmitDetailsContext.CONTEXT_UNSPECIFIED;
                TransferAccountType transferAccountType = TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                TransferAccountType transferAccountTypeDecode = transferAccountType;
                while (true) {
                    SwipeToSubmitDetailsContext swipeToSubmitDetailsContext = swipeToSubmitDetailsContextDecode;
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
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        swipeToSubmitDetailsContextDecode = SwipeToSubmitDetailsContext.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 6:
                                    try {
                                        transferAccountTypeDecode = TransferAccountType.ADAPTER.decode(reader);
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
                            return new GetAdvisorySwipeToSubmitDetailsRequest(strDecode, strDecode2, strDecode3, strDecode4, swipeToSubmitDetailsContext, transferAccountTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAdvisorySwipeToSubmitDetailsRequest redact(GetAdvisorySwipeToSubmitDetailsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAdvisorySwipeToSubmitDetailsRequest.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
