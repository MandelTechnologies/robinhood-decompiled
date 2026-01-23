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

/* compiled from: GetPortfolioDigestFeedbackResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestFeedbackResponse;", "Lcom/squareup/wire/Message;", "", "digest_id", "", "feedback", "Lbonfire/proto/idl/copilot/v1/Feedback;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/copilot/v1/Feedback;Lokio/ByteString;)V", "getDigest_id", "()Ljava/lang/String;", "getFeedback", "()Lbonfire/proto/idl/copilot/v1/Feedback;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetPortfolioDigestFeedbackResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetPortfolioDigestFeedbackResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String digest_id;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.Feedback#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Feedback feedback;

    public GetPortfolioDigestFeedbackResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8864newBuilder();
    }

    public final String getDigest_id() {
        return this.digest_id;
    }

    public /* synthetic */ GetPortfolioDigestFeedbackResponse(String str, Feedback feedback, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : feedback, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Feedback getFeedback() {
        return this.feedback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPortfolioDigestFeedbackResponse(String digest_id, Feedback feedback, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.digest_id = digest_id;
        this.feedback = feedback;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8864newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetPortfolioDigestFeedbackResponse)) {
            return false;
        }
        GetPortfolioDigestFeedbackResponse getPortfolioDigestFeedbackResponse = (GetPortfolioDigestFeedbackResponse) other;
        return Intrinsics.areEqual(unknownFields(), getPortfolioDigestFeedbackResponse.unknownFields()) && Intrinsics.areEqual(this.digest_id, getPortfolioDigestFeedbackResponse.digest_id) && Intrinsics.areEqual(this.feedback, getPortfolioDigestFeedbackResponse.feedback);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.digest_id.hashCode()) * 37;
        Feedback feedback = this.feedback;
        int iHashCode2 = iHashCode + (feedback != null ? feedback.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("digest_id=" + Internal.sanitize(this.digest_id));
        Feedback feedback = this.feedback;
        if (feedback != null) {
            arrayList.add("feedback=" + feedback);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPortfolioDigestFeedbackResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetPortfolioDigestFeedbackResponse copy$default(GetPortfolioDigestFeedbackResponse getPortfolioDigestFeedbackResponse, String str, Feedback feedback, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPortfolioDigestFeedbackResponse.digest_id;
        }
        if ((i & 2) != 0) {
            feedback = getPortfolioDigestFeedbackResponse.feedback;
        }
        if ((i & 4) != 0) {
            byteString = getPortfolioDigestFeedbackResponse.unknownFields();
        }
        return getPortfolioDigestFeedbackResponse.copy(str, feedback, byteString);
    }

    public final GetPortfolioDigestFeedbackResponse copy(String digest_id, Feedback feedback, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetPortfolioDigestFeedbackResponse(digest_id, feedback, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetPortfolioDigestFeedbackResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetPortfolioDigestFeedbackResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.GetPortfolioDigestFeedbackResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetPortfolioDigestFeedbackResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDigest_id());
                }
                return value.getFeedback() != null ? size + Feedback.ADAPTER.encodedSizeWithTag(2, value.getFeedback()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetPortfolioDigestFeedbackResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
                }
                if (value.getFeedback() != null) {
                    Feedback.ADAPTER.encodeWithTag(writer, 2, (int) value.getFeedback());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetPortfolioDigestFeedbackResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFeedback() != null) {
                    Feedback.ADAPTER.encodeWithTag(writer, 2, (int) value.getFeedback());
                }
                if (Intrinsics.areEqual(value.getDigest_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPortfolioDigestFeedbackResponse redact(GetPortfolioDigestFeedbackResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Feedback feedback = value.getFeedback();
                return GetPortfolioDigestFeedbackResponse.copy$default(value, null, feedback != null ? Feedback.ADAPTER.redact(feedback) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetPortfolioDigestFeedbackResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Feedback feedbackDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetPortfolioDigestFeedbackResponse(strDecode, feedbackDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        feedbackDecode = Feedback.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
