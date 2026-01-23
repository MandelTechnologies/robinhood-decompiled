package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.PatternDayTradingContext;
import com.robinhood.rosetta.eventlogging.PatternDayTradingContextDto;
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

/* compiled from: PatternDayTradingContextDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006./0123B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0014JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\b\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\tH\u0016J\u0013\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020\u0013H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0013H\u0016J\b\u0010-\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$Surrogate;)V", "order_id", "", "order_type", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;", "order_side", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;", "portfolio_value", "", "order_has_executed", "", "day_trade_count", "", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;DZI)V", "getOrder_id", "()Ljava/lang/String;", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;", "getPortfolio_value", "()D", "getOrder_has_executed", "()Z", "getDay_trade_count", "()I", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "OrderSideDto", "OrderTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class PatternDayTradingContextDto implements Dto3<PatternDayTradingContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PatternDayTradingContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PatternDayTradingContextDto, PatternDayTradingContext>> binaryBase64Serializer$delegate;
    private static final PatternDayTradingContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PatternDayTradingContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PatternDayTradingContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final OrderTypeDto getOrder_type() {
        return this.surrogate.getOrder_type();
    }

    public final OrderSideDto getOrder_side() {
        return this.surrogate.getOrder_side();
    }

    public final double getPortfolio_value() {
        return this.surrogate.getPortfolio_value();
    }

    public final boolean getOrder_has_executed() {
        return this.surrogate.getOrder_has_executed();
    }

    public final int getDay_trade_count() {
        return this.surrogate.getDay_trade_count();
    }

    public /* synthetic */ PatternDayTradingContextDto(String str, OrderTypeDto orderTypeDto, OrderSideDto orderSideDto, double d, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i2 & 4) != 0 ? OrderSideDto.INSTANCE.getZeroValue() : orderSideDto, (i2 & 8) != 0 ? 0.0d : d, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PatternDayTradingContextDto(String order_id, OrderTypeDto order_type, OrderSideDto order_side, double d, boolean z, int i) {
        this(new Surrogate(order_id, order_type, order_side, d, z, i));
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
    }

    public static /* synthetic */ PatternDayTradingContextDto copy$default(PatternDayTradingContextDto patternDayTradingContextDto, String str, OrderTypeDto orderTypeDto, OrderSideDto orderSideDto, double d, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = patternDayTradingContextDto.surrogate.getOrder_id();
        }
        if ((i2 & 2) != 0) {
            orderTypeDto = patternDayTradingContextDto.surrogate.getOrder_type();
        }
        if ((i2 & 4) != 0) {
            orderSideDto = patternDayTradingContextDto.surrogate.getOrder_side();
        }
        if ((i2 & 8) != 0) {
            d = patternDayTradingContextDto.surrogate.getPortfolio_value();
        }
        if ((i2 & 16) != 0) {
            z = patternDayTradingContextDto.surrogate.getOrder_has_executed();
        }
        if ((i2 & 32) != 0) {
            i = patternDayTradingContextDto.surrogate.getDay_trade_count();
        }
        double d2 = d;
        OrderSideDto orderSideDto2 = orderSideDto;
        return patternDayTradingContextDto.copy(str, orderTypeDto, orderSideDto2, d2, z, i);
    }

    public final PatternDayTradingContextDto copy(String order_id, OrderTypeDto order_type, OrderSideDto order_side, double portfolio_value, boolean order_has_executed, int day_trade_count) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        return new PatternDayTradingContextDto(new Surrogate(order_id, order_type, order_side, portfolio_value, order_has_executed, day_trade_count));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PatternDayTradingContext toProto() {
        return new PatternDayTradingContext(this.surrogate.getOrder_id(), (PatternDayTradingContext.OrderType) this.surrogate.getOrder_type().toProto(), (PatternDayTradingContext.OrderSide) this.surrogate.getOrder_side().toProto(), this.surrogate.getPortfolio_value(), this.surrogate.getOrder_has_executed(), this.surrogate.getDay_trade_count(), null, 64, null);
    }

    public String toString() {
        return "[PatternDayTradingContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PatternDayTradingContextDto) && Intrinsics.areEqual(((PatternDayTradingContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: PatternDayTradingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002>?Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0011¢\u0006\u0004\b\u0012\u0010\u0013BQ\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\u0018\u0010.\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\u0018\u00100\u001a\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0011HÆ\u0003Jc\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\b\u0002\u0010\u000f\u001a\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0011HÆ\u0001J\u0013\u00102\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0010HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J%\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!R+\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010'R+\u0010\u000f\u001a\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$Surrogate;", "", "order_id", "", "order_type", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;", "order_side", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;", "portfolio_value", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "order_has_executed", "", "day_trade_count", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;DZI)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;DZILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_id$annotations", "()V", "getOrder_id", "()Ljava/lang/String;", "getOrder_type$annotations", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;", "getOrder_side$annotations", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;", "getPortfolio_value$annotations", "getPortfolio_value", "()D", "getOrder_has_executed$annotations", "getOrder_has_executed", "()Z", "getDay_trade_count$annotations", "getDay_trade_count", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int day_trade_count;
        private final boolean order_has_executed;
        private final String order_id;
        private final OrderSideDto order_side;
        private final OrderTypeDto order_type;
        private final double portfolio_value;

        public Surrogate() {
            this((String) null, (OrderTypeDto) null, (OrderSideDto) null, 0.0d, false, 0, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, OrderTypeDto orderTypeDto, OrderSideDto orderSideDto, double d, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.order_id;
            }
            if ((i2 & 2) != 0) {
                orderTypeDto = surrogate.order_type;
            }
            if ((i2 & 4) != 0) {
                orderSideDto = surrogate.order_side;
            }
            if ((i2 & 8) != 0) {
                d = surrogate.portfolio_value;
            }
            if ((i2 & 16) != 0) {
                z = surrogate.order_has_executed;
            }
            if ((i2 & 32) != 0) {
                i = surrogate.day_trade_count;
            }
            double d2 = d;
            OrderSideDto orderSideDto2 = orderSideDto;
            return surrogate.copy(str, orderTypeDto, orderSideDto2, d2, z, i);
        }

        @SerialName("dayTradeCount")
        @JsonAnnotations2(names = {"day_trade_count"})
        public static /* synthetic */ void getDay_trade_count$annotations() {
        }

        @SerialName("orderHasExecuted")
        @JsonAnnotations2(names = {"order_has_executed"})
        public static /* synthetic */ void getOrder_has_executed$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("orderSide")
        @JsonAnnotations2(names = {"order_side"})
        public static /* synthetic */ void getOrder_side$annotations() {
        }

        @SerialName("orderType")
        @JsonAnnotations2(names = {"order_type"})
        public static /* synthetic */ void getOrder_type$annotations() {
        }

        @SerialName("portfolioValue")
        @JsonAnnotations2(names = {"portfolio_value"})
        public static /* synthetic */ void getPortfolio_value$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderSideDto getOrder_side() {
            return this.order_side;
        }

        /* renamed from: component4, reason: from getter */
        public final double getPortfolio_value() {
            return this.portfolio_value;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getOrder_has_executed() {
            return this.order_has_executed;
        }

        /* renamed from: component6, reason: from getter */
        public final int getDay_trade_count() {
            return this.day_trade_count;
        }

        public final Surrogate copy(String order_id, OrderTypeDto order_type, OrderSideDto order_side, double portfolio_value, boolean order_has_executed, int day_trade_count) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            return new Surrogate(order_id, order_type, order_side, portfolio_value, order_has_executed, day_trade_count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && this.order_type == surrogate.order_type && this.order_side == surrogate.order_side && Double.compare(this.portfolio_value, surrogate.portfolio_value) == 0 && this.order_has_executed == surrogate.order_has_executed && this.day_trade_count == surrogate.day_trade_count;
        }

        public int hashCode() {
            return (((((((((this.order_id.hashCode() * 31) + this.order_type.hashCode()) * 31) + this.order_side.hashCode()) * 31) + Double.hashCode(this.portfolio_value)) * 31) + java.lang.Boolean.hashCode(this.order_has_executed)) * 31) + Integer.hashCode(this.day_trade_count);
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", order_type=" + this.order_type + ", order_side=" + this.order_side + ", portfolio_value=" + this.portfolio_value + ", order_has_executed=" + this.order_has_executed + ", day_trade_count=" + this.day_trade_count + ")";
        }

        /* compiled from: PatternDayTradingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PatternDayTradingContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, OrderTypeDto orderTypeDto, OrderSideDto orderSideDto, double d, boolean z, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            this.order_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.order_type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.order_type = orderTypeDto;
            }
            if ((i & 4) == 0) {
                this.order_side = OrderSideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = orderSideDto;
            }
            if ((i & 8) == 0) {
                this.portfolio_value = 0.0d;
            } else {
                this.portfolio_value = d;
            }
            if ((i & 16) == 0) {
                this.order_has_executed = false;
            } else {
                this.order_has_executed = z;
            }
            if ((i & 32) == 0) {
                this.day_trade_count = 0;
            } else {
                this.day_trade_count = i2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.order_id);
            }
            if (self.order_type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OrderTypeDto.Serializer.INSTANCE, self.order_type);
            }
            if (self.order_side != OrderSideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, OrderSideDto.Serializer.INSTANCE, self.order_side);
            }
            if (Double.compare(self.portfolio_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.portfolio_value));
            }
            boolean z = self.order_has_executed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            int i = self.day_trade_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
        }

        public Surrogate(String order_id, OrderTypeDto order_type, OrderSideDto order_side, double d, boolean z, int i) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            this.order_id = order_id;
            this.order_type = order_type;
            this.order_side = order_side;
            this.portfolio_value = d;
            this.order_has_executed = z;
            this.day_trade_count = i;
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public /* synthetic */ Surrogate(String str, OrderTypeDto orderTypeDto, OrderSideDto orderSideDto, double d, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i2 & 4) != 0 ? OrderSideDto.INSTANCE.getZeroValue() : orderSideDto, (i2 & 8) != 0 ? 0.0d : d, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 0 : i);
        }

        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public final OrderSideDto getOrder_side() {
            return this.order_side;
        }

        public final double getPortfolio_value() {
            return this.portfolio_value;
        }

        public final boolean getOrder_has_executed() {
            return this.order_has_executed;
        }

        public final int getDay_trade_count() {
            return this.day_trade_count;
        }
    }

    /* compiled from: PatternDayTradingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PatternDayTradingContextDto, PatternDayTradingContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PatternDayTradingContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PatternDayTradingContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PatternDayTradingContextDto> getBinaryBase64Serializer() {
            return (KSerializer) PatternDayTradingContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PatternDayTradingContext> getProtoAdapter() {
            return PatternDayTradingContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PatternDayTradingContextDto getZeroValue() {
            return PatternDayTradingContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PatternDayTradingContextDto fromProto(PatternDayTradingContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PatternDayTradingContextDto(new Surrogate(proto.getOrder_id(), OrderTypeDto.INSTANCE.fromProto(proto.getOrder_type()), OrderSideDto.INSTANCE.fromProto(proto.getOrder_side()), proto.getPortfolio_value(), proto.getOrder_has_executed(), proto.getDay_trade_count()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PatternDayTradingContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PatternDayTradingContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PatternDayTradingContextDto(null, null, null, 0.0d, false, 0, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PatternDayTradingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderSide;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SIDE_UNSPECIFIED", "BUY", "SELL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderSideDto implements Dto2<PatternDayTradingContext.OrderSide>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderSideDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OrderSideDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderSideDto, PatternDayTradingContext.OrderSide>> binaryBase64Serializer$delegate;
        public static final OrderSideDto SIDE_UNSPECIFIED = new SIDE_UNSPECIFIED("SIDE_UNSPECIFIED", 0);
        public static final OrderSideDto BUY = new BUY("BUY", 1);
        public static final OrderSideDto SELL = new SELL("SELL", 2);

        private static final /* synthetic */ OrderSideDto[] $values() {
            return new OrderSideDto[]{SIDE_UNSPECIFIED, BUY, SELL};
        }

        public /* synthetic */ OrderSideDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OrderSideDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PatternDayTradingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PatternDayTradingContextDto.OrderSideDto.SIDE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIDE_UNSPECIFIED extends OrderSideDto {
            SIDE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PatternDayTradingContext.OrderSide toProto() {
                return PatternDayTradingContext.OrderSide.SIDE_UNSPECIFIED;
            }
        }

        private OrderSideDto(String str, int i) {
        }

        static {
            OrderSideDto[] orderSideDtoArr$values = $values();
            $VALUES = orderSideDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderSideDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PatternDayTradingContextDto$OrderSideDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PatternDayTradingContextDto.OrderSideDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PatternDayTradingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PatternDayTradingContextDto.OrderSideDto.BUY", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUY extends OrderSideDto {
            BUY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PatternDayTradingContext.OrderSide toProto() {
                return PatternDayTradingContext.OrderSide.BUY;
            }
        }

        /* compiled from: PatternDayTradingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PatternDayTradingContextDto.OrderSideDto.SELL", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELL extends OrderSideDto {
            SELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PatternDayTradingContext.OrderSide toProto() {
                return PatternDayTradingContext.OrderSide.SELL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PatternDayTradingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderSide;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OrderSideDto, PatternDayTradingContext.OrderSide> {

            /* compiled from: PatternDayTradingContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PatternDayTradingContext.OrderSide.values().length];
                    try {
                        iArr[PatternDayTradingContext.OrderSide.SIDE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PatternDayTradingContext.OrderSide.BUY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PatternDayTradingContext.OrderSide.SELL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderSideDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderSideDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderSideDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderSideDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PatternDayTradingContext.OrderSide> getProtoAdapter() {
                return PatternDayTradingContext.OrderSide.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderSideDto getZeroValue() {
                return OrderSideDto.SIDE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderSideDto fromProto(PatternDayTradingContext.OrderSide proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OrderSideDto.SIDE_UNSPECIFIED;
                }
                if (i == 2) {
                    return OrderSideDto.BUY;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return OrderSideDto.SELL;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PatternDayTradingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderSideDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OrderSideDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OrderSideDto, PatternDayTradingContext.OrderSide> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PatternDayTradingContext.OrderSide", OrderSideDto.getEntries(), OrderSideDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OrderSideDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OrderSideDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderSideDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OrderSideDto valueOf(String str) {
            return (OrderSideDto) Enum.valueOf(OrderSideDto.class, str);
        }

        public static OrderSideDto[] values() {
            return (OrderSideDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PatternDayTradingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "EQUITIES", "OPTIONS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderTypeDto implements Dto2<PatternDayTradingContext.OrderType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OrderTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderTypeDto, PatternDayTradingContext.OrderType>> binaryBase64Serializer$delegate;
        public static final OrderTypeDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
        public static final OrderTypeDto EQUITIES = new EQUITIES("EQUITIES", 1);
        public static final OrderTypeDto OPTIONS = new OPTIONS("OPTIONS", 2);

        private static final /* synthetic */ OrderTypeDto[] $values() {
            return new OrderTypeDto[]{TYPE_UNSPECIFIED, EQUITIES, OPTIONS};
        }

        public /* synthetic */ OrderTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OrderTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PatternDayTradingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PatternDayTradingContextDto.OrderTypeDto.TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_UNSPECIFIED extends OrderTypeDto {
            TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PatternDayTradingContext.OrderType toProto() {
                return PatternDayTradingContext.OrderType.TYPE_UNSPECIFIED;
            }
        }

        private OrderTypeDto(String str, int i) {
        }

        static {
            OrderTypeDto[] orderTypeDtoArr$values = $values();
            $VALUES = orderTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PatternDayTradingContextDto$OrderTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PatternDayTradingContextDto.OrderTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PatternDayTradingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PatternDayTradingContextDto.OrderTypeDto.EQUITIES", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EQUITIES extends OrderTypeDto {
            EQUITIES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PatternDayTradingContext.OrderType toProto() {
                return PatternDayTradingContext.OrderType.EQUITIES;
            }
        }

        /* compiled from: PatternDayTradingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PatternDayTradingContextDto.OrderTypeDto.OPTIONS", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS extends OrderTypeDto {
            OPTIONS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PatternDayTradingContext.OrderType toProto() {
                return PatternDayTradingContext.OrderType.OPTIONS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PatternDayTradingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OrderTypeDto, PatternDayTradingContext.OrderType> {

            /* compiled from: PatternDayTradingContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PatternDayTradingContext.OrderType.values().length];
                    try {
                        iArr[PatternDayTradingContext.OrderType.TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PatternDayTradingContext.OrderType.EQUITIES.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PatternDayTradingContext.OrderType.OPTIONS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PatternDayTradingContext.OrderType> getProtoAdapter() {
                return PatternDayTradingContext.OrderType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderTypeDto getZeroValue() {
                return OrderTypeDto.TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderTypeDto fromProto(PatternDayTradingContext.OrderType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OrderTypeDto.TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return OrderTypeDto.EQUITIES;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return OrderTypeDto.OPTIONS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PatternDayTradingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$OrderTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OrderTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OrderTypeDto, PatternDayTradingContext.OrderType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PatternDayTradingContext.OrderType", OrderTypeDto.getEntries(), OrderTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OrderTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OrderTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OrderTypeDto valueOf(String str) {
            return (OrderTypeDto) Enum.valueOf(OrderTypeDto.class, str);
        }

        public static OrderTypeDto[] values() {
            return (OrderTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PatternDayTradingContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PatternDayTradingContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PatternDayTradingContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PatternDayTradingContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PatternDayTradingContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PatternDayTradingContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PatternDayTradingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PatternDayTradingContextDto";
        }
    }
}
