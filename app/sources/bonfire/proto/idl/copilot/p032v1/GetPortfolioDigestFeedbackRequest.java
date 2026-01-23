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

/* compiled from: GetPortfolioDigestFeedbackRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB-\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestFeedbackRequest;", "Lcom/squareup/wire/Message;", "", "", "digest_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "generation_timestamp", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lokio/ByteString;)Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestFeedbackRequest;", "Ljava/lang/String;", "getDigest_id", "Lj$/time/Instant;", "getGeneration_timestamp", "()Lj$/time/Instant;", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetPortfolioDigestFeedbackRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetPortfolioDigestFeedbackRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String digest_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "generationTimestamp", schemaIndex = 1, tag = 2)
    private final Instant generation_timestamp;

    public GetPortfolioDigestFeedbackRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8862newBuilder();
    }

    public final String getDigest_id() {
        return this.digest_id;
    }

    public /* synthetic */ GetPortfolioDigestFeedbackRequest(String str, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getGeneration_timestamp() {
        return this.generation_timestamp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPortfolioDigestFeedbackRequest(String digest_id, Instant instant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.digest_id = digest_id;
        this.generation_timestamp = instant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8862newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetPortfolioDigestFeedbackRequest)) {
            return false;
        }
        GetPortfolioDigestFeedbackRequest getPortfolioDigestFeedbackRequest = (GetPortfolioDigestFeedbackRequest) other;
        return Intrinsics.areEqual(unknownFields(), getPortfolioDigestFeedbackRequest.unknownFields()) && Intrinsics.areEqual(this.digest_id, getPortfolioDigestFeedbackRequest.digest_id) && Intrinsics.areEqual(this.generation_timestamp, getPortfolioDigestFeedbackRequest.generation_timestamp);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.digest_id.hashCode()) * 37;
        Instant instant = this.generation_timestamp;
        int iHashCode2 = iHashCode + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("digest_id=" + Internal.sanitize(this.digest_id));
        Instant instant = this.generation_timestamp;
        if (instant != null) {
            arrayList.add("generation_timestamp=" + instant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPortfolioDigestFeedbackRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetPortfolioDigestFeedbackRequest copy$default(GetPortfolioDigestFeedbackRequest getPortfolioDigestFeedbackRequest, String str, Instant instant, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPortfolioDigestFeedbackRequest.digest_id;
        }
        if ((i & 2) != 0) {
            instant = getPortfolioDigestFeedbackRequest.generation_timestamp;
        }
        if ((i & 4) != 0) {
            byteString = getPortfolioDigestFeedbackRequest.unknownFields();
        }
        return getPortfolioDigestFeedbackRequest.copy(str, instant, byteString);
    }

    public final GetPortfolioDigestFeedbackRequest copy(String digest_id, Instant generation_timestamp, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetPortfolioDigestFeedbackRequest(digest_id, generation_timestamp, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetPortfolioDigestFeedbackRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetPortfolioDigestFeedbackRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.GetPortfolioDigestFeedbackRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetPortfolioDigestFeedbackRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDigest_id());
                }
                return size + ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getGeneration_timestamp());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetPortfolioDigestFeedbackRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
                }
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getGeneration_timestamp());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetPortfolioDigestFeedbackRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getGeneration_timestamp());
                if (Intrinsics.areEqual(value.getDigest_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPortfolioDigestFeedbackRequest redact(GetPortfolioDigestFeedbackRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant generation_timestamp = value.getGeneration_timestamp();
                return GetPortfolioDigestFeedbackRequest.copy$default(value, null, generation_timestamp != null ? ProtoAdapter.INSTANT.redact(generation_timestamp) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetPortfolioDigestFeedbackRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetPortfolioDigestFeedbackRequest(strDecode, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
