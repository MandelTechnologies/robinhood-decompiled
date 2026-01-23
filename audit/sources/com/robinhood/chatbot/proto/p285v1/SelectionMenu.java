package com.robinhood.chatbot.proto.p285v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: SelectionMenu.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB9\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J=\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SelectionMenu;", "Lcom/squareup/wire/Message;", "", "rows", "", "Lcom/robinhood/chatbot/proto/v1/SelectionMenuRow;", "takeover_title", "", "max_quick_reply_rows", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)V", "getTakeover_title", "()Ljava/lang/String;", "getMax_quick_reply_rows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)Lcom/robinhood/chatbot/proto/v1/SelectionMenu;", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class SelectionMenu extends Message {

    @JvmField
    public static final ProtoAdapter<SelectionMenu> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxQuickReplyRows", schemaIndex = 2, tag = 3)
    private final Integer max_quick_reply_rows;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.SelectionMenuRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<SelectionMenuRow> rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "takeoverTitle", schemaIndex = 1, tag = 2)
    private final String takeover_title;

    public SelectionMenu() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20541newBuilder();
    }

    public /* synthetic */ SelectionMenu(List list, String str, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTakeover_title() {
        return this.takeover_title;
    }

    public final Integer getMax_quick_reply_rows() {
        return this.max_quick_reply_rows;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMenu(List<SelectionMenuRow> rows, String str, Integer num, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.takeover_title = str;
        this.max_quick_reply_rows = num;
        this.rows = Internal.immutableCopyOf("rows", rows);
    }

    public final List<SelectionMenuRow> getRows() {
        return this.rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20541newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SelectionMenu)) {
            return false;
        }
        SelectionMenu selectionMenu = (SelectionMenu) other;
        return Intrinsics.areEqual(unknownFields(), selectionMenu.unknownFields()) && Intrinsics.areEqual(this.rows, selectionMenu.rows) && Intrinsics.areEqual(this.takeover_title, selectionMenu.takeover_title) && Intrinsics.areEqual(this.max_quick_reply_rows, selectionMenu.max_quick_reply_rows);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.rows.hashCode()) * 37;
        String str = this.takeover_title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.max_quick_reply_rows;
        int iHashCode3 = iHashCode2 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.rows.isEmpty()) {
            arrayList.add("rows=" + this.rows);
        }
        String str = this.takeover_title;
        if (str != null) {
            arrayList.add("takeover_title=" + Internal.sanitize(str));
        }
        Integer num = this.max_quick_reply_rows;
        if (num != null) {
            arrayList.add("max_quick_reply_rows=" + num);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectionMenu{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectionMenu copy$default(SelectionMenu selectionMenu, List list, String str, Integer num, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = selectionMenu.rows;
        }
        if ((i & 2) != 0) {
            str = selectionMenu.takeover_title;
        }
        if ((i & 4) != 0) {
            num = selectionMenu.max_quick_reply_rows;
        }
        if ((i & 8) != 0) {
            byteString = selectionMenu.unknownFields();
        }
        return selectionMenu.copy(list, str, num, byteString);
    }

    public final SelectionMenu copy(List<SelectionMenuRow> rows, String takeover_title, Integer max_quick_reply_rows, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SelectionMenu(rows, takeover_title, max_quick_reply_rows, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SelectionMenu.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SelectionMenu>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.SelectionMenu$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SelectionMenu value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + SelectionMenuRow.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getRows()) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTakeover_title()) + ProtoAdapter.INT32.encodedSizeWithTag(3, value.getMax_quick_reply_rows());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SelectionMenu value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                SelectionMenuRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRows());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTakeover_title());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getMax_quick_reply_rows());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SelectionMenu value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getMax_quick_reply_rows());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTakeover_title());
                SelectionMenuRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRows());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SelectionMenu decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                Integer numDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SelectionMenu(arrayList, strDecode, numDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(SelectionMenuRow.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SelectionMenu redact(SelectionMenu value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SelectionMenu.copy$default(value, Internal.m26823redactElements(value.getRows(), SelectionMenuRow.ADAPTER), null, null, ByteString.EMPTY, 6, null);
            }
        };
    }
}
