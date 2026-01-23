package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.ListsContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ListsContext.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010(\u001a\u00020\u0002H\u0017J\u0013\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\bH\u0016J\b\u0010-\u001a\u00020\u000bH\u0016J\u0082\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010#R\u0016\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContext;", "Lcom/squareup/wire/Message;", "", "add_to_list_flow", "Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow;", "list_filters", "Lcom/robinhood/rosetta/eventlogging/ListFilters;", "num_items_added", "", "num_items_removed", "added_item_identifiers", "", "removed_item_identifiers", "num_items", "is_options_watchlist", "", "num_active_items", "num_expired_items", "list_sort", "Lcom/robinhood/rosetta/eventlogging/ListSort;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow;Lcom/robinhood/rosetta/eventlogging/ListFilters;IILjava/lang/String;Ljava/lang/String;IZIILcom/robinhood/rosetta/eventlogging/ListSort;Lokio/ByteString;)V", "getAdd_to_list_flow", "()Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow;", "getList_filters", "()Lcom/robinhood/rosetta/eventlogging/ListFilters;", "getNum_items_added", "()I", "getNum_items_removed", "getAdded_item_identifiers", "()Ljava/lang/String;", "getRemoved_item_identifiers", "getNum_items", "()Z", "getNum_active_items", "getNum_expired_items", "getList_sort", "()Lcom/robinhood/rosetta/eventlogging/ListSort;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "AddToListFlow", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ListsContext extends Message {

    @JvmField
    public static final ProtoAdapter<ListsContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ListsContext$AddToListFlow#ADAPTER", jsonName = "addToListFlow", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AddToListFlow add_to_list_flow;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "addedItemIdentifiers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String added_item_identifiers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isOptionsWatchlist", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean is_options_watchlist;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ListFilters#ADAPTER", jsonName = "listFilters", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ListFilters list_filters;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ListSort#ADAPTER", jsonName = "listSort", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final ListSort list_sort;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numActiveItems", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final int num_active_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numExpiredItems", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final int num_expired_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numItems", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int num_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numItemsAdded", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int num_items_added;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numItemsRemoved", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int num_items_removed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "removedItemIdentifiers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String removed_item_identifiers;

    public ListsContext() {
        this(null, null, 0, 0, null, null, 0, false, 0, 0, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24348newBuilder();
    }

    public final AddToListFlow getAdd_to_list_flow() {
        return this.add_to_list_flow;
    }

    public /* synthetic */ ListsContext(AddToListFlow addToListFlow, ListFilters listFilters, int i, int i2, String str, String str2, int i3, boolean z, int i4, int i5, ListSort listSort, ByteString byteString, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? AddToListFlow.ADD_TO_LIST_FLOW_UNSPECIFIED : addToListFlow, (i6 & 2) != 0 ? null : listFilters, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? "" : str, (i6 & 32) == 0 ? str2 : "", (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? false : z, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) == 0 ? i5 : 0, (i6 & 1024) == 0 ? listSort : null, (i6 & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ListFilters getList_filters() {
        return this.list_filters;
    }

    public final int getNum_items_added() {
        return this.num_items_added;
    }

    public final int getNum_items_removed() {
        return this.num_items_removed;
    }

    public final String getAdded_item_identifiers() {
        return this.added_item_identifiers;
    }

    public final String getRemoved_item_identifiers() {
        return this.removed_item_identifiers;
    }

    public final int getNum_items() {
        return this.num_items;
    }

    /* renamed from: is_options_watchlist, reason: from getter */
    public final boolean getIs_options_watchlist() {
        return this.is_options_watchlist;
    }

    public final int getNum_active_items() {
        return this.num_active_items;
    }

    public final int getNum_expired_items() {
        return this.num_expired_items;
    }

    public final ListSort getList_sort() {
        return this.list_sort;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListsContext(AddToListFlow add_to_list_flow, ListFilters listFilters, int i, int i2, String added_item_identifiers, String removed_item_identifiers, int i3, boolean z, int i4, int i5, ListSort listSort, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(add_to_list_flow, "add_to_list_flow");
        Intrinsics.checkNotNullParameter(added_item_identifiers, "added_item_identifiers");
        Intrinsics.checkNotNullParameter(removed_item_identifiers, "removed_item_identifiers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.add_to_list_flow = add_to_list_flow;
        this.list_filters = listFilters;
        this.num_items_added = i;
        this.num_items_removed = i2;
        this.added_item_identifiers = added_item_identifiers;
        this.removed_item_identifiers = removed_item_identifiers;
        this.num_items = i3;
        this.is_options_watchlist = z;
        this.num_active_items = i4;
        this.num_expired_items = i5;
        this.list_sort = listSort;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24348newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListsContext)) {
            return false;
        }
        ListsContext listsContext = (ListsContext) other;
        return Intrinsics.areEqual(unknownFields(), listsContext.unknownFields()) && this.add_to_list_flow == listsContext.add_to_list_flow && Intrinsics.areEqual(this.list_filters, listsContext.list_filters) && this.num_items_added == listsContext.num_items_added && this.num_items_removed == listsContext.num_items_removed && Intrinsics.areEqual(this.added_item_identifiers, listsContext.added_item_identifiers) && Intrinsics.areEqual(this.removed_item_identifiers, listsContext.removed_item_identifiers) && this.num_items == listsContext.num_items && this.is_options_watchlist == listsContext.is_options_watchlist && this.num_active_items == listsContext.num_active_items && this.num_expired_items == listsContext.num_expired_items && Intrinsics.areEqual(this.list_sort, listsContext.list_sort);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.add_to_list_flow.hashCode()) * 37;
        ListFilters listFilters = this.list_filters;
        int iHashCode2 = (((((((((((((((((iHashCode + (listFilters != null ? listFilters.hashCode() : 0)) * 37) + Integer.hashCode(this.num_items_added)) * 37) + Integer.hashCode(this.num_items_removed)) * 37) + this.added_item_identifiers.hashCode()) * 37) + this.removed_item_identifiers.hashCode()) * 37) + Integer.hashCode(this.num_items)) * 37) + java.lang.Boolean.hashCode(this.is_options_watchlist)) * 37) + Integer.hashCode(this.num_active_items)) * 37) + Integer.hashCode(this.num_expired_items)) * 37;
        ListSort listSort = this.list_sort;
        int iHashCode3 = iHashCode2 + (listSort != null ? listSort.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("add_to_list_flow=" + this.add_to_list_flow);
        ListFilters listFilters = this.list_filters;
        if (listFilters != null) {
            arrayList.add("list_filters=" + listFilters);
        }
        arrayList.add("num_items_added=" + this.num_items_added);
        arrayList.add("num_items_removed=" + this.num_items_removed);
        arrayList.add("added_item_identifiers=" + Internal.sanitize(this.added_item_identifiers));
        arrayList.add("removed_item_identifiers=" + Internal.sanitize(this.removed_item_identifiers));
        arrayList.add("num_items=" + this.num_items);
        arrayList.add("is_options_watchlist=" + this.is_options_watchlist);
        arrayList.add("num_active_items=" + this.num_active_items);
        arrayList.add("num_expired_items=" + this.num_expired_items);
        ListSort listSort = this.list_sort;
        if (listSort != null) {
            arrayList.add("list_sort=" + listSort);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListsContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ListsContext copy$default(ListsContext listsContext, AddToListFlow addToListFlow, ListFilters listFilters, int i, int i2, String str, String str2, int i3, boolean z, int i4, int i5, ListSort listSort, ByteString byteString, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            addToListFlow = listsContext.add_to_list_flow;
        }
        if ((i6 & 2) != 0) {
            listFilters = listsContext.list_filters;
        }
        if ((i6 & 4) != 0) {
            i = listsContext.num_items_added;
        }
        if ((i6 & 8) != 0) {
            i2 = listsContext.num_items_removed;
        }
        if ((i6 & 16) != 0) {
            str = listsContext.added_item_identifiers;
        }
        if ((i6 & 32) != 0) {
            str2 = listsContext.removed_item_identifiers;
        }
        if ((i6 & 64) != 0) {
            i3 = listsContext.num_items;
        }
        if ((i6 & 128) != 0) {
            z = listsContext.is_options_watchlist;
        }
        if ((i6 & 256) != 0) {
            i4 = listsContext.num_active_items;
        }
        if ((i6 & 512) != 0) {
            i5 = listsContext.num_expired_items;
        }
        if ((i6 & 1024) != 0) {
            listSort = listsContext.list_sort;
        }
        if ((i6 & 2048) != 0) {
            byteString = listsContext.unknownFields();
        }
        ListSort listSort2 = listSort;
        ByteString byteString2 = byteString;
        int i7 = i4;
        int i8 = i5;
        int i9 = i3;
        boolean z2 = z;
        String str3 = str;
        String str4 = str2;
        return listsContext.copy(addToListFlow, listFilters, i, i2, str3, str4, i9, z2, i7, i8, listSort2, byteString2);
    }

    public final ListsContext copy(AddToListFlow add_to_list_flow, ListFilters list_filters, int num_items_added, int num_items_removed, String added_item_identifiers, String removed_item_identifiers, int num_items, boolean is_options_watchlist, int num_active_items, int num_expired_items, ListSort list_sort, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(add_to_list_flow, "add_to_list_flow");
        Intrinsics.checkNotNullParameter(added_item_identifiers, "added_item_identifiers");
        Intrinsics.checkNotNullParameter(removed_item_identifiers, "removed_item_identifiers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListsContext(add_to_list_flow, list_filters, num_items_added, num_items_removed, added_item_identifiers, removed_item_identifiers, num_items, is_options_watchlist, num_active_items, num_expired_items, list_sort, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListsContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListsContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ListsContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAdd_to_list_flow() != ListsContext.AddToListFlow.ADD_TO_LIST_FLOW_UNSPECIFIED) {
                    size += ListsContext.AddToListFlow.ADAPTER.encodedSizeWithTag(1, value.getAdd_to_list_flow());
                }
                if (value.getList_filters() != null) {
                    size += ListFilters.ADAPTER.encodedSizeWithTag(2, value.getList_filters());
                }
                if (value.getNum_items_added() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getNum_items_added()));
                }
                if (value.getNum_items_removed() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getNum_items_removed()));
                }
                if (!Intrinsics.areEqual(value.getAdded_item_identifiers(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAdded_item_identifiers());
                }
                if (!Intrinsics.areEqual(value.getRemoved_item_identifiers(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getRemoved_item_identifiers());
                }
                if (value.getNum_items() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getNum_items()));
                }
                if (value.getIs_options_watchlist()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(8, java.lang.Boolean.valueOf(value.getIs_options_watchlist()));
                }
                if (value.getNum_active_items() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.getNum_active_items()));
                }
                if (value.getNum_expired_items() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(10, Integer.valueOf(value.getNum_expired_items()));
                }
                return value.getList_sort() != null ? size + ListSort.ADAPTER.encodedSizeWithTag(11, value.getList_sort()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAdd_to_list_flow() != ListsContext.AddToListFlow.ADD_TO_LIST_FLOW_UNSPECIFIED) {
                    ListsContext.AddToListFlow.ADAPTER.encodeWithTag(writer, 1, (int) value.getAdd_to_list_flow());
                }
                if (value.getList_filters() != null) {
                    ListFilters.ADAPTER.encodeWithTag(writer, 2, (int) value.getList_filters());
                }
                if (value.getNum_items_added() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getNum_items_added()));
                }
                if (value.getNum_items_removed() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getNum_items_removed()));
                }
                if (!Intrinsics.areEqual(value.getAdded_item_identifiers(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAdded_item_identifiers());
                }
                if (!Intrinsics.areEqual(value.getRemoved_item_identifiers(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getRemoved_item_identifiers());
                }
                if (value.getNum_items() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getNum_items()));
                }
                if (value.getIs_options_watchlist()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) java.lang.Boolean.valueOf(value.getIs_options_watchlist()));
                }
                if (value.getNum_active_items() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getNum_active_items()));
                }
                if (value.getNum_expired_items() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) Integer.valueOf(value.getNum_expired_items()));
                }
                if (value.getList_sort() != null) {
                    ListSort.ADAPTER.encodeWithTag(writer, 11, (int) value.getList_sort());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getList_sort() != null) {
                    ListSort.ADAPTER.encodeWithTag(writer, 11, (int) value.getList_sort());
                }
                if (value.getNum_expired_items() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) Integer.valueOf(value.getNum_expired_items()));
                }
                if (value.getNum_active_items() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getNum_active_items()));
                }
                if (value.getIs_options_watchlist()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) java.lang.Boolean.valueOf(value.getIs_options_watchlist()));
                }
                if (value.getNum_items() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getNum_items()));
                }
                if (!Intrinsics.areEqual(value.getRemoved_item_identifiers(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getRemoved_item_identifiers());
                }
                if (!Intrinsics.areEqual(value.getAdded_item_identifiers(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAdded_item_identifiers());
                }
                if (value.getNum_items_removed() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getNum_items_removed()));
                }
                if (value.getNum_items_added() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getNum_items_added()));
                }
                if (value.getList_filters() != null) {
                    ListFilters.ADAPTER.encodeWithTag(writer, 2, (int) value.getList_filters());
                }
                if (value.getAdd_to_list_flow() != ListsContext.AddToListFlow.ADD_TO_LIST_FLOW_UNSPECIFIED) {
                    ListsContext.AddToListFlow.ADAPTER.encodeWithTag(writer, 1, (int) value.getAdd_to_list_flow());
                }
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0025. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public com.robinhood.rosetta.eventlogging.ListsContext decode(com.squareup.wire.ProtoReader r21) {
                /*
                    Method dump skipped, instructions count: 254
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ListsContext3.decode(com.squareup.wire.ProtoReader):com.robinhood.rosetta.eventlogging.ListsContext");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListsContext redact(ListsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ListFilters list_filters = value.getList_filters();
                ListFilters listFiltersRedact = list_filters != null ? ListFilters.ADAPTER.redact(list_filters) : null;
                ListSort list_sort = value.getList_sort();
                return ListsContext.copy$default(value, null, listFiltersRedact, 0, 0, null, null, 0, false, 0, 0, list_sort != null ? ListSort.ADAPTER.redact(list_sort) : null, ByteString.EMPTY, 1021, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListsContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ADD_TO_LIST_FLOW_UNSPECIFIED", "INSTANT", "SINGLE_SELECTION", "MULTI_SELECTION", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AddToListFlow implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AddToListFlow[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AddToListFlow> ADAPTER;
        public static final AddToListFlow ADD_TO_LIST_FLOW_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AddToListFlow INSTANT;
        public static final AddToListFlow MULTI_SELECTION;
        public static final AddToListFlow SINGLE_SELECTION;
        private final int value;

        private static final /* synthetic */ AddToListFlow[] $values() {
            return new AddToListFlow[]{ADD_TO_LIST_FLOW_UNSPECIFIED, INSTANT, SINGLE_SELECTION, MULTI_SELECTION};
        }

        @JvmStatic
        public static final AddToListFlow fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AddToListFlow> getEntries() {
            return $ENTRIES;
        }

        private AddToListFlow(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AddToListFlow addToListFlow = new AddToListFlow("ADD_TO_LIST_FLOW_UNSPECIFIED", 0, 0);
            ADD_TO_LIST_FLOW_UNSPECIFIED = addToListFlow;
            INSTANT = new AddToListFlow("INSTANT", 1, 1);
            SINGLE_SELECTION = new AddToListFlow("SINGLE_SELECTION", 2, 2);
            MULTI_SELECTION = new AddToListFlow("MULTI_SELECTION", 3, 3);
            AddToListFlow[] addToListFlowArr$values = $values();
            $VALUES = addToListFlowArr$values;
            $ENTRIES = EnumEntries2.enumEntries(addToListFlowArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AddToListFlow.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AddToListFlow>(orCreateKotlinClass, syntax, addToListFlow) { // from class: com.robinhood.rosetta.eventlogging.ListsContext$AddToListFlow$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ListsContext.AddToListFlow fromValue(int value) {
                    return ListsContext.AddToListFlow.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ListsContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AddToListFlow fromValue(int value) {
                if (value == 0) {
                    return AddToListFlow.ADD_TO_LIST_FLOW_UNSPECIFIED;
                }
                if (value == 1) {
                    return AddToListFlow.INSTANT;
                }
                if (value == 2) {
                    return AddToListFlow.SINGLE_SELECTION;
                }
                if (value != 3) {
                    return null;
                }
                return AddToListFlow.MULTI_SELECTION;
            }
        }

        public static AddToListFlow valueOf(String str) {
            return (AddToListFlow) Enum.valueOf(AddToListFlow.class, str);
        }

        public static AddToListFlow[] values() {
            return (AddToListFlow[]) $VALUES.clone();
        }
    }
}
