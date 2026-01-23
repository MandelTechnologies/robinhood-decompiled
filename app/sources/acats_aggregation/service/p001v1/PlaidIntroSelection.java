package acats_aggregation.service.p001v1;

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

/* compiled from: PlaidIntroSelection.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J:\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lacats_aggregation/service/v1/PlaidIntroSelection;", "Lcom/squareup/wire/Message;", "", "info_tag_text", "", "title", "subtitle", "logging_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getInfo_tag_text", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getLogging_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class PlaidIntroSelection extends Message {

    @JvmField
    public static final ProtoAdapter<PlaidIntroSelection> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "infoTagText", schemaIndex = 0, tag = 1)
    private final String info_tag_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String logging_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public PlaidIntroSelection() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ PlaidIntroSelection(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4322newBuilder();
    }

    public final String getInfo_tag_text() {
        return this.info_tag_text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getLogging_id() {
        return this.logging_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidIntroSelection(String str, String title, String subtitle, String logging_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(logging_id, "logging_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.info_tag_text = str;
        this.title = title;
        this.subtitle = subtitle;
        this.logging_id = logging_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4322newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidIntroSelection)) {
            return false;
        }
        PlaidIntroSelection plaidIntroSelection = (PlaidIntroSelection) other;
        return Intrinsics.areEqual(unknownFields(), plaidIntroSelection.unknownFields()) && Intrinsics.areEqual(this.info_tag_text, plaidIntroSelection.info_tag_text) && Intrinsics.areEqual(this.title, plaidIntroSelection.title) && Intrinsics.areEqual(this.subtitle, plaidIntroSelection.subtitle) && Intrinsics.areEqual(this.logging_id, plaidIntroSelection.logging_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.info_tag_text;
        int iHashCode2 = ((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.logging_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.info_tag_text;
        if (str != null) {
            arrayList.add("info_tag_text=" + Internal.sanitize(str));
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("logging_id=" + Internal.sanitize(this.logging_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaidIntroSelection{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PlaidIntroSelection copy$default(PlaidIntroSelection plaidIntroSelection, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaidIntroSelection.info_tag_text;
        }
        if ((i & 2) != 0) {
            str2 = plaidIntroSelection.title;
        }
        if ((i & 4) != 0) {
            str3 = plaidIntroSelection.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = plaidIntroSelection.logging_id;
        }
        if ((i & 16) != 0) {
            byteString = plaidIntroSelection.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return plaidIntroSelection.copy(str, str2, str5, str4, byteString2);
    }

    public final PlaidIntroSelection copy(String info_tag_text, String title, String subtitle, String logging_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(logging_id, "logging_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidIntroSelection(info_tag_text, title, subtitle, logging_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaidIntroSelection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaidIntroSelection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: acats_aggregation.service.v1.PlaidIntroSelection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidIntroSelection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getInfo_tag_text());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getSubtitle());
                }
                return !Intrinsics.areEqual(value.getLogging_id(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getLogging_id()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidIntroSelection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getInfo_tag_text());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getLogging_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getLogging_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidIntroSelection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLogging_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLogging_id());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInfo_tag_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidIntroSelection redact(PlaidIntroSelection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PlaidIntroSelection.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidIntroSelection decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = "";
                String strDecode3 = "";
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PlaidIntroSelection(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
