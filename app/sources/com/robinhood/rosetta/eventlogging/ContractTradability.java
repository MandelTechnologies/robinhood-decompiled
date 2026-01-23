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
/* compiled from: ContractTradability.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ContractTradability;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRADABILITY_UNSPECIFIED", "TRADABLE", "UNTRADABLE", "PCO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ContractTradability implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContractTradability[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ContractTradability> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ContractTradability PCO;
    public static final ContractTradability TRADABILITY_UNSPECIFIED;
    public static final ContractTradability TRADABLE;
    public static final ContractTradability UNTRADABLE;
    private final int value;

    private static final /* synthetic */ ContractTradability[] $values() {
        return new ContractTradability[]{TRADABILITY_UNSPECIFIED, TRADABLE, UNTRADABLE, PCO};
    }

    @JvmStatic
    public static final ContractTradability fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ContractTradability> getEntries() {
        return $ENTRIES;
    }

    private ContractTradability(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ContractTradability contractTradability = new ContractTradability("TRADABILITY_UNSPECIFIED", 0, 0);
        TRADABILITY_UNSPECIFIED = contractTradability;
        TRADABLE = new ContractTradability("TRADABLE", 1, 1);
        UNTRADABLE = new ContractTradability("UNTRADABLE", 2, 2);
        PCO = new ContractTradability("PCO", 3, 3);
        ContractTradability[] contractTradabilityArr$values = $values();
        $VALUES = contractTradabilityArr$values;
        $ENTRIES = EnumEntries2.enumEntries(contractTradabilityArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractTradability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ContractTradability>(orCreateKotlinClass, syntax, contractTradability) { // from class: com.robinhood.rosetta.eventlogging.ContractTradability$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ContractTradability fromValue(int value) {
                return ContractTradability.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ContractTradability.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ContractTradability$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ContractTradability;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ContractTradability fromValue(int value) {
            if (value == 0) {
                return ContractTradability.TRADABILITY_UNSPECIFIED;
            }
            if (value == 1) {
                return ContractTradability.TRADABLE;
            }
            if (value == 2) {
                return ContractTradability.UNTRADABLE;
            }
            if (value != 3) {
                return null;
            }
            return ContractTradability.PCO;
        }
    }

    public static ContractTradability valueOf(String str) {
        return (ContractTradability) Enum.valueOf(ContractTradability.class, str);
    }

    public static ContractTradability[] values() {
        return (ContractTradability[]) $VALUES.clone();
    }
}
