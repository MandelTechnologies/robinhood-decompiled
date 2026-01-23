package com.robinhood.android.feature.account.onboarding.accounttype;

import bonfire.proto.idl.accounts.p028v1.AccountEligibilityWarningDto;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionViewState;
import com.robinhood.android.udf.StateProvider;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AccountTypeSelectionDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDataState;", "", "title", "", "subtitle", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow;", "accountEligibilityWarning", "Lbonfire/proto/idl/accounts/v1/AccountEligibilityWarningDto;", "isVerifyingAccountEligibility", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lbonfire/proto/idl/accounts/v1/AccountEligibilityWarningDto;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getAccountEligibilityWarning", "()Lbonfire/proto/idl/accounts/v1/AccountEligibilityWarningDto;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountTypeSelectionDataState {
    private final AccountEligibilityWarningDto accountEligibilityWarning;
    private final boolean isVerifyingAccountEligibility;
    private final ImmutableList<AccountTypeSelectionRow> rows;
    private final String subtitle;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AccountTypeSelectionDataState() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ AccountTypeSelectionDataState copy$default(AccountTypeSelectionDataState accountTypeSelectionDataState, String str, String str2, ImmutableList immutableList, AccountEligibilityWarningDto accountEligibilityWarningDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountTypeSelectionDataState.title;
        }
        if ((i & 2) != 0) {
            str2 = accountTypeSelectionDataState.subtitle;
        }
        if ((i & 4) != 0) {
            immutableList = accountTypeSelectionDataState.rows;
        }
        if ((i & 8) != 0) {
            accountEligibilityWarningDto = accountTypeSelectionDataState.accountEligibilityWarning;
        }
        if ((i & 16) != 0) {
            z = accountTypeSelectionDataState.isVerifyingAccountEligibility;
        }
        boolean z2 = z;
        ImmutableList immutableList2 = immutableList;
        return accountTypeSelectionDataState.copy(str, str2, immutableList2, accountEligibilityWarningDto, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ImmutableList<AccountTypeSelectionRow> component3() {
        return this.rows;
    }

    /* renamed from: component4, reason: from getter */
    public final AccountEligibilityWarningDto getAccountEligibilityWarning() {
        return this.accountEligibilityWarning;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsVerifyingAccountEligibility() {
        return this.isVerifyingAccountEligibility;
    }

    public final AccountTypeSelectionDataState copy(String title, String subtitle, ImmutableList<AccountTypeSelectionRow> rows, AccountEligibilityWarningDto accountEligibilityWarning, boolean isVerifyingAccountEligibility) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new AccountTypeSelectionDataState(title, subtitle, rows, accountEligibilityWarning, isVerifyingAccountEligibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountTypeSelectionDataState)) {
            return false;
        }
        AccountTypeSelectionDataState accountTypeSelectionDataState = (AccountTypeSelectionDataState) other;
        return Intrinsics.areEqual(this.title, accountTypeSelectionDataState.title) && Intrinsics.areEqual(this.subtitle, accountTypeSelectionDataState.subtitle) && Intrinsics.areEqual(this.rows, accountTypeSelectionDataState.rows) && Intrinsics.areEqual(this.accountEligibilityWarning, accountTypeSelectionDataState.accountEligibilityWarning) && this.isVerifyingAccountEligibility == accountTypeSelectionDataState.isVerifyingAccountEligibility;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.rows.hashCode()) * 31;
        AccountEligibilityWarningDto accountEligibilityWarningDto = this.accountEligibilityWarning;
        return ((iHashCode2 + (accountEligibilityWarningDto != null ? accountEligibilityWarningDto.hashCode() : 0)) * 31) + Boolean.hashCode(this.isVerifyingAccountEligibility);
    }

    public String toString() {
        return "AccountTypeSelectionDataState(title=" + this.title + ", subtitle=" + this.subtitle + ", rows=" + this.rows + ", accountEligibilityWarning=" + this.accountEligibilityWarning + ", isVerifyingAccountEligibility=" + this.isVerifyingAccountEligibility + ")";
    }

    public AccountTypeSelectionDataState(String str, String str2, ImmutableList<AccountTypeSelectionRow> rows, AccountEligibilityWarningDto accountEligibilityWarningDto, boolean z) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.title = str;
        this.subtitle = str2;
        this.rows = rows;
        this.accountEligibilityWarning = accountEligibilityWarningDto;
        this.isVerifyingAccountEligibility = z;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public /* synthetic */ AccountTypeSelectionDataState(String str, String str2, ImmutableList immutableList, AccountEligibilityWarningDto accountEligibilityWarningDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? extensions2.persistentListOf() : immutableList, (i & 8) != 0 ? null : accountEligibilityWarningDto, (i & 16) != 0 ? false : z);
    }

    public final ImmutableList<AccountTypeSelectionRow> getRows() {
        return this.rows;
    }

    public final AccountEligibilityWarningDto getAccountEligibilityWarning() {
        return this.accountEligibilityWarning;
    }

    public final boolean isVerifyingAccountEligibility() {
        return this.isVerifyingAccountEligibility;
    }

    /* compiled from: AccountTypeSelectionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDataState;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionViewState;", "<init>", "()V", "reduce", "dataState", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements StateProvider<AccountTypeSelectionDataState, AccountTypeSelectionViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public AccountTypeSelectionViewState reduce(AccountTypeSelectionDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            ImmutableList<AccountTypeSelectionRow> rows = dataState.getRows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
            for (AccountTypeSelectionRow accountTypeSelectionRowCopy$default : rows) {
                if (dataState.isVerifyingAccountEligibility()) {
                    accountTypeSelectionRowCopy$default = AccountTypeSelectionRow.copy$default(accountTypeSelectionRowCopy$default, null, null, false, null, null, 27, null);
                }
                arrayList.add(accountTypeSelectionRowCopy$default);
            }
            ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
            if (dataState.getTitle() != null && dataState.getSubtitle() != null && !persistentList.isEmpty()) {
                return new AccountTypeSelectionViewState.Loaded(dataState.getTitle(), dataState.getSubtitle(), persistentList, dataState.getAccountEligibilityWarning(), dataState.isVerifyingAccountEligibility());
            }
            return AccountTypeSelectionViewState.Loading.INSTANCE;
        }
    }
}
