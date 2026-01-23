package com.robinhood.android.options.history.detail.event;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.shared.history.compose.Underlying;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: OptionEventDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailViewState;", "", "Ready", "Empty", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailViewState$Empty;", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailViewState$Ready;", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface OptionEventDetailViewState {

    /* compiled from: OptionEventDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001aJf\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b\t\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010 R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b;\u0010\u001a¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailViewState$Ready;", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailViewState;", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/ui/UiOptionEvent;", "event", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "pnlItem", "", "isLoading", "j$/time/LocalDate", "nextOpenDate", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "Lcom/robinhood/shared/history/compose/Underlying;", "underlying", "pnlUpdatesEnabled", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/ui/UiOptionEvent;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;ZLj$/time/LocalDate;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/shared/history/compose/Underlying;Z)V", "component1", "()Lcom/robinhood/models/db/Account;", "component2", "()Lcom/robinhood/models/ui/UiOptionEvent;", "component3", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "component4", "()Z", "component5", "()Lj$/time/LocalDate;", "component6", "()Lcom/robinhood/models/ui/UiOptionChain;", "component7", "()Lcom/robinhood/shared/history/compose/Underlying;", "component8", "copy", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/ui/UiOptionEvent;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;ZLj$/time/LocalDate;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/shared/history/compose/Underlying;Z)Lcom/robinhood/android/options/history/detail/event/OptionEventDetailViewState$Ready;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/Account;", "getAccount", "Lcom/robinhood/models/ui/UiOptionEvent;", "getEvent", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "getPnlItem", "Z", "Lj$/time/LocalDate;", "getNextOpenDate", "Lcom/robinhood/models/ui/UiOptionChain;", "getUiOptionChain", "Lcom/robinhood/shared/history/compose/Underlying;", "getUnderlying", "getPnlUpdatesEnabled", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements OptionEventDetailViewState {
        public static final int $stable = 8;
        private final Account account;
        private final UiOptionEvent event;
        private final boolean isLoading;
        private final LocalDate nextOpenDate;
        private final ProfitAndLossTradeItem pnlItem;
        private final boolean pnlUpdatesEnabled;
        private final UiOptionChain uiOptionChain;
        private final Underlying underlying;

        public static /* synthetic */ Ready copy$default(Ready ready, Account account, UiOptionEvent uiOptionEvent, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, LocalDate localDate, UiOptionChain uiOptionChain, Underlying underlying, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                account = ready.account;
            }
            if ((i & 2) != 0) {
                uiOptionEvent = ready.event;
            }
            if ((i & 4) != 0) {
                profitAndLossTradeItem = ready.pnlItem;
            }
            if ((i & 8) != 0) {
                z = ready.isLoading;
            }
            if ((i & 16) != 0) {
                localDate = ready.nextOpenDate;
            }
            if ((i & 32) != 0) {
                uiOptionChain = ready.uiOptionChain;
            }
            if ((i & 64) != 0) {
                underlying = ready.underlying;
            }
            if ((i & 128) != 0) {
                z2 = ready.pnlUpdatesEnabled;
            }
            Underlying underlying2 = underlying;
            boolean z3 = z2;
            LocalDate localDate2 = localDate;
            UiOptionChain uiOptionChain2 = uiOptionChain;
            return ready.copy(account, uiOptionEvent, profitAndLossTradeItem, z, localDate2, uiOptionChain2, underlying2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final Account getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final UiOptionEvent getEvent() {
            return this.event;
        }

        /* renamed from: component3, reason: from getter */
        public final ProfitAndLossTradeItem getPnlItem() {
            return this.pnlItem;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component5, reason: from getter */
        public final LocalDate getNextOpenDate() {
            return this.nextOpenDate;
        }

        /* renamed from: component6, reason: from getter */
        public final UiOptionChain getUiOptionChain() {
            return this.uiOptionChain;
        }

        /* renamed from: component7, reason: from getter */
        public final Underlying getUnderlying() {
            return this.underlying;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getPnlUpdatesEnabled() {
            return this.pnlUpdatesEnabled;
        }

        public final Ready copy(Account account, UiOptionEvent event, ProfitAndLossTradeItem pnlItem, boolean isLoading, LocalDate nextOpenDate, UiOptionChain uiOptionChain, Underlying underlying, boolean pnlUpdatesEnabled) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
            return new Ready(account, event, pnlItem, isLoading, nextOpenDate, uiOptionChain, underlying, pnlUpdatesEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.account, ready.account) && Intrinsics.areEqual(this.event, ready.event) && Intrinsics.areEqual(this.pnlItem, ready.pnlItem) && this.isLoading == ready.isLoading && Intrinsics.areEqual(this.nextOpenDate, ready.nextOpenDate) && Intrinsics.areEqual(this.uiOptionChain, ready.uiOptionChain) && Intrinsics.areEqual(this.underlying, ready.underlying) && this.pnlUpdatesEnabled == ready.pnlUpdatesEnabled;
        }

        public int hashCode() {
            int iHashCode = ((this.account.hashCode() * 31) + this.event.hashCode()) * 31;
            ProfitAndLossTradeItem profitAndLossTradeItem = this.pnlItem;
            int iHashCode2 = (((iHashCode + (profitAndLossTradeItem == null ? 0 : profitAndLossTradeItem.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
            LocalDate localDate = this.nextOpenDate;
            int iHashCode3 = (((iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.uiOptionChain.hashCode()) * 31;
            Underlying underlying = this.underlying;
            return ((iHashCode3 + (underlying != null ? underlying.hashCode() : 0)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled);
        }

        public String toString() {
            return "Ready(account=" + this.account + ", event=" + this.event + ", pnlItem=" + this.pnlItem + ", isLoading=" + this.isLoading + ", nextOpenDate=" + this.nextOpenDate + ", uiOptionChain=" + this.uiOptionChain + ", underlying=" + this.underlying + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ")";
        }

        public Ready(Account account, UiOptionEvent event, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, LocalDate localDate, UiOptionChain uiOptionChain, Underlying underlying, boolean z2) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
            this.account = account;
            this.event = event;
            this.pnlItem = profitAndLossTradeItem;
            this.isLoading = z;
            this.nextOpenDate = localDate;
            this.uiOptionChain = uiOptionChain;
            this.underlying = underlying;
            this.pnlUpdatesEnabled = z2;
        }

        public final Account getAccount() {
            return this.account;
        }

        public final UiOptionEvent getEvent() {
            return this.event;
        }

        public final ProfitAndLossTradeItem getPnlItem() {
            return this.pnlItem;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final LocalDate getNextOpenDate() {
            return this.nextOpenDate;
        }

        public final UiOptionChain getUiOptionChain() {
            return this.uiOptionChain;
        }

        public final Underlying getUnderlying() {
            return this.underlying;
        }

        public final boolean getPnlUpdatesEnabled() {
            return this.pnlUpdatesEnabled;
        }
    }

    /* compiled from: OptionEventDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailViewState$Empty;", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty implements OptionEventDetailViewState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return 640651560;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
        }
    }
}
