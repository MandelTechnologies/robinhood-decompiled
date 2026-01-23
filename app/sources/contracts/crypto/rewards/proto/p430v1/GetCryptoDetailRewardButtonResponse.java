package contracts.crypto.rewards.proto.p430v1;

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
import rh_server_driven_ui.p531v1.Button;

/* compiled from: GetCryptoDetailRewardButtonResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonResponse;", "Lcom/squareup/wire/Message;", "", "currency_pair_id", "", "button", "Lrh_server_driven_ui/v1/Button;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/Button;Lokio/ByteString;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "getButton", "()Lrh_server_driven_ui/v1/Button;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.rewards.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetCryptoDetailRewardButtonResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoDetailRewardButtonResponse> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Button#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Button button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_pair_id;

    public GetCryptoDetailRewardButtonResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27641newBuilder();
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public /* synthetic */ GetCryptoDetailRewardButtonResponse(String str, Button button, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : button, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Button getButton() {
        return this.button;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoDetailRewardButtonResponse(String currency_pair_id, Button button, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_pair_id = currency_pair_id;
        this.button = button;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27641newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoDetailRewardButtonResponse)) {
            return false;
        }
        GetCryptoDetailRewardButtonResponse getCryptoDetailRewardButtonResponse = (GetCryptoDetailRewardButtonResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoDetailRewardButtonResponse.unknownFields()) && Intrinsics.areEqual(this.currency_pair_id, getCryptoDetailRewardButtonResponse.currency_pair_id) && Intrinsics.areEqual(this.button, getCryptoDetailRewardButtonResponse.button);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.currency_pair_id.hashCode()) * 37;
        Button button = this.button;
        int iHashCode2 = iHashCode + (button != null ? button.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        Button button = this.button;
        if (button != null) {
            arrayList.add("button=" + button);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoDetailRewardButtonResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCryptoDetailRewardButtonResponse copy$default(GetCryptoDetailRewardButtonResponse getCryptoDetailRewardButtonResponse, String str, Button button, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCryptoDetailRewardButtonResponse.currency_pair_id;
        }
        if ((i & 2) != 0) {
            button = getCryptoDetailRewardButtonResponse.button;
        }
        if ((i & 4) != 0) {
            byteString = getCryptoDetailRewardButtonResponse.unknownFields();
        }
        return getCryptoDetailRewardButtonResponse.copy(str, button, byteString);
    }

    public final GetCryptoDetailRewardButtonResponse copy(String currency_pair_id, Button button, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoDetailRewardButtonResponse(currency_pair_id, button, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoDetailRewardButtonResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoDetailRewardButtonResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.rewards.proto.v1.GetCryptoDetailRewardButtonResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoDetailRewardButtonResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_pair_id());
                }
                return value.getButton() != null ? size + Button.ADAPTER.encodedSizeWithTag(2, value.getButton()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoDetailRewardButtonResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                }
                if (value.getButton() != null) {
                    Button.ADAPTER.encodeWithTag(writer, 2, (int) value.getButton());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoDetailRewardButtonResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getButton() != null) {
                    Button.ADAPTER.encodeWithTag(writer, 2, (int) value.getButton());
                }
                if (Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoDetailRewardButtonResponse redact(GetCryptoDetailRewardButtonResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Button button = value.getButton();
                return GetCryptoDetailRewardButtonResponse.copy$default(value, null, button != null ? Button.ADAPTER.redact(button) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoDetailRewardButtonResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Button buttonDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCryptoDetailRewardButtonResponse(strDecode, buttonDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        buttonDecode = Button.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
