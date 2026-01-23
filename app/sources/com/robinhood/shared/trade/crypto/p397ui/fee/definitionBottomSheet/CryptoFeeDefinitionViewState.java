package com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet;

import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeDefinitionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState$Loading;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoFeeDefinitionViewState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoFeeDefinitionViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoFeeDefinitionViewState() {
    }

    /* compiled from: CryptoFeeDefinitionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState$Loading;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState;", "showBannerLoading", "", "<init>", "(Z)V", "getShowBannerLoading", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoFeeDefinitionViewState {
        public static final int $stable = 0;
        private final boolean showBannerLoading;

        public static /* synthetic */ Loading copy$default(Loading loading, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loading.showBannerLoading;
            }
            return loading.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowBannerLoading() {
            return this.showBannerLoading;
        }

        public final Loading copy(boolean showBannerLoading) {
            return new Loading(showBannerLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.showBannerLoading == ((Loading) other).showBannerLoading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showBannerLoading);
        }

        public String toString() {
            return "Loading(showBannerLoading=" + this.showBannerLoading + ")";
        }

        public Loading(boolean z) {
            super(null);
            this.showBannerLoading = z;
        }

        public final boolean getShowBannerLoading() {
            return this.showBannerLoading;
        }
    }

    /* compiled from: CryptoFeeDefinitionViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState;", "bodyText", "Lcom/robinhood/utils/resource/StringResource;", "bannerText", "primaryCtaText", "learnMoreUrl", "feeStructure", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;)V", "getBodyText", "()Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "getPrimaryCtaText", "getLearnMoreUrl", "getFeeStructure", "()Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends CryptoFeeDefinitionViewState {
        public static final int $stable = StringResource.$stable;
        private final StringResource bannerText;
        private final StringResource bodyText;
        private final CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure;
        private final StringResource learnMoreUrl;
        private final StringResource primaryCtaText;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loaded.bodyText;
            }
            if ((i & 2) != 0) {
                stringResource2 = loaded.bannerText;
            }
            if ((i & 4) != 0) {
                stringResource3 = loaded.primaryCtaText;
            }
            if ((i & 8) != 0) {
                stringResource4 = loaded.learnMoreUrl;
            }
            if ((i & 16) != 0) {
                feeStructure = loaded.feeStructure;
            }
            CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure2 = feeStructure;
            StringResource stringResource5 = stringResource3;
            return loaded.copy(stringResource, stringResource2, stringResource5, stringResource4, feeStructure2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getBodyText() {
            return this.bodyText;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getBannerText() {
            return this.bannerText;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getPrimaryCtaText() {
            return this.primaryCtaText;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getLearnMoreUrl() {
            return this.learnMoreUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure getFeeStructure() {
            return this.feeStructure;
        }

        public final Loaded copy(StringResource bodyText, StringResource bannerText, StringResource primaryCtaText, StringResource learnMoreUrl, CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure) {
            Intrinsics.checkNotNullParameter(bodyText, "bodyText");
            Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
            Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
            Intrinsics.checkNotNullParameter(feeStructure, "feeStructure");
            return new Loaded(bodyText, bannerText, primaryCtaText, learnMoreUrl, feeStructure);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.bodyText, loaded.bodyText) && Intrinsics.areEqual(this.bannerText, loaded.bannerText) && Intrinsics.areEqual(this.primaryCtaText, loaded.primaryCtaText) && Intrinsics.areEqual(this.learnMoreUrl, loaded.learnMoreUrl) && this.feeStructure == loaded.feeStructure;
        }

        public int hashCode() {
            int iHashCode = this.bodyText.hashCode() * 31;
            StringResource stringResource = this.bannerText;
            return ((((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.primaryCtaText.hashCode()) * 31) + this.learnMoreUrl.hashCode()) * 31) + this.feeStructure.hashCode();
        }

        public String toString() {
            return "Loaded(bodyText=" + this.bodyText + ", bannerText=" + this.bannerText + ", primaryCtaText=" + this.primaryCtaText + ", learnMoreUrl=" + this.learnMoreUrl + ", feeStructure=" + this.feeStructure + ")";
        }

        public final StringResource getBodyText() {
            return this.bodyText;
        }

        public final StringResource getBannerText() {
            return this.bannerText;
        }

        public final StringResource getPrimaryCtaText() {
            return this.primaryCtaText;
        }

        public final StringResource getLearnMoreUrl() {
            return this.learnMoreUrl;
        }

        public final CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure getFeeStructure() {
            return this.feeStructure;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(StringResource bodyText, StringResource stringResource, StringResource primaryCtaText, StringResource learnMoreUrl, CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure) {
            super(null);
            Intrinsics.checkNotNullParameter(bodyText, "bodyText");
            Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
            Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
            Intrinsics.checkNotNullParameter(feeStructure, "feeStructure");
            this.bodyText = bodyText;
            this.bannerText = stringResource;
            this.primaryCtaText = primaryCtaText;
            this.learnMoreUrl = learnMoreUrl;
            this.feeStructure = feeStructure;
        }
    }
}
