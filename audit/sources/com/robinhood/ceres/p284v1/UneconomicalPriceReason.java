package com.robinhood.ceres.p284v1;

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
/* compiled from: UneconomicalPriceReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/ceres/v1/UneconomicalPriceReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNECONOMICAL_PRICE_REASON_UNSPECIFIED", "UNECONOMICAL_PRICE_REASON_OPENING_PRICE_TOO_HIGH", "UNECONOMICAL_PRICE_REASON_CLOSING_PRICE_TOO_LOW", "UNECONOMICAL_PRICE_REASON_OPENING_PRICE_BREAKEVEN", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class UneconomicalPriceReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UneconomicalPriceReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<UneconomicalPriceReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final UneconomicalPriceReason UNECONOMICAL_PRICE_REASON_CLOSING_PRICE_TOO_LOW;
    public static final UneconomicalPriceReason UNECONOMICAL_PRICE_REASON_OPENING_PRICE_BREAKEVEN;
    public static final UneconomicalPriceReason UNECONOMICAL_PRICE_REASON_OPENING_PRICE_TOO_HIGH;
    public static final UneconomicalPriceReason UNECONOMICAL_PRICE_REASON_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ UneconomicalPriceReason[] $values() {
        return new UneconomicalPriceReason[]{UNECONOMICAL_PRICE_REASON_UNSPECIFIED, UNECONOMICAL_PRICE_REASON_OPENING_PRICE_TOO_HIGH, UNECONOMICAL_PRICE_REASON_CLOSING_PRICE_TOO_LOW, UNECONOMICAL_PRICE_REASON_OPENING_PRICE_BREAKEVEN};
    }

    @JvmStatic
    public static final UneconomicalPriceReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<UneconomicalPriceReason> getEntries() {
        return $ENTRIES;
    }

    private UneconomicalPriceReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final UneconomicalPriceReason uneconomicalPriceReason = new UneconomicalPriceReason("UNECONOMICAL_PRICE_REASON_UNSPECIFIED", 0, 0);
        UNECONOMICAL_PRICE_REASON_UNSPECIFIED = uneconomicalPriceReason;
        UNECONOMICAL_PRICE_REASON_OPENING_PRICE_TOO_HIGH = new UneconomicalPriceReason("UNECONOMICAL_PRICE_REASON_OPENING_PRICE_TOO_HIGH", 1, 1);
        UNECONOMICAL_PRICE_REASON_CLOSING_PRICE_TOO_LOW = new UneconomicalPriceReason("UNECONOMICAL_PRICE_REASON_CLOSING_PRICE_TOO_LOW", 2, 2);
        UNECONOMICAL_PRICE_REASON_OPENING_PRICE_BREAKEVEN = new UneconomicalPriceReason("UNECONOMICAL_PRICE_REASON_OPENING_PRICE_BREAKEVEN", 3, 3);
        UneconomicalPriceReason[] uneconomicalPriceReasonArr$values = $values();
        $VALUES = uneconomicalPriceReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(uneconomicalPriceReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UneconomicalPriceReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<UneconomicalPriceReason>(orCreateKotlinClass, syntax, uneconomicalPriceReason) { // from class: com.robinhood.ceres.v1.UneconomicalPriceReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public UneconomicalPriceReason fromValue(int value) {
                return UneconomicalPriceReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: UneconomicalPriceReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/UneconomicalPriceReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/UneconomicalPriceReason;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UneconomicalPriceReason fromValue(int value) {
            if (value == 0) {
                return UneconomicalPriceReason.UNECONOMICAL_PRICE_REASON_UNSPECIFIED;
            }
            if (value == 1) {
                return UneconomicalPriceReason.UNECONOMICAL_PRICE_REASON_OPENING_PRICE_TOO_HIGH;
            }
            if (value == 2) {
                return UneconomicalPriceReason.UNECONOMICAL_PRICE_REASON_CLOSING_PRICE_TOO_LOW;
            }
            if (value != 3) {
                return null;
            }
            return UneconomicalPriceReason.UNECONOMICAL_PRICE_REASON_OPENING_PRICE_BREAKEVEN;
        }
    }

    public static UneconomicalPriceReason valueOf(String str) {
        return (UneconomicalPriceReason) Enum.valueOf(UneconomicalPriceReason.class, str);
    }

    public static UneconomicalPriceReason[] values() {
        return (UneconomicalPriceReason[]) $VALUES.clone();
    }
}
