package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/TradeButtonUiState;", "", "enabled", "", "optionOrderIntentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(ZLcom/robinhood/android/navigation/keys/IntentKey;)V", "getEnabled", "()Z", "getOptionOrderIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TradeButtonUiState {
    public static final int $stable = 8;
    private final boolean enabled;
    private final IntentKey optionOrderIntentKey;

    /* JADX WARN: Multi-variable type inference failed */
    public TradeButtonUiState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TradeButtonUiState copy$default(TradeButtonUiState tradeButtonUiState, boolean z, IntentKey intentKey, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tradeButtonUiState.enabled;
        }
        if ((i & 2) != 0) {
            intentKey = tradeButtonUiState.optionOrderIntentKey;
        }
        return tradeButtonUiState.copy(z, intentKey);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final IntentKey getOptionOrderIntentKey() {
        return this.optionOrderIntentKey;
    }

    public final TradeButtonUiState copy(boolean enabled, IntentKey optionOrderIntentKey) {
        return new TradeButtonUiState(enabled, optionOrderIntentKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeButtonUiState)) {
            return false;
        }
        TradeButtonUiState tradeButtonUiState = (TradeButtonUiState) other;
        return this.enabled == tradeButtonUiState.enabled && Intrinsics.areEqual(this.optionOrderIntentKey, tradeButtonUiState.optionOrderIntentKey);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        IntentKey intentKey = this.optionOrderIntentKey;
        return iHashCode + (intentKey == null ? 0 : intentKey.hashCode());
    }

    public String toString() {
        return "TradeButtonUiState(enabled=" + this.enabled + ", optionOrderIntentKey=" + this.optionOrderIntentKey + ")";
    }

    public TradeButtonUiState(boolean z, IntentKey intentKey) {
        this.enabled = z;
        this.optionOrderIntentKey = intentKey;
    }

    public /* synthetic */ TradeButtonUiState(boolean z, IntentKey intentKey, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : intentKey);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final IntentKey getOptionOrderIntentKey() {
        return this.optionOrderIntentKey;
    }
}
