package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.Instant;

/* compiled from: OptionSideBySideChainDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000e\n\u0002\b7\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\r\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\r\u0012\b\b\u0002\u0010(\u001a\u00020\u0010\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u0010\u0012\b\b\u0002\u0010,\u001a\u00020\u0010\u0012\b\b\u0002\u0010-\u001a\u00020\u0010\u0012\b\b\u0002\u0010.\u001a\u00020\u0010\u0012\b\b\u0002\u0010/\u001a\u00020\u0010\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00102\u001a\u00020\u0010\u0012\b\b\u0002\u00103\u001a\u00020\u0010\u0012\b\b\u0002\u00104\u001a\u00020\u0010¢\u0006\u0004\b5\u00106J&\u0010:\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001507¢\u0006\u0002\b8¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bD\u0010CJ\u0012\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bK\u0010JJ\u0010\u0010L\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bL\u0010JJ\u0010\u0010M\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bM\u0010JJ\u0010\u0010N\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001b0\rHÆ\u0003¢\u0006\u0004\bT\u0010HJ\u0010\u0010U\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020 0\rHÆ\u0003¢\u0006\u0004\bY\u0010HJ\u0012\u0010Z\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0016\u0010^\u001a\b\u0012\u0004\u0012\u00020&0\rHÆ\u0003¢\u0006\u0004\b^\u0010HJ\u0010\u0010_\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b_\u0010JJ\u0012\u0010`\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bb\u0010JJ\u0010\u0010c\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bc\u0010JJ\u0010\u0010d\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bd\u0010JJ\u0010\u0010e\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\be\u0010JJ\u0010\u0010f\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bf\u0010JJ\u0010\u0010g\u001a\u000200HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bi\u0010JJ\u0010\u0010j\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bj\u0010JJ\u0010\u0010k\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bk\u0010JJþ\u0002\u0010l\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\r2\b\b\u0002\u0010(\u001a\u00020\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00102\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010/\u001a\u00020\u00102\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u00020\u00102\b\b\u0002\u00103\u001a\u00020\u00102\b\b\u0002\u00104\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\bl\u0010mJ\u0010\u0010o\u001a\u00020nHÖ\u0001¢\u0006\u0004\bo\u0010pJ\u0010\u0010q\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bq\u0010rJ\u001a\u0010t\u001a\u00020\u00102\b\u0010s\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bt\u0010uR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010v\u001a\u0004\bw\u0010=R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010x\u001a\u0004\by\u0010?R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010z\u001a\u0004\b{\u0010AR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010|\u001a\u0004\b}\u0010CR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010|\u001a\u0004\b~\u0010CR\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\r\n\u0004\b\f\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010FR\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010HR\u0019\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010JR\u0019\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010\u0083\u0001\u001a\u0005\b\u0085\u0001\u0010JR\u0019\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u0083\u0001\u001a\u0005\b\u0086\u0001\u0010JR\u0018\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b\u0014\u0010\u0083\u0001\u001a\u0004\b\u0014\u0010JR\u0019\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010OR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010QR\u0019\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010SR\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0081\u0001\u001a\u0005\b\u008d\u0001\u0010HR\u0019\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010VR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010XR\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\r8\u0006¢\u0006\u000e\n\u0005\b!\u0010\u0081\u0001\u001a\u0005\b\u0092\u0001\u0010HR\u001b\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\u000e\n\u0005\b#\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010[R\u001b\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010]R\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\r8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u0081\u0001\u001a\u0005\b\u0097\u0001\u0010HR\u0018\u0010(\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b(\u0010\u0083\u0001\u001a\u0004\b(\u0010JR\u001b\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010aR\u0018\u0010+\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b+\u0010\u0083\u0001\u001a\u0004\b+\u0010JR\u0019\u0010,\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b,\u0010\u0083\u0001\u001a\u0005\b\u009a\u0001\u0010JR\u0018\u0010-\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b-\u0010\u0083\u0001\u001a\u0004\b-\u0010JR\u0019\u0010.\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b.\u0010\u0083\u0001\u001a\u0005\b\u009b\u0001\u0010JR\u0019\u0010/\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b/\u0010\u0083\u0001\u001a\u0005\b\u009c\u0001\u0010JR\u0019\u00101\u001a\u0002008\u0006¢\u0006\u000e\n\u0005\b1\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010hR\u0019\u00102\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b2\u0010\u0083\u0001\u001a\u0005\b\u009f\u0001\u0010JR\u0019\u00103\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b3\u0010\u0083\u0001\u001a\u0005\b \u0001\u0010JR\u0018\u00104\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b4\u0010\u0083\u0001\u001a\u0004\b4\u0010JR\u001b\u0010¡\u0001\u001a\u00020\u00108\u0006¢\u0006\u000f\n\u0006\b¡\u0001\u0010\u0083\u0001\u001a\u0005\b¢\u0001\u0010JR\u0013\u0010¤\u0001\u001a\u00020\u00108F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010J¨\u0006¥\u0001"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;", "", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "currentOrNextMarketDates", "", "currentPage", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "defaultPricingSettingOverride", "defaultPricingSettingServerValue", "j$/time/Instant", "earliestSelloutTime", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "existingPositionExpirationDateStates", "", "hasShownDiscoverZeroDteBottomSheetInCurrentSession", "hasSeenSimulatedReturnLongPressBanner", "hasSeenTopTooltipBannerInThisSession", "isInOptionRegularTradingOpenHours", "Lcom/robinhood/android/optionschain/sbschain/TooltipEligibility;", "tooltipEligibility", "Lcom/robinhood/android/optionschain/sbschain/TooltipState;", "tooltipState", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "launchMode", "Lcom/robinhood/models/ui/OptionLegBundle;", "selectedLegs", "Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "callPutSwitcherState", "targetExpirationDate", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetLegs", "Ljava/math/BigDecimal;", "targetStrikePrice", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "tradeOnExpirationState", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChains", "isEtfSupported", "Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "nuxMode", "isNuxSearchDismissed", "selloutSnackbarDismissedOrElapsed", "isSelloutSnackbarDismissalExperimentEnabled", "inSelloutImprovementExperiment", "inSbsNuxRevampExperiment", "Lcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;", "eduFooterAnimationState", "eduFooterAnimateDismissed", "lottieNuxAnimationSeen", "isMemberPdtRevampV1", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lj$/time/Instant;Lkotlinx/collections/immutable/ImmutableList;ZZZZLcom/robinhood/android/optionschain/sbschain/TooltipEligibility;Lcom/robinhood/android/optionschain/sbschain/TooltipState;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lkotlinx/collections/immutable/ImmutableList;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/optionschain/sbschain/NuxMode;ZZZZZLcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;ZZZ)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "copyFunction", "copyTooltipEligibility", "(Lkotlin/jvm/functions/Function1;)Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;", "component1", "()Lcom/robinhood/models/db/Account;", "component2", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "component5", "component6", "()Lj$/time/Instant;", "component7", "()Lkotlinx/collections/immutable/ImmutableList;", "component8", "()Z", "component9", "component10", "component11", "component12", "()Lcom/robinhood/android/optionschain/sbschain/TooltipEligibility;", "component13", "()Lcom/robinhood/android/optionschain/sbschain/TooltipState;", "component14", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "component15", "component16", "()Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "component17", "()Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "component18", "component19", "()Ljava/math/BigDecimal;", "component20", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "component21", "component22", "component23", "()Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "component24", "component25", "component26", "component27", "component28", "component29", "()Lcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;", "component30", "component31", "component32", "copy", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lj$/time/Instant;Lkotlinx/collections/immutable/ImmutableList;ZZZZLcom/robinhood/android/optionschain/sbschain/TooltipEligibility;Lcom/robinhood/android/optionschain/sbschain/TooltipState;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lkotlinx/collections/immutable/ImmutableList;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/optionschain/sbschain/NuxMode;ZZZZZLcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;ZZZ)Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/Account;", "getAccount", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "getCurrentOrNextMarketDates", "Ljava/lang/Integer;", "getCurrentPage", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getDefaultPricingSettingOverride", "getDefaultPricingSettingServerValue", "Lj$/time/Instant;", "getEarliestSelloutTime", "Lkotlinx/collections/immutable/ImmutableList;", "getExistingPositionExpirationDateStates", "Z", "getHasShownDiscoverZeroDteBottomSheetInCurrentSession", "getHasSeenSimulatedReturnLongPressBanner", "getHasSeenTopTooltipBannerInThisSession", "Lcom/robinhood/android/optionschain/sbschain/TooltipEligibility;", "getTooltipEligibility", "Lcom/robinhood/android/optionschain/sbschain/TooltipState;", "getTooltipState", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "getLaunchMode", "getSelectedLegs", "Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "getCallPutSwitcherState", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getTargetExpirationDate", "getTargetLegs", "Ljava/math/BigDecimal;", "getTargetStrikePrice", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "getTradeOnExpirationState", "getUiOptionChains", "Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "getNuxMode", "getSelloutSnackbarDismissedOrElapsed", "getInSelloutImprovementExperiment", "getInSbsNuxRevampExperiment", "Lcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;", "getEduFooterAnimationState", "getEduFooterAnimateDismissed", "getLottieNuxAnimationSeen", "supportMultileg", "getSupportMultileg", "getShouldIgnoreDefaultPricing", "shouldIgnoreDefaultPricing", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionSideBySideChainDataState {
    public static final int $stable = 8;
    private final Account account;
    private final OptionSideBySideChainDataState2 callPutSwitcherState;
    private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
    private final Integer currentPage;
    private final OptionSettings.DefaultPricingSetting defaultPricingSettingOverride;
    private final OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue;
    private final Instant earliestSelloutTime;
    private final boolean eduFooterAnimateDismissed;
    private final OptionSideBySideChainDataState5 eduFooterAnimationState;
    private final ImmutableList<OptionChainExpirationDateState> existingPositionExpirationDateStates;
    private final boolean hasSeenSimulatedReturnLongPressBanner;
    private final boolean hasSeenTopTooltipBannerInThisSession;
    private final boolean hasShownDiscoverZeroDteBottomSheetInCurrentSession;
    private final boolean inSbsNuxRevampExperiment;
    private final boolean inSelloutImprovementExperiment;
    private final boolean isEtfSupported;
    private final boolean isInOptionRegularTradingOpenHours;
    private final boolean isMemberPdtRevampV1;
    private final boolean isNuxSearchDismissed;
    private final boolean isSelloutSnackbarDismissalExperimentEnabled;
    private final OptionChainLaunchMode launchMode;
    private final boolean lottieNuxAnimationSeen;
    private final OptionSideBySideChainDataState4 nuxMode;
    private final ImmutableList<OptionLegBundle> selectedLegs;
    private final boolean selloutSnackbarDismissedOrElapsed;
    private final boolean supportMultileg;
    private final OptionChainExpirationDateState targetExpirationDate;
    private final ImmutableList<UiOptionStrategyLegDisplay> targetLegs;
    private final BigDecimal targetStrikePrice;
    private final TooltipEligibility tooltipEligibility;
    private final OptionSideBySideChainDataState7 tooltipState;
    private final OptionSettings.TradingOnExpirationState tradeOnExpirationState;
    private final ImmutableList<UiOptionChain> uiOptionChains;

    public static /* synthetic */ OptionSideBySideChainDataState copy$default(OptionSideBySideChainDataState optionSideBySideChainDataState, Account account, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Integer num, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, Instant instant, ImmutableList immutableList, boolean z, boolean z2, boolean z3, boolean z4, TooltipEligibility tooltipEligibility, OptionSideBySideChainDataState7 optionSideBySideChainDataState7, OptionChainLaunchMode optionChainLaunchMode, ImmutableList immutableList2, OptionSideBySideChainDataState2 optionSideBySideChainDataState2, OptionChainExpirationDateState optionChainExpirationDateState, ImmutableList immutableList3, BigDecimal bigDecimal, OptionSettings.TradingOnExpirationState tradingOnExpirationState, ImmutableList immutableList4, boolean z5, OptionSideBySideChainDataState4 optionSideBySideChainDataState4, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, OptionSideBySideChainDataState5 optionSideBySideChainDataState5, boolean z11, boolean z12, boolean z13, int i, Object obj) {
        boolean z14;
        boolean z15;
        OptionSideBySideChainDataState2 optionSideBySideChainDataState22;
        OptionChainExpirationDateState optionChainExpirationDateState2;
        ImmutableList immutableList5;
        BigDecimal bigDecimal2;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState2;
        ImmutableList immutableList6;
        boolean z16;
        OptionSideBySideChainDataState4 optionSideBySideChainDataState42;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        OptionSideBySideChainDataState5 optionSideBySideChainDataState52;
        boolean z22;
        ImmutableList immutableList7;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates2;
        Integer num2;
        OptionSettings.DefaultPricingSetting defaultPricingSetting3;
        OptionSettings.DefaultPricingSetting defaultPricingSetting4;
        Instant instant2;
        ImmutableList immutableList8;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        TooltipEligibility tooltipEligibility2;
        OptionSideBySideChainDataState7 optionSideBySideChainDataState72;
        OptionChainLaunchMode optionChainLaunchMode2;
        Account account2 = (i & 1) != 0 ? optionSideBySideChainDataState.account : account;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates3 = (i & 2) != 0 ? optionSideBySideChainDataState.currentOrNextMarketDates : optionCurrentOrNextMarketDates;
        Integer num3 = (i & 4) != 0 ? optionSideBySideChainDataState.currentPage : num;
        OptionSettings.DefaultPricingSetting defaultPricingSetting5 = (i & 8) != 0 ? optionSideBySideChainDataState.defaultPricingSettingOverride : defaultPricingSetting;
        OptionSettings.DefaultPricingSetting defaultPricingSetting6 = (i & 16) != 0 ? optionSideBySideChainDataState.defaultPricingSettingServerValue : defaultPricingSetting2;
        Instant instant3 = (i & 32) != 0 ? optionSideBySideChainDataState.earliestSelloutTime : instant;
        ImmutableList immutableList9 = (i & 64) != 0 ? optionSideBySideChainDataState.existingPositionExpirationDateStates : immutableList;
        boolean z27 = (i & 128) != 0 ? optionSideBySideChainDataState.hasShownDiscoverZeroDteBottomSheetInCurrentSession : z;
        boolean z28 = (i & 256) != 0 ? optionSideBySideChainDataState.hasSeenSimulatedReturnLongPressBanner : z2;
        boolean z29 = (i & 512) != 0 ? optionSideBySideChainDataState.hasSeenTopTooltipBannerInThisSession : z3;
        boolean z30 = (i & 1024) != 0 ? optionSideBySideChainDataState.isInOptionRegularTradingOpenHours : z4;
        TooltipEligibility tooltipEligibility3 = (i & 2048) != 0 ? optionSideBySideChainDataState.tooltipEligibility : tooltipEligibility;
        OptionSideBySideChainDataState7 optionSideBySideChainDataState73 = (i & 4096) != 0 ? optionSideBySideChainDataState.tooltipState : optionSideBySideChainDataState7;
        OptionChainLaunchMode optionChainLaunchMode3 = (i & 8192) != 0 ? optionSideBySideChainDataState.launchMode : optionChainLaunchMode;
        Account account3 = account2;
        ImmutableList immutableList10 = (i & 16384) != 0 ? optionSideBySideChainDataState.selectedLegs : immutableList2;
        OptionSideBySideChainDataState2 optionSideBySideChainDataState23 = (i & 32768) != 0 ? optionSideBySideChainDataState.callPutSwitcherState : optionSideBySideChainDataState2;
        OptionChainExpirationDateState optionChainExpirationDateState3 = (i & 65536) != 0 ? optionSideBySideChainDataState.targetExpirationDate : optionChainExpirationDateState;
        ImmutableList immutableList11 = (i & 131072) != 0 ? optionSideBySideChainDataState.targetLegs : immutableList3;
        BigDecimal bigDecimal3 = (i & 262144) != 0 ? optionSideBySideChainDataState.targetStrikePrice : bigDecimal;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState3 = (i & 524288) != 0 ? optionSideBySideChainDataState.tradeOnExpirationState : tradingOnExpirationState;
        ImmutableList immutableList12 = (i & 1048576) != 0 ? optionSideBySideChainDataState.uiOptionChains : immutableList4;
        boolean z31 = (i & 2097152) != 0 ? optionSideBySideChainDataState.isEtfSupported : z5;
        OptionSideBySideChainDataState4 optionSideBySideChainDataState43 = (i & 4194304) != 0 ? optionSideBySideChainDataState.nuxMode : optionSideBySideChainDataState4;
        boolean z32 = (i & 8388608) != 0 ? optionSideBySideChainDataState.isNuxSearchDismissed : z6;
        boolean z33 = (i & 16777216) != 0 ? optionSideBySideChainDataState.selloutSnackbarDismissedOrElapsed : z7;
        boolean z34 = (i & 33554432) != 0 ? optionSideBySideChainDataState.isSelloutSnackbarDismissalExperimentEnabled : z8;
        boolean z35 = (i & 67108864) != 0 ? optionSideBySideChainDataState.inSelloutImprovementExperiment : z9;
        boolean z36 = (i & 134217728) != 0 ? optionSideBySideChainDataState.inSbsNuxRevampExperiment : z10;
        OptionSideBySideChainDataState5 optionSideBySideChainDataState53 = (i & 268435456) != 0 ? optionSideBySideChainDataState.eduFooterAnimationState : optionSideBySideChainDataState5;
        boolean z37 = (i & 536870912) != 0 ? optionSideBySideChainDataState.eduFooterAnimateDismissed : z11;
        boolean z38 = (i & 1073741824) != 0 ? optionSideBySideChainDataState.lottieNuxAnimationSeen : z12;
        if ((i & Integer.MIN_VALUE) != 0) {
            z15 = z38;
            z14 = optionSideBySideChainDataState.isMemberPdtRevampV1;
            optionChainExpirationDateState2 = optionChainExpirationDateState3;
            immutableList5 = immutableList11;
            bigDecimal2 = bigDecimal3;
            tradingOnExpirationState2 = tradingOnExpirationState3;
            immutableList6 = immutableList12;
            z16 = z31;
            optionSideBySideChainDataState42 = optionSideBySideChainDataState43;
            z17 = z32;
            z18 = z33;
            z19 = z34;
            z20 = z35;
            z21 = z36;
            optionSideBySideChainDataState52 = optionSideBySideChainDataState53;
            z22 = z37;
            immutableList7 = immutableList10;
            optionCurrentOrNextMarketDates2 = optionCurrentOrNextMarketDates3;
            num2 = num3;
            defaultPricingSetting3 = defaultPricingSetting5;
            defaultPricingSetting4 = defaultPricingSetting6;
            instant2 = instant3;
            immutableList8 = immutableList9;
            z23 = z27;
            z24 = z28;
            z25 = z29;
            z26 = z30;
            tooltipEligibility2 = tooltipEligibility3;
            optionSideBySideChainDataState72 = optionSideBySideChainDataState73;
            optionChainLaunchMode2 = optionChainLaunchMode3;
            optionSideBySideChainDataState22 = optionSideBySideChainDataState23;
        } else {
            z14 = z13;
            z15 = z38;
            optionSideBySideChainDataState22 = optionSideBySideChainDataState23;
            optionChainExpirationDateState2 = optionChainExpirationDateState3;
            immutableList5 = immutableList11;
            bigDecimal2 = bigDecimal3;
            tradingOnExpirationState2 = tradingOnExpirationState3;
            immutableList6 = immutableList12;
            z16 = z31;
            optionSideBySideChainDataState42 = optionSideBySideChainDataState43;
            z17 = z32;
            z18 = z33;
            z19 = z34;
            z20 = z35;
            z21 = z36;
            optionSideBySideChainDataState52 = optionSideBySideChainDataState53;
            z22 = z37;
            immutableList7 = immutableList10;
            optionCurrentOrNextMarketDates2 = optionCurrentOrNextMarketDates3;
            num2 = num3;
            defaultPricingSetting3 = defaultPricingSetting5;
            defaultPricingSetting4 = defaultPricingSetting6;
            instant2 = instant3;
            immutableList8 = immutableList9;
            z23 = z27;
            z24 = z28;
            z25 = z29;
            z26 = z30;
            tooltipEligibility2 = tooltipEligibility3;
            optionSideBySideChainDataState72 = optionSideBySideChainDataState73;
            optionChainLaunchMode2 = optionChainLaunchMode3;
        }
        return optionSideBySideChainDataState.copy(account3, optionCurrentOrNextMarketDates2, num2, defaultPricingSetting3, defaultPricingSetting4, instant2, immutableList8, z23, z24, z25, z26, tooltipEligibility2, optionSideBySideChainDataState72, optionChainLaunchMode2, immutableList7, optionSideBySideChainDataState22, optionChainExpirationDateState2, immutableList5, bigDecimal2, tradingOnExpirationState2, immutableList6, z16, optionSideBySideChainDataState42, z17, z18, z19, z20, z21, optionSideBySideChainDataState52, z22, z15, z14);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHasSeenTopTooltipBannerInThisSession() {
        return this.hasSeenTopTooltipBannerInThisSession;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsInOptionRegularTradingOpenHours() {
        return this.isInOptionRegularTradingOpenHours;
    }

    /* renamed from: component12, reason: from getter */
    public final TooltipEligibility getTooltipEligibility() {
        return this.tooltipEligibility;
    }

    /* renamed from: component13, reason: from getter */
    public final OptionSideBySideChainDataState7 getTooltipState() {
        return this.tooltipState;
    }

    /* renamed from: component14, reason: from getter */
    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final ImmutableList<OptionLegBundle> component15() {
        return this.selectedLegs;
    }

    /* renamed from: component16, reason: from getter */
    public final OptionSideBySideChainDataState2 getCallPutSwitcherState() {
        return this.callPutSwitcherState;
    }

    /* renamed from: component17, reason: from getter */
    public final OptionChainExpirationDateState getTargetExpirationDate() {
        return this.targetExpirationDate;
    }

    public final ImmutableList<UiOptionStrategyLegDisplay> component18() {
        return this.targetLegs;
    }

    /* renamed from: component19, reason: from getter */
    public final BigDecimal getTargetStrikePrice() {
        return this.targetStrikePrice;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    /* renamed from: component20, reason: from getter */
    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationState() {
        return this.tradeOnExpirationState;
    }

    public final ImmutableList<UiOptionChain> component21() {
        return this.uiOptionChains;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsEtfSupported() {
        return this.isEtfSupported;
    }

    /* renamed from: component23, reason: from getter */
    public final OptionSideBySideChainDataState4 getNuxMode() {
        return this.nuxMode;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsNuxSearchDismissed() {
        return this.isNuxSearchDismissed;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getSelloutSnackbarDismissedOrElapsed() {
        return this.selloutSnackbarDismissedOrElapsed;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsSelloutSnackbarDismissalExperimentEnabled() {
        return this.isSelloutSnackbarDismissalExperimentEnabled;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getInSelloutImprovementExperiment() {
        return this.inSelloutImprovementExperiment;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getInSbsNuxRevampExperiment() {
        return this.inSbsNuxRevampExperiment;
    }

    /* renamed from: component29, reason: from getter */
    public final OptionSideBySideChainDataState5 getEduFooterAnimationState() {
        return this.eduFooterAnimationState;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getEduFooterAnimateDismissed() {
        return this.eduFooterAnimateDismissed;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getLottieNuxAnimationSeen() {
        return this.lottieNuxAnimationSeen;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getIsMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingOverride() {
        return this.defaultPricingSettingOverride;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    /* renamed from: component6, reason: from getter */
    public final Instant getEarliestSelloutTime() {
        return this.earliestSelloutTime;
    }

    public final ImmutableList<OptionChainExpirationDateState> component7() {
        return this.existingPositionExpirationDateStates;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasShownDiscoverZeroDteBottomSheetInCurrentSession() {
        return this.hasShownDiscoverZeroDteBottomSheetInCurrentSession;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasSeenSimulatedReturnLongPressBanner() {
        return this.hasSeenSimulatedReturnLongPressBanner;
    }

    public final OptionSideBySideChainDataState copy(Account account, OptionCurrentOrNextMarketDates currentOrNextMarketDates, Integer currentPage, OptionSettings.DefaultPricingSetting defaultPricingSettingOverride, OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue, Instant earliestSelloutTime, ImmutableList<OptionChainExpirationDateState> existingPositionExpirationDateStates, boolean hasShownDiscoverZeroDteBottomSheetInCurrentSession, boolean hasSeenSimulatedReturnLongPressBanner, boolean hasSeenTopTooltipBannerInThisSession, boolean isInOptionRegularTradingOpenHours, TooltipEligibility tooltipEligibility, OptionSideBySideChainDataState7 tooltipState, OptionChainLaunchMode launchMode, ImmutableList<OptionLegBundle> selectedLegs, OptionSideBySideChainDataState2 callPutSwitcherState, OptionChainExpirationDateState targetExpirationDate, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal targetStrikePrice, OptionSettings.TradingOnExpirationState tradeOnExpirationState, ImmutableList<UiOptionChain> uiOptionChains, boolean isEtfSupported, OptionSideBySideChainDataState4 nuxMode, boolean isNuxSearchDismissed, boolean selloutSnackbarDismissedOrElapsed, boolean isSelloutSnackbarDismissalExperimentEnabled, boolean inSelloutImprovementExperiment, boolean inSbsNuxRevampExperiment, OptionSideBySideChainDataState5 eduFooterAnimationState, boolean eduFooterAnimateDismissed, boolean lottieNuxAnimationSeen, boolean isMemberPdtRevampV1) {
        Intrinsics.checkNotNullParameter(existingPositionExpirationDateStates, "existingPositionExpirationDateStates");
        Intrinsics.checkNotNullParameter(tooltipEligibility, "tooltipEligibility");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(selectedLegs, "selectedLegs");
        Intrinsics.checkNotNullParameter(callPutSwitcherState, "callPutSwitcherState");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        Intrinsics.checkNotNullParameter(eduFooterAnimationState, "eduFooterAnimationState");
        return new OptionSideBySideChainDataState(account, currentOrNextMarketDates, currentPage, defaultPricingSettingOverride, defaultPricingSettingServerValue, earliestSelloutTime, existingPositionExpirationDateStates, hasShownDiscoverZeroDteBottomSheetInCurrentSession, hasSeenSimulatedReturnLongPressBanner, hasSeenTopTooltipBannerInThisSession, isInOptionRegularTradingOpenHours, tooltipEligibility, tooltipState, launchMode, selectedLegs, callPutSwitcherState, targetExpirationDate, targetLegs, targetStrikePrice, tradeOnExpirationState, uiOptionChains, isEtfSupported, nuxMode, isNuxSearchDismissed, selloutSnackbarDismissedOrElapsed, isSelloutSnackbarDismissalExperimentEnabled, inSelloutImprovementExperiment, inSbsNuxRevampExperiment, eduFooterAnimationState, eduFooterAnimateDismissed, lottieNuxAnimationSeen, isMemberPdtRevampV1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSideBySideChainDataState)) {
            return false;
        }
        OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) other;
        return Intrinsics.areEqual(this.account, optionSideBySideChainDataState.account) && Intrinsics.areEqual(this.currentOrNextMarketDates, optionSideBySideChainDataState.currentOrNextMarketDates) && Intrinsics.areEqual(this.currentPage, optionSideBySideChainDataState.currentPage) && this.defaultPricingSettingOverride == optionSideBySideChainDataState.defaultPricingSettingOverride && this.defaultPricingSettingServerValue == optionSideBySideChainDataState.defaultPricingSettingServerValue && Intrinsics.areEqual(this.earliestSelloutTime, optionSideBySideChainDataState.earliestSelloutTime) && Intrinsics.areEqual(this.existingPositionExpirationDateStates, optionSideBySideChainDataState.existingPositionExpirationDateStates) && this.hasShownDiscoverZeroDteBottomSheetInCurrentSession == optionSideBySideChainDataState.hasShownDiscoverZeroDteBottomSheetInCurrentSession && this.hasSeenSimulatedReturnLongPressBanner == optionSideBySideChainDataState.hasSeenSimulatedReturnLongPressBanner && this.hasSeenTopTooltipBannerInThisSession == optionSideBySideChainDataState.hasSeenTopTooltipBannerInThisSession && this.isInOptionRegularTradingOpenHours == optionSideBySideChainDataState.isInOptionRegularTradingOpenHours && Intrinsics.areEqual(this.tooltipEligibility, optionSideBySideChainDataState.tooltipEligibility) && this.tooltipState == optionSideBySideChainDataState.tooltipState && Intrinsics.areEqual(this.launchMode, optionSideBySideChainDataState.launchMode) && Intrinsics.areEqual(this.selectedLegs, optionSideBySideChainDataState.selectedLegs) && this.callPutSwitcherState == optionSideBySideChainDataState.callPutSwitcherState && Intrinsics.areEqual(this.targetExpirationDate, optionSideBySideChainDataState.targetExpirationDate) && Intrinsics.areEqual(this.targetLegs, optionSideBySideChainDataState.targetLegs) && Intrinsics.areEqual(this.targetStrikePrice, optionSideBySideChainDataState.targetStrikePrice) && this.tradeOnExpirationState == optionSideBySideChainDataState.tradeOnExpirationState && Intrinsics.areEqual(this.uiOptionChains, optionSideBySideChainDataState.uiOptionChains) && this.isEtfSupported == optionSideBySideChainDataState.isEtfSupported && this.nuxMode == optionSideBySideChainDataState.nuxMode && this.isNuxSearchDismissed == optionSideBySideChainDataState.isNuxSearchDismissed && this.selloutSnackbarDismissedOrElapsed == optionSideBySideChainDataState.selloutSnackbarDismissedOrElapsed && this.isSelloutSnackbarDismissalExperimentEnabled == optionSideBySideChainDataState.isSelloutSnackbarDismissalExperimentEnabled && this.inSelloutImprovementExperiment == optionSideBySideChainDataState.inSelloutImprovementExperiment && this.inSbsNuxRevampExperiment == optionSideBySideChainDataState.inSbsNuxRevampExperiment && this.eduFooterAnimationState == optionSideBySideChainDataState.eduFooterAnimationState && this.eduFooterAnimateDismissed == optionSideBySideChainDataState.eduFooterAnimateDismissed && this.lottieNuxAnimationSeen == optionSideBySideChainDataState.lottieNuxAnimationSeen && this.isMemberPdtRevampV1 == optionSideBySideChainDataState.isMemberPdtRevampV1;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        int iHashCode2 = (iHashCode + (optionCurrentOrNextMarketDates == null ? 0 : optionCurrentOrNextMarketDates.hashCode())) * 31;
        Integer num = this.currentPage;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSettingOverride;
        int iHashCode4 = (iHashCode3 + (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode())) * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting2 = this.defaultPricingSettingServerValue;
        int iHashCode5 = (iHashCode4 + (defaultPricingSetting2 == null ? 0 : defaultPricingSetting2.hashCode())) * 31;
        Instant instant = this.earliestSelloutTime;
        int iHashCode6 = (((((((((((((iHashCode5 + (instant == null ? 0 : instant.hashCode())) * 31) + this.existingPositionExpirationDateStates.hashCode()) * 31) + Boolean.hashCode(this.hasShownDiscoverZeroDteBottomSheetInCurrentSession)) * 31) + Boolean.hashCode(this.hasSeenSimulatedReturnLongPressBanner)) * 31) + Boolean.hashCode(this.hasSeenTopTooltipBannerInThisSession)) * 31) + Boolean.hashCode(this.isInOptionRegularTradingOpenHours)) * 31) + this.tooltipEligibility.hashCode()) * 31;
        OptionSideBySideChainDataState7 optionSideBySideChainDataState7 = this.tooltipState;
        int iHashCode7 = (((((((iHashCode6 + (optionSideBySideChainDataState7 == null ? 0 : optionSideBySideChainDataState7.hashCode())) * 31) + this.launchMode.hashCode()) * 31) + this.selectedLegs.hashCode()) * 31) + this.callPutSwitcherState.hashCode()) * 31;
        OptionChainExpirationDateState optionChainExpirationDateState = this.targetExpirationDate;
        int iHashCode8 = (((iHashCode7 + (optionChainExpirationDateState == null ? 0 : optionChainExpirationDateState.hashCode())) * 31) + this.targetLegs.hashCode()) * 31;
        BigDecimal bigDecimal = this.targetStrikePrice;
        int iHashCode9 = (iHashCode8 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState = this.tradeOnExpirationState;
        int iHashCode10 = (((((iHashCode9 + (tradingOnExpirationState == null ? 0 : tradingOnExpirationState.hashCode())) * 31) + this.uiOptionChains.hashCode()) * 31) + Boolean.hashCode(this.isEtfSupported)) * 31;
        OptionSideBySideChainDataState4 optionSideBySideChainDataState4 = this.nuxMode;
        return ((((((((((((((((((iHashCode10 + (optionSideBySideChainDataState4 != null ? optionSideBySideChainDataState4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isNuxSearchDismissed)) * 31) + Boolean.hashCode(this.selloutSnackbarDismissedOrElapsed)) * 31) + Boolean.hashCode(this.isSelloutSnackbarDismissalExperimentEnabled)) * 31) + Boolean.hashCode(this.inSelloutImprovementExperiment)) * 31) + Boolean.hashCode(this.inSbsNuxRevampExperiment)) * 31) + this.eduFooterAnimationState.hashCode()) * 31) + Boolean.hashCode(this.eduFooterAnimateDismissed)) * 31) + Boolean.hashCode(this.lottieNuxAnimationSeen)) * 31) + Boolean.hashCode(this.isMemberPdtRevampV1);
    }

    public String toString() {
        return "OptionSideBySideChainDataState(account=" + this.account + ", currentOrNextMarketDates=" + this.currentOrNextMarketDates + ", currentPage=" + this.currentPage + ", defaultPricingSettingOverride=" + this.defaultPricingSettingOverride + ", defaultPricingSettingServerValue=" + this.defaultPricingSettingServerValue + ", earliestSelloutTime=" + this.earliestSelloutTime + ", existingPositionExpirationDateStates=" + this.existingPositionExpirationDateStates + ", hasShownDiscoverZeroDteBottomSheetInCurrentSession=" + this.hasShownDiscoverZeroDteBottomSheetInCurrentSession + ", hasSeenSimulatedReturnLongPressBanner=" + this.hasSeenSimulatedReturnLongPressBanner + ", hasSeenTopTooltipBannerInThisSession=" + this.hasSeenTopTooltipBannerInThisSession + ", isInOptionRegularTradingOpenHours=" + this.isInOptionRegularTradingOpenHours + ", tooltipEligibility=" + this.tooltipEligibility + ", tooltipState=" + this.tooltipState + ", launchMode=" + this.launchMode + ", selectedLegs=" + this.selectedLegs + ", callPutSwitcherState=" + this.callPutSwitcherState + ", targetExpirationDate=" + this.targetExpirationDate + ", targetLegs=" + this.targetLegs + ", targetStrikePrice=" + this.targetStrikePrice + ", tradeOnExpirationState=" + this.tradeOnExpirationState + ", uiOptionChains=" + this.uiOptionChains + ", isEtfSupported=" + this.isEtfSupported + ", nuxMode=" + this.nuxMode + ", isNuxSearchDismissed=" + this.isNuxSearchDismissed + ", selloutSnackbarDismissedOrElapsed=" + this.selloutSnackbarDismissedOrElapsed + ", isSelloutSnackbarDismissalExperimentEnabled=" + this.isSelloutSnackbarDismissalExperimentEnabled + ", inSelloutImprovementExperiment=" + this.inSelloutImprovementExperiment + ", inSbsNuxRevampExperiment=" + this.inSbsNuxRevampExperiment + ", eduFooterAnimationState=" + this.eduFooterAnimationState + ", eduFooterAnimateDismissed=" + this.eduFooterAnimateDismissed + ", lottieNuxAnimationSeen=" + this.lottieNuxAnimationSeen + ", isMemberPdtRevampV1=" + this.isMemberPdtRevampV1 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionSideBySideChainDataState(Account account, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Integer num, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, Instant instant, ImmutableList<OptionChainExpirationDateState> existingPositionExpirationDateStates, boolean z, boolean z2, boolean z3, boolean z4, TooltipEligibility tooltipEligibility, OptionSideBySideChainDataState7 optionSideBySideChainDataState7, OptionChainLaunchMode launchMode, ImmutableList<OptionLegBundle> selectedLegs, OptionSideBySideChainDataState2 callPutSwitcherState, OptionChainExpirationDateState optionChainExpirationDateState, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal bigDecimal, OptionSettings.TradingOnExpirationState tradingOnExpirationState, ImmutableList<UiOptionChain> uiOptionChains, boolean z5, OptionSideBySideChainDataState4 optionSideBySideChainDataState4, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, OptionSideBySideChainDataState5 eduFooterAnimationState, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        Intrinsics.checkNotNullParameter(existingPositionExpirationDateStates, "existingPositionExpirationDateStates");
        Intrinsics.checkNotNullParameter(tooltipEligibility, "tooltipEligibility");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(selectedLegs, "selectedLegs");
        Intrinsics.checkNotNullParameter(callPutSwitcherState, "callPutSwitcherState");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        Intrinsics.checkNotNullParameter(eduFooterAnimationState, "eduFooterAnimationState");
        this.account = account;
        this.currentOrNextMarketDates = optionCurrentOrNextMarketDates;
        this.currentPage = num;
        this.defaultPricingSettingOverride = defaultPricingSetting;
        this.defaultPricingSettingServerValue = defaultPricingSetting2;
        this.earliestSelloutTime = instant;
        this.existingPositionExpirationDateStates = existingPositionExpirationDateStates;
        this.hasShownDiscoverZeroDteBottomSheetInCurrentSession = z;
        this.hasSeenSimulatedReturnLongPressBanner = z2;
        this.hasSeenTopTooltipBannerInThisSession = z3;
        this.isInOptionRegularTradingOpenHours = z4;
        this.tooltipEligibility = tooltipEligibility;
        this.tooltipState = optionSideBySideChainDataState7;
        this.launchMode = launchMode;
        this.selectedLegs = selectedLegs;
        this.callPutSwitcherState = callPutSwitcherState;
        this.targetExpirationDate = optionChainExpirationDateState;
        this.targetLegs = targetLegs;
        this.targetStrikePrice = bigDecimal;
        this.tradeOnExpirationState = tradingOnExpirationState;
        this.uiOptionChains = uiOptionChains;
        this.isEtfSupported = z5;
        this.nuxMode = optionSideBySideChainDataState4;
        this.isNuxSearchDismissed = z6;
        this.selloutSnackbarDismissedOrElapsed = z7;
        this.isSelloutSnackbarDismissalExperimentEnabled = z8;
        this.inSelloutImprovementExperiment = z9;
        this.inSbsNuxRevampExperiment = z10;
        this.eduFooterAnimationState = eduFooterAnimationState;
        this.eduFooterAnimateDismissed = z11;
        this.lottieNuxAnimationSeen = z12;
        this.isMemberPdtRevampV1 = z13;
        if (account != null) {
            z14 = account.getHasAccessToMultileg() && launchMode.hasFeature(OptionChainLaunchMode.Feature.MULTILEG);
        }
        this.supportMultileg = z14;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingOverride() {
        return this.defaultPricingSettingOverride;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    public final Instant getEarliestSelloutTime() {
        return this.earliestSelloutTime;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OptionSideBySideChainDataState(com.robinhood.models.p320db.Account r37, com.robinhood.models.p320db.OptionCurrentOrNextMarketDates r38, java.lang.Integer r39, com.robinhood.models.db.OptionSettings.DefaultPricingSetting r40, com.robinhood.models.db.OptionSettings.DefaultPricingSetting r41, p479j$.time.Instant r42, kotlinx.collections.immutable.ImmutableList r43, boolean r44, boolean r45, boolean r46, boolean r47, com.robinhood.android.optionschain.sbschain.TooltipEligibility r48, com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState7 r49, com.robinhood.android.options.contracts.OptionChainLaunchMode r50, kotlinx.collections.immutable.ImmutableList r51, com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState2 r52, com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState r53, kotlinx.collections.immutable.ImmutableList r54, java.math.BigDecimal r55, com.robinhood.models.db.OptionSettings.TradingOnExpirationState r56, kotlinx.collections.immutable.ImmutableList r57, boolean r58, com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState4 r59, boolean r60, boolean r61, boolean r62, boolean r63, boolean r64, com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState5 r65, boolean r66, boolean r67, boolean r68, int r69, kotlin.jvm.internal.DefaultConstructorMarker r70) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState.<init>(com.robinhood.models.db.Account, com.robinhood.models.db.OptionCurrentOrNextMarketDates, java.lang.Integer, com.robinhood.models.db.OptionSettings$DefaultPricingSetting, com.robinhood.models.db.OptionSettings$DefaultPricingSetting, j$.time.Instant, kotlinx.collections.immutable.ImmutableList, boolean, boolean, boolean, boolean, com.robinhood.android.optionschain.sbschain.TooltipEligibility, com.robinhood.android.optionschain.sbschain.TooltipState, com.robinhood.android.options.contracts.OptionChainLaunchMode, kotlinx.collections.immutable.ImmutableList, com.robinhood.android.optionschain.sbschain.CallPutSwitcherState, com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState, kotlinx.collections.immutable.ImmutableList, java.math.BigDecimal, com.robinhood.models.db.OptionSettings$TradingOnExpirationState, kotlinx.collections.immutable.ImmutableList, boolean, com.robinhood.android.optionschain.sbschain.NuxMode, boolean, boolean, boolean, boolean, boolean, com.robinhood.android.optionschain.sbschain.SbsFooterEducationAnimationState, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ImmutableList<OptionChainExpirationDateState> getExistingPositionExpirationDateStates() {
        return this.existingPositionExpirationDateStates;
    }

    public final boolean getHasShownDiscoverZeroDteBottomSheetInCurrentSession() {
        return this.hasShownDiscoverZeroDteBottomSheetInCurrentSession;
    }

    public final boolean getHasSeenSimulatedReturnLongPressBanner() {
        return this.hasSeenSimulatedReturnLongPressBanner;
    }

    public final boolean getHasSeenTopTooltipBannerInThisSession() {
        return this.hasSeenTopTooltipBannerInThisSession;
    }

    public final boolean isInOptionRegularTradingOpenHours() {
        return this.isInOptionRegularTradingOpenHours;
    }

    public final TooltipEligibility getTooltipEligibility() {
        return this.tooltipEligibility;
    }

    public final OptionSideBySideChainDataState7 getTooltipState() {
        return this.tooltipState;
    }

    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final ImmutableList<OptionLegBundle> getSelectedLegs() {
        return this.selectedLegs;
    }

    public final OptionSideBySideChainDataState2 getCallPutSwitcherState() {
        return this.callPutSwitcherState;
    }

    public final OptionChainExpirationDateState getTargetExpirationDate() {
        return this.targetExpirationDate;
    }

    public final ImmutableList<UiOptionStrategyLegDisplay> getTargetLegs() {
        return this.targetLegs;
    }

    public final BigDecimal getTargetStrikePrice() {
        return this.targetStrikePrice;
    }

    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationState() {
        return this.tradeOnExpirationState;
    }

    public final ImmutableList<UiOptionChain> getUiOptionChains() {
        return this.uiOptionChains;
    }

    public final boolean isEtfSupported() {
        return this.isEtfSupported;
    }

    public final OptionSideBySideChainDataState4 getNuxMode() {
        return this.nuxMode;
    }

    public final boolean isNuxSearchDismissed() {
        return this.isNuxSearchDismissed;
    }

    public final boolean getSelloutSnackbarDismissedOrElapsed() {
        return this.selloutSnackbarDismissedOrElapsed;
    }

    public final boolean isSelloutSnackbarDismissalExperimentEnabled() {
        return this.isSelloutSnackbarDismissalExperimentEnabled;
    }

    public final boolean getInSelloutImprovementExperiment() {
        return this.inSelloutImprovementExperiment;
    }

    public final boolean getInSbsNuxRevampExperiment() {
        return this.inSbsNuxRevampExperiment;
    }

    public final OptionSideBySideChainDataState5 getEduFooterAnimationState() {
        return this.eduFooterAnimationState;
    }

    public final boolean getEduFooterAnimateDismissed() {
        return this.eduFooterAnimateDismissed;
    }

    public final boolean getLottieNuxAnimationSeen() {
        return this.lottieNuxAnimationSeen;
    }

    public final boolean isMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    public final boolean getSupportMultileg() {
        return this.supportMultileg;
    }

    public final boolean getShouldIgnoreDefaultPricing() {
        return !this.launchMode.hasFeature(OptionChainLaunchMode.Feature.USE_DEFAULT_PRICING_SETTING);
    }

    public final OptionSideBySideChainDataState copyTooltipEligibility(Function1<? super TooltipEligibility, TooltipEligibility> copyFunction) {
        Intrinsics.checkNotNullParameter(copyFunction, "copyFunction");
        return copy$default(this, null, null, null, null, null, null, null, false, false, false, false, copyFunction.invoke(this.tooltipEligibility), null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -2049, null);
    }
}
