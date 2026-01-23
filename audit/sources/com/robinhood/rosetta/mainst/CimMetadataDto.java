package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.TimeDto;
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

/* compiled from: CimMetadataDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u0012JX\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fJ\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0013\u0010 \u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CimMetadataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/CimMetadata;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/CimMetadataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/CimMetadataDto$Surrogate;)V", "im_inventory_sent_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "im_open_sell_sent_at", "aggregate_position_lower_bound", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "is_notional_overdelivery", "", "original_leftover_quantity", "inventory_position", "open_sell_position", "(Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;ZLcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;)V", "getIm_inventory_sent_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getIm_open_sell_sent_at", "getAggregate_position_lower_bound", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "()Z", "getOriginal_leftover_quantity", "getInventory_position", "getOpen_sell_position", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class CimMetadataDto implements Dto3<CimMetadata>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CimMetadataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CimMetadataDto, CimMetadata>> binaryBase64Serializer$delegate;
    private static final CimMetadataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CimMetadataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CimMetadataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TimeDto getIm_inventory_sent_at() {
        return this.surrogate.getIm_inventory_sent_at();
    }

    public final TimeDto getIm_open_sell_sent_at() {
        return this.surrogate.getIm_open_sell_sent_at();
    }

    public final DecimalDto getAggregate_position_lower_bound() {
        return this.surrogate.getAggregate_position_lower_bound();
    }

    public final boolean is_notional_overdelivery() {
        return this.surrogate.is_notional_overdelivery();
    }

    public final DecimalDto getOriginal_leftover_quantity() {
        return this.surrogate.getOriginal_leftover_quantity();
    }

    public final DecimalDto getInventory_position() {
        return this.surrogate.getInventory_position();
    }

    public final DecimalDto getOpen_sell_position() {
        return this.surrogate.getOpen_sell_position();
    }

    public /* synthetic */ CimMetadataDto(TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, boolean z, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : timeDto, (i & 2) != 0 ? null : timeDto2, (i & 4) != 0 ? null : decimalDto, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : decimalDto2, (i & 32) != 0 ? null : decimalDto3, (i & 64) != 0 ? null : decimalDto4);
    }

    public CimMetadataDto(TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, boolean z, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4) {
        this(new Surrogate(timeDto, timeDto2, decimalDto, z, decimalDto2, decimalDto3, decimalDto4));
    }

    public static /* synthetic */ CimMetadataDto copy$default(CimMetadataDto cimMetadataDto, TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, boolean z, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, int i, Object obj) {
        if ((i & 1) != 0) {
            timeDto = cimMetadataDto.surrogate.getIm_inventory_sent_at();
        }
        if ((i & 2) != 0) {
            timeDto2 = cimMetadataDto.surrogate.getIm_open_sell_sent_at();
        }
        if ((i & 4) != 0) {
            decimalDto = cimMetadataDto.surrogate.getAggregate_position_lower_bound();
        }
        if ((i & 8) != 0) {
            z = cimMetadataDto.surrogate.is_notional_overdelivery();
        }
        if ((i & 16) != 0) {
            decimalDto2 = cimMetadataDto.surrogate.getOriginal_leftover_quantity();
        }
        if ((i & 32) != 0) {
            decimalDto3 = cimMetadataDto.surrogate.getInventory_position();
        }
        if ((i & 64) != 0) {
            decimalDto4 = cimMetadataDto.surrogate.getOpen_sell_position();
        }
        DecimalDto decimalDto5 = decimalDto3;
        DecimalDto decimalDto6 = decimalDto4;
        DecimalDto decimalDto7 = decimalDto2;
        DecimalDto decimalDto8 = decimalDto;
        return cimMetadataDto.copy(timeDto, timeDto2, decimalDto8, z, decimalDto7, decimalDto5, decimalDto6);
    }

    public final CimMetadataDto copy(TimeDto im_inventory_sent_at, TimeDto im_open_sell_sent_at, DecimalDto aggregate_position_lower_bound, boolean is_notional_overdelivery, DecimalDto original_leftover_quantity, DecimalDto inventory_position, DecimalDto open_sell_position) {
        return new CimMetadataDto(new Surrogate(im_inventory_sent_at, im_open_sell_sent_at, aggregate_position_lower_bound, is_notional_overdelivery, original_leftover_quantity, inventory_position, open_sell_position));
    }

    @Override // com.robinhood.idl.Dto
    public CimMetadata toProto() {
        TimeDto im_inventory_sent_at = this.surrogate.getIm_inventory_sent_at();
        Time proto = im_inventory_sent_at != null ? im_inventory_sent_at.toProto() : null;
        TimeDto im_open_sell_sent_at = this.surrogate.getIm_open_sell_sent_at();
        Time proto2 = im_open_sell_sent_at != null ? im_open_sell_sent_at.toProto() : null;
        DecimalDto aggregate_position_lower_bound = this.surrogate.getAggregate_position_lower_bound();
        Decimal proto3 = aggregate_position_lower_bound != null ? aggregate_position_lower_bound.toProto() : null;
        boolean zIs_notional_overdelivery = this.surrogate.is_notional_overdelivery();
        DecimalDto original_leftover_quantity = this.surrogate.getOriginal_leftover_quantity();
        Decimal proto4 = original_leftover_quantity != null ? original_leftover_quantity.toProto() : null;
        DecimalDto inventory_position = this.surrogate.getInventory_position();
        Decimal proto5 = inventory_position != null ? inventory_position.toProto() : null;
        DecimalDto open_sell_position = this.surrogate.getOpen_sell_position();
        return new CimMetadata(proto, proto2, proto3, zIs_notional_overdelivery, proto4, proto5, open_sell_position != null ? open_sell_position.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[CimMetadataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CimMetadataDto) && Intrinsics.areEqual(((CimMetadataDto) other).surrogate, this.surrogate);
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
    /* compiled from: CimMetadataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J[\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000fHÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u0007\u0010\u001dR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u001bR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u001b¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CimMetadataDto$Surrogate;", "", "im_inventory_sent_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "im_open_sell_sent_at", "aggregate_position_lower_bound", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "is_notional_overdelivery", "", "original_leftover_quantity", "inventory_position", "open_sell_position", "<init>", "(Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;ZLcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;ZLcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIm_inventory_sent_at$annotations", "()V", "getIm_inventory_sent_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getIm_open_sell_sent_at$annotations", "getIm_open_sell_sent_at", "getAggregate_position_lower_bound$annotations", "getAggregate_position_lower_bound", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "is_notional_overdelivery$annotations", "()Z", "getOriginal_leftover_quantity$annotations", "getOriginal_leftover_quantity", "getInventory_position$annotations", "getInventory_position", "getOpen_sell_position$annotations", "getOpen_sell_position", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DecimalDto aggregate_position_lower_bound;
        private final TimeDto im_inventory_sent_at;
        private final TimeDto im_open_sell_sent_at;
        private final DecimalDto inventory_position;
        private final boolean is_notional_overdelivery;
        private final DecimalDto open_sell_position;
        private final DecimalDto original_leftover_quantity;

        public Surrogate() {
            this((TimeDto) null, (TimeDto) null, (DecimalDto) null, false, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, boolean z, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, int i, Object obj) {
            if ((i & 1) != 0) {
                timeDto = surrogate.im_inventory_sent_at;
            }
            if ((i & 2) != 0) {
                timeDto2 = surrogate.im_open_sell_sent_at;
            }
            if ((i & 4) != 0) {
                decimalDto = surrogate.aggregate_position_lower_bound;
            }
            if ((i & 8) != 0) {
                z = surrogate.is_notional_overdelivery;
            }
            if ((i & 16) != 0) {
                decimalDto2 = surrogate.original_leftover_quantity;
            }
            if ((i & 32) != 0) {
                decimalDto3 = surrogate.inventory_position;
            }
            if ((i & 64) != 0) {
                decimalDto4 = surrogate.open_sell_position;
            }
            DecimalDto decimalDto5 = decimalDto3;
            DecimalDto decimalDto6 = decimalDto4;
            DecimalDto decimalDto7 = decimalDto2;
            DecimalDto decimalDto8 = decimalDto;
            return surrogate.copy(timeDto, timeDto2, decimalDto8, z, decimalDto7, decimalDto5, decimalDto6);
        }

        @SerialName("aggregatePositionLowerBound")
        @JsonAnnotations2(names = {"aggregate_position_lower_bound"})
        public static /* synthetic */ void getAggregate_position_lower_bound$annotations() {
        }

        @SerialName("imInventorySentAt")
        @JsonAnnotations2(names = {"im_inventory_sent_at"})
        public static /* synthetic */ void getIm_inventory_sent_at$annotations() {
        }

        @SerialName("imOpenSellSentAt")
        @JsonAnnotations2(names = {"im_open_sell_sent_at"})
        public static /* synthetic */ void getIm_open_sell_sent_at$annotations() {
        }

        @SerialName("inventoryPosition")
        @JsonAnnotations2(names = {"inventory_position"})
        public static /* synthetic */ void getInventory_position$annotations() {
        }

        @SerialName("openSellPosition")
        @JsonAnnotations2(names = {"open_sell_position"})
        public static /* synthetic */ void getOpen_sell_position$annotations() {
        }

        @SerialName("originalLeftoverQuantity")
        @JsonAnnotations2(names = {"original_leftover_quantity"})
        public static /* synthetic */ void getOriginal_leftover_quantity$annotations() {
        }

        @SerialName("isNotionalOverdelivery")
        @JsonAnnotations2(names = {"is_notional_overdelivery"})
        public static /* synthetic */ void is_notional_overdelivery$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final TimeDto getIm_inventory_sent_at() {
            return this.im_inventory_sent_at;
        }

        /* renamed from: component2, reason: from getter */
        public final TimeDto getIm_open_sell_sent_at() {
            return this.im_open_sell_sent_at;
        }

        /* renamed from: component3, reason: from getter */
        public final DecimalDto getAggregate_position_lower_bound() {
            return this.aggregate_position_lower_bound;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIs_notional_overdelivery() {
            return this.is_notional_overdelivery;
        }

        /* renamed from: component5, reason: from getter */
        public final DecimalDto getOriginal_leftover_quantity() {
            return this.original_leftover_quantity;
        }

        /* renamed from: component6, reason: from getter */
        public final DecimalDto getInventory_position() {
            return this.inventory_position;
        }

        /* renamed from: component7, reason: from getter */
        public final DecimalDto getOpen_sell_position() {
            return this.open_sell_position;
        }

        public final Surrogate copy(TimeDto im_inventory_sent_at, TimeDto im_open_sell_sent_at, DecimalDto aggregate_position_lower_bound, boolean is_notional_overdelivery, DecimalDto original_leftover_quantity, DecimalDto inventory_position, DecimalDto open_sell_position) {
            return new Surrogate(im_inventory_sent_at, im_open_sell_sent_at, aggregate_position_lower_bound, is_notional_overdelivery, original_leftover_quantity, inventory_position, open_sell_position);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.im_inventory_sent_at, surrogate.im_inventory_sent_at) && Intrinsics.areEqual(this.im_open_sell_sent_at, surrogate.im_open_sell_sent_at) && Intrinsics.areEqual(this.aggregate_position_lower_bound, surrogate.aggregate_position_lower_bound) && this.is_notional_overdelivery == surrogate.is_notional_overdelivery && Intrinsics.areEqual(this.original_leftover_quantity, surrogate.original_leftover_quantity) && Intrinsics.areEqual(this.inventory_position, surrogate.inventory_position) && Intrinsics.areEqual(this.open_sell_position, surrogate.open_sell_position);
        }

        public int hashCode() {
            TimeDto timeDto = this.im_inventory_sent_at;
            int iHashCode = (timeDto == null ? 0 : timeDto.hashCode()) * 31;
            TimeDto timeDto2 = this.im_open_sell_sent_at;
            int iHashCode2 = (iHashCode + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31;
            DecimalDto decimalDto = this.aggregate_position_lower_bound;
            int iHashCode3 = (((iHashCode2 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31) + Boolean.hashCode(this.is_notional_overdelivery)) * 31;
            DecimalDto decimalDto2 = this.original_leftover_quantity;
            int iHashCode4 = (iHashCode3 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            DecimalDto decimalDto3 = this.inventory_position;
            int iHashCode5 = (iHashCode4 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31;
            DecimalDto decimalDto4 = this.open_sell_position;
            return iHashCode5 + (decimalDto4 != null ? decimalDto4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(im_inventory_sent_at=" + this.im_inventory_sent_at + ", im_open_sell_sent_at=" + this.im_open_sell_sent_at + ", aggregate_position_lower_bound=" + this.aggregate_position_lower_bound + ", is_notional_overdelivery=" + this.is_notional_overdelivery + ", original_leftover_quantity=" + this.original_leftover_quantity + ", inventory_position=" + this.inventory_position + ", open_sell_position=" + this.open_sell_position + ")";
        }

        /* compiled from: CimMetadataDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CimMetadataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/CimMetadataDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CimMetadataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, boolean z, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.im_inventory_sent_at = null;
            } else {
                this.im_inventory_sent_at = timeDto;
            }
            if ((i & 2) == 0) {
                this.im_open_sell_sent_at = null;
            } else {
                this.im_open_sell_sent_at = timeDto2;
            }
            if ((i & 4) == 0) {
                this.aggregate_position_lower_bound = null;
            } else {
                this.aggregate_position_lower_bound = decimalDto;
            }
            if ((i & 8) == 0) {
                this.is_notional_overdelivery = false;
            } else {
                this.is_notional_overdelivery = z;
            }
            if ((i & 16) == 0) {
                this.original_leftover_quantity = null;
            } else {
                this.original_leftover_quantity = decimalDto2;
            }
            if ((i & 32) == 0) {
                this.inventory_position = null;
            } else {
                this.inventory_position = decimalDto3;
            }
            if ((i & 64) == 0) {
                this.open_sell_position = null;
            } else {
                this.open_sell_position = decimalDto4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            TimeDto timeDto = self.im_inventory_sent_at;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.im_open_sell_sent_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            DecimalDto decimalDto = self.aggregate_position_lower_bound;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            boolean z = self.is_notional_overdelivery;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            DecimalDto decimalDto2 = self.original_leftover_quantity;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            DecimalDto decimalDto3 = self.inventory_position;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            DecimalDto decimalDto4 = self.open_sell_position;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
        }

        public Surrogate(TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, boolean z, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4) {
            this.im_inventory_sent_at = timeDto;
            this.im_open_sell_sent_at = timeDto2;
            this.aggregate_position_lower_bound = decimalDto;
            this.is_notional_overdelivery = z;
            this.original_leftover_quantity = decimalDto2;
            this.inventory_position = decimalDto3;
            this.open_sell_position = decimalDto4;
        }

        public /* synthetic */ Surrogate(TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, boolean z, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : timeDto, (i & 2) != 0 ? null : timeDto2, (i & 4) != 0 ? null : decimalDto, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : decimalDto2, (i & 32) != 0 ? null : decimalDto3, (i & 64) != 0 ? null : decimalDto4);
        }

        public final TimeDto getIm_inventory_sent_at() {
            return this.im_inventory_sent_at;
        }

        public final TimeDto getIm_open_sell_sent_at() {
            return this.im_open_sell_sent_at;
        }

        public final DecimalDto getAggregate_position_lower_bound() {
            return this.aggregate_position_lower_bound;
        }

        public final boolean is_notional_overdelivery() {
            return this.is_notional_overdelivery;
        }

        public final DecimalDto getOriginal_leftover_quantity() {
            return this.original_leftover_quantity;
        }

        public final DecimalDto getInventory_position() {
            return this.inventory_position;
        }

        public final DecimalDto getOpen_sell_position() {
            return this.open_sell_position;
        }
    }

    /* compiled from: CimMetadataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CimMetadataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/CimMetadataDto;", "Lcom/robinhood/rosetta/mainst/CimMetadata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/CimMetadataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CimMetadataDto, CimMetadata> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CimMetadataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CimMetadataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CimMetadataDto> getBinaryBase64Serializer() {
            return (KSerializer) CimMetadataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CimMetadata> getProtoAdapter() {
            return CimMetadata.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CimMetadataDto getZeroValue() {
            return CimMetadataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CimMetadataDto fromProto(CimMetadata proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Time im_inventory_sent_at = proto.getIm_inventory_sent_at();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TimeDto timeDtoFromProto = im_inventory_sent_at != null ? TimeDto.INSTANCE.fromProto(im_inventory_sent_at) : null;
            Time im_open_sell_sent_at = proto.getIm_open_sell_sent_at();
            TimeDto timeDtoFromProto2 = im_open_sell_sent_at != null ? TimeDto.INSTANCE.fromProto(im_open_sell_sent_at) : null;
            Decimal aggregate_position_lower_bound = proto.getAggregate_position_lower_bound();
            DecimalDto decimalDtoFromProto = aggregate_position_lower_bound != null ? DecimalDto.INSTANCE.fromProto(aggregate_position_lower_bound) : null;
            boolean is_notional_overdelivery = proto.getIs_notional_overdelivery();
            Decimal original_leftover_quantity = proto.getOriginal_leftover_quantity();
            DecimalDto decimalDtoFromProto2 = original_leftover_quantity != null ? DecimalDto.INSTANCE.fromProto(original_leftover_quantity) : null;
            Decimal inventory_position = proto.getInventory_position();
            DecimalDto decimalDtoFromProto3 = inventory_position != null ? DecimalDto.INSTANCE.fromProto(inventory_position) : null;
            Decimal open_sell_position = proto.getOpen_sell_position();
            return new CimMetadataDto(new Surrogate(timeDtoFromProto, timeDtoFromProto2, decimalDtoFromProto, is_notional_overdelivery, decimalDtoFromProto2, decimalDtoFromProto3, open_sell_position != null ? DecimalDto.INSTANCE.fromProto(open_sell_position) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.CimMetadataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CimMetadataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CimMetadataDto(null, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CimMetadataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CimMetadataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/CimMetadataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/CimMetadataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CimMetadataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.CimMetadata", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CimMetadataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CimMetadataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CimMetadataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CimMetadataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CimMetadataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.CimMetadataDto";
        }
    }
}
