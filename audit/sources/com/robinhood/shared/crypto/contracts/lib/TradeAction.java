package com.robinhood.shared.crypto.contracts.lib;

import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TradeAction.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/lib/TradeAction;", "", "queryParamString", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "BUY", "SELL", "Companion", "lib-contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class TradeAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TradeAction[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String queryParamString;
    public static final TradeAction BUY = new TradeAction("BUY", 0, "buy");
    public static final TradeAction SELL = new TradeAction("SELL", 1, "sell");

    private static final /* synthetic */ TradeAction[] $values() {
        return new TradeAction[]{BUY, SELL};
    }

    public static EnumEntries<TradeAction> getEntries() {
        return $ENTRIES;
    }

    private TradeAction(String str, int i, String str2) {
        this.queryParamString = str2;
    }

    static {
        TradeAction[] tradeActionArr$values = $values();
        $VALUES = tradeActionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tradeActionArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: TradeAction.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/lib/TradeAction$Companion;", "", "<init>", "()V", "fromQueryParam", "Lcom/robinhood/shared/crypto/contracts/lib/TradeAction;", "queryParam", "", "lib-contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TradeAction fromQueryParam(String queryParam) {
            if (queryParam == null) {
                return null;
            }
            TradeAction tradeAction = TradeAction.BUY;
            if (Intrinsics.areEqual(queryParam, tradeAction.queryParamString)) {
                return tradeAction;
            }
            TradeAction tradeAction2 = TradeAction.SELL;
            if (Intrinsics.areEqual(queryParam, tradeAction2.queryParamString)) {
                return tradeAction2;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(queryParam);
            throw new ExceptionsH();
        }
    }

    public static TradeAction valueOf(String str) {
        return (TradeAction) Enum.valueOf(TradeAction.class, str);
    }

    public static TradeAction[] values() {
        return (TradeAction[]) $VALUES.clone();
    }
}
