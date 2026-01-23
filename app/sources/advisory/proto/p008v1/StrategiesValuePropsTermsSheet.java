package advisory.proto.p008v1;

import com.robinhood.android.car.result.CarResultComposable2;
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

/* compiled from: StrategiesValuePropsTermsSheet.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Ladvisory/proto/v1/StrategiesValuePropsTermsSheet;", "Lcom/squareup/wire/Message;", "", "title", "", CarResultComposable2.BODY, "done_cta_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getDone_cta_text", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class StrategiesValuePropsTermsSheet extends Message {

    @JvmField
    public static final ProtoAdapter<StrategiesValuePropsTermsSheet> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "doneCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String done_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public StrategiesValuePropsTermsSheet() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ StrategiesValuePropsTermsSheet(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4541newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getDone_cta_text() {
        return this.done_cta_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategiesValuePropsTermsSheet(String title, String body, String done_cta_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(done_cta_text, "done_cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.body = body;
        this.done_cta_text = done_cta_text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4541newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StrategiesValuePropsTermsSheet)) {
            return false;
        }
        StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet = (StrategiesValuePropsTermsSheet) other;
        return Intrinsics.areEqual(unknownFields(), strategiesValuePropsTermsSheet.unknownFields()) && Intrinsics.areEqual(this.title, strategiesValuePropsTermsSheet.title) && Intrinsics.areEqual(this.body, strategiesValuePropsTermsSheet.body) && Intrinsics.areEqual(this.done_cta_text, strategiesValuePropsTermsSheet.done_cta_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.body.hashCode()) * 37) + this.done_cta_text.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("body=" + Internal.sanitize(this.body));
        arrayList.add("done_cta_text=" + Internal.sanitize(this.done_cta_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "StrategiesValuePropsTermsSheet{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StrategiesValuePropsTermsSheet copy$default(StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategiesValuePropsTermsSheet.title;
        }
        if ((i & 2) != 0) {
            str2 = strategiesValuePropsTermsSheet.body;
        }
        if ((i & 4) != 0) {
            str3 = strategiesValuePropsTermsSheet.done_cta_text;
        }
        if ((i & 8) != 0) {
            byteString = strategiesValuePropsTermsSheet.unknownFields();
        }
        return strategiesValuePropsTermsSheet.copy(str, str2, str3, byteString);
    }

    public final StrategiesValuePropsTermsSheet copy(String title, String body, String done_cta_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(done_cta_text, "done_cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StrategiesValuePropsTermsSheet(title, body, done_cta_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StrategiesValuePropsTermsSheet.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StrategiesValuePropsTermsSheet>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.StrategiesValuePropsTermsSheet$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StrategiesValuePropsTermsSheet value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBody());
                }
                return !Intrinsics.areEqual(value.getDone_cta_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDone_cta_text()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StrategiesValuePropsTermsSheet value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (!Intrinsics.areEqual(value.getDone_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDone_cta_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StrategiesValuePropsTermsSheet value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDone_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDone_cta_text());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StrategiesValuePropsTermsSheet redact(StrategiesValuePropsTermsSheet value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StrategiesValuePropsTermsSheet.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StrategiesValuePropsTermsSheet decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StrategiesValuePropsTermsSheet(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
