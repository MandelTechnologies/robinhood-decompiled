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
/* compiled from: GoldUpgradeType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GoldUpgradeType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "JOIN", "REJOIN", "DEFAULT_OPT_IN_UPGRADE", "GOLD_UPGRADE", "RETIREMENT_GOLD", "DOI_GOLD_FREE_TRIAL", "FLEX_GOLD_FREE_TRIAL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class GoldUpgradeType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GoldUpgradeType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<GoldUpgradeType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final GoldUpgradeType DEFAULT_OPT_IN_UPGRADE;
    public static final GoldUpgradeType DOI_GOLD_FREE_TRIAL;
    public static final GoldUpgradeType FLEX_GOLD_FREE_TRIAL;
    public static final GoldUpgradeType GOLD_UPGRADE;
    public static final GoldUpgradeType JOIN;
    public static final GoldUpgradeType REJOIN;
    public static final GoldUpgradeType RETIREMENT_GOLD;
    private final int value;

    private static final /* synthetic */ GoldUpgradeType[] $values() {
        return new GoldUpgradeType[]{JOIN, REJOIN, DEFAULT_OPT_IN_UPGRADE, GOLD_UPGRADE, RETIREMENT_GOLD, DOI_GOLD_FREE_TRIAL, FLEX_GOLD_FREE_TRIAL};
    }

    @JvmStatic
    public static final GoldUpgradeType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<GoldUpgradeType> getEntries() {
        return $ENTRIES;
    }

    private GoldUpgradeType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final GoldUpgradeType goldUpgradeType = new GoldUpgradeType("JOIN", 0, 0);
        JOIN = goldUpgradeType;
        REJOIN = new GoldUpgradeType("REJOIN", 1, 1);
        DEFAULT_OPT_IN_UPGRADE = new GoldUpgradeType("DEFAULT_OPT_IN_UPGRADE", 2, 2);
        GOLD_UPGRADE = new GoldUpgradeType("GOLD_UPGRADE", 3, 3);
        RETIREMENT_GOLD = new GoldUpgradeType("RETIREMENT_GOLD", 4, 4);
        DOI_GOLD_FREE_TRIAL = new GoldUpgradeType("DOI_GOLD_FREE_TRIAL", 5, 5);
        FLEX_GOLD_FREE_TRIAL = new GoldUpgradeType("FLEX_GOLD_FREE_TRIAL", 6, 6);
        GoldUpgradeType[] goldUpgradeTypeArr$values = $values();
        $VALUES = goldUpgradeTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(goldUpgradeTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldUpgradeType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<GoldUpgradeType>(orCreateKotlinClass, syntax, goldUpgradeType) { // from class: com.robinhood.rosetta.eventlogging.GoldUpgradeType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public GoldUpgradeType fromValue(int value) {
                return GoldUpgradeType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: GoldUpgradeType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GoldUpgradeType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/GoldUpgradeType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldUpgradeType fromValue(int value) {
            switch (value) {
                case 0:
                    return GoldUpgradeType.JOIN;
                case 1:
                    return GoldUpgradeType.REJOIN;
                case 2:
                    return GoldUpgradeType.DEFAULT_OPT_IN_UPGRADE;
                case 3:
                    return GoldUpgradeType.GOLD_UPGRADE;
                case 4:
                    return GoldUpgradeType.RETIREMENT_GOLD;
                case 5:
                    return GoldUpgradeType.DOI_GOLD_FREE_TRIAL;
                case 6:
                    return GoldUpgradeType.FLEX_GOLD_FREE_TRIAL;
                default:
                    return null;
            }
        }
    }

    public static GoldUpgradeType valueOf(String str) {
        return (GoldUpgradeType) Enum.valueOf(GoldUpgradeType.class, str);
    }

    public static GoldUpgradeType[] values() {
        return (GoldUpgradeType[]) $VALUES.clone();
    }
}
