package com.robinhood.android.equitydetail.p123ui.tradebar;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.common.buysell.BuySellHelper;
import com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.TradeButtonLogger;
import com.robinhood.android.equitydetail.p123ui.tradebar.InstrumentDetailTradeBarViewState3;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.view.AccountSwitcherExtensions;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore2;
import com.robinhood.models.api.bonfire.instrument.InstrumentAccountSwitcherType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.StockDetailTradeBar;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.PrimitivesKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailTradeBarViewState.kt */
@Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b5\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bñ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!\u0018\u00010\u0016\u0012\b\b\u0002\u0010$\u001a\u00020\u0012\u0012\b\b\u0002\u0010%\u001a\u00020\u0012\u0012\b\b\u0002\u0010&\u001a\u00020\u0012\u0012\b\b\u0002\u0010'\u001a\u00020\u0012\u0012\b\b\u0002\u0010(\u001a\u00020\u0012\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u0010/\u001a\u00020\u0012\u0012\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0016\u0012\b\b\u0002\u00102\u001a\u00020\u0012¢\u0006\u0004\b3\u00104J\u000e\u0010n\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020rJ\n\u0010s\u001a\u0004\u0018\u00010tH\u0002J\u0010\u0010u\u001a\u00020v2\u0006\u0010q\u001a\u00020rH\u0002J\u0016\u0010w\u001a\b\u0012\u0004\u0012\u00020x0\u000f2\u0006\u0010y\u001a\u00020zH\u0002J\b\u0010{\u001a\u00020\u0012H\u0002J\b\u0010|\u001a\u00020\u0012H\u0002J\b\u0010}\u001a\u00020\u0012H\u0002J\b\u0010~\u001a\u00020\u0012H\u0002J\u0010\u0010\u007f\u001a\u00020\u00002\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\rHÆ\u0003J\u0010\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0012HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0012\u0010\u008b\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u008c\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u008d\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0012HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0010\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fHÆ\u0003J\u001e\u0010\u0092\u0001\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!\u0018\u00010\u0016HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020*HÂ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010,HÂ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010.HÂ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0012HÆ\u0003J\u0012\u0010\u009c\u0001\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0016HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0012HÆ\u0003Jô\u0002\u0010\u009e\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!\u0018\u00010\u00162\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\b\b\u0002\u0010/\u001a\u00020\u00122\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00162\b\b\u0002\u00102\u001a\u00020\u0012HÆ\u0001J\u0015\u0010\u009f\u0001\u001a\u00020\u00122\t\u0010 \u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¡\u0001\u001a\u00020gHÖ\u0001J\n\u0010¢\u0001\u001a\u000201HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010HR\u0011\u0010\u001b\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bK\u0010DR\u0011\u0010\u001c\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010DR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\b\n\u0000\u001a\u0004\bN\u0010BR%\u0010 \u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bO\u0010HR\u0011\u0010$\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bP\u0010DR\u0011\u0010%\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010DR\u0011\u0010&\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010DR\u0011\u0010'\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010DR\u0011\u0010(\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010DR\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010/\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u0010DR\u0019\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bR\u0010HR\u0011\u00102\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bS\u0010DR\u0011\u0010T\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bU\u0010DR\u0011\u0010V\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bW\u0010DR\u0011\u0010X\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bY\u0010DR\u0011\u0010Z\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b[\u0010DR\u0011\u0010\\\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b]\u0010DR\u0011\u0010^\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b_\u0010DR\u0011\u0010`\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\ba\u0010DR\u0011\u0010b\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bc\u0010DR\u0011\u0010d\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\be\u0010DR\u0011\u0010f\u001a\u00020g8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0013\u0010j\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006£\u0001"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;", "", "analyticsData", "Lcom/robinhood/android/equitydetail/ui/tradebar/AnalyticsData;", "instrument", "Lcom/robinhood/models/db/Instrument;", "account", "Lcom/robinhood/models/db/Account;", "buySellData", "Lcom/robinhood/android/common/buysell/BuySellData;", "activeOptionChain", "Lcom/robinhood/models/db/OptionChain;", "shouldShowOptionsUpgradeOnSdp", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore$ShowOptionsUpgradeOnSdp;", "optionPositions", "", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "hasPositions", "", "position", "Lcom/robinhood/models/db/Position;", "initiateOrderEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/db/EquityOrderSide;", "optionsActionIntentEvent", "Lcom/robinhood/android/navigation/keys/IntentKey;", "ladderActionIntentEvent", "shouldShowAccountSwitcher", "isInRetirementOptions", "instrumentAccountSwitcher", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "allAccounts", "accountSwitcherRefreshedEvent", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "", "loadingAccountSwitcher", "isOptionsRegionSupported", "isEquityTradeLadderEnabled", "isEquitySubzeroEnabled", "priceBookExists", "displayType", "Lcom/robinhood/android/equitydetail/ui/tradebar/DisplayType;", "fundamentalVolume", "Ljava/math/BigDecimal;", "stockDetailTradeBar", "Lcom/robinhood/models/db/bonfire/StockDetailTradeBar;", "isInEtfSupportedRegion", "showSubzeroFtuxEvent", "", "useSduiAccountSwitcher", "<init>", "(Lcom/robinhood/android/equitydetail/ui/tradebar/AnalyticsData;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/android/common/buysell/BuySellData;Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore$ShowOptionsUpgradeOnSdp;Ljava/util/List;ZLcom/robinhood/models/db/Position;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZLcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;Ljava/util/List;Lcom/robinhood/udf/UiEvent;ZZZZZLcom/robinhood/android/equitydetail/ui/tradebar/DisplayType;Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/StockDetailTradeBar;ZLcom/robinhood/udf/UiEvent;Z)V", "getAnalyticsData", "()Lcom/robinhood/android/equitydetail/ui/tradebar/AnalyticsData;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getBuySellData", "()Lcom/robinhood/android/common/buysell/BuySellData;", "getActiveOptionChain", "()Lcom/robinhood/models/db/OptionChain;", "getShouldShowOptionsUpgradeOnSdp", "()Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore$ShowOptionsUpgradeOnSdp;", "getOptionPositions", "()Ljava/util/List;", "getHasPositions", "()Z", "getPosition", "()Lcom/robinhood/models/db/Position;", "getInitiateOrderEvent", "()Lcom/robinhood/udf/UiEvent;", "getOptionsActionIntentEvent", "getLadderActionIntentEvent", "getShouldShowAccountSwitcher", "getInstrumentAccountSwitcher", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "getAllAccounts", "getAccountSwitcherRefreshedEvent", "getLoadingAccountSwitcher", "getPriceBookExists", "getShowSubzeroFtuxEvent", "getUseSduiAccountSwitcher", "buySellPositionsAvailable", "getBuySellPositionsAvailable", "ignoreOptionsAccess", "getIgnoreOptionsAccess", "optionsEnabled", "getOptionsEnabled", "ladderEnabled", "getLadderEnabled", "buyToOpenEnabled", "getBuyToOpenEnabled", "buyToCloseEnabled", "getBuyToCloseEnabled", "sellEnabled", "getSellEnabled", "shortEnabled", "getShortEnabled", "hasAccessToOptions", "getHasAccessToOptions", "actionButtonCount", "", "getActionButtonCount", "()I", "accountSwitcherState", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "getAccountSwitcherState", "()Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "getButtonGroupTitle", "getData", "Lcom/robinhood/android/equitydetail/ui/tradebar/Data;", "context", "Landroid/content/Context;", "getServerDrivenData", "Lcom/robinhood/android/equitydetail/ui/tradebar/Data$ServerDriven;", "getClientDrivenData", "Lcom/robinhood/android/equitydetail/ui/tradebar/Data$ClientDriven;", "getClientDrivenExpandActions", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "res", "Landroid/content/res/Resources;", "showSellShort", "showBuyToClose", "showBuyToOpen", "showSellToClose", "mutateAccountSwitcherRefreshState", "state", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherRefreshState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "equals", "other", "hashCode", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InstrumentDetailTradeBarViewState {
    public static final int $stable = 8;
    private final Account account;
    private final UiEvent<Either<AccountSwitcherData, Throwable>> accountSwitcherRefreshedEvent;
    private final OptionChain activeOptionChain;
    private final List<Account> allAccounts;
    private final AnalyticsData analyticsData;
    private final BuySellData buySellData;
    private final DisplayType displayType;
    private final BigDecimal fundamentalVolume;
    private final boolean hasPositions;
    private final UiEvent<EquityOrderSide> initiateOrderEvent;
    private final Instrument instrument;
    private final InstrumentAccountSwitcher instrumentAccountSwitcher;
    private final boolean isEquitySubzeroEnabled;
    private final boolean isEquityTradeLadderEnabled;
    private final boolean isInEtfSupportedRegion;
    private final boolean isInRetirementOptions;
    private final boolean isOptionsRegionSupported;
    private final UiEvent<IntentKey> ladderActionIntentEvent;
    private final boolean loadingAccountSwitcher;
    private final List<UiOptionInstrumentPosition> optionPositions;
    private final UiEvent<IntentKey> optionsActionIntentEvent;
    private final Position position;
    private final boolean priceBookExists;
    private final boolean shouldShowAccountSwitcher;
    private final OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp shouldShowOptionsUpgradeOnSdp;
    private final UiEvent<String> showSubzeroFtuxEvent;
    private final StockDetailTradeBar stockDetailTradeBar;
    private final boolean useSduiAccountSwitcher;

    /* compiled from: InstrumentDetailTradeBarViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.values().length];
            try {
                iArr[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.SERVER_SHOULD_SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.SERVER_SHOULD_NOT_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.CLIENT_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DisplayType.values().length];
            try {
                iArr2[DisplayType.VOLUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DisplayType.QUOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public InstrumentDetailTradeBarViewState() {
        this(null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268435455, null);
    }

    /* renamed from: component23, reason: from getter */
    private final DisplayType getDisplayType() {
        return this.displayType;
    }

    /* renamed from: component24, reason: from getter */
    private final BigDecimal getFundamentalVolume() {
        return this.fundamentalVolume;
    }

    /* renamed from: component25, reason: from getter */
    private final StockDetailTradeBar getStockDetailTradeBar() {
        return this.stockDetailTradeBar;
    }

    public static /* synthetic */ InstrumentDetailTradeBarViewState copy$default(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, AnalyticsData analyticsData, Instrument instrument, Account account, BuySellData buySellData, OptionChain optionChain, OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp showOptionsUpgradeOnSdp, List list, boolean z, Position position, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, boolean z2, boolean z3, InstrumentAccountSwitcher instrumentAccountSwitcher, List list2, UiEvent uiEvent4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, DisplayType displayType, BigDecimal bigDecimal, StockDetailTradeBar stockDetailTradeBar, boolean z9, UiEvent uiEvent5, boolean z10, int i, Object obj) {
        boolean z11;
        UiEvent uiEvent6;
        AnalyticsData analyticsData2 = (i & 1) != 0 ? instrumentDetailTradeBarViewState.analyticsData : analyticsData;
        Instrument instrument2 = (i & 2) != 0 ? instrumentDetailTradeBarViewState.instrument : instrument;
        Account account2 = (i & 4) != 0 ? instrumentDetailTradeBarViewState.account : account;
        BuySellData buySellData2 = (i & 8) != 0 ? instrumentDetailTradeBarViewState.buySellData : buySellData;
        OptionChain optionChain2 = (i & 16) != 0 ? instrumentDetailTradeBarViewState.activeOptionChain : optionChain;
        OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp showOptionsUpgradeOnSdp2 = (i & 32) != 0 ? instrumentDetailTradeBarViewState.shouldShowOptionsUpgradeOnSdp : showOptionsUpgradeOnSdp;
        List list3 = (i & 64) != 0 ? instrumentDetailTradeBarViewState.optionPositions : list;
        boolean z12 = (i & 128) != 0 ? instrumentDetailTradeBarViewState.hasPositions : z;
        Position position2 = (i & 256) != 0 ? instrumentDetailTradeBarViewState.position : position;
        UiEvent uiEvent7 = (i & 512) != 0 ? instrumentDetailTradeBarViewState.initiateOrderEvent : uiEvent;
        UiEvent uiEvent8 = (i & 1024) != 0 ? instrumentDetailTradeBarViewState.optionsActionIntentEvent : uiEvent2;
        UiEvent uiEvent9 = (i & 2048) != 0 ? instrumentDetailTradeBarViewState.ladderActionIntentEvent : uiEvent3;
        boolean z13 = (i & 4096) != 0 ? instrumentDetailTradeBarViewState.shouldShowAccountSwitcher : z2;
        boolean z14 = (i & 8192) != 0 ? instrumentDetailTradeBarViewState.isInRetirementOptions : z3;
        AnalyticsData analyticsData3 = analyticsData2;
        InstrumentAccountSwitcher instrumentAccountSwitcher2 = (i & 16384) != 0 ? instrumentDetailTradeBarViewState.instrumentAccountSwitcher : instrumentAccountSwitcher;
        List list4 = (i & 32768) != 0 ? instrumentDetailTradeBarViewState.allAccounts : list2;
        UiEvent uiEvent10 = (i & 65536) != 0 ? instrumentDetailTradeBarViewState.accountSwitcherRefreshedEvent : uiEvent4;
        boolean z15 = (i & 131072) != 0 ? instrumentDetailTradeBarViewState.loadingAccountSwitcher : z4;
        boolean z16 = (i & 262144) != 0 ? instrumentDetailTradeBarViewState.isOptionsRegionSupported : z5;
        boolean z17 = (i & 524288) != 0 ? instrumentDetailTradeBarViewState.isEquityTradeLadderEnabled : z6;
        boolean z18 = (i & 1048576) != 0 ? instrumentDetailTradeBarViewState.isEquitySubzeroEnabled : z7;
        boolean z19 = (i & 2097152) != 0 ? instrumentDetailTradeBarViewState.priceBookExists : z8;
        DisplayType displayType2 = (i & 4194304) != 0 ? instrumentDetailTradeBarViewState.displayType : displayType;
        BigDecimal bigDecimal2 = (i & 8388608) != 0 ? instrumentDetailTradeBarViewState.fundamentalVolume : bigDecimal;
        StockDetailTradeBar stockDetailTradeBar2 = (i & 16777216) != 0 ? instrumentDetailTradeBarViewState.stockDetailTradeBar : stockDetailTradeBar;
        boolean z20 = (i & 33554432) != 0 ? instrumentDetailTradeBarViewState.isInEtfSupportedRegion : z9;
        UiEvent uiEvent11 = (i & 67108864) != 0 ? instrumentDetailTradeBarViewState.showSubzeroFtuxEvent : uiEvent5;
        if ((i & 134217728) != 0) {
            uiEvent6 = uiEvent11;
            z11 = instrumentDetailTradeBarViewState.useSduiAccountSwitcher;
        } else {
            z11 = z10;
            uiEvent6 = uiEvent11;
        }
        return instrumentDetailTradeBarViewState.copy(analyticsData3, instrument2, account2, buySellData2, optionChain2, showOptionsUpgradeOnSdp2, list3, z12, position2, uiEvent7, uiEvent8, uiEvent9, z13, z14, instrumentAccountSwitcher2, list4, uiEvent10, z15, z16, z17, z18, z19, displayType2, bigDecimal2, stockDetailTradeBar2, z20, uiEvent6, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final AnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }

    public final UiEvent<EquityOrderSide> component10() {
        return this.initiateOrderEvent;
    }

    public final UiEvent<IntentKey> component11() {
        return this.optionsActionIntentEvent;
    }

    public final UiEvent<IntentKey> component12() {
        return this.ladderActionIntentEvent;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShouldShowAccountSwitcher() {
        return this.shouldShowAccountSwitcher;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsInRetirementOptions() {
        return this.isInRetirementOptions;
    }

    /* renamed from: component15, reason: from getter */
    public final InstrumentAccountSwitcher getInstrumentAccountSwitcher() {
        return this.instrumentAccountSwitcher;
    }

    public final List<Account> component16() {
        return this.allAccounts;
    }

    public final UiEvent<Either<AccountSwitcherData, Throwable>> component17() {
        return this.accountSwitcherRefreshedEvent;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getLoadingAccountSwitcher() {
        return this.loadingAccountSwitcher;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsOptionsRegionSupported() {
        return this.isOptionsRegionSupported;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsEquityTradeLadderEnabled() {
        return this.isEquityTradeLadderEnabled;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsEquitySubzeroEnabled() {
        return this.isEquitySubzeroEnabled;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getPriceBookExists() {
        return this.priceBookExists;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsInEtfSupportedRegion() {
        return this.isInEtfSupportedRegion;
    }

    public final UiEvent<String> component27() {
        return this.showSubzeroFtuxEvent;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    /* renamed from: component3, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component4, reason: from getter */
    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionChain getActiveOptionChain() {
        return this.activeOptionChain;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp getShouldShowOptionsUpgradeOnSdp() {
        return this.shouldShowOptionsUpgradeOnSdp;
    }

    public final List<UiOptionInstrumentPosition> component7() {
        return this.optionPositions;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasPositions() {
        return this.hasPositions;
    }

    /* renamed from: component9, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    public final InstrumentDetailTradeBarViewState copy(AnalyticsData analyticsData, Instrument instrument, Account account, BuySellData buySellData, OptionChain activeOptionChain, OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp shouldShowOptionsUpgradeOnSdp, List<UiOptionInstrumentPosition> optionPositions, boolean hasPositions, Position position, UiEvent<EquityOrderSide> initiateOrderEvent, UiEvent<IntentKey> optionsActionIntentEvent, UiEvent<IntentKey> ladderActionIntentEvent, boolean shouldShowAccountSwitcher, boolean isInRetirementOptions, InstrumentAccountSwitcher instrumentAccountSwitcher, List<Account> allAccounts, UiEvent<Either<AccountSwitcherData, Throwable>> accountSwitcherRefreshedEvent, boolean loadingAccountSwitcher, boolean isOptionsRegionSupported, boolean isEquityTradeLadderEnabled, boolean isEquitySubzeroEnabled, boolean priceBookExists, DisplayType displayType, BigDecimal fundamentalVolume, StockDetailTradeBar stockDetailTradeBar, boolean isInEtfSupportedRegion, UiEvent<String> showSubzeroFtuxEvent, boolean useSduiAccountSwitcher) {
        Intrinsics.checkNotNullParameter(shouldShowOptionsUpgradeOnSdp, "shouldShowOptionsUpgradeOnSdp");
        Intrinsics.checkNotNullParameter(optionPositions, "optionPositions");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        return new InstrumentDetailTradeBarViewState(analyticsData, instrument, account, buySellData, activeOptionChain, shouldShowOptionsUpgradeOnSdp, optionPositions, hasPositions, position, initiateOrderEvent, optionsActionIntentEvent, ladderActionIntentEvent, shouldShowAccountSwitcher, isInRetirementOptions, instrumentAccountSwitcher, allAccounts, accountSwitcherRefreshedEvent, loadingAccountSwitcher, isOptionsRegionSupported, isEquityTradeLadderEnabled, isEquitySubzeroEnabled, priceBookExists, displayType, fundamentalVolume, stockDetailTradeBar, isInEtfSupportedRegion, showSubzeroFtuxEvent, useSduiAccountSwitcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstrumentDetailTradeBarViewState)) {
            return false;
        }
        InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) other;
        return Intrinsics.areEqual(this.analyticsData, instrumentDetailTradeBarViewState.analyticsData) && Intrinsics.areEqual(this.instrument, instrumentDetailTradeBarViewState.instrument) && Intrinsics.areEqual(this.account, instrumentDetailTradeBarViewState.account) && Intrinsics.areEqual(this.buySellData, instrumentDetailTradeBarViewState.buySellData) && Intrinsics.areEqual(this.activeOptionChain, instrumentDetailTradeBarViewState.activeOptionChain) && this.shouldShowOptionsUpgradeOnSdp == instrumentDetailTradeBarViewState.shouldShowOptionsUpgradeOnSdp && Intrinsics.areEqual(this.optionPositions, instrumentDetailTradeBarViewState.optionPositions) && this.hasPositions == instrumentDetailTradeBarViewState.hasPositions && Intrinsics.areEqual(this.position, instrumentDetailTradeBarViewState.position) && Intrinsics.areEqual(this.initiateOrderEvent, instrumentDetailTradeBarViewState.initiateOrderEvent) && Intrinsics.areEqual(this.optionsActionIntentEvent, instrumentDetailTradeBarViewState.optionsActionIntentEvent) && Intrinsics.areEqual(this.ladderActionIntentEvent, instrumentDetailTradeBarViewState.ladderActionIntentEvent) && this.shouldShowAccountSwitcher == instrumentDetailTradeBarViewState.shouldShowAccountSwitcher && this.isInRetirementOptions == instrumentDetailTradeBarViewState.isInRetirementOptions && Intrinsics.areEqual(this.instrumentAccountSwitcher, instrumentDetailTradeBarViewState.instrumentAccountSwitcher) && Intrinsics.areEqual(this.allAccounts, instrumentDetailTradeBarViewState.allAccounts) && Intrinsics.areEqual(this.accountSwitcherRefreshedEvent, instrumentDetailTradeBarViewState.accountSwitcherRefreshedEvent) && this.loadingAccountSwitcher == instrumentDetailTradeBarViewState.loadingAccountSwitcher && this.isOptionsRegionSupported == instrumentDetailTradeBarViewState.isOptionsRegionSupported && this.isEquityTradeLadderEnabled == instrumentDetailTradeBarViewState.isEquityTradeLadderEnabled && this.isEquitySubzeroEnabled == instrumentDetailTradeBarViewState.isEquitySubzeroEnabled && this.priceBookExists == instrumentDetailTradeBarViewState.priceBookExists && this.displayType == instrumentDetailTradeBarViewState.displayType && Intrinsics.areEqual(this.fundamentalVolume, instrumentDetailTradeBarViewState.fundamentalVolume) && Intrinsics.areEqual(this.stockDetailTradeBar, instrumentDetailTradeBarViewState.stockDetailTradeBar) && this.isInEtfSupportedRegion == instrumentDetailTradeBarViewState.isInEtfSupportedRegion && Intrinsics.areEqual(this.showSubzeroFtuxEvent, instrumentDetailTradeBarViewState.showSubzeroFtuxEvent) && this.useSduiAccountSwitcher == instrumentDetailTradeBarViewState.useSduiAccountSwitcher;
    }

    public int hashCode() {
        AnalyticsData analyticsData = this.analyticsData;
        int iHashCode = (analyticsData == null ? 0 : analyticsData.hashCode()) * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Account account = this.account;
        int iHashCode3 = (iHashCode2 + (account == null ? 0 : account.hashCode())) * 31;
        BuySellData buySellData = this.buySellData;
        int iHashCode4 = (iHashCode3 + (buySellData == null ? 0 : buySellData.hashCode())) * 31;
        OptionChain optionChain = this.activeOptionChain;
        int iHashCode5 = (((((((iHashCode4 + (optionChain == null ? 0 : optionChain.hashCode())) * 31) + this.shouldShowOptionsUpgradeOnSdp.hashCode()) * 31) + this.optionPositions.hashCode()) * 31) + Boolean.hashCode(this.hasPositions)) * 31;
        Position position = this.position;
        int iHashCode6 = (iHashCode5 + (position == null ? 0 : position.hashCode())) * 31;
        UiEvent<EquityOrderSide> uiEvent = this.initiateOrderEvent;
        int iHashCode7 = (iHashCode6 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<IntentKey> uiEvent2 = this.optionsActionIntentEvent;
        int iHashCode8 = (iHashCode7 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<IntentKey> uiEvent3 = this.ladderActionIntentEvent;
        int iHashCode9 = (((((iHashCode8 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31) + Boolean.hashCode(this.shouldShowAccountSwitcher)) * 31) + Boolean.hashCode(this.isInRetirementOptions)) * 31;
        InstrumentAccountSwitcher instrumentAccountSwitcher = this.instrumentAccountSwitcher;
        int iHashCode10 = (((iHashCode9 + (instrumentAccountSwitcher == null ? 0 : instrumentAccountSwitcher.hashCode())) * 31) + this.allAccounts.hashCode()) * 31;
        UiEvent<Either<AccountSwitcherData, Throwable>> uiEvent4 = this.accountSwitcherRefreshedEvent;
        int iHashCode11 = (((((((((((((iHashCode10 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31) + Boolean.hashCode(this.loadingAccountSwitcher)) * 31) + Boolean.hashCode(this.isOptionsRegionSupported)) * 31) + Boolean.hashCode(this.isEquityTradeLadderEnabled)) * 31) + Boolean.hashCode(this.isEquitySubzeroEnabled)) * 31) + Boolean.hashCode(this.priceBookExists)) * 31) + this.displayType.hashCode()) * 31;
        BigDecimal bigDecimal = this.fundamentalVolume;
        int iHashCode12 = (iHashCode11 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        StockDetailTradeBar stockDetailTradeBar = this.stockDetailTradeBar;
        int iHashCode13 = (((iHashCode12 + (stockDetailTradeBar == null ? 0 : stockDetailTradeBar.hashCode())) * 31) + Boolean.hashCode(this.isInEtfSupportedRegion)) * 31;
        UiEvent<String> uiEvent5 = this.showSubzeroFtuxEvent;
        return ((iHashCode13 + (uiEvent5 != null ? uiEvent5.hashCode() : 0)) * 31) + Boolean.hashCode(this.useSduiAccountSwitcher);
    }

    public String toString() {
        return "InstrumentDetailTradeBarViewState(analyticsData=" + this.analyticsData + ", instrument=" + this.instrument + ", account=" + this.account + ", buySellData=" + this.buySellData + ", activeOptionChain=" + this.activeOptionChain + ", shouldShowOptionsUpgradeOnSdp=" + this.shouldShowOptionsUpgradeOnSdp + ", optionPositions=" + this.optionPositions + ", hasPositions=" + this.hasPositions + ", position=" + this.position + ", initiateOrderEvent=" + this.initiateOrderEvent + ", optionsActionIntentEvent=" + this.optionsActionIntentEvent + ", ladderActionIntentEvent=" + this.ladderActionIntentEvent + ", shouldShowAccountSwitcher=" + this.shouldShowAccountSwitcher + ", isInRetirementOptions=" + this.isInRetirementOptions + ", instrumentAccountSwitcher=" + this.instrumentAccountSwitcher + ", allAccounts=" + this.allAccounts + ", accountSwitcherRefreshedEvent=" + this.accountSwitcherRefreshedEvent + ", loadingAccountSwitcher=" + this.loadingAccountSwitcher + ", isOptionsRegionSupported=" + this.isOptionsRegionSupported + ", isEquityTradeLadderEnabled=" + this.isEquityTradeLadderEnabled + ", isEquitySubzeroEnabled=" + this.isEquitySubzeroEnabled + ", priceBookExists=" + this.priceBookExists + ", displayType=" + this.displayType + ", fundamentalVolume=" + this.fundamentalVolume + ", stockDetailTradeBar=" + this.stockDetailTradeBar + ", isInEtfSupportedRegion=" + this.isInEtfSupportedRegion + ", showSubzeroFtuxEvent=" + this.showSubzeroFtuxEvent + ", useSduiAccountSwitcher=" + this.useSduiAccountSwitcher + ")";
    }

    public InstrumentDetailTradeBarViewState(AnalyticsData analyticsData, Instrument instrument, Account account, BuySellData buySellData, OptionChain optionChain, OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp shouldShowOptionsUpgradeOnSdp, List<UiOptionInstrumentPosition> optionPositions, boolean z, Position position, UiEvent<EquityOrderSide> uiEvent, UiEvent<IntentKey> uiEvent2, UiEvent<IntentKey> uiEvent3, boolean z2, boolean z3, InstrumentAccountSwitcher instrumentAccountSwitcher, List<Account> allAccounts, UiEvent<Either<AccountSwitcherData, Throwable>> uiEvent4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, DisplayType displayType, BigDecimal bigDecimal, StockDetailTradeBar stockDetailTradeBar, boolean z9, UiEvent<String> uiEvent5, boolean z10) {
        Intrinsics.checkNotNullParameter(shouldShowOptionsUpgradeOnSdp, "shouldShowOptionsUpgradeOnSdp");
        Intrinsics.checkNotNullParameter(optionPositions, "optionPositions");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        this.analyticsData = analyticsData;
        this.instrument = instrument;
        this.account = account;
        this.buySellData = buySellData;
        this.activeOptionChain = optionChain;
        this.shouldShowOptionsUpgradeOnSdp = shouldShowOptionsUpgradeOnSdp;
        this.optionPositions = optionPositions;
        this.hasPositions = z;
        this.position = position;
        this.initiateOrderEvent = uiEvent;
        this.optionsActionIntentEvent = uiEvent2;
        this.ladderActionIntentEvent = uiEvent3;
        this.shouldShowAccountSwitcher = z2;
        this.isInRetirementOptions = z3;
        this.instrumentAccountSwitcher = instrumentAccountSwitcher;
        this.allAccounts = allAccounts;
        this.accountSwitcherRefreshedEvent = uiEvent4;
        this.loadingAccountSwitcher = z4;
        this.isOptionsRegionSupported = z5;
        this.isEquityTradeLadderEnabled = z6;
        this.isEquitySubzeroEnabled = z7;
        this.priceBookExists = z8;
        this.displayType = displayType;
        this.fundamentalVolume = bigDecimal;
        this.stockDetailTradeBar = stockDetailTradeBar;
        this.isInEtfSupportedRegion = z9;
        this.showSubzeroFtuxEvent = uiEvent5;
        this.useSduiAccountSwitcher = z10;
    }

    public final AnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    public final OptionChain getActiveOptionChain() {
        return this.activeOptionChain;
    }

    public /* synthetic */ InstrumentDetailTradeBarViewState(AnalyticsData analyticsData, Instrument instrument, Account account, BuySellData buySellData, OptionChain optionChain, OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp showOptionsUpgradeOnSdp, List list, boolean z, Position position, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, boolean z2, boolean z3, InstrumentAccountSwitcher instrumentAccountSwitcher, List list2, UiEvent uiEvent4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, DisplayType displayType, BigDecimal bigDecimal, StockDetailTradeBar stockDetailTradeBar, boolean z9, UiEvent uiEvent5, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : analyticsData, (i & 2) != 0 ? null : instrument, (i & 4) != 0 ? null : account, (i & 8) != 0 ? null : buySellData, (i & 16) != 0 ? null : optionChain, (i & 32) != 0 ? OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.CLIENT_DEFAULT : showOptionsUpgradeOnSdp, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : position, (i & 512) != 0 ? null : uiEvent, (i & 1024) != 0 ? null : uiEvent2, (i & 2048) != 0 ? null : uiEvent3, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? false : z3, (i & 16384) != 0 ? null : instrumentAccountSwitcher, (i & 32768) != 0 ? CollectionsKt.emptyList() : list2, (i & 65536) != 0 ? null : uiEvent4, (i & 131072) != 0 ? false : z4, (i & 262144) != 0 ? false : z5, (i & 524288) != 0 ? false : z6, (i & 1048576) != 0 ? false : z7, (i & 2097152) != 0 ? false : z8, (i & 4194304) != 0 ? DisplayType.VOLUME : displayType, (i & 8388608) != 0 ? null : bigDecimal, (i & 16777216) != 0 ? null : stockDetailTradeBar, (i & 33554432) != 0 ? false : z9, (i & 67108864) != 0 ? null : uiEvent5, (i & 134217728) != 0 ? false : z10);
    }

    public final OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp getShouldShowOptionsUpgradeOnSdp() {
        return this.shouldShowOptionsUpgradeOnSdp;
    }

    public final List<UiOptionInstrumentPosition> getOptionPositions() {
        return this.optionPositions;
    }

    public final boolean getHasPositions() {
        return this.hasPositions;
    }

    public final Position getPosition() {
        return this.position;
    }

    public final UiEvent<EquityOrderSide> getInitiateOrderEvent() {
        return this.initiateOrderEvent;
    }

    public final UiEvent<IntentKey> getOptionsActionIntentEvent() {
        return this.optionsActionIntentEvent;
    }

    public final UiEvent<IntentKey> getLadderActionIntentEvent() {
        return this.ladderActionIntentEvent;
    }

    public final boolean getShouldShowAccountSwitcher() {
        return this.shouldShowAccountSwitcher;
    }

    public final boolean isInRetirementOptions() {
        return this.isInRetirementOptions;
    }

    public final InstrumentAccountSwitcher getInstrumentAccountSwitcher() {
        return this.instrumentAccountSwitcher;
    }

    public final List<Account> getAllAccounts() {
        return this.allAccounts;
    }

    public final UiEvent<Either<AccountSwitcherData, Throwable>> getAccountSwitcherRefreshedEvent() {
        return this.accountSwitcherRefreshedEvent;
    }

    public final boolean getLoadingAccountSwitcher() {
        return this.loadingAccountSwitcher;
    }

    public final boolean isOptionsRegionSupported() {
        return this.isOptionsRegionSupported;
    }

    public final boolean isEquityTradeLadderEnabled() {
        return this.isEquityTradeLadderEnabled;
    }

    public final boolean isEquitySubzeroEnabled() {
        return this.isEquitySubzeroEnabled;
    }

    public final boolean getPriceBookExists() {
        return this.priceBookExists;
    }

    public final boolean isInEtfSupportedRegion() {
        return this.isInEtfSupportedRegion;
    }

    public final UiEvent<String> getShowSubzeroFtuxEvent() {
        return this.showSubzeroFtuxEvent;
    }

    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    public final boolean getBuySellPositionsAvailable() {
        BuySellData buySellData = this.buySellData;
        return (buySellData == null || !buySellData.getHasAccount() || this.buySellData.getPosition() == null) ? false : true;
    }

    public final boolean getIgnoreOptionsAccess() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.shouldShowOptionsUpgradeOnSdp.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getOptionsEnabled() {
        BuySellData buySellData;
        if (this.isOptionsRegionSupported && (buySellData = this.buySellData) != null) {
            return BuySellHelper.INSTANCE.isOptionEnabled(buySellData, this.activeOptionChain, this.optionPositions, getIgnoreOptionsAccess());
        }
        return false;
    }

    public final boolean getLadderEnabled() {
        BuySellData buySellData;
        if (this.isEquityTradeLadderEnabled && this.priceBookExists && (buySellData = this.buySellData) != null) {
            return BuySellHelper.INSTANCE.isLadderEnabled(buySellData, this.isInEtfSupportedRegion);
        }
        return false;
    }

    public final boolean getBuyToOpenEnabled() {
        BuySellData buySellData = this.buySellData;
        if (buySellData != null) {
            return buySellData.getIsBuyToOpenEnabled();
        }
        return false;
    }

    public final boolean getBuyToCloseEnabled() {
        BuySellData buySellData = this.buySellData;
        if (buySellData != null) {
            return buySellData.getIsBuyToCloseEnabled();
        }
        return false;
    }

    public final boolean getSellEnabled() {
        BuySellData buySellData = this.buySellData;
        if (buySellData != null) {
            return buySellData.getIsSellToCloseEnabled();
        }
        return false;
    }

    public final boolean getShortEnabled() {
        BuySellData buySellData = this.buySellData;
        if (buySellData != null) {
            return buySellData.getIsSellToOpenEnabled();
        }
        return false;
    }

    public final boolean getHasAccessToOptions() {
        BuySellData buySellData = this.buySellData;
        if (buySellData != null) {
            return buySellData.getAccountHasAccessToOptions();
        }
        return false;
    }

    public final int getActionButtonCount() {
        return PrimitivesKt.toInt(getBuyToOpenEnabled()) + PrimitivesKt.toInt(getSellEnabled()) + PrimitivesKt.toInt(getOptionsEnabled());
    }

    public final InstrumentAccountSwitcherState getAccountSwitcherState() {
        String accountNumber;
        Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE;
        Account account = this.account;
        if (account == null || (accountNumber = account.getAccountNumber()) == null) {
            return null;
        }
        InstrumentAccountSwitcherType instrumentAccountSwitcherType = InstrumentAccountSwitcherType.TRADE_BAR;
        List<Account> list = this.allAccounts;
        InstrumentAccountSwitcher instrumentAccountSwitcher = this.instrumentAccountSwitcher;
        return new InstrumentAccountSwitcherState(name, this.loadingAccountSwitcher, accountNumber, list, false, this.useSduiAccountSwitcher, instrumentAccountSwitcherType, instrumentAccountSwitcher != null ? instrumentAccountSwitcher.getTradeBar() : null, 16, null);
    }

    public final String getButtonGroupTitle(Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return TradeButtonLogger.getGroupString(instrument, getBuyToOpenEnabled(), getBuyToCloseEnabled(), getOptionsEnabled(), getSellEnabled(), getShortEnabled());
    }

    public final InstrumentDetailTradeBarViewState3 getData(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InstrumentDetailTradeBarViewState3.ServerDriven serverDrivenData = getServerDrivenData();
        return serverDrivenData != null ? serverDrivenData : getClientDrivenData(context);
    }

    private final InstrumentDetailTradeBarViewState3.ServerDriven getServerDrivenData() {
        StockDetailTradeBar stockDetailTradeBar;
        Instrument instrument = this.instrument;
        if (instrument == null || !instrument.isIpoAccess() || (stockDetailTradeBar = this.stockDetailTradeBar) == null) {
            return null;
        }
        return new InstrumentDetailTradeBarViewState3.ServerDriven(stockDetailTradeBar.getTitle(), stockDetailTradeBar.getSubtitle(), stockDetailTradeBar.getButton());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InstrumentDetailTradeBarViewState3.ClientDriven getClientDrivenData(Context context) throws Resources.NotFoundException {
        String string2;
        String str;
        Quote quote;
        Resources resources = context.getResources();
        int i = WhenMappings.$EnumSwitchMapping$1[this.displayType.ordinal()];
        if (i == 1) {
            BigDecimal bigDecimal = this.fundamentalVolume;
            if (bigDecimal != null) {
                string2 = resources.getString(C15314R.string.instrument_detail_tradebar_volume_label);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                str = Formats.getIntegerFormat().format(bigDecimal);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BuySellData buySellData = this.buySellData;
            if (buySellData != null && (quote = buySellData.getQuote()) != null) {
                string2 = resources.getString(C15314R.string.instrument_detail_tradebar_quote_label);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                str = Money.format$default(quote.getLastTradePrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            } else {
                string2 = "";
                str = "";
            }
        }
        BuySellData buySellData2 = this.buySellData;
        String tradabilityError = buySellData2 != null ? BuySellHelper.INSTANCE.getTradabilityError(context, buySellData2, this.isEquitySubzeroEnabled, this.isInEtfSupportedRegion) : null;
        Intrinsics.checkNotNull(resources);
        return new InstrumentDetailTradeBarViewState3.ClientDriven(string2, str, tradabilityError, getClientDrivenExpandActions(resources));
    }

    private final List<AbstractTradeBarOverlayView.ExpandAction> getClientDrivenExpandActions(Resources res) {
        ArrayList arrayList = new ArrayList();
        if (getOptionsEnabled()) {
            arrayList.add(ActionItem.OPTIONS.toExpandAction(res, true));
        }
        if (getLadderEnabled()) {
            arrayList.add(ActionItem.LADDER.toExpandAction(res, true));
        }
        if (showSellShort()) {
            arrayList.add(ActionItem.SELL_SHORT.toExpandAction(res, true));
        }
        if (showSellToClose()) {
            arrayList.add(ActionItem.SELL.toExpandAction(res, getSellEnabled()));
        }
        if (showBuyToClose()) {
            arrayList.add(ActionItem.BUY_TO_CLOSE.toExpandAction(res, getBuyToCloseEnabled()));
        }
        if (showBuyToOpen()) {
            arrayList.add(ActionItem.BUY_TO_OPEN.toExpandAction(res, getBuyToOpenEnabled()));
        }
        return arrayList;
    }

    private final boolean showSellShort() {
        BuySellData buySellData;
        return (showSellToClose() || (buySellData = this.buySellData) == null || !buySellData.getIsSellToOpenEnabled()) ? false : true;
    }

    private final boolean showBuyToClose() {
        BuySellData buySellData;
        return this.isEquitySubzeroEnabled && (buySellData = this.buySellData) != null && buySellData.getIsBuyToCloseEnabled();
    }

    private final boolean showBuyToOpen() {
        BuySellData buySellData = this.buySellData;
        return buySellData != null && buySellData.getIsBuyToOpenEnabled();
    }

    private final boolean showSellToClose() {
        BuySellData buySellData = this.buySellData;
        return buySellData != null && buySellData.getIsSellToCloseEnabled();
    }

    public final InstrumentDetailTradeBarViewState mutateAccountSwitcherRefreshState(InstrumentAccountSwitcherStore2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof InstrumentAccountSwitcherStore2.Failure) {
            return copy$default(this, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, new UiEvent(new Either.Right(((InstrumentAccountSwitcherStore2.Failure) state).getThrowable())), false, false, false, false, false, null, null, null, false, null, false, 268238847, null);
        }
        if (Intrinsics.areEqual(state, InstrumentAccountSwitcherStore2.Loading.INSTANCE)) {
            return copy$default(this, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, true, false, false, false, false, null, null, null, false, null, false, 268304383, null);
        }
        if (!(state instanceof InstrumentAccountSwitcherStore2.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        InstrumentAccountSwitcherStore2.Success success = (InstrumentAccountSwitcherStore2.Success) state;
        InstrumentAccountSwitcher switcher = success.getSwitcher();
        Account account = this.account;
        return copy$default(this, null, null, null, null, null, null, null, false, null, null, null, null, false, false, switcher, null, account != null ? new UiEvent(new Either.Left(AccountSwitcherExtensions.toAccountSwitcherData(success.getSwitcher().getTradeBar(), account.getAccountNumber(), new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, null, null, 14, null)))) : null, false, false, false, false, false, null, null, null, false, null, false, 268222463, null);
    }
}
