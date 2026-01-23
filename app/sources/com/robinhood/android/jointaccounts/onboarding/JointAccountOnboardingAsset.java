package com.robinhood.android.jointaccounts.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: JointAccountOnboardingAsset.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset;", "", "assetName", "", "getAssetName", "()Ljava/lang/String;", "url", "getUrl", "Fullscreen", "Hero", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Fullscreen;", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Hero;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface JointAccountOnboardingAsset {
    String getAssetName();

    String getUrl();

    /* compiled from: JointAccountOnboardingAsset.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static String getUrl(JointAccountOnboardingAsset jointAccountOnboardingAsset) {
            return JointAccountOnboardingAsset2.assetUrl(jointAccountOnboardingAsset.getAssetName());
        }
    }

    /* compiled from: JointAccountOnboardingAsset.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0014R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Fullscreen;", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset;", "spacerWeight", "", "getSpacerWeight", "()F", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "bodyVisibilityFrame", "getBodyVisibilityFrame", "bodyAnimationDuration", "", "getBodyAnimationDuration", "()I", "topPadding", "Landroidx/compose/ui/unit/Dp;", "getTopPadding", "(Landroidx/compose/runtime/Composer;I)F", "PrimaryIntroVariant2", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Fullscreen$PrimaryIntroVariant2;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Fullscreen extends JointAccountOnboardingAsset {
        int getBodyAnimationDuration();

        float getBodyVisibilityFrame();

        String getIdentifier();

        float getSpacerWeight();

        @JvmName
        float getTopPadding(Composer composer, int i);

        /* compiled from: JointAccountOnboardingAsset.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static String getUrl(Fullscreen fullscreen) {
                return DefaultImpls.getUrl(fullscreen);
            }
        }

        /* compiled from: JointAccountOnboardingAsset.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0011HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Fullscreen$PrimaryIntroVariant2;", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Fullscreen;", "<init>", "()V", "assetName", "", "getAssetName", "()Ljava/lang/String;", "spacerWeight", "", "getSpacerWeight", "()F", "identifier", "getIdentifier", "bodyVisibilityFrame", "getBodyVisibilityFrame", "bodyAnimationDuration", "", "getBodyAnimationDuration", "()I", "topPadding", "Landroidx/compose/ui/unit/Dp;", "getTopPadding", "(Landroidx/compose/runtime/Composer;I)F", "equals", "", "other", "", "hashCode", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PrimaryIntroVariant2 implements Fullscreen {
            public static final int $stable = 0;
            public static final PrimaryIntroVariant2 INSTANCE = new PrimaryIntroVariant2();
            private static final String assetName = "joint_account_primary_intro_variant_2_v15";
            private static final float spacerWeight = 0.4f;
            private static final String identifier = "small-image";
            private static final float bodyVisibilityFrame = 34.0f;
            private static final int bodyAnimationDuration = 1667;

            public boolean equals(Object other) {
                return this == other || (other instanceof PrimaryIntroVariant2);
            }

            public int hashCode() {
                return -1292367539;
            }

            public String toString() {
                return "PrimaryIntroVariant2";
            }

            private PrimaryIntroVariant2() {
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset
            public String getUrl() {
                return DefaultImpls.getUrl(this);
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset
            public String getAssetName() {
                return assetName;
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Fullscreen
            public float getSpacerWeight() {
                return spacerWeight;
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Fullscreen
            public String getIdentifier() {
                return identifier;
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Fullscreen
            public float getBodyVisibilityFrame() {
                return bodyVisibilityFrame;
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Fullscreen
            public int getBodyAnimationDuration() {
                return bodyAnimationDuration;
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Fullscreen
            @JvmName
            public float getTopPadding(Composer composer, int i) {
                composer.startReplaceGroup(1482011370);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1482011370, i, -1, "com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Fullscreen.PrimaryIntroVariant2.<get-topPadding> (JointAccountOnboardingAsset.kt:48)");
                }
                float fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return fM21593getSmallD9Ej5fM;
            }
        }
    }

    /* compiled from: JointAccountOnboardingAsset.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Hero;", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset;", "weight", "", "getWeight", "()F", "padding", "Landroidx/compose/ui/unit/Dp;", "getPadding", "(Landroidx/compose/runtime/Composer;I)F", "Confirmation", "Created", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Hero$Confirmation;", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Hero$Created;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Hero extends JointAccountOnboardingAsset {
        @JvmName
        float getPadding(Composer composer, int i);

        float getWeight();

        /* compiled from: JointAccountOnboardingAsset.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static String getUrl(Hero hero) {
                return DefaultImpls.getUrl(hero);
            }
        }

        /* compiled from: JointAccountOnboardingAsset.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Hero$Confirmation;", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Hero;", "<init>", "()V", "assetName", "", "getAssetName", "()Ljava/lang/String;", "weight", "", "getWeight", "()F", "padding", "Landroidx/compose/ui/unit/Dp;", "getPadding", "(Landroidx/compose/runtime/Composer;I)F", "equals", "", "other", "", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Confirmation implements Hero {
            public static final int $stable = 0;
            public static final Confirmation INSTANCE = new Confirmation();
            private static final String assetName = "joint_account_confirmation";
            private static final float weight = 1.0f;

            public boolean equals(Object other) {
                return this == other || (other instanceof Confirmation);
            }

            public int hashCode() {
                return -1178441748;
            }

            public String toString() {
                return "Confirmation";
            }

            private Confirmation() {
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset
            public String getUrl() {
                return DefaultImpls.getUrl(this);
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset
            public String getAssetName() {
                return assetName;
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Hero
            public float getWeight() {
                return weight;
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Hero
            @JvmName
            public float getPadding(Composer composer, int i) {
                composer.startReplaceGroup(474059015);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(474059015, i, -1, "com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Hero.Confirmation.<get-padding> (JointAccountOnboardingAsset.kt:66)");
                }
                float fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return fM21594getXlargeD9Ej5fM;
            }
        }

        /* compiled from: JointAccountOnboardingAsset.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Hero$Created;", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Hero;", "<init>", "()V", "assetName", "", "getAssetName", "()Ljava/lang/String;", "weight", "", "getWeight", "()F", "padding", "Landroidx/compose/ui/unit/Dp;", "getPadding", "(Landroidx/compose/runtime/Composer;I)F", "equals", "", "other", "", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Created implements Hero {
            public static final int $stable = 0;
            public static final Created INSTANCE = new Created();
            private static final String assetName = "joint_account_created_v20";
            private static final float weight = 1.25f;

            public boolean equals(Object other) {
                return this == other || (other instanceof Created);
            }

            public int hashCode() {
                return 1226829009;
            }

            public String toString() {
                return "Created";
            }

            private Created() {
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset
            public String getUrl() {
                return DefaultImpls.getUrl(this);
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset
            public String getAssetName() {
                return assetName;
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Hero
            public float getWeight() {
                return weight;
            }

            @Override // com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Hero
            @JvmName
            public float getPadding(Composer composer, int i) {
                composer.startReplaceGroup(-141216698);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-141216698, i, -1, "com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset.Hero.Created.<get-padding> (JointAccountOnboardingAsset.kt:76)");
                }
                float fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return fM21593getSmallD9Ej5fM;
            }
        }
    }
}
