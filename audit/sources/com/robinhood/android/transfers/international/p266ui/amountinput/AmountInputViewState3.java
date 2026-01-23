package com.robinhood.android.transfers.international.p266ui.amountinput;

import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputDataState;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AmountInputViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState;", "", "WithFx", "WithoutFx", "Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState$WithFx;", "Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState$WithoutFx;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.amountinput.InputViewState, reason: use source file name */
/* loaded from: classes9.dex */
public interface AmountInputViewState3 {

    /* compiled from: AmountInputViewState.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\bHÆ\u0003J\t\u0010,\u001a\u00020\u0012HÆ\u0003J\u0085\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001f\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState$WithFx;", "Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState;", "sourceAmountInput", "Landroidx/compose/ui/text/AnnotatedString;", "sourceCurrencyCode", "", "sourceCountryCode", "transferSummaryContent", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "exchangeRateText", "sinkAmountInput", "sinkCurrencyCode", "sinkCountryCode", "feeStates", "Lcom/robinhood/android/transfers/international/ui/amountinput/FeeViewState;", "selectedInputType", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputType;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputType;)V", "getSourceAmountInput", "()Landroidx/compose/ui/text/AnnotatedString;", "getSourceCurrencyCode", "()Ljava/lang/String;", "getSourceCountryCode", "getTransferSummaryContent", "()Lkotlinx/collections/immutable/ImmutableList;", "getExchangeRateText", "getSinkAmountInput", "getSinkCurrencyCode", "getSinkCountryCode", "getFeeStates", "getSelectedInputType", "()Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.InputViewState$WithFx, reason: from toString */
    public static final /* data */ class WithFx implements AmountInputViewState3 {
        public static final int $stable = 8;
        private final String exchangeRateText;
        private final ImmutableList<FeeViewState> feeStates;
        private final AmountInputDataState.InputType selectedInputType;
        private final AnnotatedString sinkAmountInput;
        private final String sinkCountryCode;
        private final String sinkCurrencyCode;
        private final AnnotatedString sourceAmountInput;
        private final String sourceCountryCode;
        private final String sourceCurrencyCode;
        private final ImmutableList<UIComponent<GenericAction>> transferSummaryContent;

        public static /* synthetic */ WithFx copy$default(WithFx withFx, AnnotatedString annotatedString, String str, String str2, ImmutableList immutableList, String str3, AnnotatedString annotatedString2, String str4, String str5, ImmutableList immutableList2, AmountInputDataState.InputType inputType, int i, Object obj) {
            if ((i & 1) != 0) {
                annotatedString = withFx.sourceAmountInput;
            }
            if ((i & 2) != 0) {
                str = withFx.sourceCurrencyCode;
            }
            if ((i & 4) != 0) {
                str2 = withFx.sourceCountryCode;
            }
            if ((i & 8) != 0) {
                immutableList = withFx.transferSummaryContent;
            }
            if ((i & 16) != 0) {
                str3 = withFx.exchangeRateText;
            }
            if ((i & 32) != 0) {
                annotatedString2 = withFx.sinkAmountInput;
            }
            if ((i & 64) != 0) {
                str4 = withFx.sinkCurrencyCode;
            }
            if ((i & 128) != 0) {
                str5 = withFx.sinkCountryCode;
            }
            if ((i & 256) != 0) {
                immutableList2 = withFx.feeStates;
            }
            if ((i & 512) != 0) {
                inputType = withFx.selectedInputType;
            }
            ImmutableList immutableList3 = immutableList2;
            AmountInputDataState.InputType inputType2 = inputType;
            String str6 = str4;
            String str7 = str5;
            String str8 = str3;
            AnnotatedString annotatedString3 = annotatedString2;
            return withFx.copy(annotatedString, str, str2, immutableList, str8, annotatedString3, str6, str7, immutableList3, inputType2);
        }

        /* renamed from: component1, reason: from getter */
        public final AnnotatedString getSourceAmountInput() {
            return this.sourceAmountInput;
        }

        /* renamed from: component10, reason: from getter */
        public final AmountInputDataState.InputType getSelectedInputType() {
            return this.selectedInputType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSourceCurrencyCode() {
            return this.sourceCurrencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSourceCountryCode() {
            return this.sourceCountryCode;
        }

        public final ImmutableList<UIComponent<GenericAction>> component4() {
            return this.transferSummaryContent;
        }

        /* renamed from: component5, reason: from getter */
        public final String getExchangeRateText() {
            return this.exchangeRateText;
        }

        /* renamed from: component6, reason: from getter */
        public final AnnotatedString getSinkAmountInput() {
            return this.sinkAmountInput;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSinkCurrencyCode() {
            return this.sinkCurrencyCode;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSinkCountryCode() {
            return this.sinkCountryCode;
        }

        public final ImmutableList<FeeViewState> component9() {
            return this.feeStates;
        }

        public final WithFx copy(AnnotatedString sourceAmountInput, String sourceCurrencyCode, String sourceCountryCode, ImmutableList<? extends UIComponent<? extends GenericAction>> transferSummaryContent, String exchangeRateText, AnnotatedString sinkAmountInput, String sinkCurrencyCode, String sinkCountryCode, ImmutableList<FeeViewState> feeStates, AmountInputDataState.InputType selectedInputType) {
            Intrinsics.checkNotNullParameter(sourceAmountInput, "sourceAmountInput");
            Intrinsics.checkNotNullParameter(sourceCurrencyCode, "sourceCurrencyCode");
            Intrinsics.checkNotNullParameter(sourceCountryCode, "sourceCountryCode");
            Intrinsics.checkNotNullParameter(sinkAmountInput, "sinkAmountInput");
            Intrinsics.checkNotNullParameter(sinkCurrencyCode, "sinkCurrencyCode");
            Intrinsics.checkNotNullParameter(sinkCountryCode, "sinkCountryCode");
            Intrinsics.checkNotNullParameter(selectedInputType, "selectedInputType");
            return new WithFx(sourceAmountInput, sourceCurrencyCode, sourceCountryCode, transferSummaryContent, exchangeRateText, sinkAmountInput, sinkCurrencyCode, sinkCountryCode, feeStates, selectedInputType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithFx)) {
                return false;
            }
            WithFx withFx = (WithFx) other;
            return Intrinsics.areEqual(this.sourceAmountInput, withFx.sourceAmountInput) && Intrinsics.areEqual(this.sourceCurrencyCode, withFx.sourceCurrencyCode) && Intrinsics.areEqual(this.sourceCountryCode, withFx.sourceCountryCode) && Intrinsics.areEqual(this.transferSummaryContent, withFx.transferSummaryContent) && Intrinsics.areEqual(this.exchangeRateText, withFx.exchangeRateText) && Intrinsics.areEqual(this.sinkAmountInput, withFx.sinkAmountInput) && Intrinsics.areEqual(this.sinkCurrencyCode, withFx.sinkCurrencyCode) && Intrinsics.areEqual(this.sinkCountryCode, withFx.sinkCountryCode) && Intrinsics.areEqual(this.feeStates, withFx.feeStates) && this.selectedInputType == withFx.selectedInputType;
        }

        public int hashCode() {
            int iHashCode = ((((this.sourceAmountInput.hashCode() * 31) + this.sourceCurrencyCode.hashCode()) * 31) + this.sourceCountryCode.hashCode()) * 31;
            ImmutableList<UIComponent<GenericAction>> immutableList = this.transferSummaryContent;
            int iHashCode2 = (iHashCode + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
            String str = this.exchangeRateText;
            int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.sinkAmountInput.hashCode()) * 31) + this.sinkCurrencyCode.hashCode()) * 31) + this.sinkCountryCode.hashCode()) * 31;
            ImmutableList<FeeViewState> immutableList2 = this.feeStates;
            return ((iHashCode3 + (immutableList2 != null ? immutableList2.hashCode() : 0)) * 31) + this.selectedInputType.hashCode();
        }

