package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rosetta.order.OrderType;
import rosetta.order.OrderTypeDto;
import rosetta.order.Side;
import rosetta.order.SideDto;
import rosetta.order.TimeInForce;
import rosetta.order.TimeInForceDto;

/* compiled from: CryptoRequestDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bm\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*¨\u0006/"}, m3636d2 = {"Lbff_money_movement/service/v1/CryptoRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/CryptoRequest;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/CryptoRequestDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/CryptoRequestDto$Surrogate;)V", "", "currency_pair_id", "", "is_quantity_collared", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "Lrosetta/order/SideDto;", "crypto_side", "Lrosetta/order/TimeInForceDto;", "crypto_time_in_force", "Lrosetta/order/OrderTypeDto;", "crypto_order_type", "nummus_account_id", "entered_amount", "fee_ratio", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/OrderTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbff_money_movement/service/v1/CryptoRequest;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/CryptoRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class CryptoRequestDto implements Dto3<CryptoRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoRequestDto, CryptoRequest>> binaryBase64Serializer$delegate;
    private static final CryptoRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ CryptoRequestDto(String str, boolean z, String str2, String str3, SideDto sideDto, TimeInForceDto timeInForceDto, OrderTypeDto orderTypeDto, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 32) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 64) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoRequestDto(String currency_pair_id, boolean z, String price, String quantity, SideDto crypto_side, TimeInForceDto crypto_time_in_force, OrderTypeDto crypto_order_type, String nummus_account_id, String entered_amount, String fee_ratio) {
        this(new Surrogate(currency_pair_id, z, price, quantity, crypto_side, crypto_time_in_force, crypto_order_type, nummus_account_id, entered_amount, fee_ratio));
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(crypto_side, "crypto_side");
        Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_order_type, "crypto_order_type");
        Intrinsics.checkNotNullParameter(nummus_account_id, "nummus_account_id");
        Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CryptoRequest toProto() {
        return new CryptoRequest(this.surrogate.getCurrency_pair_id(), this.surrogate.getIs_quantity_collared(), this.surrogate.getPrice(), this.surrogate.getQuantity(), (Side) this.surrogate.getCrypto_side().toProto(), (TimeInForce) this.surrogate.getCrypto_time_in_force().toProto(), (OrderType) this.surrogate.getCrypto_order_type().toProto(), this.surrogate.getNummus_account_id(), this.surrogate.getEntered_amount(), this.surrogate.getFee_ratio(), null, 1024, null);
    }

    public String toString() {
        return "[CryptoRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoRequestDto) && Intrinsics.areEqual(((CryptoRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\b\u0083\b\u0018\u0000 E2\u00020\u0001:\u0002FEBk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012B}\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b\u0005\u0010-R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\"R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\"R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b6\u0010+\u001a\u0004\b4\u00105R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b:\u0010+\u001a\u0004\b8\u00109R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010;\u0012\u0004\b>\u0010+\u001a\u0004\b<\u0010=R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010(\u0012\u0004\b@\u0010+\u001a\u0004\b?\u0010\"R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010(\u0012\u0004\bB\u0010+\u001a\u0004\bA\u0010\"R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010(\u0012\u0004\bD\u0010+\u001a\u0004\bC\u0010\"¨\u0006G"}, m3636d2 = {"Lbff_money_movement/service/v1/CryptoRequestDto$Surrogate;", "", "", "currency_pair_id", "", "is_quantity_collared", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "Lrosetta/order/SideDto;", "crypto_side", "Lrosetta/order/TimeInForceDto;", "crypto_time_in_force", "Lrosetta/order/OrderTypeDto;", "crypto_order_type", "nummus_account_id", "entered_amount", "fee_ratio", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/OrderTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/OrderTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/CryptoRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "()V", "Z", "()Z", "is_quantity_collared$annotations", "getPrice", "getPrice$annotations", "getQuantity", "getQuantity$annotations", "Lrosetta/order/SideDto;", "getCrypto_side", "()Lrosetta/order/SideDto;", "getCrypto_side$annotations", "Lrosetta/order/TimeInForceDto;", "getCrypto_time_in_force", "()Lrosetta/order/TimeInForceDto;", "getCrypto_time_in_force$annotations", "Lrosetta/order/OrderTypeDto;", "getCrypto_order_type", "()Lrosetta/order/OrderTypeDto;", "getCrypto_order_type$annotations", "getNummus_account_id", "getNummus_account_id$annotations", "getEntered_amount", "getEntered_amount$annotations", "getFee_ratio", "getFee_ratio$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final OrderTypeDto crypto_order_type;
        private final SideDto crypto_side;
        private final TimeInForceDto crypto_time_in_force;
        private final String currency_pair_id;
        private final String entered_amount;
        private final String fee_ratio;
        private final boolean is_quantity_collared;
        private final String nummus_account_id;
        private final String price;
        private final String quantity;

        public Surrogate() {
            this((String) null, false, (String) null, (String) null, (SideDto) null, (TimeInForceDto) null, (OrderTypeDto) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id) && this.is_quantity_collared == surrogate.is_quantity_collared && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && this.crypto_side == surrogate.crypto_side && this.crypto_time_in_force == surrogate.crypto_time_in_force && this.crypto_order_type == surrogate.crypto_order_type && Intrinsics.areEqual(this.nummus_account_id, surrogate.nummus_account_id) && Intrinsics.areEqual(this.entered_amount, surrogate.entered_amount) && Intrinsics.areEqual(this.fee_ratio, surrogate.fee_ratio);
        }

        public int hashCode() {
            return (((((((((((((((((this.currency_pair_id.hashCode() * 31) + Boolean.hashCode(this.is_quantity_collared)) * 31) + this.price.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.crypto_side.hashCode()) * 31) + this.crypto_time_in_force.hashCode()) * 31) + this.crypto_order_type.hashCode()) * 31) + this.nummus_account_id.hashCode()) * 31) + this.entered_amount.hashCode()) * 31) + this.fee_ratio.hashCode();
        }

        public String toString() {
            return "Surrogate(currency_pair_id=" + this.currency_pair_id + ", is_quantity_collared=" + this.is_quantity_collared + ", price=" + this.price + ", quantity=" + this.quantity + ", crypto_side=" + this.crypto_side + ", crypto_time_in_force=" + this.crypto_time_in_force + ", crypto_order_type=" + this.crypto_order_type + ", nummus_account_id=" + this.nummus_account_id + ", entered_amount=" + this.entered_amount + ", fee_ratio=" + this.fee_ratio + ")";
        }

        /* compiled from: CryptoRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/CryptoRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/CryptoRequestDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, boolean z, String str2, String str3, SideDto sideDto, TimeInForceDto timeInForceDto, OrderTypeDto orderTypeDto, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.currency_pair_id = "";
            } else {
                this.currency_pair_id = str;
            }
            if ((i & 2) == 0) {
                this.is_quantity_collared = false;
            } else {
                this.is_quantity_collared = z;
            }
            if ((i & 4) == 0) {
                this.price = "";
            } else {
                this.price = str2;
            }
            if ((i & 8) == 0) {
                this.quantity = "";
            } else {
                this.quantity = str3;
            }
            if ((i & 16) == 0) {
                this.crypto_side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.crypto_side = sideDto;
            }
            if ((i & 32) == 0) {
                this.crypto_time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.crypto_time_in_force = timeInForceDto;
            }
            if ((i & 64) == 0) {
                this.crypto_order_type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.crypto_order_type = orderTypeDto;
            }
            if ((i & 128) == 0) {
                this.nummus_account_id = "";
            } else {
                this.nummus_account_id = str4;
            }
            if ((i & 256) == 0) {
                this.entered_amount = "";
            } else {
                this.entered_amount = str5;
            }
            if ((i & 512) == 0) {
                this.fee_ratio = "";
            } else {
                this.fee_ratio = str6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.currency_pair_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.currency_pair_id);
            }
            boolean z = self.is_quantity_collared;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            if (!Intrinsics.areEqual(self.price, "")) {
                output.encodeStringElement(serialDesc, 2, self.price);
            }
            if (!Intrinsics.areEqual(self.quantity, "")) {
                output.encodeStringElement(serialDesc, 3, self.quantity);
            }
            if (self.crypto_side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, SideDto.Serializer.INSTANCE, self.crypto_side);
            }
            if (self.crypto_time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, TimeInForceDto.Serializer.INSTANCE, self.crypto_time_in_force);
            }
            if (self.crypto_order_type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, OrderTypeDto.Serializer.INSTANCE, self.crypto_order_type);
            }
            if (!Intrinsics.areEqual(self.nummus_account_id, "")) {
                output.encodeStringElement(serialDesc, 7, self.nummus_account_id);
            }
            if (!Intrinsics.areEqual(self.entered_amount, "")) {
                output.encodeStringElement(serialDesc, 8, self.entered_amount);
            }
            if (Intrinsics.areEqual(self.fee_ratio, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 9, self.fee_ratio);
        }

        public Surrogate(String currency_pair_id, boolean z, String price, String quantity, SideDto crypto_side, TimeInForceDto crypto_time_in_force, OrderTypeDto crypto_order_type, String nummus_account_id, String entered_amount, String fee_ratio) {
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(crypto_side, "crypto_side");
            Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
            Intrinsics.checkNotNullParameter(crypto_order_type, "crypto_order_type");
            Intrinsics.checkNotNullParameter(nummus_account_id, "nummus_account_id");
            Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
            Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
            this.currency_pair_id = currency_pair_id;
            this.is_quantity_collared = z;
            this.price = price;
            this.quantity = quantity;
            this.crypto_side = crypto_side;
            this.crypto_time_in_force = crypto_time_in_force;
            this.crypto_order_type = crypto_order_type;
            this.nummus_account_id = nummus_account_id;
            this.entered_amount = entered_amount;
            this.fee_ratio = fee_ratio;
        }

        public /* synthetic */ Surrogate(String str, boolean z, String str2, String str3, SideDto sideDto, TimeInForceDto timeInForceDto, OrderTypeDto orderTypeDto, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 32) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 64) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6);
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        /* renamed from: is_quantity_collared, reason: from getter */
        public final boolean getIs_quantity_collared() {
            return this.is_quantity_collared;
        }

        public final String getPrice() {
            return this.price;
        }

        public final String getQuantity() {
            return this.quantity;
        }

        public final SideDto getCrypto_side() {
            return this.crypto_side;
        }

        public final TimeInForceDto getCrypto_time_in_force() {
            return this.crypto_time_in_force;
        }

        public final OrderTypeDto getCrypto_order_type() {
            return this.crypto_order_type;
        }

        public final String getNummus_account_id() {
            return this.nummus_account_id;
        }

        public final String getEntered_amount() {
            return this.entered_amount;
        }

        public final String getFee_ratio() {
            return this.fee_ratio;
        }
    }

    /* compiled from: CryptoRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/CryptoRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/CryptoRequestDto;", "Lbff_money_movement/service/v1/CryptoRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/CryptoRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CryptoRequestDto, CryptoRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoRequest> getProtoAdapter() {
            return CryptoRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoRequestDto getZeroValue() {
            return CryptoRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoRequestDto fromProto(CryptoRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CryptoRequestDto(new Surrogate(proto.getCurrency_pair_id(), proto.getIs_quantity_collared(), proto.getPrice(), proto.getQuantity(), SideDto.INSTANCE.fromProto(proto.getCrypto_side()), TimeInForceDto.INSTANCE.fromProto(proto.getCrypto_time_in_force()), OrderTypeDto.INSTANCE.fromProto(proto.getCrypto_order_type()), proto.getNummus_account_id(), proto.getEntered_amount(), proto.getFee_ratio()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.CryptoRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoRequestDto(null, false, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/CryptoRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/CryptoRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/CryptoRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CryptoRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.CryptoRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/CryptoRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.CryptoRequestDto";
        }
    }
}
