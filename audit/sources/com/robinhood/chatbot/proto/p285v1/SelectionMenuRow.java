package com.robinhood.chatbot.proto.p285v1;

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

/* compiled from: SelectionMenuRow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SelectionMenuRow;", "Lcom/squareup/wire/Message;", "", "title", "", "id", "plain_text", "icon", "subtitle", "Lcom/robinhood/chatbot/proto/v1/RichText;", "trailing_content", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/RichText;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getId", "getPlain_text", "getIcon", "getSubtitle", "()Lcom/robinhood/chatbot/proto/v1/RichText;", "getTrailing_content", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class SelectionMenuRow extends Message {

    @JvmField
    public static final ProtoAdapter<SelectionMenuRow> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 5)
    private final String icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "plainText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final String plain_text;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.RichText#ADAPTER", schemaIndex = 4, tag = 6)
    private final RichText subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 2)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "trailingContent", schemaIndex = 5, tag = 7)
    private final String trailing_content;

    public SelectionMenuRow() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ SelectionMenuRow(String str, String str2, String str3, String str4, RichText richText, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : richText, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20543newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPlain_text() {
        return this.plain_text;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final RichText getSubtitle() {
        return this.subtitle;
    }

    public final String getTrailing_content() {
        return this.trailing_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMenuRow(String title, String id, String plain_text, String str, RichText richText, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(plain_text, "plain_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.id = id;
        this.plain_text = plain_text;
        this.icon = str;
        this.subtitle = richText;
        this.trailing_content = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20543newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SelectionMenuRow)) {
            return false;
        }
        SelectionMenuRow selectionMenuRow = (SelectionMenuRow) other;
        return Intrinsics.areEqual(unknownFields(), selectionMenuRow.unknownFields()) && Intrinsics.areEqual(this.title, selectionMenuRow.title) && Intrinsics.areEqual(this.id, selectionMenuRow.id) && Intrinsics.areEqual(this.plain_text, selectionMenuRow.plain_text) && Intrinsics.areEqual(this.icon, selectionMenuRow.icon) && Intrinsics.areEqual(this.subtitle, selectionMenuRow.subtitle) && Intrinsics.areEqual(this.trailing_content, selectionMenuRow.trailing_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.id.hashCode()) * 37) + this.plain_text.hashCode()) * 37;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        RichText richText = this.subtitle;
        int iHashCode3 = (iHashCode2 + (richText != null ? richText.hashCode() : 0)) * 37;
        String str2 = this.trailing_content;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("plain_text=" + Internal.sanitize(this.plain_text));
        String str = this.icon;
        if (str != null) {
            arrayList.add("icon=" + Internal.sanitize(str));
        }
        RichText richText = this.subtitle;
        if (richText != null) {
            arrayList.add("subtitle=" + richText);
        }
        String str2 = this.trailing_content;
        if (str2 != null) {
            arrayList.add("trailing_content=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectionMenuRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SelectionMenuRow copy$default(SelectionMenuRow selectionMenuRow, String str, String str2, String str3, String str4, RichText richText, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectionMenuRow.title;
        }
        if ((i & 2) != 0) {
            str2 = selectionMenuRow.id;
        }
        if ((i & 4) != 0) {
            str3 = selectionMenuRow.plain_text;
        }
        if ((i & 8) != 0) {
            str4 = selectionMenuRow.icon;
        }
        if ((i & 16) != 0) {
            richText = selectionMenuRow.subtitle;
        }
        if ((i & 32) != 0) {
            str5 = selectionMenuRow.trailing_content;
        }
        if ((i & 64) != 0) {
            byteString = selectionMenuRow.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        RichText richText2 = richText;
        String str7 = str3;
        return selectionMenuRow.copy(str, str2, str7, str4, richText2, str6, byteString2);
    }

    public final SelectionMenuRow copy(String title, String id, String plain_text, String icon, RichText subtitle, String trailing_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(plain_text, "plain_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SelectionMenuRow(title, id, plain_text, icon, subtitle, trailing_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SelectionMenuRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SelectionMenuRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.SelectionMenuRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SelectionMenuRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getId());
                }
                if (!Intrinsics.areEqual(value.getPlain_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPlain_text());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(5, value.getIcon()) + RichText.ADAPTER.encodedSizeWithTag(6, value.getSubtitle()) + protoAdapter.encodedSizeWithTag(7, value.getTrailing_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SelectionMenuRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getPlain_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPlain_text());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getIcon());
                RichText.ADAPTER.encodeWithTag(writer, 6, (int) value.getSubtitle());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getTrailing_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SelectionMenuRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getTrailing_content());
                RichText.ADAPTER.encodeWithTag(writer, 6, (int) value.getSubtitle());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getIcon());
                if (!Intrinsics.areEqual(value.getPlain_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getPlain_text());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getId());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SelectionMenuRow redact(SelectionMenuRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RichText subtitle = value.getSubtitle();
                return SelectionMenuRow.copy$default(value, null, null, null, null, subtitle != null ? RichText.ADAPTER.redact(subtitle) : null, null, ByteString.EMPTY, 47, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SelectionMenuRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = null;
                RichText richTextDecode = null;
                String strDecode4 = null;
                String strDecode5 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                richTextDecode = RichText.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new SelectionMenuRow(strDecode, strDecode5, strDecode2, strDecode3, richTextDecode, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
