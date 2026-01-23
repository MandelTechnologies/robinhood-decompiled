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
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.TaxLotSelection;
import com.robinhood.rosetta.eventlogging.TaxLotSelectionDto;
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

/* compiled from: TaxLotSelectionDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005&'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$Surrogate;)V", "open_lot_id", "", "quantity", "", "quantity_available", "last_check_box_state", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "(Ljava/lang/String;DDLcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;)V", "getOpen_lot_id", "()Ljava/lang/String;", "getQuantity", "()D", "getQuantity_available", "getLast_check_box_state", "()Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CheckBoxStateDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class TaxLotSelectionDto implements Dto3<TaxLotSelection>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLotSelectionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLotSelectionDto, TaxLotSelection>> binaryBase64Serializer$delegate;
    private static final TaxLotSelectionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLotSelectionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLotSelectionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOpen_lot_id() {
        return this.surrogate.getOpen_lot_id();
    }

    public final double getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final double getQuantity_available() {
        return this.surrogate.getQuantity_available();
    }

    public final CheckBoxStateDto getLast_check_box_state() {
        return this.surrogate.getLast_check_box_state();
    }

    public /* synthetic */ TaxLotSelectionDto(String str, double d, double d2, CheckBoxStateDto checkBoxStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? CheckBoxStateDto.INSTANCE.getZeroValue() : checkBoxStateDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLotSelectionDto(String open_lot_id, double d, double d2, CheckBoxStateDto last_check_box_state) {
        this(new Surrogate(open_lot_id, d, d2, last_check_box_state));
        Intrinsics.checkNotNullParameter(open_lot_id, "open_lot_id");
        Intrinsics.checkNotNullParameter(last_check_box_state, "last_check_box_state");
    }

    public static /* synthetic */ TaxLotSelectionDto copy$default(TaxLotSelectionDto taxLotSelectionDto, String str, double d, double d2, CheckBoxStateDto checkBoxStateDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotSelectionDto.surrogate.getOpen_lot_id();
        }
        if ((i & 2) != 0) {
            d = taxLotSelectionDto.surrogate.getQuantity();
        }
        if ((i & 4) != 0) {
            d2 = taxLotSelectionDto.surrogate.getQuantity_available();
        }
        if ((i & 8) != 0) {
            checkBoxStateDto = taxLotSelectionDto.surrogate.getLast_check_box_state();
        }
        CheckBoxStateDto checkBoxStateDto2 = checkBoxStateDto;
        return taxLotSelectionDto.copy(str, d, d2, checkBoxStateDto2);
    }

    public final TaxLotSelectionDto copy(String open_lot_id, double quantity, double quantity_available, CheckBoxStateDto last_check_box_state) {
        Intrinsics.checkNotNullParameter(open_lot_id, "open_lot_id");
        Intrinsics.checkNotNullParameter(last_check_box_state, "last_check_box_state");
        return new TaxLotSelectionDto(new Surrogate(open_lot_id, quantity, quantity_available, last_check_box_state));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TaxLotSelection toProto() {
        return new TaxLotSelection(this.surrogate.getOpen_lot_id(), this.surrogate.getQuantity(), this.surrogate.getQuantity_available(), (TaxLotSelection.CheckBoxState) this.surrogate.getLast_check_box_state().toProto(), null, 16, null);
    }

    public String toString() {
        return "[TaxLotSelectionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLotSelectionDto) && Intrinsics.areEqual(((TaxLotSelectionDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLotSelectionDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000212BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rB?\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0018\u0010 \u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010!\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u000fHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R+\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$Surrogate;", "", "open_lot_id", "", "quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "quantity_available", "last_check_box_state", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "<init>", "(Ljava/lang/String;DDLcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;DDLcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOpen_lot_id$annotations", "()V", "getOpen_lot_id", "()Ljava/lang/String;", "getQuantity$annotations", "getQuantity", "()D", "getQuantity_available$annotations", "getQuantity_available", "getLast_check_box_state$annotations", "getLast_check_box_state", "()Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CheckBoxStateDto last_check_box_state;
        private final String open_lot_id;
        private final double quantity;
        private final double quantity_available;

        public Surrogate() {
            this((String) null, 0.0d, 0.0d, (CheckBoxStateDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, double d, double d2, CheckBoxStateDto checkBoxStateDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.open_lot_id;
            }
            if ((i & 2) != 0) {
                d = surrogate.quantity;
            }
            if ((i & 4) != 0) {
                d2 = surrogate.quantity_available;
            }
            if ((i & 8) != 0) {
                checkBoxStateDto = surrogate.last_check_box_state;
            }
            CheckBoxStateDto checkBoxStateDto2 = checkBoxStateDto;
            return surrogate.copy(str, d, d2, checkBoxStateDto2);
        }

        @SerialName("lastCheckBoxState")
        @JsonAnnotations2(names = {"last_check_box_state"})
        public static /* synthetic */ void getLast_check_box_state$annotations() {
        }

        @SerialName("openLotId")
        @JsonAnnotations2(names = {"open_lot_id"})
        public static /* synthetic */ void getOpen_lot_id$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("quantityAvailable")
        @JsonAnnotations2(names = {"quantity_available"})
        public static /* synthetic */ void getQuantity_available$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getOpen_lot_id() {
            return this.open_lot_id;
        }

        /* renamed from: component2, reason: from getter */
        public final double getQuantity() {
            return this.quantity;
        }

        /* renamed from: component3, reason: from getter */
        public final double getQuantity_available() {
            return this.quantity_available;
        }

        /* renamed from: component4, reason: from getter */
        public final CheckBoxStateDto getLast_check_box_state() {
            return this.last_check_box_state;
        }

        public final Surrogate copy(String open_lot_id, double quantity, double quantity_available, CheckBoxStateDto last_check_box_state) {
            Intrinsics.checkNotNullParameter(open_lot_id, "open_lot_id");
            Intrinsics.checkNotNullParameter(last_check_box_state, "last_check_box_state");
            return new Surrogate(open_lot_id, quantity, quantity_available, last_check_box_state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.open_lot_id, surrogate.open_lot_id) && Double.compare(this.quantity, surrogate.quantity) == 0 && Double.compare(this.quantity_available, surrogate.quantity_available) == 0 && this.last_check_box_state == surrogate.last_check_box_state;
        }

        public int hashCode() {
            return (((((this.open_lot_id.hashCode() * 31) + Double.hashCode(this.quantity)) * 31) + Double.hashCode(this.quantity_available)) * 31) + this.last_check_box_state.hashCode();
        }

        public String toString() {
            return "Surrogate(open_lot_id=" + this.open_lot_id + ", quantity=" + this.quantity + ", quantity_available=" + this.quantity_available + ", last_check_box_state=" + this.last_check_box_state + ")";
        }

        /* compiled from: TaxLotSelectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLotSelectionDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, double d, double d2, CheckBoxStateDto checkBoxStateDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.open_lot_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.quantity = 0.0d;
            } else {
                this.quantity = d;
            }
            if ((i & 4) == 0) {
                this.quantity_available = 0.0d;
            } else {
                this.quantity_available = d2;
            }
            if ((i & 8) == 0) {
                this.last_check_box_state = CheckBoxStateDto.INSTANCE.getZeroValue();
            } else {
                this.last_check_box_state = checkBoxStateDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.open_lot_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.open_lot_id);
            }
            if (Double.compare(self.quantity, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.quantity));
            }
            if (Double.compare(self.quantity_available, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.quantity_available));
            }
            if (self.last_check_box_state != CheckBoxStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, CheckBoxStateDto.Serializer.INSTANCE, self.last_check_box_state);
            }
        }

        public Surrogate(String open_lot_id, double d, double d2, CheckBoxStateDto last_check_box_state) {
            Intrinsics.checkNotNullParameter(open_lot_id, "open_lot_id");
            Intrinsics.checkNotNullParameter(last_check_box_state, "last_check_box_state");
            this.open_lot_id = open_lot_id;
            this.quantity = d;
            this.quantity_available = d2;
            this.last_check_box_state = last_check_box_state;
        }

        public final String getOpen_lot_id() {
            return this.open_lot_id;
        }

        public /* synthetic */ Surrogate(String str, double d, double d2, CheckBoxStateDto checkBoxStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? CheckBoxStateDto.INSTANCE.getZeroValue() : checkBoxStateDto);
        }

        public final double getQuantity() {
            return this.quantity;
        }

        public final double getQuantity_available() {
            return this.quantity_available;
        }

        public final CheckBoxStateDto getLast_check_box_state() {
            return this.last_check_box_state;
        }
    }

    /* compiled from: TaxLotSelectionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<TaxLotSelectionDto, TaxLotSelection> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLotSelectionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotSelectionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotSelectionDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLotSelectionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLotSelection> getProtoAdapter() {
            return TaxLotSelection.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotSelectionDto getZeroValue() {
            return TaxLotSelectionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotSelectionDto fromProto(TaxLotSelection proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new TaxLotSelectionDto(new Surrogate(proto.getOpen_lot_id(), proto.getQuantity(), proto.getQuantity_available(), CheckBoxStateDto.INSTANCE.fromProto(proto.getLast_check_box_state())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TaxLotSelectionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLotSelectionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TaxLotSelectionDto(null, 0.0d, 0.0d, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TaxLotSelectionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHECK_BOX_STATE_UNSPECIFIED", "SELECTED", "PARTIAL", "UNSELECTED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CheckBoxStateDto implements Dto2<TaxLotSelection.CheckBoxState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckBoxStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CheckBoxStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CheckBoxStateDto, TaxLotSelection.CheckBoxState>> binaryBase64Serializer$delegate;
        public static final CheckBoxStateDto CHECK_BOX_STATE_UNSPECIFIED = new CHECK_BOX_STATE_UNSPECIFIED("CHECK_BOX_STATE_UNSPECIFIED", 0);
        public static final CheckBoxStateDto SELECTED = new SELECTED("SELECTED", 1);
        public static final CheckBoxStateDto PARTIAL = new PARTIAL("PARTIAL", 2);
        public static final CheckBoxStateDto UNSELECTED = new UNSELECTED("UNSELECTED", 3);

        private static final /* synthetic */ CheckBoxStateDto[] $values() {
            return new CheckBoxStateDto[]{CHECK_BOX_STATE_UNSPECIFIED, SELECTED, PARTIAL, UNSELECTED};
        }

        public /* synthetic */ CheckBoxStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CheckBoxStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TaxLotSelectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotSelectionDto.CheckBoxStateDto.CHECK_BOX_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECK_BOX_STATE_UNSPECIFIED extends CheckBoxStateDto {
            CHECK_BOX_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotSelection.CheckBoxState toProto() {
                return TaxLotSelection.CheckBoxState.CHECK_BOX_STATE_UNSPECIFIED;
            }
        }

        private CheckBoxStateDto(String str, int i) {
        }

        static {
            CheckBoxStateDto[] checkBoxStateDtoArr$values = $values();
            $VALUES = checkBoxStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkBoxStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TaxLotSelectionDto$CheckBoxStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TaxLotSelectionDto.CheckBoxStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TaxLotSelectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotSelectionDto.CheckBoxStateDto.SELECTED", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELECTED extends CheckBoxStateDto {
            SELECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotSelection.CheckBoxState toProto() {
                return TaxLotSelection.CheckBoxState.SELECTED;
            }
        }

        /* compiled from: TaxLotSelectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotSelectionDto.CheckBoxStateDto.PARTIAL", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PARTIAL extends CheckBoxStateDto {
            PARTIAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotSelection.CheckBoxState toProto() {
                return TaxLotSelection.CheckBoxState.PARTIAL;
            }
        }

        /* compiled from: TaxLotSelectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotSelectionDto.CheckBoxStateDto.UNSELECTED", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSELECTED extends CheckBoxStateDto {
            UNSELECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotSelection.CheckBoxState toProto() {
                return TaxLotSelection.CheckBoxState.UNSELECTED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TaxLotSelectionDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CheckBoxStateDto, TaxLotSelection.CheckBoxState> {

            /* compiled from: TaxLotSelectionDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TaxLotSelection.CheckBoxState.values().length];
                    try {
                        iArr[TaxLotSelection.CheckBoxState.CHECK_BOX_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TaxLotSelection.CheckBoxState.SELECTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TaxLotSelection.CheckBoxState.PARTIAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TaxLotSelection.CheckBoxState.UNSELECTED.ordinal()] = 4;
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

            public final KSerializer<CheckBoxStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckBoxStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckBoxStateDto> getBinaryBase64Serializer() {
                return (KSerializer) CheckBoxStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TaxLotSelection.CheckBoxState> getProtoAdapter() {
                return TaxLotSelection.CheckBoxState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckBoxStateDto getZeroValue() {
                return CheckBoxStateDto.CHECK_BOX_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckBoxStateDto fromProto(TaxLotSelection.CheckBoxState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CheckBoxStateDto.CHECK_BOX_STATE_UNSPECIFIED;
                }
                if (i == 2) {
                    return CheckBoxStateDto.SELECTED;
                }
                if (i == 3) {
                    return CheckBoxStateDto.PARTIAL;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return CheckBoxStateDto.UNSELECTED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TaxLotSelectionDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$CheckBoxStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CheckBoxStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CheckBoxStateDto, TaxLotSelection.CheckBoxState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.TaxLotSelection.CheckBoxState", CheckBoxStateDto.getEntries(), CheckBoxStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CheckBoxStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CheckBoxStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CheckBoxStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CheckBoxStateDto valueOf(String str) {
            return (CheckBoxStateDto) Enum.valueOf(CheckBoxStateDto.class, str);
        }

        public static CheckBoxStateDto[] values() {
            return (CheckBoxStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TaxLotSelectionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLotSelectionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.TaxLotSelection", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLotSelectionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLotSelectionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLotSelectionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLotSelectionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.TaxLotSelectionDto";
        }
    }
}
