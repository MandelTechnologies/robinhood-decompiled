package com.robinhood.android.options.history.detail.event;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.shared.history.compose.Underlying;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: OptionEventDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\u001cJl\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b\u000b\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010 R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b:\u0010\u001c¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDataState;", "", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/ui/UiOptionEvent;", "event", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "pnlItem", "", "isCancelingOrder", "j$/time/LocalDate", "nextOpenDate", "Lcom/robinhood/shared/history/compose/Underlying;", "underlying", "pnlUpdatesEnabled", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/ui/UiOptionEvent;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;ZLj$/time/LocalDate;Lcom/robinhood/shared/history/compose/Underlying;Z)V", "component1", "()Lcom/robinhood/models/db/Account;", "component2", "()Lcom/robinhood/models/ui/UiOptionEvent;", "component3", "()Lcom/robinhood/models/ui/UiOptionChain;", "component4", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "component5", "()Z", "component6", "()Lj$/time/LocalDate;", "component7", "()Lcom/robinhood/shared/history/compose/Underlying;", "component8", "copy", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/ui/UiOptionEvent;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;ZLj$/time/LocalDate;Lcom/robinhood/shared/history/compose/Underlying;Z)Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/Account;", "getAccount", "Lcom/robinhood/models/ui/UiOptionEvent;", "getEvent", "Lcom/robinhood/models/ui/UiOptionChain;", "getUiOptionChain", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "getPnlItem", "Z", "Lj$/time/LocalDate;", "getNextOpenDate", "Lcom/robinhood/shared/history/compose/Underlying;", "getUnderlying", "getPnlUpdatesEnabled", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionEventDetailDataState {
    public static final int $stable = 8;
    private final Account account;
    private final UiOptionEvent event;
    private final boolean isCancelingOrder;
    private final LocalDate nextOpenDate;
    private final ProfitAndLossTradeItem pnlItem;
    private final boolean pnlUpdatesEnabled;
    private final UiOptionChain uiOptionChain;
    private final Underlying underlying;

    public OptionEventDetailDataState() {
        this(null, null, null, null, false, null, null, false, 255, null);
    }

    public static /* synthetic */ OptionEventDetailDataState copy$default(OptionEventDetailDataState optionEventDetailDataState, Account account, UiOptionEvent uiOptionEvent, UiOptionChain uiOptionChain, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, LocalDate localDate, Underlying underlying, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            account = optionEventDetailDataState.account;
        }
        if ((i & 2) != 0) {
            uiOptionEvent = optionEventDetailDataState.event;
        }
        if ((i & 4) != 0) {
            uiOptionChain = optionEventDetailDataState.uiOptionChain;
        }
        if ((i & 8) != 0) {
            profitAndLossTradeItem = optionEventDetailDataState.pnlItem;
        }
        if ((i & 16) != 0) {
            z = optionEventDetailDataState.isCancelingOrder;
        }
        if ((i & 32) != 0) {
            localDate = optionEventDetailDataState.nextOpenDate;
        }
        if ((i & 64) != 0) {
            underlying = optionEventDetailDataState.underlying;
        }
        if ((i & 128) != 0) {
            z2 = optionEventDetailDataState.pnlUpdatesEnabled;
        }
        Underlying underlying2 = underlying;
        boolean z3 = z2;
        boolean z4 = z;
        LocalDate localDate2 = localDate;
        return optionEventDetailDataState.copy(account, uiOptionEvent, uiOptionChain, profitAndLossTradeItem, z4, localDate2, underlying2, z3);
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
    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    /* renamed from: component4, reason: from getter */
    public final ProfitAndLossTradeItem getPnlItem() {
        return this.pnlItem;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCancelingOrder() {
        return this.isCancelingOrder;
    }

    /* renamed from: component6, reason: from getter */
    public final LocalDate getNextOpenDate() {
        return this.nextOpenDate;
    }

    /* renamed from: component7, reason: from getter */
    public final Underlying getUnderlying() {
        return this.underlying;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final OptionEventDetailDataState copy(Account account, UiOptionEvent event, UiOptionChain uiOptionChain, ProfitAndLossTradeItem pnlItem, boolean isCancelingOrder, LocalDate nextOpenDate, Underlying underlying, boolean pnlUpdatesEnabled) {
        return new OptionEventDetailDataState(account, event, uiOptionChain, pnlItem, isCancelingOrder, nextOpenDate, underlying, pnlUpdatesEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionEventDetailDataState)) {
            return false;
        }
        OptionEventDetailDataState optionEventDetailDataState = (OptionEventDetailDataState) other;
        return Intrinsics.areEqual(this.account, optionEventDetailDataState.account) && Intrinsics.areEqual(this.event, optionEventDetailDataState.event) && Intrinsics.areEqual(this.uiOptionChain, optionEventDetailDataState.uiOptionChain) && Intrinsics.areEqual(this.pnlItem, optionEventDetailDataState.pnlItem) && this.isCancelingOrder == optionEventDetailDataState.isCancelingOrder && Intrinsics.areEqual(this.nextOpenDate, optionEventDetailDataState.nextOpenDate) && Intrinsics.areEqual(this.underlying, optionEventDetailDataState.underlying) && this.pnlUpdatesEnabled == optionEventDetailDataState.pnlUpdatesEnabled;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        UiOptionEvent uiOptionEvent = this.event;
        int iHashCode2 = (iHashCode + (uiOptionEvent == null ? 0 : uiOptionEvent.hashCode())) * 31;
        UiOptionChain uiOptionChain = this.uiOptionChain;
        int iHashCode3 = (iHashCode2 + (uiOptionChain == null ? 0 : uiOptionChain.hashCode())) * 31;
        ProfitAndLossTradeItem profitAndLossTradeItem = this.pnlItem;
        int iHashCode4 = (((iHashCode3 + (profitAndLossTradeItem == null ? 0 : profitAndLossTradeItem.hashCode())) * 31) + Boolean.hashCode(this.isCancelingOrder)) * 31;
        LocalDate localDate = this.nextOpenDate;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Underlying underlying = this.underlying;
        return ((iHashCode5 + (underlying != null ? underlying.hashCode() : 0)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled);
    }

    public String toString() {
        return "OptionEventDetailDataState(account=" + this.account + ", event=" + this.event + ", uiOptionChain=" + this.uiOptionChain + ", pnlItem=" + this.pnlItem + ", isCancelingOrder=" + this.isCancelingOrder + ", nextOpenDate=" + this.nextOpenDate + ", underlying=" + this.underlying + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ")";
    }

    public OptionEventDetailDataState(Account account, UiOptionEvent uiOptionEvent, UiOptionChain uiOptionChain, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, LocalDate localDate, Underlying underlying, boolean z2) {
        this.account = account;
        this.event = uiOptionEvent;
        this.uiOptionChain = uiOptionChain;
        this.pnlItem = profitAndLossTradeItem;
        this.isCancelingOrder = z;
        this.nextOpenDate = localDate;
        this.underlying = underlying;
        this.pnlUpdatesEnabled = z2;
    }

    public /* synthetic */ OptionEventDetailDataState(Account account, UiOptionEvent uiOptionEvent, UiOptionChain uiOptionChain, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, LocalDate localDate, Underlying underlying, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : uiOptionEvent, (i & 4) != 0 ? null : uiOptionChain, (i & 8) != 0 ? null : profitAndLossTradeItem, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : localDate, (i & 64) != 0 ? null : underlying, (i & 128) != 0 ? false : z2);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final UiOptionEvent getEvent() {
        return this.event;
    }

    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    public final ProfitAndLossTradeItem getPnlItem() {
        return this.pnlItem;
    }

    public final boolean isCancelingOrder() {
        return this.isCancelingOrder;
    }

    public final LocalDate getNextOpenDate() {
        return this.nextOpenDate;
    }

    public final Underlying getUnderlying() {
        return this.underlying;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }
}
