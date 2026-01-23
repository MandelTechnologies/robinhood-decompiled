package com.robinhood.android.gold.lib.upgrade.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.bonfire.ApiGoldPaymentInstrument;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.models.api.bonfire.ApiGoldValueProp;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GoldUpgradeValuePropsAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ApiGoldUpgradeFlow.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u000fPQRSTUVWXYZ[\\]^B\u008d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010=\u001a\u00020\u0014HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0019HÆ\u0003J©\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0006\u0010C\u001a\u00020DJ\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010I\u001a\u00020DHÖ\u0001J\t\u0010J\u001a\u00020\u0005HÖ\u0001J\u0016\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020DR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00103¨\u0006_"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow;", "Landroid/os/Parcelable;", "defaultPlanId", "Ljava/util/UUID;", "promotion", "", "goldValueProps", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;", "goldValuePropsSdui", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldUpgradeValuePropsAction;", "goldDaysValueProps", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysValueProps;", "goldAgreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "goldSweepAgreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "goldExtraAgreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements;", "goldWelcome", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldWelcome;", "goldWelcomeSweep", "goldConfirmation", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;", "goldSuggestedAction", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSuggestedAction;", "goldSuggestedActionNoSweep", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysValueProps;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldWelcome;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldWelcome;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSuggestedAction;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSuggestedAction;)V", "getDefaultPlanId", "()Ljava/util/UUID;", "getPromotion", "()Ljava/lang/String;", "getGoldValueProps", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;", "getGoldValuePropsSdui", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "getGoldDaysValueProps", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysValueProps;", "getGoldAgreement", "()Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "getGoldSweepAgreements", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "getGoldExtraAgreements", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements;", "getGoldWelcome", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldWelcome;", "getGoldWelcomeSweep", "getGoldConfirmation", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;", "getGoldSuggestedAction", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSuggestedAction;", "getGoldSuggestedActionNoSweep", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ApiGoldValuePropsInfoTag", "ApiGoldValueProps", "ApiGoldDaysPlanSelectionSection", "ApiGoldDaysAdditionalValueProps", "ApiGoldDaysValueProps", "ApiGoldSweepAgreements", "ApiGoldExtraAgreements", "ApiGoldWelcome", "ApiGoldConfirmation", "ApiGoldSuggestedAction", "ApiGoldPlanSelectionOption", "ApiGoldPlanSelection", "ApiGoldPlanPromo", "ApiGoldPlanEditBanner", "ApiGoldPlanEdit", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldUpgradeFlow implements Parcelable {
    public static final Parcelable.Creator<ApiGoldUpgradeFlow> CREATOR = new Creator();
    private final UUID defaultPlanId;
    private final ApiGoldSweepAgreement goldAgreement;
    private final ApiGoldConfirmation goldConfirmation;
    private final ApiGoldDaysValueProps goldDaysValueProps;
    private final ApiGoldExtraAgreements goldExtraAgreements;
    private final ApiGoldSuggestedAction goldSuggestedAction;
    private final ApiGoldSuggestedAction goldSuggestedActionNoSweep;
    private final ApiGoldSweepAgreements goldSweepAgreements;
    private final ApiGoldValueProps goldValueProps;
    private final StandardPageTemplate<GoldUpgradeValuePropsAction> goldValuePropsSdui;
    private final ApiGoldWelcome goldWelcome;
    private final ApiGoldWelcome goldWelcomeSweep;
    private final String promotion;

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldUpgradeFlow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldUpgradeFlow createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            String string2 = parcel.readString();
            ApiGoldValueProps apiGoldValuePropsCreateFromParcel = parcel.readInt() == 0 ? null : ApiGoldValueProps.CREATOR.createFromParcel(parcel);
            StandardPageTemplate standardPageTemplate = (StandardPageTemplate) parcel.readParcelable(ApiGoldUpgradeFlow.class.getClassLoader());
            ApiGoldDaysValueProps apiGoldDaysValuePropsCreateFromParcel = parcel.readInt() == 0 ? null : ApiGoldDaysValueProps.CREATOR.createFromParcel(parcel);
            ApiGoldSweepAgreement apiGoldSweepAgreement = (ApiGoldSweepAgreement) parcel.readParcelable(ApiGoldUpgradeFlow.class.getClassLoader());
            ApiGoldSweepAgreements apiGoldSweepAgreementsCreateFromParcel = parcel.readInt() == 0 ? null : ApiGoldSweepAgreements.CREATOR.createFromParcel(parcel);
            ApiGoldExtraAgreements apiGoldExtraAgreementsCreateFromParcel = parcel.readInt() == 0 ? null : ApiGoldExtraAgreements.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<ApiGoldWelcome> creator = ApiGoldWelcome.CREATOR;
            return new ApiGoldUpgradeFlow(uuid, string2, apiGoldValuePropsCreateFromParcel, standardPageTemplate, apiGoldDaysValuePropsCreateFromParcel, apiGoldSweepAgreement, apiGoldSweepAgreementsCreateFromParcel, apiGoldExtraAgreementsCreateFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : ApiGoldConfirmation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ApiGoldSuggestedAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ApiGoldSuggestedAction.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldUpgradeFlow[] newArray(int i) {
            return new ApiGoldUpgradeFlow[i];
        }
    }

    public static /* synthetic */ ApiGoldUpgradeFlow copy$default(ApiGoldUpgradeFlow apiGoldUpgradeFlow, UUID uuid, String str, ApiGoldValueProps apiGoldValueProps, StandardPageTemplate standardPageTemplate, ApiGoldDaysValueProps apiGoldDaysValueProps, ApiGoldSweepAgreement apiGoldSweepAgreement, ApiGoldSweepAgreements apiGoldSweepAgreements, ApiGoldExtraAgreements apiGoldExtraAgreements, ApiGoldWelcome apiGoldWelcome, ApiGoldWelcome apiGoldWelcome2, ApiGoldConfirmation apiGoldConfirmation, ApiGoldSuggestedAction apiGoldSuggestedAction, ApiGoldSuggestedAction apiGoldSuggestedAction2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = apiGoldUpgradeFlow.defaultPlanId;
        }
        return apiGoldUpgradeFlow.copy(uuid, (i & 2) != 0 ? apiGoldUpgradeFlow.promotion : str, (i & 4) != 0 ? apiGoldUpgradeFlow.goldValueProps : apiGoldValueProps, (i & 8) != 0 ? apiGoldUpgradeFlow.goldValuePropsSdui : standardPageTemplate, (i & 16) != 0 ? apiGoldUpgradeFlow.goldDaysValueProps : apiGoldDaysValueProps, (i & 32) != 0 ? apiGoldUpgradeFlow.goldAgreement : apiGoldSweepAgreement, (i & 64) != 0 ? apiGoldUpgradeFlow.goldSweepAgreements : apiGoldSweepAgreements, (i & 128) != 0 ? apiGoldUpgradeFlow.goldExtraAgreements : apiGoldExtraAgreements, (i & 256) != 0 ? apiGoldUpgradeFlow.goldWelcome : apiGoldWelcome, (i & 512) != 0 ? apiGoldUpgradeFlow.goldWelcomeSweep : apiGoldWelcome2, (i & 1024) != 0 ? apiGoldUpgradeFlow.goldConfirmation : apiGoldConfirmation, (i & 2048) != 0 ? apiGoldUpgradeFlow.goldSuggestedAction : apiGoldSuggestedAction, (i & 4096) != 0 ? apiGoldUpgradeFlow.goldSuggestedActionNoSweep : apiGoldSuggestedAction2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getDefaultPlanId() {
        return this.defaultPlanId;
    }

    /* renamed from: component10, reason: from getter */
    public final ApiGoldWelcome getGoldWelcomeSweep() {
        return this.goldWelcomeSweep;
    }

    /* renamed from: component11, reason: from getter */
    public final ApiGoldConfirmation getGoldConfirmation() {
        return this.goldConfirmation;
    }

    /* renamed from: component12, reason: from getter */
    public final ApiGoldSuggestedAction getGoldSuggestedAction() {
        return this.goldSuggestedAction;
    }

    /* renamed from: component13, reason: from getter */
    public final ApiGoldSuggestedAction getGoldSuggestedActionNoSweep() {
        return this.goldSuggestedActionNoSweep;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPromotion() {
        return this.promotion;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiGoldValueProps getGoldValueProps() {
        return this.goldValueProps;
    }

    public final StandardPageTemplate<GoldUpgradeValuePropsAction> component4() {
        return this.goldValuePropsSdui;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiGoldDaysValueProps getGoldDaysValueProps() {
        return this.goldDaysValueProps;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiGoldSweepAgreement getGoldAgreement() {
        return this.goldAgreement;
    }

    /* renamed from: component7, reason: from getter */
    public final ApiGoldSweepAgreements getGoldSweepAgreements() {
        return this.goldSweepAgreements;
    }

    /* renamed from: component8, reason: from getter */
    public final ApiGoldExtraAgreements getGoldExtraAgreements() {
        return this.goldExtraAgreements;
    }

    /* renamed from: component9, reason: from getter */
    public final ApiGoldWelcome getGoldWelcome() {
        return this.goldWelcome;
    }

    public final ApiGoldUpgradeFlow copy(UUID defaultPlanId, String promotion, ApiGoldValueProps goldValueProps, StandardPageTemplate<? extends GoldUpgradeValuePropsAction> goldValuePropsSdui, ApiGoldDaysValueProps goldDaysValueProps, ApiGoldSweepAgreement goldAgreement, ApiGoldSweepAgreements goldSweepAgreements, ApiGoldExtraAgreements goldExtraAgreements, ApiGoldWelcome goldWelcome, ApiGoldWelcome goldWelcomeSweep, ApiGoldConfirmation goldConfirmation, ApiGoldSuggestedAction goldSuggestedAction, ApiGoldSuggestedAction goldSuggestedActionNoSweep) {
        Intrinsics.checkNotNullParameter(goldWelcome, "goldWelcome");
        return new ApiGoldUpgradeFlow(defaultPlanId, promotion, goldValueProps, goldValuePropsSdui, goldDaysValueProps, goldAgreement, goldSweepAgreements, goldExtraAgreements, goldWelcome, goldWelcomeSweep, goldConfirmation, goldSuggestedAction, goldSuggestedActionNoSweep);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldUpgradeFlow)) {
            return false;
        }
        ApiGoldUpgradeFlow apiGoldUpgradeFlow = (ApiGoldUpgradeFlow) other;
        return Intrinsics.areEqual(this.defaultPlanId, apiGoldUpgradeFlow.defaultPlanId) && Intrinsics.areEqual(this.promotion, apiGoldUpgradeFlow.promotion) && Intrinsics.areEqual(this.goldValueProps, apiGoldUpgradeFlow.goldValueProps) && Intrinsics.areEqual(this.goldValuePropsSdui, apiGoldUpgradeFlow.goldValuePropsSdui) && Intrinsics.areEqual(this.goldDaysValueProps, apiGoldUpgradeFlow.goldDaysValueProps) && Intrinsics.areEqual(this.goldAgreement, apiGoldUpgradeFlow.goldAgreement) && Intrinsics.areEqual(this.goldSweepAgreements, apiGoldUpgradeFlow.goldSweepAgreements) && Intrinsics.areEqual(this.goldExtraAgreements, apiGoldUpgradeFlow.goldExtraAgreements) && Intrinsics.areEqual(this.goldWelcome, apiGoldUpgradeFlow.goldWelcome) && Intrinsics.areEqual(this.goldWelcomeSweep, apiGoldUpgradeFlow.goldWelcomeSweep) && Intrinsics.areEqual(this.goldConfirmation, apiGoldUpgradeFlow.goldConfirmation) && Intrinsics.areEqual(this.goldSuggestedAction, apiGoldUpgradeFlow.goldSuggestedAction) && Intrinsics.areEqual(this.goldSuggestedActionNoSweep, apiGoldUpgradeFlow.goldSuggestedActionNoSweep);
    }

    public int hashCode() {
        UUID uuid = this.defaultPlanId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.promotion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ApiGoldValueProps apiGoldValueProps = this.goldValueProps;
        int iHashCode3 = (iHashCode2 + (apiGoldValueProps == null ? 0 : apiGoldValueProps.hashCode())) * 31;
        StandardPageTemplate<GoldUpgradeValuePropsAction> standardPageTemplate = this.goldValuePropsSdui;
        int iHashCode4 = (iHashCode3 + (standardPageTemplate == null ? 0 : standardPageTemplate.hashCode())) * 31;
        ApiGoldDaysValueProps apiGoldDaysValueProps = this.goldDaysValueProps;
        int iHashCode5 = (iHashCode4 + (apiGoldDaysValueProps == null ? 0 : apiGoldDaysValueProps.hashCode())) * 31;
        ApiGoldSweepAgreement apiGoldSweepAgreement = this.goldAgreement;
        int iHashCode6 = (iHashCode5 + (apiGoldSweepAgreement == null ? 0 : apiGoldSweepAgreement.hashCode())) * 31;
        ApiGoldSweepAgreements apiGoldSweepAgreements = this.goldSweepAgreements;
        int iHashCode7 = (iHashCode6 + (apiGoldSweepAgreements == null ? 0 : apiGoldSweepAgreements.hashCode())) * 31;
        ApiGoldExtraAgreements apiGoldExtraAgreements = this.goldExtraAgreements;
        int iHashCode8 = (((iHashCode7 + (apiGoldExtraAgreements == null ? 0 : apiGoldExtraAgreements.hashCode())) * 31) + this.goldWelcome.hashCode()) * 31;
        ApiGoldWelcome apiGoldWelcome = this.goldWelcomeSweep;
        int iHashCode9 = (iHashCode8 + (apiGoldWelcome == null ? 0 : apiGoldWelcome.hashCode())) * 31;
        ApiGoldConfirmation apiGoldConfirmation = this.goldConfirmation;
        int iHashCode10 = (iHashCode9 + (apiGoldConfirmation == null ? 0 : apiGoldConfirmation.hashCode())) * 31;
        ApiGoldSuggestedAction apiGoldSuggestedAction = this.goldSuggestedAction;
        int iHashCode11 = (iHashCode10 + (apiGoldSuggestedAction == null ? 0 : apiGoldSuggestedAction.hashCode())) * 31;
        ApiGoldSuggestedAction apiGoldSuggestedAction2 = this.goldSuggestedActionNoSweep;
        return iHashCode11 + (apiGoldSuggestedAction2 != null ? apiGoldSuggestedAction2.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldUpgradeFlow(defaultPlanId=" + this.defaultPlanId + ", promotion=" + this.promotion + ", goldValueProps=" + this.goldValueProps + ", goldValuePropsSdui=" + this.goldValuePropsSdui + ", goldDaysValueProps=" + this.goldDaysValueProps + ", goldAgreement=" + this.goldAgreement + ", goldSweepAgreements=" + this.goldSweepAgreements + ", goldExtraAgreements=" + this.goldExtraAgreements + ", goldWelcome=" + this.goldWelcome + ", goldWelcomeSweep=" + this.goldWelcomeSweep + ", goldConfirmation=" + this.goldConfirmation + ", goldSuggestedAction=" + this.goldSuggestedAction + ", goldSuggestedActionNoSweep=" + this.goldSuggestedActionNoSweep + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.defaultPlanId);
        dest.writeString(this.promotion);
        ApiGoldValueProps apiGoldValueProps = this.goldValueProps;
        if (apiGoldValueProps == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldValueProps.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.goldValuePropsSdui, flags);
        ApiGoldDaysValueProps apiGoldDaysValueProps = this.goldDaysValueProps;
        if (apiGoldDaysValueProps == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldDaysValueProps.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.goldAgreement, flags);
        ApiGoldSweepAgreements apiGoldSweepAgreements = this.goldSweepAgreements;
        if (apiGoldSweepAgreements == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldSweepAgreements.writeToParcel(dest, flags);
        }
        ApiGoldExtraAgreements apiGoldExtraAgreements = this.goldExtraAgreements;
        if (apiGoldExtraAgreements == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldExtraAgreements.writeToParcel(dest, flags);
        }
        this.goldWelcome.writeToParcel(dest, flags);
        ApiGoldWelcome apiGoldWelcome = this.goldWelcomeSweep;
        if (apiGoldWelcome == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldWelcome.writeToParcel(dest, flags);
        }
        ApiGoldConfirmation apiGoldConfirmation = this.goldConfirmation;
        if (apiGoldConfirmation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldConfirmation.writeToParcel(dest, flags);
        }
        ApiGoldSuggestedAction apiGoldSuggestedAction = this.goldSuggestedAction;
        if (apiGoldSuggestedAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldSuggestedAction.writeToParcel(dest, flags);
        }
        ApiGoldSuggestedAction apiGoldSuggestedAction2 = this.goldSuggestedActionNoSweep;
        if (apiGoldSuggestedAction2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldSuggestedAction2.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiGoldUpgradeFlow(UUID uuid, String str, ApiGoldValueProps apiGoldValueProps, StandardPageTemplate<? extends GoldUpgradeValuePropsAction> standardPageTemplate, ApiGoldDaysValueProps apiGoldDaysValueProps, ApiGoldSweepAgreement apiGoldSweepAgreement, ApiGoldSweepAgreements apiGoldSweepAgreements, ApiGoldExtraAgreements apiGoldExtraAgreements, ApiGoldWelcome goldWelcome, ApiGoldWelcome apiGoldWelcome, ApiGoldConfirmation apiGoldConfirmation, ApiGoldSuggestedAction apiGoldSuggestedAction, ApiGoldSuggestedAction apiGoldSuggestedAction2) {
        Intrinsics.checkNotNullParameter(goldWelcome, "goldWelcome");
        this.defaultPlanId = uuid;
        this.promotion = str;
        this.goldValueProps = apiGoldValueProps;
        this.goldValuePropsSdui = standardPageTemplate;
        this.goldDaysValueProps = apiGoldDaysValueProps;
        this.goldAgreement = apiGoldSweepAgreement;
        this.goldSweepAgreements = apiGoldSweepAgreements;
        this.goldExtraAgreements = apiGoldExtraAgreements;
        this.goldWelcome = goldWelcome;
        this.goldWelcomeSweep = apiGoldWelcome;
        this.goldConfirmation = apiGoldConfirmation;
        this.goldSuggestedAction = apiGoldSuggestedAction;
        this.goldSuggestedActionNoSweep = apiGoldSuggestedAction2;
    }

    public final UUID getDefaultPlanId() {
        return this.defaultPlanId;
    }

    public final String getPromotion() {
        return this.promotion;
    }

    public final ApiGoldValueProps getGoldValueProps() {
        return this.goldValueProps;
    }

    public final StandardPageTemplate<GoldUpgradeValuePropsAction> getGoldValuePropsSdui() {
        return this.goldValuePropsSdui;
    }

    public final ApiGoldDaysValueProps getGoldDaysValueProps() {
        return this.goldDaysValueProps;
    }

    public final ApiGoldSweepAgreement getGoldAgreement() {
        return this.goldAgreement;
    }

    public final ApiGoldSweepAgreements getGoldSweepAgreements() {
        return this.goldSweepAgreements;
    }

    public final ApiGoldExtraAgreements getGoldExtraAgreements() {
        return this.goldExtraAgreements;
    }

    public final ApiGoldWelcome getGoldWelcome() {
        return this.goldWelcome;
    }

    public final ApiGoldWelcome getGoldWelcomeSweep() {
        return this.goldWelcomeSweep;
    }

    public final ApiGoldConfirmation getGoldConfirmation() {
        return this.goldConfirmation;
    }

    public final ApiGoldSuggestedAction getGoldSuggestedAction() {
        return this.goldSuggestedAction;
    }

    public final ApiGoldSuggestedAction getGoldSuggestedActionNoSweep() {
        return this.goldSuggestedActionNoSweep;
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValuePropsInfoTag;", "Landroid/os/Parcelable;", AnnotatedPrivateKey.LABEL, "", "icon", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "identifier", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Icon;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getIcon", "()Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "getIdentifier", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldValuePropsInfoTag implements Parcelable {
        public static final Parcelable.Creator<ApiGoldValuePropsInfoTag> CREATOR = new Creator();
        private final Icon icon;
        private final String identifier;
        private final String label;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldValuePropsInfoTag> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldValuePropsInfoTag createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiGoldValuePropsInfoTag(parcel.readString(), parcel.readInt() == 0 ? null : Icon.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldValuePropsInfoTag[] newArray(int i) {
                return new ApiGoldValuePropsInfoTag[i];
            }
        }

        public static /* synthetic */ ApiGoldValuePropsInfoTag copy$default(ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag, String str, Icon icon, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiGoldValuePropsInfoTag.label;
            }
            if ((i & 2) != 0) {
                icon = apiGoldValuePropsInfoTag.icon;
            }
            if ((i & 4) != 0) {
                str2 = apiGoldValuePropsInfoTag.identifier;
            }
            return apiGoldValuePropsInfoTag.copy(str, icon, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final ApiGoldValuePropsInfoTag copy(String label, Icon icon, String identifier) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new ApiGoldValuePropsInfoTag(label, icon, identifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldValuePropsInfoTag)) {
                return false;
            }
            ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag = (ApiGoldValuePropsInfoTag) other;
            return Intrinsics.areEqual(this.label, apiGoldValuePropsInfoTag.label) && this.icon == apiGoldValuePropsInfoTag.icon && Intrinsics.areEqual(this.identifier, apiGoldValuePropsInfoTag.identifier);
        }

        public int hashCode() {
            int iHashCode = this.label.hashCode() * 31;
            Icon icon = this.icon;
            return ((iHashCode + (icon == null ? 0 : icon.hashCode())) * 31) + this.identifier.hashCode();
        }

        public String toString() {
            return "ApiGoldValuePropsInfoTag(label=" + this.label + ", icon=" + this.icon + ", identifier=" + this.identifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.label);
            Icon icon = this.icon;
            if (icon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(icon.name());
            }
            dest.writeString(this.identifier);
        }

        public ApiGoldValuePropsInfoTag(String label, Icon icon, String identifier) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.label = label;
            this.icon = icon;
            this.identifier = identifier;
        }

        public final String getLabel() {
            return this.label;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final String getIdentifier() {
            return this.identifier;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J}\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;", "Landroid/os/Parcelable;", "imagePath", "", "infoTag", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValuePropsInfoTag;", "title", "subtitleMarkdown", "valueProps", "", "Lcom/robinhood/models/api/bonfire/ApiGoldValueProp;", "goldMonthlyCost", "goldFreeDays", "learnMoreButton", "Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "ctaText", "disclosureMarkdown", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValuePropsInfoTag;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/TextButton;Ljava/lang/String;Ljava/lang/String;)V", "getImagePath", "()Ljava/lang/String;", "getInfoTag", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValuePropsInfoTag;", "getTitle", "getSubtitleMarkdown", "getValueProps", "()Ljava/util/List;", "getGoldMonthlyCost", "getGoldFreeDays", "getLearnMoreButton", "()Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "getCtaText", "getDisclosureMarkdown", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldValueProps implements Parcelable {
        public static final Parcelable.Creator<ApiGoldValueProps> CREATOR = new Creator();
        private final String ctaText;
        private final String disclosureMarkdown;
        private final String goldFreeDays;
        private final String goldMonthlyCost;
        private final String imagePath;
        private final ApiGoldValuePropsInfoTag infoTag;
        private final TextButton<DeeplinkAction> learnMoreButton;
        private final String subtitleMarkdown;
        private final String title;
        private final List<ApiGoldValueProp> valueProps;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldValueProps> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldValueProps createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTagCreateFromParcel = parcel.readInt() == 0 ? null : ApiGoldValuePropsInfoTag.CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ApiGoldValueProps.class.getClassLoader()));
                }
                return new ApiGoldValueProps(string2, apiGoldValuePropsInfoTagCreateFromParcel, string3, string4, arrayList, parcel.readString(), parcel.readString(), (TextButton) parcel.readParcelable(ApiGoldValueProps.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldValueProps[] newArray(int i) {
                return new ApiGoldValueProps[i];
            }
        }

        public static /* synthetic */ ApiGoldValueProps copy$default(ApiGoldValueProps apiGoldValueProps, String str, ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag, String str2, String str3, List list, String str4, String str5, TextButton textButton, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiGoldValueProps.imagePath;
            }
            if ((i & 2) != 0) {
                apiGoldValuePropsInfoTag = apiGoldValueProps.infoTag;
            }
            if ((i & 4) != 0) {
                str2 = apiGoldValueProps.title;
            }
            if ((i & 8) != 0) {
                str3 = apiGoldValueProps.subtitleMarkdown;
            }
            if ((i & 16) != 0) {
                list = apiGoldValueProps.valueProps;
            }
            if ((i & 32) != 0) {
                str4 = apiGoldValueProps.goldMonthlyCost;
            }
            if ((i & 64) != 0) {
                str5 = apiGoldValueProps.goldFreeDays;
            }
            if ((i & 128) != 0) {
                textButton = apiGoldValueProps.learnMoreButton;
            }
            if ((i & 256) != 0) {
                str6 = apiGoldValueProps.ctaText;
            }
            if ((i & 512) != 0) {
                str7 = apiGoldValueProps.disclosureMarkdown;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            TextButton textButton2 = textButton;
            List list2 = list;
            String str11 = str4;
            return apiGoldValueProps.copy(str, apiGoldValuePropsInfoTag, str2, str3, list2, str11, str10, textButton2, str8, str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiGoldValuePropsInfoTag getInfoTag() {
            return this.infoTag;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitleMarkdown() {
            return this.subtitleMarkdown;
        }

        public final List<ApiGoldValueProp> component5() {
            return this.valueProps;
        }

        /* renamed from: component6, reason: from getter */
        public final String getGoldMonthlyCost() {
            return this.goldMonthlyCost;
        }

        /* renamed from: component7, reason: from getter */
        public final String getGoldFreeDays() {
            return this.goldFreeDays;
        }

        public final TextButton<DeeplinkAction> component8() {
            return this.learnMoreButton;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        public final ApiGoldValueProps copy(String imagePath, ApiGoldValuePropsInfoTag infoTag, String title, String subtitleMarkdown, List<ApiGoldValueProp> valueProps, String goldMonthlyCost, String goldFreeDays, TextButton<DeeplinkAction> learnMoreButton, String ctaText, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(goldMonthlyCost, "goldMonthlyCost");
            Intrinsics.checkNotNullParameter(goldFreeDays, "goldFreeDays");
            Intrinsics.checkNotNullParameter(learnMoreButton, "learnMoreButton");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            return new ApiGoldValueProps(imagePath, infoTag, title, subtitleMarkdown, valueProps, goldMonthlyCost, goldFreeDays, learnMoreButton, ctaText, disclosureMarkdown);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldValueProps)) {
                return false;
            }
            ApiGoldValueProps apiGoldValueProps = (ApiGoldValueProps) other;
            return Intrinsics.areEqual(this.imagePath, apiGoldValueProps.imagePath) && Intrinsics.areEqual(this.infoTag, apiGoldValueProps.infoTag) && Intrinsics.areEqual(this.title, apiGoldValueProps.title) && Intrinsics.areEqual(this.subtitleMarkdown, apiGoldValueProps.subtitleMarkdown) && Intrinsics.areEqual(this.valueProps, apiGoldValueProps.valueProps) && Intrinsics.areEqual(this.goldMonthlyCost, apiGoldValueProps.goldMonthlyCost) && Intrinsics.areEqual(this.goldFreeDays, apiGoldValueProps.goldFreeDays) && Intrinsics.areEqual(this.learnMoreButton, apiGoldValueProps.learnMoreButton) && Intrinsics.areEqual(this.ctaText, apiGoldValueProps.ctaText) && Intrinsics.areEqual(this.disclosureMarkdown, apiGoldValueProps.disclosureMarkdown);
        }

        public int hashCode() {
            int iHashCode = this.imagePath.hashCode() * 31;
            ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag = this.infoTag;
            int iHashCode2 = (((iHashCode + (apiGoldValuePropsInfoTag == null ? 0 : apiGoldValuePropsInfoTag.hashCode())) * 31) + this.title.hashCode()) * 31;
            String str = this.subtitleMarkdown;
            return ((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.valueProps.hashCode()) * 31) + this.goldMonthlyCost.hashCode()) * 31) + this.goldFreeDays.hashCode()) * 31) + this.learnMoreButton.hashCode()) * 31) + this.ctaText.hashCode()) * 31) + this.disclosureMarkdown.hashCode();
        }

        public String toString() {
            return "ApiGoldValueProps(imagePath=" + this.imagePath + ", infoTag=" + this.infoTag + ", title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", valueProps=" + this.valueProps + ", goldMonthlyCost=" + this.goldMonthlyCost + ", goldFreeDays=" + this.goldFreeDays + ", learnMoreButton=" + this.learnMoreButton + ", ctaText=" + this.ctaText + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.imagePath);
            ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag = this.infoTag;
            if (apiGoldValuePropsInfoTag == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGoldValuePropsInfoTag.writeToParcel(dest, flags);
            }
            dest.writeString(this.title);
            dest.writeString(this.subtitleMarkdown);
            List<ApiGoldValueProp> list = this.valueProps;
            dest.writeInt(list.size());
            Iterator<ApiGoldValueProp> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.goldMonthlyCost);
            dest.writeString(this.goldFreeDays);
            dest.writeParcelable(this.learnMoreButton, flags);
            dest.writeString(this.ctaText);
            dest.writeString(this.disclosureMarkdown);
        }

        public ApiGoldValueProps(String imagePath, ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag, String title, String str, List<ApiGoldValueProp> valueProps, String goldMonthlyCost, String goldFreeDays, TextButton<DeeplinkAction> learnMoreButton, String ctaText, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(goldMonthlyCost, "goldMonthlyCost");
            Intrinsics.checkNotNullParameter(goldFreeDays, "goldFreeDays");
            Intrinsics.checkNotNullParameter(learnMoreButton, "learnMoreButton");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            this.imagePath = imagePath;
            this.infoTag = apiGoldValuePropsInfoTag;
            this.title = title;
            this.subtitleMarkdown = str;
            this.valueProps = valueProps;
            this.goldMonthlyCost = goldMonthlyCost;
            this.goldFreeDays = goldFreeDays;
            this.learnMoreButton = learnMoreButton;
            this.ctaText = ctaText;
            this.disclosureMarkdown = disclosureMarkdown;
        }

        public final String getImagePath() {
            return this.imagePath;
        }

        public final ApiGoldValuePropsInfoTag getInfoTag() {
            return this.infoTag;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitleMarkdown() {
            return this.subtitleMarkdown;
        }

        public final List<ApiGoldValueProp> getValueProps() {
            return this.valueProps;
        }

        public final String getGoldMonthlyCost() {
            return this.goldMonthlyCost;
        }

        public final String getGoldFreeDays() {
            return this.goldFreeDays;
        }

        public final TextButton<DeeplinkAction> getLearnMoreButton() {
            return this.learnMoreButton;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysPlanSelectionSection;", "Landroid/os/Parcelable;", "title", "", "options", "", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanSelectionOption;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldDaysPlanSelectionSection implements Parcelable {
        public static final Parcelable.Creator<ApiGoldDaysPlanSelectionSection> CREATOR = new Creator();
        private final List<ApiGoldPlanSelectionOption> options;
        private final String title;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldDaysPlanSelectionSection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldDaysPlanSelectionSection createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ApiGoldPlanSelectionOption.CREATOR.createFromParcel(parcel));
                }
                return new ApiGoldDaysPlanSelectionSection(string2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldDaysPlanSelectionSection[] newArray(int i) {
                return new ApiGoldDaysPlanSelectionSection[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiGoldDaysPlanSelectionSection copy$default(ApiGoldDaysPlanSelectionSection apiGoldDaysPlanSelectionSection, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiGoldDaysPlanSelectionSection.title;
            }
            if ((i & 2) != 0) {
                list = apiGoldDaysPlanSelectionSection.options;
            }
            return apiGoldDaysPlanSelectionSection.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<ApiGoldPlanSelectionOption> component2() {
            return this.options;
        }

        public final ApiGoldDaysPlanSelectionSection copy(String title, List<ApiGoldPlanSelectionOption> options) {
            Intrinsics.checkNotNullParameter(options, "options");
            return new ApiGoldDaysPlanSelectionSection(title, options);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldDaysPlanSelectionSection)) {
                return false;
            }
            ApiGoldDaysPlanSelectionSection apiGoldDaysPlanSelectionSection = (ApiGoldDaysPlanSelectionSection) other;
            return Intrinsics.areEqual(this.title, apiGoldDaysPlanSelectionSection.title) && Intrinsics.areEqual(this.options, apiGoldDaysPlanSelectionSection.options);
        }

        public int hashCode() {
            String str = this.title;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.options.hashCode();
        }

        public String toString() {
            return "ApiGoldDaysPlanSelectionSection(title=" + this.title + ", options=" + this.options + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            List<ApiGoldPlanSelectionOption> list = this.options;
            dest.writeInt(list.size());
            Iterator<ApiGoldPlanSelectionOption> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }

        public ApiGoldDaysPlanSelectionSection(String str, List<ApiGoldPlanSelectionOption> options) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.title = str;
            this.options = options;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<ApiGoldPlanSelectionOption> getOptions() {
            return this.options;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysAdditionalValueProps;", "Landroid/os/Parcelable;", "title", "", "valueProps", "", "Lcom/robinhood/models/api/bonfire/ApiGoldValueProp;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getValueProps", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldDaysAdditionalValueProps implements Parcelable {
        public static final Parcelable.Creator<ApiGoldDaysAdditionalValueProps> CREATOR = new Creator();
        private final String title;
        private final List<ApiGoldValueProp> valueProps;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldDaysAdditionalValueProps> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldDaysAdditionalValueProps createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ApiGoldDaysAdditionalValueProps.class.getClassLoader()));
                }
                return new ApiGoldDaysAdditionalValueProps(string2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldDaysAdditionalValueProps[] newArray(int i) {
                return new ApiGoldDaysAdditionalValueProps[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiGoldDaysAdditionalValueProps copy$default(ApiGoldDaysAdditionalValueProps apiGoldDaysAdditionalValueProps, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiGoldDaysAdditionalValueProps.title;
            }
            if ((i & 2) != 0) {
                list = apiGoldDaysAdditionalValueProps.valueProps;
            }
            return apiGoldDaysAdditionalValueProps.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<ApiGoldValueProp> component2() {
            return this.valueProps;
        }

        public final ApiGoldDaysAdditionalValueProps copy(String title, @Json(name = "value_props") List<ApiGoldValueProp> valueProps) {
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            return new ApiGoldDaysAdditionalValueProps(title, valueProps);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldDaysAdditionalValueProps)) {
                return false;
            }
            ApiGoldDaysAdditionalValueProps apiGoldDaysAdditionalValueProps = (ApiGoldDaysAdditionalValueProps) other;
            return Intrinsics.areEqual(this.title, apiGoldDaysAdditionalValueProps.title) && Intrinsics.areEqual(this.valueProps, apiGoldDaysAdditionalValueProps.valueProps);
        }

        public int hashCode() {
            String str = this.title;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.valueProps.hashCode();
        }

        public String toString() {
            return "ApiGoldDaysAdditionalValueProps(title=" + this.title + ", valueProps=" + this.valueProps + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            List<ApiGoldValueProp> list = this.valueProps;
            dest.writeInt(list.size());
            Iterator<ApiGoldValueProp> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public ApiGoldDaysAdditionalValueProps(String str, @Json(name = "value_props") List<ApiGoldValueProp> valueProps) {
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            this.title = str;
            this.valueProps = valueProps;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<ApiGoldValueProp> getValueProps() {
            return this.valueProps;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0091\u0001\u00103\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0006\u00104\u001a\u000205J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u000205HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000205R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysValueProps;", "Landroid/os/Parcelable;", "assetPath", "", "infoTag", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValuePropsInfoTag;", "title", "subtitleMarkdown", "valueProps", "", "Lcom/robinhood/models/api/bonfire/ApiGoldValueProp;", "planSelectionSection", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysPlanSelectionSection;", "goldFreeDays", "additionalValueProps", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysAdditionalValueProps;", "disclosureMarkdown", "ctaDisclosureMarkdown", "ctaText", "loggingIdentifier", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValuePropsInfoTag;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysPlanSelectionSection;Ljava/lang/String;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysAdditionalValueProps;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssetPath", "()Ljava/lang/String;", "getInfoTag", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValuePropsInfoTag;", "getTitle", "getSubtitleMarkdown", "getValueProps", "()Ljava/util/List;", "getPlanSelectionSection", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysPlanSelectionSection;", "getGoldFreeDays", "getAdditionalValueProps", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysAdditionalValueProps;", "getDisclosureMarkdown", "getCtaDisclosureMarkdown", "getCtaText", "getLoggingIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldDaysValueProps implements Parcelable {
        public static final Parcelable.Creator<ApiGoldDaysValueProps> CREATOR = new Creator();
        private final ApiGoldDaysAdditionalValueProps additionalValueProps;
        private final String assetPath;
        private final String ctaDisclosureMarkdown;
        private final String ctaText;
        private final String disclosureMarkdown;
        private final String goldFreeDays;
        private final ApiGoldValuePropsInfoTag infoTag;
        private final String loggingIdentifier;
        private final ApiGoldDaysPlanSelectionSection planSelectionSection;
        private final String subtitleMarkdown;
        private final String title;
        private final List<ApiGoldValueProp> valueProps;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldDaysValueProps> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldDaysValueProps createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTagCreateFromParcel = parcel.readInt() == 0 ? null : ApiGoldValuePropsInfoTag.CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ApiGoldDaysValueProps.class.getClassLoader()));
                }
                return new ApiGoldDaysValueProps(string2, apiGoldValuePropsInfoTagCreateFromParcel, string3, string4, arrayList, ApiGoldDaysPlanSelectionSection.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? ApiGoldDaysAdditionalValueProps.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldDaysValueProps[] newArray(int i) {
                return new ApiGoldDaysValueProps[i];
            }
        }

        public static /* synthetic */ ApiGoldDaysValueProps copy$default(ApiGoldDaysValueProps apiGoldDaysValueProps, String str, ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag, String str2, String str3, List list, ApiGoldDaysPlanSelectionSection apiGoldDaysPlanSelectionSection, String str4, ApiGoldDaysAdditionalValueProps apiGoldDaysAdditionalValueProps, String str5, String str6, String str7, String str8, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiGoldDaysValueProps.assetPath;
            }
            if ((i & 2) != 0) {
                apiGoldValuePropsInfoTag = apiGoldDaysValueProps.infoTag;
            }
            if ((i & 4) != 0) {
                str2 = apiGoldDaysValueProps.title;
            }
            if ((i & 8) != 0) {
                str3 = apiGoldDaysValueProps.subtitleMarkdown;
            }
            if ((i & 16) != 0) {
                list = apiGoldDaysValueProps.valueProps;
            }
            if ((i & 32) != 0) {
                apiGoldDaysPlanSelectionSection = apiGoldDaysValueProps.planSelectionSection;
            }
            if ((i & 64) != 0) {
                str4 = apiGoldDaysValueProps.goldFreeDays;
            }
            if ((i & 128) != 0) {
                apiGoldDaysAdditionalValueProps = apiGoldDaysValueProps.additionalValueProps;
            }
            if ((i & 256) != 0) {
                str5 = apiGoldDaysValueProps.disclosureMarkdown;
            }
            if ((i & 512) != 0) {
                str6 = apiGoldDaysValueProps.ctaDisclosureMarkdown;
            }
            if ((i & 1024) != 0) {
                str7 = apiGoldDaysValueProps.ctaText;
            }
            if ((i & 2048) != 0) {
                str8 = apiGoldDaysValueProps.loggingIdentifier;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str5;
            String str12 = str6;
            String str13 = str4;
            ApiGoldDaysAdditionalValueProps apiGoldDaysAdditionalValueProps2 = apiGoldDaysAdditionalValueProps;
            List list2 = list;
            ApiGoldDaysPlanSelectionSection apiGoldDaysPlanSelectionSection2 = apiGoldDaysPlanSelectionSection;
            return apiGoldDaysValueProps.copy(str, apiGoldValuePropsInfoTag, str2, str3, list2, apiGoldDaysPlanSelectionSection2, str13, apiGoldDaysAdditionalValueProps2, str11, str12, str9, str10);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssetPath() {
            return this.assetPath;
        }

        /* renamed from: component10, reason: from getter */
        public final String getCtaDisclosureMarkdown() {
            return this.ctaDisclosureMarkdown;
        }

        /* renamed from: component11, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component12, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiGoldValuePropsInfoTag getInfoTag() {
            return this.infoTag;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitleMarkdown() {
            return this.subtitleMarkdown;
        }

        public final List<ApiGoldValueProp> component5() {
            return this.valueProps;
        }

        /* renamed from: component6, reason: from getter */
        public final ApiGoldDaysPlanSelectionSection getPlanSelectionSection() {
            return this.planSelectionSection;
        }

        /* renamed from: component7, reason: from getter */
        public final String getGoldFreeDays() {
            return this.goldFreeDays;
        }

        /* renamed from: component8, reason: from getter */
        public final ApiGoldDaysAdditionalValueProps getAdditionalValueProps() {
            return this.additionalValueProps;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final ApiGoldDaysValueProps copy(@Json(name = "asset_path") String assetPath, @Json(name = "info_tag") ApiGoldValuePropsInfoTag infoTag, String title, @Json(name = "subtitle_markdown") String subtitleMarkdown, @Json(name = "value_props") List<ApiGoldValueProp> valueProps, @Json(name = "plan_selection_section") ApiGoldDaysPlanSelectionSection planSelectionSection, @Json(name = "gold_free_days") String goldFreeDays, @Json(name = "additional_value_props") ApiGoldDaysAdditionalValueProps additionalValueProps, @Json(name = "disclosure_markdown") String disclosureMarkdown, @Json(name = "cta_disclosure_markdown") String ctaDisclosureMarkdown, @Json(name = "cta_text") String ctaText, @Json(name = "logging_identifier") String loggingIdentifier) {
            Intrinsics.checkNotNullParameter(assetPath, "assetPath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(planSelectionSection, "planSelectionSection");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            return new ApiGoldDaysValueProps(assetPath, infoTag, title, subtitleMarkdown, valueProps, planSelectionSection, goldFreeDays, additionalValueProps, disclosureMarkdown, ctaDisclosureMarkdown, ctaText, loggingIdentifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldDaysValueProps)) {
                return false;
            }
            ApiGoldDaysValueProps apiGoldDaysValueProps = (ApiGoldDaysValueProps) other;
            return Intrinsics.areEqual(this.assetPath, apiGoldDaysValueProps.assetPath) && Intrinsics.areEqual(this.infoTag, apiGoldDaysValueProps.infoTag) && Intrinsics.areEqual(this.title, apiGoldDaysValueProps.title) && Intrinsics.areEqual(this.subtitleMarkdown, apiGoldDaysValueProps.subtitleMarkdown) && Intrinsics.areEqual(this.valueProps, apiGoldDaysValueProps.valueProps) && Intrinsics.areEqual(this.planSelectionSection, apiGoldDaysValueProps.planSelectionSection) && Intrinsics.areEqual(this.goldFreeDays, apiGoldDaysValueProps.goldFreeDays) && Intrinsics.areEqual(this.additionalValueProps, apiGoldDaysValueProps.additionalValueProps) && Intrinsics.areEqual(this.disclosureMarkdown, apiGoldDaysValueProps.disclosureMarkdown) && Intrinsics.areEqual(this.ctaDisclosureMarkdown, apiGoldDaysValueProps.ctaDisclosureMarkdown) && Intrinsics.areEqual(this.ctaText, apiGoldDaysValueProps.ctaText) && Intrinsics.areEqual(this.loggingIdentifier, apiGoldDaysValueProps.loggingIdentifier);
        }

        public int hashCode() {
            int iHashCode = this.assetPath.hashCode() * 31;
            ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag = this.infoTag;
            int iHashCode2 = (((iHashCode + (apiGoldValuePropsInfoTag == null ? 0 : apiGoldValuePropsInfoTag.hashCode())) * 31) + this.title.hashCode()) * 31;
            String str = this.subtitleMarkdown;
            int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.valueProps.hashCode()) * 31) + this.planSelectionSection.hashCode()) * 31;
            String str2 = this.goldFreeDays;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ApiGoldDaysAdditionalValueProps apiGoldDaysAdditionalValueProps = this.additionalValueProps;
            int iHashCode5 = (((iHashCode4 + (apiGoldDaysAdditionalValueProps == null ? 0 : apiGoldDaysAdditionalValueProps.hashCode())) * 31) + this.disclosureMarkdown.hashCode()) * 31;
            String str3 = this.ctaDisclosureMarkdown;
            return ((((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.ctaText.hashCode()) * 31) + this.loggingIdentifier.hashCode();
        }

        public String toString() {
            return "ApiGoldDaysValueProps(assetPath=" + this.assetPath + ", infoTag=" + this.infoTag + ", title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", valueProps=" + this.valueProps + ", planSelectionSection=" + this.planSelectionSection + ", goldFreeDays=" + this.goldFreeDays + ", additionalValueProps=" + this.additionalValueProps + ", disclosureMarkdown=" + this.disclosureMarkdown + ", ctaDisclosureMarkdown=" + this.ctaDisclosureMarkdown + ", ctaText=" + this.ctaText + ", loggingIdentifier=" + this.loggingIdentifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.assetPath);
            ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag = this.infoTag;
            if (apiGoldValuePropsInfoTag == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGoldValuePropsInfoTag.writeToParcel(dest, flags);
            }
            dest.writeString(this.title);
            dest.writeString(this.subtitleMarkdown);
            List<ApiGoldValueProp> list = this.valueProps;
            dest.writeInt(list.size());
            Iterator<ApiGoldValueProp> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            this.planSelectionSection.writeToParcel(dest, flags);
            dest.writeString(this.goldFreeDays);
            ApiGoldDaysAdditionalValueProps apiGoldDaysAdditionalValueProps = this.additionalValueProps;
            if (apiGoldDaysAdditionalValueProps == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGoldDaysAdditionalValueProps.writeToParcel(dest, flags);
            }
            dest.writeString(this.disclosureMarkdown);
            dest.writeString(this.ctaDisclosureMarkdown);
            dest.writeString(this.ctaText);
            dest.writeString(this.loggingIdentifier);
        }

        public ApiGoldDaysValueProps(@Json(name = "asset_path") String assetPath, @Json(name = "info_tag") ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag, String title, @Json(name = "subtitle_markdown") String str, @Json(name = "value_props") List<ApiGoldValueProp> valueProps, @Json(name = "plan_selection_section") ApiGoldDaysPlanSelectionSection planSelectionSection, @Json(name = "gold_free_days") String str2, @Json(name = "additional_value_props") ApiGoldDaysAdditionalValueProps apiGoldDaysAdditionalValueProps, @Json(name = "disclosure_markdown") String disclosureMarkdown, @Json(name = "cta_disclosure_markdown") String str3, @Json(name = "cta_text") String ctaText, @Json(name = "logging_identifier") String loggingIdentifier) {
            Intrinsics.checkNotNullParameter(assetPath, "assetPath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(planSelectionSection, "planSelectionSection");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            this.assetPath = assetPath;
            this.infoTag = apiGoldValuePropsInfoTag;
            this.title = title;
            this.subtitleMarkdown = str;
            this.valueProps = valueProps;
            this.planSelectionSection = planSelectionSection;
            this.goldFreeDays = str2;
            this.additionalValueProps = apiGoldDaysAdditionalValueProps;
            this.disclosureMarkdown = disclosureMarkdown;
            this.ctaDisclosureMarkdown = str3;
            this.ctaText = ctaText;
            this.loggingIdentifier = loggingIdentifier;
        }

        public final String getAssetPath() {
            return this.assetPath;
        }

        public final ApiGoldValuePropsInfoTag getInfoTag() {
            return this.infoTag;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitleMarkdown() {
            return this.subtitleMarkdown;
        }

        public final List<ApiGoldValueProp> getValueProps() {
            return this.valueProps;
        }

        public final ApiGoldDaysPlanSelectionSection getPlanSelectionSection() {
            return this.planSelectionSection;
        }

        public final String getGoldFreeDays() {
            return this.goldFreeDays;
        }

        public final ApiGoldDaysAdditionalValueProps getAdditionalValueProps() {
            return this.additionalValueProps;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final String getCtaDisclosureMarkdown() {
            return this.ctaDisclosureMarkdown;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003J®\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010;J\u0006\u0010<\u001a\u00020=J\u0013\u0010>\u001a\u00020\u00112\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020=HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020=R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "Landroid/os/Parcelable;", "title", "", "description", "goldTitle", "goldDescriptionMarkdown", "goldDescriptionCta", "goldFullAgreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "sweepTitle", "sweepDescriptionMarkdown", "sweepDescriptionCta", "sweepFullAgreement", "disclaimerMarkdown", "ctaText", "disableSparkleButtonStyling", "", "forceDarkMode", "backupPaymentInstrument", "Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getGoldTitle", "getGoldDescriptionMarkdown", "getGoldDescriptionCta", "getGoldFullAgreement", "()Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "getSweepTitle", "getSweepDescriptionMarkdown", "getSweepDescriptionCta", "getSweepFullAgreement", "getDisclaimerMarkdown", "getCtaText", "getDisableSparkleButtonStyling", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getForceDarkMode", "getBackupPaymentInstrument", "()Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;)Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldSweepAgreements implements Parcelable {
        public static final Parcelable.Creator<ApiGoldSweepAgreements> CREATOR = new Creator();
        private final ApiGoldPaymentInstrument backupPaymentInstrument;
        private final String ctaText;
        private final String description;
        private final Boolean disableSparkleButtonStyling;
        private final String disclaimerMarkdown;
        private final Boolean forceDarkMode;
        private final String goldDescriptionCta;
        private final String goldDescriptionMarkdown;
        private final ApiGoldSweepAgreement goldFullAgreement;
        private final String goldTitle;
        private final String sweepDescriptionCta;
        private final String sweepDescriptionMarkdown;
        private final ApiGoldSweepAgreement sweepFullAgreement;
        private final String sweepTitle;
        private final String title;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldSweepAgreements> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldSweepAgreements createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ApiGoldSweepAgreement apiGoldSweepAgreement = (ApiGoldSweepAgreement) parcel.readParcelable(ApiGoldSweepAgreements.class.getClassLoader());
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                ApiGoldSweepAgreement apiGoldSweepAgreement2 = (ApiGoldSweepAgreement) parcel.readParcelable(ApiGoldSweepAgreements.class.getClassLoader());
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ApiGoldSweepAgreements(string2, string3, string4, string5, string6, apiGoldSweepAgreement, string7, string8, string9, apiGoldSweepAgreement2, string10, string11, boolValueOf, boolValueOf2, (ApiGoldPaymentInstrument) parcel.readParcelable(ApiGoldSweepAgreements.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldSweepAgreements[] newArray(int i) {
                return new ApiGoldSweepAgreements[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final ApiGoldSweepAgreement getSweepFullAgreement() {
            return this.sweepFullAgreement;
        }

        /* renamed from: component11, reason: from getter */
        public final String getDisclaimerMarkdown() {
            return this.disclaimerMarkdown;
        }

        /* renamed from: component12, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component13, reason: from getter */
        public final Boolean getDisableSparkleButtonStyling() {
            return this.disableSparkleButtonStyling;
        }

        /* renamed from: component14, reason: from getter */
        public final Boolean getForceDarkMode() {
            return this.forceDarkMode;
        }

        /* renamed from: component15, reason: from getter */
        public final ApiGoldPaymentInstrument getBackupPaymentInstrument() {
            return this.backupPaymentInstrument;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getGoldTitle() {
            return this.goldTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getGoldDescriptionMarkdown() {
            return this.goldDescriptionMarkdown;
        }

        /* renamed from: component5, reason: from getter */
        public final String getGoldDescriptionCta() {
            return this.goldDescriptionCta;
        }

        /* renamed from: component6, reason: from getter */
        public final ApiGoldSweepAgreement getGoldFullAgreement() {
            return this.goldFullAgreement;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSweepTitle() {
            return this.sweepTitle;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSweepDescriptionMarkdown() {
            return this.sweepDescriptionMarkdown;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSweepDescriptionCta() {
            return this.sweepDescriptionCta;
        }

        public final ApiGoldSweepAgreements copy(String title, String description, String goldTitle, String goldDescriptionMarkdown, String goldDescriptionCta, ApiGoldSweepAgreement goldFullAgreement, String sweepTitle, String sweepDescriptionMarkdown, String sweepDescriptionCta, ApiGoldSweepAgreement sweepFullAgreement, String disclaimerMarkdown, String ctaText, Boolean disableSparkleButtonStyling, Boolean forceDarkMode, ApiGoldPaymentInstrument backupPaymentInstrument) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(goldTitle, "goldTitle");
            Intrinsics.checkNotNullParameter(goldDescriptionMarkdown, "goldDescriptionMarkdown");
            Intrinsics.checkNotNullParameter(goldFullAgreement, "goldFullAgreement");
            Intrinsics.checkNotNullParameter(sweepTitle, "sweepTitle");
            Intrinsics.checkNotNullParameter(sweepDescriptionMarkdown, "sweepDescriptionMarkdown");
            Intrinsics.checkNotNullParameter(sweepFullAgreement, "sweepFullAgreement");
            Intrinsics.checkNotNullParameter(disclaimerMarkdown, "disclaimerMarkdown");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            return new ApiGoldSweepAgreements(title, description, goldTitle, goldDescriptionMarkdown, goldDescriptionCta, goldFullAgreement, sweepTitle, sweepDescriptionMarkdown, sweepDescriptionCta, sweepFullAgreement, disclaimerMarkdown, ctaText, disableSparkleButtonStyling, forceDarkMode, backupPaymentInstrument);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldSweepAgreements)) {
                return false;
            }
            ApiGoldSweepAgreements apiGoldSweepAgreements = (ApiGoldSweepAgreements) other;
            return Intrinsics.areEqual(this.title, apiGoldSweepAgreements.title) && Intrinsics.areEqual(this.description, apiGoldSweepAgreements.description) && Intrinsics.areEqual(this.goldTitle, apiGoldSweepAgreements.goldTitle) && Intrinsics.areEqual(this.goldDescriptionMarkdown, apiGoldSweepAgreements.goldDescriptionMarkdown) && Intrinsics.areEqual(this.goldDescriptionCta, apiGoldSweepAgreements.goldDescriptionCta) && Intrinsics.areEqual(this.goldFullAgreement, apiGoldSweepAgreements.goldFullAgreement) && Intrinsics.areEqual(this.sweepTitle, apiGoldSweepAgreements.sweepTitle) && Intrinsics.areEqual(this.sweepDescriptionMarkdown, apiGoldSweepAgreements.sweepDescriptionMarkdown) && Intrinsics.areEqual(this.sweepDescriptionCta, apiGoldSweepAgreements.sweepDescriptionCta) && Intrinsics.areEqual(this.sweepFullAgreement, apiGoldSweepAgreements.sweepFullAgreement) && Intrinsics.areEqual(this.disclaimerMarkdown, apiGoldSweepAgreements.disclaimerMarkdown) && Intrinsics.areEqual(this.ctaText, apiGoldSweepAgreements.ctaText) && Intrinsics.areEqual(this.disableSparkleButtonStyling, apiGoldSweepAgreements.disableSparkleButtonStyling) && Intrinsics.areEqual(this.forceDarkMode, apiGoldSweepAgreements.forceDarkMode) && Intrinsics.areEqual(this.backupPaymentInstrument, apiGoldSweepAgreements.backupPaymentInstrument);
        }

        public int hashCode() {
            int iHashCode = ((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.goldTitle.hashCode()) * 31) + this.goldDescriptionMarkdown.hashCode()) * 31;
            String str = this.goldDescriptionCta;
            int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.goldFullAgreement.hashCode()) * 31) + this.sweepTitle.hashCode()) * 31) + this.sweepDescriptionMarkdown.hashCode()) * 31;
            String str2 = this.sweepDescriptionCta;
            int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.sweepFullAgreement.hashCode()) * 31) + this.disclaimerMarkdown.hashCode()) * 31) + this.ctaText.hashCode()) * 31;
            Boolean bool = this.disableSparkleButtonStyling;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.forceDarkMode;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            ApiGoldPaymentInstrument apiGoldPaymentInstrument = this.backupPaymentInstrument;
            return iHashCode5 + (apiGoldPaymentInstrument != null ? apiGoldPaymentInstrument.hashCode() : 0);
        }

        public String toString() {
            return "ApiGoldSweepAgreements(title=" + this.title + ", description=" + this.description + ", goldTitle=" + this.goldTitle + ", goldDescriptionMarkdown=" + this.goldDescriptionMarkdown + ", goldDescriptionCta=" + this.goldDescriptionCta + ", goldFullAgreement=" + this.goldFullAgreement + ", sweepTitle=" + this.sweepTitle + ", sweepDescriptionMarkdown=" + this.sweepDescriptionMarkdown + ", sweepDescriptionCta=" + this.sweepDescriptionCta + ", sweepFullAgreement=" + this.sweepFullAgreement + ", disclaimerMarkdown=" + this.disclaimerMarkdown + ", ctaText=" + this.ctaText + ", disableSparkleButtonStyling=" + this.disableSparkleButtonStyling + ", forceDarkMode=" + this.forceDarkMode + ", backupPaymentInstrument=" + this.backupPaymentInstrument + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.goldTitle);
            dest.writeString(this.goldDescriptionMarkdown);
            dest.writeString(this.goldDescriptionCta);
            dest.writeParcelable(this.goldFullAgreement, flags);
            dest.writeString(this.sweepTitle);
            dest.writeString(this.sweepDescriptionMarkdown);
            dest.writeString(this.sweepDescriptionCta);
            dest.writeParcelable(this.sweepFullAgreement, flags);
            dest.writeString(this.disclaimerMarkdown);
            dest.writeString(this.ctaText);
            Boolean bool = this.disableSparkleButtonStyling;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.forceDarkMode;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            dest.writeParcelable(this.backupPaymentInstrument, flags);
        }

        public ApiGoldSweepAgreements(String title, String description, String goldTitle, String goldDescriptionMarkdown, String str, ApiGoldSweepAgreement goldFullAgreement, String sweepTitle, String sweepDescriptionMarkdown, String str2, ApiGoldSweepAgreement sweepFullAgreement, String disclaimerMarkdown, String ctaText, Boolean bool, Boolean bool2, ApiGoldPaymentInstrument apiGoldPaymentInstrument) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(goldTitle, "goldTitle");
            Intrinsics.checkNotNullParameter(goldDescriptionMarkdown, "goldDescriptionMarkdown");
            Intrinsics.checkNotNullParameter(goldFullAgreement, "goldFullAgreement");
            Intrinsics.checkNotNullParameter(sweepTitle, "sweepTitle");
            Intrinsics.checkNotNullParameter(sweepDescriptionMarkdown, "sweepDescriptionMarkdown");
            Intrinsics.checkNotNullParameter(sweepFullAgreement, "sweepFullAgreement");
            Intrinsics.checkNotNullParameter(disclaimerMarkdown, "disclaimerMarkdown");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            this.title = title;
            this.description = description;
            this.goldTitle = goldTitle;
            this.goldDescriptionMarkdown = goldDescriptionMarkdown;
            this.goldDescriptionCta = str;
            this.goldFullAgreement = goldFullAgreement;
            this.sweepTitle = sweepTitle;
            this.sweepDescriptionMarkdown = sweepDescriptionMarkdown;
            this.sweepDescriptionCta = str2;
            this.sweepFullAgreement = sweepFullAgreement;
            this.disclaimerMarkdown = disclaimerMarkdown;
            this.ctaText = ctaText;
            this.disableSparkleButtonStyling = bool;
            this.forceDarkMode = bool2;
            this.backupPaymentInstrument = apiGoldPaymentInstrument;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getGoldTitle() {
            return this.goldTitle;
        }

        public final String getGoldDescriptionMarkdown() {
            return this.goldDescriptionMarkdown;
        }

        public final String getGoldDescriptionCta() {
            return this.goldDescriptionCta;
        }

        public final ApiGoldSweepAgreement getGoldFullAgreement() {
            return this.goldFullAgreement;
        }

        public final String getSweepTitle() {
            return this.sweepTitle;
        }

        public final String getSweepDescriptionMarkdown() {
            return this.sweepDescriptionMarkdown;
        }

        public final String getSweepDescriptionCta() {
            return this.sweepDescriptionCta;
        }

        public final ApiGoldSweepAgreement getSweepFullAgreement() {
            return this.sweepFullAgreement;
        }

        public final String getDisclaimerMarkdown() {
            return this.disclaimerMarkdown;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public final Boolean getDisableSparkleButtonStyling() {
            return this.disableSparkleButtonStyling;
        }

        public final Boolean getForceDarkMode() {
            return this.forceDarkMode;
        }

        public final ApiGoldPaymentInstrument getBackupPaymentInstrument() {
            return this.backupPaymentInstrument;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002IJB\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0015\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010)J´\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010<J\u0006\u0010=\u001a\u00020>J\u0013\u0010?\u001a\u00020\u00132\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020>HÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020>R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010*\u001a\u0004\b,\u0010)¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements;", "Landroid/os/Parcelable;", "title", "", "description", "goldTitle", "goldDescriptionMarkdown", "goldDescriptionCta", "goldFullAgreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "goldSweepConfig", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements$ApiGoldSweepConfig;", "moreFeaturesTitle", "goldSlipConfig", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements$ApiGoldSlipConfig;", "dynamicDisclaimerMarkdowns", "", "ctaText", "disableSparkleButtonStyling", "", "secondaryCtaText", "forceDarkMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements$ApiGoldSweepConfig;Ljava/lang/String;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements$ApiGoldSlipConfig;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getGoldTitle", "getGoldDescriptionMarkdown", "getGoldDescriptionCta", "getGoldFullAgreement", "()Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "getGoldSweepConfig", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements$ApiGoldSweepConfig;", "getMoreFeaturesTitle", "getGoldSlipConfig", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements$ApiGoldSlipConfig;", "getDynamicDisclaimerMarkdowns", "()Ljava/util/Map;", "getCtaText", "getDisableSparkleButtonStyling", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSecondaryCtaText", "getForceDarkMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements$ApiGoldSweepConfig;Ljava/lang/String;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements$ApiGoldSlipConfig;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ApiGoldSweepConfig", "ApiGoldSlipConfig", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldExtraAgreements implements Parcelable {
        public static final Parcelable.Creator<ApiGoldExtraAgreements> CREATOR = new Creator();
        private final String ctaText;
        private final String description;
        private final Boolean disableSparkleButtonStyling;
        private final Map<String, String> dynamicDisclaimerMarkdowns;
        private final Boolean forceDarkMode;
        private final String goldDescriptionCta;
        private final String goldDescriptionMarkdown;
        private final ApiGoldSweepAgreement goldFullAgreement;
        private final ApiGoldSlipConfig goldSlipConfig;
        private final ApiGoldSweepConfig goldSweepConfig;
        private final String goldTitle;
        private final String moreFeaturesTitle;
        private final String secondaryCtaText;
        private final String title;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldExtraAgreements> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldExtraAgreements createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ApiGoldSweepAgreement apiGoldSweepAgreement = (ApiGoldSweepAgreement) parcel.readParcelable(ApiGoldExtraAgreements.class.getClassLoader());
                ApiGoldSweepConfig apiGoldSweepConfigCreateFromParcel = parcel.readInt() == 0 ? null : ApiGoldSweepConfig.CREATOR.createFromParcel(parcel);
                String string7 = parcel.readString();
                ApiGoldSlipConfig apiGoldSlipConfigCreateFromParcel = parcel.readInt() == 0 ? null : ApiGoldSlipConfig.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new ApiGoldExtraAgreements(string2, string3, string4, string5, string6, apiGoldSweepAgreement, apiGoldSweepConfigCreateFromParcel, string7, apiGoldSlipConfigCreateFromParcel, linkedHashMap, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldExtraAgreements[] newArray(int i) {
                return new ApiGoldExtraAgreements[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, String> component10() {
            return this.dynamicDisclaimerMarkdowns;
        }

        /* renamed from: component11, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component12, reason: from getter */
        public final Boolean getDisableSparkleButtonStyling() {
            return this.disableSparkleButtonStyling;
        }

        /* renamed from: component13, reason: from getter */
        public final String getSecondaryCtaText() {
            return this.secondaryCtaText;
        }

        /* renamed from: component14, reason: from getter */
        public final Boolean getForceDarkMode() {
            return this.forceDarkMode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getGoldTitle() {
            return this.goldTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getGoldDescriptionMarkdown() {
            return this.goldDescriptionMarkdown;
        }

        /* renamed from: component5, reason: from getter */
        public final String getGoldDescriptionCta() {
            return this.goldDescriptionCta;
        }

        /* renamed from: component6, reason: from getter */
        public final ApiGoldSweepAgreement getGoldFullAgreement() {
            return this.goldFullAgreement;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiGoldSweepConfig getGoldSweepConfig() {
            return this.goldSweepConfig;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMoreFeaturesTitle() {
            return this.moreFeaturesTitle;
        }

        /* renamed from: component9, reason: from getter */
        public final ApiGoldSlipConfig getGoldSlipConfig() {
            return this.goldSlipConfig;
        }

        public final ApiGoldExtraAgreements copy(String title, String description, String goldTitle, String goldDescriptionMarkdown, String goldDescriptionCta, ApiGoldSweepAgreement goldFullAgreement, ApiGoldSweepConfig goldSweepConfig, String moreFeaturesTitle, ApiGoldSlipConfig goldSlipConfig, Map<String, String> dynamicDisclaimerMarkdowns, String ctaText, Boolean disableSparkleButtonStyling, String secondaryCtaText, Boolean forceDarkMode) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(goldTitle, "goldTitle");
            Intrinsics.checkNotNullParameter(goldDescriptionMarkdown, "goldDescriptionMarkdown");
            Intrinsics.checkNotNullParameter(goldFullAgreement, "goldFullAgreement");
            Intrinsics.checkNotNullParameter(dynamicDisclaimerMarkdowns, "dynamicDisclaimerMarkdowns");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            return new ApiGoldExtraAgreements(title, description, goldTitle, goldDescriptionMarkdown, goldDescriptionCta, goldFullAgreement, goldSweepConfig, moreFeaturesTitle, goldSlipConfig, dynamicDisclaimerMarkdowns, ctaText, disableSparkleButtonStyling, secondaryCtaText, forceDarkMode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldExtraAgreements)) {
                return false;
            }
            ApiGoldExtraAgreements apiGoldExtraAgreements = (ApiGoldExtraAgreements) other;
            return Intrinsics.areEqual(this.title, apiGoldExtraAgreements.title) && Intrinsics.areEqual(this.description, apiGoldExtraAgreements.description) && Intrinsics.areEqual(this.goldTitle, apiGoldExtraAgreements.goldTitle) && Intrinsics.areEqual(this.goldDescriptionMarkdown, apiGoldExtraAgreements.goldDescriptionMarkdown) && Intrinsics.areEqual(this.goldDescriptionCta, apiGoldExtraAgreements.goldDescriptionCta) && Intrinsics.areEqual(this.goldFullAgreement, apiGoldExtraAgreements.goldFullAgreement) && Intrinsics.areEqual(this.goldSweepConfig, apiGoldExtraAgreements.goldSweepConfig) && Intrinsics.areEqual(this.moreFeaturesTitle, apiGoldExtraAgreements.moreFeaturesTitle) && Intrinsics.areEqual(this.goldSlipConfig, apiGoldExtraAgreements.goldSlipConfig) && Intrinsics.areEqual(this.dynamicDisclaimerMarkdowns, apiGoldExtraAgreements.dynamicDisclaimerMarkdowns) && Intrinsics.areEqual(this.ctaText, apiGoldExtraAgreements.ctaText) && Intrinsics.areEqual(this.disableSparkleButtonStyling, apiGoldExtraAgreements.disableSparkleButtonStyling) && Intrinsics.areEqual(this.secondaryCtaText, apiGoldExtraAgreements.secondaryCtaText) && Intrinsics.areEqual(this.forceDarkMode, apiGoldExtraAgreements.forceDarkMode);
        }

        public int hashCode() {
            int iHashCode = ((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.goldTitle.hashCode()) * 31) + this.goldDescriptionMarkdown.hashCode()) * 31;
            String str = this.goldDescriptionCta;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.goldFullAgreement.hashCode()) * 31;
            ApiGoldSweepConfig apiGoldSweepConfig = this.goldSweepConfig;
            int iHashCode3 = (iHashCode2 + (apiGoldSweepConfig == null ? 0 : apiGoldSweepConfig.hashCode())) * 31;
            String str2 = this.moreFeaturesTitle;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ApiGoldSlipConfig apiGoldSlipConfig = this.goldSlipConfig;
            int iHashCode5 = (((((iHashCode4 + (apiGoldSlipConfig == null ? 0 : apiGoldSlipConfig.hashCode())) * 31) + this.dynamicDisclaimerMarkdowns.hashCode()) * 31) + this.ctaText.hashCode()) * 31;
            Boolean bool = this.disableSparkleButtonStyling;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.secondaryCtaText;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool2 = this.forceDarkMode;
            return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "ApiGoldExtraAgreements(title=" + this.title + ", description=" + this.description + ", goldTitle=" + this.goldTitle + ", goldDescriptionMarkdown=" + this.goldDescriptionMarkdown + ", goldDescriptionCta=" + this.goldDescriptionCta + ", goldFullAgreement=" + this.goldFullAgreement + ", goldSweepConfig=" + this.goldSweepConfig + ", moreFeaturesTitle=" + this.moreFeaturesTitle + ", goldSlipConfig=" + this.goldSlipConfig + ", dynamicDisclaimerMarkdowns=" + this.dynamicDisclaimerMarkdowns + ", ctaText=" + this.ctaText + ", disableSparkleButtonStyling=" + this.disableSparkleButtonStyling + ", secondaryCtaText=" + this.secondaryCtaText + ", forceDarkMode=" + this.forceDarkMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.goldTitle);
            dest.writeString(this.goldDescriptionMarkdown);
            dest.writeString(this.goldDescriptionCta);
            dest.writeParcelable(this.goldFullAgreement, flags);
            ApiGoldSweepConfig apiGoldSweepConfig = this.goldSweepConfig;
            if (apiGoldSweepConfig == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGoldSweepConfig.writeToParcel(dest, flags);
            }
            dest.writeString(this.moreFeaturesTitle);
            ApiGoldSlipConfig apiGoldSlipConfig = this.goldSlipConfig;
            if (apiGoldSlipConfig == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGoldSlipConfig.writeToParcel(dest, flags);
            }
            Map<String, String> map = this.dynamicDisclaimerMarkdowns;
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
            dest.writeString(this.ctaText);
            Boolean bool = this.disableSparkleButtonStyling;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.secondaryCtaText);
            Boolean bool2 = this.forceDarkMode;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
        }

        public ApiGoldExtraAgreements(String title, String description, String goldTitle, String goldDescriptionMarkdown, String str, ApiGoldSweepAgreement goldFullAgreement, ApiGoldSweepConfig apiGoldSweepConfig, String str2, ApiGoldSlipConfig apiGoldSlipConfig, Map<String, String> dynamicDisclaimerMarkdowns, String ctaText, Boolean bool, String str3, Boolean bool2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(goldTitle, "goldTitle");
            Intrinsics.checkNotNullParameter(goldDescriptionMarkdown, "goldDescriptionMarkdown");
            Intrinsics.checkNotNullParameter(goldFullAgreement, "goldFullAgreement");
            Intrinsics.checkNotNullParameter(dynamicDisclaimerMarkdowns, "dynamicDisclaimerMarkdowns");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            this.title = title;
            this.description = description;
            this.goldTitle = goldTitle;
            this.goldDescriptionMarkdown = goldDescriptionMarkdown;
            this.goldDescriptionCta = str;
            this.goldFullAgreement = goldFullAgreement;
            this.goldSweepConfig = apiGoldSweepConfig;
            this.moreFeaturesTitle = str2;
            this.goldSlipConfig = apiGoldSlipConfig;
            this.dynamicDisclaimerMarkdowns = dynamicDisclaimerMarkdowns;
            this.ctaText = ctaText;
            this.disableSparkleButtonStyling = bool;
            this.secondaryCtaText = str3;
            this.forceDarkMode = bool2;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getGoldTitle() {
            return this.goldTitle;
        }

        public final String getGoldDescriptionMarkdown() {
            return this.goldDescriptionMarkdown;
        }

        public final String getGoldDescriptionCta() {
            return this.goldDescriptionCta;
        }

        public final ApiGoldSweepAgreement getGoldFullAgreement() {
            return this.goldFullAgreement;
        }

        public final ApiGoldSweepConfig getGoldSweepConfig() {
            return this.goldSweepConfig;
        }

        public final String getMoreFeaturesTitle() {
            return this.moreFeaturesTitle;
        }

        public final ApiGoldSlipConfig getGoldSlipConfig() {
            return this.goldSlipConfig;
        }

        public final Map<String, String> getDynamicDisclaimerMarkdowns() {
            return this.dynamicDisclaimerMarkdowns;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public final Boolean getDisableSparkleButtonStyling() {
            return this.disableSparkleButtonStyling;
        }

        public final String getSecondaryCtaText() {
            return this.secondaryCtaText;
        }

        public final Boolean getForceDarkMode() {
            return this.forceDarkMode;
        }

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements$ApiGoldSweepConfig;", "Landroid/os/Parcelable;", "sweepTitle", "", "sweepDescriptionMarkdown", "sweepDescriptionCta", "sweepFullAgreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;)V", "getSweepTitle", "()Ljava/lang/String;", "getSweepDescriptionMarkdown", "getSweepDescriptionCta", "getSweepFullAgreement", "()Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ApiGoldSweepConfig implements Parcelable {
            public static final Parcelable.Creator<ApiGoldSweepConfig> CREATOR = new Creator();
            private final String sweepDescriptionCta;
            private final String sweepDescriptionMarkdown;
            private final ApiGoldSweepAgreement sweepFullAgreement;
            private final String sweepTitle;

            /* compiled from: ApiGoldUpgradeFlow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ApiGoldSweepConfig> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ApiGoldSweepConfig createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ApiGoldSweepConfig(parcel.readString(), parcel.readString(), parcel.readString(), (ApiGoldSweepAgreement) parcel.readParcelable(ApiGoldSweepConfig.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ApiGoldSweepConfig[] newArray(int i) {
                    return new ApiGoldSweepConfig[i];
                }
            }

            public static /* synthetic */ ApiGoldSweepConfig copy$default(ApiGoldSweepConfig apiGoldSweepConfig, String str, String str2, String str3, ApiGoldSweepAgreement apiGoldSweepAgreement, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = apiGoldSweepConfig.sweepTitle;
                }
                if ((i & 2) != 0) {
                    str2 = apiGoldSweepConfig.sweepDescriptionMarkdown;
                }
                if ((i & 4) != 0) {
                    str3 = apiGoldSweepConfig.sweepDescriptionCta;
                }
                if ((i & 8) != 0) {
                    apiGoldSweepAgreement = apiGoldSweepConfig.sweepFullAgreement;
                }
                return apiGoldSweepConfig.copy(str, str2, str3, apiGoldSweepAgreement);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSweepTitle() {
                return this.sweepTitle;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSweepDescriptionMarkdown() {
                return this.sweepDescriptionMarkdown;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSweepDescriptionCta() {
                return this.sweepDescriptionCta;
            }

            /* renamed from: component4, reason: from getter */
            public final ApiGoldSweepAgreement getSweepFullAgreement() {
                return this.sweepFullAgreement;
            }

            public final ApiGoldSweepConfig copy(String sweepTitle, String sweepDescriptionMarkdown, String sweepDescriptionCta, ApiGoldSweepAgreement sweepFullAgreement) {
                Intrinsics.checkNotNullParameter(sweepTitle, "sweepTitle");
                Intrinsics.checkNotNullParameter(sweepDescriptionMarkdown, "sweepDescriptionMarkdown");
                Intrinsics.checkNotNullParameter(sweepFullAgreement, "sweepFullAgreement");
                return new ApiGoldSweepConfig(sweepTitle, sweepDescriptionMarkdown, sweepDescriptionCta, sweepFullAgreement);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ApiGoldSweepConfig)) {
                    return false;
                }
                ApiGoldSweepConfig apiGoldSweepConfig = (ApiGoldSweepConfig) other;
                return Intrinsics.areEqual(this.sweepTitle, apiGoldSweepConfig.sweepTitle) && Intrinsics.areEqual(this.sweepDescriptionMarkdown, apiGoldSweepConfig.sweepDescriptionMarkdown) && Intrinsics.areEqual(this.sweepDescriptionCta, apiGoldSweepConfig.sweepDescriptionCta) && Intrinsics.areEqual(this.sweepFullAgreement, apiGoldSweepConfig.sweepFullAgreement);
            }

            public int hashCode() {
                int iHashCode = ((this.sweepTitle.hashCode() * 31) + this.sweepDescriptionMarkdown.hashCode()) * 31;
                String str = this.sweepDescriptionCta;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sweepFullAgreement.hashCode();
            }

            public String toString() {
                return "ApiGoldSweepConfig(sweepTitle=" + this.sweepTitle + ", sweepDescriptionMarkdown=" + this.sweepDescriptionMarkdown + ", sweepDescriptionCta=" + this.sweepDescriptionCta + ", sweepFullAgreement=" + this.sweepFullAgreement + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.sweepTitle);
                dest.writeString(this.sweepDescriptionMarkdown);
                dest.writeString(this.sweepDescriptionCta);
                dest.writeParcelable(this.sweepFullAgreement, flags);
            }

            public ApiGoldSweepConfig(String sweepTitle, String sweepDescriptionMarkdown, String str, ApiGoldSweepAgreement sweepFullAgreement) {
                Intrinsics.checkNotNullParameter(sweepTitle, "sweepTitle");
                Intrinsics.checkNotNullParameter(sweepDescriptionMarkdown, "sweepDescriptionMarkdown");
                Intrinsics.checkNotNullParameter(sweepFullAgreement, "sweepFullAgreement");
                this.sweepTitle = sweepTitle;
                this.sweepDescriptionMarkdown = sweepDescriptionMarkdown;
                this.sweepDescriptionCta = str;
                this.sweepFullAgreement = sweepFullAgreement;
            }

            public final String getSweepTitle() {
                return this.sweepTitle;
            }

            public final String getSweepDescriptionMarkdown() {
                return this.sweepDescriptionMarkdown;
            }

            public final String getSweepDescriptionCta() {
                return this.sweepDescriptionCta;
            }

            public final ApiGoldSweepAgreement getSweepFullAgreement() {
                return this.sweepFullAgreement;
            }
        }

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements$ApiGoldSlipConfig;", "Landroid/os/Parcelable;", "slipTitle", "", "slipDescriptionMarkdown", "slipDescriptionCtaMarkdown", "slipFullAgreements", "", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "checkedByDefault", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getSlipTitle", "()Ljava/lang/String;", "getSlipDescriptionMarkdown", "getSlipDescriptionCtaMarkdown", "getSlipFullAgreements", "()Ljava/util/List;", "getCheckedByDefault", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ApiGoldSlipConfig implements Parcelable {
            public static final Parcelable.Creator<ApiGoldSlipConfig> CREATOR = new Creator();
            private final boolean checkedByDefault;
            private final String slipDescriptionCtaMarkdown;
            private final String slipDescriptionMarkdown;
            private final List<ApiGoldSweepAgreement> slipFullAgreements;
            private final String slipTitle;

            /* compiled from: ApiGoldUpgradeFlow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ApiGoldSlipConfig> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ApiGoldSlipConfig createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(ApiGoldSlipConfig.class.getClassLoader()));
                    }
                    return new ApiGoldSlipConfig(string2, string3, string4, arrayList, parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ApiGoldSlipConfig[] newArray(int i) {
                    return new ApiGoldSlipConfig[i];
                }
            }

            public static /* synthetic */ ApiGoldSlipConfig copy$default(ApiGoldSlipConfig apiGoldSlipConfig, String str, String str2, String str3, List list, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = apiGoldSlipConfig.slipTitle;
                }
                if ((i & 2) != 0) {
                    str2 = apiGoldSlipConfig.slipDescriptionMarkdown;
                }
                if ((i & 4) != 0) {
                    str3 = apiGoldSlipConfig.slipDescriptionCtaMarkdown;
                }
                if ((i & 8) != 0) {
                    list = apiGoldSlipConfig.slipFullAgreements;
                }
                if ((i & 16) != 0) {
                    z = apiGoldSlipConfig.checkedByDefault;
                }
                boolean z2 = z;
                String str4 = str3;
                return apiGoldSlipConfig.copy(str, str2, str4, list, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSlipTitle() {
                return this.slipTitle;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSlipDescriptionMarkdown() {
                return this.slipDescriptionMarkdown;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSlipDescriptionCtaMarkdown() {
                return this.slipDescriptionCtaMarkdown;
            }

            public final List<ApiGoldSweepAgreement> component4() {
                return this.slipFullAgreements;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getCheckedByDefault() {
                return this.checkedByDefault;
            }

            public final ApiGoldSlipConfig copy(String slipTitle, String slipDescriptionMarkdown, String slipDescriptionCtaMarkdown, List<ApiGoldSweepAgreement> slipFullAgreements, boolean checkedByDefault) {
                Intrinsics.checkNotNullParameter(slipTitle, "slipTitle");
                Intrinsics.checkNotNullParameter(slipDescriptionMarkdown, "slipDescriptionMarkdown");
                Intrinsics.checkNotNullParameter(slipDescriptionCtaMarkdown, "slipDescriptionCtaMarkdown");
                Intrinsics.checkNotNullParameter(slipFullAgreements, "slipFullAgreements");
                return new ApiGoldSlipConfig(slipTitle, slipDescriptionMarkdown, slipDescriptionCtaMarkdown, slipFullAgreements, checkedByDefault);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ApiGoldSlipConfig)) {
                    return false;
                }
                ApiGoldSlipConfig apiGoldSlipConfig = (ApiGoldSlipConfig) other;
                return Intrinsics.areEqual(this.slipTitle, apiGoldSlipConfig.slipTitle) && Intrinsics.areEqual(this.slipDescriptionMarkdown, apiGoldSlipConfig.slipDescriptionMarkdown) && Intrinsics.areEqual(this.slipDescriptionCtaMarkdown, apiGoldSlipConfig.slipDescriptionCtaMarkdown) && Intrinsics.areEqual(this.slipFullAgreements, apiGoldSlipConfig.slipFullAgreements) && this.checkedByDefault == apiGoldSlipConfig.checkedByDefault;
            }

            public int hashCode() {
                return (((((((this.slipTitle.hashCode() * 31) + this.slipDescriptionMarkdown.hashCode()) * 31) + this.slipDescriptionCtaMarkdown.hashCode()) * 31) + this.slipFullAgreements.hashCode()) * 31) + Boolean.hashCode(this.checkedByDefault);
            }

            public String toString() {
                return "ApiGoldSlipConfig(slipTitle=" + this.slipTitle + ", slipDescriptionMarkdown=" + this.slipDescriptionMarkdown + ", slipDescriptionCtaMarkdown=" + this.slipDescriptionCtaMarkdown + ", slipFullAgreements=" + this.slipFullAgreements + ", checkedByDefault=" + this.checkedByDefault + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.slipTitle);
                dest.writeString(this.slipDescriptionMarkdown);
                dest.writeString(this.slipDescriptionCtaMarkdown);
                List<ApiGoldSweepAgreement> list = this.slipFullAgreements;
                dest.writeInt(list.size());
                Iterator<ApiGoldSweepAgreement> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeInt(this.checkedByDefault ? 1 : 0);
            }

            public ApiGoldSlipConfig(String slipTitle, String slipDescriptionMarkdown, String slipDescriptionCtaMarkdown, List<ApiGoldSweepAgreement> slipFullAgreements, boolean z) {
                Intrinsics.checkNotNullParameter(slipTitle, "slipTitle");
                Intrinsics.checkNotNullParameter(slipDescriptionMarkdown, "slipDescriptionMarkdown");
                Intrinsics.checkNotNullParameter(slipDescriptionCtaMarkdown, "slipDescriptionCtaMarkdown");
                Intrinsics.checkNotNullParameter(slipFullAgreements, "slipFullAgreements");
                this.slipTitle = slipTitle;
                this.slipDescriptionMarkdown = slipDescriptionMarkdown;
                this.slipDescriptionCtaMarkdown = slipDescriptionCtaMarkdown;
                this.slipFullAgreements = slipFullAgreements;
                this.checkedByDefault = z;
            }

            public final String getSlipTitle() {
                return this.slipTitle;
            }

            public final String getSlipDescriptionMarkdown() {
                return this.slipDescriptionMarkdown;
            }

            public final String getSlipDescriptionCtaMarkdown() {
                return this.slipDescriptionCtaMarkdown;
            }

            public final List<ApiGoldSweepAgreement> getSlipFullAgreements() {
                return this.slipFullAgreements;
            }

            public final boolean getCheckedByDefault() {
                return this.checkedByDefault;
            }
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldWelcome;", "Landroid/os/Parcelable;", "lottieAnimationPath", "", "title", "description", "primaryButtonText", "primaryButtonAction", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "secondaryButtonText", "secondaryButtonAction", "imagePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;Ljava/lang/String;)V", "getLottieAnimationPath", "()Ljava/lang/String;", "getTitle", "getDescription", "getPrimaryButtonText", "getPrimaryButtonAction", "()Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "getSecondaryButtonText", "getSecondaryButtonAction", "getImagePath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ApiGoldSweepUpsellCard", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldWelcome implements Parcelable {
        public static final Parcelable.Creator<ApiGoldWelcome> CREATOR = new Creator();
        private final String description;
        private final String imagePath;
        private final String lottieAnimationPath;
        private final DeeplinkAction primaryButtonAction;
        private final String primaryButtonText;
        private final DeeplinkAction secondaryButtonAction;
        private final String secondaryButtonText;
        private final String title;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldWelcome> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldWelcome createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiGoldWelcome(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeeplinkAction) parcel.readParcelable(ApiGoldWelcome.class.getClassLoader()), parcel.readString(), (DeeplinkAction) parcel.readParcelable(ApiGoldWelcome.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldWelcome[] newArray(int i) {
                return new ApiGoldWelcome[i];
            }
        }

        public static /* synthetic */ ApiGoldWelcome copy$default(ApiGoldWelcome apiGoldWelcome, String str, String str2, String str3, String str4, DeeplinkAction deeplinkAction, String str5, DeeplinkAction deeplinkAction2, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiGoldWelcome.lottieAnimationPath;
            }
            if ((i & 2) != 0) {
                str2 = apiGoldWelcome.title;
            }
            if ((i & 4) != 0) {
                str3 = apiGoldWelcome.description;
            }
            if ((i & 8) != 0) {
                str4 = apiGoldWelcome.primaryButtonText;
            }
            if ((i & 16) != 0) {
                deeplinkAction = apiGoldWelcome.primaryButtonAction;
            }
            if ((i & 32) != 0) {
                str5 = apiGoldWelcome.secondaryButtonText;
            }
            if ((i & 64) != 0) {
                deeplinkAction2 = apiGoldWelcome.secondaryButtonAction;
            }
            if ((i & 128) != 0) {
                str6 = apiGoldWelcome.imagePath;
            }
            DeeplinkAction deeplinkAction3 = deeplinkAction2;
            String str7 = str6;
            DeeplinkAction deeplinkAction4 = deeplinkAction;
            String str8 = str5;
            return apiGoldWelcome.copy(str, str2, str3, str4, deeplinkAction4, str8, deeplinkAction3, str7);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLottieAnimationPath() {
            return this.lottieAnimationPath;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* renamed from: component5, reason: from getter */
        public final DeeplinkAction getPrimaryButtonAction() {
            return this.primaryButtonAction;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* renamed from: component7, reason: from getter */
        public final DeeplinkAction getSecondaryButtonAction() {
            return this.secondaryButtonAction;
        }

        /* renamed from: component8, reason: from getter */
        public final String getImagePath() {
            return this.imagePath;
        }

        public final ApiGoldWelcome copy(String lottieAnimationPath, String title, String description, String primaryButtonText, DeeplinkAction primaryButtonAction, String secondaryButtonText, DeeplinkAction secondaryButtonAction, String imagePath) {
            Intrinsics.checkNotNullParameter(lottieAnimationPath, "lottieAnimationPath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
            return new ApiGoldWelcome(lottieAnimationPath, title, description, primaryButtonText, primaryButtonAction, secondaryButtonText, secondaryButtonAction, imagePath);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldWelcome)) {
                return false;
            }
            ApiGoldWelcome apiGoldWelcome = (ApiGoldWelcome) other;
            return Intrinsics.areEqual(this.lottieAnimationPath, apiGoldWelcome.lottieAnimationPath) && Intrinsics.areEqual(this.title, apiGoldWelcome.title) && Intrinsics.areEqual(this.description, apiGoldWelcome.description) && Intrinsics.areEqual(this.primaryButtonText, apiGoldWelcome.primaryButtonText) && Intrinsics.areEqual(this.primaryButtonAction, apiGoldWelcome.primaryButtonAction) && Intrinsics.areEqual(this.secondaryButtonText, apiGoldWelcome.secondaryButtonText) && Intrinsics.areEqual(this.secondaryButtonAction, apiGoldWelcome.secondaryButtonAction) && Intrinsics.areEqual(this.imagePath, apiGoldWelcome.imagePath);
        }

        public int hashCode() {
            int iHashCode = ((((((this.lottieAnimationPath.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.primaryButtonText.hashCode()) * 31;
            DeeplinkAction deeplinkAction = this.primaryButtonAction;
            int iHashCode2 = (((iHashCode + (deeplinkAction == null ? 0 : deeplinkAction.hashCode())) * 31) + this.secondaryButtonText.hashCode()) * 31;
            DeeplinkAction deeplinkAction2 = this.secondaryButtonAction;
            int iHashCode3 = (iHashCode2 + (deeplinkAction2 == null ? 0 : deeplinkAction2.hashCode())) * 31;
            String str = this.imagePath;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ApiGoldWelcome(lottieAnimationPath=" + this.lottieAnimationPath + ", title=" + this.title + ", description=" + this.description + ", primaryButtonText=" + this.primaryButtonText + ", primaryButtonAction=" + this.primaryButtonAction + ", secondaryButtonText=" + this.secondaryButtonText + ", secondaryButtonAction=" + this.secondaryButtonAction + ", imagePath=" + this.imagePath + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.lottieAnimationPath);
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.primaryButtonText);
            dest.writeParcelable(this.primaryButtonAction, flags);
            dest.writeString(this.secondaryButtonText);
            dest.writeParcelable(this.secondaryButtonAction, flags);
            dest.writeString(this.imagePath);
        }

        public ApiGoldWelcome(String lottieAnimationPath, String title, String description, String primaryButtonText, DeeplinkAction deeplinkAction, String secondaryButtonText, DeeplinkAction deeplinkAction2, String str) {
            Intrinsics.checkNotNullParameter(lottieAnimationPath, "lottieAnimationPath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
            this.lottieAnimationPath = lottieAnimationPath;
            this.title = title;
            this.description = description;
            this.primaryButtonText = primaryButtonText;
            this.primaryButtonAction = deeplinkAction;
            this.secondaryButtonText = secondaryButtonText;
            this.secondaryButtonAction = deeplinkAction2;
            this.imagePath = str;
        }

        public /* synthetic */ ApiGoldWelcome(String str, String str2, String str3, String str4, DeeplinkAction deeplinkAction, String str5, DeeplinkAction deeplinkAction2, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, deeplinkAction, str5, deeplinkAction2, (i & 128) != 0 ? null : str6);
        }

        public final String getLottieAnimationPath() {
            return this.lottieAnimationPath;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public final DeeplinkAction getPrimaryButtonAction() {
            return this.primaryButtonAction;
        }

        public final String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        public final DeeplinkAction getSecondaryButtonAction() {
            return this.secondaryButtonAction;
        }

        public final String getImagePath() {
            return this.imagePath;
        }

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldWelcome$ApiGoldSweepUpsellCard;", "Landroid/os/Parcelable;", "imagePath", "", "description", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/TextButton;)V", "getImagePath", "()Ljava/lang/String;", "getDescription", "getCta", "()Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ApiGoldSweepUpsellCard implements Parcelable {
            public static final Parcelable.Creator<ApiGoldSweepUpsellCard> CREATOR = new Creator();
            private final TextButton<DeeplinkAction> cta;
            private final String description;
            private final String imagePath;

            /* compiled from: ApiGoldUpgradeFlow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ApiGoldSweepUpsellCard> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ApiGoldSweepUpsellCard createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ApiGoldSweepUpsellCard(parcel.readString(), parcel.readString(), (TextButton) parcel.readParcelable(ApiGoldSweepUpsellCard.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ApiGoldSweepUpsellCard[] newArray(int i) {
                    return new ApiGoldSweepUpsellCard[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ApiGoldSweepUpsellCard copy$default(ApiGoldSweepUpsellCard apiGoldSweepUpsellCard, String str, String str2, TextButton textButton, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = apiGoldSweepUpsellCard.imagePath;
                }
                if ((i & 2) != 0) {
                    str2 = apiGoldSweepUpsellCard.description;
                }
                if ((i & 4) != 0) {
                    textButton = apiGoldSweepUpsellCard.cta;
                }
                return apiGoldSweepUpsellCard.copy(str, str2, textButton);
            }

            /* renamed from: component1, reason: from getter */
            public final String getImagePath() {
                return this.imagePath;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final TextButton<DeeplinkAction> component3() {
                return this.cta;
            }

            public final ApiGoldSweepUpsellCard copy(String imagePath, String description, TextButton<DeeplinkAction> cta) {
                Intrinsics.checkNotNullParameter(imagePath, "imagePath");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(cta, "cta");
                return new ApiGoldSweepUpsellCard(imagePath, description, cta);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ApiGoldSweepUpsellCard)) {
                    return false;
                }
                ApiGoldSweepUpsellCard apiGoldSweepUpsellCard = (ApiGoldSweepUpsellCard) other;
                return Intrinsics.areEqual(this.imagePath, apiGoldSweepUpsellCard.imagePath) && Intrinsics.areEqual(this.description, apiGoldSweepUpsellCard.description) && Intrinsics.areEqual(this.cta, apiGoldSweepUpsellCard.cta);
            }

            public int hashCode() {
                return (((this.imagePath.hashCode() * 31) + this.description.hashCode()) * 31) + this.cta.hashCode();
            }

            public String toString() {
                return "ApiGoldSweepUpsellCard(imagePath=" + this.imagePath + ", description=" + this.description + ", cta=" + this.cta + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.imagePath);
                dest.writeString(this.description);
                dest.writeParcelable(this.cta, flags);
            }

            public ApiGoldSweepUpsellCard(String imagePath, String description, TextButton<DeeplinkAction> cta) {
                Intrinsics.checkNotNullParameter(imagePath, "imagePath");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(cta, "cta");
                this.imagePath = imagePath;
                this.description = description;
                this.cta = cta;
            }

            public final String getImagePath() {
                return this.imagePath;
            }

            public final String getDescription() {
                return this.description;
            }

            public final TextButton<DeeplinkAction> getCta() {
                return this.cta;
            }
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;", "Landroid/os/Parcelable;", "imagePath", "", "title", "description", "ctaText", "ctaGenericAction", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "secondaryCtaText", "secondaryCtaGenericAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;)V", "getImagePath", "()Ljava/lang/String;", "getTitle", "getDescription", "getCtaText", "getCtaGenericAction", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getSecondaryCtaText", "getSecondaryCtaGenericAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldConfirmation implements Parcelable {
        public static final Parcelable.Creator<ApiGoldConfirmation> CREATOR = new Creator();
        private final GenericAction ctaGenericAction;
        private final String ctaText;
        private final String description;
        private final String imagePath;
        private final GenericAction secondaryCtaGenericAction;
        private final String secondaryCtaText;
        private final String title;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldConfirmation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldConfirmation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiGoldConfirmation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (GenericAction) parcel.readParcelable(ApiGoldConfirmation.class.getClassLoader()), parcel.readString(), (GenericAction) parcel.readParcelable(ApiGoldConfirmation.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldConfirmation[] newArray(int i) {
                return new ApiGoldConfirmation[i];
            }
        }

        public static /* synthetic */ ApiGoldConfirmation copy$default(ApiGoldConfirmation apiGoldConfirmation, String str, String str2, String str3, String str4, GenericAction genericAction, String str5, GenericAction genericAction2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiGoldConfirmation.imagePath;
            }
            if ((i & 2) != 0) {
                str2 = apiGoldConfirmation.title;
            }
            if ((i & 4) != 0) {
                str3 = apiGoldConfirmation.description;
            }
            if ((i & 8) != 0) {
                str4 = apiGoldConfirmation.ctaText;
            }
            if ((i & 16) != 0) {
                genericAction = apiGoldConfirmation.ctaGenericAction;
            }
            if ((i & 32) != 0) {
                str5 = apiGoldConfirmation.secondaryCtaText;
            }
            if ((i & 64) != 0) {
                genericAction2 = apiGoldConfirmation.secondaryCtaGenericAction;
            }
            String str6 = str5;
            GenericAction genericAction3 = genericAction2;
            GenericAction genericAction4 = genericAction;
            String str7 = str3;
            return apiGoldConfirmation.copy(str, str2, str7, str4, genericAction4, str6, genericAction3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component5, reason: from getter */
        public final GenericAction getCtaGenericAction() {
            return this.ctaGenericAction;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSecondaryCtaText() {
            return this.secondaryCtaText;
        }

        /* renamed from: component7, reason: from getter */
        public final GenericAction getSecondaryCtaGenericAction() {
            return this.secondaryCtaGenericAction;
        }

        public final ApiGoldConfirmation copy(String imagePath, String title, String description, String ctaText, GenericAction ctaGenericAction, String secondaryCtaText, GenericAction secondaryCtaGenericAction) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            return new ApiGoldConfirmation(imagePath, title, description, ctaText, ctaGenericAction, secondaryCtaText, secondaryCtaGenericAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldConfirmation)) {
                return false;
            }
            ApiGoldConfirmation apiGoldConfirmation = (ApiGoldConfirmation) other;
            return Intrinsics.areEqual(this.imagePath, apiGoldConfirmation.imagePath) && Intrinsics.areEqual(this.title, apiGoldConfirmation.title) && Intrinsics.areEqual(this.description, apiGoldConfirmation.description) && Intrinsics.areEqual(this.ctaText, apiGoldConfirmation.ctaText) && Intrinsics.areEqual(this.ctaGenericAction, apiGoldConfirmation.ctaGenericAction) && Intrinsics.areEqual(this.secondaryCtaText, apiGoldConfirmation.secondaryCtaText) && Intrinsics.areEqual(this.secondaryCtaGenericAction, apiGoldConfirmation.secondaryCtaGenericAction);
        }

        public int hashCode() {
            int iHashCode = ((((((this.imagePath.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.ctaText.hashCode()) * 31;
            GenericAction genericAction = this.ctaGenericAction;
            int iHashCode2 = (iHashCode + (genericAction == null ? 0 : genericAction.hashCode())) * 31;
            String str = this.secondaryCtaText;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            GenericAction genericAction2 = this.secondaryCtaGenericAction;
            return iHashCode3 + (genericAction2 != null ? genericAction2.hashCode() : 0);
        }

        public String toString() {
            return "ApiGoldConfirmation(imagePath=" + this.imagePath + ", title=" + this.title + ", description=" + this.description + ", ctaText=" + this.ctaText + ", ctaGenericAction=" + this.ctaGenericAction + ", secondaryCtaText=" + this.secondaryCtaText + ", secondaryCtaGenericAction=" + this.secondaryCtaGenericAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.imagePath);
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.ctaText);
            dest.writeParcelable(this.ctaGenericAction, flags);
            dest.writeString(this.secondaryCtaText);
            dest.writeParcelable(this.secondaryCtaGenericAction, flags);
        }

        public ApiGoldConfirmation(String imagePath, String title, String description, String ctaText, GenericAction genericAction, String str, GenericAction genericAction2) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            this.imagePath = imagePath;
            this.title = title;
            this.description = description;
            this.ctaText = ctaText;
            this.ctaGenericAction = genericAction;
            this.secondaryCtaText = str;
            this.secondaryCtaGenericAction = genericAction2;
        }

        public final String getImagePath() {
            return this.imagePath;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public final GenericAction getCtaGenericAction() {
            return this.ctaGenericAction;
        }

        public final String getSecondaryCtaText() {
            return this.secondaryCtaText;
        }

        public final GenericAction getSecondaryCtaGenericAction() {
            return this.secondaryCtaGenericAction;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jk\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSuggestedAction;", "Landroid/os/Parcelable;", "type", "", "imagePath", "title", "description", "primaryCtaText", "primaryCtaAction", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "secondaryCtaText", "secondaryCtaAction", "disclosureMarkdown", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getImagePath", "getTitle", "getDescription", "getPrimaryCtaText", "getPrimaryCtaAction", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getSecondaryCtaText", "getSecondaryCtaAction", "getDisclosureMarkdown", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldSuggestedAction implements Parcelable {
        public static final Parcelable.Creator<ApiGoldSuggestedAction> CREATOR = new Creator();
        private final String description;
        private final String disclosureMarkdown;
        private final String imagePath;
        private final GenericAction primaryCtaAction;
        private final String primaryCtaText;
        private final GenericAction secondaryCtaAction;
        private final String secondaryCtaText;
        private final String title;
        private final String type;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldSuggestedAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldSuggestedAction createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiGoldSuggestedAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (GenericAction) parcel.readParcelable(ApiGoldSuggestedAction.class.getClassLoader()), parcel.readString(), (GenericAction) parcel.readParcelable(ApiGoldSuggestedAction.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldSuggestedAction[] newArray(int i) {
                return new ApiGoldSuggestedAction[i];
            }
        }

        public static /* synthetic */ ApiGoldSuggestedAction copy$default(ApiGoldSuggestedAction apiGoldSuggestedAction, String str, String str2, String str3, String str4, String str5, GenericAction genericAction, String str6, GenericAction genericAction2, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiGoldSuggestedAction.type;
            }
            if ((i & 2) != 0) {
                str2 = apiGoldSuggestedAction.imagePath;
            }
            if ((i & 4) != 0) {
                str3 = apiGoldSuggestedAction.title;
            }
            if ((i & 8) != 0) {
                str4 = apiGoldSuggestedAction.description;
            }
            if ((i & 16) != 0) {
                str5 = apiGoldSuggestedAction.primaryCtaText;
            }
            if ((i & 32) != 0) {
                genericAction = apiGoldSuggestedAction.primaryCtaAction;
            }
            if ((i & 64) != 0) {
                str6 = apiGoldSuggestedAction.secondaryCtaText;
            }
            if ((i & 128) != 0) {
                genericAction2 = apiGoldSuggestedAction.secondaryCtaAction;
            }
            if ((i & 256) != 0) {
                str7 = apiGoldSuggestedAction.disclosureMarkdown;
            }
            GenericAction genericAction3 = genericAction2;
            String str8 = str7;
            GenericAction genericAction4 = genericAction;
            String str9 = str6;
            String str10 = str5;
            String str11 = str3;
            return apiGoldSuggestedAction.copy(str, str2, str11, str4, str10, genericAction4, str9, genericAction3, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPrimaryCtaText() {
            return this.primaryCtaText;
        }

        /* renamed from: component6, reason: from getter */
        public final GenericAction getPrimaryCtaAction() {
            return this.primaryCtaAction;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSecondaryCtaText() {
            return this.secondaryCtaText;
        }

        /* renamed from: component8, reason: from getter */
        public final GenericAction getSecondaryCtaAction() {
            return this.secondaryCtaAction;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final ApiGoldSuggestedAction copy(String type2, String imagePath, String title, String description, String primaryCtaText, GenericAction primaryCtaAction, String secondaryCtaText, GenericAction secondaryCtaAction, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
            Intrinsics.checkNotNullParameter(secondaryCtaText, "secondaryCtaText");
            return new ApiGoldSuggestedAction(type2, imagePath, title, description, primaryCtaText, primaryCtaAction, secondaryCtaText, secondaryCtaAction, disclosureMarkdown);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldSuggestedAction)) {
                return false;
            }
            ApiGoldSuggestedAction apiGoldSuggestedAction = (ApiGoldSuggestedAction) other;
            return Intrinsics.areEqual(this.type, apiGoldSuggestedAction.type) && Intrinsics.areEqual(this.imagePath, apiGoldSuggestedAction.imagePath) && Intrinsics.areEqual(this.title, apiGoldSuggestedAction.title) && Intrinsics.areEqual(this.description, apiGoldSuggestedAction.description) && Intrinsics.areEqual(this.primaryCtaText, apiGoldSuggestedAction.primaryCtaText) && Intrinsics.areEqual(this.primaryCtaAction, apiGoldSuggestedAction.primaryCtaAction) && Intrinsics.areEqual(this.secondaryCtaText, apiGoldSuggestedAction.secondaryCtaText) && Intrinsics.areEqual(this.secondaryCtaAction, apiGoldSuggestedAction.secondaryCtaAction) && Intrinsics.areEqual(this.disclosureMarkdown, apiGoldSuggestedAction.disclosureMarkdown);
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.imagePath.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.primaryCtaText.hashCode()) * 31;
            GenericAction genericAction = this.primaryCtaAction;
            int iHashCode2 = (((iHashCode + (genericAction == null ? 0 : genericAction.hashCode())) * 31) + this.secondaryCtaText.hashCode()) * 31;
            GenericAction genericAction2 = this.secondaryCtaAction;
            int iHashCode3 = (iHashCode2 + (genericAction2 == null ? 0 : genericAction2.hashCode())) * 31;
            String str2 = this.disclosureMarkdown;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ApiGoldSuggestedAction(type=" + this.type + ", imagePath=" + this.imagePath + ", title=" + this.title + ", description=" + this.description + ", primaryCtaText=" + this.primaryCtaText + ", primaryCtaAction=" + this.primaryCtaAction + ", secondaryCtaText=" + this.secondaryCtaText + ", secondaryCtaAction=" + this.secondaryCtaAction + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type);
            dest.writeString(this.imagePath);
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.primaryCtaText);
            dest.writeParcelable(this.primaryCtaAction, flags);
            dest.writeString(this.secondaryCtaText);
            dest.writeParcelable(this.secondaryCtaAction, flags);
            dest.writeString(this.disclosureMarkdown);
        }

        public ApiGoldSuggestedAction(String str, String imagePath, String title, String description, String primaryCtaText, GenericAction genericAction, String secondaryCtaText, GenericAction genericAction2, String str2) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
            Intrinsics.checkNotNullParameter(secondaryCtaText, "secondaryCtaText");
            this.type = str;
            this.imagePath = imagePath;
            this.title = title;
            this.description = description;
            this.primaryCtaText = primaryCtaText;
            this.primaryCtaAction = genericAction;
            this.secondaryCtaText = secondaryCtaText;
            this.secondaryCtaAction = genericAction2;
            this.disclosureMarkdown = str2;
        }

        public final String getType() {
            return this.type;
        }

        public final String getImagePath() {
            return this.imagePath;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getPrimaryCtaText() {
            return this.primaryCtaText;
        }

        public final GenericAction getPrimaryCtaAction() {
            return this.primaryCtaAction;
        }

        public final String getSecondaryCtaText() {
            return this.secondaryCtaText;
        }

        public final GenericAction getSecondaryCtaAction() {
            return this.secondaryCtaAction;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020+HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanSelectionOption;", "Landroid/os/Parcelable;", "title", "", "planId", "Ljava/util/UUID;", "badge", "description", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "selectText", "goldAgreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "goldSweepAgreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "descriptionSecondary", "loggingIdentifier", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPlanId", "()Ljava/util/UUID;", "getBadge", "getDescription", "()Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "getSelectText", "getGoldAgreement", "()Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "getGoldSweepAgreements", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "getDescriptionSecondary", "getLoggingIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldPlanSelectionOption implements Parcelable {
        public static final Parcelable.Creator<ApiGoldPlanSelectionOption> CREATOR = new Creator();
        private final String badge;
        private final RichText description;
        private final String descriptionSecondary;
        private final ApiGoldSweepAgreement goldAgreement;
        private final ApiGoldSweepAgreements goldSweepAgreements;
        private final String loggingIdentifier;
        private final UUID planId;
        private final String selectText;
        private final String title;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldPlanSelectionOption> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldPlanSelectionOption createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiGoldPlanSelectionOption(parcel.readString(), (UUID) parcel.readSerializable(), parcel.readString(), (RichText) parcel.readParcelable(ApiGoldPlanSelectionOption.class.getClassLoader()), parcel.readString(), (ApiGoldSweepAgreement) parcel.readParcelable(ApiGoldPlanSelectionOption.class.getClassLoader()), parcel.readInt() == 0 ? null : ApiGoldSweepAgreements.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldPlanSelectionOption[] newArray(int i) {
                return new ApiGoldPlanSelectionOption[i];
            }
        }

        public static /* synthetic */ ApiGoldPlanSelectionOption copy$default(ApiGoldPlanSelectionOption apiGoldPlanSelectionOption, String str, UUID uuid, String str2, RichText richText, String str3, ApiGoldSweepAgreement apiGoldSweepAgreement, ApiGoldSweepAgreements apiGoldSweepAgreements, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiGoldPlanSelectionOption.title;
            }
            if ((i & 2) != 0) {
                uuid = apiGoldPlanSelectionOption.planId;
            }
            if ((i & 4) != 0) {
                str2 = apiGoldPlanSelectionOption.badge;
            }
            if ((i & 8) != 0) {
                richText = apiGoldPlanSelectionOption.description;
            }
            if ((i & 16) != 0) {
                str3 = apiGoldPlanSelectionOption.selectText;
            }
            if ((i & 32) != 0) {
                apiGoldSweepAgreement = apiGoldPlanSelectionOption.goldAgreement;
            }
            if ((i & 64) != 0) {
                apiGoldSweepAgreements = apiGoldPlanSelectionOption.goldSweepAgreements;
            }
            if ((i & 128) != 0) {
                str4 = apiGoldPlanSelectionOption.descriptionSecondary;
            }
            if ((i & 256) != 0) {
                str5 = apiGoldPlanSelectionOption.loggingIdentifier;
            }
            String str6 = str4;
            String str7 = str5;
            ApiGoldSweepAgreement apiGoldSweepAgreement2 = apiGoldSweepAgreement;
            ApiGoldSweepAgreements apiGoldSweepAgreements2 = apiGoldSweepAgreements;
            String str8 = str3;
            String str9 = str2;
            return apiGoldPlanSelectionOption.copy(str, uuid, str9, richText, str8, apiGoldSweepAgreement2, apiGoldSweepAgreements2, str6, str7);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getPlanId() {
            return this.planId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBadge() {
            return this.badge;
        }

        /* renamed from: component4, reason: from getter */
        public final RichText getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSelectText() {
            return this.selectText;
        }

        /* renamed from: component6, reason: from getter */
        public final ApiGoldSweepAgreement getGoldAgreement() {
            return this.goldAgreement;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiGoldSweepAgreements getGoldSweepAgreements() {
            return this.goldSweepAgreements;
        }

        /* renamed from: component8, reason: from getter */
        public final String getDescriptionSecondary() {
            return this.descriptionSecondary;
        }

        /* renamed from: component9, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final ApiGoldPlanSelectionOption copy(String title, UUID planId, String badge, RichText description, String selectText, ApiGoldSweepAgreement goldAgreement, ApiGoldSweepAgreements goldSweepAgreements, String descriptionSecondary, String loggingIdentifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(planId, "planId");
            Intrinsics.checkNotNullParameter(description, "description");
            return new ApiGoldPlanSelectionOption(title, planId, badge, description, selectText, goldAgreement, goldSweepAgreements, descriptionSecondary, loggingIdentifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldPlanSelectionOption)) {
                return false;
            }
            ApiGoldPlanSelectionOption apiGoldPlanSelectionOption = (ApiGoldPlanSelectionOption) other;
            return Intrinsics.areEqual(this.title, apiGoldPlanSelectionOption.title) && Intrinsics.areEqual(this.planId, apiGoldPlanSelectionOption.planId) && Intrinsics.areEqual(this.badge, apiGoldPlanSelectionOption.badge) && Intrinsics.areEqual(this.description, apiGoldPlanSelectionOption.description) && Intrinsics.areEqual(this.selectText, apiGoldPlanSelectionOption.selectText) && Intrinsics.areEqual(this.goldAgreement, apiGoldPlanSelectionOption.goldAgreement) && Intrinsics.areEqual(this.goldSweepAgreements, apiGoldPlanSelectionOption.goldSweepAgreements) && Intrinsics.areEqual(this.descriptionSecondary, apiGoldPlanSelectionOption.descriptionSecondary) && Intrinsics.areEqual(this.loggingIdentifier, apiGoldPlanSelectionOption.loggingIdentifier);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.planId.hashCode()) * 31;
            String str = this.badge;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.description.hashCode()) * 31;
            String str2 = this.selectText;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ApiGoldSweepAgreement apiGoldSweepAgreement = this.goldAgreement;
            int iHashCode4 = (iHashCode3 + (apiGoldSweepAgreement == null ? 0 : apiGoldSweepAgreement.hashCode())) * 31;
            ApiGoldSweepAgreements apiGoldSweepAgreements = this.goldSweepAgreements;
            int iHashCode5 = (iHashCode4 + (apiGoldSweepAgreements == null ? 0 : apiGoldSweepAgreements.hashCode())) * 31;
            String str3 = this.descriptionSecondary;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.loggingIdentifier;
            return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "ApiGoldPlanSelectionOption(title=" + this.title + ", planId=" + this.planId + ", badge=" + this.badge + ", description=" + this.description + ", selectText=" + this.selectText + ", goldAgreement=" + this.goldAgreement + ", goldSweepAgreements=" + this.goldSweepAgreements + ", descriptionSecondary=" + this.descriptionSecondary + ", loggingIdentifier=" + this.loggingIdentifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeSerializable(this.planId);
            dest.writeString(this.badge);
            dest.writeParcelable(this.description, flags);
            dest.writeString(this.selectText);
            dest.writeParcelable(this.goldAgreement, flags);
            ApiGoldSweepAgreements apiGoldSweepAgreements = this.goldSweepAgreements;
            if (apiGoldSweepAgreements == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGoldSweepAgreements.writeToParcel(dest, flags);
            }
            dest.writeString(this.descriptionSecondary);
            dest.writeString(this.loggingIdentifier);
        }

        public ApiGoldPlanSelectionOption(String title, UUID planId, String str, RichText description, String str2, ApiGoldSweepAgreement apiGoldSweepAgreement, ApiGoldSweepAgreements apiGoldSweepAgreements, String str3, String str4) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(planId, "planId");
            Intrinsics.checkNotNullParameter(description, "description");
            this.title = title;
            this.planId = planId;
            this.badge = str;
            this.description = description;
            this.selectText = str2;
            this.goldAgreement = apiGoldSweepAgreement;
            this.goldSweepAgreements = apiGoldSweepAgreements;
            this.descriptionSecondary = str3;
            this.loggingIdentifier = str4;
        }

        public final String getTitle() {
            return this.title;
        }

        public final UUID getPlanId() {
            return this.planId;
        }

        public final String getBadge() {
            return this.badge;
        }

        public final RichText getDescription() {
            return this.description;
        }

        public final String getSelectText() {
            return this.selectText;
        }

        public final ApiGoldSweepAgreement getGoldAgreement() {
            return this.goldAgreement;
        }

        public final ApiGoldSweepAgreements getGoldSweepAgreements() {
            return this.goldSweepAgreements;
        }

        public final String getDescriptionSecondary() {
            return this.descriptionSecondary;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanSelection;", "Landroid/os/Parcelable;", "title", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "plans", "", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanSelectionOption;", "ctaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDisclosure", "getPlans", "()Ljava/util/List;", "getCtaText", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldPlanSelection implements Parcelable {
        public static final Parcelable.Creator<ApiGoldPlanSelection> CREATOR = new Creator();
        private final String ctaText;
        private final String disclosure;
        private final List<ApiGoldPlanSelectionOption> plans;
        private final String title;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldPlanSelection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldPlanSelection createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ApiGoldPlanSelectionOption.CREATOR.createFromParcel(parcel));
                }
                return new ApiGoldPlanSelection(string2, string3, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldPlanSelection[] newArray(int i) {
                return new ApiGoldPlanSelection[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiGoldPlanSelection copy$default(ApiGoldPlanSelection apiGoldPlanSelection, String str, String str2, List list, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiGoldPlanSelection.title;
            }
            if ((i & 2) != 0) {
                str2 = apiGoldPlanSelection.disclosure;
            }
            if ((i & 4) != 0) {
                list = apiGoldPlanSelection.plans;
            }
            if ((i & 8) != 0) {
                str3 = apiGoldPlanSelection.ctaText;
            }
            return apiGoldPlanSelection.copy(str, str2, list, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisclosure() {
            return this.disclosure;
        }

        public final List<ApiGoldPlanSelectionOption> component3() {
            return this.plans;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        public final ApiGoldPlanSelection copy(String title, String disclosure, List<ApiGoldPlanSelectionOption> plans, String ctaText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(plans, "plans");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            return new ApiGoldPlanSelection(title, disclosure, plans, ctaText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldPlanSelection)) {
                return false;
            }
            ApiGoldPlanSelection apiGoldPlanSelection = (ApiGoldPlanSelection) other;
            return Intrinsics.areEqual(this.title, apiGoldPlanSelection.title) && Intrinsics.areEqual(this.disclosure, apiGoldPlanSelection.disclosure) && Intrinsics.areEqual(this.plans, apiGoldPlanSelection.plans) && Intrinsics.areEqual(this.ctaText, apiGoldPlanSelection.ctaText);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.disclosure.hashCode()) * 31) + this.plans.hashCode()) * 31) + this.ctaText.hashCode();
        }

        public String toString() {
            return "ApiGoldPlanSelection(title=" + this.title + ", disclosure=" + this.disclosure + ", plans=" + this.plans + ", ctaText=" + this.ctaText + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.disclosure);
            List<ApiGoldPlanSelectionOption> list = this.plans;
            dest.writeInt(list.size());
            Iterator<ApiGoldPlanSelectionOption> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.ctaText);
        }

        public ApiGoldPlanSelection(String title, String disclosure, List<ApiGoldPlanSelectionOption> plans, String ctaText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(plans, "plans");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            this.title = title;
            this.disclosure = disclosure;
            this.plans = plans;
            this.ctaText = ctaText;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDisclosure() {
            return this.disclosure;
        }

        public final List<ApiGoldPlanSelectionOption> getPlans() {
            return this.plans;
        }

        public final String getCtaText() {
            return this.ctaText;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\tJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanPromo;", "Landroid/os/Parcelable;", "imagePath", "", "title", "description", "primaryCtaText", "secondaryCtaText", "millisecondDelay", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getImagePath", "()Ljava/lang/String;", "getTitle", "getDescription", "getPrimaryCtaText", "getSecondaryCtaText", "getMillisecondDelay", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldPlanPromo implements Parcelable {
        public static final Parcelable.Creator<ApiGoldPlanPromo> CREATOR = new Creator();
        private final String description;
        private final String imagePath;
        private final int millisecondDelay;
        private final String primaryCtaText;
        private final String secondaryCtaText;
        private final String title;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldPlanPromo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldPlanPromo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiGoldPlanPromo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldPlanPromo[] newArray(int i) {
                return new ApiGoldPlanPromo[i];
            }
        }

        public static /* synthetic */ ApiGoldPlanPromo copy$default(ApiGoldPlanPromo apiGoldPlanPromo, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = apiGoldPlanPromo.imagePath;
            }
            if ((i2 & 2) != 0) {
                str2 = apiGoldPlanPromo.title;
            }
            if ((i2 & 4) != 0) {
                str3 = apiGoldPlanPromo.description;
            }
            if ((i2 & 8) != 0) {
                str4 = apiGoldPlanPromo.primaryCtaText;
            }
            if ((i2 & 16) != 0) {
                str5 = apiGoldPlanPromo.secondaryCtaText;
            }
            if ((i2 & 32) != 0) {
                i = apiGoldPlanPromo.millisecondDelay;
            }
            String str6 = str5;
            int i3 = i;
            return apiGoldPlanPromo.copy(str, str2, str3, str4, str6, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPrimaryCtaText() {
            return this.primaryCtaText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSecondaryCtaText() {
            return this.secondaryCtaText;
        }

        /* renamed from: component6, reason: from getter */
        public final int getMillisecondDelay() {
            return this.millisecondDelay;
        }

        public final ApiGoldPlanPromo copy(String imagePath, String title, String description, String primaryCtaText, String secondaryCtaText, int millisecondDelay) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
            Intrinsics.checkNotNullParameter(secondaryCtaText, "secondaryCtaText");
            return new ApiGoldPlanPromo(imagePath, title, description, primaryCtaText, secondaryCtaText, millisecondDelay);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldPlanPromo)) {
                return false;
            }
            ApiGoldPlanPromo apiGoldPlanPromo = (ApiGoldPlanPromo) other;
            return Intrinsics.areEqual(this.imagePath, apiGoldPlanPromo.imagePath) && Intrinsics.areEqual(this.title, apiGoldPlanPromo.title) && Intrinsics.areEqual(this.description, apiGoldPlanPromo.description) && Intrinsics.areEqual(this.primaryCtaText, apiGoldPlanPromo.primaryCtaText) && Intrinsics.areEqual(this.secondaryCtaText, apiGoldPlanPromo.secondaryCtaText) && this.millisecondDelay == apiGoldPlanPromo.millisecondDelay;
        }

        public int hashCode() {
            return (((((((((this.imagePath.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.primaryCtaText.hashCode()) * 31) + this.secondaryCtaText.hashCode()) * 31) + Integer.hashCode(this.millisecondDelay);
        }

        public String toString() {
            return "ApiGoldPlanPromo(imagePath=" + this.imagePath + ", title=" + this.title + ", description=" + this.description + ", primaryCtaText=" + this.primaryCtaText + ", secondaryCtaText=" + this.secondaryCtaText + ", millisecondDelay=" + this.millisecondDelay + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.imagePath);
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.primaryCtaText);
            dest.writeString(this.secondaryCtaText);
            dest.writeInt(this.millisecondDelay);
        }

        public ApiGoldPlanPromo(String imagePath, String title, String description, String primaryCtaText, String secondaryCtaText, int i) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
            Intrinsics.checkNotNullParameter(secondaryCtaText, "secondaryCtaText");
            this.imagePath = imagePath;
            this.title = title;
            this.description = description;
            this.primaryCtaText = primaryCtaText;
            this.secondaryCtaText = secondaryCtaText;
            this.millisecondDelay = i;
        }

        public final String getImagePath() {
            return this.imagePath;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getPrimaryCtaText() {
            return this.primaryCtaText;
        }

        public final String getSecondaryCtaText() {
            return this.secondaryCtaText;
        }

        public final int getMillisecondDelay() {
            return this.millisecondDelay;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanEditBanner;", "Landroid/os/Parcelable;", "icon", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "ctaText", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Icon;Ljava/lang/String;)V", "getIcon", "()Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "getCtaText", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldPlanEditBanner implements Parcelable {
        public static final Parcelable.Creator<ApiGoldPlanEditBanner> CREATOR = new Creator();
        private final String ctaText;
        private final Icon icon;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldPlanEditBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldPlanEditBanner createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiGoldPlanEditBanner(Icon.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldPlanEditBanner[] newArray(int i) {
                return new ApiGoldPlanEditBanner[i];
            }
        }

        public static /* synthetic */ ApiGoldPlanEditBanner copy$default(ApiGoldPlanEditBanner apiGoldPlanEditBanner, Icon icon, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                icon = apiGoldPlanEditBanner.icon;
            }
            if ((i & 2) != 0) {
                str = apiGoldPlanEditBanner.ctaText;
            }
            return apiGoldPlanEditBanner.copy(icon, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        public final ApiGoldPlanEditBanner copy(Icon icon, String ctaText) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            return new ApiGoldPlanEditBanner(icon, ctaText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldPlanEditBanner)) {
                return false;
            }
            ApiGoldPlanEditBanner apiGoldPlanEditBanner = (ApiGoldPlanEditBanner) other;
            return this.icon == apiGoldPlanEditBanner.icon && Intrinsics.areEqual(this.ctaText, apiGoldPlanEditBanner.ctaText);
        }

        public int hashCode() {
            return (this.icon.hashCode() * 31) + this.ctaText.hashCode();
        }

        public String toString() {
            return "ApiGoldPlanEditBanner(icon=" + this.icon + ", ctaText=" + this.ctaText + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.icon.name());
            dest.writeString(this.ctaText);
        }

        public ApiGoldPlanEditBanner(Icon icon, String ctaText) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            this.icon = icon;
            this.ctaText = ctaText;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final String getCtaText() {
            return this.ctaText;
        }
    }

    /* compiled from: ApiGoldUpgradeFlow.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanEdit;", "Landroid/os/Parcelable;", "goldPlanPromo", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanPromo;", "goldPlanEditBanner", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanEditBanner;", "goldPlanSelection", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanSelection;", "<init>", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanPromo;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanEditBanner;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanSelection;)V", "getGoldPlanPromo", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanPromo;", "getGoldPlanEditBanner", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanEditBanner;", "getGoldPlanSelection", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanSelection;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldPlanEdit implements Parcelable {
        public static final Parcelable.Creator<ApiGoldPlanEdit> CREATOR = new Creator();
        private final ApiGoldPlanEditBanner goldPlanEditBanner;
        private final ApiGoldPlanPromo goldPlanPromo;
        private final ApiGoldPlanSelection goldPlanSelection;

        /* compiled from: ApiGoldUpgradeFlow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiGoldPlanEdit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldPlanEdit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiGoldPlanEdit(ApiGoldPlanPromo.CREATOR.createFromParcel(parcel), ApiGoldPlanEditBanner.CREATOR.createFromParcel(parcel), ApiGoldPlanSelection.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiGoldPlanEdit[] newArray(int i) {
                return new ApiGoldPlanEdit[i];
            }
        }

        public static /* synthetic */ ApiGoldPlanEdit copy$default(ApiGoldPlanEdit apiGoldPlanEdit, ApiGoldPlanPromo apiGoldPlanPromo, ApiGoldPlanEditBanner apiGoldPlanEditBanner, ApiGoldPlanSelection apiGoldPlanSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                apiGoldPlanPromo = apiGoldPlanEdit.goldPlanPromo;
            }
            if ((i & 2) != 0) {
                apiGoldPlanEditBanner = apiGoldPlanEdit.goldPlanEditBanner;
            }
            if ((i & 4) != 0) {
                apiGoldPlanSelection = apiGoldPlanEdit.goldPlanSelection;
            }
            return apiGoldPlanEdit.copy(apiGoldPlanPromo, apiGoldPlanEditBanner, apiGoldPlanSelection);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiGoldPlanPromo getGoldPlanPromo() {
            return this.goldPlanPromo;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiGoldPlanEditBanner getGoldPlanEditBanner() {
            return this.goldPlanEditBanner;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiGoldPlanSelection getGoldPlanSelection() {
            return this.goldPlanSelection;
        }

        public final ApiGoldPlanEdit copy(ApiGoldPlanPromo goldPlanPromo, ApiGoldPlanEditBanner goldPlanEditBanner, ApiGoldPlanSelection goldPlanSelection) {
            Intrinsics.checkNotNullParameter(goldPlanPromo, "goldPlanPromo");
            Intrinsics.checkNotNullParameter(goldPlanEditBanner, "goldPlanEditBanner");
            Intrinsics.checkNotNullParameter(goldPlanSelection, "goldPlanSelection");
            return new ApiGoldPlanEdit(goldPlanPromo, goldPlanEditBanner, goldPlanSelection);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiGoldPlanEdit)) {
                return false;
            }
            ApiGoldPlanEdit apiGoldPlanEdit = (ApiGoldPlanEdit) other;
            return Intrinsics.areEqual(this.goldPlanPromo, apiGoldPlanEdit.goldPlanPromo) && Intrinsics.areEqual(this.goldPlanEditBanner, apiGoldPlanEdit.goldPlanEditBanner) && Intrinsics.areEqual(this.goldPlanSelection, apiGoldPlanEdit.goldPlanSelection);
        }

        public int hashCode() {
            return (((this.goldPlanPromo.hashCode() * 31) + this.goldPlanEditBanner.hashCode()) * 31) + this.goldPlanSelection.hashCode();
        }

        public String toString() {
            return "ApiGoldPlanEdit(goldPlanPromo=" + this.goldPlanPromo + ", goldPlanEditBanner=" + this.goldPlanEditBanner + ", goldPlanSelection=" + this.goldPlanSelection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.goldPlanPromo.writeToParcel(dest, flags);
            this.goldPlanEditBanner.writeToParcel(dest, flags);
            this.goldPlanSelection.writeToParcel(dest, flags);
        }

        public ApiGoldPlanEdit(ApiGoldPlanPromo goldPlanPromo, ApiGoldPlanEditBanner goldPlanEditBanner, ApiGoldPlanSelection goldPlanSelection) {
            Intrinsics.checkNotNullParameter(goldPlanPromo, "goldPlanPromo");
            Intrinsics.checkNotNullParameter(goldPlanEditBanner, "goldPlanEditBanner");
            Intrinsics.checkNotNullParameter(goldPlanSelection, "goldPlanSelection");
            this.goldPlanPromo = goldPlanPromo;
            this.goldPlanEditBanner = goldPlanEditBanner;
            this.goldPlanSelection = goldPlanSelection;
        }

        public final ApiGoldPlanPromo getGoldPlanPromo() {
            return this.goldPlanPromo;
        }

        public final ApiGoldPlanEditBanner getGoldPlanEditBanner() {
            return this.goldPlanEditBanner;
        }

        public final ApiGoldPlanSelection getGoldPlanSelection() {
            return this.goldPlanSelection;
        }
    }
}
