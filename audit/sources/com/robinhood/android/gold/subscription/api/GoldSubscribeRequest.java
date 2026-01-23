package com.robinhood.android.gold.subscription.api;

import com.robinhood.models.api.bonfire.ApiGoldPaymentInstrument;
import com.robinhood.models.api.bonfire.ApiGoldSignedAgreement;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiModels.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JZ\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/gold/subscription/api/GoldSubscribeRequest;", "", "planId", "Ljava/util/UUID;", "enableSweep", "", "enableSlip", "promotion", "", "signedAgreements", "", "Lcom/robinhood/models/api/bonfire/ApiGoldSignedAgreement;", "backupPaymentInstrument", "Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;", "<init>", "(Ljava/util/UUID;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;)V", "getPlanId", "()Ljava/util/UUID;", "getEnableSweep", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableSlip", "getPromotion", "()Ljava/lang/String;", "getSignedAgreements", "()Ljava/util/List;", "getBackupPaymentInstrument", "()Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/UUID;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;)Lcom/robinhood/android/gold/subscription/api/GoldSubscribeRequest;", "equals", "other", "hashCode", "", "toString", "lib-gold-subscription_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GoldSubscribeRequest {
    private final ApiGoldPaymentInstrument backupPaymentInstrument;
    private final Boolean enableSlip;
    private final Boolean enableSweep;
    private final UUID planId;
    private final String promotion;
    private final List<ApiGoldSignedAgreement> signedAgreements;

    public static /* synthetic */ GoldSubscribeRequest copy$default(GoldSubscribeRequest goldSubscribeRequest, UUID uuid, Boolean bool, Boolean bool2, String str, List list, ApiGoldPaymentInstrument apiGoldPaymentInstrument, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = goldSubscribeRequest.planId;
        }
        if ((i & 2) != 0) {
            bool = goldSubscribeRequest.enableSweep;
        }
        if ((i & 4) != 0) {
            bool2 = goldSubscribeRequest.enableSlip;
        }
        if ((i & 8) != 0) {
            str = goldSubscribeRequest.promotion;
        }
        if ((i & 16) != 0) {
            list = goldSubscribeRequest.signedAgreements;
        }
        if ((i & 32) != 0) {
            apiGoldPaymentInstrument = goldSubscribeRequest.backupPaymentInstrument;
        }
        List list2 = list;
        ApiGoldPaymentInstrument apiGoldPaymentInstrument2 = apiGoldPaymentInstrument;
        return goldSubscribeRequest.copy(uuid, bool, bool2, str, list2, apiGoldPaymentInstrument2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getPlanId() {
        return this.planId;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getEnableSweep() {
        return this.enableSweep;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getEnableSlip() {
        return this.enableSlip;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPromotion() {
        return this.promotion;
    }

    public final List<ApiGoldSignedAgreement> component5() {
        return this.signedAgreements;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiGoldPaymentInstrument getBackupPaymentInstrument() {
        return this.backupPaymentInstrument;
    }

    public final GoldSubscribeRequest copy(@Json(name = "plan_id") UUID planId, @Json(name = "enable_sweep") Boolean enableSweep, @Json(name = "enable_slip") Boolean enableSlip, @Json(name = "promotion") String promotion, @Json(name = "signed_agreements") List<ApiGoldSignedAgreement> signedAgreements, @Json(name = "backup_payment_instrument") ApiGoldPaymentInstrument backupPaymentInstrument) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        return new GoldSubscribeRequest(planId, enableSweep, enableSlip, promotion, signedAgreements, backupPaymentInstrument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldSubscribeRequest)) {
            return false;
        }
        GoldSubscribeRequest goldSubscribeRequest = (GoldSubscribeRequest) other;
        return Intrinsics.areEqual(this.planId, goldSubscribeRequest.planId) && Intrinsics.areEqual(this.enableSweep, goldSubscribeRequest.enableSweep) && Intrinsics.areEqual(this.enableSlip, goldSubscribeRequest.enableSlip) && Intrinsics.areEqual(this.promotion, goldSubscribeRequest.promotion) && Intrinsics.areEqual(this.signedAgreements, goldSubscribeRequest.signedAgreements) && Intrinsics.areEqual(this.backupPaymentInstrument, goldSubscribeRequest.backupPaymentInstrument);
    }

    public int hashCode() {
        int iHashCode = this.planId.hashCode() * 31;
        Boolean bool = this.enableSweep;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enableSlip;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.promotion;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<ApiGoldSignedAgreement> list = this.signedAgreements;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ApiGoldPaymentInstrument apiGoldPaymentInstrument = this.backupPaymentInstrument;
        return iHashCode5 + (apiGoldPaymentInstrument != null ? apiGoldPaymentInstrument.hashCode() : 0);
    }

    public String toString() {
        return "GoldSubscribeRequest(planId=" + this.planId + ", enableSweep=" + this.enableSweep + ", enableSlip=" + this.enableSlip + ", promotion=" + this.promotion + ", signedAgreements=" + this.signedAgreements + ", backupPaymentInstrument=" + this.backupPaymentInstrument + ")";
    }

    public GoldSubscribeRequest(@Json(name = "plan_id") UUID planId, @Json(name = "enable_sweep") Boolean bool, @Json(name = "enable_slip") Boolean bool2, @Json(name = "promotion") String str, @Json(name = "signed_agreements") List<ApiGoldSignedAgreement> list, @Json(name = "backup_payment_instrument") ApiGoldPaymentInstrument apiGoldPaymentInstrument) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.planId = planId;
        this.enableSweep = bool;
        this.enableSlip = bool2;
        this.promotion = str;
        this.signedAgreements = list;
        this.backupPaymentInstrument = apiGoldPaymentInstrument;
    }

    public final UUID getPlanId() {
        return this.planId;
    }

    public final Boolean getEnableSweep() {
        return this.enableSweep;
    }

    public final Boolean getEnableSlip() {
        return this.enableSlip;
    }

    public final String getPromotion() {
        return this.promotion;
    }

    public final List<ApiGoldSignedAgreement> getSignedAgreements() {
        return this.signedAgreements;
    }

    public final ApiGoldPaymentInstrument getBackupPaymentInstrument() {
        return this.backupPaymentInstrument;
    }
}
