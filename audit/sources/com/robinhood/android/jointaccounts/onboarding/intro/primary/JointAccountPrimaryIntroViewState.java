package com.robinhood.android.jointaccounts.onboarding.intro.primary;

import com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: JointAccountPrimaryIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState;", "", "Loading", "Loaded", "Error", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState$Error;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState$Loaded;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState$Loading;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface JointAccountPrimaryIntroViewState {

    /* compiled from: JointAccountPrimaryIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState$Loading;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements JointAccountPrimaryIntroViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -720884770;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: JointAccountPrimaryIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fHÆ\u0003Jy\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState$Loaded;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState;", "asset", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Fullscreen;", MarkdownText4.TagImageUrl, "", "bodyComponents", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "footerComponents", "ctaText", "ctaLoggingId", "source", "ineligibleBottomSheet", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "<init>", "(Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Fullscreen;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;)V", "getAsset", "()Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset$Fullscreen;", "getImageUrl", "()Ljava/lang/String;", "getBodyComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "getFooterComponents", "getCtaText", "getCtaLoggingId", "getSource", "getIneligibleBottomSheet", "()Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements JointAccountPrimaryIntroViewState {
        public static final int $stable = 8;
        private final JointAccountOnboardingAsset.Fullscreen asset;
        private final ImmutableList<UIComponent<GenericAction>> bodyComponents;
        private final String ctaLoggingId;
        private final String ctaText;
        private final ImmutableList<UIComponent<GenericAction>> footerComponents;
        private final String imageUrl;
        private final AlertAction<GenericAction> ineligibleBottomSheet;
        private final String source;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, JointAccountOnboardingAsset.Fullscreen fullscreen, String str, ImmutableList immutableList, ImmutableList immutableList2, String str2, String str3, String str4, AlertAction alertAction, int i, Object obj) {
            if ((i & 1) != 0) {
                fullscreen = loaded.asset;
            }
            if ((i & 2) != 0) {
                str = loaded.imageUrl;
            }
            if ((i & 4) != 0) {
                immutableList = loaded.bodyComponents;
            }
            if ((i & 8) != 0) {
                immutableList2 = loaded.footerComponents;
            }
            if ((i & 16) != 0) {
                str2 = loaded.ctaText;
            }
            if ((i & 32) != 0) {
                str3 = loaded.ctaLoggingId;
            }
            if ((i & 64) != 0) {
                str4 = loaded.source;
            }
            if ((i & 128) != 0) {
                alertAction = loaded.ineligibleBottomSheet;
            }
            String str5 = str4;
            AlertAction alertAction2 = alertAction;
            String str6 = str2;
            String str7 = str3;
            return loaded.copy(fullscreen, str, immutableList, immutableList2, str6, str7, str5, alertAction2);
        }

        /* renamed from: component1, reason: from getter */
        public final JointAccountOnboardingAsset.Fullscreen getAsset() {
            return this.asset;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final ImmutableList<UIComponent<GenericAction>> component3() {
            return this.bodyComponents;
        }

        public final ImmutableList<UIComponent<GenericAction>> component4() {
            return this.footerComponents;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCtaLoggingId() {
            return this.ctaLoggingId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final AlertAction<GenericAction> component8() {
            return this.ineligibleBottomSheet;
        }

        public final Loaded copy(JointAccountOnboardingAsset.Fullscreen asset, String imageUrl, ImmutableList<? extends UIComponent<? extends GenericAction>> bodyComponents, ImmutableList<? extends UIComponent<? extends GenericAction>> footerComponents, String ctaText, String ctaLoggingId, String source, AlertAction<? extends GenericAction> ineligibleBottomSheet) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(bodyComponents, "bodyComponents");
            Intrinsics.checkNotNullParameter(footerComponents, "footerComponents");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(ctaLoggingId, "ctaLoggingId");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Loaded(asset, imageUrl, bodyComponents, footerComponents, ctaText, ctaLoggingId, source, ineligibleBottomSheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.asset, loaded.asset) && Intrinsics.areEqual(this.imageUrl, loaded.imageUrl) && Intrinsics.areEqual(this.bodyComponents, loaded.bodyComponents) && Intrinsics.areEqual(this.footerComponents, loaded.footerComponents) && Intrinsics.areEqual(this.ctaText, loaded.ctaText) && Intrinsics.areEqual(this.ctaLoggingId, loaded.ctaLoggingId) && Intrinsics.areEqual(this.source, loaded.source) && Intrinsics.areEqual(this.ineligibleBottomSheet, loaded.ineligibleBottomSheet);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.asset.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.bodyComponents.hashCode()) * 31) + this.footerComponents.hashCode()) * 31) + this.ctaText.hashCode()) * 31) + this.ctaLoggingId.hashCode()) * 31) + this.source.hashCode()) * 31;
            AlertAction<GenericAction> alertAction = this.ineligibleBottomSheet;
            return iHashCode + (alertAction == null ? 0 : alertAction.hashCode());
        }

        public String toString() {
            return "Loaded(asset=" + this.asset + ", imageUrl=" + this.imageUrl + ", bodyComponents=" + this.bodyComponents + ", footerComponents=" + this.footerComponents + ", ctaText=" + this.ctaText + ", ctaLoggingId=" + this.ctaLoggingId + ", source=" + this.source + ", ineligibleBottomSheet=" + this.ineligibleBottomSheet + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(JointAccountOnboardingAsset.Fullscreen asset, String imageUrl, ImmutableList<? extends UIComponent<? extends GenericAction>> bodyComponents, ImmutableList<? extends UIComponent<? extends GenericAction>> footerComponents, String ctaText, String ctaLoggingId, String source, AlertAction<? extends GenericAction> alertAction) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(bodyComponents, "bodyComponents");
            Intrinsics.checkNotNullParameter(footerComponents, "footerComponents");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(ctaLoggingId, "ctaLoggingId");
            Intrinsics.checkNotNullParameter(source, "source");
            this.asset = asset;
            this.imageUrl = imageUrl;
            this.bodyComponents = bodyComponents;
            this.footerComponents = footerComponents;
            this.ctaText = ctaText;
            this.ctaLoggingId = ctaLoggingId;
            this.source = source;
            this.ineligibleBottomSheet = alertAction;
        }

        public final JointAccountOnboardingAsset.Fullscreen getAsset() {
            return this.asset;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final ImmutableList<UIComponent<GenericAction>> getBodyComponents() {
            return this.bodyComponents;
        }

        public final ImmutableList<UIComponent<GenericAction>> getFooterComponents() {
            return this.footerComponents;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public final String getCtaLoggingId() {
            return this.ctaLoggingId;
        }

        public final String getSource() {
            return this.source;
        }

        public final AlertAction<GenericAction> getIneligibleBottomSheet() {
            return this.ineligibleBottomSheet;
        }
    }

    /* compiled from: JointAccountPrimaryIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState$Error;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements JointAccountPrimaryIntroViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -1678615254;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }
}
