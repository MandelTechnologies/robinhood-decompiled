package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.MarginMaintenanceTableRowContext;
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
import com.squareup.wire.internal.Internal;
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

/* compiled from: MarginMaintenanceTableRowContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext;", "Lcom/squareup/wire/Message;", "", "symbol", "", "quantity", "", "instrument_type", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType;Lokio/ByteString;)V", "getSymbol", "()Ljava/lang/String;", "getQuantity", "()I", "getInstrument_type", "()Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "InstrumentType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class MarginMaintenanceTableRowContext extends Message {

    @JvmField
    public static final ProtoAdapter<MarginMaintenanceTableRowContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MarginMaintenanceTableRowContext$InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String symbol;

    public MarginMaintenanceTableRowContext() {
        this(null, 0, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24377newBuilder();
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public /* synthetic */ MarginMaintenanceTableRowContext(String str, int i, InstrumentType instrumentType, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? InstrumentType.EQUITY : instrumentType, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginMaintenanceTableRowContext(String symbol, int i, InstrumentType instrument_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.symbol = symbol;
        this.quantity = i;
        this.instrument_type = instrument_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24377newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginMaintenanceTableRowContext)) {
            return false;
        }
        MarginMaintenanceTableRowContext marginMaintenanceTableRowContext = (MarginMaintenanceTableRowContext) other;
        return Intrinsics.areEqual(unknownFields(), marginMaintenanceTableRowContext.unknownFields()) && Intrinsics.areEqual(this.symbol, marginMaintenanceTableRowContext.symbol) && this.quantity == marginMaintenanceTableRowContext.quantity && this.instrument_type == marginMaintenanceTableRowContext.instrument_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.symbol.hashCode()) * 37) + Integer.hashCode(this.quantity)) * 37) + this.instrument_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("quantity=" + this.quantity);
        arrayList.add("instrument_type=" + this.instrument_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginMaintenanceTableRowContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginMaintenanceTableRowContext copy$default(MarginMaintenanceTableRowContext marginMaintenanceTableRowContext, String str, int i, InstrumentType instrumentType, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = marginMaintenanceTableRowContext.symbol;
        }
        if ((i2 & 2) != 0) {
            i = marginMaintenanceTableRowContext.quantity;
        }
        if ((i2 & 4) != 0) {
            instrumentType = marginMaintenanceTableRowContext.instrument_type;
        }
        if ((i2 & 8) != 0) {
            byteString = marginMaintenanceTableRowContext.unknownFields();
        }
        return marginMaintenanceTableRowContext.copy(str, i, instrumentType, byteString);
    }

    public final MarginMaintenanceTableRowContext copy(String symbol, int quantity, InstrumentType instrument_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginMaintenanceTableRowContext(symbol, quantity, instrument_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginMaintenanceTableRowContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginMaintenanceTableRowContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MarginMaintenanceTableRowContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginMaintenanceTableRowContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSymbol());
                }
                if (value.getQuantity() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getQuantity()));
                }
                return value.getInstrument_type() != MarginMaintenanceTableRowContext.InstrumentType.EQUITY ? size + MarginMaintenanceTableRowContext.InstrumentType.ADAPTER.encodedSizeWithTag(3, value.getInstrument_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginMaintenanceTableRowContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol());
                }
                if (value.getQuantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getQuantity()));
                }
                if (value.getInstrument_type() != MarginMaintenanceTableRowContext.InstrumentType.EQUITY) {
                    MarginMaintenanceTableRowContext.InstrumentType.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstrument_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginMaintenanceTableRowContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInstrument_type() != MarginMaintenanceTableRowContext.InstrumentType.EQUITY) {
                    MarginMaintenanceTableRowContext.InstrumentType.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstrument_type());
                }
                if (value.getQuantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getQuantity()));
                }
                if (Intrinsics.areEqual(value.getSymbol(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginMaintenanceTableRowContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MarginMaintenanceTableRowContext.InstrumentType instrumentTypeDecode = MarginMaintenanceTableRowContext.InstrumentType.EQUITY;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarginMaintenanceTableRowContext(strDecode, iIntValue, instrumentTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 3) {
                        try {
                            instrumentTypeDecode = MarginMaintenanceTableRowContext.InstrumentType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginMaintenanceTableRowContext redact(MarginMaintenanceTableRowContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MarginMaintenanceTableRowContext.copy$default(value, null, 0, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarginMaintenanceTableRowContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EQUITY", "OPTION", "INDEX_OPTION", "CRYPTO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InstrumentType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InstrumentType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<InstrumentType> ADAPTER;
        public static final InstrumentType CRYPTO;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final InstrumentType EQUITY;
        public static final InstrumentType INDEX_OPTION;
        public static final InstrumentType OPTION;
        private final int value;

        private static final /* synthetic */ InstrumentType[] $values() {
            return new InstrumentType[]{EQUITY, OPTION, INDEX_OPTION, CRYPTO};
        }

        @JvmStatic
        public static final InstrumentType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<InstrumentType> getEntries() {
            return $ENTRIES;
        }

        private InstrumentType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final InstrumentType instrumentType = new InstrumentType("EQUITY", 0, 0);
            EQUITY = instrumentType;
            OPTION = new InstrumentType("OPTION", 1, 1);
            INDEX_OPTION = new InstrumentType("INDEX_OPTION", 2, 2);
            CRYPTO = new InstrumentType("CRYPTO", 3, 3);
            InstrumentType[] instrumentTypeArr$values = $values();
            $VALUES = instrumentTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(instrumentTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InstrumentType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<InstrumentType>(orCreateKotlinClass, syntax, instrumentType) { // from class: com.robinhood.rosetta.eventlogging.MarginMaintenanceTableRowContext$InstrumentType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public MarginMaintenanceTableRowContext.InstrumentType fromValue(int value) {
                    return MarginMaintenanceTableRowContext.InstrumentType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: MarginMaintenanceTableRowContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/MarginMaintenanceTableRowContext$InstrumentType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final InstrumentType fromValue(int value) {
                if (value == 0) {
                    return InstrumentType.EQUITY;
                }
                if (value == 1) {
                    return InstrumentType.OPTION;
                }
                if (value == 2) {
                    return InstrumentType.INDEX_OPTION;
                }
                if (value != 3) {
                    return null;
                }
                return InstrumentType.CRYPTO;
            }
        }

        public static InstrumentType valueOf(String str) {
            return (InstrumentType) Enum.valueOf(InstrumentType.class, str);
        }

        public static InstrumentType[] values() {
            return (InstrumentType[]) $VALUES.clone();
        }
    }
}
