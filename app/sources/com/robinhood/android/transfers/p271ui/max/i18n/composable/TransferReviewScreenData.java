package com.robinhood.android.transfers.p271ui.max.i18n.composable;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferReviewScreen.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003Jy\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001J\u0013\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001f¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferReviewScreenData;", "", "expectedExchangeRate", "Lcom/robinhood/utils/resource/StringResource;", "amount", "Lcom/robinhood/models/util/Money;", "expectedValue", "lastUpdated", "", "accountRowHeaderText", "accountRowText", "disclosureText", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isPrimaryButtonEnabled", "", "isPrimaryButtonLoading", "accountChangeButtonEnabled", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;ZZZ)V", "getExpectedExchangeRate", "()Lcom/robinhood/utils/resource/StringResource;", "getAmount", "()Lcom/robinhood/models/util/Money;", "getExpectedValue", "getLastUpdated", "()Ljava/lang/String;", "getAccountRowHeaderText", "getAccountRowText", "getDisclosureText", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "()Z", "getAccountChangeButtonEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferReviewScreenData {
    public static final int $stable = 8;
    private final boolean accountChangeButtonEnabled;
    private final StringResource accountRowHeaderText;
    private final StringResource accountRowText;
    private final Money amount;
    private final UIComponent<GenericAction> disclosureText;
    private final StringResource expectedExchangeRate;
    private final Money expectedValue;
    private final boolean isPrimaryButtonEnabled;
    private final boolean isPrimaryButtonLoading;
    private final String lastUpdated;

    public static /* synthetic */ TransferReviewScreenData copy$default(TransferReviewScreenData transferReviewScreenData, StringResource stringResource, Money money, Money money2, String str, StringResource stringResource2, StringResource stringResource3, UIComponent uIComponent, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = transferReviewScreenData.expectedExchangeRate;
        }
        if ((i & 2) != 0) {
            money = transferReviewScreenData.amount;
        }
        if ((i & 4) != 0) {
            money2 = transferReviewScreenData.expectedValue;
        }
        if ((i & 8) != 0) {
            str = transferReviewScreenData.lastUpdated;
        }
        if ((i & 16) != 0) {
            stringResource2 = transferReviewScreenData.accountRowHeaderText;
        }
        if ((i & 32) != 0) {
            stringResource3 = transferReviewScreenData.accountRowText;
        }
        if ((i & 64) != 0) {
            uIComponent = transferReviewScreenData.disclosureText;
        }
        if ((i & 128) != 0) {
            z = transferReviewScreenData.isPrimaryButtonEnabled;
        }
        if ((i & 256) != 0) {
            z2 = transferReviewScreenData.isPrimaryButtonLoading;
        }
        if ((i & 512) != 0) {
            z3 = transferReviewScreenData.accountChangeButtonEnabled;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        UIComponent uIComponent2 = uIComponent;
        boolean z6 = z;
        StringResource stringResource4 = stringResource2;
        StringResource stringResource5 = stringResource3;
        return transferReviewScreenData.copy(stringResource, money, money2, str, stringResource4, stringResource5, uIComponent2, z6, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getExpectedExchangeRate() {
        return this.expectedExchangeRate;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getAccountChangeButtonEnabled() {
        return this.accountChangeButtonEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getExpectedValue() {
        return this.expectedValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getAccountRowHeaderText() {
        return this.accountRowHeaderText;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getAccountRowText() {
        return this.accountRowText;
    }

    public final UIComponent<GenericAction> component7() {
        return this.disclosureText;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsPrimaryButtonEnabled() {
        return this.isPrimaryButtonEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    public final TransferReviewScreenData copy(StringResource expectedExchangeRate, Money amount, Money expectedValue, String lastUpdated, StringResource accountRowHeaderText, StringResource accountRowText, UIComponent<? extends GenericAction> disclosureText, boolean isPrimaryButtonEnabled, boolean isPrimaryButtonLoading, boolean accountChangeButtonEnabled) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(expectedValue, "expectedValue");
        Intrinsics.checkNotNullParameter(accountRowHeaderText, "accountRowHeaderText");
        Intrinsics.checkNotNullParameter(accountRowText, "accountRowText");
        return new TransferReviewScreenData(expectedExchangeRate, amount, expectedValue, lastUpdated, accountRowHeaderText, accountRowText, disclosureText, isPrimaryButtonEnabled, isPrimaryButtonLoading, accountChangeButtonEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferReviewScreenData)) {
            return false;
        }
        TransferReviewScreenData transferReviewScreenData = (TransferReviewScreenData) other;
        return Intrinsics.areEqual(this.expectedExchangeRate, transferReviewScreenData.expectedExchangeRate) && Intrinsics.areEqual(this.amount, transferReviewScreenData.amount) && Intrinsics.areEqual(this.expectedValue, transferReviewScreenData.expectedValue) && Intrinsics.areEqual(this.lastUpdated, transferReviewScreenData.lastUpdated) && Intrinsics.areEqual(this.accountRowHeaderText, transferReviewScreenData.accountRowHeaderText) && Intrinsics.areEqual(this.accountRowText, transferReviewScreenData.accountRowText) && Intrinsics.areEqual(this.disclosureText, transferReviewScreenData.disclosureText) && this.isPrimaryButtonEnabled == transferReviewScreenData.isPrimaryButtonEnabled && this.isPrimaryButtonLoading == transferReviewScreenData.isPrimaryButtonLoading && this.accountChangeButtonEnabled == transferReviewScreenData.accountChangeButtonEnabled;
    }

    public int hashCode() {
        StringResource stringResource = this.expectedExchangeRate;
        int iHashCode = (((((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.expectedValue.hashCode()) * 31;
        String str = this.lastUpdated;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.accountRowHeaderText.hashCode()) * 31) + this.accountRowText.hashCode()) * 31;
        UIComponent<GenericAction> uIComponent = this.disclosureText;
        return ((((((iHashCode2 + (uIComponent != null ? uIComponent.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPrimaryButtonEnabled)) * 31) + Boolean.hashCode(this.isPrimaryButtonLoading)) * 31) + Boolean.hashCode(this.accountChangeButtonEnabled);
    }

    public String toString() {
        return "TransferReviewScreenData(expectedExchangeRate=" + this.expectedExchangeRate + ", amount=" + this.amount + ", expectedValue=" + this.expectedValue + ", lastUpdated=" + this.lastUpdated + ", accountRowHeaderText=" + this.accountRowHeaderText + ", accountRowText=" + this.accountRowText + ", disclosureText=" + this.disclosureText + ", isPrimaryButtonEnabled=" + this.isPrimaryButtonEnabled + ", isPrimaryButtonLoading=" + this.isPrimaryButtonLoading + ", accountChangeButtonEnabled=" + this.accountChangeButtonEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransferReviewScreenData(StringResource stringResource, Money amount, Money expectedValue, String str, StringResource accountRowHeaderText, StringResource accountRowText, UIComponent<? extends GenericAction> uIComponent, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(expectedValue, "expectedValue");
        Intrinsics.checkNotNullParameter(accountRowHeaderText, "accountRowHeaderText");
        Intrinsics.checkNotNullParameter(accountRowText, "accountRowText");
        this.expectedExchangeRate = stringResource;
        this.amount = amount;
        this.expectedValue = expectedValue;
        this.lastUpdated = str;
        this.accountRowHeaderText = accountRowHeaderText;
        this.accountRowText = accountRowText;
        this.disclosureText = uIComponent;
        this.isPrimaryButtonEnabled = z;
        this.isPrimaryButtonLoading = z2;
        this.accountChangeButtonEnabled = z3;
    }

    public /* synthetic */ TransferReviewScreenData(StringResource stringResource, Money money, Money money2, String str, StringResource stringResource2, StringResource stringResource3, UIComponent uIComponent, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, money, money2, str, stringResource2, stringResource3, uIComponent, z, z2, (i & 512) != 0 ? false : z3);
    }

    public final StringResource getExpectedExchangeRate() {
        return this.expectedExchangeRate;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Money getExpectedValue() {
        return this.expectedValue;
    }

    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    public final StringResource getAccountRowHeaderText() {
        return this.accountRowHeaderText;
    }

    public final StringResource getAccountRowText() {
        return this.accountRowText;
    }

    public final UIComponent<GenericAction> getDisclosureText() {
        return this.disclosureText;
    }

    public final boolean isPrimaryButtonEnabled() {
        return this.isPrimaryButtonEnabled;
    }

    public final boolean isPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    public final boolean getAccountChangeButtonEnabled() {
        return this.accountChangeButtonEnabled;
    }
}
