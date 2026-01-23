package com.robinhood.android.lib.trade.view;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradeAccountSwitcherState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0001!R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0012\u0010\u001d\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0012\u0010\u001f\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001a¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState;", "", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "activeAccountNumber", "", "getActiveAccountNumber", "()Ljava/lang/String;", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "getAllAccounts", "()Ljava/util/List;", "loadedState", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState$LoadedState;", "getLoadedState", "()Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState$LoadedState;", "activeAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "getActiveAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "fallbackAccountSelectable", "", "getFallbackAccountSelectable", "()Z", "loading", "getLoading", "enableAccountSwitching", "getEnableAccountSwitching", "useSduiAccountSwitcher", "getUseSduiAccountSwitcher", "LoadedState", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface TradeAccountSwitcherState {
    String getActiveAccountNumber();

    BrokerageAccountType getActiveAccountType();

    List<Account> getAllAccounts();

    boolean getEnableAccountSwitching();

    boolean getFallbackAccountSelectable();

    LoadedState getLoadedState();

    boolean getLoading();

    Screen.Name getScreenName();

    boolean getUseSduiAccountSwitcher();

    /* compiled from: TradeAccountSwitcherState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static BrokerageAccountType getActiveAccountType(TradeAccountSwitcherState tradeAccountSwitcherState) {
            Object next;
            Iterator<T> it = tradeAccountSwitcherState.getAllAccounts().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Account) next).getAccountNumber(), tradeAccountSwitcherState.getActiveAccountNumber())) {
                    break;
                }
            }
            Account account = (Account) next;
            if (account != null) {
                return account.getBrokerageAccountType();
            }
            return null;
        }
    }

    /* compiled from: TradeAccountSwitcherState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState$LoadedState;", "", "title", "", "leadingIcon", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "surface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Icon;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;Lcontracts/account_switcher/proto/v1/SurfaceDto;)V", "getTitle", "()Ljava/lang/String;", "getLeadingIcon", "()Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "getData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getSurface", "()Lcontracts/account_switcher/proto/v1/SurfaceDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoadedState {
        public static final int $stable = 8;
        private final AccountSwitcherData data;
        private final Icon leadingIcon;
        private final SurfaceDto surface;
        private final String title;

        public static /* synthetic */ LoadedState copy$default(LoadedState loadedState, String str, Icon icon, AccountSwitcherData accountSwitcherData, SurfaceDto surfaceDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadedState.title;
            }
            if ((i & 2) != 0) {
                icon = loadedState.leadingIcon;
            }
            if ((i & 4) != 0) {
                accountSwitcherData = loadedState.data;
            }
            if ((i & 8) != 0) {
                surfaceDto = loadedState.surface;
            }
            return loadedState.copy(str, icon, accountSwitcherData, surfaceDto);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Icon getLeadingIcon() {
            return this.leadingIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final AccountSwitcherData getData() {
            return this.data;
        }

        /* renamed from: component4, reason: from getter */
        public final SurfaceDto getSurface() {
            return this.surface;
        }

        public final LoadedState copy(String title, Icon leadingIcon, AccountSwitcherData data, SurfaceDto surface) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(leadingIcon, "leadingIcon");
            Intrinsics.checkNotNullParameter(data, "data");
            return new LoadedState(title, leadingIcon, data, surface);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadedState)) {
                return false;
            }
            LoadedState loadedState = (LoadedState) other;
            return Intrinsics.areEqual(this.title, loadedState.title) && this.leadingIcon == loadedState.leadingIcon && Intrinsics.areEqual(this.data, loadedState.data) && Intrinsics.areEqual(this.surface, loadedState.surface);
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.leadingIcon.hashCode()) * 31) + this.data.hashCode()) * 31;
            SurfaceDto surfaceDto = this.surface;
            return iHashCode + (surfaceDto == null ? 0 : surfaceDto.hashCode());
        }

        public String toString() {
            return "LoadedState(title=" + this.title + ", leadingIcon=" + this.leadingIcon + ", data=" + this.data + ", surface=" + this.surface + ")";
        }

        public LoadedState(String title, Icon leadingIcon, AccountSwitcherData data, SurfaceDto surfaceDto) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(leadingIcon, "leadingIcon");
            Intrinsics.checkNotNullParameter(data, "data");
            this.title = title;
            this.leadingIcon = leadingIcon;
            this.data = data;
            this.surface = surfaceDto;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Icon getLeadingIcon() {
            return this.leadingIcon;
        }

        public final AccountSwitcherData getData() {
            return this.data;
        }

        public final SurfaceDto getSurface() {
            return this.surface;
        }
    }
}
