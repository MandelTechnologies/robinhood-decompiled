package com.robinhood.android.common.options.tradebar;

import com.robinhood.android.common.options.accountswitcher.OptionsAccountSwitcherState;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.Either;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OptionsDetailPageTradebarViewState.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004KLMNB\u0093\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u000e\u0010\u001b\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0019\u0010>\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010B\u001a\u00020\u001aHÆ\u0003J\u0011\u0010C\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dHÆ\u0003J«\u0001\u0010D\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dHÆ\u0001J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R!\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u0010\u001b\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState;", "", "actionItems", "", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$ActionItem;", "actionKeys", "", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$ActionType;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "currentAccount", "Lcom/robinhood/models/db/Account;", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "error", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError;", "infoState", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$StatState;", "Lcom/robinhood/android/common/options/accountswitcher/OptionsAccountSwitcherState;", "optionsAccountSwitcherId", "Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "selfFetchMode", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$SelfFetch;", "strategyCode", "", "timestampTradeButtonTapped", "", "tradebarErrorComponentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "<init>", "(Ljava/util/List;Ljava/util/Map;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/serverdriven/experimental/api/Direction;Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError;Lcom/robinhood/utils/Either;Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$SelfFetch;Ljava/lang/String;JLcom/robinhood/rosetta/eventlogging/Component$ComponentType;)V", "getActionItems", "()Ljava/util/List;", "getActionKeys", "()Ljava/util/Map;", "getCurrentAccount", "()Lcom/robinhood/models/db/Account;", "getDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getError", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError;", "getInfoState", "()Lcom/robinhood/utils/Either;", "getOptionsAccountSwitcherId", "()Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "getSelfFetchMode", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$SelfFetch;", "getStrategyCode", "()Ljava/lang/String;", "getTimestampTradeButtonTapped", "()J", "getTradebarErrorComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "tradebarActions", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction$LegacyExpandAction;", "getTradebarActions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "StatState", "ActionItem", "ActionType", "TradebarError", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class OptionsDetailPageTradebarViewState {
    public static final int $stable = 8;
    private final List<ActionItem> actionItems;
    private final Map<ActionType, IntentKey> actionKeys;
    private final Account currentAccount;
    private final Direction direction;
    private final TradebarError error;
    private final Either<StatState, OptionsAccountSwitcherState> infoState;
    private final OptionsAccountSwitcherId optionsAccountSwitcherId;
    private final OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch selfFetchMode;
    private final String strategyCode;
    private final long timestampTradeButtonTapped;
    private final List<AbstractTradeBarOverlayView.ExpandAction.LegacyExpandAction> tradebarActions;
    private final Component.ComponentType tradebarErrorComponentType;

    public static /* synthetic */ OptionsDetailPageTradebarViewState copy$default(OptionsDetailPageTradebarViewState optionsDetailPageTradebarViewState, List list, Map map, Account account, Direction direction, TradebarError tradebarError, Either either, OptionsAccountSwitcherId optionsAccountSwitcherId, OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch selfFetch, String str, long j, Component.ComponentType componentType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = optionsDetailPageTradebarViewState.actionItems;
        }
        if ((i & 2) != 0) {
            map = optionsDetailPageTradebarViewState.actionKeys;
        }
        if ((i & 4) != 0) {
            account = optionsDetailPageTradebarViewState.currentAccount;
        }
        if ((i & 8) != 0) {
            direction = optionsDetailPageTradebarViewState.direction;
        }
        if ((i & 16) != 0) {
            tradebarError = optionsDetailPageTradebarViewState.error;
        }
        if ((i & 32) != 0) {
            either = optionsDetailPageTradebarViewState.infoState;
        }
        if ((i & 64) != 0) {
            optionsAccountSwitcherId = optionsDetailPageTradebarViewState.optionsAccountSwitcherId;
        }
        if ((i & 128) != 0) {
            selfFetch = optionsDetailPageTradebarViewState.selfFetchMode;
        }
        if ((i & 256) != 0) {
            str = optionsDetailPageTradebarViewState.strategyCode;
        }
        if ((i & 512) != 0) {
            j = optionsDetailPageTradebarViewState.timestampTradeButtonTapped;
        }
        if ((i & 1024) != 0) {
            componentType = optionsDetailPageTradebarViewState.tradebarErrorComponentType;
        }
        Component.ComponentType componentType2 = componentType;
        long j2 = j;
        OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch selfFetch2 = selfFetch;
        String str2 = str;
        Either either2 = either;
        OptionsAccountSwitcherId optionsAccountSwitcherId2 = optionsAccountSwitcherId;
        TradebarError tradebarError2 = tradebarError;
        Account account2 = account;
        return optionsDetailPageTradebarViewState.copy(list, map, account2, direction, tradebarError2, either2, optionsAccountSwitcherId2, selfFetch2, str2, j2, componentType2);
    }

    public final List<ActionItem> component1() {
        return this.actionItems;
    }

    /* renamed from: component10, reason: from getter */
    public final long getTimestampTradeButtonTapped() {
        return this.timestampTradeButtonTapped;
    }

    /* renamed from: component11, reason: from getter */
    public final Component.ComponentType getTradebarErrorComponentType() {
        return this.tradebarErrorComponentType;
    }

    public final Map<ActionType, IntentKey> component2() {
        return this.actionKeys;
    }

    /* renamed from: component3, reason: from getter */
    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    /* renamed from: component5, reason: from getter */
    public final TradebarError getError() {
        return this.error;
    }

    public final Either<StatState, OptionsAccountSwitcherState> component6() {
        return this.infoState;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionsAccountSwitcherId getOptionsAccountSwitcherId() {
        return this.optionsAccountSwitcherId;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch getSelfFetchMode() {
        return this.selfFetchMode;
    }

    /* renamed from: component9, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final OptionsDetailPageTradebarViewState copy(List<ActionItem> actionItems, Map<ActionType, ? extends IntentKey> actionKeys, Account currentAccount, Direction direction, TradebarError error, Either<StatState, OptionsAccountSwitcherState> infoState, OptionsAccountSwitcherId optionsAccountSwitcherId, OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch selfFetchMode, String strategyCode, long timestampTradeButtonTapped, Component.ComponentType tradebarErrorComponentType) {
        Intrinsics.checkNotNullParameter(actionItems, "actionItems");
        Intrinsics.checkNotNullParameter(actionKeys, "actionKeys");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(infoState, "infoState");
        return new OptionsDetailPageTradebarViewState(actionItems, actionKeys, currentAccount, direction, error, infoState, optionsAccountSwitcherId, selfFetchMode, strategyCode, timestampTradeButtonTapped, tradebarErrorComponentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsDetailPageTradebarViewState)) {
            return false;
        }
        OptionsDetailPageTradebarViewState optionsDetailPageTradebarViewState = (OptionsDetailPageTradebarViewState) other;
        return Intrinsics.areEqual(this.actionItems, optionsDetailPageTradebarViewState.actionItems) && Intrinsics.areEqual(this.actionKeys, optionsDetailPageTradebarViewState.actionKeys) && Intrinsics.areEqual(this.currentAccount, optionsDetailPageTradebarViewState.currentAccount) && this.direction == optionsDetailPageTradebarViewState.direction && Intrinsics.areEqual(this.error, optionsDetailPageTradebarViewState.error) && Intrinsics.areEqual(this.infoState, optionsDetailPageTradebarViewState.infoState) && Intrinsics.areEqual(this.optionsAccountSwitcherId, optionsDetailPageTradebarViewState.optionsAccountSwitcherId) && Intrinsics.areEqual(this.selfFetchMode, optionsDetailPageTradebarViewState.selfFetchMode) && Intrinsics.areEqual(this.strategyCode, optionsDetailPageTradebarViewState.strategyCode) && this.timestampTradeButtonTapped == optionsDetailPageTradebarViewState.timestampTradeButtonTapped && this.tradebarErrorComponentType == optionsDetailPageTradebarViewState.tradebarErrorComponentType;
    }

    public int hashCode() {
        int iHashCode = ((this.actionItems.hashCode() * 31) + this.actionKeys.hashCode()) * 31;
        Account account = this.currentAccount;
        int iHashCode2 = (((iHashCode + (account == null ? 0 : account.hashCode())) * 31) + this.direction.hashCode()) * 31;
        TradebarError tradebarError = this.error;
        int iHashCode3 = (((iHashCode2 + (tradebarError == null ? 0 : tradebarError.hashCode())) * 31) + this.infoState.hashCode()) * 31;
        OptionsAccountSwitcherId optionsAccountSwitcherId = this.optionsAccountSwitcherId;
        int iHashCode4 = (iHashCode3 + (optionsAccountSwitcherId == null ? 0 : optionsAccountSwitcherId.hashCode())) * 31;
        OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch selfFetch = this.selfFetchMode;
        int iHashCode5 = (iHashCode4 + (selfFetch == null ? 0 : selfFetch.hashCode())) * 31;
        String str = this.strategyCode;
        int iHashCode6 = (((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timestampTradeButtonTapped)) * 31;
        Component.ComponentType componentType = this.tradebarErrorComponentType;
        return iHashCode6 + (componentType != null ? componentType.hashCode() : 0);
    }

    public String toString() {
        return "OptionsDetailPageTradebarViewState(actionItems=" + this.actionItems + ", actionKeys=" + this.actionKeys + ", currentAccount=" + this.currentAccount + ", direction=" + this.direction + ", error=" + this.error + ", infoState=" + this.infoState + ", optionsAccountSwitcherId=" + this.optionsAccountSwitcherId + ", selfFetchMode=" + this.selfFetchMode + ", strategyCode=" + this.strategyCode + ", timestampTradeButtonTapped=" + this.timestampTradeButtonTapped + ", tradebarErrorComponentType=" + this.tradebarErrorComponentType + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsDetailPageTradebarViewState(List<ActionItem> actionItems, Map<ActionType, ? extends IntentKey> actionKeys, Account account, Direction direction, TradebarError tradebarError, Either<StatState, OptionsAccountSwitcherState> infoState, OptionsAccountSwitcherId optionsAccountSwitcherId, OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch selfFetch, String str, long j, Component.ComponentType componentType) {
        Intrinsics.checkNotNullParameter(actionItems, "actionItems");
        Intrinsics.checkNotNullParameter(actionKeys, "actionKeys");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(infoState, "infoState");
        this.actionItems = actionItems;
        this.actionKeys = actionKeys;
        this.currentAccount = account;
        this.direction = direction;
        this.error = tradebarError;
        this.infoState = infoState;
        this.optionsAccountSwitcherId = optionsAccountSwitcherId;
        this.selfFetchMode = selfFetch;
        this.strategyCode = str;
        this.timestampTradeButtonTapped = j;
        this.tradebarErrorComponentType = componentType;
        List<ActionItem> list = actionItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ActionItem) it.next()).getTradeBarAction());
        }
        this.tradebarActions = arrayList;
    }

    public final List<ActionItem> getActionItems() {
        return this.actionItems;
    }

    public final Map<ActionType, IntentKey> getActionKeys() {
        return this.actionKeys;
    }

    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final TradebarError getError() {
        return this.error;
    }

    public final Either<StatState, OptionsAccountSwitcherState> getInfoState() {
        return this.infoState;
    }

    public final OptionsAccountSwitcherId getOptionsAccountSwitcherId() {
        return this.optionsAccountSwitcherId;
    }

    public final OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch getSelfFetchMode() {
        return this.selfFetchMode;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final long getTimestampTradeButtonTapped() {
        return this.timestampTradeButtonTapped;
    }

    public final Component.ComponentType getTradebarErrorComponentType() {
        return this.tradebarErrorComponentType;
    }

    public final List<AbstractTradeBarOverlayView.ExpandAction.LegacyExpandAction> getTradebarActions() {
        return this.tradebarActions;
    }

    /* compiled from: OptionsDetailPageTradebarViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$StatState;", "", "equityInstrumentId", "Ljava/util/UUID;", "indexInstrumentId", AnnotatedPrivateKey.LABEL, "", "linkLabel", "hideStatLabel", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Z)V", "getEquityInstrumentId", "()Ljava/util/UUID;", "getIndexInstrumentId", "getLabel", "()Ljava/lang/String;", "getLinkLabel", "getHideStatLabel", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StatState {
        public static final int $stable = 8;
        private final UUID equityInstrumentId;
        private final boolean hideStatLabel;
        private final UUID indexInstrumentId;
        private final String label;
        private final String linkLabel;

        public static /* synthetic */ StatState copy$default(StatState statState, UUID uuid, UUID uuid2, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = statState.equityInstrumentId;
            }
            if ((i & 2) != 0) {
                uuid2 = statState.indexInstrumentId;
            }
            if ((i & 4) != 0) {
                str = statState.label;
            }
            if ((i & 8) != 0) {
                str2 = statState.linkLabel;
            }
            if ((i & 16) != 0) {
                z = statState.hideStatLabel;
            }
            boolean z2 = z;
            String str3 = str;
            return statState.copy(uuid, uuid2, str3, str2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getEquityInstrumentId() {
            return this.equityInstrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getIndexInstrumentId() {
            return this.indexInstrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLinkLabel() {
            return this.linkLabel;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHideStatLabel() {
            return this.hideStatLabel;
        }

        public final StatState copy(UUID equityInstrumentId, UUID indexInstrumentId, String label, String linkLabel, boolean hideStatLabel) {
            return new StatState(equityInstrumentId, indexInstrumentId, label, linkLabel, hideStatLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatState)) {
                return false;
            }
            StatState statState = (StatState) other;
            return Intrinsics.areEqual(this.equityInstrumentId, statState.equityInstrumentId) && Intrinsics.areEqual(this.indexInstrumentId, statState.indexInstrumentId) && Intrinsics.areEqual(this.label, statState.label) && Intrinsics.areEqual(this.linkLabel, statState.linkLabel) && this.hideStatLabel == statState.hideStatLabel;
        }

        public int hashCode() {
            UUID uuid = this.equityInstrumentId;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            UUID uuid2 = this.indexInstrumentId;
            int iHashCode2 = (iHashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
            String str = this.label;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.linkLabel;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.hideStatLabel);
        }

        public String toString() {
            return "StatState(equityInstrumentId=" + this.equityInstrumentId + ", indexInstrumentId=" + this.indexInstrumentId + ", label=" + this.label + ", linkLabel=" + this.linkLabel + ", hideStatLabel=" + this.hideStatLabel + ")";
        }

        public StatState(UUID uuid, UUID uuid2, String str, String str2, boolean z) {
            this.equityInstrumentId = uuid;
            this.indexInstrumentId = uuid2;
            this.label = str;
            this.linkLabel = str2;
            this.hideStatLabel = z;
        }

        public final UUID getEquityInstrumentId() {
            return this.equityInstrumentId;
        }

        public final UUID getIndexInstrumentId() {
            return this.indexInstrumentId;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getLinkLabel() {
            return this.linkLabel;
        }

        public final boolean getHideStatLabel() {
            return this.hideStatLabel;
        }
    }

    /* compiled from: OptionsDetailPageTradebarViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$ActionItem;", "", "enabled", "", AnnotatedPrivateKey.LABEL, "", "type", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$ActionType;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$ActionType;)V", "getEnabled", "()Z", "getLabel", "()Ljava/lang/String;", "getType", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$ActionType;", "tradeBarAction", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction$LegacyExpandAction;", "getTradeBarAction", "()Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction$LegacyExpandAction;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ActionItem {
        public static final int $stable = AbstractTradeBarOverlayView.ExpandAction.LegacyExpandAction.$stable;
        private final boolean enabled;
        private final String label;
        private final AbstractTradeBarOverlayView.ExpandAction.LegacyExpandAction tradeBarAction;
        private final ActionType type;

        public static /* synthetic */ ActionItem copy$default(ActionItem actionItem, boolean z, String str, ActionType actionType, int i, Object obj) {
            if ((i & 1) != 0) {
                z = actionItem.enabled;
            }
            if ((i & 2) != 0) {
                str = actionItem.label;
            }
            if ((i & 4) != 0) {
                actionType = actionItem.type;
            }
            return actionItem.copy(z, str, actionType);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        public final ActionItem copy(boolean enabled, String label, ActionType type2) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new ActionItem(enabled, label, type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionItem)) {
                return false;
            }
            ActionItem actionItem = (ActionItem) other;
            return this.enabled == actionItem.enabled && Intrinsics.areEqual(this.label, actionItem.label) && this.type == actionItem.type;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.enabled) * 31) + this.label.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "ActionItem(enabled=" + this.enabled + ", label=" + this.label + ", type=" + this.type + ")";
        }

        public ActionItem(boolean z, String label, ActionType type2) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.enabled = z;
            this.label = label;
            this.type = type2;
            this.tradeBarAction = new AbstractTradeBarOverlayView.ExpandAction.LegacyExpandAction(type2.ordinal(), label, z);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getLabel() {
            return this.label;
        }

        public final ActionType getType() {
            return this.type;
        }

        public final AbstractTradeBarOverlayView.ExpandAction.LegacyExpandAction getTradeBarAction() {
            return this.tradeBarAction;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionsDetailPageTradebarViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "OPTION_CHAIN", "BUY", "SELL", "OPEN", "CLOSE", "ROLL", "toEventButtonIdentifier", "", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ActionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType OPTION_CHAIN = new ActionType("OPTION_CHAIN", 0);
        public static final ActionType BUY = new ActionType("BUY", 1);
        public static final ActionType SELL = new ActionType("SELL", 2);
        public static final ActionType OPEN = new ActionType("OPEN", 3);
        public static final ActionType CLOSE = new ActionType("CLOSE", 4);
        public static final ActionType ROLL = new ActionType("ROLL", 5);

        /* compiled from: OptionsDetailPageTradebarViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ActionType.values().length];
                try {
                    iArr[ActionType.OPTION_CHAIN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ActionType.BUY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ActionType.SELL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ActionType.OPEN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ActionType.CLOSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ActionType.ROLL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{OPTION_CHAIN, BUY, SELL, OPEN, CLOSE, ROLL};
        }

        public static EnumEntries<ActionType> getEntries() {
            return $ENTRIES;
        }

        private ActionType(String str, int i) {
        }

        static {
            ActionType[] actionTypeArr$values = $values();
            $VALUES = actionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionTypeArr$values);
        }

        public final String toEventButtonIdentifier() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    return "options";
                case 2:
                    return "buy";
                case 3:
                    return "sell";
                case 4:
                    return "open";
                case 5:
                    return "close";
                case 6:
                    return "roll";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionsDetailPageTradebarViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B%\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError;", "", "error", "", "errorCta", "", "tradebarErrorComponentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;)V", "getError", "()Ljava/lang/CharSequence;", "getErrorCta", "()Ljava/lang/String;", "getTradebarErrorComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "NoCtaError", "GoToOpposingPosition", "GoToTradeOnExpirationSettings", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError$GoToOpposingPosition;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError$GoToTradeOnExpirationSettings;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError$NoCtaError;", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class TradebarError {
        public static final int $stable = 8;
        private final CharSequence error;
        private final String errorCta;
        private final Component.ComponentType tradebarErrorComponentType;

        public /* synthetic */ TradebarError(CharSequence charSequence, String str, Component.ComponentType componentType, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, str, componentType);
        }

        private TradebarError(CharSequence charSequence, String str, Component.ComponentType componentType) {
            this.error = charSequence;
            this.errorCta = str;
            this.tradebarErrorComponentType = componentType;
        }

        public CharSequence getError() {
            return this.error;
        }

        public String getErrorCta() {
            return this.errorCta;
        }

        public Component.ComponentType getTradebarErrorComponentType() {
            return this.tradebarErrorComponentType;
        }

        /* compiled from: OptionsDetailPageTradebarViewState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError$NoCtaError;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError;", "error", "", "tradebarErrorComponentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "<init>", "(Ljava/lang/CharSequence;Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;)V", "getError", "()Ljava/lang/CharSequence;", "getTradebarErrorComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoCtaError extends TradebarError {
            public static final int $stable = 8;
            private final CharSequence error;
            private final Component.ComponentType tradebarErrorComponentType;

            public static /* synthetic */ NoCtaError copy$default(NoCtaError noCtaError, CharSequence charSequence, Component.ComponentType componentType, int i, Object obj) {
                if ((i & 1) != 0) {
                    charSequence = noCtaError.error;
                }
                if ((i & 2) != 0) {
                    componentType = noCtaError.tradebarErrorComponentType;
                }
                return noCtaError.copy(charSequence, componentType);
            }

            /* renamed from: component1, reason: from getter */
            public final CharSequence getError() {
                return this.error;
            }

            /* renamed from: component2, reason: from getter */
            public final Component.ComponentType getTradebarErrorComponentType() {
                return this.tradebarErrorComponentType;
            }

            public final NoCtaError copy(CharSequence error, Component.ComponentType tradebarErrorComponentType) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new NoCtaError(error, tradebarErrorComponentType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoCtaError)) {
                    return false;
                }
                NoCtaError noCtaError = (NoCtaError) other;
                return Intrinsics.areEqual(this.error, noCtaError.error) && this.tradebarErrorComponentType == noCtaError.tradebarErrorComponentType;
            }

            public int hashCode() {
                int iHashCode = this.error.hashCode() * 31;
                Component.ComponentType componentType = this.tradebarErrorComponentType;
                return iHashCode + (componentType == null ? 0 : componentType.hashCode());
            }

            public String toString() {
                CharSequence charSequence = this.error;
                return "NoCtaError(error=" + ((Object) charSequence) + ", tradebarErrorComponentType=" + this.tradebarErrorComponentType + ")";
            }

            @Override // com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarViewState.TradebarError
            public CharSequence getError() {
                return this.error;
            }

            @Override // com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarViewState.TradebarError
            public Component.ComponentType getTradebarErrorComponentType() {
                return this.tradebarErrorComponentType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public NoCtaError(CharSequence error, Component.ComponentType componentType) {
                super(error, null, componentType, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
                this.tradebarErrorComponentType = componentType;
            }
        }

        /* compiled from: OptionsDetailPageTradebarViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError$GoToOpposingPosition;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError;", "error", "", "errorCta", "learnMoreFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getError", "()Ljava/lang/String;", "getErrorCta", "getLearnMoreFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GoToOpposingPosition extends TradebarError {
            public static final int $stable = 8;
            private final String error;
            private final String errorCta;
            private final FragmentKey learnMoreFragmentKey;

            public static /* synthetic */ GoToOpposingPosition copy$default(GoToOpposingPosition goToOpposingPosition, String str, String str2, FragmentKey fragmentKey, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = goToOpposingPosition.error;
                }
                if ((i & 2) != 0) {
                    str2 = goToOpposingPosition.errorCta;
                }
                if ((i & 4) != 0) {
                    fragmentKey = goToOpposingPosition.learnMoreFragmentKey;
                }
                return goToOpposingPosition.copy(str, str2, fragmentKey);
            }

            /* renamed from: component1, reason: from getter */
            public final String getError() {
                return this.error;
            }

            /* renamed from: component2, reason: from getter */
            public final String getErrorCta() {
                return this.errorCta;
            }

            /* renamed from: component3, reason: from getter */
            public final FragmentKey getLearnMoreFragmentKey() {
                return this.learnMoreFragmentKey;
            }

            public final GoToOpposingPosition copy(String error, String errorCta, FragmentKey learnMoreFragmentKey) {
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(errorCta, "errorCta");
                Intrinsics.checkNotNullParameter(learnMoreFragmentKey, "learnMoreFragmentKey");
                return new GoToOpposingPosition(error, errorCta, learnMoreFragmentKey);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GoToOpposingPosition)) {
                    return false;
                }
                GoToOpposingPosition goToOpposingPosition = (GoToOpposingPosition) other;
                return Intrinsics.areEqual(this.error, goToOpposingPosition.error) && Intrinsics.areEqual(this.errorCta, goToOpposingPosition.errorCta) && Intrinsics.areEqual(this.learnMoreFragmentKey, goToOpposingPosition.learnMoreFragmentKey);
            }

            public int hashCode() {
                return (((this.error.hashCode() * 31) + this.errorCta.hashCode()) * 31) + this.learnMoreFragmentKey.hashCode();
            }

            public String toString() {
                return "GoToOpposingPosition(error=" + this.error + ", errorCta=" + this.errorCta + ", learnMoreFragmentKey=" + this.learnMoreFragmentKey + ")";
            }

            @Override // com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarViewState.TradebarError
            public String getError() {
                return this.error;
            }

            @Override // com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarViewState.TradebarError
            public String getErrorCta() {
                return this.errorCta;
            }

            public final FragmentKey getLearnMoreFragmentKey() {
                return this.learnMoreFragmentKey;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public GoToOpposingPosition(String error, String errorCta, FragmentKey learnMoreFragmentKey) {
                super(error, errorCta, null, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(errorCta, "errorCta");
                Intrinsics.checkNotNullParameter(learnMoreFragmentKey, "learnMoreFragmentKey");
                this.error = error;
                this.errorCta = errorCta;
                this.learnMoreFragmentKey = learnMoreFragmentKey;
            }
        }

        /* compiled from: OptionsDetailPageTradebarViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError$GoToTradeOnExpirationSettings;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError;", "error", "", "errorCta", "tradebarErrorComponentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;)V", "getError", "()Ljava/lang/String;", "getErrorCta", "getTradebarErrorComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GoToTradeOnExpirationSettings extends TradebarError {
            public static final int $stable = 8;
            private final String error;
            private final String errorCta;
            private final Component.ComponentType tradebarErrorComponentType;

            public static /* synthetic */ GoToTradeOnExpirationSettings copy$default(GoToTradeOnExpirationSettings goToTradeOnExpirationSettings, String str, String str2, Component.ComponentType componentType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = goToTradeOnExpirationSettings.error;
                }
                if ((i & 2) != 0) {
                    str2 = goToTradeOnExpirationSettings.errorCta;
                }
                if ((i & 4) != 0) {
                    componentType = goToTradeOnExpirationSettings.tradebarErrorComponentType;
                }
                return goToTradeOnExpirationSettings.copy(str, str2, componentType);
            }

            /* renamed from: component1, reason: from getter */
            public final String getError() {
                return this.error;
            }

            /* renamed from: component2, reason: from getter */
            public final String getErrorCta() {
                return this.errorCta;
            }

            /* renamed from: component3, reason: from getter */
            public final Component.ComponentType getTradebarErrorComponentType() {
                return this.tradebarErrorComponentType;
            }

            public final GoToTradeOnExpirationSettings copy(String error, String errorCta, Component.ComponentType tradebarErrorComponentType) {
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(errorCta, "errorCta");
                return new GoToTradeOnExpirationSettings(error, errorCta, tradebarErrorComponentType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GoToTradeOnExpirationSettings)) {
                    return false;
                }
                GoToTradeOnExpirationSettings goToTradeOnExpirationSettings = (GoToTradeOnExpirationSettings) other;
                return Intrinsics.areEqual(this.error, goToTradeOnExpirationSettings.error) && Intrinsics.areEqual(this.errorCta, goToTradeOnExpirationSettings.errorCta) && this.tradebarErrorComponentType == goToTradeOnExpirationSettings.tradebarErrorComponentType;
            }

            public int hashCode() {
                int iHashCode = ((this.error.hashCode() * 31) + this.errorCta.hashCode()) * 31;
                Component.ComponentType componentType = this.tradebarErrorComponentType;
                return iHashCode + (componentType == null ? 0 : componentType.hashCode());
            }

            public String toString() {
                return "GoToTradeOnExpirationSettings(error=" + this.error + ", errorCta=" + this.errorCta + ", tradebarErrorComponentType=" + this.tradebarErrorComponentType + ")";
            }

            @Override // com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarViewState.TradebarError
            public String getError() {
                return this.error;
            }

            @Override // com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarViewState.TradebarError
            public String getErrorCta() {
                return this.errorCta;
            }

            @Override // com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarViewState.TradebarError
            public Component.ComponentType getTradebarErrorComponentType() {
                return this.tradebarErrorComponentType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoToTradeOnExpirationSettings(String error, String errorCta, Component.ComponentType componentType) {
                super(error, errorCta, componentType, null);
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(errorCta, "errorCta");
                this.error = error;
                this.errorCta = errorCta;
                this.tradebarErrorComponentType = componentType;
            }
        }
    }
}
