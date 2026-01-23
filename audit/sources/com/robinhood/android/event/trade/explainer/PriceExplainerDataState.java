package com.robinhood.android.event.trade.explainer;

import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.staticcontent.model.OtherMarkdown;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PriceExplainerDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u000eJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/event/trade/explainer/PriceExplainerDataState;", "", "contentResult", "Lkotlin/Result;", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "exchangeSource", "Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "<init>", "(Lkotlin/Result;Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;)V", "getContentResult-xLWZpok", "()Lkotlin/Result;", "getExchangeSource", "()Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "component1", "component1-xLWZpok", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PriceExplainerDataState {
    public static final int $stable = 8;
    private final Result<OtherMarkdown> contentResult;
    private final ExchangeSource exchangeSource;

    /* JADX WARN: Multi-variable type inference failed */
    public PriceExplainerDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PriceExplainerDataState copy$default(PriceExplainerDataState priceExplainerDataState, Result result, ExchangeSource exchangeSource, int i, Object obj) {
        if ((i & 1) != 0) {
            result = priceExplainerDataState.contentResult;
        }
        if ((i & 2) != 0) {
            exchangeSource = priceExplainerDataState.exchangeSource;
        }
        return priceExplainerDataState.copy(result, exchangeSource);
    }

    /* renamed from: component1-xLWZpok, reason: not valid java name */
    public final Result<OtherMarkdown> m14281component1xLWZpok() {
        return this.contentResult;
    }

    /* renamed from: component2, reason: from getter */
    public final ExchangeSource getExchangeSource() {
        return this.exchangeSource;
    }

    public final PriceExplainerDataState copy(Result<OtherMarkdown> contentResult, ExchangeSource exchangeSource) {
        return new PriceExplainerDataState(contentResult, exchangeSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceExplainerDataState)) {
            return false;
        }
        PriceExplainerDataState priceExplainerDataState = (PriceExplainerDataState) other;
        return Intrinsics.areEqual(this.contentResult, priceExplainerDataState.contentResult) && this.exchangeSource == priceExplainerDataState.exchangeSource;
    }

    public int hashCode() {
        Result<OtherMarkdown> result = this.contentResult;
        int iM28554hashCodeimpl = (result == null ? 0 : Result.m28554hashCodeimpl(result.getValue())) * 31;
        ExchangeSource exchangeSource = this.exchangeSource;
        return iM28554hashCodeimpl + (exchangeSource != null ? exchangeSource.hashCode() : 0);
    }

    public String toString() {
        return "PriceExplainerDataState(contentResult=" + this.contentResult + ", exchangeSource=" + this.exchangeSource + ")";
    }

    public PriceExplainerDataState(Result<OtherMarkdown> result, ExchangeSource exchangeSource) {
        this.contentResult = result;
        this.exchangeSource = exchangeSource;
    }

    public /* synthetic */ PriceExplainerDataState(Result result, ExchangeSource exchangeSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : result, (i & 2) != 0 ? null : exchangeSource);
    }

    /* renamed from: getContentResult-xLWZpok, reason: not valid java name */
    public final Result<OtherMarkdown> m14282getContentResultxLWZpok() {
        return this.contentResult;
    }

    public final ExchangeSource getExchangeSource() {
        return this.exchangeSource;
    }
}
