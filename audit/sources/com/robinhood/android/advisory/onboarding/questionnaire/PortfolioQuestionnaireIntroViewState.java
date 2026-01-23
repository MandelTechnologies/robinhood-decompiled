package com.robinhood.android.advisory.onboarding.questionnaire;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioQuestionnaireIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00019Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00101\u001a\u00020\u0012HÆ\u0003J\t\u00102\u001a\u00020\u0012HÆ\u0003J}\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001J\u0013\u00104\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState;", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "loggingIdentifier", "", "source", "asset", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset;", "errorDialogData", "Lcom/robinhood/android/advisory/onboarding/questionnaire/ErrorDialogData;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "applicationId", "Ljava/util/UUID;", "loading", "", "useGradientBackground", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset;Lcom/robinhood/android/advisory/onboarding/questionnaire/ErrorDialogData;Ljava/lang/String;Ljava/util/UUID;ZZ)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getLoggingIdentifier", "()Ljava/lang/String;", "getSource", "getAsset", "()Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset;", "getErrorDialogData", "()Lcom/robinhood/android/advisory/onboarding/questionnaire/ErrorDialogData;", "getDisclosure", "getApplicationId", "()Ljava/util/UUID;", "getLoading", "()Z", "getUseGradientBackground", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "Asset", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PortfolioQuestionnaireIntroViewState {
    public static final int $stable = 8;
    private final UUID applicationId;
    private final Asset asset;
    private final BrokerageAccountType brokerageAccountType;
    private final String disclosure;
    private final ErrorDialogData errorDialogData;
    private final boolean loading;
    private final String loggingIdentifier;
    private final String source;
    private final StringResource subtitle;
    private final StringResource title;
    private final boolean useGradientBackground;

    public static /* synthetic */ PortfolioQuestionnaireIntroViewState copy$default(PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState, BrokerageAccountType brokerageAccountType, StringResource stringResource, StringResource stringResource2, String str, String str2, Asset asset, ErrorDialogData errorDialogData, String str3, UUID uuid, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = portfolioQuestionnaireIntroViewState.brokerageAccountType;
        }
        if ((i & 2) != 0) {
            stringResource = portfolioQuestionnaireIntroViewState.title;
        }
        if ((i & 4) != 0) {
            stringResource2 = portfolioQuestionnaireIntroViewState.subtitle;
        }
        if ((i & 8) != 0) {
            str = portfolioQuestionnaireIntroViewState.loggingIdentifier;
        }
        if ((i & 16) != 0) {
            str2 = portfolioQuestionnaireIntroViewState.source;
        }
        if ((i & 32) != 0) {
            asset = portfolioQuestionnaireIntroViewState.asset;
        }
        if ((i & 64) != 0) {
            errorDialogData = portfolioQuestionnaireIntroViewState.errorDialogData;
        }
        if ((i & 128) != 0) {
            str3 = portfolioQuestionnaireIntroViewState.disclosure;
        }
        if ((i & 256) != 0) {
            uuid = portfolioQuestionnaireIntroViewState.applicationId;
        }
        if ((i & 512) != 0) {
            z = portfolioQuestionnaireIntroViewState.loading;
        }
        if ((i & 1024) != 0) {
            z2 = portfolioQuestionnaireIntroViewState.useGradientBackground;
        }
        boolean z3 = z;
        boolean z4 = z2;
        String str4 = str3;
        UUID uuid2 = uuid;
        Asset asset2 = asset;
        ErrorDialogData errorDialogData2 = errorDialogData;
        String str5 = str2;
        StringResource stringResource3 = stringResource2;
        return portfolioQuestionnaireIntroViewState.copy(brokerageAccountType, stringResource, stringResource3, str, str5, asset2, errorDialogData2, str4, uuid2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getUseGradientBackground() {
        return this.useGradientBackground;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component6, reason: from getter */
    public final Asset getAsset() {
        return this.asset;
    }

    /* renamed from: component7, reason: from getter */
    public final ErrorDialogData getErrorDialogData() {
        return this.errorDialogData;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component9, reason: from getter */
    public final UUID getApplicationId() {
        return this.applicationId;
    }

    public final PortfolioQuestionnaireIntroViewState copy(BrokerageAccountType brokerageAccountType, StringResource title, StringResource subtitle, String loggingIdentifier, String source, Asset asset, ErrorDialogData errorDialogData, String disclosure, UUID applicationId, boolean loading, boolean useGradientBackground) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(asset, "asset");
        return new PortfolioQuestionnaireIntroViewState(brokerageAccountType, title, subtitle, loggingIdentifier, source, asset, errorDialogData, disclosure, applicationId, loading, useGradientBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioQuestionnaireIntroViewState)) {
            return false;
        }
        PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState = (PortfolioQuestionnaireIntroViewState) other;
        return this.brokerageAccountType == portfolioQuestionnaireIntroViewState.brokerageAccountType && Intrinsics.areEqual(this.title, portfolioQuestionnaireIntroViewState.title) && Intrinsics.areEqual(this.subtitle, portfolioQuestionnaireIntroViewState.subtitle) && Intrinsics.areEqual(this.loggingIdentifier, portfolioQuestionnaireIntroViewState.loggingIdentifier) && Intrinsics.areEqual(this.source, portfolioQuestionnaireIntroViewState.source) && Intrinsics.areEqual(this.asset, portfolioQuestionnaireIntroViewState.asset) && Intrinsics.areEqual(this.errorDialogData, portfolioQuestionnaireIntroViewState.errorDialogData) && Intrinsics.areEqual(this.disclosure, portfolioQuestionnaireIntroViewState.disclosure) && Intrinsics.areEqual(this.applicationId, portfolioQuestionnaireIntroViewState.applicationId) && this.loading == portfolioQuestionnaireIntroViewState.loading && this.useGradientBackground == portfolioQuestionnaireIntroViewState.useGradientBackground;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.brokerageAccountType.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.loggingIdentifier.hashCode()) * 31) + this.source.hashCode()) * 31) + this.asset.hashCode()) * 31;
        ErrorDialogData errorDialogData = this.errorDialogData;
        int iHashCode2 = (iHashCode + (errorDialogData == null ? 0 : errorDialogData.hashCode())) * 31;
        String str = this.disclosure;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid = this.applicationId;
        return ((((iHashCode3 + (uuid != null ? uuid.hashCode() : 0)) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.useGradientBackground);
    }

    public String toString() {
        return "PortfolioQuestionnaireIntroViewState(brokerageAccountType=" + this.brokerageAccountType + ", title=" + this.title + ", subtitle=" + this.subtitle + ", loggingIdentifier=" + this.loggingIdentifier + ", source=" + this.source + ", asset=" + this.asset + ", errorDialogData=" + this.errorDialogData + ", disclosure=" + this.disclosure + ", applicationId=" + this.applicationId + ", loading=" + this.loading + ", useGradientBackground=" + this.useGradientBackground + ")";
    }

    public PortfolioQuestionnaireIntroViewState(BrokerageAccountType brokerageAccountType, StringResource title, StringResource subtitle, String loggingIdentifier, String source, Asset asset, ErrorDialogData errorDialogData, String str, UUID uuid, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.brokerageAccountType = brokerageAccountType;
        this.title = title;
        this.subtitle = subtitle;
        this.loggingIdentifier = loggingIdentifier;
        this.source = source;
        this.asset = asset;
        this.errorDialogData = errorDialogData;
        this.disclosure = str;
        this.applicationId = uuid;
        this.loading = z;
        this.useGradientBackground = z2;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final String getSource() {
        return this.source;
    }

    public final Asset getAsset() {
        return this.asset;
    }

    public final ErrorDialogData getErrorDialogData() {
        return this.errorDialogData;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final UUID getApplicationId() {
        return this.applicationId;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getUseGradientBackground() {
        return this.useGradientBackground;
    }

    /* compiled from: PortfolioQuestionnaireIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset;", "", "Video", "Lottie", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset$Lottie;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset$Video;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Asset {

        /* compiled from: PortfolioQuestionnaireIntroViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset$Video;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Video implements Asset {
            public static final int $stable = 0;
            public static final Video INSTANCE = new Video();

            public boolean equals(Object other) {
                return this == other || (other instanceof Video);
            }

            public int hashCode() {
                return 434266087;
            }

            public String toString() {
                return "Video";
            }

            private Video() {
            }
        }

        /* compiled from: PortfolioQuestionnaireIntroViewState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset$Lottie;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset;", "light", "", "dark", "iterateForever", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getLight", "()Ljava/lang/String;", "getDark", "getIterateForever", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Lottie implements Asset {
            public static final int $stable = 0;
            private final String dark;
            private final boolean iterateForever;
            private final String light;

            public static /* synthetic */ Lottie copy$default(Lottie lottie, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = lottie.light;
                }
                if ((i & 2) != 0) {
                    str2 = lottie.dark;
                }
                if ((i & 4) != 0) {
                    z = lottie.iterateForever;
                }
                return lottie.copy(str, str2, z);
            }

            /* renamed from: component1, reason: from getter */
            public final String getLight() {
                return this.light;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDark() {
                return this.dark;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIterateForever() {
                return this.iterateForever;
            }

            public final Lottie copy(String light, String dark, boolean iterateForever) {
                Intrinsics.checkNotNullParameter(light, "light");
                Intrinsics.checkNotNullParameter(dark, "dark");
                return new Lottie(light, dark, iterateForever);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Lottie)) {
                    return false;
                }
                Lottie lottie = (Lottie) other;
                return Intrinsics.areEqual(this.light, lottie.light) && Intrinsics.areEqual(this.dark, lottie.dark) && this.iterateForever == lottie.iterateForever;
            }

            public int hashCode() {
                return (((this.light.hashCode() * 31) + this.dark.hashCode()) * 31) + Boolean.hashCode(this.iterateForever);
            }

            public String toString() {
                return "Lottie(light=" + this.light + ", dark=" + this.dark + ", iterateForever=" + this.iterateForever + ")";
            }

            public Lottie(String light, String dark, boolean z) {
                Intrinsics.checkNotNullParameter(light, "light");
                Intrinsics.checkNotNullParameter(dark, "dark");
                this.light = light;
                this.dark = dark;
                this.iterateForever = z;
            }

            public /* synthetic */ Lottie(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? false : z);
            }

            public final String getLight() {
                return this.light;
            }

            public final String getDark() {
                return this.dark;
            }

            public final boolean getIterateForever() {
                return this.iterateForever;
            }
        }
    }
}
