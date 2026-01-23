package com.robinhood.android.futures.history.p142ui.settlement;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesCashSettlementDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState$Loaded;", "Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState$Loading;", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.ui.settlement.RhdCashSettlementDetailViewState, reason: use source file name */
/* loaded from: classes3.dex */
public interface FuturesCashSettlementDetailDuxo4 {

    /* compiled from: FuturesCashSettlementDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState$Loading;", "Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.history.ui.settlement.RhdCashSettlementDetailViewState$Loading */
    public static final /* data */ class Loading implements FuturesCashSettlementDetailDuxo4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -508794730;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: FuturesCashSettlementDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0011HÆ\u0003J\u0095\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0011HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState$Loaded;", "Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState;", "pageTitle", "Lcom/robinhood/utils/resource/StringResource;", "pageSubtitle", "toolbarCta", "Lcom/robinhood/android/futures/history/ui/settlement/FuturesExecutionToolbarCta;", "settlementTime", "", "settlementPrice", "quantity", "realizedPnlLabel", "realizedPnlValue", "fees", "commissions", "goldSavings", "costOrCreditLabelAndValue", "Lkotlin/Pair;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/futures/history/ui/settlement/FuturesExecutionToolbarCta;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;)V", "getPageTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getPageSubtitle", "getToolbarCta", "()Lcom/robinhood/android/futures/history/ui/settlement/FuturesExecutionToolbarCta;", "getSettlementTime", "()Ljava/lang/String;", "getSettlementPrice", "getQuantity", "getRealizedPnlLabel", "getRealizedPnlValue", "getFees", "getCommissions", "getGoldSavings", "getCostOrCreditLabelAndValue", "()Lkotlin/Pair;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.history.ui.settlement.RhdCashSettlementDetailViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded implements FuturesCashSettlementDetailDuxo4 {
        public static final int $stable = 8;
        private final String commissions;
        private final Tuples2<StringResource, String> costOrCreditLabelAndValue;
        private final String fees;
        private final String goldSavings;
        private final StringResource pageSubtitle;
        private final StringResource pageTitle;
        private final String quantity;
        private final StringResource realizedPnlLabel;
        private final String realizedPnlValue;
        private final String settlementPrice;
        private final String settlementTime;
        private final FuturesExecutionToolbarCta toolbarCta;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, StringResource stringResource2, FuturesExecutionToolbarCta futuresExecutionToolbarCta, String str, String str2, String str3, StringResource stringResource3, String str4, String str5, String str6, String str7, Tuples2 tuples2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loaded.pageTitle;
            }
            if ((i & 2) != 0) {
                stringResource2 = loaded.pageSubtitle;
            }
            if ((i & 4) != 0) {
                futuresExecutionToolbarCta = loaded.toolbarCta;
            }
            if ((i & 8) != 0) {
                str = loaded.settlementTime;
            }
            if ((i & 16) != 0) {
                str2 = loaded.settlementPrice;
            }
            if ((i & 32) != 0) {
                str3 = loaded.quantity;
            }
            if ((i & 64) != 0) {
                stringResource3 = loaded.realizedPnlLabel;
            }
            if ((i & 128) != 0) {
                str4 = loaded.realizedPnlValue;
            }
            if ((i & 256) != 0) {
                str5 = loaded.fees;
            }
            if ((i & 512) != 0) {
                str6 = loaded.commissions;
            }
            if ((i & 1024) != 0) {
                str7 = loaded.goldSavings;
            }
            if ((i & 2048) != 0) {
                tuples2 = loaded.costOrCreditLabelAndValue;
            }
            String str8 = str7;
            Tuples2 tuples22 = tuples2;
            String str9 = str5;
            String str10 = str6;
            StringResource stringResource4 = stringResource3;
            String str11 = str4;
            String str12 = str2;
            String str13 = str3;
            return loaded.copy(stringResource, stringResource2, futuresExecutionToolbarCta, str, str12, str13, stringResource4, str11, str9, str10, str8, tuples22);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getPageTitle() {
            return this.pageTitle;
        }

        /* renamed from: component10, reason: from getter */
        public final String getCommissions() {
            return this.commissions;
        }

        /* renamed from: component11, reason: from getter */
        public final String getGoldSavings() {
            return this.goldSavings;
        }

        public final Tuples2<StringResource, String> component12() {
            return this.costOrCreditLabelAndValue;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getPageSubtitle() {
            return this.pageSubtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final FuturesExecutionToolbarCta getToolbarCta() {
            return this.toolbarCta;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSettlementTime() {
            return this.settlementTime;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSettlementPrice() {
            return this.settlementPrice;
        }

        /* renamed from: component6, reason: from getter */
        public final String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component7, reason: from getter */
        public final StringResource getRealizedPnlLabel() {
            return this.realizedPnlLabel;
        }

        /* renamed from: component8, reason: from getter */
        public final String getRealizedPnlValue() {
            return this.realizedPnlValue;
        }

        /* renamed from: component9, reason: from getter */
        public final String getFees() {
            return this.fees;
        }

        public final Loaded copy(StringResource pageTitle, StringResource pageSubtitle, FuturesExecutionToolbarCta toolbarCta, String settlementTime, String settlementPrice, String quantity, StringResource realizedPnlLabel, String realizedPnlValue, String fees, String commissions, String goldSavings, Tuples2<? extends StringResource, String> costOrCreditLabelAndValue) {
            Intrinsics.checkNotNullParameter(pageTitle, "pageTitle");
            Intrinsics.checkNotNullParameter(settlementTime, "settlementTime");
            Intrinsics.checkNotNullParameter(settlementPrice, "settlementPrice");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(realizedPnlValue, "realizedPnlValue");
            Intrinsics.checkNotNullParameter(fees, "fees");
            Intrinsics.checkNotNullParameter(commissions, "commissions");
            Intrinsics.checkNotNullParameter(costOrCreditLabelAndValue, "costOrCreditLabelAndValue");
            return new Loaded(pageTitle, pageSubtitle, toolbarCta, settlementTime, settlementPrice, quantity, realizedPnlLabel, realizedPnlValue, fees, commissions, goldSavings, costOrCreditLabelAndValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.pageTitle, loaded.pageTitle) && Intrinsics.areEqual(this.pageSubtitle, loaded.pageSubtitle) && Intrinsics.areEqual(this.toolbarCta, loaded.toolbarCta) && Intrinsics.areEqual(this.settlementTime, loaded.settlementTime) && Intrinsics.areEqual(this.settlementPrice, loaded.settlementPrice) && Intrinsics.areEqual(this.quantity, loaded.quantity) && Intrinsics.areEqual(this.realizedPnlLabel, loaded.realizedPnlLabel) && Intrinsics.areEqual(this.realizedPnlValue, loaded.realizedPnlValue) && Intrinsics.areEqual(this.fees, loaded.fees) && Intrinsics.areEqual(this.commissions, loaded.commissions) && Intrinsics.areEqual(this.goldSavings, loaded.goldSavings) && Intrinsics.areEqual(this.costOrCreditLabelAndValue, loaded.costOrCreditLabelAndValue);
        }

        public int hashCode() {
            int iHashCode = this.pageTitle.hashCode() * 31;
            StringResource stringResource = this.pageSubtitle;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            FuturesExecutionToolbarCta futuresExecutionToolbarCta = this.toolbarCta;
            int iHashCode3 = (((((((iHashCode2 + (futuresExecutionToolbarCta == null ? 0 : futuresExecutionToolbarCta.hashCode())) * 31) + this.settlementTime.hashCode()) * 31) + this.settlementPrice.hashCode()) * 31) + this.quantity.hashCode()) * 31;
            StringResource stringResource2 = this.realizedPnlLabel;
            int iHashCode4 = (((((((iHashCode3 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31) + this.realizedPnlValue.hashCode()) * 31) + this.fees.hashCode()) * 31) + this.commissions.hashCode()) * 31;
            String str = this.goldSavings;
            return ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.costOrCreditLabelAndValue.hashCode();
        }

        public String toString() {
            return "Loaded(pageTitle=" + this.pageTitle + ", pageSubtitle=" + this.pageSubtitle + ", toolbarCta=" + this.toolbarCta + ", settlementTime=" + this.settlementTime + ", settlementPrice=" + this.settlementPrice + ", quantity=" + this.quantity + ", realizedPnlLabel=" + this.realizedPnlLabel + ", realizedPnlValue=" + this.realizedPnlValue + ", fees=" + this.fees + ", commissions=" + this.commissions + ", goldSavings=" + this.goldSavings + ", costOrCreditLabelAndValue=" + this.costOrCreditLabelAndValue + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(StringResource pageTitle, StringResource stringResource, FuturesExecutionToolbarCta futuresExecutionToolbarCta, String settlementTime, String settlementPrice, String quantity, StringResource stringResource2, String realizedPnlValue, String fees, String commissions, String str, Tuples2<? extends StringResource, String> costOrCreditLabelAndValue) {
            Intrinsics.checkNotNullParameter(pageTitle, "pageTitle");
            Intrinsics.checkNotNullParameter(settlementTime, "settlementTime");
            Intrinsics.checkNotNullParameter(settlementPrice, "settlementPrice");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(realizedPnlValue, "realizedPnlValue");
            Intrinsics.checkNotNullParameter(fees, "fees");
            Intrinsics.checkNotNullParameter(commissions, "commissions");
            Intrinsics.checkNotNullParameter(costOrCreditLabelAndValue, "costOrCreditLabelAndValue");
            this.pageTitle = pageTitle;
            this.pageSubtitle = stringResource;
            this.toolbarCta = futuresExecutionToolbarCta;
            this.settlementTime = settlementTime;
            this.settlementPrice = settlementPrice;
            this.quantity = quantity;
            this.realizedPnlLabel = stringResource2;
            this.realizedPnlValue = realizedPnlValue;
            this.fees = fees;
            this.commissions = commissions;
            this.goldSavings = str;
            this.costOrCreditLabelAndValue = costOrCreditLabelAndValue;
        }

        public final StringResource getPageTitle() {
            return this.pageTitle;
        }

        public final StringResource getPageSubtitle() {
            return this.pageSubtitle;
        }

        public final FuturesExecutionToolbarCta getToolbarCta() {
            return this.toolbarCta;
        }

        public final String getSettlementTime() {
            return this.settlementTime;
        }

        public final String getSettlementPrice() {
            return this.settlementPrice;
        }

        public final String getQuantity() {
            return this.quantity;
        }

        public final StringResource getRealizedPnlLabel() {
            return this.realizedPnlLabel;
        }

        public final String getRealizedPnlValue() {
            return this.realizedPnlValue;
        }

        public final String getFees() {
            return this.fees;
        }

        public final String getCommissions() {
            return this.commissions;
        }

        public final String getGoldSavings() {
            return this.goldSavings;
        }

        public final Tuples2<StringResource, String> getCostOrCreditLabelAndValue() {
            return this.costOrCreditLabelAndValue;
        }
    }
}
