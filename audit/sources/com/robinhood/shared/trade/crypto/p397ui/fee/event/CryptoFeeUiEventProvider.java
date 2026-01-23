package com.robinhood.shared.trade.crypto.p397ui.fee.event;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.trade.crypto.dagger.CryptoFeePrefs;
import com.robinhood.shared.trade.crypto.dagger.CryptoFeePrefs2;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider2;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider3;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoFeeUiEventProvider.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\r*\u00020\f*\u0004\u0018\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "", "Lcom/robinhood/shared/app/type/AppType;", "appType", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringToLongMapPreference;", "feeUnsupportedBannerDismissMillisPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenFeeUpsellBottomSheetPref", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lj$/time/Clock;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/BooleanPreference;)V", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/EventType;", "T", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventType;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/EntryPoint;", "entryPoint", "mapToEventType", "(Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventType;Lcom/robinhood/shared/trade/crypto/ui/fee/event/EntryPoint;)Lcom/robinhood/shared/trade/crypto/ui/fee/event/EventType;", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "monetizationModel", "getInitialUiEventType$feature_trade_crypto_externalDebug", "(Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;Lcom/robinhood/shared/trade/crypto/ui/fee/event/EntryPoint;)Lcom/robinhood/shared/trade/crypto/ui/fee/event/EventType;", "getInitialUiEventType", "Lcom/robinhood/shared/app/type/AppType;", "Lj$/time/Clock;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "Lcom/robinhood/prefs/BooleanPreference;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFeeUiEventProvider {
    private static final long TWO_WEEKS_IN_MILLIS = 1209600000;
    private final AppType appType;
    private final Clock clock;
    private final StringToLongMapPreference feeUnsupportedBannerDismissMillisPref;
    private final BooleanPreference hasSeenFeeUpsellBottomSheetPref;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public CryptoFeeUiEventProvider(AppType appType, Clock clock, @CryptoFeePrefs StringToLongMapPreference feeUnsupportedBannerDismissMillisPref, @CryptoFeePrefs2 BooleanPreference hasSeenFeeUpsellBottomSheetPref) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(feeUnsupportedBannerDismissMillisPref, "feeUnsupportedBannerDismissMillisPref");
        Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
        this.appType = appType;
        this.clock = clock;
        this.feeUnsupportedBannerDismissMillisPref = feeUnsupportedBannerDismissMillisPref;
        this.hasSeenFeeUpsellBottomSheetPref = hasSeenFeeUpsellBottomSheetPref;
    }

    public final <T extends CryptoFeeUiEventProvider4> T getInitialUiEventType$feature_trade_crypto_externalDebug(CryptoOrderMonetizationModel monetizationModel, CryptoFeeUiEventProvider3<T> entryPoint) {
        Intrinsics.checkNotNullParameter(monetizationModel, "monetizationModel");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        CryptoFeeUiEventProvider2 showFeeUnsupportedForCurrencyPairBanner = null;
        if (this.appType != AppType.TRADER || !monetizationModel.isMonetizationModelEligible()) {
            return null;
        }
        if (monetizationModel instanceof CryptoOrderMonetizationModel.Fee) {
            this.hasSeenFeeUpsellBottomSheetPref.set(true);
        } else {
            if (!(monetizationModel instanceof CryptoOrderMonetizationModel.Rebate)) {
                throw new NoWhenBranchMatchedException();
            }
            CryptoOrderMonetizationModel.Rebate.Reason reason = ((CryptoOrderMonetizationModel.Rebate) monetizationModel).getReason();
            if (reason instanceof CryptoOrderMonetizationModel.Rebate.Reason.UserPreference) {
                if (!this.hasSeenFeeUpsellBottomSheetPref.get()) {
                    showFeeUnsupportedForCurrencyPairBanner = CryptoFeeUiEventProvider2.ShowFeeTierUpsellBottomSheet.INSTANCE;
                }
            } else if (reason instanceof CryptoOrderMonetizationModel.Rebate.Reason.UnsupportedForCurrencyPair) {
                CryptoOrderMonetizationModel.Rebate.Reason.UnsupportedForCurrencyPair unsupportedForCurrencyPair = (CryptoOrderMonetizationModel.Rebate.Reason.UnsupportedForCurrencyPair) reason;
                if (unsupportedForCurrencyPair.isUserPreferenceMonetizationModelFee() && this.clock.millis() - this.feeUnsupportedBannerDismissMillisPref.get(unsupportedForCurrencyPair.getAssetCurrencyCode(), 0L) > TWO_WEEKS_IN_MILLIS) {
                    showFeeUnsupportedForCurrencyPairBanner = new CryptoFeeUiEventProvider2.ShowFeeUnsupportedForCurrencyPairBanner(unsupportedForCurrencyPair.getAssetCurrencyCode(), unsupportedForCurrencyPair.isRebateMarketMakersSupported());
                }
            }
        }
        return (T) mapToEventType(showFeeUnsupportedForCurrencyPairBanner, entryPoint);
    }

    private final <T extends CryptoFeeUiEventProvider4> T mapToEventType(CryptoFeeUiEventProvider2 cryptoFeeUiEventProvider2, CryptoFeeUiEventProvider3<T> cryptoFeeUiEventProvider3) {
        if (cryptoFeeUiEventProvider2 instanceof CryptoFeeUiEventProvider2.ShowFeeUnsupportedForCurrencyPairBanner) {
            if (Intrinsics.areEqual(cryptoFeeUiEventProvider3, CryptoFeeUiEventProvider3.CryptoQuoteOrder.INSTANCE)) {
                CryptoFeeUiEventProvider2.ShowFeeUnsupportedForCurrencyPairBanner showFeeUnsupportedForCurrencyPairBanner = (CryptoFeeUiEventProvider2.ShowFeeUnsupportedForCurrencyPairBanner) cryptoFeeUiEventProvider2;
                return new CryptoFeeUiEventProvider4.CryptoQuoteOrder.ShowFeeUnsupportedForCurrencyPairBanner(showFeeUnsupportedForCurrencyPairBanner.getAssetCurrencyCode(), showFeeUnsupportedForCurrencyPairBanner.isRebateMarketMakersSupported());
            }
            if (Intrinsics.areEqual(cryptoFeeUiEventProvider3, CryptoFeeUiEventProvider3.CryptoOrder.INSTANCE)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(cryptoFeeUiEventProvider2 instanceof CryptoFeeUiEventProvider2.ShowFeeTierUpsellBottomSheet)) {
            if (cryptoFeeUiEventProvider2 == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.areEqual(cryptoFeeUiEventProvider3, CryptoFeeUiEventProvider3.CryptoQuoteOrder.INSTANCE)) {
            return CryptoFeeUiEventProvider4.CryptoQuoteOrder.ShowFeeTierUpsellBottomSheet.INSTANCE;
        }
        if (!Intrinsics.areEqual(cryptoFeeUiEventProvider3, CryptoFeeUiEventProvider3.CryptoOrder.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return CryptoFeeUiEventProvider4.CryptoOrder.ShowFeeTierUpsellBottomSheet.INSTANCE;
    }

    /* compiled from: CryptoFeeUiEventProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider$Companion;", "", "<init>", "()V", "TWO_WEEKS_IN_MILLIS", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
