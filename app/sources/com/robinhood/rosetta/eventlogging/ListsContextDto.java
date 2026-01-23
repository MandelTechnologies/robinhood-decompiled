package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.ListFiltersDto;
import com.robinhood.rosetta.eventlogging.ListSortDto;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.ListsContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ListsContextDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005789:;B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B{\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0006\u0010\u0019Jx\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020\u0010H\u0016J\u0013\u0010-\u001a\u00020\u00142\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u00020\rH\u0016J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\rH\u0016J\b\u00106\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010%R\u0011\u0010\u0015\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ListsContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ListsContextDto$Surrogate;)V", "add_to_list_flow", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "list_filters", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto;", "num_items_added", "", "num_items_removed", "added_item_identifiers", "", "removed_item_identifiers", "num_items", "is_options_watchlist", "", "num_active_items", "num_expired_items", "list_sort", "Lcom/robinhood/rosetta/eventlogging/ListSortDto;", "(Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto;IILjava/lang/String;Ljava/lang/String;IZIILcom/robinhood/rosetta/eventlogging/ListSortDto;)V", "getAdd_to_list_flow", "()Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "getList_filters", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto;", "getNum_items_added", "()I", "getNum_items_removed", "getAdded_item_identifiers", "()Ljava/lang/String;", "getRemoved_item_identifiers", "getNum_items", "()Z", "getNum_active_items", "getNum_expired_items", "getList_sort", "()Lcom/robinhood/rosetta/eventlogging/ListSortDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "AddToListFlowDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ListsContextDto implements Dto3<ListsContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ListsContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ListsContextDto, ListsContext>> binaryBase64Serializer$delegate;
    private static final ListsContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ListsContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ListsContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AddToListFlowDto getAdd_to_list_flow() {
        return this.surrogate.getAdd_to_list_flow();
    }

    public final ListFiltersDto getList_filters() {
        return this.surrogate.getList_filters();
    }

    public final int getNum_items_added() {
        return this.surrogate.getNum_items_added();
    }

    public final int getNum_items_removed() {
        return this.surrogate.getNum_items_removed();
    }

    public final String getAdded_item_identifiers() {
        return this.surrogate.getAdded_item_identifiers();
    }

    public final String getRemoved_item_identifiers() {
        return this.surrogate.getRemoved_item_identifiers();
    }

    public final int getNum_items() {
        return this.surrogate.getNum_items();
    }

    public final boolean is_options_watchlist() {
        return this.surrogate.is_options_watchlist();
    }

    public final int getNum_active_items() {
        return this.surrogate.getNum_active_items();
    }

    public final int getNum_expired_items() {
        return this.surrogate.getNum_expired_items();
    }

    public final ListSortDto getList_sort() {
        return this.surrogate.getList_sort();
    }

    public /* synthetic */ ListsContextDto(AddToListFlowDto addToListFlowDto, ListFiltersDto listFiltersDto, int i, int i2, String str, String str2, int i3, boolean z, int i4, int i5, ListSortDto listSortDto, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? AddToListFlowDto.INSTANCE.getZeroValue() : addToListFlowDto, (i6 & 2) != 0 ? null : listFiltersDto, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? "" : str, (i6 & 32) == 0 ? str2 : "", (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? false : z, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) == 0 ? i5 : 0, (i6 & 1024) != 0 ? null : listSortDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListsContextDto(AddToListFlowDto add_to_list_flow, ListFiltersDto listFiltersDto, int i, int i2, String added_item_identifiers, String removed_item_identifiers, int i3, boolean z, int i4, int i5, ListSortDto listSortDto) {
        this(new Surrogate(add_to_list_flow, listFiltersDto, i, i2, added_item_identifiers, removed_item_identifiers, i3, z, i4, i5, listSortDto));
        Intrinsics.checkNotNullParameter(add_to_list_flow, "add_to_list_flow");
        Intrinsics.checkNotNullParameter(added_item_identifiers, "added_item_identifiers");
        Intrinsics.checkNotNullParameter(removed_item_identifiers, "removed_item_identifiers");
    }

    public static /* synthetic */ ListsContextDto copy$default(ListsContextDto listsContextDto, AddToListFlowDto addToListFlowDto, ListFiltersDto listFiltersDto, int i, int i2, String str, String str2, int i3, boolean z, int i4, int i5, ListSortDto listSortDto, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            addToListFlowDto = listsContextDto.surrogate.getAdd_to_list_flow();
        }
        if ((i6 & 2) != 0) {
            listFiltersDto = listsContextDto.surrogate.getList_filters();
        }
        if ((i6 & 4) != 0) {
            i = listsContextDto.surrogate.getNum_items_added();
        }
        if ((i6 & 8) != 0) {
            i2 = listsContextDto.surrogate.getNum_items_removed();
        }
        if ((i6 & 16) != 0) {
            str = listsContextDto.surrogate.getAdded_item_identifiers();
        }
        if ((i6 & 32) != 0) {
            str2 = listsContextDto.surrogate.getRemoved_item_identifiers();
        }
        if ((i6 & 64) != 0) {
            i3 = listsContextDto.surrogate.getNum_items();
        }
        if ((i6 & 128) != 0) {
            z = listsContextDto.surrogate.is_options_watchlist();
        }
        if ((i6 & 256) != 0) {
            i4 = listsContextDto.surrogate.getNum_active_items();
        }
        if ((i6 & 512) != 0) {
            i5 = listsContextDto.surrogate.getNum_expired_items();
        }
        if ((i6 & 1024) != 0) {
            listSortDto = listsContextDto.surrogate.getList_sort();
        }
        int i7 = i5;
        ListSortDto listSortDto2 = listSortDto;
        boolean z2 = z;
        int i8 = i4;
        String str3 = str2;
        int i9 = i3;
        String str4 = str;
        int i10 = i;
        return listsContextDto.copy(addToListFlowDto, listFiltersDto, i10, i2, str4, str3, i9, z2, i8, i7, listSortDto2);
    }

    public final ListsContextDto copy(AddToListFlowDto add_to_list_flow, ListFiltersDto list_filters, int num_items_added, int num_items_removed, String added_item_identifiers, String removed_item_identifiers, int num_items, boolean is_options_watchlist, int num_active_items, int num_expired_items, ListSortDto list_sort) {
        Intrinsics.checkNotNullParameter(add_to_list_flow, "add_to_list_flow");
        Intrinsics.checkNotNullParameter(added_item_identifiers, "added_item_identifiers");
        Intrinsics.checkNotNullParameter(removed_item_identifiers, "removed_item_identifiers");
        return new ListsContextDto(new Surrogate(add_to_list_flow, list_filters, num_items_added, num_items_removed, added_item_identifiers, removed_item_identifiers, num_items, is_options_watchlist, num_active_items, num_expired_items, list_sort));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ListsContext toProto() {
        ListsContext.AddToListFlow addToListFlow = (ListsContext.AddToListFlow) this.surrogate.getAdd_to_list_flow().toProto();
        ListFiltersDto list_filters = this.surrogate.getList_filters();
        ListFilters proto = list_filters != null ? list_filters.toProto() : null;
        int num_items_added = this.surrogate.getNum_items_added();
        int num_items_removed = this.surrogate.getNum_items_removed();
        String added_item_identifiers = this.surrogate.getAdded_item_identifiers();
        String removed_item_identifiers = this.surrogate.getRemoved_item_identifiers();
        int num_items = this.surrogate.getNum_items();
        boolean zIs_options_watchlist = this.surrogate.is_options_watchlist();
        int num_active_items = this.surrogate.getNum_active_items();
        int num_expired_items = this.surrogate.getNum_expired_items();
        ListSortDto list_sort = this.surrogate.getList_sort();
        return new ListsContext(addToListFlow, proto, num_items_added, num_items_removed, added_item_identifiers, removed_item_identifiers, num_items, zIs_options_watchlist, num_active_items, num_expired_items, list_sort != null ? list_sort.toProto() : null, null, 2048, null);
    }

    public String toString() {
        return "[ListsContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ListsContextDto) && Intrinsics.areEqual(((ListsContextDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 Q2\u00020\u0001:\u0002PQBÄ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017B}\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001bJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0018\u0010:\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010;\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\u0018\u0010>\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u0010?\u001a\u00020\u0011HÆ\u0003J\u0018\u0010@\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010A\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0015HÆ\u0003JÆ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0017\b\u0002\u0010\u000f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0017\b\u0002\u0010\u0012\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u0013\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010D\u001a\u00020\u00112\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0007HÖ\u0001J\t\u0010G\u001a\u00020\rHÖ\u0001J%\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0001¢\u0006\u0002\bOR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010%R+\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010%R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010*R\u001c\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010*R+\u0010\u000f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010%R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001d\u001a\u0004\b\u0010\u00100R+\u0010\u0012\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010%R+\u0010\u0013\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010%R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u001d\u001a\u0004\b6\u00107¨\u0006R"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContextDto$Surrogate;", "", "add_to_list_flow", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "list_filters", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto;", "num_items_added", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "num_items_removed", "added_item_identifiers", "", "removed_item_identifiers", "num_items", "is_options_watchlist", "", "num_active_items", "num_expired_items", "list_sort", "Lcom/robinhood/rosetta/eventlogging/ListSortDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto;IILjava/lang/String;Ljava/lang/String;IZIILcom/robinhood/rosetta/eventlogging/ListSortDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto;IILjava/lang/String;Ljava/lang/String;IZIILcom/robinhood/rosetta/eventlogging/ListSortDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAdd_to_list_flow$annotations", "()V", "getAdd_to_list_flow", "()Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "getList_filters$annotations", "getList_filters", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto;", "getNum_items_added$annotations", "getNum_items_added", "()I", "getNum_items_removed$annotations", "getNum_items_removed", "getAdded_item_identifiers$annotations", "getAdded_item_identifiers", "()Ljava/lang/String;", "getRemoved_item_identifiers$annotations", "getRemoved_item_identifiers", "getNum_items$annotations", "getNum_items", "is_options_watchlist$annotations", "()Z", "getNum_active_items$annotations", "getNum_active_items", "getNum_expired_items$annotations", "getNum_expired_items", "getList_sort$annotations", "getList_sort", "()Lcom/robinhood/rosetta/eventlogging/ListSortDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AddToListFlowDto add_to_list_flow;
        private final String added_item_identifiers;
        private final boolean is_options_watchlist;
        private final ListFiltersDto list_filters;
        private final ListSortDto list_sort;
        private final int num_active_items;
        private final int num_expired_items;
        private final int num_items;
        private final int num_items_added;
        private final int num_items_removed;
        private final String removed_item_identifiers;

        public Surrogate() {
            this((AddToListFlowDto) null, (ListFiltersDto) null, 0, 0, (String) null, (String) null, 0, false, 0, 0, (ListSortDto) null, 2047, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, AddToListFlowDto addToListFlowDto, ListFiltersDto listFiltersDto, int i, int i2, String str, String str2, int i3, boolean z, int i4, int i5, ListSortDto listSortDto, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                addToListFlowDto = surrogate.add_to_list_flow;
            }
            if ((i6 & 2) != 0) {
                listFiltersDto = surrogate.list_filters;
            }
            if ((i6 & 4) != 0) {
                i = surrogate.num_items_added;
            }
            if ((i6 & 8) != 0) {
                i2 = surrogate.num_items_removed;
            }
            if ((i6 & 16) != 0) {
                str = surrogate.added_item_identifiers;
            }
            if ((i6 & 32) != 0) {
                str2 = surrogate.removed_item_identifiers;
            }
            if ((i6 & 64) != 0) {
                i3 = surrogate.num_items;
            }
            if ((i6 & 128) != 0) {
                z = surrogate.is_options_watchlist;
            }
            if ((i6 & 256) != 0) {
                i4 = surrogate.num_active_items;
            }
            if ((i6 & 512) != 0) {
                i5 = surrogate.num_expired_items;
            }
            if ((i6 & 1024) != 0) {
                listSortDto = surrogate.list_sort;
            }
            int i7 = i5;
            ListSortDto listSortDto2 = listSortDto;
            boolean z2 = z;
            int i8 = i4;
            String str3 = str2;
            int i9 = i3;
            String str4 = str;
            int i10 = i;
            return surrogate.copy(addToListFlowDto, listFiltersDto, i10, i2, str4, str3, i9, z2, i8, i7, listSortDto2);
        }

        @SerialName("addToListFlow")
        @JsonAnnotations2(names = {"add_to_list_flow"})
        public static /* synthetic */ void getAdd_to_list_flow$annotations() {
        }

        @SerialName("addedItemIdentifiers")
        @JsonAnnotations2(names = {"added_item_identifiers"})
        public static /* synthetic */ void getAdded_item_identifiers$annotations() {
        }

        @SerialName("listFilters")
        @JsonAnnotations2(names = {"list_filters"})
        public static /* synthetic */ void getList_filters$annotations() {
        }

        @SerialName("listSort")
        @JsonAnnotations2(names = {"list_sort"})
        public static /* synthetic */ void getList_sort$annotations() {
        }

        @SerialName("numActiveItems")
        @JsonAnnotations2(names = {"num_active_items"})
        public static /* synthetic */ void getNum_active_items$annotations() {
        }

        @SerialName("numExpiredItems")
        @JsonAnnotations2(names = {"num_expired_items"})
        public static /* synthetic */ void getNum_expired_items$annotations() {
        }

        @SerialName("numItems")
        @JsonAnnotations2(names = {"num_items"})
        public static /* synthetic */ void getNum_items$annotations() {
        }

        @SerialName("numItemsAdded")
        @JsonAnnotations2(names = {"num_items_added"})
        public static /* synthetic */ void getNum_items_added$annotations() {
        }

        @SerialName("numItemsRemoved")
        @JsonAnnotations2(names = {"num_items_removed"})
        public static /* synthetic */ void getNum_items_removed$annotations() {
        }

        @SerialName("removedItemIdentifiers")
        @JsonAnnotations2(names = {"removed_item_identifiers"})
        public static /* synthetic */ void getRemoved_item_identifiers$annotations() {
        }

        @SerialName("isOptionsWatchlist")
        @JsonAnnotations2(names = {"is_options_watchlist"})
        public static /* synthetic */ void is_options_watchlist$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final AddToListFlowDto getAdd_to_list_flow() {
            return this.add_to_list_flow;
        }

        /* renamed from: component10, reason: from getter */
        public final int getNum_expired_items() {
            return this.num_expired_items;
        }

        /* renamed from: component11, reason: from getter */
        public final ListSortDto getList_sort() {
            return this.list_sort;
        }

        /* renamed from: component2, reason: from getter */
        public final ListFiltersDto getList_filters() {
            return this.list_filters;
        }

        /* renamed from: component3, reason: from getter */
        public final int getNum_items_added() {
            return this.num_items_added;
        }

        /* renamed from: component4, reason: from getter */
        public final int getNum_items_removed() {
            return this.num_items_removed;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAdded_item_identifiers() {
            return this.added_item_identifiers;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRemoved_item_identifiers() {
            return this.removed_item_identifiers;
        }

        /* renamed from: component7, reason: from getter */
        public final int getNum_items() {
            return this.num_items;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIs_options_watchlist() {
            return this.is_options_watchlist;
        }

        /* renamed from: component9, reason: from getter */
        public final int getNum_active_items() {
            return this.num_active_items;
        }

        public final Surrogate copy(AddToListFlowDto add_to_list_flow, ListFiltersDto list_filters, int num_items_added, int num_items_removed, String added_item_identifiers, String removed_item_identifiers, int num_items, boolean is_options_watchlist, int num_active_items, int num_expired_items, ListSortDto list_sort) {
            Intrinsics.checkNotNullParameter(add_to_list_flow, "add_to_list_flow");
            Intrinsics.checkNotNullParameter(added_item_identifiers, "added_item_identifiers");
            Intrinsics.checkNotNullParameter(removed_item_identifiers, "removed_item_identifiers");
            return new Surrogate(add_to_list_flow, list_filters, num_items_added, num_items_removed, added_item_identifiers, removed_item_identifiers, num_items, is_options_watchlist, num_active_items, num_expired_items, list_sort);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.add_to_list_flow == surrogate.add_to_list_flow && Intrinsics.areEqual(this.list_filters, surrogate.list_filters) && this.num_items_added == surrogate.num_items_added && this.num_items_removed == surrogate.num_items_removed && Intrinsics.areEqual(this.added_item_identifiers, surrogate.added_item_identifiers) && Intrinsics.areEqual(this.removed_item_identifiers, surrogate.removed_item_identifiers) && this.num_items == surrogate.num_items && this.is_options_watchlist == surrogate.is_options_watchlist && this.num_active_items == surrogate.num_active_items && this.num_expired_items == surrogate.num_expired_items && Intrinsics.areEqual(this.list_sort, surrogate.list_sort);
        }

        public int hashCode() {
            int iHashCode = this.add_to_list_flow.hashCode() * 31;
            ListFiltersDto listFiltersDto = this.list_filters;
            int iHashCode2 = (((((((((((((((((iHashCode + (listFiltersDto == null ? 0 : listFiltersDto.hashCode())) * 31) + Integer.hashCode(this.num_items_added)) * 31) + Integer.hashCode(this.num_items_removed)) * 31) + this.added_item_identifiers.hashCode()) * 31) + this.removed_item_identifiers.hashCode()) * 31) + Integer.hashCode(this.num_items)) * 31) + java.lang.Boolean.hashCode(this.is_options_watchlist)) * 31) + Integer.hashCode(this.num_active_items)) * 31) + Integer.hashCode(this.num_expired_items)) * 31;
            ListSortDto listSortDto = this.list_sort;
            return iHashCode2 + (listSortDto != null ? listSortDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(add_to_list_flow=" + this.add_to_list_flow + ", list_filters=" + this.list_filters + ", num_items_added=" + this.num_items_added + ", num_items_removed=" + this.num_items_removed + ", added_item_identifiers=" + this.added_item_identifiers + ", removed_item_identifiers=" + this.removed_item_identifiers + ", num_items=" + this.num_items + ", is_options_watchlist=" + this.is_options_watchlist + ", num_active_items=" + this.num_active_items + ", num_expired_items=" + this.num_expired_items + ", list_sort=" + this.list_sort + ")";
        }

        /* compiled from: ListsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ListsContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AddToListFlowDto addToListFlowDto, ListFiltersDto listFiltersDto, int i2, int i3, String str, String str2, int i4, boolean z, int i5, int i6, ListSortDto listSortDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.add_to_list_flow = (i & 1) == 0 ? AddToListFlowDto.INSTANCE.getZeroValue() : addToListFlowDto;
            if ((i & 2) == 0) {
                this.list_filters = null;
            } else {
                this.list_filters = listFiltersDto;
            }
            if ((i & 4) == 0) {
                this.num_items_added = 0;
            } else {
                this.num_items_added = i2;
            }
            if ((i & 8) == 0) {
                this.num_items_removed = 0;
            } else {
                this.num_items_removed = i3;
            }
            if ((i & 16) == 0) {
                this.added_item_identifiers = "";
            } else {
                this.added_item_identifiers = str;
            }
            if ((i & 32) == 0) {
                this.removed_item_identifiers = "";
            } else {
                this.removed_item_identifiers = str2;
            }
            if ((i & 64) == 0) {
                this.num_items = 0;
            } else {
                this.num_items = i4;
            }
            if ((i & 128) == 0) {
                this.is_options_watchlist = false;
            } else {
                this.is_options_watchlist = z;
            }
            if ((i & 256) == 0) {
                this.num_active_items = 0;
            } else {
                this.num_active_items = i5;
            }
            if ((i & 512) == 0) {
                this.num_expired_items = 0;
            } else {
                this.num_expired_items = i6;
            }
            if ((i & 1024) == 0) {
                this.list_sort = null;
            } else {
                this.list_sort = listSortDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.add_to_list_flow != AddToListFlowDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, AddToListFlowDto.Serializer.INSTANCE, self.add_to_list_flow);
            }
            ListFiltersDto listFiltersDto = self.list_filters;
            if (listFiltersDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ListFiltersDto.Serializer.INSTANCE, listFiltersDto);
            }
            int i = self.num_items_added;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.num_items_removed;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (!Intrinsics.areEqual(self.added_item_identifiers, "")) {
                output.encodeStringElement(serialDesc, 4, self.added_item_identifiers);
            }
            if (!Intrinsics.areEqual(self.removed_item_identifiers, "")) {
                output.encodeStringElement(serialDesc, 5, self.removed_item_identifiers);
            }
            int i3 = self.num_items;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            boolean z = self.is_options_watchlist;
            if (z) {
                output.encodeBooleanElement(serialDesc, 7, z);
            }
            int i4 = self.num_active_items;
            if (i4 != 0) {
                output.encodeSerializableElement(serialDesc, 8, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i4));
            }
            int i5 = self.num_expired_items;
            if (i5 != 0) {
                output.encodeSerializableElement(serialDesc, 9, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i5));
            }
            ListSortDto listSortDto = self.list_sort;
            if (listSortDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, ListSortDto.Serializer.INSTANCE, listSortDto);
            }
        }

        public Surrogate(AddToListFlowDto add_to_list_flow, ListFiltersDto listFiltersDto, int i, int i2, String added_item_identifiers, String removed_item_identifiers, int i3, boolean z, int i4, int i5, ListSortDto listSortDto) {
            Intrinsics.checkNotNullParameter(add_to_list_flow, "add_to_list_flow");
            Intrinsics.checkNotNullParameter(added_item_identifiers, "added_item_identifiers");
            Intrinsics.checkNotNullParameter(removed_item_identifiers, "removed_item_identifiers");
            this.add_to_list_flow = add_to_list_flow;
            this.list_filters = listFiltersDto;
            this.num_items_added = i;
            this.num_items_removed = i2;
            this.added_item_identifiers = added_item_identifiers;
            this.removed_item_identifiers = removed_item_identifiers;
            this.num_items = i3;
            this.is_options_watchlist = z;
            this.num_active_items = i4;
            this.num_expired_items = i5;
            this.list_sort = listSortDto;
        }

        public final AddToListFlowDto getAdd_to_list_flow() {
            return this.add_to_list_flow;
        }

        public /* synthetic */ Surrogate(AddToListFlowDto addToListFlowDto, ListFiltersDto listFiltersDto, int i, int i2, String str, String str2, int i3, boolean z, int i4, int i5, ListSortDto listSortDto, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? AddToListFlowDto.INSTANCE.getZeroValue() : addToListFlowDto, (i6 & 2) != 0 ? null : listFiltersDto, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? "" : str, (i6 & 32) == 0 ? str2 : "", (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? false : z, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) == 0 ? i5 : 0, (i6 & 1024) != 0 ? null : listSortDto);
        }

        public final ListFiltersDto getList_filters() {
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

        public final boolean is_options_watchlist() {
            return this.is_options_watchlist;
        }

        public final int getNum_active_items() {
            return this.num_active_items;
        }

        public final int getNum_expired_items() {
            return this.num_expired_items;
        }

        public final ListSortDto getList_sort() {
            return this.list_sort;
        }
    }

    /* compiled from: ListsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto;", "Lcom/robinhood/rosetta/eventlogging/ListsContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ListsContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ListsContextDto, ListsContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ListsContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListsContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListsContextDto> getBinaryBase64Serializer() {
            return (KSerializer) ListsContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ListsContext> getProtoAdapter() {
            return ListsContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListsContextDto getZeroValue() {
            return ListsContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListsContextDto fromProto(ListsContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            AddToListFlowDto addToListFlowDtoFromProto = AddToListFlowDto.INSTANCE.fromProto(proto.getAdd_to_list_flow());
            ListFilters list_filters = proto.getList_filters();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ListFiltersDto listFiltersDtoFromProto = list_filters != null ? ListFiltersDto.INSTANCE.fromProto(list_filters) : null;
            int num_items_added = proto.getNum_items_added();
            int num_items_removed = proto.getNum_items_removed();
            String added_item_identifiers = proto.getAdded_item_identifiers();
            String removed_item_identifiers = proto.getRemoved_item_identifiers();
            int num_items = proto.getNum_items();
            boolean is_options_watchlist = proto.getIs_options_watchlist();
            int num_active_items = proto.getNum_active_items();
            int num_expired_items = proto.getNum_expired_items();
            ListSort list_sort = proto.getList_sort();
            return new ListsContextDto(new Surrogate(addToListFlowDtoFromProto, listFiltersDtoFromProto, num_items_added, num_items_removed, added_item_identifiers, removed_item_identifiers, num_items, is_options_watchlist, num_active_items, num_expired_items, list_sort != null ? ListSortDto.INSTANCE.fromProto(list_sort) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ListsContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListsContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ListsContextDto(null, null, 0, 0, null, null, 0, false, 0, 0, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ADD_TO_LIST_FLOW_UNSPECIFIED", "INSTANT", "SINGLE_SELECTION", "MULTI_SELECTION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AddToListFlowDto implements Dto2<ListsContext.AddToListFlow>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AddToListFlowDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AddToListFlowDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AddToListFlowDto, ListsContext.AddToListFlow>> binaryBase64Serializer$delegate;
        public static final AddToListFlowDto ADD_TO_LIST_FLOW_UNSPECIFIED = new ADD_TO_LIST_FLOW_UNSPECIFIED("ADD_TO_LIST_FLOW_UNSPECIFIED", 0);
        public static final AddToListFlowDto INSTANT = new INSTANT("INSTANT", 1);
        public static final AddToListFlowDto SINGLE_SELECTION = new SINGLE_SELECTION("SINGLE_SELECTION", 2);
        public static final AddToListFlowDto MULTI_SELECTION = new MULTI_SELECTION("MULTI_SELECTION", 3);

        private static final /* synthetic */ AddToListFlowDto[] $values() {
            return new AddToListFlowDto[]{ADD_TO_LIST_FLOW_UNSPECIFIED, INSTANT, SINGLE_SELECTION, MULTI_SELECTION};
        }

        public /* synthetic */ AddToListFlowDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AddToListFlowDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ListsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListsContextDto.AddToListFlowDto.ADD_TO_LIST_FLOW_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ADD_TO_LIST_FLOW_UNSPECIFIED extends AddToListFlowDto {
            ADD_TO_LIST_FLOW_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListsContext.AddToListFlow toProto() {
                return ListsContext.AddToListFlow.ADD_TO_LIST_FLOW_UNSPECIFIED;
            }
        }

        private AddToListFlowDto(String str, int i) {
        }

        static {
            AddToListFlowDto[] addToListFlowDtoArr$values = $values();
            $VALUES = addToListFlowDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(addToListFlowDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ListsContextDto$AddToListFlowDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListsContextDto.AddToListFlowDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ListsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListsContextDto.AddToListFlowDto.INSTANT", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INSTANT extends AddToListFlowDto {
            INSTANT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListsContext.AddToListFlow toProto() {
                return ListsContext.AddToListFlow.INSTANT;
            }
        }

        /* compiled from: ListsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListsContextDto.AddToListFlowDto.SINGLE_SELECTION", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SINGLE_SELECTION extends AddToListFlowDto {
            SINGLE_SELECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListsContext.AddToListFlow toProto() {
                return ListsContext.AddToListFlow.SINGLE_SELECTION;
            }
        }

        /* compiled from: ListsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListsContextDto.AddToListFlowDto.MULTI_SELECTION", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MULTI_SELECTION extends AddToListFlowDto {
            MULTI_SELECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListsContext.AddToListFlow toProto() {
                return ListsContext.AddToListFlow.MULTI_SELECTION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ListsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "Lcom/robinhood/rosetta/eventlogging/ListsContext$AddToListFlow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AddToListFlowDto, ListsContext.AddToListFlow> {

            /* compiled from: ListsContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ListsContext.AddToListFlow.values().length];
                    try {
                        iArr[ListsContext.AddToListFlow.ADD_TO_LIST_FLOW_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ListsContext.AddToListFlow.INSTANT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ListsContext.AddToListFlow.SINGLE_SELECTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ListsContext.AddToListFlow.MULTI_SELECTION.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AddToListFlowDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AddToListFlowDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AddToListFlowDto> getBinaryBase64Serializer() {
                return (KSerializer) AddToListFlowDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ListsContext.AddToListFlow> getProtoAdapter() {
                return ListsContext.AddToListFlow.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AddToListFlowDto getZeroValue() {
                return AddToListFlowDto.ADD_TO_LIST_FLOW_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AddToListFlowDto fromProto(ListsContext.AddToListFlow proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AddToListFlowDto.ADD_TO_LIST_FLOW_UNSPECIFIED;
                }
                if (i == 2) {
                    return AddToListFlowDto.INSTANT;
                }
                if (i == 3) {
                    return AddToListFlowDto.SINGLE_SELECTION;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return AddToListFlowDto.MULTI_SELECTION;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ListsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto$AddToListFlowDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<AddToListFlowDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AddToListFlowDto, ListsContext.AddToListFlow> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ListsContext.AddToListFlow", AddToListFlowDto.getEntries(), AddToListFlowDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AddToListFlowDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AddToListFlowDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AddToListFlowDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AddToListFlowDto valueOf(String str) {
            return (AddToListFlowDto) Enum.valueOf(AddToListFlowDto.class, str);
        }

        public static AddToListFlowDto[] values() {
            return (AddToListFlowDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ListsContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ListsContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ListsContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ListsContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ListsContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ListsContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ListsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListsContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ListsContextDto";
        }
    }
}
