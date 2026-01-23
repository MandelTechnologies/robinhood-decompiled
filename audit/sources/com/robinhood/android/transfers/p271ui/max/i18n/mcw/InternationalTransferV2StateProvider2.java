package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaPromotion;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.common.TransferAmountEntryLayout;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2ViewState;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InternationalTransferV2StateProvider.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0002\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0002H\u0002\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0000\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0000\u001a(\u0010\r\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0002H\u0002\u001a\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u001a\u001a\u00020\u0013*\u00020\u0002H\u0002\u001a\f\u0010\u001b\u001a\u00020\u0013*\u00020\u0002H\u0002\u001a\f\u0010\u001c\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0002\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\"\u001e\u0010\u0012\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00050\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"getToolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;", "getDisplayText", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "currency", "Ljava/util/Currency;", "getSourceAccountRowState", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState;", "getSinkAccountRowState", "getSourceAccount", "getSinkAccount", "getAccountByIdOrDefault", "accountId", "depositAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "withdrawAccountType", "hasLinkedExternalAccount", "", "", "getHasLinkedExternalAccount", "(Ljava/util/List;)Z", "getTransferSummaryRequest", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "getSourceDropdownChipText", "isPrimaryButtonEnabled", "isPrimaryButtonLoading", "getPrimaryButtonText", "getAmountInputPrimaryAction", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction;", "getPromotionInfoTagText", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2StateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternationalTransferV2StateProvider2 {

    /* compiled from: InternationalTransferV2StateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2StateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferDirectionV2.values().length];
            try {
                iArr[TransferDirectionV2.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirectionV2.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferDirectionV2.INTER_ENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransferAmountEntryLayout.values().length];
            try {
                iArr2[TransferAmountEntryLayout.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TransferAmountEntryLayout.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StringResource getToolbarTitle(InternationalTransferV2DataState internationalTransferV2DataState) {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[internationalTransferV2DataState.getTransferDirection().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = C30065R.string.mcw_withdraw_title;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C30065R.string.mcw_inter_entity_transfer_title;
            }
        } else if (internationalTransferV2DataState.getEntryPoint() == MAXTransferContext.EntryPoint.ISA_CONTRIBUTION) {
            i = C30065R.string.mcw_isa_contribution_title;
        } else {
            i = C30065R.string.mcw_deposit_title;
        }
        return companion.invoke(i, new Object[0]);
    }

    private static final String getDisplayText(TransferAccount transferAccount, Currency currency) {
        Money money;
        Object next;
        if (transferAccount.isExternal()) {
            return transferAccount.getDisplayTitle();
        }
        List<Money> currencyBalances = transferAccount.getCurrencyBalances();
        if (currencyBalances != null) {
            Iterator<T> it = currencyBalances.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Money) next).getCurrency(), currency)) {
                    break;
                }
            }
            money = (Money) next;
        } else {
            money = null;
        }
        String orDefault$default = Money3.formatOrDefault$default(money, null, null, 3, null);
        return transferAccount.getAccountName() + " · " + orDefault$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternationalTransferV2ViewState.AccountRowState getSourceAccountRowState(InternationalTransferV2DataState internationalTransferV2DataState) {
        if (internationalTransferV2DataState.getTransferAccounts() == null) {
            return InternationalTransferV2ViewState.AccountRowState.INSTANCE.placeholder();
        }
        if (internationalTransferV2DataState.isAddingNewAccount()) {
            return InternationalTransferV2ViewState.AccountRowState.INSTANCE.newBankAccount(true);
        }
        if (getHasLinkedExternalAccount(internationalTransferV2DataState.getTransferAccounts())) {
            TransferAccount sourceAccount = getSourceAccount(internationalTransferV2DataState);
            return sourceAccount == null ? InternationalTransferV2ViewState.AccountRowState.INSTANCE.selectAccount() : new InternationalTransferV2ViewState.AccountRowState(StringResource.INSTANCE.invoke(getDisplayText(sourceAccount, Currencies.GBP)), true, false);
        }
        return InternationalTransferV2ViewState.AccountRowState.INSTANCE.newBankAccount(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternationalTransferV2ViewState.AccountRowState getSinkAccountRowState(InternationalTransferV2DataState internationalTransferV2DataState) {
        if (internationalTransferV2DataState.getTransferAccounts() == null) {
            return InternationalTransferV2ViewState.AccountRowState.INSTANCE.placeholder();
        }
        TransferAccount sinkAccount = getSinkAccount(internationalTransferV2DataState);
        return sinkAccount == null ? InternationalTransferV2ViewState.AccountRowState.INSTANCE.selectAccount() : new InternationalTransferV2ViewState.AccountRowState(StringResource.INSTANCE.invoke(getDisplayText(sinkAccount, Currencies.GBP)), true, false);
    }

    public static final TransferAccount getSourceAccount(InternationalTransferV2DataState internationalTransferV2DataState) {
        Intrinsics.checkNotNullParameter(internationalTransferV2DataState, "<this>");
        if (internationalTransferV2DataState.isAddingNewAccount()) {
            return null;
        }
        return getAccountByIdOrDefault(internationalTransferV2DataState, internationalTransferV2DataState.getSourceAccountId(), ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT, ApiTransferAccount.TransferAccountType.RHS);
    }

    public static final TransferAccount getSinkAccount(InternationalTransferV2DataState internationalTransferV2DataState) {
        Intrinsics.checkNotNullParameter(internationalTransferV2DataState, "<this>");
        return getAccountByIdOrDefault(internationalTransferV2DataState, internationalTransferV2DataState.getSinkAccountId(), ApiTransferAccount.TransferAccountType.RHS, ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT);
    }

    private static final TransferAccount getAccountByIdOrDefault(InternationalTransferV2DataState internationalTransferV2DataState, String str, ApiTransferAccount.TransferAccountType transferAccountType, ApiTransferAccount.TransferAccountType transferAccountType2) {
        Object obj = null;
        if (str != null) {
            List<TransferAccount> transferAccounts = internationalTransferV2DataState.getTransferAccounts();
            if (transferAccounts == null) {
                return null;
            }
            Iterator<T> it = transferAccounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((TransferAccount) next).getAccountId(), str)) {
                    obj = next;
                    break;
                }
            }
            return (TransferAccount) obj;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[internationalTransferV2DataState.getTransferDirection().ordinal()];
        if (i == 1) {
            List<TransferAccount> transferAccounts2 = internationalTransferV2DataState.getTransferAccounts();
            if (transferAccounts2 == null) {
                return null;
            }
            Iterator<T> it2 = transferAccounts2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((TransferAccount) next2).getType() == transferAccountType) {
                    obj = next2;
                    break;
                }
            }
            return (TransferAccount) obj;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        List<TransferAccount> transferAccounts3 = internationalTransferV2DataState.getTransferAccounts();
        if (transferAccounts3 == null) {
            return null;
        }
        Iterator<T> it3 = transferAccounts3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (((TransferAccount) next3).getType() == transferAccountType2) {
                obj = next3;
                break;
            }
        }
        return (TransferAccount) obj;
    }

    public static final boolean getHasLinkedExternalAccount(List<TransferAccount> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<TransferAccount> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (TransferAccount transferAccount : list2) {
            if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT && transferAccount.getAccountName().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiTransferSummaryRequest getTransferSummaryRequest(InternationalTransferV2DataState internationalTransferV2DataState) {
        TransferDirectionV2 transferDirection = internationalTransferV2DataState.getTransferDirection();
        TransferAccount sourceAccount = getSourceAccount(internationalTransferV2DataState);
        ApiTransferSummaryRequest.Account account = sourceAccount != null ? new ApiTransferSummaryRequest.Account(sourceAccount.getAccountId(), sourceAccount.getType(), internationalTransferV2DataState.getAmount().getCurrency().getCurrencyCode()) : null;
        TransferAccount sinkAccount = getSinkAccount(internationalTransferV2DataState);
        return new ApiTransferSummaryRequest(account, sinkAccount != null ? new ApiTransferSummaryRequest.Account(sinkAccount.getAccountId(), sinkAccount.getType(), internationalTransferV2DataState.getAmount().getCurrency().getCurrencyCode()) : null, Integer.valueOf(internationalTransferV2DataState.getEntryPoint().getValue()), null, transferDirection, internationalTransferV2DataState.getAmount().getDecimalValue(), null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StringResource getSourceDropdownChipText(InternationalTransferV2DataState internationalTransferV2DataState) {
        int i = WhenMappings.$EnumSwitchMapping$0[internationalTransferV2DataState.getTransferDirection().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = WhenMappings.$EnumSwitchMapping$1[internationalTransferV2DataState.getAmountEntryState().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            TransferAccount sourceAccount = getSourceAccount(internationalTransferV2DataState);
            if (sourceAccount != null) {
                return StringResource.INSTANCE.invoke(sourceAccount.getAccountName());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isPrimaryButtonEnabled(InternationalTransferV2DataState internationalTransferV2DataState) {
        int i = WhenMappings.$EnumSwitchMapping$1[internationalTransferV2DataState.getAmountEntryState().ordinal()];
        if (i == 1) {
            return internationalTransferV2DataState.getAmount().isPositive();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        TransferAccount sourceAccount = getSourceAccount(internationalTransferV2DataState);
        return !(sourceAccount == null || getSinkAccount(internationalTransferV2DataState) == null) || (internationalTransferV2DataState.getTransferDirection() == TransferDirectionV2.DEPOSIT && sourceAccount == null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isPrimaryButtonLoading(InternationalTransferV2DataState internationalTransferV2DataState) {
        int i = WhenMappings.$EnumSwitchMapping$1[internationalTransferV2DataState.getAmountEntryState().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return internationalTransferV2DataState.isCreatingTransfer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StringResource getPrimaryButtonText(InternationalTransferV2DataState internationalTransferV2DataState) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$1[internationalTransferV2DataState.getAmountEntryState().ordinal()];
        if (i2 == 1) {
            return StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0]);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i3 = WhenMappings.$EnumSwitchMapping$0[internationalTransferV2DataState.getTransferDirection().ordinal()];
        if (i3 == 1) {
            i = C30065R.string.deposit_action;
        } else if (i3 == 2) {
            i = C30065R.string.withdraw_action;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C30065R.string.transfer_action;
        }
        return companion.invoke(i, Money.format$default(internationalTransferV2DataState.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternationalTransferV2ViewState.AmountInputPrimaryAction getAmountInputPrimaryAction(InternationalTransferV2DataState internationalTransferV2DataState) {
        int i = WhenMappings.$EnumSwitchMapping$0[internationalTransferV2DataState.getTransferDirection().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return new InternationalTransferV2ViewState.AmountInputPrimaryAction.ContinueButton(internationalTransferV2DataState.getAmount().isPositive());
            }
            throw new NoWhenBranchMatchedException();
        }
        List<Money> suggestedDepositAmounts = internationalTransferV2DataState.getSuggestedDepositAmounts();
        if (internationalTransferV2DataState.getAmount().isZero() && suggestedDepositAmounts != null) {
            return new InternationalTransferV2ViewState.AmountInputPrimaryAction.SuggestedAmounts(extensions2.toImmutableList(suggestedDepositAmounts));
        }
        return new InternationalTransferV2ViewState.AmountInputPrimaryAction.ContinueButton(internationalTransferV2DataState.getAmount().isPositive());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StringResource getPromotionInfoTagText(InternationalTransferV2DataState internationalTransferV2DataState) {
        Float matchRate;
        IsaPromotion isaPromotion = internationalTransferV2DataState.getIsaPromotion();
        if (isaPromotion != null) {
            if (internationalTransferV2DataState.getTransferDirection() != TransferDirectionV2.DEPOSIT || internationalTransferV2DataState.getEntryPoint() != MAXTransferContext.EntryPoint.ISA_CONTRIBUTION || !isaPromotion.isActive()) {
                isaPromotion = null;
            }
            if (isaPromotion != null && (matchRate = isaPromotion.getMatchRate()) != null) {
                return StringResource.INSTANCE.invoke(C30065R.string.mcw_isa_contribution_promotion_info_tag, Integer.valueOf((int) (matchRate.floatValue() * 100)));
            }
        }
        return null;
    }
}
