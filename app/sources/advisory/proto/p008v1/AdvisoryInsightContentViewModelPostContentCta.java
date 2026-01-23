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

/* compiled from: AdvisoryInsightContentViewModelPostContentCta.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCta;", "Lcom/squareup/wire/Message;", "", "link", "", "icon", "text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLink", "()Ljava/lang/String;", "getIcon", "getText", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AdvisoryInsightContentViewModelPostContentCta extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryInsightContentViewModelPostContentCta> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String link;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String text;

    public AdvisoryInsightContentViewModelPostContentCta() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ AdvisoryInsightContentViewModelPostContentCta(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4397newBuilder();
    }

    public final String getLink() {
        return this.link;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightContentViewModelPostContentCta(String link, String icon, String text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.link = link;
        this.icon = icon;
        this.text = text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4397newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightContentViewModelPostContentCta)) {
            return false;
        }
        AdvisoryInsightContentViewModelPostContentCta advisoryInsightContentViewModelPostContentCta = (AdvisoryInsightContentViewModelPostContentCta) other;
        return Intrinsics.areEqual(unknownFields(), advisoryInsightContentViewModelPostContentCta.unknownFields()) && Intrinsics.areEqual(this.link, advisoryInsightContentViewModelPostContentCta.link) && Intrinsics.areEqual(this.icon, advisoryInsightContentViewModelPostContentCta.icon) && Intrinsics.areEqual(this.text, advisoryInsightContentViewModelPostContentCta.text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.link.hashCode()) * 37) + this.icon.hashCode()) * 37) + this.text.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("link=" + Internal.sanitize(this.link));
        arrayList.add("icon=" + Internal.sanitize(this.icon));
        arrayList.add("text=" + Internal.sanitize(this.text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryInsightContentViewModelPostContentCta{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryInsightContentViewModelPostContentCta copy$default(AdvisoryInsightContentViewModelPostContentCta advisoryInsightContentViewModelPostContentCta, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryInsightContentViewModelPostContentCta.link;
        }
        if ((i & 2) != 0) {
            str2 = advisoryInsightContentViewModelPostContentCta.icon;
        }
        if ((i & 4) != 0) {
            str3 = advisoryInsightContentViewModelPostContentCta.text;
        }
        if ((i & 8) != 0) {
            byteString = advisoryInsightContentViewModelPostContentCta.unknownFields();
        }
        return advisoryInsightContentViewModelPostContentCta.copy(str, str2, str3, byteString);
    }

    public final AdvisoryInsightContentViewModelPostContentCta copy(String link, String icon, String text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryInsightContentViewModelPostContentCta(link, icon, text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryInsightContentViewModelPostContentCta.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryInsightContentViewModelPostContentCta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryInsightContentViewModelPostContentCta$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryInsightContentViewModelPostContentCta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLink());
                }
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getIcon());
                }
                return !Intrinsics.areEqual(value.getText(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getText()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryInsightContentViewModelPostContentCta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLink());
                }
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIcon());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getText());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryInsightContentViewModelPostContentCta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getText());
                }
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIcon());
                }
                if (Intrinsics.areEqual(value.getLink(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLink());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModelPostContentCta redact(AdvisoryInsightContentViewModelPostContentCta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdvisoryInsightContentViewModelPostContentCta.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModelPostContentCta decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisoryInsightContentViewModelPostContentCta(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
