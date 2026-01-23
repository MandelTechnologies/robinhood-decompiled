package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PositionsInstrumentType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "EQUITY_LEGACY", "EQUITY_PENDING", "EQUITY", "CRYPTO", "OPTIONS", "OPTIONS_PENDING", "PSP", "FUTURES", "FUTURES_PENDING", "EVENT_CONTRACT", "COMBO_ORDERS_PENDING", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PositionsInstrumentType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PositionsInstrumentType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<PositionsInstrumentType> ADAPTER;
    public static final PositionsInstrumentType COMBO_ORDERS_PENDING;
    public static final PositionsInstrumentType CRYPTO;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PositionsInstrumentType EQUITY;
    public static final PositionsInstrumentType EQUITY_LEGACY;
    public static final PositionsInstrumentType EQUITY_PENDING;
    public static final PositionsInstrumentType EVENT_CONTRACT;
    public static final PositionsInstrumentType FUTURES;
    public static final PositionsInstrumentType FUTURES_PENDING;
    public static final PositionsInstrumentType OPTIONS;
    public static final PositionsInstrumentType OPTIONS_PENDING;
    public static final PositionsInstrumentType PSP;
    public static final PositionsInstrumentType UNKNOWN;
    private final int value;

    private static final /* synthetic */ PositionsInstrumentType[] $values() {
        return new PositionsInstrumentType[]{UNKNOWN, EQUITY_LEGACY, EQUITY_PENDING, EQUITY, CRYPTO, OPTIONS, OPTIONS_PENDING, PSP, FUTURES, FUTURES_PENDING, EVENT_CONTRACT, COMBO_ORDERS_PENDING};
    }

    @JvmStatic
    public static final PositionsInstrumentType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<PositionsInstrumentType> getEntries() {
        return $ENTRIES;
    }

    private PositionsInstrumentType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final PositionsInstrumentType positionsInstrumentType = new PositionsInstrumentType("UNKNOWN", 0, 0);
        UNKNOWN = positionsInstrumentType;
        EQUITY_LEGACY = new PositionsInstrumentType("EQUITY_LEGACY", 1, 1);
        EQUITY_PENDING = new PositionsInstrumentType("EQUITY_PENDING", 2, 2);
        EQUITY = new PositionsInstrumentType("EQUITY", 3, 3);
        CRYPTO = new PositionsInstrumentType("CRYPTO", 4, 4);
        OPTIONS = new PositionsInstrumentType("OPTIONS", 5, 5);
        OPTIONS_PENDING = new PositionsInstrumentType("OPTIONS_PENDING", 6, 6);
        PSP = new PositionsInstrumentType("PSP", 7, 7);
        FUTURES = new PositionsInstrumentType("FUTURES", 8, 8);
        FUTURES_PENDING = new PositionsInstrumentType("FUTURES_PENDING", 9, 9);
        EVENT_CONTRACT = new PositionsInstrumentType("EVENT_CONTRACT", 10, 10);
        COMBO_ORDERS_PENDING = new PositionsInstrumentType("COMBO_ORDERS_PENDING", 11, 11);
        PositionsInstrumentType[] positionsInstrumentTypeArr$values = $values();
        $VALUES = positionsInstrumentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(positionsInstrumentTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionsInstrumentType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<PositionsInstrumentType>(orCreateKotlinClass, syntax, positionsInstrumentType) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public PositionsInstrumentType fromValue(int value) {
                return PositionsInstrumentType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: PositionsInstrumentType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PositionsInstrumentType fromValue(int value) {
            switch (value) {
                case 0:
                    return PositionsInstrumentType.UNKNOWN;
                case 1:
                    return PositionsInstrumentType.EQUITY_LEGACY;
                case 2:
                    return PositionsInstrumentType.EQUITY_PENDING;
                case 3:
                    return PositionsInstrumentType.EQUITY;
                case 4:
                    return PositionsInstrumentType.CRYPTO;
                case 5:
                    return PositionsInstrumentType.OPTIONS;
                case 6:
                    return PositionsInstrumentType.OPTIONS_PENDING;
                case 7:
                    return PositionsInstrumentType.PSP;
                case 8:
                    return PositionsInstrumentType.FUTURES;
                case 9:
                    return PositionsInstrumentType.FUTURES_PENDING;
                case 10:
                    return PositionsInstrumentType.EVENT_CONTRACT;
                case 11:
                    return PositionsInstrumentType.COMBO_ORDERS_PENDING;
                default:
                    return null;
            }
        }
    }

    public static PositionsInstrumentType valueOf(String str) {
        return (PositionsInstrumentType) Enum.valueOf(PositionsInstrumentType.class, str);
    }

    public static PositionsInstrumentType[] values() {
        return (PositionsInstrumentType[]) $VALUES.clone();
    }
}
