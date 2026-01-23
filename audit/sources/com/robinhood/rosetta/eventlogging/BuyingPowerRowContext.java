package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.BuyingPowerRowContext;
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

/* compiled from: BuyingPowerRowContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext;", "Lcom/squareup/wire/Message;", "", "margin_health_state", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState;", "hasAccountDeficit", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState;ZLokio/ByteString;)V", "getMargin_health_state", "()Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState;", "getHasAccountDeficit", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "MarginHealthState", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class BuyingPowerRowContext extends Message {

    @JvmField
    public static final ProtoAdapter<BuyingPowerRowContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean hasAccountDeficit;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.BuyingPowerRowContext$MarginHealthState#ADAPTER", jsonName = "marginHealthState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MarginHealthState margin_health_state;

    public BuyingPowerRowContext() {
        this(null, false, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24041newBuilder();
    }

    public final MarginHealthState getMargin_health_state() {
        return this.margin_health_state;
    }

    public /* synthetic */ BuyingPowerRowContext(MarginHealthState marginHealthState, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MarginHealthState.HEALTHY : marginHealthState, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getHasAccountDeficit() {
        return this.hasAccountDeficit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyingPowerRowContext(MarginHealthState margin_health_state, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.margin_health_state = margin_health_state;
        this.hasAccountDeficit = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24041newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BuyingPowerRowContext)) {
            return false;
        }
        BuyingPowerRowContext buyingPowerRowContext = (BuyingPowerRowContext) other;
        return Intrinsics.areEqual(unknownFields(), buyingPowerRowContext.unknownFields()) && this.margin_health_state == buyingPowerRowContext.margin_health_state && this.hasAccountDeficit == buyingPowerRowContext.hasAccountDeficit;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.margin_health_state.hashCode()) * 37) + java.lang.Boolean.hashCode(this.hasAccountDeficit);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("margin_health_state=" + this.margin_health_state);
        arrayList.add("hasAccountDeficit=" + this.hasAccountDeficit);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BuyingPowerRowContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BuyingPowerRowContext copy$default(BuyingPowerRowContext buyingPowerRowContext, MarginHealthState marginHealthState, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            marginHealthState = buyingPowerRowContext.margin_health_state;
        }
        if ((i & 2) != 0) {
            z = buyingPowerRowContext.hasAccountDeficit;
        }
        if ((i & 4) != 0) {
            byteString = buyingPowerRowContext.unknownFields();
        }
        return buyingPowerRowContext.copy(marginHealthState, z, byteString);
    }

    public final BuyingPowerRowContext copy(MarginHealthState margin_health_state, boolean hasAccountDeficit, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BuyingPowerRowContext(margin_health_state, hasAccountDeficit, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BuyingPowerRowContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BuyingPowerRowContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.BuyingPowerRowContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BuyingPowerRowContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMargin_health_state() != BuyingPowerRowContext.MarginHealthState.HEALTHY) {
                    size += BuyingPowerRowContext.MarginHealthState.ADAPTER.encodedSizeWithTag(1, value.getMargin_health_state());
                }
                return value.getHasAccountDeficit() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getHasAccountDeficit())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BuyingPowerRowContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMargin_health_state() != BuyingPowerRowContext.MarginHealthState.HEALTHY) {
                    BuyingPowerRowContext.MarginHealthState.ADAPTER.encodeWithTag(writer, 1, (int) value.getMargin_health_state());
                }
                if (value.getHasAccountDeficit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getHasAccountDeficit()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BuyingPowerRowContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHasAccountDeficit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getHasAccountDeficit()));
                }
                if (value.getMargin_health_state() != BuyingPowerRowContext.MarginHealthState.HEALTHY) {
                    BuyingPowerRowContext.MarginHealthState.ADAPTER.encodeWithTag(writer, 1, (int) value.getMargin_health_state());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BuyingPowerRowContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BuyingPowerRowContext.MarginHealthState marginHealthStateDecode = BuyingPowerRowContext.MarginHealthState.HEALTHY;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BuyingPowerRowContext(marginHealthStateDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            marginHealthStateDecode = BuyingPowerRowContext.MarginHealthState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BuyingPowerRowContext redact(BuyingPowerRowContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BuyingPowerRowContext.copy$default(value, null, false, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BuyingPowerRowContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "HEALTHY", "MODERATE", "RISKY", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MarginHealthState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MarginHealthState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<MarginHealthState> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final MarginHealthState HEALTHY;
        public static final MarginHealthState MODERATE;
        public static final MarginHealthState RISKY;
        private final int value;

        private static final /* synthetic */ MarginHealthState[] $values() {
            return new MarginHealthState[]{HEALTHY, MODERATE, RISKY};
        }

        @JvmStatic
        public static final MarginHealthState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<MarginHealthState> getEntries() {
            return $ENTRIES;
        }

        private MarginHealthState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final MarginHealthState marginHealthState = new MarginHealthState("HEALTHY", 0, 0);
            HEALTHY = marginHealthState;
            MODERATE = new MarginHealthState("MODERATE", 1, 1);
            RISKY = new MarginHealthState("RISKY", 2, 2);
            MarginHealthState[] marginHealthStateArr$values = $values();
            $VALUES = marginHealthStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(marginHealthStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginHealthState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<MarginHealthState>(orCreateKotlinClass, syntax, marginHealthState) { // from class: com.robinhood.rosetta.eventlogging.BuyingPowerRowContext$MarginHealthState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public BuyingPowerRowContext.MarginHealthState fromValue(int value) {
                    return BuyingPowerRowContext.MarginHealthState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: BuyingPowerRowContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final MarginHealthState fromValue(int value) {
                if (value == 0) {
                    return MarginHealthState.HEALTHY;
                }
                if (value == 1) {
                    return MarginHealthState.MODERATE;
                }
                if (value != 2) {
                    return null;
                }
                return MarginHealthState.RISKY;
            }
        }

        public static MarginHealthState valueOf(String str) {
            return (MarginHealthState) Enum.valueOf(MarginHealthState.class, str);
        }

        public static MarginHealthState[] values() {
            return (MarginHealthState[]) $VALUES.clone();
        }
    }
}
