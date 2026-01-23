package com.truelayer.payments.p419ui.screens.providerselection.components;

import com.truelayer.payments.core.domain.common.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SaveAccountDetailsDialog.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/components/SaveAccountDetailsDialogViewData;", "", "providerImageUrl", "", "providerExtendedImageUrl", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/common/Currency;)V", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "getProviderExtendedImageUrl", "()Ljava/lang/String;", "getProviderImageUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SaveAccountDetailsDialogViewData {
    public static final int $stable = 8;
    private final Currency currency;
    private final String providerExtendedImageUrl;
    private final String providerImageUrl;

    public static /* synthetic */ SaveAccountDetailsDialogViewData copy$default(SaveAccountDetailsDialogViewData saveAccountDetailsDialogViewData, String str, String str2, Currency currency, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveAccountDetailsDialogViewData.providerImageUrl;
        }
        if ((i & 2) != 0) {
            str2 = saveAccountDetailsDialogViewData.providerExtendedImageUrl;
        }
        if ((i & 4) != 0) {
            currency = saveAccountDetailsDialogViewData.currency;
        }
        return saveAccountDetailsDialogViewData.copy(str, str2, currency);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProviderImageUrl() {
        return this.providerImageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProviderExtendedImageUrl() {
        return this.providerExtendedImageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final Currency getCurrency() {
        return this.currency;
    }

    public final SaveAccountDetailsDialogViewData copy(String providerImageUrl, String providerExtendedImageUrl, Currency currency) {
        Intrinsics.checkNotNullParameter(providerImageUrl, "providerImageUrl");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new SaveAccountDetailsDialogViewData(providerImageUrl, providerExtendedImageUrl, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveAccountDetailsDialogViewData)) {
            return false;
        }
        SaveAccountDetailsDialogViewData saveAccountDetailsDialogViewData = (SaveAccountDetailsDialogViewData) other;
        return Intrinsics.areEqual(this.providerImageUrl, saveAccountDetailsDialogViewData.providerImageUrl) && Intrinsics.areEqual(this.providerExtendedImageUrl, saveAccountDetailsDialogViewData.providerExtendedImageUrl) && Intrinsics.areEqual(this.currency, saveAccountDetailsDialogViewData.currency);
    }

    public int hashCode() {
        int iHashCode = this.providerImageUrl.hashCode() * 31;
        String str = this.providerExtendedImageUrl;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.currency.hashCode();
    }

    public String toString() {
        return "SaveAccountDetailsDialogViewData(providerImageUrl=" + this.providerImageUrl + ", providerExtendedImageUrl=" + this.providerExtendedImageUrl + ", currency=" + this.currency + ")";
    }

    public SaveAccountDetailsDialogViewData(String providerImageUrl, String str, Currency currency) {
        Intrinsics.checkNotNullParameter(providerImageUrl, "providerImageUrl");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.providerImageUrl = providerImageUrl;
        this.providerExtendedImageUrl = str;
        this.currency = currency;
    }

    public final String getProviderImageUrl() {
        return this.providerImageUrl;
    }

    public final String getProviderExtendedImageUrl() {
        return this.providerExtendedImageUrl;
    }

    public final Currency getCurrency() {
        return this.currency;
    }
}
