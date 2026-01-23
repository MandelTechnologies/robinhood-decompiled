package com.robinhood.android.crypto.p094ui.detail.position;

import android.content.res.Resources;
import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionState;
import com.robinhood.android.crypto.p094ui.view.CryptoDetailTransferActionState;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.api.ApiCurrency;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.crypto.p314db.CryptoPositionDetails;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Cryptobility;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding2;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.p347db.BannerComponent;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import md_server_proxy.service.p483v1.QuoteDetailDataDto;
import md_server_proxy.service.p483v1.TokenizedStockQuoteDto;
import p479j$.time.LocalDate;
import p479j$.time.Month;

/* compiled from: CryptoPositionDataState.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u009c\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÂ\u0003¢\u0006\u0004\b&\u0010'J\u0017\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b+\u0010,J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00103\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00106\u001a\u0004\u0018\u00010\u0010HÀ\u0003¢\u0006\u0004\b4\u00105J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u0010;\u001a\u00020\u0015HÀ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010=\u001a\u00020\u0015HÀ\u0003¢\u0006\u0004\b<\u0010:J\u0010\u0010?\u001a\u00020\u0015HÀ\u0003¢\u0006\u0004\b>\u0010:J\u0012\u0010B\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bC\u0010:J´\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010G\u001a\u00020FHÖ\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010J\u001a\u00020IHÖ\u0001¢\u0006\u0004\bJ\u0010KJ\u001a\u0010M\u001a\u00020\u00152\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010OR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010PR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010Q\u001a\u0004\bR\u0010/R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010SR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010TR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\bV\u00102R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010WR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108AX\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010X\u001a\u0004\bY\u00105R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010Z\u001a\u0004\b[\u00108R\u001a\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b]\u0010:R\u001a\u0010\u0017\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\\\u001a\u0004\b^\u0010:R\u001a\u0010\u0018\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\\\u001a\u0004\b_\u0010:R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010`\u001a\u0004\ba\u0010AR\u0017\u0010\u001b\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\\\u001a\u0004\b\u001b\u0010:R\u0016\u0010c\u001a\u0004\u0018\u00010b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001c\u0010j\u001a\u0004\u0018\u00010e8@X\u0081\u0004¢\u0006\f\u0012\u0004\bh\u0010i\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010HR\u0011\u0010m\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bm\u0010:R\u0014\u0010o\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010:R\u0016\u0010s\u001a\u0004\u0018\u00010p8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bt\u0010:R\u0014\u0010w\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bv\u0010:R\u0014\u0010y\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bx\u0010:R\u0014\u0010|\u001a\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b}\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020F8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010HR\u0019\u0010\u0083\u0001\u001a\u0004\u0018\u00010b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0085\u0001\u001a\u00020F8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010HR\u0019\u0010\u0087\u0001\u001a\u0004\u0018\u00010b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0082\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u008d\u0001\u001a\u00020*8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010{R\u001a\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0097\u0001\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010:R\u0015\u0010\u009b\u0001\u001a\u00030\u0098\u00018F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009d\u0001"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;", "", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "cryptoHolding", "Lcom/robinhood/models/crypto/db/CryptoPositionDetails;", "cryptoPositionDetails", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "cryptoQuote", "Lcom/robinhood/models/crypto/db/Cryptobility;", "cryptobility", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "currencyPair", "Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "quote", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "unifiedAccount", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "amountAvailableInfoScreen", "", "hasDismissedPnlUnavailableBanner", "hasDismissedPnlPendingBanner", "hasSeenAvgCostReturnOptimizedTooltip", "j$/time/LocalDate", "currentDate", "isCryptoUsCostBasisExperimentEnabled", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/models/crypto/ui/UiCryptoHolding;Lcom/robinhood/models/crypto/db/CryptoPositionDetails;Lcom/robinhood/models/crypto/db/CryptoQuote;Lcom/robinhood/models/crypto/db/Cryptobility;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lmd_server_proxy/service/v1/QuoteDetailDataDto;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;ZZZLj$/time/LocalDate;Z)V", "component1", "()Lcom/robinhood/shared/app/type/AppType;", "component2", "()Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "component4", "()Lcom/robinhood/models/crypto/db/CryptoQuote;", "component5", "()Lcom/robinhood/models/crypto/db/Cryptobility;", "component7", "()Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "Landroid/content/res/Resources;", "resources", "Landroidx/compose/ui/text/AnnotatedString;", "averageCost$feature_crypto_externalDebug", "(Landroid/content/res/Resources;)Landroidx/compose/ui/text/AnnotatedString;", "averageCost", "component3$feature_crypto_externalDebug", "()Lcom/robinhood/models/crypto/db/CryptoPositionDetails;", "component3", "component6$feature_crypto_externalDebug", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "component6", "component8$feature_crypto_externalDebug", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "component8", "component9", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component10$feature_crypto_externalDebug", "()Z", "component10", "component11$feature_crypto_externalDebug", "component11", "component12$feature_crypto_externalDebug", "component12", "component13$feature_crypto_externalDebug", "()Lj$/time/LocalDate;", "component13", "component14", "copy", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/models/crypto/ui/UiCryptoHolding;Lcom/robinhood/models/crypto/db/CryptoPositionDetails;Lcom/robinhood/models/crypto/db/CryptoQuote;Lcom/robinhood/models/crypto/db/Cryptobility;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lmd_server_proxy/service/v1/QuoteDetailDataDto;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;ZZZLj$/time/LocalDate;Z)Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/shared/app/type/AppType;", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "Lcom/robinhood/models/crypto/db/CryptoPositionDetails;", "getCryptoPositionDetails$feature_crypto_externalDebug", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "Lcom/robinhood/models/crypto/db/Cryptobility;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCurrencyPair$feature_crypto_externalDebug", "Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getUnifiedAccount$feature_crypto_externalDebug", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getAmountAvailableInfoScreen", "Z", "getHasDismissedPnlUnavailableBanner$feature_crypto_externalDebug", "getHasDismissedPnlPendingBanner$feature_crypto_externalDebug", "getHasSeenAvgCostReturnOptimizedTooltip$feature_crypto_externalDebug", "Lj$/time/LocalDate;", "getCurrentDate$feature_crypto_externalDebug", "Ljava/math/BigDecimal;", "markPrice", "Ljava/math/BigDecimal;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;", "getPositionBannerType$feature_crypto_externalDebug", "()Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;", "getPositionBannerType$feature_crypto_externalDebug$annotations", "()V", "positionBannerType", "getContentfulId", "contentfulId", "isVisible", "isRhc$feature_crypto_externalDebug", "isRhc", "Ljava/util/UUID;", "getCurrencyPairId$feature_crypto_externalDebug", "()Ljava/util/UUID;", "currencyPairId", "getAreHoldingRowsVisible$feature_crypto_externalDebug", "areHoldingRowsVisible", "isPortfolioDiversityRowVisible$feature_crypto_externalDebug", "isPortfolioDiversityRowVisible", "isCryptoBalanceIconVisible$feature_crypto_externalDebug", "isCryptoBalanceIconVisible", "getEquity$feature_crypto_externalDebug", "()Landroidx/compose/ui/text/AnnotatedString;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "getQuantity$feature_crypto_externalDebug", "quantity", "getTodaysReturn$feature_crypto_externalDebug", "todaysReturn", "getTodaysReturnPercentage$feature_crypto_externalDebug", "()Ljava/math/BigDecimal;", "todaysReturnPercentage", "getTotalReturn$feature_crypto_externalDebug", "totalReturn", "getTotalReturnPercentage$feature_crypto_externalDebug", "totalReturnPercentage", "", "getDiversityPercentage$feature_crypto_externalDebug", "()F", "diversityPercentage", "getPortfolioDiversity$feature_crypto_externalDebug", "portfolioDiversity", "Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;", "getTransferActionState$feature_crypto_externalDebug", "()Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;", "transferActionState", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingScreen$feature_crypto_externalDebug", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingScreen", "getShouldDisplayAvgCostReturnOptimizedTooltip$feature_crypto_externalDebug", "shouldDisplayAvgCostReturnOptimizedTooltip", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState$PassThrough;", "getPassThrough", "()Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState$PassThrough;", "passThrough", "PassThrough", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoPositionDataState {
    public static final int $stable = 8;
    private final GenericAlertContent<GenericAction> amountAvailableInfoScreen;
    private final AppType appType;
    private final UiCryptoHolding cryptoHolding;
    private final CryptoPositionDetails cryptoPositionDetails;
    private final CryptoQuote cryptoQuote;
    private final Cryptobility cryptobility;
    private final UiCurrencyPair currencyPair;
    private final LocalDate currentDate;
    private final boolean hasDismissedPnlPendingBanner;
    private final boolean hasDismissedPnlUnavailableBanner;
    private final boolean hasSeenAvgCostReturnOptimizedTooltip;
    private final boolean isCryptoUsCostBasisExperimentEnabled;
    private final BigDecimal markPrice;
    private final QuoteDetailDataDto quote;
    private final UnifiedAccountV2 unifiedAccount;

    /* compiled from: CryptoPositionDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiCurrency.Type.values().length];
            try {
                iArr[ApiCurrency.Type.TOKENIZED_STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCurrency.Type.CRYPTOCURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoPositionDetails.AverageCostTotalReturnStatus.values().length];
            try {
                iArr2[CryptoPositionDetails.AverageCostTotalReturnStatus.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoPositionDetails.AverageCostTotalReturnStatus.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CryptoPositionDetails.AverageCostTotalReturnStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    private final UiCryptoHolding getCryptoHolding() {
        return this.cryptoHolding;
    }

    /* renamed from: component4, reason: from getter */
    private final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    /* renamed from: component5, reason: from getter */
    private final Cryptobility getCryptobility() {
        return this.cryptobility;
    }

    /* renamed from: component7, reason: from getter */
    private final QuoteDetailDataDto getQuote() {
        return this.quote;
    }

    public static /* synthetic */ void getPositionBannerType$feature_crypto_externalDebug$annotations() {
    }

    /* renamed from: component10$feature_crypto_externalDebug, reason: from getter */
    public final boolean getHasDismissedPnlUnavailableBanner() {
        return this.hasDismissedPnlUnavailableBanner;
    }

    /* renamed from: component11$feature_crypto_externalDebug, reason: from getter */
    public final boolean getHasDismissedPnlPendingBanner() {
        return this.hasDismissedPnlPendingBanner;
    }

    /* renamed from: component12$feature_crypto_externalDebug, reason: from getter */
    public final boolean getHasSeenAvgCostReturnOptimizedTooltip() {
        return this.hasSeenAvgCostReturnOptimizedTooltip;
    }

    /* renamed from: component13$feature_crypto_externalDebug, reason: from getter */
    public final LocalDate getCurrentDate() {
        return this.currentDate;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsCryptoUsCostBasisExperimentEnabled() {
        return this.isCryptoUsCostBasisExperimentEnabled;
    }

    /* renamed from: component3$feature_crypto_externalDebug, reason: from getter */
    public final CryptoPositionDetails getCryptoPositionDetails() {
        return this.cryptoPositionDetails;
    }

    /* renamed from: component6$feature_crypto_externalDebug, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component8$feature_crypto_externalDebug, reason: from getter */
    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public final GenericAlertContent<GenericAction> component9() {
        return this.amountAvailableInfoScreen;
    }

    public final CryptoPositionDataState copy(AppType appType, UiCryptoHolding cryptoHolding, CryptoPositionDetails cryptoPositionDetails, CryptoQuote cryptoQuote, Cryptobility cryptobility, UiCurrencyPair currencyPair, QuoteDetailDataDto quote, UnifiedAccountV2 unifiedAccount, GenericAlertContent<? extends GenericAction> amountAvailableInfoScreen, boolean hasDismissedPnlUnavailableBanner, boolean hasDismissedPnlPendingBanner, boolean hasSeenAvgCostReturnOptimizedTooltip, LocalDate currentDate, boolean isCryptoUsCostBasisExperimentEnabled) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new CryptoPositionDataState(appType, cryptoHolding, cryptoPositionDetails, cryptoQuote, cryptobility, currencyPair, quote, unifiedAccount, amountAvailableInfoScreen, hasDismissedPnlUnavailableBanner, hasDismissedPnlPendingBanner, hasSeenAvgCostReturnOptimizedTooltip, currentDate, isCryptoUsCostBasisExperimentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPositionDataState)) {
            return false;
        }
        CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) other;
        return this.appType == cryptoPositionDataState.appType && Intrinsics.areEqual(this.cryptoHolding, cryptoPositionDataState.cryptoHolding) && Intrinsics.areEqual(this.cryptoPositionDetails, cryptoPositionDataState.cryptoPositionDetails) && Intrinsics.areEqual(this.cryptoQuote, cryptoPositionDataState.cryptoQuote) && Intrinsics.areEqual(this.cryptobility, cryptoPositionDataState.cryptobility) && Intrinsics.areEqual(this.currencyPair, cryptoPositionDataState.currencyPair) && Intrinsics.areEqual(this.quote, cryptoPositionDataState.quote) && Intrinsics.areEqual(this.unifiedAccount, cryptoPositionDataState.unifiedAccount) && Intrinsics.areEqual(this.amountAvailableInfoScreen, cryptoPositionDataState.amountAvailableInfoScreen) && this.hasDismissedPnlUnavailableBanner == cryptoPositionDataState.hasDismissedPnlUnavailableBanner && this.hasDismissedPnlPendingBanner == cryptoPositionDataState.hasDismissedPnlPendingBanner && this.hasSeenAvgCostReturnOptimizedTooltip == cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip && Intrinsics.areEqual(this.currentDate, cryptoPositionDataState.currentDate) && this.isCryptoUsCostBasisExperimentEnabled == cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled;
    }

    public int hashCode() {
        int iHashCode = this.appType.hashCode() * 31;
        UiCryptoHolding uiCryptoHolding = this.cryptoHolding;
        int iHashCode2 = (iHashCode + (uiCryptoHolding == null ? 0 : uiCryptoHolding.hashCode())) * 31;
        CryptoPositionDetails cryptoPositionDetails = this.cryptoPositionDetails;
        int iHashCode3 = (iHashCode2 + (cryptoPositionDetails == null ? 0 : cryptoPositionDetails.hashCode())) * 31;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        int iHashCode4 = (iHashCode3 + (cryptoQuote == null ? 0 : cryptoQuote.hashCode())) * 31;
        Cryptobility cryptobility = this.cryptobility;
        int iHashCode5 = (iHashCode4 + (cryptobility == null ? 0 : cryptobility.hashCode())) * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode6 = (iHashCode5 + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        QuoteDetailDataDto quoteDetailDataDto = this.quote;
        int iHashCode7 = (iHashCode6 + (quoteDetailDataDto == null ? 0 : quoteDetailDataDto.hashCode())) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        int iHashCode8 = (iHashCode7 + (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode())) * 31;
        GenericAlertContent<GenericAction> genericAlertContent = this.amountAvailableInfoScreen;
        int iHashCode9 = (((((((iHashCode8 + (genericAlertContent == null ? 0 : genericAlertContent.hashCode())) * 31) + Boolean.hashCode(this.hasDismissedPnlUnavailableBanner)) * 31) + Boolean.hashCode(this.hasDismissedPnlPendingBanner)) * 31) + Boolean.hashCode(this.hasSeenAvgCostReturnOptimizedTooltip)) * 31;
        LocalDate localDate = this.currentDate;
        return ((iHashCode9 + (localDate != null ? localDate.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCryptoUsCostBasisExperimentEnabled);
    }

    public String toString() {
        return "CryptoPositionDataState(appType=" + this.appType + ", cryptoHolding=" + this.cryptoHolding + ", cryptoPositionDetails=" + this.cryptoPositionDetails + ", cryptoQuote=" + this.cryptoQuote + ", cryptobility=" + this.cryptobility + ", currencyPair=" + this.currencyPair + ", quote=" + this.quote + ", unifiedAccount=" + this.unifiedAccount + ", amountAvailableInfoScreen=" + this.amountAvailableInfoScreen + ", hasDismissedPnlUnavailableBanner=" + this.hasDismissedPnlUnavailableBanner + ", hasDismissedPnlPendingBanner=" + this.hasDismissedPnlPendingBanner + ", hasSeenAvgCostReturnOptimizedTooltip=" + this.hasSeenAvgCostReturnOptimizedTooltip + ", currentDate=" + this.currentDate + ", isCryptoUsCostBasisExperimentEnabled=" + this.isCryptoUsCostBasisExperimentEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoPositionDataState(AppType appType, UiCryptoHolding uiCryptoHolding, CryptoPositionDetails cryptoPositionDetails, CryptoQuote cryptoQuote, Cryptobility cryptobility, UiCurrencyPair uiCurrencyPair, QuoteDetailDataDto quoteDetailDataDto, UnifiedAccountV2 unifiedAccountV2, GenericAlertContent<? extends GenericAction> genericAlertContent, boolean z, boolean z2, boolean z3, LocalDate localDate, boolean z4) {
        Money markPrice;
        TokenizedStockQuoteDto tokenized_stock_quote;
        IdlDecimal mark_price;
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
        this.cryptoHolding = uiCryptoHolding;
        this.cryptoPositionDetails = cryptoPositionDetails;
        this.cryptoQuote = cryptoQuote;
        this.cryptobility = cryptobility;
        this.currencyPair = uiCurrencyPair;
        this.quote = quoteDetailDataDto;
        this.unifiedAccount = unifiedAccountV2;
        this.amountAvailableInfoScreen = genericAlertContent;
        this.hasDismissedPnlUnavailableBanner = z;
        this.hasDismissedPnlPendingBanner = z2;
        this.hasSeenAvgCostReturnOptimizedTooltip = z3;
        this.currentDate = localDate;
        this.isCryptoUsCostBasisExperimentEnabled = z4;
        BigDecimal bigDecimalCompat = null;
        if (uiCurrencyPair == null || !uiCurrencyPair.isTokenizedStock()) {
            if (cryptoQuote != null && (markPrice = cryptoQuote.getMarkPrice()) != null) {
                bigDecimalCompat = Money3.getBigDecimalCompat(markPrice);
            }
        } else if (quoteDetailDataDto != null && (tokenized_stock_quote = quoteDetailDataDto.getTokenized_stock_quote()) != null && (mark_price = tokenized_stock_quote.getMark_price()) != null) {
            bigDecimalCompat = mark_price.toBigDecimalOrThrow();
        }
        this.markPrice = bigDecimalCompat;
    }

    public /* synthetic */ CryptoPositionDataState(AppType appType, UiCryptoHolding uiCryptoHolding, CryptoPositionDetails cryptoPositionDetails, CryptoQuote cryptoQuote, Cryptobility cryptobility, UiCurrencyPair uiCurrencyPair, QuoteDetailDataDto quoteDetailDataDto, UnifiedAccountV2 unifiedAccountV2, GenericAlertContent genericAlertContent, boolean z, boolean z2, boolean z3, LocalDate localDate, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, (i & 2) != 0 ? null : uiCryptoHolding, (i & 4) != 0 ? null : cryptoPositionDetails, (i & 8) != 0 ? null : cryptoQuote, (i & 16) != 0 ? null : cryptobility, (i & 32) != 0 ? null : uiCurrencyPair, (i & 64) != 0 ? null : quoteDetailDataDto, (i & 128) != 0 ? null : unifiedAccountV2, (i & 256) != 0 ? null : genericAlertContent, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? false : z3, (i & 4096) == 0 ? localDate : null, (i & 8192) != 0 ? false : z4);
    }

    public final CryptoPositionDetails getCryptoPositionDetails$feature_crypto_externalDebug() {
        return this.cryptoPositionDetails;
    }

    public final UiCurrencyPair getCurrencyPair$feature_crypto_externalDebug() {
        return this.currencyPair;
    }

    public final UnifiedAccountV2 getUnifiedAccount$feature_crypto_externalDebug() {
        return this.unifiedAccount;
    }

    public final GenericAlertContent<GenericAction> getAmountAvailableInfoScreen() {
        return this.amountAvailableInfoScreen;
    }

    public final boolean getHasDismissedPnlUnavailableBanner$feature_crypto_externalDebug() {
        return this.hasDismissedPnlUnavailableBanner;
    }

    public final boolean getHasDismissedPnlPendingBanner$feature_crypto_externalDebug() {
        return this.hasDismissedPnlPendingBanner;
    }

    /* renamed from: getHasSeenAvgCostReturnOptimizedTooltip$feature_crypto_externalDebug */
    public final boolean m1905xcebf1a8b() {
        return this.hasSeenAvgCostReturnOptimizedTooltip;
    }

    public final LocalDate getCurrentDate$feature_crypto_externalDebug() {
        return this.currentDate;
    }

    public final boolean isCryptoUsCostBasisExperimentEnabled() {
        return this.isCryptoUsCostBasisExperimentEnabled;
    }

    public final boolean isVisible() {
        CryptoDetailTransferActionState transferActionState$feature_crypto_externalDebug;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        ApiCurrency.Type type2 = uiCurrencyPair != null ? uiCurrencyPair.getType() : null;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i != -1) {
            if (i != 1) {
                return i == 2 && (transferActionState$feature_crypto_externalDebug = getTransferActionState$feature_crypto_externalDebug()) != null && transferActionState$feature_crypto_externalDebug.getIsVisible();
            }
            UiCryptoHolding uiCryptoHolding = this.cryptoHolding;
            if (uiCryptoHolding != null && UiCryptoHolding2.isHeld(uiCryptoHolding)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isRhc$feature_crypto_externalDebug() {
        return this.appType == AppType.RHC;
    }

    public final UUID getCurrencyPairId$feature_crypto_externalDebug() {
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair != null) {
            return uiCurrencyPair.getId();
        }
        return null;
    }

    public final boolean getAreHoldingRowsVisible$feature_crypto_externalDebug() {
        return UiCryptoHolding2.isHeld(this.cryptoHolding);
    }

    public final boolean isPortfolioDiversityRowVisible$feature_crypto_externalDebug() {
        return this.appType != AppType.RHC;
    }

    public final boolean isCryptoBalanceIconVisible$feature_crypto_externalDebug() {
        return this.amountAvailableInfoScreen != null;
    }

    public final String getTodaysReturn$feature_crypto_externalDebug() {
        CryptoPositionDetails cryptoPositionDetails;
        if (this.currencyPair == null || (cryptoPositionDetails = this.cryptoPositionDetails) == null) {
            return "";
        }
        CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus = cryptoPositionDetails.getAverageCostTotalReturnStatus();
        int i = averageCostTotalReturnStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[averageCostTotalReturnStatus.ordinal()];
        if (i == -1) {
            return "";
        }
        if (i == 1) {
            Currency quoteCurrency = this.currencyPair.getQuoteCurrency();
            BigDecimal todayReturn = this.cryptoPositionDetails.getTodayReturn();
            if (todayReturn != null) {
                return CurrencyDefinitions.formatCurrency$default(quoteCurrency, todayReturn, false, false, null, 0, null, null, false, false, false, false, 2046, null);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal todayReturn2 = this.cryptoPositionDetails.getTodayReturn();
        String currency$default = todayReturn2 != null ? CurrencyDefinitions.formatCurrency$default(this.currencyPair.getQuoteCurrency(), todayReturn2, false, false, null, 0, null, null, false, false, false, false, 2046, null) : null;
        return currency$default == null ? "" : currency$default;
    }

    public final BigDecimal getTodaysReturnPercentage$feature_crypto_externalDebug() {
        CryptoPositionDetails cryptoPositionDetails = this.cryptoPositionDetails;
        if (cryptoPositionDetails == null) {
            return null;
        }
        CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus = cryptoPositionDetails.getAverageCostTotalReturnStatus();
        int i = averageCostTotalReturnStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[averageCostTotalReturnStatus.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            BigDecimal todayReturnPercentage = this.cryptoPositionDetails.getTodayReturnPercentage();
            if (todayReturnPercentage != null) {
                return todayReturnPercentage;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i == 2) {
            return this.cryptoPositionDetails.getTodayReturnPercentage();
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getTotalReturn$feature_crypto_externalDebug() {
        Currency quoteCurrency;
        CryptoPositionDetails cryptoPositionDetails;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair == null || (quoteCurrency = uiCurrencyPair.getQuoteCurrency()) == null || (cryptoPositionDetails = this.cryptoPositionDetails) == null) {
            return "";
        }
        CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus = cryptoPositionDetails.getAverageCostTotalReturnStatus();
        if ((averageCostTotalReturnStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[averageCostTotalReturnStatus.ordinal()]) == 1) {
            BigDecimal totalReturn = this.cryptoPositionDetails.getTotalReturn();
            if (totalReturn != null) {
                return CurrencyDefinitions.formatCurrency$default(quoteCurrency, totalReturn, false, false, null, 0, null, null, false, false, false, false, 2046, null);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        return "";
    }

    public final BigDecimal getTotalReturnPercentage$feature_crypto_externalDebug() {
        CryptoPositionDetails cryptoPositionDetails = this.cryptoPositionDetails;
        if (cryptoPositionDetails == null) {
            return null;
        }
        CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus = cryptoPositionDetails.getAverageCostTotalReturnStatus();
        if ((averageCostTotalReturnStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[averageCostTotalReturnStatus.ordinal()]) != 1) {
            return null;
        }
        BigDecimal totalReturnPercentage = this.cryptoPositionDetails.getTotalReturnPercentage();
        if (totalReturnPercentage != null) {
            return totalReturnPercentage;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final float getDiversityPercentage$feature_crypto_externalDebug() {
        BigDecimal bigDecimal;
        Money totalMarketValue;
        com.robinhood.models.serverdriven.experimental.api.Money totalMarketValue2;
        if (this.cryptoHolding == null || (bigDecimal = this.markPrice) == null) {
            return 0.0f;
        }
        if (isRhc$feature_crypto_externalDebug()) {
            if (this.cryptoPositionDetails == null) {
                return 0.0f;
            }
        } else if (this.unifiedAccount == null) {
            return 0.0f;
        }
        BigDecimal decimalValue = null;
        if (isRhc$feature_crypto_externalDebug()) {
            CryptoPositionDetails cryptoPositionDetails = this.cryptoPositionDetails;
            if (cryptoPositionDetails != null && (totalMarketValue2 = cryptoPositionDetails.getTotalMarketValue()) != null) {
                decimalValue = totalMarketValue2.getAmount();
            }
        } else {
            UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
            if (unifiedAccountV2 != null && (totalMarketValue = unifiedAccountV2.getTotalMarketValue()) != null) {
                decimalValue = totalMarketValue.getDecimalValue();
            }
        }
        return Math.min(BigDecimals7.safeDivide(Calculations.getEquity(bigDecimal, this.cryptoHolding), decimalValue).floatValue(), 1.0f);
    }

    public final CryptoDetailTransferActionState getTransferActionState$feature_crypto_externalDebug() {
        if (this.cryptobility == null) {
            return null;
        }
        UUID currencyPairId = this.cryptobility.getCurrencyPairId();
        BannerComponent transferBanner = this.cryptobility.getTransferBanner();
        List<UIComponent<GenericAction>> transferBannerV2 = this.cryptobility.getTransferBannerV2();
        ImmutableList immutableList = transferBannerV2 != null ? extensions2.toImmutableList(transferBannerV2) : null;
        ImmutableList immutableList2 = extensions2.toImmutableList(this.cryptobility.getTransferButtons());
        List<UIComponent<GenericAction>> transferButtonsV2 = this.cryptobility.getTransferButtonsV2();
        return new CryptoDetailTransferActionState(currencyPairId, transferBanner, immutableList, immutableList2, transferButtonsV2 != null ? extensions2.toImmutableList(transferButtonsV2) : null);
    }

    public final Screen getLoggingScreen$feature_crypto_externalDebug() {
        Screen.Name name;
        if (this.currencyPair == null) {
            return null;
        }
        if (this.currencyPair.isTokenizedStock()) {
            name = Screen.Name.TOKENIZED_STOCK_DETAIL_PAGE;
        } else {
            name = Screen.Name.CRYPTO_DETAIL_PAGE;
        }
        Screen.Name name2 = name;
        String string2 = this.currencyPair.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name2, null, string2, null, 10, null);
    }

    public final CryptoPositionState.PositionBannerType getPositionBannerType$feature_crypto_externalDebug() {
        CryptoPositionDetails cryptoPositionDetails = this.cryptoPositionDetails;
        CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus = cryptoPositionDetails != null ? cryptoPositionDetails.getAverageCostTotalReturnStatus() : null;
        int i = averageCostTotalReturnStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[averageCostTotalReturnStatus.ordinal()];
        if (i == 2) {
            CryptoPositionState.PositionBannerType positionBannerType = CryptoPositionState.PositionBannerType.UNAVAILABLE;
            if (this.hasDismissedPnlUnavailableBanner) {
                return null;
            }
            return positionBannerType;
        }
        if (i != 3) {
            return null;
        }
        CryptoPositionState.PositionBannerType positionBannerType2 = CryptoPositionState.PositionBannerType.PENDING;
        if (this.hasDismissedPnlPendingBanner) {
            return null;
        }
        return positionBannerType2;
    }

    /* renamed from: getShouldDisplayAvgCostReturnOptimizedTooltip$feature_crypto_externalDebug */
    public final boolean m1906x95d999e5() {
        LocalDate localDate;
        return this.appType == AppType.TRADER && !this.hasSeenAvgCostReturnOptimizedTooltip && (localDate = this.currentDate) != null && localDate.isBefore(LocalDate.m3378of(2026, Month.JANUARY, 1));
    }

    private final String getContentfulId() {
        if (this.isCryptoUsCostBasisExperimentEnabled) {
            return "68nORpApFOXvpMN9JJNYVO";
        }
        return "2wrLLdbkBN518lst6KGGXy";
    }

    public final PassThrough getPassThrough() {
        return new PassThrough(getContentfulId());
    }

    /* compiled from: CryptoPositionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState$PassThrough;", "", "contentfulId", "", "<init>", "(Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PassThrough {
        public static final int $stable = 0;
        private final String contentfulId;

        public static /* synthetic */ PassThrough copy$default(PassThrough passThrough, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = passThrough.contentfulId;
            }
            return passThrough.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContentfulId() {
            return this.contentfulId;
        }

        public final PassThrough copy(String contentfulId) {
            Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
            return new PassThrough(contentfulId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PassThrough) && Intrinsics.areEqual(this.contentfulId, ((PassThrough) other).contentfulId);
        }

        public int hashCode() {
            return this.contentfulId.hashCode();
        }

        public String toString() {
            return "PassThrough(contentfulId=" + this.contentfulId + ")";
        }

        public PassThrough(String contentfulId) {
            Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
            this.contentfulId = contentfulId;
        }

        public final String getContentfulId() {
            return this.contentfulId;
        }
    }

    public final AnnotatedString averageCost$feature_crypto_externalDebug(Resources resources) throws Resources.NotFoundException {
        CryptoPositionDetails cryptoPositionDetails;
        String currency$default;
        Intrinsics.checkNotNullParameter(resources, "resources");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair != null && (cryptoPositionDetails = this.cryptoPositionDetails) != null) {
            CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus = cryptoPositionDetails.getAverageCostTotalReturnStatus();
            int i = averageCostTotalReturnStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[averageCostTotalReturnStatus.ordinal()];
            if (i == -1) {
                currency$default = "";
            } else if (i == 1) {
                Currency quoteCurrencyForPriceInput = uiCurrencyPair.getQuoteCurrencyForPriceInput();
                BigDecimal averageCost = this.cryptoPositionDetails.getAverageCost();
                if (averageCost == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                currency$default = CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, averageCost, false, false, null, 0, null, null, false, false, false, false, 2046, null);
            } else if (i == 2) {
                currency$default = resources.getString(C12757R.string.crypto_detail_positions_average_cost_unavailable_text);
                Intrinsics.checkNotNullExpressionValue(currency$default, "getString(...)");
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                currency$default = resources.getString(C12757R.string.crypto_detail_positions_average_cost_pending_text);
                Intrinsics.checkNotNullExpressionValue(currency$default, "getString(...)");
            }
            builder.append(currency$default);
        }
        return builder.toAnnotatedString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final AnnotatedString getEquity$feature_crypto_externalDebug() {
        BigDecimal equity;
        Currency quoteCurrency;
        UiCryptoHolding uiCryptoHolding;
        String currency$default = 0;
        currency$default = 0;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, currency$default);
        BigDecimal bigDecimal = this.markPrice;
        if (bigDecimal == null || (uiCryptoHolding = this.cryptoHolding) == null) {
            equity = BigDecimal.ZERO;
        } else {
            equity = Calculations.getEquity(bigDecimal, uiCryptoHolding);
        }
        BigDecimal bigDecimal2 = equity;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair != null && (quoteCurrency = uiCurrencyPair.getQuoteCurrency()) != null) {
            Intrinsics.checkNotNull(bigDecimal2);
            currency$default = CurrencyDefinitions.formatCurrency$default(quoteCurrency, bigDecimal2, true, false, null, 0, null, null, false, false, false, true, 1020, null);
        }
        if (currency$default == 0) {
            currency$default = "";
        }
        builder.append(currency$default);
        return builder.toAnnotatedString();
    }

    public final AnnotatedString getPortfolioDiversity$feature_crypto_externalDebug() {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(FormatsLocalized.getHundredthPercentFormat().format(Float.valueOf(getDiversityPercentage$feature_crypto_externalDebug())));
        return builder.toAnnotatedString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final AnnotatedString getQuantity$feature_crypto_externalDebug() {
        Currency assetCurrencyForDisplay;
        BigDecimal quantity;
        String currency$default = 0;
        currency$default = 0;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, currency$default);
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair != null && (assetCurrencyForDisplay = uiCurrencyPair.getAssetCurrencyForDisplay()) != null) {
            UiCryptoHolding uiCryptoHolding = this.cryptoHolding;
            if (uiCryptoHolding == null || (quantity = uiCryptoHolding.getQuantity()) == null) {
                quantity = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal = quantity;
            Intrinsics.checkNotNull(bigDecimal);
            currency$default = CurrencyDefinitions.formatCurrency$default(assetCurrencyForDisplay, bigDecimal, false, false, RoundingMode.DOWN, 0, null, null, false, false, false, false, 2036, null);
        }
        if (currency$default == 0) {
            currency$default = "";
        }
        builder.append(currency$default);
        return builder.toAnnotatedString();
    }
}
