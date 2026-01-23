package com.robinhood.android.trade.options;

import com.robinhood.models.p320db.OrderMarketHours;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderTradingSessionRowComposeView.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionRowState;", "", "title", "", "tradingSessionText", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/db/OrderMarketHours;Z)V", "getTitle", "()Ljava/lang/String;", "getTradingSessionText", "getTradingSession", "()Lcom/robinhood/models/db/OrderMarketHours;", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderTradingSessionRowState {
    public static final int $stable = 0;
    private final boolean enabled;
    private final String title;
    private final OrderMarketHours tradingSession;
    private final String tradingSessionText;

    public static /* synthetic */ OptionOrderTradingSessionRowState copy$default(OptionOrderTradingSessionRowState optionOrderTradingSessionRowState, String str, String str2, OrderMarketHours orderMarketHours, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOrderTradingSessionRowState.title;
        }
        if ((i & 2) != 0) {
            str2 = optionOrderTradingSessionRowState.tradingSessionText;
        }
        if ((i & 4) != 0) {
            orderMarketHours = optionOrderTradingSessionRowState.tradingSession;
        }
        if ((i & 8) != 0) {
            z = optionOrderTradingSessionRowState.enabled;
        }
        return optionOrderTradingSessionRowState.copy(str, str2, orderMarketHours, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTradingSessionText() {
        return this.tradingSessionText;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderMarketHours getTradingSession() {
        return this.tradingSession;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final OptionOrderTradingSessionRowState copy(String title, String tradingSessionText, OrderMarketHours tradingSession, boolean enabled) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tradingSessionText, "tradingSessionText");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        return new OptionOrderTradingSessionRowState(title, tradingSessionText, tradingSession, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderTradingSessionRowState)) {
            return false;
        }
        OptionOrderTradingSessionRowState optionOrderTradingSessionRowState = (OptionOrderTradingSessionRowState) other;
        return Intrinsics.areEqual(this.title, optionOrderTradingSessionRowState.title) && Intrinsics.areEqual(this.tradingSessionText, optionOrderTradingSessionRowState.tradingSessionText) && this.tradingSession == optionOrderTradingSessionRowState.tradingSession && this.enabled == optionOrderTradingSessionRowState.enabled;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.tradingSessionText.hashCode()) * 31) + this.tradingSession.hashCode()) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "OptionOrderTradingSessionRowState(title=" + this.title + ", tradingSessionText=" + this.tradingSessionText + ", tradingSession=" + this.tradingSession + ", enabled=" + this.enabled + ")";
    }

    public OptionOrderTradingSessionRowState(String title, String tradingSessionText, OrderMarketHours tradingSession, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tradingSessionText, "tradingSessionText");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        this.title = title;
        this.tradingSessionText = tradingSessionText;
        this.tradingSession = tradingSession;
        this.enabled = z;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTradingSessionText() {
        return this.tradingSessionText;
    }

    public final OrderMarketHours getTradingSession() {
        return this.tradingSession;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
