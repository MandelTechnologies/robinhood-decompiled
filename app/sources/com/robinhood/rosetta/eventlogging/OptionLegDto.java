package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.UnsignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import rosetta.option.PositionEffect;
import rosetta.option.PositionEffectDto;
import rosetta.order.Side;
import rosetta.order.SideDto;

/* compiled from: OptionLegDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\rH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\rH\u0016J\b\u0010&\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionLegDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OptionLeg;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OptionLegDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionLegDto$Surrogate;)V", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "", "position_effect", "Lrosetta/option/PositionEffectDto;", "ratio_quantity", "", "side", "Lrosetta/order/SideDto;", "(Ljava/lang/String;Lrosetta/option/PositionEffectDto;ILrosetta/order/SideDto;)V", "getOption", "()Ljava/lang/String;", "getPosition_effect", "()Lrosetta/option/PositionEffectDto;", "getRatio_quantity", "()I", "getSide", "()Lrosetta/order/SideDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class OptionLegDto implements Dto3<OptionLeg>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionLegDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionLegDto, OptionLeg>> binaryBase64Serializer$delegate;
    private static final OptionLegDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionLegDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionLegDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOption() {
        return this.surrogate.getOption();
    }

    public final PositionEffectDto getPosition_effect() {
        return this.surrogate.getPosition_effect();
    }

    public final int getRatio_quantity() {
        return this.surrogate.getRatio_quantity();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public /* synthetic */ OptionLegDto(String str, PositionEffectDto positionEffectDto, int i, SideDto sideDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionLegDto(String option, PositionEffectDto position_effect, int i, SideDto side) {
        this(new Surrogate(option, position_effect, i, side));
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
    }

    public static /* synthetic */ OptionLegDto copy$default(OptionLegDto optionLegDto, String str, PositionEffectDto positionEffectDto, int i, SideDto sideDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = optionLegDto.surrogate.getOption();
        }
        if ((i2 & 2) != 0) {
            positionEffectDto = optionLegDto.surrogate.getPosition_effect();
        }
        if ((i2 & 4) != 0) {
            i = optionLegDto.surrogate.getRatio_quantity();
        }
        if ((i2 & 8) != 0) {
            sideDto = optionLegDto.surrogate.getSide();
        }
        return optionLegDto.copy(str, positionEffectDto, i, sideDto);
    }

    public final OptionLegDto copy(String option, PositionEffectDto position_effect, int ratio_quantity, SideDto side) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
        return new OptionLegDto(new Surrogate(option, position_effect, ratio_quantity, side));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OptionLeg toProto() {
        return new OptionLeg(this.surrogate.getOption(), (PositionEffect) this.surrogate.getPosition_effect().toProto(), this.surrogate.getRatio_quantity(), (Side) this.surrogate.getSide().toProto(), null, 16, null);
    }

    public String toString() {
        return "[OptionLegDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionLegDto) && Intrinsics.areEqual(((OptionLegDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionLegDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000223B>\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0018\u0010\"\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J@\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionLegDto$Surrogate;", "", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "", "position_effect", "Lrosetta/option/PositionEffectDto;", "ratio_quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/UInt32Serializer;", "side", "Lrosetta/order/SideDto;", "<init>", "(Ljava/lang/String;Lrosetta/option/PositionEffectDto;ILrosetta/order/SideDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lrosetta/option/PositionEffectDto;ILrosetta/order/SideDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOption$annotations", "()V", "getOption", "()Ljava/lang/String;", "getPosition_effect$annotations", "getPosition_effect", "()Lrosetta/option/PositionEffectDto;", "getRatio_quantity$annotations", "getRatio_quantity", "()I", "getSide$annotations", "getSide", "()Lrosetta/order/SideDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String option;
        private final PositionEffectDto position_effect;
        private final int ratio_quantity;
        private final SideDto side;

        public Surrogate() {
            this((String) null, (PositionEffectDto) null, 0, (SideDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, PositionEffectDto positionEffectDto, int i, SideDto sideDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.option;
            }
            if ((i2 & 2) != 0) {
                positionEffectDto = surrogate.position_effect;
            }
            if ((i2 & 4) != 0) {
                i = surrogate.ratio_quantity;
            }
            if ((i2 & 8) != 0) {
                sideDto = surrogate.side;
            }
            return surrogate.copy(str, positionEffectDto, i, sideDto);
        }

        @SerialName(AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION)
        @JsonAnnotations2(names = {AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION})
        public static /* synthetic */ void getOption$annotations() {
        }

        @SerialName("positionEffect")
        @JsonAnnotations2(names = {"position_effect"})
        public static /* synthetic */ void getPosition_effect$annotations() {
        }

        @SerialName("ratioQuantity")
        @JsonAnnotations2(names = {"ratio_quantity"})
        public static /* synthetic */ void getRatio_quantity$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getOption() {
            return this.option;
        }

        /* renamed from: component2, reason: from getter */
        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        public final Surrogate copy(String option, PositionEffectDto position_effect, int ratio_quantity, SideDto side) {
            Intrinsics.checkNotNullParameter(option, "option");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(side, "side");
            return new Surrogate(option, position_effect, ratio_quantity, side);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.option, surrogate.option) && this.position_effect == surrogate.position_effect && this.ratio_quantity == surrogate.ratio_quantity && this.side == surrogate.side;
        }

        public int hashCode() {
            return (((((this.option.hashCode() * 31) + this.position_effect.hashCode()) * 31) + Integer.hashCode(this.ratio_quantity)) * 31) + this.side.hashCode();
        }

        public String toString() {
            return "Surrogate(option=" + this.option + ", position_effect=" + this.position_effect + ", ratio_quantity=" + this.ratio_quantity + ", side=" + this.side + ")";
        }

        /* compiled from: OptionLegDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionLegDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionLegDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionLegDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, PositionEffectDto positionEffectDto, int i2, SideDto sideDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.option = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.position_effect = PositionEffectDto.INSTANCE.getZeroValue();
            } else {
                this.position_effect = positionEffectDto;
            }
            if ((i & 4) == 0) {
                this.ratio_quantity = 0;
            } else {
                this.ratio_quantity = i2;
            }
            if ((i & 8) == 0) {
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.option, "")) {
                output.encodeStringElement(serialDesc, 0, self.option);
            }
            if (self.position_effect != PositionEffectDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, PositionEffectDto.Serializer.INSTANCE, self.position_effect);
            }
            int i = self.ratio_quantity;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 2, UnsignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, SideDto.Serializer.INSTANCE, self.side);
            }
        }

        public Surrogate(String option, PositionEffectDto position_effect, int i, SideDto side) {
            Intrinsics.checkNotNullParameter(option, "option");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(side, "side");
            this.option = option;
            this.position_effect = position_effect;
            this.ratio_quantity = i;
            this.side = side;
        }

        public final String getOption() {
            return this.option;
        }

        public /* synthetic */ Surrogate(String str, PositionEffectDto positionEffectDto, int i, SideDto sideDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto);
        }

        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        public final SideDto getSide() {
            return this.side;
        }
    }

    /* compiled from: OptionLegDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionLegDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionLegDto;", "Lcom/robinhood/rosetta/eventlogging/OptionLeg;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionLegDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<OptionLegDto, OptionLeg> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionLegDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionLegDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionLegDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionLegDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionLeg> getProtoAdapter() {
            return OptionLeg.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionLegDto getZeroValue() {
            return OptionLegDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionLegDto fromProto(OptionLeg proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new OptionLegDto(new Surrogate(proto.getOption(), PositionEffectDto.INSTANCE.fromProto(proto.getPosition_effect()), proto.getRatio_quantity(), SideDto.INSTANCE.fromProto(proto.getSide())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionLegDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionLegDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionLegDto(null, null, 0, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionLegDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionLegDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionLegDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OptionLegDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OptionLegDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OptionLeg", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionLegDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionLegDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionLegDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionLegDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionLegDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.OptionLegDto";
        }
    }
}
