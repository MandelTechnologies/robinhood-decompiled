package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
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

/* compiled from: ChildMarketCoinSpecDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ@\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0013\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpec;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto$Surrogate;)V", "min_order_size", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "max_order_size", "min_order_price_increment", "min_order_quantity_increment", "is_valid_spec", "", "(Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Z)V", "getMin_order_size", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getMax_order_size", "getMin_order_price_increment", "getMin_order_quantity_increment", "()Z", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class ChildMarketCoinSpecDto implements Dto3<ChildMarketCoinSpec>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ChildMarketCoinSpecDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ChildMarketCoinSpecDto, ChildMarketCoinSpec>> binaryBase64Serializer$delegate;
    private static final ChildMarketCoinSpecDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ChildMarketCoinSpecDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ChildMarketCoinSpecDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DecimalDto getMin_order_size() {
        return this.surrogate.getMin_order_size();
    }

    public final DecimalDto getMax_order_size() {
        return this.surrogate.getMax_order_size();
    }

    public final DecimalDto getMin_order_price_increment() {
        return this.surrogate.getMin_order_price_increment();
    }

    public final DecimalDto getMin_order_quantity_increment() {
        return this.surrogate.getMin_order_quantity_increment();
    }

    public final boolean is_valid_spec() {
        return this.surrogate.is_valid_spec();
    }

    public /* synthetic */ ChildMarketCoinSpecDto(DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : decimalDto, (i & 2) != 0 ? null : decimalDto2, (i & 4) != 0 ? null : decimalDto3, (i & 8) != 0 ? null : decimalDto4, (i & 16) != 0 ? false : z);
    }

    public ChildMarketCoinSpecDto(DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, boolean z) {
        this(new Surrogate(decimalDto, decimalDto2, decimalDto3, decimalDto4, z));
    }

    public static /* synthetic */ ChildMarketCoinSpecDto copy$default(ChildMarketCoinSpecDto childMarketCoinSpecDto, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            decimalDto = childMarketCoinSpecDto.surrogate.getMin_order_size();
        }
        if ((i & 2) != 0) {
            decimalDto2 = childMarketCoinSpecDto.surrogate.getMax_order_size();
        }
        if ((i & 4) != 0) {
            decimalDto3 = childMarketCoinSpecDto.surrogate.getMin_order_price_increment();
        }
        if ((i & 8) != 0) {
            decimalDto4 = childMarketCoinSpecDto.surrogate.getMin_order_quantity_increment();
        }
        if ((i & 16) != 0) {
            z = childMarketCoinSpecDto.surrogate.is_valid_spec();
        }
        boolean z2 = z;
        DecimalDto decimalDto5 = decimalDto3;
        return childMarketCoinSpecDto.copy(decimalDto, decimalDto2, decimalDto5, decimalDto4, z2);
    }

    public final ChildMarketCoinSpecDto copy(DecimalDto min_order_size, DecimalDto max_order_size, DecimalDto min_order_price_increment, DecimalDto min_order_quantity_increment, boolean is_valid_spec) {
        return new ChildMarketCoinSpecDto(new Surrogate(min_order_size, max_order_size, min_order_price_increment, min_order_quantity_increment, is_valid_spec));
    }

    @Override // com.robinhood.idl.Dto
    public ChildMarketCoinSpec toProto() {
        DecimalDto min_order_size = this.surrogate.getMin_order_size();
        Decimal proto = min_order_size != null ? min_order_size.toProto() : null;
        DecimalDto max_order_size = this.surrogate.getMax_order_size();
        Decimal proto2 = max_order_size != null ? max_order_size.toProto() : null;
        DecimalDto min_order_price_increment = this.surrogate.getMin_order_price_increment();
        Decimal proto3 = min_order_price_increment != null ? min_order_price_increment.toProto() : null;
        DecimalDto min_order_quantity_increment = this.surrogate.getMin_order_quantity_increment();
        return new ChildMarketCoinSpec(proto, proto2, proto3, min_order_quantity_increment != null ? min_order_quantity_increment.toProto() : null, this.surrogate.is_valid_spec(), null, 32, null);
    }

    public String toString() {
        return "[ChildMarketCoinSpecDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ChildMarketCoinSpecDto) && Intrinsics.areEqual(((ChildMarketCoinSpecDto) other).surrogate, this.surrogate);
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
    /* compiled from: ChildMarketCoinSpecDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 02\u00020\u0001:\u0002/0BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003JC\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0007\u0010\u001b¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto$Surrogate;", "", "min_order_size", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "max_order_size", "min_order_price_increment", "min_order_quantity_increment", "is_valid_spec", "", "<init>", "(Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMin_order_size$annotations", "()V", "getMin_order_size", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getMax_order_size$annotations", "getMax_order_size", "getMin_order_price_increment$annotations", "getMin_order_price_increment", "getMin_order_quantity_increment$annotations", "getMin_order_quantity_increment", "is_valid_spec$annotations", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean is_valid_spec;
        private final DecimalDto max_order_size;
        private final DecimalDto min_order_price_increment;
        private final DecimalDto min_order_quantity_increment;
        private final DecimalDto min_order_size;

        public Surrogate() {
            this((DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, false, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                decimalDto = surrogate.min_order_size;
            }
            if ((i & 2) != 0) {
                decimalDto2 = surrogate.max_order_size;
            }
            if ((i & 4) != 0) {
                decimalDto3 = surrogate.min_order_price_increment;
            }
            if ((i & 8) != 0) {
                decimalDto4 = surrogate.min_order_quantity_increment;
            }
            if ((i & 16) != 0) {
                z = surrogate.is_valid_spec;
            }
            boolean z2 = z;
            DecimalDto decimalDto5 = decimalDto3;
            return surrogate.copy(decimalDto, decimalDto2, decimalDto5, decimalDto4, z2);
        }

        @SerialName("maxOrderSize")
        @JsonAnnotations2(names = {"max_order_size"})
        public static /* synthetic */ void getMax_order_size$annotations() {
        }

        @SerialName("minOrderPriceIncrement")
        @JsonAnnotations2(names = {"min_order_price_increment"})
        public static /* synthetic */ void getMin_order_price_increment$annotations() {
        }

        @SerialName("minOrderQuantityIncrement")
        @JsonAnnotations2(names = {"min_order_quantity_increment"})
        public static /* synthetic */ void getMin_order_quantity_increment$annotations() {
        }

        @SerialName("minOrderSize")
        @JsonAnnotations2(names = {"min_order_size"})
        public static /* synthetic */ void getMin_order_size$annotations() {
        }

        @SerialName("isValidSpec")
        @JsonAnnotations2(names = {"is_valid_spec"})
        public static /* synthetic */ void is_valid_spec$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DecimalDto getMin_order_size() {
            return this.min_order_size;
        }

        /* renamed from: component2, reason: from getter */
        public final DecimalDto getMax_order_size() {
            return this.max_order_size;
        }

        /* renamed from: component3, reason: from getter */
        public final DecimalDto getMin_order_price_increment() {
            return this.min_order_price_increment;
        }

        /* renamed from: component4, reason: from getter */
        public final DecimalDto getMin_order_quantity_increment() {
            return this.min_order_quantity_increment;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIs_valid_spec() {
            return this.is_valid_spec;
        }

        public final Surrogate copy(DecimalDto min_order_size, DecimalDto max_order_size, DecimalDto min_order_price_increment, DecimalDto min_order_quantity_increment, boolean is_valid_spec) {
            return new Surrogate(min_order_size, max_order_size, min_order_price_increment, min_order_quantity_increment, is_valid_spec);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.min_order_size, surrogate.min_order_size) && Intrinsics.areEqual(this.max_order_size, surrogate.max_order_size) && Intrinsics.areEqual(this.min_order_price_increment, surrogate.min_order_price_increment) && Intrinsics.areEqual(this.min_order_quantity_increment, surrogate.min_order_quantity_increment) && this.is_valid_spec == surrogate.is_valid_spec;
        }

        public int hashCode() {
            DecimalDto decimalDto = this.min_order_size;
            int iHashCode = (decimalDto == null ? 0 : decimalDto.hashCode()) * 31;
            DecimalDto decimalDto2 = this.max_order_size;
            int iHashCode2 = (iHashCode + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            DecimalDto decimalDto3 = this.min_order_price_increment;
            int iHashCode3 = (iHashCode2 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31;
            DecimalDto decimalDto4 = this.min_order_quantity_increment;
            return ((iHashCode3 + (decimalDto4 != null ? decimalDto4.hashCode() : 0)) * 31) + Boolean.hashCode(this.is_valid_spec);
        }

        public String toString() {
            return "Surrogate(min_order_size=" + this.min_order_size + ", max_order_size=" + this.max_order_size + ", min_order_price_increment=" + this.min_order_price_increment + ", min_order_quantity_increment=" + this.min_order_quantity_increment + ", is_valid_spec=" + this.is_valid_spec + ")";
        }

        /* compiled from: ChildMarketCoinSpecDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ChildMarketCoinSpecDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.min_order_size = null;
            } else {
                this.min_order_size = decimalDto;
            }
            if ((i & 2) == 0) {
                this.max_order_size = null;
            } else {
                this.max_order_size = decimalDto2;
            }
            if ((i & 4) == 0) {
                this.min_order_price_increment = null;
            } else {
                this.min_order_price_increment = decimalDto3;
            }
            if ((i & 8) == 0) {
                this.min_order_quantity_increment = null;
            } else {
                this.min_order_quantity_increment = decimalDto4;
            }
            if ((i & 16) == 0) {
                this.is_valid_spec = false;
            } else {
                this.is_valid_spec = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DecimalDto decimalDto = self.min_order_size;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            DecimalDto decimalDto2 = self.max_order_size;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            DecimalDto decimalDto3 = self.min_order_price_increment;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            DecimalDto decimalDto4 = self.min_order_quantity_increment;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
            boolean z = self.is_valid_spec;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
        }

        public Surrogate(DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, boolean z) {
            this.min_order_size = decimalDto;
            this.max_order_size = decimalDto2;
            this.min_order_price_increment = decimalDto3;
            this.min_order_quantity_increment = decimalDto4;
            this.is_valid_spec = z;
        }

        public /* synthetic */ Surrogate(DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : decimalDto, (i & 2) != 0 ? null : decimalDto2, (i & 4) != 0 ? null : decimalDto3, (i & 8) != 0 ? null : decimalDto4, (i & 16) != 0 ? false : z);
        }

        public final DecimalDto getMin_order_size() {
            return this.min_order_size;
        }

        public final DecimalDto getMax_order_size() {
            return this.max_order_size;
        }

        public final DecimalDto getMin_order_price_increment() {
            return this.min_order_price_increment;
        }

        public final DecimalDto getMin_order_quantity_increment() {
            return this.min_order_quantity_increment;
        }

        public final boolean is_valid_spec() {
            return this.is_valid_spec;
        }
    }

    /* compiled from: ChildMarketCoinSpecDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto;", "Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpec;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ChildMarketCoinSpecDto, ChildMarketCoinSpec> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChildMarketCoinSpecDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChildMarketCoinSpecDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChildMarketCoinSpecDto> getBinaryBase64Serializer() {
            return (KSerializer) ChildMarketCoinSpecDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ChildMarketCoinSpec> getProtoAdapter() {
            return ChildMarketCoinSpec.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChildMarketCoinSpecDto getZeroValue() {
            return ChildMarketCoinSpecDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChildMarketCoinSpecDto fromProto(ChildMarketCoinSpec proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Decimal min_order_size = proto.getMin_order_size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DecimalDto decimalDtoFromProto = min_order_size != null ? DecimalDto.INSTANCE.fromProto(min_order_size) : null;
            Decimal max_order_size = proto.getMax_order_size();
            DecimalDto decimalDtoFromProto2 = max_order_size != null ? DecimalDto.INSTANCE.fromProto(max_order_size) : null;
            Decimal min_order_price_increment = proto.getMin_order_price_increment();
            DecimalDto decimalDtoFromProto3 = min_order_price_increment != null ? DecimalDto.INSTANCE.fromProto(min_order_price_increment) : null;
            Decimal min_order_quantity_increment = proto.getMin_order_quantity_increment();
            return new ChildMarketCoinSpecDto(new Surrogate(decimalDtoFromProto, decimalDtoFromProto2, decimalDtoFromProto3, min_order_quantity_increment != null ? DecimalDto.INSTANCE.fromProto(min_order_quantity_increment) : null, proto.getIs_valid_spec()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.ChildMarketCoinSpecDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChildMarketCoinSpecDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ChildMarketCoinSpecDto(null, null, null, null, false, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ChildMarketCoinSpecDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ChildMarketCoinSpecDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.ChildMarketCoinSpec", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ChildMarketCoinSpecDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ChildMarketCoinSpecDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ChildMarketCoinSpecDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ChildMarketCoinSpecDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpecDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.ChildMarketCoinSpecDto";
        }
    }
}
