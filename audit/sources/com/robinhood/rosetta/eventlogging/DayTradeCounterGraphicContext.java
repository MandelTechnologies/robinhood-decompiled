package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.DayTradeCounterGraphicContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: DayTradeCounterGraphicContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCounterGraphicContext;", "Lcom/squareup/wire/Message;", "", "start_date", "", "end_date", "day_trades", "", "Lcom/robinhood/rosetta/eventlogging/DayTradeCounterGraphicContext$DayTradePair;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getStart_date", "()Ljava/lang/String;", "getEnd_date", "getDay_trades", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "DayTradePair", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DayTradeCounterGraphicContext extends Message {

    @JvmField
    public static final ProtoAdapter<DayTradeCounterGraphicContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DayTradeCounterGraphicContext$DayTradePair#ADAPTER", jsonName = "dayTrades", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final java.util.List<DayTradePair> day_trades;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String end_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String start_date;

    public DayTradeCounterGraphicContext() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ DayTradeCounterGraphicContext(String str, String str2, java.util.List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24186newBuilder();
    }

    public final String getStart_date() {
        return this.start_date;
    }

    public final String getEnd_date() {
        return this.end_date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayTradeCounterGraphicContext(String start_date, String end_date, java.util.List<DayTradePair> day_trades, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(start_date, "start_date");
        Intrinsics.checkNotNullParameter(end_date, "end_date");
        Intrinsics.checkNotNullParameter(day_trades, "day_trades");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.start_date = start_date;
        this.end_date = end_date;
        this.day_trades = Internal.immutableCopyOf("day_trades", day_trades);
    }

    public final java.util.List<DayTradePair> getDay_trades() {
        return this.day_trades;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24186newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DayTradeCounterGraphicContext)) {
            return false;
        }
        DayTradeCounterGraphicContext dayTradeCounterGraphicContext = (DayTradeCounterGraphicContext) other;
        return Intrinsics.areEqual(unknownFields(), dayTradeCounterGraphicContext.unknownFields()) && Intrinsics.areEqual(this.start_date, dayTradeCounterGraphicContext.start_date) && Intrinsics.areEqual(this.end_date, dayTradeCounterGraphicContext.end_date) && Intrinsics.areEqual(this.day_trades, dayTradeCounterGraphicContext.day_trades);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.start_date.hashCode()) * 37) + this.end_date.hashCode()) * 37) + this.day_trades.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("start_date=" + Internal.sanitize(this.start_date));
        arrayList.add("end_date=" + Internal.sanitize(this.end_date));
        if (!this.day_trades.isEmpty()) {
            arrayList.add("day_trades=" + this.day_trades);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DayTradeCounterGraphicContext{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DayTradeCounterGraphicContext copy$default(DayTradeCounterGraphicContext dayTradeCounterGraphicContext, String str, String str2, java.util.List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dayTradeCounterGraphicContext.start_date;
        }
        if ((i & 2) != 0) {
            str2 = dayTradeCounterGraphicContext.end_date;
        }
        if ((i & 4) != 0) {
            list = dayTradeCounterGraphicContext.day_trades;
        }
        if ((i & 8) != 0) {
            byteString = dayTradeCounterGraphicContext.unknownFields();
        }
        return dayTradeCounterGraphicContext.copy(str, str2, list, byteString);
    }

    public final DayTradeCounterGraphicContext copy(String start_date, String end_date, java.util.List<DayTradePair> day_trades, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(start_date, "start_date");
        Intrinsics.checkNotNullParameter(end_date, "end_date");
        Intrinsics.checkNotNullParameter(day_trades, "day_trades");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DayTradeCounterGraphicContext(start_date, end_date, day_trades, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DayTradeCounterGraphicContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DayTradeCounterGraphicContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DayTradeCounterGraphicContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DayTradeCounterGraphicContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getStart_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getStart_date());
                }
                if (!Intrinsics.areEqual(value.getEnd_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEnd_date());
                }
                return size + DayTradeCounterGraphicContext.DayTradePair.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getDay_trades());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DayTradeCounterGraphicContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getStart_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStart_date());
                }
                if (!Intrinsics.areEqual(value.getEnd_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEnd_date());
                }
                DayTradeCounterGraphicContext.DayTradePair.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getDay_trades());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DayTradeCounterGraphicContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                DayTradeCounterGraphicContext.DayTradePair.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getDay_trades());
                if (!Intrinsics.areEqual(value.getEnd_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEnd_date());
                }
                if (Intrinsics.areEqual(value.getStart_date(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStart_date());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DayTradeCounterGraphicContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DayTradeCounterGraphicContext(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(DayTradeCounterGraphicContext.DayTradePair.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DayTradeCounterGraphicContext redact(DayTradeCounterGraphicContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DayTradeCounterGraphicContext.copy$default(value, null, null, Internal.m26823redactElements(value.getDay_trades(), DayTradeCounterGraphicContext.DayTradePair.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }

    /* compiled from: DayTradeCounterGraphicContext.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCounterGraphicContext$DayTradePair;", "Lcom/squareup/wire/Message;", "", "symbol", "", "trade_date", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getSymbol", "()Ljava/lang/String;", "getTrade_date", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DayTradePair extends Message {

        @JvmField
        public static final ProtoAdapter<DayTradePair> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String symbol;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String trade_date;

        public DayTradePair() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ DayTradePair(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24187newBuilder();
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getTrade_date() {
            return this.trade_date;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DayTradePair(String symbol, String trade_date, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(trade_date, "trade_date");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.symbol = symbol;
            this.trade_date = trade_date;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24187newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DayTradePair)) {
                return false;
            }
            DayTradePair dayTradePair = (DayTradePair) other;
            return Intrinsics.areEqual(unknownFields(), dayTradePair.unknownFields()) && Intrinsics.areEqual(this.symbol, dayTradePair.symbol) && Intrinsics.areEqual(this.trade_date, dayTradePair.trade_date);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.symbol.hashCode()) * 37) + this.trade_date.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("symbol=" + Internal.sanitize(this.symbol));
            arrayList.add("trade_date=" + Internal.sanitize(this.trade_date));
            return CollectionsKt.joinToString$default(arrayList, ", ", "DayTradePair{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ DayTradePair copy$default(DayTradePair dayTradePair, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dayTradePair.symbol;
            }
            if ((i & 2) != 0) {
                str2 = dayTradePair.trade_date;
            }
            if ((i & 4) != 0) {
                byteString = dayTradePair.unknownFields();
            }
            return dayTradePair.copy(str, str2, byteString);
        }

        public final DayTradePair copy(String symbol, String trade_date, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(trade_date, "trade_date");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new DayTradePair(symbol, trade_date, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DayTradePair.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<DayTradePair>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DayTradeCounterGraphicContext$DayTradePair$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DayTradeCounterGraphicContext.DayTradePair value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSymbol());
                    }
                    return !Intrinsics.areEqual(value.getTrade_date(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTrade_date()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DayTradeCounterGraphicContext.DayTradePair value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol());
                    }
                    if (!Intrinsics.areEqual(value.getTrade_date(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTrade_date());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DayTradeCounterGraphicContext.DayTradePair value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getTrade_date(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTrade_date());
                    }
                    if (Intrinsics.areEqual(value.getSymbol(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DayTradeCounterGraphicContext.DayTradePair redact(DayTradeCounterGraphicContext.DayTradePair value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return DayTradeCounterGraphicContext.DayTradePair.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DayTradeCounterGraphicContext.DayTradePair decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DayTradeCounterGraphicContext.DayTradePair(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
