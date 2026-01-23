package bonfire.proto.idl.margin.p036v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.margin.p036v1.TableSortActionDto;
import bonfire.proto.idl.margin.p036v1.ViewInstrumentActionDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.GenericAction;
import rh_server_driven_ui.p531v1.GenericActionDto;

/* compiled from: MaintenanceTableActionDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005! \"#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006%"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$Surrogate;)V", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto;", "concrete", "(Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto;)V", "toProto", "()Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$Surrogate;", "Companion", "Surrogate", "ConcreteDto", "Serializer", "MultibindingModule", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class MaintenanceTableActionDto implements Dto3<MaintenanceTableAction>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MaintenanceTableActionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MaintenanceTableActionDto, MaintenanceTableAction>> binaryBase64Serializer$delegate;
    private static final MaintenanceTableActionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MaintenanceTableActionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MaintenanceTableActionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaintenanceTableActionDto(ConcreteDto concreteDto) {
        ConcreteDto.Generic generic = concreteDto instanceof ConcreteDto.Generic ? (ConcreteDto.Generic) concreteDto : null;
        GenericActionDto value = generic != null ? generic.getValue() : null;
        ConcreteDto.TableSort tableSort = concreteDto instanceof ConcreteDto.TableSort ? (ConcreteDto.TableSort) concreteDto : null;
        TableSortActionDto value2 = tableSort != null ? tableSort.getValue() : null;
        ConcreteDto.ViewInstrument viewInstrument = concreteDto instanceof ConcreteDto.ViewInstrument ? (ConcreteDto.ViewInstrument) concreteDto : null;
        this(new Surrogate(value, value2, viewInstrument != null ? viewInstrument.getValue() : null));
    }

    public /* synthetic */ MaintenanceTableActionDto(ConcreteDto concreteDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : concreteDto);
    }

    @Override // com.robinhood.idl.Dto
    public MaintenanceTableAction toProto() {
        GenericActionDto generic = this.surrogate.getGeneric();
        GenericAction proto = generic != null ? generic.toProto() : null;
        TableSortActionDto table_sort = this.surrogate.getTable_sort();
        TableSortAction proto2 = table_sort != null ? table_sort.toProto() : null;
        ViewInstrumentActionDto view_instrument = this.surrogate.getView_instrument();
        return new MaintenanceTableAction(proto, proto2, view_instrument != null ? view_instrument.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[MaintenanceTableActionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MaintenanceTableActionDto) && Intrinsics.areEqual(((MaintenanceTableActionDto) other).surrogate, this.surrogate);
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
    /* compiled from: MaintenanceTableActionDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$Surrogate;", "", "Lrh_server_driven_ui/v1/GenericActionDto;", "generic", "Lbonfire/proto/idl/margin/v1/TableSortActionDto;", "table_sort", "Lbonfire/proto/idl/margin/v1/ViewInstrumentActionDto;", "view_instrument", "<init>", "(Lrh_server_driven_ui/v1/GenericActionDto;Lbonfire/proto/idl/margin/v1/TableSortActionDto;Lbonfire/proto/idl/margin/v1/ViewInstrumentActionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/GenericActionDto;Lbonfire/proto/idl/margin/v1/TableSortActionDto;Lbonfire/proto/idl/margin/v1/ViewInstrumentActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_maintenance_table_v1_externalRelease", "(Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/GenericActionDto;", "getGeneric", "()Lrh_server_driven_ui/v1/GenericActionDto;", "getGeneric$annotations", "()V", "Lbonfire/proto/idl/margin/v1/TableSortActionDto;", "getTable_sort", "()Lbonfire/proto/idl/margin/v1/TableSortActionDto;", "getTable_sort$annotations", "Lbonfire/proto/idl/margin/v1/ViewInstrumentActionDto;", "getView_instrument", "()Lbonfire/proto/idl/margin/v1/ViewInstrumentActionDto;", "getView_instrument$annotations", "Companion", "$serializer", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final GenericActionDto generic;
        private final TableSortActionDto table_sort;
        private final ViewInstrumentActionDto view_instrument;

        public Surrogate() {
            this((GenericActionDto) null, (TableSortActionDto) null, (ViewInstrumentActionDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.generic, surrogate.generic) && Intrinsics.areEqual(this.table_sort, surrogate.table_sort) && Intrinsics.areEqual(this.view_instrument, surrogate.view_instrument);
        }

        public int hashCode() {
            GenericActionDto genericActionDto = this.generic;
            int iHashCode = (genericActionDto == null ? 0 : genericActionDto.hashCode()) * 31;
            TableSortActionDto tableSortActionDto = this.table_sort;
            int iHashCode2 = (iHashCode + (tableSortActionDto == null ? 0 : tableSortActionDto.hashCode())) * 31;
            ViewInstrumentActionDto viewInstrumentActionDto = this.view_instrument;
            return iHashCode2 + (viewInstrumentActionDto != null ? viewInstrumentActionDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(generic=" + this.generic + ", table_sort=" + this.table_sort + ", view_instrument=" + this.view_instrument + ")";
        }

        /* compiled from: MaintenanceTableActionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$Surrogate;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MaintenanceTableActionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, GenericActionDto genericActionDto, TableSortActionDto tableSortActionDto, ViewInstrumentActionDto viewInstrumentActionDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.generic = null;
            } else {
                this.generic = genericActionDto;
            }
            if ((i & 2) == 0) {
                this.table_sort = null;
            } else {
                this.table_sort = tableSortActionDto;
            }
            if ((i & 4) == 0) {
                this.view_instrument = null;
            } else {
                this.view_instrument = viewInstrumentActionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_maintenance_table_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            GenericActionDto genericActionDto = self.generic;
            if (genericActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, GenericActionDto.Serializer.INSTANCE, genericActionDto);
            }
            TableSortActionDto tableSortActionDto = self.table_sort;
            if (tableSortActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TableSortActionDto.Serializer.INSTANCE, tableSortActionDto);
            }
            ViewInstrumentActionDto viewInstrumentActionDto = self.view_instrument;
            if (viewInstrumentActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ViewInstrumentActionDto.Serializer.INSTANCE, viewInstrumentActionDto);
            }
        }

        public Surrogate(GenericActionDto genericActionDto, TableSortActionDto tableSortActionDto, ViewInstrumentActionDto viewInstrumentActionDto) {
            this.generic = genericActionDto;
            this.table_sort = tableSortActionDto;
            this.view_instrument = viewInstrumentActionDto;
        }

        public /* synthetic */ Surrogate(GenericActionDto genericActionDto, TableSortActionDto tableSortActionDto, ViewInstrumentActionDto viewInstrumentActionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : genericActionDto, (i & 2) != 0 ? null : tableSortActionDto, (i & 4) != 0 ? null : viewInstrumentActionDto);
        }

        public final GenericActionDto getGeneric() {
            return this.generic;
        }

        public final TableSortActionDto getTable_sort() {
            return this.table_sort;
        }

        public final ViewInstrumentActionDto getView_instrument() {
            return this.view_instrument;
        }
    }

    /* compiled from: MaintenanceTableActionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MaintenanceTableActionDto, MaintenanceTableAction> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MaintenanceTableActionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MaintenanceTableActionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MaintenanceTableActionDto> getBinaryBase64Serializer() {
            return (KSerializer) MaintenanceTableActionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MaintenanceTableAction> getProtoAdapter() {
            return MaintenanceTableAction.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MaintenanceTableActionDto getZeroValue() {
            return MaintenanceTableActionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MaintenanceTableActionDto fromProto(MaintenanceTableAction proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            GenericAction generic = proto.getGeneric();
            DefaultConstructorMarker defaultConstructorMarker = null;
            GenericActionDto genericActionDtoFromProto = generic != null ? GenericActionDto.INSTANCE.fromProto(generic) : null;
            TableSortAction table_sort = proto.getTable_sort();
            TableSortActionDto tableSortActionDtoFromProto = table_sort != null ? TableSortActionDto.INSTANCE.fromProto(table_sort) : null;
            ViewInstrumentAction view_instrument = proto.getView_instrument();
            return new MaintenanceTableActionDto(new Surrogate(genericActionDtoFromProto, tableSortActionDtoFromProto, view_instrument != null ? ViewInstrumentActionDto.INSTANCE.fromProto(view_instrument) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.margin.v1.MaintenanceTableActionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MaintenanceTableActionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MaintenanceTableActionDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MaintenanceTableActionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Generic", "TableSort", "ViewInstrument", "Companion", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto$Generic;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto$TableSort;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto$ViewInstrument;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ConcreteDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ConcreteDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ConcreteDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: MaintenanceTableActionDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto$Generic;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto;", "Lrh_server_driven_ui/v1/GenericActionDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/GenericActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/GenericActionDto;", "getValue", "()Lrh_server_driven_ui/v1/GenericActionDto;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Generic extends ConcreteDto {
            private final GenericActionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Generic) && Intrinsics.areEqual(this.value, ((Generic) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Generic(value=" + this.value + ")";
            }

            public final GenericActionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Generic(GenericActionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MaintenanceTableActionDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto$TableSort;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto;", "Lbonfire/proto/idl/margin/v1/TableSortActionDto;", "value", "<init>", "(Lbonfire/proto/idl/margin/v1/TableSortActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/margin/v1/TableSortActionDto;", "getValue", "()Lbonfire/proto/idl/margin/v1/TableSortActionDto;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TableSort extends ConcreteDto {
            private final TableSortActionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TableSort) && Intrinsics.areEqual(this.value, ((TableSort) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TableSort(value=" + this.value + ")";
            }

            public final TableSortActionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TableSort(TableSortActionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MaintenanceTableActionDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto$ViewInstrument;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto;", "Lbonfire/proto/idl/margin/v1/ViewInstrumentActionDto;", "value", "<init>", "(Lbonfire/proto/idl/margin/v1/ViewInstrumentActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/margin/v1/ViewInstrumentActionDto;", "getValue", "()Lbonfire/proto/idl/margin/v1/ViewInstrumentActionDto;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ViewInstrument extends ConcreteDto {
            private final ViewInstrumentActionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewInstrument) && Intrinsics.areEqual(this.value, ((ViewInstrument) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ViewInstrument(value=" + this.value + ")";
            }

            public final ViewInstrumentActionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewInstrument(ViewInstrumentActionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MaintenanceTableActionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$ConcreteDto;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ConcreteDto, MaintenanceTableAction> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MaintenanceTableAction> getProtoAdapter() {
                return MaintenanceTableAction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ConcreteDto fromProto(MaintenanceTableAction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getGeneric() != null) {
                    return new Generic(GenericActionDto.INSTANCE.fromProto(proto.getGeneric()));
                }
                if (proto.getTable_sort() != null) {
                    return new TableSort(TableSortActionDto.INSTANCE.fromProto(proto.getTable_sort()));
                }
                if (proto.getView_instrument() != null) {
                    return new ViewInstrument(ViewInstrumentActionDto.INSTANCE.fromProto(proto.getView_instrument()));
                }
                return null;
            }
        }
    }

    /* compiled from: MaintenanceTableActionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MaintenanceTableActionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.margin.v1.MaintenanceTableAction", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MaintenanceTableActionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MaintenanceTableActionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MaintenanceTableActionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MaintenanceTableActionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableActionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.margin.v1.MaintenanceTableActionDto";
        }
    }
}
