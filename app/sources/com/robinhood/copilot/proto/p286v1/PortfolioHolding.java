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
/* compiled from: PortfolioHolding.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioHolding;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PORTFOLIO_HOLDING_UNSPECIFIED", "PORTFOLIO_HOLDING_EQUITIES", "PORTFOLIO_HOLDING_CRYPTO", "PORTFOLIO_HOLDING_OPTIONS", "PORTFOLIO_HOLDING_EVENT_CONTRACTS", "PORTFOLIO_HOLDING_FUTURES", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PortfolioHolding implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PortfolioHolding[] $VALUES;

    @JvmField
    public static final ProtoAdapter<PortfolioHolding> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PortfolioHolding PORTFOLIO_HOLDING_CRYPTO;
    public static final PortfolioHolding PORTFOLIO_HOLDING_EQUITIES;
    public static final PortfolioHolding PORTFOLIO_HOLDING_EVENT_CONTRACTS;
    public static final PortfolioHolding PORTFOLIO_HOLDING_FUTURES;
    public static final PortfolioHolding PORTFOLIO_HOLDING_OPTIONS;
    public static final PortfolioHolding PORTFOLIO_HOLDING_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ PortfolioHolding[] $values() {
        return new PortfolioHolding[]{PORTFOLIO_HOLDING_UNSPECIFIED, PORTFOLIO_HOLDING_EQUITIES, PORTFOLIO_HOLDING_CRYPTO, PORTFOLIO_HOLDING_OPTIONS, PORTFOLIO_HOLDING_EVENT_CONTRACTS, PORTFOLIO_HOLDING_FUTURES};
    }

    @JvmStatic
    public static final PortfolioHolding fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<PortfolioHolding> getEntries() {
        return $ENTRIES;
    }

    private PortfolioHolding(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final PortfolioHolding portfolioHolding = new PortfolioHolding("PORTFOLIO_HOLDING_UNSPECIFIED", 0, 0);
        PORTFOLIO_HOLDING_UNSPECIFIED = portfolioHolding;
        PORTFOLIO_HOLDING_EQUITIES = new PortfolioHolding("PORTFOLIO_HOLDING_EQUITIES", 1, 1);
        PORTFOLIO_HOLDING_CRYPTO = new PortfolioHolding("PORTFOLIO_HOLDING_CRYPTO", 2, 2);
        PORTFOLIO_HOLDING_OPTIONS = new PortfolioHolding("PORTFOLIO_HOLDING_OPTIONS", 3, 3);
        PORTFOLIO_HOLDING_EVENT_CONTRACTS = new PortfolioHolding("PORTFOLIO_HOLDING_EVENT_CONTRACTS", 4, 4);
        PORTFOLIO_HOLDING_FUTURES = new PortfolioHolding("PORTFOLIO_HOLDING_FUTURES", 5, 5);
        PortfolioHolding[] portfolioHoldingArr$values = $values();
        $VALUES = portfolioHoldingArr$values;
        $ENTRIES = EnumEntries2.enumEntries(portfolioHoldingArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioHolding.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<PortfolioHolding>(orCreateKotlinClass, syntax, portfolioHolding) { // from class: com.robinhood.copilot.proto.v1.PortfolioHolding$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public PortfolioHolding fromValue(int value) {
                return PortfolioHolding.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: PortfolioHolding.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioHolding$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/copilot/proto/v1/PortfolioHolding;", "fromValue", "value", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioHolding fromValue(int value) {
            if (value == 0) {
                return PortfolioHolding.PORTFOLIO_HOLDING_UNSPECIFIED;
            }
            if (value == 1) {
                return PortfolioHolding.PORTFOLIO_HOLDING_EQUITIES;
            }
            if (value == 2) {
                return PortfolioHolding.PORTFOLIO_HOLDING_CRYPTO;
            }
            if (value == 3) {
                return PortfolioHolding.PORTFOLIO_HOLDING_OPTIONS;
            }
            if (value == 4) {
                return PortfolioHolding.PORTFOLIO_HOLDING_EVENT_CONTRACTS;
            }
            if (value != 5) {
                return null;
            }
            return PortfolioHolding.PORTFOLIO_HOLDING_FUTURES;
        }
    }

    public static PortfolioHolding valueOf(String str) {
        return (PortfolioHolding) Enum.valueOf(PortfolioHolding.class, str);
    }

    public static PortfolioHolding[] values() {
        return (PortfolioHolding[]) $VALUES.clone();
    }
}
