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
import com.robinhood.rosetta.eventlogging.MarginMaintenanceTableRowContext;
import com.robinhood.rosetta.eventlogging.MarginMaintenanceTableRowContextDto;
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

/* compiled from: MarginMaintenanceTableRowContextDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000bH\u0016J\b\u0010\"\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$Surrogate;)V", "symbol", "", "quantity", "", "instrument_type", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "(Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;)V", "getSymbol", "()Ljava/lang/String;", "getQuantity", "()I", "getInstrument_type", "()Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "InstrumentTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class MarginMaintenanceTableRowContextDto implements Dto3<MarginMaintenanceTableRowContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginMaintenanceTableRowContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginMaintenanceTableRowContextDto, MarginMaintenanceTableRowContext>> binaryBase64Serializer$delegate;
    private static final MarginMaintenanceTableRowContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginMaintenanceTableRowContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginMaintenanceTableRowContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final int getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public /* synthetic */ MarginMaintenanceTableRowContextDto(String str, int i, InstrumentTypeDto instrumentTypeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginMaintenanceTableRowContextDto(String symbol, int i, InstrumentTypeDto instrument_type) {
        this(new Surrogate(symbol, i, instrument_type));
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
    }

    public static /* synthetic */ MarginMaintenanceTableRowContextDto copy$default(MarginMaintenanceTableRowContextDto marginMaintenanceTableRowContextDto, String str, int i, InstrumentTypeDto instrumentTypeDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = marginMaintenanceTableRowContextDto.surrogate.getSymbol();
        }
        if ((i2 & 2) != 0) {
            i = marginMaintenanceTableRowContextDto.surrogate.getQuantity();
        }
        if ((i2 & 4) != 0) {
            instrumentTypeDto = marginMaintenanceTableRowContextDto.surrogate.getInstrument_type();
        }
        return marginMaintenanceTableRowContextDto.copy(str, i, instrumentTypeDto);
    }

    public final MarginMaintenanceTableRowContextDto copy(String symbol, int quantity, InstrumentTypeDto instrument_type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        return new MarginMaintenanceTableRowContextDto(new Surrogate(symbol, quantity, instrument_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MarginMaintenanceTableRowContext toProto() {
        return new MarginMaintenanceTableRowContext(this.surrogate.getSymbol(), this.surrogate.getQuantity(), (MarginMaintenanceTableRowContext.InstrumentType) this.surrogate.getInstrument_type().toProto(), null, 8, null);
    }

    public String toString() {
        return "[MarginMaintenanceTableRowContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginMaintenanceTableRowContextDto) && Intrinsics.areEqual(((MarginMaintenanceTableRowContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: MarginMaintenanceTableRowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002,-B4\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fB7\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\u001c\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J6\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$Surrogate;", "", "symbol", "", "quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "instrument_type", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "<init>", "(Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSymbol$annotations", "()V", "getSymbol", "()Ljava/lang/String;", "getQuantity$annotations", "getQuantity", "()I", "getInstrument_type$annotations", "getInstrument_type", "()Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InstrumentTypeDto instrument_type;
        private final int quantity;
        private final String symbol;

        public Surrogate() {
            this((String) null, 0, (InstrumentTypeDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, int i, InstrumentTypeDto instrumentTypeDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.symbol;
            }
            if ((i2 & 2) != 0) {
                i = surrogate.quantity;
            }
            if ((i2 & 4) != 0) {
                instrumentTypeDto = surrogate.instrument_type;
            }
            return surrogate.copy(str, i, instrumentTypeDto);
        }

        @SerialName("instrumentType")
        @JsonAnnotations2(names = {"instrument_type"})
        public static /* synthetic */ void getInstrument_type$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final int getQuantity() {
            return this.quantity;
        }

        /* renamed from: component3, reason: from getter */
        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final Surrogate copy(String symbol, int quantity, InstrumentTypeDto instrument_type) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            return new Surrogate(symbol, quantity, instrument_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.symbol, surrogate.symbol) && this.quantity == surrogate.quantity && this.instrument_type == surrogate.instrument_type;
        }

        public int hashCode() {
            return (((this.symbol.hashCode() * 31) + Integer.hashCode(this.quantity)) * 31) + this.instrument_type.hashCode();
        }

        public String toString() {
            return "Surrogate(symbol=" + this.symbol + ", quantity=" + this.quantity + ", instrument_type=" + this.instrument_type + ")";
        }

        /* compiled from: MarginMaintenanceTableRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginMaintenanceTableRowContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, int i2, InstrumentTypeDto instrumentTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.symbol = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.quantity = 0;
            } else {
                this.quantity = i2;
            }
            if ((i & 4) == 0) {
                this.instrument_type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_type = instrumentTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 0, self.symbol);
            }
            int i = self.quantity;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
        }

        public Surrogate(String symbol, int i, InstrumentTypeDto instrument_type) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            this.symbol = symbol;
            this.quantity = i;
            this.instrument_type = instrument_type;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public /* synthetic */ Surrogate(String str, int i, InstrumentTypeDto instrumentTypeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }
    }

    /* compiled from: MarginMaintenanceTableRowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto;", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<MarginMaintenanceTableRowContextDto, MarginMaintenanceTableRowContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginMaintenanceTableRowContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginMaintenanceTableRowContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginMaintenanceTableRowContextDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginMaintenanceTableRowContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginMaintenanceTableRowContext> getProtoAdapter() {
            return MarginMaintenanceTableRowContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginMaintenanceTableRowContextDto getZeroValue() {
            return MarginMaintenanceTableRowContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginMaintenanceTableRowContextDto fromProto(MarginMaintenanceTableRowContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new MarginMaintenanceTableRowContextDto(new Surrogate(proto.getSymbol(), proto.getQuantity(), InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MarginMaintenanceTableRowContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMaintenanceTableRowContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MarginMaintenanceTableRowContextDto(null, 0, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarginMaintenanceTableRowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EQUITY", "OPTION", "INDEX_OPTION", "CRYPTO", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class InstrumentTypeDto implements Dto2<MarginMaintenanceTableRowContext.InstrumentType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InstrumentTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<InstrumentTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<InstrumentTypeDto, MarginMaintenanceTableRowContext.InstrumentType>> binaryBase64Serializer$delegate;
        public static final InstrumentTypeDto EQUITY = new EQUITY("EQUITY", 0);
        public static final InstrumentTypeDto OPTION = new OPTION("OPTION", 1);
        public static final InstrumentTypeDto INDEX_OPTION = new INDEX_OPTION("INDEX_OPTION", 2);
        public static final InstrumentTypeDto CRYPTO = new CRYPTO("CRYPTO", 3);

        private static final /* synthetic */ InstrumentTypeDto[] $values() {
            return new InstrumentTypeDto[]{EQUITY, OPTION, INDEX_OPTION, CRYPTO};
        }

        public /* synthetic */ InstrumentTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<InstrumentTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private InstrumentTypeDto(String str, int i) {
        }

        /* compiled from: MarginMaintenanceTableRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto.InstrumentTypeDto.EQUITY", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EQUITY extends InstrumentTypeDto {
            EQUITY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MarginMaintenanceTableRowContext.InstrumentType toProto() {
                return MarginMaintenanceTableRowContext.InstrumentType.EQUITY;
            }
        }

        static {
            InstrumentTypeDto[] instrumentTypeDtoArr$values = $values();
            $VALUES = instrumentTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(instrumentTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MarginMaintenanceTableRowContextDto$InstrumentTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMaintenanceTableRowContextDto.InstrumentTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: MarginMaintenanceTableRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto.InstrumentTypeDto.OPTION", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION extends InstrumentTypeDto {
            OPTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MarginMaintenanceTableRowContext.InstrumentType toProto() {
                return MarginMaintenanceTableRowContext.InstrumentType.OPTION;
            }
        }

        /* compiled from: MarginMaintenanceTableRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto.InstrumentTypeDto.INDEX_OPTION", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INDEX_OPTION extends InstrumentTypeDto {
            INDEX_OPTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MarginMaintenanceTableRowContext.InstrumentType toProto() {
                return MarginMaintenanceTableRowContext.InstrumentType.INDEX_OPTION;
            }
        }

        /* compiled from: MarginMaintenanceTableRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto.InstrumentTypeDto.CRYPTO", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO extends InstrumentTypeDto {
            CRYPTO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MarginMaintenanceTableRowContext.InstrumentType toProto() {
                return MarginMaintenanceTableRowContext.InstrumentType.CRYPTO;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: MarginMaintenanceTableRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<InstrumentTypeDto, MarginMaintenanceTableRowContext.InstrumentType> {

            /* compiled from: MarginMaintenanceTableRowContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[MarginMaintenanceTableRowContext.InstrumentType.values().length];
                    try {
                        iArr[MarginMaintenanceTableRowContext.InstrumentType.EQUITY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[MarginMaintenanceTableRowContext.InstrumentType.OPTION.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[MarginMaintenanceTableRowContext.InstrumentType.INDEX_OPTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[MarginMaintenanceTableRowContext.InstrumentType.CRYPTO.ordinal()] = 4;
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

            public final KSerializer<InstrumentTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InstrumentTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InstrumentTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) InstrumentTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MarginMaintenanceTableRowContext.InstrumentType> getProtoAdapter() {
                return MarginMaintenanceTableRowContext.InstrumentType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InstrumentTypeDto getZeroValue() {
                return InstrumentTypeDto.EQUITY;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InstrumentTypeDto fromProto(MarginMaintenanceTableRowContext.InstrumentType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return InstrumentTypeDto.EQUITY;
                }
                if (i == 2) {
                    return InstrumentTypeDto.OPTION;
                }
                if (i == 3) {
                    return InstrumentTypeDto.INDEX_OPTION;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return InstrumentTypeDto.CRYPTO;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MarginMaintenanceTableRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$InstrumentTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<InstrumentTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<InstrumentTypeDto, MarginMaintenanceTableRowContext.InstrumentType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.MarginMaintenanceTableRowContext.InstrumentType", InstrumentTypeDto.getEntries(), InstrumentTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public InstrumentTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (InstrumentTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, InstrumentTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static InstrumentTypeDto valueOf(String str) {
            return (InstrumentTypeDto) Enum.valueOf(InstrumentTypeDto.class, str);
        }

        public static InstrumentTypeDto[] values() {
            return (InstrumentTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: MarginMaintenanceTableRowContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MarginMaintenanceTableRowContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MarginMaintenanceTableRowContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginMaintenanceTableRowContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginMaintenanceTableRowContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginMaintenanceTableRowContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MarginMaintenanceTableRowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.MarginMaintenanceTableRowContextDto";
        }
    }
}
