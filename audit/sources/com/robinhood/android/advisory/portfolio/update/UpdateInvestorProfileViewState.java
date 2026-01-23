package com.robinhood.android.advisory.portfolio.update;

import com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutData;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateInvestorProfileViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileViewState$Loaded;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileViewState$Loading;", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface UpdateInvestorProfileViewState {

    /* compiled from: UpdateInvestorProfileViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileViewState$Loading;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements UpdateInvestorProfileViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1199892976;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: UpdateInvestorProfileViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileViewState$Loaded;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileViewState;", "accountNumber", "", "applicationId", "title", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "microgramDonutData", "Lcom/robinhood/android/advisory/portfolio/update/donut/UpdateInvestorProfileDonutData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/advisory/portfolio/update/donut/UpdateInvestorProfileDonutData;)V", "getAccountNumber", "()Ljava/lang/String;", "getApplicationId", "getTitle", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getMicrogramDonutData", "()Lcom/robinhood/android/advisory/portfolio/update/donut/UpdateInvestorProfileDonutData;", "donutData", "getDonutData", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements UpdateInvestorProfileViewState {
        public static final int $stable = 0;
        private final String accountNumber;
        private final String applicationId;
        private final BrokerageAccountType brokerageAccountType;
        private final UpdateInvestorProfileDonutData microgramDonutData;
        private final String title;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, String str3, BrokerageAccountType brokerageAccountType, UpdateInvestorProfileDonutData updateInvestorProfileDonutData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = loaded.applicationId;
            }
            if ((i & 4) != 0) {
                str3 = loaded.title;
            }
            if ((i & 8) != 0) {
                brokerageAccountType = loaded.brokerageAccountType;
            }
            if ((i & 16) != 0) {
                updateInvestorProfileDonutData = loaded.microgramDonutData;
            }
            UpdateInvestorProfileDonutData updateInvestorProfileDonutData2 = updateInvestorProfileDonutData;
            String str4 = str3;
            return loaded.copy(str, str2, str4, brokerageAccountType, updateInvestorProfileDonutData2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component5, reason: from getter */
        public final UpdateInvestorProfileDonutData getMicrogramDonutData() {
            return this.microgramDonutData;
        }

        public final Loaded copy(String accountNumber, String applicationId, String title, BrokerageAccountType brokerageAccountType, UpdateInvestorProfileDonutData microgramDonutData) {
            return new Loaded(accountNumber, applicationId, title, brokerageAccountType, microgramDonutData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.accountNumber, loaded.accountNumber) && Intrinsics.areEqual(this.applicationId, loaded.applicationId) && Intrinsics.areEqual(this.title, loaded.title) && this.brokerageAccountType == loaded.brokerageAccountType && Intrinsics.areEqual(this.microgramDonutData, loaded.microgramDonutData);
        }

        public int hashCode() {
            String str = this.accountNumber;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.applicationId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
            int iHashCode4 = (iHashCode3 + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
            UpdateInvestorProfileDonutData updateInvestorProfileDonutData = this.microgramDonutData;
            return iHashCode4 + (updateInvestorProfileDonutData != null ? updateInvestorProfileDonutData.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(accountNumber=" + this.accountNumber + ", applicationId=" + this.applicationId + ", title=" + this.title + ", brokerageAccountType=" + this.brokerageAccountType + ", microgramDonutData=" + this.microgramDonutData + ")";
        }

        public Loaded(String str, String str2, String str3, BrokerageAccountType brokerageAccountType, UpdateInvestorProfileDonutData updateInvestorProfileDonutData) {
            this.accountNumber = str;
            this.applicationId = str2;
            this.title = str3;
            this.brokerageAccountType = brokerageAccountType;
            this.microgramDonutData = updateInvestorProfileDonutData;
        }

        public /* synthetic */ Loaded(String str, String str2, String str3, BrokerageAccountType brokerageAccountType, UpdateInvestorProfileDonutData updateInvestorProfileDonutData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, brokerageAccountType, (i & 16) != 0 ? null : updateInvestorProfileDonutData);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final UpdateInvestorProfileDonutData getMicrogramDonutData() {
            return this.microgramDonutData;
        }

        public final UpdateInvestorProfileDonutData getDonutData() {
            return this.microgramDonutData;
        }
    }
}
