package com.robinhood.android.engagement.cryptoEducationTrading.reward;

import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTradingEducationRewardConfirmationLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationState;", "", "response", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;", "", "upsellAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/utils/Either;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getResponse", "()Lcom/robinhood/utils/Either;", "getUpsellAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-education-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CryptoTradingEducationRewardConfirmationState {
    public static final int $stable = 8;
    private final Either<UiRewardCertificateInfo, Throwable> response;
    private final GenericAlertContent<GenericAction> upsellAlertContent;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoTradingEducationRewardConfirmationState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoTradingEducationRewardConfirmationState copy$default(CryptoTradingEducationRewardConfirmationState cryptoTradingEducationRewardConfirmationState, Either either, GenericAlertContent genericAlertContent, int i, Object obj) {
        if ((i & 1) != 0) {
            either = cryptoTradingEducationRewardConfirmationState.response;
        }
        if ((i & 2) != 0) {
            genericAlertContent = cryptoTradingEducationRewardConfirmationState.upsellAlertContent;
        }
        return cryptoTradingEducationRewardConfirmationState.copy(either, genericAlertContent);
    }

    public final Either<UiRewardCertificateInfo, Throwable> component1() {
        return this.response;
    }

    public final GenericAlertContent<GenericAction> component2() {
        return this.upsellAlertContent;
    }

    public final CryptoTradingEducationRewardConfirmationState copy(Either<UiRewardCertificateInfo, ? extends Throwable> response, GenericAlertContent<? extends GenericAction> upsellAlertContent) {
        return new CryptoTradingEducationRewardConfirmationState(response, upsellAlertContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTradingEducationRewardConfirmationState)) {
            return false;
        }
        CryptoTradingEducationRewardConfirmationState cryptoTradingEducationRewardConfirmationState = (CryptoTradingEducationRewardConfirmationState) other;
        return Intrinsics.areEqual(this.response, cryptoTradingEducationRewardConfirmationState.response) && Intrinsics.areEqual(this.upsellAlertContent, cryptoTradingEducationRewardConfirmationState.upsellAlertContent);
    }

    public int hashCode() {
        Either<UiRewardCertificateInfo, Throwable> either = this.response;
        int iHashCode = (either == null ? 0 : either.hashCode()) * 31;
        GenericAlertContent<GenericAction> genericAlertContent = this.upsellAlertContent;
        return iHashCode + (genericAlertContent != null ? genericAlertContent.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTradingEducationRewardConfirmationState(response=" + this.response + ", upsellAlertContent=" + this.upsellAlertContent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoTradingEducationRewardConfirmationState(Either<UiRewardCertificateInfo, ? extends Throwable> either, GenericAlertContent<? extends GenericAction> genericAlertContent) {
        this.response = either;
        this.upsellAlertContent = genericAlertContent;
    }

    public /* synthetic */ CryptoTradingEducationRewardConfirmationState(Either either, GenericAlertContent genericAlertContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : either, (i & 2) != 0 ? null : genericAlertContent);
    }

    public final Either<UiRewardCertificateInfo, Throwable> getResponse() {
        return this.response;
    }

    public final GenericAlertContent<GenericAction> getUpsellAlertContent() {
        return this.upsellAlertContent;
    }
}
