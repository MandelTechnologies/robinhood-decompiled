package com.robinhood.android.transfers.p271ui.retirement.contributions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.models.retirement.api.contributions.ApiGoldMatchSelectionRow;
import com.robinhood.android.models.retirement.api.contributions.ApiRetirementContributionsResponse;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.retirement.contributions.ContributionReviewModeKt;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.TransferData;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: CreateRetirementContributionDataState.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B·\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\b\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\b\u0012\b\b\u0002\u0010*\u001a\u00020\b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010-\u001a\u00020\b¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\bHÂ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b8\u00101J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b=\u0010<J\u0010\u0010>\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b@\u00101J\u0012\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bE\u00101J\u0010\u0010F\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bF\u00101J\u001c\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bI\u00101J\u0010\u0010J\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bL\u00103J\u0012\u0010M\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bO\u00101J\u0010\u0010P\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bP\u00101J\u0010\u0010Q\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bQ\u00101J\u0012\u0010R\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bV\u00101J\u0012\u0010W\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bY\u00101JÄ\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010-\u001a\u00020\bHÆ\u0001¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\\\u00103J\u0010\u0010^\u001a\u00020]HÖ\u0001¢\u0006\u0004\b^\u0010_J\u001a\u0010a\u001a\u00020\b2\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\ba\u0010bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010c\u001a\u0004\bd\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010e\u001a\u0004\bf\u00105R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010g\u001a\u0004\bh\u00107R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010i\u001a\u0004\b\t\u00101R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010j\u001a\u0004\bk\u0010:R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010l\u001a\u0004\bm\u0010<R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010l\u001a\u0004\bn\u0010<R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010o\u001a\u0004\bp\u0010?R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010i\u001a\u0004\bq\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010r\u001a\u0004\bs\u0010BR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010t\u001a\u0004\bu\u0010DR\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010i\u001a\u0004\bv\u00101R\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010i\u001a\u0004\b\u0017\u00101R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010w\u001a\u0004\bx\u0010HR\u0017\u0010\u001c\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\by\u00101R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010z\u001a\u0004\b{\u0010KR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010c\u001a\u0004\b|\u00103R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010}\u001a\u0004\b~\u0010NR\u0017\u0010\"\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010i\u001a\u0004\b\u007f\u00101R\u0018\u0010#\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\b#\u0010i\u001a\u0005\b\u0080\u0001\u00101R\u0017\u0010$\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010i\u001a\u0004\b$\u00101R\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010SR\u001b\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010UR\u0018\u0010)\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\b)\u0010i\u001a\u0005\b\u0085\u0001\u00101R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010iR\u001b\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b,\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010XR\u0018\u0010-\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\b-\u0010i\u001a\u0005\b\u0088\u0001\u00101R\u0013\u0010\u008a\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u00101R\u0013\u0010\u008c\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u00101R\u0015\u0010\u008e\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010U¨\u0006\u008f\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;", "", "", "accountNumber", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPoint", "j$/time/Year", "taxYear", "", "isInEditMode", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "accounts", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "frequency", "canShowFrequencyRow", "Lcom/robinhood/models/db/Portfolio;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "unifiedBalances", "areMarketsOpenExtended", "isContributionRequestLoading", "", "Lcom/robinhood/android/transfers/ui/max/TransferData;", "Ljava/util/UUID;", "transferDataToRefId", "showEnokiCelebration", "Ljava/math/BigDecimal;", "userInputAmount", "userInputString", "Lcom/robinhood/android/models/retirement/api/contributions/ApiRetirementContributionsResponse;", "screenInfo", "hasApiError", "overrideNoEnokiAlert", "isInInterEntityMatchExperiment", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "matchRate", "Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "passedInMatchTypeOverride", "shouldContinueInsteadOfSubmit", "reviewCanGoToMatchRateSelection", "Lcom/robinhood/android/models/retirement/api/contributions/ApiGoldMatchSelectionRow;", ContributionReviewModeKt.GoldMatchSelectionRowTag, "goldMatchSelectionRowSelected", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Lj$/time/Year;ZLjava/util/List;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/TransferFrequency;ZLcom/robinhood/models/db/Portfolio;Lcom/robinhood/models/crypto/db/UnifiedBalances;ZZLjava/util/Map;ZLjava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/android/models/retirement/api/contributions/ApiRetirementContributionsResponse;ZZZLcom/robinhood/android/models/retirement/db/RetirementMatchRate;Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;ZZLcom/robinhood/android/models/retirement/api/contributions/ApiGoldMatchSelectionRow;Z)V", "component25", "()Z", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component3", "()Lj$/time/Year;", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component7", "component8", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "component9", "component10", "()Lcom/robinhood/models/db/Portfolio;", "component11", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "component12", "component13", "component14", "()Ljava/util/Map;", "component15", "component16", "()Ljava/math/BigDecimal;", "component17", "component18", "()Lcom/robinhood/android/models/retirement/api/contributions/ApiRetirementContributionsResponse;", "component19", "component20", "component21", "component22", "()Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "component23", "()Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "component24", "component26", "()Lcom/robinhood/android/models/retirement/api/contributions/ApiGoldMatchSelectionRow;", "component27", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Lj$/time/Year;ZLjava/util/List;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/TransferFrequency;ZLcom/robinhood/models/db/Portfolio;Lcom/robinhood/models/crypto/db/UnifiedBalances;ZZLjava/util/Map;ZLjava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/android/models/retirement/api/contributions/ApiRetirementContributionsResponse;ZZZLcom/robinhood/android/models/retirement/db/RetirementMatchRate;Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;ZZLcom/robinhood/android/models/retirement/api/contributions/ApiGoldMatchSelectionRow;Z)Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPoint", "Lj$/time/Year;", "getTaxYear", "Z", "Ljava/util/List;", "getAccounts", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSourceAccount", "getSinkAccount", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getFrequency", "getCanShowFrequencyRow", "Lcom/robinhood/models/db/Portfolio;", "getPortfolio", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "getUnifiedBalances", "getAreMarketsOpenExtended", "Ljava/util/Map;", "getTransferDataToRefId", "getShowEnokiCelebration", "Ljava/math/BigDecimal;", "getUserInputAmount", "getUserInputString", "Lcom/robinhood/android/models/retirement/api/contributions/ApiRetirementContributionsResponse;", "getScreenInfo", "getHasApiError", "getOverrideNoEnokiAlert", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "getMatchRate", "Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "getPassedInMatchTypeOverride", "getShouldContinueInsteadOfSubmit", "Lcom/robinhood/android/models/retirement/api/contributions/ApiGoldMatchSelectionRow;", "getGoldMatchSelectionRow", "getGoldMatchSelectionRowSelected", "getSinkAccountIsManaged", "sinkAccountIsManaged", "getReviewShouldLaunchMatchRateSelection", "reviewShouldLaunchMatchRateSelection", "getEffectiveMatchRateOverride", "effectiveMatchRateOverride", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateRetirementContributionDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final List<TransferAccount> accounts;
    private final boolean areMarketsOpenExtended;
    private final boolean canShowFrequencyRow;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final ApiCreateTransferRequest2 frequency;
    private final ApiGoldMatchSelectionRow goldMatchSelectionRow;
    private final boolean goldMatchSelectionRowSelected;
    private final boolean hasApiError;
    private final boolean isContributionRequestLoading;
    private final boolean isInEditMode;
    private final boolean isInInterEntityMatchExperiment;
    private final RetirementMatchRate matchRate;
    private final boolean overrideNoEnokiAlert;
    private final ApiRetirementMatchResponse3 passedInMatchTypeOverride;
    private final Portfolio portfolio;
    private final boolean reviewCanGoToMatchRateSelection;
    private final ApiRetirementContributionsResponse screenInfo;
    private final boolean shouldContinueInsteadOfSubmit;
    private final boolean showEnokiCelebration;
    private final TransferAccount sinkAccount;
    private final TransferAccount sourceAccount;
    private final Year taxYear;
    private final Map<TransferData, UUID> transferDataToRefId;
    private final UnifiedBalances unifiedBalances;
    private final BigDecimal userInputAmount;
    private final String userInputString;

    /* renamed from: component25, reason: from getter */
    private final boolean getReviewCanGoToMatchRateSelection() {
        return this.reviewCanGoToMatchRateSelection;
    }

    public static /* synthetic */ CreateRetirementContributionDataState copy$default(CreateRetirementContributionDataState createRetirementContributionDataState, String str, MAXTransferContext.EntryPoint entryPoint, Year year, boolean z, List list, TransferAccount transferAccount, TransferAccount transferAccount2, ApiCreateTransferRequest2 apiCreateTransferRequest2, boolean z2, Portfolio portfolio, UnifiedBalances unifiedBalances, boolean z3, boolean z4, Map map, boolean z5, BigDecimal bigDecimal, String str2, ApiRetirementContributionsResponse apiRetirementContributionsResponse, boolean z6, boolean z7, boolean z8, RetirementMatchRate retirementMatchRate, ApiRetirementMatchResponse3 apiRetirementMatchResponse3, boolean z9, boolean z10, ApiGoldMatchSelectionRow apiGoldMatchSelectionRow, boolean z11, int i, Object obj) {
        boolean z12;
        ApiGoldMatchSelectionRow apiGoldMatchSelectionRow2;
        String str3 = (i & 1) != 0 ? createRetirementContributionDataState.accountNumber : str;
        MAXTransferContext.EntryPoint entryPoint2 = (i & 2) != 0 ? createRetirementContributionDataState.entryPoint : entryPoint;
        Year year2 = (i & 4) != 0 ? createRetirementContributionDataState.taxYear : year;
        boolean z13 = (i & 8) != 0 ? createRetirementContributionDataState.isInEditMode : z;
        List list2 = (i & 16) != 0 ? createRetirementContributionDataState.accounts : list;
        TransferAccount transferAccount3 = (i & 32) != 0 ? createRetirementContributionDataState.sourceAccount : transferAccount;
        TransferAccount transferAccount4 = (i & 64) != 0 ? createRetirementContributionDataState.sinkAccount : transferAccount2;
        ApiCreateTransferRequest2 apiCreateTransferRequest22 = (i & 128) != 0 ? createRetirementContributionDataState.frequency : apiCreateTransferRequest2;
        boolean z14 = (i & 256) != 0 ? createRetirementContributionDataState.canShowFrequencyRow : z2;
        Portfolio portfolio2 = (i & 512) != 0 ? createRetirementContributionDataState.portfolio : portfolio;
        UnifiedBalances unifiedBalances2 = (i & 1024) != 0 ? createRetirementContributionDataState.unifiedBalances : unifiedBalances;
        boolean z15 = (i & 2048) != 0 ? createRetirementContributionDataState.areMarketsOpenExtended : z3;
        boolean z16 = (i & 4096) != 0 ? createRetirementContributionDataState.isContributionRequestLoading : z4;
        Map map2 = (i & 8192) != 0 ? createRetirementContributionDataState.transferDataToRefId : map;
        String str4 = str3;
        boolean z17 = (i & 16384) != 0 ? createRetirementContributionDataState.showEnokiCelebration : z5;
        BigDecimal bigDecimal2 = (i & 32768) != 0 ? createRetirementContributionDataState.userInputAmount : bigDecimal;
        String str5 = (i & 65536) != 0 ? createRetirementContributionDataState.userInputString : str2;
        ApiRetirementContributionsResponse apiRetirementContributionsResponse2 = (i & 131072) != 0 ? createRetirementContributionDataState.screenInfo : apiRetirementContributionsResponse;
        boolean z18 = (i & 262144) != 0 ? createRetirementContributionDataState.hasApiError : z6;
        boolean z19 = (i & 524288) != 0 ? createRetirementContributionDataState.overrideNoEnokiAlert : z7;
        boolean z20 = (i & 1048576) != 0 ? createRetirementContributionDataState.isInInterEntityMatchExperiment : z8;
        RetirementMatchRate retirementMatchRate2 = (i & 2097152) != 0 ? createRetirementContributionDataState.matchRate : retirementMatchRate;
        ApiRetirementMatchResponse3 apiRetirementMatchResponse32 = (i & 4194304) != 0 ? createRetirementContributionDataState.passedInMatchTypeOverride : apiRetirementMatchResponse3;
        boolean z21 = (i & 8388608) != 0 ? createRetirementContributionDataState.shouldContinueInsteadOfSubmit : z9;
        boolean z22 = (i & 16777216) != 0 ? createRetirementContributionDataState.reviewCanGoToMatchRateSelection : z10;
        ApiGoldMatchSelectionRow apiGoldMatchSelectionRow3 = (i & 33554432) != 0 ? createRetirementContributionDataState.goldMatchSelectionRow : apiGoldMatchSelectionRow;
        if ((i & 67108864) != 0) {
            apiGoldMatchSelectionRow2 = apiGoldMatchSelectionRow3;
            z12 = createRetirementContributionDataState.goldMatchSelectionRowSelected;
        } else {
            z12 = z11;
            apiGoldMatchSelectionRow2 = apiGoldMatchSelectionRow3;
        }
        return createRetirementContributionDataState.copy(str4, entryPoint2, year2, z13, list2, transferAccount3, transferAccount4, apiCreateTransferRequest22, z14, portfolio2, unifiedBalances2, z15, z16, map2, z17, bigDecimal2, str5, apiRetirementContributionsResponse2, z18, z19, z20, retirementMatchRate2, apiRetirementMatchResponse32, z21, z22, apiGoldMatchSelectionRow2, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    /* renamed from: component11, reason: from getter */
    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getAreMarketsOpenExtended() {
        return this.areMarketsOpenExtended;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsContributionRequestLoading() {
        return this.isContributionRequestLoading;
    }

    public final Map<TransferData, UUID> component14() {
        return this.transferDataToRefId;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShowEnokiCelebration() {
        return this.showEnokiCelebration;
    }

    /* renamed from: component16, reason: from getter */
    public final BigDecimal getUserInputAmount() {
        return this.userInputAmount;
    }

    /* renamed from: component17, reason: from getter */
    public final String getUserInputString() {
        return this.userInputString;
    }

    /* renamed from: component18, reason: from getter */
    public final ApiRetirementContributionsResponse getScreenInfo() {
        return this.screenInfo;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getHasApiError() {
        return this.hasApiError;
    }

    /* renamed from: component2, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getOverrideNoEnokiAlert() {
        return this.overrideNoEnokiAlert;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsInInterEntityMatchExperiment() {
        return this.isInInterEntityMatchExperiment;
    }

    /* renamed from: component22, reason: from getter */
    public final RetirementMatchRate getMatchRate() {
        return this.matchRate;
    }

    /* renamed from: component23, reason: from getter */
    public final ApiRetirementMatchResponse3 getPassedInMatchTypeOverride() {
        return this.passedInMatchTypeOverride;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getShouldContinueInsteadOfSubmit() {
        return this.shouldContinueInsteadOfSubmit;
    }

    /* renamed from: component26, reason: from getter */
    public final ApiGoldMatchSelectionRow getGoldMatchSelectionRow() {
        return this.goldMatchSelectionRow;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getGoldMatchSelectionRowSelected() {
        return this.goldMatchSelectionRowSelected;
    }

    /* renamed from: component3, reason: from getter */
    public final Year getTaxYear() {
        return this.taxYear;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsInEditMode() {
        return this.isInEditMode;
    }

    public final List<TransferAccount> component5() {
        return this.accounts;
    }

    /* renamed from: component6, reason: from getter */
    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component8, reason: from getter */
    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getCanShowFrequencyRow() {
        return this.canShowFrequencyRow;
    }

    public final CreateRetirementContributionDataState copy(String accountNumber, MAXTransferContext.EntryPoint entryPoint, Year taxYear, boolean isInEditMode, List<TransferAccount> accounts2, TransferAccount sourceAccount, TransferAccount sinkAccount, ApiCreateTransferRequest2 frequency, boolean canShowFrequencyRow, Portfolio portfolio, UnifiedBalances unifiedBalances, boolean areMarketsOpenExtended, boolean isContributionRequestLoading, Map<TransferData, UUID> transferDataToRefId, boolean showEnokiCelebration, BigDecimal userInputAmount, String userInputString, ApiRetirementContributionsResponse screenInfo, boolean hasApiError, boolean overrideNoEnokiAlert, boolean isInInterEntityMatchExperiment, RetirementMatchRate matchRate, ApiRetirementMatchResponse3 passedInMatchTypeOverride, boolean shouldContinueInsteadOfSubmit, boolean reviewCanGoToMatchRateSelection, ApiGoldMatchSelectionRow goldMatchSelectionRow, boolean goldMatchSelectionRowSelected) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(transferDataToRefId, "transferDataToRefId");
        Intrinsics.checkNotNullParameter(userInputAmount, "userInputAmount");
        Intrinsics.checkNotNullParameter(userInputString, "userInputString");
        return new CreateRetirementContributionDataState(accountNumber, entryPoint, taxYear, isInEditMode, accounts2, sourceAccount, sinkAccount, frequency, canShowFrequencyRow, portfolio, unifiedBalances, areMarketsOpenExtended, isContributionRequestLoading, transferDataToRefId, showEnokiCelebration, userInputAmount, userInputString, screenInfo, hasApiError, overrideNoEnokiAlert, isInInterEntityMatchExperiment, matchRate, passedInMatchTypeOverride, shouldContinueInsteadOfSubmit, reviewCanGoToMatchRateSelection, goldMatchSelectionRow, goldMatchSelectionRowSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateRetirementContributionDataState)) {
            return false;
        }
        CreateRetirementContributionDataState createRetirementContributionDataState = (CreateRetirementContributionDataState) other;
        return Intrinsics.areEqual(this.accountNumber, createRetirementContributionDataState.accountNumber) && this.entryPoint == createRetirementContributionDataState.entryPoint && Intrinsics.areEqual(this.taxYear, createRetirementContributionDataState.taxYear) && this.isInEditMode == createRetirementContributionDataState.isInEditMode && Intrinsics.areEqual(this.accounts, createRetirementContributionDataState.accounts) && Intrinsics.areEqual(this.sourceAccount, createRetirementContributionDataState.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, createRetirementContributionDataState.sinkAccount) && this.frequency == createRetirementContributionDataState.frequency && this.canShowFrequencyRow == createRetirementContributionDataState.canShowFrequencyRow && Intrinsics.areEqual(this.portfolio, createRetirementContributionDataState.portfolio) && Intrinsics.areEqual(this.unifiedBalances, createRetirementContributionDataState.unifiedBalances) && this.areMarketsOpenExtended == createRetirementContributionDataState.areMarketsOpenExtended && this.isContributionRequestLoading == createRetirementContributionDataState.isContributionRequestLoading && Intrinsics.areEqual(this.transferDataToRefId, createRetirementContributionDataState.transferDataToRefId) && this.showEnokiCelebration == createRetirementContributionDataState.showEnokiCelebration && Intrinsics.areEqual(this.userInputAmount, createRetirementContributionDataState.userInputAmount) && Intrinsics.areEqual(this.userInputString, createRetirementContributionDataState.userInputString) && Intrinsics.areEqual(this.screenInfo, createRetirementContributionDataState.screenInfo) && this.hasApiError == createRetirementContributionDataState.hasApiError && this.overrideNoEnokiAlert == createRetirementContributionDataState.overrideNoEnokiAlert && this.isInInterEntityMatchExperiment == createRetirementContributionDataState.isInInterEntityMatchExperiment && Intrinsics.areEqual(this.matchRate, createRetirementContributionDataState.matchRate) && this.passedInMatchTypeOverride == createRetirementContributionDataState.passedInMatchTypeOverride && this.shouldContinueInsteadOfSubmit == createRetirementContributionDataState.shouldContinueInsteadOfSubmit && this.reviewCanGoToMatchRateSelection == createRetirementContributionDataState.reviewCanGoToMatchRateSelection && Intrinsics.areEqual(this.goldMatchSelectionRow, createRetirementContributionDataState.goldMatchSelectionRow) && this.goldMatchSelectionRowSelected == createRetirementContributionDataState.goldMatchSelectionRowSelected;
    }

    public int hashCode() {
        int iHashCode = ((this.accountNumber.hashCode() * 31) + this.entryPoint.hashCode()) * 31;
        Year year = this.taxYear;
        int iHashCode2 = (((iHashCode + (year == null ? 0 : year.hashCode())) * 31) + Boolean.hashCode(this.isInEditMode)) * 31;
        List<TransferAccount> list = this.accounts;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        TransferAccount transferAccount = this.sourceAccount;
        int iHashCode4 = (iHashCode3 + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
        TransferAccount transferAccount2 = this.sinkAccount;
        int iHashCode5 = (((((iHashCode4 + (transferAccount2 == null ? 0 : transferAccount2.hashCode())) * 31) + this.frequency.hashCode()) * 31) + Boolean.hashCode(this.canShowFrequencyRow)) * 31;
        Portfolio portfolio = this.portfolio;
        int iHashCode6 = (iHashCode5 + (portfolio == null ? 0 : portfolio.hashCode())) * 31;
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        int iHashCode7 = (((((((((((((iHashCode6 + (unifiedBalances == null ? 0 : unifiedBalances.hashCode())) * 31) + Boolean.hashCode(this.areMarketsOpenExtended)) * 31) + Boolean.hashCode(this.isContributionRequestLoading)) * 31) + this.transferDataToRefId.hashCode()) * 31) + Boolean.hashCode(this.showEnokiCelebration)) * 31) + this.userInputAmount.hashCode()) * 31) + this.userInputString.hashCode()) * 31;
        ApiRetirementContributionsResponse apiRetirementContributionsResponse = this.screenInfo;
        int iHashCode8 = (((((((iHashCode7 + (apiRetirementContributionsResponse == null ? 0 : apiRetirementContributionsResponse.hashCode())) * 31) + Boolean.hashCode(this.hasApiError)) * 31) + Boolean.hashCode(this.overrideNoEnokiAlert)) * 31) + Boolean.hashCode(this.isInInterEntityMatchExperiment)) * 31;
        RetirementMatchRate retirementMatchRate = this.matchRate;
        int iHashCode9 = (iHashCode8 + (retirementMatchRate == null ? 0 : retirementMatchRate.hashCode())) * 31;
        ApiRetirementMatchResponse3 apiRetirementMatchResponse3 = this.passedInMatchTypeOverride;
        int iHashCode10 = (((((iHashCode9 + (apiRetirementMatchResponse3 == null ? 0 : apiRetirementMatchResponse3.hashCode())) * 31) + Boolean.hashCode(this.shouldContinueInsteadOfSubmit)) * 31) + Boolean.hashCode(this.reviewCanGoToMatchRateSelection)) * 31;
        ApiGoldMatchSelectionRow apiGoldMatchSelectionRow = this.goldMatchSelectionRow;
        return ((iHashCode10 + (apiGoldMatchSelectionRow != null ? apiGoldMatchSelectionRow.hashCode() : 0)) * 31) + Boolean.hashCode(this.goldMatchSelectionRowSelected);
    }

    public String toString() {
        return "CreateRetirementContributionDataState(accountNumber=" + this.accountNumber + ", entryPoint=" + this.entryPoint + ", taxYear=" + this.taxYear + ", isInEditMode=" + this.isInEditMode + ", accounts=" + this.accounts + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", frequency=" + this.frequency + ", canShowFrequencyRow=" + this.canShowFrequencyRow + ", portfolio=" + this.portfolio + ", unifiedBalances=" + this.unifiedBalances + ", areMarketsOpenExtended=" + this.areMarketsOpenExtended + ", isContributionRequestLoading=" + this.isContributionRequestLoading + ", transferDataToRefId=" + this.transferDataToRefId + ", showEnokiCelebration=" + this.showEnokiCelebration + ", userInputAmount=" + this.userInputAmount + ", userInputString=" + this.userInputString + ", screenInfo=" + this.screenInfo + ", hasApiError=" + this.hasApiError + ", overrideNoEnokiAlert=" + this.overrideNoEnokiAlert + ", isInInterEntityMatchExperiment=" + this.isInInterEntityMatchExperiment + ", matchRate=" + this.matchRate + ", passedInMatchTypeOverride=" + this.passedInMatchTypeOverride + ", shouldContinueInsteadOfSubmit=" + this.shouldContinueInsteadOfSubmit + ", reviewCanGoToMatchRateSelection=" + this.reviewCanGoToMatchRateSelection + ", goldMatchSelectionRow=" + this.goldMatchSelectionRow + ", goldMatchSelectionRowSelected=" + this.goldMatchSelectionRowSelected + ")";
    }

    public CreateRetirementContributionDataState(String accountNumber, MAXTransferContext.EntryPoint entryPoint, Year year, boolean z, List<TransferAccount> list, TransferAccount transferAccount, TransferAccount transferAccount2, ApiCreateTransferRequest2 frequency, boolean z2, Portfolio portfolio, UnifiedBalances unifiedBalances, boolean z3, boolean z4, Map<TransferData, UUID> transferDataToRefId, boolean z5, BigDecimal userInputAmount, String userInputString, ApiRetirementContributionsResponse apiRetirementContributionsResponse, boolean z6, boolean z7, boolean z8, RetirementMatchRate retirementMatchRate, ApiRetirementMatchResponse3 apiRetirementMatchResponse3, boolean z9, boolean z10, ApiGoldMatchSelectionRow apiGoldMatchSelectionRow, boolean z11) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(transferDataToRefId, "transferDataToRefId");
        Intrinsics.checkNotNullParameter(userInputAmount, "userInputAmount");
        Intrinsics.checkNotNullParameter(userInputString, "userInputString");
        this.accountNumber = accountNumber;
        this.entryPoint = entryPoint;
        this.taxYear = year;
        this.isInEditMode = z;
        this.accounts = list;
        this.sourceAccount = transferAccount;
        this.sinkAccount = transferAccount2;
        this.frequency = frequency;
        this.canShowFrequencyRow = z2;
        this.portfolio = portfolio;
        this.unifiedBalances = unifiedBalances;
        this.areMarketsOpenExtended = z3;
        this.isContributionRequestLoading = z4;
        this.transferDataToRefId = transferDataToRefId;
        this.showEnokiCelebration = z5;
        this.userInputAmount = userInputAmount;
        this.userInputString = userInputString;
        this.screenInfo = apiRetirementContributionsResponse;
        this.hasApiError = z6;
        this.overrideNoEnokiAlert = z7;
        this.isInInterEntityMatchExperiment = z8;
        this.matchRate = retirementMatchRate;
        this.passedInMatchTypeOverride = apiRetirementMatchResponse3;
        this.shouldContinueInsteadOfSubmit = z9;
        this.reviewCanGoToMatchRateSelection = z10;
        this.goldMatchSelectionRow = apiGoldMatchSelectionRow;
        this.goldMatchSelectionRowSelected = z11;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final Year getTaxYear() {
        return this.taxYear;
    }

    public final boolean isInEditMode() {
        return this.isInEditMode;
    }

    public final List<TransferAccount> getAccounts() {
        return this.accounts;
    }

    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CreateRetirementContributionDataState(java.lang.String r32, com.robinhood.rosetta.eventlogging.MAXTransferContext.EntryPoint r33, p479j$.time.Year r34, boolean r35, java.util.List r36, com.robinhood.models.p320db.bonfire.TransferAccount r37, com.robinhood.models.p320db.bonfire.TransferAccount r38, com.robinhood.models.api.bonfire.ApiCreateTransferRequest2 r39, boolean r40, com.robinhood.models.p320db.Portfolio r41, com.robinhood.models.crypto.p314db.UnifiedBalances r42, boolean r43, boolean r44, java.util.Map r45, boolean r46, java.math.BigDecimal r47, java.lang.String r48, com.robinhood.android.models.retirement.api.contributions.ApiRetirementContributionsResponse r49, boolean r50, boolean r51, boolean r52, com.robinhood.android.models.retirement.p194db.RetirementMatchRate r53, com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3 r54, boolean r55, boolean r56, com.robinhood.android.models.retirement.api.contributions.ApiGoldMatchSelectionRow r57, boolean r58, int r59, kotlin.jvm.internal.DefaultConstructorMarker r60) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionDataState.<init>(java.lang.String, com.robinhood.rosetta.eventlogging.MAXTransferContext$EntryPoint, j$.time.Year, boolean, java.util.List, com.robinhood.models.db.bonfire.TransferAccount, com.robinhood.models.db.bonfire.TransferAccount, com.robinhood.models.api.bonfire.TransferFrequency, boolean, com.robinhood.models.db.Portfolio, com.robinhood.models.crypto.db.UnifiedBalances, boolean, boolean, java.util.Map, boolean, java.math.BigDecimal, java.lang.String, com.robinhood.android.models.retirement.api.contributions.ApiRetirementContributionsResponse, boolean, boolean, boolean, com.robinhood.android.models.retirement.db.RetirementMatchRate, com.robinhood.android.models.retirement.api.MatchBreakdownType, boolean, boolean, com.robinhood.android.models.retirement.api.contributions.ApiGoldMatchSelectionRow, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public final boolean getCanShowFrequencyRow() {
        return this.canShowFrequencyRow;
    }

    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    public final boolean getAreMarketsOpenExtended() {
        return this.areMarketsOpenExtended;
    }

    public final boolean isContributionRequestLoading() {
        return this.isContributionRequestLoading;
    }

    public final Map<TransferData, UUID> getTransferDataToRefId() {
        return this.transferDataToRefId;
    }

    public final boolean getShowEnokiCelebration() {
        return this.showEnokiCelebration;
    }

    public final BigDecimal getUserInputAmount() {
        return this.userInputAmount;
    }

    public final String getUserInputString() {
        return this.userInputString;
    }

    public final ApiRetirementContributionsResponse getScreenInfo() {
        return this.screenInfo;
    }

    public final boolean getHasApiError() {
        return this.hasApiError;
    }

    public final boolean getOverrideNoEnokiAlert() {
        return this.overrideNoEnokiAlert;
    }

    public final boolean isInInterEntityMatchExperiment() {
        return this.isInInterEntityMatchExperiment;
    }

    public final RetirementMatchRate getMatchRate() {
        return this.matchRate;
    }

    public final ApiRetirementMatchResponse3 getPassedInMatchTypeOverride() {
        return this.passedInMatchTypeOverride;
    }

    public final boolean getShouldContinueInsteadOfSubmit() {
        return this.shouldContinueInsteadOfSubmit;
    }

    public final ApiGoldMatchSelectionRow getGoldMatchSelectionRow() {
        return this.goldMatchSelectionRow;
    }

    public final boolean getGoldMatchSelectionRowSelected() {
        return this.goldMatchSelectionRowSelected;
    }

    public final boolean getSinkAccountIsManaged() {
        ManagementInfo managementInfo;
        TransferAccount transferAccount = this.sinkAccount;
        return ((transferAccount == null || (managementInfo = transferAccount.getManagementInfo()) == null) ? null : managementInfo.getManagement_type()) == ManagementType.MANAGED;
    }

    public final boolean getReviewShouldLaunchMatchRateSelection() {
        return this.reviewCanGoToMatchRateSelection && !getSinkAccountIsManaged();
    }

    public final ApiRetirementMatchResponse3 getEffectiveMatchRateOverride() {
        if (getSinkAccountIsManaged()) {
            return null;
        }
        ApiRetirementMatchResponse3 apiRetirementMatchResponse3 = this.passedInMatchTypeOverride;
        if (apiRetirementMatchResponse3 != null) {
            return apiRetirementMatchResponse3;
        }
        if (this.goldMatchSelectionRowSelected) {
            return ApiRetirementMatchResponse3.GOLD;
        }
        return null;
    }
}
