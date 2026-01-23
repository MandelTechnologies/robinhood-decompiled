package advisory.proto.p008v1;

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

/* compiled from: AdvisoryInsightCta.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightCta;", "Lcom/squareup/wire/Message;", "", "deeplink", "", "text", "logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getDeeplink", "()Ljava/lang/String;", "getText", "getLogging_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AdvisoryInsightCta extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryInsightCta> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String text;

    public AdvisoryInsightCta() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ AdvisoryInsightCta(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4398newBuilder();
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getText() {
        return this.text;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightCta(String deeplink, String text, String logging_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.deeplink = deeplink;
        this.text = text;
        this.logging_identifier = logging_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4398newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightCta)) {
            return false;
        }
        AdvisoryInsightCta advisoryInsightCta = (AdvisoryInsightCta) other;
        return Intrinsics.areEqual(unknownFields(), advisoryInsightCta.unknownFields()) && Intrinsics.areEqual(this.deeplink, advisoryInsightCta.deeplink) && Intrinsics.areEqual(this.text, advisoryInsightCta.text) && Intrinsics.areEqual(this.logging_identifier, advisoryInsightCta.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.deeplink.hashCode()) * 37) + this.text.hashCode()) * 37) + this.logging_identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        arrayList.add("text=" + Internal.sanitize(this.text));
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryInsightCta{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryInsightCta copy$default(AdvisoryInsightCta advisoryInsightCta, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryInsightCta.deeplink;
        }
        if ((i & 2) != 0) {
            str2 = advisoryInsightCta.text;
        }
        if ((i & 4) != 0) {
            str3 = advisoryInsightCta.logging_identifier;
        }
        if ((i & 8) != 0) {
            byteString = advisoryInsightCta.unknownFields();
        }
        return advisoryInsightCta.copy(str, str2, str3, byteString);
    }

    public final AdvisoryInsightCta copy(String deeplink, String text, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryInsightCta(deeplink, text, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryInsightCta.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryInsightCta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryInsightCta$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryInsightCta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getText());
                }
                return !Intrinsics.areEqual(value.getLogging_identifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLogging_identifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryInsightCta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryInsightCta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                }
                if (Intrinsics.areEqual(value.getDeeplink(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDeeplink());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightCta redact(AdvisoryInsightCta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdvisoryInsightCta.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightCta decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisoryInsightCta(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
