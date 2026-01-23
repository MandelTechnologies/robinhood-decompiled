package com.robinhood.android.gold.lib.rejoin.api;

import com.robinhood.models.api.bonfire.ApiGoldPaymentInstrument;
import com.robinhood.models.api.bonfire.ApiGoldSignedAgreement;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldRejoinRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinRequest;", "", "enableSweep", "", "signedAgreements", "", "Lcom/robinhood/models/api/bonfire/ApiGoldSignedAgreement;", "backupPaymentInstrument", "Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;)V", "getEnableSweep", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSignedAgreements", "()Ljava/util/List;", "getBackupPaymentInstrument", "()Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;)Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinRequest;", "equals", "other", "hashCode", "", "toString", "", "lib-gold-rejoin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldRejoinRequest {
    private final ApiGoldPaymentInstrument backupPaymentInstrument;
    private final Boolean enableSweep;
    private final List<ApiGoldSignedAgreement> signedAgreements;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoldRejoinRequest copy$default(GoldRejoinRequest goldRejoinRequest, Boolean bool, List list, ApiGoldPaymentInstrument apiGoldPaymentInstrument, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = goldRejoinRequest.enableSweep;
        }
        if ((i & 2) != 0) {
            list = goldRejoinRequest.signedAgreements;
        }
        if ((i & 4) != 0) {
            apiGoldPaymentInstrument = goldRejoinRequest.backupPaymentInstrument;
        }
        return goldRejoinRequest.copy(bool, list, apiGoldPaymentInstrument);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getEnableSweep() {
        return this.enableSweep;
    }

    public final List<ApiGoldSignedAgreement> component2() {
        return this.signedAgreements;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiGoldPaymentInstrument getBackupPaymentInstrument() {
        return this.backupPaymentInstrument;
    }

    public final GoldRejoinRequest copy(@Json(name = "enable_sweep") Boolean enableSweep, @Json(name = "signed_agreements") List<ApiGoldSignedAgreement> signedAgreements, @Json(name = "backup_payment_instrument") ApiGoldPaymentInstrument backupPaymentInstrument) {
        return new GoldRejoinRequest(enableSweep, signedAgreements, backupPaymentInstrument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldRejoinRequest)) {
            return false;
        }
        GoldRejoinRequest goldRejoinRequest = (GoldRejoinRequest) other;
        return Intrinsics.areEqual(this.enableSweep, goldRejoinRequest.enableSweep) && Intrinsics.areEqual(this.signedAgreements, goldRejoinRequest.signedAgreements) && Intrinsics.areEqual(this.backupPaymentInstrument, goldRejoinRequest.backupPaymentInstrument);
    }

    public int hashCode() {
        Boolean bool = this.enableSweep;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<ApiGoldSignedAgreement> list = this.signedAgreements;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ApiGoldPaymentInstrument apiGoldPaymentInstrument = this.backupPaymentInstrument;
        return iHashCode2 + (apiGoldPaymentInstrument != null ? apiGoldPaymentInstrument.hashCode() : 0);
    }

    public String toString() {
        return "GoldRejoinRequest(enableSweep=" + this.enableSweep + ", signedAgreements=" + this.signedAgreements + ", backupPaymentInstrument=" + this.backupPaymentInstrument + ")";
    }

    public GoldRejoinRequest(@Json(name = "enable_sweep") Boolean bool, @Json(name = "signed_agreements") List<ApiGoldSignedAgreement> list, @Json(name = "backup_payment_instrument") ApiGoldPaymentInstrument apiGoldPaymentInstrument) {
        this.enableSweep = bool;
        this.signedAgreements = list;
        this.backupPaymentInstrument = apiGoldPaymentInstrument;
    }

    public final Boolean getEnableSweep() {
        return this.enableSweep;
    }

    public final List<ApiGoldSignedAgreement> getSignedAgreements() {
        return this.signedAgreements;
    }

    public final ApiGoldPaymentInstrument getBackupPaymentInstrument() {
        return this.backupPaymentInstrument;
    }
}
