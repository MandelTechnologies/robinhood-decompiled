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

/* compiled from: GetInvestorProfileConfirmationResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetInvestorProfileConfirmationResponse;", "Lcom/squareup/wire/Message;", "", "question", "Linternal_asset_transfers/proto/v1/Question;", "unknownFields", "Lokio/ByteString;", "<init>", "(Linternal_asset_transfers/proto/v1/Question;Lokio/ByteString;)V", "getQuestion", "()Linternal_asset_transfers/proto/v1/Question;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetInvestorProfileConfirmationResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetInvestorProfileConfirmationResponse> ADAPTER;

    @WireField(adapter = "internal_asset_transfers.proto.v1.Question#ADAPTER", schemaIndex = 0, tag = 1)
    private final Question question;

    /* JADX WARN: Multi-variable type inference failed */
    public GetInvestorProfileConfirmationResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28452newBuilder();
    }

    public final Question getQuestion() {
        return this.question;
    }

    public /* synthetic */ GetInvestorProfileConfirmationResponse(Question question, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : question, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInvestorProfileConfirmationResponse(Question question, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.question = question;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28452newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetInvestorProfileConfirmationResponse)) {
            return false;
        }
        GetInvestorProfileConfirmationResponse getInvestorProfileConfirmationResponse = (GetInvestorProfileConfirmationResponse) other;
        return Intrinsics.areEqual(unknownFields(), getInvestorProfileConfirmationResponse.unknownFields()) && Intrinsics.areEqual(this.question, getInvestorProfileConfirmationResponse.question);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Question question = this.question;
        int iHashCode2 = iHashCode + (question != null ? question.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Question question = this.question;
        if (question != null) {
            arrayList.add("question=" + question);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInvestorProfileConfirmationResponse{", "}", 0, null, null, 56, null);
    }

    public final GetInvestorProfileConfirmationResponse copy(Question question, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetInvestorProfileConfirmationResponse(question, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetInvestorProfileConfirmationResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetInvestorProfileConfirmationResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: internal_asset_transfers.proto.v1.GetInvestorProfileConfirmationResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetInvestorProfileConfirmationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + Question.ADAPTER.encodedSizeWithTag(1, value.getQuestion());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetInvestorProfileConfirmationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Question.ADAPTER.encodeWithTag(writer, 1, (int) value.getQuestion());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetInvestorProfileConfirmationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Question.ADAPTER.encodeWithTag(writer, 1, (int) value.getQuestion());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetInvestorProfileConfirmationResponse redact(GetInvestorProfileConfirmationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Question question = value.getQuestion();
                return value.copy(question != null ? Question.ADAPTER.redact(question) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetInvestorProfileConfirmationResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Question questionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetInvestorProfileConfirmationResponse(questionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        questionDecode = Question.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
