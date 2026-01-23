package com.robinhood.android.common.margin.p083ui.withdrawal;

import com.robinhood.android.common.margin.p083ui.MarginSpendingProduct;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginWithdrawalPromptViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState;", "", "<init>", "()V", "Loading", "Success", "Failure", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState$Failure;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState$Loading;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState$Success;", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class MarginWithdrawalPromptViewState {
    public static final int $stable = 0;

    public /* synthetic */ MarginWithdrawalPromptViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarginWithdrawalPromptViewState() {
    }

    /* compiled from: MarginWithdrawalPromptViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState$Loading;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState;", "<init>", "()V", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends MarginWithdrawalPromptViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: MarginWithdrawalPromptViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState$Success;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState;", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "feature", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "<init>", "(Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;)V", "getProduct", "()Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "getFeature", "()Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends MarginWithdrawalPromptViewState {
        public static final int $stable = 8;
        private final ProductMarketingContent.Feature feature;
        private final MarginSpendingProduct product;

        public static /* synthetic */ Success copy$default(Success success, MarginSpendingProduct marginSpendingProduct, ProductMarketingContent.Feature feature, int i, Object obj) {
            if ((i & 1) != 0) {
                marginSpendingProduct = success.product;
            }
            if ((i & 2) != 0) {
                feature = success.feature;
            }
            return success.copy(marginSpendingProduct, feature);
        }

        /* renamed from: component1, reason: from getter */
        public final MarginSpendingProduct getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final ProductMarketingContent.Feature getFeature() {
            return this.feature;
        }

        public final Success copy(MarginSpendingProduct product, ProductMarketingContent.Feature feature) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            return new Success(product, feature);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return this.product == success.product && Intrinsics.areEqual(this.feature, success.feature);
        }

        public int hashCode() {
            MarginSpendingProduct marginSpendingProduct = this.product;
            return ((marginSpendingProduct == null ? 0 : marginSpendingProduct.hashCode()) * 31) + this.feature.hashCode();
        }

        public String toString() {
            return "Success(product=" + this.product + ", feature=" + this.feature + ")";
        }

        public final MarginSpendingProduct getProduct() {
            return this.product;
        }

        public final ProductMarketingContent.Feature getFeature() {
            return this.feature;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(MarginSpendingProduct marginSpendingProduct, ProductMarketingContent.Feature feature) {
            super(null);
            Intrinsics.checkNotNullParameter(feature, "feature");
            this.product = marginSpendingProduct;
            this.feature = feature;
        }
    }

    /* compiled from: MarginWithdrawalPromptViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState$Failure;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure extends MarginWithdrawalPromptViewState {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.throwable;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Failure copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Failure(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.throwable, ((Failure) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Failure(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
