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
import com.robinhood.rosetta.eventlogging.ListFilters;
import com.robinhood.rosetta.eventlogging.ListFiltersDto;
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

/* compiled from: ListFiltersDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b/0123456B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0006\u0010\u0013JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020(H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ListFilters;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$Surrogate;)V", "min_price", "", "max_price", "change", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "direction", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;", "market_cap", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "analyst_ratings", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;", "(DDLcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;)V", "getMin_price", "()D", "getMax_price", "getChange", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;", "getMarket_cap", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "getAnalyst_ratings", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ChangeDto", "DirectionDto", "MarketCapDto", "AnalystRatingsDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ListFiltersDto implements Dto3<ListFilters>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ListFiltersDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ListFiltersDto, ListFilters>> binaryBase64Serializer$delegate;
    private static final ListFiltersDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ListFiltersDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ListFiltersDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final double getMin_price() {
        return this.surrogate.getMin_price();
    }

    public final double getMax_price() {
        return this.surrogate.getMax_price();
    }

    public final ChangeDto getChange() {
        return this.surrogate.getChange();
    }

    public final DirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final MarketCapDto getMarket_cap() {
        return this.surrogate.getMarket_cap();
    }

    public final AnalystRatingsDto getAnalyst_ratings() {
        return this.surrogate.getAnalyst_ratings();
    }

    public /* synthetic */ ListFiltersDto(double d, double d2, ChangeDto changeDto, DirectionDto directionDto, MarketCapDto marketCapDto, AnalystRatingsDto analystRatingsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? ChangeDto.INSTANCE.getZeroValue() : changeDto, (i & 8) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 16) != 0 ? MarketCapDto.INSTANCE.getZeroValue() : marketCapDto, (i & 32) != 0 ? AnalystRatingsDto.INSTANCE.getZeroValue() : analystRatingsDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListFiltersDto(double d, double d2, ChangeDto change, DirectionDto direction, MarketCapDto market_cap, AnalystRatingsDto analyst_ratings) {
        this(new Surrogate(d, d2, change, direction, market_cap, analyst_ratings));
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(market_cap, "market_cap");
        Intrinsics.checkNotNullParameter(analyst_ratings, "analyst_ratings");
    }

    public static /* synthetic */ ListFiltersDto copy$default(ListFiltersDto listFiltersDto, double d, double d2, ChangeDto changeDto, DirectionDto directionDto, MarketCapDto marketCapDto, AnalystRatingsDto analystRatingsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            d = listFiltersDto.surrogate.getMin_price();
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = listFiltersDto.surrogate.getMax_price();
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            changeDto = listFiltersDto.surrogate.getChange();
        }
        ChangeDto changeDto2 = changeDto;
        if ((i & 8) != 0) {
            directionDto = listFiltersDto.surrogate.getDirection();
        }
        return listFiltersDto.copy(d3, d4, changeDto2, directionDto, (i & 16) != 0 ? listFiltersDto.surrogate.getMarket_cap() : marketCapDto, (i & 32) != 0 ? listFiltersDto.surrogate.getAnalyst_ratings() : analystRatingsDto);
    }

    public final ListFiltersDto copy(double min_price, double max_price, ChangeDto change, DirectionDto direction, MarketCapDto market_cap, AnalystRatingsDto analyst_ratings) {
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(market_cap, "market_cap");
        Intrinsics.checkNotNullParameter(analyst_ratings, "analyst_ratings");
        return new ListFiltersDto(new Surrogate(min_price, max_price, change, direction, market_cap, analyst_ratings));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ListFilters toProto() {
        return new ListFilters(this.surrogate.getMin_price(), this.surrogate.getMax_price(), (ListFilters.Change) this.surrogate.getChange().toProto(), (ListFilters.Direction) this.surrogate.getDirection().toProto(), (ListFilters.MarketCap) this.surrogate.getMarket_cap().toProto(), (ListFilters.AnalystRatings) this.surrogate.getAnalyst_ratings().toProto(), null, 64, null);
    }

    public String toString() {
        return "[ListFiltersDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ListFiltersDto) && Intrinsics.areEqual(((ListFiltersDto) other).surrogate, this.surrogate);
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
    /* compiled from: ListFiltersDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002>?Ba\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011BS\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\u0018\u0010)\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010*\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003Jc\u0010/\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0013HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001J%\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010%R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010(¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$Surrogate;", "", "min_price", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "max_price", "change", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "direction", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;", "market_cap", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "analyst_ratings", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;", "<init>", "(DDLcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDLcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMin_price$annotations", "()V", "getMin_price", "()D", "getMax_price$annotations", "getMax_price", "getChange$annotations", "getChange", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "getDirection$annotations", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;", "getMarket_cap$annotations", "getMarket_cap", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "getAnalyst_ratings$annotations", "getAnalyst_ratings", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AnalystRatingsDto analyst_ratings;
        private final ChangeDto change;
        private final DirectionDto direction;
        private final MarketCapDto market_cap;
        private final double max_price;
        private final double min_price;

        public Surrogate() {
            this(0.0d, 0.0d, (ChangeDto) null, (DirectionDto) null, (MarketCapDto) null, (AnalystRatingsDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, double d2, ChangeDto changeDto, DirectionDto directionDto, MarketCapDto marketCapDto, AnalystRatingsDto analystRatingsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                d = surrogate.min_price;
            }
            double d3 = d;
            if ((i & 2) != 0) {
                d2 = surrogate.max_price;
            }
            double d4 = d2;
            if ((i & 4) != 0) {
                changeDto = surrogate.change;
            }
            ChangeDto changeDto2 = changeDto;
            if ((i & 8) != 0) {
                directionDto = surrogate.direction;
            }
            return surrogate.copy(d3, d4, changeDto2, directionDto, (i & 16) != 0 ? surrogate.market_cap : marketCapDto, (i & 32) != 0 ? surrogate.analyst_ratings : analystRatingsDto);
        }

        @SerialName("analystRatings")
        @JsonAnnotations2(names = {"analyst_ratings"})
        public static /* synthetic */ void getAnalyst_ratings$annotations() {
        }

        @SerialName("change")
        @JsonAnnotations2(names = {"change"})
        public static /* synthetic */ void getChange$annotations() {
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        @SerialName("marketCap")
        @JsonAnnotations2(names = {"market_cap"})
        public static /* synthetic */ void getMarket_cap$annotations() {
        }

        @SerialName("maxPrice")
        @JsonAnnotations2(names = {"max_price"})
        public static /* synthetic */ void getMax_price$annotations() {
        }

        @SerialName("minPrice")
        @JsonAnnotations2(names = {"min_price"})
        public static /* synthetic */ void getMin_price$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final double getMin_price() {
            return this.min_price;
        }

        /* renamed from: component2, reason: from getter */
        public final double getMax_price() {
            return this.max_price;
        }

        /* renamed from: component3, reason: from getter */
        public final ChangeDto getChange() {
            return this.change;
        }

        /* renamed from: component4, reason: from getter */
        public final DirectionDto getDirection() {
            return this.direction;
        }

        /* renamed from: component5, reason: from getter */
        public final MarketCapDto getMarket_cap() {
            return this.market_cap;
        }

        /* renamed from: component6, reason: from getter */
        public final AnalystRatingsDto getAnalyst_ratings() {
            return this.analyst_ratings;
        }

        public final Surrogate copy(double min_price, double max_price, ChangeDto change, DirectionDto direction, MarketCapDto market_cap, AnalystRatingsDto analyst_ratings) {
            Intrinsics.checkNotNullParameter(change, "change");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(market_cap, "market_cap");
            Intrinsics.checkNotNullParameter(analyst_ratings, "analyst_ratings");
            return new Surrogate(min_price, max_price, change, direction, market_cap, analyst_ratings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Double.compare(this.min_price, surrogate.min_price) == 0 && Double.compare(this.max_price, surrogate.max_price) == 0 && this.change == surrogate.change && this.direction == surrogate.direction && this.market_cap == surrogate.market_cap && this.analyst_ratings == surrogate.analyst_ratings;
        }

        public int hashCode() {
            return (((((((((Double.hashCode(this.min_price) * 31) + Double.hashCode(this.max_price)) * 31) + this.change.hashCode()) * 31) + this.direction.hashCode()) * 31) + this.market_cap.hashCode()) * 31) + this.analyst_ratings.hashCode();
        }

        public String toString() {
            return "Surrogate(min_price=" + this.min_price + ", max_price=" + this.max_price + ", change=" + this.change + ", direction=" + this.direction + ", market_cap=" + this.market_cap + ", analyst_ratings=" + this.analyst_ratings + ")";
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ListFiltersDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, double d, double d2, ChangeDto changeDto, DirectionDto directionDto, MarketCapDto marketCapDto, AnalystRatingsDto analystRatingsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.min_price = 0.0d;
            } else {
                this.min_price = d;
            }
            if ((i & 2) == 0) {
                this.max_price = 0.0d;
            } else {
                this.max_price = d2;
            }
            if ((i & 4) == 0) {
                this.change = ChangeDto.INSTANCE.getZeroValue();
            } else {
                this.change = changeDto;
            }
            if ((i & 8) == 0) {
                this.direction = DirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = directionDto;
            }
            if ((i & 16) == 0) {
                this.market_cap = MarketCapDto.INSTANCE.getZeroValue();
            } else {
                this.market_cap = marketCapDto;
            }
            if ((i & 32) == 0) {
                this.analyst_ratings = AnalystRatingsDto.INSTANCE.getZeroValue();
            } else {
                this.analyst_ratings = analystRatingsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Double.compare(self.min_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.min_price));
            }
            if (Double.compare(self.max_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.max_price));
            }
            if (self.change != ChangeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ChangeDto.Serializer.INSTANCE, self.change);
            }
            if (self.direction != DirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, DirectionDto.Serializer.INSTANCE, self.direction);
            }
            if (self.market_cap != MarketCapDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, MarketCapDto.Serializer.INSTANCE, self.market_cap);
            }
            if (self.analyst_ratings != AnalystRatingsDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, AnalystRatingsDto.Serializer.INSTANCE, self.analyst_ratings);
            }
        }

        public Surrogate(double d, double d2, ChangeDto change, DirectionDto direction, MarketCapDto market_cap, AnalystRatingsDto analyst_ratings) {
            Intrinsics.checkNotNullParameter(change, "change");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(market_cap, "market_cap");
            Intrinsics.checkNotNullParameter(analyst_ratings, "analyst_ratings");
            this.min_price = d;
            this.max_price = d2;
            this.change = change;
            this.direction = direction;
            this.market_cap = market_cap;
            this.analyst_ratings = analyst_ratings;
        }

        public final double getMin_price() {
            return this.min_price;
        }

        public final double getMax_price() {
            return this.max_price;
        }

        public final ChangeDto getChange() {
            return this.change;
        }

        public /* synthetic */ Surrogate(double d, double d2, ChangeDto changeDto, DirectionDto directionDto, MarketCapDto marketCapDto, AnalystRatingsDto analystRatingsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? ChangeDto.INSTANCE.getZeroValue() : changeDto, (i & 8) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 16) != 0 ? MarketCapDto.INSTANCE.getZeroValue() : marketCapDto, (i & 32) != 0 ? AnalystRatingsDto.INSTANCE.getZeroValue() : analystRatingsDto);
        }

        public final DirectionDto getDirection() {
            return this.direction;
        }

        public final MarketCapDto getMarket_cap() {
            return this.market_cap;
        }

        public final AnalystRatingsDto getAnalyst_ratings() {
            return this.analyst_ratings;
        }
    }

    /* compiled from: ListFiltersDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto;", "Lcom/robinhood/rosetta/eventlogging/ListFilters;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ListFiltersDto, ListFilters> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ListFiltersDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListFiltersDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListFiltersDto> getBinaryBase64Serializer() {
            return (KSerializer) ListFiltersDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ListFilters> getProtoAdapter() {
            return ListFilters.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListFiltersDto getZeroValue() {
            return ListFiltersDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListFiltersDto fromProto(ListFilters proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ListFiltersDto(new Surrogate(proto.getMin_price(), proto.getMax_price(), ChangeDto.INSTANCE.fromProto(proto.getChange()), DirectionDto.INSTANCE.fromProto(proto.getDirection()), MarketCapDto.INSTANCE.fromProto(proto.getMarket_cap()), AnalystRatingsDto.INSTANCE.fromProto(proto.getAnalyst_ratings())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ListFiltersDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListFiltersDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ListFiltersDto(0.0d, 0.0d, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListFiltersDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_UNSPECIFIED", "ONE_DAY", "ONE_WEEK", "ONE_MONTH", "THREE_MONTH", "ONE_YEAR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ChangeDto implements Dto2<ListFilters.Change>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChangeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ChangeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ChangeDto, ListFilters.Change>> binaryBase64Serializer$delegate;
        public static final ChangeDto CHANGE_UNSPECIFIED = new CHANGE_UNSPECIFIED("CHANGE_UNSPECIFIED", 0);
        public static final ChangeDto ONE_DAY = new ONE_DAY("ONE_DAY", 1);
        public static final ChangeDto ONE_WEEK = new ONE_WEEK("ONE_WEEK", 2);
        public static final ChangeDto ONE_MONTH = new ONE_MONTH("ONE_MONTH", 3);
        public static final ChangeDto THREE_MONTH = new THREE_MONTH("THREE_MONTH", 4);
        public static final ChangeDto ONE_YEAR = new ONE_YEAR("ONE_YEAR", 5);

        private static final /* synthetic */ ChangeDto[] $values() {
            return new ChangeDto[]{CHANGE_UNSPECIFIED, ONE_DAY, ONE_WEEK, ONE_MONTH, THREE_MONTH, ONE_YEAR};
        }

        public /* synthetic */ ChangeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ChangeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.ChangeDto.CHANGE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHANGE_UNSPECIFIED extends ChangeDto {
            CHANGE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.Change toProto() {
                return ListFilters.Change.CHANGE_UNSPECIFIED;
            }
        }

        private ChangeDto(String str, int i) {
        }

        static {
            ChangeDto[] changeDtoArr$values = $values();
            $VALUES = changeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(changeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ListFiltersDto$ChangeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListFiltersDto.ChangeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.ChangeDto.ONE_DAY", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_DAY extends ChangeDto {
            ONE_DAY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.Change toProto() {
                return ListFilters.Change.ONE_DAY;
            }
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.ChangeDto.ONE_WEEK", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_WEEK extends ChangeDto {
            ONE_WEEK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.Change toProto() {
                return ListFilters.Change.ONE_WEEK;
            }
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.ChangeDto.ONE_MONTH", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_MONTH extends ChangeDto {
            ONE_MONTH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.Change toProto() {
                return ListFilters.Change.ONE_MONTH;
            }
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.ChangeDto.THREE_MONTH", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class THREE_MONTH extends ChangeDto {
            THREE_MONTH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.Change toProto() {
                return ListFilters.Change.THREE_MONTH;
            }
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.ChangeDto.ONE_YEAR", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_YEAR extends ChangeDto {
            ONE_YEAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.Change toProto() {
                return ListFilters.Change.ONE_YEAR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ChangeDto, ListFilters.Change> {

            /* compiled from: ListFiltersDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ListFilters.Change.values().length];
                    try {
                        iArr[ListFilters.Change.CHANGE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ListFilters.Change.ONE_DAY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ListFilters.Change.ONE_WEEK.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ListFilters.Change.ONE_MONTH.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ListFilters.Change.THREE_MONTH.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ListFilters.Change.ONE_YEAR.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ChangeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChangeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChangeDto> getBinaryBase64Serializer() {
                return (KSerializer) ChangeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ListFilters.Change> getProtoAdapter() {
                return ListFilters.Change.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChangeDto getZeroValue() {
                return ChangeDto.CHANGE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChangeDto fromProto(ListFilters.Change proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ChangeDto.CHANGE_UNSPECIFIED;
                    case 2:
                        return ChangeDto.ONE_DAY;
                    case 3:
                        return ChangeDto.ONE_WEEK;
                    case 4:
                        return ChangeDto.ONE_MONTH;
                    case 5:
                        return ChangeDto.THREE_MONTH;
                    case 6:
                        return ChangeDto.ONE_YEAR;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$ChangeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ChangeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ChangeDto, ListFilters.Change> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ListFilters.Change", ChangeDto.getEntries(), ChangeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ChangeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ChangeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ChangeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ChangeDto valueOf(String str) {
            return (ChangeDto) Enum.valueOf(ChangeDto.class, str);
        }

        public static ChangeDto[] values() {
            return (ChangeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListFiltersDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Direction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DIRECTION_UNSPECIFIED", "RISING", "FALLING", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DirectionDto implements Dto2<ListFilters.Direction>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DirectionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DirectionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DirectionDto, ListFilters.Direction>> binaryBase64Serializer$delegate;
        public static final DirectionDto DIRECTION_UNSPECIFIED = new DIRECTION_UNSPECIFIED("DIRECTION_UNSPECIFIED", 0);
        public static final DirectionDto RISING = new RISING("RISING", 1);
        public static final DirectionDto FALLING = new FALLING("FALLING", 2);

        private static final /* synthetic */ DirectionDto[] $values() {
            return new DirectionDto[]{DIRECTION_UNSPECIFIED, RISING, FALLING};
        }

        public /* synthetic */ DirectionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DirectionDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.DirectionDto.DIRECTION_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DIRECTION_UNSPECIFIED extends DirectionDto {
            DIRECTION_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.Direction toProto() {
                return ListFilters.Direction.DIRECTION_UNSPECIFIED;
            }
        }

        private DirectionDto(String str, int i) {
        }

        static {
            DirectionDto[] directionDtoArr$values = $values();
            $VALUES = directionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ListFiltersDto$DirectionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListFiltersDto.DirectionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.DirectionDto.RISING", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RISING extends DirectionDto {
            RISING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.Direction toProto() {
                return ListFilters.Direction.RISING;
            }
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.DirectionDto.FALLING", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FALLING extends DirectionDto {
            FALLING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.Direction toProto() {
                return ListFilters.Direction.FALLING;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Direction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DirectionDto, ListFilters.Direction> {

            /* compiled from: ListFiltersDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ListFilters.Direction.values().length];
                    try {
                        iArr[ListFilters.Direction.DIRECTION_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ListFilters.Direction.RISING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ListFilters.Direction.FALLING.ordinal()] = 3;
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

            public final KSerializer<DirectionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectionDto> getBinaryBase64Serializer() {
                return (KSerializer) DirectionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ListFilters.Direction> getProtoAdapter() {
                return ListFilters.Direction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto getZeroValue() {
                return DirectionDto.DIRECTION_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto fromProto(ListFilters.Direction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DirectionDto.DIRECTION_UNSPECIFIED;
                }
                if (i == 2) {
                    return DirectionDto.RISING;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return DirectionDto.FALLING;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$DirectionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DirectionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DirectionDto, ListFilters.Direction> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ListFilters.Direction", DirectionDto.getEntries(), DirectionDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DirectionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DirectionDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DirectionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DirectionDto valueOf(String str) {
            return (DirectionDto) Enum.valueOf(DirectionDto.class, str);
        }

        public static DirectionDto[] values() {
            return (DirectionDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListFiltersDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MARKET_CAP_UNSPECIFIED", "SMALL", "MID", "LARGE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MarketCapDto implements Dto2<ListFilters.MarketCap>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MarketCapDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<MarketCapDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MarketCapDto, ListFilters.MarketCap>> binaryBase64Serializer$delegate;
        public static final MarketCapDto MARKET_CAP_UNSPECIFIED = new MARKET_CAP_UNSPECIFIED("MARKET_CAP_UNSPECIFIED", 0);
        public static final MarketCapDto SMALL = new SMALL("SMALL", 1);
        public static final MarketCapDto MID = new MID("MID", 2);
        public static final MarketCapDto LARGE = new LARGE("LARGE", 3);

        private static final /* synthetic */ MarketCapDto[] $values() {
            return new MarketCapDto[]{MARKET_CAP_UNSPECIFIED, SMALL, MID, LARGE};
        }

        public /* synthetic */ MarketCapDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<MarketCapDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.MarketCapDto.MARKET_CAP_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET_CAP_UNSPECIFIED extends MarketCapDto {
            MARKET_CAP_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.MarketCap toProto() {
                return ListFilters.MarketCap.MARKET_CAP_UNSPECIFIED;
            }
        }

        private MarketCapDto(String str, int i) {
        }

        static {
            MarketCapDto[] marketCapDtoArr$values = $values();
            $VALUES = marketCapDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(marketCapDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ListFiltersDto$MarketCapDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListFiltersDto.MarketCapDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.MarketCapDto.SMALL", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SMALL extends MarketCapDto {
            SMALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.MarketCap toProto() {
                return ListFilters.MarketCap.SMALL;
            }
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.MarketCapDto.MID", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MID extends MarketCapDto {
            MID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.MarketCap toProto() {
                return ListFilters.MarketCap.MID;
            }
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.MarketCapDto.LARGE", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LARGE extends MarketCapDto {
            LARGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.MarketCap toProto() {
                return ListFilters.MarketCap.LARGE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<MarketCapDto, ListFilters.MarketCap> {

            /* compiled from: ListFiltersDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ListFilters.MarketCap.values().length];
                    try {
                        iArr[ListFilters.MarketCap.MARKET_CAP_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ListFilters.MarketCap.SMALL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ListFilters.MarketCap.MID.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ListFilters.MarketCap.LARGE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MarketCapDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarketCapDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarketCapDto> getBinaryBase64Serializer() {
                return (KSerializer) MarketCapDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ListFilters.MarketCap> getProtoAdapter() {
                return ListFilters.MarketCap.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarketCapDto getZeroValue() {
                return MarketCapDto.MARKET_CAP_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarketCapDto fromProto(ListFilters.MarketCap proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return MarketCapDto.MARKET_CAP_UNSPECIFIED;
                }
                if (i == 2) {
                    return MarketCapDto.SMALL;
                }
                if (i == 3) {
                    return MarketCapDto.MID;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return MarketCapDto.LARGE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MarketCapDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<MarketCapDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<MarketCapDto, ListFilters.MarketCap> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ListFilters.MarketCap", MarketCapDto.getEntries(), MarketCapDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public MarketCapDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (MarketCapDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MarketCapDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static MarketCapDto valueOf(String str) {
            return (MarketCapDto) Enum.valueOf(MarketCapDto.class, str);
        }

        public static MarketCapDto[] values() {
            return (MarketCapDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListFiltersDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$AnalystRatings;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ANALYST_RATINGS_UNSPECIFIED", "FORTY_NINE_OR_LOWER", "FIFTY_OR_HIGHER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AnalystRatingsDto implements Dto2<ListFilters.AnalystRatings>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnalystRatingsDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AnalystRatingsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AnalystRatingsDto, ListFilters.AnalystRatings>> binaryBase64Serializer$delegate;
        public static final AnalystRatingsDto ANALYST_RATINGS_UNSPECIFIED = new ANALYST_RATINGS_UNSPECIFIED("ANALYST_RATINGS_UNSPECIFIED", 0);
        public static final AnalystRatingsDto FORTY_NINE_OR_LOWER = new FORTY_NINE_OR_LOWER("FORTY_NINE_OR_LOWER", 1);
        public static final AnalystRatingsDto FIFTY_OR_HIGHER = new FIFTY_OR_HIGHER("FIFTY_OR_HIGHER", 2);

        private static final /* synthetic */ AnalystRatingsDto[] $values() {
            return new AnalystRatingsDto[]{ANALYST_RATINGS_UNSPECIFIED, FORTY_NINE_OR_LOWER, FIFTY_OR_HIGHER};
        }

        public /* synthetic */ AnalystRatingsDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AnalystRatingsDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.AnalystRatingsDto.ANALYST_RATINGS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$AnalystRatings;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ANALYST_RATINGS_UNSPECIFIED extends AnalystRatingsDto {
            ANALYST_RATINGS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.AnalystRatings toProto() {
                return ListFilters.AnalystRatings.ANALYST_RATINGS_UNSPECIFIED;
            }
        }

        private AnalystRatingsDto(String str, int i) {
        }

        static {
            AnalystRatingsDto[] analystRatingsDtoArr$values = $values();
            $VALUES = analystRatingsDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(analystRatingsDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ListFiltersDto$AnalystRatingsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListFiltersDto.AnalystRatingsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.AnalystRatingsDto.FORTY_NINE_OR_LOWER", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$AnalystRatings;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FORTY_NINE_OR_LOWER extends AnalystRatingsDto {
            FORTY_NINE_OR_LOWER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.AnalystRatings toProto() {
                return ListFilters.AnalystRatings.FORTY_NINE_OR_LOWER;
            }
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ListFiltersDto.AnalystRatingsDto.FIFTY_OR_HIGHER", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ListFilters$AnalystRatings;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIFTY_OR_HIGHER extends AnalystRatingsDto {
            FIFTY_OR_HIGHER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ListFilters.AnalystRatings toProto() {
                return ListFilters.AnalystRatings.FIFTY_OR_HIGHER;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$AnalystRatings;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AnalystRatingsDto, ListFilters.AnalystRatings> {

            /* compiled from: ListFiltersDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ListFilters.AnalystRatings.values().length];
                    try {
                        iArr[ListFilters.AnalystRatings.ANALYST_RATINGS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ListFilters.AnalystRatings.FORTY_NINE_OR_LOWER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ListFilters.AnalystRatings.FIFTY_OR_HIGHER.ordinal()] = 3;
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

            public final KSerializer<AnalystRatingsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AnalystRatingsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AnalystRatingsDto> getBinaryBase64Serializer() {
                return (KSerializer) AnalystRatingsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ListFilters.AnalystRatings> getProtoAdapter() {
                return ListFilters.AnalystRatings.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AnalystRatingsDto getZeroValue() {
                return AnalystRatingsDto.ANALYST_RATINGS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AnalystRatingsDto fromProto(ListFilters.AnalystRatings proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AnalystRatingsDto.ANALYST_RATINGS_UNSPECIFIED;
                }
                if (i == 2) {
                    return AnalystRatingsDto.FORTY_NINE_OR_LOWER;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return AnalystRatingsDto.FIFTY_OR_HIGHER;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ListFiltersDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$AnalystRatingsDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<AnalystRatingsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AnalystRatingsDto, ListFilters.AnalystRatings> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ListFilters.AnalystRatings", AnalystRatingsDto.getEntries(), AnalystRatingsDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AnalystRatingsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AnalystRatingsDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AnalystRatingsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AnalystRatingsDto valueOf(String str) {
            return (AnalystRatingsDto) Enum.valueOf(AnalystRatingsDto.class, str);
        }

        public static AnalystRatingsDto[] values() {
            return (AnalystRatingsDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ListFiltersDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ListFiltersDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ListFilters", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ListFiltersDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ListFiltersDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ListFiltersDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ListFiltersDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFiltersDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ListFiltersDto";
        }
    }
}
