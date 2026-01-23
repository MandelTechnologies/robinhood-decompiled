package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.FuturesLadderContext;
import com.robinhood.rosetta.eventlogging.FuturesLadderContextDto;
import com.robinhood.rosetta.eventlogging.PnlDisplayModeDto;
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

/* compiled from: FuturesLadderContextDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005()*+,B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\tH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\tH\u0016J\b\u0010'\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$Surrogate;)V", "num_pending_orders_selected", "", "num_positions", "num_pending_orders", "pnl_display_mode", "Lcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;", "nux_progress", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "(IIILcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;)V", "getNum_pending_orders_selected", "()I", "getNum_positions", "getNum_pending_orders", "getPnl_display_mode", "()Lcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;", "getNux_progress", "()Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "NuxProgressDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class FuturesLadderContextDto implements Dto3<FuturesLadderContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesLadderContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesLadderContextDto, FuturesLadderContext>> binaryBase64Serializer$delegate;
    private static final FuturesLadderContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesLadderContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesLadderContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getNum_pending_orders_selected() {
        return this.surrogate.getNum_pending_orders_selected();
    }

    public final int getNum_positions() {
        return this.surrogate.getNum_positions();
    }

    public final int getNum_pending_orders() {
        return this.surrogate.getNum_pending_orders();
    }

    public final PnlDisplayModeDto getPnl_display_mode() {
        return this.surrogate.getPnl_display_mode();
    }

    public final NuxProgressDto getNux_progress() {
        return this.surrogate.getNux_progress();
    }

    public /* synthetic */ FuturesLadderContextDto(int i, int i2, int i3, PnlDisplayModeDto pnlDisplayModeDto, NuxProgressDto nuxProgressDto, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? PnlDisplayModeDto.INSTANCE.getZeroValue() : pnlDisplayModeDto, (i4 & 16) != 0 ? NuxProgressDto.INSTANCE.getZeroValue() : nuxProgressDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesLadderContextDto(int i, int i2, int i3, PnlDisplayModeDto pnl_display_mode, NuxProgressDto nux_progress) {
        this(new Surrogate(i, i2, i3, pnl_display_mode, nux_progress));
        Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
        Intrinsics.checkNotNullParameter(nux_progress, "nux_progress");
    }

    public static /* synthetic */ FuturesLadderContextDto copy$default(FuturesLadderContextDto futuresLadderContextDto, int i, int i2, int i3, PnlDisplayModeDto pnlDisplayModeDto, NuxProgressDto nuxProgressDto, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = futuresLadderContextDto.surrogate.getNum_pending_orders_selected();
        }
        if ((i4 & 2) != 0) {
            i2 = futuresLadderContextDto.surrogate.getNum_positions();
        }
        if ((i4 & 4) != 0) {
            i3 = futuresLadderContextDto.surrogate.getNum_pending_orders();
        }
        if ((i4 & 8) != 0) {
            pnlDisplayModeDto = futuresLadderContextDto.surrogate.getPnl_display_mode();
        }
        if ((i4 & 16) != 0) {
            nuxProgressDto = futuresLadderContextDto.surrogate.getNux_progress();
        }
        NuxProgressDto nuxProgressDto2 = nuxProgressDto;
        int i5 = i3;
        return futuresLadderContextDto.copy(i, i2, i5, pnlDisplayModeDto, nuxProgressDto2);
    }

    public final FuturesLadderContextDto copy(int num_pending_orders_selected, int num_positions, int num_pending_orders, PnlDisplayModeDto pnl_display_mode, NuxProgressDto nux_progress) {
        Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
        Intrinsics.checkNotNullParameter(nux_progress, "nux_progress");
        return new FuturesLadderContextDto(new Surrogate(num_pending_orders_selected, num_positions, num_pending_orders, pnl_display_mode, nux_progress));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesLadderContext toProto() {
        return new FuturesLadderContext(this.surrogate.getNum_pending_orders_selected(), this.surrogate.getNum_positions(), this.surrogate.getNum_pending_orders(), (PnlDisplayMode) this.surrogate.getPnl_display_mode().toProto(), (FuturesLadderContext.NuxProgress) this.surrogate.getNux_progress().toProto(), null, 32, null);
    }

    public String toString() {
        return "[FuturesLadderContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesLadderContextDto) && Intrinsics.areEqual(((FuturesLadderContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesLadderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000256Bf\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eBG\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\u0018\u0010!\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\"\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010#\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003Jh\u0010&\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J%\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R+\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 ¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$Surrogate;", "", "num_pending_orders_selected", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "num_positions", "num_pending_orders", "pnl_display_mode", "Lcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;", "nux_progress", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "<init>", "(IIILcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getNum_pending_orders_selected$annotations", "()V", "getNum_pending_orders_selected", "()I", "getNum_positions$annotations", "getNum_positions", "getNum_pending_orders$annotations", "getNum_pending_orders", "getPnl_display_mode$annotations", "getPnl_display_mode", "()Lcom/robinhood/rosetta/eventlogging/PnlDisplayModeDto;", "getNux_progress$annotations", "getNux_progress", "()Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int num_pending_orders;
        private final int num_pending_orders_selected;
        private final int num_positions;
        private final NuxProgressDto nux_progress;
        private final PnlDisplayModeDto pnl_display_mode;

        public Surrogate() {
            this(0, 0, 0, (PnlDisplayModeDto) null, (NuxProgressDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, int i2, int i3, PnlDisplayModeDto pnlDisplayModeDto, NuxProgressDto nuxProgressDto, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = surrogate.num_pending_orders_selected;
            }
            if ((i4 & 2) != 0) {
                i2 = surrogate.num_positions;
            }
            if ((i4 & 4) != 0) {
                i3 = surrogate.num_pending_orders;
            }
            if ((i4 & 8) != 0) {
                pnlDisplayModeDto = surrogate.pnl_display_mode;
            }
            if ((i4 & 16) != 0) {
                nuxProgressDto = surrogate.nux_progress;
            }
            NuxProgressDto nuxProgressDto2 = nuxProgressDto;
            int i5 = i3;
            return surrogate.copy(i, i2, i5, pnlDisplayModeDto, nuxProgressDto2);
        }

        @SerialName("numPendingOrders")
        @JsonAnnotations2(names = {"num_pending_orders"})
        public static /* synthetic */ void getNum_pending_orders$annotations() {
        }

        @SerialName("numPendingOrdersSelected")
        @JsonAnnotations2(names = {"num_pending_orders_selected"})
        public static /* synthetic */ void getNum_pending_orders_selected$annotations() {
        }

        @SerialName("numPositions")
        @JsonAnnotations2(names = {"num_positions"})
        public static /* synthetic */ void getNum_positions$annotations() {
        }

        @SerialName("nuxProgress")
        @JsonAnnotations2(names = {"nux_progress"})
        public static /* synthetic */ void getNux_progress$annotations() {
        }

        @SerialName("pnlDisplayMode")
        @JsonAnnotations2(names = {"pnl_display_mode"})
        public static /* synthetic */ void getPnl_display_mode$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getNum_pending_orders_selected() {
            return this.num_pending_orders_selected;
        }

        /* renamed from: component2, reason: from getter */
        public final int getNum_positions() {
            return this.num_positions;
        }

        /* renamed from: component3, reason: from getter */
        public final int getNum_pending_orders() {
            return this.num_pending_orders;
        }

        /* renamed from: component4, reason: from getter */
        public final PnlDisplayModeDto getPnl_display_mode() {
            return this.pnl_display_mode;
        }

        /* renamed from: component5, reason: from getter */
        public final NuxProgressDto getNux_progress() {
            return this.nux_progress;
        }

        public final Surrogate copy(int num_pending_orders_selected, int num_positions, int num_pending_orders, PnlDisplayModeDto pnl_display_mode, NuxProgressDto nux_progress) {
            Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
            Intrinsics.checkNotNullParameter(nux_progress, "nux_progress");
            return new Surrogate(num_pending_orders_selected, num_positions, num_pending_orders, pnl_display_mode, nux_progress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.num_pending_orders_selected == surrogate.num_pending_orders_selected && this.num_positions == surrogate.num_positions && this.num_pending_orders == surrogate.num_pending_orders && this.pnl_display_mode == surrogate.pnl_display_mode && this.nux_progress == surrogate.nux_progress;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.num_pending_orders_selected) * 31) + Integer.hashCode(this.num_positions)) * 31) + Integer.hashCode(this.num_pending_orders)) * 31) + this.pnl_display_mode.hashCode()) * 31) + this.nux_progress.hashCode();
        }

        public String toString() {
            return "Surrogate(num_pending_orders_selected=" + this.num_pending_orders_selected + ", num_positions=" + this.num_positions + ", num_pending_orders=" + this.num_pending_orders + ", pnl_display_mode=" + this.pnl_display_mode + ", nux_progress=" + this.nux_progress + ")";
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesLadderContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, int i3, int i4, PnlDisplayModeDto pnlDisplayModeDto, NuxProgressDto nuxProgressDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.num_pending_orders_selected = 0;
            } else {
                this.num_pending_orders_selected = i2;
            }
            if ((i & 2) == 0) {
                this.num_positions = 0;
            } else {
                this.num_positions = i3;
            }
            if ((i & 4) == 0) {
                this.num_pending_orders = 0;
            } else {
                this.num_pending_orders = i4;
            }
            if ((i & 8) == 0) {
                this.pnl_display_mode = PnlDisplayModeDto.INSTANCE.getZeroValue();
            } else {
                this.pnl_display_mode = pnlDisplayModeDto;
            }
            if ((i & 16) == 0) {
                this.nux_progress = NuxProgressDto.INSTANCE.getZeroValue();
            } else {
                this.nux_progress = nuxProgressDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            int i = self.num_pending_orders_selected;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.num_positions;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.num_pending_orders;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            if (self.pnl_display_mode != PnlDisplayModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, PnlDisplayModeDto.Serializer.INSTANCE, self.pnl_display_mode);
            }
            if (self.nux_progress != NuxProgressDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, NuxProgressDto.Serializer.INSTANCE, self.nux_progress);
            }
        }

        public Surrogate(int i, int i2, int i3, PnlDisplayModeDto pnl_display_mode, NuxProgressDto nux_progress) {
            Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
            Intrinsics.checkNotNullParameter(nux_progress, "nux_progress");
            this.num_pending_orders_selected = i;
            this.num_positions = i2;
            this.num_pending_orders = i3;
            this.pnl_display_mode = pnl_display_mode;
            this.nux_progress = nux_progress;
        }

        public final int getNum_pending_orders_selected() {
            return this.num_pending_orders_selected;
        }

        public final int getNum_positions() {
            return this.num_positions;
        }

        public final int getNum_pending_orders() {
            return this.num_pending_orders;
        }

        public final PnlDisplayModeDto getPnl_display_mode() {
            return this.pnl_display_mode;
        }

        public /* synthetic */ Surrogate(int i, int i2, int i3, PnlDisplayModeDto pnlDisplayModeDto, NuxProgressDto nuxProgressDto, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? PnlDisplayModeDto.INSTANCE.getZeroValue() : pnlDisplayModeDto, (i4 & 16) != 0 ? NuxProgressDto.INSTANCE.getZeroValue() : nuxProgressDto);
        }

        public final NuxProgressDto getNux_progress() {
            return this.nux_progress;
        }
    }

    /* compiled from: FuturesLadderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FuturesLadderContextDto, FuturesLadderContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesLadderContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesLadderContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesLadderContextDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesLadderContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesLadderContext> getProtoAdapter() {
            return FuturesLadderContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesLadderContextDto getZeroValue() {
            return FuturesLadderContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesLadderContextDto fromProto(FuturesLadderContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new FuturesLadderContextDto(new Surrogate(proto.getNum_pending_orders_selected(), proto.getNum_positions(), proto.getNum_pending_orders(), PnlDisplayModeDto.INSTANCE.fromProto(proto.getPnl_display_mode()), NuxProgressDto.INSTANCE.fromProto(proto.getNux_progress())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesLadderContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesLadderContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesLadderContextDto(0, 0, 0, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesLadderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", EducationTourScreenNames.UNSPECIFIED_SCREEN, "LADDER_INTRODUCTION", "LAST_TRADED_PRICE_INFORMATION", "TICK_SIZE_INFORMATION", "BID_BARS_INFORMATION", "ASK_BARS_INFORMATION", "MARKET_ORDER_INFORMATION", "LADDER_ROW_ORDER_INFORMATION", "LADDER_ROW_EDIT_INFORMATION", "LADDER_ROW_CANCEL_ORDER_INFORMATION", "LADDER_ROW_AVERAGE_PRICE_INFORMATION", "LADDER_ROW_CLOSE_POSITION_INFORMATION", "TRANSITION_TO_REAL_LADDER_UI", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static final class NuxProgressDto implements Dto2<FuturesLadderContext.NuxProgress>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NuxProgressDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<NuxProgressDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<NuxProgressDto, FuturesLadderContext.NuxProgress>> binaryBase64Serializer$delegate;
        public static final NuxProgressDto UNSPECIFIED = new UNSPECIFIED(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0);
        public static final NuxProgressDto LADDER_INTRODUCTION = new LADDER_INTRODUCTION("LADDER_INTRODUCTION", 1);
        public static final NuxProgressDto LAST_TRADED_PRICE_INFORMATION = new LAST_TRADED_PRICE_INFORMATION("LAST_TRADED_PRICE_INFORMATION", 2);
        public static final NuxProgressDto TICK_SIZE_INFORMATION = new TICK_SIZE_INFORMATION("TICK_SIZE_INFORMATION", 3);
        public static final NuxProgressDto BID_BARS_INFORMATION = new BID_BARS_INFORMATION("BID_BARS_INFORMATION", 4);
        public static final NuxProgressDto ASK_BARS_INFORMATION = new ASK_BARS_INFORMATION("ASK_BARS_INFORMATION", 5);
        public static final NuxProgressDto MARKET_ORDER_INFORMATION = new MARKET_ORDER_INFORMATION("MARKET_ORDER_INFORMATION", 6);
        public static final NuxProgressDto LADDER_ROW_ORDER_INFORMATION = new LADDER_ROW_ORDER_INFORMATION("LADDER_ROW_ORDER_INFORMATION", 7);
        public static final NuxProgressDto LADDER_ROW_EDIT_INFORMATION = new LADDER_ROW_EDIT_INFORMATION("LADDER_ROW_EDIT_INFORMATION", 8);
        public static final NuxProgressDto LADDER_ROW_CANCEL_ORDER_INFORMATION = new LADDER_ROW_CANCEL_ORDER_INFORMATION("LADDER_ROW_CANCEL_ORDER_INFORMATION", 9);
        public static final NuxProgressDto LADDER_ROW_AVERAGE_PRICE_INFORMATION = new LADDER_ROW_AVERAGE_PRICE_INFORMATION("LADDER_ROW_AVERAGE_PRICE_INFORMATION", 10);
        public static final NuxProgressDto LADDER_ROW_CLOSE_POSITION_INFORMATION = new LADDER_ROW_CLOSE_POSITION_INFORMATION("LADDER_ROW_CLOSE_POSITION_INFORMATION", 11);
        public static final NuxProgressDto TRANSITION_TO_REAL_LADDER_UI = new TRANSITION_TO_REAL_LADDER_UI("TRANSITION_TO_REAL_LADDER_UI", 12);

        private static final /* synthetic */ NuxProgressDto[] $values() {
            return new NuxProgressDto[]{UNSPECIFIED, LADDER_INTRODUCTION, LAST_TRADED_PRICE_INFORMATION, TICK_SIZE_INFORMATION, BID_BARS_INFORMATION, ASK_BARS_INFORMATION, MARKET_ORDER_INFORMATION, LADDER_ROW_ORDER_INFORMATION, LADDER_ROW_EDIT_INFORMATION, LADDER_ROW_CANCEL_ORDER_INFORMATION, LADDER_ROW_AVERAGE_PRICE_INFORMATION, LADDER_ROW_CLOSE_POSITION_INFORMATION, TRANSITION_TO_REAL_LADDER_UI};
        }

        public /* synthetic */ NuxProgressDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<NuxProgressDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSPECIFIED extends NuxProgressDto {
            UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.UNSPECIFIED;
            }
        }

        private NuxProgressDto(String str, int i) {
        }

        static {
            NuxProgressDto[] nuxProgressDtoArr$values = $values();
            $VALUES = nuxProgressDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(nuxProgressDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesLadderContextDto$NuxProgressDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesLadderContextDto.NuxProgressDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.LADDER_INTRODUCTION", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LADDER_INTRODUCTION extends NuxProgressDto {
            LADDER_INTRODUCTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.LADDER_INTRODUCTION;
            }
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.LAST_TRADED_PRICE_INFORMATION", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LAST_TRADED_PRICE_INFORMATION extends NuxProgressDto {
            LAST_TRADED_PRICE_INFORMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.LAST_TRADED_PRICE_INFORMATION;
            }
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.TICK_SIZE_INFORMATION", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TICK_SIZE_INFORMATION extends NuxProgressDto {
            TICK_SIZE_INFORMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.TICK_SIZE_INFORMATION;
            }
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.BID_BARS_INFORMATION", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BID_BARS_INFORMATION extends NuxProgressDto {
            BID_BARS_INFORMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.BID_BARS_INFORMATION;
            }
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.ASK_BARS_INFORMATION", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASK_BARS_INFORMATION extends NuxProgressDto {
            ASK_BARS_INFORMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.ASK_BARS_INFORMATION;
            }
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.MARKET_ORDER_INFORMATION", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET_ORDER_INFORMATION extends NuxProgressDto {
            MARKET_ORDER_INFORMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.MARKET_ORDER_INFORMATION;
            }
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.LADDER_ROW_ORDER_INFORMATION", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LADDER_ROW_ORDER_INFORMATION extends NuxProgressDto {
            LADDER_ROW_ORDER_INFORMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.LADDER_ROW_ORDER_INFORMATION;
            }
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.LADDER_ROW_EDIT_INFORMATION", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LADDER_ROW_EDIT_INFORMATION extends NuxProgressDto {
            LADDER_ROW_EDIT_INFORMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.LADDER_ROW_EDIT_INFORMATION;
            }
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.LADDER_ROW_CANCEL_ORDER_INFORMATION", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LADDER_ROW_CANCEL_ORDER_INFORMATION extends NuxProgressDto {
            LADDER_ROW_CANCEL_ORDER_INFORMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.LADDER_ROW_CANCEL_ORDER_INFORMATION;
            }
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.LADDER_ROW_AVERAGE_PRICE_INFORMATION", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LADDER_ROW_AVERAGE_PRICE_INFORMATION extends NuxProgressDto {
            LADDER_ROW_AVERAGE_PRICE_INFORMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.LADDER_ROW_AVERAGE_PRICE_INFORMATION;
            }
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.LADDER_ROW_CLOSE_POSITION_INFORMATION", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LADDER_ROW_CLOSE_POSITION_INFORMATION extends NuxProgressDto {
            LADDER_ROW_CLOSE_POSITION_INFORMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.LADDER_ROW_CLOSE_POSITION_INFORMATION;
            }
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesLadderContextDto.NuxProgressDto.TRANSITION_TO_REAL_LADDER_UI", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSITION_TO_REAL_LADDER_UI extends NuxProgressDto {
            TRANSITION_TO_REAL_LADDER_UI(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesLadderContext.NuxProgress toProto() {
                return FuturesLadderContext.NuxProgress.TRANSITION_TO_REAL_LADDER_UI;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<NuxProgressDto, FuturesLadderContext.NuxProgress> {

            /* compiled from: FuturesLadderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FuturesLadderContext.NuxProgress.values().length];
                    try {
                        iArr[FuturesLadderContext.NuxProgress.UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.LADDER_INTRODUCTION.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.LAST_TRADED_PRICE_INFORMATION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.TICK_SIZE_INFORMATION.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.BID_BARS_INFORMATION.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.ASK_BARS_INFORMATION.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.MARKET_ORDER_INFORMATION.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.LADDER_ROW_ORDER_INFORMATION.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.LADDER_ROW_EDIT_INFORMATION.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.LADDER_ROW_CANCEL_ORDER_INFORMATION.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.LADDER_ROW_AVERAGE_PRICE_INFORMATION.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.LADDER_ROW_CLOSE_POSITION_INFORMATION.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[FuturesLadderContext.NuxProgress.TRANSITION_TO_REAL_LADDER_UI.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NuxProgressDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NuxProgressDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NuxProgressDto> getBinaryBase64Serializer() {
                return (KSerializer) NuxProgressDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FuturesLadderContext.NuxProgress> getProtoAdapter() {
                return FuturesLadderContext.NuxProgress.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NuxProgressDto getZeroValue() {
                return NuxProgressDto.UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NuxProgressDto fromProto(FuturesLadderContext.NuxProgress proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return NuxProgressDto.UNSPECIFIED;
                    case 2:
                        return NuxProgressDto.LADDER_INTRODUCTION;
                    case 3:
                        return NuxProgressDto.LAST_TRADED_PRICE_INFORMATION;
                    case 4:
                        return NuxProgressDto.TICK_SIZE_INFORMATION;
                    case 5:
                        return NuxProgressDto.BID_BARS_INFORMATION;
                    case 6:
                        return NuxProgressDto.ASK_BARS_INFORMATION;
                    case 7:
                        return NuxProgressDto.MARKET_ORDER_INFORMATION;
                    case 8:
                        return NuxProgressDto.LADDER_ROW_ORDER_INFORMATION;
                    case 9:
                        return NuxProgressDto.LADDER_ROW_EDIT_INFORMATION;
                    case 10:
                        return NuxProgressDto.LADDER_ROW_CANCEL_ORDER_INFORMATION;
                    case 11:
                        return NuxProgressDto.LADDER_ROW_AVERAGE_PRICE_INFORMATION;
                    case 12:
                        return NuxProgressDto.LADDER_ROW_CLOSE_POSITION_INFORMATION;
                    case 13:
                        return NuxProgressDto.TRANSITION_TO_REAL_LADDER_UI;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FuturesLadderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$NuxProgressDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<NuxProgressDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<NuxProgressDto, FuturesLadderContext.NuxProgress> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.FuturesLadderContext.NuxProgress", NuxProgressDto.getEntries(), NuxProgressDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public NuxProgressDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (NuxProgressDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NuxProgressDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static NuxProgressDto valueOf(String str) {
            return (NuxProgressDto) Enum.valueOf(NuxProgressDto.class, str);
        }

        public static NuxProgressDto[] values() {
            return (NuxProgressDto[]) $VALUES.clone();
        }
    }

    /* compiled from: FuturesLadderContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<FuturesLadderContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.FuturesLadderContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesLadderContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesLadderContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesLadderContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesLadderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.FuturesLadderContextDto";
        }
    }
}
