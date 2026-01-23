package com.robinhood.android.crypto.costbasis.details.entry;

import com.robinhood.android.crypto.costbasis.C12782R;
import com.robinhood.android.crypto.costbasis.details.entry.InputRow;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.costbasis.CryptoCostBasisDetails;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.formats.crypto.CryptoFormattedAmount;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import nummus.p512v1.CostBasisLotsSummaryDto;
import nummus.p512v1.GetCostBasisDetailsResponseDto;

/* compiled from: CryptoCostBasisEntryDataState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;Bo\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003Jq\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u00106\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00058G¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\r\u001a\u00020\u000e8G¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0013\u0010\u000f\u001a\u00020\u000e8G¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u0011\u0010)\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001d¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;", "", "costBasisDetails", "Lcom/robinhood/models/crypto/db/costbasis/CryptoCostBasisDetails;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "purchaseDate", "", "coinQuantityAmount", "Lcom/robinhood/shared/formats/crypto/CryptoFormattedAmount;", "totalCostAmount", "purchaseDateError", "coinQuantityError", "isValidating", "", "isSubmitting", "<init>", "(Lcom/robinhood/models/crypto/db/costbasis/CryptoCostBasisDetails;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/String;Lcom/robinhood/shared/formats/crypto/CryptoFormattedAmount;Lcom/robinhood/shared/formats/crypto/CryptoFormattedAmount;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getCostBasisDetails", "()Lcom/robinhood/models/crypto/db/costbasis/CryptoCostBasisDetails;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getPurchaseDate", "()Ljava/lang/String;", "getCoinQuantityAmount", "()Lcom/robinhood/shared/formats/crypto/CryptoFormattedAmount;", "getTotalCostAmount", "getPurchaseDateError", "getCoinQuantityError", "()Z", "isLoading", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "inputRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow;", "getInputRows", "()Lkotlinx/collections/immutable/ImmutableList;", "isSaveButtonEnabled", "isSaveButtonLoading", "formatPurchaseDate", "dateText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoCostBasisEntryDataState {
    public static final String PURCHASE_DATE_FORMAT = "MM/dd/yy";
    public static final int PURCHASE_DATE_INPUT_LENGTH = 6;
    private final CryptoFormattedAmount coinQuantityAmount;
    private final String coinQuantityError;
    private final CryptoCostBasisDetails costBasisDetails;
    private final UiCurrencyPair currencyPair;
    private final boolean isSubmitting;
    private final boolean isValidating;
    private final String purchaseDate;
    private final String purchaseDateError;
    private final CryptoFormattedAmount totalCostAmount;
    public static final int $stable = 8;

    public CryptoCostBasisEntryDataState() {
        this(null, null, null, null, null, null, null, false, false, 511, null);
    }

    public static /* synthetic */ CryptoCostBasisEntryDataState copy$default(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, CryptoCostBasisDetails cryptoCostBasisDetails, UiCurrencyPair uiCurrencyPair, String str, CryptoFormattedAmount cryptoFormattedAmount, CryptoFormattedAmount cryptoFormattedAmount2, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoCostBasisDetails = cryptoCostBasisEntryDataState.costBasisDetails;
        }
        if ((i & 2) != 0) {
            uiCurrencyPair = cryptoCostBasisEntryDataState.currencyPair;
        }
        if ((i & 4) != 0) {
            str = cryptoCostBasisEntryDataState.purchaseDate;
        }
        if ((i & 8) != 0) {
            cryptoFormattedAmount = cryptoCostBasisEntryDataState.coinQuantityAmount;
        }
        if ((i & 16) != 0) {
            cryptoFormattedAmount2 = cryptoCostBasisEntryDataState.totalCostAmount;
        }
        if ((i & 32) != 0) {
            str2 = cryptoCostBasisEntryDataState.purchaseDateError;
        }
        if ((i & 64) != 0) {
            str3 = cryptoCostBasisEntryDataState.coinQuantityError;
        }
        if ((i & 128) != 0) {
            z = cryptoCostBasisEntryDataState.isValidating;
        }
        if ((i & 256) != 0) {
            z2 = cryptoCostBasisEntryDataState.isSubmitting;
        }
        boolean z3 = z;
        boolean z4 = z2;
        String str4 = str2;
        String str5 = str3;
        CryptoFormattedAmount cryptoFormattedAmount3 = cryptoFormattedAmount2;
        String str6 = str;
        return cryptoCostBasisEntryDataState.copy(cryptoCostBasisDetails, uiCurrencyPair, str6, cryptoFormattedAmount, cryptoFormattedAmount3, str4, str5, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoCostBasisDetails getCostBasisDetails() {
        return this.costBasisDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPurchaseDate() {
        return this.purchaseDate;
    }

    /* renamed from: component4, reason: from getter */
    public final CryptoFormattedAmount getCoinQuantityAmount() {
        return this.coinQuantityAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final CryptoFormattedAmount getTotalCostAmount() {
        return this.totalCostAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPurchaseDateError() {
        return this.purchaseDateError;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCoinQuantityError() {
        return this.coinQuantityError;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsValidating() {
        return this.isValidating;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsSubmitting() {
        return this.isSubmitting;
    }

    public final CryptoCostBasisEntryDataState copy(CryptoCostBasisDetails costBasisDetails, UiCurrencyPair currencyPair, String purchaseDate, CryptoFormattedAmount coinQuantityAmount, CryptoFormattedAmount totalCostAmount, String purchaseDateError, String coinQuantityError, boolean isValidating, boolean isSubmitting) {
        return new CryptoCostBasisEntryDataState(costBasisDetails, currencyPair, purchaseDate, coinQuantityAmount, totalCostAmount, purchaseDateError, coinQuantityError, isValidating, isSubmitting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCostBasisEntryDataState)) {
            return false;
        }
        CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState = (CryptoCostBasisEntryDataState) other;
        return Intrinsics.areEqual(this.costBasisDetails, cryptoCostBasisEntryDataState.costBasisDetails) && Intrinsics.areEqual(this.currencyPair, cryptoCostBasisEntryDataState.currencyPair) && Intrinsics.areEqual(this.purchaseDate, cryptoCostBasisEntryDataState.purchaseDate) && Intrinsics.areEqual(this.coinQuantityAmount, cryptoCostBasisEntryDataState.coinQuantityAmount) && Intrinsics.areEqual(this.totalCostAmount, cryptoCostBasisEntryDataState.totalCostAmount) && Intrinsics.areEqual(this.purchaseDateError, cryptoCostBasisEntryDataState.purchaseDateError) && Intrinsics.areEqual(this.coinQuantityError, cryptoCostBasisEntryDataState.coinQuantityError) && this.isValidating == cryptoCostBasisEntryDataState.isValidating && this.isSubmitting == cryptoCostBasisEntryDataState.isSubmitting;
    }

    public int hashCode() {
        CryptoCostBasisDetails cryptoCostBasisDetails = this.costBasisDetails;
        int iHashCode = (cryptoCostBasisDetails == null ? 0 : cryptoCostBasisDetails.hashCode()) * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode2 = (iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        String str = this.purchaseDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CryptoFormattedAmount cryptoFormattedAmount = this.coinQuantityAmount;
        int iHashCode4 = (iHashCode3 + (cryptoFormattedAmount == null ? 0 : cryptoFormattedAmount.hashCode())) * 31;
        CryptoFormattedAmount cryptoFormattedAmount2 = this.totalCostAmount;
        int iHashCode5 = (iHashCode4 + (cryptoFormattedAmount2 == null ? 0 : cryptoFormattedAmount2.hashCode())) * 31;
        String str2 = this.purchaseDateError;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coinQuantityError;
        return ((((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isValidating)) * 31) + Boolean.hashCode(this.isSubmitting);
    }

    public String toString() {
        return "CryptoCostBasisEntryDataState(costBasisDetails=" + this.costBasisDetails + ", currencyPair=" + this.currencyPair + ", purchaseDate=" + this.purchaseDate + ", coinQuantityAmount=" + this.coinQuantityAmount + ", totalCostAmount=" + this.totalCostAmount + ", purchaseDateError=" + this.purchaseDateError + ", coinQuantityError=" + this.coinQuantityError + ", isValidating=" + this.isValidating + ", isSubmitting=" + this.isSubmitting + ")";
    }

    public CryptoCostBasisEntryDataState(CryptoCostBasisDetails cryptoCostBasisDetails, UiCurrencyPair uiCurrencyPair, String str, CryptoFormattedAmount cryptoFormattedAmount, CryptoFormattedAmount cryptoFormattedAmount2, String str2, String str3, boolean z, boolean z2) {
        this.costBasisDetails = cryptoCostBasisDetails;
        this.currencyPair = uiCurrencyPair;
        this.purchaseDate = str;
        this.coinQuantityAmount = cryptoFormattedAmount;
        this.totalCostAmount = cryptoFormattedAmount2;
        this.purchaseDateError = str2;
        this.coinQuantityError = str3;
        this.isValidating = z;
        this.isSubmitting = z2;
    }

    public /* synthetic */ CryptoCostBasisEntryDataState(CryptoCostBasisDetails cryptoCostBasisDetails, UiCurrencyPair uiCurrencyPair, String str, CryptoFormattedAmount cryptoFormattedAmount, CryptoFormattedAmount cryptoFormattedAmount2, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoCostBasisDetails, (i & 2) != 0 ? null : uiCurrencyPair, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : cryptoFormattedAmount, (i & 16) != 0 ? null : cryptoFormattedAmount2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2);
    }

    public final CryptoCostBasisDetails getCostBasisDetails() {
        return this.costBasisDetails;
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final String getPurchaseDate() {
        return this.purchaseDate;
    }

    public final CryptoFormattedAmount getCoinQuantityAmount() {
        return this.coinQuantityAmount;
    }

    public final CryptoFormattedAmount getTotalCostAmount() {
        return this.totalCostAmount;
    }

    public final String getPurchaseDateError() {
        return this.purchaseDateError;
    }

    public final String getCoinQuantityError() {
        return this.coinQuantityError;
    }

    public final boolean isValidating() {
        return this.isValidating;
    }

    public final boolean isSubmitting() {
        return this.isSubmitting;
    }

    public final boolean isLoading() {
        return this.costBasisDetails == null || this.currencyPair == null;
    }

    public final StringResource getSubtitle() {
        UiCurrencyPair uiCurrencyPair;
        GetCostBasisDetailsResponseDto proto;
        CryptoCostBasisDetails cryptoCostBasisDetails = this.costBasisDetails;
        CostBasisLotsSummaryDto summary = (cryptoCostBasisDetails == null || (proto = cryptoCostBasisDetails.getProto()) == null) ? null : proto.getSummary();
        if (summary == null || (uiCurrencyPair = this.currencyPair) == null) {
            return StringResource.INSTANCE.invoke("--------------");
        }
        return StringResource.INSTANCE.invoke(C12782R.string.cost_basis_details_entry_subtitle, CurrencyDefinitions.formatCurrency$default(uiCurrencyPair.getAssetCurrency(), summary.getAvailable_quantity().toBigDecimalOrThrow(), false, false, null, 0, null, null, false, false, false, false, 2024, null), CurrencyDefinitions.formatCurrency$default(this.currencyPair.getAssetCurrency(), summary.getTotal_quantity().toBigDecimalOrThrow(), true, false, null, 0, null, null, false, false, false, false, 2024, null));
    }

    public final ImmutableList<InputRow> getInputRows() {
        String currency$default;
        String currency$default2;
        Currency quoteCurrency;
        Currency assetCurrency;
        InputRow.Type type2 = InputRow.Type.PURCHASE_DATE;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C12782R.string.cost_basis_detail_entry_input_label_purchase_date, new Object[0]);
        String str = this.purchaseDate;
        String purchaseDate = str != null ? formatPurchaseDate(str) : null;
        String str2 = purchaseDate == null ? "" : purchaseDate;
        String str3 = this.purchaseDate;
        String str4 = str3 == null ? "" : str3;
        String upperCase = PURCHASE_DATE_FORMAT.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        InputRow.Text text = new InputRow.Text(type2, stringResourceInvoke, null, str2, upperCase, this.purchaseDateError, str4);
        InputRow.Type type3 = InputRow.Type.COIN_QUANTITY;
        StringResource stringResourceInvoke2 = companion.invoke(C12782R.string.cost_basis_detail_entry_input_label_coin_qty, new Object[0]);
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair == null || (assetCurrency = uiCurrencyPair.getAssetCurrency()) == null) {
            currency$default = null;
        } else {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            currency$default = CurrencyDefinitions.formatCurrency$default(assetCurrency, ZERO, false, false, null, 0, null, null, false, false, false, false, 2024, null);
        }
        String str5 = currency$default == null ? "" : currency$default;
        CryptoFormattedAmount cryptoFormattedAmount = this.coinQuantityAmount;
        String quantityString = cryptoFormattedAmount != null ? cryptoFormattedAmount.getQuantityString() : null;
        String str6 = quantityString == null ? "" : quantityString;
        CryptoFormattedAmount cryptoFormattedAmount2 = this.coinQuantityAmount;
        InputRow.Number number = new InputRow.Number(type3, stringResourceInvoke2, null, str6, str5, this.coinQuantityError, cryptoFormattedAmount2 != null ? cryptoFormattedAmount2.getQuantity() : null);
        InputRow.Type type4 = InputRow.Type.TOTAL_COST;
        UiCurrencyPair uiCurrencyPair2 = this.currencyPair;
        if (uiCurrencyPair2 == null || (quoteCurrency = uiCurrencyPair2.getQuoteCurrency()) == null) {
            currency$default2 = null;
        } else {
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            currency$default2 = CurrencyDefinitions.formatCurrency$default(quoteCurrency, ZERO2, false, false, null, 0, null, null, false, false, false, false, 2046, null);
        }
        String str7 = currency$default2 == null ? "" : currency$default2;
        StringResource stringResourceInvoke3 = companion.invoke(C12782R.string.cost_basis_detail_entry_input_label_total_cost, new Object[0]);
        StringResource stringResourceInvoke4 = companion.invoke(C12782R.string.cost_basis_detail_entry_input_label_description_total_cost, new Object[0]);
        CryptoFormattedAmount cryptoFormattedAmount3 = this.totalCostAmount;
        String quantityString2 = cryptoFormattedAmount3 != null ? cryptoFormattedAmount3.getQuantityString() : null;
        String str8 = quantityString2 == null ? "" : quantityString2;
        CryptoFormattedAmount cryptoFormattedAmount4 = this.totalCostAmount;
        return extensions2.persistentListOf(text, number, new InputRow.Number(type4, stringResourceInvoke3, stringResourceInvoke4, str8, str7, null, cryptoFormattedAmount4 != null ? cryptoFormattedAmount4.getQuantity() : null, 32, null));
    }

    public final boolean isSaveButtonEnabled() {
        String str = this.purchaseDate;
        if ((str != null ? str.length() : 0) >= 6) {
            CryptoFormattedAmount cryptoFormattedAmount = this.coinQuantityAmount;
            String quantityString = cryptoFormattedAmount != null ? cryptoFormattedAmount.getQuantityString() : null;
            if (!(quantityString == null || StringsKt.isBlank(quantityString))) {
                CryptoFormattedAmount cryptoFormattedAmount2 = this.totalCostAmount;
                String quantityString2 = cryptoFormattedAmount2 != null ? cryptoFormattedAmount2.getQuantityString() : null;
                if (!(quantityString2 == null || StringsKt.isBlank(quantityString2)) && !this.isValidating && this.purchaseDateError == null && this.coinQuantityError == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isSaveButtonLoading() {
        return this.isSubmitting;
    }

    public final String formatPurchaseDate(String dateText) {
        Character chValueOf;
        Intrinsics.checkNotNullParameter(dateText, "dateText");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= PURCHASE_DATE_FORMAT.length()) {
                chValueOf = null;
                break;
            }
            char cCharAt = PURCHASE_DATE_FORMAT.charAt(i2);
            if (!Character.isLetter(cCharAt)) {
                chValueOf = Character.valueOf(cCharAt);
                break;
            }
            i2++;
        }
        char cCharValue = chValueOf != null ? chValueOf.charValue() : '/';
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) PURCHASE_DATE_FORMAT, cCharValue, 0, false, 6, (Object) null);
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) PURCHASE_DATE_FORMAT, cCharValue, 0, false, 6, (Object) null) - 1;
        int i3 = 0;
        while (i < dateText.length()) {
            char cCharAt2 = dateText.charAt(i);
            int i4 = i3 + 1;
            if (i3 == iIndexOf$default || i3 == iLastIndexOf$default) {
                sb.append(cCharValue);
            }
            sb.append(cCharAt2);
            i++;
            i3 = i4;
        }
        return sb.toString();
    }
}
