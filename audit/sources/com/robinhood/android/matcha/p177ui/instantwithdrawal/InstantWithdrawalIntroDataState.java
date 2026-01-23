package com.robinhood.android.matcha.p177ui.instantwithdrawal;

import com.robinhood.android.models.matcha.api.ApiMatchaTreatment;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantWithdrawalIntroDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroDataState;", "", "variant", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTreatment$InstantWithdrawalVariant;", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "error", "", "<init>", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaTreatment$InstantWithdrawalVariant;Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Ljava/lang/Throwable;)V", "getVariant", "()Lcom/robinhood/android/models/matcha/api/ApiMatchaTreatment$InstantWithdrawalVariant;", "getContent", "()Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class InstantWithdrawalIntroDataState {
    public static final int $stable = 8;
    private final ProductMarketingContent content;
    private final Throwable error;
    private final ApiMatchaTreatment.InstantWithdrawalVariant variant;

    public static /* synthetic */ InstantWithdrawalIntroDataState copy$default(InstantWithdrawalIntroDataState instantWithdrawalIntroDataState, ApiMatchaTreatment.InstantWithdrawalVariant instantWithdrawalVariant, ProductMarketingContent productMarketingContent, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            instantWithdrawalVariant = instantWithdrawalIntroDataState.variant;
        }
        if ((i & 2) != 0) {
            productMarketingContent = instantWithdrawalIntroDataState.content;
        }
        if ((i & 4) != 0) {
            th = instantWithdrawalIntroDataState.error;
        }
        return instantWithdrawalIntroDataState.copy(instantWithdrawalVariant, productMarketingContent, th);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiMatchaTreatment.InstantWithdrawalVariant getVariant() {
        return this.variant;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductMarketingContent getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final InstantWithdrawalIntroDataState copy(ApiMatchaTreatment.InstantWithdrawalVariant variant, ProductMarketingContent content, Throwable error) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new InstantWithdrawalIntroDataState(variant, content, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantWithdrawalIntroDataState)) {
            return false;
        }
        InstantWithdrawalIntroDataState instantWithdrawalIntroDataState = (InstantWithdrawalIntroDataState) other;
        return this.variant == instantWithdrawalIntroDataState.variant && Intrinsics.areEqual(this.content, instantWithdrawalIntroDataState.content) && Intrinsics.areEqual(this.error, instantWithdrawalIntroDataState.error);
    }

    public int hashCode() {
        int iHashCode = this.variant.hashCode() * 31;
        ProductMarketingContent productMarketingContent = this.content;
        int iHashCode2 = (iHashCode + (productMarketingContent == null ? 0 : productMarketingContent.hashCode())) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "InstantWithdrawalIntroDataState(variant=" + this.variant + ", content=" + this.content + ", error=" + this.error + ")";
    }

    public InstantWithdrawalIntroDataState(ApiMatchaTreatment.InstantWithdrawalVariant variant, ProductMarketingContent productMarketingContent, Throwable th) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.variant = variant;
        this.content = productMarketingContent;
        this.error = th;
    }

    public /* synthetic */ InstantWithdrawalIntroDataState(ApiMatchaTreatment.InstantWithdrawalVariant instantWithdrawalVariant, ProductMarketingContent productMarketingContent, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(instantWithdrawalVariant, (i & 2) != 0 ? null : productMarketingContent, (i & 4) != 0 ? null : th);
    }

    public final ApiMatchaTreatment.InstantWithdrawalVariant getVariant() {
        return this.variant;
    }

    public final ProductMarketingContent getContent() {
        return this.content;
    }

    public final Throwable getError() {
        return this.error;
    }
}
