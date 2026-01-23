package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketMatchState;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.singular.sdk.internal.Constants;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: BracketMatchOverviewCard.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/OverviewCardPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/futures/eventbrackets/ui/OverviewCardPreviewParameterProvider$Params;", "<init>", "()V", "seed1", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;", "getSeed1", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;", "seed2", "getSeed2", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Params", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final class OverviewCardPreviewParameterProvider implements PreviewParameterProvider<Params> {
    private final BracketGameSeedData seed1 = new BracketGameSeedData(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION, "San Diego Stdsafsdfsdfasd", "7%", "#ff2b00", "#ff2b00", Constants.SdidMigrationStatusCodes.ALREADY_SDID);
    private final BracketGameSeedData seed2 = new BracketGameSeedData("12", "UAB", "93%", "#00c805", "#00c805", "22");

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    /* compiled from: BracketMatchOverviewCard.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/OverviewCardPreviewParameterProvider$Params;", "", "state", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState;", "seed1", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;", "seed2", "gameStateDisplay", "", "hasPosition", "", "pnlAmount", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState;Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;Ljava/lang/String;ZLcom/robinhood/models/util/Money;)V", "getState", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState;", "getSeed1", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;", "getSeed2", "getGameStateDisplay", "()Ljava/lang/String;", "getHasPosition", "()Z", "getPnlAmount", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Params {
        public static final int $stable = 8;
        private final String gameStateDisplay;
        private final boolean hasPosition;
        private final Money pnlAmount;
        private final BracketGameSeedData seed1;
        private final BracketGameSeedData seed2;
        private final BracketMatchState state;

        public static /* synthetic */ Params copy$default(Params params, BracketMatchState bracketMatchState, BracketGameSeedData bracketGameSeedData, BracketGameSeedData bracketGameSeedData2, String str, boolean z, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                bracketMatchState = params.state;
            }
            if ((i & 2) != 0) {
                bracketGameSeedData = params.seed1;
            }
            if ((i & 4) != 0) {
                bracketGameSeedData2 = params.seed2;
            }
            if ((i & 8) != 0) {
                str = params.gameStateDisplay;
            }
            if ((i & 16) != 0) {
                z = params.hasPosition;
            }
            if ((i & 32) != 0) {
                money = params.pnlAmount;
            }
            boolean z2 = z;
            Money money2 = money;
            return params.copy(bracketMatchState, bracketGameSeedData, bracketGameSeedData2, str, z2, money2);
        }

        /* renamed from: component1, reason: from getter */
        public final BracketMatchState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final BracketGameSeedData getSeed1() {
            return this.seed1;
        }

        /* renamed from: component3, reason: from getter */
        public final BracketGameSeedData getSeed2() {
            return this.seed2;
        }

        /* renamed from: component4, reason: from getter */
        public final String getGameStateDisplay() {
            return this.gameStateDisplay;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasPosition() {
            return this.hasPosition;
        }

        /* renamed from: component6, reason: from getter */
        public final Money getPnlAmount() {
            return this.pnlAmount;
        }

        public final Params copy(BracketMatchState state, BracketGameSeedData seed1, BracketGameSeedData seed2, String gameStateDisplay, boolean hasPosition, Money pnlAmount) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(gameStateDisplay, "gameStateDisplay");
            return new Params(state, seed1, seed2, gameStateDisplay, hasPosition, pnlAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Intrinsics.areEqual(this.state, params.state) && Intrinsics.areEqual(this.seed1, params.seed1) && Intrinsics.areEqual(this.seed2, params.seed2) && Intrinsics.areEqual(this.gameStateDisplay, params.gameStateDisplay) && this.hasPosition == params.hasPosition && Intrinsics.areEqual(this.pnlAmount, params.pnlAmount);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            BracketGameSeedData bracketGameSeedData = this.seed1;
            int iHashCode2 = (iHashCode + (bracketGameSeedData == null ? 0 : bracketGameSeedData.hashCode())) * 31;
            BracketGameSeedData bracketGameSeedData2 = this.seed2;
            int iHashCode3 = (((((iHashCode2 + (bracketGameSeedData2 == null ? 0 : bracketGameSeedData2.hashCode())) * 31) + this.gameStateDisplay.hashCode()) * 31) + Boolean.hashCode(this.hasPosition)) * 31;
            Money money = this.pnlAmount;
            return iHashCode3 + (money != null ? money.hashCode() : 0);
        }

        public String toString() {
            return "Params(state=" + this.state + ", seed1=" + this.seed1 + ", seed2=" + this.seed2 + ", gameStateDisplay=" + this.gameStateDisplay + ", hasPosition=" + this.hasPosition + ", pnlAmount=" + this.pnlAmount + ")";
        }

        public Params(BracketMatchState state, BracketGameSeedData bracketGameSeedData, BracketGameSeedData bracketGameSeedData2, String gameStateDisplay, boolean z, Money money) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(gameStateDisplay, "gameStateDisplay");
            this.state = state;
            this.seed1 = bracketGameSeedData;
            this.seed2 = bracketGameSeedData2;
            this.gameStateDisplay = gameStateDisplay;
            this.hasPosition = z;
            this.pnlAmount = money;
        }

        public /* synthetic */ Params(BracketMatchState bracketMatchState, BracketGameSeedData bracketGameSeedData, BracketGameSeedData bracketGameSeedData2, String str, boolean z, Money money, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bracketMatchState, bracketGameSeedData, bracketGameSeedData2, str, z, (i & 32) != 0 ? null : money);
        }

        public final BracketMatchState getState() {
            return this.state;
        }

        public final BracketGameSeedData getSeed1() {
            return this.seed1;
        }

        public final BracketGameSeedData getSeed2() {
            return this.seed2;
        }

        public final String getGameStateDisplay() {
            return this.gameStateDisplay;
        }

        public final boolean getHasPosition() {
            return this.hasPosition;
        }

        public final Money getPnlAmount() {
            return this.pnlAmount;
        }
    }

    public final BracketGameSeedData getSeed1() {
        return this.seed1;
    }

    public final BracketGameSeedData getSeed2() {
        return this.seed2;
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<Params> getValues() {
        Params params = new Params(new BracketMatchState.Tradeable(true), this.seed1, this.seed2, "Halftime", true, Money3.toMoney$default(new BigDecimal("1.23"), null, 1, null));
        Params params2 = new Params(new BracketMatchState.Tradeable(false), this.seed1, this.seed2, "Mar 21 @ 7 PM ET", true, Money3.toMoney$default(new BigDecimal("-1.23"), null, 1, null));
        Params params3 = new Params(new BracketMatchState.Tradeable(false), this.seed1, this.seed2, "Mar 21 @ 7 PM ET", false, null, 32, null);
        BracketGameSeedData bracketGameSeedData = null;
        Params params4 = new Params(new BracketMatchState.Locked(false), BracketGameSeedData.copy$default(this.seed1, null, null, "-", null, null, null, 27, null), bracketGameSeedData, "Mar 23 @ 7 PM ET", false, null, 32, null);
        BracketMatchState.Locked locked = new BracketMatchState.Locked(false);
        BracketGameSeedData bracketGameSeedData2 = null;
        BracketGameSeedData bracketGameSeedData3 = null;
        String str = "Mar 23 @ 7 PM ET";
        boolean z = false;
        return SequencesKt.sequenceOf(params, params2, params3, params4, new Params(locked, bracketGameSeedData2, bracketGameSeedData3, str, z, null, 32, null), new Params(new BracketMatchState.Locked(true), bracketGameSeedData, null, "Mar 23 @ 7 PM ET", false, null, 32, null), new Params(new BracketMatchState.Resolved(true), BracketGameSeedData.copy$default(this.seed1, null, null, null, "#007ff5", "#007ff5", null, 39, null), this.seed2, "Final", true, Money3.toMoney$default(new BigDecimal("-1.23"), null, 1, null)), new Params(new BracketMatchState.Resolved(false), this.seed1, BracketGameSeedData.copy$default(this.seed2, null, null, null, "#007ff5", "#007ff5", null, 39, null), "Final", true, Money3.toMoney$default(new BigDecimal("1.23"), null, 1, null)), new Params(new BracketMatchState.Tradeable(false), BracketGameSeedData.copy$default(this.seed1, null, null, "53%", null, null, null, 27, null), BracketGameSeedData.copy$default(this.seed2, null, null, "51%", null, null, null, 27, null), "Mar 23 @ 7 PM ET", false, null, 32, null));
    }
}
