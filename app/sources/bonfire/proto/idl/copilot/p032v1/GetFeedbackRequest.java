package bonfire.proto.idl.copilot.p032v1;

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
import p479j$.time.Instant;

/* compiled from: GetFeedbackRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetFeedbackRequest;", "Lcom/squareup/wire/Message;", "", "", "digest_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "feedback_timestamp", "Lbonfire/proto/idl/copilot/v1/InstrumentType;", "instrument_type", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentType;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentType;Lokio/ByteString;)Lbonfire/proto/idl/copilot/v1/GetFeedbackRequest;", "Ljava/lang/String;", "getDigest_id", "Lj$/time/Instant;", "getFeedback_timestamp", "()Lj$/time/Instant;", "Lbonfire/proto/idl/copilot/v1/InstrumentType;", "getInstrument_type", "()Lbonfire/proto/idl/copilot/v1/InstrumentType;", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetFeedbackRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetFeedbackRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String digest_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "feedbackTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant feedback_timestamp;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final InstrumentType instrument_type;

    public GetFeedbackRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8858newBuilder();
    }

    public final String getDigest_id() {
        return this.digest_id;
    }

    public /* synthetic */ GetFeedbackRequest(String str, Instant instant, InstrumentType instrumentType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getFeedback_timestamp() {
        return this.feedback_timestamp;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFeedbackRequest(String digest_id, Instant instant, InstrumentType instrument_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.digest_id = digest_id;
        this.feedback_timestamp = instant;
        this.instrument_type = instrument_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8858newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFeedbackRequest)) {
            return false;
        }
        GetFeedbackRequest getFeedbackRequest = (GetFeedbackRequest) other;
        return Intrinsics.areEqual(unknownFields(), getFeedbackRequest.unknownFields()) && Intrinsics.areEqual(this.digest_id, getFeedbackRequest.digest_id) && Intrinsics.areEqual(this.feedback_timestamp, getFeedbackRequest.feedback_timestamp) && this.instrument_type == getFeedbackRequest.instrument_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.digest_id.hashCode()) * 37;
        Instant instant = this.feedback_timestamp;
        int iHashCode2 = ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.instrument_type.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("digest_id=" + Internal.sanitize(this.digest_id));
        Instant instant = this.feedback_timestamp;
        if (instant != null) {
            arrayList.add("feedback_timestamp=" + instant);
        }
        arrayList.add("instrument_type=" + this.instrument_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFeedbackRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFeedbackRequest copy$default(GetFeedbackRequest getFeedbackRequest, String str, Instant instant, InstrumentType instrumentType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFeedbackRequest.digest_id;
        }
        if ((i & 2) != 0) {
            instant = getFeedbackRequest.feedback_timestamp;
        }
        if ((i & 4) != 0) {
            instrumentType = getFeedbackRequest.instrument_type;
        }
        if ((i & 8) != 0) {
            byteString = getFeedbackRequest.unknownFields();
        }
        return getFeedbackRequest.copy(str, instant, instrumentType, byteString);
    }

    public final GetFeedbackRequest copy(String digest_id, Instant feedback_timestamp, InstrumentType instrument_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFeedbackRequest(digest_id, feedback_timestamp, instrument_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFeedbackRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFeedbackRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.GetFeedbackRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFeedbackRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDigest_id());
                }
                if (value.getFeedback_timestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getFeedback_timestamp());
                }
                return value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED ? size + InstrumentType.ADAPTER.encodedSizeWithTag(3, value.getInstrument_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFeedbackRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
                }
                if (value.getFeedback_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getFeedback_timestamp());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstrument_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFeedbackRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstrument_type());
                }
                if (value.getFeedback_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getFeedback_timestamp());
                }
                if (Intrinsics.areEqual(value.getDigest_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFeedbackRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InstrumentType instrumentTypeDecode = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetFeedbackRequest(strDecode, instantDecode, instrumentTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFeedbackRequest redact(GetFeedbackRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant feedback_timestamp = value.getFeedback_timestamp();
                return GetFeedbackRequest.copy$default(value, null, feedback_timestamp != null ? ProtoAdapter.INSTANT.redact(feedback_timestamp) : null, null, ByteString.EMPTY, 5, null);
            }
        };
    }
}
