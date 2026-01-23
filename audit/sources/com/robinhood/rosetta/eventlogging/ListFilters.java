package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.ListFilters;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ListFilters.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005'()*+BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016JL\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFilters;", "Lcom/squareup/wire/Message;", "", "min_price", "", "max_price", "change", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "direction", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Direction;", "market_cap", "Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap;", "analyst_ratings", "Lcom/robinhood/rosetta/eventlogging/ListFilters$AnalystRatings;", "unknownFields", "Lokio/ByteString;", "<init>", "(DDLcom/robinhood/rosetta/eventlogging/ListFilters$Change;Lcom/robinhood/rosetta/eventlogging/ListFilters$Direction;Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap;Lcom/robinhood/rosetta/eventlogging/ListFilters$AnalystRatings;Lokio/ByteString;)V", "getMin_price", "()D", "getMax_price", "getChange", "()Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/ListFilters$Direction;", "getMarket_cap", "()Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap;", "getAnalyst_ratings", "()Lcom/robinhood/rosetta/eventlogging/ListFilters$AnalystRatings;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Change", "Direction", "MarketCap", "AnalystRatings", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ListFilters extends Message {

    @JvmField
    public static final ProtoAdapter<ListFilters> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ListFilters$AnalystRatings#ADAPTER", jsonName = "analystRatings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final AnalystRatings analyst_ratings;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ListFilters$Change#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Change change;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ListFilters$Direction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Direction direction;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ListFilters$MarketCap#ADAPTER", jsonName = "marketCap", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final MarketCap market_cap;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "maxPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double max_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "minPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double min_price;

    public ListFilters() {
        this(0.0d, 0.0d, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24343newBuilder();
    }

    public final double getMin_price() {
        return this.min_price;
    }

    public final double getMax_price() {
        return this.max_price;
    }

    public final Change getChange() {
        return this.change;
    }

    public /* synthetic */ ListFilters(double d, double d2, Change change, Direction direction, MarketCap marketCap, AnalystRatings analystRatings, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? Change.CHANGE_UNSPECIFIED : change, (i & 8) != 0 ? Direction.DIRECTION_UNSPECIFIED : direction, (i & 16) != 0 ? MarketCap.MARKET_CAP_UNSPECIFIED : marketCap, (i & 32) != 0 ? AnalystRatings.ANALYST_RATINGS_UNSPECIFIED : analystRatings, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final MarketCap getMarket_cap() {
        return this.market_cap;
    }

    public final AnalystRatings getAnalyst_ratings() {
        return this.analyst_ratings;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListFilters(double d, double d2, Change change, Direction direction, MarketCap market_cap, AnalystRatings analyst_ratings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(market_cap, "market_cap");
        Intrinsics.checkNotNullParameter(analyst_ratings, "analyst_ratings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.min_price = d;
        this.max_price = d2;
        this.change = change;
        this.direction = direction;
        this.market_cap = market_cap;
        this.analyst_ratings = analyst_ratings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24343newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListFilters)) {
            return false;
        }
        ListFilters listFilters = (ListFilters) other;
        return Intrinsics.areEqual(unknownFields(), listFilters.unknownFields()) && this.min_price == listFilters.min_price && this.max_price == listFilters.max_price && this.change == listFilters.change && this.direction == listFilters.direction && this.market_cap == listFilters.market_cap && this.analyst_ratings == listFilters.analyst_ratings;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + Double.hashCode(this.min_price)) * 37) + Double.hashCode(this.max_price)) * 37) + this.change.hashCode()) * 37) + this.direction.hashCode()) * 37) + this.market_cap.hashCode()) * 37) + this.analyst_ratings.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("min_price=" + this.min_price);
        arrayList.add("max_price=" + this.max_price);
        arrayList.add("change=" + this.change);
        arrayList.add("direction=" + this.direction);
        arrayList.add("market_cap=" + this.market_cap);
        arrayList.add("analyst_ratings=" + this.analyst_ratings);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListFilters{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ListFilters copy$default(ListFilters listFilters, double d, double d2, Change change, Direction direction, MarketCap marketCap, AnalystRatings analystRatings, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = listFilters.min_price;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = listFilters.max_price;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            change = listFilters.change;
        }
        return listFilters.copy(d3, d4, change, (i & 8) != 0 ? listFilters.direction : direction, (i & 16) != 0 ? listFilters.market_cap : marketCap, (i & 32) != 0 ? listFilters.analyst_ratings : analystRatings, (i & 64) != 0 ? listFilters.unknownFields() : byteString);
    }

    public final ListFilters copy(double min_price, double max_price, Change change, Direction direction, MarketCap market_cap, AnalystRatings analyst_ratings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(market_cap, "market_cap");
        Intrinsics.checkNotNullParameter(analyst_ratings, "analyst_ratings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListFilters(min_price, max_price, change, direction, market_cap, analyst_ratings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListFilters.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListFilters>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ListFilters$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListFilters value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Double dValueOf = Double.valueOf(value.getMin_price());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getMin_price()));
                }
                if (!Double.valueOf(value.getMax_price()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getMax_price()));
                }
                if (value.getChange() != ListFilters.Change.CHANGE_UNSPECIFIED) {
                    size += ListFilters.Change.ADAPTER.encodedSizeWithTag(3, value.getChange());
                }
                if (value.getDirection() != ListFilters.Direction.DIRECTION_UNSPECIFIED) {
                    size += ListFilters.Direction.ADAPTER.encodedSizeWithTag(4, value.getDirection());
                }
                if (value.getMarket_cap() != ListFilters.MarketCap.MARKET_CAP_UNSPECIFIED) {
                    size += ListFilters.MarketCap.ADAPTER.encodedSizeWithTag(5, value.getMarket_cap());
                }
                return value.getAnalyst_ratings() != ListFilters.AnalystRatings.ANALYST_RATINGS_UNSPECIFIED ? size + ListFilters.AnalystRatings.ADAPTER.encodedSizeWithTag(6, value.getAnalyst_ratings()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListFilters value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Double dValueOf = Double.valueOf(value.getMin_price());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getMin_price()));
                }
                if (!Double.valueOf(value.getMax_price()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getMax_price()));
                }
                if (value.getChange() != ListFilters.Change.CHANGE_UNSPECIFIED) {
                    ListFilters.Change.ADAPTER.encodeWithTag(writer, 3, (int) value.getChange());
                }
                if (value.getDirection() != ListFilters.Direction.DIRECTION_UNSPECIFIED) {
                    ListFilters.Direction.ADAPTER.encodeWithTag(writer, 4, (int) value.getDirection());
                }
                if (value.getMarket_cap() != ListFilters.MarketCap.MARKET_CAP_UNSPECIFIED) {
                    ListFilters.MarketCap.ADAPTER.encodeWithTag(writer, 5, (int) value.getMarket_cap());
                }
                if (value.getAnalyst_ratings() != ListFilters.AnalystRatings.ANALYST_RATINGS_UNSPECIFIED) {
                    ListFilters.AnalystRatings.ADAPTER.encodeWithTag(writer, 6, (int) value.getAnalyst_ratings());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListFilters value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAnalyst_ratings() != ListFilters.AnalystRatings.ANALYST_RATINGS_UNSPECIFIED) {
                    ListFilters.AnalystRatings.ADAPTER.encodeWithTag(writer, 6, (int) value.getAnalyst_ratings());
                }
                if (value.getMarket_cap() != ListFilters.MarketCap.MARKET_CAP_UNSPECIFIED) {
                    ListFilters.MarketCap.ADAPTER.encodeWithTag(writer, 5, (int) value.getMarket_cap());
                }
                if (value.getDirection() != ListFilters.Direction.DIRECTION_UNSPECIFIED) {
                    ListFilters.Direction.ADAPTER.encodeWithTag(writer, 4, (int) value.getDirection());
                }
                if (value.getChange() != ListFilters.Change.CHANGE_UNSPECIFIED) {
                    ListFilters.Change.ADAPTER.encodeWithTag(writer, 3, (int) value.getChange());
                }
                if (!Double.valueOf(value.getMax_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getMax_price()));
                }
                if (Double.valueOf(value.getMin_price()).equals(dValueOf)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getMin_price()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ListFilters decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ListFilters.Change changeDecode = ListFilters.Change.CHANGE_UNSPECIFIED;
                ListFilters.Direction direction = ListFilters.Direction.DIRECTION_UNSPECIFIED;
                ListFilters.MarketCap marketCap = ListFilters.MarketCap.MARKET_CAP_UNSPECIFIED;
                ListFilters.AnalystRatings analystRatings = ListFilters.AnalystRatings.ANALYST_RATINGS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                ListFilters.AnalystRatings analystRatingsDecode = analystRatings;
                ListFilters.MarketCap marketCapDecode = marketCap;
                ListFilters.Direction directionDecode = direction;
                while (true) {
                    ListFilters.Change change = changeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 2:
                                    dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 3:
                                    try {
                                        changeDecode = ListFilters.Change.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        directionDecode = ListFilters.Direction.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        marketCapDecode = ListFilters.MarketCap.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 6:
                                    try {
                                        analystRatingsDecode = ListFilters.AnalystRatings.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ListFilters(dDoubleValue, dDoubleValue2, change, directionDecode, marketCapDecode, analystRatingsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListFilters redact(ListFilters value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ListFilters.copy$default(value, 0.0d, 0.0d, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListFilters.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHANGE_UNSPECIFIED", "ONE_DAY", "ONE_WEEK", "ONE_MONTH", "THREE_MONTH", "ONE_YEAR", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Change implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Change[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Change> ADAPTER;
        public static final Change CHANGE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Change ONE_DAY;
        public static final Change ONE_MONTH;
        public static final Change ONE_WEEK;
        public static final Change ONE_YEAR;
        public static final Change THREE_MONTH;
        private final int value;

        private static final /* synthetic */ Change[] $values() {
            return new Change[]{CHANGE_UNSPECIFIED, ONE_DAY, ONE_WEEK, ONE_MONTH, THREE_MONTH, ONE_YEAR};
        }

        @JvmStatic
        public static final Change fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Change> getEntries() {
            return $ENTRIES;
        }

        private Change(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Change change = new Change("CHANGE_UNSPECIFIED", 0, 0);
            CHANGE_UNSPECIFIED = change;
            ONE_DAY = new Change("ONE_DAY", 1, 1);
            ONE_WEEK = new Change("ONE_WEEK", 2, 2);
            ONE_MONTH = new Change("ONE_MONTH", 3, 3);
            THREE_MONTH = new Change("THREE_MONTH", 4, 4);
            ONE_YEAR = new Change("ONE_YEAR", 5, 5);
            Change[] changeArr$values = $values();
            $VALUES = changeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(changeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Change.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Change>(orCreateKotlinClass, syntax, change) { // from class: com.robinhood.rosetta.eventlogging.ListFilters$Change$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ListFilters.Change fromValue(int value) {
                    return ListFilters.Change.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ListFilters.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFilters$Change$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Change;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Change fromValue(int value) {
                if (value == 0) {
                    return Change.CHANGE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Change.ONE_DAY;
                }
                if (value == 2) {
                    return Change.ONE_WEEK;
                }
                if (value == 3) {
                    return Change.ONE_MONTH;
                }
                if (value == 4) {
                    return Change.THREE_MONTH;
                }
                if (value != 5) {
                    return null;
                }
                return Change.ONE_YEAR;
            }
        }

        public static Change valueOf(String str) {
            return (Change) Enum.valueOf(Change.class, str);
        }

        public static Change[] values() {
            return (Change[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListFilters.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFilters$Direction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DIRECTION_UNSPECIFIED", "RISING", "FALLING", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Direction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Direction> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Direction DIRECTION_UNSPECIFIED;
        public static final Direction FALLING;
        public static final Direction RISING;
        private final int value;

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{DIRECTION_UNSPECIFIED, RISING, FALLING};
        }

        @JvmStatic
        public static final Direction fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Direction> getEntries() {
            return $ENTRIES;
        }

        private Direction(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Direction direction = new Direction("DIRECTION_UNSPECIFIED", 0, 0);
            DIRECTION_UNSPECIFIED = direction;
            RISING = new Direction("RISING", 1, 1);
            FALLING = new Direction("FALLING", 2, 2);
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Direction.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Direction>(orCreateKotlinClass, syntax, direction) { // from class: com.robinhood.rosetta.eventlogging.ListFilters$Direction$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ListFilters.Direction fromValue(int value) {
                    return ListFilters.Direction.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ListFilters.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFilters$Direction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$Direction;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Direction fromValue(int value) {
                if (value == 0) {
                    return Direction.DIRECTION_UNSPECIFIED;
                }
                if (value == 1) {
                    return Direction.RISING;
                }
                if (value != 2) {
                    return null;
                }
                return Direction.FALLING;
            }
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListFilters.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MARKET_CAP_UNSPECIFIED", "SMALL", "MID", "LARGE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MarketCap implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MarketCap[] $VALUES;

        @JvmField
        public static final ProtoAdapter<MarketCap> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final MarketCap LARGE;
        public static final MarketCap MARKET_CAP_UNSPECIFIED;
        public static final MarketCap MID;
        public static final MarketCap SMALL;
        private final int value;

        private static final /* synthetic */ MarketCap[] $values() {
            return new MarketCap[]{MARKET_CAP_UNSPECIFIED, SMALL, MID, LARGE};
        }

        @JvmStatic
        public static final MarketCap fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<MarketCap> getEntries() {
            return $ENTRIES;
        }

        private MarketCap(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final MarketCap marketCap = new MarketCap("MARKET_CAP_UNSPECIFIED", 0, 0);
            MARKET_CAP_UNSPECIFIED = marketCap;
            SMALL = new MarketCap("SMALL", 1, 1);
            MID = new MarketCap("MID", 2, 2);
            LARGE = new MarketCap("LARGE", 3, 3);
            MarketCap[] marketCapArr$values = $values();
            $VALUES = marketCapArr$values;
            $ENTRIES = EnumEntries2.enumEntries(marketCapArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarketCap.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<MarketCap>(orCreateKotlinClass, syntax, marketCap) { // from class: com.robinhood.rosetta.eventlogging.ListFilters$MarketCap$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ListFilters.MarketCap fromValue(int value) {
                    return ListFilters.MarketCap.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ListFilters.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$MarketCap;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final MarketCap fromValue(int value) {
                if (value == 0) {
                    return MarketCap.MARKET_CAP_UNSPECIFIED;
                }
                if (value == 1) {
                    return MarketCap.SMALL;
                }
                if (value == 2) {
                    return MarketCap.MID;
                }
                if (value != 3) {
                    return null;
                }
                return MarketCap.LARGE;
            }
        }

        public static MarketCap valueOf(String str) {
            return (MarketCap) Enum.valueOf(MarketCap.class, str);
        }

        public static MarketCap[] values() {
            return (MarketCap[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListFilters.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFilters$AnalystRatings;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ANALYST_RATINGS_UNSPECIFIED", "FORTY_NINE_OR_LOWER", "FIFTY_OR_HIGHER", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AnalystRatings implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnalystRatings[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AnalystRatings> ADAPTER;
        public static final AnalystRatings ANALYST_RATINGS_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AnalystRatings FIFTY_OR_HIGHER;
        public static final AnalystRatings FORTY_NINE_OR_LOWER;
        private final int value;

        private static final /* synthetic */ AnalystRatings[] $values() {
            return new AnalystRatings[]{ANALYST_RATINGS_UNSPECIFIED, FORTY_NINE_OR_LOWER, FIFTY_OR_HIGHER};
        }

        @JvmStatic
        public static final AnalystRatings fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AnalystRatings> getEntries() {
            return $ENTRIES;
        }

        private AnalystRatings(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AnalystRatings analystRatings = new AnalystRatings("ANALYST_RATINGS_UNSPECIFIED", 0, 0);
            ANALYST_RATINGS_UNSPECIFIED = analystRatings;
            FORTY_NINE_OR_LOWER = new AnalystRatings("FORTY_NINE_OR_LOWER", 1, 1);
            FIFTY_OR_HIGHER = new AnalystRatings("FIFTY_OR_HIGHER", 2, 2);
            AnalystRatings[] analystRatingsArr$values = $values();
            $VALUES = analystRatingsArr$values;
            $ENTRIES = EnumEntries2.enumEntries(analystRatingsArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AnalystRatings.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AnalystRatings>(orCreateKotlinClass, syntax, analystRatings) { // from class: com.robinhood.rosetta.eventlogging.ListFilters$AnalystRatings$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ListFilters.AnalystRatings fromValue(int value) {
                    return ListFilters.AnalystRatings.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ListFilters.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ListFilters$AnalystRatings$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ListFilters$AnalystRatings;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AnalystRatings fromValue(int value) {
                if (value == 0) {
                    return AnalystRatings.ANALYST_RATINGS_UNSPECIFIED;
                }
                if (value == 1) {
                    return AnalystRatings.FORTY_NINE_OR_LOWER;
                }
                if (value != 2) {
                    return null;
                }
                return AnalystRatings.FIFTY_OR_HIGHER;
            }
        }

        public static AnalystRatings valueOf(String str) {
            return (AnalystRatings) Enum.valueOf(AnalystRatings.class, str);
        }

        public static AnalystRatings[] values() {
            return (AnalystRatings[]) $VALUES.clone();
        }
    }
}
