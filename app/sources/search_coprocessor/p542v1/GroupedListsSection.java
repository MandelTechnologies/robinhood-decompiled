package search_coprocessor.p542v1;

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

/* compiled from: GroupedListsSection.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J4\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lsearch_coprocessor/v1/GroupedListsSection;", "Lcom/squareup/wire/Message;", "", "id", "", "lists", "", "Lsearch_coprocessor/v1/AbstractList;", "items_limit", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;ILokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getItems_limit", "()I", "getLists", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class GroupedListsSection extends Message {

    @JvmField
    public static final ProtoAdapter<GroupedListsSection> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "itemsLimit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int items_limit;

    @WireField(adapter = "search_coprocessor.v1.AbstractList#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<AbstractList> lists;

    public GroupedListsSection() {
        this(null, null, 0, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29960newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ GroupedListsSection(String str, List list, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getItems_limit() {
        return this.items_limit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupedListsSection(String id, List<AbstractList> lists, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(lists, "lists");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.items_limit = i;
        this.lists = Internal.immutableCopyOf("lists", lists);
    }

    public final List<AbstractList> getLists() {
        return this.lists;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29960newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GroupedListsSection)) {
            return false;
        }
        GroupedListsSection groupedListsSection = (GroupedListsSection) other;
        return Intrinsics.areEqual(unknownFields(), groupedListsSection.unknownFields()) && Intrinsics.areEqual(this.id, groupedListsSection.id) && Intrinsics.areEqual(this.lists, groupedListsSection.lists) && this.items_limit == groupedListsSection.items_limit;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.lists.hashCode()) * 37) + Integer.hashCode(this.items_limit);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        if (!this.lists.isEmpty()) {
            arrayList.add("lists=" + this.lists);
        }
        arrayList.add("items_limit=" + this.items_limit);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GroupedListsSection{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupedListsSection copy$default(GroupedListsSection groupedListsSection, String str, List list, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = groupedListsSection.id;
        }
        if ((i2 & 2) != 0) {
            list = groupedListsSection.lists;
        }
        if ((i2 & 4) != 0) {
            i = groupedListsSection.items_limit;
        }
        if ((i2 & 8) != 0) {
            byteString = groupedListsSection.unknownFields();
        }
        return groupedListsSection.copy(str, list, i, byteString);
    }

    public final GroupedListsSection copy(String id, List<AbstractList> lists, int items_limit, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(lists, "lists");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GroupedListsSection(id, lists, items_limit, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GroupedListsSection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GroupedListsSection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.GroupedListsSection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GroupedListsSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                int iEncodedSizeWithTag = size + AbstractList.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getLists());
                return value.getItems_limit() != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getItems_limit())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GroupedListsSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                AbstractList.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getLists());
                if (value.getItems_limit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getItems_limit()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GroupedListsSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getItems_limit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getItems_limit()));
                }
                AbstractList.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getLists());
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GroupedListsSection decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GroupedListsSection(strDecode, arrayList, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(AbstractList.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GroupedListsSection redact(GroupedListsSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GroupedListsSection.copy$default(value, null, Internal.m26823redactElements(value.getLists(), AbstractList.ADAPTER), 0, ByteString.EMPTY, 5, null);
            }
        };
    }
}
