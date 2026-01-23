package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.NBBODetailsDto;
import com.robinhood.rosetta.mainst.NullableBoolDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import rosetta.mainst.Capacity;
import rosetta.mainst.CapacityDto;

/* compiled from: FractionalExecutionDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\u0012JL\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/FractionalExecutionDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto$Surrogate;)V", "nbbo_details", "Lcom/robinhood/rosetta/mainst/NBBODetailsDto;", "pending_execution_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "price_source_execution_id", "capacity", "Lrosetta/mainst/CapacityDto;", "is_adjustment", "Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "firm_order_id", "(Lcom/robinhood/rosetta/mainst/NBBODetailsDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/CapacityDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/mainst/UUIDDto;)V", "getNbbo_details", "()Lcom/robinhood/rosetta/mainst/NBBODetailsDto;", "getPending_execution_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getPrice_source_execution_id", "getCapacity", "()Lrosetta/mainst/CapacityDto;", "()Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "getFirm_order_id", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class FractionalExecutionDetailsDto implements Dto3<FractionalExecutionDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FractionalExecutionDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FractionalExecutionDetailsDto, FractionalExecutionDetails>> binaryBase64Serializer$delegate;
    private static final FractionalExecutionDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FractionalExecutionDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FractionalExecutionDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final NBBODetailsDto getNbbo_details() {
        return this.surrogate.getNbbo_details();
    }

    public final UUIDDto getPending_execution_id() {
        return this.surrogate.getPending_execution_id();
    }

    public final UUIDDto getPrice_source_execution_id() {
        return this.surrogate.getPrice_source_execution_id();
    }

    public final CapacityDto getCapacity() {
        return this.surrogate.getCapacity();
    }

    public final NullableBoolDto is_adjustment() {
        return this.surrogate.is_adjustment();
    }

    public final UUIDDto getFirm_order_id() {
        return this.surrogate.getFirm_order_id();
    }

    public /* synthetic */ FractionalExecutionDetailsDto(NBBODetailsDto nBBODetailsDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, CapacityDto capacityDto, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nBBODetailsDto, (i & 2) != 0 ? null : uUIDDto, (i & 4) != 0 ? null : uUIDDto2, (i & 8) != 0 ? CapacityDto.INSTANCE.getZeroValue() : capacityDto, (i & 16) != 0 ? null : nullableBoolDto, (i & 32) != 0 ? null : uUIDDto3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FractionalExecutionDetailsDto(NBBODetailsDto nBBODetailsDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, CapacityDto capacity, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto3) {
        this(new Surrogate(nBBODetailsDto, uUIDDto, uUIDDto2, capacity, nullableBoolDto, uUIDDto3));
        Intrinsics.checkNotNullParameter(capacity, "capacity");
    }

    public static /* synthetic */ FractionalExecutionDetailsDto copy$default(FractionalExecutionDetailsDto fractionalExecutionDetailsDto, NBBODetailsDto nBBODetailsDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, CapacityDto capacityDto, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto3, int i, Object obj) {
        if ((i & 1) != 0) {
            nBBODetailsDto = fractionalExecutionDetailsDto.surrogate.getNbbo_details();
        }
        if ((i & 2) != 0) {
            uUIDDto = fractionalExecutionDetailsDto.surrogate.getPending_execution_id();
        }
        if ((i & 4) != 0) {
            uUIDDto2 = fractionalExecutionDetailsDto.surrogate.getPrice_source_execution_id();
        }
        if ((i & 8) != 0) {
            capacityDto = fractionalExecutionDetailsDto.surrogate.getCapacity();
        }
        if ((i & 16) != 0) {
            nullableBoolDto = fractionalExecutionDetailsDto.surrogate.is_adjustment();
        }
        if ((i & 32) != 0) {
            uUIDDto3 = fractionalExecutionDetailsDto.surrogate.getFirm_order_id();
        }
        NullableBoolDto nullableBoolDto2 = nullableBoolDto;
        UUIDDto uUIDDto4 = uUIDDto3;
        return fractionalExecutionDetailsDto.copy(nBBODetailsDto, uUIDDto, uUIDDto2, capacityDto, nullableBoolDto2, uUIDDto4);
    }

    public final FractionalExecutionDetailsDto copy(NBBODetailsDto nbbo_details, UUIDDto pending_execution_id, UUIDDto price_source_execution_id, CapacityDto capacity, NullableBoolDto is_adjustment, UUIDDto firm_order_id) {
        Intrinsics.checkNotNullParameter(capacity, "capacity");
        return new FractionalExecutionDetailsDto(new Surrogate(nbbo_details, pending_execution_id, price_source_execution_id, capacity, is_adjustment, firm_order_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FractionalExecutionDetails toProto() {
        NBBODetailsDto nbbo_details = this.surrogate.getNbbo_details();
        NBBODetails proto = nbbo_details != null ? nbbo_details.toProto() : null;
        UUIDDto pending_execution_id = this.surrogate.getPending_execution_id();
        UUID proto2 = pending_execution_id != null ? pending_execution_id.toProto() : null;
        UUIDDto price_source_execution_id = this.surrogate.getPrice_source_execution_id();
        UUID proto3 = price_source_execution_id != null ? price_source_execution_id.toProto() : null;
        Capacity capacity = (Capacity) this.surrogate.getCapacity().toProto();
        NullableBoolDto nullableBoolDtoIs_adjustment = this.surrogate.is_adjustment();
        NullableBool proto4 = nullableBoolDtoIs_adjustment != null ? nullableBoolDtoIs_adjustment.toProto() : null;
        UUIDDto firm_order_id = this.surrogate.getFirm_order_id();
        return new FractionalExecutionDetails(proto, proto2, proto3, capacity, proto4, firm_order_id != null ? firm_order_id.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[FractionalExecutionDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FractionalExecutionDetailsDto) && Intrinsics.areEqual(((FractionalExecutionDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: FractionalExecutionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003JO\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u000fHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\t\u0010 R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0019¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto$Surrogate;", "", "nbbo_details", "Lcom/robinhood/rosetta/mainst/NBBODetailsDto;", "pending_execution_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "price_source_execution_id", "capacity", "Lrosetta/mainst/CapacityDto;", "is_adjustment", "Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "firm_order_id", "<init>", "(Lcom/robinhood/rosetta/mainst/NBBODetailsDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/CapacityDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/mainst/UUIDDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/NBBODetailsDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/CapacityDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getNbbo_details$annotations", "()V", "getNbbo_details", "()Lcom/robinhood/rosetta/mainst/NBBODetailsDto;", "getPending_execution_id$annotations", "getPending_execution_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getPrice_source_execution_id$annotations", "getPrice_source_execution_id", "getCapacity$annotations", "getCapacity", "()Lrosetta/mainst/CapacityDto;", "is_adjustment$annotations", "()Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "getFirm_order_id$annotations", "getFirm_order_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CapacityDto capacity;
        private final UUIDDto firm_order_id;
        private final NullableBoolDto is_adjustment;
        private final NBBODetailsDto nbbo_details;
        private final UUIDDto pending_execution_id;
        private final UUIDDto price_source_execution_id;

        public Surrogate() {
            this((NBBODetailsDto) null, (UUIDDto) null, (UUIDDto) null, (CapacityDto) null, (NullableBoolDto) null, (UUIDDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, NBBODetailsDto nBBODetailsDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, CapacityDto capacityDto, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto3, int i, Object obj) {
            if ((i & 1) != 0) {
                nBBODetailsDto = surrogate.nbbo_details;
            }
            if ((i & 2) != 0) {
                uUIDDto = surrogate.pending_execution_id;
            }
            if ((i & 4) != 0) {
                uUIDDto2 = surrogate.price_source_execution_id;
            }
            if ((i & 8) != 0) {
                capacityDto = surrogate.capacity;
            }
            if ((i & 16) != 0) {
                nullableBoolDto = surrogate.is_adjustment;
            }
            if ((i & 32) != 0) {
                uUIDDto3 = surrogate.firm_order_id;
            }
            NullableBoolDto nullableBoolDto2 = nullableBoolDto;
            UUIDDto uUIDDto4 = uUIDDto3;
            return surrogate.copy(nBBODetailsDto, uUIDDto, uUIDDto2, capacityDto, nullableBoolDto2, uUIDDto4);
        }

        @SerialName("capacity")
        @JsonAnnotations2(names = {"capacity"})
        public static /* synthetic */ void getCapacity$annotations() {
        }

        @SerialName("firmOrderId")
        @JsonAnnotations2(names = {"firm_order_id"})
        public static /* synthetic */ void getFirm_order_id$annotations() {
        }

        @SerialName("nbboDetails")
        @JsonAnnotations2(names = {"nbbo_details"})
        public static /* synthetic */ void getNbbo_details$annotations() {
        }

        @SerialName("pendingExecutionId")
        @JsonAnnotations2(names = {"pending_execution_id"})
        public static /* synthetic */ void getPending_execution_id$annotations() {
        }

        @SerialName("priceSourceExecutionId")
        @JsonAnnotations2(names = {"price_source_execution_id"})
        public static /* synthetic */ void getPrice_source_execution_id$annotations() {
        }

        @SerialName("isAdjustment")
        @JsonAnnotations2(names = {"is_adjustment"})
        public static /* synthetic */ void is_adjustment$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final NBBODetailsDto getNbbo_details() {
            return this.nbbo_details;
        }

        /* renamed from: component2, reason: from getter */
        public final UUIDDto getPending_execution_id() {
            return this.pending_execution_id;
        }

        /* renamed from: component3, reason: from getter */
        public final UUIDDto getPrice_source_execution_id() {
            return this.price_source_execution_id;
        }

        /* renamed from: component4, reason: from getter */
        public final CapacityDto getCapacity() {
            return this.capacity;
        }

        /* renamed from: component5, reason: from getter */
        public final NullableBoolDto getIs_adjustment() {
            return this.is_adjustment;
        }

        /* renamed from: component6, reason: from getter */
        public final UUIDDto getFirm_order_id() {
            return this.firm_order_id;
        }

        public final Surrogate copy(NBBODetailsDto nbbo_details, UUIDDto pending_execution_id, UUIDDto price_source_execution_id, CapacityDto capacity, NullableBoolDto is_adjustment, UUIDDto firm_order_id) {
            Intrinsics.checkNotNullParameter(capacity, "capacity");
            return new Surrogate(nbbo_details, pending_execution_id, price_source_execution_id, capacity, is_adjustment, firm_order_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.nbbo_details, surrogate.nbbo_details) && Intrinsics.areEqual(this.pending_execution_id, surrogate.pending_execution_id) && Intrinsics.areEqual(this.price_source_execution_id, surrogate.price_source_execution_id) && this.capacity == surrogate.capacity && Intrinsics.areEqual(this.is_adjustment, surrogate.is_adjustment) && Intrinsics.areEqual(this.firm_order_id, surrogate.firm_order_id);
        }

        public int hashCode() {
            NBBODetailsDto nBBODetailsDto = this.nbbo_details;
            int iHashCode = (nBBODetailsDto == null ? 0 : nBBODetailsDto.hashCode()) * 31;
            UUIDDto uUIDDto = this.pending_execution_id;
            int iHashCode2 = (iHashCode + (uUIDDto == null ? 0 : uUIDDto.hashCode())) * 31;
            UUIDDto uUIDDto2 = this.price_source_execution_id;
            int iHashCode3 = (((iHashCode2 + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31) + this.capacity.hashCode()) * 31;
            NullableBoolDto nullableBoolDto = this.is_adjustment;
            int iHashCode4 = (iHashCode3 + (nullableBoolDto == null ? 0 : nullableBoolDto.hashCode())) * 31;
            UUIDDto uUIDDto3 = this.firm_order_id;
            return iHashCode4 + (uUIDDto3 != null ? uUIDDto3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(nbbo_details=" + this.nbbo_details + ", pending_execution_id=" + this.pending_execution_id + ", price_source_execution_id=" + this.price_source_execution_id + ", capacity=" + this.capacity + ", is_adjustment=" + this.is_adjustment + ", firm_order_id=" + this.firm_order_id + ")";
        }

        /* compiled from: FractionalExecutionDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FractionalExecutionDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, NBBODetailsDto nBBODetailsDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, CapacityDto capacityDto, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.nbbo_details = null;
            } else {
                this.nbbo_details = nBBODetailsDto;
            }
            if ((i & 2) == 0) {
                this.pending_execution_id = null;
            } else {
                this.pending_execution_id = uUIDDto;
            }
            if ((i & 4) == 0) {
                this.price_source_execution_id = null;
            } else {
                this.price_source_execution_id = uUIDDto2;
            }
            if ((i & 8) == 0) {
                this.capacity = CapacityDto.INSTANCE.getZeroValue();
            } else {
                this.capacity = capacityDto;
            }
            if ((i & 16) == 0) {
                this.is_adjustment = null;
            } else {
                this.is_adjustment = nullableBoolDto;
            }
            if ((i & 32) == 0) {
                this.firm_order_id = null;
            } else {
                this.firm_order_id = uUIDDto3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            NBBODetailsDto nBBODetailsDto = self.nbbo_details;
            if (nBBODetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, NBBODetailsDto.Serializer.INSTANCE, nBBODetailsDto);
            }
            UUIDDto uUIDDto = self.pending_execution_id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            UUIDDto uUIDDto2 = self.price_source_execution_id;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            if (self.capacity != CapacityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, CapacityDto.Serializer.INSTANCE, self.capacity);
            }
            NullableBoolDto nullableBoolDto = self.is_adjustment;
            if (nullableBoolDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, NullableBoolDto.Serializer.INSTANCE, nullableBoolDto);
            }
            UUIDDto uUIDDto3 = self.firm_order_id;
            if (uUIDDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, UUIDDto.Serializer.INSTANCE, uUIDDto3);
            }
        }

        public Surrogate(NBBODetailsDto nBBODetailsDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, CapacityDto capacity, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto3) {
            Intrinsics.checkNotNullParameter(capacity, "capacity");
            this.nbbo_details = nBBODetailsDto;
            this.pending_execution_id = uUIDDto;
            this.price_source_execution_id = uUIDDto2;
            this.capacity = capacity;
            this.is_adjustment = nullableBoolDto;
            this.firm_order_id = uUIDDto3;
        }

        public final NBBODetailsDto getNbbo_details() {
            return this.nbbo_details;
        }

        public final UUIDDto getPending_execution_id() {
            return this.pending_execution_id;
        }

        public final UUIDDto getPrice_source_execution_id() {
            return this.price_source_execution_id;
        }

        public final CapacityDto getCapacity() {
            return this.capacity;
        }

        public /* synthetic */ Surrogate(NBBODetailsDto nBBODetailsDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, CapacityDto capacityDto, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nBBODetailsDto, (i & 2) != 0 ? null : uUIDDto, (i & 4) != 0 ? null : uUIDDto2, (i & 8) != 0 ? CapacityDto.INSTANCE.getZeroValue() : capacityDto, (i & 16) != 0 ? null : nullableBoolDto, (i & 32) != 0 ? null : uUIDDto3);
        }

        public final NullableBoolDto is_adjustment() {
            return this.is_adjustment;
        }

        public final UUIDDto getFirm_order_id() {
            return this.firm_order_id;
        }
    }

    /* compiled from: FractionalExecutionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;", "Lcom/robinhood/rosetta/mainst/FractionalExecutionDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FractionalExecutionDetailsDto, FractionalExecutionDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FractionalExecutionDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FractionalExecutionDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FractionalExecutionDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) FractionalExecutionDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FractionalExecutionDetails> getProtoAdapter() {
            return FractionalExecutionDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FractionalExecutionDetailsDto getZeroValue() {
            return FractionalExecutionDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FractionalExecutionDetailsDto fromProto(FractionalExecutionDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            NBBODetails nbbo_details = proto.getNbbo_details();
            DefaultConstructorMarker defaultConstructorMarker = null;
            NBBODetailsDto nBBODetailsDtoFromProto = nbbo_details != null ? NBBODetailsDto.INSTANCE.fromProto(nbbo_details) : null;
            UUID pending_execution_id = proto.getPending_execution_id();
            UUIDDto uUIDDtoFromProto = pending_execution_id != null ? UUIDDto.INSTANCE.fromProto(pending_execution_id) : null;
            UUID price_source_execution_id = proto.getPrice_source_execution_id();
            UUIDDto uUIDDtoFromProto2 = price_source_execution_id != null ? UUIDDto.INSTANCE.fromProto(price_source_execution_id) : null;
            CapacityDto capacityDtoFromProto = CapacityDto.INSTANCE.fromProto(proto.getCapacity());
            NullableBool is_adjustment = proto.getIs_adjustment();
            NullableBoolDto nullableBoolDtoFromProto = is_adjustment != null ? NullableBoolDto.INSTANCE.fromProto(is_adjustment) : null;
            UUID firm_order_id = proto.getFirm_order_id();
            return new FractionalExecutionDetailsDto(new Surrogate(nBBODetailsDtoFromProto, uUIDDtoFromProto, uUIDDtoFromProto2, capacityDtoFromProto, nullableBoolDtoFromProto, firm_order_id != null ? UUIDDto.INSTANCE.fromProto(firm_order_id) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.FractionalExecutionDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FractionalExecutionDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FractionalExecutionDetailsDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FractionalExecutionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<FractionalExecutionDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.FractionalExecutionDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FractionalExecutionDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FractionalExecutionDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FractionalExecutionDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FractionalExecutionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.FractionalExecutionDetailsDto";
        }
    }
}
