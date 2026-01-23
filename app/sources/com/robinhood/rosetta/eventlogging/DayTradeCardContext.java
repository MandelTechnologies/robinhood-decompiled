package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.DayTradeCardContext;
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

/* compiled from: DayTradeCardContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext;", "Lcom/squareup/wire/Message;", "", "state", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;Lokio/ByteString;)V", "getState", "()Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "DayTradCardState", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DayTradeCardContext extends Message {

    @JvmField
    public static final ProtoAdapter<DayTradeCardContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DayTradeCardContext$DayTradCardState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final DayTradCardState state;

    /* JADX WARN: Multi-variable type inference failed */
    public DayTradeCardContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24183newBuilder();
    }

    public final DayTradCardState getState() {
        return this.state;
    }

    public /* synthetic */ DayTradeCardContext(DayTradCardState dayTradCardState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DayTradCardState.STATE_UNSPECIFIED : dayTradCardState, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayTradeCardContext(DayTradCardState state, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.state = state;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24183newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DayTradeCardContext)) {
            return false;
        }
        DayTradeCardContext dayTradeCardContext = (DayTradeCardContext) other;
        return Intrinsics.areEqual(unknownFields(), dayTradeCardContext.unknownFields()) && this.state == dayTradeCardContext.state;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("state=" + this.state);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DayTradeCardContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DayTradeCardContext copy$default(DayTradeCardContext dayTradeCardContext, DayTradCardState dayTradCardState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            dayTradCardState = dayTradeCardContext.state;
        }
        if ((i & 2) != 0) {
            byteString = dayTradeCardContext.unknownFields();
        }
        return dayTradeCardContext.copy(dayTradCardState, byteString);
    }

    public final DayTradeCardContext copy(DayTradCardState state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DayTradeCardContext(state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DayTradeCardContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DayTradeCardContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DayTradeCardContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DayTradeCardContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getState() != DayTradeCardContext.DayTradCardState.STATE_UNSPECIFIED ? size + DayTradeCardContext.DayTradCardState.ADAPTER.encodedSizeWithTag(1, value.getState()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DayTradeCardContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getState() != DayTradeCardContext.DayTradCardState.STATE_UNSPECIFIED) {
                    DayTradeCardContext.DayTradCardState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DayTradeCardContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getState() != DayTradeCardContext.DayTradCardState.STATE_UNSPECIFIED) {
                    DayTradeCardContext.DayTradCardState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DayTradeCardContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DayTradeCardContext.DayTradCardState dayTradCardStateDecode = DayTradeCardContext.DayTradCardState.STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DayTradeCardContext(dayTradCardStateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            dayTradCardStateDecode = DayTradeCardContext.DayTradCardState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DayTradeCardContext redact(DayTradeCardContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DayTradeCardContext.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DayTradeCardContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_UNSPECIFIED", "BELOW_25K", "ABOVE_25K", "PRELIMINARY_EM_CALL", "FINALIZED_EM_CALL", "DAY_TRADE_CALL_ACTIVE", "DAY_TRADE_CALL_PAST_DUE", "DAY_TRADE_CALL_MET", "PRELIM_PCO_DTEM", "PCO_DTEM", "PCO_DTDT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DayTradCardState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DayTradCardState[] $VALUES;
        public static final DayTradCardState ABOVE_25K;

        @JvmField
        public static final ProtoAdapter<DayTradCardState> ADAPTER;
        public static final DayTradCardState BELOW_25K;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DayTradCardState DAY_TRADE_CALL_ACTIVE;
        public static final DayTradCardState DAY_TRADE_CALL_MET;
        public static final DayTradCardState DAY_TRADE_CALL_PAST_DUE;
        public static final DayTradCardState FINALIZED_EM_CALL;
        public static final DayTradCardState PCO_DTDT;
        public static final DayTradCardState PCO_DTEM;
        public static final DayTradCardState PRELIMINARY_EM_CALL;
        public static final DayTradCardState PRELIM_PCO_DTEM;
        public static final DayTradCardState STATE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ DayTradCardState[] $values() {
            return new DayTradCardState[]{STATE_UNSPECIFIED, BELOW_25K, ABOVE_25K, PRELIMINARY_EM_CALL, FINALIZED_EM_CALL, DAY_TRADE_CALL_ACTIVE, DAY_TRADE_CALL_PAST_DUE, DAY_TRADE_CALL_MET, PRELIM_PCO_DTEM, PCO_DTEM, PCO_DTDT};
        }

        @JvmStatic
        public static final DayTradCardState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<DayTradCardState> getEntries() {
            return $ENTRIES;
        }

        private DayTradCardState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final DayTradCardState dayTradCardState = new DayTradCardState("STATE_UNSPECIFIED", 0, 0);
            STATE_UNSPECIFIED = dayTradCardState;
            BELOW_25K = new DayTradCardState("BELOW_25K", 1, 1);
            ABOVE_25K = new DayTradCardState("ABOVE_25K", 2, 2);
            PRELIMINARY_EM_CALL = new DayTradCardState("PRELIMINARY_EM_CALL", 3, 3);
            FINALIZED_EM_CALL = new DayTradCardState("FINALIZED_EM_CALL", 4, 4);
            DAY_TRADE_CALL_ACTIVE = new DayTradCardState("DAY_TRADE_CALL_ACTIVE", 5, 5);
            DAY_TRADE_CALL_PAST_DUE = new DayTradCardState("DAY_TRADE_CALL_PAST_DUE", 6, 6);
            DAY_TRADE_CALL_MET = new DayTradCardState("DAY_TRADE_CALL_MET", 7, 7);
            PRELIM_PCO_DTEM = new DayTradCardState("PRELIM_PCO_DTEM", 8, 8);
            PCO_DTEM = new DayTradCardState("PCO_DTEM", 9, 9);
            PCO_DTDT = new DayTradCardState("PCO_DTDT", 10, 10);
            DayTradCardState[] dayTradCardStateArr$values = $values();
            $VALUES = dayTradCardStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(dayTradCardStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DayTradCardState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<DayTradCardState>(orCreateKotlinClass, syntax, dayTradCardState) { // from class: com.robinhood.rosetta.eventlogging.DayTradeCardContext$DayTradCardState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DayTradeCardContext.DayTradCardState fromValue(int value) {
                    return DayTradeCardContext.DayTradCardState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DayTradeCardContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final DayTradCardState fromValue(int value) {
                switch (value) {
                    case 0:
                        return DayTradCardState.STATE_UNSPECIFIED;
                    case 1:
                        return DayTradCardState.BELOW_25K;
                    case 2:
                        return DayTradCardState.ABOVE_25K;
                    case 3:
                        return DayTradCardState.PRELIMINARY_EM_CALL;
                    case 4:
                        return DayTradCardState.FINALIZED_EM_CALL;
                    case 5:
                        return DayTradCardState.DAY_TRADE_CALL_ACTIVE;
                    case 6:
                        return DayTradCardState.DAY_TRADE_CALL_PAST_DUE;
                    case 7:
                        return DayTradCardState.DAY_TRADE_CALL_MET;
                    case 8:
                        return DayTradCardState.PRELIM_PCO_DTEM;
                    case 9:
                        return DayTradCardState.PCO_DTEM;
                    case 10:
                        return DayTradCardState.PCO_DTDT;
                    default:
                        return null;
                }
            }
        }

        public static DayTradCardState valueOf(String str) {
            return (DayTradCardState) Enum.valueOf(DayTradCardState.class, str);
        }

        public static DayTradCardState[] values() {
            return (DayTradCardState[]) $VALUES.clone();
        }
    }
}
