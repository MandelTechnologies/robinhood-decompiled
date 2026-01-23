package contracts.crypto.quote.proto.p429v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import contracts.crypto.trade.proto.p431v1.UserInputs;
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

/* compiled from: StreamCryptoQuoteRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/quote/proto/v1/StreamCryptoQuoteRequest;", "Lcom/squareup/wire/Message;", "", "currency_pair_id", "", "user_inputs", "Lcontracts/crypto/trade/proto/v1/UserInputs;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcontracts/crypto/trade/proto/v1/UserInputs;Lokio/ByteString;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "getUser_inputs", "()Lcontracts/crypto/trade/proto/v1/UserInputs;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.quote.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamCryptoQuoteRequest extends Message {

    @JvmField
    public static final ProtoAdapter<StreamCryptoQuoteRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_pair_id;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.UserInputs#ADAPTER", jsonName = "userInputs", schemaIndex = 1, tag = 2)
    private final UserInputs user_inputs;

    public StreamCryptoQuoteRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27638newBuilder();
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public /* synthetic */ StreamCryptoQuoteRequest(String str, UserInputs userInputs, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : userInputs, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final UserInputs getUser_inputs() {
        return this.user_inputs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamCryptoQuoteRequest(String currency_pair_id, UserInputs userInputs, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_pair_id = currency_pair_id;
        this.user_inputs = userInputs;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27638newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamCryptoQuoteRequest)) {
            return false;
        }
        StreamCryptoQuoteRequest streamCryptoQuoteRequest = (StreamCryptoQuoteRequest) other;
        return Intrinsics.areEqual(unknownFields(), streamCryptoQuoteRequest.unknownFields()) && Intrinsics.areEqual(this.currency_pair_id, streamCryptoQuoteRequest.currency_pair_id) && Intrinsics.areEqual(this.user_inputs, streamCryptoQuoteRequest.user_inputs);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.currency_pair_id.hashCode()) * 37;
        UserInputs userInputs = this.user_inputs;
        int iHashCode2 = iHashCode + (userInputs != null ? userInputs.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        UserInputs userInputs = this.user_inputs;
        if (userInputs != null) {
            arrayList.add("user_inputs=" + userInputs);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamCryptoQuoteRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamCryptoQuoteRequest copy$default(StreamCryptoQuoteRequest streamCryptoQuoteRequest, String str, UserInputs userInputs, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamCryptoQuoteRequest.currency_pair_id;
        }
        if ((i & 2) != 0) {
            userInputs = streamCryptoQuoteRequest.user_inputs;
        }
        if ((i & 4) != 0) {
            byteString = streamCryptoQuoteRequest.unknownFields();
        }
        return streamCryptoQuoteRequest.copy(str, userInputs, byteString);
    }

    public final StreamCryptoQuoteRequest copy(String currency_pair_id, UserInputs user_inputs, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamCryptoQuoteRequest(currency_pair_id, user_inputs, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamCryptoQuoteRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamCryptoQuoteRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.quote.proto.v1.StreamCryptoQuoteRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamCryptoQuoteRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_pair_id());
                }
                return size + UserInputs.ADAPTER.encodedSizeWithTag(2, value.getUser_inputs());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamCryptoQuoteRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                }
                UserInputs.ADAPTER.encodeWithTag(writer, 2, (int) value.getUser_inputs());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamCryptoQuoteRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                UserInputs.ADAPTER.encodeWithTag(writer, 2, (int) value.getUser_inputs());
                if (Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoQuoteRequest redact(StreamCryptoQuoteRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UserInputs user_inputs = value.getUser_inputs();
                return StreamCryptoQuoteRequest.copy$default(value, null, user_inputs != null ? UserInputs.ADAPTER.redact(user_inputs) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoQuoteRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                UserInputs userInputsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamCryptoQuoteRequest(strDecode, userInputsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        userInputsDecode = UserInputs.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