        public String toString() {
            AnnotatedString annotatedString = this.sourceAmountInput;
            String str = this.sourceCurrencyCode;
            String str2 = this.sourceCountryCode;
            ImmutableList<UIComponent<GenericAction>> immutableList = this.transferSummaryContent;
            String str3 = this.exchangeRateText;
            AnnotatedString annotatedString2 = this.sinkAmountInput;
            return "WithFx(sourceAmountInput=" + ((Object) annotatedString) + ", sourceCurrencyCode=" + str + ", sourceCountryCode=" + str2 + ", transferSummaryContent=" + immutableList + ", exchangeRateText=" + str3 + ", sinkAmountInput=" + ((Object) annotatedString2) + ", sinkCurrencyCode=" + this.sinkCurrencyCode + ", sinkCountryCode=" + this.sinkCountryCode + ", feeStates=" + this.feeStates + ", selectedInputType=" + this.selectedInputType + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WithFx(AnnotatedString sourceAmountInput, String sourceCurrencyCode, String sourceCountryCode, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, String str, AnnotatedString sinkAmountInput, String sinkCurrencyCode, String sinkCountryCode, ImmutableList<FeeViewState> immutableList2, AmountInputDataState.InputType selectedInputType) {
            Intrinsics.checkNotNullParameter(sourceAmountInput, "sourceAmountInput");
            Intrinsics.checkNotNullParameter(sourceCurrencyCode, "sourceCurrencyCode");
            Intrinsics.checkNotNullParameter(sourceCountryCode, "sourceCountryCode");
            Intrinsics.checkNotNullParameter(sinkAmountInput, "sinkAmountInput");
            Intrinsics.checkNotNullParameter(sinkCurrencyCode, "sinkCurrencyCode");
            Intrinsics.checkNotNullParameter(sinkCountryCode, "sinkCountryCode");
            Intrinsics.checkNotNullParameter(selectedInputType, "selectedInputType");
            this.sourceAmountInput = sourceAmountInput;
            this.sourceCurrencyCode = sourceCurrencyCode;
            this.sourceCountryCode = sourceCountryCode;
            this.transferSummaryContent = immutableList;
            this.exchangeRateText = str;
            this.sinkAmountInput = sinkAmountInput;
            this.sinkCurrencyCode = sinkCurrencyCode;
            this.sinkCountryCode = sinkCountryCode;
            this.feeStates = immutableList2;
            this.selectedInputType = selectedInputType;
        }

        public final AnnotatedString getSourceAmountInput() {
            return this.sourceAmountInput;
        }

        public final String getSourceCurrencyCode() {
            return this.sourceCurrencyCode;
        }

        public final String getSourceCountryCode() {
            return this.sourceCountryCode;
        }

        public final ImmutableList<UIComponent<GenericAction>> getTransferSummaryContent() {
            return this.transferSummaryContent;
        }

        public final String getExchangeRateText() {
            return this.exchangeRateText;
        }

        public final AnnotatedString getSinkAmountInput() {
            return this.sinkAmountInput;
        }

        public final String getSinkCurrencyCode() {
            return this.sinkCurrencyCode;
        }

        public final String getSinkCountryCode() {
            return this.sinkCountryCode;
        }

        public final ImmutableList<FeeViewState> getFeeStates() {
            return this.feeStates;
        }

        public final AmountInputDataState.InputType getSelectedInputType() {
            return this.selectedInputType;
        }
    }

