package com.robinhood.android.common.options.accountswitcher;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.accountswitcher.ApiOptionsAccountSwitcherModel;
import com.robinhood.models.api.bonfire.instrument.ApiInstrumentAccountSwitcherV2;
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

/* compiled from: AccountSwitchers.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u001a\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\u0010*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0011"}, m3636d2 = {"asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "getAsset", "(Lcom/robinhood/models/serverdriven/experimental/api/Icon;)Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "toAccountSwitcherRow", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData;", "Lcom/robinhood/models/api/bonfire/instrument/ApiInstrumentAccountSwitcherV2$Account;", "toAccountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "Lcom/robinhood/models/api/accountswitcher/ApiOptionsAccountSwitcherModel;", "activeAccountNumber", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "toAccountSwitcherSurface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.options.accountswitcher.AccountSwitchersKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AccountSwitchers {
    public static final ServerToBentoAssetMapper2 getAsset(Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "<this>");
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon.getServerValue());
        return serverToBentoAssetMapper2FromServerValue == null ? ServerToBentoAssetMapper2.UNKNOWN : serverToBentoAssetMapper2FromServerValue;
    }

    public static final AccountSwitcherRowData toAccountSwitcherRow(ApiInstrumentAccountSwitcherV2.Account account) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(account.getTitle());
        String subtitle = account.getSubtitle();
        StringResource stringResourceInvoke2 = subtitle != null ? companion.invoke(subtitle) : null;
        String metadata_title = account.getMetadata_title();
        String metadata_subtitle = account.getMetadata_subtitle();
        boolean zIs_selectable = account.is_selectable();
        return new AccountSwitcherRowData.Account(account.getAccount_number(), account.getBrokerage_account_type(), account.getManagement_type(), account.getCreated_at(), account.getLogging_identifier(), stringResourceInvoke, stringResourceInvoke2, metadata_title, metadata_subtitle, getAsset(account.getIcon()), zIs_selectable);
    }

    public static final AccountSwitcherData toAccountSwitcherData(ApiOptionsAccountSwitcherModel apiOptionsAccountSwitcherModel, String activeAccountNumber, Screen screen) {
        Intrinsics.checkNotNullParameter(apiOptionsAccountSwitcherModel, "<this>");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        Intrinsics.checkNotNullParameter(screen, "screen");
        String title = apiOptionsAccountSwitcherModel.getTitle();
        String positive_button_text = apiOptionsAccountSwitcherModel.getPositive_button_text();
        List<ApiInstrumentAccountSwitcherV2.Account> accounts2 = apiOptionsAccountSwitcherModel.getAccounts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
        Iterator<T> it = accounts2.iterator();
        while (it.hasNext()) {
            arrayList.add(toAccountSwitcherRow((ApiInstrumentAccountSwitcherV2.Account) it.next()));
        }
        return new AccountSwitcherData(arrayList, activeAccountNumber, false, screen, positive_button_text, null, title, 36, null);
    }

    public static final SurfaceDto toAccountSwitcherSurface(ApiOptionsAccountSwitcherModel apiOptionsAccountSwitcherModel, String activeAccountNumber) {
        Intrinsics.checkNotNullParameter(apiOptionsAccountSwitcherModel, "<this>");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        String title = apiOptionsAccountSwitcherModel.getTitle();
        String positive_button_text = apiOptionsAccountSwitcherModel.getPositive_button_text();
        List<ApiInstrumentAccountSwitcherV2.Account> accounts2 = apiOptionsAccountSwitcherModel.getAccounts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
        for (ApiInstrumentAccountSwitcherV2.Account account : accounts2) {
            String account_number = account.getAccount_number();
            String title2 = account.getTitle();
            String subtitle = account.getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            String str = subtitle;
            String metadata_title = account.getMetadata_title();
            String metadata_subtitle = account.getMetadata_subtitle();
            boolean zIs_selectable = account.is_selectable();
            BrokerageAccountTypeDto dto = BrokerageAccountTypes3.toDto(account.getBrokerage_account_type());
            IconDto.Companion companion = IconDto.INSTANCE;
            rh_server_driven_ui.p531v1.Icon iconFromValue = rh_server_driven_ui.p531v1.Icon.INSTANCE.fromValue(account.getIcon().ordinal());
            if (iconFromValue == null) {
                iconFromValue = rh_server_driven_ui.p531v1.Icon.ICON_UNSPECIFIED;
            }
            arrayList.add(new TradeAccountSwitcherAccountRowDto(account_number, dto, ManagementTypes2.toDto(account.getManagement_type()), title2, str, metadata_title, metadata_subtitle, companion.fromProto(iconFromValue), zIs_selectable, account.getLogging_identifier(), account.getCreated_at()));
        }
        return new SurfaceDto(new SurfaceDto.TypeDto.Trade(new SurfaceTradeAccountSwitcherDto(activeAccountNumber, new TradeAccountSwitcherDto(title, arrayList, positive_button_text))));
    }
}
