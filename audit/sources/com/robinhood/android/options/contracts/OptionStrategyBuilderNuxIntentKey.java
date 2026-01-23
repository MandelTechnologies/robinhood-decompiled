package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.p320db.OptionStrategyBuilder;
import com.robinhood.models.p355ui.UiOptionChain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderNuxIntentKey.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001DBy\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0004HÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0004HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0004HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u0095\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0001J\u0006\u00108\u001a\u000209J\u0013\u0010:\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000209HÖ\u0001J\t\u0010>\u001a\u00020\u0004HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000209R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionStrategyBuilderNuxIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "appendL2AccessContent", "", "appendL3NotAllowedForRetirementContent", "eduContentfulId", "eligibleForL3", "openStrategyBuilder", "nuxDescription", "nuxImg", "Lcom/robinhood/models/db/OptionStrategyBuilder$StrategySection$ImageURLs;", "showComingSoonPill", "strategyId", "surveyType", "Lcom/robinhood/android/options/contracts/OptionStrategyBuilderNuxIntentKey$SurveyType;", "title", "uiOptionChains", "", "Lcom/robinhood/models/ui/UiOptionChain;", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;ZZLjava/lang/String;Lcom/robinhood/models/db/OptionStrategyBuilder$StrategySection$ImageURLs;ZLjava/lang/String;Lcom/robinhood/android/options/contracts/OptionStrategyBuilderNuxIntentKey$SurveyType;Ljava/lang/String;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getAppendL2AccessContent", "()Z", "getAppendL3NotAllowedForRetirementContent", "getEduContentfulId", "getEligibleForL3", "getOpenStrategyBuilder", "getNuxDescription", "getNuxImg", "()Lcom/robinhood/models/db/OptionStrategyBuilder$StrategySection$ImageURLs;", "getShowComingSoonPill", "getStrategyId", "getSurveyType", "()Lcom/robinhood/android/options/contracts/OptionStrategyBuilderNuxIntentKey$SurveyType;", "getTitle", "getUiOptionChains", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SurveyType", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OptionStrategyBuilderNuxIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<OptionStrategyBuilderNuxIntentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final boolean appendL2AccessContent;
    private final boolean appendL3NotAllowedForRetirementContent;
    private final String eduContentfulId;
    private final boolean eligibleForL3;
    private final String nuxDescription;
    private final OptionStrategyBuilder.StrategySection.ImageURLs nuxImg;
    private final boolean openStrategyBuilder;
    private final boolean showComingSoonPill;
    private final String strategyId;
    private final SurveyType surveyType;
    private final String title;
    private final List<UiOptionChain> uiOptionChains;

    /* compiled from: OptionStrategyBuilderNuxIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionStrategyBuilderNuxIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionStrategyBuilderNuxIntentKey createFromParcel(Parcel parcel) {
            boolean z;
            Class cls;
            OptionStrategyBuilder.StrategySection.ImageURLs imageURLs;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            boolean z4 = parcel.readInt() != 0 ? z : false;
            String string3 = parcel.readString();
            boolean z5 = parcel.readInt() != 0 ? z : false;
            boolean z6 = parcel.readInt() != 0 ? z : false;
            String string4 = parcel.readString();
            OptionStrategyBuilder.StrategySection.ImageURLs imageURLs2 = (OptionStrategyBuilder.StrategySection.ImageURLs) parcel.readParcelable(OptionStrategyBuilderNuxIntentKey.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z2 = z;
                cls = OptionStrategyBuilderNuxIntentKey.class;
                imageURLs = imageURLs2;
            } else {
                cls = OptionStrategyBuilderNuxIntentKey.class;
                imageURLs = imageURLs2;
                z2 = false;
            }
            String string5 = parcel.readString();
            SurveyType surveyTypeValueOf = parcel.readInt() == 0 ? null : SurveyType.valueOf(parcel.readString());
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            Class cls2 = cls;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(cls2.getClassLoader()));
            }
            return new OptionStrategyBuilderNuxIntentKey(string2, z3, z4, string3, z5, z6, string4, imageURLs, z2, string5, surveyTypeValueOf, string6, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionStrategyBuilderNuxIntentKey[] newArray(int i) {
            return new OptionStrategyBuilderNuxIntentKey[i];
        }
    }

    public static /* synthetic */ OptionStrategyBuilderNuxIntentKey copy$default(OptionStrategyBuilderNuxIntentKey optionStrategyBuilderNuxIntentKey, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, String str3, OptionStrategyBuilder.StrategySection.ImageURLs imageURLs, boolean z5, String str4, SurveyType surveyType, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionStrategyBuilderNuxIntentKey.accountNumber;
        }
        return optionStrategyBuilderNuxIntentKey.copy(str, (i & 2) != 0 ? optionStrategyBuilderNuxIntentKey.appendL2AccessContent : z, (i & 4) != 0 ? optionStrategyBuilderNuxIntentKey.appendL3NotAllowedForRetirementContent : z2, (i & 8) != 0 ? optionStrategyBuilderNuxIntentKey.eduContentfulId : str2, (i & 16) != 0 ? optionStrategyBuilderNuxIntentKey.eligibleForL3 : z3, (i & 32) != 0 ? optionStrategyBuilderNuxIntentKey.openStrategyBuilder : z4, (i & 64) != 0 ? optionStrategyBuilderNuxIntentKey.nuxDescription : str3, (i & 128) != 0 ? optionStrategyBuilderNuxIntentKey.nuxImg : imageURLs, (i & 256) != 0 ? optionStrategyBuilderNuxIntentKey.showComingSoonPill : z5, (i & 512) != 0 ? optionStrategyBuilderNuxIntentKey.strategyId : str4, (i & 1024) != 0 ? optionStrategyBuilderNuxIntentKey.surveyType : surveyType, (i & 2048) != 0 ? optionStrategyBuilderNuxIntentKey.title : str5, (i & 4096) != 0 ? optionStrategyBuilderNuxIntentKey.uiOptionChains : list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* renamed from: component11, reason: from getter */
    public final SurveyType getSurveyType() {
        return this.surveyType;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<UiOptionChain> component13() {
        return this.uiOptionChains;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAppendL2AccessContent() {
        return this.appendL2AccessContent;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAppendL3NotAllowedForRetirementContent() {
        return this.appendL3NotAllowedForRetirementContent;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEduContentfulId() {
        return this.eduContentfulId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEligibleForL3() {
        return this.eligibleForL3;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getOpenStrategyBuilder() {
        return this.openStrategyBuilder;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNuxDescription() {
        return this.nuxDescription;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionStrategyBuilder.StrategySection.ImageURLs getNuxImg() {
        return this.nuxImg;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowComingSoonPill() {
        return this.showComingSoonPill;
    }

    public final OptionStrategyBuilderNuxIntentKey copy(String accountNumber, boolean appendL2AccessContent, boolean appendL3NotAllowedForRetirementContent, String eduContentfulId, boolean eligibleForL3, boolean openStrategyBuilder, String nuxDescription, OptionStrategyBuilder.StrategySection.ImageURLs nuxImg, boolean showComingSoonPill, String strategyId, SurveyType surveyType, String title, List<UiOptionChain> uiOptionChains) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(nuxDescription, "nuxDescription");
        Intrinsics.checkNotNullParameter(nuxImg, "nuxImg");
        Intrinsics.checkNotNullParameter(strategyId, "strategyId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        return new OptionStrategyBuilderNuxIntentKey(accountNumber, appendL2AccessContent, appendL3NotAllowedForRetirementContent, eduContentfulId, eligibleForL3, openStrategyBuilder, nuxDescription, nuxImg, showComingSoonPill, strategyId, surveyType, title, uiOptionChains);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionStrategyBuilderNuxIntentKey)) {
            return false;
        }
        OptionStrategyBuilderNuxIntentKey optionStrategyBuilderNuxIntentKey = (OptionStrategyBuilderNuxIntentKey) other;
        return Intrinsics.areEqual(this.accountNumber, optionStrategyBuilderNuxIntentKey.accountNumber) && this.appendL2AccessContent == optionStrategyBuilderNuxIntentKey.appendL2AccessContent && this.appendL3NotAllowedForRetirementContent == optionStrategyBuilderNuxIntentKey.appendL3NotAllowedForRetirementContent && Intrinsics.areEqual(this.eduContentfulId, optionStrategyBuilderNuxIntentKey.eduContentfulId) && this.eligibleForL3 == optionStrategyBuilderNuxIntentKey.eligibleForL3 && this.openStrategyBuilder == optionStrategyBuilderNuxIntentKey.openStrategyBuilder && Intrinsics.areEqual(this.nuxDescription, optionStrategyBuilderNuxIntentKey.nuxDescription) && Intrinsics.areEqual(this.nuxImg, optionStrategyBuilderNuxIntentKey.nuxImg) && this.showComingSoonPill == optionStrategyBuilderNuxIntentKey.showComingSoonPill && Intrinsics.areEqual(this.strategyId, optionStrategyBuilderNuxIntentKey.strategyId) && this.surveyType == optionStrategyBuilderNuxIntentKey.surveyType && Intrinsics.areEqual(this.title, optionStrategyBuilderNuxIntentKey.title) && Intrinsics.areEqual(this.uiOptionChains, optionStrategyBuilderNuxIntentKey.uiOptionChains);
    }

    public int hashCode() {
        int iHashCode = ((((this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.appendL2AccessContent)) * 31) + Boolean.hashCode(this.appendL3NotAllowedForRetirementContent)) * 31;
        String str = this.eduContentfulId;
        int iHashCode2 = (((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.eligibleForL3)) * 31) + Boolean.hashCode(this.openStrategyBuilder)) * 31) + this.nuxDescription.hashCode()) * 31) + this.nuxImg.hashCode()) * 31) + Boolean.hashCode(this.showComingSoonPill)) * 31) + this.strategyId.hashCode()) * 31;
        SurveyType surveyType = this.surveyType;
        return ((((iHashCode2 + (surveyType != null ? surveyType.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.uiOptionChains.hashCode();
    }

    public String toString() {
        return "OptionStrategyBuilderNuxIntentKey(accountNumber=" + this.accountNumber + ", appendL2AccessContent=" + this.appendL2AccessContent + ", appendL3NotAllowedForRetirementContent=" + this.appendL3NotAllowedForRetirementContent + ", eduContentfulId=" + this.eduContentfulId + ", eligibleForL3=" + this.eligibleForL3 + ", openStrategyBuilder=" + this.openStrategyBuilder + ", nuxDescription=" + this.nuxDescription + ", nuxImg=" + this.nuxImg + ", showComingSoonPill=" + this.showComingSoonPill + ", strategyId=" + this.strategyId + ", surveyType=" + this.surveyType + ", title=" + this.title + ", uiOptionChains=" + this.uiOptionChains + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeInt(this.appendL2AccessContent ? 1 : 0);
        dest.writeInt(this.appendL3NotAllowedForRetirementContent ? 1 : 0);
        dest.writeString(this.eduContentfulId);
        dest.writeInt(this.eligibleForL3 ? 1 : 0);
        dest.writeInt(this.openStrategyBuilder ? 1 : 0);
        dest.writeString(this.nuxDescription);
        dest.writeParcelable(this.nuxImg, flags);
        dest.writeInt(this.showComingSoonPill ? 1 : 0);
        dest.writeString(this.strategyId);
        SurveyType surveyType = this.surveyType;
        if (surveyType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(surveyType.name());
        }
        dest.writeString(this.title);
        List<UiOptionChain> list = this.uiOptionChains;
        dest.writeInt(list.size());
        Iterator<UiOptionChain> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public OptionStrategyBuilderNuxIntentKey(String accountNumber, boolean z, boolean z2, String str, boolean z3, boolean z4, String nuxDescription, OptionStrategyBuilder.StrategySection.ImageURLs nuxImg, boolean z5, String strategyId, SurveyType surveyType, String title, List<UiOptionChain> uiOptionChains) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(nuxDescription, "nuxDescription");
        Intrinsics.checkNotNullParameter(nuxImg, "nuxImg");
        Intrinsics.checkNotNullParameter(strategyId, "strategyId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        this.accountNumber = accountNumber;
        this.appendL2AccessContent = z;
        this.appendL3NotAllowedForRetirementContent = z2;
        this.eduContentfulId = str;
        this.eligibleForL3 = z3;
        this.openStrategyBuilder = z4;
        this.nuxDescription = nuxDescription;
        this.nuxImg = nuxImg;
        this.showComingSoonPill = z5;
        this.strategyId = strategyId;
        this.surveyType = surveyType;
        this.title = title;
        this.uiOptionChains = uiOptionChains;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getAppendL2AccessContent() {
        return this.appendL2AccessContent;
    }

    public final boolean getAppendL3NotAllowedForRetirementContent() {
        return this.appendL3NotAllowedForRetirementContent;
    }

    public final String getEduContentfulId() {
        return this.eduContentfulId;
    }

    public final boolean getEligibleForL3() {
        return this.eligibleForL3;
    }

    public final boolean getOpenStrategyBuilder() {
        return this.openStrategyBuilder;
    }

    public final String getNuxDescription() {
        return this.nuxDescription;
    }

    public final OptionStrategyBuilder.StrategySection.ImageURLs getNuxImg() {
        return this.nuxImg;
    }

    public final boolean getShowComingSoonPill() {
        return this.showComingSoonPill;
    }

    public final String getStrategyId() {
        return this.strategyId;
    }

    public final SurveyType getSurveyType() {
        return this.surveyType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<UiOptionChain> getUiOptionChains() {
        return this.uiOptionChains;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionStrategyBuilderNuxIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionStrategyBuilderNuxIntentKey$SurveyType;", "", "<init>", "(Ljava/lang/String;I)V", "L2", "L3", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class SurveyType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SurveyType[] $VALUES;

        /* renamed from: L2 */
        public static final SurveyType f4727L2 = new SurveyType("L2", 0);

        /* renamed from: L3 */
        public static final SurveyType f4728L3 = new SurveyType("L3", 1);

        private static final /* synthetic */ SurveyType[] $values() {
            return new SurveyType[]{f4727L2, f4728L3};
        }

        public static EnumEntries<SurveyType> getEntries() {
            return $ENTRIES;
        }

        static {
            SurveyType[] surveyTypeArr$values = $values();
            $VALUES = surveyTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(surveyTypeArr$values);
        }

        private SurveyType(String str, int i) {
        }

        public static SurveyType valueOf(String str) {
            return (SurveyType) Enum.valueOf(SurveyType.class, str);
        }

        public static SurveyType[] values() {
            return (SurveyType[]) $VALUES.clone();
        }
    }
}
