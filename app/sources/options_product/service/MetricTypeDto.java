package options_product.service;

import android.os.Parcel;
import android.os.Parcelable;
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
/* compiled from: MetricTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002'(B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006)"}, m3636d2 = {"Loptions_product/service/MetricTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/MetricType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "METRIC_TYPE_UNSPECIFIED", "BID_PRICE", "ASK_PRICE", "MARK_PRICE", "LAST_TRADE", "PREVIOUS_CLOSE", "HIGH_PRICE", "LOW_PRICE", "NET_CHANGE", "PCT_CHANGE", "IMPLIED_VOLATILITY", "BREAKEVEN", "TO_BREAKEVEN", "CHANCE_OF_PROFIT", "BID_SIZE", "ASK_SIZE", "VOLUME", "OPEN_INTEREST", "DELTA", "GAMMA", "THETA", "VEGA", "RHO", "CHANCE_OF_PROFIT_SHORT", "CHANCE_OF_PROFIT_LONG", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public abstract class MetricTypeDto implements Dto2<MetricType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<MetricTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MetricTypeDto, MetricType>> binaryBase64Serializer$delegate;
    public static final MetricTypeDto METRIC_TYPE_UNSPECIFIED = new MetricTypeDto("METRIC_TYPE_UNSPECIFIED", 0) { // from class: options_product.service.MetricTypeDto.METRIC_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.METRIC_TYPE_UNSPECIFIED;
        }
    };
    public static final MetricTypeDto BID_PRICE = new MetricTypeDto("BID_PRICE", 1) { // from class: options_product.service.MetricTypeDto.BID_PRICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.BID_PRICE;
        }
    };
    public static final MetricTypeDto ASK_PRICE = new MetricTypeDto("ASK_PRICE", 2) { // from class: options_product.service.MetricTypeDto.ASK_PRICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.ASK_PRICE;
        }
    };
    public static final MetricTypeDto MARK_PRICE = new MetricTypeDto("MARK_PRICE", 3) { // from class: options_product.service.MetricTypeDto.MARK_PRICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.MARK_PRICE;
        }
    };
    public static final MetricTypeDto LAST_TRADE = new MetricTypeDto("LAST_TRADE", 4) { // from class: options_product.service.MetricTypeDto.LAST_TRADE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.LAST_TRADE;
        }
    };
    public static final MetricTypeDto PREVIOUS_CLOSE = new MetricTypeDto("PREVIOUS_CLOSE", 5) { // from class: options_product.service.MetricTypeDto.PREVIOUS_CLOSE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.PREVIOUS_CLOSE;
        }
    };
    public static final MetricTypeDto HIGH_PRICE = new MetricTypeDto("HIGH_PRICE", 6) { // from class: options_product.service.MetricTypeDto.HIGH_PRICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.HIGH_PRICE;
        }
    };
    public static final MetricTypeDto LOW_PRICE = new MetricTypeDto("LOW_PRICE", 7) { // from class: options_product.service.MetricTypeDto.LOW_PRICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.LOW_PRICE;
        }
    };
    public static final MetricTypeDto NET_CHANGE = new MetricTypeDto("NET_CHANGE", 8) { // from class: options_product.service.MetricTypeDto.NET_CHANGE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.NET_CHANGE;
        }
    };
    public static final MetricTypeDto PCT_CHANGE = new MetricTypeDto("PCT_CHANGE", 9) { // from class: options_product.service.MetricTypeDto.PCT_CHANGE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.PCT_CHANGE;
        }
    };
    public static final MetricTypeDto IMPLIED_VOLATILITY = new MetricTypeDto("IMPLIED_VOLATILITY", 10) { // from class: options_product.service.MetricTypeDto.IMPLIED_VOLATILITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.IMPLIED_VOLATILITY;
        }
    };
    public static final MetricTypeDto BREAKEVEN = new MetricTypeDto("BREAKEVEN", 11) { // from class: options_product.service.MetricTypeDto.BREAKEVEN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.BREAKEVEN;
        }
    };
    public static final MetricTypeDto TO_BREAKEVEN = new MetricTypeDto("TO_BREAKEVEN", 12) { // from class: options_product.service.MetricTypeDto.TO_BREAKEVEN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.TO_BREAKEVEN;
        }
    };
    public static final MetricTypeDto CHANCE_OF_PROFIT = new MetricTypeDto("CHANCE_OF_PROFIT", 13) { // from class: options_product.service.MetricTypeDto.CHANCE_OF_PROFIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.CHANCE_OF_PROFIT;
        }
    };
    public static final MetricTypeDto BID_SIZE = new MetricTypeDto("BID_SIZE", 14) { // from class: options_product.service.MetricTypeDto.BID_SIZE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.BID_SIZE;
        }
    };
    public static final MetricTypeDto ASK_SIZE = new MetricTypeDto("ASK_SIZE", 15) { // from class: options_product.service.MetricTypeDto.ASK_SIZE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.ASK_SIZE;
        }
    };
    public static final MetricTypeDto VOLUME = new MetricTypeDto("VOLUME", 16) { // from class: options_product.service.MetricTypeDto.VOLUME
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.VOLUME;
        }
    };
    public static final MetricTypeDto OPEN_INTEREST = new MetricTypeDto("OPEN_INTEREST", 17) { // from class: options_product.service.MetricTypeDto.OPEN_INTEREST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.OPEN_INTEREST;
        }
    };
    public static final MetricTypeDto DELTA = new MetricTypeDto("DELTA", 18) { // from class: options_product.service.MetricTypeDto.DELTA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.DELTA;
        }
    };
    public static final MetricTypeDto GAMMA = new MetricTypeDto("GAMMA", 19) { // from class: options_product.service.MetricTypeDto.GAMMA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.GAMMA;
        }
    };
    public static final MetricTypeDto THETA = new MetricTypeDto("THETA", 20) { // from class: options_product.service.MetricTypeDto.THETA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.THETA;
        }
    };
    public static final MetricTypeDto VEGA = new MetricTypeDto("VEGA", 21) { // from class: options_product.service.MetricTypeDto.VEGA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.VEGA;
        }
    };
    public static final MetricTypeDto RHO = new MetricTypeDto("RHO", 22) { // from class: options_product.service.MetricTypeDto.RHO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.RHO;
        }
    };
    public static final MetricTypeDto CHANCE_OF_PROFIT_SHORT = new MetricTypeDto("CHANCE_OF_PROFIT_SHORT", 23) { // from class: options_product.service.MetricTypeDto.CHANCE_OF_PROFIT_SHORT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.CHANCE_OF_PROFIT_SHORT;
        }
    };
    public static final MetricTypeDto CHANCE_OF_PROFIT_LONG = new MetricTypeDto("CHANCE_OF_PROFIT_LONG", 24) { // from class: options_product.service.MetricTypeDto.CHANCE_OF_PROFIT_LONG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MetricType toProto() {
            return MetricType.CHANCE_OF_PROFIT_LONG;
        }
    };

    private static final /* synthetic */ MetricTypeDto[] $values() {
        return new MetricTypeDto[]{METRIC_TYPE_UNSPECIFIED, BID_PRICE, ASK_PRICE, MARK_PRICE, LAST_TRADE, PREVIOUS_CLOSE, HIGH_PRICE, LOW_PRICE, NET_CHANGE, PCT_CHANGE, IMPLIED_VOLATILITY, BREAKEVEN, TO_BREAKEVEN, CHANCE_OF_PROFIT, BID_SIZE, ASK_SIZE, VOLUME, OPEN_INTEREST, DELTA, GAMMA, THETA, VEGA, RHO, CHANCE_OF_PROFIT_SHORT, CHANCE_OF_PROFIT_LONG};
    }

    public /* synthetic */ MetricTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<MetricTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MetricTypeDto(String str, int i) {
    }

    static {
        MetricTypeDto[] metricTypeDtoArr$values = $values();
        $VALUES = metricTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(metricTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.MetricTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MetricTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: MetricTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/MetricTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/MetricTypeDto;", "Loptions_product/service/MetricType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/MetricTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<MetricTypeDto, MetricType> {

        /* compiled from: MetricTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MetricType.values().length];
                try {
                    iArr[MetricType.METRIC_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MetricType.BID_PRICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MetricType.ASK_PRICE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MetricType.MARK_PRICE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MetricType.LAST_TRADE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MetricType.PREVIOUS_CLOSE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MetricType.HIGH_PRICE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MetricType.LOW_PRICE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[MetricType.NET_CHANGE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[MetricType.PCT_CHANGE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[MetricType.IMPLIED_VOLATILITY.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[MetricType.BREAKEVEN.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[MetricType.TO_BREAKEVEN.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[MetricType.CHANCE_OF_PROFIT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[MetricType.BID_SIZE.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[MetricType.ASK_SIZE.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[MetricType.VOLUME.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[MetricType.OPEN_INTEREST.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[MetricType.DELTA.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[MetricType.GAMMA.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[MetricType.THETA.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[MetricType.VEGA.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[MetricType.RHO.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[MetricType.CHANCE_OF_PROFIT_SHORT.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[MetricType.CHANCE_OF_PROFIT_LONG.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MetricTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MetricTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MetricTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) MetricTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MetricType> getProtoAdapter() {
            return MetricType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MetricTypeDto getZeroValue() {
            return MetricTypeDto.METRIC_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MetricTypeDto fromProto(MetricType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return MetricTypeDto.METRIC_TYPE_UNSPECIFIED;
                case 2:
                    return MetricTypeDto.BID_PRICE;
                case 3:
                    return MetricTypeDto.ASK_PRICE;
                case 4:
                    return MetricTypeDto.MARK_PRICE;
                case 5:
                    return MetricTypeDto.LAST_TRADE;
                case 6:
                    return MetricTypeDto.PREVIOUS_CLOSE;
                case 7:
                    return MetricTypeDto.HIGH_PRICE;
                case 8:
                    return MetricTypeDto.LOW_PRICE;
                case 9:
                    return MetricTypeDto.NET_CHANGE;
                case 10:
                    return MetricTypeDto.PCT_CHANGE;
                case 11:
                    return MetricTypeDto.IMPLIED_VOLATILITY;
                case 12:
                    return MetricTypeDto.BREAKEVEN;
                case 13:
                    return MetricTypeDto.TO_BREAKEVEN;
                case 14:
                    return MetricTypeDto.CHANCE_OF_PROFIT;
                case 15:
                    return MetricTypeDto.BID_SIZE;
                case 16:
                    return MetricTypeDto.ASK_SIZE;
                case 17:
                    return MetricTypeDto.VOLUME;
                case 18:
                    return MetricTypeDto.OPEN_INTEREST;
                case 19:
                    return MetricTypeDto.DELTA;
                case 20:
                    return MetricTypeDto.GAMMA;
                case 21:
                    return MetricTypeDto.THETA;
                case 22:
                    return MetricTypeDto.VEGA;
                case 23:
                    return MetricTypeDto.RHO;
                case 24:
                    return MetricTypeDto.CHANCE_OF_PROFIT_SHORT;
                case 25:
                    return MetricTypeDto.CHANCE_OF_PROFIT_LONG;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MetricTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/MetricTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/MetricTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MetricTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<MetricTypeDto, MetricType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.MetricType", MetricTypeDto.getEntries(), MetricTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public MetricTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (MetricTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MetricTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static MetricTypeDto valueOf(String str) {
        return (MetricTypeDto) Enum.valueOf(MetricTypeDto.class, str);
    }

    public static MetricTypeDto[] values() {
        return (MetricTypeDto[]) $VALUES.clone();
    }
}
