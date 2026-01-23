package com.robinhood.android.feature.account.onboarding.accounttype;

import bonfire.proto.idl.accounts.p028v1.AccountEligibilityWarningDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountTypeSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionViewState$Loaded;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionViewState$Loading;", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface AccountTypeSelectionViewState {

    /* compiled from: AccountTypeSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionViewState$Loading;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AccountTypeSelectionViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1560045000;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AccountTypeSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionViewState$Loaded;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionViewState;", "title", "", "subtitle", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow;", "accountEligibilityWarning", "Lbonfire/proto/idl/accounts/v1/AccountEligibilityWarningDto;", "isVerifyingAccountEligibility", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lbonfire/proto/idl/accounts/v1/AccountEligibilityWarningDto;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getAccountEligibilityWarning", "()Lbonfire/proto/idl/accounts/v1/AccountEligibilityWarningDto;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AccountTypeSelectionViewState {
        public static final int $stable = 8;
        private final AccountEligibilityWarningDto accountEligibilityWarning;
        private final boolean isVerifyingAccountEligibility;
        private final ImmutableList<AccountTypeSelectionRow> rows;
        private final String subtitle;
        private final String title;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, ImmutableList immutableList, AccountEligibilityWarningDto accountEligibilityWarningDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                str2 = loaded.subtitle;
            }
            if ((i & 4) != 0) {
                immutableList = loaded.rows;
            }
            if ((i & 8) != 0) {
                accountEligibilityWarningDto = loaded.accountEligibilityWarning;
            }
            if ((i & 16) != 0) {
                z = loaded.isVerifyingAccountEligibility;
            }
            boolean z2 = z;
            ImmutableList immutableList2 = immutableList;
            return loaded.copy(str, str2, immutableList2, accountEligibilityWarningDto, z2);
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

        public final Loaded copy(String title, String subtitle, ImmutableList<AccountTypeSelectionRow> rows, AccountEligibilityWarningDto accountEligibilityWarning, boolean isVerifyingAccountEligibility) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new Loaded(title, subtitle, rows, accountEligibilityWarning, isVerifyingAccountEligibility);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.rows, loaded.rows) && Intrinsics.areEqual(this.accountEligibilityWarning, loaded.accountEligibilityWarning) && this.isVerifyingAccountEligibility == loaded.isVerifyingAccountEligibility;
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.rows.hashCode()) * 31;
            AccountEligibilityWarningDto accountEligibilityWarningDto = this.accountEligibilityWarning;
            return ((iHashCode + (accountEligibilityWarningDto == null ? 0 : accountEligibilityWarningDto.hashCode())) * 31) + Boolean.hashCode(this.isVerifyingAccountEligibility);
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", subtitle=" + this.subtitle + ", rows=" + this.rows + ", accountEligibilityWarning=" + this.accountEligibilityWarning + ", isVerifyingAccountEligibility=" + this.isVerifyingAccountEligibility + ")";
        }

        public Loaded(String title, String subtitle, ImmutableList<AccountTypeSelectionRow> rows, AccountEligibilityWarningDto accountEligibilityWarningDto, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.title = title;
            this.subtitle = subtitle;
            this.rows = rows;
            this.accountEligibilityWarning = accountEligibilityWarningDto;
            this.isVerifyingAccountEligibility = z;
        }

        public /* synthetic */ Loaded(String str, String str2, ImmutableList immutableList, AccountEligibilityWarningDto accountEligibilityWarningDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, immutableList, (i & 8) != 0 ? null : accountEligibilityWarningDto, (i & 16) != 0 ? false : z);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
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
    }
}
