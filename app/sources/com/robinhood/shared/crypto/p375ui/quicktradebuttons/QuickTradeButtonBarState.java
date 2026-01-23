package com.robinhood.shared.crypto.p375ui.quicktradebuttons;

import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: QuickTradeButtonBar.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState;", "", "quickTradeButtons", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState$QuickTradeButton;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getQuickTradeButtons", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "QuickTradeButton", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class QuickTradeButtonBarState {
    public static final int $stable = 0;
    private final ImmutableList<QuickTradeButton> quickTradeButtons;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickTradeButtonBarState copy$default(QuickTradeButtonBarState quickTradeButtonBarState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = quickTradeButtonBarState.quickTradeButtons;
        }
        return quickTradeButtonBarState.copy(immutableList);
    }

    public final ImmutableList<QuickTradeButton> component1() {
        return this.quickTradeButtons;
    }

    public final QuickTradeButtonBarState copy(ImmutableList<? extends QuickTradeButton> quickTradeButtons) {
        Intrinsics.checkNotNullParameter(quickTradeButtons, "quickTradeButtons");
        return new QuickTradeButtonBarState(quickTradeButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QuickTradeButtonBarState) && Intrinsics.areEqual(this.quickTradeButtons, ((QuickTradeButtonBarState) other).quickTradeButtons);
    }

    public int hashCode() {
        return this.quickTradeButtons.hashCode();
    }

    public String toString() {
        return "QuickTradeButtonBarState(quickTradeButtons=" + this.quickTradeButtons + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuickTradeButtonBarState(ImmutableList<? extends QuickTradeButton> quickTradeButtons) {
        Intrinsics.checkNotNullParameter(quickTradeButtons, "quickTradeButtons");
        this.quickTradeButtons = quickTradeButtons;
    }

    public final ImmutableList<QuickTradeButton> getQuickTradeButtons() {
        return this.quickTradeButtons;
    }

    /* compiled from: QuickTradeButtonBar.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState$QuickTradeButton;", "", "<init>", "()V", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "text", "Lcom/robinhood/utils/resource/StringResource;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "QuoteAmount", "SellAll", "BuyAll", "Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState$QuickTradeButton$BuyAll;", "Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState$QuickTradeButton$QuoteAmount;", "Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState$QuickTradeButton$SellAll;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class QuickTradeButton {
        public static final int $stable = 0;

        public /* synthetic */ QuickTradeButton(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract BigDecimal getAmount();

        public abstract StringResource getText();

        private QuickTradeButton() {
        }

        /* compiled from: QuickTradeButtonBar.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState$QuickTradeButton$QuoteAmount;", "Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState$QuickTradeButton;", "amount", "Ljava/math/BigDecimal;", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/utils/resource/StringResource;)V", "getAmount", "()Ljava/math/BigDecimal;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuoteAmount extends QuickTradeButton {
            public static final int $stable = 8;
            private final BigDecimal amount;
            private final StringResource text;

            public static /* synthetic */ QuoteAmount copy$default(QuoteAmount quoteAmount, BigDecimal bigDecimal, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = quoteAmount.amount;
                }
                if ((i & 2) != 0) {
                    stringResource = quoteAmount.text;
                }
                return quoteAmount.copy(bigDecimal, stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getAmount() {
                return this.amount;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getText() {
                return this.text;
            }

            public final QuoteAmount copy(BigDecimal amount, StringResource text) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(text, "text");
                return new QuoteAmount(amount, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuoteAmount)) {
                    return false;
                }
                QuoteAmount quoteAmount = (QuoteAmount) other;
                return Intrinsics.areEqual(this.amount, quoteAmount.amount) && Intrinsics.areEqual(this.text, quoteAmount.text);
            }

            public int hashCode() {
                return (this.amount.hashCode() * 31) + this.text.hashCode();
            }

            public String toString() {
                return "QuoteAmount(amount=" + this.amount + ", text=" + this.text + ")";
            }

            @Override // com.robinhood.shared.crypto.ui.quicktradebuttons.QuickTradeButtonBarState.QuickTradeButton
            public BigDecimal getAmount() {
                return this.amount;
            }

            @Override // com.robinhood.shared.crypto.ui.quicktradebuttons.QuickTradeButtonBarState.QuickTradeButton
            public StringResource getText() {
                return this.text;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuoteAmount(BigDecimal amount, StringResource text) {
                super(null);
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(text, "text");
                this.amount = amount;
                this.text = text;
            }
        }

        /* compiled from: QuickTradeButtonBar.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState$QuickTradeButton$SellAll;", "Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState$QuickTradeButton;", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "text", "Lcom/robinhood/utils/resource/StringResource;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SellAll extends QuickTradeButton {
            public static final int $stable = 8;
            private final BigDecimal amount;

            public static /* synthetic */ SellAll copy$default(SellAll sellAll, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = sellAll.amount;
                }
                return sellAll.copy(bigDecimal);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getAmount() {
                return this.amount;
            }

            public final SellAll copy(BigDecimal amount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                return new SellAll(amount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SellAll) && Intrinsics.areEqual(this.amount, ((SellAll) other).amount);
            }

            public int hashCode() {
                return this.amount.hashCode();
            }

            public String toString() {
                return "SellAll(amount=" + this.amount + ")";
            }

            @Override // com.robinhood.shared.crypto.ui.quicktradebuttons.QuickTradeButtonBarState.QuickTradeButton
            public BigDecimal getAmount() {
                return this.amount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SellAll(BigDecimal amount) {
                super(null);
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.amount = amount;
            }

            @Override // com.robinhood.shared.crypto.ui.quicktradebuttons.QuickTradeButtonBarState.QuickTradeButton
            public StringResource getText() {
                return StringResource.INSTANCE.invoke(C38572R.string.crypto_quick_trade_button_sell_all, new Object[0]);
            }
        }

        /* compiled from: QuickTradeButtonBar.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState$QuickTradeButton$BuyAll;", "Lcom/robinhood/shared/crypto/ui/quicktradebuttons/QuickTradeButtonBarState$QuickTradeButton;", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "text", "Lcom/robinhood/utils/resource/StringResource;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BuyAll extends QuickTradeButton {
            public static final int $stable = 8;
            private final BigDecimal amount;

            public static /* synthetic */ BuyAll copy$default(BuyAll buyAll, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = buyAll.amount;
                }
                return buyAll.copy(bigDecimal);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getAmount() {
                return this.amount;
            }

            public final BuyAll copy(BigDecimal amount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                return new BuyAll(amount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BuyAll) && Intrinsics.areEqual(this.amount, ((BuyAll) other).amount);
            }

            public int hashCode() {
                return this.amount.hashCode();
            }

            public String toString() {
                return "BuyAll(amount=" + this.amount + ")";
            }

            @Override // com.robinhood.shared.crypto.ui.quicktradebuttons.QuickTradeButtonBarState.QuickTradeButton
            public BigDecimal getAmount() {
                return this.amount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BuyAll(BigDecimal amount) {
                super(null);
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.amount = amount;
            }

            @Override // com.robinhood.shared.crypto.ui.quicktradebuttons.QuickTradeButtonBarState.QuickTradeButton
            public StringResource getText() {
                return StringResource.INSTANCE.invoke(C38572R.string.crypto_quick_trade_button_buy_all, new Object[0]);
            }
        }
    }
}
