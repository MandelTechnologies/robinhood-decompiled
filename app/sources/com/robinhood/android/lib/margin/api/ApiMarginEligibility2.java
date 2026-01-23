package com.robinhood.android.lib.margin.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.util.Money;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiMarginEligibility.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0006\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck;", "Landroid/os/Parcelable;", "<init>", "()V", "passed", "", "getPassed", "()Z", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "Identity", "AccountBalance", "Suitability", "TradeHistory", "KnowledgeExperienceGb", "Companion", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$AccountBalance;", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$Identity;", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$KnowledgeExperienceGb;", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$Suitability;", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$TradeHistory;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck, reason: use source file name */
/* loaded from: classes17.dex */
public abstract class ApiMarginEligibility2 implements Parcelable {
    private static final String ACCOUNT_BALANCE = "account_balance";
    public static final String ALREADY_ENABLED = "margin_investing_already_enabled_in_current_account";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String IDENTITY = "identity";
    private static final String KNOWLEDGE_EXPERIENCE = "margin_knowledge_experience_gb";
    private static final String SUITABILITY = "suitability";
    private static final String TRADE_HISTORY = "trade_history";
    private static final JsonAdapter.Factory jsonAdapterFactory;

    public /* synthetic */ ApiMarginEligibility2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getErrorMessage();

    public abstract boolean getPassed();

    private ApiMarginEligibility2() {
    }

    /* compiled from: ApiMarginEligibility.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$Identity;", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck;", "passed", "", "errorMessage", "", "<init>", "(ZLjava/lang/String;)V", "getPassed", "()Z", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck$Identity, reason: from toString */
    public static final /* data */ class Identity extends ApiMarginEligibility2 {
        public static final Parcelable.Creator<Identity> CREATOR = new Creator();
        private final String errorMessage;
        private final boolean passed;

        /* compiled from: ApiMarginEligibility.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck$Identity$Creator */
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<Identity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Identity createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Identity(parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Identity[] newArray(int i) {
                return new Identity[i];
            }
        }

        public static /* synthetic */ Identity copy$default(Identity identity, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = identity.passed;
            }
            if ((i & 2) != 0) {
                str = identity.errorMessage;
            }
            return identity.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getPassed() {
            return this.passed;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final Identity copy(boolean passed, @Json(name = "error_message") String errorMessage) {
            return new Identity(passed, errorMessage);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Identity)) {
                return false;
            }
            Identity identity = (Identity) other;
            return this.passed == identity.passed && Intrinsics.areEqual(this.errorMessage, identity.errorMessage);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.passed) * 31;
            String str = this.errorMessage;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Identity(passed=" + this.passed + ", errorMessage=" + this.errorMessage + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.passed ? 1 : 0);
            dest.writeString(this.errorMessage);
        }

