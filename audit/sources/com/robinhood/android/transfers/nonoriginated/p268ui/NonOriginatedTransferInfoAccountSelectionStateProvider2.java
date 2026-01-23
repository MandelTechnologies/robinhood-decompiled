package com.robinhood.android.transfers.nonoriginated.p268ui;

import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.nonoriginated.C30403R;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorRowData;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: NonOriginatedTransferInfoAccountSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\n*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDataState;", "Lcom/robinhood/utils/resource/StringResource;", "title", "(Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDataState;)Lcom/robinhood/utils/resource/StringResource;", "", "Lcom/robinhood/models/db/Account;", "Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "transferType", "filterByTransferType", "(Ljava/util/List;Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;)Ljava/util/List;", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "(Lcom/robinhood/models/db/bonfire/RhyAccount;Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;)Lcom/robinhood/models/db/bonfire/RhyAccount;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorRowData;", "toAccountSelectorRowData", "(Lcom/robinhood/models/db/bonfire/RhyAccount;Lj$/time/Clock;)Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorRowData;", "feature-non-originated-transfer-info_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class NonOriginatedTransferInfoAccountSelectionStateProvider2 {

    /* compiled from: NonOriginatedTransferInfoAccountSelectionStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NonOriginatedTransferTypeDto.values().length];
            try {
                iArr[NonOriginatedTransferTypeDto.f314DD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NonOriginatedTransferTypeDto.WIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NonOriginatedTransferTypeDto.FAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NonOriginatedTransferTypeDto.TRANSFER_TYPE_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource title(NonOriginatedTransferInfoAccountSelectionDataState nonOriginatedTransferInfoAccountSelectionDataState) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(nonOriginatedTransferInfoAccountSelectionDataState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[nonOriginatedTransferInfoAccountSelectionDataState.getTransferType().ordinal()];
        if (i == 1) {
            numValueOf = Integer.valueOf(C30403R.string.title_for_direct_deposits);
        } else if (i == 2) {
            numValueOf = Integer.valueOf(C30403R.string.title_for_incoming_wires);
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(numValueOf.intValue(), new Object[0]);
    }

    public static final List<Account> filterByTransferType(List<Account> list, NonOriginatedTransferTypeDto transferType) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Account account = (Account) obj;
            int i = WhenMappings.$EnumSwitchMapping$0[transferType.ordinal()];
            if (i == 1) {
                if (account.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL && !account.isManaged()) {
                    arrayList.add(obj);
                }
            } else {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (account.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL) {
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final RhyAccount filterByTransferType(RhyAccount rhyAccount, NonOriginatedTransferTypeDto transferType) {
        Intrinsics.checkNotNullParameter(rhyAccount, "<this>");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        int i = WhenMappings.$EnumSwitchMapping$0[transferType.ordinal()];
        if (i == 1) {
            return rhyAccount;
        }
        if (i == 2 || i == 3 || i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AccountSelectorRowData toAccountSelectorRowData(RhyAccount rhyAccount, Clock clock) {
        Intrinsics.checkNotNullParameter(rhyAccount, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        BrokerageAccountType brokerageAccountType = BrokerageAccountType.UNKNOWN;
        ManagementType managementType = ManagementType.UNKNOWN;
        Instant createdAt = rhyAccount.getCreatedAt();
        if (createdAt == null) {
            createdAt = Instant.now(clock);
        }
        Instant instant = createdAt;
        Intrinsics.checkNotNull(instant);
        String string2 = rhyAccount.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new AccountSelectorRowData(brokerageAccountType, managementType, instant, null, string2, StringResource.INSTANCE.invoke(C30403R.string.account_type_spending, new Object[0]), null, ServerToBentoAssetMapper2.CASH_24, null, null, false, 1864, null);
    }
}
