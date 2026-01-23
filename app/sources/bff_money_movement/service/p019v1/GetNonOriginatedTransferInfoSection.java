package bff_money_movement.service.p019v1;

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

/* compiled from: GetNonOriginatedTransferInfoSection.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BE\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016JI\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u001fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoSection;", "Lcom/squareup/wire/Message;", "", "data_rows", "", "Lbff_money_movement/service/v1/DataRow;", "title", "", "subtitle_markdown", "collapsable_count", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle_markdown", "getCollapsable_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData_rows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoSection;", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetNonOriginatedTransferInfoSection extends Message {

    @JvmField
    public static final ProtoAdapter<GetNonOriginatedTransferInfoSection> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "collapsableCount", schemaIndex = 3, tag = 4)
    private final Integer collapsable_count;

    @WireField(adapter = "bff_money_movement.service.v1.DataRow#ADAPTER", jsonName = "dataRows", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<DataRow> data_rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", schemaIndex = 2, tag = 3)
    private final String subtitle_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String title;

    public GetNonOriginatedTransferInfoSection() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8424newBuilder();
    }

    public /* synthetic */ GetNonOriginatedTransferInfoSection(List list, String str, String str2, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final Integer getCollapsable_count() {
        return this.collapsable_count;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNonOriginatedTransferInfoSection(List<DataRow> data_rows, String str, String str2, Integer num, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(data_rows, "data_rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.subtitle_markdown = str2;
        this.collapsable_count = num;
        this.data_rows = Internal.immutableCopyOf("data_rows", data_rows);
    }

    public final List<DataRow> getData_rows() {
        return this.data_rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8424newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetNonOriginatedTransferInfoSection)) {
            return false;
        }
        GetNonOriginatedTransferInfoSection getNonOriginatedTransferInfoSection = (GetNonOriginatedTransferInfoSection) other;
        return Intrinsics.areEqual(unknownFields(), getNonOriginatedTransferInfoSection.unknownFields()) && Intrinsics.areEqual(this.data_rows, getNonOriginatedTransferInfoSection.data_rows) && Intrinsics.areEqual(this.title, getNonOriginatedTransferInfoSection.title) && Intrinsics.areEqual(this.subtitle_markdown, getNonOriginatedTransferInfoSection.subtitle_markdown) && Intrinsics.areEqual(this.collapsable_count, getNonOriginatedTransferInfoSection.collapsable_count);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.data_rows.hashCode()) * 37;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle_markdown;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.collapsable_count;
        int iHashCode4 = iHashCode3 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.data_rows.isEmpty()) {
            arrayList.add("data_rows=" + this.data_rows);
        }
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        String str2 = this.subtitle_markdown;
        if (str2 != null) {
            arrayList.add("subtitle_markdown=" + Internal.sanitize(str2));
        }
        Integer num = this.collapsable_count;
        if (num != null) {
            arrayList.add("collapsable_count=" + num);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNonOriginatedTransferInfoSection{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetNonOriginatedTransferInfoSection copy$default(GetNonOriginatedTransferInfoSection getNonOriginatedTransferInfoSection, List list, String str, String str2, Integer num, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getNonOriginatedTransferInfoSection.data_rows;
        }
        if ((i & 2) != 0) {
            str = getNonOriginatedTransferInfoSection.title;
        }
        if ((i & 4) != 0) {
            str2 = getNonOriginatedTransferInfoSection.subtitle_markdown;
        }
        if ((i & 8) != 0) {
            num = getNonOriginatedTransferInfoSection.collapsable_count;
        }
        if ((i & 16) != 0) {
            byteString = getNonOriginatedTransferInfoSection.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return getNonOriginatedTransferInfoSection.copy(list, str, str3, num, byteString2);
    }

    public final GetNonOriginatedTransferInfoSection copy(List<DataRow> data_rows, String title, String subtitle_markdown, Integer collapsable_count, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(data_rows, "data_rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetNonOriginatedTransferInfoSection(data_rows, title, subtitle_markdown, collapsable_count, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetNonOriginatedTransferInfoSection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetNonOriginatedTransferInfoSection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetNonOriginatedTransferInfoSection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetNonOriginatedTransferInfoSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + DataRow.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getData_rows());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(2, value.getTitle()) + protoAdapter.encodedSizeWithTag(3, value.getSubtitle_markdown()) + ProtoAdapter.INT32.encodedSizeWithTag(4, value.getCollapsable_count());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetNonOriginatedTransferInfoSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                DataRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getData_rows());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSubtitle_markdown());
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getCollapsable_count());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetNonOriginatedTransferInfoSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getCollapsable_count());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSubtitle_markdown());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                DataRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getData_rows());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetNonOriginatedTransferInfoSection decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                Integer numDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetNonOriginatedTransferInfoSection(arrayList, strDecode, strDecode2, numDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(DataRow.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetNonOriginatedTransferInfoSection redact(GetNonOriginatedTransferInfoSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetNonOriginatedTransferInfoSection.copy$default(value, Internal.m26823redactElements(value.getData_rows(), DataRow.ADAPTER), null, null, null, ByteString.EMPTY, 14, null);
            }
        };
    }
}
