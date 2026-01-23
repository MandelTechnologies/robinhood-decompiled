package com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet;

import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.p375ui.feeTiers.FormatFeeRate;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeDefinitionDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDataState;", "", "<init>", "()V", "feeStructure", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;", "getFeeStructure", "()Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;", "Loading", "Loaded", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDataState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDataState$Loading;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoFeeDefinitionDataState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoFeeDefinitionDataState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure getFeeStructure();

    private CryptoFeeDefinitionDataState() {
    }

    /* compiled from: CryptoFeeDefinitionDataState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDataState$Loading;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDataState;", "feeStructure", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;)V", "getFeeStructure", "()Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;", "showBannerLoading", "", "getShowBannerLoading", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoFeeDefinitionDataState {
        public static final int $stable = 0;
        private final CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure;

        /* compiled from: CryptoFeeDefinitionDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure.values().length];
                try {
                    iArr[CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure.FIXED_RATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure.VOLUME_TIERED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Loading copy$default(Loading loading, CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure, int i, Object obj) {
            if ((i & 1) != 0) {
                feeStructure = loading.feeStructure;
            }
            return loading.copy(feeStructure);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure getFeeStructure() {
            return this.feeStructure;
        }

        public final Loading copy(CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure) {
            Intrinsics.checkNotNullParameter(feeStructure, "feeStructure");
            return new Loading(feeStructure);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.feeStructure == ((Loading) other).feeStructure;
        }

        public int hashCode() {
            return this.feeStructure.hashCode();
        }

        public String toString() {
            return "Loading(feeStructure=" + this.feeStructure + ")";
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionDataState
        public CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure getFeeStructure() {
            return this.feeStructure;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure) {
            super(null);
            Intrinsics.checkNotNullParameter(feeStructure, "feeStructure");
            this.feeStructure = feeStructure;
        }

        public final boolean getShowBannerLoading() {
            int i = WhenMappings.$EnumSwitchMapping$0[getFeeStructure().ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: CryptoFeeDefinitionDataState.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÂ\u0003J\t\u0010 \u001a\u00020\u0007HÂ\u0003J\t\u0010!\u001a\u00020\u0007HÂ\u0003J\t\u0010\"\u001a\u00020\u0007HÂ\u0003J\t\u0010#\u001a\u00020\fHÂ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDataState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDataState;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "feeRatio", "Ljava/math/BigDecimal;", "minFeeAmount", "robinhoodFeeRatio", "exchangeFeeRatio", "hasOrderExecutions", "", "feeStructure", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;)V", "getFeeStructure", "()Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;", "bodyText", "Lcom/robinhood/utils/resource/StringResource;", "getBodyText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerText", "getBannerText", "primaryCtaText", "getPrimaryCtaText", "learnMoreUrl", "getLearnMoreUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends CryptoFeeDefinitionDataState {
        public static final int $stable = 8;
        private final AppType appType;
        private final BigDecimal exchangeFeeRatio;
        private final BigDecimal feeRatio;
        private final CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure;
        private final boolean hasOrderExecutions;
        private final BigDecimal minFeeAmount;
        private final BigDecimal robinhoodFeeRatio;
        private final UiCurrencyPair uiCurrencyPair;

        /* compiled from: CryptoFeeDefinitionDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure.values().length];
                try {
                    iArr[CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure.FIXED_RATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure.VOLUME_TIERED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[AppType.values().length];
                try {
                    iArr2[AppType.TRADER.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[AppType.RHC.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* renamed from: component1, reason: from getter */
        private final AppType getAppType() {
            return this.appType;
        }

        /* renamed from: component2, reason: from getter */
        private final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* renamed from: component3, reason: from getter */
        private final BigDecimal getFeeRatio() {
            return this.feeRatio;
        }

        /* renamed from: component4, reason: from getter */
        private final BigDecimal getMinFeeAmount() {
            return this.minFeeAmount;
        }

        /* renamed from: component5, reason: from getter */
        private final BigDecimal getRobinhoodFeeRatio() {
            return this.robinhoodFeeRatio;
        }

        /* renamed from: component6, reason: from getter */
        private final BigDecimal getExchangeFeeRatio() {
            return this.exchangeFeeRatio;
        }

        /* renamed from: component7, reason: from getter */
        private final boolean getHasOrderExecutions() {
            return this.hasOrderExecutions;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, AppType appType, UiCurrencyPair uiCurrencyPair, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, boolean z, CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure, int i, Object obj) {
            if ((i & 1) != 0) {
                appType = loaded.appType;
            }
            if ((i & 2) != 0) {
                uiCurrencyPair = loaded.uiCurrencyPair;
            }
            if ((i & 4) != 0) {
                bigDecimal = loaded.feeRatio;
            }
            if ((i & 8) != 0) {
                bigDecimal2 = loaded.minFeeAmount;
            }
            if ((i & 16) != 0) {
                bigDecimal3 = loaded.robinhoodFeeRatio;
            }
            if ((i & 32) != 0) {
                bigDecimal4 = loaded.exchangeFeeRatio;
            }
            if ((i & 64) != 0) {
                z = loaded.hasOrderExecutions;
            }
            if ((i & 128) != 0) {
                feeStructure = loaded.feeStructure;
            }
            boolean z2 = z;
            CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure2 = feeStructure;
            BigDecimal bigDecimal5 = bigDecimal3;
            BigDecimal bigDecimal6 = bigDecimal4;
            return loaded.copy(appType, uiCurrencyPair, bigDecimal, bigDecimal2, bigDecimal5, bigDecimal6, z2, feeStructure2);
        }

        /* renamed from: component8, reason: from getter */
        public final CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure getFeeStructure() {
            return this.feeStructure;
        }

        public final Loaded copy(AppType appType, UiCurrencyPair uiCurrencyPair, BigDecimal feeRatio, BigDecimal minFeeAmount, BigDecimal robinhoodFeeRatio, BigDecimal exchangeFeeRatio, boolean hasOrderExecutions, CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(feeRatio, "feeRatio");
            Intrinsics.checkNotNullParameter(minFeeAmount, "minFeeAmount");
            Intrinsics.checkNotNullParameter(robinhoodFeeRatio, "robinhoodFeeRatio");
            Intrinsics.checkNotNullParameter(exchangeFeeRatio, "exchangeFeeRatio");
            Intrinsics.checkNotNullParameter(feeStructure, "feeStructure");
            return new Loaded(appType, uiCurrencyPair, feeRatio, minFeeAmount, robinhoodFeeRatio, exchangeFeeRatio, hasOrderExecutions, feeStructure);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.appType == loaded.appType && Intrinsics.areEqual(this.uiCurrencyPair, loaded.uiCurrencyPair) && Intrinsics.areEqual(this.feeRatio, loaded.feeRatio) && Intrinsics.areEqual(this.minFeeAmount, loaded.minFeeAmount) && Intrinsics.areEqual(this.robinhoodFeeRatio, loaded.robinhoodFeeRatio) && Intrinsics.areEqual(this.exchangeFeeRatio, loaded.exchangeFeeRatio) && this.hasOrderExecutions == loaded.hasOrderExecutions && this.feeStructure == loaded.feeStructure;
        }

        public int hashCode() {
            return (((((((((((((this.appType.hashCode() * 31) + this.uiCurrencyPair.hashCode()) * 31) + this.feeRatio.hashCode()) * 31) + this.minFeeAmount.hashCode()) * 31) + this.robinhoodFeeRatio.hashCode()) * 31) + this.exchangeFeeRatio.hashCode()) * 31) + Boolean.hashCode(this.hasOrderExecutions)) * 31) + this.feeStructure.hashCode();
        }

        public String toString() {
            return "Loaded(appType=" + this.appType + ", uiCurrencyPair=" + this.uiCurrencyPair + ", feeRatio=" + this.feeRatio + ", minFeeAmount=" + this.minFeeAmount + ", robinhoodFeeRatio=" + this.robinhoodFeeRatio + ", exchangeFeeRatio=" + this.exchangeFeeRatio + ", hasOrderExecutions=" + this.hasOrderExecutions + ", feeStructure=" + this.feeStructure + ")";
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionDataState
        public CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure getFeeStructure() {
            return this.feeStructure;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(AppType appType, UiCurrencyPair uiCurrencyPair, BigDecimal feeRatio, BigDecimal minFeeAmount, BigDecimal robinhoodFeeRatio, BigDecimal exchangeFeeRatio, boolean z, CryptoFeeDefinitionBottomSheetFragment.Args.FeeStructure feeStructure) {
            super(null);
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(feeRatio, "feeRatio");
            Intrinsics.checkNotNullParameter(minFeeAmount, "minFeeAmount");
            Intrinsics.checkNotNullParameter(robinhoodFeeRatio, "robinhoodFeeRatio");
            Intrinsics.checkNotNullParameter(exchangeFeeRatio, "exchangeFeeRatio");
            Intrinsics.checkNotNullParameter(feeStructure, "feeStructure");
            this.appType = appType;
            this.uiCurrencyPair = uiCurrencyPair;
            this.feeRatio = feeRatio;
            this.minFeeAmount = minFeeAmount;
            this.robinhoodFeeRatio = robinhoodFeeRatio;
            this.exchangeFeeRatio = exchangeFeeRatio;
            this.hasOrderExecutions = z;
            this.feeStructure = feeStructure;
        }

        public final StringResource getBodyText() {
            int i;
            int i2;
            int i3 = WhenMappings.$EnumSwitchMapping$1[this.appType.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return StringResource.INSTANCE.invoke(C40095R.string.crypto_eu_fee_definition_body, FormatFeeRate.formatFeeRate(this.feeRatio), CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getQuoteCurrency(), this.minFeeAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null));
                }
                throw new IllegalStateException("Unsupported app type");
            }
            int i4 = WhenMappings.$EnumSwitchMapping$0[getFeeStructure().ordinal()];
            if (i4 == 1) {
                StringResource.Companion companion = StringResource.INSTANCE;
                if (this.hasOrderExecutions) {
                    i = C40095R.string.crypto_fee_definition_body_with_executions;
                } else {
                    i = C40095R.string.crypto_fee_definition_body_without_executions;
                }
                return companion.invoke(i, FormatFeeRate.formatFeeRate(this.feeRatio), CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getQuoteCurrency(), this.minFeeAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null), FormatFeeRate.formatFeeRate(this.robinhoodFeeRatio), FormatFeeRate.formatFeeRate(this.exchangeFeeRatio));
            }
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            StringResource.Companion companion2 = StringResource.INSTANCE;
            if (this.hasOrderExecutions) {
                i2 = C40095R.string.crypto_fee_definition_body_with_executions_volume_tiered;
            } else {
                i2 = C40095R.string.crypto_fee_definition_body_without_executions_volume_tiered;
            }
            return companion2.invoke(i2, FormatFeeRate.formatFeeRate(this.feeRatio));
        }

        public final StringResource getBannerText() {
            int i;
            int i2 = WhenMappings.$EnumSwitchMapping$1[this.appType.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return null;
                }
                throw new IllegalStateException("Unsupported app type");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[getFeeStructure().ordinal()];
            if (i3 == 1) {
                return null;
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            if (this.hasOrderExecutions) {
                i = C40095R.string.crypto_fee_definition_banner_with_executions_volume_tiered;
            } else {
                i = C40095R.string.crypto_fee_definition_banner_without_executions_volume_tiered;
            }
            return companion.invoke(i, FormatFeeRate.formatFeeRate(this.robinhoodFeeRatio), FormatFeeRate.formatFeeRate(this.exchangeFeeRatio), CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getQuoteCurrency(), this.minFeeAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }

        public final StringResource getPrimaryCtaText() {
            int i = WhenMappings.$EnumSwitchMapping$1[this.appType.ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_fee_definition_got_it, new Object[0]);
            }
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_eu_fee_definition_ok, new Object[0]);
            }
            throw new IllegalStateException("Unsupported app type");
        }

        public final StringResource getLearnMoreUrl() {
            int i = WhenMappings.$EnumSwitchMapping$1[this.appType.ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C40095R.string.us_crypto_fee_help_center_url, new Object[0]);
            }
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C40095R.string.eu_crypto_fee_help_center_url, new Object[0]);
            }
            throw new IllegalStateException("Unsupported app type");
        }
    }
}
