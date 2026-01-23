package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.creditcard.p091ui.CreditApplicationGoldBasicExperiment;
import com.robinhood.android.creditcard.p091ui.creditapplication.incentive.bonus.points.BonusPointsTextVariant;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinalTermsDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00010Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jk\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState;", "", "isGold", "", "showErrorDialog", "goldValueProps", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;", "goldAgreementContent", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "screen", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState$Screen;", "bonusPointsTextVariant", "Lcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;", "isGoldBasicEligible", "goldBasicVariant", "Lcom/robinhood/android/creditcard/ui/CreditApplicationGoldBasicExperiment$Variant;", "showPlanSelectorFromDeeplink", "<init>", "(ZZLcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;Lcom/robinhood/android/agreements/models/UiAgreementWithContent;Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState$Screen;Lcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;ZLcom/robinhood/android/creditcard/ui/CreditApplicationGoldBasicExperiment$Variant;Z)V", "()Z", "getShowErrorDialog", "getGoldValueProps", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;", "getGoldAgreementContent", "()Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "getScreen", "()Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState$Screen;", "getBonusPointsTextVariant", "()Lcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;", "getGoldBasicVariant", "()Lcom/robinhood/android/creditcard/ui/CreditApplicationGoldBasicExperiment$Variant;", "getShowPlanSelectorFromDeeplink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "Screen", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FinalTermsViewState {
    public static final int $stable = 8;
    private final BonusPointsTextVariant bonusPointsTextVariant;
    private final UiAgreementWithContent goldAgreementContent;
    private final CreditApplicationGoldBasicExperiment.Variant goldBasicVariant;
    private final ApiGoldUpgradeFlow.ApiGoldValueProps goldValueProps;
    private final boolean isGold;
    private final boolean isGoldBasicEligible;
    private final Screen screen;
    private final boolean showErrorDialog;
    private final boolean showPlanSelectorFromDeeplink;

    public FinalTermsViewState() {
        this(false, false, null, null, null, null, false, null, false, 511, null);
    }

    public static /* synthetic */ FinalTermsViewState copy$default(FinalTermsViewState finalTermsViewState, boolean z, boolean z2, ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps, UiAgreementWithContent uiAgreementWithContent, Screen screen, BonusPointsTextVariant bonusPointsTextVariant, boolean z3, CreditApplicationGoldBasicExperiment.Variant variant, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = finalTermsViewState.isGold;
        }
        if ((i & 2) != 0) {
            z2 = finalTermsViewState.showErrorDialog;
        }
        if ((i & 4) != 0) {
            apiGoldValueProps = finalTermsViewState.goldValueProps;
        }
        if ((i & 8) != 0) {
            uiAgreementWithContent = finalTermsViewState.goldAgreementContent;
        }
        if ((i & 16) != 0) {
            screen = finalTermsViewState.screen;
        }
        if ((i & 32) != 0) {
            bonusPointsTextVariant = finalTermsViewState.bonusPointsTextVariant;
        }
        if ((i & 64) != 0) {
            z3 = finalTermsViewState.isGoldBasicEligible;
        }
        if ((i & 128) != 0) {
            variant = finalTermsViewState.goldBasicVariant;
        }
        if ((i & 256) != 0) {
            z4 = finalTermsViewState.showPlanSelectorFromDeeplink;
        }
        CreditApplicationGoldBasicExperiment.Variant variant2 = variant;
        boolean z5 = z4;
        BonusPointsTextVariant bonusPointsTextVariant2 = bonusPointsTextVariant;
        boolean z6 = z3;
        Screen screen2 = screen;
        ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps2 = apiGoldValueProps;
        return finalTermsViewState.copy(z, z2, apiGoldValueProps2, uiAgreementWithContent, screen2, bonusPointsTextVariant2, z6, variant2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsGold() {
        return this.isGold;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowErrorDialog() {
        return this.showErrorDialog;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiGoldUpgradeFlow.ApiGoldValueProps getGoldValueProps() {
        return this.goldValueProps;
    }

    /* renamed from: component4, reason: from getter */
    public final UiAgreementWithContent getGoldAgreementContent() {
        return this.goldAgreementContent;
    }

    /* renamed from: component5, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    /* renamed from: component6, reason: from getter */
    public final BonusPointsTextVariant getBonusPointsTextVariant() {
        return this.bonusPointsTextVariant;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsGoldBasicEligible() {
        return this.isGoldBasicEligible;
    }

    /* renamed from: component8, reason: from getter */
    public final CreditApplicationGoldBasicExperiment.Variant getGoldBasicVariant() {
        return this.goldBasicVariant;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowPlanSelectorFromDeeplink() {
        return this.showPlanSelectorFromDeeplink;
    }

    public final FinalTermsViewState copy(boolean isGold, boolean showErrorDialog, ApiGoldUpgradeFlow.ApiGoldValueProps goldValueProps, UiAgreementWithContent goldAgreementContent, Screen screen, BonusPointsTextVariant bonusPointsTextVariant, boolean isGoldBasicEligible, CreditApplicationGoldBasicExperiment.Variant goldBasicVariant, boolean showPlanSelectorFromDeeplink) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new FinalTermsViewState(isGold, showErrorDialog, goldValueProps, goldAgreementContent, screen, bonusPointsTextVariant, isGoldBasicEligible, goldBasicVariant, showPlanSelectorFromDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinalTermsViewState)) {
            return false;
        }
        FinalTermsViewState finalTermsViewState = (FinalTermsViewState) other;
        return this.isGold == finalTermsViewState.isGold && this.showErrorDialog == finalTermsViewState.showErrorDialog && Intrinsics.areEqual(this.goldValueProps, finalTermsViewState.goldValueProps) && Intrinsics.areEqual(this.goldAgreementContent, finalTermsViewState.goldAgreementContent) && this.screen == finalTermsViewState.screen && this.bonusPointsTextVariant == finalTermsViewState.bonusPointsTextVariant && this.isGoldBasicEligible == finalTermsViewState.isGoldBasicEligible && this.goldBasicVariant == finalTermsViewState.goldBasicVariant && this.showPlanSelectorFromDeeplink == finalTermsViewState.showPlanSelectorFromDeeplink;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isGold) * 31) + Boolean.hashCode(this.showErrorDialog)) * 31;
        ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps = this.goldValueProps;
        int iHashCode2 = (iHashCode + (apiGoldValueProps == null ? 0 : apiGoldValueProps.hashCode())) * 31;
        UiAgreementWithContent uiAgreementWithContent = this.goldAgreementContent;
        int iHashCode3 = (((iHashCode2 + (uiAgreementWithContent == null ? 0 : uiAgreementWithContent.hashCode())) * 31) + this.screen.hashCode()) * 31;
        BonusPointsTextVariant bonusPointsTextVariant = this.bonusPointsTextVariant;
        int iHashCode4 = (((iHashCode3 + (bonusPointsTextVariant == null ? 0 : bonusPointsTextVariant.hashCode())) * 31) + Boolean.hashCode(this.isGoldBasicEligible)) * 31;
        CreditApplicationGoldBasicExperiment.Variant variant = this.goldBasicVariant;
        return ((iHashCode4 + (variant != null ? variant.hashCode() : 0)) * 31) + Boolean.hashCode(this.showPlanSelectorFromDeeplink);
    }

    public String toString() {
        return "FinalTermsViewState(isGold=" + this.isGold + ", showErrorDialog=" + this.showErrorDialog + ", goldValueProps=" + this.goldValueProps + ", goldAgreementContent=" + this.goldAgreementContent + ", screen=" + this.screen + ", bonusPointsTextVariant=" + this.bonusPointsTextVariant + ", isGoldBasicEligible=" + this.isGoldBasicEligible + ", goldBasicVariant=" + this.goldBasicVariant + ", showPlanSelectorFromDeeplink=" + this.showPlanSelectorFromDeeplink + ")";
    }

    public FinalTermsViewState(boolean z, boolean z2, ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps, UiAgreementWithContent uiAgreementWithContent, Screen screen, BonusPointsTextVariant bonusPointsTextVariant, boolean z3, CreditApplicationGoldBasicExperiment.Variant variant, boolean z4) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.isGold = z;
        this.showErrorDialog = z2;
        this.goldValueProps = apiGoldValueProps;
        this.goldAgreementContent = uiAgreementWithContent;
        this.screen = screen;
        this.bonusPointsTextVariant = bonusPointsTextVariant;
        this.isGoldBasicEligible = z3;
        this.goldBasicVariant = variant;
        this.showPlanSelectorFromDeeplink = z4;
    }

    public final boolean isGold() {
        return this.isGold;
    }

    public final boolean getShowErrorDialog() {
        return this.showErrorDialog;
    }

    public final ApiGoldUpgradeFlow.ApiGoldValueProps getGoldValueProps() {
        return this.goldValueProps;
    }

    public final UiAgreementWithContent getGoldAgreementContent() {
        return this.goldAgreementContent;
    }

    public /* synthetic */ FinalTermsViewState(boolean z, boolean z2, ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps, UiAgreementWithContent uiAgreementWithContent, Screen screen, BonusPointsTextVariant bonusPointsTextVariant, boolean z3, CreditApplicationGoldBasicExperiment.Variant variant, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : apiGoldValueProps, (i & 8) != 0 ? null : uiAgreementWithContent, (i & 16) != 0 ? Screen.TERMS : screen, (i & 32) != 0 ? null : bonusPointsTextVariant, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : variant, (i & 256) != 0 ? false : z4);
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final BonusPointsTextVariant getBonusPointsTextVariant() {
        return this.bonusPointsTextVariant;
    }

    public final boolean isGoldBasicEligible() {
        return this.isGoldBasicEligible;
    }

    public final CreditApplicationGoldBasicExperiment.Variant getGoldBasicVariant() {
        return this.goldBasicVariant;
    }

    public final boolean getShowPlanSelectorFromDeeplink() {
        return this.showPlanSelectorFromDeeplink;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinalTermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState$Screen;", "", "<init>", "(Ljava/lang/String;I)V", "TERMS", "FREE_GOLD", "BONUS_POINTS", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Screen {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;
        public static final Screen TERMS = new Screen("TERMS", 0);
        public static final Screen FREE_GOLD = new Screen("FREE_GOLD", 1);
        public static final Screen BONUS_POINTS = new Screen("BONUS_POINTS", 2);

        private static final /* synthetic */ Screen[] $values() {
            return new Screen[]{TERMS, FREE_GOLD, BONUS_POINTS};
        }

        public static EnumEntries<Screen> getEntries() {
            return $ENTRIES;
        }

        private Screen(String str, int i) {
        }

        static {
            Screen[] screenArr$values = $values();
            $VALUES = screenArr$values;
            $ENTRIES = EnumEntries2.enumEntries(screenArr$values);
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }
}
