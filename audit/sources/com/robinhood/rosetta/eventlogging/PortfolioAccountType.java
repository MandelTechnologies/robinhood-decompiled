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
/* compiled from: PortfolioAccountType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INDIVIDUAL", "RETIREMENT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PortfolioAccountType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PortfolioAccountType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<PortfolioAccountType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PortfolioAccountType INDIVIDUAL;
    public static final PortfolioAccountType RETIREMENT;
    private final int value;

    private static final /* synthetic */ PortfolioAccountType[] $values() {
        return new PortfolioAccountType[]{INDIVIDUAL, RETIREMENT};
    }

    @JvmStatic
    public static final PortfolioAccountType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<PortfolioAccountType> getEntries() {
        return $ENTRIES;
    }

    private PortfolioAccountType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final PortfolioAccountType portfolioAccountType = new PortfolioAccountType("INDIVIDUAL", 0, 0);
        INDIVIDUAL = portfolioAccountType;
        RETIREMENT = new PortfolioAccountType("RETIREMENT", 1, 1);
        PortfolioAccountType[] portfolioAccountTypeArr$values = $values();
        $VALUES = portfolioAccountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(portfolioAccountTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioAccountType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<PortfolioAccountType>(orCreateKotlinClass, syntax, portfolioAccountType) { // from class: com.robinhood.rosetta.eventlogging.PortfolioAccountType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public PortfolioAccountType fromValue(int value) {
                return PortfolioAccountType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: PortfolioAccountType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioAccountType fromValue(int value) {
            if (value == 0) {
                return PortfolioAccountType.INDIVIDUAL;
            }
            if (value != 1) {
                return null;
            }
            return PortfolioAccountType.RETIREMENT;
        }
    }

    public static PortfolioAccountType valueOf(String str) {
        return (PortfolioAccountType) Enum.valueOf(PortfolioAccountType.class, str);
    }

    public static PortfolioAccountType[] values() {
        return (PortfolioAccountType[]) $VALUES.clone();
    }
}
