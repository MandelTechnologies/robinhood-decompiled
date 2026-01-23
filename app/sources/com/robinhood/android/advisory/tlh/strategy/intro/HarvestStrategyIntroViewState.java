package com.robinhood.android.advisory.tlh.strategy.intro;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesLoading;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HarvestStrategyIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState$Loaded;", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState$Loading;", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface HarvestStrategyIntroViewState {

    /* compiled from: HarvestStrategyIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState$Loading;", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesLoading;", "<init>", "(Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesLoading;)V", "getData", "()Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesLoading;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements HarvestStrategyIntroViewState {
        public static final int $stable = 8;
        private final TaxLossHarvestStrategiesLoading data;

        public static /* synthetic */ Loading copy$default(Loading loading, TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading, int i, Object obj) {
            if ((i & 1) != 0) {
                taxLossHarvestStrategiesLoading = loading.data;
            }
            return loading.copy(taxLossHarvestStrategiesLoading);
        }

        /* renamed from: component1, reason: from getter */
        public final TaxLossHarvestStrategiesLoading getData() {
            return this.data;
        }

        public final Loading copy(TaxLossHarvestStrategiesLoading data) {
            return new Loading(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.data, ((Loading) other).data);
        }

        public int hashCode() {
            TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading = this.data;
            if (taxLossHarvestStrategiesLoading == null) {
                return 0;
            }
            return taxLossHarvestStrategiesLoading.hashCode();
        }

        public String toString() {
            return "Loading(data=" + this.data + ")";
        }

        public Loading(TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading) {
            this.data = taxLossHarvestStrategiesLoading;
        }

        public final TaxLossHarvestStrategiesLoading getData() {
            return this.data;
        }
    }

    /* compiled from: HarvestStrategyIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState$Loaded;", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState;", "title", "", "description", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, AccountOverviewOptionsSettingCard4.CTA, "showStrategySelectionScreenAfter", "", MarkdownText4.TagImageUrl, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getDisclosure", "getCta", "getShowStrategySelectionScreenAfter", "()Z", "getImageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements HarvestStrategyIntroViewState {
        public static final int $stable = 0;
        private final String cta;
        private final String description;
        private final String disclosure;
        private final String imageUrl;
        private final boolean showStrategySelectionScreenAfter;
        private final String title;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                str2 = loaded.description;
            }
            if ((i & 4) != 0) {
                str3 = loaded.disclosure;
            }
            if ((i & 8) != 0) {
                str4 = loaded.cta;
            }
            if ((i & 16) != 0) {
                z = loaded.showStrategySelectionScreenAfter;
            }
            if ((i & 32) != 0) {
                str5 = loaded.imageUrl;
            }
            boolean z2 = z;
            String str6 = str5;
            return loaded.copy(str, str2, str3, str4, z2, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCta() {
            return this.cta;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowStrategySelectionScreenAfter() {
            return this.showStrategySelectionScreenAfter;
        }

        /* renamed from: component6, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final Loaded copy(String title, String description, String disclosure, String cta, boolean showStrategySelectionScreenAfter, String imageUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(cta, "cta");
            return new Loaded(title, description, disclosure, cta, showStrategySelectionScreenAfter, imageUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.description, loaded.description) && Intrinsics.areEqual(this.disclosure, loaded.disclosure) && Intrinsics.areEqual(this.cta, loaded.cta) && this.showStrategySelectionScreenAfter == loaded.showStrategySelectionScreenAfter && Intrinsics.areEqual(this.imageUrl, loaded.imageUrl);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.disclosure.hashCode()) * 31) + this.cta.hashCode()) * 31) + Boolean.hashCode(this.showStrategySelectionScreenAfter)) * 31;
            String str = this.imageUrl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", description=" + this.description + ", disclosure=" + this.disclosure + ", cta=" + this.cta + ", showStrategySelectionScreenAfter=" + this.showStrategySelectionScreenAfter + ", imageUrl=" + this.imageUrl + ")";
        }

        public Loaded(String title, String description, String disclosure, String cta, boolean z, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(cta, "cta");
            this.title = title;
            this.description = description;
            this.disclosure = disclosure;
            this.cta = cta;
            this.showStrategySelectionScreenAfter = z;
            this.imageUrl = str;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDisclosure() {
            return this.disclosure;
        }

        public final String getCta() {
            return this.cta;
        }

        public final boolean getShowStrategySelectionScreenAfter() {
            return this.showStrategySelectionScreenAfter;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }
    }
}
