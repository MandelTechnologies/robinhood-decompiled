package com.robinhood.copilot.proto.p286v1;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
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

/* compiled from: InsightDetail.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightDetail;", "Lcom/squareup/wire/Message;", "", "title", "", "description", "items", "", "Lcom/robinhood/copilot/proto/v1/TableItem;", SduiAlert.BOTTOM_SHEET_TAG, "Lcom/robinhood/copilot/proto/v1/BottomSheet;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/BottomSheet;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getBottom_sheet", "()Lcom/robinhood/copilot/proto/v1/BottomSheet;", "getItems", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class InsightDetail extends Message {

    @JvmField
    public static final ProtoAdapter<InsightDetail> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.BottomSheet#ADAPTER", jsonName = "bottomSheet", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final BottomSheet bottom_sheet;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.TableItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<TableItem> items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public InsightDetail() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ InsightDetail(String str, String str2, List list, BottomSheet bottomSheet, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : bottomSheet, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22146newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final BottomSheet getBottom_sheet() {
        return this.bottom_sheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightDetail(String title, String description, List<TableItem> items, BottomSheet bottomSheet, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.bottom_sheet = bottomSheet;
        this.items = Internal.immutableCopyOf("items", items);
    }

    public final List<TableItem> getItems() {
        return this.items;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22146newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InsightDetail)) {
            return false;
        }
        InsightDetail insightDetail = (InsightDetail) other;
        return Intrinsics.areEqual(unknownFields(), insightDetail.unknownFields()) && Intrinsics.areEqual(this.title, insightDetail.title) && Intrinsics.areEqual(this.description, insightDetail.description) && Intrinsics.areEqual(this.items, insightDetail.items) && Intrinsics.areEqual(this.bottom_sheet, insightDetail.bottom_sheet);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37) + this.items.hashCode()) * 37;
        BottomSheet bottomSheet = this.bottom_sheet;
        int iHashCode2 = iHashCode + (bottomSheet != null ? bottomSheet.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        if (!this.items.isEmpty()) {
            arrayList.add("items=" + this.items);
        }
        BottomSheet bottomSheet = this.bottom_sheet;
        if (bottomSheet != null) {
            arrayList.add("bottom_sheet=" + bottomSheet);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InsightDetail{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InsightDetail copy$default(InsightDetail insightDetail, String str, String str2, List list, BottomSheet bottomSheet, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = insightDetail.title;
        }
        if ((i & 2) != 0) {
            str2 = insightDetail.description;
        }
        if ((i & 4) != 0) {
            list = insightDetail.items;
        }
        if ((i & 8) != 0) {
            bottomSheet = insightDetail.bottom_sheet;
        }
        if ((i & 16) != 0) {
            byteString = insightDetail.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return insightDetail.copy(str, str2, list2, bottomSheet, byteString2);
    }

    public final InsightDetail copy(String title, String description, List<TableItem> items, BottomSheet bottom_sheet, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InsightDetail(title, description, items, bottom_sheet, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InsightDetail.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InsightDetail>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.InsightDetail$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InsightDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                int iEncodedSizeWithTag = size + TableItem.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getItems());
                return value.getBottom_sheet() != null ? iEncodedSizeWithTag + BottomSheet.ADAPTER.encodedSizeWithTag(4, value.getBottom_sheet()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InsightDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                TableItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getItems());
                if (value.getBottom_sheet() != null) {
                    BottomSheet.ADAPTER.encodeWithTag(writer, 4, (int) value.getBottom_sheet());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InsightDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBottom_sheet() != null) {
                    BottomSheet.ADAPTER.encodeWithTag(writer, 4, (int) value.getBottom_sheet());
                }
                TableItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getItems());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InsightDetail decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                BottomSheet bottomSheetDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InsightDetail(strDecode, strDecode2, arrayList, bottomSheetDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(TableItem.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        bottomSheetDecode = BottomSheet.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InsightDetail redact(InsightDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getItems(), TableItem.ADAPTER);
                BottomSheet bottom_sheet = value.getBottom_sheet();
                return InsightDetail.copy$default(value, null, null, listM26823redactElements, bottom_sheet != null ? BottomSheet.ADAPTER.redact(bottom_sheet) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
