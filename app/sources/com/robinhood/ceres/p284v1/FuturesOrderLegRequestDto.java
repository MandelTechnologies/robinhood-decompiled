package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesContractTypeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import rosetta.mainst.Side;
import rosetta.mainst.SideDto;

/* compiled from: FuturesOrderLegRequestDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\rH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\rH\u0016J\b\u0010&\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto$Surrogate;)V", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "contract_id", "", "ratio_quantity", "", "order_side", "Lrosetta/mainst/SideDto;", "(Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;ILrosetta/mainst/SideDto;)V", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getContract_id", "()Ljava/lang/String;", "getRatio_quantity", "()I", "getOrder_side", "()Lrosetta/mainst/SideDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FuturesOrderLegRequestDto implements Dto3<FuturesOrderLegRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesOrderLegRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesOrderLegRequestDto, FuturesOrderLegRequest>> binaryBase64Serializer$delegate;
    private static final FuturesOrderLegRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesOrderLegRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesOrderLegRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final FuturesContractTypeDto getContract_type() {
        return this.surrogate.getContract_type();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final int getRatio_quantity() {
        return this.surrogate.getRatio_quantity();
    }

    public final SideDto getOrder_side() {
        return this.surrogate.getOrder_side();
    }

    public /* synthetic */ FuturesOrderLegRequestDto(FuturesContractTypeDto futuresContractTypeDto, String str, int i, SideDto sideDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? FuturesContractTypeDto.INSTANCE.getZeroValue() : futuresContractTypeDto, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesOrderLegRequestDto(FuturesContractTypeDto contract_type, String contract_id, int i, SideDto order_side) {
        this(new Surrogate(contract_type, contract_id, i, order_side));
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
    }

    public static /* synthetic */ FuturesOrderLegRequestDto copy$default(FuturesOrderLegRequestDto futuresOrderLegRequestDto, FuturesContractTypeDto futuresContractTypeDto, String str, int i, SideDto sideDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            futuresContractTypeDto = futuresOrderLegRequestDto.surrogate.getContract_type();
        }
        if ((i2 & 2) != 0) {
            str = futuresOrderLegRequestDto.surrogate.getContract_id();
        }
        if ((i2 & 4) != 0) {
            i = futuresOrderLegRequestDto.surrogate.getRatio_quantity();
        }
        if ((i2 & 8) != 0) {
            sideDto = futuresOrderLegRequestDto.surrogate.getOrder_side();
        }
        return futuresOrderLegRequestDto.copy(futuresContractTypeDto, str, i, sideDto);
    }

    public final FuturesOrderLegRequestDto copy(FuturesContractTypeDto contract_type, String contract_id, int ratio_quantity, SideDto order_side) {
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        return new FuturesOrderLegRequestDto(new Surrogate(contract_type, contract_id, ratio_quantity, order_side));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesOrderLegRequest toProto() {
        return new FuturesOrderLegRequest((FuturesContractType) this.surrogate.getContract_type().toProto(), this.surrogate.getContract_id(), this.surrogate.getRatio_quantity(), (Side) this.surrogate.getOrder_side().toProto(), null, 16, null);
    }

    public String toString() {
        return "[FuturesOrderLegRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesOrderLegRequestDto) && Intrinsics.areEqual(((FuturesOrderLegRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesOrderLegRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000223B>\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0018\u0010\"\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J@\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto$Surrogate;", "", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "contract_id", "", "ratio_quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "order_side", "Lrosetta/mainst/SideDto;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;ILrosetta/mainst/SideDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;ILrosetta/mainst/SideDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract_type$annotations", "()V", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getContract_id$annotations", "getContract_id", "()Ljava/lang/String;", "getRatio_quantity$annotations", "getRatio_quantity", "()I", "getOrder_side$annotations", "getOrder_side", "()Lrosetta/mainst/SideDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String contract_id;
        private final FuturesContractTypeDto contract_type;
        private final SideDto order_side;
        private final int ratio_quantity;

        public Surrogate() {
            this((FuturesContractTypeDto) null, (String) null, 0, (SideDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, FuturesContractTypeDto futuresContractTypeDto, String str, int i, SideDto sideDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                futuresContractTypeDto = surrogate.contract_type;
            }
            if ((i2 & 2) != 0) {
                str = surrogate.contract_id;
            }
            if ((i2 & 4) != 0) {
                i = surrogate.ratio_quantity;
            }
            if ((i2 & 8) != 0) {
                sideDto = surrogate.order_side;
            }
            return surrogate.copy(futuresContractTypeDto, str, i, sideDto);
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("contractType")
        @JsonAnnotations2(names = {"contract_type"})
        public static /* synthetic */ void getContract_type$annotations() {
        }

        @SerialName("orderSide")
        @JsonAnnotations2(names = {"order_side"})
        public static /* synthetic */ void getOrder_side$annotations() {
        }

        @SerialName("ratioQuantity")
        @JsonAnnotations2(names = {"ratio_quantity"})
        public static /* synthetic */ void getRatio_quantity$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final SideDto getOrder_side() {
            return this.order_side;
        }

        public final Surrogate copy(FuturesContractTypeDto contract_type, String contract_id, int ratio_quantity, SideDto order_side) {
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            return new Surrogate(contract_type, contract_id, ratio_quantity, order_side);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.contract_type == surrogate.contract_type && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.ratio_quantity == surrogate.ratio_quantity && this.order_side == surrogate.order_side;
        }

        public int hashCode() {
            return (((((this.contract_type.hashCode() * 31) + this.contract_id.hashCode()) * 31) + Integer.hashCode(this.ratio_quantity)) * 31) + this.order_side.hashCode();
        }

        public String toString() {
            return "Surrogate(contract_type=" + this.contract_type + ", contract_id=" + this.contract_id + ", ratio_quantity=" + this.ratio_quantity + ", order_side=" + this.order_side + ")";
        }

        /* compiled from: FuturesOrderLegRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesOrderLegRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FuturesContractTypeDto futuresContractTypeDto, String str, int i2, SideDto sideDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.contract_type = (i & 1) == 0 ? FuturesContractTypeDto.INSTANCE.getZeroValue() : futuresContractTypeDto;
            if ((i & 2) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str;
            }
            if ((i & 4) == 0) {
                this.ratio_quantity = 0;
            } else {
                this.ratio_quantity = i2;
            }
            if ((i & 8) == 0) {
                this.order_side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = sideDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.contract_type != FuturesContractTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, FuturesContractTypeDto.Serializer.INSTANCE, self.contract_type);
            }
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.contract_id);
            }
            int i = self.ratio_quantity;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, SideDto.Serializer.INSTANCE, self.order_side);
            }
        }

        public Surrogate(FuturesContractTypeDto contract_type, String contract_id, int i, SideDto order_side) {
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            this.contract_type = contract_type;
            this.contract_id = contract_id;
            this.ratio_quantity = i;
            this.order_side = order_side;
        }

        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        public /* synthetic */ Surrogate(FuturesContractTypeDto futuresContractTypeDto, String str, int i, SideDto sideDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? FuturesContractTypeDto.INSTANCE.getZeroValue() : futuresContractTypeDto, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto);
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        public final SideDto getOrder_side() {
            return this.order_side;
        }
    }

    /* compiled from: FuturesOrderLegRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FuturesOrderLegRequestDto, FuturesOrderLegRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesOrderLegRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderLegRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderLegRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesOrderLegRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesOrderLegRequest> getProtoAdapter() {
            return FuturesOrderLegRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderLegRequestDto getZeroValue() {
            return FuturesOrderLegRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderLegRequestDto fromProto(FuturesOrderLegRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new FuturesOrderLegRequestDto(new Surrogate(FuturesContractTypeDto.INSTANCE.fromProto(proto.getContract_type()), proto.getContract_id(), proto.getRatio_quantity(), SideDto.INSTANCE.fromProto(proto.getOrder_side())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesOrderLegRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesOrderLegRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesOrderLegRequestDto(null, null, 0, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesOrderLegRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesOrderLegRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.FuturesOrderLegRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesOrderLegRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesOrderLegRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesOrderLegRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesOrderLegRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesOrderLegRequestDto";
        }
    }
}
