package com.robinhood.shared.crypto.utils;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherViewModel;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.IconDto;

/* compiled from: CryptoAccountSwitcherViewModels.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"toAccountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherViewModel;", "activeAccountNumber", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.utils.CryptoAccountSwitcherViewModelsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAccountSwitcherViewModels {
    public static final AccountSwitcherData toAccountSwitcherData(CryptoAccountSwitcherViewModel cryptoAccountSwitcherViewModel, String activeAccountNumber, Screen eventScreen) {
        Intrinsics.checkNotNullParameter(cryptoAccountSwitcherViewModel, "<this>");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        List<CryptoAccountSwitcherAccount> accounts2 = cryptoAccountSwitcherViewModel.getAccounts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
        for (CryptoAccountSwitcherAccount cryptoAccountSwitcherAccount : accounts2) {
            String rhfAccountNumber = cryptoAccountSwitcherAccount.getRhfAccountNumber();
            BrokerageAccountType brokerageAccountType = cryptoAccountSwitcherAccount.getBrokerageAccountType();
            ManagementType managementType = cryptoAccountSwitcherAccount.getManagementType();
            Instant createdAt = cryptoAccountSwitcherAccount.getCreatedAt();
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(cryptoAccountSwitcherAccount.getTitle());
            String subtitle = cryptoAccountSwitcherAccount.getSubtitle();
            StringResource stringResourceInvoke2 = subtitle != null ? companion.invoke(subtitle) : null;
            ServerToBentoAssetMapper2 bentoAsset = SduiIcon2.toBentoAsset(IconDto.INSTANCE.fromProto(cryptoAccountSwitcherAccount.getIcon()));
            if (bentoAsset == null) {
                bentoAsset = ServerToBentoAssetMapper2.ROBINHOOD_24;
            }
            arrayList.add(new AccountSwitcherRowData.Account(rhfAccountNumber, brokerageAccountType, managementType, createdAt, null, stringResourceInvoke, stringResourceInvoke2, null, null, bentoAsset, cryptoAccountSwitcherAccount.isSelectable(), 400, null));
        }
        return new AccountSwitcherData(arrayList, new AccountSwitcherData.ActiveSelection.AccountRow(activeAccountNumber), false, false, eventScreen, cryptoAccountSwitcherViewModel.getPositiveButtonText(), null, cryptoAccountSwitcherViewModel.getTitle(), 64, null);
    }
}
