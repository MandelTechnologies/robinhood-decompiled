package com.robinhood.android.lib.trade.view;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.converters.brokerage.ManagementTypes2;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import com.robinhood.utils.resource.StringResource;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import contracts.account_switcher.proto.p427v1.SurfaceTradeAccountSwitcherDto;
import contracts.account_switcher.proto.p427v1.TradeAccountSwitcherAccountRowDto;
import contracts.account_switcher.proto.p427v1.TradeAccountSwitcherDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.IconDto;
import rosetta.account.BrokerageAccountTypeDto;

/* compiled from: AccountSwitcherExtensions.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u001a\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\u0010*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0011"}, m3636d2 = {"asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "getAsset", "(Lcom/robinhood/models/serverdriven/experimental/api/Icon;)Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "toAccountSwitcherRow", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData;", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher$Account;", "toAccountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher$ViewModel;", "activeAccountNumber", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "toAccountSwitcherSurface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "feature-lib-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.trade.view.AccountSwitcherExtensionsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AccountSwitcherExtensions {
    public static final ServerToBentoAssetMapper2 getAsset(Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "<this>");
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon.getServerValue());
        return serverToBentoAssetMapper2FromServerValue == null ? ServerToBentoAssetMapper2.UNKNOWN : serverToBentoAssetMapper2FromServerValue;
    }

    public static final AccountSwitcherRowData toAccountSwitcherRow(InstrumentAccountSwitcher.Account account) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(account.getTitle());
        String subtitle = account.getSubtitle();
        StringResource stringResourceInvoke2 = subtitle != null ? companion.invoke(subtitle) : null;
        String metadataTitle = account.getMetadataTitle();
        String metadataSubtitle = account.getMetadataSubtitle();
        boolean zIsSelectable = account.isSelectable();
        return new AccountSwitcherRowData.Account(account.getAccountNumber(), account.getBrokerageAccountType(), account.getManagementType(), account.getCreatedAt(), account.getLoggingIdentifier(), stringResourceInvoke, stringResourceInvoke2, metadataTitle, metadataSubtitle, getAsset(account.getIcon()), zIsSelectable);
    }

    public static final AccountSwitcherData toAccountSwitcherData(InstrumentAccountSwitcher.ViewModel viewModel, String activeAccountNumber, Screen screen) {
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        Intrinsics.checkNotNullParameter(screen, "screen");
        String title = viewModel.getTitle();
        String positiveButtonText = viewModel.getPositiveButtonText();
        List<InstrumentAccountSwitcher.Account> accounts2 = viewModel.getAccounts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
        Iterator<T> it = accounts2.iterator();
        while (it.hasNext()) {
            arrayList.add(toAccountSwitcherRow((InstrumentAccountSwitcher.Account) it.next()));
        }
        return new AccountSwitcherData(arrayList, activeAccountNumber, false, screen, positiveButtonText, null, title, 36, null);
    }

    public static final SurfaceDto toAccountSwitcherSurface(InstrumentAccountSwitcher.ViewModel viewModel, String activeAccountNumber) {
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        String title = viewModel.getTitle();
        String positiveButtonText = viewModel.getPositiveButtonText();
        List<InstrumentAccountSwitcher.Account> accounts2 = viewModel.getAccounts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
        for (InstrumentAccountSwitcher.Account account : accounts2) {
            String accountNumber = account.getAccountNumber();
            String title2 = account.getTitle();
            String subtitle = account.getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            String str = subtitle;
            String metadataTitle = account.getMetadataTitle();
            String metadataSubtitle = account.getMetadataSubtitle();
            boolean zIsSelectable = account.isSelectable();
            BrokerageAccountTypeDto dto = BrokerageAccountTypes3.toDto(account.getBrokerageAccountType());
            IconDto.Companion companion = IconDto.INSTANCE;
            rh_server_driven_ui.p531v1.Icon iconFromValue = rh_server_driven_ui.p531v1.Icon.INSTANCE.fromValue(account.getIcon().ordinal());
            if (iconFromValue == null) {
                iconFromValue = rh_server_driven_ui.p531v1.Icon.ICON_UNSPECIFIED;
            }
            arrayList.add(new TradeAccountSwitcherAccountRowDto(accountNumber, dto, ManagementTypes2.toDto(account.getManagementType()), title2, str, metadataTitle, metadataSubtitle, companion.fromProto(iconFromValue), zIsSelectable, account.getLoggingIdentifier(), account.getCreatedAt()));
        }
        return new SurfaceDto(new SurfaceDto.TypeDto.Trade(new SurfaceTradeAccountSwitcherDto(activeAccountNumber, new TradeAccountSwitcherDto(title, arrayList, positiveButtonText))));
    }
}
