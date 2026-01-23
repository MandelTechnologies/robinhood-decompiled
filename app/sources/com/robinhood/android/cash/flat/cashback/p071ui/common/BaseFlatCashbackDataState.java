package com.robinhood.android.cash.flat.cashback.p071ui.common;

import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFlatCashbackDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDataState;", "T", "", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "error", "", WebsocketGatewayConstants.DATA_KEY, "<init>", "(Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Ljava/lang/Throwable;Ljava/lang/Object;)V", "getContent", "()Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "getError", "()Ljava/lang/Throwable;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "(Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Ljava/lang/Throwable;Ljava/lang/Object;)Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDataState;", "equals", "", "other", "hashCode", "", "toString", "", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BaseFlatCashbackDataState<T> {
    public static final int $stable = 8;
    private final ProductMarketingContent content;
    private final T data;
    private final Throwable error;

    public BaseFlatCashbackDataState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseFlatCashbackDataState copy$default(BaseFlatCashbackDataState baseFlatCashbackDataState, ProductMarketingContent productMarketingContent, Throwable th, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            productMarketingContent = baseFlatCashbackDataState.content;
        }
        if ((i & 2) != 0) {
            th = baseFlatCashbackDataState.error;
        }
        if ((i & 4) != 0) {
            obj = baseFlatCashbackDataState.data;
        }
        return baseFlatCashbackDataState.copy(productMarketingContent, th, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductMarketingContent getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final T component3() {
        return this.data;
    }

    public final BaseFlatCashbackDataState<T> copy(ProductMarketingContent content, Throwable error, T data) {
        return new BaseFlatCashbackDataState<>(content, error, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseFlatCashbackDataState)) {
            return false;
        }
        BaseFlatCashbackDataState baseFlatCashbackDataState = (BaseFlatCashbackDataState) other;
        return Intrinsics.areEqual(this.content, baseFlatCashbackDataState.content) && Intrinsics.areEqual(this.error, baseFlatCashbackDataState.error) && Intrinsics.areEqual(this.data, baseFlatCashbackDataState.data);
    }

    public int hashCode() {
        ProductMarketingContent productMarketingContent = this.content;
        int iHashCode = (productMarketingContent == null ? 0 : productMarketingContent.hashCode()) * 31;
        Throwable th = this.error;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        T t = this.data;
        return iHashCode2 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "BaseFlatCashbackDataState(content=" + this.content + ", error=" + this.error + ", data=" + this.data + ")";
    }

    public BaseFlatCashbackDataState(ProductMarketingContent productMarketingContent, Throwable th, T t) {
        this.content = productMarketingContent;
        this.error = th;
        this.data = t;
    }

    public /* synthetic */ BaseFlatCashbackDataState(ProductMarketingContent productMarketingContent, Throwable th, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : productMarketingContent, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : obj);
    }

    public final ProductMarketingContent getContent() {
        return this.content;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final T getData() {
        return this.data;
    }
}
