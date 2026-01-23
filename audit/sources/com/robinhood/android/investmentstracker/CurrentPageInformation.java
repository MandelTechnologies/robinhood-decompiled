package com.robinhood.android.investmentstracker;

import bff_money_movement.service.p019v1.InvestmentsTrackerPageTypeDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/CurrentPageInformation;", "", "pageType", "Lbff_money_movement/service/v1/InvestmentsTrackerPageTypeDto;", "accountId", "", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerPageTypeDto;Ljava/lang/String;)V", "getPageType", "()Lbff_money_movement/service/v1/InvestmentsTrackerPageTypeDto;", "getAccountId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CurrentPageInformation {
    public static final int $stable = 0;
    private final String accountId;
    private final InvestmentsTrackerPageTypeDto pageType;

    public static /* synthetic */ CurrentPageInformation copy$default(CurrentPageInformation currentPageInformation, InvestmentsTrackerPageTypeDto investmentsTrackerPageTypeDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerPageTypeDto = currentPageInformation.pageType;
        }
        if ((i & 2) != 0) {
            str = currentPageInformation.accountId;
        }
        return currentPageInformation.copy(investmentsTrackerPageTypeDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerPageTypeDto getPageType() {
        return this.pageType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    public final CurrentPageInformation copy(InvestmentsTrackerPageTypeDto pageType, String accountId) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        return new CurrentPageInformation(pageType, accountId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentPageInformation)) {
            return false;
        }
        CurrentPageInformation currentPageInformation = (CurrentPageInformation) other;
        return this.pageType == currentPageInformation.pageType && Intrinsics.areEqual(this.accountId, currentPageInformation.accountId);
    }

    public int hashCode() {
        int iHashCode = this.pageType.hashCode() * 31;
        String str = this.accountId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CurrentPageInformation(pageType=" + this.pageType + ", accountId=" + this.accountId + ")";
    }

    public CurrentPageInformation(InvestmentsTrackerPageTypeDto pageType, String str) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        this.pageType = pageType;
        this.accountId = str;
    }

    public /* synthetic */ CurrentPageInformation(InvestmentsTrackerPageTypeDto investmentsTrackerPageTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(investmentsTrackerPageTypeDto, (i & 2) != 0 ? null : str);
    }

    public final InvestmentsTrackerPageTypeDto getPageType() {
        return this.pageType;
    }

    public final String getAccountId() {
        return this.accountId;
    }
}
