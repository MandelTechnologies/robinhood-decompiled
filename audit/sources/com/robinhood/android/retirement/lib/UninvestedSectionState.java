package com.robinhood.android.retirement.lib;

import com.robinhood.android.models.retirement.api.analytics.RecommendationsState;
import com.robinhood.android.models.retirement.api.analytics.RetirementAccountState;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.retirement.contracts.RetirementUninvestedModal;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UninvestedSection.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/retirement/lib/UninvestedSectionState;", "", "content", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$MobileContent;", "accountState", "Lcom/robinhood/android/models/retirement/api/analytics/RetirementAccountState;", "recsState", "Lcom/robinhood/android/models/retirement/api/analytics/RecommendationsState;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$MobileContent;Lcom/robinhood/android/models/retirement/api/analytics/RetirementAccountState;Lcom/robinhood/android/models/retirement/api/analytics/RecommendationsState;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getContent", "()Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$MobileContent;", "getAccountState", "()Lcom/robinhood/android/models/retirement/api/analytics/RetirementAccountState;", "getRecsState", "()Lcom/robinhood/android/models/retirement/api/analytics/RecommendationsState;", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "loggingInfo", "Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal$UninvestedLoggingInfo;", "getLoggingInfo", "()Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal$UninvestedLoggingInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UninvestedSectionState {
    private static final String LoggingIdentifier = "uninvested";
    private final RetirementAccountState accountState;
    private final BrokerageAccountType accountType;
    private final RetirementUninvestedViewModel.MobileContent content;
    private final RecommendationsState recsState;
    public static final int $stable = 8;

    public static /* synthetic */ UninvestedSectionState copy$default(UninvestedSectionState uninvestedSectionState, RetirementUninvestedViewModel.MobileContent mobileContent, RetirementAccountState retirementAccountState, RecommendationsState recommendationsState, BrokerageAccountType brokerageAccountType, int i, Object obj) {
        if ((i & 1) != 0) {
            mobileContent = uninvestedSectionState.content;
        }
        if ((i & 2) != 0) {
            retirementAccountState = uninvestedSectionState.accountState;
        }
        if ((i & 4) != 0) {
            recommendationsState = uninvestedSectionState.recsState;
        }
        if ((i & 8) != 0) {
            brokerageAccountType = uninvestedSectionState.accountType;
        }
        return uninvestedSectionState.copy(mobileContent, retirementAccountState, recommendationsState, brokerageAccountType);
    }

    /* renamed from: component1, reason: from getter */
    public final RetirementUninvestedViewModel.MobileContent getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final RetirementAccountState getAccountState() {
        return this.accountState;
    }

    /* renamed from: component3, reason: from getter */
    public final RecommendationsState getRecsState() {
        return this.recsState;
    }

    /* renamed from: component4, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final UninvestedSectionState copy(RetirementUninvestedViewModel.MobileContent content, RetirementAccountState accountState, RecommendationsState recsState, BrokerageAccountType accountType) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(accountState, "accountState");
        Intrinsics.checkNotNullParameter(recsState, "recsState");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return new UninvestedSectionState(content, accountState, recsState, accountType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UninvestedSectionState)) {
            return false;
        }
        UninvestedSectionState uninvestedSectionState = (UninvestedSectionState) other;
        return Intrinsics.areEqual(this.content, uninvestedSectionState.content) && this.accountState == uninvestedSectionState.accountState && this.recsState == uninvestedSectionState.recsState && this.accountType == uninvestedSectionState.accountType;
    }

    public int hashCode() {
        return (((((this.content.hashCode() * 31) + this.accountState.hashCode()) * 31) + this.recsState.hashCode()) * 31) + this.accountType.hashCode();
    }

    public String toString() {
        return "UninvestedSectionState(content=" + this.content + ", accountState=" + this.accountState + ", recsState=" + this.recsState + ", accountType=" + this.accountType + ")";
    }

    public UninvestedSectionState(RetirementUninvestedViewModel.MobileContent content, RetirementAccountState accountState, RecommendationsState recsState, BrokerageAccountType accountType) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(accountState, "accountState");
        Intrinsics.checkNotNullParameter(recsState, "recsState");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.content = content;
        this.accountState = accountState;
        this.recsState = recsState;
        this.accountType = accountType;
    }

    public final RetirementUninvestedViewModel.MobileContent getContent() {
        return this.content;
    }

    public final RetirementAccountState getAccountState() {
        return this.accountState;
    }

    public final RecommendationsState getRecsState() {
        return this.recsState;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final RetirementUninvestedModal.UninvestedLoggingInfo getLoggingInfo() {
        return new RetirementUninvestedModal.UninvestedLoggingInfo(LoggingIdentifier, this.accountState, this.recsState, this.accountType);
    }
}
