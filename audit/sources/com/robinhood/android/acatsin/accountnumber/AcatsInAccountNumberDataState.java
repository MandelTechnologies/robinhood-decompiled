package com.robinhood.android.acatsin.accountnumber;

import android.graphics.Bitmap;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAccountNumberDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberDataState;", "", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "receivingBrokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "isButtonLoading", "", "contraBrokerageLogo", "Landroid/graphics/Bitmap;", "<init>", "(Lcom/robinhood/utils/Either;Lcom/robinhood/models/api/BrokerageAccountType;ZLandroid/graphics/Bitmap;)V", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getReceivingBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "()Z", "getContraBrokerageLogo", "()Landroid/graphics/Bitmap;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInAccountNumberDataState {
    public static final int $stable = 8;
    private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
    private final Bitmap contraBrokerageLogo;
    private final boolean isButtonLoading;
    private final BrokerageAccountType receivingBrokerageAccountType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AcatsInAccountNumberDataState copy$default(AcatsInAccountNumberDataState acatsInAccountNumberDataState, Either either, BrokerageAccountType brokerageAccountType, boolean z, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            either = acatsInAccountNumberDataState.brokerageOrDtcNumber;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = acatsInAccountNumberDataState.receivingBrokerageAccountType;
        }
        if ((i & 4) != 0) {
            z = acatsInAccountNumberDataState.isButtonLoading;
        }
        if ((i & 8) != 0) {
            bitmap = acatsInAccountNumberDataState.contraBrokerageLogo;
        }
        return acatsInAccountNumberDataState.copy(either, brokerageAccountType, z, bitmap);
    }

    public final Either<ApiBrokerage, String> component1() {
        return this.brokerageOrDtcNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getReceivingBrokerageAccountType() {
        return this.receivingBrokerageAccountType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsButtonLoading() {
        return this.isButtonLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final Bitmap getContraBrokerageLogo() {
        return this.contraBrokerageLogo;
    }

    public final AcatsInAccountNumberDataState copy(Either<ApiBrokerage, String> brokerageOrDtcNumber, BrokerageAccountType receivingBrokerageAccountType, boolean isButtonLoading, Bitmap contraBrokerageLogo) {
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        Intrinsics.checkNotNullParameter(receivingBrokerageAccountType, "receivingBrokerageAccountType");
        return new AcatsInAccountNumberDataState(brokerageOrDtcNumber, receivingBrokerageAccountType, isButtonLoading, contraBrokerageLogo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInAccountNumberDataState)) {
            return false;
        }
        AcatsInAccountNumberDataState acatsInAccountNumberDataState = (AcatsInAccountNumberDataState) other;
        return Intrinsics.areEqual(this.brokerageOrDtcNumber, acatsInAccountNumberDataState.brokerageOrDtcNumber) && this.receivingBrokerageAccountType == acatsInAccountNumberDataState.receivingBrokerageAccountType && this.isButtonLoading == acatsInAccountNumberDataState.isButtonLoading && Intrinsics.areEqual(this.contraBrokerageLogo, acatsInAccountNumberDataState.contraBrokerageLogo);
    }

    public int hashCode() {
        int iHashCode = ((((this.brokerageOrDtcNumber.hashCode() * 31) + this.receivingBrokerageAccountType.hashCode()) * 31) + Boolean.hashCode(this.isButtonLoading)) * 31;
        Bitmap bitmap = this.contraBrokerageLogo;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public String toString() {
        return "AcatsInAccountNumberDataState(brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", receivingBrokerageAccountType=" + this.receivingBrokerageAccountType + ", isButtonLoading=" + this.isButtonLoading + ", contraBrokerageLogo=" + this.contraBrokerageLogo + ")";
    }

    public AcatsInAccountNumberDataState(Either<ApiBrokerage, String> brokerageOrDtcNumber, BrokerageAccountType receivingBrokerageAccountType, boolean z, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        Intrinsics.checkNotNullParameter(receivingBrokerageAccountType, "receivingBrokerageAccountType");
        this.brokerageOrDtcNumber = brokerageOrDtcNumber;
        this.receivingBrokerageAccountType = receivingBrokerageAccountType;
        this.isButtonLoading = z;
        this.contraBrokerageLogo = bitmap;
    }

    public /* synthetic */ AcatsInAccountNumberDataState(Either either, BrokerageAccountType brokerageAccountType, boolean z, Bitmap bitmap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(either, brokerageAccountType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : bitmap);
    }

    public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
        return this.brokerageOrDtcNumber;
    }

    public final BrokerageAccountType getReceivingBrokerageAccountType() {
        return this.receivingBrokerageAccountType;
    }

    public final boolean isButtonLoading() {
        return this.isButtonLoading;
    }

    public final Bitmap getContraBrokerageLogo() {
        return this.contraBrokerageLogo;
    }
}
