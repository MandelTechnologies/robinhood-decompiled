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

/* compiled from: Question.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/Question;", "Lcom/squareup/wire/Message;", "", "product_context", "", "key", "rhf_account_number", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getProduct_context", "()Ljava/lang/String;", "getKey", "getRhf_account_number", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Question extends Message {

    @JvmField
    public static final ProtoAdapter<Question> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "productContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String product_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhfAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String rhf_account_number;

    public Question() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ Question(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28460newBuilder();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Question(String product_context, String key, String rhf_account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(product_context, "product_context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.product_context = product_context;
        this.key = key;
        this.rhf_account_number = rhf_account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28460newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Question)) {
            return false;
        }
        Question question = (Question) other;
        return Intrinsics.areEqual(unknownFields(), question.unknownFields()) && Intrinsics.areEqual(this.product_context, question.product_context) && Intrinsics.areEqual(this.key, question.key) && Intrinsics.areEqual(this.rhf_account_number, question.rhf_account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.product_context.hashCode()) * 37) + this.key.hashCode()) * 37) + this.rhf_account_number.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("product_context=" + Internal.sanitize(this.product_context));
        arrayList.add("key=" + Internal.sanitize(this.key));
        arrayList.add("rhf_account_number=" + Internal.sanitize(this.rhf_account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Question{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Question copy$default(Question question, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = question.product_context;
        }
        if ((i & 2) != 0) {
            str2 = question.key;
        }
        if ((i & 4) != 0) {
            str3 = question.rhf_account_number;
        }
        if ((i & 8) != 0) {
            byteString = question.unknownFields();
        }
        return question.copy(str, str2, str3, byteString);
    }

    public final Question copy(String product_context, String key, String rhf_account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(product_context, "product_context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Question(product_context, key, rhf_account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Question.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Question>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: internal_asset_transfers.proto.v1.Question$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Question value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getProduct_context(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getProduct_context());
                }
                if (!Intrinsics.areEqual(value.getKey(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getKey());
                }
                return !Intrinsics.areEqual(value.getRhf_account_number(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRhf_account_number()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Question value) throws IOException {
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
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Question value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
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
            public Question redact(Question value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Question.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Question decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Question(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
