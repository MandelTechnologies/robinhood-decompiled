package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.TechnicalIndicatorContext;
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

/* compiled from: TechnicalIndicatorContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext;", "Lcom/squareup/wire/Message;", "", "type", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "indicator_configuration", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;Ljava/lang/String;Lokio/ByteString;)V", "getType", "()Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "getIndicator_configuration", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "IndicatorType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TechnicalIndicatorContext extends Message {

    @JvmField
    public static final ProtoAdapter<TechnicalIndicatorContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "indicatorConfiguration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String indicator_configuration;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TechnicalIndicatorContext$IndicatorType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final IndicatorType type;

    public TechnicalIndicatorContext() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24577newBuilder();
    }

    public final IndicatorType getType() {
        return this.type;
    }

    public /* synthetic */ TechnicalIndicatorContext(IndicatorType indicatorType, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IndicatorType.INDICATOR_TYPE_UNSPECIFIED : indicatorType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getIndicator_configuration() {
        return this.indicator_configuration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TechnicalIndicatorContext(IndicatorType type2, String indicator_configuration, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(indicator_configuration, "indicator_configuration");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.indicator_configuration = indicator_configuration;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24577newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TechnicalIndicatorContext)) {
            return false;
        }
        TechnicalIndicatorContext technicalIndicatorContext = (TechnicalIndicatorContext) other;
        return Intrinsics.areEqual(unknownFields(), technicalIndicatorContext.unknownFields()) && this.type == technicalIndicatorContext.type && Intrinsics.areEqual(this.indicator_configuration, technicalIndicatorContext.indicator_configuration);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.indicator_configuration.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        arrayList.add("indicator_configuration=" + Internal.sanitize(this.indicator_configuration));
        return CollectionsKt.joinToString$default(arrayList, ", ", "TechnicalIndicatorContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TechnicalIndicatorContext copy$default(TechnicalIndicatorContext technicalIndicatorContext, IndicatorType indicatorType, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            indicatorType = technicalIndicatorContext.type;
        }
        if ((i & 2) != 0) {
            str = technicalIndicatorContext.indicator_configuration;
        }
        if ((i & 4) != 0) {
            byteString = technicalIndicatorContext.unknownFields();
        }
        return technicalIndicatorContext.copy(indicatorType, str, byteString);
    }

    public final TechnicalIndicatorContext copy(IndicatorType type2, String indicator_configuration, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(indicator_configuration, "indicator_configuration");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TechnicalIndicatorContext(type2, indicator_configuration, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TechnicalIndicatorContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TechnicalIndicatorContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.TechnicalIndicatorContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TechnicalIndicatorContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != TechnicalIndicatorContext.IndicatorType.INDICATOR_TYPE_UNSPECIFIED) {
                    size += TechnicalIndicatorContext.IndicatorType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                return !Intrinsics.areEqual(value.getIndicator_configuration(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getIndicator_configuration()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TechnicalIndicatorContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != TechnicalIndicatorContext.IndicatorType.INDICATOR_TYPE_UNSPECIFIED) {
                    TechnicalIndicatorContext.IndicatorType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getIndicator_configuration(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIndicator_configuration());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TechnicalIndicatorContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getIndicator_configuration(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIndicator_configuration());
                }
                if (value.getType() != TechnicalIndicatorContext.IndicatorType.INDICATOR_TYPE_UNSPECIFIED) {
                    TechnicalIndicatorContext.IndicatorType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TechnicalIndicatorContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TechnicalIndicatorContext.IndicatorType indicatorTypeDecode = TechnicalIndicatorContext.IndicatorType.INDICATOR_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TechnicalIndicatorContext(indicatorTypeDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            indicatorTypeDecode = TechnicalIndicatorContext.IndicatorType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TechnicalIndicatorContext redact(TechnicalIndicatorContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TechnicalIndicatorContext.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TechnicalIndicatorContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INDICATOR_TYPE_UNSPECIFIED", "MACD", "SMA", "RSI", "EMA", "BOLLINGER_BANDS", "VWAP", "DEPTH_CHART", "ORDER_BOOK", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IndicatorType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IndicatorType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<IndicatorType> ADAPTER;
        public static final IndicatorType BOLLINGER_BANDS;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final IndicatorType DEPTH_CHART;
        public static final IndicatorType EMA;
        public static final IndicatorType INDICATOR_TYPE_UNSPECIFIED;
        public static final IndicatorType MACD;
        public static final IndicatorType ORDER_BOOK;
        public static final IndicatorType RSI;
        public static final IndicatorType SMA;
        public static final IndicatorType VWAP;
        private final int value;

        private static final /* synthetic */ IndicatorType[] $values() {
            return new IndicatorType[]{INDICATOR_TYPE_UNSPECIFIED, MACD, SMA, RSI, EMA, BOLLINGER_BANDS, VWAP, DEPTH_CHART, ORDER_BOOK};
        }

        @JvmStatic
        public static final IndicatorType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<IndicatorType> getEntries() {
            return $ENTRIES;
        }

        private IndicatorType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final IndicatorType indicatorType = new IndicatorType("INDICATOR_TYPE_UNSPECIFIED", 0, 0);
            INDICATOR_TYPE_UNSPECIFIED = indicatorType;
            MACD = new IndicatorType("MACD", 1, 1);
            SMA = new IndicatorType("SMA", 2, 2);
            RSI = new IndicatorType("RSI", 3, 3);
            EMA = new IndicatorType("EMA", 4, 4);
            BOLLINGER_BANDS = new IndicatorType("BOLLINGER_BANDS", 5, 5);
            VWAP = new IndicatorType("VWAP", 6, 6);
            DEPTH_CHART = new IndicatorType("DEPTH_CHART", 7, 7);
            ORDER_BOOK = new IndicatorType("ORDER_BOOK", 8, 8);
            IndicatorType[] indicatorTypeArr$values = $values();
            $VALUES = indicatorTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(indicatorTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndicatorType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<IndicatorType>(orCreateKotlinClass, syntax, indicatorType) { // from class: com.robinhood.rosetta.eventlogging.TechnicalIndicatorContext$IndicatorType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TechnicalIndicatorContext.IndicatorType fromValue(int value) {
                    return TechnicalIndicatorContext.IndicatorType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TechnicalIndicatorContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final IndicatorType fromValue(int value) {
                switch (value) {
                    case 0:
                        return IndicatorType.INDICATOR_TYPE_UNSPECIFIED;
                    case 1:
                        return IndicatorType.MACD;
                    case 2:
                        return IndicatorType.SMA;
                    case 3:
                        return IndicatorType.RSI;
                    case 4:
                        return IndicatorType.EMA;
                    case 5:
                        return IndicatorType.BOLLINGER_BANDS;
                    case 6:
                        return IndicatorType.VWAP;
                    case 7:
                        return IndicatorType.DEPTH_CHART;
                    case 8:
                        return IndicatorType.ORDER_BOOK;
                    default:
                        return null;
                }
            }
        }

        public static IndicatorType valueOf(String str) {
            return (IndicatorType) Enum.valueOf(IndicatorType.class, str);
        }

        public static IndicatorType[] values() {
            return (IndicatorType[]) $VALUES.clone();
        }
    }
}
