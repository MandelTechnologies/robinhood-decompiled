package search_coprocessor.p542v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: SectionTitle.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JT\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lsearch_coprocessor/v1/SectionTitle;", "Lcom/squareup/wire/Message;", "", "id", "", "text", "deeplink", "accessory_icon", "disclosure_title", "disclosure_message", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getText", "getDeeplink", "getAccessory_icon", "getDisclosure_title", "getDisclosure_message", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class SectionTitle extends Message {

    @JvmField
    public static final ProtoAdapter<SectionTitle> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accessoryIcon", schemaIndex = 3, tag = 4)
    private final String accessory_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMessage", schemaIndex = 5, tag = 6)
    private final String disclosure_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureTitle", schemaIndex = 4, tag = 5)
    private final String disclosure_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String text;

    public SectionTitle() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ SectionTitle(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29984newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getAccessory_icon() {
        return this.accessory_icon;
    }

    public final String getDisclosure_title() {
        return this.disclosure_title;
    }

    public final String getDisclosure_message() {
        return this.disclosure_message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionTitle(String id, String text, String str, String str2, String str3, String str4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.text = text;
        this.deeplink = str;
        this.accessory_icon = str2;
        this.disclosure_title = str3;
        this.disclosure_message = str4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29984newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SectionTitle)) {
            return false;
        }
        SectionTitle sectionTitle = (SectionTitle) other;
        return Intrinsics.areEqual(unknownFields(), sectionTitle.unknownFields()) && Intrinsics.areEqual(this.id, sectionTitle.id) && Intrinsics.areEqual(this.text, sectionTitle.text) && Intrinsics.areEqual(this.deeplink, sectionTitle.deeplink) && Intrinsics.areEqual(this.accessory_icon, sectionTitle.accessory_icon) && Intrinsics.areEqual(this.disclosure_title, sectionTitle.disclosure_title) && Intrinsics.areEqual(this.disclosure_message, sectionTitle.disclosure_message);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.text.hashCode()) * 37;
        String str = this.deeplink;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.accessory_icon;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.disclosure_title;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.disclosure_message;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("text=" + Internal.sanitize(this.text));
        String str = this.deeplink;
        if (str != null) {
            arrayList.add("deeplink=" + Internal.sanitize(str));
        }
        String str2 = this.accessory_icon;
        if (str2 != null) {
            arrayList.add("accessory_icon=" + Internal.sanitize(str2));
        }
        String str3 = this.disclosure_title;
        if (str3 != null) {
            arrayList.add("disclosure_title=" + Internal.sanitize(str3));
        }
        String str4 = this.disclosure_message;
        if (str4 != null) {
            arrayList.add("disclosure_message=" + Internal.sanitize(str4));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SectionTitle{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SectionTitle copy$default(SectionTitle sectionTitle, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sectionTitle.id;
        }
        if ((i & 2) != 0) {
            str2 = sectionTitle.text;
        }
        if ((i & 4) != 0) {
            str3 = sectionTitle.deeplink;
        }
        if ((i & 8) != 0) {
            str4 = sectionTitle.accessory_icon;
        }
        if ((i & 16) != 0) {
            str5 = sectionTitle.disclosure_title;
        }
        if ((i & 32) != 0) {
            str6 = sectionTitle.disclosure_message;
        }
        if ((i & 64) != 0) {
            byteString = sectionTitle.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str5;
        String str9 = str3;
        return sectionTitle.copy(str, str2, str9, str4, str8, str7, byteString2);
    }

    public final SectionTitle copy(String id, String text, String deeplink, String accessory_icon, String disclosure_title, String disclosure_message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SectionTitle(id, text, deeplink, accessory_icon, disclosure_title, disclosure_message, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SectionTitle.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SectionTitle>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.SectionTitle$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SectionTitle value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getText());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(3, value.getDeeplink()) + protoAdapter.encodedSizeWithTag(4, value.getAccessory_icon()) + protoAdapter.encodedSizeWithTag(5, value.getDisclosure_title()) + protoAdapter.encodedSizeWithTag(6, value.getDisclosure_message());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SectionTitle value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDeeplink());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAccessory_icon());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getDisclosure_title());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getDisclosure_message());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SectionTitle value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getDisclosure_message());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getDisclosure_title());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAccessory_icon());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDeeplink());
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getText());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SectionTitle redact(SectionTitle value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SectionTitle.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SectionTitle decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = null;
                String strDecode6 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new SectionTitle(strDecode, strDecode6, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
