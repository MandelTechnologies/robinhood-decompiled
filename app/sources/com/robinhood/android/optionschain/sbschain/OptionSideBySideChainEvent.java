package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionSideBySideChainEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "", "<init>", "()V", "EnableTradeOnExpirationSuccess", "EnableTradeOnExpirationFailure", "ShowDiscoverZeroDteBottomSheet", "ScrollToExpirationPage", "ScrollToLegs", "ScrollToStrike", "ShowSpreadOverlayBorderAnimation", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$EnableTradeOnExpirationFailure;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$EnableTradeOnExpirationSuccess;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$ScrollToExpirationPage;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$ScrollToLegs;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$ScrollToStrike;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$ShowDiscoverZeroDteBottomSheet;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$ShowSpreadOverlayBorderAnimation;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionSideBySideChainEvent {
    public static final int $stable = 0;

    public /* synthetic */ OptionSideBySideChainEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionSideBySideChainEvent() {
    }

    /* compiled from: OptionSideBySideChainEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$EnableTradeOnExpirationSuccess;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EnableTradeOnExpirationSuccess extends OptionSideBySideChainEvent {
        public static final int $stable = 0;
        public static final EnableTradeOnExpirationSuccess INSTANCE = new EnableTradeOnExpirationSuccess();

        public boolean equals(Object other) {
            return this == other || (other instanceof EnableTradeOnExpirationSuccess);
        }

        public int hashCode() {
            return -1997404683;
        }

        public String toString() {
            return "EnableTradeOnExpirationSuccess";
        }

        private EnableTradeOnExpirationSuccess() {
            super(null);
        }
    }

    /* compiled from: OptionSideBySideChainEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$EnableTradeOnExpirationFailure;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EnableTradeOnExpirationFailure extends OptionSideBySideChainEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ EnableTradeOnExpirationFailure copy$default(EnableTradeOnExpirationFailure enableTradeOnExpirationFailure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = enableTradeOnExpirationFailure.throwable;
            }
            return enableTradeOnExpirationFailure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final EnableTradeOnExpirationFailure copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new EnableTradeOnExpirationFailure(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnableTradeOnExpirationFailure) && Intrinsics.areEqual(this.throwable, ((EnableTradeOnExpirationFailure) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "EnableTradeOnExpirationFailure(throwable=" + this.throwable + ")";
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnableTradeOnExpirationFailure(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }

    /* compiled from: OptionSideBySideChainEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$ShowDiscoverZeroDteBottomSheet;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDiscoverZeroDteBottomSheet extends OptionSideBySideChainEvent {
        public static final int $stable = 0;
        public static final ShowDiscoverZeroDteBottomSheet INSTANCE = new ShowDiscoverZeroDteBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowDiscoverZeroDteBottomSheet);
        }

        public int hashCode() {
            return -374627986;
        }

        public String toString() {
            return "ShowDiscoverZeroDteBottomSheet";
        }

        private ShowDiscoverZeroDteBottomSheet() {
            super(null);
        }
    }

    /* compiled from: OptionSideBySideChainEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$ScrollToExpirationPage;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "expirationDatePage", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "<init>", "(Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;)V", "getExpirationDatePage", "()Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScrollToExpirationPage extends OptionSideBySideChainEvent {
        public static final int $stable = OptionChainExpirationDateState.$stable;
        private final OptionChainExpirationDateState expirationDatePage;

        public static /* synthetic */ ScrollToExpirationPage copy$default(ScrollToExpirationPage scrollToExpirationPage, OptionChainExpirationDateState optionChainExpirationDateState, int i, Object obj) {
            if ((i & 1) != 0) {
                optionChainExpirationDateState = scrollToExpirationPage.expirationDatePage;
            }
            return scrollToExpirationPage.copy(optionChainExpirationDateState);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionChainExpirationDateState getExpirationDatePage() {
            return this.expirationDatePage;
        }

        public final ScrollToExpirationPage copy(OptionChainExpirationDateState expirationDatePage) {
            Intrinsics.checkNotNullParameter(expirationDatePage, "expirationDatePage");
            return new ScrollToExpirationPage(expirationDatePage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScrollToExpirationPage) && Intrinsics.areEqual(this.expirationDatePage, ((ScrollToExpirationPage) other).expirationDatePage);
        }

        public int hashCode() {
            return this.expirationDatePage.hashCode();
        }

        public String toString() {
            return "ScrollToExpirationPage(expirationDatePage=" + this.expirationDatePage + ")";
        }

        public final OptionChainExpirationDateState getExpirationDatePage() {
            return this.expirationDatePage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScrollToExpirationPage(OptionChainExpirationDateState expirationDatePage) {
            super(null);
            Intrinsics.checkNotNullParameter(expirationDatePage, "expirationDatePage");
            this.expirationDatePage = expirationDatePage;
        }
    }

    /* compiled from: OptionSideBySideChainEvent.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$ScrollToLegs;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "expirationDatePage", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "targetLegs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "<init>", "(Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lkotlinx/collections/immutable/ImmutableList;)V", "getExpirationDatePage", "()Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getTargetLegs", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScrollToLegs extends OptionSideBySideChainEvent {
        public static final int $stable = 8;
        private final OptionChainExpirationDateState expirationDatePage;
        private final ImmutableList<UiOptionStrategyLegDisplay> targetLegs;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ScrollToLegs copy$default(ScrollToLegs scrollToLegs, OptionChainExpirationDateState optionChainExpirationDateState, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                optionChainExpirationDateState = scrollToLegs.expirationDatePage;
            }
            if ((i & 2) != 0) {
                immutableList = scrollToLegs.targetLegs;
            }
            return scrollToLegs.copy(optionChainExpirationDateState, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionChainExpirationDateState getExpirationDatePage() {
            return this.expirationDatePage;
        }

        public final ImmutableList<UiOptionStrategyLegDisplay> component2() {
            return this.targetLegs;
        }

        public final ScrollToLegs copy(OptionChainExpirationDateState expirationDatePage, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs) {
            Intrinsics.checkNotNullParameter(expirationDatePage, "expirationDatePage");
            Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
            return new ScrollToLegs(expirationDatePage, targetLegs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrollToLegs)) {
                return false;
            }
            ScrollToLegs scrollToLegs = (ScrollToLegs) other;
            return Intrinsics.areEqual(this.expirationDatePage, scrollToLegs.expirationDatePage) && Intrinsics.areEqual(this.targetLegs, scrollToLegs.targetLegs);
        }

        public int hashCode() {
            return (this.expirationDatePage.hashCode() * 31) + this.targetLegs.hashCode();
        }

        public String toString() {
            return "ScrollToLegs(expirationDatePage=" + this.expirationDatePage + ", targetLegs=" + this.targetLegs + ")";
        }

        public final OptionChainExpirationDateState getExpirationDatePage() {
            return this.expirationDatePage;
        }

        public final ImmutableList<UiOptionStrategyLegDisplay> getTargetLegs() {
            return this.targetLegs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ScrollToLegs(OptionChainExpirationDateState expirationDatePage, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs) {
            super(null);
            Intrinsics.checkNotNullParameter(expirationDatePage, "expirationDatePage");
            Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
            this.expirationDatePage = expirationDatePage;
            this.targetLegs = targetLegs;
        }
    }

    /* compiled from: OptionSideBySideChainEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$ScrollToStrike;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "expirationDatePage", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "targetStrikePrice", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Ljava/math/BigDecimal;)V", "getExpirationDatePage", "()Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getTargetStrikePrice", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScrollToStrike extends OptionSideBySideChainEvent {
        public static final int $stable = 8;
        private final OptionChainExpirationDateState expirationDatePage;
        private final BigDecimal targetStrikePrice;

        public static /* synthetic */ ScrollToStrike copy$default(ScrollToStrike scrollToStrike, OptionChainExpirationDateState optionChainExpirationDateState, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                optionChainExpirationDateState = scrollToStrike.expirationDatePage;
            }
            if ((i & 2) != 0) {
                bigDecimal = scrollToStrike.targetStrikePrice;
            }
            return scrollToStrike.copy(optionChainExpirationDateState, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionChainExpirationDateState getExpirationDatePage() {
            return this.expirationDatePage;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getTargetStrikePrice() {
            return this.targetStrikePrice;
        }

        public final ScrollToStrike copy(OptionChainExpirationDateState expirationDatePage, BigDecimal targetStrikePrice) {
            Intrinsics.checkNotNullParameter(expirationDatePage, "expirationDatePage");
            Intrinsics.checkNotNullParameter(targetStrikePrice, "targetStrikePrice");
            return new ScrollToStrike(expirationDatePage, targetStrikePrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrollToStrike)) {
                return false;
            }
            ScrollToStrike scrollToStrike = (ScrollToStrike) other;
            return Intrinsics.areEqual(this.expirationDatePage, scrollToStrike.expirationDatePage) && Intrinsics.areEqual(this.targetStrikePrice, scrollToStrike.targetStrikePrice);
        }

        public int hashCode() {
            return (this.expirationDatePage.hashCode() * 31) + this.targetStrikePrice.hashCode();
        }

        public String toString() {
            return "ScrollToStrike(expirationDatePage=" + this.expirationDatePage + ", targetStrikePrice=" + this.targetStrikePrice + ")";
        }

        public final OptionChainExpirationDateState getExpirationDatePage() {
            return this.expirationDatePage;
        }

        public final BigDecimal getTargetStrikePrice() {
            return this.targetStrikePrice;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScrollToStrike(OptionChainExpirationDateState expirationDatePage, BigDecimal targetStrikePrice) {
            super(null);
            Intrinsics.checkNotNullParameter(expirationDatePage, "expirationDatePage");
            Intrinsics.checkNotNullParameter(targetStrikePrice, "targetStrikePrice");
            this.expirationDatePage = expirationDatePage;
            this.targetStrikePrice = targetStrikePrice;
        }
    }

    /* compiled from: OptionSideBySideChainEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent$ShowSpreadOverlayBorderAnimation;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "contractType", "Lcom/robinhood/models/db/OptionContractType;", "<init>", "(Lcom/robinhood/models/db/OptionContractType;)V", "getContractType", "()Lcom/robinhood/models/db/OptionContractType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSpreadOverlayBorderAnimation extends OptionSideBySideChainEvent {
        public static final int $stable = 0;
        private final OptionContractType contractType;

        public static /* synthetic */ ShowSpreadOverlayBorderAnimation copy$default(ShowSpreadOverlayBorderAnimation showSpreadOverlayBorderAnimation, OptionContractType optionContractType, int i, Object obj) {
            if ((i & 1) != 0) {
                optionContractType = showSpreadOverlayBorderAnimation.contractType;
            }
            return showSpreadOverlayBorderAnimation.copy(optionContractType);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionContractType getContractType() {
            return this.contractType;
        }

        public final ShowSpreadOverlayBorderAnimation copy(OptionContractType contractType) {
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            return new ShowSpreadOverlayBorderAnimation(contractType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowSpreadOverlayBorderAnimation) && this.contractType == ((ShowSpreadOverlayBorderAnimation) other).contractType;
        }

        public int hashCode() {
            return this.contractType.hashCode();
        }

        public String toString() {
            return "ShowSpreadOverlayBorderAnimation(contractType=" + this.contractType + ")";
        }

        public final OptionContractType getContractType() {
            return this.contractType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSpreadOverlayBorderAnimation(OptionContractType contractType) {
            super(null);
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            this.contractType = contractType;
        }
    }
}
