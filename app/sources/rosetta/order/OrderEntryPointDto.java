package rosetta.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderEntryPointDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002#$B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006%"}, m3636d2 = {"Lrosetta/order/OrderEntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/order/OrderEntryPoint;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "ORDER_ENTRY_POINT_UNSPECIFIED", "ORDER_ENTRY_POINT_EMPTY", "ORDER_ENTRY_POINT_MOBILE_CHARTS", "ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE", "ORDER_ENTRY_POINT_SWIPE_TO_TRADE", "ORDER_ENTRY_POINT_HISTORY_DETAIL", "ORDER_ENTRY_POINT_TRADING_TRENDS", "ORDER_ENTRY_POINT_RESEARCH_REPORT", "ORDER_ENTRY_POINT_L2_MARKET_DATA", "ORDER_ENTRY_POINT_LADDER_FLATTEN", "ORDER_ENTRY_POINT_LADDER", "ORDER_ENTRY_POINT_CHARTS", "ORDER_ENTRY_POINT_CHARTS_FLATTEN", "ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY", "ORDER_ENTRY_POINT_CHARTS_HOTKEY", "ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY", "ORDER_ENTRY_POINT_LADDER_HOTKEY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public abstract class OrderEntryPointDto implements Dto2<OrderEntryPoint>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderEntryPointDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<OrderEntryPointDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderEntryPointDto, OrderEntryPoint>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_UNSPECIFIED = new OrderEntryPointDto("ORDER_ENTRY_POINT_UNSPECIFIED", 0) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_EMPTY = new OrderEntryPointDto("ORDER_ENTRY_POINT_EMPTY", 1) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_EMPTY
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_EMPTY;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_MOBILE_CHARTS = new OrderEntryPointDto("ORDER_ENTRY_POINT_MOBILE_CHARTS", 2) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_MOBILE_CHARTS
        {
            String str = "mobile_charts";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_MOBILE_CHARTS;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE = new OrderEntryPointDto("ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE", 3) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE
        {
            String str = AnalyticsStrings.BUTTON_GROUP_TITLE_STOCK_DETAIL;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_SWIPE_TO_TRADE = new OrderEntryPointDto("ORDER_ENTRY_POINT_SWIPE_TO_TRADE", 4) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_SWIPE_TO_TRADE
        {
            String str = "swipe_to_trade";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_SWIPE_TO_TRADE;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_HISTORY_DETAIL = new OrderEntryPointDto("ORDER_ENTRY_POINT_HISTORY_DETAIL", 5) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_HISTORY_DETAIL
        {
            String str = "history_detail";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_HISTORY_DETAIL;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_TRADING_TRENDS = new OrderEntryPointDto("ORDER_ENTRY_POINT_TRADING_TRENDS", 6) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_TRADING_TRENDS
        {
            String str = "trading_trends";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_TRADING_TRENDS;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_RESEARCH_REPORT = new OrderEntryPointDto("ORDER_ENTRY_POINT_RESEARCH_REPORT", 7) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_RESEARCH_REPORT
        {
            String str = "research_report";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_RESEARCH_REPORT;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_L2_MARKET_DATA = new OrderEntryPointDto("ORDER_ENTRY_POINT_L2_MARKET_DATA", 8) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_L2_MARKET_DATA
        {
            String str = "level_2_market_data";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_L2_MARKET_DATA;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_LADDER_FLATTEN = new OrderEntryPointDto("ORDER_ENTRY_POINT_LADDER_FLATTEN", 9) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_LADDER_FLATTEN
        {
            String str = "ladder_flatten";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_LADDER_FLATTEN;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_LADDER = new OrderEntryPointDto("ORDER_ENTRY_POINT_LADDER", 10) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_LADDER
        {
            String str = "ladder";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_LADDER;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_CHARTS = new OrderEntryPointDto("ORDER_ENTRY_POINT_CHARTS", 11) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_CHARTS
        {
            String str = "charts";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_CHARTS_FLATTEN = new OrderEntryPointDto("ORDER_ENTRY_POINT_CHARTS_FLATTEN", 12) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_CHARTS_FLATTEN
        {
            String str = "charts_flatten";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS_FLATTEN;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY = new OrderEntryPointDto("ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY", 13) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY
        {
            String str = "charts_flatten_hotkey";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_CHARTS_HOTKEY = new OrderEntryPointDto("ORDER_ENTRY_POINT_CHARTS_HOTKEY", 14) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_CHARTS_HOTKEY
        {
            String str = "charts_hotkey";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS_HOTKEY;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY = new OrderEntryPointDto("ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY", 15) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY
        {
            String str = "ladder_flatten_hotkey";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY;
        }
    };
    public static final OrderEntryPointDto ORDER_ENTRY_POINT_LADDER_HOTKEY = new OrderEntryPointDto("ORDER_ENTRY_POINT_LADDER_HOTKEY", 16) { // from class: rosetta.order.OrderEntryPointDto.ORDER_ENTRY_POINT_LADDER_HOTKEY
        {
            String str = "ladder_hotkey";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OrderEntryPoint toProto() {
            return OrderEntryPoint.ORDER_ENTRY_POINT_LADDER_HOTKEY;
        }
    };

    private static final /* synthetic */ OrderEntryPointDto[] $values() {
        return new OrderEntryPointDto[]{ORDER_ENTRY_POINT_UNSPECIFIED, ORDER_ENTRY_POINT_EMPTY, ORDER_ENTRY_POINT_MOBILE_CHARTS, ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE, ORDER_ENTRY_POINT_SWIPE_TO_TRADE, ORDER_ENTRY_POINT_HISTORY_DETAIL, ORDER_ENTRY_POINT_TRADING_TRENDS, ORDER_ENTRY_POINT_RESEARCH_REPORT, ORDER_ENTRY_POINT_L2_MARKET_DATA, ORDER_ENTRY_POINT_LADDER_FLATTEN, ORDER_ENTRY_POINT_LADDER, ORDER_ENTRY_POINT_CHARTS, ORDER_ENTRY_POINT_CHARTS_FLATTEN, ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY, ORDER_ENTRY_POINT_CHARTS_HOTKEY, ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY, ORDER_ENTRY_POINT_LADDER_HOTKEY};
    }

    public /* synthetic */ OrderEntryPointDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<OrderEntryPointDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderEntryPointDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        OrderEntryPointDto[] orderEntryPointDtoArr$values = $values();
        $VALUES = orderEntryPointDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderEntryPointDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.order.OrderEntryPointDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderEntryPointDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: OrderEntryPointDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/order/OrderEntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/order/OrderEntryPointDto;", "Lrosetta/order/OrderEntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/order/OrderEntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<OrderEntryPointDto, OrderEntryPoint> {

        /* compiled from: OrderEntryPointDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderEntryPoint.values().length];
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_EMPTY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_MOBILE_CHARTS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_SWIPE_TO_TRADE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_HISTORY_DETAIL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_TRADING_TRENDS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_RESEARCH_REPORT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_L2_MARKET_DATA.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_LADDER_FLATTEN.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_LADDER.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS_FLATTEN.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS_HOTKEY.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[OrderEntryPoint.ORDER_ENTRY_POINT_LADDER_HOTKEY.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderEntryPointDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderEntryPointDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderEntryPointDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderEntryPointDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderEntryPoint> getProtoAdapter() {
            return OrderEntryPoint.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderEntryPointDto getZeroValue() {
            return OrderEntryPointDto.ORDER_ENTRY_POINT_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderEntryPointDto fromProto(OrderEntryPoint proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_UNSPECIFIED;
                case 2:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_EMPTY;
                case 3:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_MOBILE_CHARTS;
                case 4:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE;
                case 5:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_SWIPE_TO_TRADE;
                case 6:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_HISTORY_DETAIL;
                case 7:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_TRADING_TRENDS;
                case 8:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_RESEARCH_REPORT;
                case 9:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_L2_MARKET_DATA;
                case 10:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_LADDER_FLATTEN;
                case 11:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_LADDER;
                case 12:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_CHARTS;
                case 13:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_CHARTS_FLATTEN;
                case 14:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY;
                case 15:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_CHARTS_HOTKEY;
                case 16:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY;
                case 17:
                    return OrderEntryPointDto.ORDER_ENTRY_POINT_LADDER_HOTKEY;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderEntryPointDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/order/OrderEntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/order/OrderEntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderEntryPointDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<OrderEntryPointDto, OrderEntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.order.OrderEntryPoint", OrderEntryPointDto.getEntries(), OrderEntryPointDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public OrderEntryPointDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (OrderEntryPointDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderEntryPointDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static OrderEntryPointDto valueOf(String str) {
        return (OrderEntryPointDto) Enum.valueOf(OrderEntryPointDto.class, str);
    }

    public static OrderEntryPointDto[] values() {
        return (OrderEntryPointDto[]) $VALUES.clone();
    }
}
