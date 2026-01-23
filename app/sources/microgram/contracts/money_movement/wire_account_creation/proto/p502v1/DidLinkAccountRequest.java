package microgram.contracts.money_movement.wire_account_creation.proto.p502v1;

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

/* compiled from: DidLinkAccountRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/DidLinkAccountRequest;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "recipient_type", "Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/RecipientType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/RecipientType;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getRecipient_type", "()Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/RecipientType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.money_movement.wire_account_creation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DidLinkAccountRequest extends Message {

    @JvmField
    public static final ProtoAdapter<DidLinkAccountRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "microgram.contracts.money_movement.wire_account_creation.proto.v1.RecipientType#ADAPTER", jsonName = "recipientType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final RecipientType recipient_type;

    public DidLinkAccountRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29210newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public /* synthetic */ DidLinkAccountRequest(String str, RecipientType recipientType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? RecipientType.RECIPIENT_TYPE_UNSPECIFIED : recipientType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final RecipientType getRecipient_type() {
        return this.recipient_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DidLinkAccountRequest(String instrument_id, RecipientType recipient_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(recipient_type, "recipient_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.recipient_type = recipient_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29210newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DidLinkAccountRequest)) {
            return false;
        }
        DidLinkAccountRequest didLinkAccountRequest = (DidLinkAccountRequest) other;
        return Intrinsics.areEqual(unknownFields(), didLinkAccountRequest.unknownFields()) && Intrinsics.areEqual(this.instrument_id, didLinkAccountRequest.instrument_id) && this.recipient_type == didLinkAccountRequest.recipient_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.recipient_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("recipient_type=" + this.recipient_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DidLinkAccountRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DidLinkAccountRequest copy$default(DidLinkAccountRequest didLinkAccountRequest, String str, RecipientType recipientType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = didLinkAccountRequest.instrument_id;
        }
        if ((i & 2) != 0) {
            recipientType = didLinkAccountRequest.recipient_type;
        }
        if ((i & 4) != 0) {
            byteString = didLinkAccountRequest.unknownFields();
        }
        return didLinkAccountRequest.copy(str, recipientType, byteString);
    }

    public final DidLinkAccountRequest copy(String instrument_id, RecipientType recipient_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(recipient_type, "recipient_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DidLinkAccountRequest(instrument_id, recipient_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DidLinkAccountRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DidLinkAccountRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.money_movement.wire_account_creation.proto.v1.DidLinkAccountRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DidLinkAccountRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                return value.getRecipient_type() != RecipientType.RECIPIENT_TYPE_UNSPECIFIED ? size + RecipientType.ADAPTER.encodedSizeWithTag(2, value.getRecipient_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DidLinkAccountRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (value.getRecipient_type() != RecipientType.RECIPIENT_TYPE_UNSPECIFIED) {
                    RecipientType.ADAPTER.encodeWithTag(writer, 2, (int) value.getRecipient_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DidLinkAccountRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRecipient_type() != RecipientType.RECIPIENT_TYPE_UNSPECIFIED) {
                    RecipientType.ADAPTER.encodeWithTag(writer, 2, (int) value.getRecipient_type());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DidLinkAccountRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                RecipientType recipientTypeDecode = RecipientType.RECIPIENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DidLinkAccountRequest(strDecode, recipientTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            recipientTypeDecode = RecipientType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DidLinkAccountRequest redact(DidLinkAccountRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DidLinkAccountRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
