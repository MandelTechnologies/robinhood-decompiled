package com.robinhood.android.equitydetail.p123ui.leveltwo;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p355ui.Pricebook;
import com.robinhood.models.p355ui.UiPricebookPair;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: Level2ViewState.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001NB]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u0010H\u001a\u00020\u0010HÆ\u0003J_\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010J\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020>HÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010&\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0011\u0010(\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0014R\u0014\u00105\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0017R\u0013\u00107\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010;\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0015\u0010=\u001a\u0004\u0018\u00010>¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState;", "", "accountNumber", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "isAdtHours", "", "pricebook", "Lcom/robinhood/models/ui/Pricebook;", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "error", "Lcom/robinhood/udf/UiEvent;", "", "dayNightStyle", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/Instrument;ZLcom/robinhood/models/ui/Pricebook;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "()Z", "getPricebook", "()Lcom/robinhood/models/ui/Pricebook;", "getMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getError", "()Lcom/robinhood/udf/UiEvent;", "getDayNightStyle", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "state", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState$State;", "getState", "()Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState$State;", "loadingViewIsVisible", "getLoadingViewIsVisible", "contentViewIsVisible", "getContentViewIsVisible", "errorViewIsVisible", "getErrorViewIsVisible", "sortedPairs", "", "Lcom/robinhood/models/ui/UiPricebookPair;", "bestBid", "Lcom/robinhood/models/ui/Pricebook$Entry;", "getBestBid", "()Lcom/robinhood/models/ui/Pricebook$Entry;", "bestAsk", "getBestAsk", "toolbarTitle", "getToolbarTitle", "use24HMEmptyState", "getUse24HMEmptyState", "emptyTitle", "Lcom/robinhood/utils/resource/StringResource;", "getEmptyTitle", "()Lcom/robinhood/utils/resource/StringResource;", "emptyMessage", "getEmptyMessage", "errorImageResId", "", "getErrorImageResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "State", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Level2ViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final Pricebook.Entry bestAsk;
    private final Pricebook.Entry bestBid;
    private final boolean contentViewIsVisible;
    private final DayNightOverlay dayNightStyle;
    private final UiEvent<Throwable> error;
    private final Integer errorImageResId;
    private final boolean errorViewIsVisible;
    private final Instrument instrument;
    private final boolean isAdtHours;
    private final boolean loadingViewIsVisible;
    private final MarketHours marketHours;
    private final Pricebook pricebook;
    private final List<UiPricebookPair> sortedPairs;
    private final State state;
    private final String toolbarTitle;

    /* compiled from: Level2ViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DayNightOverlay.values().length];
            try {
                iArr2[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public Level2ViewState() {
        this(null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ Level2ViewState copy$default(Level2ViewState level2ViewState, String str, Instrument instrument, boolean z, Pricebook pricebook, MarketHours marketHours, UiEvent uiEvent, DayNightOverlay dayNightOverlay, int i, Object obj) {
        if ((i & 1) != 0) {
            str = level2ViewState.accountNumber;
        }
        if ((i & 2) != 0) {
            instrument = level2ViewState.instrument;
        }
        if ((i & 4) != 0) {
            z = level2ViewState.isAdtHours;
        }
        if ((i & 8) != 0) {
            pricebook = level2ViewState.pricebook;
        }
        if ((i & 16) != 0) {
            marketHours = level2ViewState.marketHours;
        }
        if ((i & 32) != 0) {
            uiEvent = level2ViewState.error;
        }
        if ((i & 64) != 0) {
            dayNightOverlay = level2ViewState.dayNightStyle;
        }
        UiEvent uiEvent2 = uiEvent;
        DayNightOverlay dayNightOverlay2 = dayNightOverlay;
        MarketHours marketHours2 = marketHours;
        boolean z2 = z;
        return level2ViewState.copy(str, instrument, z2, pricebook, marketHours2, uiEvent2, dayNightOverlay2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAdtHours() {
        return this.isAdtHours;
    }

    /* renamed from: component4, reason: from getter */
    public final Pricebook getPricebook() {
        return this.pricebook;
    }

    /* renamed from: component5, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final UiEvent<Throwable> component6() {
        return this.error;
    }

    /* renamed from: component7, reason: from getter */
    public final DayNightOverlay getDayNightStyle() {
        return this.dayNightStyle;
    }

    public final Level2ViewState copy(String accountNumber, Instrument instrument, boolean isAdtHours, Pricebook pricebook, MarketHours marketHours, UiEvent<Throwable> error, DayNightOverlay dayNightStyle) {
        Intrinsics.checkNotNullParameter(dayNightStyle, "dayNightStyle");
        return new Level2ViewState(accountNumber, instrument, isAdtHours, pricebook, marketHours, error, dayNightStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Level2ViewState)) {
            return false;
        }
        Level2ViewState level2ViewState = (Level2ViewState) other;
        return Intrinsics.areEqual(this.accountNumber, level2ViewState.accountNumber) && Intrinsics.areEqual(this.instrument, level2ViewState.instrument) && this.isAdtHours == level2ViewState.isAdtHours && Intrinsics.areEqual(this.pricebook, level2ViewState.pricebook) && Intrinsics.areEqual(this.marketHours, level2ViewState.marketHours) && Intrinsics.areEqual(this.error, level2ViewState.error) && this.dayNightStyle == level2ViewState.dayNightStyle;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (((iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31) + Boolean.hashCode(this.isAdtHours)) * 31;
        Pricebook pricebook = this.pricebook;
        int iHashCode3 = (iHashCode2 + (pricebook == null ? 0 : pricebook.hashCode())) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode4 = (iHashCode3 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        return ((iHashCode4 + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + this.dayNightStyle.hashCode();
    }

    public String toString() {
        return "Level2ViewState(accountNumber=" + this.accountNumber + ", instrument=" + this.instrument + ", isAdtHours=" + this.isAdtHours + ", pricebook=" + this.pricebook + ", marketHours=" + this.marketHours + ", error=" + this.error + ", dayNightStyle=" + this.dayNightStyle + ")";
    }

    public Level2ViewState(String str, Instrument instrument, boolean z, Pricebook pricebook, MarketHours marketHours, UiEvent<Throwable> uiEvent, DayNightOverlay dayNightStyle) {
        State state;
        boolean z2;
        boolean z3;
        int i;
        Intrinsics.checkNotNullParameter(dayNightStyle, "dayNightStyle");
        this.accountNumber = str;
        this.instrument = instrument;
        this.isAdtHours = z;
        this.pricebook = pricebook;
        this.marketHours = marketHours;
        this.error = uiEvent;
        this.dayNightStyle = dayNightStyle;
        if (pricebook == null && uiEvent == null) {
            state = State.LOADING;
        } else if (pricebook != null && pricebook.hasEntries()) {
            state = State.SUCCESS;
        } else if (pricebook != null && !pricebook.hasEntries()) {
            state = State.EMPTY;
        } else {
            if (uiEvent == null || uiEvent.getConsumed()) {
                throw new IllegalStateException(("Unknown state: " + this).toString());
            }
            state = State.ERROR;
        }
        this.state = state;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[state.ordinal()];
        boolean z4 = false;
        if (i2 == 1) {
            z2 = true;
        } else {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            z2 = false;
        }
        this.loadingViewIsVisible = z2;
        int i3 = iArr[state.ordinal()];
        if (i3 == 1) {
            z3 = false;
        } else if (i3 != 2) {
            if (i3 != 3 && i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = false;
        } else {
            z3 = true;
        }
        this.contentViewIsVisible = z3;
        int i4 = iArr[state.ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3 && i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            z4 = true;
        }
        this.errorViewIsVisible = z4;
        Integer numValueOf = null;
        List<UiPricebookPair> sortedPairs = pricebook != null ? pricebook.getSortedPairs() : null;
        sortedPairs = sortedPairs == null ? CollectionsKt.emptyList() : sortedPairs;
        this.sortedPairs = sortedPairs;
        UiPricebookPair uiPricebookPair = (UiPricebookPair) CollectionsKt.firstOrNull((List) sortedPairs);
        this.bestBid = uiPricebookPair != null ? uiPricebookPair.getBid() : null;
        UiPricebookPair uiPricebookPair2 = (UiPricebookPair) CollectionsKt.firstOrNull((List) sortedPairs);
        this.bestAsk = uiPricebookPair2 != null ? uiPricebookPair2.getAsk() : null;
        this.toolbarTitle = instrument != null ? instrument.getDisplaySymbol() : null;
        int i5 = iArr[state.ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 == 3) {
                int i6 = WhenMappings.$EnumSwitchMapping$1[dayNightStyle.ordinal()];
                if (i6 == 1) {
                    i = C15314R.drawable.order_book_empty_day;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C15314R.drawable.order_book_empty_night;
                }
                numValueOf = Integer.valueOf(i);
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                numValueOf = Integer.valueOf(C15314R.drawable.svg_ic_order_book_error);
            }
        }
        this.errorImageResId = numValueOf;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final boolean isAdtHours() {
        return this.isAdtHours;
    }

    public final Pricebook getPricebook() {
        return this.pricebook;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public /* synthetic */ Level2ViewState(String str, Instrument instrument, boolean z, Pricebook pricebook, MarketHours marketHours, UiEvent uiEvent, DayNightOverlay dayNightOverlay, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : instrument, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : pricebook, (i & 16) != 0 ? null : marketHours, (i & 32) != 0 ? null : uiEvent, (i & 64) != 0 ? DayNightOverlay.DAY : dayNightOverlay);
    }

    public final DayNightOverlay getDayNightStyle() {
        return this.dayNightStyle;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Level2ViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState$State;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "SUCCESS", "EMPTY", "ERROR", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State LOADING = new State("LOADING", 0);
        public static final State SUCCESS = new State("SUCCESS", 1);
        public static final State EMPTY = new State("EMPTY", 2);
        public static final State ERROR = new State("ERROR", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{LOADING, SUCCESS, EMPTY, ERROR};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public final State getState() {
        return this.state;
    }

    public final boolean getLoadingViewIsVisible() {
        return this.loadingViewIsVisible;
    }

    public final boolean getContentViewIsVisible() {
        return this.contentViewIsVisible;
    }

    public final boolean getErrorViewIsVisible() {
        return this.errorViewIsVisible;
    }

    public final Pricebook.Entry getBestBid() {
        return this.bestBid;
    }

    public final Pricebook.Entry getBestAsk() {
        return this.bestAsk;
    }

    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    private final boolean getUse24HMEmptyState() {
        if (!this.isAdtHours) {
            return false;
        }
        Instrument instrument = this.instrument;
        return (instrument != null ? instrument.getAllDayTradability() : null) == Tradability.TRADABLE;
    }

    public final StringResource getEmptyTitle() {
        Pricebook pricebook = this.pricebook;
        if (pricebook == null || pricebook.hasEntries()) {
            return null;
        }
        if (getUse24HMEmptyState()) {
            return StringResource.INSTANCE.invoke(C15314R.string.level_2_order_book_empty_title_24hm, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C15314R.string.level_2_order_book_empty_title, new Object[0]);
    }

    public final StringResource getEmptyMessage() {
        Instrument instrument;
        String displaySymbol;
        Pricebook pricebook = this.pricebook;
        if (pricebook == null || pricebook.hasEntries() || (instrument = this.instrument) == null || (displaySymbol = instrument.getDisplaySymbol()) == null) {
            return null;
        }
        if (getUse24HMEmptyState()) {
            return StringResource.INSTANCE.invoke(C15314R.string.level_2_order_book_empty_detail_24hm, new Object[0]);
        }
        MarketHours marketHours = this.marketHours;
        if (marketHours != null) {
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            if (marketHours.isOpenExtended(instantNow)) {
                return StringResource.INSTANCE.invoke(C15314R.string.level_2_order_book_empty_detail, displaySymbol);
            }
        }
        return StringResource.INSTANCE.invoke(C15314R.string.level_2_order_book_empty_detail_afterhours, new Object[0]);
    }

    public final Integer getErrorImageResId() {
        return this.errorImageResId;
    }
}
