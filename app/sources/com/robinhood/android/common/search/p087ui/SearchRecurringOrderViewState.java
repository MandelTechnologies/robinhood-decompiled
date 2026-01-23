package com.robinhood.android.common.search.p087ui;

import android.content.res.Resources;
import com.robinhood.android.common.search.C11798R;
import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.common.search.p087ui.models.SearchRecurringTopContent;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.search.extensions.SearchResponses;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.p320db.bonfire.ListDisclosure;
import com.robinhood.models.p355ui.InstrumentPosition;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.store.search.SearchStore3;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SearchRecurringOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0086\u0001\u0087\u0001BË\u0002\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\u0006\u0010'\u001a\u00020\b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020M0\u00122\u0006\u0010V\u001a\u00020WJ\u000e\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020WJ\u000e\u0010[\u001a\u00020Y2\u0006\u0010Z\u001a\u00020WJ$\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\u00122\u0006\u0010Z\u001a\u00020W2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020M0\u0012H\u0002J$\u0010_\u001a\b\u0012\u0004\u0012\u00020]0\u00122\u0006\u0010Z\u001a\u00020W2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020M0\u0012H\u0002J$\u0010`\u001a\b\u0012\u0004\u0012\u00020]0\u00122\u0006\u0010Z\u001a\u00020W2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020M0\u0012H\u0002J\u000e\u0010a\u001a\u00020&2\u0006\u0010Z\u001a\u00020WJ\u000e\u0010b\u001a\u00020M2\u0006\u0010Z\u001a\u00020WJ\u000e\u0010c\u001a\u00020&2\u0006\u0010Z\u001a\u00020WJ\u0006\u0010d\u001a\u00020eJ\u0006\u0010f\u001a\u00020eJ\u0006\u0010g\u001a\u00020eJ\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010k\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\t\u0010m\u001a\u00020\bHÆ\u0003J\t\u0010n\u001a\u00020\bHÆ\u0003J\t\u0010o\u001a\u00020\bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010s\u001a\u00020\bHÆ\u0003J\t\u0010t\u001a\u00020\bHÂ\u0003J\u000f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012HÂ\u0003J\u000f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012HÂ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u001dHÂ\u0003J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012HÂ\u0003J\u000f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012HÂ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\"HÂ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010$HÂ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010&HÂ\u0003J\t\u0010}\u001a\u00020\bHÂ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010)HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010+HÆ\u0003JÐ\u0002\u0010\u0080\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+HÆ\u0001J\u0015\u0010\u0081\u0001\u001a\u00020\b2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0083\u0001\u001a\u00030\u0084\u0001HÖ\u0001J\n\u0010\u0085\u0001\u001a\u00020&HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010(\u001a\u0004\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010*\u001a\u0004\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bD\u0010E\u001a\u0004\bF\u00105R\u0011\u0010G\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bH\u00105R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u0012¢\u0006\b\n\u0000\u001a\u0004\bK\u0010;R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010O\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bP\u00105R\u0011\u0010Q\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bR\u00105R\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020M0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010T\u001a\b\u0012\u0004\u0012\u00020M0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0088\u0001"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/SearchRecurringOrderViewState;", "", "searchFailedEvent", "Lcom/robinhood/udf/UiEvent;", "", "requestEditFocus", "", "showProgressBarEvent", "", "enableSuggestedViewEvent", "searchItemClickEvent", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderViewState$SearchItemClickEventResult;", "showCryptoArg", "showSeparateEtfHoldingsArg", "showTopRecurringListArg", "topRecurringCuratedList", "Lcom/robinhood/models/db/CuratedList;", "topRecurringListItems", "", "Lcom/robinhood/models/db/CuratedListItem;", "listDisclosure", "Lcom/robinhood/models/db/bonfire/ListDisclosure;", "disclaimerExpanded", "inTopRecurringListExperiment", "instrumentPositions", "Lcom/robinhood/models/ui/InstrumentPosition;", "cryptoHoldings", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "searchResult", "Lcom/robinhood/store/search/SearchResult;", "searchResultPositions", "Lcom/robinhood/models/db/Position;", "searchResultCryptoHoldings", "account", "Lcom/robinhood/models/db/Account;", "learnMoreString", "", "learnMoreBtnString", "", "isForPaycheckRecurringInvestments", "topContent", "Lcom/robinhood/android/common/search/ui/models/SearchRecurringTopContent;", "sweepsInterestRate", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZZLcom/robinhood/models/db/CuratedList;Ljava/util/List;Lcom/robinhood/models/db/bonfire/ListDisclosure;ZZLjava/util/List;Ljava/util/List;Lcom/robinhood/store/search/SearchResult;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/db/Account;Ljava/lang/CharSequence;Ljava/lang/String;ZLcom/robinhood/android/common/search/ui/models/SearchRecurringTopContent;Ljava/math/BigDecimal;)V", "getSearchFailedEvent", "()Lcom/robinhood/udf/UiEvent;", "getRequestEditFocus", "getShowProgressBarEvent", "getEnableSuggestedViewEvent", "getSearchItemClickEvent", "getShowCryptoArg", "()Z", "getShowSeparateEtfHoldingsArg", "getShowTopRecurringListArg", "getTopRecurringCuratedList", "()Lcom/robinhood/models/db/CuratedList;", "getTopRecurringListItems", "()Ljava/util/List;", "getListDisclosure", "()Lcom/robinhood/models/db/bonfire/ListDisclosure;", "getDisclaimerExpanded", "getTopContent", "()Lcom/robinhood/android/common/search/ui/models/SearchRecurringTopContent;", "getSweepsInterestRate", "()Ljava/math/BigDecimal;", "showCryptoAssets", "getShowCryptoAssets$annotations", "()V", "getShowCryptoAssets", "showTopRecurringList", "getShowTopRecurringList", "topRecurringListUuids", "Ljava/util/UUID;", "getTopRecurringListUuids", "userInstrumentPositionsSearchItems", "Lcom/robinhood/android/common/search/SearchItem;", "userCryptoHoldingsSearchItems", "showChipsViewInstrument", "getShowChipsViewInstrument", "showChipsViewCrypto", "getShowChipsViewCrypto", "disclaimerSearchItem", "topContentList", "searchItems", "resources", "Landroid/content/res/Resources;", "getChipsViewDataInstrument", "Lcom/robinhood/android/common/search/ui/RecurringChipsViewData;", "res", "getChipsViewDataCrypto", "getSearchHeaderCrypto", "Lcom/robinhood/android/common/search/SearchItem$SearchHeader;", "items", "getSearchHeaderStock", "getSearchHeaderEtf", "getRecurringSearchInputEditHint", "getEquityHeader", "getEquityHeaderString", "getCryptoHeader", "Lcom/robinhood/android/common/search/SearchItem$SearchHeaderWithIcon;", "getStockHeader", "getEtfHeader", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "other", "hashCode", "", "toString", "SearchItemClickEventResult", "Companion", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class SearchRecurringOrderViewState {
    private static final String APY_PLACEHOLDER = "{{ .INTEREST_APY }}";
    private final Account account;
    private final List<UiCryptoHolding> cryptoHoldings;
    private final boolean disclaimerExpanded;
    private final List<SearchItem> disclaimerSearchItem;
    private final UiEvent<Boolean> enableSuggestedViewEvent;
    private final boolean inTopRecurringListExperiment;
    private final List<InstrumentPosition> instrumentPositions;
    private final boolean isForPaycheckRecurringInvestments;
    private final String learnMoreBtnString;
    private final CharSequence learnMoreString;
    private final ListDisclosure listDisclosure;
    private final UiEvent<Unit> requestEditFocus;
    private final UiEvent<Throwable> searchFailedEvent;
    private final UiEvent<SearchItemClickEventResult> searchItemClickEvent;
    private final SearchStore3 searchResult;
    private final List<UiCryptoHolding> searchResultCryptoHoldings;
    private final List<Position> searchResultPositions;
    private final boolean showChipsViewCrypto;
    private final boolean showChipsViewInstrument;
    private final boolean showCryptoArg;
    private final UiEvent<Boolean> showProgressBarEvent;
    private final boolean showSeparateEtfHoldingsArg;
    private final boolean showTopRecurringListArg;
    private final BigDecimal sweepsInterestRate;
    private final SearchRecurringTopContent topContent;
    private final List<SearchItem> topContentList;
    private final CuratedList topRecurringCuratedList;
    private final List<CuratedListItem> topRecurringListItems;
    private final List<UUID> topRecurringListUuids;
    private final List<SearchItem> userCryptoHoldingsSearchItems;
    private final List<SearchItem> userInstrumentPositionsSearchItems;
    public static final int $stable = 8;

    /* renamed from: component13, reason: from getter */
    private final boolean getInTopRecurringListExperiment() {
        return this.inTopRecurringListExperiment;
    }

    private final List<InstrumentPosition> component14() {
        return this.instrumentPositions;
    }

    private final List<UiCryptoHolding> component15() {
        return this.cryptoHoldings;
    }

    /* renamed from: component16, reason: from getter */
    private final SearchStore3 getSearchResult() {
        return this.searchResult;
    }

    private final List<Position> component17() {
        return this.searchResultPositions;
    }

    private final List<UiCryptoHolding> component18() {
        return this.searchResultCryptoHoldings;
    }

    /* renamed from: component19, reason: from getter */
    private final Account getAccount() {
        return this.account;
    }

    /* renamed from: component20, reason: from getter */
    private final CharSequence getLearnMoreString() {
        return this.learnMoreString;
    }

    /* renamed from: component21, reason: from getter */
    private final String getLearnMoreBtnString() {
        return this.learnMoreBtnString;
    }

    /* renamed from: component22, reason: from getter */
    private final boolean getIsForPaycheckRecurringInvestments() {
        return this.isForPaycheckRecurringInvestments;
    }

    public static /* synthetic */ SearchRecurringOrderViewState copy$default(SearchRecurringOrderViewState searchRecurringOrderViewState, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, boolean z, boolean z2, boolean z3, CuratedList curatedList, List list, ListDisclosure listDisclosure, boolean z4, boolean z5, List list2, List list3, SearchStore3 searchStore3, List list4, List list5, Account account, CharSequence charSequence, String str, boolean z6, SearchRecurringTopContent searchRecurringTopContent, BigDecimal bigDecimal, int i, Object obj) {
        BigDecimal bigDecimal2;
        SearchRecurringTopContent searchRecurringTopContent2;
        UiEvent uiEvent6 = (i & 1) != 0 ? searchRecurringOrderViewState.searchFailedEvent : uiEvent;
        UiEvent uiEvent7 = (i & 2) != 0 ? searchRecurringOrderViewState.requestEditFocus : uiEvent2;
        UiEvent uiEvent8 = (i & 4) != 0 ? searchRecurringOrderViewState.showProgressBarEvent : uiEvent3;
        UiEvent uiEvent9 = (i & 8) != 0 ? searchRecurringOrderViewState.enableSuggestedViewEvent : uiEvent4;
        UiEvent uiEvent10 = (i & 16) != 0 ? searchRecurringOrderViewState.searchItemClickEvent : uiEvent5;
        boolean z7 = (i & 32) != 0 ? searchRecurringOrderViewState.showCryptoArg : z;
        boolean z8 = (i & 64) != 0 ? searchRecurringOrderViewState.showSeparateEtfHoldingsArg : z2;
        boolean z9 = (i & 128) != 0 ? searchRecurringOrderViewState.showTopRecurringListArg : z3;
        CuratedList curatedList2 = (i & 256) != 0 ? searchRecurringOrderViewState.topRecurringCuratedList : curatedList;
        List list6 = (i & 512) != 0 ? searchRecurringOrderViewState.topRecurringListItems : list;
        ListDisclosure listDisclosure2 = (i & 1024) != 0 ? searchRecurringOrderViewState.listDisclosure : listDisclosure;
        boolean z10 = (i & 2048) != 0 ? searchRecurringOrderViewState.disclaimerExpanded : z4;
        boolean z11 = (i & 4096) != 0 ? searchRecurringOrderViewState.inTopRecurringListExperiment : z5;
        List list7 = (i & 8192) != 0 ? searchRecurringOrderViewState.instrumentPositions : list2;
        UiEvent uiEvent11 = uiEvent6;
        List list8 = (i & 16384) != 0 ? searchRecurringOrderViewState.cryptoHoldings : list3;
        SearchStore3 searchStore32 = (i & 32768) != 0 ? searchRecurringOrderViewState.searchResult : searchStore3;
        List list9 = (i & 65536) != 0 ? searchRecurringOrderViewState.searchResultPositions : list4;
        List list10 = (i & 131072) != 0 ? searchRecurringOrderViewState.searchResultCryptoHoldings : list5;
        Account account2 = (i & 262144) != 0 ? searchRecurringOrderViewState.account : account;
        CharSequence charSequence2 = (i & 524288) != 0 ? searchRecurringOrderViewState.learnMoreString : charSequence;
        String str2 = (i & 1048576) != 0 ? searchRecurringOrderViewState.learnMoreBtnString : str;
        boolean z12 = (i & 2097152) != 0 ? searchRecurringOrderViewState.isForPaycheckRecurringInvestments : z6;
        SearchRecurringTopContent searchRecurringTopContent3 = (i & 4194304) != 0 ? searchRecurringOrderViewState.topContent : searchRecurringTopContent;
        if ((i & 8388608) != 0) {
            searchRecurringTopContent2 = searchRecurringTopContent3;
            bigDecimal2 = searchRecurringOrderViewState.sweepsInterestRate;
        } else {
            bigDecimal2 = bigDecimal;
            searchRecurringTopContent2 = searchRecurringTopContent3;
        }
        return searchRecurringOrderViewState.copy(uiEvent11, uiEvent7, uiEvent8, uiEvent9, uiEvent10, z7, z8, z9, curatedList2, list6, listDisclosure2, z10, z11, list7, list8, searchStore32, list9, list10, account2, charSequence2, str2, z12, searchRecurringTopContent2, bigDecimal2);
    }

    public static /* synthetic */ void getShowCryptoAssets$annotations() {
    }

    public final UiEvent<Throwable> component1() {
        return this.searchFailedEvent;
    }

    public final List<CuratedListItem> component10() {
        return this.topRecurringListItems;
    }

    /* renamed from: component11, reason: from getter */
    public final ListDisclosure getListDisclosure() {
        return this.listDisclosure;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getDisclaimerExpanded() {
        return this.disclaimerExpanded;
    }

    public final UiEvent<Unit> component2() {
        return this.requestEditFocus;
    }

    /* renamed from: component23, reason: from getter */
    public final SearchRecurringTopContent getTopContent() {
        return this.topContent;
    }

    /* renamed from: component24, reason: from getter */
    public final BigDecimal getSweepsInterestRate() {
        return this.sweepsInterestRate;
    }

    public final UiEvent<Boolean> component3() {
        return this.showProgressBarEvent;
    }

    public final UiEvent<Boolean> component4() {
        return this.enableSuggestedViewEvent;
    }

    public final UiEvent<SearchItemClickEventResult> component5() {
        return this.searchItemClickEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowCryptoArg() {
        return this.showCryptoArg;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowSeparateEtfHoldingsArg() {
        return this.showSeparateEtfHoldingsArg;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowTopRecurringListArg() {
        return this.showTopRecurringListArg;
    }

    /* renamed from: component9, reason: from getter */
    public final CuratedList getTopRecurringCuratedList() {
        return this.topRecurringCuratedList;
    }

    public final SearchRecurringOrderViewState copy(UiEvent<Throwable> searchFailedEvent, UiEvent<Unit> requestEditFocus, UiEvent<Boolean> showProgressBarEvent, UiEvent<Boolean> enableSuggestedViewEvent, UiEvent<SearchItemClickEventResult> searchItemClickEvent, boolean showCryptoArg, boolean showSeparateEtfHoldingsArg, boolean showTopRecurringListArg, CuratedList topRecurringCuratedList, List<CuratedListItem> topRecurringListItems, ListDisclosure listDisclosure, boolean disclaimerExpanded, boolean inTopRecurringListExperiment, List<InstrumentPosition> instrumentPositions, List<UiCryptoHolding> cryptoHoldings, SearchStore3 searchResult, List<Position> searchResultPositions, List<UiCryptoHolding> searchResultCryptoHoldings, Account account, CharSequence learnMoreString, String learnMoreBtnString, boolean isForPaycheckRecurringInvestments, SearchRecurringTopContent topContent, BigDecimal sweepsInterestRate) {
        Intrinsics.checkNotNullParameter(topRecurringListItems, "topRecurringListItems");
        Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
        Intrinsics.checkNotNullParameter(cryptoHoldings, "cryptoHoldings");
        Intrinsics.checkNotNullParameter(searchResultPositions, "searchResultPositions");
        Intrinsics.checkNotNullParameter(searchResultCryptoHoldings, "searchResultCryptoHoldings");
        return new SearchRecurringOrderViewState(searchFailedEvent, requestEditFocus, showProgressBarEvent, enableSuggestedViewEvent, searchItemClickEvent, showCryptoArg, showSeparateEtfHoldingsArg, showTopRecurringListArg, topRecurringCuratedList, topRecurringListItems, listDisclosure, disclaimerExpanded, inTopRecurringListExperiment, instrumentPositions, cryptoHoldings, searchResult, searchResultPositions, searchResultCryptoHoldings, account, learnMoreString, learnMoreBtnString, isForPaycheckRecurringInvestments, topContent, sweepsInterestRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchRecurringOrderViewState)) {
            return false;
        }
        SearchRecurringOrderViewState searchRecurringOrderViewState = (SearchRecurringOrderViewState) other;
        return Intrinsics.areEqual(this.searchFailedEvent, searchRecurringOrderViewState.searchFailedEvent) && Intrinsics.areEqual(this.requestEditFocus, searchRecurringOrderViewState.requestEditFocus) && Intrinsics.areEqual(this.showProgressBarEvent, searchRecurringOrderViewState.showProgressBarEvent) && Intrinsics.areEqual(this.enableSuggestedViewEvent, searchRecurringOrderViewState.enableSuggestedViewEvent) && Intrinsics.areEqual(this.searchItemClickEvent, searchRecurringOrderViewState.searchItemClickEvent) && this.showCryptoArg == searchRecurringOrderViewState.showCryptoArg && this.showSeparateEtfHoldingsArg == searchRecurringOrderViewState.showSeparateEtfHoldingsArg && this.showTopRecurringListArg == searchRecurringOrderViewState.showTopRecurringListArg && Intrinsics.areEqual(this.topRecurringCuratedList, searchRecurringOrderViewState.topRecurringCuratedList) && Intrinsics.areEqual(this.topRecurringListItems, searchRecurringOrderViewState.topRecurringListItems) && Intrinsics.areEqual(this.listDisclosure, searchRecurringOrderViewState.listDisclosure) && this.disclaimerExpanded == searchRecurringOrderViewState.disclaimerExpanded && this.inTopRecurringListExperiment == searchRecurringOrderViewState.inTopRecurringListExperiment && Intrinsics.areEqual(this.instrumentPositions, searchRecurringOrderViewState.instrumentPositions) && Intrinsics.areEqual(this.cryptoHoldings, searchRecurringOrderViewState.cryptoHoldings) && Intrinsics.areEqual(this.searchResult, searchRecurringOrderViewState.searchResult) && Intrinsics.areEqual(this.searchResultPositions, searchRecurringOrderViewState.searchResultPositions) && Intrinsics.areEqual(this.searchResultCryptoHoldings, searchRecurringOrderViewState.searchResultCryptoHoldings) && Intrinsics.areEqual(this.account, searchRecurringOrderViewState.account) && Intrinsics.areEqual(this.learnMoreString, searchRecurringOrderViewState.learnMoreString) && Intrinsics.areEqual(this.learnMoreBtnString, searchRecurringOrderViewState.learnMoreBtnString) && this.isForPaycheckRecurringInvestments == searchRecurringOrderViewState.isForPaycheckRecurringInvestments && Intrinsics.areEqual(this.topContent, searchRecurringOrderViewState.topContent) && Intrinsics.areEqual(this.sweepsInterestRate, searchRecurringOrderViewState.sweepsInterestRate);
    }

    public int hashCode() {
        UiEvent<Throwable> uiEvent = this.searchFailedEvent;
        int iHashCode = (uiEvent == null ? 0 : uiEvent.hashCode()) * 31;
        UiEvent<Unit> uiEvent2 = this.requestEditFocus;
        int iHashCode2 = (iHashCode + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Boolean> uiEvent3 = this.showProgressBarEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Boolean> uiEvent4 = this.enableSuggestedViewEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<SearchItemClickEventResult> uiEvent5 = this.searchItemClickEvent;
        int iHashCode5 = (((((((iHashCode4 + (uiEvent5 == null ? 0 : uiEvent5.hashCode())) * 31) + Boolean.hashCode(this.showCryptoArg)) * 31) + Boolean.hashCode(this.showSeparateEtfHoldingsArg)) * 31) + Boolean.hashCode(this.showTopRecurringListArg)) * 31;
        CuratedList curatedList = this.topRecurringCuratedList;
        int iHashCode6 = (((iHashCode5 + (curatedList == null ? 0 : curatedList.hashCode())) * 31) + this.topRecurringListItems.hashCode()) * 31;
        ListDisclosure listDisclosure = this.listDisclosure;
        int iHashCode7 = (((((((((iHashCode6 + (listDisclosure == null ? 0 : listDisclosure.hashCode())) * 31) + Boolean.hashCode(this.disclaimerExpanded)) * 31) + Boolean.hashCode(this.inTopRecurringListExperiment)) * 31) + this.instrumentPositions.hashCode()) * 31) + this.cryptoHoldings.hashCode()) * 31;
        SearchStore3 searchStore3 = this.searchResult;
        int iHashCode8 = (((((iHashCode7 + (searchStore3 == null ? 0 : searchStore3.hashCode())) * 31) + this.searchResultPositions.hashCode()) * 31) + this.searchResultCryptoHoldings.hashCode()) * 31;
        Account account = this.account;
        int iHashCode9 = (iHashCode8 + (account == null ? 0 : account.hashCode())) * 31;
        CharSequence charSequence = this.learnMoreString;
        int iHashCode10 = (iHashCode9 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.learnMoreBtnString;
        int iHashCode11 = (((iHashCode10 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isForPaycheckRecurringInvestments)) * 31;
        SearchRecurringTopContent searchRecurringTopContent = this.topContent;
        int iHashCode12 = (iHashCode11 + (searchRecurringTopContent == null ? 0 : searchRecurringTopContent.hashCode())) * 31;
        BigDecimal bigDecimal = this.sweepsInterestRate;
        return iHashCode12 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public String toString() {
        UiEvent<Throwable> uiEvent = this.searchFailedEvent;
        UiEvent<Unit> uiEvent2 = this.requestEditFocus;
        UiEvent<Boolean> uiEvent3 = this.showProgressBarEvent;
        UiEvent<Boolean> uiEvent4 = this.enableSuggestedViewEvent;
        UiEvent<SearchItemClickEventResult> uiEvent5 = this.searchItemClickEvent;
        boolean z = this.showCryptoArg;
        boolean z2 = this.showSeparateEtfHoldingsArg;
        boolean z3 = this.showTopRecurringListArg;
        CuratedList curatedList = this.topRecurringCuratedList;
        List<CuratedListItem> list = this.topRecurringListItems;
        ListDisclosure listDisclosure = this.listDisclosure;
        boolean z4 = this.disclaimerExpanded;
        boolean z5 = this.inTopRecurringListExperiment;
        List<InstrumentPosition> list2 = this.instrumentPositions;
        List<UiCryptoHolding> list3 = this.cryptoHoldings;
        SearchStore3 searchStore3 = this.searchResult;
        List<Position> list4 = this.searchResultPositions;
        List<UiCryptoHolding> list5 = this.searchResultCryptoHoldings;
        Account account = this.account;
        CharSequence charSequence = this.learnMoreString;
        return "SearchRecurringOrderViewState(searchFailedEvent=" + uiEvent + ", requestEditFocus=" + uiEvent2 + ", showProgressBarEvent=" + uiEvent3 + ", enableSuggestedViewEvent=" + uiEvent4 + ", searchItemClickEvent=" + uiEvent5 + ", showCryptoArg=" + z + ", showSeparateEtfHoldingsArg=" + z2 + ", showTopRecurringListArg=" + z3 + ", topRecurringCuratedList=" + curatedList + ", topRecurringListItems=" + list + ", listDisclosure=" + listDisclosure + ", disclaimerExpanded=" + z4 + ", inTopRecurringListExperiment=" + z5 + ", instrumentPositions=" + list2 + ", cryptoHoldings=" + list3 + ", searchResult=" + searchStore3 + ", searchResultPositions=" + list4 + ", searchResultCryptoHoldings=" + list5 + ", account=" + account + ", learnMoreString=" + ((Object) charSequence) + ", learnMoreBtnString=" + this.learnMoreBtnString + ", isForPaycheckRecurringInvestments=" + this.isForPaycheckRecurringInvestments + ", topContent=" + this.topContent + ", sweepsInterestRate=" + this.sweepsInterestRate + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchRecurringOrderViewState(UiEvent<Throwable> uiEvent, UiEvent<Unit> uiEvent2, UiEvent<Boolean> uiEvent3, UiEvent<Boolean> uiEvent4, UiEvent<SearchItemClickEventResult> uiEvent5, boolean z, boolean z2, boolean z3, CuratedList curatedList, List<CuratedListItem> topRecurringListItems, ListDisclosure listDisclosure, boolean z4, boolean z5, List<InstrumentPosition> instrumentPositions, List<UiCryptoHolding> cryptoHoldings, SearchStore3 searchStore3, List<Position> searchResultPositions, List<UiCryptoHolding> searchResultCryptoHoldings, Account account, CharSequence charSequence, String str, boolean z6, SearchRecurringTopContent searchRecurringTopContent, BigDecimal bigDecimal) {
        List<SearchItem> listEmptyList;
        List<SearchItem> listEmptyList2;
        Intrinsics.checkNotNullParameter(topRecurringListItems, "topRecurringListItems");
        Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
        Intrinsics.checkNotNullParameter(cryptoHoldings, "cryptoHoldings");
        Intrinsics.checkNotNullParameter(searchResultPositions, "searchResultPositions");
        Intrinsics.checkNotNullParameter(searchResultCryptoHoldings, "searchResultCryptoHoldings");
        this.searchFailedEvent = uiEvent;
        this.requestEditFocus = uiEvent2;
        this.showProgressBarEvent = uiEvent3;
        this.enableSuggestedViewEvent = uiEvent4;
        this.searchItemClickEvent = uiEvent5;
        this.showCryptoArg = z;
        this.showSeparateEtfHoldingsArg = z2;
        this.showTopRecurringListArg = z3;
        this.topRecurringCuratedList = curatedList;
        this.topRecurringListItems = topRecurringListItems;
        this.listDisclosure = listDisclosure;
        this.disclaimerExpanded = z4;
        this.inTopRecurringListExperiment = z5;
        this.instrumentPositions = instrumentPositions;
        this.cryptoHoldings = cryptoHoldings;
        this.searchResult = searchStore3;
        this.searchResultPositions = searchResultPositions;
        this.searchResultCryptoHoldings = searchResultCryptoHoldings;
        this.account = account;
        this.learnMoreString = charSequence;
        this.learnMoreBtnString = str;
        this.isForPaycheckRecurringInvestments = z6;
        this.topContent = searchRecurringTopContent;
        this.sweepsInterestRate = bigDecimal;
        List<CuratedListItem> list = topRecurringListItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CuratedListItem) it.next()).getId());
        }
        this.topRecurringListUuids = arrayList;
        List<InstrumentPosition> list2 = this.instrumentPositions;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (InstrumentPosition instrumentPosition : list2) {
            Position position = instrumentPosition.getPosition();
            arrayList2.add(position == null ? new SearchItem.InstrumentResult(instrumentPosition.getInstrument(), instrumentPosition.getInstrument().getCanBuyFractional(), false, 4, null) : new SearchItem.InstrumentPositionResult(instrumentPosition.getInstrument(), position, instrumentPosition.getInstrument().getCanBuyFractional(), false, 8, null));
        }
        this.userInstrumentPositionsSearchItems = arrayList2;
        List<UiCryptoHolding> list3 = this.cryptoHoldings;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (UiCryptoHolding uiCryptoHolding : list3) {
            arrayList3.add(new SearchItem.CryptoHoldingResult(uiCryptoHolding.getCurrencyPairId(), uiCryptoHolding.getCurrency(), uiCryptoHolding.getQuantity()));
        }
        this.userCryptoHoldingsSearchItems = arrayList3;
        this.showChipsViewInstrument = getShowTopRecurringList() && !this.userInstrumentPositionsSearchItems.isEmpty();
        this.showChipsViewCrypto = getShowTopRecurringList() && !arrayList3.isEmpty();
        if (this.learnMoreString != null && this.learnMoreBtnString != null) {
            listEmptyList = CollectionsKt.listOf(new SearchItem.SearchLearnMoreRow(this.learnMoreString, this.learnMoreBtnString));
        } else if (this.isForPaycheckRecurringInvestments) {
            listEmptyList = CollectionsKt.listOf(this.disclaimerExpanded ? new SearchItem.Disclaimer(C32428R.string.paycheck_investment_schedule_long_disclaimer, C32428R.string.investment_schedule_disclaimer_button_collapse) : new SearchItem.Disclaimer(C32428R.string.paycheck_investment_schedule_short_disclaimer, C32428R.string.investment_schedule_disclaimer_button_expand));
        } else if (getShowCryptoAssets()) {
            listEmptyList = CollectionsKt.listOf(this.disclaimerExpanded ? new SearchItem.Disclaimer(C32428R.string.investment_schedule_long_disclaimer, C32428R.string.investment_schedule_disclaimer_button_collapse) : new SearchItem.Disclaimer(C32428R.string.investment_schedule_short_disclaimer, C32428R.string.investment_schedule_disclaimer_button_expand));
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.disclaimerSearchItem = listEmptyList;
        if (this.topContent instanceof SearchRecurringTopContent.RoundupBrokerageOption) {
            String brokerageOptionHeader = ((SearchRecurringTopContent.RoundupBrokerageOption) this.topContent).getBrokerageOptionHeader();
            SearchItem.SearchHeader searchHeader = new SearchItem.SearchHeader(brokerageOptionHeader == null ? "" : brokerageOptionHeader);
            String strValueOf = String.valueOf(this.sweepsInterestRate);
            String brokerageOptionTitle = ((SearchRecurringTopContent.RoundupBrokerageOption) this.topContent).getBrokerageOptionTitle();
            if (brokerageOptionTitle != null) {
                String strReplace$default = StringsKt.replace$default(brokerageOptionTitle, "{{ .INTEREST_APY }}", this.sweepsInterestRate + "%", false, 4, (Object) null);
                strReplace$default = strReplace$default == null ? "" : strReplace$default;
                String brokerageOptionContent = ((SearchRecurringTopContent.RoundupBrokerageOption) this.topContent).getBrokerageOptionContent();
                listEmptyList2 = CollectionsKt.listOf((Object[]) new SearchItem[]{searchHeader, new SearchItem.RurSavingsChoice(strValueOf, strReplace$default, brokerageOptionContent != null ? brokerageOptionContent : "")});
            }
        } else {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        this.topContentList = listEmptyList2;
    }

    public final UiEvent<Throwable> getSearchFailedEvent() {
        return this.searchFailedEvent;
    }

    public final UiEvent<Unit> getRequestEditFocus() {
        return this.requestEditFocus;
    }

    public final UiEvent<Boolean> getShowProgressBarEvent() {
        return this.showProgressBarEvent;
    }

    public final UiEvent<Boolean> getEnableSuggestedViewEvent() {
        return this.enableSuggestedViewEvent;
    }

    public final UiEvent<SearchItemClickEventResult> getSearchItemClickEvent() {
        return this.searchItemClickEvent;
    }

    public final boolean getShowCryptoArg() {
        return this.showCryptoArg;
    }

    public final boolean getShowSeparateEtfHoldingsArg() {
        return this.showSeparateEtfHoldingsArg;
    }

    public final boolean getShowTopRecurringListArg() {
        return this.showTopRecurringListArg;
    }

    public final CuratedList getTopRecurringCuratedList() {
        return this.topRecurringCuratedList;
    }

    public /* synthetic */ SearchRecurringOrderViewState(UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, boolean z, boolean z2, boolean z3, CuratedList curatedList, List list, ListDisclosure listDisclosure, boolean z4, boolean z5, List list2, List list3, SearchStore3 searchStore3, List list4, List list5, Account account, CharSequence charSequence, String str, boolean z6, SearchRecurringTopContent searchRecurringTopContent, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent, (i & 2) != 0 ? null : uiEvent2, (i & 4) != 0 ? null : uiEvent3, (i & 8) != 0 ? null : uiEvent4, (i & 16) != 0 ? null : uiEvent5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? null : curatedList, (i & 512) != 0 ? CollectionsKt.emptyList() : list, (i & 1024) != 0 ? null : listDisclosure, (i & 2048) != 0 ? false : z4, (i & 4096) != 0 ? false : z5, (i & 8192) != 0 ? CollectionsKt.emptyList() : list2, (i & 16384) != 0 ? CollectionsKt.emptyList() : list3, (32768 & i) != 0 ? null : searchStore3, (65536 & i) != 0 ? CollectionsKt.emptyList() : list4, (131072 & i) != 0 ? CollectionsKt.emptyList() : list5, (262144 & i) != 0 ? null : account, (524288 & i) != 0 ? null : charSequence, (1048576 & i) != 0 ? null : str, z6, (4194304 & i) != 0 ? null : searchRecurringTopContent, (i & 8388608) != 0 ? null : bigDecimal);
    }

    public final List<CuratedListItem> getTopRecurringListItems() {
        return this.topRecurringListItems;
    }

    public final ListDisclosure getListDisclosure() {
        return this.listDisclosure;
    }

    public final boolean getDisclaimerExpanded() {
        return this.disclaimerExpanded;
    }

    public final SearchRecurringTopContent getTopContent() {
        return this.topContent;
    }

    public final BigDecimal getSweepsInterestRate() {
        return this.sweepsInterestRate;
    }

    public final boolean getShowCryptoAssets() {
        return this.showCryptoArg;
    }

    public final boolean getShowTopRecurringList() {
        return this.showTopRecurringListArg && this.inTopRecurringListExperiment;
    }

    public final List<UUID> getTopRecurringListUuids() {
        return this.topRecurringListUuids;
    }

    public final boolean getShowChipsViewInstrument() {
        return this.showChipsViewInstrument;
    }

    public final boolean getShowChipsViewCrypto() {
        return this.showChipsViewCrypto;
    }

    public final List<SearchItem> searchItems(Resources resources) {
        List listEmptyList;
        Object next;
        Object next2;
        Instrument instrument;
        Instrument instrument2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        List<SearchItem> list = this.topContentList;
        if (!getShowTopRecurringList() && this.searchResult == null && (!this.userInstrumentPositionsSearchItems.isEmpty() || !this.userCryptoHoldingsSearchItems.isEmpty())) {
            listEmptyList = CollectionsKt.plus((Collection) CollectionsKt.listOf(getEquityHeader(resources)), (Iterable) this.userInstrumentPositionsSearchItems);
            List listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf(getCryptoHeader()), (Iterable) this.userCryptoHoldingsSearchItems);
            List listListOf = CollectionsKt.listOf(getStockHeader());
            List list2 = listEmptyList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                SearchItem searchItem = (SearchItem) obj;
                SearchItem.InstrumentPositionResult instrumentPositionResult = searchItem instanceof SearchItem.InstrumentPositionResult ? (SearchItem.InstrumentPositionResult) searchItem : null;
                if (instrumentPositionResult != null && (instrument2 = instrumentPositionResult.getInstrument()) != null && !instrument2.isEtpOrCef()) {
                    arrayList.add(obj);
                }
            }
            List listPlus2 = CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
            List listListOf2 = CollectionsKt.listOf(getEtfHeader());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                SearchItem searchItem2 = (SearchItem) obj2;
                SearchItem.InstrumentPositionResult instrumentPositionResult2 = searchItem2 instanceof SearchItem.InstrumentPositionResult ? (SearchItem.InstrumentPositionResult) searchItem2 : null;
                if (instrumentPositionResult2 != null && (instrument = instrumentPositionResult2.getInstrument()) != null && instrument.isEtpOrCef()) {
                    arrayList2.add(obj2);
                }
            }
            List listPlus3 = CollectionsKt.plus((Collection) listListOf2, (Iterable) arrayList2);
            if (getShowCryptoAssets() && this.showSeparateEtfHoldingsArg) {
                listEmptyList = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) listPlus, (Iterable) listPlus2), (Iterable) listPlus3);
            } else if (getShowCryptoAssets()) {
                listEmptyList = CollectionsKt.plus((Collection) listPlus, (Iterable) list2);
            } else if (this.showSeparateEtfHoldingsArg) {
                listEmptyList = CollectionsKt.plus((Collection) listPlus2, (Iterable) listPlus3);
            }
        } else if (this.searchResult instanceof SearchStore3.Success) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            List<Instrument> instruments = SearchResponses.getInstruments(((SearchStore3.Success) this.searchResult).getResponses());
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(instruments, 10));
            for (Instrument instrument3 : instruments) {
                Iterator<T> it = this.searchResultPositions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (Intrinsics.areEqual(((Position) next2).getInstrument(), instrument3.getId())) {
                        break;
                    }
                }
                Position position = (Position) next2;
                arrayList5.add(Boolean.valueOf(position == null ? arrayList4.add(new SearchItem.InstrumentResult(instrument3, instrument3.getCanBuyFractional(), false, 4, null)) : arrayList3.add(new SearchItem.InstrumentPositionResult(instrument3, position, instrument3.getCanBuyFractional(), false, 8, null))));
            }
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            List<UiCurrencyPair> currencyPairs = SearchResponses.getCurrencyPairs(((SearchStore3.Success) this.searchResult).getResponses());
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(currencyPairs, 10));
            for (UiCurrencyPair uiCurrencyPair : currencyPairs) {
                Iterator<T> it2 = this.searchResultCryptoHoldings.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.areEqual(((UiCryptoHolding) next).getCurrencyPairSymbol(), uiCurrencyPair.getSymbol())) {
                        break;
                    }
                }
                UiCryptoHolding uiCryptoHolding = (UiCryptoHolding) next;
                arrayList8.add(Boolean.valueOf(uiCryptoHolding == null ? arrayList7.add(new SearchItem.CryptoResult(uiCurrencyPair, false, false, 6, null)) : arrayList6.add(new SearchItem.CryptoHoldingResult(uiCurrencyPair.getId(), uiCryptoHolding.getCurrency(), uiCryptoHolding.getQuantity()))));
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj3 : arrayList4) {
                if (!((SearchItem.InstrumentResult) obj3).getInstrument().isEtpOrCef()) {
                    arrayList9.add(obj3);
                }
            }
            ArrayList arrayList10 = new ArrayList();
            for (Object obj4 : arrayList3) {
                if (!((SearchItem.InstrumentPositionResult) obj4).getInstrument().isEtpOrCef()) {
                    arrayList10.add(obj4);
                }
            }
            ArrayList arrayList11 = new ArrayList();
            for (Object obj5 : arrayList4) {
                if (((SearchItem.InstrumentResult) obj5).getInstrument().isEtpOrCef()) {
                    arrayList11.add(obj5);
                }
            }
            ArrayList arrayList12 = new ArrayList();
            for (Object obj6 : arrayList3) {
                if (((SearchItem.InstrumentPositionResult) obj6).getInstrument().isEtpOrCef()) {
                    arrayList12.add(obj6);
                }
            }
            List listPlus4 = CollectionsKt.plus((Collection) CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderViewState$searchItems$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((SearchItem.InstrumentPositionResult) t2).getPosition().getDisplayQuantity(), ((SearchItem.InstrumentPositionResult) t).getPosition().getDisplayQuantity());
                }
            }), (Iterable) arrayList4);
            List<? extends SearchItem> listPlus5 = CollectionsKt.plus((Collection) CollectionsKt.sortedWith(arrayList6, new Comparator() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderViewState$searchItems$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((SearchItem.CryptoHoldingResult) t2).getQuantity(), ((SearchItem.CryptoHoldingResult) t).getQuantity());
                }
            }), (Iterable) arrayList7);
            List<? extends SearchItem> listPlus6 = CollectionsKt.plus((Collection) CollectionsKt.sortedWith(arrayList10, new Comparator() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderViewState$searchItems$$inlined$sortedByDescending$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((SearchItem.InstrumentPositionResult) t2).getPosition().getDisplayQuantity(), ((SearchItem.InstrumentPositionResult) t).getPosition().getDisplayQuantity());
                }
            }), (Iterable) arrayList9);
            List<? extends SearchItem> listPlus7 = CollectionsKt.plus((Collection) CollectionsKt.sortedWith(arrayList12, new Comparator() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderViewState$searchItems$$inlined$sortedByDescending$4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((SearchItem.InstrumentPositionResult) t2).getPosition().getDisplayQuantity(), ((SearchItem.InstrumentPositionResult) t).getPosition().getDisplayQuantity());
                }
            }), (Iterable) arrayList11);
            listEmptyList = getShowCryptoAssets() ? CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) getSearchHeaderCrypto(resources, listPlus5), (Iterable) listPlus5), (Iterable) getSearchHeaderEtf(resources, listPlus7)), (Iterable) listPlus7), (Iterable) getSearchHeaderStock(resources, listPlus6)), (Iterable) listPlus6) : listPlus4;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.plus((Collection) listEmptyList, (Iterable) this.disclaimerSearchItem));
    }

    public final RecurringChipsViewData getChipsViewDataInstrument(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        return new RecurringChipsViewData(getEquityHeaderString(res), this.userInstrumentPositionsSearchItems);
    }

    public final RecurringChipsViewData getChipsViewDataCrypto(Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        String string2 = res.getString(C11798R.string.search_recurring_user_positions_crypto_header_crypto);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new RecurringChipsViewData(string2, this.userCryptoHoldingsSearchItems);
    }

    private final List<SearchItem.SearchHeader> getSearchHeaderCrypto(Resources res, List<? extends SearchItem> items) throws Resources.NotFoundException {
        if (!items.isEmpty()) {
            String string2 = res.getString(C11798R.string.search_recurring_result_crypto_header);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return CollectionsKt.listOf(new SearchItem.SearchHeader(string2));
        }
        return CollectionsKt.emptyList();
    }

    private final List<SearchItem.SearchHeader> getSearchHeaderStock(Resources res, List<? extends SearchItem> items) throws Resources.NotFoundException {
        if (!items.isEmpty()) {
            String string2 = res.getString(C11798R.string.search_recurring_result_stock_header);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return CollectionsKt.listOf(new SearchItem.SearchHeader(string2));
        }
        return CollectionsKt.emptyList();
    }

    private final List<SearchItem.SearchHeader> getSearchHeaderEtf(Resources res, List<? extends SearchItem> items) throws Resources.NotFoundException {
        if (!items.isEmpty()) {
            String string2 = res.getString(C11798R.string.search_recurring_result_etf_header);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return CollectionsKt.listOf(new SearchItem.SearchHeader(string2));
        }
        return CollectionsKt.emptyList();
    }

    public final String getRecurringSearchInputEditHint(Resources res) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(res, "res");
        if (getShowCryptoAssets()) {
            i = C11798R.string.search_recurring_hint_crypto;
        } else {
            i = C11798R.string.search_recurring_hint;
        }
        String string2 = res.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final SearchItem getEquityHeader(Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        if (getShowCryptoAssets()) {
            return new SearchItem.SearchHeaderWithIcon(C11798R.string.search_recurring_user_positions_equity_header_crypto, C32428R.string.recurring_help_stock_link_url, ServerToBentoAssetMapper2.QUESTION_16, null, 8, null);
        }
        String string2 = res.getString(C11798R.string.search_recurring_user_positions_header);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new SearchItem.SearchHeader(string2);
    }

    public final String getEquityHeaderString(Resources res) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(res, "res");
        if (getShowCryptoAssets()) {
            i = C11798R.string.search_recurring_user_positions_equity_header_crypto;
        } else {
            i = C11798R.string.search_recurring_user_positions_header;
        }
        String string2 = res.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final SearchItem.SearchHeaderWithIcon getCryptoHeader() {
        return new SearchItem.SearchHeaderWithIcon(C11798R.string.search_recurring_user_positions_crypto_header_crypto, C32428R.string.recurring_help_crypto_link_url, ServerToBentoAssetMapper2.QUESTION_16, null, 8, null);
    }

    public final SearchItem.SearchHeaderWithIcon getStockHeader() {
        return new SearchItem.SearchHeaderWithIcon(C11798R.string.search_recurring_user_positions_stock_header, C32428R.string.recurring_help_stock_link_url, ServerToBentoAssetMapper2.QUESTION_16, null, 8, null);
    }

    public final SearchItem.SearchHeaderWithIcon getEtfHeader() {
        return new SearchItem.SearchHeaderWithIcon(C11798R.string.search_recurring_user_positions_etf_header, C32428R.string.recurring_help_etf_link_url, ServerToBentoAssetMapper2.QUESTION_16, null, 8, null);
    }

    /* compiled from: SearchRecurringOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/SearchRecurringOrderViewState$SearchItemClickEventResult;", "", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "recurringTradability", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;)V", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "getRecurringTradability", "()Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SearchItemClickEventResult {
        public static final int $stable = 8;
        private final InvestmentTarget investmentTarget;
        private final InstrumentRecurringTradability recurringTradability;

        public SearchItemClickEventResult(InvestmentTarget investmentTarget, InstrumentRecurringTradability recurringTradability) {
            Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
            Intrinsics.checkNotNullParameter(recurringTradability, "recurringTradability");
            this.investmentTarget = investmentTarget;
            this.recurringTradability = recurringTradability;
        }

        public final InvestmentTarget getInvestmentTarget() {
            return this.investmentTarget;
        }

        public final InstrumentRecurringTradability getRecurringTradability() {
            return this.recurringTradability;
        }
    }
}
