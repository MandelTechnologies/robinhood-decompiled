package com.robinhood.android.advisory.portfolio.update;

import com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutData;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateInvestorProfileDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileDataState;", "", "isLoaded", "", "accountNumber", "", "applicationId", "title", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "donutData", "Lcom/robinhood/android/advisory/portfolio/update/donut/UpdateInvestorProfileDonutData;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/advisory/portfolio/update/donut/UpdateInvestorProfileDonutData;)V", "()Z", "getAccountNumber", "()Ljava/lang/String;", "getApplicationId", "getTitle", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getDonutData", "()Lcom/robinhood/android/advisory/portfolio/update/donut/UpdateInvestorProfileDonutData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateInvestorProfileDataState {
    public static final int $stable = 0;
    private final String accountNumber;
    private final String applicationId;
    private final BrokerageAccountType brokerageAccountType;
    private final UpdateInvestorProfileDonutData donutData;
    private final boolean isLoaded;
    private final String title;

    public static /* synthetic */ UpdateInvestorProfileDataState copy$default(UpdateInvestorProfileDataState updateInvestorProfileDataState, boolean z, String str, String str2, String str3, BrokerageAccountType brokerageAccountType, UpdateInvestorProfileDonutData updateInvestorProfileDonutData, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updateInvestorProfileDataState.isLoaded;
        }
        if ((i & 2) != 0) {
            str = updateInvestorProfileDataState.accountNumber;
        }
        if ((i & 4) != 0) {
            str2 = updateInvestorProfileDataState.applicationId;
        }
        if ((i & 8) != 0) {
            str3 = updateInvestorProfileDataState.title;
        }
        if ((i & 16) != 0) {
            brokerageAccountType = updateInvestorProfileDataState.brokerageAccountType;
        }
        if ((i & 32) != 0) {
            updateInvestorProfileDonutData = updateInvestorProfileDataState.donutData;
        }
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        UpdateInvestorProfileDonutData updateInvestorProfileDonutData2 = updateInvestorProfileDonutData;
        return updateInvestorProfileDataState.copy(z, str, str2, str3, brokerageAccountType2, updateInvestorProfileDonutData2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoaded() {
        return this.isLoaded;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component6, reason: from getter */
    public final UpdateInvestorProfileDonutData getDonutData() {
        return this.donutData;
    }

    public final UpdateInvestorProfileDataState copy(boolean isLoaded, String accountNumber, String applicationId, String title, BrokerageAccountType brokerageAccountType, UpdateInvestorProfileDonutData donutData) {
        return new UpdateInvestorProfileDataState(isLoaded, accountNumber, applicationId, title, brokerageAccountType, donutData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateInvestorProfileDataState)) {
            return false;
        }
        UpdateInvestorProfileDataState updateInvestorProfileDataState = (UpdateInvestorProfileDataState) other;
        return this.isLoaded == updateInvestorProfileDataState.isLoaded && Intrinsics.areEqual(this.accountNumber, updateInvestorProfileDataState.accountNumber) && Intrinsics.areEqual(this.applicationId, updateInvestorProfileDataState.applicationId) && Intrinsics.areEqual(this.title, updateInvestorProfileDataState.title) && this.brokerageAccountType == updateInvestorProfileDataState.brokerageAccountType && Intrinsics.areEqual(this.donutData, updateInvestorProfileDataState.donutData);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoaded) * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.applicationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        int iHashCode5 = (iHashCode4 + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        UpdateInvestorProfileDonutData updateInvestorProfileDonutData = this.donutData;
        return iHashCode5 + (updateInvestorProfileDonutData != null ? updateInvestorProfileDonutData.hashCode() : 0);
    }

    public String toString() {
        return "UpdateInvestorProfileDataState(isLoaded=" + this.isLoaded + ", accountNumber=" + this.accountNumber + ", applicationId=" + this.applicationId + ", title=" + this.title + ", brokerageAccountType=" + this.brokerageAccountType + ", donutData=" + this.donutData + ")";
    }

    public UpdateInvestorProfileDataState(boolean z, String str, String str2, String str3, BrokerageAccountType brokerageAccountType, UpdateInvestorProfileDonutData updateInvestorProfileDonutData) {
        this.isLoaded = z;
        this.accountNumber = str;
        this.applicationId = str2;
        this.title = str3;
        this.brokerageAccountType = brokerageAccountType;
        this.donutData = updateInvestorProfileDonutData;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ UpdateInvestorProfileDataState(boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.robinhood.models.api.BrokerageAccountType r6, com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutData r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto Lb
            r5 = r0
        Lb:
            r8 = r8 & 32
            if (r8 == 0) goto L17
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L1e
        L17:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L1e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDataState.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, com.robinhood.models.api.BrokerageAccountType, com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean isLoaded() {
        return this.isLoaded;
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

    public final UpdateInvestorProfileDonutData getDonutData() {
        return this.donutData;
    }
}
