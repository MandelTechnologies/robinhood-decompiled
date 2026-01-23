package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.PnlDisplayModeDto;
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

/* compiled from: EquitiesLadderContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto$Surrogate;)V", "pnl_display_mode", "Lcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;", "auto_send_enabled", "", "zoom_level", "", "quantity", "(Lcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;ZDD)V", "getPnl_display_mode", "()Lcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;", "getAuto_send_enabled", "()Z", "getZoom_level", "()D", "getQuantity", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class EquitiesLadderContextDto implements Dto3<EquitiesLadderContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EquitiesLadderContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EquitiesLadderContextDto, EquitiesLadderContext>> binaryBase64Serializer$delegate;
    private static final EquitiesLadderContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EquitiesLadderContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EquitiesLadderContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PnlDisplayModeDto getPnl_display_mode() {
        return this.surrogate.getPnl_display_mode();
    }

    public final boolean getAuto_send_enabled() {
        return this.surrogate.getAuto_send_enabled();
    }

    public final double getZoom_level() {
        return this.surrogate.getZoom_level();
    }

    public final double getQuantity() {
        return this.surrogate.getQuantity();
    }

    public /* synthetic */ EquitiesLadderContextDto(PnlDisplayModeDto pnlDisplayModeDto, boolean z, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PnlDisplayModeDto.INSTANCE.getZeroValue() : pnlDisplayModeDto, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EquitiesLadderContextDto(PnlDisplayModeDto pnl_display_mode, boolean z, double d, double d2) {
        this(new Surrogate(pnl_display_mode, z, d, d2));
        Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
    }

    public static /* synthetic */ EquitiesLadderContextDto copy$default(EquitiesLadderContextDto equitiesLadderContextDto, PnlDisplayModeDto pnlDisplayModeDto, boolean z, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            pnlDisplayModeDto = equitiesLadderContextDto.surrogate.getPnl_display_mode();
        }
        if ((i & 2) != 0) {
            z = equitiesLadderContextDto.surrogate.getAuto_send_enabled();
        }
        if ((i & 4) != 0) {
            d = equitiesLadderContextDto.surrogate.getZoom_level();
        }
        if ((i & 8) != 0) {
            d2 = equitiesLadderContextDto.surrogate.getQuantity();
        }
        double d3 = d2;
        return equitiesLadderContextDto.copy(pnlDisplayModeDto, z, d, d3);
    }

    public final EquitiesLadderContextDto copy(PnlDisplayModeDto pnl_display_mode, boolean auto_send_enabled, double zoom_level, double quantity) {
        Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
        return new EquitiesLadderContextDto(new Surrogate(pnl_display_mode, auto_send_enabled, zoom_level, quantity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EquitiesLadderContext toProto() {
        return new EquitiesLadderContext((PnlDisplayMode) this.surrogate.getPnl_display_mode().toProto(), this.surrogate.getAuto_send_enabled(), this.surrogate.getZoom_level(), this.surrogate.getQuantity(), null, 16, null);
    }

    public String toString() {
        return "[EquitiesLadderContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EquitiesLadderContextDto) && Intrinsics.areEqual(((EquitiesLadderContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: EquitiesLadderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000212BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\u0004\b\f\u0010\rB=\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0018\u0010!\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010\"\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u000fHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001c¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto$Surrogate;", "", "pnl_display_mode", "Lcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;", "auto_send_enabled", "", "zoom_level", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "quantity", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;ZDD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;ZDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPnl_display_mode$annotations", "()V", "getPnl_display_mode", "()Lcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;", "getAuto_send_enabled$annotations", "getAuto_send_enabled", "()Z", "getZoom_level$annotations", "getZoom_level", "()D", "getQuantity$annotations", "getQuantity", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean auto_send_enabled;
        private final PnlDisplayModeDto pnl_display_mode;
        private final double quantity;
        private final double zoom_level;

        public Surrogate() {
            this((PnlDisplayModeDto) null, false, 0.0d, 0.0d, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, PnlDisplayModeDto pnlDisplayModeDto, boolean z, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                pnlDisplayModeDto = surrogate.pnl_display_mode;
            }
            if ((i & 2) != 0) {
                z = surrogate.auto_send_enabled;
            }
            if ((i & 4) != 0) {
                d = surrogate.zoom_level;
            }
            if ((i & 8) != 0) {
                d2 = surrogate.quantity;
            }
            double d3 = d2;
            return surrogate.copy(pnlDisplayModeDto, z, d, d3);
        }

        @SerialName("autoSendEnabled")
        @JsonAnnotations2(names = {"auto_send_enabled"})
        public static /* synthetic */ void getAuto_send_enabled$annotations() {
        }

        @SerialName("pnlDisplayMode")
        @JsonAnnotations2(names = {"pnl_display_mode"})
        public static /* synthetic */ void getPnl_display_mode$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("zoomLevel")
        @JsonAnnotations2(names = {"zoom_level"})
        public static /* synthetic */ void getZoom_level$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final PnlDisplayModeDto getPnl_display_mode() {
            return this.pnl_display_mode;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAuto_send_enabled() {
            return this.auto_send_enabled;
        }

        /* renamed from: component3, reason: from getter */
        public final double getZoom_level() {
            return this.zoom_level;
        }

        /* renamed from: component4, reason: from getter */
        public final double getQuantity() {
            return this.quantity;
        }

        public final Surrogate copy(PnlDisplayModeDto pnl_display_mode, boolean auto_send_enabled, double zoom_level, double quantity) {
            Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
            return new Surrogate(pnl_display_mode, auto_send_enabled, zoom_level, quantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.pnl_display_mode == surrogate.pnl_display_mode && this.auto_send_enabled == surrogate.auto_send_enabled && Double.compare(this.zoom_level, surrogate.zoom_level) == 0 && Double.compare(this.quantity, surrogate.quantity) == 0;
        }

        public int hashCode() {
            return (((((this.pnl_display_mode.hashCode() * 31) + java.lang.Boolean.hashCode(this.auto_send_enabled)) * 31) + Double.hashCode(this.zoom_level)) * 31) + Double.hashCode(this.quantity);
        }

        public String toString() {
            return "Surrogate(pnl_display_mode=" + this.pnl_display_mode + ", auto_send_enabled=" + this.auto_send_enabled + ", zoom_level=" + this.zoom_level + ", quantity=" + this.quantity + ")";
        }

        /* compiled from: EquitiesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EquitiesLadderContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PnlDisplayModeDto pnlDisplayModeDto, boolean z, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
            this.pnl_display_mode = (i & 1) == 0 ? PnlDisplayModeDto.INSTANCE.getZeroValue() : pnlDisplayModeDto;
            if ((i & 2) == 0) {
                this.auto_send_enabled = false;
            } else {
                this.auto_send_enabled = z;
            }
            if ((i & 4) == 0) {
                this.zoom_level = 0.0d;
            } else {
                this.zoom_level = d;
            }
            if ((i & 8) == 0) {
                this.quantity = 0.0d;
            } else {
                this.quantity = d2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.pnl_display_mode != PnlDisplayModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, PnlDisplayModeDto.Serializer.INSTANCE, self.pnl_display_mode);
            }
            boolean z = self.auto_send_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            if (Double.compare(self.zoom_level, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.zoom_level));
            }
            if (Double.compare(self.quantity, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.quantity));
            }
        }

        public Surrogate(PnlDisplayModeDto pnl_display_mode, boolean z, double d, double d2) {
            Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
            this.pnl_display_mode = pnl_display_mode;
            this.auto_send_enabled = z;
            this.zoom_level = d;
            this.quantity = d2;
        }

        public final PnlDisplayModeDto getPnl_display_mode() {
            return this.pnl_display_mode;
        }

        public /* synthetic */ Surrogate(PnlDisplayModeDto pnlDisplayModeDto, boolean z, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PnlDisplayModeDto.INSTANCE.getZeroValue() : pnlDisplayModeDto, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2);
        }

        public final boolean getAuto_send_enabled() {
            return this.auto_send_enabled;
        }

        public final double getZoom_level() {
            return this.zoom_level;
        }

        public final double getQuantity() {
            return this.quantity;
        }
    }

    /* compiled from: EquitiesLadderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto;", "Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<EquitiesLadderContextDto, EquitiesLadderContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EquitiesLadderContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquitiesLadderContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquitiesLadderContextDto> getBinaryBase64Serializer() {
            return (KSerializer) EquitiesLadderContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EquitiesLadderContext> getProtoAdapter() {
            return EquitiesLadderContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquitiesLadderContextDto getZeroValue() {
            return EquitiesLadderContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquitiesLadderContextDto fromProto(EquitiesLadderContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new EquitiesLadderContextDto(new Surrogate(PnlDisplayModeDto.INSTANCE.fromProto(proto.getPnl_display_mode()), proto.getAuto_send_enabled(), proto.getZoom_level(), proto.getQuantity()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquitiesLadderContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquitiesLadderContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EquitiesLadderContextDto(null, false, 0.0d, 0.0d, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EquitiesLadderContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EquitiesLadderContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.EquitiesLadderContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EquitiesLadderContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EquitiesLadderContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EquitiesLadderContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EquitiesLadderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.EquitiesLadderContextDto";
        }
    }
}
