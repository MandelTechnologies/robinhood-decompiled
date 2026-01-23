package com.robinhood.android.futures.trade.p147ui;

import android.content.Context;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.futures.contracts.FuturesTradeActivityKey;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.store.futures.p404di.FuturesTradePref;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: GoldUpsellNavigationHelper.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B3\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/GoldUpsellNavigationHelper;", "", "shouldShowFuturesGoldUpsellPref", "Lcom/robinhood/prefs/BooleanPreference;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/store/futures/FuturesOrderStore;Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "navigateToGoldUpsellScreen", "", "context", "Landroid/content/Context;", "tradeData", "Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData;", "(Landroid/content/Context;Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMicrogramDeeplink", "", "getGoldUpsellScreenExitDeeplink", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldUpsellNavigationHelper {
    public static final String FUTURES_DETAIL_ENTRY_POINT = "futures";
    public static final String FUTURES_GOLD_UPSELL_APP_MICROGRAM_ID = "app-futures-gold-upsell";
    public static final String FUTURES_LADDER_ENTRY_POINT = "futures_ladder";
    private final FuturesOrderStore futuresOrderStore;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final Navigator navigator;
    private final RegionGateProvider regionGateProvider;
    private final BooleanPreference shouldShowFuturesGoldUpsellPref;
    public static final int $stable = 8;

    /* compiled from: GoldUpsellNavigationHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.GoldUpsellNavigationHelper", m3645f = "GoldUpsellNavigationHelper.kt", m3646l = {34, 86, 37}, m3647m = "navigateToGoldUpsellScreen")
    /* renamed from: com.robinhood.android.futures.trade.ui.GoldUpsellNavigationHelper$navigateToGoldUpsellScreen$1 */
    static final class C174721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C174721(Continuation<? super C174721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoldUpsellNavigationHelper.this.navigateToGoldUpsellScreen(null, null, this);
        }
    }

    public GoldUpsellNavigationHelper(@FuturesTradePref BooleanPreference shouldShowFuturesGoldUpsellPref, Navigator navigator, MarginSubscriptionStore marginSubscriptionStore, FuturesOrderStore futuresOrderStore, RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(shouldShowFuturesGoldUpsellPref, "shouldShowFuturesGoldUpsellPref");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.shouldShowFuturesGoldUpsellPref = shouldShowFuturesGoldUpsellPref;
        this.navigator = navigator;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.futuresOrderStore = futuresOrderStore;
        this.regionGateProvider = regionGateProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object navigateToGoldUpsellScreen(Context context, FuturesTradeActivityKey.TradeData tradeData, Continuation<? super Unit> continuation) {
        C174721 c174721;
        Context context2;
        FuturesTradeActivityKey.TradeData tradeData2;
        Object regionGateState$default;
        Context context3;
        FuturesTradeActivityKey.TradeData tradeData3;
        Object objFirst;
        Optional optional;
        Boolean boolBoxBoolean;
        MarginSubscription marginSubscription;
        if (continuation instanceof C174721) {
            c174721 = (C174721) continuation;
            int i = c174721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c174721.label = i - Integer.MIN_VALUE;
            } else {
                c174721 = new C174721(continuation);
            }
        }
        C174721 c1747212 = c174721;
        Object obj = c1747212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1747212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            RegionGateProvider regionGateProvider = this.regionGateProvider;
            GoldRegionGate goldRegionGate = GoldRegionGate.INSTANCE;
            context2 = context;
            c1747212.L$0 = context2;
            tradeData2 = tradeData;
            c1747212.L$1 = tradeData2;
            c1747212.label = 1;
            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, goldRegionGate, false, c1747212, 2, null);
            if (regionGateState$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                optional = (Optional) c1747212.L$2;
                tradeData3 = (FuturesTradeActivityKey.TradeData) c1747212.L$1;
                context3 = (Context) c1747212.L$0;
                ResultKt.throwOnFailure(obj);
                Context context4 = context3;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolBoxBoolean = (optional != null || (marginSubscription = (MarginSubscription) optional.getOrNull()) == null) ? null : boxing.boxBoolean(marginSubscription.is24Karat());
                if (Intrinsics.areEqual(boolBoxBoolean, boxing.boxBoolean(true)) && zBooleanValue) {
                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(this.navigator, context4, new MicrogramRouterFragmentKey(new RemoteMicrogramApplication(FUTURES_GOLD_UPSELL_APP_MICROGRAM_ID, null, 2, null), getMicrogramDeeplink(tradeData3), null, null, null, 28, null), false, false, false, false, null, false, null, null, 1020, null);
                    this.shouldShowFuturesGoldUpsellPref.set(false);
                } else if (Intrinsics.areEqual(boolBoxBoolean, boxing.boxBoolean(true))) {
                    this.shouldShowFuturesGoldUpsellPref.set(false);
                }
                return Unit.INSTANCE;
            }
            tradeData3 = (FuturesTradeActivityKey.TradeData) c1747212.L$1;
            context3 = (Context) c1747212.L$0;
            ResultKt.throwOnFailure(obj);
            Optional optional2 = (Optional) obj;
            Flow<Boolean> flowHasMoreThanOneSuccessfulOrder = this.futuresOrderStore.hasMoreThanOneSuccessfulOrder();
            c1747212.L$0 = context3;
            c1747212.L$1 = tradeData3;
            c1747212.L$2 = optional2;
            c1747212.label = 3;
            objFirst = FlowKt.first(flowHasMoreThanOneSuccessfulOrder, c1747212);
            if (objFirst != coroutine_suspended) {
                optional = optional2;
                obj = objFirst;
                Context context42 = context3;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (optional != null) {
                    if (Intrinsics.areEqual(boolBoxBoolean, boxing.boxBoolean(true))) {
                        if (Intrinsics.areEqual(boolBoxBoolean, boxing.boxBoolean(true))) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        FuturesTradeActivityKey.TradeData tradeData4 = (FuturesTradeActivityKey.TradeData) c1747212.L$1;
        Context context5 = (Context) c1747212.L$0;
        ResultKt.throwOnFailure(obj);
        tradeData2 = tradeData4;
        regionGateState$default = obj;
        context2 = context5;
        if (((Boolean) regionGateState$default).booleanValue() && this.shouldShowFuturesGoldUpsellPref.get()) {
            Single singleCheckCurrentMarginSubscription$default = MarginSubscriptionStore.checkCurrentMarginSubscription$default(this.marginSubscriptionStore, false, 1, null);
            c1747212.L$0 = context2;
            c1747212.L$1 = tradeData2;
            c1747212.label = 2;
            Object objAwait = RxAwait3.await(singleCheckCurrentMarginSubscription$default, c1747212);
            if (objAwait != coroutine_suspended) {
                context3 = context2;
                obj = objAwait;
                tradeData3 = tradeData2;
                Optional optional22 = (Optional) obj;
                Flow<Boolean> flowHasMoreThanOneSuccessfulOrder2 = this.futuresOrderStore.hasMoreThanOneSuccessfulOrder();
                c1747212.L$0 = context3;
                c1747212.L$1 = tradeData3;
                c1747212.L$2 = optional22;
                c1747212.label = 3;
                objFirst = FlowKt.first(flowHasMoreThanOneSuccessfulOrder2, c1747212);
                if (objFirst != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    private final String getMicrogramDeeplink(FuturesTradeActivityKey.TradeData tradeData) throws UnsupportedEncodingException {
        String goldUpsellScreenExitDeeplink = getGoldUpsellScreenExitDeeplink(tradeData);
        return (DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD() + "://?exit_deeplink=") + goldUpsellScreenExitDeeplink;
    }

    private final String getGoldUpsellScreenExitDeeplink(FuturesTradeActivityKey.TradeData tradeData) throws UnsupportedEncodingException {
        String str;
        if (tradeData instanceof FuturesTradeActivityKey.TradeData.Ladder) {
            str = FUTURES_LADDER_ENTRY_POINT;
        } else {
            if (!(tradeData instanceof FuturesTradeActivityKey.TradeData.OrderForm)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "futures";
        }
        String str2 = "id=" + tradeData.getFuturesContractId() + "&entry_point=gold_onboarding_screen";
        String strEncode = URLEncoder.encode(DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD() + "://" + str + "?" + str2, Charsets.UTF_8.name());
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return strEncode;
    }
}
