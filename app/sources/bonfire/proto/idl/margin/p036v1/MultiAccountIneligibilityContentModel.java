package bonfire.proto.idl.margin.p036v1;

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

/* compiled from: MultiAccountIneligibilityContentModel.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J7\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001aR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModel;", "Lcom/squareup/wire/Message;", "", "title", "", "body_markdown", "hide_switch_to_margin_cta", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getBody_markdown", "getHide_switch_to_margin_cta", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModel;", "Companion", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MultiAccountIneligibilityContentModel extends Message {

    @JvmField
    public static final ProtoAdapter<MultiAccountIneligibilityContentModel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bodyMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String body_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hideSwitchToMarginCta", schemaIndex = 2, tag = 3)
    private final Boolean hide_switch_to_margin_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String title;

    public MultiAccountIneligibilityContentModel() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9017newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody_markdown() {
        return this.body_markdown;
    }

    public /* synthetic */ MultiAccountIneligibilityContentModel(String str, String str2, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Boolean getHide_switch_to_margin_cta() {
        return this.hide_switch_to_margin_cta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAccountIneligibilityContentModel(String str, String body_markdown, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(body_markdown, "body_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.body_markdown = body_markdown;
        this.hide_switch_to_margin_cta = bool;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9017newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MultiAccountIneligibilityContentModel)) {
            return false;
        }
        MultiAccountIneligibilityContentModel multiAccountIneligibilityContentModel = (MultiAccountIneligibilityContentModel) other;
        return Intrinsics.areEqual(unknownFields(), multiAccountIneligibilityContentModel.unknownFields()) && Intrinsics.areEqual(this.title, multiAccountIneligibilityContentModel.title) && Intrinsics.areEqual(this.body_markdown, multiAccountIneligibilityContentModel.body_markdown) && Intrinsics.areEqual(this.hide_switch_to_margin_cta, multiAccountIneligibilityContentModel.hide_switch_to_margin_cta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.body_markdown.hashCode()) * 37;
        Boolean bool = this.hide_switch_to_margin_cta;
        int iHashCode3 = iHashCode2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        arrayList.add("body_markdown=" + Internal.sanitize(this.body_markdown));
        Boolean bool = this.hide_switch_to_margin_cta;
        if (bool != null) {
            arrayList.add("hide_switch_to_margin_cta=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MultiAccountIneligibilityContentModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MultiAccountIneligibilityContentModel copy$default(MultiAccountIneligibilityContentModel multiAccountIneligibilityContentModel, String str, String str2, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiAccountIneligibilityContentModel.title;
        }
        if ((i & 2) != 0) {
            str2 = multiAccountIneligibilityContentModel.body_markdown;
        }
        if ((i & 4) != 0) {
            bool = multiAccountIneligibilityContentModel.hide_switch_to_margin_cta;
        }
        if ((i & 8) != 0) {
            byteString = multiAccountIneligibilityContentModel.unknownFields();
        }
        return multiAccountIneligibilityContentModel.copy(str, str2, bool, byteString);
    }

    public final MultiAccountIneligibilityContentModel copy(String title, String body_markdown, Boolean hide_switch_to_margin_cta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(body_markdown, "body_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MultiAccountIneligibilityContentModel(title, body_markdown, hide_switch_to_margin_cta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MultiAccountIneligibilityContentModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MultiAccountIneligibilityContentModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.margin.v1.MultiAccountIneligibilityContentModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MultiAccountIneligibilityContentModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getTitle());
                if (!Intrinsics.areEqual(value.getBody_markdown(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(2, value.getBody_markdown());
                }
                return iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.getHide_switch_to_margin_cta());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MultiAccountIneligibilityContentModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                if (!Intrinsics.areEqual(value.getBody_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getBody_markdown());
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getHide_switch_to_margin_cta());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MultiAccountIneligibilityContentModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getHide_switch_to_margin_cta());
                if (!Intrinsics.areEqual(value.getBody_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody_markdown());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MultiAccountIneligibilityContentModel redact(MultiAccountIneligibilityContentModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MultiAccountIneligibilityContentModel.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MultiAccountIneligibilityContentModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = "";
                Boolean boolDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MultiAccountIneligibilityContentModel(strDecode, strDecode2, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
