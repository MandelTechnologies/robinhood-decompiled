package com.robinhood.android.portfolio.positions.display;

import com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeBottomSheetFragment;
import com.robinhood.android.models.portfolio.PositionsDisplayOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsDisplayOptionsDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsDataState;", "", InstrumentDisplayTypeBottomSheetFragment.FRAGMENT_RESULT_KEY, "", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", "displayOptions", "Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions;", "isMcwCurrencySwitcherEnabled", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions;Ljava/lang/Boolean;)V", "getSelectedDisplayType", "()Ljava/lang/String;", "getDisplayOptions", "()Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions;Ljava/lang/Boolean;)Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsDataState;", "equals", "other", "hashCode", "", "toString", "lib-positions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PositionsDisplayOptionsDataState {
    public static final int $stable = 8;
    private final PositionsDisplayOptions displayOptions;
    private final Boolean isMcwCurrencySwitcherEnabled;
    private final String selectedDisplayType;

    public PositionsDisplayOptionsDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PositionsDisplayOptionsDataState copy$default(PositionsDisplayOptionsDataState positionsDisplayOptionsDataState, String str, PositionsDisplayOptions positionsDisplayOptions, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionsDisplayOptionsDataState.selectedDisplayType;
        }
        if ((i & 2) != 0) {
            positionsDisplayOptions = positionsDisplayOptionsDataState.displayOptions;
        }
        if ((i & 4) != 0) {
            bool = positionsDisplayOptionsDataState.isMcwCurrencySwitcherEnabled;
        }
        return positionsDisplayOptionsDataState.copy(str, positionsDisplayOptions, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSelectedDisplayType() {
        return this.selectedDisplayType;
    }

    /* renamed from: component2, reason: from getter */
    public final PositionsDisplayOptions getDisplayOptions() {
        return this.displayOptions;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsMcwCurrencySwitcherEnabled() {
        return this.isMcwCurrencySwitcherEnabled;
    }

    public final PositionsDisplayOptionsDataState copy(String selectedDisplayType, PositionsDisplayOptions displayOptions, Boolean isMcwCurrencySwitcherEnabled) {
        return new PositionsDisplayOptionsDataState(selectedDisplayType, displayOptions, isMcwCurrencySwitcherEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionsDisplayOptionsDataState)) {
            return false;
        }
        PositionsDisplayOptionsDataState positionsDisplayOptionsDataState = (PositionsDisplayOptionsDataState) other;
        return Intrinsics.areEqual(this.selectedDisplayType, positionsDisplayOptionsDataState.selectedDisplayType) && Intrinsics.areEqual(this.displayOptions, positionsDisplayOptionsDataState.displayOptions) && Intrinsics.areEqual(this.isMcwCurrencySwitcherEnabled, positionsDisplayOptionsDataState.isMcwCurrencySwitcherEnabled);
    }

    public int hashCode() {
        String str = this.selectedDisplayType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PositionsDisplayOptions positionsDisplayOptions = this.displayOptions;
        int iHashCode2 = (iHashCode + (positionsDisplayOptions == null ? 0 : positionsDisplayOptions.hashCode())) * 31;
        Boolean bool = this.isMcwCurrencySwitcherEnabled;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "PositionsDisplayOptionsDataState(selectedDisplayType=" + this.selectedDisplayType + ", displayOptions=" + this.displayOptions + ", isMcwCurrencySwitcherEnabled=" + this.isMcwCurrencySwitcherEnabled + ")";
    }

    public PositionsDisplayOptionsDataState(String str, PositionsDisplayOptions positionsDisplayOptions, Boolean bool) {
        this.selectedDisplayType = str;
        this.displayOptions = positionsDisplayOptions;
        this.isMcwCurrencySwitcherEnabled = bool;
    }

    public /* synthetic */ PositionsDisplayOptionsDataState(String str, PositionsDisplayOptions positionsDisplayOptions, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : positionsDisplayOptions, (i & 4) != 0 ? null : bool);
    }

    public final String getSelectedDisplayType() {
        return this.selectedDisplayType;
    }

    public final PositionsDisplayOptions getDisplayOptions() {
        return this.displayOptions;
    }

    public final Boolean isMcwCurrencySwitcherEnabled() {
        return this.isMcwCurrencySwitcherEnabled;
    }
}
