package hippo.model.p469v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import hippo.model.p469v1.CryptoAmountTypeDto;
import hippo.model.p469v1.CryptoTimeInForceDto;
import hippo.model.p469v1.EquityTimeInForceDto;
import hippo.model.p469v1.EquityTradingSessionDto;
import hippo.model.p469v1.FuturesTimeInForceDto;
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

/* compiled from: OrderFormSettingsDto.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006."}, m3636d2 = {"Lhippo/model/v1/OrderFormSettingsDto;", "Lcom/robinhood/idl/MessageDto;", "Lhippo/model/v1/OrderFormSettings;", "Landroid/os/Parcelable;", "Lhippo/model/v1/OrderFormSettingsDto$Surrogate;", "surrogate", "<init>", "(Lhippo/model/v1/OrderFormSettingsDto$Surrogate;)V", "Lhippo/model/v1/EquityTimeInForceDto;", "equity_time_in_force_long_order", "Lhippo/model/v1/EquityTradingSessionDto;", "equity_trading_session_long_order", "equity_time_in_force_short_order", "equity_trading_session_short_order", "Lhippo/model/v1/FuturesTimeInForceDto;", "futures_time_in_force", "Lhippo/model/v1/CryptoTimeInForceDto;", "crypto_time_in_force", "Lhippo/model/v1/CryptoAmountTypeDto;", "crypto_amount_type", "(Lhippo/model/v1/EquityTimeInForceDto;Lhippo/model/v1/EquityTradingSessionDto;Lhippo/model/v1/EquityTimeInForceDto;Lhippo/model/v1/EquityTradingSessionDto;Lhippo/model/v1/FuturesTimeInForceDto;Lhippo/model/v1/CryptoTimeInForceDto;Lhippo/model/v1/CryptoAmountTypeDto;)V", "toProto", "()Lhippo/model/v1/OrderFormSettings;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lhippo/model/v1/OrderFormSettingsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class OrderFormSettingsDto implements Dto3<OrderFormSettings>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderFormSettingsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderFormSettingsDto, OrderFormSettings>> binaryBase64Serializer$delegate;
    private static final OrderFormSettingsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderFormSettingsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderFormSettingsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ OrderFormSettingsDto(EquityTimeInForceDto equityTimeInForceDto, EquityTradingSessionDto equityTradingSessionDto, EquityTimeInForceDto equityTimeInForceDto2, EquityTradingSessionDto equityTradingSessionDto2, FuturesTimeInForceDto futuresTimeInForceDto, CryptoTimeInForceDto cryptoTimeInForceDto, CryptoAmountTypeDto cryptoAmountTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EquityTimeInForceDto.INSTANCE.getZeroValue() : equityTimeInForceDto, (i & 2) != 0 ? EquityTradingSessionDto.INSTANCE.getZeroValue() : equityTradingSessionDto, (i & 4) != 0 ? EquityTimeInForceDto.INSTANCE.getZeroValue() : equityTimeInForceDto2, (i & 8) != 0 ? EquityTradingSessionDto.INSTANCE.getZeroValue() : equityTradingSessionDto2, (i & 16) != 0 ? FuturesTimeInForceDto.INSTANCE.getZeroValue() : futuresTimeInForceDto, (i & 32) != 0 ? CryptoTimeInForceDto.INSTANCE.getZeroValue() : cryptoTimeInForceDto, (i & 64) != 0 ? CryptoAmountTypeDto.INSTANCE.getZeroValue() : cryptoAmountTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderFormSettingsDto(EquityTimeInForceDto equity_time_in_force_long_order, EquityTradingSessionDto equity_trading_session_long_order, EquityTimeInForceDto equity_time_in_force_short_order, EquityTradingSessionDto equity_trading_session_short_order, FuturesTimeInForceDto futures_time_in_force, CryptoTimeInForceDto crypto_time_in_force, CryptoAmountTypeDto crypto_amount_type) {
        this(new Surrogate(equity_time_in_force_long_order, equity_trading_session_long_order, equity_time_in_force_short_order, equity_trading_session_short_order, futures_time_in_force, crypto_time_in_force, crypto_amount_type));
        Intrinsics.checkNotNullParameter(equity_time_in_force_long_order, "equity_time_in_force_long_order");
        Intrinsics.checkNotNullParameter(equity_trading_session_long_order, "equity_trading_session_long_order");
        Intrinsics.checkNotNullParameter(equity_time_in_force_short_order, "equity_time_in_force_short_order");
        Intrinsics.checkNotNullParameter(equity_trading_session_short_order, "equity_trading_session_short_order");
        Intrinsics.checkNotNullParameter(futures_time_in_force, "futures_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_amount_type, "crypto_amount_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OrderFormSettings toProto() {
        return new OrderFormSettings((EquityTimeInForce) this.surrogate.getEquity_time_in_force_long_order().toProto(), (EquityTradingSession) this.surrogate.getEquity_trading_session_long_order().toProto(), (EquityTimeInForce) this.surrogate.getEquity_time_in_force_short_order().toProto(), (EquityTradingSession) this.surrogate.getEquity_trading_session_short_order().toProto(), (FuturesTimeInForce) this.surrogate.getFutures_time_in_force().toProto(), (CryptoTimeInForce) this.surrogate.getCrypto_time_in_force().toProto(), (CryptoAmountType) this.surrogate.getCrypto_amount_type().toProto(), null, 128, null);
    }

    public String toString() {
        return "[OrderFormSettingsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderFormSettingsDto) && Intrinsics.areEqual(((OrderFormSettingsDto) other).surrogate, this.surrogate);
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
    /* compiled from: OrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002A@BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010)R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b3\u0010+\u001a\u0004\b2\u0010.R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b;\u0010+\u001a\u0004\b9\u0010:R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\b?\u0010+\u001a\u0004\b=\u0010>¨\u0006B"}, m3636d2 = {"Lhippo/model/v1/OrderFormSettingsDto$Surrogate;", "", "Lhippo/model/v1/EquityTimeInForceDto;", "equity_time_in_force_long_order", "Lhippo/model/v1/EquityTradingSessionDto;", "equity_trading_session_long_order", "equity_time_in_force_short_order", "equity_trading_session_short_order", "Lhippo/model/v1/FuturesTimeInForceDto;", "futures_time_in_force", "Lhippo/model/v1/CryptoTimeInForceDto;", "crypto_time_in_force", "Lhippo/model/v1/CryptoAmountTypeDto;", "crypto_amount_type", "<init>", "(Lhippo/model/v1/EquityTimeInForceDto;Lhippo/model/v1/EquityTradingSessionDto;Lhippo/model/v1/EquityTimeInForceDto;Lhippo/model/v1/EquityTradingSessionDto;Lhippo/model/v1/FuturesTimeInForceDto;Lhippo/model/v1/CryptoTimeInForceDto;Lhippo/model/v1/CryptoAmountTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILhippo/model/v1/EquityTimeInForceDto;Lhippo/model/v1/EquityTradingSessionDto;Lhippo/model/v1/EquityTimeInForceDto;Lhippo/model/v1/EquityTradingSessionDto;Lhippo/model/v1/FuturesTimeInForceDto;Lhippo/model/v1/CryptoTimeInForceDto;Lhippo/model/v1/CryptoAmountTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$hippo_v1_externalRelease", "(Lhippo/model/v1/OrderFormSettingsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhippo/model/v1/EquityTimeInForceDto;", "getEquity_time_in_force_long_order", "()Lhippo/model/v1/EquityTimeInForceDto;", "getEquity_time_in_force_long_order$annotations", "()V", "Lhippo/model/v1/EquityTradingSessionDto;", "getEquity_trading_session_long_order", "()Lhippo/model/v1/EquityTradingSessionDto;", "getEquity_trading_session_long_order$annotations", "getEquity_time_in_force_short_order", "getEquity_time_in_force_short_order$annotations", "getEquity_trading_session_short_order", "getEquity_trading_session_short_order$annotations", "Lhippo/model/v1/FuturesTimeInForceDto;", "getFutures_time_in_force", "()Lhippo/model/v1/FuturesTimeInForceDto;", "getFutures_time_in_force$annotations", "Lhippo/model/v1/CryptoTimeInForceDto;", "getCrypto_time_in_force", "()Lhippo/model/v1/CryptoTimeInForceDto;", "getCrypto_time_in_force$annotations", "Lhippo/model/v1/CryptoAmountTypeDto;", "getCrypto_amount_type", "()Lhippo/model/v1/CryptoAmountTypeDto;", "getCrypto_amount_type$annotations", "Companion", "$serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CryptoAmountTypeDto crypto_amount_type;
        private final CryptoTimeInForceDto crypto_time_in_force;
        private final EquityTimeInForceDto equity_time_in_force_long_order;
        private final EquityTimeInForceDto equity_time_in_force_short_order;
        private final EquityTradingSessionDto equity_trading_session_long_order;
        private final EquityTradingSessionDto equity_trading_session_short_order;
        private final FuturesTimeInForceDto futures_time_in_force;

        public Surrogate() {
            this((EquityTimeInForceDto) null, (EquityTradingSessionDto) null, (EquityTimeInForceDto) null, (EquityTradingSessionDto) null, (FuturesTimeInForceDto) null, (CryptoTimeInForceDto) null, (CryptoAmountTypeDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.equity_time_in_force_long_order == surrogate.equity_time_in_force_long_order && this.equity_trading_session_long_order == surrogate.equity_trading_session_long_order && this.equity_time_in_force_short_order == surrogate.equity_time_in_force_short_order && this.equity_trading_session_short_order == surrogate.equity_trading_session_short_order && this.futures_time_in_force == surrogate.futures_time_in_force && this.crypto_time_in_force == surrogate.crypto_time_in_force && this.crypto_amount_type == surrogate.crypto_amount_type;
        }

        public int hashCode() {
            return (((((((((((this.equity_time_in_force_long_order.hashCode() * 31) + this.equity_trading_session_long_order.hashCode()) * 31) + this.equity_time_in_force_short_order.hashCode()) * 31) + this.equity_trading_session_short_order.hashCode()) * 31) + this.futures_time_in_force.hashCode()) * 31) + this.crypto_time_in_force.hashCode()) * 31) + this.crypto_amount_type.hashCode();
        }

        public String toString() {
            return "Surrogate(equity_time_in_force_long_order=" + this.equity_time_in_force_long_order + ", equity_trading_session_long_order=" + this.equity_trading_session_long_order + ", equity_time_in_force_short_order=" + this.equity_time_in_force_short_order + ", equity_trading_session_short_order=" + this.equity_trading_session_short_order + ", futures_time_in_force=" + this.futures_time_in_force + ", crypto_time_in_force=" + this.crypto_time_in_force + ", crypto_amount_type=" + this.crypto_amount_type + ")";
        }

        /* compiled from: OrderFormSettingsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lhippo/model/v1/OrderFormSettingsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/OrderFormSettingsDto$Surrogate;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderFormSettingsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EquityTimeInForceDto equityTimeInForceDto, EquityTradingSessionDto equityTradingSessionDto, EquityTimeInForceDto equityTimeInForceDto2, EquityTradingSessionDto equityTradingSessionDto2, FuturesTimeInForceDto futuresTimeInForceDto, CryptoTimeInForceDto cryptoTimeInForceDto, CryptoAmountTypeDto cryptoAmountTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.equity_time_in_force_long_order = (i & 1) == 0 ? EquityTimeInForceDto.INSTANCE.getZeroValue() : equityTimeInForceDto;
            if ((i & 2) == 0) {
                this.equity_trading_session_long_order = EquityTradingSessionDto.INSTANCE.getZeroValue();
            } else {
                this.equity_trading_session_long_order = equityTradingSessionDto;
            }
            if ((i & 4) == 0) {
                this.equity_time_in_force_short_order = EquityTimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.equity_time_in_force_short_order = equityTimeInForceDto2;
            }
            if ((i & 8) == 0) {
                this.equity_trading_session_short_order = EquityTradingSessionDto.INSTANCE.getZeroValue();
            } else {
                this.equity_trading_session_short_order = equityTradingSessionDto2;
            }
            if ((i & 16) == 0) {
                this.futures_time_in_force = FuturesTimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.futures_time_in_force = futuresTimeInForceDto;
            }
            if ((i & 32) == 0) {
                this.crypto_time_in_force = CryptoTimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.crypto_time_in_force = cryptoTimeInForceDto;
            }
            if ((i & 64) == 0) {
                this.crypto_amount_type = CryptoAmountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.crypto_amount_type = cryptoAmountTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$hippo_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            EquityTimeInForceDto equityTimeInForceDto = self.equity_time_in_force_long_order;
            EquityTimeInForceDto.Companion companion = EquityTimeInForceDto.INSTANCE;
            if (equityTimeInForceDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, EquityTimeInForceDto.Serializer.INSTANCE, self.equity_time_in_force_long_order);
            }
            EquityTradingSessionDto equityTradingSessionDto = self.equity_trading_session_long_order;
            EquityTradingSessionDto.Companion companion2 = EquityTradingSessionDto.INSTANCE;
            if (equityTradingSessionDto != companion2.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, EquityTradingSessionDto.Serializer.INSTANCE, self.equity_trading_session_long_order);
            }
            if (self.equity_time_in_force_short_order != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, EquityTimeInForceDto.Serializer.INSTANCE, self.equity_time_in_force_short_order);
            }
            if (self.equity_trading_session_short_order != companion2.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, EquityTradingSessionDto.Serializer.INSTANCE, self.equity_trading_session_short_order);
            }
            if (self.futures_time_in_force != FuturesTimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, FuturesTimeInForceDto.Serializer.INSTANCE, self.futures_time_in_force);
            }
            if (self.crypto_time_in_force != CryptoTimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, CryptoTimeInForceDto.Serializer.INSTANCE, self.crypto_time_in_force);
            }
            if (self.crypto_amount_type != CryptoAmountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, CryptoAmountTypeDto.Serializer.INSTANCE, self.crypto_amount_type);
            }
        }

        public Surrogate(EquityTimeInForceDto equity_time_in_force_long_order, EquityTradingSessionDto equity_trading_session_long_order, EquityTimeInForceDto equity_time_in_force_short_order, EquityTradingSessionDto equity_trading_session_short_order, FuturesTimeInForceDto futures_time_in_force, CryptoTimeInForceDto crypto_time_in_force, CryptoAmountTypeDto crypto_amount_type) {
            Intrinsics.checkNotNullParameter(equity_time_in_force_long_order, "equity_time_in_force_long_order");
            Intrinsics.checkNotNullParameter(equity_trading_session_long_order, "equity_trading_session_long_order");
            Intrinsics.checkNotNullParameter(equity_time_in_force_short_order, "equity_time_in_force_short_order");
            Intrinsics.checkNotNullParameter(equity_trading_session_short_order, "equity_trading_session_short_order");
            Intrinsics.checkNotNullParameter(futures_time_in_force, "futures_time_in_force");
            Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
            Intrinsics.checkNotNullParameter(crypto_amount_type, "crypto_amount_type");
            this.equity_time_in_force_long_order = equity_time_in_force_long_order;
            this.equity_trading_session_long_order = equity_trading_session_long_order;
            this.equity_time_in_force_short_order = equity_time_in_force_short_order;
            this.equity_trading_session_short_order = equity_trading_session_short_order;
            this.futures_time_in_force = futures_time_in_force;
            this.crypto_time_in_force = crypto_time_in_force;
            this.crypto_amount_type = crypto_amount_type;
        }

        public final EquityTimeInForceDto getEquity_time_in_force_long_order() {
            return this.equity_time_in_force_long_order;
        }

        public /* synthetic */ Surrogate(EquityTimeInForceDto equityTimeInForceDto, EquityTradingSessionDto equityTradingSessionDto, EquityTimeInForceDto equityTimeInForceDto2, EquityTradingSessionDto equityTradingSessionDto2, FuturesTimeInForceDto futuresTimeInForceDto, CryptoTimeInForceDto cryptoTimeInForceDto, CryptoAmountTypeDto cryptoAmountTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EquityTimeInForceDto.INSTANCE.getZeroValue() : equityTimeInForceDto, (i & 2) != 0 ? EquityTradingSessionDto.INSTANCE.getZeroValue() : equityTradingSessionDto, (i & 4) != 0 ? EquityTimeInForceDto.INSTANCE.getZeroValue() : equityTimeInForceDto2, (i & 8) != 0 ? EquityTradingSessionDto.INSTANCE.getZeroValue() : equityTradingSessionDto2, (i & 16) != 0 ? FuturesTimeInForceDto.INSTANCE.getZeroValue() : futuresTimeInForceDto, (i & 32) != 0 ? CryptoTimeInForceDto.INSTANCE.getZeroValue() : cryptoTimeInForceDto, (i & 64) != 0 ? CryptoAmountTypeDto.INSTANCE.getZeroValue() : cryptoAmountTypeDto);
        }

        public final EquityTradingSessionDto getEquity_trading_session_long_order() {
            return this.equity_trading_session_long_order;
        }

        public final EquityTimeInForceDto getEquity_time_in_force_short_order() {
            return this.equity_time_in_force_short_order;
        }

        public final EquityTradingSessionDto getEquity_trading_session_short_order() {
            return this.equity_trading_session_short_order;
        }

        public final FuturesTimeInForceDto getFutures_time_in_force() {
            return this.futures_time_in_force;
        }

        public final CryptoTimeInForceDto getCrypto_time_in_force() {
            return this.crypto_time_in_force;
        }

        public final CryptoAmountTypeDto getCrypto_amount_type() {
            return this.crypto_amount_type;
        }
    }

    /* compiled from: OrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhippo/model/v1/OrderFormSettingsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lhippo/model/v1/OrderFormSettingsDto;", "Lhippo/model/v1/OrderFormSettings;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhippo/model/v1/OrderFormSettingsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<OrderFormSettingsDto, OrderFormSettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderFormSettingsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderFormSettingsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderFormSettingsDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderFormSettingsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderFormSettings> getProtoAdapter() {
            return OrderFormSettings.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderFormSettingsDto getZeroValue() {
            return OrderFormSettingsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderFormSettingsDto fromProto(OrderFormSettings proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            EquityTimeInForceDto.Companion companion = EquityTimeInForceDto.INSTANCE;
            EquityTimeInForceDto equityTimeInForceDtoFromProto = companion.fromProto(proto.getEquity_time_in_force_long_order());
            EquityTradingSessionDto.Companion companion2 = EquityTradingSessionDto.INSTANCE;
            return new OrderFormSettingsDto(new Surrogate(equityTimeInForceDtoFromProto, companion2.fromProto(proto.getEquity_trading_session_long_order()), companion.fromProto(proto.getEquity_time_in_force_short_order()), companion2.fromProto(proto.getEquity_trading_session_short_order()), FuturesTimeInForceDto.INSTANCE.fromProto(proto.getFutures_time_in_force()), CryptoTimeInForceDto.INSTANCE.fromProto(proto.getCrypto_time_in_force()), CryptoAmountTypeDto.INSTANCE.fromProto(proto.getCrypto_amount_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: hippo.model.v1.OrderFormSettingsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderFormSettingsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OrderFormSettingsDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lhippo/model/v1/OrderFormSettingsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/OrderFormSettingsDto;", "<init>", "()V", "surrogateSerializer", "Lhippo/model/v1/OrderFormSettingsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderFormSettingsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/hippo.model.v1.OrderFormSettings", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderFormSettingsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderFormSettingsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderFormSettingsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lhippo/model/v1/OrderFormSettingsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "hippo.model.v1.OrderFormSettingsDto";
        }
    }
}
