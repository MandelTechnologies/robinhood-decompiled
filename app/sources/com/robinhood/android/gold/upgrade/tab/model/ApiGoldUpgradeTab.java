package com.robinhood.android.gold.upgrade.tab.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.bonfire.ApiGoldValueProp;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ApiGoldUpgradeTab.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/tab/model/ApiGoldUpgradeTab;", "Landroid/os/Parcelable;", "defaultPlanId", "Ljava/util/UUID;", "promotion", "", "goldValueProps", "Lcom/robinhood/android/gold/upgrade/tab/model/ApiGoldUpgradeTab$ApiGoldValueProps;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/gold/upgrade/tab/model/ApiGoldUpgradeTab$ApiGoldValueProps;)V", "getDefaultPlanId", "()Ljava/util/UUID;", "getPromotion", "()Ljava/lang/String;", "getGoldValueProps", "()Lcom/robinhood/android/gold/upgrade/tab/model/ApiGoldUpgradeTab$ApiGoldValueProps;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ApiGoldValuePropsInfoTag", "ApiGoldValueProps", "feature-gold-upgrade-tab_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldUpgradeTab implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ApiGoldUpgradeTab> CREATOR = new Creator();
    private final UUID defaultPlanId;
    private final ApiGoldValueProps goldValueProps;
    private final String promotion;

    /* compiled from: ApiGoldUpgradeTab.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldUpgradeTab> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldUpgradeTab createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldUpgradeTab((UUID) parcel.readSerializable(), parcel.readString(), ApiGoldValueProps.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldUpgradeTab[] newArray(int i) {
            return new ApiGoldUpgradeTab[i];
        }
    }

    public static /* synthetic */ ApiGoldUpgradeTab copy$default(ApiGoldUpgradeTab apiGoldUpgradeTab, UUID uuid, String str, ApiGoldValueProps apiGoldValueProps, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = apiGoldUpgradeTab.defaultPlanId;
        }
        if ((i & 2) != 0) {
            str = apiGoldUpgradeTab.promotion;
        }
        if ((i & 4) != 0) {
            apiGoldValueProps = apiGoldUpgradeTab.goldValueProps;
        }
        return apiGoldUpgradeTab.copy(uuid, str, apiGoldValueProps);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getDefaultPlanId() {
        return this.defaultPlanId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPromotion() {
        return this.promotion;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiGoldValueProps getGoldValueProps() {
        return this.goldValueProps;
    }

    public final ApiGoldUpgradeTab copy(UUID defaultPlanId, String promotion, ApiGoldValueProps goldValueProps) {
        Intrinsics.checkNotNullParameter(goldValueProps, "goldValueProps");
        return new ApiGoldUpgradeTab(defaultPlanId, promotion, goldValueProps);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldUpgradeTab)) {
            return false;
        }
        ApiGoldUpgradeTab apiGoldUpgradeTab = (ApiGoldUpgradeTab) other;
        return Intrinsics.areEqual(this.defaultPlanId, apiGoldUpgradeTab.defaultPlanId) && Intrinsics.areEqual(this.promotion, apiGoldUpgradeTab.promotion) && Intrinsics.areEqual(this.goldValueProps, apiGoldUpgradeTab.goldValueProps);
    }

    public int hashCode() {
        UUID uuid = this.defaultPlanId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.promotion;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.goldValueProps.hashCode();
    }

    public String toString() {
        return "ApiGoldUpgradeTab(defaultPlanId=" + this.defaultPlanId + ", promotion=" + this.promotion + ", goldValueProps=" + this.goldValueProps + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.defaultPlanId);
        dest.writeString(this.promotion);
        this.goldValueProps.writeToParcel(dest, flags);
    }

    public ApiGoldUpgradeTab(UUID uuid, String str, ApiGoldValueProps goldValueProps) {
        Intrinsics.checkNotNullParameter(goldValueProps, "goldValueProps");
        this.defaultPlanId = uuid;
        this.promotion = str;
        this.goldValueProps = goldValueProps;
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

    /* compiled from: ApiGoldUpgradeTab.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/tab/model/ApiGoldUpgradeTab$ApiGoldValuePropsInfoTag;", "Landroid/os/Parcelable;", AnnotatedPrivateKey.LABEL, "", "icon", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "identifier", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Icon;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getIcon", "()Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "getIdentifier", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade-tab_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldValuePropsInfoTag implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ApiGoldValuePropsInfoTag> CREATOR = new Creator();
        private final Icon icon;
        private final String identifier;
        private final String label;

        /* compiled from: ApiGoldUpgradeTab.kt */
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

    /* compiled from: ApiGoldUpgradeTab.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J}\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/tab/model/ApiGoldUpgradeTab$ApiGoldValueProps;", "Landroid/os/Parcelable;", "imagePath", "", "infoTag", "Lcom/robinhood/android/gold/upgrade/tab/model/ApiGoldUpgradeTab$ApiGoldValuePropsInfoTag;", "title", "subtitleMarkdown", "valueProps", "", "Lcom/robinhood/models/api/bonfire/ApiGoldValueProp;", "goldMonthlyCost", "goldFreeDays", "learnMoreButton", "Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "ctaText", "disclosureMarkdown", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/gold/upgrade/tab/model/ApiGoldUpgradeTab$ApiGoldValuePropsInfoTag;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/TextButton;Ljava/lang/String;Ljava/lang/String;)V", "getImagePath", "()Ljava/lang/String;", "getInfoTag", "()Lcom/robinhood/android/gold/upgrade/tab/model/ApiGoldUpgradeTab$ApiGoldValuePropsInfoTag;", "getTitle", "getSubtitleMarkdown", "getValueProps", "()Ljava/util/List;", "getGoldMonthlyCost", "getGoldFreeDays", "getLearnMoreButton", "()Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "getCtaText", "getDisclosureMarkdown", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade-tab_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiGoldValueProps implements Parcelable {
        public static final int $stable = 8;
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

        /* compiled from: ApiGoldUpgradeTab.kt */
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
}
