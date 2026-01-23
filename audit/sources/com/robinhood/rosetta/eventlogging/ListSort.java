package com.robinhood.rosetta.eventlogging;

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

/* compiled from: ListSort.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListSort;", "Lcom/squareup/wire/Message;", "", "sort_field", "", "sort_direction", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getSort_field", "()Ljava/lang/String;", "getSort_direction", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ListSort extends Message {

    @JvmField
    public static final ProtoAdapter<ListSort> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sortDirection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String sort_direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sortField", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String sort_field;

    public ListSort() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ ListSort(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24346newBuilder();
    }

    public final String getSort_field() {
        return this.sort_field;
    }

    public final String getSort_direction() {
        return this.sort_direction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListSort(String sort_field, String sort_direction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(sort_field, "sort_field");
        Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.sort_field = sort_field;
        this.sort_direction = sort_direction;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24346newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListSort)) {
            return false;
        }
        ListSort listSort = (ListSort) other;
        return Intrinsics.areEqual(unknownFields(), listSort.unknownFields()) && Intrinsics.areEqual(this.sort_field, listSort.sort_field) && Intrinsics.areEqual(this.sort_direction, listSort.sort_direction);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.sort_field.hashCode()) * 37) + this.sort_direction.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sort_field=" + Internal.sanitize(this.sort_field));
        arrayList.add("sort_direction=" + Internal.sanitize(this.sort_direction));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListSort{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ListSort copy$default(ListSort listSort, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listSort.sort_field;
        }
        if ((i & 2) != 0) {
            str2 = listSort.sort_direction;
        }
        if ((i & 4) != 0) {
            byteString = listSort.unknownFields();
        }
        return listSort.copy(str, str2, byteString);
    }

    public final ListSort copy(String sort_field, String sort_direction, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(sort_field, "sort_field");
        Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListSort(sort_field, sort_direction, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListSort.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListSort>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ListSort$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListSort value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSort_field(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSort_field());
                }
                return !Intrinsics.areEqual(value.getSort_direction(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSort_direction()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListSort value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSort_field(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSort_field());
                }
                if (!Intrinsics.areEqual(value.getSort_direction(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSort_direction());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListSort value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSort_direction(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSort_direction());
                }
                if (Intrinsics.areEqual(value.getSort_field(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSort_field());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListSort redact(ListSort value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ListSort.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ListSort decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListSort(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
