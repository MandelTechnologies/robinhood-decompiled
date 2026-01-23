package com.robinhood.android.transfers.international.p266ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.android.transfers.international.p266ui.util.McwFxRateExtensions;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.FxTransferDetails;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FxData.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/model/FxData;", "Landroid/os/Parcelable;", "targetAmount", "Lcom/robinhood/models/util/Money;", "fxRate", "Lcom/robinhood/models/fx/db/McwFxRate;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/fx/db/McwFxRate;)V", "getTargetAmount", "()Lcom/robinhood/models/util/Money;", "getFxRate", "()Lcom/robinhood/models/fx/db/McwFxRate;", "toApiI18nTransferData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$ApiI18nTransferData;", "sourceCurrency", "Ljava/util/Currency;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FxData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FxData> CREATOR = new Creator();
    private final McwFxRate fxRate;
    private final Money targetAmount;

    /* compiled from: FxData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<FxData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FxData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FxData((Money) parcel.readParcelable(FxData.class.getClassLoader()), (McwFxRate) parcel.readParcelable(FxData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FxData[] newArray(int i) {
            return new FxData[i];
        }
    }

    public static /* synthetic */ FxData copy$default(FxData fxData, Money money, McwFxRate mcwFxRate, int i, Object obj) {
        if ((i & 1) != 0) {
            money = fxData.targetAmount;
        }
        if ((i & 2) != 0) {
            mcwFxRate = fxData.fxRate;
        }
        return fxData.copy(money, mcwFxRate);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getTargetAmount() {
        return this.targetAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final McwFxRate getFxRate() {
        return this.fxRate;
    }

    public final FxData copy(Money targetAmount, McwFxRate fxRate) {
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        Intrinsics.checkNotNullParameter(fxRate, "fxRate");
        return new FxData(targetAmount, fxRate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FxData)) {
            return false;
        }
        FxData fxData = (FxData) other;
        return Intrinsics.areEqual(this.targetAmount, fxData.targetAmount) && Intrinsics.areEqual(this.fxRate, fxData.fxRate);
    }

    public int hashCode() {
        return (this.targetAmount.hashCode() * 31) + this.fxRate.hashCode();
    }

    public String toString() {
        return "FxData(targetAmount=" + this.targetAmount + ", fxRate=" + this.fxRate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.targetAmount, flags);
        dest.writeParcelable(this.fxRate, flags);
    }

    public FxData(Money targetAmount, McwFxRate fxRate) {
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        Intrinsics.checkNotNullParameter(fxRate, "fxRate");
        this.targetAmount = targetAmount;
        this.fxRate = fxRate;
    }

    public final Money getTargetAmount() {
        return this.targetAmount;
    }

    public final McwFxRate getFxRate() {
        return this.fxRate;
    }

    public final ApiCreateTransferRequest.ApiTransferAdditionalData.ApiI18nTransferData toApiI18nTransferData(Currency sourceCurrency) {
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        BigDecimal decimalValue = this.targetAmount.getDecimalValue();
        com.robinhood.transfers.api.Currency transferApiCurrency = Currency2.toTransferApiCurrency(this.targetAmount.getCurrency());
        String id = this.fxRate.getId();
        String plainString = McwFxRateExtensions.getPrice(this.fxRate, sourceCurrency, this.targetAmount.getCurrency()).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiI18nTransferData(new FxTransferDetails(decimalValue, transferApiCurrency, id, plainString));
    }
}