        public /* synthetic */ Identity(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : str);
        }

        @Override // com.robinhood.android.lib.margin.api.ApiMarginEligibility2
        public boolean getPassed() {
            return this.passed;
        }

        @Override // com.robinhood.android.lib.margin.api.ApiMarginEligibility2
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public Identity(boolean z, @Json(name = "error_message") String str) {
            super(null);
            this.passed = z;
            this.errorMessage = str;
        }
    }

    /* compiled from: ApiMarginEligibility.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$AccountBalance;", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck;", "passed", "", "errorMessage", "", "minimumDeposit", "Lcom/robinhood/models/util/Money;", "recommendedDeposit", "<init>", "(ZLjava/lang/String;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;)V", "getPassed", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getMinimumDeposit", "()Lcom/robinhood/models/util/Money;", "getRecommendedDeposit", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck$AccountBalance, reason: from toString */
    public static final /* data */ class AccountBalance extends ApiMarginEligibility2 {
        public static final Parcelable.Creator<AccountBalance> CREATOR = new Creator();
        private final String errorMessage;
        private final Money minimumDeposit;
        private final boolean passed;
        private final Money recommendedDeposit;

        /* compiled from: ApiMarginEligibility.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck$AccountBalance$Creator */
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<AccountBalance> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountBalance createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountBalance(parcel.readInt() != 0, parcel.readString(), (Money) parcel.readParcelable(AccountBalance.class.getClassLoader()), (Money) parcel.readParcelable(AccountBalance.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountBalance[] newArray(int i) {
                return new AccountBalance[i];
            }
        }

        public static /* synthetic */ AccountBalance copy$default(AccountBalance accountBalance, boolean z, String str, Money money, Money money2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = accountBalance.passed;
            }
            if ((i & 2) != 0) {
                str = accountBalance.errorMessage;
            }
            if ((i & 4) != 0) {
                money = accountBalance.minimumDeposit;
            }
            if ((i & 8) != 0) {
                money2 = accountBalance.recommendedDeposit;
            }
            return accountBalance.copy(z, str, money, money2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getPassed() {
            return this.passed;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final Money getMinimumDeposit() {
            return this.minimumDeposit;
        }

        /* renamed from: component4, reason: from getter */
        public final Money getRecommendedDeposit() {
            return this.recommendedDeposit;
        }

        public final AccountBalance copy(boolean passed, @Json(name = "error_message") String errorMessage, @Json(name = "minimum_deposit") Money minimumDeposit, @Json(name = "recommended_deposit") Money recommendedDeposit) {
            return new AccountBalance(passed, errorMessage, minimumDeposit, recommendedDeposit);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountBalance)) {
                return false;
            }
            AccountBalance accountBalance = (AccountBalance) other;
            return this.passed == accountBalance.passed && Intrinsics.areEqual(this.errorMessage, accountBalance.errorMessage) && Intrinsics.areEqual(this.minimumDeposit, accountBalance.minimumDeposit) && Intrinsics.areEqual(this.recommendedDeposit, accountBalance.recommendedDeposit);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.passed) * 31;
            String str = this.errorMessage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Money money = this.minimumDeposit;
            int iHashCode3 = (iHashCode2 + (money == null ? 0 : money.hashCode())) * 31;
            Money money2 = this.recommendedDeposit;
            return iHashCode3 + (money2 != null ? money2.hashCode() : 0);
        }

        public String toString() {
            return "AccountBalance(passed=" + this.passed + ", errorMessage=" + this.errorMessage + ", minimumDeposit=" + this.minimumDeposit + ", recommendedDeposit=" + this.recommendedDeposit + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.passed ? 1 : 0);
            dest.writeString(this.errorMessage);
            dest.writeParcelable(this.minimumDeposit, flags);
            dest.writeParcelable(this.recommendedDeposit, flags);
        }

        public /* synthetic */ AccountBalance(boolean z, String str, Money money, Money money2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : money2);
        }

        @Override // com.robinhood.android.lib.margin.api.ApiMarginEligibility2
        public boolean getPassed() {
            return this.passed;
        }

        @Override // com.robinhood.android.lib.margin.api.ApiMarginEligibility2
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public final Money getMinimumDeposit() {
            return this.minimumDeposit;
        }

        public final Money getRecommendedDeposit() {
            return this.recommendedDeposit;
        }

        public AccountBalance(boolean z, @Json(name = "error_message") String str, @Json(name = "minimum_deposit") Money money, @Json(name = "recommended_deposit") Money money2) {
            super(null);
            this.passed = z;
            this.errorMessage = str;
            this.minimumDeposit = money;
            this.recommendedDeposit = money2;
        }
    }

    /* compiled from: ApiMarginEligibility.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$Suitability;", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck;", "passed", "", "errorMessage", "", "hasInvestmentProfile", "<init>", "(ZLjava/lang/String;Ljava/lang/Boolean;)V", "getPassed", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getHasInvestmentProfile", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$Suitability;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck$Suitability, reason: from toString */
    public static final /* data */ class Suitability extends ApiMarginEligibility2 {
        public static final Parcelable.Creator<Suitability> CREATOR = new Creator();
        private final String errorMessage;
        private final Boolean hasInvestmentProfile;
        private final boolean passed;

        /* compiled from: ApiMarginEligibility.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck$Suitability$Creator */
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<Suitability> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Suitability createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Suitability(z, string2, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Suitability[] newArray(int i) {
                return new Suitability[i];
            }
        }

        public static /* synthetic */ Suitability copy$default(Suitability suitability, boolean z, String str, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                z = suitability.passed;
            }
            if ((i & 2) != 0) {
                str = suitability.errorMessage;
            }
            if ((i & 4) != 0) {
                bool = suitability.hasInvestmentProfile;
            }
            return suitability.copy(z, str, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getPassed() {
            return this.passed;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getHasInvestmentProfile() {
            return this.hasInvestmentProfile;
        }

        public final Suitability copy(boolean passed, @Json(name = "error_message") String errorMessage, @Json(name = "has_investment_profile") Boolean hasInvestmentProfile) {
            return new Suitability(passed, errorMessage, hasInvestmentProfile);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Suitability)) {
                return false;
            }
            Suitability suitability = (Suitability) other;
            return this.passed == suitability.passed && Intrinsics.areEqual(this.errorMessage, suitability.errorMessage) && Intrinsics.areEqual(this.hasInvestmentProfile, suitability.hasInvestmentProfile);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.passed) * 31;
            String str = this.errorMessage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.hasInvestmentProfile;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Suitability(passed=" + this.passed + ", errorMessage=" + this.errorMessage + ", hasInvestmentProfile=" + this.hasInvestmentProfile + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.passed ? 1 : 0);
            dest.writeString(this.errorMessage);
            Boolean bool = this.hasInvestmentProfile;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public /* synthetic */ Suitability(boolean z, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool);
        }

        @Override // com.robinhood.android.lib.margin.api.ApiMarginEligibility2
        public boolean getPassed() {
            return this.passed;
        }

        @Override // com.robinhood.android.lib.margin.api.ApiMarginEligibility2
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public final Boolean getHasInvestmentProfile() {
            return this.hasInvestmentProfile;
        }

        public Suitability(boolean z, @Json(name = "error_message") String str, @Json(name = "has_investment_profile") Boolean bool) {
            super(null);
            this.passed = z;
            this.errorMessage = str;
            this.hasInvestmentProfile = bool;
        }
    }

    /* compiled from: ApiMarginEligibility.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$TradeHistory;", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck;", "passed", "", "errorMessage", "", "shouldShowVolatilityWarning", "<init>", "(ZLjava/lang/String;Ljava/lang/Boolean;)V", "getPassed", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getShouldShowVolatilityWarning", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$TradeHistory;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck$TradeHistory, reason: from toString */
    public static final /* data */ class TradeHistory extends ApiMarginEligibility2 {
        public static final Parcelable.Creator<TradeHistory> CREATOR = new Creator();
        private final String errorMessage;
        private final boolean passed;
        private final Boolean shouldShowVolatilityWarning;

        /* compiled from: ApiMarginEligibility.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck$TradeHistory$Creator */
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<TradeHistory> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TradeHistory createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new TradeHistory(z, string2, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TradeHistory[] newArray(int i) {
                return new TradeHistory[i];
            }
        }

        public static /* synthetic */ TradeHistory copy$default(TradeHistory tradeHistory, boolean z, String str, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tradeHistory.passed;
            }
            if ((i & 2) != 0) {
                str = tradeHistory.errorMessage;
            }
            if ((i & 4) != 0) {
                bool = tradeHistory.shouldShowVolatilityWarning;
            }
            return tradeHistory.copy(z, str, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getPassed() {
            return this.passed;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getShouldShowVolatilityWarning() {
            return this.shouldShowVolatilityWarning;
        }

        public final TradeHistory copy(boolean passed, @Json(name = "error_message") String errorMessage, @Json(name = "should_show_volatility_warning") Boolean shouldShowVolatilityWarning) {
            return new TradeHistory(passed, errorMessage, shouldShowVolatilityWarning);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradeHistory)) {
                return false;
            }
            TradeHistory tradeHistory = (TradeHistory) other;
            return this.passed == tradeHistory.passed && Intrinsics.areEqual(this.errorMessage, tradeHistory.errorMessage) && Intrinsics.areEqual(this.shouldShowVolatilityWarning, tradeHistory.shouldShowVolatilityWarning);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.passed) * 31;
            String str = this.errorMessage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.shouldShowVolatilityWarning;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "TradeHistory(passed=" + this.passed + ", errorMessage=" + this.errorMessage + ", shouldShowVolatilityWarning=" + this.shouldShowVolatilityWarning + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.passed ? 1 : 0);
            dest.writeString(this.errorMessage);
            Boolean bool = this.shouldShowVolatilityWarning;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public /* synthetic */ TradeHistory(boolean z, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool);
        }

        @Override // com.robinhood.android.lib.margin.api.ApiMarginEligibility2
        public boolean getPassed() {
            return this.passed;
        }

        @Override // com.robinhood.android.lib.margin.api.ApiMarginEligibility2
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public final Boolean getShouldShowVolatilityWarning() {
            return this.shouldShowVolatilityWarning;
        }

        public TradeHistory(boolean z, @Json(name = "error_message") String str, @Json(name = "should_show_volatility_warning") Boolean bool) {
            super(null);
            this.passed = z;
            this.errorMessage = str;
            this.shouldShowVolatilityWarning = bool;
        }
    }

    /* compiled from: ApiMarginEligibility.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$KnowledgeExperienceGb;", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck;", "passed", "", "errorMessage", "", "retryAvailable", "shouldShowMarginExperience", "shouldShowKnowledgeTest", "<init>", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getPassed", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getRetryAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShouldShowMarginExperience", "getShouldShowKnowledgeTest", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$KnowledgeExperienceGb;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck$KnowledgeExperienceGb, reason: from toString */
    public static final /* data */ class KnowledgeExperienceGb extends ApiMarginEligibility2 {
        public static final Parcelable.Creator<KnowledgeExperienceGb> CREATOR = new Creator();
        private final String errorMessage;
        private final boolean passed;
        private final Boolean retryAvailable;
        private final Boolean shouldShowKnowledgeTest;
        private final Boolean shouldShowMarginExperience;

        /* compiled from: ApiMarginEligibility.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck$KnowledgeExperienceGb$Creator */
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<KnowledgeExperienceGb> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KnowledgeExperienceGb createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                    z2 = true;
                } else {
                    z = false;
                    z2 = true;
                }
                String string2 = parcel.readString();
                Boolean boolValueOf3 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z2 : z);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : z);
                }
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() != 0) {
                        z = z2;
                    }
                    boolValueOf3 = Boolean.valueOf(z);
                }
                return new KnowledgeExperienceGb(z3, string2, boolValueOf, boolValueOf2, boolValueOf3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KnowledgeExperienceGb[] newArray(int i) {
                return new KnowledgeExperienceGb[i];
            }
        }

        public static /* synthetic */ KnowledgeExperienceGb copy$default(KnowledgeExperienceGb knowledgeExperienceGb, boolean z, String str, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = knowledgeExperienceGb.passed;
            }
            if ((i & 2) != 0) {
                str = knowledgeExperienceGb.errorMessage;
            }
            if ((i & 4) != 0) {
                bool = knowledgeExperienceGb.retryAvailable;
            }
            if ((i & 8) != 0) {
                bool2 = knowledgeExperienceGb.shouldShowMarginExperience;
            }
            if ((i & 16) != 0) {
                bool3 = knowledgeExperienceGb.shouldShowKnowledgeTest;
            }
            Boolean bool4 = bool3;
            Boolean bool5 = bool;
            return knowledgeExperienceGb.copy(z, str, bool5, bool2, bool4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getPassed() {
            return this.passed;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getRetryAvailable() {
            return this.retryAvailable;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getShouldShowMarginExperience() {
            return this.shouldShowMarginExperience;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getShouldShowKnowledgeTest() {
            return this.shouldShowKnowledgeTest;
        }

        public final KnowledgeExperienceGb copy(boolean passed, @Json(name = "error_message") String errorMessage, @Json(name = "retry_available") Boolean retryAvailable, @Json(name = "should_show_margin_experience") Boolean shouldShowMarginExperience, @Json(name = "should_show_knowledge_test") Boolean shouldShowKnowledgeTest) {
            return new KnowledgeExperienceGb(passed, errorMessage, retryAvailable, shouldShowMarginExperience, shouldShowKnowledgeTest);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KnowledgeExperienceGb)) {
                return false;
            }
            KnowledgeExperienceGb knowledgeExperienceGb = (KnowledgeExperienceGb) other;
            return this.passed == knowledgeExperienceGb.passed && Intrinsics.areEqual(this.errorMessage, knowledgeExperienceGb.errorMessage) && Intrinsics.areEqual(this.retryAvailable, knowledgeExperienceGb.retryAvailable) && Intrinsics.areEqual(this.shouldShowMarginExperience, knowledgeExperienceGb.shouldShowMarginExperience) && Intrinsics.areEqual(this.shouldShowKnowledgeTest, knowledgeExperienceGb.shouldShowKnowledgeTest);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.passed) * 31;
            String str = this.errorMessage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.retryAvailable;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.shouldShowMarginExperience;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.shouldShowKnowledgeTest;
            return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public String toString() {
            return "KnowledgeExperienceGb(passed=" + this.passed + ", errorMessage=" + this.errorMessage + ", retryAvailable=" + this.retryAvailable + ", shouldShowMarginExperience=" + this.shouldShowMarginExperience + ", shouldShowKnowledgeTest=" + this.shouldShowKnowledgeTest + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.passed ? 1 : 0);
            dest.writeString(this.errorMessage);
            Boolean bool = this.retryAvailable;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.shouldShowMarginExperience;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.shouldShowKnowledgeTest;
            if (bool3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool3.booleanValue() ? 1 : 0);
            }
        }

        public /* synthetic */ KnowledgeExperienceGb(boolean z, String str, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3);
        }

        @Override // com.robinhood.android.lib.margin.api.ApiMarginEligibility2
        public boolean getPassed() {
            return this.passed;
        }

        @Override // com.robinhood.android.lib.margin.api.ApiMarginEligibility2
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public final Boolean getRetryAvailable() {
            return this.retryAvailable;
        }

        public final Boolean getShouldShowMarginExperience() {
            return this.shouldShowMarginExperience;
        }

        public final Boolean getShouldShowKnowledgeTest() {
            return this.shouldShowKnowledgeTest;
        }

        public KnowledgeExperienceGb(boolean z, @Json(name = "error_message") String str, @Json(name = "retry_available") Boolean bool, @Json(name = "should_show_margin_experience") Boolean bool2, @Json(name = "should_show_knowledge_test") Boolean bool3) {
            super(null);
            this.passed = z;
            this.errorMessage = str;
            this.retryAvailable = bool;
            this.shouldShowMarginExperience = bool2;
            this.shouldShowKnowledgeTest = bool3;
        }
    }

    /* compiled from: ApiMarginEligibility.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck$Companion;", "", "<init>", "()V", "IDENTITY", "", "ACCOUNT_BALANCE", "SUITABILITY", "TRADE_HISTORY", "KNOWLEDGE_EXPERIENCE", "ALREADY_ENABLED", "jsonAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "getJsonAdapterFactory", "()Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final JsonAdapter.Factory getJsonAdapterFactory() {
            return ApiMarginEligibility2.jsonAdapterFactory;
        }
    }

    static {
        PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(ApiMarginEligibility2.class, "item_type").withSubtype(Identity.class, "identity").withSubtype(AccountBalance.class, ACCOUNT_BALANCE).withSubtype(Suitability.class, "suitability").withSubtype(TradeHistory.class, TRADE_HISTORY).withSubtype(KnowledgeExperienceGb.class, KNOWLEDGE_EXPERIENCE);
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
        jsonAdapterFactory = polymorphicJsonAdapterFactoryWithSubtype;
    }
}
