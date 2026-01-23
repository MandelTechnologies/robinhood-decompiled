package com.robinhood.android.account.p060ui;

import com.robinhood.android.account.p060ui.margin.MarginEligibilityViewModel;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.feature.lib.sweep.interest.SweepEnrollmentData;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.lib.models.instant.p169db.InstantDepositCard;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.android.models.accountoverview.p184db.DayTradeCard;
import com.robinhood.android.models.portfolio.AccountMarketValuesLive;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.DripSettingsStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionsStatus;
import com.robinhood.models.p320db.SlipHubCard;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherUtils4;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountOverviewViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b9\b\u0087\b\u0018\u0000 ò\u00012\u00020\u0001:\u0002ò\u0001B\u0085\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\u0006\u0010$\u001a\u00020\u0018\u0012\u0006\u0010%\u001a\u00020\u0018\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\u0006\u0010(\u001a\u00020\u0018\u0012\u0006\u0010)\u001a\u00020\u0018\u0012\u0006\u0010*\u001a\u00020\u0018\u0012\u0006\u0010+\u001a\u00020\u0018\u0012\u0006\u0010,\u001a\u00020\u0018\u0012\b\u0010-\u001a\u0004\u0018\u00010.\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0005\u0012\u0006\u00101\u001a\u00020\u0018\u0012\u0006\u00102\u001a\u00020\u0018\u0012\u0006\u00103\u001a\u00020\u0018\u0012\u0006\u00104\u001a\u00020\u0018\u0012\u0006\u00105\u001a\u00020\u0018\u0012\b\u00106\u001a\u0004\u0018\u00010\u001f\u0012\b\u00107\u001a\u0004\u0018\u000108\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\u0006\u0010;\u001a\u00020\u0018\u0012\b\u0010<\u001a\u0004\u0018\u00010=\u0012\b\u0010>\u001a\u0004\u0018\u00010?\u0012\u0006\u0010@\u001a\u00020\u0018¢\u0006\u0004\bA\u0010BJ\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0012\u0010Î\u0001\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0005HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0018HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0018HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010#HÆ\u0003J\n\u0010×\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0018HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0018HÆ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010.HÆ\u0003J\u0012\u0010à\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0005HÆ\u0003J\n\u0010á\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010â\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010ä\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010å\u0001\u001a\u00020\u0018HÆ\u0003J\f\u0010æ\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010ç\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\n\u0010é\u0001\u001a\u00020\u0018HÆ\u0003J\f\u0010ê\u0001\u001a\u0004\u0018\u00010=HÆ\u0003J\f\u0010ë\u0001\u001a\u0004\u0018\u00010?HÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0018HÆ\u0003JØ\u0003\u0010í\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u00182\b\b\u0002\u0010*\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u00182\b\b\u0002\u0010,\u001a\u00020\u00182\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00052\b\b\u0002\u00101\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u00020\u00182\b\b\u0002\u00103\u001a\u00020\u00182\b\b\u0002\u00104\u001a\u00020\u00182\b\b\u0002\u00105\u001a\u00020\u00182\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020\u00182\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010@\u001a\u00020\u0018HÆ\u0001J\u0015\u0010î\u0001\u001a\u00020\u00182\t\u0010ï\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010ð\u0001\u001a\u00030º\u0001HÖ\u0001J\n\u0010ñ\u0001\u001a\u00020=HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bS\u0010RR\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u0010FR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010WR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010\u001b\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010WR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u0010$\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b$\u0010WR\u0011\u0010%\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bc\u0010WR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0011\u0010(\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bf\u0010WR\u0011\u0010)\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bg\u0010WR\u0011\u0010*\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b*\u0010WR\u0011\u0010+\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b+\u0010WR\u0011\u0010,\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b,\u0010WR\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0019\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bj\u0010FR\u0011\u00101\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b1\u0010WR\u0011\u00102\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b2\u0010WR\u0011\u00103\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b3\u0010WR\u0011\u00104\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u0010WR\u0011\u00105\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u0010WR\u0013\u00106\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bk\u0010^R\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0011\u0010;\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bp\u0010WR\u0013\u0010<\u001a\u0004\u0018\u00010=¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0013\u0010>\u001a\u0004\u0018\u00010?¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0011\u0010@\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b@\u0010WR\u0014\u0010u\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010WR\u0014\u0010v\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010WR\u0014\u0010w\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010WR\u0016\u0010x\u001a\u0004\u0018\u00010y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0011\u0010|\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b}\u0010WR\u0011\u0010~\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u007f\u0010WR\u001a\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010WR\u001a\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0015\u0010\u0092\u0001\u001a\u0004\u0018\u00010=8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010rR\u0016\u0010\u0094\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010WR\u001a\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0013\u0010\u009e\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010WR\u001a\u0010 \u0001\u001a\u0005\u0018\u00010¡\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u001a\u0010¤\u0001\u001a\u0005\u0018\u00010¥\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010¨\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010WR\u001a\u0010ª\u0001\u001a\u0005\u0018\u00010«\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010®\u0001\u001a\u0005\u0018\u00010¯\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u001a\u0010²\u0001\u001a\u0005\u0018\u00010³\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u00030·\u00010\u00058F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010FR\u0015\u0010¹\u0001\u001a\u00030º\u00018F¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u0015\u0010½\u0001\u001a\u00030º\u00018F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¼\u0001R\u0015\u0010¿\u0001\u001a\u00030º\u00018F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010¼\u0001R\u0015\u0010Á\u0001\u001a\u00030º\u00018F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010¼\u0001R\u0015\u0010Ã\u0001\u001a\u00030º\u00018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010¼\u0001¨\u0006ó\u0001"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewViewState;", "", "activeAccount", "Lcom/robinhood/models/db/Account;", "accounts", "", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "accountOverviewRhdSectionState", "Lcom/robinhood/android/account/ui/AccountOverviewRhdSectionState;", "dayTradeCard", "Lcom/robinhood/android/models/accountoverview/db/DayTradeCard;", "marginSettings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "marginSectionMarginEligibility", "Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;", "accountTypeSectionMarginEligibility", "investmentSchedules", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "dripCardType", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore$DripCardType;", "isDripOnboarded", "", "slipHubCard", "Lcom/robinhood/models/db/SlipHubCard;", "slipDisabled", "sweepEnrollmentData", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "interestEarningDisclosure", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "dayTradesContentfulSummary", "", "limitedMarginRiskContent", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "isOptionsSupported", "canUpgradeToOptions", "instantCard", "Lcom/robinhood/android/lib/models/instant/db/InstantDepositCard;", "useServerDrivenOptionsSection", "inOptionsLevel3EntryPointOptionsSettingsExperiment", "isMarginSupported", "isInstantDepositFeatureEnabled", "isInLeveredMarginRegionGate", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "cardOrder", "Lcom/robinhood/android/models/accountoverview/db/CardOrder$CardIdentifier;", "isDripSupported", "isSlipSupported", "isRecurringSupported", "isSweepSupported", "isInMcwRegionGate", "mcwCashExplainerDisclosure", "accountMarketValuesLive", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;", "optionsStatus", "Lcom/robinhood/models/db/OptionsStatus;", "showOptionsCardForced", "optionKnowledgeCheckAppointmentId", "", "marginInvestingInfo", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "isMemberPdtRevampV1", "<init>", "(Lcom/robinhood/models/db/Account;Ljava/util/List;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/android/account/ui/AccountOverviewRhdSectionState;Lcom/robinhood/android/models/accountoverview/db/DayTradeCard;Lcom/robinhood/android/lib/margin/db/models/MarginSettings;Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;Ljava/util/List;Lcom/robinhood/librobinhood/data/store/DripSettingsStore$DripCardType;ZLcom/robinhood/models/db/SlipHubCard;ZLcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;Lcom/robinhood/staticcontent/model/disclosure/Disclosure;Ljava/lang/CharSequence;Lcom/robinhood/staticcontent/model/OtherMarkdown;ZZLcom/robinhood/android/lib/models/instant/db/InstantDepositCard;ZZZZZLcom/robinhood/iso/countrycode/CountryCode$Supported;Ljava/util/List;ZZZZZLcom/robinhood/staticcontent/model/disclosure/Disclosure;Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;Lcom/robinhood/models/db/OptionsStatus;ZLjava/lang/String;Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;Z)V", "getActiveAccount", "()Lcom/robinhood/models/db/Account;", "getAccounts", "()Ljava/util/List;", "getUnifiedBalances", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "getUnifiedAccount", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getAccountOverviewRhdSectionState", "()Lcom/robinhood/android/account/ui/AccountOverviewRhdSectionState;", "getDayTradeCard", "()Lcom/robinhood/android/models/accountoverview/db/DayTradeCard;", "getMarginSettings", "()Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "getMarginSectionMarginEligibility", "()Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;", "getAccountTypeSectionMarginEligibility", "getInvestmentSchedules", "getDripCardType", "()Lcom/robinhood/librobinhood/data/store/DripSettingsStore$DripCardType;", "()Z", "getSlipHubCard", "()Lcom/robinhood/models/db/SlipHubCard;", "getSlipDisabled", "getSweepEnrollmentData", "()Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "getInterestEarningDisclosure", "()Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "getDayTradesContentfulSummary", "()Ljava/lang/CharSequence;", "getLimitedMarginRiskContent", "()Lcom/robinhood/staticcontent/model/OtherMarkdown;", "getCanUpgradeToOptions", "getInstantCard", "()Lcom/robinhood/android/lib/models/instant/db/InstantDepositCard;", "getUseServerDrivenOptionsSection", "getInOptionsLevel3EntryPointOptionsSettingsExperiment", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getCardOrder", "getMcwCashExplainerDisclosure", "getAccountMarketValuesLive", "()Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;", "getOptionsStatus", "()Lcom/robinhood/models/db/OptionsStatus;", "getShowOptionsCardForced", "getOptionKnowledgeCheckAppointmentId", "()Ljava/lang/String;", "getMarginInvestingInfo", "()Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "isRetirementAccount", "isManagedAccount", "isMargin", "portfolioSectionState", "Lcom/robinhood/android/account/ui/PortfolioSectionState;", "getPortfolioSectionState", "()Lcom/robinhood/android/account/ui/PortfolioSectionState;", "showDynamicInstantContent", "getShowDynamicInstantContent", "shouldShowCurrencySwitcher", "getShouldShowCurrencySwitcher", "instantSectionState", "Lcom/robinhood/android/account/ui/InstantSectionState;", "getInstantSectionState", "()Lcom/robinhood/android/account/ui/InstantSectionState;", "showInstantSection", "getShowInstantSection", "recurringSectionState", "Lcom/robinhood/android/account/ui/RecurringSectionState;", "getRecurringSectionState", "()Lcom/robinhood/android/account/ui/RecurringSectionState;", "sweepSectionState", "Lcom/robinhood/android/account/ui/SweepSectionState;", "getSweepSectionState", "()Lcom/robinhood/android/account/ui/SweepSectionState;", "dripSectionState", "Lcom/robinhood/android/account/ui/DripSectionState;", "getDripSectionState", "()Lcom/robinhood/android/account/ui/DripSectionState;", "toolbarSubtitle", "getToolbarSubtitle", "showAccountSelector", "getShowAccountSelector", "accountSelectorState", "Lcom/robinhood/android/account/ui/AccountSelectorState;", "getAccountSelectorState", "()Lcom/robinhood/android/account/ui/AccountSelectorState;", "infoBannerState", "Lcom/robinhood/android/account/ui/InfoBannerSectionState;", "getInfoBannerState", "()Lcom/robinhood/android/account/ui/InfoBannerSectionState;", "showOptionLevel3EntryPoint", "getShowOptionLevel3EntryPoint", "optionsSectionState", "Lcom/robinhood/android/account/ui/OptionsSectionState;", "getOptionsSectionState", "()Lcom/robinhood/android/account/ui/OptionsSectionState;", "marginSectionState", "Lcom/robinhood/android/account/ui/MarginSectionState;", "getMarginSectionState", "()Lcom/robinhood/android/account/ui/MarginSectionState;", "showDayTradeSection", "getShowDayTradeSection", "dayTradeSectionState", "Lcom/robinhood/android/account/ui/DayTradeSectionState;", "getDayTradeSectionState", "()Lcom/robinhood/android/account/ui/DayTradeSectionState;", "slipSectionState", "Lcom/robinhood/android/account/ui/SlipSectionState;", "getSlipSectionState", "()Lcom/robinhood/android/account/ui/SlipSectionState;", "accountTypeSectionState", "Lcom/robinhood/android/account/ui/AccountTypeSectionState;", "getAccountTypeSectionState", "()Lcom/robinhood/android/account/ui/AccountTypeSectionState;", "sectionsStates", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "getSectionsStates", "instantIndex", "", "getInstantIndex", "()I", "sweepIndex", "getSweepIndex", "dayTradeIndex", "getDayTradeIndex", "optionsIndex", "getOptionsIndex", "futuresIndex", "getFuturesIndex", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "equals", "other", "hashCode", "toString", "Companion", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AccountOverviewViewState {
    private static final List<CardOrder.CardIdentifier> DEFAULT_CARD_ORDER;
    private static final List<CardOrder.CardIdentifier> MANAGED_ACCOUNT_VIEW_TYPE_ALLOW_LIST;
    private final AccountMarketValuesLive accountMarketValuesLive;
    private final AccountOverviewRhdSectionState accountOverviewRhdSectionState;
    private final MarginEligibilityViewModel accountTypeSectionMarginEligibility;
    private final List<Account> accounts;
    private final Account activeAccount;
    private final boolean canUpgradeToOptions;
    private final List<CardOrder.CardIdentifier> cardOrder;
    private final CountryCode.Supported countryCode;
    private final DayTradeCard dayTradeCard;
    private final CharSequence dayTradesContentfulSummary;
    private final DripSettingsStore.DripCardType dripCardType;
    private final boolean inOptionsLevel3EntryPointOptionsSettingsExperiment;
    private final InstantDepositCard instantCard;
    private final Disclosure interestEarningDisclosure;
    private final List<InvestmentSchedule> investmentSchedules;
    private final boolean isDripOnboarded;
    private final boolean isDripSupported;
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
    private final ApiMarginInvestingInfo marginInvestingInfo;
    private final MarginEligibilityViewModel marginSectionMarginEligibility;
    private final MarginSettings marginSettings;
    private final Disclosure mcwCashExplainerDisclosure;
    private final String optionKnowledgeCheckAppointmentId;
    private final OptionsStatus optionsStatus;
    private final boolean showOptionsCardForced;
    private final boolean slipDisabled;
    private final SlipHubCard slipHubCard;
    private final SweepEnrollmentData sweepEnrollmentData;
    private final UnifiedAccountV2 unifiedAccount;
    private final UnifiedBalances unifiedBalances;
    private final boolean useServerDrivenOptionsSection;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AccountOverviewViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardOrder.CardIdentifier.values().length];
            try {
                iArr[CardOrder.CardIdentifier.ACCOUNT_SELECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardOrder.CardIdentifier.INFO_BANNER_ABOVE_PORTFOLIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardOrder.CardIdentifier.PORTFOLIO_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardOrder.CardIdentifier.SLIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardOrder.CardIdentifier.INSTANT_DEPOSITS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardOrder.CardIdentifier.RECURRING_INVESTMENTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardOrder.CardIdentifier.DRIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CardOrder.CardIdentifier.SWEEP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CardOrder.CardIdentifier.OPTIONS_SETTINGS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CardOrder.CardIdentifier.ACCOUNT_TYPE_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CardOrder.CardIdentifier.MARGIN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CardOrder.CardIdentifier.DAY_TRADES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CardOrder.CardIdentifier.FUTURES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    public final List<InvestmentSchedule> component10() {
        return this.investmentSchedules;
    }

    /* renamed from: component11, reason: from getter */
    public final DripSettingsStore.DripCardType getDripCardType() {
        return this.dripCardType;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsDripOnboarded() {
        return this.isDripOnboarded;
    }

    /* renamed from: component13, reason: from getter */
    public final SlipHubCard getSlipHubCard() {
        return this.slipHubCard;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getSlipDisabled() {
        return this.slipDisabled;
    }

    /* renamed from: component15, reason: from getter */
    public final SweepEnrollmentData getSweepEnrollmentData() {
        return this.sweepEnrollmentData;
    }

    /* renamed from: component16, reason: from getter */
    public final Disclosure getInterestEarningDisclosure() {
        return this.interestEarningDisclosure;
    }

    /* renamed from: component17, reason: from getter */
    public final CharSequence getDayTradesContentfulSummary() {
        return this.dayTradesContentfulSummary;
    }

    /* renamed from: component18, reason: from getter */
    public final OtherMarkdown getLimitedMarginRiskContent() {
        return this.limitedMarginRiskContent;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsOptionsSupported() {
        return this.isOptionsSupported;
    }

    public final List<Account> component2() {
        return this.accounts;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getCanUpgradeToOptions() {
        return this.canUpgradeToOptions;
    }

    /* renamed from: component21, reason: from getter */
    public final InstantDepositCard getInstantCard() {
        return this.instantCard;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getUseServerDrivenOptionsSection() {
        return this.useServerDrivenOptionsSection;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getInOptionsLevel3EntryPointOptionsSettingsExperiment() {
        return this.inOptionsLevel3EntryPointOptionsSettingsExperiment;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsMarginSupported() {
        return this.isMarginSupported;
    }

    public final boolean component25() {
        return this.isInstantDepositFeatureEnabled;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsInLeveredMarginRegionGate() {
        return this.isInLeveredMarginRegionGate;
    }

    /* renamed from: component27, reason: from getter */
    public final CountryCode.Supported getCountryCode() {
        return this.countryCode;
    }

    public final List<CardOrder.CardIdentifier> component28() {
        return this.cardOrder;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsDripSupported() {
        return this.isDripSupported;
    }

    /* renamed from: component3, reason: from getter */
    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIsSlipSupported() {
        return this.isSlipSupported;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getIsRecurringSupported() {
        return this.isRecurringSupported;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getIsSweepSupported() {
        return this.isSweepSupported;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getIsInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    /* renamed from: component34, reason: from getter */
    public final Disclosure getMcwCashExplainerDisclosure() {
        return this.mcwCashExplainerDisclosure;
    }

    /* renamed from: component35, reason: from getter */
    public final AccountMarketValuesLive getAccountMarketValuesLive() {
        return this.accountMarketValuesLive;
    }

    /* renamed from: component36, reason: from getter */
    public final OptionsStatus getOptionsStatus() {
        return this.optionsStatus;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getShowOptionsCardForced() {
        return this.showOptionsCardForced;
    }

    /* renamed from: component38, reason: from getter */
    public final String getOptionKnowledgeCheckAppointmentId() {
        return this.optionKnowledgeCheckAppointmentId;
    }

    /* renamed from: component39, reason: from getter */
    public final ApiMarginInvestingInfo getMarginInvestingInfo() {
        return this.marginInvestingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getIsMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    /* renamed from: component5, reason: from getter */
    public final AccountOverviewRhdSectionState getAccountOverviewRhdSectionState() {
        return this.accountOverviewRhdSectionState;
    }

    /* renamed from: component6, reason: from getter */
    public final DayTradeCard getDayTradeCard() {
        return this.dayTradeCard;
    }

    /* renamed from: component7, reason: from getter */
    public final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    /* renamed from: component8, reason: from getter */
    public final MarginEligibilityViewModel getMarginSectionMarginEligibility() {
        return this.marginSectionMarginEligibility;
    }

    /* renamed from: component9, reason: from getter */
    public final MarginEligibilityViewModel getAccountTypeSectionMarginEligibility() {
        return this.accountTypeSectionMarginEligibility;
    }

    public final AccountOverviewViewState copy(Account activeAccount, List<Account> accounts2, UnifiedBalances unifiedBalances, UnifiedAccountV2 unifiedAccount, AccountOverviewRhdSectionState accountOverviewRhdSectionState, DayTradeCard dayTradeCard, MarginSettings marginSettings, MarginEligibilityViewModel marginSectionMarginEligibility, MarginEligibilityViewModel accountTypeSectionMarginEligibility, List<InvestmentSchedule> investmentSchedules, DripSettingsStore.DripCardType dripCardType, boolean isDripOnboarded, SlipHubCard slipHubCard, boolean slipDisabled, SweepEnrollmentData sweepEnrollmentData, Disclosure interestEarningDisclosure, CharSequence dayTradesContentfulSummary, OtherMarkdown limitedMarginRiskContent, boolean isOptionsSupported, boolean canUpgradeToOptions, InstantDepositCard instantCard, boolean useServerDrivenOptionsSection, boolean inOptionsLevel3EntryPointOptionsSettingsExperiment, boolean isMarginSupported, boolean isInstantDepositFeatureEnabled, boolean isInLeveredMarginRegionGate, CountryCode.Supported countryCode, List<? extends CardOrder.CardIdentifier> cardOrder, boolean isDripSupported, boolean isSlipSupported, boolean isRecurringSupported, boolean isSweepSupported, boolean isInMcwRegionGate, Disclosure mcwCashExplainerDisclosure, AccountMarketValuesLive accountMarketValuesLive, OptionsStatus optionsStatus, boolean showOptionsCardForced, String optionKnowledgeCheckAppointmentId, ApiMarginInvestingInfo marginInvestingInfo, boolean isMemberPdtRevampV1) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(dripCardType, "dripCardType");
        return new AccountOverviewViewState(activeAccount, accounts2, unifiedBalances, unifiedAccount, accountOverviewRhdSectionState, dayTradeCard, marginSettings, marginSectionMarginEligibility, accountTypeSectionMarginEligibility, investmentSchedules, dripCardType, isDripOnboarded, slipHubCard, slipDisabled, sweepEnrollmentData, interestEarningDisclosure, dayTradesContentfulSummary, limitedMarginRiskContent, isOptionsSupported, canUpgradeToOptions, instantCard, useServerDrivenOptionsSection, inOptionsLevel3EntryPointOptionsSettingsExperiment, isMarginSupported, isInstantDepositFeatureEnabled, isInLeveredMarginRegionGate, countryCode, cardOrder, isDripSupported, isSlipSupported, isRecurringSupported, isSweepSupported, isInMcwRegionGate, mcwCashExplainerDisclosure, accountMarketValuesLive, optionsStatus, showOptionsCardForced, optionKnowledgeCheckAppointmentId, marginInvestingInfo, isMemberPdtRevampV1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountOverviewViewState)) {
            return false;
        }
        AccountOverviewViewState accountOverviewViewState = (AccountOverviewViewState) other;
        return Intrinsics.areEqual(this.activeAccount, accountOverviewViewState.activeAccount) && Intrinsics.areEqual(this.accounts, accountOverviewViewState.accounts) && Intrinsics.areEqual(this.unifiedBalances, accountOverviewViewState.unifiedBalances) && Intrinsics.areEqual(this.unifiedAccount, accountOverviewViewState.unifiedAccount) && Intrinsics.areEqual(this.accountOverviewRhdSectionState, accountOverviewViewState.accountOverviewRhdSectionState) && Intrinsics.areEqual(this.dayTradeCard, accountOverviewViewState.dayTradeCard) && Intrinsics.areEqual(this.marginSettings, accountOverviewViewState.marginSettings) && Intrinsics.areEqual(this.marginSectionMarginEligibility, accountOverviewViewState.marginSectionMarginEligibility) && Intrinsics.areEqual(this.accountTypeSectionMarginEligibility, accountOverviewViewState.accountTypeSectionMarginEligibility) && Intrinsics.areEqual(this.investmentSchedules, accountOverviewViewState.investmentSchedules) && this.dripCardType == accountOverviewViewState.dripCardType && this.isDripOnboarded == accountOverviewViewState.isDripOnboarded && Intrinsics.areEqual(this.slipHubCard, accountOverviewViewState.slipHubCard) && this.slipDisabled == accountOverviewViewState.slipDisabled && Intrinsics.areEqual(this.sweepEnrollmentData, accountOverviewViewState.sweepEnrollmentData) && Intrinsics.areEqual(this.interestEarningDisclosure, accountOverviewViewState.interestEarningDisclosure) && Intrinsics.areEqual(this.dayTradesContentfulSummary, accountOverviewViewState.dayTradesContentfulSummary) && Intrinsics.areEqual(this.limitedMarginRiskContent, accountOverviewViewState.limitedMarginRiskContent) && this.isOptionsSupported == accountOverviewViewState.isOptionsSupported && this.canUpgradeToOptions == accountOverviewViewState.canUpgradeToOptions && Intrinsics.areEqual(this.instantCard, accountOverviewViewState.instantCard) && this.useServerDrivenOptionsSection == accountOverviewViewState.useServerDrivenOptionsSection && this.inOptionsLevel3EntryPointOptionsSettingsExperiment == accountOverviewViewState.inOptionsLevel3EntryPointOptionsSettingsExperiment && this.isMarginSupported == accountOverviewViewState.isMarginSupported && this.isInstantDepositFeatureEnabled == accountOverviewViewState.isInstantDepositFeatureEnabled && this.isInLeveredMarginRegionGate == accountOverviewViewState.isInLeveredMarginRegionGate && Intrinsics.areEqual(this.countryCode, accountOverviewViewState.countryCode) && Intrinsics.areEqual(this.cardOrder, accountOverviewViewState.cardOrder) && this.isDripSupported == accountOverviewViewState.isDripSupported && this.isSlipSupported == accountOverviewViewState.isSlipSupported && this.isRecurringSupported == accountOverviewViewState.isRecurringSupported && this.isSweepSupported == accountOverviewViewState.isSweepSupported && this.isInMcwRegionGate == accountOverviewViewState.isInMcwRegionGate && Intrinsics.areEqual(this.mcwCashExplainerDisclosure, accountOverviewViewState.mcwCashExplainerDisclosure) && Intrinsics.areEqual(this.accountMarketValuesLive, accountOverviewViewState.accountMarketValuesLive) && this.optionsStatus == accountOverviewViewState.optionsStatus && this.showOptionsCardForced == accountOverviewViewState.showOptionsCardForced && Intrinsics.areEqual(this.optionKnowledgeCheckAppointmentId, accountOverviewViewState.optionKnowledgeCheckAppointmentId) && Intrinsics.areEqual(this.marginInvestingInfo, accountOverviewViewState.marginInvestingInfo) && this.isMemberPdtRevampV1 == accountOverviewViewState.isMemberPdtRevampV1;
    }

    public int hashCode() {
        Account account = this.activeAccount;
        int iHashCode = (((account == null ? 0 : account.hashCode()) * 31) + this.accounts.hashCode()) * 31;
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        int iHashCode2 = (iHashCode + (unifiedBalances == null ? 0 : unifiedBalances.hashCode())) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        int iHashCode3 = (iHashCode2 + (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode())) * 31;
        AccountOverviewRhdSectionState accountOverviewRhdSectionState = this.accountOverviewRhdSectionState;
        int iHashCode4 = (iHashCode3 + (accountOverviewRhdSectionState == null ? 0 : accountOverviewRhdSectionState.hashCode())) * 31;
        DayTradeCard dayTradeCard = this.dayTradeCard;
        int iHashCode5 = (iHashCode4 + (dayTradeCard == null ? 0 : dayTradeCard.hashCode())) * 31;
        MarginSettings marginSettings = this.marginSettings;
        int iHashCode6 = (iHashCode5 + (marginSettings == null ? 0 : marginSettings.hashCode())) * 31;
        MarginEligibilityViewModel marginEligibilityViewModel = this.marginSectionMarginEligibility;
        int iHashCode7 = (iHashCode6 + (marginEligibilityViewModel == null ? 0 : marginEligibilityViewModel.hashCode())) * 31;
        MarginEligibilityViewModel marginEligibilityViewModel2 = this.accountTypeSectionMarginEligibility;
        int iHashCode8 = (iHashCode7 + (marginEligibilityViewModel2 == null ? 0 : marginEligibilityViewModel2.hashCode())) * 31;
        List<InvestmentSchedule> list = this.investmentSchedules;
        int iHashCode9 = (((((iHashCode8 + (list == null ? 0 : list.hashCode())) * 31) + this.dripCardType.hashCode()) * 31) + Boolean.hashCode(this.isDripOnboarded)) * 31;
        SlipHubCard slipHubCard = this.slipHubCard;
        int iHashCode10 = (((iHashCode9 + (slipHubCard == null ? 0 : slipHubCard.hashCode())) * 31) + Boolean.hashCode(this.slipDisabled)) * 31;
        SweepEnrollmentData sweepEnrollmentData = this.sweepEnrollmentData;
        int iHashCode11 = (iHashCode10 + (sweepEnrollmentData == null ? 0 : sweepEnrollmentData.hashCode())) * 31;
        Disclosure disclosure = this.interestEarningDisclosure;
        int iHashCode12 = (iHashCode11 + (disclosure == null ? 0 : disclosure.hashCode())) * 31;
        CharSequence charSequence = this.dayTradesContentfulSummary;
        int iHashCode13 = (iHashCode12 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        OtherMarkdown otherMarkdown = this.limitedMarginRiskContent;
        int iHashCode14 = (((((iHashCode13 + (otherMarkdown == null ? 0 : otherMarkdown.hashCode())) * 31) + Boolean.hashCode(this.isOptionsSupported)) * 31) + Boolean.hashCode(this.canUpgradeToOptions)) * 31;
        InstantDepositCard instantDepositCard = this.instantCard;
        int iHashCode15 = (((((((((((iHashCode14 + (instantDepositCard == null ? 0 : instantDepositCard.hashCode())) * 31) + Boolean.hashCode(this.useServerDrivenOptionsSection)) * 31) + Boolean.hashCode(this.inOptionsLevel3EntryPointOptionsSettingsExperiment)) * 31) + Boolean.hashCode(this.isMarginSupported)) * 31) + Boolean.hashCode(this.isInstantDepositFeatureEnabled)) * 31) + Boolean.hashCode(this.isInLeveredMarginRegionGate)) * 31;
        CountryCode.Supported supported = this.countryCode;
        int iHashCode16 = (iHashCode15 + (supported == null ? 0 : supported.hashCode())) * 31;
        List<CardOrder.CardIdentifier> list2 = this.cardOrder;
        int iHashCode17 = (((((((((((iHashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31) + Boolean.hashCode(this.isDripSupported)) * 31) + Boolean.hashCode(this.isSlipSupported)) * 31) + Boolean.hashCode(this.isRecurringSupported)) * 31) + Boolean.hashCode(this.isSweepSupported)) * 31) + Boolean.hashCode(this.isInMcwRegionGate)) * 31;
        Disclosure disclosure2 = this.mcwCashExplainerDisclosure;
        int iHashCode18 = (iHashCode17 + (disclosure2 == null ? 0 : disclosure2.hashCode())) * 31;
        AccountMarketValuesLive accountMarketValuesLive = this.accountMarketValuesLive;
        int iHashCode19 = (iHashCode18 + (accountMarketValuesLive == null ? 0 : accountMarketValuesLive.hashCode())) * 31;
        OptionsStatus optionsStatus = this.optionsStatus;
        int iHashCode20 = (((iHashCode19 + (optionsStatus == null ? 0 : optionsStatus.hashCode())) * 31) + Boolean.hashCode(this.showOptionsCardForced)) * 31;
        String str = this.optionKnowledgeCheckAppointmentId;
        int iHashCode21 = (iHashCode20 + (str == null ? 0 : str.hashCode())) * 31;
        ApiMarginInvestingInfo apiMarginInvestingInfo = this.marginInvestingInfo;
        return ((iHashCode21 + (apiMarginInvestingInfo != null ? apiMarginInvestingInfo.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMemberPdtRevampV1);
    }

    public String toString() {
        Account account = this.activeAccount;
        List<Account> list = this.accounts;
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        AccountOverviewRhdSectionState accountOverviewRhdSectionState = this.accountOverviewRhdSectionState;
        DayTradeCard dayTradeCard = this.dayTradeCard;
        MarginSettings marginSettings = this.marginSettings;
        MarginEligibilityViewModel marginEligibilityViewModel = this.marginSectionMarginEligibility;
        MarginEligibilityViewModel marginEligibilityViewModel2 = this.accountTypeSectionMarginEligibility;
        List<InvestmentSchedule> list2 = this.investmentSchedules;
        DripSettingsStore.DripCardType dripCardType = this.dripCardType;
        boolean z = this.isDripOnboarded;
        SlipHubCard slipHubCard = this.slipHubCard;
        boolean z2 = this.slipDisabled;
        SweepEnrollmentData sweepEnrollmentData = this.sweepEnrollmentData;
        Disclosure disclosure = this.interestEarningDisclosure;
        CharSequence charSequence = this.dayTradesContentfulSummary;
        return "AccountOverviewViewState(activeAccount=" + account + ", accounts=" + list + ", unifiedBalances=" + unifiedBalances + ", unifiedAccount=" + unifiedAccountV2 + ", accountOverviewRhdSectionState=" + accountOverviewRhdSectionState + ", dayTradeCard=" + dayTradeCard + ", marginSettings=" + marginSettings + ", marginSectionMarginEligibility=" + marginEligibilityViewModel + ", accountTypeSectionMarginEligibility=" + marginEligibilityViewModel2 + ", investmentSchedules=" + list2 + ", dripCardType=" + dripCardType + ", isDripOnboarded=" + z + ", slipHubCard=" + slipHubCard + ", slipDisabled=" + z2 + ", sweepEnrollmentData=" + sweepEnrollmentData + ", interestEarningDisclosure=" + disclosure + ", dayTradesContentfulSummary=" + ((Object) charSequence) + ", limitedMarginRiskContent=" + this.limitedMarginRiskContent + ", isOptionsSupported=" + this.isOptionsSupported + ", canUpgradeToOptions=" + this.canUpgradeToOptions + ", instantCard=" + this.instantCard + ", useServerDrivenOptionsSection=" + this.useServerDrivenOptionsSection + ", inOptionsLevel3EntryPointOptionsSettingsExperiment=" + this.inOptionsLevel3EntryPointOptionsSettingsExperiment + ", isMarginSupported=" + this.isMarginSupported + ", isInstantDepositFeatureEnabled=" + this.isInstantDepositFeatureEnabled + ", isInLeveredMarginRegionGate=" + this.isInLeveredMarginRegionGate + ", countryCode=" + this.countryCode + ", cardOrder=" + this.cardOrder + ", isDripSupported=" + this.isDripSupported + ", isSlipSupported=" + this.isSlipSupported + ", isRecurringSupported=" + this.isRecurringSupported + ", isSweepSupported=" + this.isSweepSupported + ", isInMcwRegionGate=" + this.isInMcwRegionGate + ", mcwCashExplainerDisclosure=" + this.mcwCashExplainerDisclosure + ", accountMarketValuesLive=" + this.accountMarketValuesLive + ", optionsStatus=" + this.optionsStatus + ", showOptionsCardForced=" + this.showOptionsCardForced + ", optionKnowledgeCheckAppointmentId=" + this.optionKnowledgeCheckAppointmentId + ", marginInvestingInfo=" + this.marginInvestingInfo + ", isMemberPdtRevampV1=" + this.isMemberPdtRevampV1 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountOverviewViewState(Account account, List<Account> accounts2, UnifiedBalances unifiedBalances, UnifiedAccountV2 unifiedAccountV2, AccountOverviewRhdSectionState accountOverviewRhdSectionState, DayTradeCard dayTradeCard, MarginSettings marginSettings, MarginEligibilityViewModel marginEligibilityViewModel, MarginEligibilityViewModel marginEligibilityViewModel2, List<InvestmentSchedule> list, DripSettingsStore.DripCardType dripCardType, boolean z, SlipHubCard slipHubCard, boolean z2, SweepEnrollmentData sweepEnrollmentData, Disclosure disclosure, CharSequence charSequence, OtherMarkdown otherMarkdown, boolean z3, boolean z4, InstantDepositCard instantDepositCard, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, CountryCode.Supported supported, List<? extends CardOrder.CardIdentifier> list2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Disclosure disclosure2, AccountMarketValuesLive accountMarketValuesLive, OptionsStatus optionsStatus, boolean z15, String str, ApiMarginInvestingInfo apiMarginInvestingInfo, boolean z16) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(dripCardType, "dripCardType");
        this.activeAccount = account;
        this.accounts = accounts2;
        this.unifiedBalances = unifiedBalances;
        this.unifiedAccount = unifiedAccountV2;
        this.accountOverviewRhdSectionState = accountOverviewRhdSectionState;
        this.dayTradeCard = dayTradeCard;
        this.marginSettings = marginSettings;
        this.marginSectionMarginEligibility = marginEligibilityViewModel;
        this.accountTypeSectionMarginEligibility = marginEligibilityViewModel2;
        this.investmentSchedules = list;
        this.dripCardType = dripCardType;
        this.isDripOnboarded = z;
        this.slipHubCard = slipHubCard;
        this.slipDisabled = z2;
        this.sweepEnrollmentData = sweepEnrollmentData;
        this.interestEarningDisclosure = disclosure;
        this.dayTradesContentfulSummary = charSequence;
        this.limitedMarginRiskContent = otherMarkdown;
        this.isOptionsSupported = z3;
        this.canUpgradeToOptions = z4;
        this.instantCard = instantDepositCard;
        this.useServerDrivenOptionsSection = z5;
        this.inOptionsLevel3EntryPointOptionsSettingsExperiment = z6;
        this.isMarginSupported = z7;
        this.isInstantDepositFeatureEnabled = z8;
        this.isInLeveredMarginRegionGate = z9;
        this.countryCode = supported;
        this.cardOrder = list2;
        this.isDripSupported = z10;
        this.isSlipSupported = z11;
        this.isRecurringSupported = z12;
        this.isSweepSupported = z13;
        this.isInMcwRegionGate = z14;
        this.mcwCashExplainerDisclosure = disclosure2;
        this.accountMarketValuesLive = accountMarketValuesLive;
        this.optionsStatus = optionsStatus;
        this.showOptionsCardForced = z15;
        this.optionKnowledgeCheckAppointmentId = str;
        this.marginInvestingInfo = apiMarginInvestingInfo;
        this.isMemberPdtRevampV1 = z16;
    }

    public final Account getActiveAccount() {
        return this.activeAccount;
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

    public final AccountOverviewRhdSectionState getAccountOverviewRhdSectionState() {
        return this.accountOverviewRhdSectionState;
    }

    public final DayTradeCard getDayTradeCard() {
        return this.dayTradeCard;
    }

    public final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    public final MarginEligibilityViewModel getMarginSectionMarginEligibility() {
        return this.marginSectionMarginEligibility;
    }

    public final MarginEligibilityViewModel getAccountTypeSectionMarginEligibility() {
        return this.accountTypeSectionMarginEligibility;
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

    public final boolean isOptionsSupported() {
        return this.isOptionsSupported;
    }

    public final boolean getCanUpgradeToOptions() {
        return this.canUpgradeToOptions;
    }

    public final InstantDepositCard getInstantCard() {
        return this.instantCard;
    }

    public final boolean getUseServerDrivenOptionsSection() {
        return this.useServerDrivenOptionsSection;
    }

    public final boolean getInOptionsLevel3EntryPointOptionsSettingsExperiment() {
        return this.inOptionsLevel3EntryPointOptionsSettingsExperiment;
    }

    public final boolean isMarginSupported() {
        return this.isMarginSupported;
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

    public final boolean isDripSupported() {
        return this.isDripSupported;
    }

    public final boolean isSlipSupported() {
        return this.isSlipSupported;
    }

    public final boolean isRecurringSupported() {
        return this.isRecurringSupported;
    }

    public final boolean isSweepSupported() {
        return this.isSweepSupported;
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

    private final boolean isRetirementAccount() {
        Account account = this.activeAccount;
        return account != null && account.getBrokerageAccountType().isRetirement();
    }

    private final boolean isManagedAccount() {
        Account account = this.activeAccount;
        return account != null && account.isManaged();
    }

    private final boolean isMargin() {
        BrokerageBalances brokerageBalances;
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        return (unifiedBalances == null || (brokerageBalances = unifiedBalances.getBrokerageBalances()) == null || !brokerageBalances.isMargin()) ? false : true;
    }

    private final PortfolioSectionState getPortfolioSectionState() {
        UnifiedBalances unifiedBalances;
        AccountMarketValuesLive accountMarketValuesLive = this.accountMarketValuesLive;
        if (accountMarketValuesLive == null || (unifiedBalances = this.unifiedBalances) == null) {
            return null;
        }
        return new PortfolioSectionState(accountMarketValuesLive, unifiedBalances, this.isInMcwRegionGate, this.isOptionsSupported, isManagedAccount(), this.mcwCashExplainerDisclosure, !this.isInstantDepositFeatureEnabled && Affiliate.RHSG.INSTANCE.contains(this.countryCode));
    }

    public final boolean getShowDynamicInstantContent() {
        return isMargin() && !isRetirementAccount();
    }

    public final boolean getShouldShowCurrencySwitcher() {
        return this.isInMcwRegionGate;
    }

    private final InstantSectionState getInstantSectionState() {
        InstantDepositCard instantDepositCard = this.instantCard;
        if (instantDepositCard != null) {
            return new InstantSectionState(instantDepositCard);
        }
        return null;
    }

    /* renamed from: getShowInstantSection, reason: from getter */
    private final boolean getIsInstantDepositFeatureEnabled() {
        return this.isInstantDepositFeatureEnabled;
    }

    private final RecurringSectionState getRecurringSectionState() {
        List<InvestmentSchedule> list;
        Account account = this.activeAccount;
        if (account == null || !this.isRecurringSupported || (list = this.investmentSchedules) == null) {
            return null;
        }
        return new RecurringSectionState(list, account.getAccountNumber());
    }

    private final SweepSectionState getSweepSectionState() {
        Account account;
        SweepEnrollmentData sweepEnrollmentData;
        Disclosure disclosure;
        CountryCode.Supported supported;
        if (!this.isSweepSupported || (account = this.activeAccount) == null || (sweepEnrollmentData = this.sweepEnrollmentData) == null || (disclosure = this.interestEarningDisclosure) == null || (supported = this.countryCode) == null) {
            return null;
        }
        return new SweepSectionState(account, sweepEnrollmentData, disclosure, supported, this.isInLeveredMarginRegionGate, this.isInMcwRegionGate);
    }

    private final DripSectionState getDripSectionState() {
        Account account = this.activeAccount;
        if (account == null || this.dripCardType == DripSettingsStore.DripCardType.NONE || !this.isDripSupported) {
            return null;
        }
        return new DripSectionState(this.dripCardType, this.isDripOnboarded, account.getAccountNumber());
    }

    public final String getToolbarSubtitle() {
        Account account = this.activeAccount;
        if (account != null) {
            return account.getAccountNumberRhs();
        }
        return null;
    }

    private final boolean getShowAccountSelector() {
        return this.accounts.size() > 1 && getAccountSelectorState() != null;
    }

    private final AccountSelectorState getAccountSelectorState() {
        Account account = this.activeAccount;
        if (account != null) {
            return new AccountSelectorState(AccountDisplayNames.getDisplayName(account), AccountSwitcherData.Companion.from$default(AccountSwitcherData.INSTANCE, account.getAccountNumber(), AccountSwitcherUtils4.filterDeactivatedForSwitcher(this.accounts), false, false, null, 28, null));
        }
        return null;
    }

    private final InfoBannerSectionState getInfoBannerState() {
        Account account = this.activeAccount;
        if (account != null) {
            return new InfoBannerSectionState(account.getAccountNumber());
        }
        return null;
    }

    public final boolean getShowOptionLevel3EntryPoint() {
        Account account = this.activeAccount;
        return account != null && account.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL && this.activeAccount.isMargin() && this.optionsStatus == OptionsStatus.LEVEL_2 && this.inOptionsLevel3EntryPointOptionsSettingsExperiment;
    }

    private final OptionsSectionState getOptionsSectionState() {
        Account account = this.activeAccount;
        if (account == null) {
            return null;
        }
        if (!this.isOptionsSupported && !this.showOptionsCardForced) {
            return null;
        }
        boolean z = this.canUpgradeToOptions;
        OptionsStatus optionsStatus = this.optionsStatus;
        if (optionsStatus == null) {
            optionsStatus = OptionsStatus.OPTIONS_STATUS_UNSPECIFIED;
        }
        return new OptionsSectionState(account, z, optionsStatus, this.useServerDrivenOptionsSection, getShowOptionLevel3EntryPoint(), this.optionKnowledgeCheckAppointmentId);
    }

    private final MarginSectionState getMarginSectionState() {
        ApiMarginInvestingInfo apiMarginInvestingInfo;
        MarginSettings marginSettings;
        Account account;
        if (!this.isMarginSupported || (apiMarginInvestingInfo = this.marginInvestingInfo) == null || (marginSettings = this.marginSettings) == null || (account = this.activeAccount) == null) {
            return null;
        }
        boolean z = this.isOptionsSupported;
        CountryCode.Supported supported = this.countryCode;
        if (supported == null) {
            return null;
        }
        return new MarginSectionState(apiMarginInvestingInfo, marginSettings, account, z, supported, this.marginSectionMarginEligibility);
    }

    private final boolean getShowDayTradeSection() {
        return isMargin() && !this.isMemberPdtRevampV1;
    }

    private final DayTradeSectionState getDayTradeSectionState() {
        DayTradeCard dayTradeCard = this.dayTradeCard;
        if (dayTradeCard != null) {
            return new DayTradeSectionState(dayTradeCard.getComponents());
        }
        return null;
    }

    private final SlipSectionState getSlipSectionState() {
        if (this.slipHubCard == null || !this.isSlipSupported) {
            return null;
        }
        return new SlipSectionState(this.slipHubCard);
    }

    private final AccountTypeSectionState getAccountTypeSectionState() {
        Account account = this.activeAccount;
        if (account == null) {
            return null;
        }
        boolean zIsRetirementAccount = isRetirementAccount();
        CountryCode.Supported supported = this.countryCode;
        if (supported == null) {
            return null;
        }
        return new AccountTypeSectionState(account, zIsRetirementAccount, supported, this.accountTypeSectionMarginEligibility, this.isMemberPdtRevampV1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[PHI: r4
      0x0075: PHI (r4v17 java.lang.Object) = (r4v5 java.lang.Object), (r4v9 java.lang.Object), (r4v18 java.lang.Object) binds: [B:43:0x00b9, B:35:0x00a0, B:23:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AccountOverviewSectionState> getSectionsStates() {
        Object accountSelectorState;
        Object infoBannerState;
        PortfolioSectionState portfolioSectionState = getPortfolioSectionState();
        if (portfolioSectionState == null) {
            return CollectionsKt.emptyList();
        }
        List listListOf = CollectionsKt.listOf((Object[]) new CardOrder.CardIdentifier[]{CardOrder.CardIdentifier.ACCOUNT_SELECTOR, CardOrder.CardIdentifier.INFO_BANNER_ABOVE_PORTFOLIO});
        List<CardOrder.CardIdentifier> mutableList = this.cardOrder;
        if (mutableList == null) {
            if (this.accountOverviewRhdSectionState != null) {
                mutableList = CollectionsKt.toMutableList((Collection) DEFAULT_CARD_ORDER);
                mutableList.add(CardOrder.CardIdentifier.FUTURES);
            } else {
                mutableList = DEFAULT_CARD_ORDER;
            }
        }
        List<CardOrder.CardIdentifier> listPlus = CollectionsKt.plus((Collection) listListOf, (Iterable) mutableList);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (CardOrder.CardIdentifier cardIdentifier : listPlus) {
            Object obj = null;
            switch (WhenMappings.$EnumSwitchMapping$0[cardIdentifier.ordinal()]) {
                case 1:
                    accountSelectorState = getAccountSelectorState();
                    if (accountSelectorState != null && getShowAccountSelector()) {
                        obj = accountSelectorState;
                    }
                    infoBannerState = obj;
                    if (infoBannerState == null) {
                        infoBannerState = new PlaceholderSectionState(cardIdentifier);
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 2:
                    infoBannerState = getInfoBannerState();
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 3:
                    infoBannerState = portfolioSectionState;
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 4:
                    infoBannerState = getSlipSectionState();
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 5:
                    accountSelectorState = getInstantSectionState();
                    if (accountSelectorState != null && getIsInstantDepositFeatureEnabled()) {
                    }
                    infoBannerState = obj;
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 6:
                    infoBannerState = getRecurringSectionState();
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 7:
                    infoBannerState = getDripSectionState();
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 8:
                    infoBannerState = getSweepSectionState();
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 9:
                    infoBannerState = getOptionsSectionState();
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 10:
                    infoBannerState = getAccountTypeSectionState();
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 11:
                    infoBannerState = getMarginSectionState();
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 12:
                    accountSelectorState = getDayTradeSectionState();
                    if (accountSelectorState != null && getShowDayTradeSection()) {
                    }
                    infoBannerState = obj;
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                case 13:
                    infoBannerState = this.accountOverviewRhdSectionState;
                    if (infoBannerState == null) {
                    }
                    arrayList.add(infoBannerState);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            AccountOverviewSectionState accountOverviewSectionState = (AccountOverviewSectionState) obj2;
            Account account = this.activeAccount;
            if (account == null || !account.isManaged() || MANAGED_ACCOUNT_VIEW_TYPE_ALLOW_LIST.contains(accountOverviewSectionState.getIdentifier())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final int getInstantIndex() {
        Iterator<AccountOverviewSectionState> it = getSectionsStates().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() instanceof InstantSectionState) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int getSweepIndex() {
        Iterator<AccountOverviewSectionState> it = getSectionsStates().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() instanceof SweepSectionState) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int getDayTradeIndex() {
        Iterator<AccountOverviewSectionState> it = getSectionsStates().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() instanceof DayTradeSectionState) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int getOptionsIndex() {
        Iterator<AccountOverviewSectionState> it = getSectionsStates().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() instanceof OptionsSectionState) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int getFuturesIndex() {
        Iterator<AccountOverviewSectionState> it = getSectionsStates().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() instanceof AccountOverviewRhdSectionState) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* compiled from: AccountOverviewViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewViewState$Companion;", "", "<init>", "()V", "MANAGED_ACCOUNT_VIEW_TYPE_ALLOW_LIST", "", "Lcom/robinhood/android/models/accountoverview/db/CardOrder$CardIdentifier;", "getMANAGED_ACCOUNT_VIEW_TYPE_ALLOW_LIST", "()Ljava/util/List;", "DEFAULT_CARD_ORDER", "getDEFAULT_CARD_ORDER", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<CardOrder.CardIdentifier> getMANAGED_ACCOUNT_VIEW_TYPE_ALLOW_LIST() {
            return AccountOverviewViewState.MANAGED_ACCOUNT_VIEW_TYPE_ALLOW_LIST;
        }

        public final List<CardOrder.CardIdentifier> getDEFAULT_CARD_ORDER() {
            return AccountOverviewViewState.DEFAULT_CARD_ORDER;
        }
    }

    static {
        CardOrder.CardIdentifier cardIdentifier = CardOrder.CardIdentifier.ACCOUNT_SELECTOR;
        CardOrder.CardIdentifier cardIdentifier2 = CardOrder.CardIdentifier.INSTANT_DEPOSITS;
        CardOrder.CardIdentifier cardIdentifier3 = CardOrder.CardIdentifier.PORTFOLIO_VALUE;
        CardOrder.CardIdentifier cardIdentifier4 = CardOrder.CardIdentifier.SWEEP;
        CardOrder.CardIdentifier cardIdentifier5 = CardOrder.CardIdentifier.SLIP;
        MANAGED_ACCOUNT_VIEW_TYPE_ALLOW_LIST = CollectionsKt.listOf((Object[]) new CardOrder.CardIdentifier[]{cardIdentifier, cardIdentifier2, cardIdentifier3, cardIdentifier4, cardIdentifier5});
        DEFAULT_CARD_ORDER = CollectionsKt.listOf((Object[]) new CardOrder.CardIdentifier[]{cardIdentifier3, cardIdentifier5, cardIdentifier2, CardOrder.CardIdentifier.RECURRING_INVESTMENTS, CardOrder.CardIdentifier.DRIP, cardIdentifier4, CardOrder.CardIdentifier.OPTIONS_SETTINGS, CardOrder.CardIdentifier.ACCOUNT_TYPE_CARD, CardOrder.CardIdentifier.MARGIN, CardOrder.CardIdentifier.DAY_TRADES});
    }
}
