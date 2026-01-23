package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CryptoLimitOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState;", "", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "<init>", "(Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;)V", "getRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "Loading", "Loaded", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loading;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoLimitOrderViewState {
    public static final int $stable = 8;
    private final RequestInputs requestInputs;

    public /* synthetic */ CryptoLimitOrderViewState(RequestInputs requestInputs, DefaultConstructorMarker defaultConstructorMarker) {
        this(requestInputs);
    }

    private CryptoLimitOrderViewState(RequestInputs requestInputs) {
        this.requestInputs = requestInputs;
    }

    public RequestInputs getRequestInputs() {
        return this.requestInputs;
    }

    /* compiled from: CryptoLimitOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loading;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState;", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "<init>", "(Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;)V", "getRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoLimitOrderViewState {
        public static final int $stable = 8;
        private final RequestInputs requestInputs;

        public static /* synthetic */ Loading copy$default(Loading loading, RequestInputs requestInputs, int i, Object obj) {
            if ((i & 1) != 0) {
                requestInputs = loading.requestInputs;
            }
            return loading.copy(requestInputs);
        }

        /* renamed from: component1, reason: from getter */
        public final RequestInputs getRequestInputs() {
            return this.requestInputs;
        }

        public final Loading copy(RequestInputs requestInputs) {
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            return new Loading(requestInputs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.requestInputs, ((Loading) other).requestInputs);
        }

        public int hashCode() {
            return this.requestInputs.hashCode();
        }

        public String toString() {
            return "Loading(requestInputs=" + this.requestInputs + ")";
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderViewState
        public RequestInputs getRequestInputs() {
            return this.requestInputs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(RequestInputs requestInputs) {
            super(requestInputs, null);
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            this.requestInputs = requestInputs;
        }
    }

    /* compiled from: CryptoLimitOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0006OPQRSTB}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010?\u001a\u00020\u000fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010A\u001a\u00020\u0012HÆ\u0003J\t\u0010B\u001a\u00020\u0014HÆ\u0003J\t\u0010C\u001a\u00020\u0016HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010E\u001a\u00020\u001aHÆ\u0003J\t\u0010F\u001a\u00020\u001cHÆ\u0003J\u009b\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001J\u0013\u0010H\u001a\u00020\u00142\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020NHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u00100R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006U"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState;", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "toolbarContent", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$ToolbarContent;", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "headerContent", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$HeaderContent;", "inputAmountRow", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$InputAmountRow;", "feeRow1", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "limitRow", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$LimitRow;", "feeRow2", "focusedEdtType", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEdtType;", "isNumpadDecimalSeparatorEnabled", "", "estimatedAmountRow", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$EstimatedAmountRow;", "reviewContent", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "ctaButtonState", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState;", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "<init>", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$ToolbarContent;Lcom/robinhood/android/lib/trade/DefaultOrderState;Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$HeaderContent;Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$InputAmountRow;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$LimitRow;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEdtType;ZLcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$EstimatedAmountRow;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState;Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;)V", "getCryptoOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getToolbarContent", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$ToolbarContent;", "getFormState", "()Lcom/robinhood/android/lib/trade/DefaultOrderState;", "getHeaderContent", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$HeaderContent;", "getInputAmountRow", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$InputAmountRow;", "getFeeRow1", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "getLimitRow", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$LimitRow;", "getFeeRow2", "getFocusedEdtType", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEdtType;", "()Z", "getEstimatedAmountRow", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$EstimatedAmountRow;", "getReviewContent", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "getCtaButtonState", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState;", "getRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ToolbarContent", "HeaderContent", "InputAmountRow", "LimitRow", "EstimatedAmountRow", "CtaButtonState", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends CryptoLimitOrderViewState {
        public static final int $stable = 8;
        private final CryptoOrderContext cryptoOrderContext;
        private final CtaButtonState ctaButtonState;
        private final EstimatedAmountRow estimatedAmountRow;
        private final CryptoOrderReviewRowState feeRow1;
        private final CryptoOrderReviewRowState feeRow2;
        private final CryptoLimitOrderEdtType focusedEdtType;
        private final DefaultOrderState formState;
        private final HeaderContent headerContent;
        private final InputAmountRow inputAmountRow;
        private final boolean isNumpadDecimalSeparatorEnabled;
        private final LimitRow limitRow;
        private final RequestInputs requestInputs;
        private final CryptoOrderReviewMessageAndDisclosuresState reviewContent;
        private final ToolbarContent toolbarContent;

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsNumpadDecimalSeparatorEnabled() {
            return this.isNumpadDecimalSeparatorEnabled;
        }

        /* renamed from: component11, reason: from getter */
        public final EstimatedAmountRow getEstimatedAmountRow() {
            return this.estimatedAmountRow;
        }

        /* renamed from: component12, reason: from getter */
        public final CryptoOrderReviewMessageAndDisclosuresState getReviewContent() {
            return this.reviewContent;
        }

        /* renamed from: component13, reason: from getter */
        public final CtaButtonState getCtaButtonState() {
            return this.ctaButtonState;
        }

        /* renamed from: component14, reason: from getter */
        public final RequestInputs getRequestInputs() {
            return this.requestInputs;
        }

        /* renamed from: component2, reason: from getter */
        public final ToolbarContent getToolbarContent() {
            return this.toolbarContent;
        }

        /* renamed from: component3, reason: from getter */
        public final DefaultOrderState getFormState() {
            return this.formState;
        }

        /* renamed from: component4, reason: from getter */
        public final HeaderContent getHeaderContent() {
            return this.headerContent;
        }

        /* renamed from: component5, reason: from getter */
        public final InputAmountRow getInputAmountRow() {
            return this.inputAmountRow;
        }

        /* renamed from: component6, reason: from getter */
        public final CryptoOrderReviewRowState getFeeRow1() {
            return this.feeRow1;
        }

        /* renamed from: component7, reason: from getter */
        public final LimitRow getLimitRow() {
            return this.limitRow;
        }

        /* renamed from: component8, reason: from getter */
        public final CryptoOrderReviewRowState getFeeRow2() {
            return this.feeRow2;
        }

        /* renamed from: component9, reason: from getter */
        public final CryptoLimitOrderEdtType getFocusedEdtType() {
            return this.focusedEdtType;
        }

        public final Loaded copy(CryptoOrderContext cryptoOrderContext, ToolbarContent toolbarContent, DefaultOrderState formState, HeaderContent headerContent, InputAmountRow inputAmountRow, CryptoOrderReviewRowState feeRow1, LimitRow limitRow, CryptoOrderReviewRowState feeRow2, CryptoLimitOrderEdtType focusedEdtType, boolean isNumpadDecimalSeparatorEnabled, EstimatedAmountRow estimatedAmountRow, CryptoOrderReviewMessageAndDisclosuresState reviewContent, CtaButtonState ctaButtonState, RequestInputs requestInputs) {
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            Intrinsics.checkNotNullParameter(toolbarContent, "toolbarContent");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(headerContent, "headerContent");
            Intrinsics.checkNotNullParameter(inputAmountRow, "inputAmountRow");
            Intrinsics.checkNotNullParameter(limitRow, "limitRow");
            Intrinsics.checkNotNullParameter(focusedEdtType, "focusedEdtType");
            Intrinsics.checkNotNullParameter(estimatedAmountRow, "estimatedAmountRow");
            Intrinsics.checkNotNullParameter(ctaButtonState, "ctaButtonState");
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            return new Loaded(cryptoOrderContext, toolbarContent, formState, headerContent, inputAmountRow, feeRow1, limitRow, feeRow2, focusedEdtType, isNumpadDecimalSeparatorEnabled, estimatedAmountRow, reviewContent, ctaButtonState, requestInputs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.cryptoOrderContext, loaded.cryptoOrderContext) && Intrinsics.areEqual(this.toolbarContent, loaded.toolbarContent) && this.formState == loaded.formState && Intrinsics.areEqual(this.headerContent, loaded.headerContent) && Intrinsics.areEqual(this.inputAmountRow, loaded.inputAmountRow) && Intrinsics.areEqual(this.feeRow1, loaded.feeRow1) && Intrinsics.areEqual(this.limitRow, loaded.limitRow) && Intrinsics.areEqual(this.feeRow2, loaded.feeRow2) && this.focusedEdtType == loaded.focusedEdtType && this.isNumpadDecimalSeparatorEnabled == loaded.isNumpadDecimalSeparatorEnabled && Intrinsics.areEqual(this.estimatedAmountRow, loaded.estimatedAmountRow) && Intrinsics.areEqual(this.reviewContent, loaded.reviewContent) && Intrinsics.areEqual(this.ctaButtonState, loaded.ctaButtonState) && Intrinsics.areEqual(this.requestInputs, loaded.requestInputs);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.cryptoOrderContext.hashCode() * 31) + this.toolbarContent.hashCode()) * 31) + this.formState.hashCode()) * 31) + this.headerContent.hashCode()) * 31) + this.inputAmountRow.hashCode()) * 31;
            CryptoOrderReviewRowState cryptoOrderReviewRowState = this.feeRow1;
            int iHashCode2 = (((iHashCode + (cryptoOrderReviewRowState == null ? 0 : cryptoOrderReviewRowState.hashCode())) * 31) + this.limitRow.hashCode()) * 31;
            CryptoOrderReviewRowState cryptoOrderReviewRowState2 = this.feeRow2;
            int iHashCode3 = (((((((iHashCode2 + (cryptoOrderReviewRowState2 == null ? 0 : cryptoOrderReviewRowState2.hashCode())) * 31) + this.focusedEdtType.hashCode()) * 31) + Boolean.hashCode(this.isNumpadDecimalSeparatorEnabled)) * 31) + this.estimatedAmountRow.hashCode()) * 31;
            CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = this.reviewContent;
            return ((((iHashCode3 + (cryptoOrderReviewMessageAndDisclosuresState != null ? cryptoOrderReviewMessageAndDisclosuresState.hashCode() : 0)) * 31) + this.ctaButtonState.hashCode()) * 31) + this.requestInputs.hashCode();
        }

        public String toString() {
            return "Loaded(cryptoOrderContext=" + this.cryptoOrderContext + ", toolbarContent=" + this.toolbarContent + ", formState=" + this.formState + ", headerContent=" + this.headerContent + ", inputAmountRow=" + this.inputAmountRow + ", feeRow1=" + this.feeRow1 + ", limitRow=" + this.limitRow + ", feeRow2=" + this.feeRow2 + ", focusedEdtType=" + this.focusedEdtType + ", isNumpadDecimalSeparatorEnabled=" + this.isNumpadDecimalSeparatorEnabled + ", estimatedAmountRow=" + this.estimatedAmountRow + ", reviewContent=" + this.reviewContent + ", ctaButtonState=" + this.ctaButtonState + ", requestInputs=" + this.requestInputs + ")";
        }

        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        public final ToolbarContent getToolbarContent() {
            return this.toolbarContent;
        }

        public final DefaultOrderState getFormState() {
            return this.formState;
        }

        public final HeaderContent getHeaderContent() {
            return this.headerContent;
        }

        public final InputAmountRow getInputAmountRow() {
            return this.inputAmountRow;
        }

        public final CryptoOrderReviewRowState getFeeRow1() {
            return this.feeRow1;
        }

        public final LimitRow getLimitRow() {
            return this.limitRow;
        }

        public final CryptoOrderReviewRowState getFeeRow2() {
            return this.feeRow2;
        }

        public final CryptoLimitOrderEdtType getFocusedEdtType() {
            return this.focusedEdtType;
        }

        public final boolean isNumpadDecimalSeparatorEnabled() {
            return this.isNumpadDecimalSeparatorEnabled;
        }

        public final EstimatedAmountRow getEstimatedAmountRow() {
            return this.estimatedAmountRow;
        }

        public final CryptoOrderReviewMessageAndDisclosuresState getReviewContent() {
            return this.reviewContent;
        }

        public final CtaButtonState getCtaButtonState() {
            return this.ctaButtonState;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderViewState
        public RequestInputs getRequestInputs() {
            return this.requestInputs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(CryptoOrderContext cryptoOrderContext, ToolbarContent toolbarContent, DefaultOrderState formState, HeaderContent headerContent, InputAmountRow inputAmountRow, CryptoOrderReviewRowState cryptoOrderReviewRowState, LimitRow limitRow, CryptoOrderReviewRowState cryptoOrderReviewRowState2, CryptoLimitOrderEdtType focusedEdtType, boolean z, EstimatedAmountRow estimatedAmountRow, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, CtaButtonState ctaButtonState, RequestInputs requestInputs) {
            super(requestInputs, null);
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            Intrinsics.checkNotNullParameter(toolbarContent, "toolbarContent");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(headerContent, "headerContent");
            Intrinsics.checkNotNullParameter(inputAmountRow, "inputAmountRow");
            Intrinsics.checkNotNullParameter(limitRow, "limitRow");
            Intrinsics.checkNotNullParameter(focusedEdtType, "focusedEdtType");
            Intrinsics.checkNotNullParameter(estimatedAmountRow, "estimatedAmountRow");
            Intrinsics.checkNotNullParameter(ctaButtonState, "ctaButtonState");
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            this.cryptoOrderContext = cryptoOrderContext;
            this.toolbarContent = toolbarContent;
            this.formState = formState;
            this.headerContent = headerContent;
            this.inputAmountRow = inputAmountRow;
            this.feeRow1 = cryptoOrderReviewRowState;
            this.limitRow = limitRow;
            this.feeRow2 = cryptoOrderReviewRowState2;
            this.focusedEdtType = focusedEdtType;
            this.isNumpadDecimalSeparatorEnabled = z;
            this.estimatedAmountRow = estimatedAmountRow;
            this.reviewContent = cryptoOrderReviewMessageAndDisclosuresState;
            this.ctaButtonState = ctaButtonState;
            this.requestInputs = requestInputs;
        }

        /* compiled from: CryptoLimitOrderViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$ToolbarContent;", "", "orderTypeText", "Lcom/robinhood/utils/resource/StringResource;", "titleText", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getOrderTypeText", "()Lcom/robinhood/utils/resource/StringResource;", "getTitleText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ToolbarContent {
            public static final int $stable = StringResource.$stable;
            private final StringResource orderTypeText;
            private final StringResource titleText;

            public static /* synthetic */ ToolbarContent copy$default(ToolbarContent toolbarContent, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = toolbarContent.orderTypeText;
                }
                if ((i & 2) != 0) {
                    stringResource2 = toolbarContent.titleText;
                }
                return toolbarContent.copy(stringResource, stringResource2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getOrderTypeText() {
                return this.orderTypeText;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getTitleText() {
                return this.titleText;
            }

            public final ToolbarContent copy(StringResource orderTypeText, StringResource titleText) {
                return new ToolbarContent(orderTypeText, titleText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ToolbarContent)) {
                    return false;
                }
                ToolbarContent toolbarContent = (ToolbarContent) other;
                return Intrinsics.areEqual(this.orderTypeText, toolbarContent.orderTypeText) && Intrinsics.areEqual(this.titleText, toolbarContent.titleText);
            }

            public int hashCode() {
                StringResource stringResource = this.orderTypeText;
                int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
                StringResource stringResource2 = this.titleText;
                return iHashCode + (stringResource2 != null ? stringResource2.hashCode() : 0);
            }

            public String toString() {
                return "ToolbarContent(orderTypeText=" + this.orderTypeText + ", titleText=" + this.titleText + ")";
            }

            public ToolbarContent(StringResource stringResource, StringResource stringResource2) {
                this.orderTypeText = stringResource;
                this.titleText = stringResource2;
            }

            public final StringResource getOrderTypeText() {
                return this.orderTypeText;
            }

            public final StringResource getTitleText() {
                return this.titleText;
            }
        }

        /* compiled from: CryptoLimitOrderViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$HeaderContent;", "", "headerTitle", "", "headerSubtitle", "Lcom/robinhood/utils/resource/StringResource;", "shouldShowInfoIcon", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Z)V", "getHeaderTitle", "()Ljava/lang/String;", "getHeaderSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getShouldShowInfoIcon", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class HeaderContent {
            public static final int $stable = StringResource.$stable;
            private final StringResource headerSubtitle;
            private final String headerTitle;
            private final boolean shouldShowInfoIcon;

            public static /* synthetic */ HeaderContent copy$default(HeaderContent headerContent, String str, StringResource stringResource, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = headerContent.headerTitle;
                }
                if ((i & 2) != 0) {
                    stringResource = headerContent.headerSubtitle;
                }
                if ((i & 4) != 0) {
                    z = headerContent.shouldShowInfoIcon;
                }
                return headerContent.copy(str, stringResource, z);
            }

            /* renamed from: component1, reason: from getter */
            public final String getHeaderTitle() {
                return this.headerTitle;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getHeaderSubtitle() {
                return this.headerSubtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShouldShowInfoIcon() {
                return this.shouldShowInfoIcon;
            }

            public final HeaderContent copy(String headerTitle, StringResource headerSubtitle, boolean shouldShowInfoIcon) {
                Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
                Intrinsics.checkNotNullParameter(headerSubtitle, "headerSubtitle");
                return new HeaderContent(headerTitle, headerSubtitle, shouldShowInfoIcon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HeaderContent)) {
                    return false;
                }
                HeaderContent headerContent = (HeaderContent) other;
                return Intrinsics.areEqual(this.headerTitle, headerContent.headerTitle) && Intrinsics.areEqual(this.headerSubtitle, headerContent.headerSubtitle) && this.shouldShowInfoIcon == headerContent.shouldShowInfoIcon;
            }

            public int hashCode() {
                return (((this.headerTitle.hashCode() * 31) + this.headerSubtitle.hashCode()) * 31) + Boolean.hashCode(this.shouldShowInfoIcon);
            }

            public String toString() {
                return "HeaderContent(headerTitle=" + this.headerTitle + ", headerSubtitle=" + this.headerSubtitle + ", shouldShowInfoIcon=" + this.shouldShowInfoIcon + ")";
            }

            public HeaderContent(String headerTitle, StringResource headerSubtitle, boolean z) {
                Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
                Intrinsics.checkNotNullParameter(headerSubtitle, "headerSubtitle");
                this.headerTitle = headerTitle;
                this.headerSubtitle = headerSubtitle;
                this.shouldShowInfoIcon = z;
            }

            public final String getHeaderTitle() {
                return this.headerTitle;
            }

            public final StringResource getHeaderSubtitle() {
                return this.headerSubtitle;
            }

            public final boolean getShouldShowInfoIcon() {
                return this.shouldShowInfoIcon;
            }
        }

        /* compiled from: CryptoLimitOrderViewState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$InputAmountRow;", "", "amountLabelText", "Lcom/robinhood/utils/resource/StringResource;", "inputModeText", "", "inputAmountFormatted", "inputCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "currencySymbolPosition", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;)V", "getAmountLabelText", "()Lcom/robinhood/utils/resource/StringResource;", "getInputModeText", "()Ljava/lang/String;", "getInputAmountFormatted", "getInputCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getCurrencySymbolPosition", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InputAmountRow {
            public static final int $stable = 8;
            private final StringResource amountLabelText;
            private final CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition;
            private final String inputAmountFormatted;
            private final Currency inputCurrency;
            private final CryptoInputMode inputMode;
            private final String inputModeText;

            public static /* synthetic */ InputAmountRow copy$default(InputAmountRow inputAmountRow, StringResource stringResource, String str, String str2, Currency currency, CryptoInputMode cryptoInputMode, CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = inputAmountRow.amountLabelText;
                }
                if ((i & 2) != 0) {
                    str = inputAmountRow.inputModeText;
                }
                if ((i & 4) != 0) {
                    str2 = inputAmountRow.inputAmountFormatted;
                }
                if ((i & 8) != 0) {
                    currency = inputAmountRow.inputCurrency;
                }
                if ((i & 16) != 0) {
                    cryptoInputMode = inputAmountRow.inputMode;
                }
                if ((i & 32) != 0) {
                    currencySymbolPosition = inputAmountRow.currencySymbolPosition;
                }
                CryptoInputMode cryptoInputMode2 = cryptoInputMode;
                CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition2 = currencySymbolPosition;
                return inputAmountRow.copy(stringResource, str, str2, currency, cryptoInputMode2, currencySymbolPosition2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getAmountLabelText() {
                return this.amountLabelText;
            }

            /* renamed from: component2, reason: from getter */
            public final String getInputModeText() {
                return this.inputModeText;
            }

            /* renamed from: component3, reason: from getter */
            public final String getInputAmountFormatted() {
                return this.inputAmountFormatted;
            }

            /* renamed from: component4, reason: from getter */
            public final Currency getInputCurrency() {
                return this.inputCurrency;
            }

            /* renamed from: component5, reason: from getter */
            public final CryptoInputMode getInputMode() {
                return this.inputMode;
            }

            /* renamed from: component6, reason: from getter */
            public final CurrencyFormatModel.CurrencySymbolPosition getCurrencySymbolPosition() {
                return this.currencySymbolPosition;
            }

            public final InputAmountRow copy(StringResource amountLabelText, String inputModeText, String inputAmountFormatted, Currency inputCurrency, CryptoInputMode inputMode, CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition) {
                Intrinsics.checkNotNullParameter(amountLabelText, "amountLabelText");
                Intrinsics.checkNotNullParameter(inputModeText, "inputModeText");
                Intrinsics.checkNotNullParameter(inputAmountFormatted, "inputAmountFormatted");
                Intrinsics.checkNotNullParameter(inputCurrency, "inputCurrency");
                Intrinsics.checkNotNullParameter(inputMode, "inputMode");
                return new InputAmountRow(amountLabelText, inputModeText, inputAmountFormatted, inputCurrency, inputMode, currencySymbolPosition);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InputAmountRow)) {
                    return false;
                }
                InputAmountRow inputAmountRow = (InputAmountRow) other;
                return Intrinsics.areEqual(this.amountLabelText, inputAmountRow.amountLabelText) && Intrinsics.areEqual(this.inputModeText, inputAmountRow.inputModeText) && Intrinsics.areEqual(this.inputAmountFormatted, inputAmountRow.inputAmountFormatted) && Intrinsics.areEqual(this.inputCurrency, inputAmountRow.inputCurrency) && this.inputMode == inputAmountRow.inputMode && this.currencySymbolPosition == inputAmountRow.currencySymbolPosition;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.amountLabelText.hashCode() * 31) + this.inputModeText.hashCode()) * 31) + this.inputAmountFormatted.hashCode()) * 31) + this.inputCurrency.hashCode()) * 31) + this.inputMode.hashCode()) * 31;
                CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition = this.currencySymbolPosition;
                return iHashCode + (currencySymbolPosition == null ? 0 : currencySymbolPosition.hashCode());
            }

            public String toString() {
                return "InputAmountRow(amountLabelText=" + this.amountLabelText + ", inputModeText=" + this.inputModeText + ", inputAmountFormatted=" + this.inputAmountFormatted + ", inputCurrency=" + this.inputCurrency + ", inputMode=" + this.inputMode + ", currencySymbolPosition=" + this.currencySymbolPosition + ")";
            }

            public InputAmountRow(StringResource amountLabelText, String inputModeText, String inputAmountFormatted, Currency inputCurrency, CryptoInputMode inputMode, CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition) {
                Intrinsics.checkNotNullParameter(amountLabelText, "amountLabelText");
                Intrinsics.checkNotNullParameter(inputModeText, "inputModeText");
                Intrinsics.checkNotNullParameter(inputAmountFormatted, "inputAmountFormatted");
                Intrinsics.checkNotNullParameter(inputCurrency, "inputCurrency");
                Intrinsics.checkNotNullParameter(inputMode, "inputMode");
                this.amountLabelText = amountLabelText;
                this.inputModeText = inputModeText;
                this.inputAmountFormatted = inputAmountFormatted;
                this.inputCurrency = inputCurrency;
                this.inputMode = inputMode;
                this.currencySymbolPosition = currencySymbolPosition;
            }

            public final StringResource getAmountLabelText() {
                return this.amountLabelText;
            }

            public final String getInputModeText() {
                return this.inputModeText;
            }

            public final String getInputAmountFormatted() {
                return this.inputAmountFormatted;
            }

            public final Currency getInputCurrency() {
                return this.inputCurrency;
            }

            public final CryptoInputMode getInputMode() {
                return this.inputMode;
            }

            public final CurrencyFormatModel.CurrencySymbolPosition getCurrencySymbolPosition() {
                return this.currencySymbolPosition;
            }
        }

        /* compiled from: CryptoLimitOrderViewState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$LimitRow;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "hintPrice", "Ljava/math/BigDecimal;", "quoteCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "limitPriceFormatted", "", "currencySymbolPosition", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Lcom/robinhood/models/crypto/db/Currency;Ljava/lang/String;Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getHintPrice", "()Ljava/math/BigDecimal;", "getQuoteCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getLimitPriceFormatted", "()Ljava/lang/String;", "getCurrencySymbolPosition", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LimitRow {
            public static final int $stable = 8;
            private final CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition;
            private final BigDecimal hintPrice;
            private final String limitPriceFormatted;
            private final Currency quoteCurrency;
            private final StringResource subtitle;
            private final StringResource title;

            public static /* synthetic */ LimitRow copy$default(LimitRow limitRow, StringResource stringResource, StringResource stringResource2, BigDecimal bigDecimal, Currency currency, String str, CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = limitRow.title;
                }
                if ((i & 2) != 0) {
                    stringResource2 = limitRow.subtitle;
                }
                if ((i & 4) != 0) {
                    bigDecimal = limitRow.hintPrice;
                }
                if ((i & 8) != 0) {
                    currency = limitRow.quoteCurrency;
                }
                if ((i & 16) != 0) {
                    str = limitRow.limitPriceFormatted;
                }
                if ((i & 32) != 0) {
                    currencySymbolPosition = limitRow.currencySymbolPosition;
                }
                String str2 = str;
                CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition2 = currencySymbolPosition;
                return limitRow.copy(stringResource, stringResource2, bigDecimal, currency, str2, currencySymbolPosition2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final BigDecimal getHintPrice() {
                return this.hintPrice;
            }

            /* renamed from: component4, reason: from getter */
            public final Currency getQuoteCurrency() {
                return this.quoteCurrency;
            }

            /* renamed from: component5, reason: from getter */
            public final String getLimitPriceFormatted() {
                return this.limitPriceFormatted;
            }

            /* renamed from: component6, reason: from getter */
            public final CurrencyFormatModel.CurrencySymbolPosition getCurrencySymbolPosition() {
                return this.currencySymbolPosition;
            }

            public final LimitRow copy(StringResource title, StringResource subtitle, BigDecimal hintPrice, Currency quoteCurrency, String limitPriceFormatted, CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(hintPrice, "hintPrice");
                Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
                Intrinsics.checkNotNullParameter(limitPriceFormatted, "limitPriceFormatted");
                Intrinsics.checkNotNullParameter(currencySymbolPosition, "currencySymbolPosition");
                return new LimitRow(title, subtitle, hintPrice, quoteCurrency, limitPriceFormatted, currencySymbolPosition);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LimitRow)) {
                    return false;
                }
                LimitRow limitRow = (LimitRow) other;
                return Intrinsics.areEqual(this.title, limitRow.title) && Intrinsics.areEqual(this.subtitle, limitRow.subtitle) && Intrinsics.areEqual(this.hintPrice, limitRow.hintPrice) && Intrinsics.areEqual(this.quoteCurrency, limitRow.quoteCurrency) && Intrinsics.areEqual(this.limitPriceFormatted, limitRow.limitPriceFormatted) && this.currencySymbolPosition == limitRow.currencySymbolPosition;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                StringResource stringResource = this.subtitle;
                return ((((((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.hintPrice.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.limitPriceFormatted.hashCode()) * 31) + this.currencySymbolPosition.hashCode();
            }

            public String toString() {
                return "LimitRow(title=" + this.title + ", subtitle=" + this.subtitle + ", hintPrice=" + this.hintPrice + ", quoteCurrency=" + this.quoteCurrency + ", limitPriceFormatted=" + this.limitPriceFormatted + ", currencySymbolPosition=" + this.currencySymbolPosition + ")";
            }

            public LimitRow(StringResource title, StringResource stringResource, BigDecimal hintPrice, Currency quoteCurrency, String limitPriceFormatted, CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(hintPrice, "hintPrice");
                Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
                Intrinsics.checkNotNullParameter(limitPriceFormatted, "limitPriceFormatted");
                Intrinsics.checkNotNullParameter(currencySymbolPosition, "currencySymbolPosition");
                this.title = title;
                this.subtitle = stringResource;
                this.hintPrice = hintPrice;
                this.quoteCurrency = quoteCurrency;
                this.limitPriceFormatted = limitPriceFormatted;
                this.currencySymbolPosition = currencySymbolPosition;
            }

            public final StringResource getTitle() {
                return this.title;
            }

            public final StringResource getSubtitle() {
                return this.subtitle;
            }

            public final BigDecimal getHintPrice() {
                return this.hintPrice;
            }

            public final Currency getQuoteCurrency() {
                return this.quoteCurrency;
            }

            public final String getLimitPriceFormatted() {
                return this.limitPriceFormatted;
            }

            public final CurrencyFormatModel.CurrencySymbolPosition getCurrencySymbolPosition() {
                return this.currencySymbolPosition;
            }
        }

        /* compiled from: CryptoLimitOrderViewState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$EstimatedAmountRow;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "value", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EstimatedAmountRow {
            public static final int $stable = StringResource.$stable;
            private final StringResource label;
            private final String value;

            public static /* synthetic */ EstimatedAmountRow copy$default(EstimatedAmountRow estimatedAmountRow, StringResource stringResource, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = estimatedAmountRow.label;
                }
                if ((i & 2) != 0) {
                    str = estimatedAmountRow.value;
                }
                return estimatedAmountRow.copy(stringResource, str);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getLabel() {
                return this.label;
            }

            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final EstimatedAmountRow copy(StringResource label, String value) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(value, "value");
                return new EstimatedAmountRow(label, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EstimatedAmountRow)) {
                    return false;
                }
                EstimatedAmountRow estimatedAmountRow = (EstimatedAmountRow) other;
                return Intrinsics.areEqual(this.label, estimatedAmountRow.label) && Intrinsics.areEqual(this.value, estimatedAmountRow.value);
            }

            public int hashCode() {
                return (this.label.hashCode() * 31) + this.value.hashCode();
            }

            public String toString() {
                return "EstimatedAmountRow(label=" + this.label + ", value=" + this.value + ")";
            }

            public EstimatedAmountRow(StringResource label, String value) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(value, "value");
                this.label = label;
                this.value = value;
            }

            public final StringResource getLabel() {
                return this.label;
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: CryptoLimitOrderViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState;", "", "<init>", "()V", "Continue", "SellAllButton", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState$Continue;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState$SellAllButton;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class CtaButtonState {
            public static final int $stable = 0;

            public /* synthetic */ CtaButtonState(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* compiled from: CryptoLimitOrderViewState.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState$Continue;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState;", "isEnabled", "", "isLoading", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Continue extends CtaButtonState {
                public static final int $stable = 0;
                private final boolean isEnabled;
                private final boolean isLoading;

                public static /* synthetic */ Continue copy$default(Continue r0, boolean z, boolean z2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        z = r0.isEnabled;
                    }
                    if ((i & 2) != 0) {
                        z2 = r0.isLoading;
                    }
                    return r0.copy(z, z2);
                }

                /* renamed from: component1, reason: from getter */
                public final boolean getIsEnabled() {
                    return this.isEnabled;
                }

                /* renamed from: component2, reason: from getter */
                public final boolean getIsLoading() {
                    return this.isLoading;
                }

                public final Continue copy(boolean isEnabled, boolean isLoading) {
                    return new Continue(isEnabled, isLoading);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Continue)) {
                        return false;
                    }
                    Continue r5 = (Continue) other;
                    return this.isEnabled == r5.isEnabled && this.isLoading == r5.isLoading;
                }

                public int hashCode() {
                    return (Boolean.hashCode(this.isEnabled) * 31) + Boolean.hashCode(this.isLoading);
                }

                public String toString() {
                    return "Continue(isEnabled=" + this.isEnabled + ", isLoading=" + this.isLoading + ")";
                }

                public Continue(boolean z, boolean z2) {
                    super(null);
                    this.isEnabled = z;
                    this.isLoading = z2;
                }

                public final boolean isEnabled() {
                    return this.isEnabled;
                }

                public final boolean isLoading() {
                    return this.isLoading;
                }
            }

            private CtaButtonState() {
            }

            /* compiled from: CryptoLimitOrderViewState.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState$SellAllButton;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState;", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class SellAllButton extends CtaButtonState {
                public static final int $stable = StringResource.$stable;
                private final StringResource text;

                public static /* synthetic */ SellAllButton copy$default(SellAllButton sellAllButton, StringResource stringResource, int i, Object obj) {
                    if ((i & 1) != 0) {
                        stringResource = sellAllButton.text;
                    }
                    return sellAllButton.copy(stringResource);
                }

                /* renamed from: component1, reason: from getter */
                public final StringResource getText() {
                    return this.text;
                }

                public final SellAllButton copy(StringResource text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new SellAllButton(text);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SellAllButton) && Intrinsics.areEqual(this.text, ((SellAllButton) other).text);
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                public String toString() {
                    return "SellAllButton(text=" + this.text + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SellAllButton(StringResource text) {
                    super(null);
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                }

                public final StringResource getText() {
                    return this.text;
                }
            }
        }
    }
}