    /* compiled from: AmountInputViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\bHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState$WithoutFx;", "Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState;", "amountInput", "Landroidx/compose/ui/text/AnnotatedString;", "currencyCode", "", "countryCode", "transferSummaryContent", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "feeStates", "Lcom/robinhood/android/transfers/international/ui/amountinput/FeeViewState;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getAmountInput", "()Landroidx/compose/ui/text/AnnotatedString;", "getCurrencyCode", "()Ljava/lang/String;", "getCountryCode", "getTransferSummaryContent", "()Lkotlinx/collections/immutable/ImmutableList;", "getFeeStates", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.InputViewState$WithoutFx, reason: from toString */
    public static final /* data */ class WithoutFx implements AmountInputViewState3 {
        public static final int $stable = 8;
        private final AnnotatedString amountInput;
        private final String countryCode;
        private final String currencyCode;
        private final ImmutableList<FeeViewState> feeStates;
        private final ImmutableList<UIComponent<GenericAction>> transferSummaryContent;

        public static /* synthetic */ WithoutFx copy$default(WithoutFx withoutFx, AnnotatedString annotatedString, String str, String str2, ImmutableList immutableList, ImmutableList immutableList2, int i, Object obj) {
            if ((i & 1) != 0) {
                annotatedString = withoutFx.amountInput;
            }
            if ((i & 2) != 0) {
                str = withoutFx.currencyCode;
            }
            if ((i & 4) != 0) {
                str2 = withoutFx.countryCode;
            }
            if ((i & 8) != 0) {
                immutableList = withoutFx.transferSummaryContent;
            }
            if ((i & 16) != 0) {
                immutableList2 = withoutFx.feeStates;
            }
            ImmutableList immutableList3 = immutableList2;
            String str3 = str2;
            return withoutFx.copy(annotatedString, str, str3, immutableList, immutableList3);
        }

        /* renamed from: component1, reason: from getter */
        public final AnnotatedString getAmountInput() {
            return this.amountInput;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        public final ImmutableList<UIComponent<GenericAction>> component4() {
            return this.transferSummaryContent;
        }

        public final ImmutableList<FeeViewState> component5() {
            return this.feeStates;
        }

        public final WithoutFx copy(AnnotatedString amountInput, String currencyCode, String countryCode, ImmutableList<? extends UIComponent<? extends GenericAction>> transferSummaryContent, ImmutableList<FeeViewState> feeStates) {
            Intrinsics.checkNotNullParameter(amountInput, "amountInput");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            return new WithoutFx(amountInput, currencyCode, countryCode, transferSummaryContent, feeStates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithoutFx)) {
                return false;
            }
            WithoutFx withoutFx = (WithoutFx) other;
            return Intrinsics.areEqual(this.amountInput, withoutFx.amountInput) && Intrinsics.areEqual(this.currencyCode, withoutFx.currencyCode) && Intrinsics.areEqual(this.countryCode, withoutFx.countryCode) && Intrinsics.areEqual(this.transferSummaryContent, withoutFx.transferSummaryContent) && Intrinsics.areEqual(this.feeStates, withoutFx.feeStates);
        }

        public int hashCode() {
            int iHashCode = ((((this.amountInput.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
            ImmutableList<UIComponent<GenericAction>> immutableList = this.transferSummaryContent;
            int iHashCode2 = (iHashCode + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
            ImmutableList<FeeViewState> immutableList2 = this.feeStates;
            return iHashCode2 + (immutableList2 != null ? immutableList2.hashCode() : 0);
        }

        public String toString() {
            AnnotatedString annotatedString = this.amountInput;
            return "WithoutFx(amountInput=" + ((Object) annotatedString) + ", currencyCode=" + this.currencyCode + ", countryCode=" + this.countryCode + ", transferSummaryContent=" + this.transferSummaryContent + ", feeStates=" + this.feeStates + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WithoutFx(AnnotatedString amountInput, String currencyCode, String countryCode, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, ImmutableList<FeeViewState> immutableList2) {
            Intrinsics.checkNotNullParameter(amountInput, "amountInput");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.amountInput = amountInput;
            this.currencyCode = currencyCode;
            this.countryCode = countryCode;
            this.transferSummaryContent = immutableList;
            this.feeStates = immutableList2;
        }

        public final AnnotatedString getAmountInput() {
            return this.amountInput;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final ImmutableList<UIComponent<GenericAction>> getTransferSummaryContent() {
            return this.transferSummaryContent;
        }

        public final ImmutableList<FeeViewState> getFeeStates() {
            return this.feeStates;
        }
    }
}
