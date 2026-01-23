package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.FuturesTradeBarContext;
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

/* compiled from: FuturesTradeBarContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext;", "Lcom/squareup/wire/Message;", "", "trade_button_status", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;", "buy_button_status", "sell_button_status", "contract_tradability", "Lcom/robinhood/rosetta/eventlogging/ContractTradability;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;Lcom/robinhood/rosetta/eventlogging/ContractTradability;Lokio/ByteString;)V", "getTrade_button_status", "()Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;", "getBuy_button_status", "getSell_button_status", "getContract_tradability", "()Lcom/robinhood/rosetta/eventlogging/ContractTradability;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ButtonStatus", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class FuturesTradeBarContext extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesTradeBarContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesTradeBarContext$ButtonStatus#ADAPTER", jsonName = "buyButtonStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ButtonStatus buy_button_status;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ContractTradability#ADAPTER", jsonName = "contractTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ContractTradability contract_tradability;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesTradeBarContext$ButtonStatus#ADAPTER", jsonName = "sellButtonStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ButtonStatus sell_button_status;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesTradeBarContext$ButtonStatus#ADAPTER", jsonName = "tradeButtonStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ButtonStatus trade_button_status;

    public FuturesTradeBarContext() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24285newBuilder();
    }

    public final ButtonStatus getTrade_button_status() {
        return this.trade_button_status;
    }

    public /* synthetic */ FuturesTradeBarContext(ButtonStatus buttonStatus, ButtonStatus buttonStatus2, ButtonStatus buttonStatus3, ContractTradability contractTradability, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ButtonStatus.BUTTON_STATUS_UNSPECIFIED : buttonStatus, (i & 2) != 0 ? ButtonStatus.BUTTON_STATUS_UNSPECIFIED : buttonStatus2, (i & 4) != 0 ? ButtonStatus.BUTTON_STATUS_UNSPECIFIED : buttonStatus3, (i & 8) != 0 ? ContractTradability.TRADABILITY_UNSPECIFIED : contractTradability, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ButtonStatus getBuy_button_status() {
        return this.buy_button_status;
    }

    public final ButtonStatus getSell_button_status() {
        return this.sell_button_status;
    }

    public final ContractTradability getContract_tradability() {
        return this.contract_tradability;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesTradeBarContext(ButtonStatus trade_button_status, ButtonStatus buy_button_status, ButtonStatus sell_button_status, ContractTradability contract_tradability, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(trade_button_status, "trade_button_status");
        Intrinsics.checkNotNullParameter(buy_button_status, "buy_button_status");
        Intrinsics.checkNotNullParameter(sell_button_status, "sell_button_status");
        Intrinsics.checkNotNullParameter(contract_tradability, "contract_tradability");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.trade_button_status = trade_button_status;
        this.buy_button_status = buy_button_status;
        this.sell_button_status = sell_button_status;
        this.contract_tradability = contract_tradability;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24285newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesTradeBarContext)) {
            return false;
        }
        FuturesTradeBarContext futuresTradeBarContext = (FuturesTradeBarContext) other;
        return Intrinsics.areEqual(unknownFields(), futuresTradeBarContext.unknownFields()) && this.trade_button_status == futuresTradeBarContext.trade_button_status && this.buy_button_status == futuresTradeBarContext.buy_button_status && this.sell_button_status == futuresTradeBarContext.sell_button_status && this.contract_tradability == futuresTradeBarContext.contract_tradability;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.trade_button_status.hashCode()) * 37) + this.buy_button_status.hashCode()) * 37) + this.sell_button_status.hashCode()) * 37) + this.contract_tradability.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("trade_button_status=" + this.trade_button_status);
        arrayList.add("buy_button_status=" + this.buy_button_status);
        arrayList.add("sell_button_status=" + this.sell_button_status);
        arrayList.add("contract_tradability=" + this.contract_tradability);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesTradeBarContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesTradeBarContext copy$default(FuturesTradeBarContext futuresTradeBarContext, ButtonStatus buttonStatus, ButtonStatus buttonStatus2, ButtonStatus buttonStatus3, ContractTradability contractTradability, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            buttonStatus = futuresTradeBarContext.trade_button_status;
        }
        if ((i & 2) != 0) {
            buttonStatus2 = futuresTradeBarContext.buy_button_status;
        }
        if ((i & 4) != 0) {
            buttonStatus3 = futuresTradeBarContext.sell_button_status;
        }
        if ((i & 8) != 0) {
            contractTradability = futuresTradeBarContext.contract_tradability;
        }
        if ((i & 16) != 0) {
            byteString = futuresTradeBarContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        ButtonStatus buttonStatus4 = buttonStatus3;
        return futuresTradeBarContext.copy(buttonStatus, buttonStatus2, buttonStatus4, contractTradability, byteString2);
    }

    public final FuturesTradeBarContext copy(ButtonStatus trade_button_status, ButtonStatus buy_button_status, ButtonStatus sell_button_status, ContractTradability contract_tradability, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(trade_button_status, "trade_button_status");
        Intrinsics.checkNotNullParameter(buy_button_status, "buy_button_status");
        Intrinsics.checkNotNullParameter(sell_button_status, "sell_button_status");
        Intrinsics.checkNotNullParameter(contract_tradability, "contract_tradability");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesTradeBarContext(trade_button_status, buy_button_status, sell_button_status, contract_tradability, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesTradeBarContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesTradeBarContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.FuturesTradeBarContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesTradeBarContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                FuturesTradeBarContext.ButtonStatus trade_button_status = value.getTrade_button_status();
                FuturesTradeBarContext.ButtonStatus buttonStatus = FuturesTradeBarContext.ButtonStatus.BUTTON_STATUS_UNSPECIFIED;
                if (trade_button_status != buttonStatus) {
                    size += FuturesTradeBarContext.ButtonStatus.ADAPTER.encodedSizeWithTag(1, value.getTrade_button_status());
                }
                if (value.getBuy_button_status() != buttonStatus) {
                    size += FuturesTradeBarContext.ButtonStatus.ADAPTER.encodedSizeWithTag(2, value.getBuy_button_status());
                }
                if (value.getSell_button_status() != buttonStatus) {
                    size += FuturesTradeBarContext.ButtonStatus.ADAPTER.encodedSizeWithTag(3, value.getSell_button_status());
                }
                return value.getContract_tradability() != ContractTradability.TRADABILITY_UNSPECIFIED ? size + ContractTradability.ADAPTER.encodedSizeWithTag(4, value.getContract_tradability()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesTradeBarContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                FuturesTradeBarContext.ButtonStatus trade_button_status = value.getTrade_button_status();
                FuturesTradeBarContext.ButtonStatus buttonStatus = FuturesTradeBarContext.ButtonStatus.BUTTON_STATUS_UNSPECIFIED;
                if (trade_button_status != buttonStatus) {
                    FuturesTradeBarContext.ButtonStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getTrade_button_status());
                }
                if (value.getBuy_button_status() != buttonStatus) {
                    FuturesTradeBarContext.ButtonStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getBuy_button_status());
                }
                if (value.getSell_button_status() != buttonStatus) {
                    FuturesTradeBarContext.ButtonStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getSell_button_status());
                }
                if (value.getContract_tradability() != ContractTradability.TRADABILITY_UNSPECIFIED) {
                    ContractTradability.ADAPTER.encodeWithTag(writer, 4, (int) value.getContract_tradability());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesTradeBarContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getContract_tradability() != ContractTradability.TRADABILITY_UNSPECIFIED) {
                    ContractTradability.ADAPTER.encodeWithTag(writer, 4, (int) value.getContract_tradability());
                }
                FuturesTradeBarContext.ButtonStatus sell_button_status = value.getSell_button_status();
                FuturesTradeBarContext.ButtonStatus buttonStatus = FuturesTradeBarContext.ButtonStatus.BUTTON_STATUS_UNSPECIFIED;
                if (sell_button_status != buttonStatus) {
                    FuturesTradeBarContext.ButtonStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getSell_button_status());
                }
                if (value.getBuy_button_status() != buttonStatus) {
                    FuturesTradeBarContext.ButtonStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getBuy_button_status());
                }
                if (value.getTrade_button_status() != buttonStatus) {
                    FuturesTradeBarContext.ButtonStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getTrade_button_status());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesTradeBarContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesTradeBarContext.ButtonStatus buttonStatus = FuturesTradeBarContext.ButtonStatus.BUTTON_STATUS_UNSPECIFIED;
                ContractTradability contractTradability = ContractTradability.TRADABILITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                FuturesTradeBarContext.ButtonStatus buttonStatusDecode = buttonStatus;
                FuturesTradeBarContext.ButtonStatus buttonStatusDecode2 = buttonStatusDecode;
                ContractTradability contractTradabilityDecode = contractTradability;
                FuturesTradeBarContext.ButtonStatus buttonStatusDecode3 = buttonStatusDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FuturesTradeBarContext(buttonStatusDecode3, buttonStatusDecode, buttonStatusDecode2, contractTradabilityDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            buttonStatusDecode3 = FuturesTradeBarContext.ButtonStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            buttonStatusDecode = FuturesTradeBarContext.ButtonStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            buttonStatusDecode2 = FuturesTradeBarContext.ButtonStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    } else if (iNextTag == 4) {
                        try {
                            contractTradabilityDecode = ContractTradability.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesTradeBarContext redact(FuturesTradeBarContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FuturesTradeBarContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesTradeBarContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BUTTON_STATUS_UNSPECIFIED", "ENABLED", "DISABLED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ButtonStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ButtonStatus> ADAPTER;
        public static final ButtonStatus BUTTON_STATUS_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ButtonStatus DISABLED;
        public static final ButtonStatus ENABLED;
        private final int value;

        private static final /* synthetic */ ButtonStatus[] $values() {
            return new ButtonStatus[]{BUTTON_STATUS_UNSPECIFIED, ENABLED, DISABLED};
        }

        @JvmStatic
        public static final ButtonStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ButtonStatus> getEntries() {
            return $ENTRIES;
        }

        private ButtonStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ButtonStatus buttonStatus = new ButtonStatus("BUTTON_STATUS_UNSPECIFIED", 0, 0);
            BUTTON_STATUS_UNSPECIFIED = buttonStatus;
            ENABLED = new ButtonStatus("ENABLED", 1, 1);
            DISABLED = new ButtonStatus("DISABLED", 2, 2);
            ButtonStatus[] buttonStatusArr$values = $values();
            $VALUES = buttonStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(buttonStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ButtonStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ButtonStatus>(orCreateKotlinClass, syntax, buttonStatus) { // from class: com.robinhood.rosetta.eventlogging.FuturesTradeBarContext$ButtonStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FuturesTradeBarContext.ButtonStatus fromValue(int value) {
                    return FuturesTradeBarContext.ButtonStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FuturesTradeBarContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ButtonStatus fromValue(int value) {
                if (value == 0) {
                    return ButtonStatus.BUTTON_STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return ButtonStatus.ENABLED;
                }
                if (value != 2) {
                    return null;
                }
                return ButtonStatus.DISABLED;
            }
        }

        public static ButtonStatus valueOf(String str) {
            return (ButtonStatus) Enum.valueOf(ButtonStatus.class, str);
        }

        public static ButtonStatus[] values() {
            return (ButtonStatus[]) $VALUES.clone();
        }
    }
}
