package com.robinhood.shared.remote.assets;

import android.content.Context;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieListener;
import com.plaid.internal.EnumC7081g;
import com.robinhood.targetbackend.Endpoint;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LottieUrl.kt */
@Metadata(m3635d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0003\bÙ\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010à\u0001\u001a\u00030á\u00012\b\u0010â\u0001\u001a\u00030ã\u0001J\u0019\u0010ä\u0001\u001a\n\u0012\u0005\u0012\u00030æ\u00010å\u00012\b\u0010â\u0001\u001a\u00030ã\u0001R\u0015\u0010Ü\u0001\u001a\u00030Ý\u0001¢\u0006\n\n\u0000\u001a\u0006\bÞ\u0001\u0010ß\u0001j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001¨\u0006ç\u0001"}, m3636d2 = {"Lcom/robinhood/shared/remote/assets/LottieUrl;", "", "pathSegments", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FRACTIONAL_ROCKET", "FIREWORKS", "SLIP_FIREWORK", "DIRECT_DEPOSIT_INTRO", "SECURITY_OAUTH_SPINNER", "INSTANT_BOLT", "ADVANCED_CHART_ONBOARDING", "COMPANY_FINANCIALS_ONBOARDING", "ACATS_INTRO", "ACATS_ELIGIBLE_YES", "ACATS_ELIGIBLE_MAYBE", "ACATS_ELIGIBLE_NO", "ACATS_FEATHER", "CRYPTO_ACATS_INTRO_DARK_LOTTIE", "CRYPTO_ALERTS_NOTIFICATION", "CRYPTO_BOUNCING_BALL", "CRYPTO_TOKEN_GIVEAWAY_LIGHT", "CRYPTO_TOKEN_GIVEAWAY_DARK", "CRYPTO_TRANSFERS_ENROLLMENT_COMPLETED", "CRYPTO_TRANSFERS_ENROLLMENT_PENDING", "CRYPTO_TRANSFERS_ENROLLMENT_ERROR", "CM_SIGN_UP", "CM_DISPUTES_INTRO", "CALL_INTRO_DAY", "CALL_INTRO_NIGHT", "PUT_INTRO_DAY", "PUT_INTRO_NIGHT", "BUY_CALL_DAY", "BUY_CALL_NIGHT", "BUY_PUT_DAY", "BUY_PUT_NIGHT", "SELL_CALL_DAY", "SELL_CALL_NIGHT", "SELL_PUT_DAY", "SELL_PUT_NIGHT", "HORIZONTAL_SPREAD_DAY", "HORIZONTAL_SPREAD_NIGHT", "VERTICAL_SPREAD_DAY", "VERTICAL_SPREAD_NIGHT", "CALENDAR_SPREAD_DAY", "CALENDAR_SPREAD_NIGHT", "CALL_CREDIT_SPREAD_DAY", "CALL_CREDIT_SPREAD_NIGHT", "CALL_DEBIT_SPREAD_DAY", "CALL_DEBIT_SPREAD_NIGHT", "IRON_BUTTERFLY_DAY", "IRON_BUTTERFLY_NIGHT", "IRON_CONDOR_DAY", "IRON_CONDOR_NIGHT", "PUT_CREDIT_SPREAD_DAY", "PUT_CREDIT_SPREAD_NIGHT", "PUT_DEBIT_SPREAD_DAY", "PUT_DEBIT_SPREAD_NIGHT", "OPTIONS_WATCHLIST_FG", "OPTIONS_WATCHLIST_MG", "OPTIONS_WATCHLIST_BG", "OPTIONS_WATCHLIST_LIGHT", "OPTIONS_ALERT_ONBOARDING", "OPTIONS_ONBOARDING_L0_DAY", "OPTIONS_ONBOARDING_L0_NIGHT", "OPTIONS_ONBOARDING_L2_DAY", "OPTIONS_ONBOARDING_L2_NEON", "OPTIONS_ONBOARDING_L2_NIGHT", "OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_DAY", "OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_NIGHT", "OPTIONS_ONBOARDING_ALL_SET_SDP_DAY", "OPTIONS_ONBOARDING_ALL_SET_SDP_NIGHT", "OPTIONS_ONBOARDING_ALL_SET_NON_SDP_DAY", "OPTIONS_ONBOARDING_ALL_SET_NON_SDP_NIGHT", "SUPPORT_CALL_WAITING", "SUPPORT_CALL_CANCELLED", "SUPPORT_CALL_MISSED", "SUPPORT_CALL_ASSIGNED", "SUPPORT_CALL_COMPLETED", "RECS_LANDING_ORB_DAY", "RECS_LANDING_ORB_NIGHT", "RECS_PROGRESSION_ORB_DAY", "RECS_PROGRESSION_ORB_NIGHT", "RECS_RISK_LOADER_DAY", "RECS_RISK_LOADER_NIGHT", "RECS_RISK_INDICATOR_DAY", "RECS_RISK_INDICATOR_NIGHT", "RECS_RISK_SHEEN", "RECS_PORTFOLIO_ASSETS_DAY", "RECS_PORTFOLIO_ASSETS_NIGHT", "RECS_CELEBRATION_DAY", "RECS_CELEBRATION_NIGHT", "RECS_RISK_TO_PORTFOLIO_LV1_DAY", "RECS_RISK_TO_PORTFOLIO_LV1_NIGHT", "RECS_RISK_TO_PORTFOLIO_LV2_DAY", "RECS_RISK_TO_PORTFOLIO_LV2_NIGHT", "RECS_RISK_TO_PORTFOLIO_LV3_DAY", "RECS_RISK_TO_PORTFOLIO_LV3_NIGHT", "RECS_RISK_TO_PORTFOLIO_LV4_DAY", "RECS_RISK_TO_PORTFOLIO_LV4_NIGHT", "RECS_RISK_TO_PORTFOLIO_LV5_DAY", "RECS_RISK_TO_PORTFOLIO_LV5_NIGHT", "RECS_RET_INTRO", "RECS_RET_CALCULATION", "RECS_RET_CELEBRATION", "RECS_RET_RECURRING_HOOK", "ROUNDUP_REWARDS_FIRST_TRANSACTION", "ROUNDUP_REWARDS_WEEKLY_DETAIL", "ROUNDUP_REWARDS_WEEKLY_DETAIL_100", "ROUNDUP_REWARDS_OVERVIEW_COIN", "RHC_TRANSFER_STAY_TUNED", "RHC_REWARD_GIFT_OPEN", "RHC_TRANSFER_STAY_TUNED_REBRAND_LIGHT", "RHC_TRANSFER_STAY_TUNED_REBRAND_DARK", "RHC_TRANSFER_COMPLETED_REBRAND_LIGHT", "RHC_TRANSFER_COMPLETED_REBRAND_DARK", "RHC_TRANSFER_ERROR_LIGHT", "RHC_TRANSFER_ERROR_DARK", "RHY_WAITLIST_JOIN", "RHY_WAITLIST_CAT", "RHY_CM_SUNSET_STRONG_HEADER", "RHY_CM_SUNSET_TICK", "LADDER_NUX_DAY", "LADDER_NUX_NIGHT", "EQUITIES_LADDER_FTUX_1_DAY", "EQUITIES_LADDER_FTUX_1_NIGHT", "EQUITIES_LADDER_FTUX_2_DAY", "EQUITIES_LADDER_FTUX_2_NIGHT", "EQUITIES_LADDER_FTUX_3_DAY", "EQUITIES_LADDER_FTUX_3_NIGHT", "EQUITIES_LADDER_FTUX_4_DAY", "EQUITIES_LADDER_FTUX_4_NIGHT", "EQUITIES_LADDER_FTUX_5_DAY", "EQUITIES_LADDER_FTUX_5_NIGHT", "EQUITIES_LADDER_FTUX_6_DAY", "EQUITIES_LADDER_FTUX_6_NIGHT", "EQUITIES_LADDER_FTUX_7_DAY", "EQUITIES_LADDER_FTUX_7_NIGHT", "EQUITIES_LADDER_FTUX_8_DAY", "EQUITIES_LADDER_FTUX_8_NIGHT", "EQUITIES_LADDER_FTUX_9_DAY", "EQUITIES_LADDER_FTUX_9_NIGHT", "EQUITIES_LADDER_FTUX_10_DAY", "EQUITIES_LADDER_FTUX_10_NIGHT", "EQUITIES_LADDER_FTUX_11_DAY", "EQUITIES_LADDER_FTUX_11_NIGHT", "EQUITIES_LADDER_FTUX_LOADER_DAY", "EQUITIES_LADDER_FTUX_LOADER_NIGHT", "EQUITIES_LADDER_ZOOMING_DISCOVERY_DAY", "EQUITIES_LADDER_ZOOMING_DISCOVERY_NIGHT", "FUTURES_LADDER_FTUX_CHART_EDUCATION_NIGHT", "FUTURES_LADDER_FTUX_LAST_TRADED_PRICE_NIGHT", "FUTURES_LADDER_FTUX_TICK_SIZE_NIGHT", "FUTURES_LADDER_FTUX_BID_BARS_NIGHT", "FUTURES_LADDER_FTUX_ASK_BARS_NIGHT", "FUTURES_LADDER_FTUX_MARKET_ORDER_NIGHT", "FUTURES_LADDER_FTUX_ROW_NIGHT", "FUTURES_LADDER_FTUX_EDIT_ORDER_NIGHT", "FUTURES_LADDER_FTUX_CANCEL_NIGHT", "FUTURES_LADDER_FTUX_AVG_PRICE_NIGHT", "FUTURES_LADDER_FTUX_CLOSE_POSITION_NIGHT", "FUTURES_LADDER_FTUX_LOADER_NIGHT", "FUTURES_LADDER_FTUX_CHART_EDUCATION_DAY", "FUTURES_LADDER_FTUX_LAST_TRADED_PRICE_DAY", "FUTURES_LADDER_FTUX_TICK_SIZE_DAY", "FUTURES_LADDER_FTUX_BID_BARS_DAY", "FUTURES_LADDER_FTUX_ASK_BARS_DAY", "FUTURES_LADDER_FTUX_MARKET_ORDER_DAY", "FUTURES_LADDER_FTUX_ROW_DAY", "FUTURES_LADDER_FTUX_EDIT_ORDER_DAY", "FUTURES_LADDER_FTUX_CANCEL_DAY", "FUTURES_LADDER_FTUX_AVG_PRICE_DAY", "FUTURES_LADDER_FTUX_CLOSE_POSITION_DAY", "FUTURES_LADDER_FTUX_LOADER_DAY", "FUTURES_UK_QUESTIONNAIRE_SPLASH_DAY", "FUTURES_UK_QUESTIONNAIRE_SPLASH_NIGHT", "MIB_ACCOUNT_CREATED_NIGHT", "MIB_ACCOUNT_CREATED_DAY", "TRANSFER_IDLE_CASH_NG_LIGHT", "TRANSFER_IDLE_CASH_NG_DARK", "TRANSFER_IDLE_CASH_YG_LIGHT", "TRANSFER_IDLE_CASH_YG_DARK", "IAT_INTRO_DARK", "IAT_CONFIRMATION_LIGHT", "IAT_CONFIRMATION_DARK", "BRAND_REFRESH_PHONE_VERIFY_LIGHT", "BRAND_REFRESH_PHONE_VERIFY_DARK", "BRAND_REFRESH_RECURRING_DEPOSIT_LIGHT", "BRAND_REFRESH_RECURRING_DEPOSIT_DARK", "BRAND_REFRESH_BANK_VERIFY_LIGHT", "BRAND_REFRESH_BANK_VERIFY_DARK", "BRAND_REFRESH_VERIFY_IDENTITY_LIGHT", "BRAND_REFRESH_VERIFY_IDENTITY_DARK", "BRAND_REFRESH_UPLOAD_ID_LIGHT", "BRAND_REFRESH_UPLOAD_ID_DARK", "CORTEX_ICON_LIGHT", "CORTEX_ICON_DARK", "ISA_ONBOARDING_INTRO_LIGHT", "ISA_ONBOARDING_INTRO_DARK", "ISA_ONBOARDING_TWO_PERCENT_CASH_BACK_LIGHT", "ISA_ONBOARDING_TWO_PERCENT_CASH_BACK_DARK", "ISA_ONBOARDING_TAX_FREE_INVESTING_LIGHT", "ISA_ONBOARDING_TAX_FREE_INVESTING_DARK", "ISA_ONBOARDING_ZERO_ACCOUNT_FEE_LIGHT", "ISA_ONBOARDING_ZERO_ACCOUNT_FEE_DARK", "ISA_ONBOARDING_SAFETY_LIGHT", "ISA_ONBOARDING_SAFETY_DARK", "ISA_ONBOARDING_TRANSFER_YOUR_ISA_LIGHT", "ISA_ONBOARDING_TRANSFER_YOUR_ISA_DARK", "ISA_CONTRIBUTION_DOT_LIGHT", "ISA_CONTRIBUTION_DOT_DARK", "ISA_CONTRIBUTION_MINI_LIGHT", "ISA_CONTRIBUTION_MINI_DARK", "ISA_CONTRIBUTION_MAX_LIGHT", "ISA_CONTRIBUTION_MAX_DARK", "ISA_CONTRIBUTION_CONFIRMATION_STANDARD_LIGHT", "ISA_CONTRIBUTION_CONFIRMATION_STANDARD_DARK", "ISA_CONTRIBUTION_CONFIRMATION_MAXED_LIGHT", "ISA_CONTRIBUTION_CONFIRMATION_MAXED_DARK", "url", "Lokhttp3/HttpUrl;", "getUrl", "()Lokhttp3/HttpUrl;", "prefetch", "", "context", "Landroid/content/Context;", "fetch", "Lio/reactivex/Single;", "Lcom/airbnb/lottie/LottieComposition;", "lib-remote-assets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class LottieUrl {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LottieUrl[] $VALUES;
    private final HttpUrl url;
    public static final LottieUrl FRACTIONAL_ROCKET = new LottieUrl("FRACTIONAL_ROCKET", 0, "fractional/lottie_fractional_rocket.json");
    public static final LottieUrl FIREWORKS = new LottieUrl("FIREWORKS", 1, "common/fireworks.json");
    public static final LottieUrl SLIP_FIREWORK = new LottieUrl("SLIP_FIREWORK", 2, "slip/lottie_success_fireworks.json");
    public static final LottieUrl DIRECT_DEPOSIT_INTRO = new LottieUrl("DIRECT_DEPOSIT_INTRO", 3, "direct_deposit/direct_deposit_intro.json");
    public static final LottieUrl SECURITY_OAUTH_SPINNER = new LottieUrl("SECURITY_OAUTH_SPINNER", 4, "security/oauth_spinner.json");
    public static final LottieUrl INSTANT_BOLT = new LottieUrl("INSTANT_BOLT", 5, "instant/instant_bolt.json");
    public static final LottieUrl ADVANCED_CHART_ONBOARDING = new LottieUrl("ADVANCED_CHART_ONBOARDING", 6, "advanced_chart/onboarding-deck-mobile.json");
    public static final LottieUrl COMPANY_FINANCIALS_ONBOARDING = new LottieUrl("COMPANY_FINANCIALS_ONBOARDING", 7, "company_financials/onboarding-mobile.json");
    public static final LottieUrl ACATS_INTRO = new LottieUrl("ACATS_INTRO", 8, "acats/lottie_acats_intro.json");
    public static final LottieUrl ACATS_ELIGIBLE_YES = new LottieUrl("ACATS_ELIGIBLE_YES", 9, "acats/lottie_acats_eligible_yes.json");
    public static final LottieUrl ACATS_ELIGIBLE_MAYBE = new LottieUrl("ACATS_ELIGIBLE_MAYBE", 10, "acats/lottie_acats_eligible_maybe.json");
    public static final LottieUrl ACATS_ELIGIBLE_NO = new LottieUrl("ACATS_ELIGIBLE_NO", 11, "acats/lottie_acats_eligible_no.json");
    public static final LottieUrl ACATS_FEATHER = new LottieUrl("ACATS_FEATHER", 12, "acats/lottie_acats_feather_no_padding.json");
    public static final LottieUrl CRYPTO_ACATS_INTRO_DARK_LOTTIE = new LottieUrl("CRYPTO_ACATS_INTRO_DARK_LOTTIE", 13, "crypto/acats/crypto_acats_intro_dark_lottie.json");
    public static final LottieUrl CRYPTO_ALERTS_NOTIFICATION = new LottieUrl("CRYPTO_ALERTS_NOTIFICATION", 14, "crypto/crypto_fee/alert_notifications.lottie");
    public static final LottieUrl CRYPTO_BOUNCING_BALL = new LottieUrl("CRYPTO_BOUNCING_BALL", 15, "crypto/crypto_fee/fee_tiers_bouncing_ball.lottie");
    public static final LottieUrl CRYPTO_TOKEN_GIVEAWAY_LIGHT = new LottieUrl("CRYPTO_TOKEN_GIVEAWAY_LIGHT", 16, "crypto/tokenization/token_giveaway_light_lottie.json");
    public static final LottieUrl CRYPTO_TOKEN_GIVEAWAY_DARK = new LottieUrl("CRYPTO_TOKEN_GIVEAWAY_DARK", 17, "crypto/tokenization/token_giveaway_dark_lottie.json");
    public static final LottieUrl CRYPTO_TRANSFERS_ENROLLMENT_COMPLETED = new LottieUrl("CRYPTO_TRANSFERS_ENROLLMENT_COMPLETED", 18, "wallet_enrollment/lottie/lottie_enrollment_completed.json");
    public static final LottieUrl CRYPTO_TRANSFERS_ENROLLMENT_PENDING = new LottieUrl("CRYPTO_TRANSFERS_ENROLLMENT_PENDING", 19, "wallet_enrollment/lottie/lottie_enrollment_pending.json");
    public static final LottieUrl CRYPTO_TRANSFERS_ENROLLMENT_ERROR = new LottieUrl("CRYPTO_TRANSFERS_ENROLLMENT_ERROR", 20, "wallet_enrollment/lottie/lottie_enrollment_error.json");
    public static final LottieUrl CM_SIGN_UP = new LottieUrl("CM_SIGN_UP", 21, "cm/cm_sign_up.json");
    public static final LottieUrl CM_DISPUTES_INTRO = new LottieUrl("CM_DISPUTES_INTRO", 22, "cm/cm_disputes_intro.json");
    public static final LottieUrl CALL_INTRO_DAY = new LottieUrl("CALL_INTRO_DAY", 23, "options/call_intro_day.json");
    public static final LottieUrl CALL_INTRO_NIGHT = new LottieUrl("CALL_INTRO_NIGHT", 24, "options/call_intro_night.json");
    public static final LottieUrl PUT_INTRO_DAY = new LottieUrl("PUT_INTRO_DAY", 25, "options/put_intro_day.json");
    public static final LottieUrl PUT_INTRO_NIGHT = new LottieUrl("PUT_INTRO_NIGHT", 26, "options/put_intro_night.json");
    public static final LottieUrl BUY_CALL_DAY = new LottieUrl("BUY_CALL_DAY", 27, "options/buy_call_day.json");
    public static final LottieUrl BUY_CALL_NIGHT = new LottieUrl("BUY_CALL_NIGHT", 28, "options/buy_call_night.json");
    public static final LottieUrl BUY_PUT_DAY = new LottieUrl("BUY_PUT_DAY", 29, "options/buy_put_day.json");
    public static final LottieUrl BUY_PUT_NIGHT = new LottieUrl("BUY_PUT_NIGHT", 30, "options/buy_put_night.json");
    public static final LottieUrl SELL_CALL_DAY = new LottieUrl("SELL_CALL_DAY", 31, "options/sell_call_day.json");
    public static final LottieUrl SELL_CALL_NIGHT = new LottieUrl("SELL_CALL_NIGHT", 32, "options/sell_call_night.json");
    public static final LottieUrl SELL_PUT_DAY = new LottieUrl("SELL_PUT_DAY", 33, "options/sell_put_day.json");
    public static final LottieUrl SELL_PUT_NIGHT = new LottieUrl("SELL_PUT_NIGHT", 34, "options/sell_put_night.json");
    public static final LottieUrl HORIZONTAL_SPREAD_DAY = new LottieUrl("HORIZONTAL_SPREAD_DAY", 35, "options/options_horizontal_day.json");
    public static final LottieUrl HORIZONTAL_SPREAD_NIGHT = new LottieUrl("HORIZONTAL_SPREAD_NIGHT", 36, "options/options_horizontal_night.json");
    public static final LottieUrl VERTICAL_SPREAD_DAY = new LottieUrl("VERTICAL_SPREAD_DAY", 37, "options/options_vertical_day.json");
    public static final LottieUrl VERTICAL_SPREAD_NIGHT = new LottieUrl("VERTICAL_SPREAD_NIGHT", 38, "options/options_vertical_night.json");
    public static final LottieUrl CALENDAR_SPREAD_DAY = new LottieUrl("CALENDAR_SPREAD_DAY", 39, "options/calendar_spread_day.json");
    public static final LottieUrl CALENDAR_SPREAD_NIGHT = new LottieUrl("CALENDAR_SPREAD_NIGHT", 40, "options/calendar_spread_night.json");
    public static final LottieUrl CALL_CREDIT_SPREAD_DAY = new LottieUrl("CALL_CREDIT_SPREAD_DAY", 41, "options/call_credit_spread_day.json");
    public static final LottieUrl CALL_CREDIT_SPREAD_NIGHT = new LottieUrl("CALL_CREDIT_SPREAD_NIGHT", 42, "options/call_credit_spread_night.json");
    public static final LottieUrl CALL_DEBIT_SPREAD_DAY = new LottieUrl("CALL_DEBIT_SPREAD_DAY", 43, "options/call_debit_spread_day.json");
    public static final LottieUrl CALL_DEBIT_SPREAD_NIGHT = new LottieUrl("CALL_DEBIT_SPREAD_NIGHT", 44, "options/call_debit_spread_night.json");
    public static final LottieUrl IRON_BUTTERFLY_DAY = new LottieUrl("IRON_BUTTERFLY_DAY", 45, "options/iron_butterfly_day.json");
    public static final LottieUrl IRON_BUTTERFLY_NIGHT = new LottieUrl("IRON_BUTTERFLY_NIGHT", 46, "options/iron_butterfly_night.json");
    public static final LottieUrl IRON_CONDOR_DAY = new LottieUrl("IRON_CONDOR_DAY", 47, "options/iron_condor_day.json");
    public static final LottieUrl IRON_CONDOR_NIGHT = new LottieUrl("IRON_CONDOR_NIGHT", 48, "options/iron_condor_night.json");
    public static final LottieUrl PUT_CREDIT_SPREAD_DAY = new LottieUrl("PUT_CREDIT_SPREAD_DAY", 49, "options/put_credit_spread_day.json");
    public static final LottieUrl PUT_CREDIT_SPREAD_NIGHT = new LottieUrl("PUT_CREDIT_SPREAD_NIGHT", 50, "options/put_credit_spread_night.json");
    public static final LottieUrl PUT_DEBIT_SPREAD_DAY = new LottieUrl("PUT_DEBIT_SPREAD_DAY", 51, "options/put_debit_spread_day.json");
    public static final LottieUrl PUT_DEBIT_SPREAD_NIGHT = new LottieUrl("PUT_DEBIT_SPREAD_NIGHT", 52, "options/put_debit_spread_night.json");
    public static final LottieUrl OPTIONS_WATCHLIST_FG = new LottieUrl("OPTIONS_WATCHLIST_FG", 53, "options/watchlist/lighthouse_fg.json");
    public static final LottieUrl OPTIONS_WATCHLIST_MG = new LottieUrl("OPTIONS_WATCHLIST_MG", 54, "options/watchlist/lighthouse_mg.json");
    public static final LottieUrl OPTIONS_WATCHLIST_BG = new LottieUrl("OPTIONS_WATCHLIST_BG", 55, "options/watchlist/lighthouse_bg.json");
    public static final LottieUrl OPTIONS_WATCHLIST_LIGHT = new LottieUrl("OPTIONS_WATCHLIST_LIGHT", 56, "options/watchlist/lighthouse_light.json");
    public static final LottieUrl OPTIONS_ALERT_ONBOARDING = new LottieUrl("OPTIONS_ALERT_ONBOARDING", 57, "options/options_alert_onboarding.json");
    public static final LottieUrl OPTIONS_ONBOARDING_L0_DAY = new LottieUrl("OPTIONS_ONBOARDING_L0_DAY", 58, "options/onboarding/l0_lottie_neon.json");
    public static final LottieUrl OPTIONS_ONBOARDING_L0_NIGHT = new LottieUrl("OPTIONS_ONBOARDING_L0_NIGHT", 59, "options/onboarding/l0_lottie_night.json");
    public static final LottieUrl OPTIONS_ONBOARDING_L2_DAY = new LottieUrl("OPTIONS_ONBOARDING_L2_DAY", 60, "options/onboarding/L2_day.json");
    public static final LottieUrl OPTIONS_ONBOARDING_L2_NEON = new LottieUrl("OPTIONS_ONBOARDING_L2_NEON", 61, "options/onboarding/L2_neon.json");
    public static final LottieUrl OPTIONS_ONBOARDING_L2_NIGHT = new LottieUrl("OPTIONS_ONBOARDING_L2_NIGHT", 62, "options/onboarding/L2_night_v2.json");
    public static final LottieUrl OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_DAY = new LottieUrl("OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_DAY", 63, "options/onboarding/alert_notification_day.json");
    public static final LottieUrl OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_NIGHT = new LottieUrl("OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_NIGHT", 64, "options/onboarding/alert_notification_night.json");
    public static final LottieUrl OPTIONS_ONBOARDING_ALL_SET_SDP_DAY = new LottieUrl("OPTIONS_ONBOARDING_ALL_SET_SDP_DAY", 65, "options/onboarding/all_set_sdp_day.json");
    public static final LottieUrl OPTIONS_ONBOARDING_ALL_SET_SDP_NIGHT = new LottieUrl("OPTIONS_ONBOARDING_ALL_SET_SDP_NIGHT", 66, "options/onboarding/all_set_sdp_night.json");
    public static final LottieUrl OPTIONS_ONBOARDING_ALL_SET_NON_SDP_DAY = new LottieUrl("OPTIONS_ONBOARDING_ALL_SET_NON_SDP_DAY", 67, "options/onboarding/all_set_non_sdp_day.json");
    public static final LottieUrl OPTIONS_ONBOARDING_ALL_SET_NON_SDP_NIGHT = new LottieUrl("OPTIONS_ONBOARDING_ALL_SET_NON_SDP_NIGHT", 68, "options/onboarding/all_set_non_sdp_night.json");
    public static final LottieUrl SUPPORT_CALL_WAITING = new LottieUrl("SUPPORT_CALL_WAITING", 69, "cx_voice/lottie_support_call_waiting_status_illustration.json");
    public static final LottieUrl SUPPORT_CALL_CANCELLED = new LottieUrl("SUPPORT_CALL_CANCELLED", 70, "cx_voice/lottie_support_call_cancelled_status_illustration.json");
    public static final LottieUrl SUPPORT_CALL_MISSED = new LottieUrl("SUPPORT_CALL_MISSED", 71, "cx_voice/lottie_support_call_missed_status_illustration.json");
    public static final LottieUrl SUPPORT_CALL_ASSIGNED = new LottieUrl("SUPPORT_CALL_ASSIGNED", 72, "cx_voice/lottie_support_call_assigned_status_illustration.json");
    public static final LottieUrl SUPPORT_CALL_COMPLETED = new LottieUrl("SUPPORT_CALL_COMPLETED", 73, "cx_voice/lottie_support_call_completed_status_illustration.json");
    public static final LottieUrl RECS_LANDING_ORB_DAY = new LottieUrl("RECS_LANDING_ORB_DAY", 74, "recommendations/recs_landing_orb_day.json");
    public static final LottieUrl RECS_LANDING_ORB_NIGHT = new LottieUrl("RECS_LANDING_ORB_NIGHT", 75, "recommendations/recs_landing_orb_night.json");
    public static final LottieUrl RECS_PROGRESSION_ORB_DAY = new LottieUrl("RECS_PROGRESSION_ORB_DAY", 76, "recommendations/recs_progression_orb_day.json");
    public static final LottieUrl RECS_PROGRESSION_ORB_NIGHT = new LottieUrl("RECS_PROGRESSION_ORB_NIGHT", 77, "recommendations/recs_progression_orb_night.json");
    public static final LottieUrl RECS_RISK_LOADER_DAY = new LottieUrl("RECS_RISK_LOADER_DAY", 78, "recommendations/recs_risk_loader_day.json");
    public static final LottieUrl RECS_RISK_LOADER_NIGHT = new LottieUrl("RECS_RISK_LOADER_NIGHT", 79, "recommendations/recs_risk_loader_night.json");
    public static final LottieUrl RECS_RISK_INDICATOR_DAY = new LottieUrl("RECS_RISK_INDICATOR_DAY", 80, "recommendations/recs_risk_indicator_day.json");
    public static final LottieUrl RECS_RISK_INDICATOR_NIGHT = new LottieUrl("RECS_RISK_INDICATOR_NIGHT", 81, "recommendations/recs_risk_indicator_night.json");
    public static final LottieUrl RECS_RISK_SHEEN = new LottieUrl("RECS_RISK_SHEEN", 82, "recommendations/recs_risk_sheen.json");
    public static final LottieUrl RECS_PORTFOLIO_ASSETS_DAY = new LottieUrl("RECS_PORTFOLIO_ASSETS_DAY", 83, "recommendations/recs_portfolio_assets_day.json");
    public static final LottieUrl RECS_PORTFOLIO_ASSETS_NIGHT = new LottieUrl("RECS_PORTFOLIO_ASSETS_NIGHT", 84, "recommendations/recs_portfolio_assets_night.json");
    public static final LottieUrl RECS_CELEBRATION_DAY = new LottieUrl("RECS_CELEBRATION_DAY", 85, "recommendations/recs_celebration_day.json");
    public static final LottieUrl RECS_CELEBRATION_NIGHT = new LottieUrl("RECS_CELEBRATION_NIGHT", 86, "recommendations/recs_celebration_night.json");
    public static final LottieUrl RECS_RISK_TO_PORTFOLIO_LV1_DAY = new LottieUrl("RECS_RISK_TO_PORTFOLIO_LV1_DAY", 87, "recommendations/recs_risk_to_portfolio_lv1_day.json");
    public static final LottieUrl RECS_RISK_TO_PORTFOLIO_LV1_NIGHT = new LottieUrl("RECS_RISK_TO_PORTFOLIO_LV1_NIGHT", 88, "recommendations/recs_risk_to_portfolio_lv1_night.json");
    public static final LottieUrl RECS_RISK_TO_PORTFOLIO_LV2_DAY = new LottieUrl("RECS_RISK_TO_PORTFOLIO_LV2_DAY", 89, "recommendations/recs_risk_to_portfolio_lv2_day.json");
    public static final LottieUrl RECS_RISK_TO_PORTFOLIO_LV2_NIGHT = new LottieUrl("RECS_RISK_TO_PORTFOLIO_LV2_NIGHT", 90, "recommendations/recs_risk_to_portfolio_lv2_night.json");
    public static final LottieUrl RECS_RISK_TO_PORTFOLIO_LV3_DAY = new LottieUrl("RECS_RISK_TO_PORTFOLIO_LV3_DAY", 91, "recommendations/recs_risk_to_portfolio_lv3_day.json");
    public static final LottieUrl RECS_RISK_TO_PORTFOLIO_LV3_NIGHT = new LottieUrl("RECS_RISK_TO_PORTFOLIO_LV3_NIGHT", 92, "recommendations/recs_risk_to_portfolio_lv3_night.json");
    public static final LottieUrl RECS_RISK_TO_PORTFOLIO_LV4_DAY = new LottieUrl("RECS_RISK_TO_PORTFOLIO_LV4_DAY", 93, "recommendations/recs_risk_to_portfolio_lv4_day.json");
    public static final LottieUrl RECS_RISK_TO_PORTFOLIO_LV4_NIGHT = new LottieUrl("RECS_RISK_TO_PORTFOLIO_LV4_NIGHT", 94, "recommendations/recs_risk_to_portfolio_lv4_night.json");
    public static final LottieUrl RECS_RISK_TO_PORTFOLIO_LV5_DAY = new LottieUrl("RECS_RISK_TO_PORTFOLIO_LV5_DAY", 95, "recommendations/recs_risk_to_portfolio_lv5_day.json");
    public static final LottieUrl RECS_RISK_TO_PORTFOLIO_LV5_NIGHT = new LottieUrl("RECS_RISK_TO_PORTFOLIO_LV5_NIGHT", 96, "recommendations/recs_risk_to_portfolio_lv5_night.json");
    public static final LottieUrl RECS_RET_INTRO = new LottieUrl("RECS_RET_INTRO", 97, "recommendations/recs-retirement-intro.json");
    public static final LottieUrl RECS_RET_CALCULATION = new LottieUrl("RECS_RET_CALCULATION", 98, "recommendations/recs-retirement-recurring-hook.json");
    public static final LottieUrl RECS_RET_CELEBRATION = new LottieUrl("RECS_RET_CELEBRATION", 99, "recommendations/recs-retirement-celebration.json");
    public static final LottieUrl RECS_RET_RECURRING_HOOK = new LottieUrl("RECS_RET_RECURRING_HOOK", 100, "recommendations/recs-retirement-recurring-hook.json");
    public static final LottieUrl ROUNDUP_REWARDS_FIRST_TRANSACTION = new LottieUrl("ROUNDUP_REWARDS_FIRST_TRANSACTION", 101, "roundup/roundup-celebration-v2.json");
    public static final LottieUrl ROUNDUP_REWARDS_WEEKLY_DETAIL = new LottieUrl("ROUNDUP_REWARDS_WEEKLY_DETAIL", 102, "roundup/roundup-weekly-normal-v3.json");
    public static final LottieUrl ROUNDUP_REWARDS_WEEKLY_DETAIL_100 = new LottieUrl("ROUNDUP_REWARDS_WEEKLY_DETAIL_100", 103, "roundup/roundup-weekly-100x-v3.json");
    public static final LottieUrl ROUNDUP_REWARDS_OVERVIEW_COIN = new LottieUrl("ROUNDUP_REWARDS_OVERVIEW_COIN", 104, "roundup/roundup-overview-coin.json");
    public static final LottieUrl RHC_TRANSFER_STAY_TUNED = new LottieUrl("RHC_TRANSFER_STAY_TUNED", 105, "rhc/lottie_transfer_deposit_stay_tuned.json");
    public static final LottieUrl RHC_REWARD_GIFT_OPEN = new LottieUrl("RHC_REWARD_GIFT_OPEN", 106, "rhc/lottie_reward_gift_open.json");
    public static final LottieUrl RHC_TRANSFER_STAY_TUNED_REBRAND_LIGHT = new LottieUrl("RHC_TRANSFER_STAY_TUNED_REBRAND_LIGHT", 107, "crypto/money_movement/money_movement_loading_light.json");
    public static final LottieUrl RHC_TRANSFER_STAY_TUNED_REBRAND_DARK = new LottieUrl("RHC_TRANSFER_STAY_TUNED_REBRAND_DARK", 108, "crypto/money_movement/money_movement_loading_dark.json");
    public static final LottieUrl RHC_TRANSFER_COMPLETED_REBRAND_LIGHT = new LottieUrl("RHC_TRANSFER_COMPLETED_REBRAND_LIGHT", 109, "crypto/money_movement/money_movement_complete_light.json");
    public static final LottieUrl RHC_TRANSFER_COMPLETED_REBRAND_DARK = new LottieUrl("RHC_TRANSFER_COMPLETED_REBRAND_DARK", 110, "crypto/money_movement/money_movement_complete_dark.json");
    public static final LottieUrl RHC_TRANSFER_ERROR_LIGHT = new LottieUrl("RHC_TRANSFER_ERROR_LIGHT", 111, "crypto/money_movement/money_movement_error_light.json");
    public static final LottieUrl RHC_TRANSFER_ERROR_DARK = new LottieUrl("RHC_TRANSFER_ERROR_DARK", 112, "crypto/money_movement/money_movement_error_dark.json");
    public static final LottieUrl RHY_WAITLIST_JOIN = new LottieUrl("RHY_WAITLIST_JOIN", 113, "rhy/waitlist/join_animation/rhy-waitlist-join.json");
    public static final LottieUrl RHY_WAITLIST_CAT = new LottieUrl("RHY_WAITLIST_CAT", 114, "rhy/waitlist/success_cat/rhy-waitlist-cat.json");
    public static final LottieUrl RHY_CM_SUNSET_STRONG_HEADER = new LottieUrl("RHY_CM_SUNSET_STRONG_HEADER", 115, "rhy/grey_blocking.json");
    public static final LottieUrl RHY_CM_SUNSET_TICK = new LottieUrl("RHY_CM_SUNSET_TICK", 116, "rhy/tick_standalone.json");
    public static final LottieUrl LADDER_NUX_DAY = new LottieUrl("LADDER_NUX_DAY", 117, "ladder/ladder_nux_day.json");
    public static final LottieUrl LADDER_NUX_NIGHT = new LottieUrl("LADDER_NUX_NIGHT", 118, "ladder/ladder_nux_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_1_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_1_DAY", 119, "equities/ladder-ftux/ftux1_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_1_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_1_NIGHT", 120, "equities/ladder-ftux/ftux1_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_2_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_2_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, "equities/ladder-ftux/ftux2_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_2_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_2_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, "equities/ladder-ftux/ftux2_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_3_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_3_DAY", 123, "equities/ladder-ftux/ftux3_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_3_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_3_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, "equities/ladder-ftux/ftux3_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_4_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_4_DAY", 125, "equities/ladder-ftux/ftux4_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_4_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_4_NIGHT", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, "equities/ladder-ftux/ftux4_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_5_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_5_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, "equities/ladder-ftux/ftux5_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_5_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_5_NIGHT", 128, "equities/ladder-ftux/ftux5_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_6_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_6_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, "equities/ladder-ftux/ftux6_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_6_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_6_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, "equities/ladder-ftux/ftux6_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_7_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_7_DAY", 131, "equities/ladder-ftux/ftux7_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_7_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_7_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, "equities/ladder-ftux/ftux7_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_8_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_8_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, "equities/ladder-ftux/ftux8_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_8_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_8_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, "equities/ladder-ftux/ftux8_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_9_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_9_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, "equities/ladder-ftux/ftux9_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_9_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_9_NIGHT", 136, "equities/ladder-ftux/ftux9_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_10_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_10_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, "equities/ladder-ftux/ftux10_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_10_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_10_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, "equities/ladder-ftux/ftux10_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_11_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_11_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, "equities/ladder-ftux/ftux11_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_11_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_11_NIGHT", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, "equities/ladder-ftux/ftux11_night.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_LOADER_DAY = new LottieUrl("EQUITIES_LADDER_FTUX_LOADER_DAY", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, "equities/ladder-ftux/loader_day.json");
    public static final LottieUrl EQUITIES_LADDER_FTUX_LOADER_NIGHT = new LottieUrl("EQUITIES_LADDER_FTUX_LOADER_NIGHT", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, "equities/ladder-ftux/loader_night.json");
    public static final LottieUrl EQUITIES_LADDER_ZOOMING_DISCOVERY_DAY = new LottieUrl("EQUITIES_LADDER_ZOOMING_DISCOVERY_DAY", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, "equities/ladder-ftux/zooming_discovery_day.json");
    public static final LottieUrl EQUITIES_LADDER_ZOOMING_DISCOVERY_NIGHT = new LottieUrl("EQUITIES_LADDER_ZOOMING_DISCOVERY_NIGHT", 144, "equities/ladder-ftux/zooming_discovery_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_CHART_EDUCATION_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_CHART_EDUCATION_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, "futures/ladder-ftux-v3/chart_education_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_LAST_TRADED_PRICE_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_LAST_TRADED_PRICE_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, "futures/ladder-ftux-v3/last_traded_price_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_TICK_SIZE_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_TICK_SIZE_NIGHT", 147, "futures/ladder-ftux-v3/tick_size_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_BID_BARS_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_BID_BARS_NIGHT", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, "futures/ladder-ftux-v3/bid_bars_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_ASK_BARS_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_ASK_BARS_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, "futures/ladder-ftux-v3/ask_bars_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_MARKET_ORDER_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_MARKET_ORDER_NIGHT", 150, "futures/ladder-ftux-v3/market_order_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_ROW_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_ROW_NIGHT", 151, "futures/ladder-ftux-v3/row_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_EDIT_ORDER_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_EDIT_ORDER_NIGHT", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, "futures/ladder-ftux-v3/edit_order_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_CANCEL_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_CANCEL_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, "futures/ladder-ftux-v3/cancel_order_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_AVG_PRICE_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_AVG_PRICE_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, "futures/ladder-ftux-v3/avg_price_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_CLOSE_POSITION_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_CLOSE_POSITION_NIGHT", 155, "futures/ladder-ftux-v3/close_position_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_LOADER_NIGHT = new LottieUrl("FUTURES_LADDER_FTUX_LOADER_NIGHT", 156, "futures/ladder-ftux-v3/ladder_loader_night.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_CHART_EDUCATION_DAY = new LottieUrl("FUTURES_LADDER_FTUX_CHART_EDUCATION_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, "futures/ladder-ftux-v3/chart_education_day.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_LAST_TRADED_PRICE_DAY = new LottieUrl("FUTURES_LADDER_FTUX_LAST_TRADED_PRICE_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, "futures/ladder-ftux-v3/last_traded_price_day.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_TICK_SIZE_DAY = new LottieUrl("FUTURES_LADDER_FTUX_TICK_SIZE_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, "futures/ladder-ftux-v3/tick_size_day.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_BID_BARS_DAY = new LottieUrl("FUTURES_LADDER_FTUX_BID_BARS_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, "futures/ladder-ftux-v3/bid_bars_day.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_ASK_BARS_DAY = new LottieUrl("FUTURES_LADDER_FTUX_ASK_BARS_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, "futures/ladder-ftux-v3/ask_bars_day.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_MARKET_ORDER_DAY = new LottieUrl("FUTURES_LADDER_FTUX_MARKET_ORDER_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, "futures/ladder-ftux-v3/market_order_day.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_ROW_DAY = new LottieUrl("FUTURES_LADDER_FTUX_ROW_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, "futures/ladder-ftux-v3/row_day.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_EDIT_ORDER_DAY = new LottieUrl("FUTURES_LADDER_FTUX_EDIT_ORDER_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, "futures/ladder-ftux-v3/edit_order_day.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_CANCEL_DAY = new LottieUrl("FUTURES_LADDER_FTUX_CANCEL_DAY", 165, "futures/ladder-ftux-v3/cancel_order_day.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_AVG_PRICE_DAY = new LottieUrl("FUTURES_LADDER_FTUX_AVG_PRICE_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, "futures/ladder-ftux-v3/avg_price_day.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_CLOSE_POSITION_DAY = new LottieUrl("FUTURES_LADDER_FTUX_CLOSE_POSITION_DAY", 167, "futures/ladder-ftux-v3/close_position_day.json");
    public static final LottieUrl FUTURES_LADDER_FTUX_LOADER_DAY = new LottieUrl("FUTURES_LADDER_FTUX_LOADER_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, "futures/ladder-ftux-v3/ladder_loader_day.json");
    public static final LottieUrl FUTURES_UK_QUESTIONNAIRE_SPLASH_DAY = new LottieUrl("FUTURES_UK_QUESTIONNAIRE_SPLASH_DAY", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, "futures/onboarding/twenty_four_hours_light.json");
    public static final LottieUrl FUTURES_UK_QUESTIONNAIRE_SPLASH_NIGHT = new LottieUrl("FUTURES_UK_QUESTIONNAIRE_SPLASH_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, "futures/onboarding/twenty_four_hours_dark.json");
    public static final LottieUrl MIB_ACCOUNT_CREATED_NIGHT = new LottieUrl("MIB_ACCOUNT_CREATED_NIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, "mib/account_created_loading/dark/account_created_loading_dark_mode_v1.json");
    public static final LottieUrl MIB_ACCOUNT_CREATED_DAY = new LottieUrl("MIB_ACCOUNT_CREATED_DAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, "mib/account_created_loading/light/account_created_loading_light_mode_v1.json");
    public static final LottieUrl TRANSFER_IDLE_CASH_NG_LIGHT = new LottieUrl("TRANSFER_IDLE_CASH_NG_LIGHT", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, "money-movement/recurring_extra_cash/RH_Transfer_Idle_Cash_NG-light_lottie-cropped.json");
    public static final LottieUrl TRANSFER_IDLE_CASH_NG_DARK = new LottieUrl("TRANSFER_IDLE_CASH_NG_DARK", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, "money-movement/recurring_extra_cash/RH_Transfer_Idle_Cash_NG-dark_lottie-cropped.json");
    public static final LottieUrl TRANSFER_IDLE_CASH_YG_LIGHT = new LottieUrl("TRANSFER_IDLE_CASH_YG_LIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, "money-movement/recurring_extra_cash/RH_Transfer_Idle_Cash_YG-light_lottie-cropped.json");
    public static final LottieUrl TRANSFER_IDLE_CASH_YG_DARK = new LottieUrl("TRANSFER_IDLE_CASH_YG_DARK", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, "money-movement/recurring_extra_cash/RH_Transfer_Idle_Cash_YG-dark_lottie-cropped.json");
    public static final LottieUrl IAT_INTRO_DARK = new LottieUrl("IAT_INTRO_DARK", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, "internal_asset_transfer/intro/iat-intro-dark.json");
    public static final LottieUrl IAT_CONFIRMATION_LIGHT = new LottieUrl("IAT_CONFIRMATION_LIGHT", EnumC7081g.f2773x8d9721ad, "internal_asset_transfer/transaction_status/iat-transaction-light.json");
    public static final LottieUrl IAT_CONFIRMATION_DARK = new LottieUrl("IAT_CONFIRMATION_DARK", EnumC7081g.f2780x600b66fe, "internal_asset_transfer/transaction_status/iat-transaction-dark.json");
    public static final LottieUrl BRAND_REFRESH_PHONE_VERIFY_LIGHT = new LottieUrl("BRAND_REFRESH_PHONE_VERIFY_LIGHT", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, "onboarding_brand_refresh/lottie_verify_phone_learn_more_light.json");
    public static final LottieUrl BRAND_REFRESH_PHONE_VERIFY_DARK = new LottieUrl("BRAND_REFRESH_PHONE_VERIFY_DARK", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, "onboarding_brand_refresh/lottie_verify_phone_learn_more_dark.json");
    public static final LottieUrl BRAND_REFRESH_RECURRING_DEPOSIT_LIGHT = new LottieUrl("BRAND_REFRESH_RECURRING_DEPOSIT_LIGHT", 182, "onboarding_brand_refresh/lottie_recurring_deposit_light.json");
    public static final LottieUrl BRAND_REFRESH_RECURRING_DEPOSIT_DARK = new LottieUrl("BRAND_REFRESH_RECURRING_DEPOSIT_DARK", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, "onboarding_brand_refresh/lottie_recurring_deposit_dark.json");
    public static final LottieUrl BRAND_REFRESH_BANK_VERIFY_LIGHT = new LottieUrl("BRAND_REFRESH_BANK_VERIFY_LIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, "onboarding_brand_refresh/lottie_bank_verify_light.json");
    public static final LottieUrl BRAND_REFRESH_BANK_VERIFY_DARK = new LottieUrl("BRAND_REFRESH_BANK_VERIFY_DARK", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, "onboarding_brand_refresh/lottie_bank_verify_dark.json");
    public static final LottieUrl BRAND_REFRESH_VERIFY_IDENTITY_LIGHT = new LottieUrl("BRAND_REFRESH_VERIFY_IDENTITY_LIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, "onboarding_brand_refresh/lottie_verify_identity_light.json");
    public static final LottieUrl BRAND_REFRESH_VERIFY_IDENTITY_DARK = new LottieUrl("BRAND_REFRESH_VERIFY_IDENTITY_DARK", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, "onboarding_brand_refresh/lottie_verify_identity_dark.json");
    public static final LottieUrl BRAND_REFRESH_UPLOAD_ID_LIGHT = new LottieUrl("BRAND_REFRESH_UPLOAD_ID_LIGHT", 188, "onboarding_brand_refresh/lottie_upload_id_light.json");
    public static final LottieUrl BRAND_REFRESH_UPLOAD_ID_DARK = new LottieUrl("BRAND_REFRESH_UPLOAD_ID_DARK", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, "onboarding_brand_refresh/lottie_upload_id_dark.json");
    public static final LottieUrl CORTEX_ICON_LIGHT = new LottieUrl("CORTEX_ICON_LIGHT", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, "cortex/icon_light.json");
    public static final LottieUrl CORTEX_ICON_DARK = new LottieUrl("CORTEX_ICON_DARK", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, "cortex/icon_dark.json");
    public static final LottieUrl ISA_ONBOARDING_INTRO_LIGHT = new LottieUrl("ISA_ONBOARDING_INTRO_LIGHT", 192, "isa/onboarding/intro_light.json");
    public static final LottieUrl ISA_ONBOARDING_INTRO_DARK = new LottieUrl("ISA_ONBOARDING_INTRO_DARK", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, "isa/onboarding/intro_dark.json");
    public static final LottieUrl ISA_ONBOARDING_TWO_PERCENT_CASH_BACK_LIGHT = new LottieUrl("ISA_ONBOARDING_TWO_PERCENT_CASH_BACK_LIGHT", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, "isa/onboarding/two_percent_cash_back_light.json");
    public static final LottieUrl ISA_ONBOARDING_TWO_PERCENT_CASH_BACK_DARK = new LottieUrl("ISA_ONBOARDING_TWO_PERCENT_CASH_BACK_DARK", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, "isa/onboarding/two_percent_cash_back_dark.json");
    public static final LottieUrl ISA_ONBOARDING_TAX_FREE_INVESTING_LIGHT = new LottieUrl("ISA_ONBOARDING_TAX_FREE_INVESTING_LIGHT", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, "isa/onboarding/tax_free_investing_light.json");
    public static final LottieUrl ISA_ONBOARDING_TAX_FREE_INVESTING_DARK = new LottieUrl("ISA_ONBOARDING_TAX_FREE_INVESTING_DARK", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, "isa/onboarding/tax_free_investing_dark.json");
    public static final LottieUrl ISA_ONBOARDING_ZERO_ACCOUNT_FEE_LIGHT = new LottieUrl("ISA_ONBOARDING_ZERO_ACCOUNT_FEE_LIGHT", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, "isa/onboarding/zero_account_fee_light.json");
    public static final LottieUrl ISA_ONBOARDING_ZERO_ACCOUNT_FEE_DARK = new LottieUrl("ISA_ONBOARDING_ZERO_ACCOUNT_FEE_DARK", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, "isa/onboarding/zero_account_fee_dark.json");
    public static final LottieUrl ISA_ONBOARDING_SAFETY_LIGHT = new LottieUrl("ISA_ONBOARDING_SAFETY_LIGHT", 200, "isa/onboarding/safety_light.json");
    public static final LottieUrl ISA_ONBOARDING_SAFETY_DARK = new LottieUrl("ISA_ONBOARDING_SAFETY_DARK", 201, "isa/onboarding/safety_dark.json");
    public static final LottieUrl ISA_ONBOARDING_TRANSFER_YOUR_ISA_LIGHT = new LottieUrl("ISA_ONBOARDING_TRANSFER_YOUR_ISA_LIGHT", 202, "isa/onboarding/transfer_your_isa_light.json");
    public static final LottieUrl ISA_ONBOARDING_TRANSFER_YOUR_ISA_DARK = new LottieUrl("ISA_ONBOARDING_TRANSFER_YOUR_ISA_DARK", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, "isa/onboarding/transfer_your_isa_dark.json");
    public static final LottieUrl ISA_CONTRIBUTION_DOT_LIGHT = new LottieUrl("ISA_CONTRIBUTION_DOT_LIGHT", 204, "isa/contribution/dot_light.json");
    public static final LottieUrl ISA_CONTRIBUTION_DOT_DARK = new LottieUrl("ISA_CONTRIBUTION_DOT_DARK", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, "isa/contribution/dot_dark.json");
    public static final LottieUrl ISA_CONTRIBUTION_MINI_LIGHT = new LottieUrl("ISA_CONTRIBUTION_MINI_LIGHT", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, "isa/contribution/mini_light.json");
    public static final LottieUrl ISA_CONTRIBUTION_MINI_DARK = new LottieUrl("ISA_CONTRIBUTION_MINI_DARK", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, "isa/contribution/mini_dark.json");
    public static final LottieUrl ISA_CONTRIBUTION_MAX_LIGHT = new LottieUrl("ISA_CONTRIBUTION_MAX_LIGHT", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, "isa/contribution/max_light.json");
    public static final LottieUrl ISA_CONTRIBUTION_MAX_DARK = new LottieUrl("ISA_CONTRIBUTION_MAX_DARK", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, "isa/contribution/max_dark.json");
    public static final LottieUrl ISA_CONTRIBUTION_CONFIRMATION_STANDARD_LIGHT = new LottieUrl("ISA_CONTRIBUTION_CONFIRMATION_STANDARD_LIGHT", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, "isa/contribution/confirmation/standard_light.json");
    public static final LottieUrl ISA_CONTRIBUTION_CONFIRMATION_STANDARD_DARK = new LottieUrl("ISA_CONTRIBUTION_CONFIRMATION_STANDARD_DARK", 211, "isa/contribution/confirmation/standard_dark.json");
    public static final LottieUrl ISA_CONTRIBUTION_CONFIRMATION_MAXED_LIGHT = new LottieUrl("ISA_CONTRIBUTION_CONFIRMATION_MAXED_LIGHT", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, "isa/contribution/confirmation/maxed_light.json");
    public static final LottieUrl ISA_CONTRIBUTION_CONFIRMATION_MAXED_DARK = new LottieUrl("ISA_CONTRIBUTION_CONFIRMATION_MAXED_DARK", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, "isa/contribution/confirmation/maxed_dark.json");

    private static final /* synthetic */ LottieUrl[] $values() {
        return new LottieUrl[]{FRACTIONAL_ROCKET, FIREWORKS, SLIP_FIREWORK, DIRECT_DEPOSIT_INTRO, SECURITY_OAUTH_SPINNER, INSTANT_BOLT, ADVANCED_CHART_ONBOARDING, COMPANY_FINANCIALS_ONBOARDING, ACATS_INTRO, ACATS_ELIGIBLE_YES, ACATS_ELIGIBLE_MAYBE, ACATS_ELIGIBLE_NO, ACATS_FEATHER, CRYPTO_ACATS_INTRO_DARK_LOTTIE, CRYPTO_ALERTS_NOTIFICATION, CRYPTO_BOUNCING_BALL, CRYPTO_TOKEN_GIVEAWAY_LIGHT, CRYPTO_TOKEN_GIVEAWAY_DARK, CRYPTO_TRANSFERS_ENROLLMENT_COMPLETED, CRYPTO_TRANSFERS_ENROLLMENT_PENDING, CRYPTO_TRANSFERS_ENROLLMENT_ERROR, CM_SIGN_UP, CM_DISPUTES_INTRO, CALL_INTRO_DAY, CALL_INTRO_NIGHT, PUT_INTRO_DAY, PUT_INTRO_NIGHT, BUY_CALL_DAY, BUY_CALL_NIGHT, BUY_PUT_DAY, BUY_PUT_NIGHT, SELL_CALL_DAY, SELL_CALL_NIGHT, SELL_PUT_DAY, SELL_PUT_NIGHT, HORIZONTAL_SPREAD_DAY, HORIZONTAL_SPREAD_NIGHT, VERTICAL_SPREAD_DAY, VERTICAL_SPREAD_NIGHT, CALENDAR_SPREAD_DAY, CALENDAR_SPREAD_NIGHT, CALL_CREDIT_SPREAD_DAY, CALL_CREDIT_SPREAD_NIGHT, CALL_DEBIT_SPREAD_DAY, CALL_DEBIT_SPREAD_NIGHT, IRON_BUTTERFLY_DAY, IRON_BUTTERFLY_NIGHT, IRON_CONDOR_DAY, IRON_CONDOR_NIGHT, PUT_CREDIT_SPREAD_DAY, PUT_CREDIT_SPREAD_NIGHT, PUT_DEBIT_SPREAD_DAY, PUT_DEBIT_SPREAD_NIGHT, OPTIONS_WATCHLIST_FG, OPTIONS_WATCHLIST_MG, OPTIONS_WATCHLIST_BG, OPTIONS_WATCHLIST_LIGHT, OPTIONS_ALERT_ONBOARDING, OPTIONS_ONBOARDING_L0_DAY, OPTIONS_ONBOARDING_L0_NIGHT, OPTIONS_ONBOARDING_L2_DAY, OPTIONS_ONBOARDING_L2_NEON, OPTIONS_ONBOARDING_L2_NIGHT, OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_DAY, OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_NIGHT, OPTIONS_ONBOARDING_ALL_SET_SDP_DAY, OPTIONS_ONBOARDING_ALL_SET_SDP_NIGHT, OPTIONS_ONBOARDING_ALL_SET_NON_SDP_DAY, OPTIONS_ONBOARDING_ALL_SET_NON_SDP_NIGHT, SUPPORT_CALL_WAITING, SUPPORT_CALL_CANCELLED, SUPPORT_CALL_MISSED, SUPPORT_CALL_ASSIGNED, SUPPORT_CALL_COMPLETED, RECS_LANDING_ORB_DAY, RECS_LANDING_ORB_NIGHT, RECS_PROGRESSION_ORB_DAY, RECS_PROGRESSION_ORB_NIGHT, RECS_RISK_LOADER_DAY, RECS_RISK_LOADER_NIGHT, RECS_RISK_INDICATOR_DAY, RECS_RISK_INDICATOR_NIGHT, RECS_RISK_SHEEN, RECS_PORTFOLIO_ASSETS_DAY, RECS_PORTFOLIO_ASSETS_NIGHT, RECS_CELEBRATION_DAY, RECS_CELEBRATION_NIGHT, RECS_RISK_TO_PORTFOLIO_LV1_DAY, RECS_RISK_TO_PORTFOLIO_LV1_NIGHT, RECS_RISK_TO_PORTFOLIO_LV2_DAY, RECS_RISK_TO_PORTFOLIO_LV2_NIGHT, RECS_RISK_TO_PORTFOLIO_LV3_DAY, RECS_RISK_TO_PORTFOLIO_LV3_NIGHT, RECS_RISK_TO_PORTFOLIO_LV4_DAY, RECS_RISK_TO_PORTFOLIO_LV4_NIGHT, RECS_RISK_TO_PORTFOLIO_LV5_DAY, RECS_RISK_TO_PORTFOLIO_LV5_NIGHT, RECS_RET_INTRO, RECS_RET_CALCULATION, RECS_RET_CELEBRATION, RECS_RET_RECURRING_HOOK, ROUNDUP_REWARDS_FIRST_TRANSACTION, ROUNDUP_REWARDS_WEEKLY_DETAIL, ROUNDUP_REWARDS_WEEKLY_DETAIL_100, ROUNDUP_REWARDS_OVERVIEW_COIN, RHC_TRANSFER_STAY_TUNED, RHC_REWARD_GIFT_OPEN, RHC_TRANSFER_STAY_TUNED_REBRAND_LIGHT, RHC_TRANSFER_STAY_TUNED_REBRAND_DARK, RHC_TRANSFER_COMPLETED_REBRAND_LIGHT, RHC_TRANSFER_COMPLETED_REBRAND_DARK, RHC_TRANSFER_ERROR_LIGHT, RHC_TRANSFER_ERROR_DARK, RHY_WAITLIST_JOIN, RHY_WAITLIST_CAT, RHY_CM_SUNSET_STRONG_HEADER, RHY_CM_SUNSET_TICK, LADDER_NUX_DAY, LADDER_NUX_NIGHT, EQUITIES_LADDER_FTUX_1_DAY, EQUITIES_LADDER_FTUX_1_NIGHT, EQUITIES_LADDER_FTUX_2_DAY, EQUITIES_LADDER_FTUX_2_NIGHT, EQUITIES_LADDER_FTUX_3_DAY, EQUITIES_LADDER_FTUX_3_NIGHT, EQUITIES_LADDER_FTUX_4_DAY, EQUITIES_LADDER_FTUX_4_NIGHT, EQUITIES_LADDER_FTUX_5_DAY, EQUITIES_LADDER_FTUX_5_NIGHT, EQUITIES_LADDER_FTUX_6_DAY, EQUITIES_LADDER_FTUX_6_NIGHT, EQUITIES_LADDER_FTUX_7_DAY, EQUITIES_LADDER_FTUX_7_NIGHT, EQUITIES_LADDER_FTUX_8_DAY, EQUITIES_LADDER_FTUX_8_NIGHT, EQUITIES_LADDER_FTUX_9_DAY, EQUITIES_LADDER_FTUX_9_NIGHT, EQUITIES_LADDER_FTUX_10_DAY, EQUITIES_LADDER_FTUX_10_NIGHT, EQUITIES_LADDER_FTUX_11_DAY, EQUITIES_LADDER_FTUX_11_NIGHT, EQUITIES_LADDER_FTUX_LOADER_DAY, EQUITIES_LADDER_FTUX_LOADER_NIGHT, EQUITIES_LADDER_ZOOMING_DISCOVERY_DAY, EQUITIES_LADDER_ZOOMING_DISCOVERY_NIGHT, FUTURES_LADDER_FTUX_CHART_EDUCATION_NIGHT, FUTURES_LADDER_FTUX_LAST_TRADED_PRICE_NIGHT, FUTURES_LADDER_FTUX_TICK_SIZE_NIGHT, FUTURES_LADDER_FTUX_BID_BARS_NIGHT, FUTURES_LADDER_FTUX_ASK_BARS_NIGHT, FUTURES_LADDER_FTUX_MARKET_ORDER_NIGHT, FUTURES_LADDER_FTUX_ROW_NIGHT, FUTURES_LADDER_FTUX_EDIT_ORDER_NIGHT, FUTURES_LADDER_FTUX_CANCEL_NIGHT, FUTURES_LADDER_FTUX_AVG_PRICE_NIGHT, FUTURES_LADDER_FTUX_CLOSE_POSITION_NIGHT, FUTURES_LADDER_FTUX_LOADER_NIGHT, FUTURES_LADDER_FTUX_CHART_EDUCATION_DAY, FUTURES_LADDER_FTUX_LAST_TRADED_PRICE_DAY, FUTURES_LADDER_FTUX_TICK_SIZE_DAY, FUTURES_LADDER_FTUX_BID_BARS_DAY, FUTURES_LADDER_FTUX_ASK_BARS_DAY, FUTURES_LADDER_FTUX_MARKET_ORDER_DAY, FUTURES_LADDER_FTUX_ROW_DAY, FUTURES_LADDER_FTUX_EDIT_ORDER_DAY, FUTURES_LADDER_FTUX_CANCEL_DAY, FUTURES_LADDER_FTUX_AVG_PRICE_DAY, FUTURES_LADDER_FTUX_CLOSE_POSITION_DAY, FUTURES_LADDER_FTUX_LOADER_DAY, FUTURES_UK_QUESTIONNAIRE_SPLASH_DAY, FUTURES_UK_QUESTIONNAIRE_SPLASH_NIGHT, MIB_ACCOUNT_CREATED_NIGHT, MIB_ACCOUNT_CREATED_DAY, TRANSFER_IDLE_CASH_NG_LIGHT, TRANSFER_IDLE_CASH_NG_DARK, TRANSFER_IDLE_CASH_YG_LIGHT, TRANSFER_IDLE_CASH_YG_DARK, IAT_INTRO_DARK, IAT_CONFIRMATION_LIGHT, IAT_CONFIRMATION_DARK, BRAND_REFRESH_PHONE_VERIFY_LIGHT, BRAND_REFRESH_PHONE_VERIFY_DARK, BRAND_REFRESH_RECURRING_DEPOSIT_LIGHT, BRAND_REFRESH_RECURRING_DEPOSIT_DARK, BRAND_REFRESH_BANK_VERIFY_LIGHT, BRAND_REFRESH_BANK_VERIFY_DARK, BRAND_REFRESH_VERIFY_IDENTITY_LIGHT, BRAND_REFRESH_VERIFY_IDENTITY_DARK, BRAND_REFRESH_UPLOAD_ID_LIGHT, BRAND_REFRESH_UPLOAD_ID_DARK, CORTEX_ICON_LIGHT, CORTEX_ICON_DARK, ISA_ONBOARDING_INTRO_LIGHT, ISA_ONBOARDING_INTRO_DARK, ISA_ONBOARDING_TWO_PERCENT_CASH_BACK_LIGHT, ISA_ONBOARDING_TWO_PERCENT_CASH_BACK_DARK, ISA_ONBOARDING_TAX_FREE_INVESTING_LIGHT, ISA_ONBOARDING_TAX_FREE_INVESTING_DARK, ISA_ONBOARDING_ZERO_ACCOUNT_FEE_LIGHT, ISA_ONBOARDING_ZERO_ACCOUNT_FEE_DARK, ISA_ONBOARDING_SAFETY_LIGHT, ISA_ONBOARDING_SAFETY_DARK, ISA_ONBOARDING_TRANSFER_YOUR_ISA_LIGHT, ISA_ONBOARDING_TRANSFER_YOUR_ISA_DARK, ISA_CONTRIBUTION_DOT_LIGHT, ISA_CONTRIBUTION_DOT_DARK, ISA_CONTRIBUTION_MINI_LIGHT, ISA_CONTRIBUTION_MINI_DARK, ISA_CONTRIBUTION_MAX_LIGHT, ISA_CONTRIBUTION_MAX_DARK, ISA_CONTRIBUTION_CONFIRMATION_STANDARD_LIGHT, ISA_CONTRIBUTION_CONFIRMATION_STANDARD_DARK, ISA_CONTRIBUTION_CONFIRMATION_MAXED_LIGHT, ISA_CONTRIBUTION_CONFIRMATION_MAXED_DARK};
    }

    public static EnumEntries<LottieUrl> getEntries() {
        return $ENTRIES;
    }

    private LottieUrl(String str, int i, String str2) {
        this.url = Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegments(str2).build();
    }

    static {
        LottieUrl[] lottieUrlArr$values = $values();
        $VALUES = lottieUrlArr$values;
        $ENTRIES = EnumEntries2.enumEntries(lottieUrlArr$values);
    }

    public final HttpUrl getUrl() {
        return this.url;
    }

    public final void prefetch(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LottieCompositionFactory.fromUrl(context, this.url.getUrl());
    }

    public final Single<LottieComposition> fetch(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Single<LottieComposition> singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.robinhood.shared.remote.assets.LottieUrl.fetch.1
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(final SingleEmitter<LottieComposition> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                LottieCompositionFactory.fromUrl(context, this.getUrl().getUrl()).addListener(new LottieListener() { // from class: com.robinhood.shared.remote.assets.LottieUrl.fetch.1.1
                    @Override // com.airbnb.lottie.LottieListener
                    public final void onResult(LottieComposition p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        emitter.onSuccess(p0);
                    }
                }).addFailureListener(new LottieListener() { // from class: com.robinhood.shared.remote.assets.LottieUrl.fetch.1.2
                    @Override // com.airbnb.lottie.LottieListener
                    public final void onResult(Throwable p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        emitter.onError(p0);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleCreate, "create(...)");
        return singleCreate;
    }

    public static LottieUrl valueOf(String str) {
        return (LottieUrl) Enum.valueOf(LottieUrl.class, str);
    }

    public static LottieUrl[] values() {
        return (LottieUrl[]) $VALUES.clone();
    }
}
