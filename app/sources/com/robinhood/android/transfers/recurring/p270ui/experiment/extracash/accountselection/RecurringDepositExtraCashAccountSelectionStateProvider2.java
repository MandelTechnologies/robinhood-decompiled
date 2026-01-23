package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import android.content.res.Resources;
import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionViewState;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringDepositExtraCashAccountSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\fH\u0000\u001a\f\u0010\r\u001a\u00020\b*\u00020\u000eH\u0000\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0011\u001a\u00020\b*\u00020\u000eH\u0000¨\u0006\u0012"}, m3636d2 = {"toRow", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionViewState$Row;", "Lcom/robinhood/models/db/AchRelationship;", "resources", "Landroid/content/res/Resources;", "estimatedBalance", "Ljava/math/BigDecimal;", "hasExistingRecurringDeposit", "", "selectedAccountId", "Ljava/util/UUID;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "", "isAddAccountButtonVisible", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDataState;", "infoBannerMessage", "Landroidx/compose/ui/text/AnnotatedString;", "isContinueButtonEnabled", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashAccountSelectionStateProvider2 {
    public static final RecurringDepositExtraCashAccountSelectionViewState.Row toRow(AchRelationship achRelationship, Resources resources, BigDecimal bigDecimal, boolean z, UUID uuid) {
        String str;
        Money money$default;
        Intrinsics.checkNotNullParameter(achRelationship, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Either.Left leftAsLeft = Either2.asLeft(achRelationship);
        String achRelationshipDisplayName = AchRelationships.getAchRelationshipDisplayName(achRelationship, resources);
        if (bigDecimal == null || (money$default = Money3.toMoney$default(bigDecimal, null, 1, null)) == null || (str = Money.format$default(money$default, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            str = "-";
        }
        return new RecurringDepositExtraCashAccountSelectionViewState.Row(leftAsLeft, null, achRelationshipDisplayName, str, !z, Intrinsics.areEqual(achRelationship.getId(), uuid));
    }

    public static final RecurringDepositExtraCashAccountSelectionViewState.Row toRow(TransferAccount transferAccount, String str) {
        String str2;
        Money money$default;
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        Either.Right rightAsRight = Either2.asRight(transferAccount);
        String accountName = transferAccount.getAccountName();
        BigDecimal withdrawableCash = transferAccount.getWithdrawableCash();
        if (withdrawableCash == null || (money$default = Money3.toMoney$default(withdrawableCash, null, 1, null)) == null || (str2 = Money.format$default(money$default, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            str2 = "-";
        }
        return new RecurringDepositExtraCashAccountSelectionViewState.Row(rightAsRight, null, accountName, str2, true, Intrinsics.areEqual(transferAccount.getAccountId(), str));
    }

    public static final boolean isAddAccountButtonVisible(RecurringDepositExtraCashAccountSelectionDataState recurringDepositExtraCashAccountSelectionDataState) {
        Intrinsics.checkNotNullParameter(recurringDepositExtraCashAccountSelectionDataState, "<this>");
        Either<List<AchRelationship>, List<TransferAccount>> accounts2 = recurringDepositExtraCashAccountSelectionDataState.getAccounts();
        if (accounts2 instanceof Either.Left) {
            return true;
        }
        if ((accounts2 instanceof Either.Right) || accounts2 == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AnnotatedString infoBannerMessage(RecurringDepositExtraCashAccountSelectionDataState recurringDepositExtraCashAccountSelectionDataState, Resources resources) throws Resources.NotFoundException {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(recurringDepositExtraCashAccountSelectionDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Either<List<AchRelationship>, List<TransferAccount>> accounts2 = recurringDepositExtraCashAccountSelectionDataState.getAccounts();
        if (accounts2 instanceof Either.Left) {
            if (((List) ((Either.Left) recurringDepositExtraCashAccountSelectionDataState.getAccounts()).getValue()).isEmpty()) {
                numValueOf = Integer.valueOf(C30439R.string.external_account_selection_info_banner_link_account);
            } else if (recurringDepositExtraCashAccountSelectionDataState.getAutomaticDepositsToInstrumentId() != null) {
                Iterable iterable = (Iterable) ((Either.Left) recurringDepositExtraCashAccountSelectionDataState.getAccounts()).getValue();
                int i = 0;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (recurringDepositExtraCashAccountSelectionDataState.getAutomaticDepositsToInstrumentId().containsKey(((AchRelationship) it.next()).getId().toString()) && (i = i + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i > 0 && i < ((List) ((Either.Left) recurringDepositExtraCashAccountSelectionDataState.getAccounts()).getValue()).size()) {
                    numValueOf = Integer.valueOf(C30439R.string.f5022x55a932b1);
                } else {
                    numValueOf = i == ((List) ((Either.Left) recurringDepositExtraCashAccountSelectionDataState.getAccounts()).getValue()).size() ? Integer.valueOf(C30439R.string.external_account_selection_info_banner_all_bank_accounts_invalid) : null;
                }
            }
            if (numValueOf == null) {
                return null;
            }
            String string2 = resources.getString(numValueOf.intValue());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new AnnotatedString(string2, null, 2, null);
        }
        if ((accounts2 instanceof Either.Right) || accounts2 == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isContinueButtonEnabled(RecurringDepositExtraCashAccountSelectionDataState recurringDepositExtraCashAccountSelectionDataState) {
        Intrinsics.checkNotNullParameter(recurringDepositExtraCashAccountSelectionDataState, "<this>");
        return (recurringDepositExtraCashAccountSelectionDataState.getSelectedBankAccount() == null && recurringDepositExtraCashAccountSelectionDataState.getSelectedRobinhoodAccount() == null) ? false : true;
    }
}
