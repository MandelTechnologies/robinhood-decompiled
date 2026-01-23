package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.OrderPriceTypeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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

/* compiled from: ValidateOrderInvalidTickDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0010J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006,"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto$Surrogate;)V", "symbol", "", "tick_size", "Lcom/robinhood/idl/IdlDecimal;", "price_type", "Lcom/robinhood/ceres/v1/OrderPriceTypeDto;", "given_price", "recommended_price", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/ceres/v1/OrderPriceTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "getSymbol", "()Ljava/lang/String;", "getTick_size", "()Lcom/robinhood/idl/IdlDecimal;", "getPrice_type", "()Lcom/robinhood/ceres/v1/OrderPriceTypeDto;", "getGiven_price", "getRecommended_price", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class ValidateOrderInvalidTickDetailsDto implements Dto3<ValidateOrderInvalidTickDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ValidateOrderInvalidTickDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ValidateOrderInvalidTickDetailsDto, ValidateOrderInvalidTickDetails>> binaryBase64Serializer$delegate;
    private static final ValidateOrderInvalidTickDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ValidateOrderInvalidTickDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ValidateOrderInvalidTickDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final IdlDecimal getTick_size() {
        return this.surrogate.getTick_size();
    }

    public final OrderPriceTypeDto getPrice_type() {
        return this.surrogate.getPrice_type();
    }

    public final IdlDecimal getGiven_price() {
        return this.surrogate.getGiven_price();
    }

    public final IdlDecimal getRecommended_price() {
        return this.surrogate.getRecommended_price();
    }

    public /* synthetic */ ValidateOrderInvalidTickDetailsDto(String str, IdlDecimal idlDecimal, OrderPriceTypeDto orderPriceTypeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? OrderPriceTypeDto.INSTANCE.getZeroValue() : orderPriceTypeDto, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValidateOrderInvalidTickDetailsDto(String symbol, IdlDecimal tick_size, OrderPriceTypeDto price_type, IdlDecimal given_price, IdlDecimal recommended_price) {
        this(new Surrogate(symbol, tick_size, price_type, given_price, recommended_price));
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tick_size, "tick_size");
        Intrinsics.checkNotNullParameter(price_type, "price_type");
        Intrinsics.checkNotNullParameter(given_price, "given_price");
        Intrinsics.checkNotNullParameter(recommended_price, "recommended_price");
    }

    public static /* synthetic */ ValidateOrderInvalidTickDetailsDto copy$default(ValidateOrderInvalidTickDetailsDto validateOrderInvalidTickDetailsDto, String str, IdlDecimal idlDecimal, OrderPriceTypeDto orderPriceTypeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateOrderInvalidTickDetailsDto.surrogate.getSymbol();
        }
        if ((i & 2) != 0) {
            idlDecimal = validateOrderInvalidTickDetailsDto.surrogate.getTick_size();
        }
        if ((i & 4) != 0) {
            orderPriceTypeDto = validateOrderInvalidTickDetailsDto.surrogate.getPrice_type();
        }
        if ((i & 8) != 0) {
            idlDecimal2 = validateOrderInvalidTickDetailsDto.surrogate.getGiven_price();
        }
        if ((i & 16) != 0) {
            idlDecimal3 = validateOrderInvalidTickDetailsDto.surrogate.getRecommended_price();
        }
        IdlDecimal idlDecimal4 = idlDecimal3;
        OrderPriceTypeDto orderPriceTypeDto2 = orderPriceTypeDto;
        return validateOrderInvalidTickDetailsDto.copy(str, idlDecimal, orderPriceTypeDto2, idlDecimal2, idlDecimal4);
    }

    public final ValidateOrderInvalidTickDetailsDto copy(String symbol, IdlDecimal tick_size, OrderPriceTypeDto price_type, IdlDecimal given_price, IdlDecimal recommended_price) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tick_size, "tick_size");
        Intrinsics.checkNotNullParameter(price_type, "price_type");
        Intrinsics.checkNotNullParameter(given_price, "given_price");
        Intrinsics.checkNotNullParameter(recommended_price, "recommended_price");
        return new ValidateOrderInvalidTickDetailsDto(new Surrogate(symbol, tick_size, price_type, given_price, recommended_price));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ValidateOrderInvalidTickDetails toProto() {
        return new ValidateOrderInvalidTickDetails(this.surrogate.getSymbol(), this.surrogate.getTick_size().getStringValue(), (OrderPriceType) this.surrogate.getPrice_type().toProto(), this.surrogate.getGiven_price().getStringValue(), this.surrogate.getRecommended_price().getStringValue(), null, 32, null);
    }

    public String toString() {
        return "[ValidateOrderInvalidTickDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ValidateOrderInvalidTickDetailsDto) && Intrinsics.areEqual(((ValidateOrderInvalidTickDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: ValidateOrderInvalidTickDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000256Bf\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\r\u0010\u000eBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0018\u0010#\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u0018\u0010%\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010&\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003Jh\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0010HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J%\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR+\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u001aR+\u0010\f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u001a¨\u00067"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto$Surrogate;", "", "symbol", "", "tick_size", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "price_type", "Lcom/robinhood/ceres/v1/OrderPriceTypeDto;", "given_price", "recommended_price", "<init>", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/ceres/v1/OrderPriceTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/ceres/v1/OrderPriceTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSymbol$annotations", "()V", "getSymbol", "()Ljava/lang/String;", "getTick_size$annotations", "getTick_size", "()Lcom/robinhood/idl/IdlDecimal;", "getPrice_type$annotations", "getPrice_type", "()Lcom/robinhood/ceres/v1/OrderPriceTypeDto;", "getGiven_price$annotations", "getGiven_price", "getRecommended_price$annotations", "getRecommended_price", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal given_price;
        private final OrderPriceTypeDto price_type;
        private final IdlDecimal recommended_price;
        private final String symbol;
        private final IdlDecimal tick_size;

        public Surrogate() {
            this((String) null, (IdlDecimal) null, (OrderPriceTypeDto) null, (IdlDecimal) null, (IdlDecimal) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, IdlDecimal idlDecimal, OrderPriceTypeDto orderPriceTypeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.symbol;
            }
            if ((i & 2) != 0) {
                idlDecimal = surrogate.tick_size;
            }
            if ((i & 4) != 0) {
                orderPriceTypeDto = surrogate.price_type;
            }
            if ((i & 8) != 0) {
                idlDecimal2 = surrogate.given_price;
            }
            if ((i & 16) != 0) {
                idlDecimal3 = surrogate.recommended_price;
            }
            IdlDecimal idlDecimal4 = idlDecimal3;
            OrderPriceTypeDto orderPriceTypeDto2 = orderPriceTypeDto;
            return surrogate.copy(str, idlDecimal, orderPriceTypeDto2, idlDecimal2, idlDecimal4);
        }

        @SerialName("givenPrice")
        @JsonAnnotations2(names = {"given_price"})
        public static /* synthetic */ void getGiven_price$annotations() {
        }

        @SerialName("priceType")
        @JsonAnnotations2(names = {"price_type"})
        public static /* synthetic */ void getPrice_type$annotations() {
        }

        @SerialName("recommendedPrice")
        @JsonAnnotations2(names = {"recommended_price"})
        public static /* synthetic */ void getRecommended_price$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tickSize")
        @JsonAnnotations2(names = {"tick_size"})
        public static /* synthetic */ void getTick_size$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final IdlDecimal getTick_size() {
            return this.tick_size;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderPriceTypeDto getPrice_type() {
            return this.price_type;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getGiven_price() {
            return this.given_price;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getRecommended_price() {
            return this.recommended_price;
        }

        public final Surrogate copy(String symbol, IdlDecimal tick_size, OrderPriceTypeDto price_type, IdlDecimal given_price, IdlDecimal recommended_price) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(tick_size, "tick_size");
            Intrinsics.checkNotNullParameter(price_type, "price_type");
            Intrinsics.checkNotNullParameter(given_price, "given_price");
            Intrinsics.checkNotNullParameter(recommended_price, "recommended_price");
            return new Surrogate(symbol, tick_size, price_type, given_price, recommended_price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.tick_size, surrogate.tick_size) && this.price_type == surrogate.price_type && Intrinsics.areEqual(this.given_price, surrogate.given_price) && Intrinsics.areEqual(this.recommended_price, surrogate.recommended_price);
        }

        public int hashCode() {
            return (((((((this.symbol.hashCode() * 31) + this.tick_size.hashCode()) * 31) + this.price_type.hashCode()) * 31) + this.given_price.hashCode()) * 31) + this.recommended_price.hashCode();
        }

        public String toString() {
            return "Surrogate(symbol=" + this.symbol + ", tick_size=" + this.tick_size + ", price_type=" + this.price_type + ", given_price=" + this.given_price + ", recommended_price=" + this.recommended_price + ")";
        }

        /* compiled from: ValidateOrderInvalidTickDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ValidateOrderInvalidTickDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, IdlDecimal idlDecimal, OrderPriceTypeDto orderPriceTypeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str;
            }
            if ((i & 2) == 0) {
                this.tick_size = new IdlDecimal("");
            } else {
                this.tick_size = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.price_type = OrderPriceTypeDto.INSTANCE.getZeroValue();
            } else {
                this.price_type = orderPriceTypeDto;
            }
            if ((i & 8) == 0) {
                this.given_price = new IdlDecimal("");
            } else {
                this.given_price = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.recommended_price = new IdlDecimal("");
            } else {
                this.recommended_price = idlDecimal3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 0, self.symbol);
            }
            if (!Intrinsics.areEqual(self.tick_size, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.tick_size);
            }
            if (self.price_type != OrderPriceTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, OrderPriceTypeDto.Serializer.INSTANCE, self.price_type);
            }
            if (!Intrinsics.areEqual(self.given_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.given_price);
            }
            if (Intrinsics.areEqual(self.recommended_price, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.recommended_price);
        }

        public Surrogate(String symbol, IdlDecimal tick_size, OrderPriceTypeDto price_type, IdlDecimal given_price, IdlDecimal recommended_price) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(tick_size, "tick_size");
            Intrinsics.checkNotNullParameter(price_type, "price_type");
            Intrinsics.checkNotNullParameter(given_price, "given_price");
            Intrinsics.checkNotNullParameter(recommended_price, "recommended_price");
            this.symbol = symbol;
            this.tick_size = tick_size;
            this.price_type = price_type;
            this.given_price = given_price;
            this.recommended_price = recommended_price;
        }

        public /* synthetic */ Surrogate(String str, IdlDecimal idlDecimal, OrderPriceTypeDto orderPriceTypeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? OrderPriceTypeDto.INSTANCE.getZeroValue() : orderPriceTypeDto, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3);
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final IdlDecimal getTick_size() {
            return this.tick_size;
        }

        public final OrderPriceTypeDto getPrice_type() {
            return this.price_type;
        }

        public final IdlDecimal getGiven_price() {
            return this.given_price;
        }

        public final IdlDecimal getRecommended_price() {
            return this.recommended_price;
        }
    }

    /* compiled from: ValidateOrderInvalidTickDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ValidateOrderInvalidTickDetailsDto, ValidateOrderInvalidTickDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ValidateOrderInvalidTickDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateOrderInvalidTickDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateOrderInvalidTickDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) ValidateOrderInvalidTickDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ValidateOrderInvalidTickDetails> getProtoAdapter() {
            return ValidateOrderInvalidTickDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateOrderInvalidTickDetailsDto getZeroValue() {
            return ValidateOrderInvalidTickDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateOrderInvalidTickDetailsDto fromProto(ValidateOrderInvalidTickDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ValidateOrderInvalidTickDetailsDto(new Surrogate(proto.getSymbol(), new IdlDecimal(proto.getTick_size()), OrderPriceTypeDto.INSTANCE.fromProto(proto.getPrice_type()), new IdlDecimal(proto.getGiven_price()), new IdlDecimal(proto.getRecommended_price())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.ValidateOrderInvalidTickDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValidateOrderInvalidTickDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ValidateOrderInvalidTickDetailsDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ValidateOrderInvalidTickDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ValidateOrderInvalidTickDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.ValidateOrderInvalidTickDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ValidateOrderInvalidTickDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ValidateOrderInvalidTickDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ValidateOrderInvalidTickDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ValidateOrderInvalidTickDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.ValidateOrderInvalidTickDetailsDto";
        }
    }
}
