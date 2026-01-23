package com.robinhood.android.internalassettransfers.accountselection;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionViewState3;
import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import com.robinhood.utils.resource.StringResource;
import internal_asset_transfers.proto.p475v1.IATIneligibilityReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AccountSelectionDataState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;", "", "eligibleAccounts", "Lcom/robinhood/android/internalassettransfers/accountselection/UiEligibleAccounts;", "selectedSourceAccountNumberRhs", "", "selectedSinkAccountNumberRhs", "isValidatingAccounts", "", "networkError", "", "dialogError", "<init>", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiEligibleAccounts;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/lang/Throwable;)V", "getEligibleAccounts", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiEligibleAccounts;", "getSelectedSourceAccountNumberRhs", "()Ljava/lang/String;", "getSelectedSinkAccountNumberRhs", "()Z", "getNetworkError", "()Ljava/lang/Throwable;", "getDialogError", "selectedSourceAccount", "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSelectedSourceAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "selectedSinkAccount", "getSelectedSinkAccount", "hasAtLeastOneEligibleTransfer", "getHasAtLeastOneEligibleTransfer", "buttonState", "Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState;", "getButtonState", "()Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState;", "sourceRow", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionRowState;", "getSourceRow", "()Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionRowState;", "sinkRow", "getSinkRow", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class AccountSelectionDataState {
    public static final int $stable = 8;
    private final Throwable dialogError;
    private final UiEligibleAccounts eligibleAccounts;
    private final boolean isValidatingAccounts;
    private final Throwable networkError;
    private final String selectedSinkAccountNumberRhs;
    private final String selectedSourceAccountNumberRhs;

    public AccountSelectionDataState() {
        this(null, null, null, false, null, null, 63, null);
    }

    public static /* synthetic */ AccountSelectionDataState copy$default(AccountSelectionDataState accountSelectionDataState, UiEligibleAccounts uiEligibleAccounts, String str, String str2, boolean z, Throwable th, Throwable th2, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEligibleAccounts = accountSelectionDataState.eligibleAccounts;
        }
        if ((i & 2) != 0) {
            str = accountSelectionDataState.selectedSourceAccountNumberRhs;
        }
        if ((i & 4) != 0) {
            str2 = accountSelectionDataState.selectedSinkAccountNumberRhs;
        }
        if ((i & 8) != 0) {
            z = accountSelectionDataState.isValidatingAccounts;
        }
        if ((i & 16) != 0) {
            th = accountSelectionDataState.networkError;
        }
        if ((i & 32) != 0) {
            th2 = accountSelectionDataState.dialogError;
        }
        Throwable th3 = th;
        Throwable th4 = th2;
        return accountSelectionDataState.copy(uiEligibleAccounts, str, str2, z, th3, th4);
    }

    /* renamed from: component1, reason: from getter */
    public final UiEligibleAccounts getEligibleAccounts() {
        return this.eligibleAccounts;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedSourceAccountNumberRhs() {
        return this.selectedSourceAccountNumberRhs;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedSinkAccountNumberRhs() {
        return this.selectedSinkAccountNumberRhs;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsValidatingAccounts() {
        return this.isValidatingAccounts;
    }

    /* renamed from: component5, reason: from getter */
    public final Throwable getNetworkError() {
        return this.networkError;
    }

    /* renamed from: component6, reason: from getter */
    public final Throwable getDialogError() {
        return this.dialogError;
    }

    public final AccountSelectionDataState copy(UiEligibleAccounts eligibleAccounts, String selectedSourceAccountNumberRhs, String selectedSinkAccountNumberRhs, boolean isValidatingAccounts, Throwable networkError, Throwable dialogError) {
        return new AccountSelectionDataState(eligibleAccounts, selectedSourceAccountNumberRhs, selectedSinkAccountNumberRhs, isValidatingAccounts, networkError, dialogError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSelectionDataState)) {
            return false;
        }
        AccountSelectionDataState accountSelectionDataState = (AccountSelectionDataState) other;
        return Intrinsics.areEqual(this.eligibleAccounts, accountSelectionDataState.eligibleAccounts) && Intrinsics.areEqual(this.selectedSourceAccountNumberRhs, accountSelectionDataState.selectedSourceAccountNumberRhs) && Intrinsics.areEqual(this.selectedSinkAccountNumberRhs, accountSelectionDataState.selectedSinkAccountNumberRhs) && this.isValidatingAccounts == accountSelectionDataState.isValidatingAccounts && Intrinsics.areEqual(this.networkError, accountSelectionDataState.networkError) && Intrinsics.areEqual(this.dialogError, accountSelectionDataState.dialogError);
    }

    public int hashCode() {
        UiEligibleAccounts uiEligibleAccounts = this.eligibleAccounts;
        int iHashCode = (uiEligibleAccounts == null ? 0 : uiEligibleAccounts.hashCode()) * 31;
        String str = this.selectedSourceAccountNumberRhs;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedSinkAccountNumberRhs;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isValidatingAccounts)) * 31;
        Throwable th = this.networkError;
        int iHashCode4 = (iHashCode3 + (th == null ? 0 : th.hashCode())) * 31;
        Throwable th2 = this.dialogError;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "AccountSelectionDataState(eligibleAccounts=" + this.eligibleAccounts + ", selectedSourceAccountNumberRhs=" + this.selectedSourceAccountNumberRhs + ", selectedSinkAccountNumberRhs=" + this.selectedSinkAccountNumberRhs + ", isValidatingAccounts=" + this.isValidatingAccounts + ", networkError=" + this.networkError + ", dialogError=" + this.dialogError + ")";
    }

    public AccountSelectionDataState(UiEligibleAccounts uiEligibleAccounts, String str, String str2, boolean z, Throwable th, Throwable th2) {
        this.eligibleAccounts = uiEligibleAccounts;
        this.selectedSourceAccountNumberRhs = str;
        this.selectedSinkAccountNumberRhs = str2;
        this.isValidatingAccounts = z;
        this.networkError = th;
        this.dialogError = th2;
    }

    public /* synthetic */ AccountSelectionDataState(UiEligibleAccounts uiEligibleAccounts, String str, String str2, boolean z, Throwable th, Throwable th2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEligibleAccounts, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : th, (i & 32) != 0 ? null : th2);
    }

    public final UiEligibleAccounts getEligibleAccounts() {
        return this.eligibleAccounts;
    }

    public final String getSelectedSourceAccountNumberRhs() {
        return this.selectedSourceAccountNumberRhs;
    }

    public final String getSelectedSinkAccountNumberRhs() {
        return this.selectedSinkAccountNumberRhs;
    }

    public final boolean isValidatingAccounts() {
        return this.isValidatingAccounts;
    }

    public final Throwable getNetworkError() {
        return this.networkError;
    }

    public final Throwable getDialogError() {
        return this.dialogError;
    }

    private final UiIatAccount getSelectedSourceAccount() {
        List<UiIatAccount> accounts2;
        UiEligibleAccounts uiEligibleAccounts = this.eligibleAccounts;
        Object obj = null;
        if (uiEligibleAccounts == null || (accounts2 = uiEligibleAccounts.getAccounts()) == null) {
            return null;
        }
        Iterator<T> it = accounts2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((UiIatAccount) next).getRhsAccountNumber(), this.selectedSourceAccountNumberRhs)) {
                obj = next;
                break;
            }
        }
        return (UiIatAccount) obj;
    }

    private final UiIatAccount getSelectedSinkAccount() {
        List<UiIatAccount> accounts2;
        UiEligibleAccounts uiEligibleAccounts = this.eligibleAccounts;
        Object obj = null;
        if (uiEligibleAccounts == null || (accounts2 = uiEligibleAccounts.getAccounts()) == null) {
            return null;
        }
        Iterator<T> it = accounts2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((UiIatAccount) next).getRhsAccountNumber(), this.selectedSinkAccountNumberRhs)) {
                obj = next;
                break;
            }
        }
        return (UiIatAccount) obj;
    }

    private final boolean getHasAtLeastOneEligibleTransfer() {
        List<UiIatAccount> accounts2;
        UiEligibleAccounts uiEligibleAccounts = this.eligibleAccounts;
        if (uiEligibleAccounts != null && (accounts2 = uiEligibleAccounts.getAccounts()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : accounts2) {
                if (((UiIatAccount) obj).isEligibleSource()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<UiIatAccount> listEmptyList = this.eligibleAccounts.getValidSourceToSink().get(((UiIatAccount) it.next()).getRhsAccountNumber());
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                if (!listEmptyList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final AccountSelectionViewState3 getButtonState() {
        UiIatAccount selectedSourceAccount = getSelectedSourceAccount();
        UiIatAccount selectedSinkAccount = getSelectedSinkAccount();
        if (selectedSourceAccount != null && selectedSinkAccount != null) {
            return new AccountSelectionViewState3.Enabled(selectedSourceAccount, selectedSinkAccount, this.isValidatingAccounts);
        }
        return AccountSelectionViewState3.Disabled.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccountSelectionRowState getSourceRow() {
        List listEmptyList;
        StringResource stringResourceInvoke;
        List<UiIatAccount> accounts2;
        boolean z;
        UiEligibleAccounts uiEligibleAccounts = this.eligibleAccounts;
        if (uiEligibleAccounts == null || (accounts2 = uiEligibleAccounts.getAccounts()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList<UiIatAccount> arrayList = new ArrayList();
            for (Object obj : accounts2) {
                UiIatAccount uiIatAccount = (UiIatAccount) obj;
                List<UiIatAccount> list = this.eligibleAccounts.getValidSourceToSink().get(uiIatAccount.getRhsAccountNumber());
                if (list != null) {
                    z = list.isEmpty() ^ true;
                }
                if (uiIatAccount.isEligibleSource() || uiIatAccount.getSourceIneligibilityReason() == IATIneligibilityReason.REASON_OPEN_FUTURES_POSITION) {
                    if (z) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (UiIatAccount uiIatAccount2 : arrayList) {
                arrayList2.add(new AccountSelectionListFragment.Args.AccountSelectionOption(uiIatAccount2, uiIatAccount2.isEligibleSource(), uiIatAccount2.getSourceIneligibilityReason()));
            }
            listEmptyList = AccountSelectionDataState2.sortAccountSelectionOptions(arrayList2);
            if (listEmptyList == null) {
            }
        }
        List list2 = listEmptyList;
        if (!getHasAtLeastOneEligibleTransfer()) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C18977R.string.no_accounts_available_for_transfer, new Object[0]);
        } else {
            UiIatAccount selectedSourceAccount = getSelectedSourceAccount();
            if (selectedSourceAccount != null) {
                String nickname = selectedSourceAccount.getNickname();
                if (nickname != null && !StringsKt.isBlank(nickname)) {
                    stringResourceInvoke = AccountDisplayNames.getNicknameDotFormat(selectedSourceAccount.getNickname(), selectedSourceAccount.getBrokerageAccountType(), selectedSourceAccount.getManagementType());
                } else {
                    stringResourceInvoke = AccountDisplayNames.getDisplayName$default(selectedSourceAccount.getBrokerageAccountType(), selectedSourceAccount.getManagementType(), null, 4, null).getShort().getTitle();
                }
                if (stringResourceInvoke == null) {
                }
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C18977R.string.choose_an_account, new Object[0]);
            }
        }
        return new AccountSelectionRowState(StringResource.INSTANCE.invoke(C18977R.string.from, new Object[0]), stringResourceInvoke, AccountSelectionListFragment.AccountSelectionType.SOURCE, list2, getHasAtLeastOneEligibleTransfer());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccountSelectionRowState getSinkRow() {
        List<UiIatAccount> accounts2;
        List<UiIatAccount> listEmptyList;
        StringResource stringResourceInvoke;
        Map<String, List<UiIatAccount>> validSinkToSource;
        if (this.selectedSourceAccountNumberRhs != null) {
            UiEligibleAccounts uiEligibleAccounts = this.eligibleAccounts;
            listEmptyList = (uiEligibleAccounts == null || (validSinkToSource = uiEligibleAccounts.getValidSinkToSource()) == null) ? null : validSinkToSource.get(this.selectedSourceAccountNumberRhs);
        } else {
            UiEligibleAccounts uiEligibleAccounts2 = this.eligibleAccounts;
            if (uiEligibleAccounts2 != null && (accounts2 = uiEligibleAccounts2.getAccounts()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : accounts2) {
                    if (((UiIatAccount) obj).isEligibleSink()) {
                        arrayList.add(obj);
                    }
                }
                listEmptyList = arrayList;
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList<UiIatAccount> arrayList2 = new ArrayList();
        for (Object obj2 : listEmptyList) {
            if (((UiIatAccount) obj2).isEligibleSink()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (UiIatAccount uiIatAccount : arrayList2) {
            arrayList3.add(new AccountSelectionListFragment.Args.AccountSelectionOption(uiIatAccount, uiIatAccount.isEligibleSink(), null));
        }
        if (getHasAtLeastOneEligibleTransfer()) {
            UiIatAccount selectedSinkAccount = getSelectedSinkAccount();
            if (selectedSinkAccount == null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C18977R.string.choose_an_account, new Object[0]);
            } else {
                String nickname = selectedSinkAccount.getNickname();
                stringResourceInvoke = (nickname == null || StringsKt.isBlank(nickname)) ? AccountDisplayNames.getDisplayName$default(selectedSinkAccount.getBrokerageAccountType(), selectedSinkAccount.getManagementType(), null, 4, null).getShort().getTitle() : AccountDisplayNames.getNicknameDotFormat(selectedSinkAccount.getNickname(), selectedSinkAccount.getBrokerageAccountType(), selectedSinkAccount.getManagementType());
                if (stringResourceInvoke == null) {
                }
            }
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C18977R.string.no_accounts_available_for_transfer, new Object[0]);
        }
        return new AccountSelectionRowState(StringResource.INSTANCE.invoke(C18977R.string.f4229to, new Object[0]), stringResourceInvoke, AccountSelectionListFragment.AccountSelectionType.SINK, arrayList3, getHasAtLeastOneEligibleTransfer());
    }
}
