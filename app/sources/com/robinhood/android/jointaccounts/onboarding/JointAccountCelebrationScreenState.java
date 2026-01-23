package com.robinhood.android.jointaccounts.onboarding;

import com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCta;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountCelebrationScreen.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Je\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenState;", "", "titleText", "", "bodyText", "asset", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset;", "primaryCta", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;", "secondaryCta", "showCloseButton", "", "animationData", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenAnimationData;", "textStyleData", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenTextStyleData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset;Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;ZLcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenAnimationData;Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenTextStyleData;)V", "getTitleText", "()Ljava/lang/String;", "getBodyText", "getAsset", "()Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset;", "getPrimaryCta", "()Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;", "getSecondaryCta", "getShowCloseButton", "()Z", "getAnimationData", "()Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenAnimationData;", "getTextStyleData", "()Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenTextStyleData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JointAccountCelebrationScreenState {
    public static final int $stable = 8;
    private final JointAccountCelebrationScreenAnimationData animationData;
    private final JointAccountOnboardingAsset asset;
    private final String bodyText;
    private final JointAccountCta primaryCta;
    private final JointAccountCta secondaryCta;
    private final boolean showCloseButton;
    private final JointAccountCelebrationScreenTextStyleData textStyleData;
    private final String titleText;

    public static /* synthetic */ JointAccountCelebrationScreenState copy$default(JointAccountCelebrationScreenState jointAccountCelebrationScreenState, String str, String str2, JointAccountOnboardingAsset jointAccountOnboardingAsset, JointAccountCta jointAccountCta, JointAccountCta jointAccountCta2, boolean z, JointAccountCelebrationScreenAnimationData jointAccountCelebrationScreenAnimationData, JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jointAccountCelebrationScreenState.titleText;
        }
        if ((i & 2) != 0) {
            str2 = jointAccountCelebrationScreenState.bodyText;
        }
        if ((i & 4) != 0) {
            jointAccountOnboardingAsset = jointAccountCelebrationScreenState.asset;
        }
        if ((i & 8) != 0) {
            jointAccountCta = jointAccountCelebrationScreenState.primaryCta;
        }
        if ((i & 16) != 0) {
            jointAccountCta2 = jointAccountCelebrationScreenState.secondaryCta;
        }
        if ((i & 32) != 0) {
            z = jointAccountCelebrationScreenState.showCloseButton;
        }
        if ((i & 64) != 0) {
            jointAccountCelebrationScreenAnimationData = jointAccountCelebrationScreenState.animationData;
        }
        if ((i & 128) != 0) {
            jointAccountCelebrationScreenTextStyleData = jointAccountCelebrationScreenState.textStyleData;
        }
        JointAccountCelebrationScreenAnimationData jointAccountCelebrationScreenAnimationData2 = jointAccountCelebrationScreenAnimationData;
        JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData2 = jointAccountCelebrationScreenTextStyleData;
        JointAccountCta jointAccountCta3 = jointAccountCta2;
        boolean z2 = z;
        return jointAccountCelebrationScreenState.copy(str, str2, jointAccountOnboardingAsset, jointAccountCta, jointAccountCta3, z2, jointAccountCelebrationScreenAnimationData2, jointAccountCelebrationScreenTextStyleData2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* renamed from: component3, reason: from getter */
    public final JointAccountOnboardingAsset getAsset() {
        return this.asset;
    }

    /* renamed from: component4, reason: from getter */
    public final JointAccountCta getPrimaryCta() {
        return this.primaryCta;
    }

    /* renamed from: component5, reason: from getter */
    public final JointAccountCta getSecondaryCta() {
        return this.secondaryCta;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    /* renamed from: component7, reason: from getter */
    public final JointAccountCelebrationScreenAnimationData getAnimationData() {
        return this.animationData;
    }

    /* renamed from: component8, reason: from getter */
    public final JointAccountCelebrationScreenTextStyleData getTextStyleData() {
        return this.textStyleData;
    }

    public final JointAccountCelebrationScreenState copy(String titleText, String bodyText, JointAccountOnboardingAsset asset, JointAccountCta primaryCta, JointAccountCta secondaryCta, boolean showCloseButton, JointAccountCelebrationScreenAnimationData animationData, JointAccountCelebrationScreenTextStyleData textStyleData) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        return new JointAccountCelebrationScreenState(titleText, bodyText, asset, primaryCta, secondaryCta, showCloseButton, animationData, textStyleData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JointAccountCelebrationScreenState)) {
            return false;
        }
        JointAccountCelebrationScreenState jointAccountCelebrationScreenState = (JointAccountCelebrationScreenState) other;
        return Intrinsics.areEqual(this.titleText, jointAccountCelebrationScreenState.titleText) && Intrinsics.areEqual(this.bodyText, jointAccountCelebrationScreenState.bodyText) && Intrinsics.areEqual(this.asset, jointAccountCelebrationScreenState.asset) && Intrinsics.areEqual(this.primaryCta, jointAccountCelebrationScreenState.primaryCta) && Intrinsics.areEqual(this.secondaryCta, jointAccountCelebrationScreenState.secondaryCta) && this.showCloseButton == jointAccountCelebrationScreenState.showCloseButton && Intrinsics.areEqual(this.animationData, jointAccountCelebrationScreenState.animationData) && Intrinsics.areEqual(this.textStyleData, jointAccountCelebrationScreenState.textStyleData);
    }

    public int hashCode() {
        String str = this.titleText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bodyText;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.asset.hashCode()) * 31;
        JointAccountCta jointAccountCta = this.primaryCta;
        int iHashCode3 = (iHashCode2 + (jointAccountCta == null ? 0 : jointAccountCta.hashCode())) * 31;
        JointAccountCta jointAccountCta2 = this.secondaryCta;
        int iHashCode4 = (((iHashCode3 + (jointAccountCta2 == null ? 0 : jointAccountCta2.hashCode())) * 31) + Boolean.hashCode(this.showCloseButton)) * 31;
        JointAccountCelebrationScreenAnimationData jointAccountCelebrationScreenAnimationData = this.animationData;
        int iHashCode5 = (iHashCode4 + (jointAccountCelebrationScreenAnimationData == null ? 0 : jointAccountCelebrationScreenAnimationData.hashCode())) * 31;
        JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData = this.textStyleData;
        return iHashCode5 + (jointAccountCelebrationScreenTextStyleData != null ? jointAccountCelebrationScreenTextStyleData.hashCode() : 0);
    }

    public String toString() {
        return "JointAccountCelebrationScreenState(titleText=" + this.titleText + ", bodyText=" + this.bodyText + ", asset=" + this.asset + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", showCloseButton=" + this.showCloseButton + ", animationData=" + this.animationData + ", textStyleData=" + this.textStyleData + ")";
    }

    public JointAccountCelebrationScreenState(String str, String str2, JointAccountOnboardingAsset asset, JointAccountCta jointAccountCta, JointAccountCta jointAccountCta2, boolean z, JointAccountCelebrationScreenAnimationData jointAccountCelebrationScreenAnimationData, JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.titleText = str;
        this.bodyText = str2;
        this.asset = asset;
        this.primaryCta = jointAccountCta;
        this.secondaryCta = jointAccountCta2;
        this.showCloseButton = z;
        this.animationData = jointAccountCelebrationScreenAnimationData;
        this.textStyleData = jointAccountCelebrationScreenTextStyleData;
    }

    public /* synthetic */ JointAccountCelebrationScreenState(String str, String str2, JointAccountOnboardingAsset jointAccountOnboardingAsset, JointAccountCta jointAccountCta, JointAccountCta jointAccountCta2, boolean z, JointAccountCelebrationScreenAnimationData jointAccountCelebrationScreenAnimationData, JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, jointAccountOnboardingAsset, jointAccountCta, (i & 16) != 0 ? null : jointAccountCta2, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : jointAccountCelebrationScreenAnimationData, (i & 128) != 0 ? null : jointAccountCelebrationScreenTextStyleData);
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final String getBodyText() {
        return this.bodyText;
    }

    public final JointAccountOnboardingAsset getAsset() {
        return this.asset;
    }

    public final JointAccountCta getPrimaryCta() {
        return this.primaryCta;
    }

    public final JointAccountCta getSecondaryCta() {
        return this.secondaryCta;
    }

    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    public final JointAccountCelebrationScreenAnimationData getAnimationData() {
        return this.animationData;
    }

    public final JointAccountCelebrationScreenTextStyleData getTextStyleData() {
        return this.textStyleData;
    }
}
