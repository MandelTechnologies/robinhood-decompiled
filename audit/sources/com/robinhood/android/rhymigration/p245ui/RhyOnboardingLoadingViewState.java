package com.robinhood.android.rhymigration.p245ui;

import com.robinhood.android.common.rhymigration.CmSunsetIncentiveExperiment;
import com.robinhood.android.rhymigration.model.UiRhyMigration;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCmShutdown;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCmShutdownUpsell;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoadingViewState2;
import com.robinhood.staticcontent.model.TitleAndBody;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyOnboardingLoadingViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010 \u001a\u00020\bH\u0002J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÂ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\\\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0004\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0006\u0010\u0012R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingViewState;", "", "error", "", "isEligible", "", "isInSunsetCm", "cmSunsetIncentiveGroup", "Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;", "rhyMigration", "Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "overridesList", "", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;Lcom/robinhood/android/rhymigration/model/UiRhyMigration;Ljava/util/List;)V", "getError", "()Ljava/lang/Throwable;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOverridesList", "()Ljava/util/List;", "finalRhyMigration", "getFinalRhyMigration", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "status", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus;", "getStatus", "()Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus;", "overrideMigrationContent", "original", "overrides", "variant", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Throwable;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;Lcom/robinhood/android/rhymigration/model/UiRhyMigration;Ljava/util/List;)Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingViewState;", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class RhyOnboardingLoadingViewState {
    public static final int $stable = 8;
    private final CmSunsetIncentiveExperiment.Variant cmSunsetIncentiveGroup;
    private final Throwable error;
    private final Boolean isEligible;
    private final Boolean isInSunsetCm;
    private final List<ProductMarketing.Feature> overridesList;
    private final UiRhyMigration rhyMigration;

    /* compiled from: RhyOnboardingLoadingViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CmSunsetIncentiveExperiment.Variant.values().length];
            try {
                iArr[CmSunsetIncentiveExperiment.Variant.HIGH_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CmSunsetIncentiveExperiment.Variant.DIRECT_DEPOSITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CmSunsetIncentiveExperiment.Variant.RECENT_TRANSACTOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RhyOnboardingLoadingViewState() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* renamed from: component4, reason: from getter */
    private final CmSunsetIncentiveExperiment.Variant getCmSunsetIncentiveGroup() {
        return this.cmSunsetIncentiveGroup;
    }

    /* renamed from: component5, reason: from getter */
    private final UiRhyMigration getRhyMigration() {
        return this.rhyMigration;
    }

    public static /* synthetic */ RhyOnboardingLoadingViewState copy$default(RhyOnboardingLoadingViewState rhyOnboardingLoadingViewState, Throwable th, Boolean bool, Boolean bool2, CmSunsetIncentiveExperiment.Variant variant, UiRhyMigration uiRhyMigration, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            th = rhyOnboardingLoadingViewState.error;
        }
        if ((i & 2) != 0) {
            bool = rhyOnboardingLoadingViewState.isEligible;
        }
        if ((i & 4) != 0) {
            bool2 = rhyOnboardingLoadingViewState.isInSunsetCm;
        }
        if ((i & 8) != 0) {
            variant = rhyOnboardingLoadingViewState.cmSunsetIncentiveGroup;
        }
        if ((i & 16) != 0) {
            uiRhyMigration = rhyOnboardingLoadingViewState.rhyMigration;
        }
        if ((i & 32) != 0) {
            list = rhyOnboardingLoadingViewState.overridesList;
        }
        UiRhyMigration uiRhyMigration2 = uiRhyMigration;
        List list2 = list;
        return rhyOnboardingLoadingViewState.copy(th, bool, bool2, variant, uiRhyMigration2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsEligible() {
        return this.isEligible;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsInSunsetCm() {
        return this.isInSunsetCm;
    }

    public final List<ProductMarketing.Feature> component6() {
        return this.overridesList;
    }

    public final RhyOnboardingLoadingViewState copy(Throwable error, Boolean isEligible, Boolean isInSunsetCm, CmSunsetIncentiveExperiment.Variant cmSunsetIncentiveGroup, UiRhyMigration rhyMigration, List<ProductMarketing.Feature> overridesList) {
        return new RhyOnboardingLoadingViewState(error, isEligible, isInSunsetCm, cmSunsetIncentiveGroup, rhyMigration, overridesList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyOnboardingLoadingViewState)) {
            return false;
        }
        RhyOnboardingLoadingViewState rhyOnboardingLoadingViewState = (RhyOnboardingLoadingViewState) other;
        return Intrinsics.areEqual(this.error, rhyOnboardingLoadingViewState.error) && Intrinsics.areEqual(this.isEligible, rhyOnboardingLoadingViewState.isEligible) && Intrinsics.areEqual(this.isInSunsetCm, rhyOnboardingLoadingViewState.isInSunsetCm) && this.cmSunsetIncentiveGroup == rhyOnboardingLoadingViewState.cmSunsetIncentiveGroup && Intrinsics.areEqual(this.rhyMigration, rhyOnboardingLoadingViewState.rhyMigration) && Intrinsics.areEqual(this.overridesList, rhyOnboardingLoadingViewState.overridesList);
    }

    public int hashCode() {
        Throwable th = this.error;
        int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
        Boolean bool = this.isEligible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isInSunsetCm;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CmSunsetIncentiveExperiment.Variant variant = this.cmSunsetIncentiveGroup;
        int iHashCode4 = (iHashCode3 + (variant == null ? 0 : variant.hashCode())) * 31;
        UiRhyMigration uiRhyMigration = this.rhyMigration;
        int iHashCode5 = (iHashCode4 + (uiRhyMigration == null ? 0 : uiRhyMigration.hashCode())) * 31;
        List<ProductMarketing.Feature> list = this.overridesList;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "RhyOnboardingLoadingViewState(error=" + this.error + ", isEligible=" + this.isEligible + ", isInSunsetCm=" + this.isInSunsetCm + ", cmSunsetIncentiveGroup=" + this.cmSunsetIncentiveGroup + ", rhyMigration=" + this.rhyMigration + ", overridesList=" + this.overridesList + ")";
    }

    public RhyOnboardingLoadingViewState(Throwable th, Boolean bool, Boolean bool2, CmSunsetIncentiveExperiment.Variant variant, UiRhyMigration uiRhyMigration, List<ProductMarketing.Feature> list) {
        this.error = th;
        this.isEligible = bool;
        this.isInSunsetCm = bool2;
        this.cmSunsetIncentiveGroup = variant;
        this.rhyMigration = uiRhyMigration;
        this.overridesList = list;
    }

    public /* synthetic */ RhyOnboardingLoadingViewState(Throwable th, Boolean bool, Boolean bool2, CmSunsetIncentiveExperiment.Variant variant, UiRhyMigration uiRhyMigration, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : variant, (i & 16) != 0 ? null : uiRhyMigration, (i & 32) != 0 ? null : list);
    }

    public final Throwable getError() {
        return this.error;
    }

    public final Boolean isEligible() {
        return this.isEligible;
    }

    public final Boolean isInSunsetCm() {
        return this.isInSunsetCm;
    }

    public final List<ProductMarketing.Feature> getOverridesList() {
        return this.overridesList;
    }

    private final UiRhyMigration getFinalRhyMigration() {
        UiRhyMigration uiRhyMigration;
        CmSunsetIncentiveExperiment.Variant variant = this.cmSunsetIncentiveGroup;
        if (variant == null) {
            return null;
        }
        if (variant.isInExperiment()) {
            List<ProductMarketing.Feature> list = this.overridesList;
            if (list == null || (uiRhyMigration = this.rhyMigration) == null) {
                return null;
            }
            return overrideMigrationContent(uiRhyMigration, list, variant);
        }
        return this.rhyMigration;
    }

    public final RhyOnboardingLoadingViewState2 getStatus() {
        UiRhyMigration finalRhyMigration = getFinalRhyMigration();
        return Intrinsics.areEqual(this.isEligible, Boolean.FALSE) ? RhyOnboardingLoadingViewState2.Ineligible.INSTANCE : this.error != null ? new RhyOnboardingLoadingViewState2.Error(this.error) : (!Intrinsics.areEqual(this.isEligible, Boolean.TRUE) || finalRhyMigration == null) ? RhyOnboardingLoadingViewState2.Loading.INSTANCE : new RhyOnboardingLoadingViewState2.Success(finalRhyMigration);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[PHI: r1
      0x0068: PHI (r1v9 com.robinhood.staticcontent.model.productmarketing.ProductMarketing$Feature) = 
      (r1v3 com.robinhood.staticcontent.model.productmarketing.ProductMarketing$Feature)
      (r1v14 com.robinhood.staticcontent.model.productmarketing.ProductMarketing$Feature)
      (r1v22 com.robinhood.staticcontent.model.productmarketing.ProductMarketing$Feature)
     binds: [B:58:0x00e5, B:39:0x0094, B:19:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final UiRhyMigration overrideMigrationContent(UiRhyMigration original, List<ProductMarketing.Feature> overrides, CmSunsetIncentiveExperiment.Variant variant) {
        ProductMarketing.Feature feature;
        Object next;
        ProductMarketing.Feature feature2;
        Object next2;
        UiRhyMigration uiRhyMigrationCopy$default;
        List list;
        List<TitleAndBody> pageFeatures;
        List mutableList;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        int i = WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
        if (i == 1) {
            if (overrides != null) {
                Iterator<T> it = overrides.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (Intrinsics.areEqual(((ProductMarketing.Feature) next2).getIdentifier(), "hvc-upsell")) {
                        break;
                    }
                }
                feature = (ProductMarketing.Feature) next2;
            } else {
                feature = null;
            }
            if (overrides != null) {
                Iterator<T> it2 = overrides.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.areEqual(((ProductMarketing.Feature) next).getIdentifier(), "hvc-opt-out")) {
                        break;
                    }
                }
                feature2 = (ProductMarketing.Feature) next;
            }
        } else if (i == 2) {
            if (overrides != null) {
                Iterator<T> it3 = overrides.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it3.next();
                    if (Intrinsics.areEqual(((ProductMarketing.Feature) next4).getIdentifier(), "dd-upsell")) {
                        break;
                    }
                }
                feature = (ProductMarketing.Feature) next4;
            } else {
                feature = null;
            }
            if (overrides != null) {
                Iterator<T> it4 = overrides.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it4.next();
                    if (Intrinsics.areEqual(((ProductMarketing.Feature) next3).getIdentifier(), "dd-opt-out")) {
                        break;
                    }
                }
                feature2 = (ProductMarketing.Feature) next3;
            }
        } else if (i != 3) {
            feature = null;
            feature2 = null;
        } else {
            if (overrides != null) {
                Iterator<T> it5 = overrides.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it5.next();
                    if (Intrinsics.areEqual(((ProductMarketing.Feature) next6).getIdentifier(), "rt-upsell")) {
                        break;
                    }
                }
                feature = (ProductMarketing.Feature) next6;
            } else {
                feature = null;
            }
            if (overrides != null) {
                Iterator<T> it6 = overrides.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it6.next();
                    if (Intrinsics.areEqual(((ProductMarketing.Feature) next5).getIdentifier(), "rt-opt-out")) {
                        break;
                    }
                }
                feature2 = (ProductMarketing.Feature) next5;
            } else {
                feature2 = null;
            }
        }
        if (feature != null) {
            UiRhyMigrationCmShutdownUpsell upsellPage = original.getUpsellPage();
            uiRhyMigrationCopy$default = UiRhyMigration.copy$default(original, null, null, null, null, null, null, null, null, null, null, upsellPage != null ? upsellPage.copy((16380 & 1) != 0 ? upsellPage.title : feature.getTitle(), (16380 & 2) != 0 ? upsellPage.subtitle : feature.getContent().getRaw(), (16380 & 4) != 0 ? upsellPage.primaryCta : null, (16380 & 8) != 0 ? upsellPage.secondaryCta : null, (16380 & 16) != 0 ? upsellPage.accountComparison : null, (16380 & 32) != 0 ? upsellPage.comparisonTableTitle : null, (16380 & 64) != 0 ? upsellPage.comparisonTableSubtitle : null, (16380 & 128) != 0 ? upsellPage.comparisonTableHeader : null, (16380 & 256) != 0 ? upsellPage.comparisonTableTitleAndBody : null, (16380 & 512) != 0 ? upsellPage.faqTitle : null, (16380 & 1024) != 0 ? upsellPage.faqDropdown : null, (16380 & 2048) != 0 ? upsellPage.showAllTitle : null, (16380 & 4096) != 0 ? upsellPage.showAllLink : null, (16380 & 8192) != 0 ? upsellPage.disclosure : null) : null, null, 3071, null);
        } else {
            uiRhyMigrationCopy$default = original;
        }
        if (feature2 == null) {
            return uiRhyMigrationCopy$default;
        }
        UiRhyMigrationCmShutdown optOutPage = original.getOptOutPage();
        if (optOutPage == null || (pageFeatures = optOutPage.getPageFeatures()) == null || (mutableList = CollectionsKt.toMutableList((Collection) pageFeatures)) == null) {
            list = null;
        } else {
            mutableList.add(0, new TitleAndBody(feature2.getTitle(), feature2.getContent().getRaw()));
            list = mutableList;
        }
        UiRhyMigrationCmShutdown optOutPage2 = original.getOptOutPage();
        return UiRhyMigration.copy$default(uiRhyMigrationCopy$default, null, null, null, null, null, null, null, null, null, null, null, optOutPage2 != null ? UiRhyMigrationCmShutdown.copy$default(optOutPage2, null, null, null, null, list, 15, null) : null, 2047, null);
    }
}
