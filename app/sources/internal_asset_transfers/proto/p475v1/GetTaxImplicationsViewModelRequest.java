package internal_asset_transfers.proto.p475v1;

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

/* compiled from: GetTaxImplicationsViewModelRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequest;", "Lcom/squareup/wire/Message;", "", "product_context", "", "key", "rhf_account_number", "answer", "Linternal_asset_transfers/proto/v1/Answer;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Linternal_asset_transfers/proto/v1/Answer;Lokio/ByteString;)V", "getProduct_context", "()Ljava/lang/String;", "getKey", "getRhf_account_number", "getAnswer", "()Linternal_asset_transfers/proto/v1/Answer;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetTaxImplicationsViewModelRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetTaxImplicationsViewModelRequest> ADAPTER;

    @WireField(adapter = "internal_asset_transfers.proto.v1.Answer#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Answer answer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "productContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String product_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhfAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String rhf_account_number;

    public GetTaxImplicationsViewModelRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ GetTaxImplicationsViewModelRequest(String str, String str2, String str3, Answer answer, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : answer, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28453newBuilder();
    }

    public final String getProduct_context() {
        return this.product_context;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getRhf_account_number() {
        return this.rhf_account_number;
    }

    public final Answer getAnswer() {
        return this.answer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTaxImplicationsViewModelRequest(String product_context, String key, String rhf_account_number, Answer answer, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(product_context, "product_context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.product_context = product_context;
        this.key = key;
        this.rhf_account_number = rhf_account_number;
        this.answer = answer;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28453newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTaxImplicationsViewModelRequest)) {
            return false;
        }
        GetTaxImplicationsViewModelRequest getTaxImplicationsViewModelRequest = (GetTaxImplicationsViewModelRequest) other;
        return Intrinsics.areEqual(unknownFields(), getTaxImplicationsViewModelRequest.unknownFields()) && Intrinsics.areEqual(this.product_context, getTaxImplicationsViewModelRequest.product_context) && Intrinsics.areEqual(this.key, getTaxImplicationsViewModelRequest.key) && Intrinsics.areEqual(this.rhf_account_number, getTaxImplicationsViewModelRequest.rhf_account_number) && Intrinsics.areEqual(this.answer, getTaxImplicationsViewModelRequest.answer);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.product_context.hashCode()) * 37) + this.key.hashCode()) * 37) + this.rhf_account_number.hashCode()) * 37;
        Answer answer = this.answer;
        int iHashCode2 = iHashCode + (answer != null ? answer.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("product_context=" + Internal.sanitize(this.product_context));
        arrayList.add("key=" + Internal.sanitize(this.key));
        arrayList.add("rhf_account_number=" + Internal.sanitize(this.rhf_account_number));
        Answer answer = this.answer;
        if (answer != null) {
            arrayList.add("answer=" + answer);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTaxImplicationsViewModelRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetTaxImplicationsViewModelRequest copy$default(GetTaxImplicationsViewModelRequest getTaxImplicationsViewModelRequest, String str, String str2, String str3, Answer answer, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getTaxImplicationsViewModelRequest.product_context;
        }
        if ((i & 2) != 0) {
            str2 = getTaxImplicationsViewModelRequest.key;
        }
        if ((i & 4) != 0) {
            str3 = getTaxImplicationsViewModelRequest.rhf_account_number;
        }
        if ((i & 8) != 0) {
            answer = getTaxImplicationsViewModelRequest.answer;
        }
        if ((i & 16) != 0) {
            byteString = getTaxImplicationsViewModelRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return getTaxImplicationsViewModelRequest.copy(str, str2, str4, answer, byteString2);
    }

    public final GetTaxImplicationsViewModelRequest copy(String product_context, String key, String rhf_account_number, Answer answer, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(product_context, "product_context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTaxImplicationsViewModelRequest(product_context, key, rhf_account_number, answer, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTaxImplicationsViewModelRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTaxImplicationsViewModelRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: internal_asset_transfers.proto.v1.GetTaxImplicationsViewModelRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTaxImplicationsViewModelRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getProduct_context(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getProduct_context());
                }
                if (!Intrinsics.areEqual(value.getKey(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getKey());
                }
                if (!Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRhf_account_number());
                }
                return value.getAnswer() != null ? size + Answer.ADAPTER.encodedSizeWithTag(4, value.getAnswer()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTaxImplicationsViewModelRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getProduct_context(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getProduct_context());
                }
                if (!Intrinsics.areEqual(value.getKey(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getKey());
                }
                if (!Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRhf_account_number());
                }
                if (value.getAnswer() != null) {
                    Answer.ADAPTER.encodeWithTag(writer, 4, (int) value.getAnswer());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTaxImplicationsViewModelRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAnswer() != null) {
                    Answer.ADAPTER.encodeWithTag(writer, 4, (int) value.getAnswer());
                }
                if (!Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRhf_account_number());
                }
                if (!Intrinsics.areEqual(value.getKey(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getKey());
                }
                if (Intrinsics.areEqual(value.getProduct_context(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getProduct_context());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxImplicationsViewModelRequest redact(GetTaxImplicationsViewModelRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Answer answer = value.getAnswer();
                return GetTaxImplicationsViewModelRequest.copy$default(value, null, null, null, answer != null ? Answer.ADAPTER.redact(answer) : null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxImplicationsViewModelRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                Answer answerDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTaxImplicationsViewModelRequest(strDecode, strDecode3, strDecode2, answerDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        answerDecode = Answer.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
