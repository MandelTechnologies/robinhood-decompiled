package com.robinhood.prediction_markets.proto.p361v1.idl;

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
/* compiled from: ArsenalEventState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ARSENAL_EVENT_STATE_UNSPECIFIED", "ARSENAL_EVENT_STATE_ACTIVE", "ARSENAL_EVENT_STATE_INACTIVE", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ArsenalEventState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ArsenalEventState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ArsenalEventState> ADAPTER;
    public static final ArsenalEventState ARSENAL_EVENT_STATE_ACTIVE;
    public static final ArsenalEventState ARSENAL_EVENT_STATE_INACTIVE;
    public static final ArsenalEventState ARSENAL_EVENT_STATE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ ArsenalEventState[] $values() {
        return new ArsenalEventState[]{ARSENAL_EVENT_STATE_UNSPECIFIED, ARSENAL_EVENT_STATE_ACTIVE, ARSENAL_EVENT_STATE_INACTIVE};
    }

    @JvmStatic
    public static final ArsenalEventState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ArsenalEventState> getEntries() {
        return $ENTRIES;
    }

    private ArsenalEventState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ArsenalEventState arsenalEventState = new ArsenalEventState("ARSENAL_EVENT_STATE_UNSPECIFIED", 0, 0);
        ARSENAL_EVENT_STATE_UNSPECIFIED = arsenalEventState;
        ARSENAL_EVENT_STATE_ACTIVE = new ArsenalEventState("ARSENAL_EVENT_STATE_ACTIVE", 1, 1);
        ARSENAL_EVENT_STATE_INACTIVE = new ArsenalEventState("ARSENAL_EVENT_STATE_INACTIVE", 2, 2);
        ArsenalEventState[] arsenalEventStateArr$values = $values();
        $VALUES = arsenalEventStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(arsenalEventStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ArsenalEventState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ArsenalEventState>(orCreateKotlinClass, syntax, arsenalEventState) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ArsenalEventState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ArsenalEventState fromValue(int value) {
                return ArsenalEventState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ArsenalEventState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventState;", "fromValue", "value", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ArsenalEventState fromValue(int value) {
            if (value == 0) {
                return ArsenalEventState.ARSENAL_EVENT_STATE_UNSPECIFIED;
            }
            if (value == 1) {
                return ArsenalEventState.ARSENAL_EVENT_STATE_ACTIVE;
            }
            if (value != 2) {
                return null;
            }
            return ArsenalEventState.ARSENAL_EVENT_STATE_INACTIVE;
        }
    }

    public static ArsenalEventState valueOf(String str) {
        return (ArsenalEventState) Enum.valueOf(ArsenalEventState.class, str);
    }

    public static ArsenalEventState[] values() {
        return (ArsenalEventState[]) $VALUES.clone();
    }
}
