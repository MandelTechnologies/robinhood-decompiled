package com.robinhood.android.crypto.tab.p093ui.interest;

import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import moneytree.p510v1.GetMembershipDetailsResponseDto;
import moneytree.p510v1.MMFProgramStateDto;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: CryptoHomeInterestDataState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 a2\u00020\u0001:\u0001aB#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028AX\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010,\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0018R\u0016\u0010.\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010&R\u0016\u00100\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0018R\u0016\u00102\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0016\u00104\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0018R\u0016\u00106\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0018R\u0016\u00108\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0018R\u0016\u0010:\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0018R\u0016\u0010<\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0018R\u001a\u0010@\u001a\u00020\u001d8@X\u0081\u0004¢\u0006\f\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010)R\u0011\u0010B\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bA\u0010\u0018R\u0011\u0010C\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bC\u0010)R\u0011\u0010D\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bD\u0010)R\u0011\u0010E\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bE\u0010)R\u0011\u0010F\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bF\u0010)R\u0011\u0010J\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010N\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010P\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bO\u0010IR\u0019\u0010T\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bU\u0010\u0018R\u0011\u0010X\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bW\u0010\u0018R\u0011\u0010Z\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bY\u0010\u0018R\u0013\u0010\\\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\b[\u0010IR\u0013\u0010^\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b]\u0010\u0018R\u0013\u0010`\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b_\u0010\u0018¨\u0006b"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDataState;", "", "Lmoneytree/v1/GetMembershipDetailsResponseDto;", "membership", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "localizedDateTimeFormatter", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lmoneytree/v1/GetMembershipDetailsResponseDto;Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;Lj$/time/Clock;)V", "Lcom/robinhood/rosetta/common/MoneyDto;", "", "formatLocalized", "(Lcom/robinhood/rosetta/common/MoneyDto;)Ljava/lang/String;", "component2", "()Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "component3", "()Lj$/time/Clock;", "component1$feature_crypto_tab_externalDebug", "()Lmoneytree/v1/GetMembershipDetailsResponseDto;", "component1", "copy", "(Lmoneytree/v1/GetMembershipDetailsResponseDto;Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;Lj$/time/Clock;)Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDataState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmoneytree/v1/GetMembershipDetailsResponseDto;", "getMembership$feature_crypto_tab_externalDebug", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "Lj$/time/Clock;", "Lcom/robinhood/android/crypto/tab/ui/interest/DataRowWithInfoDialogContent;", "getEarnedThisMonthDataRow", "()Lcom/robinhood/android/crypto/tab/ui/interest/DataRowWithInfoDialogContent;", "earnedThisMonthDataRow", "getEarnedThisMonthNonZero", "()Z", "earnedThisMonthNonZero", "getEarnedThisMonthFormatted", "earnedThisMonthFormatted", "getLifetimeInterestDataRow", "lifetimeInterestDataRow", "getLifetimeInterestPaidFormatted", "lifetimeInterestPaidFormatted", "getFundsEarningInterestDataRow", "fundsEarningInterestDataRow", "getFundsEarningInterestFormatted", "fundsEarningInterestFormatted", "getFormattedApy", "formattedApy", "getFormattedPromoExpireDate", "formattedPromoExpireDate", "getFormattedPromoBoostApy", "formattedPromoBoostApy", "getFormattedPromoApy", "formattedPromoApy", "getHasPromoRate$feature_crypto_tab_externalDebug", "getHasPromoRate$feature_crypto_tab_externalDebug$annotations", "()V", "hasPromoRate", "getSettingsDeeplink", "settingsDeeplink", "isLoading", "isPreEnrollment", "isEnrolled", "isActive", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "title", "Lcom/robinhood/android/crypto/tab/ui/interest/TextWithPartialHighlight;", "getSubtitle", "()Lcom/robinhood/android/crypto/tab/ui/interest/TextWithPartialHighlight;", "subtitle", "getApyBadge", "apyBadge", "Lkotlinx/collections/immutable/ImmutableList;", "getDataRows", "()Lkotlinx/collections/immutable/ImmutableList;", "dataRows", "getCtaText", "ctaText", "getCtaDeeplink", "ctaDeeplink", "getProtectedAmountValue", "protectedAmountValue", "getFeeDisclaimer", "feeDisclaimer", "getFormattedPromoPeriodFeeRate", "formattedPromoPeriodFeeRate", "getFormattedFeeRate", "formattedFeeRate", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeInterestDataState {
    private static final String SETTINGS_DEEPLINK = "robinhood-global://cash_interest_settings";
    private final Clock clock;
    private final LocalizedDateTimeFormatter localizedDateTimeFormatter;
    private final GetMembershipDetailsResponseDto membership;
    public static final int $stable = 8;

    /* renamed from: component2, reason: from getter */
    private final LocalizedDateTimeFormatter getLocalizedDateTimeFormatter() {
        return this.localizedDateTimeFormatter;
    }

    /* renamed from: component3, reason: from getter */
    private final Clock getClock() {
        return this.clock;
    }

    public static /* synthetic */ CryptoHomeInterestDataState copy$default(CryptoHomeInterestDataState cryptoHomeInterestDataState, GetMembershipDetailsResponseDto getMembershipDetailsResponseDto, LocalizedDateTimeFormatter localizedDateTimeFormatter, Clock clock, int i, Object obj) {
        if ((i & 1) != 0) {
            getMembershipDetailsResponseDto = cryptoHomeInterestDataState.membership;
        }
        if ((i & 2) != 0) {
            localizedDateTimeFormatter = cryptoHomeInterestDataState.localizedDateTimeFormatter;
        }
        if ((i & 4) != 0) {
            clock = cryptoHomeInterestDataState.clock;
        }
        return cryptoHomeInterestDataState.copy(getMembershipDetailsResponseDto, localizedDateTimeFormatter, clock);
    }

    public static /* synthetic */ void getHasPromoRate$feature_crypto_tab_externalDebug$annotations() {
    }

    /* renamed from: component1$feature_crypto_tab_externalDebug, reason: from getter */
    public final GetMembershipDetailsResponseDto getMembership() {
        return this.membership;
    }

    public final CryptoHomeInterestDataState copy(GetMembershipDetailsResponseDto membership, LocalizedDateTimeFormatter localizedDateTimeFormatter, Clock clock) {
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        Intrinsics.checkNotNullParameter(clock, "clock");
        return new CryptoHomeInterestDataState(membership, localizedDateTimeFormatter, clock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeInterestDataState)) {
            return false;
        }
        CryptoHomeInterestDataState cryptoHomeInterestDataState = (CryptoHomeInterestDataState) other;
        return Intrinsics.areEqual(this.membership, cryptoHomeInterestDataState.membership) && Intrinsics.areEqual(this.localizedDateTimeFormatter, cryptoHomeInterestDataState.localizedDateTimeFormatter) && Intrinsics.areEqual(this.clock, cryptoHomeInterestDataState.clock);
    }

    public int hashCode() {
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        return ((((getMembershipDetailsResponseDto == null ? 0 : getMembershipDetailsResponseDto.hashCode()) * 31) + this.localizedDateTimeFormatter.hashCode()) * 31) + this.clock.hashCode();
    }

    public String toString() {
        return "CryptoHomeInterestDataState(membership=" + this.membership + ", localizedDateTimeFormatter=" + this.localizedDateTimeFormatter + ", clock=" + this.clock + ")";
    }

    public CryptoHomeInterestDataState(GetMembershipDetailsResponseDto getMembershipDetailsResponseDto, LocalizedDateTimeFormatter localizedDateTimeFormatter, Clock clock) {
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.membership = getMembershipDetailsResponseDto;
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.clock = clock;
    }

    public /* synthetic */ CryptoHomeInterestDataState(GetMembershipDetailsResponseDto getMembershipDetailsResponseDto, LocalizedDateTimeFormatter localizedDateTimeFormatter, Clock clock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : getMembershipDetailsResponseDto, localizedDateTimeFormatter, clock);
    }

    public final GetMembershipDetailsResponseDto getMembership$feature_crypto_tab_externalDebug() {
        return this.membership;
    }

    public final String getSettingsDeeplink() {
        return SETTINGS_DEEPLINK;
    }

    public final boolean isLoading() {
        return this.membership == null;
    }

    public final boolean isPreEnrollment() {
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        return getMembershipDetailsResponseDto != null && getMembershipDetailsResponseDto.getEnrollment_state() == MMFProgramStateDto.MMF_PROGRAM_STATE_UNSPECIFIED;
    }

    public final boolean isEnrolled() {
        MMFProgramStateDto enrollment_state;
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        if (getMembershipDetailsResponseDto == null || (enrollment_state = getMembershipDetailsResponseDto.getEnrollment_state()) == null) {
            return false;
        }
        return CollectionsKt.listOf((Object[]) new MMFProgramStateDto[]{MMFProgramStateDto.MMF_PROGRAM_STATE_ACTIVE, MMFProgramStateDto.MMF_PROGRAM_STATE_INACTIVE}).contains(enrollment_state);
    }

    public final boolean isActive() {
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        return (getMembershipDetailsResponseDto != null ? getMembershipDetailsResponseDto.getEnrollment_state() : null) == MMFProgramStateDto.MMF_PROGRAM_STATE_ACTIVE;
    }

    public final StringResource getTitle() {
        if (isPreEnrollment()) {
            return StringResource.INSTANCE.invoke(C13013R.string.crypto_home_interest_section_title_earn_apy, getHasPromoRate$feature_crypto_tab_externalDebug() ? getFormattedPromoApy() : getFormattedApy());
        }
        return isEnrolled() ? StringResource.INSTANCE.invoke(C13013R.string.crypto_home_interest_section_title, new Object[0]) : StringResource.INSTANCE.invoke("");
    }

    public final TextWithPartialHighlight getSubtitle() {
        if (!isPreEnrollment()) {
            return null;
        }
        if (getHasPromoRate$feature_crypto_tab_externalDebug()) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return new TextWithPartialHighlight(companion.invoke(C13013R.string.crypto_home_interest_section_subtitle_promo_first_part, new Object[0]), companion.invoke(C13013R.string.crypto_home_interest_section_subtitle_promo_highlighted_part, getFormattedPromoBoostApy()), companion.invoke(C13013R.string.crypto_home_interest_section_subtitle_promo_last_part, getFormattedPromoExpireDate()));
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        return new TextWithPartialHighlight(companion2.invoke(C13013R.string.crypto_home_interest_section_subtitle, new Object[0]), companion2.invoke(""), companion2.invoke(""));
    }

    public final StringResource getApyBadge() {
        String formattedApy;
        if (!isEnrolled()) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C13013R.string.crypto_home_interest_section_apy_badge;
        if (getHasPromoRate$feature_crypto_tab_externalDebug()) {
            formattedApy = getFormattedPromoApy();
        } else {
            formattedApy = getFormattedApy();
        }
        return companion.invoke(i, formattedApy);
    }

    public final ImmutableList<DataRowWithInfoDialogContent> getDataRows() {
        if (isEnrolled()) {
            return extensions2.toPersistentList(CollectionsKt.take(CollectionsKt.listOfNotNull((Object[]) new DataRowWithInfoDialogContent[]{getEarnedThisMonthDataRow(), getFundsEarningInterestDataRow(), getLifetimeInterestDataRow()}), 2));
        }
        return null;
    }

    public final String getCtaText() {
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        String cta_text = getMembershipDetailsResponseDto != null ? getMembershipDetailsResponseDto.getCta_text() : null;
        return cta_text == null ? "" : cta_text;
    }

    public final String getCtaDeeplink() {
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        String cta_deeplink = getMembershipDetailsResponseDto != null ? getMembershipDetailsResponseDto.getCta_deeplink() : null;
        return cta_deeplink == null ? "" : cta_deeplink;
    }

    public final String getProtectedAmountValue() {
        return Money.format$default(new Money(Currencies.EUR, new BigDecimal("22000")), CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), true, null, true, 0, null, false, null, false, false, 932, null);
    }

    public final StringResource getFeeDisclaimer() {
        Tuples2 tuples2M3642to;
        IdlDecimal fee_percentage;
        IdlDecimal promo_period_fee;
        if (getHasPromoRate$feature_crypto_tab_externalDebug()) {
            GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
            tuples2M3642to = Tuples4.m3642to((getMembershipDetailsResponseDto == null || (promo_period_fee = getMembershipDetailsResponseDto.getPromo_period_fee()) == null) ? null : promo_period_fee.toBigDecimalOrNull(), getFormattedPromoPeriodFeeRate());
        } else {
            GetMembershipDetailsResponseDto getMembershipDetailsResponseDto2 = this.membership;
            tuples2M3642to = Tuples4.m3642to((getMembershipDetailsResponseDto2 == null || (fee_percentage = getMembershipDetailsResponseDto2.getFee_percentage()) == null) ? null : fee_percentage.toBigDecimalOrNull(), getFormattedFeeRate());
        }
        BigDecimal bigDecimal = (BigDecimal) tuples2M3642to.component1();
        String str = (String) tuples2M3642to.component2();
        if (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C13013R.string.crypto_home_interest_how_it_works_sheet_fee_line, str);
    }

    public final String getFormattedPromoPeriodFeeRate() {
        IdlDecimal promo_period_fee;
        BigDecimal bigDecimalOrNull;
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        if (getMembershipDetailsResponseDto == null || (promo_period_fee = getMembershipDetailsResponseDto.getPromo_period_fee()) == null || (bigDecimalOrNull = promo_period_fee.toBigDecimalOrNull()) == null) {
            return null;
        }
        return FormatsLocalized.getPercentFormat().format(bigDecimalOrNull);
    }

    public final String getFormattedFeeRate() {
        IdlDecimal fee_percentage;
        BigDecimal bigDecimalOrNull;
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        if (getMembershipDetailsResponseDto == null || (fee_percentage = getMembershipDetailsResponseDto.getFee_percentage()) == null || (bigDecimalOrNull = fee_percentage.toBigDecimalOrNull()) == null) {
            return null;
        }
        return FormatsLocalized.getPercentFormat().format(bigDecimalOrNull);
    }

    private final DataRowWithInfoDialogContent getEarnedThisMonthDataRow() {
        String earnedThisMonthFormatted = getEarnedThisMonthFormatted();
        if (this.membership == null || (!(getEarnedThisMonthNonZero() || isActive()) || earnedThisMonthFormatted == null)) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return new DataRowWithInfoDialogContent(companion.invoke(C13013R.string.crypto_home_interest_section_row_label_earned_this_month, new Object[0]), companion.invoke(earnedThisMonthFormatted), null);
    }

    private final boolean getEarnedThisMonthNonZero() {
        MoneyDto interest_accrued;
        IdlDecimal amount;
        BigDecimal bigDecimalOrNull;
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        return (getMembershipDetailsResponseDto == null || (interest_accrued = getMembershipDetailsResponseDto.getInterest_accrued()) == null || (amount = interest_accrued.getAmount()) == null || (bigDecimalOrNull = amount.toBigDecimalOrNull()) == null || bigDecimalOrNull.compareTo(BigDecimal.ZERO) <= 0) ? false : true;
    }

    private final String getEarnedThisMonthFormatted() {
        MoneyDto interest_accrued;
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        if (getMembershipDetailsResponseDto == null || (interest_accrued = getMembershipDetailsResponseDto.getInterest_accrued()) == null) {
            return null;
        }
        return formatLocalized(interest_accrued);
    }

    private final DataRowWithInfoDialogContent getLifetimeInterestDataRow() {
        String lifetimeInterestPaidFormatted = getLifetimeInterestPaidFormatted();
        if (!isEnrolled() || lifetimeInterestPaidFormatted == null) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return new DataRowWithInfoDialogContent(companion.invoke(C13013R.string.crypto_home_interest_section_row_label_lifetime, new Object[0]), companion.invoke(lifetimeInterestPaidFormatted), null);
    }

    private final String getLifetimeInterestPaidFormatted() {
        MoneyDto lifetime_interest_paid;
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        if (getMembershipDetailsResponseDto == null || (lifetime_interest_paid = getMembershipDetailsResponseDto.getLifetime_interest_paid()) == null) {
            return null;
        }
        return formatLocalized(lifetime_interest_paid);
    }

    private final DataRowWithInfoDialogContent getFundsEarningInterestDataRow() {
        String fundsEarningInterestFormatted = getFundsEarningInterestFormatted();
        if (!isEnrolled() || !isActive() || fundsEarningInterestFormatted == null) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return new DataRowWithInfoDialogContent(companion.invoke(C13013R.string.crypto_home_interest_section_row_label_funds_earning, new Object[0]), companion.invoke(fundsEarningInterestFormatted), new InfoDialogContent(companion.invoke(C13013R.string.crypto_home_interest_section_row_dialog_title_funds_earning, new Object[0]), companion.invoke(C13013R.string.crypto_home_interest_section_row_dialog_body_funds_earning, new Object[0])));
    }

    private final String getFundsEarningInterestFormatted() {
        MoneyDto sweep_balance;
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        if (getMembershipDetailsResponseDto == null || (sweep_balance = getMembershipDetailsResponseDto.getSweep_balance()) == null) {
            return null;
        }
        return formatLocalized(sweep_balance);
    }

    private final String getFormattedApy() {
        IdlDecimal apy_rate;
        BigDecimal bigDecimalOrNull;
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        if (getMembershipDetailsResponseDto == null || (apy_rate = getMembershipDetailsResponseDto.getApy_rate()) == null || (bigDecimalOrNull = apy_rate.toBigDecimalOrNull()) == null) {
            return null;
        }
        return FormatsLocalized.getPercentFormat().format(bigDecimalOrNull);
    }

    private final String getFormattedPromoExpireDate() {
        Instant promo_period_apy_expiry;
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        if (getMembershipDetailsResponseDto == null || (promo_period_apy_expiry = getMembershipDetailsResponseDto.getPromo_period_apy_expiry()) == null) {
            return null;
        }
        return this.localizedDateTimeFormatter.format(promo_period_apy_expiry, LocalizedDateTimeFormatter.Format.MediumDate.INSTANCE);
    }

    private final String getFormattedPromoBoostApy() {
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        if (getMembershipDetailsResponseDto != null) {
            BigDecimal bigDecimalOrNull = getMembershipDetailsResponseDto.getPromo_period_apy().toBigDecimalOrNull();
            BigDecimal bigDecimalOrNull2 = getMembershipDetailsResponseDto.getApy_rate().toBigDecimalOrNull();
            if (bigDecimalOrNull != null && bigDecimalOrNull2 != null) {
                NumberFormatter percentFormat = FormatsLocalized.getPercentFormat();
                BigDecimal bigDecimalSubtract = bigDecimalOrNull.subtract(bigDecimalOrNull2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                return percentFormat.format(bigDecimalSubtract);
            }
            if (bigDecimalOrNull2 != null) {
                return FormatsLocalized.getPercentFormat().format(new BigDecimal("0"));
            }
        }
        return null;
    }

    private final String getFormattedPromoApy() {
        IdlDecimal promo_period_apy;
        BigDecimal bigDecimalOrNull;
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        if (getMembershipDetailsResponseDto == null || (promo_period_apy = getMembershipDetailsResponseDto.getPromo_period_apy()) == null || (bigDecimalOrNull = promo_period_apy.toBigDecimalOrNull()) == null) {
            return null;
        }
        return FormatsLocalized.getPercentFormat().format(bigDecimalOrNull);
    }

    public final boolean getHasPromoRate$feature_crypto_tab_externalDebug() {
        IdlDecimal promo_period_apy;
        GetMembershipDetailsResponseDto getMembershipDetailsResponseDto = this.membership;
        return (((getMembershipDetailsResponseDto == null || (promo_period_apy = getMembershipDetailsResponseDto.getPromo_period_apy()) == null) ? null : promo_period_apy.toBigDecimalOrNull()) == null || this.membership.getPromo_period_apy_expiry() == null || this.clock.instant().compareTo(this.membership.getPromo_period_apy_expiry()) >= 0) ? false : true;
    }

    private final String formatLocalized(MoneyDto moneyDto) {
        return Money.format$default(Money3.toMoney(moneyDto), CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), true, null, true, 0, null, true, null, false, false, 948, null);
    }
}
