package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackInstantAccessDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessDataState;", "", "accessSource", "Lcom/robinhood/android/cash/flat/cashback/ui/AccessSource;", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "error", "", "trialStatus", "Lcom/robinhood/android/cash/flat/cashback/ui/TrialStatus;", "<init>", "(Lcom/robinhood/android/cash/flat/cashback/ui/AccessSource;Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Ljava/lang/Throwable;Lcom/robinhood/android/cash/flat/cashback/ui/TrialStatus;)V", "getAccessSource", "()Lcom/robinhood/android/cash/flat/cashback/ui/AccessSource;", "getContent", "()Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "getError", "()Ljava/lang/Throwable;", "getTrialStatus", "()Lcom/robinhood/android/cash/flat/cashback/ui/TrialStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FlatCashbackInstantAccessDataState {
    public static final int $stable = 8;
    private final TrialRequest2 accessSource;
    private final ProductMarketingContent content;
    private final Throwable error;
    private final FlatCashbackInstantAccessDataState2 trialStatus;

    public static /* synthetic */ FlatCashbackInstantAccessDataState copy$default(FlatCashbackInstantAccessDataState flatCashbackInstantAccessDataState, TrialRequest2 trialRequest2, ProductMarketingContent productMarketingContent, Throwable th, FlatCashbackInstantAccessDataState2 flatCashbackInstantAccessDataState2, int i, Object obj) {
        if ((i & 1) != 0) {
            trialRequest2 = flatCashbackInstantAccessDataState.accessSource;
        }
        if ((i & 2) != 0) {
            productMarketingContent = flatCashbackInstantAccessDataState.content;
        }
        if ((i & 4) != 0) {
            th = flatCashbackInstantAccessDataState.error;
        }
        if ((i & 8) != 0) {
            flatCashbackInstantAccessDataState2 = flatCashbackInstantAccessDataState.trialStatus;
        }
        return flatCashbackInstantAccessDataState.copy(trialRequest2, productMarketingContent, th, flatCashbackInstantAccessDataState2);
    }

    /* renamed from: component1, reason: from getter */
    public final TrialRequest2 getAccessSource() {
        return this.accessSource;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductMarketingContent getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final FlatCashbackInstantAccessDataState2 getTrialStatus() {
        return this.trialStatus;
    }

    public final FlatCashbackInstantAccessDataState copy(TrialRequest2 accessSource, ProductMarketingContent content, Throwable error, FlatCashbackInstantAccessDataState2 trialStatus) {
        Intrinsics.checkNotNullParameter(accessSource, "accessSource");
        return new FlatCashbackInstantAccessDataState(accessSource, content, error, trialStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlatCashbackInstantAccessDataState)) {
            return false;
        }
        FlatCashbackInstantAccessDataState flatCashbackInstantAccessDataState = (FlatCashbackInstantAccessDataState) other;
        return this.accessSource == flatCashbackInstantAccessDataState.accessSource && Intrinsics.areEqual(this.content, flatCashbackInstantAccessDataState.content) && Intrinsics.areEqual(this.error, flatCashbackInstantAccessDataState.error) && this.trialStatus == flatCashbackInstantAccessDataState.trialStatus;
    }

    public int hashCode() {
        int iHashCode = this.accessSource.hashCode() * 31;
        ProductMarketingContent productMarketingContent = this.content;
        int iHashCode2 = (iHashCode + (productMarketingContent == null ? 0 : productMarketingContent.hashCode())) * 31;
        Throwable th = this.error;
        int iHashCode3 = (iHashCode2 + (th == null ? 0 : th.hashCode())) * 31;
        FlatCashbackInstantAccessDataState2 flatCashbackInstantAccessDataState2 = this.trialStatus;
        return iHashCode3 + (flatCashbackInstantAccessDataState2 != null ? flatCashbackInstantAccessDataState2.hashCode() : 0);
    }

    public String toString() {
        return "FlatCashbackInstantAccessDataState(accessSource=" + this.accessSource + ", content=" + this.content + ", error=" + this.error + ", trialStatus=" + this.trialStatus + ")";
    }

    public FlatCashbackInstantAccessDataState(TrialRequest2 accessSource, ProductMarketingContent productMarketingContent, Throwable th, FlatCashbackInstantAccessDataState2 flatCashbackInstantAccessDataState2) {
        Intrinsics.checkNotNullParameter(accessSource, "accessSource");
        this.accessSource = accessSource;
        this.content = productMarketingContent;
        this.error = th;
        this.trialStatus = flatCashbackInstantAccessDataState2;
    }

    public /* synthetic */ FlatCashbackInstantAccessDataState(TrialRequest2 trialRequest2, ProductMarketingContent productMarketingContent, Throwable th, FlatCashbackInstantAccessDataState2 flatCashbackInstantAccessDataState2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(trialRequest2, (i & 2) != 0 ? null : productMarketingContent, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : flatCashbackInstantAccessDataState2);
    }

    public final TrialRequest2 getAccessSource() {
        return this.accessSource;
    }

    public final ProductMarketingContent getContent() {
        return this.content;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final FlatCashbackInstantAccessDataState2 getTrialStatus() {
        return this.trialStatus;
    }
}
