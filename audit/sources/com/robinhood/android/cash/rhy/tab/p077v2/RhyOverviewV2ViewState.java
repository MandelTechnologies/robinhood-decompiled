package com.robinhood.android.cash.rhy.tab.p077v2;

import androidx.paging.Pager;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.banner.RhyOverviewBannerState;
import com.robinhood.android.models.matcha.api.ApiMatchaTreatment;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.rhyrewards.p246ui.CashCardOffer;
import com.robinhood.android.rhyrewards.p246ui.CashCardOffer2;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsOfferDetailsBottomSheet;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.librobinhood.data.RhyOverviewAccountType;
import com.robinhood.models.api.minerva.ApiPaymentCard;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.api.pluto.ApiRoundupEnrollment;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.bonfire.RhyPaycheckModule;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
import com.robinhood.models.p320db.matcha.MatchaTreatment;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.p355ui.bonfire.rhy.RhsNoaRedirectStatus;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction;
import com.robinhood.models.rhy.referral.api.RhyReferralVariant;
import com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.staticcontent.model.MobileContentPage;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyOverviewV2ViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ì\u00012\u00020\u0001:\u0004ë\u0001ì\u0001Bû\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0005\u0012\u001c\b\u0002\u0010&\u001a\u0016\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)\u0018\u00010'\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0012\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u00102\u001a\u00020\n\u0012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0012\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010=\u001a\u00020\u001e\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0005\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010D\u0012\b\b\u0002\u0010E\u001a\u00020\n\u0012\b\b\u0002\u0010F\u001a\u00020\n\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bL\u0010MJ\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0012\u0010¸\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\bHÂ\u0003J\u0011\u0010º\u0001\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0002\u0010PJ\u0011\u0010»\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010PJ\u0011\u0010¼\u0001\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0002\u0010PJ\u0011\u0010½\u0001\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0002\u0010PJ\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u000fHÂ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u000fHÂ\u0003J\u0012\u0010À\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÂ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0015HÂ\u0003J\u0012\u0010Â\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012HÂ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0019HÂ\u0003J\n\u0010Ä\u0001\u001a\u00020\u001bHÂ\u0003J\u0010\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\u0012\u0010Æ\u0001\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0005HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010!HÂ\u0003J\u0011\u0010É\u0001\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0002\u0010PJ\u0012\u0010Ê\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J\u0012\u0010Ë\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0005HÆ\u0003J\u001e\u0010Ì\u0001\u001a\u0016\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)\u0018\u00010'HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\u0010\u0010Î\u0001\u001a\b\u0012\u0004\u0012\u00020.0\u0012HÆ\u0003J\u0012\u0010Ï\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0005HÂ\u0003J\u0011\u0010Ð\u0001\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0002\u0010PJ\n\u0010Ñ\u0001\u001a\u00020\nHÆ\u0003J\u0012\u0010Ò\u0001\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u0005HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u000108HÂ\u0003J\u0010\u0010Õ\u0001\u001a\b\u0012\u0004\u0012\u00020:0\u0012HÆ\u0003J\u0011\u0010Ö\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010PJ\u0012\u0010×\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u001eHÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010?HÆ\u0003J\u0012\u0010Ú\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0005HÆ\u0003J\u0011\u0010Û\u0001\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0002\u0010PJ\u0011\u0010Ü\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010PJ\u0012\u0010Ý\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010DHÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\nHÆ\u0003J\n\u0010ß\u0001\u001a\u00020\nHÆ\u0003J\f\u0010à\u0001\u001a\u0004\u0018\u00010HHÆ\u0003J\u0011\u0010á\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010PJ\u0012\u0010â\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J\u0011\u0010ã\u0001\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0002\u0010PJ\u0088\u0005\u0010ä\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00052\u001c\b\u0002\u0010&\u001a\u0016\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)\u0018\u00010'2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00122\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n2\b\b\u0002\u00102\u001a\u00020\n2\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00122\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010=\u001a\u00020\u001e2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010D2\b\b\u0002\u0010E\u001a\u00020\n2\b\b\u0002\u0010F\u001a\u00020\n2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0003\u0010å\u0001J\u0015\u0010æ\u0001\u001a\u00020\n2\t\u0010ç\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010è\u0001\u001a\u00030é\u0001HÖ\u0001J\n\u0010ê\u0001\u001a\u00020\u001eHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010NR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010N\u001a\u0004\bO\u0010PR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010NR\u0012\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010NR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010NR\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u0010RR%\u0010&\u001a\u0016\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0012¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0016\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00101\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010NR\u0011\u00102\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0019\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010RR\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0012¢\u0006\b\n\u0000\u001a\u0004\b_\u0010YR\u0015\u0010;\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010N\u001a\u0004\b`\u0010PR\u0019\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010RR\u0011\u0010=\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0013\u0010>\u001a\u0004\u0018\u00010?¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0019\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bf\u0010RR\u0012\u0010A\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010NR\u0015\u0010B\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010N\u001a\u0004\bB\u0010PR\u0019\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010D¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0011\u0010E\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bi\u0010[R\u0011\u0010F\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bF\u0010[R\u0013\u0010G\u001a\u0004\u0018\u00010H¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0015\u0010I\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010N\u001a\u0004\bl\u0010PR\u0016\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010K\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010NR\u0011\u0010m\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bm\u0010[R\u0011\u0010n\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bn\u0010[R\u0011\u0010o\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bo\u0010[R\u0011\u0010p\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bq\u0010[R\u0013\u0010r\u001a\u0004\u0018\u00010s¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0011\u0010v\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bw\u0010[R\u0011\u0010x\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\by\u0010[R\u0013\u0010z\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b{\u0010cR\u0014\u0010|\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010[R\u000e\u0010}\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010~\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b~\u0010[R\u0014\u0010\u007f\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010[R\u0013\u0010\u0080\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010[R\u001c\u0010\u0081\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\u00058F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010RR\u000f\u0010\u0084\u0001\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0085\u0001\u001a\u00030\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u008d\u0001\u001a\u0004\u0018\u00010.¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0090\u0001\u001a\u0004\u0018\u00010\n¢\u0006\u000b\n\u0002\u0010N\u001a\u0005\b\u0090\u0001\u0010PR\u001c\u0010\u0091\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010\u0012¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010YR\u0013\u0010\u0094\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010[R\u001b\u0010\u0096\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010YR\u0013\u0010\u0098\u0001\u001a\u00020\n¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010[R\u0017\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0015\u0010\u009e\u0001\u001a\u00030\u009b\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010\u009d\u0001R\u001e\u0010 \u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010RR\u0019\u0010¢\u0001\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u001b\u0010¥\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00058F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010RR\u0019\u0010§\u0001\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010¤\u0001R\u001e\u0010©\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010RR\u001b\u0010«\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00058F¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010RR\u0019\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u0002000\u00128F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010YR\u001e\u0010¯\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010RR\u0019\u0010±\u0001\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010¤\u0001R\u0018\u0010³\u0001\u001a\u00030´\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001¨\u0006í\u0001"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState;", "", "spendingAccount", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "shouldShowHistoryExperienceEvent", "Lcom/robinhood/udf/UiEvent;", "", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "isGooglePlayEnabled", "", "hasDirectDepositRelationships", "hasEnrolledInEarlyPay", "hasSetupDirectDepositSwitcher", "minervaBrokerageAccount", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "minervaSpendingAccount", "googlePayTokenList", "", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "sortingHatUserState", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatUserState;", "allMerchantOffers", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "rhsNoaRedirectStatus", "Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus;", "hasDismissedRhsNoaRedirectPref", "Lcom/robinhood/prefs/LongPreference;", "shouldShowRhsNoaRedirectWarningSheet", "debitSpendingContentId", "", "debitSpendingOffer", "debitSpendTextResources", "Lcom/robinhood/staticcontent/model/MobileContentPage;", "hasSeenDebitSpendPopup", "shouldShowDebitSpendPopup", "pushTokenizeEvent", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "historyPager", "Landroidx/paging/Pager;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$SortKey;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "roundupEnrollmentState", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;", "iacInfoBanners", "Lcom/robinhood/models/db/IacInfoBanner;", "showFundingBottomSheetEvent", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType;", "showFundingBottomSheet", "addToGooglePayTapped", "verificationRequired", "Lcom/robinhood/models/api/minerva/VerificationRequiredException;", "paycheckModule", "Lcom/robinhood/models/db/bonfire/RhyPaycheckModule;", "matchaTreatment", "Lcom/robinhood/models/db/matcha/MatchaTreatment;", "pendingMatchaTransactions", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "hasSeenCashCushionUpsell", "shouldShowCashCushionUpsellEvent", "packageName", "cashCushionStatus", "Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "radTransferComplete", "isInP2pUpsellExperiment", "isInDedupeExperiment", "animateScrollToTop", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "shouldShowInboxBadge", "isInboxBadgeCritical", "rhyReferralEligibility", "Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;", "hasSeenFlatCashbackUpsell", "shouldShowFlatCashbackUpsellEvent", "isInFlatCashbackExperiment", "<init>", "(Lcom/robinhood/models/db/bonfire/RhyAccount;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/mcduckling/PaymentCard;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Ljava/util/List;Lcom/robinhood/models/db/identi/sortinghat/SortingHatUserState;Ljava/util/List;Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;Lcom/robinhood/staticcontent/model/MobileContentPage;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Landroidx/paging/Pager;Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Ljava/lang/Boolean;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/bonfire/RhyPaycheckModule;Lcom/robinhood/models/db/matcha/MatchaTreatment;Ljava/util/List;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;Lcom/robinhood/models/db/bonfire/CashCushionStatus;Lcom/robinhood/udf/UiEvent;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/compose/duxo/ComposeUiEvent;ZZLcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getHasDirectDepositRelationships", "()Ljava/lang/Boolean;", "getDebitSpendingContentId", "()Lcom/robinhood/udf/UiEvent;", "getPushTokenizeEvent", "getHistoryPager", "()Landroidx/paging/Pager;", "getRoundupEnrollmentState", "()Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;", "getIacInfoBanners", "()Ljava/util/List;", "getAddToGooglePayTapped", "()Z", "getVerificationRequired", "getPaycheckModule", "()Lcom/robinhood/models/db/bonfire/RhyPaycheckModule;", "getPendingMatchaTransactions", "getHasSeenCashCushionUpsell", "getShouldShowCashCushionUpsellEvent", "getPackageName", "()Ljava/lang/String;", "getCashCushionStatus", "()Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "getRadTransferComplete", "getAnimateScrollToTop", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "getShouldShowInboxBadge", "getRhyReferralEligibility", "()Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;", "getHasSeenFlatCashbackUpsell", "isMigratedFromCm", "isActiveAccount", "isRoundupBenefitVisible", "showRhyReferrals", "getShowRhyReferrals", "cardId", "Ljava/util/UUID;", "getCardId", "()Ljava/util/UUID;", "canShowTransferCta", "getCanShowTransferCta", "canShowDebitCardView", "getCanShowDebitCardView", "accountBalance", "getAccountBalance", "isGooglePayActionVisible", "hasNegativeBalance", "isAtmMiniFinderVisible", "isMatchaEnabled", "isActionBarVisible", "showHistoryExperienceEvent", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getShowHistoryExperienceEvent", "hasZeroBalance", "rhyOverviewBannerState", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState;", "getRhyOverviewBannerState", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState;", "directDepositRowIntentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getDirectDepositRowIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "iacInfoBannerData", "getIacInfoBannerData", "()Lcom/robinhood/models/db/IacInfoBanner;", "isBrokerageAccountInReview", "cashCardOffers", "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;", "getCashCardOffers", "shouldShowMerchantOffers", "getShouldShowMerchantOffers", "moreMerchantOffers", "getMoreMerchantOffers", "hasPendingDeposits", "getHasPendingDeposits", "pendingLabelValue", "Lcom/robinhood/utils/resource/StringResource;", "getPendingLabelValue", "()Lcom/robinhood/utils/resource/StringResource;", "pendingLabelSuffix", "getPendingLabelSuffix", "showRhsNoaRedirectWarningSheet", "getShowRhsNoaRedirectWarningSheet", "showRhsNoaRedirectWarningSheet2", "getShowRhsNoaRedirectWarningSheet2", "()Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType;", "showCashCushionUpsellEvent", "getShowCashCushionUpsellEvent", "showCashCushionUpsellEvent2", "getShowCashCushionUpsellEvent2", "showFlatCashbackUpsellEvent", "getShowFlatCashbackUpsellEvent", "showBottomSheet", "getShowBottomSheet", "dialogsReadyToShowList", "getDialogsReadyToShowList", "showDebitSpendUpsellEvent", "getShowDebitSpendUpsellEvent", "showDebitSpendUpsellEvent2", "getShowDebitSpendUpsellEvent2", "spendingAccountType", "Lcom/robinhood/librobinhood/data/RhyOverviewAccountType;", "getSpendingAccountType", "()Lcom/robinhood/librobinhood/data/RhyOverviewAccountType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "copy", "(Lcom/robinhood/models/db/bonfire/RhyAccount;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/mcduckling/PaymentCard;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Ljava/util/List;Lcom/robinhood/models/db/identi/sortinghat/SortingHatUserState;Ljava/util/List;Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;Lcom/robinhood/staticcontent/model/MobileContentPage;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Landroidx/paging/Pager;Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Ljava/lang/Boolean;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/bonfire/RhyPaycheckModule;Lcom/robinhood/models/db/matcha/MatchaTreatment;Ljava/util/List;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;Lcom/robinhood/models/db/bonfire/CashCushionStatus;Lcom/robinhood/udf/UiEvent;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/compose/duxo/ComposeUiEvent;ZZLcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Ljava/lang/Boolean;)Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState;", "equals", "other", "hashCode", "", "toString", "BottomSheetType", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class RhyOverviewV2ViewState {
    public static final int HISTORY_LIST_SIZE = 5;
    private static final int MAXIMUM_MERCHANT_OFFERS = 20;
    private final boolean addToGooglePayTapped;
    private final List<MerchantOfferV2> allMerchantOffers;
    private final ComposeUiEvent<Unit> animateScrollToTop;
    private final UUID cardId;
    private final List<CashCardOffer> cashCardOffers;
    private final CashCushionStatus cashCushionStatus;
    private final MobileContentPage debitSpendTextResources;
    private final UiEvent<String> debitSpendingContentId;
    private final MerchantOfferV2 debitSpendingOffer;
    private final List<GooglePayTokenInfoWrapper> googlePayTokenList;
    private final Boolean hasDirectDepositRelationships;
    private final LongPreference hasDismissedRhsNoaRedirectPref;
    private final Boolean hasEnrolledInEarlyPay;
    private final boolean hasNegativeBalance;
    private final boolean hasPendingDeposits;
    private final Boolean hasSeenCashCushionUpsell;
    private final Boolean hasSeenDebitSpendPopup;
    private final Boolean hasSeenFlatCashbackUpsell;
    private final Boolean hasSetupDirectDepositSwitcher;
    private final boolean hasZeroBalance;
    private final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager;
    private final IacInfoBanner iacInfoBannerData;
    private final List<IacInfoBanner> iacInfoBanners;
    private final boolean isActiveAccount;
    private final Boolean isBrokerageAccountInReview;
    private final Boolean isGooglePlayEnabled;
    private final Boolean isInDedupeExperiment;
    private final Boolean isInFlatCashbackExperiment;
    private final Boolean isInP2pUpsellExperiment;
    private final boolean isInboxBadgeCritical;
    private final boolean isMigratedFromCm;
    private final boolean isRoundupBenefitVisible;
    private final MatchaTreatment matchaTreatment;
    private final MinervaAccount minervaBrokerageAccount;
    private final MinervaAccount minervaSpendingAccount;
    private final List<MerchantOfferV2> moreMerchantOffers;
    private final String packageName;
    private final RhyPaycheckModule paycheckModule;
    private final PaymentCard paymentCard;
    private final StringResource pendingLabelSuffix;
    private final StringResource pendingLabelValue;
    private final List<UiMatchaPendingTransaction> pendingMatchaTransactions;
    private final UiEvent<PushTokenizeRequest> pushTokenizeEvent;
    private final UiEvent<MerchantOfferV2> radTransferComplete;
    private final RhsNoaRedirectStatus rhsNoaRedirectStatus;
    private final RhyReferralEligibility rhyReferralEligibility;
    private final ApiRoundupEnrollment.State roundupEnrollmentState;
    private final UiEvent<Unit> shouldShowCashCushionUpsellEvent;
    private final UiEvent<Unit> shouldShowDebitSpendPopup;
    private final UiEvent<Unit> shouldShowFlatCashbackUpsellEvent;
    private final UiEvent<Unit> shouldShowHistoryExperienceEvent;
    private final boolean shouldShowInboxBadge;
    private final UiEvent<Unit> shouldShowRhsNoaRedirectWarningSheet;
    private final Boolean showFundingBottomSheet;
    private final UiEvent<BottomSheetType> showFundingBottomSheetEvent;
    private final boolean showRhyReferrals;
    private final SortingHatUserState sortingHatUserState;
    private final RhyAccount spendingAccount;
    private final UiEvent<VerificationRequiredException> verificationRequired;
    public static final int $stable = 8;

    /* renamed from: component1, reason: from getter */
    private final RhyAccount getSpendingAccount() {
        return this.spendingAccount;
    }

    private final List<GooglePayTokenInfoWrapper> component10() {
        return this.googlePayTokenList;
    }

    /* renamed from: component11, reason: from getter */
    private final SortingHatUserState getSortingHatUserState() {
        return this.sortingHatUserState;
    }

    private final List<MerchantOfferV2> component12() {
        return this.allMerchantOffers;
    }

    /* renamed from: component13, reason: from getter */
    private final RhsNoaRedirectStatus getRhsNoaRedirectStatus() {
        return this.rhsNoaRedirectStatus;
    }

    /* renamed from: component14, reason: from getter */
    private final LongPreference getHasDismissedRhsNoaRedirectPref() {
        return this.hasDismissedRhsNoaRedirectPref;
    }

    private final UiEvent<Unit> component15() {
        return this.shouldShowRhsNoaRedirectWarningSheet;
    }

    /* renamed from: component17, reason: from getter */
    private final MerchantOfferV2 getDebitSpendingOffer() {
        return this.debitSpendingOffer;
    }

    /* renamed from: component18, reason: from getter */
    private final MobileContentPage getDebitSpendTextResources() {
        return this.debitSpendTextResources;
    }

    /* renamed from: component19, reason: from getter */
    private final Boolean getHasSeenDebitSpendPopup() {
        return this.hasSeenDebitSpendPopup;
    }

    private final UiEvent<Unit> component2() {
        return this.shouldShowHistoryExperienceEvent;
    }

    private final UiEvent<Unit> component20() {
        return this.shouldShowDebitSpendPopup;
    }

    private final UiEvent<BottomSheetType> component25() {
        return this.showFundingBottomSheetEvent;
    }

    /* renamed from: component26, reason: from getter */
    private final Boolean getShowFundingBottomSheet() {
        return this.showFundingBottomSheet;
    }

    /* renamed from: component3, reason: from getter */
    private final PaymentCard getPaymentCard() {
        return this.paymentCard;
    }

    /* renamed from: component30, reason: from getter */
    private final MatchaTreatment getMatchaTreatment() {
        return this.matchaTreatment;
    }

    /* renamed from: component37, reason: from getter */
    private final Boolean getIsInP2pUpsellExperiment() {
        return this.isInP2pUpsellExperiment;
    }

    /* renamed from: component4, reason: from getter */
    private final Boolean getIsGooglePlayEnabled() {
        return this.isGooglePlayEnabled;
    }

    private final UiEvent<Unit> component44() {
        return this.shouldShowFlatCashbackUpsellEvent;
    }

    /* renamed from: component45, reason: from getter */
    private final Boolean getIsInFlatCashbackExperiment() {
        return this.isInFlatCashbackExperiment;
    }

    /* renamed from: component6, reason: from getter */
    private final Boolean getHasEnrolledInEarlyPay() {
        return this.hasEnrolledInEarlyPay;
    }

    /* renamed from: component7, reason: from getter */
    private final Boolean getHasSetupDirectDepositSwitcher() {
        return this.hasSetupDirectDepositSwitcher;
    }

    /* renamed from: component8, reason: from getter */
    private final MinervaAccount getMinervaBrokerageAccount() {
        return this.minervaBrokerageAccount;
    }

    /* renamed from: component9, reason: from getter */
    private final MinervaAccount getMinervaSpendingAccount() {
        return this.minervaSpendingAccount;
    }

    public final UiEvent<String> component16() {
        return this.debitSpendingContentId;
    }

    public final UiEvent<PushTokenizeRequest> component21() {
        return this.pushTokenizeEvent;
    }

    public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> component22() {
        return this.historyPager;
    }

    /* renamed from: component23, reason: from getter */
    public final ApiRoundupEnrollment.State getRoundupEnrollmentState() {
        return this.roundupEnrollmentState;
    }

    public final List<IacInfoBanner> component24() {
        return this.iacInfoBanners;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getAddToGooglePayTapped() {
        return this.addToGooglePayTapped;
    }

    public final UiEvent<VerificationRequiredException> component28() {
        return this.verificationRequired;
    }

    /* renamed from: component29, reason: from getter */
    public final RhyPaycheckModule getPaycheckModule() {
        return this.paycheckModule;
    }

    public final List<UiMatchaPendingTransaction> component31() {
        return this.pendingMatchaTransactions;
    }

    /* renamed from: component32, reason: from getter */
    public final Boolean getHasSeenCashCushionUpsell() {
        return this.hasSeenCashCushionUpsell;
    }

    public final UiEvent<Unit> component33() {
        return this.shouldShowCashCushionUpsellEvent;
    }

    /* renamed from: component34, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component35, reason: from getter */
    public final CashCushionStatus getCashCushionStatus() {
        return this.cashCushionStatus;
    }

    public final UiEvent<MerchantOfferV2> component36() {
        return this.radTransferComplete;
    }

    /* renamed from: component38, reason: from getter */
    public final Boolean getIsInDedupeExperiment() {
        return this.isInDedupeExperiment;
    }

    public final ComposeUiEvent<Unit> component39() {
        return this.animateScrollToTop;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getShouldShowInboxBadge() {
        return this.shouldShowInboxBadge;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getIsInboxBadgeCritical() {
        return this.isInboxBadgeCritical;
    }

    /* renamed from: component42, reason: from getter */
    public final RhyReferralEligibility getRhyReferralEligibility() {
        return this.rhyReferralEligibility;
    }

    /* renamed from: component43, reason: from getter */
    public final Boolean getHasSeenFlatCashbackUpsell() {
        return this.hasSeenFlatCashbackUpsell;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHasDirectDepositRelationships() {
        return this.hasDirectDepositRelationships;
    }

    public final RhyOverviewV2ViewState copy(RhyAccount spendingAccount, UiEvent<Unit> shouldShowHistoryExperienceEvent, PaymentCard paymentCard, Boolean isGooglePlayEnabled, Boolean hasDirectDepositRelationships, Boolean hasEnrolledInEarlyPay, Boolean hasSetupDirectDepositSwitcher, MinervaAccount minervaBrokerageAccount, MinervaAccount minervaSpendingAccount, List<GooglePayTokenInfoWrapper> googlePayTokenList, SortingHatUserState sortingHatUserState, List<MerchantOfferV2> allMerchantOffers, RhsNoaRedirectStatus rhsNoaRedirectStatus, LongPreference hasDismissedRhsNoaRedirectPref, UiEvent<Unit> shouldShowRhsNoaRedirectWarningSheet, UiEvent<String> debitSpendingContentId, MerchantOfferV2 debitSpendingOffer, MobileContentPage debitSpendTextResources, Boolean hasSeenDebitSpendPopup, UiEvent<Unit> shouldShowDebitSpendPopup, UiEvent<PushTokenizeRequest> pushTokenizeEvent, Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager, ApiRoundupEnrollment.State roundupEnrollmentState, List<IacInfoBanner> iacInfoBanners, UiEvent<BottomSheetType> showFundingBottomSheetEvent, Boolean showFundingBottomSheet, boolean addToGooglePayTapped, UiEvent<VerificationRequiredException> verificationRequired, RhyPaycheckModule paycheckModule, MatchaTreatment matchaTreatment, List<? extends UiMatchaPendingTransaction> pendingMatchaTransactions, Boolean hasSeenCashCushionUpsell, UiEvent<Unit> shouldShowCashCushionUpsellEvent, String packageName, CashCushionStatus cashCushionStatus, UiEvent<MerchantOfferV2> radTransferComplete, Boolean isInP2pUpsellExperiment, Boolean isInDedupeExperiment, ComposeUiEvent<Unit> animateScrollToTop, boolean shouldShowInboxBadge, boolean isInboxBadgeCritical, RhyReferralEligibility rhyReferralEligibility, Boolean hasSeenFlatCashbackUpsell, UiEvent<Unit> shouldShowFlatCashbackUpsellEvent, Boolean isInFlatCashbackExperiment) {
        Intrinsics.checkNotNullParameter(hasDismissedRhsNoaRedirectPref, "hasDismissedRhsNoaRedirectPref");
        Intrinsics.checkNotNullParameter(shouldShowRhsNoaRedirectWarningSheet, "shouldShowRhsNoaRedirectWarningSheet");
        Intrinsics.checkNotNullParameter(iacInfoBanners, "iacInfoBanners");
        Intrinsics.checkNotNullParameter(pendingMatchaTransactions, "pendingMatchaTransactions");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new RhyOverviewV2ViewState(spendingAccount, shouldShowHistoryExperienceEvent, paymentCard, isGooglePlayEnabled, hasDirectDepositRelationships, hasEnrolledInEarlyPay, hasSetupDirectDepositSwitcher, minervaBrokerageAccount, minervaSpendingAccount, googlePayTokenList, sortingHatUserState, allMerchantOffers, rhsNoaRedirectStatus, hasDismissedRhsNoaRedirectPref, shouldShowRhsNoaRedirectWarningSheet, debitSpendingContentId, debitSpendingOffer, debitSpendTextResources, hasSeenDebitSpendPopup, shouldShowDebitSpendPopup, pushTokenizeEvent, historyPager, roundupEnrollmentState, iacInfoBanners, showFundingBottomSheetEvent, showFundingBottomSheet, addToGooglePayTapped, verificationRequired, paycheckModule, matchaTreatment, pendingMatchaTransactions, hasSeenCashCushionUpsell, shouldShowCashCushionUpsellEvent, packageName, cashCushionStatus, radTransferComplete, isInP2pUpsellExperiment, isInDedupeExperiment, animateScrollToTop, shouldShowInboxBadge, isInboxBadgeCritical, rhyReferralEligibility, hasSeenFlatCashbackUpsell, shouldShowFlatCashbackUpsellEvent, isInFlatCashbackExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyOverviewV2ViewState)) {
            return false;
        }
        RhyOverviewV2ViewState rhyOverviewV2ViewState = (RhyOverviewV2ViewState) other;
        return Intrinsics.areEqual(this.spendingAccount, rhyOverviewV2ViewState.spendingAccount) && Intrinsics.areEqual(this.shouldShowHistoryExperienceEvent, rhyOverviewV2ViewState.shouldShowHistoryExperienceEvent) && Intrinsics.areEqual(this.paymentCard, rhyOverviewV2ViewState.paymentCard) && Intrinsics.areEqual(this.isGooglePlayEnabled, rhyOverviewV2ViewState.isGooglePlayEnabled) && Intrinsics.areEqual(this.hasDirectDepositRelationships, rhyOverviewV2ViewState.hasDirectDepositRelationships) && Intrinsics.areEqual(this.hasEnrolledInEarlyPay, rhyOverviewV2ViewState.hasEnrolledInEarlyPay) && Intrinsics.areEqual(this.hasSetupDirectDepositSwitcher, rhyOverviewV2ViewState.hasSetupDirectDepositSwitcher) && Intrinsics.areEqual(this.minervaBrokerageAccount, rhyOverviewV2ViewState.minervaBrokerageAccount) && Intrinsics.areEqual(this.minervaSpendingAccount, rhyOverviewV2ViewState.minervaSpendingAccount) && Intrinsics.areEqual(this.googlePayTokenList, rhyOverviewV2ViewState.googlePayTokenList) && Intrinsics.areEqual(this.sortingHatUserState, rhyOverviewV2ViewState.sortingHatUserState) && Intrinsics.areEqual(this.allMerchantOffers, rhyOverviewV2ViewState.allMerchantOffers) && Intrinsics.areEqual(this.rhsNoaRedirectStatus, rhyOverviewV2ViewState.rhsNoaRedirectStatus) && Intrinsics.areEqual(this.hasDismissedRhsNoaRedirectPref, rhyOverviewV2ViewState.hasDismissedRhsNoaRedirectPref) && Intrinsics.areEqual(this.shouldShowRhsNoaRedirectWarningSheet, rhyOverviewV2ViewState.shouldShowRhsNoaRedirectWarningSheet) && Intrinsics.areEqual(this.debitSpendingContentId, rhyOverviewV2ViewState.debitSpendingContentId) && Intrinsics.areEqual(this.debitSpendingOffer, rhyOverviewV2ViewState.debitSpendingOffer) && Intrinsics.areEqual(this.debitSpendTextResources, rhyOverviewV2ViewState.debitSpendTextResources) && Intrinsics.areEqual(this.hasSeenDebitSpendPopup, rhyOverviewV2ViewState.hasSeenDebitSpendPopup) && Intrinsics.areEqual(this.shouldShowDebitSpendPopup, rhyOverviewV2ViewState.shouldShowDebitSpendPopup) && Intrinsics.areEqual(this.pushTokenizeEvent, rhyOverviewV2ViewState.pushTokenizeEvent) && Intrinsics.areEqual(this.historyPager, rhyOverviewV2ViewState.historyPager) && this.roundupEnrollmentState == rhyOverviewV2ViewState.roundupEnrollmentState && Intrinsics.areEqual(this.iacInfoBanners, rhyOverviewV2ViewState.iacInfoBanners) && Intrinsics.areEqual(this.showFundingBottomSheetEvent, rhyOverviewV2ViewState.showFundingBottomSheetEvent) && Intrinsics.areEqual(this.showFundingBottomSheet, rhyOverviewV2ViewState.showFundingBottomSheet) && this.addToGooglePayTapped == rhyOverviewV2ViewState.addToGooglePayTapped && Intrinsics.areEqual(this.verificationRequired, rhyOverviewV2ViewState.verificationRequired) && Intrinsics.areEqual(this.paycheckModule, rhyOverviewV2ViewState.paycheckModule) && Intrinsics.areEqual(this.matchaTreatment, rhyOverviewV2ViewState.matchaTreatment) && Intrinsics.areEqual(this.pendingMatchaTransactions, rhyOverviewV2ViewState.pendingMatchaTransactions) && Intrinsics.areEqual(this.hasSeenCashCushionUpsell, rhyOverviewV2ViewState.hasSeenCashCushionUpsell) && Intrinsics.areEqual(this.shouldShowCashCushionUpsellEvent, rhyOverviewV2ViewState.shouldShowCashCushionUpsellEvent) && Intrinsics.areEqual(this.packageName, rhyOverviewV2ViewState.packageName) && Intrinsics.areEqual(this.cashCushionStatus, rhyOverviewV2ViewState.cashCushionStatus) && Intrinsics.areEqual(this.radTransferComplete, rhyOverviewV2ViewState.radTransferComplete) && Intrinsics.areEqual(this.isInP2pUpsellExperiment, rhyOverviewV2ViewState.isInP2pUpsellExperiment) && Intrinsics.areEqual(this.isInDedupeExperiment, rhyOverviewV2ViewState.isInDedupeExperiment) && Intrinsics.areEqual(this.animateScrollToTop, rhyOverviewV2ViewState.animateScrollToTop) && this.shouldShowInboxBadge == rhyOverviewV2ViewState.shouldShowInboxBadge && this.isInboxBadgeCritical == rhyOverviewV2ViewState.isInboxBadgeCritical && Intrinsics.areEqual(this.rhyReferralEligibility, rhyOverviewV2ViewState.rhyReferralEligibility) && Intrinsics.areEqual(this.hasSeenFlatCashbackUpsell, rhyOverviewV2ViewState.hasSeenFlatCashbackUpsell) && Intrinsics.areEqual(this.shouldShowFlatCashbackUpsellEvent, rhyOverviewV2ViewState.shouldShowFlatCashbackUpsellEvent) && Intrinsics.areEqual(this.isInFlatCashbackExperiment, rhyOverviewV2ViewState.isInFlatCashbackExperiment);
    }

    public int hashCode() {
        RhyAccount rhyAccount = this.spendingAccount;
        int iHashCode = (rhyAccount == null ? 0 : rhyAccount.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.shouldShowHistoryExperienceEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        PaymentCard paymentCard = this.paymentCard;
        int iHashCode3 = (iHashCode2 + (paymentCard == null ? 0 : paymentCard.hashCode())) * 31;
        Boolean bool = this.isGooglePlayEnabled;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasDirectDepositRelationships;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasEnrolledInEarlyPay;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasSetupDirectDepositSwitcher;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        MinervaAccount minervaAccount = this.minervaBrokerageAccount;
        int iHashCode8 = (iHashCode7 + (minervaAccount == null ? 0 : minervaAccount.hashCode())) * 31;
        MinervaAccount minervaAccount2 = this.minervaSpendingAccount;
        int iHashCode9 = (iHashCode8 + (minervaAccount2 == null ? 0 : minervaAccount2.hashCode())) * 31;
        List<GooglePayTokenInfoWrapper> list = this.googlePayTokenList;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        SortingHatUserState sortingHatUserState = this.sortingHatUserState;
        int iHashCode11 = (iHashCode10 + (sortingHatUserState == null ? 0 : sortingHatUserState.hashCode())) * 31;
        List<MerchantOfferV2> list2 = this.allMerchantOffers;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        RhsNoaRedirectStatus rhsNoaRedirectStatus = this.rhsNoaRedirectStatus;
        int iHashCode13 = (((((iHashCode12 + (rhsNoaRedirectStatus == null ? 0 : rhsNoaRedirectStatus.hashCode())) * 31) + this.hasDismissedRhsNoaRedirectPref.hashCode()) * 31) + this.shouldShowRhsNoaRedirectWarningSheet.hashCode()) * 31;
        UiEvent<String> uiEvent2 = this.debitSpendingContentId;
        int iHashCode14 = (iHashCode13 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        MerchantOfferV2 merchantOfferV2 = this.debitSpendingOffer;
        int iHashCode15 = (iHashCode14 + (merchantOfferV2 == null ? 0 : merchantOfferV2.hashCode())) * 31;
        MobileContentPage mobileContentPage = this.debitSpendTextResources;
        int iHashCode16 = (iHashCode15 + (mobileContentPage == null ? 0 : mobileContentPage.hashCode())) * 31;
        Boolean bool5 = this.hasSeenDebitSpendPopup;
        int iHashCode17 = (iHashCode16 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.shouldShowDebitSpendPopup;
        int iHashCode18 = (iHashCode17 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<PushTokenizeRequest> uiEvent4 = this.pushTokenizeEvent;
        int iHashCode19 = (iHashCode18 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager = this.historyPager;
        int iHashCode20 = (iHashCode19 + (pager == null ? 0 : pager.hashCode())) * 31;
        ApiRoundupEnrollment.State state = this.roundupEnrollmentState;
        int iHashCode21 = (((iHashCode20 + (state == null ? 0 : state.hashCode())) * 31) + this.iacInfoBanners.hashCode()) * 31;
        UiEvent<BottomSheetType> uiEvent5 = this.showFundingBottomSheetEvent;
        int iHashCode22 = (iHashCode21 + (uiEvent5 == null ? 0 : uiEvent5.hashCode())) * 31;
        Boolean bool6 = this.showFundingBottomSheet;
        int iHashCode23 = (((iHashCode22 + (bool6 == null ? 0 : bool6.hashCode())) * 31) + Boolean.hashCode(this.addToGooglePayTapped)) * 31;
        UiEvent<VerificationRequiredException> uiEvent6 = this.verificationRequired;
        int iHashCode24 = (iHashCode23 + (uiEvent6 == null ? 0 : uiEvent6.hashCode())) * 31;
        RhyPaycheckModule rhyPaycheckModule = this.paycheckModule;
        int iHashCode25 = (iHashCode24 + (rhyPaycheckModule == null ? 0 : rhyPaycheckModule.hashCode())) * 31;
        MatchaTreatment matchaTreatment = this.matchaTreatment;
        int iHashCode26 = (((iHashCode25 + (matchaTreatment == null ? 0 : matchaTreatment.hashCode())) * 31) + this.pendingMatchaTransactions.hashCode()) * 31;
        Boolean bool7 = this.hasSeenCashCushionUpsell;
        int iHashCode27 = (iHashCode26 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        UiEvent<Unit> uiEvent7 = this.shouldShowCashCushionUpsellEvent;
        int iHashCode28 = (((iHashCode27 + (uiEvent7 == null ? 0 : uiEvent7.hashCode())) * 31) + this.packageName.hashCode()) * 31;
        CashCushionStatus cashCushionStatus = this.cashCushionStatus;
        int iHashCode29 = (iHashCode28 + (cashCushionStatus == null ? 0 : cashCushionStatus.hashCode())) * 31;
        UiEvent<MerchantOfferV2> uiEvent8 = this.radTransferComplete;
        int iHashCode30 = (iHashCode29 + (uiEvent8 == null ? 0 : uiEvent8.hashCode())) * 31;
        Boolean bool8 = this.isInP2pUpsellExperiment;
        int iHashCode31 = (iHashCode30 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isInDedupeExperiment;
        int iHashCode32 = (iHashCode31 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        ComposeUiEvent<Unit> composeUiEvent = this.animateScrollToTop;
        int iHashCode33 = (((((iHashCode32 + (composeUiEvent == null ? 0 : composeUiEvent.hashCode())) * 31) + Boolean.hashCode(this.shouldShowInboxBadge)) * 31) + Boolean.hashCode(this.isInboxBadgeCritical)) * 31;
        RhyReferralEligibility rhyReferralEligibility = this.rhyReferralEligibility;
        int iHashCode34 = (iHashCode33 + (rhyReferralEligibility == null ? 0 : rhyReferralEligibility.hashCode())) * 31;
        Boolean bool10 = this.hasSeenFlatCashbackUpsell;
        int iHashCode35 = (iHashCode34 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        UiEvent<Unit> uiEvent9 = this.shouldShowFlatCashbackUpsellEvent;
        int iHashCode36 = (iHashCode35 + (uiEvent9 == null ? 0 : uiEvent9.hashCode())) * 31;
        Boolean bool11 = this.isInFlatCashbackExperiment;
        return iHashCode36 + (bool11 != null ? bool11.hashCode() : 0);
    }

    public String toString() {
        return "RhyOverviewV2ViewState(spendingAccount=" + this.spendingAccount + ", shouldShowHistoryExperienceEvent=" + this.shouldShowHistoryExperienceEvent + ", paymentCard=" + this.paymentCard + ", isGooglePlayEnabled=" + this.isGooglePlayEnabled + ", hasDirectDepositRelationships=" + this.hasDirectDepositRelationships + ", hasEnrolledInEarlyPay=" + this.hasEnrolledInEarlyPay + ", hasSetupDirectDepositSwitcher=" + this.hasSetupDirectDepositSwitcher + ", minervaBrokerageAccount=" + this.minervaBrokerageAccount + ", minervaSpendingAccount=" + this.minervaSpendingAccount + ", googlePayTokenList=" + this.googlePayTokenList + ", sortingHatUserState=" + this.sortingHatUserState + ", allMerchantOffers=" + this.allMerchantOffers + ", rhsNoaRedirectStatus=" + this.rhsNoaRedirectStatus + ", hasDismissedRhsNoaRedirectPref=" + this.hasDismissedRhsNoaRedirectPref + ", shouldShowRhsNoaRedirectWarningSheet=" + this.shouldShowRhsNoaRedirectWarningSheet + ", debitSpendingContentId=" + this.debitSpendingContentId + ", debitSpendingOffer=" + this.debitSpendingOffer + ", debitSpendTextResources=" + this.debitSpendTextResources + ", hasSeenDebitSpendPopup=" + this.hasSeenDebitSpendPopup + ", shouldShowDebitSpendPopup=" + this.shouldShowDebitSpendPopup + ", pushTokenizeEvent=" + this.pushTokenizeEvent + ", historyPager=" + this.historyPager + ", roundupEnrollmentState=" + this.roundupEnrollmentState + ", iacInfoBanners=" + this.iacInfoBanners + ", showFundingBottomSheetEvent=" + this.showFundingBottomSheetEvent + ", showFundingBottomSheet=" + this.showFundingBottomSheet + ", addToGooglePayTapped=" + this.addToGooglePayTapped + ", verificationRequired=" + this.verificationRequired + ", paycheckModule=" + this.paycheckModule + ", matchaTreatment=" + this.matchaTreatment + ", pendingMatchaTransactions=" + this.pendingMatchaTransactions + ", hasSeenCashCushionUpsell=" + this.hasSeenCashCushionUpsell + ", shouldShowCashCushionUpsellEvent=" + this.shouldShowCashCushionUpsellEvent + ", packageName=" + this.packageName + ", cashCushionStatus=" + this.cashCushionStatus + ", radTransferComplete=" + this.radTransferComplete + ", isInP2pUpsellExperiment=" + this.isInP2pUpsellExperiment + ", isInDedupeExperiment=" + this.isInDedupeExperiment + ", animateScrollToTop=" + this.animateScrollToTop + ", shouldShowInboxBadge=" + this.shouldShowInboxBadge + ", isInboxBadgeCritical=" + this.isInboxBadgeCritical + ", rhyReferralEligibility=" + this.rhyReferralEligibility + ", hasSeenFlatCashbackUpsell=" + this.hasSeenFlatCashbackUpsell + ", shouldShowFlatCashbackUpsellEvent=" + this.shouldShowFlatCashbackUpsellEvent + ", isInFlatCashbackExperiment=" + this.isInFlatCashbackExperiment + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RhyOverviewV2ViewState(RhyAccount rhyAccount, UiEvent<Unit> uiEvent, PaymentCard paymentCard, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, MinervaAccount minervaAccount, MinervaAccount minervaAccount2, List<GooglePayTokenInfoWrapper> list, SortingHatUserState sortingHatUserState, List<MerchantOfferV2> list2, RhsNoaRedirectStatus rhsNoaRedirectStatus, LongPreference hasDismissedRhsNoaRedirectPref, UiEvent<Unit> shouldShowRhsNoaRedirectWarningSheet, UiEvent<String> uiEvent2, MerchantOfferV2 merchantOfferV2, MobileContentPage mobileContentPage, Boolean bool5, UiEvent<Unit> uiEvent3, UiEvent<PushTokenizeRequest> uiEvent4, Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager, ApiRoundupEnrollment.State state, List<IacInfoBanner> iacInfoBanners, UiEvent<BottomSheetType> uiEvent5, Boolean bool6, boolean z, UiEvent<VerificationRequiredException> uiEvent6, RhyPaycheckModule rhyPaycheckModule, MatchaTreatment matchaTreatment, List<? extends UiMatchaPendingTransaction> pendingMatchaTransactions, Boolean bool7, UiEvent<Unit> uiEvent7, String packageName, CashCushionStatus cashCushionStatus, UiEvent<MerchantOfferV2> uiEvent8, Boolean bool8, Boolean bool9, ComposeUiEvent<Unit> composeUiEvent, boolean z2, boolean z3, RhyReferralEligibility rhyReferralEligibility, Boolean bool10, UiEvent<Unit> uiEvent9, Boolean bool11) {
        boolean z4;
        Boolean boolValueOf;
        List<CashCardOffer> listCombineOffersCarousel;
        BigDecimal cashIncoming;
        SortingHatUserState.Brokerage brokerage;
        Intrinsics.checkNotNullParameter(hasDismissedRhsNoaRedirectPref, "hasDismissedRhsNoaRedirectPref");
        Intrinsics.checkNotNullParameter(shouldShowRhsNoaRedirectWarningSheet, "shouldShowRhsNoaRedirectWarningSheet");
        Intrinsics.checkNotNullParameter(iacInfoBanners, "iacInfoBanners");
        Intrinsics.checkNotNullParameter(pendingMatchaTransactions, "pendingMatchaTransactions");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.spendingAccount = rhyAccount;
        this.shouldShowHistoryExperienceEvent = uiEvent;
        this.paymentCard = paymentCard;
        this.isGooglePlayEnabled = bool;
        this.hasDirectDepositRelationships = bool2;
        this.hasEnrolledInEarlyPay = bool3;
        this.hasSetupDirectDepositSwitcher = bool4;
        this.minervaBrokerageAccount = minervaAccount;
        this.minervaSpendingAccount = minervaAccount2;
        this.googlePayTokenList = list;
        this.sortingHatUserState = sortingHatUserState;
        this.allMerchantOffers = list2;
        this.rhsNoaRedirectStatus = rhsNoaRedirectStatus;
        this.hasDismissedRhsNoaRedirectPref = hasDismissedRhsNoaRedirectPref;
        this.shouldShowRhsNoaRedirectWarningSheet = shouldShowRhsNoaRedirectWarningSheet;
        this.debitSpendingContentId = uiEvent2;
        this.debitSpendingOffer = merchantOfferV2;
        this.debitSpendTextResources = mobileContentPage;
        this.hasSeenDebitSpendPopup = bool5;
        this.shouldShowDebitSpendPopup = uiEvent3;
        this.pushTokenizeEvent = uiEvent4;
        this.historyPager = pager;
        this.roundupEnrollmentState = state;
        this.iacInfoBanners = iacInfoBanners;
        this.showFundingBottomSheetEvent = uiEvent5;
        this.showFundingBottomSheet = bool6;
        this.addToGooglePayTapped = z;
        this.verificationRequired = uiEvent6;
        this.paycheckModule = rhyPaycheckModule;
        this.matchaTreatment = matchaTreatment;
        this.pendingMatchaTransactions = pendingMatchaTransactions;
        this.hasSeenCashCushionUpsell = bool7;
        this.shouldShowCashCushionUpsellEvent = uiEvent7;
        this.packageName = packageName;
        this.cashCushionStatus = cashCushionStatus;
        this.radTransferComplete = uiEvent8;
        this.isInP2pUpsellExperiment = bool8;
        this.isInDedupeExperiment = bool9;
        this.animateScrollToTop = composeUiEvent;
        this.shouldShowInboxBadge = z2;
        this.isInboxBadgeCritical = z3;
        this.rhyReferralEligibility = rhyReferralEligibility;
        this.hasSeenFlatCashbackUpsell = bool10;
        this.shouldShowFlatCashbackUpsellEvent = uiEvent9;
        this.isInFlatCashbackExperiment = bool11;
        this.isMigratedFromCm = minervaAccount != null && minervaAccount.migratedToRhy();
        boolean z5 = (minervaAccount2 == null || minervaAccount2.isActive()) ? false : true;
        this.isActiveAccount = !z5;
        this.isRoundupBenefitVisible = !z5 && getSpendingAccountType() == RhyOverviewAccountType.RHY;
        StringResource stringResourceInvoke = null;
        this.showRhyReferrals = ((rhyReferralEligibility != null ? rhyReferralEligibility.getRhyReferralVariant() : null) == null || rhyReferralEligibility.getRhyReferralVariant() == RhyReferralVariant.UNKNOWN) ? false : true;
        this.cardId = paymentCard != null ? paymentCard.getId() : null;
        this.hasNegativeBalance = BigDecimals7.isNegative(rhyAccount != null ? rhyAccount.getCashAvailable() : null);
        BigDecimal cashAvailable = rhyAccount != null ? rhyAccount.getCashAvailable() : null;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (Intrinsics.areEqual(cashAvailable, bigDecimal)) {
            if (Intrinsics.areEqual(rhyAccount != null ? rhyAccount.getCashIncoming() : null, bigDecimal)) {
                z4 = true;
            }
        } else {
            z4 = false;
        }
        this.hasZeroBalance = z4;
        this.iacInfoBannerData = IacInfoBanners.findByLocation(iacInfoBanners, IacInfoBannerLocation.INFO_BANNER_RHY_PAGE_TOP_LEVEL);
        if (sortingHatUserState == null || (brokerage = sortingHatUserState.getBrokerage()) == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(brokerage.getHasApplication() && !brokerage.isApproved());
        }
        this.isBrokerageAccountInReview = boolValueOf;
        if (list2 != null) {
            listCombineOffersCarousel = CashCardOffer2.combineOffersCarousel(list2, rhyReferralEligibility != null ? rhyReferralEligibility.getRhyReferralVariant() : null, 20);
        } else {
            listCombineOffersCarousel = null;
        }
        this.cashCardOffers = listCombineOffersCarousel;
        this.moreMerchantOffers = (list2 == null || list2.size() <= 20) ? null : list2.subList(20, list2.size());
        this.hasPendingDeposits = BigDecimals7.isPositive(rhyAccount != null ? rhyAccount.getCashIncoming() : null);
        if (rhyAccount != null && (cashIncoming = rhyAccount.getCashIncoming()) != null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(Money.Adjustment.format$default(new Money(Currencies.USD, cashIncoming).toCreditAdjustment(), false, null, 3, null));
        }
        this.pendingLabelValue = stringResourceInvoke;
        this.pendingLabelSuffix = StringResource.INSTANCE.invoke(C10285R.string.rhy_overview_pending_deposit, new Object[0]);
    }

    public final Boolean getHasDirectDepositRelationships() {
        return this.hasDirectDepositRelationships;
    }

    public /* synthetic */ RhyOverviewV2ViewState(RhyAccount rhyAccount, UiEvent uiEvent, PaymentCard paymentCard, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, MinervaAccount minervaAccount, MinervaAccount minervaAccount2, List list, SortingHatUserState sortingHatUserState, List list2, RhsNoaRedirectStatus rhsNoaRedirectStatus, LongPreference longPreference, UiEvent uiEvent2, UiEvent uiEvent3, MerchantOfferV2 merchantOfferV2, MobileContentPage mobileContentPage, Boolean bool5, UiEvent uiEvent4, UiEvent uiEvent5, Pager pager, ApiRoundupEnrollment.State state, List list3, UiEvent uiEvent6, Boolean bool6, boolean z, UiEvent uiEvent7, RhyPaycheckModule rhyPaycheckModule, MatchaTreatment matchaTreatment, List list4, Boolean bool7, UiEvent uiEvent8, String str, CashCushionStatus cashCushionStatus, UiEvent uiEvent9, Boolean bool8, Boolean bool9, ComposeUiEvent composeUiEvent, boolean z2, boolean z3, RhyReferralEligibility rhyReferralEligibility, Boolean bool10, UiEvent uiEvent10, Boolean bool11, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rhyAccount, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : paymentCard, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : minervaAccount, (i & 256) != 0 ? null : minervaAccount2, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : sortingHatUserState, (i & 2048) != 0 ? null : list2, (i & 4096) != 0 ? null : rhsNoaRedirectStatus, longPreference, (i & 16384) != 0 ? new UiEvent(Unit.INSTANCE) : uiEvent2, (32768 & i) != 0 ? null : uiEvent3, (65536 & i) != 0 ? null : merchantOfferV2, (131072 & i) != 0 ? null : mobileContentPage, (262144 & i) != 0 ? null : bool5, (524288 & i) != 0 ? null : uiEvent4, (1048576 & i) != 0 ? null : uiEvent5, (2097152 & i) != 0 ? null : pager, (4194304 & i) != 0 ? null : state, (8388608 & i) != 0 ? CollectionsKt.emptyList() : list3, (16777216 & i) != 0 ? null : uiEvent6, (33554432 & i) != 0 ? null : bool6, (67108864 & i) != 0 ? false : z, (134217728 & i) != 0 ? null : uiEvent7, (268435456 & i) != 0 ? null : rhyPaycheckModule, (536870912 & i) != 0 ? null : matchaTreatment, (1073741824 & i) != 0 ? CollectionsKt.emptyList() : list4, (i & Integer.MIN_VALUE) != 0 ? null : bool7, (i2 & 1) != 0 ? new UiEvent(Unit.INSTANCE) : uiEvent8, str, (i2 & 4) != 0 ? null : cashCushionStatus, (i2 & 8) != 0 ? null : uiEvent9, (i2 & 16) != 0 ? null : bool8, (i2 & 32) != 0 ? null : bool9, (i2 & 64) != 0 ? null : composeUiEvent, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? null : rhyReferralEligibility, (i2 & 1024) != 0 ? null : bool10, (i2 & 2048) != 0 ? new UiEvent(Unit.INSTANCE) : uiEvent10, (i2 & 4096) != 0 ? null : bool11);
    }

    public final UiEvent<String> getDebitSpendingContentId() {
        return this.debitSpendingContentId;
    }

    public final UiEvent<PushTokenizeRequest> getPushTokenizeEvent() {
        return this.pushTokenizeEvent;
    }

    public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> getHistoryPager() {
        return this.historyPager;
    }

    public final ApiRoundupEnrollment.State getRoundupEnrollmentState() {
        return this.roundupEnrollmentState;
    }

    public final List<IacInfoBanner> getIacInfoBanners() {
        return this.iacInfoBanners;
    }

    public final boolean getAddToGooglePayTapped() {
        return this.addToGooglePayTapped;
    }

    public final UiEvent<VerificationRequiredException> getVerificationRequired() {
        return this.verificationRequired;
    }

    public final RhyPaycheckModule getPaycheckModule() {
        return this.paycheckModule;
    }

    public final List<UiMatchaPendingTransaction> getPendingMatchaTransactions() {
        return this.pendingMatchaTransactions;
    }

    public final Boolean getHasSeenCashCushionUpsell() {
        return this.hasSeenCashCushionUpsell;
    }

    public final UiEvent<Unit> getShouldShowCashCushionUpsellEvent() {
        return this.shouldShowCashCushionUpsellEvent;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final CashCushionStatus getCashCushionStatus() {
        return this.cashCushionStatus;
    }

    public final UiEvent<MerchantOfferV2> getRadTransferComplete() {
        return this.radTransferComplete;
    }

    public final Boolean isInDedupeExperiment() {
        return this.isInDedupeExperiment;
    }

    public final ComposeUiEvent<Unit> getAnimateScrollToTop() {
        return this.animateScrollToTop;
    }

    public final boolean getShouldShowInboxBadge() {
        return this.shouldShowInboxBadge;
    }

    public final boolean isInboxBadgeCritical() {
        return this.isInboxBadgeCritical;
    }

    public final RhyReferralEligibility getRhyReferralEligibility() {
        return this.rhyReferralEligibility;
    }

    public final Boolean getHasSeenFlatCashbackUpsell() {
        return this.hasSeenFlatCashbackUpsell;
    }

    /* renamed from: isMigratedFromCm, reason: from getter */
    public final boolean getIsMigratedFromCm() {
        return this.isMigratedFromCm;
    }

    public final boolean isActiveAccount() {
        return this.isActiveAccount;
    }

    /* renamed from: isRoundupBenefitVisible, reason: from getter */
    public final boolean getIsRoundupBenefitVisible() {
        return this.isRoundupBenefitVisible;
    }

    public final boolean getShowRhyReferrals() {
        return this.showRhyReferrals;
    }

    public final UUID getCardId() {
        return this.cardId;
    }

    public final boolean getCanShowTransferCta() {
        return this.isActiveAccount && !isActionBarVisible();
    }

    /* renamed from: getCanShowDebitCardView, reason: from getter */
    public final boolean getIsActiveAccount() {
        return this.isActiveAccount;
    }

    public final String getAccountBalance() {
        BigDecimal cashAvailable;
        RhyAccount rhyAccount = this.spendingAccount;
        if (rhyAccount == null || (cashAvailable = rhyAccount.getCashAvailable()) == null) {
            return null;
        }
        return Money.format$default(new Money(Currencies.USD, cashAvailable), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    private final boolean isGooglePayActionVisible() {
        List<GooglePayTokenInfoWrapper> list;
        if (!this.isActiveAccount) {
            return false;
        }
        PaymentCard paymentCard = this.paymentCard;
        if ((paymentCard != null ? paymentCard.getState() : null) != ApiPaymentCard.State.ACTIVE || (list = this.googlePayTokenList) == null) {
            return false;
        }
        List<GooglePayTokenInfoWrapper> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (GooglePayTokenInfoWrapper googlePayTokenInfoWrapper : list2) {
            if (googlePayTokenInfoWrapper.getTokenState() == 5 || googlePayTokenInfoWrapper.getTokenState() == 2) {
                return false;
            }
        }
        return true;
    }

    public final boolean isAtmMiniFinderVisible() {
        PaymentCard paymentCard;
        return getSpendingAccountType() == RhyOverviewAccountType.RHY && Intrinsics.areEqual(this.isGooglePlayEnabled, Boolean.TRUE) && (paymentCard = this.paymentCard) != null && !paymentCard.isVirtual() && this.isActiveAccount;
    }

    private final boolean isMatchaEnabled() {
        MatchaTreatment matchaTreatment = this.matchaTreatment;
        return (matchaTreatment != null ? matchaTreatment.getRolloutStatus() : null) == ApiMatchaTreatment.RolloutStatus.CAN_INITIATE;
    }

    public final boolean isActionBarVisible() {
        return isMatchaEnabled() && this.spendingAccount != null;
    }

    public final UiEvent<FragmentKey> getShowHistoryExperienceEvent() {
        UiEvent<Unit> uiEvent = this.shouldShowHistoryExperienceEvent;
        if ((uiEvent != null ? uiEvent.consume() : null) != null) {
            return new UiEvent<>(new AccountsHistoryContract.Key(AccountsHistoryAccountTypeFilter.RHY, null, null, null, false, null, 62, null));
        }
        return null;
    }

    public final RhyOverviewBannerState getRhyOverviewBannerState() {
        if (!this.isActiveAccount) {
            return RhyOverviewBannerState.Visible.DeactivatedAccount.INSTANCE;
        }
        if (this.hasZeroBalance) {
            return RhyOverviewBannerState.Visible.FirstTimeFunding.INSTANCE;
        }
        if (this.rhsNoaRedirectStatus instanceof RhsNoaRedirectStatus.PromptRedirect) {
            return new RhyOverviewBannerState.Visible.RhsNoaRedirect((RhsNoaRedirectStatus.PromptRedirect) this.rhsNoaRedirectStatus, this.hasDismissedRhsNoaRedirectPref);
        }
        PaymentCard paymentCard = this.paymentCard;
        if (paymentCard != null && paymentCard.isRestricted()) {
            return RhyOverviewBannerState.Visible.CardRestricted.INSTANCE;
        }
        PaymentCard paymentCard2 = this.paymentCard;
        if (paymentCard2 != null && paymentCard2.isBackordered()) {
            return new RhyOverviewBannerState.Visible.CardBackordered(this.paymentCard);
        }
        PaymentCard paymentCard3 = this.paymentCard;
        if (paymentCard3 != null && paymentCard3.getCanActivate()) {
            return new RhyOverviewBannerState.Visible.ActivateCard(this.paymentCard);
        }
        if (this.hasNegativeBalance) {
            return RhyOverviewBannerState.Visible.NegativeBalance.INSTANCE;
        }
        PaymentCard paymentCard4 = this.paymentCard;
        if ((paymentCard4 != null ? paymentCard4.getState() : null) == ApiPaymentCard.State.ACTIVE && !this.paymentCard.isPinSet()) {
            return new RhyOverviewBannerState.Visible.SetPin(this.paymentCard);
        }
        PaymentCard paymentCard5 = this.paymentCard;
        if ((paymentCard5 != null ? paymentCard5.getState() : null) == ApiPaymentCard.State.CLOSED && this.paymentCard.getCanReportStolen()) {
            return new RhyOverviewBannerState.Visible.UnauthorizedTransaction(this.paymentCard);
        }
        PaymentCard paymentCard6 = this.paymentCard;
        return (paymentCard6 == null || !paymentCard6.isDisabled()) ? (!isGooglePayActionVisible() || this.addToGooglePayTapped) ? RhyOverviewBannerState.Hidden.INSTANCE : RhyOverviewBannerState.Visible.AddToGooglePay.INSTANCE : RhyOverviewBannerState.Visible.CardLocked.INSTANCE;
    }

    public final IntentKey getDirectDepositRowIntentKey() {
        Boolean bool = this.hasDirectDepositRelationships;
        if (bool == null || this.hasEnrolledInEarlyPay == null || this.hasSetupDirectDepositSwitcher == null) {
            return null;
        }
        if (bool.booleanValue() || this.hasEnrolledInEarlyPay.booleanValue() || this.hasSetupDirectDepositSwitcher.booleanValue()) {
            return new HostIntentKey.ShowFragmentInTab(LegacyFragmentKey.PaycheckHub.INSTANCE, true, false, null, 12, null);
        }
        return new DirectDepositShimKey(false, false, false, false, false, false, false, false, 255, null);
    }

    public final IacInfoBanner getIacInfoBannerData() {
        return this.iacInfoBannerData;
    }

    /* renamed from: isBrokerageAccountInReview, reason: from getter */
    public final Boolean getIsBrokerageAccountInReview() {
        return this.isBrokerageAccountInReview;
    }

    public final List<CashCardOffer> getCashCardOffers() {
        return this.cashCardOffers;
    }

    public final boolean getShouldShowMerchantOffers() {
        List<CashCardOffer> list;
        if (getSpendingAccountType() == RhyOverviewAccountType.RHY_NO_DEBIT_CARD) {
            return (!Intrinsics.areEqual(this.isInP2pUpsellExperiment, Boolean.TRUE) || (list = this.cashCardOffers) == null || list.isEmpty()) ? false : true;
        }
        List<CashCardOffer> list2 = this.cashCardOffers;
        return (list2 == null || list2.isEmpty()) ? false : true;
    }

    public final List<MerchantOfferV2> getMoreMerchantOffers() {
        return this.moreMerchantOffers;
    }

    public final boolean getHasPendingDeposits() {
        return this.hasPendingDeposits;
    }

    public final StringResource getPendingLabelValue() {
        return this.pendingLabelValue;
    }

    public final StringResource getPendingLabelSuffix() {
        return this.pendingLabelSuffix;
    }

    private final UiEvent<BottomSheetType> getShowRhsNoaRedirectWarningSheet() {
        RhsNoaRedirectStatus rhsNoaRedirectStatus = this.rhsNoaRedirectStatus;
        if ((rhsNoaRedirectStatus instanceof RhsNoaRedirectStatus.PromptRedirect) && ((RhsNoaRedirectStatus.PromptRedirect) rhsNoaRedirectStatus).getShowSheet() && this.shouldShowRhsNoaRedirectWarningSheet.consume() != null) {
            return new UiEvent<>(new BottomSheetType.NoaRedirectBottomSheet((RhsNoaRedirectStatus.PromptRedirect) this.rhsNoaRedirectStatus));
        }
        return null;
    }

    private final BottomSheetType getShowRhsNoaRedirectWarningSheet2() {
        RhsNoaRedirectStatus rhsNoaRedirectStatus = this.rhsNoaRedirectStatus;
        if ((rhsNoaRedirectStatus instanceof RhsNoaRedirectStatus.PromptRedirect) && ((RhsNoaRedirectStatus.PromptRedirect) rhsNoaRedirectStatus).getShowSheet() && this.shouldShowRhsNoaRedirectWarningSheet.consume() != null) {
            return new BottomSheetType.NoaRedirectBottomSheet((RhsNoaRedirectStatus.PromptRedirect) this.rhsNoaRedirectStatus);
        }
        return null;
    }

    public final UiEvent<BottomSheetType> getShowCashCushionUpsellEvent() {
        CashCushionStatus cashCushionStatus = this.cashCushionStatus;
        if (cashCushionStatus != null && !cashCushionStatus.getEnabled() && getSpendingAccountType() == RhyOverviewAccountType.RHY && Intrinsics.areEqual(this.hasSeenCashCushionUpsell, Boolean.FALSE)) {
            UiEvent<Unit> uiEvent = this.shouldShowCashCushionUpsellEvent;
            if ((uiEvent != null ? uiEvent.consume() : null) != null) {
                return new UiEvent<>(BottomSheetType.CashCushionBottomSheet.INSTANCE);
            }
        }
        return null;
    }

    private final BottomSheetType getShowCashCushionUpsellEvent2() {
        CashCushionStatus cashCushionStatus = this.cashCushionStatus;
        if (cashCushionStatus == null || cashCushionStatus.getEnabled() || getSpendingAccountType() != RhyOverviewAccountType.RHY || !Intrinsics.areEqual(this.hasSeenCashCushionUpsell, Boolean.FALSE)) {
            return null;
        }
        return BottomSheetType.CashCushionBottomSheet.INSTANCE;
    }

    private final UiEvent<BottomSheetType> getShowFlatCashbackUpsellEvent() {
        MerchantOfferV2 merchantOfferV2;
        Object next;
        List<MerchantOfferV2> list = this.allMerchantOffers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(String.valueOf(((MerchantOfferV2) next).getGlobalOfferId()), MerchantRewardsOfferDetailsBottomSheet.GAS_GROCERIES_OFFER)) {
                    break;
                }
            }
            merchantOfferV2 = (MerchantOfferV2) next;
        } else {
            merchantOfferV2 = null;
        }
        if ((merchantOfferV2 != null ? Intrinsics.areEqual(merchantOfferV2.getLocked(), Boolean.TRUE) : false) && Intrinsics.areEqual(this.isInFlatCashbackExperiment, Boolean.TRUE) && getSpendingAccountType() == RhyOverviewAccountType.RHY && Intrinsics.areEqual(this.hasSeenFlatCashbackUpsell, Boolean.FALSE)) {
            UiEvent<Unit> uiEvent = this.shouldShowFlatCashbackUpsellEvent;
            if ((uiEvent != null ? uiEvent.consume() : null) != null) {
                return new UiEvent<>(BottomSheetType.FlatCashbackBottomSheet.INSTANCE);
            }
        }
        return null;
    }

    public final UiEvent<BottomSheetType> getShowBottomSheet() {
        List<UiEvent> listListOf = CollectionsKt.listOf((Object[]) new UiEvent[]{getShowRhsNoaRedirectWarningSheet(), this.showFundingBottomSheetEvent, getShowFlatCashbackUpsellEvent(), getShowDebitSpendUpsellEvent(), getShowCashCushionUpsellEvent()});
        ArrayList arrayList = new ArrayList();
        for (UiEvent uiEvent : listListOf) {
            BottomSheetType bottomSheetType = uiEvent != null ? (BottomSheetType) uiEvent.consume() : null;
            if (bottomSheetType != null) {
                arrayList.add(bottomSheetType);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new UiEvent((BottomSheetType) it.next()));
        }
        return (UiEvent) CollectionsKt.firstOrNull((List) arrayList2);
    }

    public final List<BottomSheetType> getDialogsReadyToShowList() {
        return CollectionsKt.listOfNotNull((Object[]) new BottomSheetType[]{getShowRhsNoaRedirectWarningSheet2(), (Intrinsics.areEqual(this.showFundingBottomSheet, Boolean.TRUE) && this.isActiveAccount) ? BottomSheetType.FundingBottomSheet.INSTANCE : null, getShowDebitSpendUpsellEvent2(), getShowCashCushionUpsellEvent2()});
    }

    private final UiEvent<BottomSheetType> getShowDebitSpendUpsellEvent() {
        Integer num;
        UUID globalOfferId;
        MerchantOfferV2 merchantOfferV2 = this.debitSpendingOffer;
        String string2 = (merchantOfferV2 == null || (globalOfferId = merchantOfferV2.getGlobalOfferId()) == null) ? null : globalOfferId.toString();
        if (Intrinsics.areEqual(string2, MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.ONE_PERCENT_OFFER.getOfferId()) || Intrinsics.areEqual(string2, MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.ONE_PERCENT_RAD_OFFER.getOfferId())) {
            num = 1;
        } else if (Intrinsics.areEqual(string2, MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.TWO_PERCENT_OFFER.getOfferId()) || Intrinsics.areEqual(string2, MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.TWO_PERCENT_RAD_OFFER.getOfferId())) {
            num = 2;
        } else {
            num = Intrinsics.areEqual(string2, MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.FIRST_SPEND_OFFER.getOfferId()) ? 0 : null;
        }
        if (this.debitSpendTextResources == null || this.debitSpendingOffer == null || num == null) {
            return null;
        }
        UiEvent<Unit> uiEvent = this.shouldShowDebitSpendPopup;
        if ((uiEvent != null ? uiEvent.consume() : null) != null) {
            return new UiEvent<>(new BottomSheetType.DebitSpendBottomSheet(this.debitSpendingOffer, num.intValue(), this.debitSpendTextResources));
        }
        return null;
    }

    private final BottomSheetType getShowDebitSpendUpsellEvent2() {
        Integer num;
        UUID globalOfferId;
        MerchantOfferV2 merchantOfferV2 = this.debitSpendingOffer;
        String string2 = (merchantOfferV2 == null || (globalOfferId = merchantOfferV2.getGlobalOfferId()) == null) ? null : globalOfferId.toString();
        if (Intrinsics.areEqual(string2, MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.ONE_PERCENT_OFFER.getOfferId()) || Intrinsics.areEqual(string2, MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.ONE_PERCENT_RAD_OFFER.getOfferId())) {
            num = 1;
        } else if (Intrinsics.areEqual(string2, MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.TWO_PERCENT_OFFER.getOfferId()) || Intrinsics.areEqual(string2, MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.TWO_PERCENT_RAD_OFFER.getOfferId())) {
            num = 2;
        } else {
            num = Intrinsics.areEqual(string2, MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.FIRST_SPEND_OFFER.getOfferId()) ? 0 : null;
        }
        if (this.debitSpendTextResources == null || this.debitSpendingOffer == null || num == null || !Intrinsics.areEqual(this.hasSeenDebitSpendPopup, Boolean.FALSE)) {
            return null;
        }
        return new BottomSheetType.DebitSpendBottomSheet(this.debitSpendingOffer, num.intValue(), this.debitSpendTextResources);
    }

    private final RhyOverviewAccountType getSpendingAccountType() {
        MinervaAccount minervaAccount = this.minervaSpendingAccount;
        if (minervaAccount != null && this.spendingAccount != null) {
            return RhyOverviewAccountType.RHY;
        }
        if (minervaAccount == null && this.spendingAccount != null) {
            return RhyOverviewAccountType.RHY_NO_DEBIT_CARD;
        }
        if (this.minervaBrokerageAccount != null && minervaAccount == null && this.spendingAccount == null) {
            return RhyOverviewAccountType.CASH_MANAGEMENT;
        }
        return RhyOverviewAccountType.NONE;
    }

    /* compiled from: RhyOverviewV2ViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType;", "", "<init>", "()V", "FundingBottomSheet", "NoaRedirectBottomSheet", "CashCushionBottomSheet", "DebitSpendBottomSheet", "FlatCashbackBottomSheet", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType$CashCushionBottomSheet;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType$DebitSpendBottomSheet;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType$FlatCashbackBottomSheet;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType$FundingBottomSheet;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType$NoaRedirectBottomSheet;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class BottomSheetType {
        public static final int $stable = 0;

        public /* synthetic */ BottomSheetType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BottomSheetType() {
        }

        /* compiled from: RhyOverviewV2ViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType$FundingBottomSheet;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class FundingBottomSheet extends BottomSheetType {
            public static final int $stable = 0;
            public static final FundingBottomSheet INSTANCE = new FundingBottomSheet();

            private FundingBottomSheet() {
                super(null);
            }
        }

        /* compiled from: RhyOverviewV2ViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType$NoaRedirectBottomSheet;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType;", "prompt", "Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;", "<init>", "(Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;)V", "getPrompt", "()Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoaRedirectBottomSheet extends BottomSheetType {
            public static final int $stable = 8;
            private final RhsNoaRedirectStatus.PromptRedirect prompt;

            public static /* synthetic */ NoaRedirectBottomSheet copy$default(NoaRedirectBottomSheet noaRedirectBottomSheet, RhsNoaRedirectStatus.PromptRedirect promptRedirect, int i, Object obj) {
                if ((i & 1) != 0) {
                    promptRedirect = noaRedirectBottomSheet.prompt;
                }
                return noaRedirectBottomSheet.copy(promptRedirect);
            }

            /* renamed from: component1, reason: from getter */
            public final RhsNoaRedirectStatus.PromptRedirect getPrompt() {
                return this.prompt;
            }

            public final NoaRedirectBottomSheet copy(RhsNoaRedirectStatus.PromptRedirect prompt) {
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                return new NoaRedirectBottomSheet(prompt);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoaRedirectBottomSheet) && Intrinsics.areEqual(this.prompt, ((NoaRedirectBottomSheet) other).prompt);
            }

            public int hashCode() {
                return this.prompt.hashCode();
            }

            public String toString() {
                return "NoaRedirectBottomSheet(prompt=" + this.prompt + ")";
            }

            public final RhsNoaRedirectStatus.PromptRedirect getPrompt() {
                return this.prompt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoaRedirectBottomSheet(RhsNoaRedirectStatus.PromptRedirect prompt) {
                super(null);
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                this.prompt = prompt;
            }
        }

        /* compiled from: RhyOverviewV2ViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType$CashCushionBottomSheet;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CashCushionBottomSheet extends BottomSheetType {
            public static final int $stable = 0;
            public static final CashCushionBottomSheet INSTANCE = new CashCushionBottomSheet();

            private CashCushionBottomSheet() {
                super(null);
            }
        }

        /* compiled from: RhyOverviewV2ViewState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType$DebitSpendBottomSheet;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType;", "offer", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "percentage", "", "content", "Lcom/robinhood/staticcontent/model/MobileContentPage;", "<init>", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;ILcom/robinhood/staticcontent/model/MobileContentPage;)V", "getOffer", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "getPercentage", "()I", "getContent", "()Lcom/robinhood/staticcontent/model/MobileContentPage;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DebitSpendBottomSheet extends BottomSheetType {
            public static final int $stable = 8;
            private final MobileContentPage content;
            private final MerchantOfferV2 offer;
            private final int percentage;

            public static /* synthetic */ DebitSpendBottomSheet copy$default(DebitSpendBottomSheet debitSpendBottomSheet, MerchantOfferV2 merchantOfferV2, int i, MobileContentPage mobileContentPage, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    merchantOfferV2 = debitSpendBottomSheet.offer;
                }
                if ((i2 & 2) != 0) {
                    i = debitSpendBottomSheet.percentage;
                }
                if ((i2 & 4) != 0) {
                    mobileContentPage = debitSpendBottomSheet.content;
                }
                return debitSpendBottomSheet.copy(merchantOfferV2, i, mobileContentPage);
            }

            /* renamed from: component1, reason: from getter */
            public final MerchantOfferV2 getOffer() {
                return this.offer;
            }

            /* renamed from: component2, reason: from getter */
            public final int getPercentage() {
                return this.percentage;
            }

            /* renamed from: component3, reason: from getter */
            public final MobileContentPage getContent() {
                return this.content;
            }

            public final DebitSpendBottomSheet copy(MerchantOfferV2 offer, int percentage, MobileContentPage content) {
                Intrinsics.checkNotNullParameter(offer, "offer");
                Intrinsics.checkNotNullParameter(content, "content");
                return new DebitSpendBottomSheet(offer, percentage, content);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DebitSpendBottomSheet)) {
                    return false;
                }
                DebitSpendBottomSheet debitSpendBottomSheet = (DebitSpendBottomSheet) other;
                return Intrinsics.areEqual(this.offer, debitSpendBottomSheet.offer) && this.percentage == debitSpendBottomSheet.percentage && Intrinsics.areEqual(this.content, debitSpendBottomSheet.content);
            }

            public int hashCode() {
                return (((this.offer.hashCode() * 31) + Integer.hashCode(this.percentage)) * 31) + this.content.hashCode();
            }

            public String toString() {
                return "DebitSpendBottomSheet(offer=" + this.offer + ", percentage=" + this.percentage + ", content=" + this.content + ")";
            }

            public final MerchantOfferV2 getOffer() {
                return this.offer;
            }

            public final int getPercentage() {
                return this.percentage;
            }

            public final MobileContentPage getContent() {
                return this.content;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DebitSpendBottomSheet(MerchantOfferV2 offer, int i, MobileContentPage content) {
                super(null);
                Intrinsics.checkNotNullParameter(offer, "offer");
                Intrinsics.checkNotNullParameter(content, "content");
                this.offer = offer;
                this.percentage = i;
                this.content = content;
            }
        }

        /* compiled from: RhyOverviewV2ViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType$FlatCashbackBottomSheet;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState$BottomSheetType;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class FlatCashbackBottomSheet extends BottomSheetType {
            public static final int $stable = 0;
            public static final FlatCashbackBottomSheet INSTANCE = new FlatCashbackBottomSheet();

            private FlatCashbackBottomSheet() {
                super(null);
            }
        }
    }
}
