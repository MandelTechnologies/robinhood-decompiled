package com.robinhood.cbc.service.tax_lot.p283v1;

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
/* compiled from: DisposalMethod.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "METHOD_UNSPECIFIED", "FIFO", "CUSTOM", "LIFO", "LOW_COST", "HIGH_COST", "Companion", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class DisposalMethod implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisposalMethod[] $VALUES;

    @JvmField
    public static final ProtoAdapter<DisposalMethod> ADAPTER;
    public static final DisposalMethod CUSTOM;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DisposalMethod FIFO;
    public static final DisposalMethod HIGH_COST;
    public static final DisposalMethod LIFO;
    public static final DisposalMethod LOW_COST;
    public static final DisposalMethod METHOD_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ DisposalMethod[] $values() {
        return new DisposalMethod[]{METHOD_UNSPECIFIED, FIFO, CUSTOM, LIFO, LOW_COST, HIGH_COST};
    }

    @JvmStatic
    public static final DisposalMethod fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<DisposalMethod> getEntries() {
        return $ENTRIES;
    }

    private DisposalMethod(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final DisposalMethod disposalMethod = new DisposalMethod("METHOD_UNSPECIFIED", 0, 0);
        METHOD_UNSPECIFIED = disposalMethod;
        FIFO = new DisposalMethod("FIFO", 1, 1);
        CUSTOM = new DisposalMethod("CUSTOM", 2, 2);
        LIFO = new DisposalMethod("LIFO", 3, 3);
        LOW_COST = new DisposalMethod("LOW_COST", 4, 4);
        HIGH_COST = new DisposalMethod("HIGH_COST", 5, 5);
        DisposalMethod[] disposalMethodArr$values = $values();
        $VALUES = disposalMethodArr$values;
        $ENTRIES = EnumEntries2.enumEntries(disposalMethodArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DisposalMethod.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<DisposalMethod>(orCreateKotlinClass, syntax, disposalMethod) { // from class: com.robinhood.cbc.service.tax_lot.v1.DisposalMethod$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public DisposalMethod fromValue(int value) {
                return DisposalMethod.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: DisposalMethod.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;", "fromValue", "value", "", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DisposalMethod fromValue(int value) {
            if (value == 0) {
                return DisposalMethod.METHOD_UNSPECIFIED;
            }
            if (value == 1) {
                return DisposalMethod.FIFO;
            }
            if (value == 2) {
                return DisposalMethod.CUSTOM;
            }
            if (value == 3) {
                return DisposalMethod.LIFO;
            }
            if (value == 4) {
                return DisposalMethod.LOW_COST;
            }
            if (value != 5) {
                return null;
            }
            return DisposalMethod.HIGH_COST;
        }
    }

    public static DisposalMethod valueOf(String str) {
        return (DisposalMethod) Enum.valueOf(DisposalMethod.class, str);
    }

    public static DisposalMethod[] values() {
        return (DisposalMethod[]) $VALUES.clone();
    }
}
