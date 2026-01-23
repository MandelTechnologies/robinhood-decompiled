package com.robinhood.android.account.p060ui;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import com.robinhood.android.feature.lib.sweep.interest.SweepEnrollmentData;
import com.robinhood.android.futures.lib.rhd.accountoverview.RhdAccountDataState;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.lib.models.instant.p169db.InstantDepositCard;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.android.models.accountoverview.p184db.DayTradeCard;
import com.robinhood.android.models.portfolio.AccountMarketValuesLive;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.DripSettingsStore;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionsStatus;
import com.robinhood.models.p320db.SlipHubCard;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewDataState.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\bh\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010$\u001a\u00020\u0016\u0012\b\b\u0002\u0010%\u001a\u00020\u0016\u0012\b\b\u0002\u0010&\u001a\u00020\u0016\u0012\b\b\u0002\u0010'\u001a\u00020\u0016\u0012\b\b\u0002\u0010(\u001a\u00020\u0016\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.\u0012\b\b\u0002\u00100\u001a\u00020\u0016\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u00108\u001a\u00020\u0016\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010=\u001a\u00020\u0016¢\u0006\u0004\b>\u0010?J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0012\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010#HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\u0012\u0010\u0096\u0001\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u0097\u0001\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u000103HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u000107HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0016HÆ\u0003J®\u0003\u0010¡\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u00162\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010&\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020\u00162\b\b\u0002\u0010(\u001a\u00020\u00162\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u00052\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.2\b\b\u0002\u00100\u001a\u00020\u00162\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\b\b\u0002\u00108\u001a\u00020\u00162\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010=\u001a\u00020\u0016HÆ\u0001J\u0015\u0010¢\u0001\u001a\u00020\u00162\t\u0010£\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010¤\u0001\u001a\u00030¥\u0001HÖ\u0001J\n\u0010¦\u0001\u001a\u00020:HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bN\u0010MR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010CR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010RR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010\u0019\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bU\u0010RR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0011\u0010$\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b`\u0010RR\u0011\u0010%\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\ba\u0010RR\u0011\u0010&\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bb\u0010RR\u0011\u0010'\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b'\u0010RR\u0011\u0010(\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b(\u0010RR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\be\u0010CR\u0019\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0011\u00100\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u0010RR\u0013\u00101\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bh\u0010YR\u0013\u00102\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0013\u00106\u001a\u0004\u0018\u000107¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0011\u00108\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bo\u0010RR\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0013\u0010;\u001a\u0004\u0018\u00010<¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0011\u0010=\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b=\u0010RR\u0011\u0010t\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bt\u0010RR\u0011\u0010u\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bu\u0010RR\u0011\u0010v\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bv\u0010RR\u0011\u0010w\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bw\u0010RR\u0011\u0010x\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bx\u0010RR\u0011\u0010y\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bz\u0010RR\u0011\u0010{\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b{\u0010RR\u0011\u0010|\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b|\u0010RR\u0011\u0010}\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b}\u0010R¨\u0006§\u0001"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewDataState;", "", "activeAccount", "Lcom/robinhood/models/db/Account;", "accounts", "", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "dayTradeCard", "Lcom/robinhood/android/models/accountoverview/db/DayTradeCard;", "marginSettings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "marginInvestingEligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "accountTypeEligibility", "investmentSchedules", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "dripCardType", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore$DripCardType;", "isDripOnboarded", "", "slipHubCard", "Lcom/robinhood/models/db/SlipHubCard;", "slipDisabled", "sweepEnrollmentData", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "interestEarningDisclosure", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "dayTradesContentfulSummary", "", "limitedMarginRiskContent", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "instantCard", "Lcom/robinhood/android/lib/models/instant/db/InstantDepositCard;", "inOptionsJointAccountPreSetupExperiment", "inOptionsKnowledgeCheckExperiment", "inOptionsLevel3EntryPointOptionsSettingsExperiment", "isInstantDepositFeatureEnabled", "isInLeveredMarginRegionGate", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "cardOrder", "Lcom/robinhood/android/models/accountoverview/db/CardOrder$CardIdentifier;", "accountFeatures", "", "Lcom/robinhood/librobinhood/data/store/AccountFeature;", "isInMcwRegionGate", "mcwCashExplainerDisclosure", "accountMarketValuesLive", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;", "rhdAccountDataState", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "optionsStatus", "Lcom/robinhood/models/db/OptionsStatus;", "showOptionsCardForced", "optionKnowledgeCheckAppointmentId", "", "marginInvestingInfo", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "isMemberPdtRevampV1", "<init>", "(Lcom/robinhood/models/db/Account;Ljava/util/List;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/android/models/accountoverview/db/DayTradeCard;Lcom/robinhood/android/lib/margin/db/models/MarginSettings;Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;Ljava/util/List;Lcom/robinhood/librobinhood/data/store/DripSettingsStore$DripCardType;ZLcom/robinhood/models/db/SlipHubCard;ZLcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;Lcom/robinhood/staticcontent/model/disclosure/Disclosure;Ljava/lang/CharSequence;Lcom/robinhood/staticcontent/model/OtherMarkdown;Lcom/robinhood/android/lib/models/instant/db/InstantDepositCard;ZZZZZLcom/robinhood/iso/countrycode/CountryCode$Supported;Ljava/util/List;Ljava/util/Set;ZLcom/robinhood/staticcontent/model/disclosure/Disclosure;Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;Lcom/robinhood/models/db/OptionsStatus;ZLjava/lang/String;Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;Z)V", "getActiveAccount", "()Lcom/robinhood/models/db/Account;", "getAccounts", "()Ljava/util/List;", "getUnifiedBalances", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "getUnifiedAccount", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getDayTradeCard", "()Lcom/robinhood/android/models/accountoverview/db/DayTradeCard;", "getMarginSettings", "()Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "getMarginInvestingEligibility", "()Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "getAccountTypeEligibility", "getInvestmentSchedules", "getDripCardType", "()Lcom/robinhood/librobinhood/data/store/DripSettingsStore$DripCardType;", "()Z", "getSlipHubCard", "()Lcom/robinhood/models/db/SlipHubCard;", "getSlipDisabled", "getSweepEnrollmentData", "()Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "getInterestEarningDisclosure", "()Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "getDayTradesContentfulSummary", "()Ljava/lang/CharSequence;", "getLimitedMarginRiskContent", "()Lcom/robinhood/staticcontent/model/OtherMarkdown;", "getInstantCard", "()Lcom/robinhood/android/lib/models/instant/db/InstantDepositCard;", "getInOptionsJointAccountPreSetupExperiment", "getInOptionsKnowledgeCheckExperiment", "getInOptionsLevel3EntryPointOptionsSettingsExperiment", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getCardOrder", "getAccountFeatures", "()Ljava/util/Set;", "getMcwCashExplainerDisclosure", "getAccountMarketValuesLive", "()Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;", "getRhdAccountDataState", "()Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "getOptionsStatus", "()Lcom/robinhood/models/db/OptionsStatus;", "getShowOptionsCardForced", "getOptionKnowledgeCheckAppointmentId", "()Ljava/lang/String;", "getMarginInvestingInfo", "()Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "isMarginSupported", "isSlipSupported", "isDripSupported", "isRecurringSupported", "isOptionsSupported", "canUpgradeToOptions", "getCanUpgradeToOptions", "isSweepSupported", "isEcSupported", "isCryptoSupported", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "copy", "equals", "other", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountOverviewDataState {
    public static final int $stable = 8;
    private final Set<AccountFeature> accountFeatures;
    private final AccountMarketValuesLive accountMarketValuesLive;
    private final GetMultiAccountEligibilityResponseDto accountTypeEligibility;
    private final List<Account> accounts;
    private final Account activeAccount;
    private final boolean canUpgradeToOptions;
    private final List<CardOrder.CardIdentifier> cardOrder;
    private final CountryCode.Supported countryCode;
    private final DayTradeCard dayTradeCard;
    private final CharSequence dayTradesContentfulSummary;
    private final DripSettingsStore.DripCardType dripCardType;
    private final boolean inOptionsJointAccountPreSetupExperiment;
    private final boolean inOptionsKnowledgeCheckExperiment;
    private final boolean inOptionsLevel3EntryPointOptionsSettingsExperiment;
    private final InstantDepositCard instantCard;
    private final Disclosure interestEarningDisclosure;
    private final List<InvestmentSchedule> investmentSchedules;
    private final boolean isCryptoSupported;
    private final boolean isDripOnboarded;
    private final boolean isDripSupported;
    private final boolean isEcSupported;
    private final boolean isInLeveredMarginRegionGate;
    private final boolean isInMcwRegionGate;
    private final boolean isInstantDepositFeatureEnabled;
    private final boolean isMarginSupported;
    private final boolean isMemberPdtRevampV1;
    private final boolean isOptionsSupported;
    private final boolean isRecurringSupported;
    private final boolean isSlipSupported;
    private final boolean isSweepSupported;
    private final OtherMarkdown limitedMarginRiskContent;
    private final GetMultiAccountEligibilityResponseDto marginInvestingEligibility;
    private final ApiMarginInvestingInfo marginInvestingInfo;
    private final MarginSettings marginSettings;
    private final Disclosure mcwCashExplainerDisclosure;
    private final String optionKnowledgeCheckAppointmentId;
    private final OptionsStatus optionsStatus;
    private final RhdAccountDataState rhdAccountDataState;
    private final boolean showOptionsCardForced;
    private final boolean slipDisabled;
    private final SlipHubCard slipHubCard;
    private final SweepEnrollmentData sweepEnrollmentData;
    private final UnifiedAccountV2 unifiedAccount;
    private final UnifiedBalances unifiedBalances;

    public AccountOverviewDataState() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, null, false, null, null, false, -1, 7, null);
    }

    public static /* synthetic */ AccountOverviewDataState copy$default(AccountOverviewDataState accountOverviewDataState, Account account, List list, UnifiedBalances unifiedBalances, UnifiedAccountV2 unifiedAccountV2, DayTradeCard dayTradeCard, MarginSettings marginSettings, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto2, List list2, DripSettingsStore.DripCardType dripCardType, boolean z, SlipHubCard slipHubCard, boolean z2, SweepEnrollmentData sweepEnrollmentData, Disclosure disclosure, CharSequence charSequence, OtherMarkdown otherMarkdown, InstantDepositCard instantDepositCard, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, CountryCode.Supported supported, List list3, Set set, boolean z8, Disclosure disclosure2, AccountMarketValuesLive accountMarketValuesLive, RhdAccountDataState rhdAccountDataState, OptionsStatus optionsStatus, boolean z9, String str, ApiMarginInvestingInfo apiMarginInvestingInfo, boolean z10, int i, int i2, Object obj) {
        boolean z11;
        ApiMarginInvestingInfo apiMarginInvestingInfo2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        CountryCode.Supported supported2;
        List list4;
        Set set2;
        boolean z17;
        Disclosure disclosure3;
        AccountMarketValuesLive accountMarketValuesLive2;
        RhdAccountDataState rhdAccountDataState2;
        OptionsStatus optionsStatus2;
        boolean z18;
        String str2;
        Disclosure disclosure4;
        UnifiedAccountV2 unifiedAccountV22;
        DayTradeCard dayTradeCard2;
        MarginSettings marginSettings2;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto3;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto4;
        List list5;
        DripSettingsStore.DripCardType dripCardType2;
        boolean z19;
        SlipHubCard slipHubCard2;
        boolean z20;
        SweepEnrollmentData sweepEnrollmentData2;
        CharSequence charSequence2;
        OtherMarkdown otherMarkdown2;
        InstantDepositCard instantDepositCard2;
        List list6;
        UnifiedBalances unifiedBalances2;
        Account account2 = (i & 1) != 0 ? accountOverviewDataState.activeAccount : account;
        List list7 = (i & 2) != 0 ? accountOverviewDataState.accounts : list;
        UnifiedBalances unifiedBalances3 = (i & 4) != 0 ? accountOverviewDataState.unifiedBalances : unifiedBalances;
        UnifiedAccountV2 unifiedAccountV23 = (i & 8) != 0 ? accountOverviewDataState.unifiedAccount : unifiedAccountV2;
        DayTradeCard dayTradeCard3 = (i & 16) != 0 ? accountOverviewDataState.dayTradeCard : dayTradeCard;
        MarginSettings marginSettings3 = (i & 32) != 0 ? accountOverviewDataState.marginSettings : marginSettings;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto5 = (i & 64) != 0 ? accountOverviewDataState.marginInvestingEligibility : getMultiAccountEligibilityResponseDto;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto6 = (i & 128) != 0 ? accountOverviewDataState.accountTypeEligibility : getMultiAccountEligibilityResponseDto2;
        List list8 = (i & 256) != 0 ? accountOverviewDataState.investmentSchedules : list2;
        DripSettingsStore.DripCardType dripCardType3 = (i & 512) != 0 ? accountOverviewDataState.dripCardType : dripCardType;
        boolean z21 = (i & 1024) != 0 ? accountOverviewDataState.isDripOnboarded : z;
        SlipHubCard slipHubCard3 = (i & 2048) != 0 ? accountOverviewDataState.slipHubCard : slipHubCard;
        boolean z22 = (i & 4096) != 0 ? accountOverviewDataState.slipDisabled : z2;
        SweepEnrollmentData sweepEnrollmentData3 = (i & 8192) != 0 ? accountOverviewDataState.sweepEnrollmentData : sweepEnrollmentData;
        Account account3 = account2;
        Disclosure disclosure5 = (i & 16384) != 0 ? accountOverviewDataState.interestEarningDisclosure : disclosure;
        CharSequence charSequence3 = (i & 32768) != 0 ? accountOverviewDataState.dayTradesContentfulSummary : charSequence;
        OtherMarkdown otherMarkdown3 = (i & 65536) != 0 ? accountOverviewDataState.limitedMarginRiskContent : otherMarkdown;
        InstantDepositCard instantDepositCard3 = (i & 131072) != 0 ? accountOverviewDataState.instantCard : instantDepositCard;
        boolean z23 = (i & 262144) != 0 ? accountOverviewDataState.inOptionsJointAccountPreSetupExperiment : z3;
        boolean z24 = (i & 524288) != 0 ? accountOverviewDataState.inOptionsKnowledgeCheckExperiment : z4;
        boolean z25 = (i & 1048576) != 0 ? accountOverviewDataState.inOptionsLevel3EntryPointOptionsSettingsExperiment : z5;
        boolean z26 = (i & 2097152) != 0 ? accountOverviewDataState.isInstantDepositFeatureEnabled : z6;
        boolean z27 = (i & 4194304) != 0 ? accountOverviewDataState.isInLeveredMarginRegionGate : z7;
        CountryCode.Supported supported3 = (i & 8388608) != 0 ? accountOverviewDataState.countryCode : supported;
        List list9 = (i & 16777216) != 0 ? accountOverviewDataState.cardOrder : list3;
        Set set3 = (i & 33554432) != 0 ? accountOverviewDataState.accountFeatures : set;
        boolean z28 = (i & 67108864) != 0 ? accountOverviewDataState.isInMcwRegionGate : z8;
        Disclosure disclosure6 = (i & 134217728) != 0 ? accountOverviewDataState.mcwCashExplainerDisclosure : disclosure2;
        AccountMarketValuesLive accountMarketValuesLive3 = (i & 268435456) != 0 ? accountOverviewDataState.accountMarketValuesLive : accountMarketValuesLive;
        RhdAccountDataState rhdAccountDataState3 = (i & 536870912) != 0 ? accountOverviewDataState.rhdAccountDataState : rhdAccountDataState;
        OptionsStatus optionsStatus3 = (i & 1073741824) != 0 ? accountOverviewDataState.optionsStatus : optionsStatus;
        boolean z29 = (i & Integer.MIN_VALUE) != 0 ? accountOverviewDataState.showOptionsCardForced : z9;
        String str3 = (i2 & 1) != 0 ? accountOverviewDataState.optionKnowledgeCheckAppointmentId : str;
        ApiMarginInvestingInfo apiMarginInvestingInfo3 = (i2 & 2) != 0 ? accountOverviewDataState.marginInvestingInfo : apiMarginInvestingInfo;
        if ((i2 & 4) != 0) {
            apiMarginInvestingInfo2 = apiMarginInvestingInfo3;
            z11 = accountOverviewDataState.isMemberPdtRevampV1;
            z13 = z24;
            z14 = z25;
            z15 = z26;
            z16 = z27;
            supported2 = supported3;
            list4 = list9;
            set2 = set3;
            z17 = z28;
            disclosure3 = disclosure6;
            accountMarketValuesLive2 = accountMarketValuesLive3;
            rhdAccountDataState2 = rhdAccountDataState3;
            optionsStatus2 = optionsStatus3;
            z18 = z29;
            str2 = str3;
            disclosure4 = disclosure5;
            dayTradeCard2 = dayTradeCard3;
            marginSettings2 = marginSettings3;
            getMultiAccountEligibilityResponseDto3 = getMultiAccountEligibilityResponseDto5;
            getMultiAccountEligibilityResponseDto4 = getMultiAccountEligibilityResponseDto6;
            list5 = list8;
            dripCardType2 = dripCardType3;
            z19 = z21;
            slipHubCard2 = slipHubCard3;
            z20 = z22;
            sweepEnrollmentData2 = sweepEnrollmentData3;
            charSequence2 = charSequence3;
            otherMarkdown2 = otherMarkdown3;
            instantDepositCard2 = instantDepositCard3;
            z12 = z23;
            list6 = list7;
            unifiedBalances2 = unifiedBalances3;
            unifiedAccountV22 = unifiedAccountV23;
        } else {
            z11 = z10;
            apiMarginInvestingInfo2 = apiMarginInvestingInfo3;
            z12 = z23;
            z13 = z24;
            z14 = z25;
            z15 = z26;
            z16 = z27;
            supported2 = supported3;
            list4 = list9;
            set2 = set3;
            z17 = z28;
            disclosure3 = disclosure6;
            accountMarketValuesLive2 = accountMarketValuesLive3;
            rhdAccountDataState2 = rhdAccountDataState3;
            optionsStatus2 = optionsStatus3;
            z18 = z29;
            str2 = str3;
            disclosure4 = disclosure5;
            unifiedAccountV22 = unifiedAccountV23;
            dayTradeCard2 = dayTradeCard3;
            marginSettings2 = marginSettings3;
            getMultiAccountEligibilityResponseDto3 = getMultiAccountEligibilityResponseDto5;
            getMultiAccountEligibilityResponseDto4 = getMultiAccountEligibilityResponseDto6;
            list5 = list8;
            dripCardType2 = dripCardType3;
            z19 = z21;
            slipHubCard2 = slipHubCard3;
            z20 = z22;
            sweepEnrollmentData2 = sweepEnrollmentData3;
            charSequence2 = charSequence3;
            otherMarkdown2 = otherMarkdown3;
            instantDepositCard2 = instantDepositCard3;
            list6 = list7;
            unifiedBalances2 = unifiedBalances3;
        }
        return accountOverviewDataState.copy(account3, list6, unifiedBalances2, unifiedAccountV22, dayTradeCard2, marginSettings2, getMultiAccountEligibilityResponseDto3, getMultiAccountEligibilityResponseDto4, list5, dripCardType2, z19, slipHubCard2, z20, sweepEnrollmentData2, disclosure4, charSequence2, otherMarkdown2, instantDepositCard2, z12, z13, z14, z15, z16, supported2, list4, set2, z17, disclosure3, accountMarketValuesLive2, rhdAccountDataState2, optionsStatus2, z18, str2, apiMarginInvestingInfo2, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    /* renamed from: component10, reason: from getter */
    public final DripSettingsStore.DripCardType getDripCardType() {
        return this.dripCardType;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsDripOnboarded() {
        return this.isDripOnboarded;
    }

    /* renamed from: component12, reason: from getter */
    public final SlipHubCard getSlipHubCard() {
        return this.slipHubCard;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getSlipDisabled() {
        return this.slipDisabled;
    }

    /* renamed from: component14, reason: from getter */
    public final SweepEnrollmentData getSweepEnrollmentData() {
        return this.sweepEnrollmentData;
    }

    /* renamed from: component15, reason: from getter */
    public final Disclosure getInterestEarningDisclosure() {
        return this.interestEarningDisclosure;
    }

    /* renamed from: component16, reason: from getter */
    public final CharSequence getDayTradesContentfulSummary() {
        return this.dayTradesContentfulSummary;
    }

    /* renamed from: component17, reason: from getter */
    public final OtherMarkdown getLimitedMarginRiskContent() {
        return this.limitedMarginRiskContent;
    }

    /* renamed from: component18, reason: from getter */
    public final InstantDepositCard getInstantCard() {
        return this.instantCard;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getInOptionsJointAccountPreSetupExperiment() {
        return this.inOptionsJointAccountPreSetupExperiment;
    }

    public final List<Account> component2() {
        return this.accounts;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getInOptionsKnowledgeCheckExperiment() {
        return this.inOptionsKnowledgeCheckExperiment;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getInOptionsLevel3EntryPointOptionsSettingsExperiment() {
        return this.inOptionsLevel3EntryPointOptionsSettingsExperiment;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsInstantDepositFeatureEnabled() {
        return this.isInstantDepositFeatureEnabled;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsInLeveredMarginRegionGate() {
        return this.isInLeveredMarginRegionGate;
    }

    /* renamed from: component24, reason: from getter */
    public final CountryCode.Supported getCountryCode() {
        return this.countryCode;
    }

    public final List<CardOrder.CardIdentifier> component25() {
        return this.cardOrder;
    }

    public final Set<AccountFeature> component26() {
        return this.accountFeatures;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    /* renamed from: component28, reason: from getter */
    public final Disclosure getMcwCashExplainerDisclosure() {
        return this.mcwCashExplainerDisclosure;
    }

    /* renamed from: component29, reason: from getter */
    public final AccountMarketValuesLive getAccountMarketValuesLive() {
        return this.accountMarketValuesLive;
    }

    /* renamed from: component3, reason: from getter */
    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    /* renamed from: component30, reason: from getter */
    public final RhdAccountDataState getRhdAccountDataState() {
        return this.rhdAccountDataState;
    }

    /* renamed from: component31, reason: from getter */
    public final OptionsStatus getOptionsStatus() {
        return this.optionsStatus;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getShowOptionsCardForced() {
        return this.showOptionsCardForced;
    }

    /* renamed from: component33, reason: from getter */
    public final String getOptionKnowledgeCheckAppointmentId() {
        return this.optionKnowledgeCheckAppointmentId;
    }

    /* renamed from: component34, reason: from getter */
    public final ApiMarginInvestingInfo getMarginInvestingInfo() {
        return this.marginInvestingInfo;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getIsMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    /* renamed from: component4, reason: from getter */
    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    /* renamed from: component5, reason: from getter */
    public final DayTradeCard getDayTradeCard() {
        return this.dayTradeCard;
    }

    /* renamed from: component6, reason: from getter */
    public final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    /* renamed from: component7, reason: from getter */
    public final GetMultiAccountEligibilityResponseDto getMarginInvestingEligibility() {
        return this.marginInvestingEligibility;
    }

    /* renamed from: component8, reason: from getter */
    public final GetMultiAccountEligibilityResponseDto getAccountTypeEligibility() {
        return this.accountTypeEligibility;
    }

    public final List<InvestmentSchedule> component9() {
        return this.investmentSchedules;
    }

    public final AccountOverviewDataState copy(Account activeAccount, List<Account> accounts2, UnifiedBalances unifiedBalances, UnifiedAccountV2 unifiedAccount, DayTradeCard dayTradeCard, MarginSettings marginSettings, GetMultiAccountEligibilityResponseDto marginInvestingEligibility, GetMultiAccountEligibilityResponseDto accountTypeEligibility, List<InvestmentSchedule> investmentSchedules, DripSettingsStore.DripCardType dripCardType, boolean isDripOnboarded, SlipHubCard slipHubCard, boolean slipDisabled, SweepEnrollmentData sweepEnrollmentData, Disclosure interestEarningDisclosure, CharSequence dayTradesContentfulSummary, OtherMarkdown limitedMarginRiskContent, InstantDepositCard instantCard, boolean inOptionsJointAccountPreSetupExperiment, boolean inOptionsKnowledgeCheckExperiment, boolean inOptionsLevel3EntryPointOptionsSettingsExperiment, boolean isInstantDepositFeatureEnabled, boolean isInLeveredMarginRegionGate, CountryCode.Supported countryCode, List<? extends CardOrder.CardIdentifier> cardOrder, Set<? extends AccountFeature> accountFeatures, boolean isInMcwRegionGate, Disclosure mcwCashExplainerDisclosure, AccountMarketValuesLive accountMarketValuesLive, RhdAccountDataState rhdAccountDataState, OptionsStatus optionsStatus, boolean showOptionsCardForced, String optionKnowledgeCheckAppointmentId, ApiMarginInvestingInfo marginInvestingInfo, boolean isMemberPdtRevampV1) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(dripCardType, "dripCardType");
        return new AccountOverviewDataState(activeAccount, accounts2, unifiedBalances, unifiedAccount, dayTradeCard, marginSettings, marginInvestingEligibility, accountTypeEligibility, investmentSchedules, dripCardType, isDripOnboarded, slipHubCard, slipDisabled, sweepEnrollmentData, interestEarningDisclosure, dayTradesContentfulSummary, limitedMarginRiskContent, instantCard, inOptionsJointAccountPreSetupExperiment, inOptionsKnowledgeCheckExperiment, inOptionsLevel3EntryPointOptionsSettingsExperiment, isInstantDepositFeatureEnabled, isInLeveredMarginRegionGate, countryCode, cardOrder, accountFeatures, isInMcwRegionGate, mcwCashExplainerDisclosure, accountMarketValuesLive, rhdAccountDataState, optionsStatus, showOptionsCardForced, optionKnowledgeCheckAppointmentId, marginInvestingInfo, isMemberPdtRevampV1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountOverviewDataState)) {
            return false;
        }
        AccountOverviewDataState accountOverviewDataState = (AccountOverviewDataState) other;
        return Intrinsics.areEqual(this.activeAccount, accountOverviewDataState.activeAccount) && Intrinsics.areEqual(this.accounts, accountOverviewDataState.accounts) && Intrinsics.areEqual(this.unifiedBalances, accountOverviewDataState.unifiedBalances) && Intrinsics.areEqual(this.unifiedAccount, accountOverviewDataState.unifiedAccount) && Intrinsics.areEqual(this.dayTradeCard, accountOverviewDataState.dayTradeCard) && Intrinsics.areEqual(this.marginSettings, accountOverviewDataState.marginSettings) && Intrinsics.areEqual(this.marginInvestingEligibility, accountOverviewDataState.marginInvestingEligibility) && Intrinsics.areEqual(this.accountTypeEligibility, accountOverviewDataState.accountTypeEligibility) && Intrinsics.areEqual(this.investmentSchedules, accountOverviewDataState.investmentSchedules) && this.dripCardType == accountOverviewDataState.dripCardType && this.isDripOnboarded == accountOverviewDataState.isDripOnboarded && Intrinsics.areEqual(this.slipHubCard, accountOverviewDataState.slipHubCard) && this.slipDisabled == accountOverviewDataState.slipDisabled && Intrinsics.areEqual(this.sweepEnrollmentData, accountOverviewDataState.sweepEnrollmentData) && Intrinsics.areEqual(this.interestEarningDisclosure, accountOverviewDataState.interestEarningDisclosure) && Intrinsics.areEqual(this.dayTradesContentfulSummary, accountOverviewDataState.dayTradesContentfulSummary) && Intrinsics.areEqual(this.limitedMarginRiskContent, accountOverviewDataState.limitedMarginRiskContent) && Intrinsics.areEqual(this.instantCard, accountOverviewDataState.instantCard) && this.inOptionsJointAccountPreSetupExperiment == accountOverviewDataState.inOptionsJointAccountPreSetupExperiment && this.inOptionsKnowledgeCheckExperiment == accountOverviewDataState.inOptionsKnowledgeCheckExperiment && this.inOptionsLevel3EntryPointOptionsSettingsExperiment == accountOverviewDataState.inOptionsLevel3EntryPointOptionsSettingsExperiment && this.isInstantDepositFeatureEnabled == accountOverviewDataState.isInstantDepositFeatureEnabled && this.isInLeveredMarginRegionGate == accountOverviewDataState.isInLeveredMarginRegionGate && Intrinsics.areEqual(this.countryCode, accountOverviewDataState.countryCode) && Intrinsics.areEqual(this.cardOrder, accountOverviewDataState.cardOrder) && Intrinsics.areEqual(this.accountFeatures, accountOverviewDataState.accountFeatures) && this.isInMcwRegionGate == accountOverviewDataState.isInMcwRegionGate && Intrinsics.areEqual(this.mcwCashExplainerDisclosure, accountOverviewDataState.mcwCashExplainerDisclosure) && Intrinsics.areEqual(this.accountMarketValuesLive, accountOverviewDataState.accountMarketValuesLive) && Intrinsics.areEqual(this.rhdAccountDataState, accountOverviewDataState.rhdAccountDataState) && this.optionsStatus == accountOverviewDataState.optionsStatus && this.showOptionsCardForced == accountOverviewDataState.showOptionsCardForced && Intrinsics.areEqual(this.optionKnowledgeCheckAppointmentId, accountOverviewDataState.optionKnowledgeCheckAppointmentId) && Intrinsics.areEqual(this.marginInvestingInfo, accountOverviewDataState.marginInvestingInfo) && this.isMemberPdtRevampV1 == accountOverviewDataState.isMemberPdtRevampV1;
    }

    public int hashCode() {
        Account account = this.activeAccount;
        int iHashCode = (((account == null ? 0 : account.hashCode()) * 31) + this.accounts.hashCode()) * 31;
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        int iHashCode2 = (iHashCode + (unifiedBalances == null ? 0 : unifiedBalances.hashCode())) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        int iHashCode3 = (iHashCode2 + (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode())) * 31;
        DayTradeCard dayTradeCard = this.dayTradeCard;
        int iHashCode4 = (iHashCode3 + (dayTradeCard == null ? 0 : dayTradeCard.hashCode())) * 31;
        MarginSettings marginSettings = this.marginSettings;
        int iHashCode5 = (iHashCode4 + (marginSettings == null ? 0 : marginSettings.hashCode())) * 31;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto = this.marginInvestingEligibility;
        int iHashCode6 = (iHashCode5 + (getMultiAccountEligibilityResponseDto == null ? 0 : getMultiAccountEligibilityResponseDto.hashCode())) * 31;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto2 = this.accountTypeEligibility;
        int iHashCode7 = (iHashCode6 + (getMultiAccountEligibilityResponseDto2 == null ? 0 : getMultiAccountEligibilityResponseDto2.hashCode())) * 31;
        List<InvestmentSchedule> list = this.investmentSchedules;
        int iHashCode8 = (((((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31) + this.dripCardType.hashCode()) * 31) + Boolean.hashCode(this.isDripOnboarded)) * 31;
        SlipHubCard slipHubCard = this.slipHubCard;
        int iHashCode9 = (((iHashCode8 + (slipHubCard == null ? 0 : slipHubCard.hashCode())) * 31) + Boolean.hashCode(this.slipDisabled)) * 31;
        SweepEnrollmentData sweepEnrollmentData = this.sweepEnrollmentData;
        int iHashCode10 = (iHashCode9 + (sweepEnrollmentData == null ? 0 : sweepEnrollmentData.hashCode())) * 31;
        Disclosure disclosure = this.interestEarningDisclosure;
        int iHashCode11 = (iHashCode10 + (disclosure == null ? 0 : disclosure.hashCode())) * 31;
        CharSequence charSequence = this.dayTradesContentfulSummary;
        int iHashCode12 = (iHashCode11 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        OtherMarkdown otherMarkdown = this.limitedMarginRiskContent;
        int iHashCode13 = (iHashCode12 + (otherMarkdown == null ? 0 : otherMarkdown.hashCode())) * 31;
        InstantDepositCard instantDepositCard = this.instantCard;
        int iHashCode14 = (((((((((((iHashCode13 + (instantDepositCard == null ? 0 : instantDepositCard.hashCode())) * 31) + Boolean.hashCode(this.inOptionsJointAccountPreSetupExperiment)) * 31) + Boolean.hashCode(this.inOptionsKnowledgeCheckExperiment)) * 31) + Boolean.hashCode(this.inOptionsLevel3EntryPointOptionsSettingsExperiment)) * 31) + Boolean.hashCode(this.isInstantDepositFeatureEnabled)) * 31) + Boolean.hashCode(this.isInLeveredMarginRegionGate)) * 31;
        CountryCode.Supported supported = this.countryCode;
        int iHashCode15 = (iHashCode14 + (supported == null ? 0 : supported.hashCode())) * 31;
        List<CardOrder.CardIdentifier> list2 = this.cardOrder;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Set<AccountFeature> set = this.accountFeatures;
        int iHashCode17 = (((iHashCode16 + (set == null ? 0 : set.hashCode())) * 31) + Boolean.hashCode(this.isInMcwRegionGate)) * 31;
        Disclosure disclosure2 = this.mcwCashExplainerDisclosure;
        int iHashCode18 = (iHashCode17 + (disclosure2 == null ? 0 : disclosure2.hashCode())) * 31;
        AccountMarketValuesLive accountMarketValuesLive = this.accountMarketValuesLive;
        int iHashCode19 = (iHashCode18 + (accountMarketValuesLive == null ? 0 : accountMarketValuesLive.hashCode())) * 31;
        RhdAccountDataState rhdAccountDataState = this.rhdAccountDataState;
        int iHashCode20 = (iHashCode19 + (rhdAccountDataState == null ? 0 : rhdAccountDataState.hashCode())) * 31;
        OptionsStatus optionsStatus = this.optionsStatus;
        int iHashCode21 = (((iHashCode20 + (optionsStatus == null ? 0 : optionsStatus.hashCode())) * 31) + Boolean.hashCode(this.showOptionsCardForced)) * 31;
        String str = this.optionKnowledgeCheckAppointmentId;
        int iHashCode22 = (iHashCode21 + (str == null ? 0 : str.hashCode())) * 31;
        ApiMarginInvestingInfo apiMarginInvestingInfo = this.marginInvestingInfo;
        return ((iHashCode22 + (apiMarginInvestingInfo != null ? apiMarginInvestingInfo.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMemberPdtRevampV1);
    }

    public String toString() {
        Account account = this.activeAccount;
        List<Account> list = this.accounts;
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        DayTradeCard dayTradeCard = this.dayTradeCard;
        MarginSettings marginSettings = this.marginSettings;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto = this.marginInvestingEligibility;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto2 = this.accountTypeEligibility;
        List<InvestmentSchedule> list2 = this.investmentSchedules;
        DripSettingsStore.DripCardType dripCardType = this.dripCardType;
        boolean z = this.isDripOnboarded;
        SlipHubCard slipHubCard = this.slipHubCard;
        boolean z2 = this.slipDisabled;
        SweepEnrollmentData sweepEnrollmentData = this.sweepEnrollmentData;
        Disclosure disclosure = this.interestEarningDisclosure;
        CharSequence charSequence = this.dayTradesContentfulSummary;
        return "AccountOverviewDataState(activeAccount=" + account + ", accounts=" + list + ", unifiedBalances=" + unifiedBalances + ", unifiedAccount=" + unifiedAccountV2 + ", dayTradeCard=" + dayTradeCard + ", marginSettings=" + marginSettings + ", marginInvestingEligibility=" + getMultiAccountEligibilityResponseDto + ", accountTypeEligibility=" + getMultiAccountEligibilityResponseDto2 + ", investmentSchedules=" + list2 + ", dripCardType=" + dripCardType + ", isDripOnboarded=" + z + ", slipHubCard=" + slipHubCard + ", slipDisabled=" + z2 + ", sweepEnrollmentData=" + sweepEnrollmentData + ", interestEarningDisclosure=" + disclosure + ", dayTradesContentfulSummary=" + ((Object) charSequence) + ", limitedMarginRiskContent=" + this.limitedMarginRiskContent + ", instantCard=" + this.instantCard + ", inOptionsJointAccountPreSetupExperiment=" + this.inOptionsJointAccountPreSetupExperiment + ", inOptionsKnowledgeCheckExperiment=" + this.inOptionsKnowledgeCheckExperiment + ", inOptionsLevel3EntryPointOptionsSettingsExperiment=" + this.inOptionsLevel3EntryPointOptionsSettingsExperiment + ", isInstantDepositFeatureEnabled=" + this.isInstantDepositFeatureEnabled + ", isInLeveredMarginRegionGate=" + this.isInLeveredMarginRegionGate + ", countryCode=" + this.countryCode + ", cardOrder=" + this.cardOrder + ", accountFeatures=" + this.accountFeatures + ", isInMcwRegionGate=" + this.isInMcwRegionGate + ", mcwCashExplainerDisclosure=" + this.mcwCashExplainerDisclosure + ", accountMarketValuesLive=" + this.accountMarketValuesLive + ", rhdAccountDataState=" + this.rhdAccountDataState + ", optionsStatus=" + this.optionsStatus + ", showOptionsCardForced=" + this.showOptionsCardForced + ", optionKnowledgeCheckAppointmentId=" + this.optionKnowledgeCheckAppointmentId + ", marginInvestingInfo=" + this.marginInvestingInfo + ", isMemberPdtRevampV1=" + this.isMemberPdtRevampV1 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountOverviewDataState(Account account, List<Account> accounts2, UnifiedBalances unifiedBalances, UnifiedAccountV2 unifiedAccountV2, DayTradeCard dayTradeCard, MarginSettings marginSettings, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto2, List<InvestmentSchedule> list, DripSettingsStore.DripCardType dripCardType, boolean z, SlipHubCard slipHubCard, boolean z2, SweepEnrollmentData sweepEnrollmentData, Disclosure disclosure, CharSequence charSequence, OtherMarkdown otherMarkdown, InstantDepositCard instantDepositCard, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, CountryCode.Supported supported, List<? extends CardOrder.CardIdentifier> list2, Set<? extends AccountFeature> set, boolean z8, Disclosure disclosure2, AccountMarketValuesLive accountMarketValuesLive, RhdAccountDataState rhdAccountDataState, OptionsStatus optionsStatus, boolean z9, String str, ApiMarginInvestingInfo apiMarginInvestingInfo, boolean z10) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(dripCardType, "dripCardType");
        this.activeAccount = account;
        this.accounts = accounts2;
        this.unifiedBalances = unifiedBalances;
        this.unifiedAccount = unifiedAccountV2;
        this.dayTradeCard = dayTradeCard;
        this.marginSettings = marginSettings;
        this.marginInvestingEligibility = getMultiAccountEligibilityResponseDto;
        this.accountTypeEligibility = getMultiAccountEligibilityResponseDto2;
        this.investmentSchedules = list;
        this.dripCardType = dripCardType;
        this.isDripOnboarded = z;
        this.slipHubCard = slipHubCard;
        this.slipDisabled = z2;
        this.sweepEnrollmentData = sweepEnrollmentData;
        this.interestEarningDisclosure = disclosure;
        this.dayTradesContentfulSummary = charSequence;
        this.limitedMarginRiskContent = otherMarkdown;
        this.instantCard = instantDepositCard;
        this.inOptionsJointAccountPreSetupExperiment = z3;
        this.inOptionsKnowledgeCheckExperiment = z4;
        this.inOptionsLevel3EntryPointOptionsSettingsExperiment = z5;
        this.isInstantDepositFeatureEnabled = z6;
        this.isInLeveredMarginRegionGate = z7;
        this.countryCode = supported;
        this.cardOrder = list2;
        this.accountFeatures = set;
        this.isInMcwRegionGate = z8;
        this.mcwCashExplainerDisclosure = disclosure2;
        this.accountMarketValuesLive = accountMarketValuesLive;
        this.rhdAccountDataState = rhdAccountDataState;
        this.optionsStatus = optionsStatus;
        this.showOptionsCardForced = z9;
        this.optionKnowledgeCheckAppointmentId = str;
        this.marginInvestingInfo = apiMarginInvestingInfo;
        this.isMemberPdtRevampV1 = z10;
        boolean z11 = false;
        this.isMarginSupported = set != 0 && set.contains(AccountFeature.MARGIN);
        this.isSlipSupported = set != 0 && set.contains(AccountFeature.SLIP);
        this.isDripSupported = set != 0 && set.contains(AccountFeature.DRIP);
        this.isRecurringSupported = set != 0 && set.contains(AccountFeature.RECURRING);
        this.isOptionsSupported = set != 0 && set.contains(AccountFeature.OPTIONS_SUPPORTED);
        this.canUpgradeToOptions = set != 0 && set.contains(AccountFeature.OPTIONS_CAN_UPGRADE);
        this.isSweepSupported = set != 0 && set.contains(AccountFeature.SWEEP);
        this.isEcSupported = set != 0 && set.contains(AccountFeature.EVENT_CONTRACTS);
        if (set != 0 && set.contains(AccountFeature.CRYPTO)) {
            z11 = true;
        }
        this.isCryptoSupported = z11;
    }

    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    public /* synthetic */ AccountOverviewDataState(Account account, List list, UnifiedBalances unifiedBalances, UnifiedAccountV2 unifiedAccountV2, DayTradeCard dayTradeCard, MarginSettings marginSettings, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto2, List list2, DripSettingsStore.DripCardType dripCardType, boolean z, SlipHubCard slipHubCard, boolean z2, SweepEnrollmentData sweepEnrollmentData, Disclosure disclosure, CharSequence charSequence, OtherMarkdown otherMarkdown, InstantDepositCard instantDepositCard, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, CountryCode.Supported supported, List list3, Set set, boolean z8, Disclosure disclosure2, AccountMarketValuesLive accountMarketValuesLive, RhdAccountDataState rhdAccountDataState, OptionsStatus optionsStatus, boolean z9, String str, ApiMarginInvestingInfo apiMarginInvestingInfo, boolean z10, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : unifiedBalances, (i & 8) != 0 ? null : unifiedAccountV2, (i & 16) != 0 ? null : dayTradeCard, (i & 32) != 0 ? null : marginSettings, (i & 64) != 0 ? null : getMultiAccountEligibilityResponseDto, (i & 128) != 0 ? null : getMultiAccountEligibilityResponseDto2, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? DripSettingsStore.DripCardType.NONE : dripCardType, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : slipHubCard, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? null : sweepEnrollmentData, (i & 16384) != 0 ? null : disclosure, (i & 32768) != 0 ? null : charSequence, (i & 65536) != 0 ? null : otherMarkdown, (i & 131072) != 0 ? null : instantDepositCard, (i & 262144) != 0 ? false : z3, (i & 524288) != 0 ? false : z4, (i & 1048576) != 0 ? false : z5, (i & 2097152) != 0 ? false : z6, (i & 4194304) != 0 ? false : z7, (i & 8388608) != 0 ? null : supported, (i & 16777216) != 0 ? null : list3, (i & 33554432) != 0 ? null : set, (i & 67108864) != 0 ? false : z8, (i & 134217728) != 0 ? null : disclosure2, (i & 268435456) != 0 ? null : accountMarketValuesLive, (i & 536870912) != 0 ? null : rhdAccountDataState, (i & 1073741824) != 0 ? null : optionsStatus, (i & Integer.MIN_VALUE) != 0 ? false : z9, (i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : apiMarginInvestingInfo, (i2 & 4) != 0 ? false : z10);
    }

    public final List<Account> getAccounts() {
        return this.accounts;
    }

    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public final DayTradeCard getDayTradeCard() {
        return this.dayTradeCard;
    }

    public final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    public final GetMultiAccountEligibilityResponseDto getMarginInvestingEligibility() {
        return this.marginInvestingEligibility;
    }

    public final GetMultiAccountEligibilityResponseDto getAccountTypeEligibility() {
        return this.accountTypeEligibility;
    }

    public final List<InvestmentSchedule> getInvestmentSchedules() {
        return this.investmentSchedules;
    }

    public final DripSettingsStore.DripCardType getDripCardType() {
        return this.dripCardType;
    }

    public final boolean isDripOnboarded() {
        return this.isDripOnboarded;
    }

    public final SlipHubCard getSlipHubCard() {
        return this.slipHubCard;
    }

    public final boolean getSlipDisabled() {
        return this.slipDisabled;
    }

    public final SweepEnrollmentData getSweepEnrollmentData() {
        return this.sweepEnrollmentData;
    }

    public final Disclosure getInterestEarningDisclosure() {
        return this.interestEarningDisclosure;
    }

    public final CharSequence getDayTradesContentfulSummary() {
        return this.dayTradesContentfulSummary;
    }

    public final OtherMarkdown getLimitedMarginRiskContent() {
        return this.limitedMarginRiskContent;
    }

    public final InstantDepositCard getInstantCard() {
        return this.instantCard;
    }

    public final boolean getInOptionsJointAccountPreSetupExperiment() {
        return this.inOptionsJointAccountPreSetupExperiment;
    }

    public final boolean getInOptionsKnowledgeCheckExperiment() {
        return this.inOptionsKnowledgeCheckExperiment;
    }

    public final boolean getInOptionsLevel3EntryPointOptionsSettingsExperiment() {
        return this.inOptionsLevel3EntryPointOptionsSettingsExperiment;
    }

    public final boolean isInstantDepositFeatureEnabled() {
        return this.isInstantDepositFeatureEnabled;
    }

    public final boolean isInLeveredMarginRegionGate() {
        return this.isInLeveredMarginRegionGate;
    }

    public final CountryCode.Supported getCountryCode() {
        return this.countryCode;
    }

    public final List<CardOrder.CardIdentifier> getCardOrder() {
        return this.cardOrder;
    }

    public final Set<AccountFeature> getAccountFeatures() {
        return this.accountFeatures;
    }

    public final boolean isInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    public final Disclosure getMcwCashExplainerDisclosure() {
        return this.mcwCashExplainerDisclosure;
    }

    public final AccountMarketValuesLive getAccountMarketValuesLive() {
        return this.accountMarketValuesLive;
    }

    public final RhdAccountDataState getRhdAccountDataState() {
        return this.rhdAccountDataState;
    }

    public final OptionsStatus getOptionsStatus() {
        return this.optionsStatus;
    }

    public final boolean getShowOptionsCardForced() {
        return this.showOptionsCardForced;
    }

    public final String getOptionKnowledgeCheckAppointmentId() {
        return this.optionKnowledgeCheckAppointmentId;
    }

    public final ApiMarginInvestingInfo getMarginInvestingInfo() {
        return this.marginInvestingInfo;
    }

    public final boolean isMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    /* renamed from: isMarginSupported, reason: from getter */
    public final boolean getIsMarginSupported() {
        return this.isMarginSupported;
    }

    /* renamed from: isSlipSupported, reason: from getter */
    public final boolean getIsSlipSupported() {
        return this.isSlipSupported;
    }

    /* renamed from: isDripSupported, reason: from getter */
    public final boolean getIsDripSupported() {
        return this.isDripSupported;
    }

    /* renamed from: isRecurringSupported, reason: from getter */
    public final boolean getIsRecurringSupported() {
        return this.isRecurringSupported;
    }

    /* renamed from: isOptionsSupported, reason: from getter */
    public final boolean getIsOptionsSupported() {
        return this.isOptionsSupported;
    }

    public final boolean getCanUpgradeToOptions() {
        return this.canUpgradeToOptions;
    }

    /* renamed from: isSweepSupported, reason: from getter */
    public final boolean getIsSweepSupported() {
        return this.isSweepSupported;
    }

    /* renamed from: isEcSupported, reason: from getter */
    public final boolean getIsEcSupported() {
        return this.isEcSupported;
    }

    /* renamed from: isCryptoSupported, reason: from getter */
    public final boolean getIsCryptoSupported() {
        return this.isCryptoSupported;
    }
}
