package com.robinhood.android.acats.plaid.transfer.partial;

import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.EquityAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.OptionAsset;
import com.robinhood.models.serverdriven.experimental.api.Money;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsPlaidPartialTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "", "CashAssetWithAdjustment", "MarginCashAssetWithAdjustment", "EquityAssetWithAdjustment", "OptionAssetWithAdjustment", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$EquityAssetWithAdjustment;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$MarginCashAssetWithAdjustment;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$OptionAssetWithAdjustment;", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowDataType, reason: use source file name */
/* loaded from: classes24.dex */
public interface AcatsPlaidPartialTransferDuxo3 {

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "originalCashBalance", "Lcom/robinhood/models/serverdriven/experimental/api/Money;", "adjustableCashBalance", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Money;Lcom/robinhood/models/serverdriven/experimental/api/Money;)V", "getOriginalCashBalance", "()Lcom/robinhood/models/serverdriven/experimental/api/Money;", "getAdjustableCashBalance", "toString", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment */
    public static final /* data */ class CashAssetWithAdjustment implements AcatsPlaidPartialTransferDuxo3 {
        public static final int $stable = 8;
        private final Money adjustableCashBalance;
        private final Money originalCashBalance;

        public static /* synthetic */ CashAssetWithAdjustment copy$default(CashAssetWithAdjustment cashAssetWithAdjustment, Money money, Money money2, int i, Object obj) {
            if ((i & 1) != 0) {
                money = cashAssetWithAdjustment.originalCashBalance;
            }
            if ((i & 2) != 0) {
                money2 = cashAssetWithAdjustment.adjustableCashBalance;
            }
            return cashAssetWithAdjustment.copy(money, money2);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getOriginalCashBalance() {
            return this.originalCashBalance;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getAdjustableCashBalance() {
            return this.adjustableCashBalance;
        }

        public final CashAssetWithAdjustment copy(Money originalCashBalance, Money adjustableCashBalance) {
            Intrinsics.checkNotNullParameter(originalCashBalance, "originalCashBalance");
            Intrinsics.checkNotNullParameter(adjustableCashBalance, "adjustableCashBalance");
            return new CashAssetWithAdjustment(originalCashBalance, adjustableCashBalance);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashAssetWithAdjustment)) {
                return false;
            }
            CashAssetWithAdjustment cashAssetWithAdjustment = (CashAssetWithAdjustment) other;
            return Intrinsics.areEqual(this.originalCashBalance, cashAssetWithAdjustment.originalCashBalance) && Intrinsics.areEqual(this.adjustableCashBalance, cashAssetWithAdjustment.adjustableCashBalance);
        }

        public int hashCode() {
            return (this.originalCashBalance.hashCode() * 31) + this.adjustableCashBalance.hashCode();
        }

        public CashAssetWithAdjustment(Money originalCashBalance, Money adjustableCashBalance) {
            Intrinsics.checkNotNullParameter(originalCashBalance, "originalCashBalance");
            Intrinsics.checkNotNullParameter(adjustableCashBalance, "adjustableCashBalance");
            this.originalCashBalance = originalCashBalance;
            this.adjustableCashBalance = adjustableCashBalance;
        }

        public final Money getAdjustableCashBalance() {
            return this.adjustableCashBalance;
        }

        public final Money getOriginalCashBalance() {
            return this.originalCashBalance;
        }

        public String toString() {
            return "CashBalance: " + this.originalCashBalance;
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$MarginCashAssetWithAdjustment;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "originalMarginCashBalance", "Lcom/robinhood/models/serverdriven/experimental/api/Money;", "adjustableMarginCashBalance", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Money;Lcom/robinhood/models/serverdriven/experimental/api/Money;)V", "getOriginalMarginCashBalance", "()Lcom/robinhood/models/serverdriven/experimental/api/Money;", "getAdjustableMarginCashBalance", "toString", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowDataType$MarginCashAssetWithAdjustment */
    public static final /* data */ class MarginCashAssetWithAdjustment implements AcatsPlaidPartialTransferDuxo3 {
        public static final int $stable = 8;
        private final Money adjustableMarginCashBalance;
        private final Money originalMarginCashBalance;

        public static /* synthetic */ MarginCashAssetWithAdjustment copy$default(MarginCashAssetWithAdjustment marginCashAssetWithAdjustment, Money money, Money money2, int i, Object obj) {
            if ((i & 1) != 0) {
                money = marginCashAssetWithAdjustment.originalMarginCashBalance;
            }
            if ((i & 2) != 0) {
                money2 = marginCashAssetWithAdjustment.adjustableMarginCashBalance;
            }
            return marginCashAssetWithAdjustment.copy(money, money2);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getOriginalMarginCashBalance() {
            return this.originalMarginCashBalance;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getAdjustableMarginCashBalance() {
            return this.adjustableMarginCashBalance;
        }

        public final MarginCashAssetWithAdjustment copy(Money originalMarginCashBalance, Money adjustableMarginCashBalance) {
            Intrinsics.checkNotNullParameter(originalMarginCashBalance, "originalMarginCashBalance");
            Intrinsics.checkNotNullParameter(adjustableMarginCashBalance, "adjustableMarginCashBalance");
            return new MarginCashAssetWithAdjustment(originalMarginCashBalance, adjustableMarginCashBalance);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginCashAssetWithAdjustment)) {
                return false;
            }
            MarginCashAssetWithAdjustment marginCashAssetWithAdjustment = (MarginCashAssetWithAdjustment) other;
            return Intrinsics.areEqual(this.originalMarginCashBalance, marginCashAssetWithAdjustment.originalMarginCashBalance) && Intrinsics.areEqual(this.adjustableMarginCashBalance, marginCashAssetWithAdjustment.adjustableMarginCashBalance);
        }

        public int hashCode() {
            return (this.originalMarginCashBalance.hashCode() * 31) + this.adjustableMarginCashBalance.hashCode();
        }

        public MarginCashAssetWithAdjustment(Money originalMarginCashBalance, Money adjustableMarginCashBalance) {
            Intrinsics.checkNotNullParameter(originalMarginCashBalance, "originalMarginCashBalance");
            Intrinsics.checkNotNullParameter(adjustableMarginCashBalance, "adjustableMarginCashBalance");
            this.originalMarginCashBalance = originalMarginCashBalance;
            this.adjustableMarginCashBalance = adjustableMarginCashBalance;
        }

        public final Money getOriginalMarginCashBalance() {
            return this.originalMarginCashBalance;
        }

        public final Money getAdjustableMarginCashBalance() {
            return this.adjustableMarginCashBalance;
        }

        public String toString() {
            return "MarginCashBalance: " + this.originalMarginCashBalance;
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$EquityAssetWithAdjustment;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "equityAsset", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/EquityAsset;", "adjustableQuantity", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/EquityAsset;Ljava/math/BigDecimal;)V", "getEquityAsset", "()Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/EquityAsset;", "getAdjustableQuantity", "()Ljava/math/BigDecimal;", "toString", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowDataType$EquityAssetWithAdjustment */
    public static final /* data */ class EquityAssetWithAdjustment implements AcatsPlaidPartialTransferDuxo3 {
        public static final int $stable = 8;
        private final BigDecimal adjustableQuantity;
        private final EquityAsset equityAsset;

        public static /* synthetic */ EquityAssetWithAdjustment copy$default(EquityAssetWithAdjustment equityAssetWithAdjustment, EquityAsset equityAsset, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                equityAsset = equityAssetWithAdjustment.equityAsset;
            }
            if ((i & 2) != 0) {
                bigDecimal = equityAssetWithAdjustment.adjustableQuantity;
            }
            return equityAssetWithAdjustment.copy(equityAsset, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityAsset getEquityAsset() {
            return this.equityAsset;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAdjustableQuantity() {
            return this.adjustableQuantity;
        }

        public final EquityAssetWithAdjustment copy(EquityAsset equityAsset, BigDecimal adjustableQuantity) {
            Intrinsics.checkNotNullParameter(equityAsset, "equityAsset");
            Intrinsics.checkNotNullParameter(adjustableQuantity, "adjustableQuantity");
            return new EquityAssetWithAdjustment(equityAsset, adjustableQuantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EquityAssetWithAdjustment)) {
                return false;
            }
            EquityAssetWithAdjustment equityAssetWithAdjustment = (EquityAssetWithAdjustment) other;
            return Intrinsics.areEqual(this.equityAsset, equityAssetWithAdjustment.equityAsset) && Intrinsics.areEqual(this.adjustableQuantity, equityAssetWithAdjustment.adjustableQuantity);
        }

        public int hashCode() {
            return (this.equityAsset.hashCode() * 31) + this.adjustableQuantity.hashCode();
        }

        public EquityAssetWithAdjustment(EquityAsset equityAsset, BigDecimal adjustableQuantity) {
            Intrinsics.checkNotNullParameter(equityAsset, "equityAsset");
            Intrinsics.checkNotNullParameter(adjustableQuantity, "adjustableQuantity");
            this.equityAsset = equityAsset;
            this.adjustableQuantity = adjustableQuantity;
        }

        public final BigDecimal getAdjustableQuantity() {
            return this.adjustableQuantity;
        }

        public final EquityAsset getEquityAsset() {
            return this.equityAsset;
        }

        public String toString() {
            return this.equityAsset.toString();
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$OptionAssetWithAdjustment;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "optionsAsset", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/OptionAsset;", "adjustableQuantity", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/OptionAsset;Ljava/math/BigDecimal;)V", "getOptionsAsset", "()Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/OptionAsset;", "getAdjustableQuantity", "()Ljava/math/BigDecimal;", "toString", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowDataType$OptionAssetWithAdjustment */
    public static final /* data */ class OptionAssetWithAdjustment implements AcatsPlaidPartialTransferDuxo3 {
        public static final int $stable = 8;
        private final BigDecimal adjustableQuantity;
        private final OptionAsset optionsAsset;

        public static /* synthetic */ OptionAssetWithAdjustment copy$default(OptionAssetWithAdjustment optionAssetWithAdjustment, OptionAsset optionAsset, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                optionAsset = optionAssetWithAdjustment.optionsAsset;
            }
            if ((i & 2) != 0) {
                bigDecimal = optionAssetWithAdjustment.adjustableQuantity;
            }
            return optionAssetWithAdjustment.copy(optionAsset, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionAsset getOptionsAsset() {
            return this.optionsAsset;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAdjustableQuantity() {
            return this.adjustableQuantity;
        }

        public final OptionAssetWithAdjustment copy(OptionAsset optionsAsset, BigDecimal adjustableQuantity) {
            Intrinsics.checkNotNullParameter(optionsAsset, "optionsAsset");
            Intrinsics.checkNotNullParameter(adjustableQuantity, "adjustableQuantity");
            return new OptionAssetWithAdjustment(optionsAsset, adjustableQuantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionAssetWithAdjustment)) {
                return false;
            }
            OptionAssetWithAdjustment optionAssetWithAdjustment = (OptionAssetWithAdjustment) other;
            return Intrinsics.areEqual(this.optionsAsset, optionAssetWithAdjustment.optionsAsset) && Intrinsics.areEqual(this.adjustableQuantity, optionAssetWithAdjustment.adjustableQuantity);
        }

        public int hashCode() {
            return (this.optionsAsset.hashCode() * 31) + this.adjustableQuantity.hashCode();
        }

        public OptionAssetWithAdjustment(OptionAsset optionsAsset, BigDecimal adjustableQuantity) {
            Intrinsics.checkNotNullParameter(optionsAsset, "optionsAsset");
            Intrinsics.checkNotNullParameter(adjustableQuantity, "adjustableQuantity");
            this.optionsAsset = optionsAsset;
            this.adjustableQuantity = adjustableQuantity;
        }

        public final BigDecimal getAdjustableQuantity() {
            return this.adjustableQuantity;
        }

        public final OptionAsset getOptionsAsset() {
            return this.optionsAsset;
        }

        public String toString() {
            return this.optionsAsset.toString();
        }
    }
}
