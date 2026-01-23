package bonfire.proto.idl.margin.p036v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.margin.p036v1.MaintenanceTableActionDto;
import bonfire.proto.idl.margin.p036v1.MarginTableChildRowDto;
import bonfire.proto.idl.margin.p036v1.MarginTableItemDto;
import bonfire.proto.idl.margin.p036v1.MarginTableRowDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: MarginTableRowDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MarginTableRowDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/margin/v1/MarginTableRow;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/margin/v1/MarginTableRowDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/margin/v1/MarginTableRowDto$Surrogate;)V", "", "instrument_id", "instrument_symbol", "", "Lbonfire/proto/idl/margin/v1/MarginTableItemDto;", "items", "Lbonfire/proto/idl/margin/v1/MarginTableChildRowDto;", "child_rows", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;", "on_click_action", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;)V", "toProto", "()Lbonfire/proto/idl/margin/v1/MarginTableRow;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/margin/v1/MarginTableRowDto$Surrogate;", "getInstrument_id", "getItems", "()Ljava/util/List;", "getChild_rows", "getOn_click_action", "()Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class MarginTableRowDto implements Dto3<MarginTableRow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginTableRowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginTableRowDto, MarginTableRow>> binaryBase64Serializer$delegate;
    private static final MarginTableRowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginTableRowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginTableRowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final List<MarginTableItemDto> getItems() {
        return this.surrogate.getItems();
    }

    public final List<MarginTableChildRowDto> getChild_rows() {
        return this.surrogate.getChild_rows();
    }

    public final MaintenanceTableActionDto getOn_click_action() {
        return this.surrogate.getOn_click_action();
    }

    public /* synthetic */ MarginTableRowDto(String str, String str2, List list, List list2, MaintenanceTableActionDto maintenanceTableActionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : maintenanceTableActionDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginTableRowDto(String instrument_id, String instrument_symbol, List<MarginTableItemDto> items, List<MarginTableChildRowDto> child_rows, MaintenanceTableActionDto maintenanceTableActionDto) {
        this(new Surrogate(instrument_id, instrument_symbol, items, child_rows, maintenanceTableActionDto));
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_symbol, "instrument_symbol");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(child_rows, "child_rows");
    }

    @Override // com.robinhood.idl.Dto
    public MarginTableRow toProto() {
        String instrument_id = this.surrogate.getInstrument_id();
        String instrument_symbol = this.surrogate.getInstrument_symbol();
        List<MarginTableItemDto> items = this.surrogate.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(((MarginTableItemDto) it.next()).toProto());
        }
        List<MarginTableChildRowDto> child_rows = this.surrogate.getChild_rows();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(child_rows, 10));
        Iterator<T> it2 = child_rows.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((MarginTableChildRowDto) it2.next()).toProto());
        }
        MaintenanceTableActionDto on_click_action = this.surrogate.getOn_click_action();
        return new MarginTableRow(instrument_id, instrument_symbol, arrayList, arrayList2, on_click_action != null ? on_click_action.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[MarginTableRowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginTableRowDto) && Intrinsics.areEqual(((MarginTableRowDto) other).surrogate, this.surrogate);
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
    /* compiled from: MarginTableRowDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001dR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010'\u001a\u0004\b+\u0010,R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b/\u0010'\u001a\u0004\b.\u0010,R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MarginTableRowDto$Surrogate;", "", "", "instrument_id", "instrument_symbol", "", "Lbonfire/proto/idl/margin/v1/MarginTableItemDto;", "items", "Lbonfire/proto/idl/margin/v1/MarginTableChildRowDto;", "child_rows", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;", "on_click_action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_maintenance_table_v1_externalRelease", "(Lbonfire/proto/idl/margin/v1/MarginTableRowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInstrument_id", "getInstrument_id$annotations", "()V", "getInstrument_symbol", "getInstrument_symbol$annotations", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "getChild_rows", "getChild_rows$annotations", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;", "getOn_click_action", "()Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;", "getOn_click_action$annotations", "Companion", "$serializer", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<MarginTableChildRowDto> child_rows;
        private final String instrument_id;
        private final String instrument_symbol;
        private final List<MarginTableItemDto> items;
        private final MaintenanceTableActionDto on_click_action;

        public Surrogate() {
            this((String) null, (String) null, (List) null, (List) null, (MaintenanceTableActionDto) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MarginTableItemDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(MarginTableChildRowDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.instrument_symbol, surrogate.instrument_symbol) && Intrinsics.areEqual(this.items, surrogate.items) && Intrinsics.areEqual(this.child_rows, surrogate.child_rows) && Intrinsics.areEqual(this.on_click_action, surrogate.on_click_action);
        }

        public int hashCode() {
            int iHashCode = ((((((this.instrument_id.hashCode() * 31) + this.instrument_symbol.hashCode()) * 31) + this.items.hashCode()) * 31) + this.child_rows.hashCode()) * 31;
            MaintenanceTableActionDto maintenanceTableActionDto = this.on_click_action;
            return iHashCode + (maintenanceTableActionDto == null ? 0 : maintenanceTableActionDto.hashCode());
        }

        public String toString() {
            return "Surrogate(instrument_id=" + this.instrument_id + ", instrument_symbol=" + this.instrument_symbol + ", items=" + this.items + ", child_rows=" + this.child_rows + ", on_click_action=" + this.on_click_action + ")";
        }

        /* compiled from: MarginTableRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MarginTableRowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/margin/v1/MarginTableRowDto$Surrogate;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginTableRowDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.margin.v1.MarginTableRowDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginTableRowDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.margin.v1.MarginTableRowDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginTableRowDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, List list2, MaintenanceTableActionDto maintenanceTableActionDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str;
            }
            if ((i & 2) == 0) {
                this.instrument_symbol = "";
            } else {
                this.instrument_symbol = str2;
            }
            if ((i & 4) == 0) {
                this.items = CollectionsKt.emptyList();
            } else {
                this.items = list;
            }
            if ((i & 8) == 0) {
                this.child_rows = CollectionsKt.emptyList();
            } else {
                this.child_rows = list2;
            }
            if ((i & 16) == 0) {
                this.on_click_action = null;
            } else {
                this.on_click_action = maintenanceTableActionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_maintenance_table_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.instrument_symbol, "")) {
                output.encodeStringElement(serialDesc, 1, self.instrument_symbol);
            }
            if (!Intrinsics.areEqual(self.items, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.items);
            }
            if (!Intrinsics.areEqual(self.child_rows, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.child_rows);
            }
            MaintenanceTableActionDto maintenanceTableActionDto = self.on_click_action;
            if (maintenanceTableActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MaintenanceTableActionDto.Serializer.INSTANCE, maintenanceTableActionDto);
            }
        }

        public Surrogate(String instrument_id, String instrument_symbol, List<MarginTableItemDto> items, List<MarginTableChildRowDto> child_rows, MaintenanceTableActionDto maintenanceTableActionDto) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(instrument_symbol, "instrument_symbol");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(child_rows, "child_rows");
            this.instrument_id = instrument_id;
            this.instrument_symbol = instrument_symbol;
            this.items = items;
            this.child_rows = child_rows;
            this.on_click_action = maintenanceTableActionDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, List list2, MaintenanceTableActionDto maintenanceTableActionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : maintenanceTableActionDto);
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final String getInstrument_symbol() {
            return this.instrument_symbol;
        }

        public final List<MarginTableItemDto> getItems() {
            return this.items;
        }

        public final List<MarginTableChildRowDto> getChild_rows() {
            return this.child_rows;
        }

        public final MaintenanceTableActionDto getOn_click_action() {
            return this.on_click_action;
        }
    }

    /* compiled from: MarginTableRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MarginTableRowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/margin/v1/MarginTableRowDto;", "Lbonfire/proto/idl/margin/v1/MarginTableRow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/margin/v1/MarginTableRowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MarginTableRowDto, MarginTableRow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginTableRowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginTableRowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginTableRowDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginTableRowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginTableRow> getProtoAdapter() {
            return MarginTableRow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginTableRowDto getZeroValue() {
            return MarginTableRowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginTableRowDto fromProto(MarginTableRow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String instrument_id = proto.getInstrument_id();
            String instrument_symbol = proto.getInstrument_symbol();
            List<MarginTableItem> items = proto.getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(MarginTableItemDto.INSTANCE.fromProto((MarginTableItem) it.next()));
            }
            List<MarginTableChildRow> child_rows = proto.getChild_rows();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(child_rows, 10));
            Iterator<T> it2 = child_rows.iterator();
            while (it2.hasNext()) {
                arrayList2.add(MarginTableChildRowDto.INSTANCE.fromProto((MarginTableChildRow) it2.next()));
            }
            MaintenanceTableAction on_click_action = proto.getOn_click_action();
            return new MarginTableRowDto(new Surrogate(instrument_id, instrument_symbol, arrayList, arrayList2, on_click_action != null ? MaintenanceTableActionDto.INSTANCE.fromProto(on_click_action) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.margin.v1.MarginTableRowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginTableRowDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new MarginTableRowDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MarginTableRowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MarginTableRowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/margin/v1/MarginTableRowDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/margin/v1/MarginTableRowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MarginTableRowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.margin.v1.MarginTableRow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginTableRowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginTableRowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginTableRowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MarginTableRowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MarginTableRowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.margin.v1.MarginTableRowDto";
        }
    }
}
