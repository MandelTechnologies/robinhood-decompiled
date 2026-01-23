package com.robinhood.copilot.proto.p286v1;

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
/* compiled from: InstrumentType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InstrumentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INSTRUMENT_TYPE_UNSPECIFIED", "STOCK", "CRYPTO", "ETF", "PORTFOLIO", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class InstrumentType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<InstrumentType> ADAPTER;
    public static final InstrumentType CRYPTO;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InstrumentType ETF;
    public static final InstrumentType INSTRUMENT_TYPE_UNSPECIFIED;
    public static final InstrumentType PORTFOLIO;
    public static final InstrumentType STOCK;
    private final int value;

    private static final /* synthetic */ InstrumentType[] $values() {
        return new InstrumentType[]{INSTRUMENT_TYPE_UNSPECIFIED, STOCK, CRYPTO, ETF, PORTFOLIO};
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
        final InstrumentType instrumentType = new InstrumentType("INSTRUMENT_TYPE_UNSPECIFIED", 0, 0);
        INSTRUMENT_TYPE_UNSPECIFIED = instrumentType;
        STOCK = new InstrumentType("STOCK", 1, 1);
        CRYPTO = new InstrumentType("CRYPTO", 2, 2);
        ETF = new InstrumentType("ETF", 3, 3);
        PORTFOLIO = new InstrumentType("PORTFOLIO", 4, 4);
        InstrumentType[] instrumentTypeArr$values = $values();
        $VALUES = instrumentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(instrumentTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InstrumentType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<InstrumentType>(orCreateKotlinClass, syntax, instrumentType) { // from class: com.robinhood.copilot.proto.v1.InstrumentType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public InstrumentType fromValue(int value) {
                return InstrumentType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: InstrumentType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InstrumentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/copilot/proto/v1/InstrumentType;", "fromValue", "value", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InstrumentType fromValue(int value) {
            if (value == 0) {
                return InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return InstrumentType.STOCK;
            }
            if (value == 2) {
                return InstrumentType.CRYPTO;
            }
            if (value == 3) {
                return InstrumentType.ETF;
            }
            if (value != 4) {
                return null;
            }
            return InstrumentType.PORTFOLIO;
        }
    }

    public static InstrumentType valueOf(String str) {
        return (InstrumentType) Enum.valueOf(InstrumentType.class, str);
    }

    public static InstrumentType[] values() {
        return (InstrumentType[]) $VALUES.clone();
    }
}
