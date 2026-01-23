package com.robinhood.shared.trade.crypto.p397ui.recurringHook;

import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.util.NumberUtils;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.recurringHook.CryptoOrderRecurringHookViewState;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;
import p479j$.time.LocalTime;

/* compiled from: CryptoOrderRecurringHookDataState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\bHÀ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u001a\u0010\t\u001a\u00020\b8AX\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010/\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00103\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0017\u00109\u001a\b\u0012\u0004\u0012\u000206058F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookDataState;", "", "", "currencyCode", "j$/time/LocalDate", "nextInvestmentDate", "Lcom/robinhood/shared/app/type/AppType;", "appType", "", "isUsRecurringVTExperimentEnabled", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;", "selectedFrequency", "<init>", "(Ljava/lang/String;Lj$/time/LocalDate;Lcom/robinhood/shared/app/type/AppType;ZLcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;)V", "frequency", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "(Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;)Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "component1", "()Ljava/lang/String;", "component3", "()Lcom/robinhood/shared/app/type/AppType;", "component2", "()Lj$/time/LocalDate;", "component4$feature_trade_crypto_externalDebug", "()Z", "component4", "component5", "()Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;", "copy", "(Ljava/lang/String;Lj$/time/LocalDate;Lcom/robinhood/shared/app/type/AppType;ZLcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;)Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookDataState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Lj$/time/LocalDate;", "getNextInvestmentDate", "Lcom/robinhood/shared/app/type/AppType;", "Z", "isUsRecurringVTExperimentEnabled$feature_trade_crypto_externalDebug", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;", "getSelectedFrequency", "subtitleText", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitleText", "()Lcom/robinhood/utils/resource/StringResource;", "footerText", "getFooterText", "", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookViewState$FrequencyRowItem;", "getRowItems", "()Ljava/util/List;", "rowItems", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderRecurringHookDataState {
    public static final int $stable = 8;
    private final AppType appType;
    private final String currencyCode;
    private final StringResource footerText;
    private final boolean isUsRecurringVTExperimentEnabled;
    private final LocalDate nextInvestmentDate;
    private final CryptoOrderRecurringHookFrequency selectedFrequency;
    private final StringResource subtitleText;

    /* compiled from: CryptoOrderRecurringHookDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.TRADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoOrderRecurringHookFrequency.values().length];
            try {
                iArr2[CryptoOrderRecurringHookFrequency.ONE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CryptoOrderRecurringHookFrequency.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CryptoOrderRecurringHookFrequency.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CryptoOrderRecurringHookFrequency.BIWEEKLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CryptoOrderRecurringHookFrequency.MONTHLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component3, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    public static /* synthetic */ CryptoOrderRecurringHookDataState copy$default(CryptoOrderRecurringHookDataState cryptoOrderRecurringHookDataState, String str, LocalDate localDate, AppType appType, boolean z, CryptoOrderRecurringHookFrequency cryptoOrderRecurringHookFrequency, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoOrderRecurringHookDataState.currencyCode;
        }
        if ((i & 2) != 0) {
            localDate = cryptoOrderRecurringHookDataState.nextInvestmentDate;
        }
        if ((i & 4) != 0) {
            appType = cryptoOrderRecurringHookDataState.appType;
        }
        if ((i & 8) != 0) {
            z = cryptoOrderRecurringHookDataState.isUsRecurringVTExperimentEnabled;
        }
        if ((i & 16) != 0) {
            cryptoOrderRecurringHookFrequency = cryptoOrderRecurringHookDataState.selectedFrequency;
        }
        CryptoOrderRecurringHookFrequency cryptoOrderRecurringHookFrequency2 = cryptoOrderRecurringHookFrequency;
        AppType appType2 = appType;
        return cryptoOrderRecurringHookDataState.copy(str, localDate, appType2, z, cryptoOrderRecurringHookFrequency2);
    }

    /* renamed from: component2, reason: from getter */
    public final LocalDate getNextInvestmentDate() {
        return this.nextInvestmentDate;
    }

    /* renamed from: component4$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getIsUsRecurringVTExperimentEnabled() {
        return this.isUsRecurringVTExperimentEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final CryptoOrderRecurringHookFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final CryptoOrderRecurringHookDataState copy(String currencyCode, LocalDate nextInvestmentDate, AppType appType, boolean isUsRecurringVTExperimentEnabled, CryptoOrderRecurringHookFrequency selectedFrequency) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        return new CryptoOrderRecurringHookDataState(currencyCode, nextInvestmentDate, appType, isUsRecurringVTExperimentEnabled, selectedFrequency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderRecurringHookDataState)) {
            return false;
        }
        CryptoOrderRecurringHookDataState cryptoOrderRecurringHookDataState = (CryptoOrderRecurringHookDataState) other;
        return Intrinsics.areEqual(this.currencyCode, cryptoOrderRecurringHookDataState.currencyCode) && Intrinsics.areEqual(this.nextInvestmentDate, cryptoOrderRecurringHookDataState.nextInvestmentDate) && this.appType == cryptoOrderRecurringHookDataState.appType && this.isUsRecurringVTExperimentEnabled == cryptoOrderRecurringHookDataState.isUsRecurringVTExperimentEnabled && this.selectedFrequency == cryptoOrderRecurringHookDataState.selectedFrequency;
    }

    public int hashCode() {
        return (((((((this.currencyCode.hashCode() * 31) + this.nextInvestmentDate.hashCode()) * 31) + this.appType.hashCode()) * 31) + Boolean.hashCode(this.isUsRecurringVTExperimentEnabled)) * 31) + this.selectedFrequency.hashCode();
    }

    public String toString() {
        return "CryptoOrderRecurringHookDataState(currencyCode=" + this.currencyCode + ", nextInvestmentDate=" + this.nextInvestmentDate + ", appType=" + this.appType + ", isUsRecurringVTExperimentEnabled=" + this.isUsRecurringVTExperimentEnabled + ", selectedFrequency=" + this.selectedFrequency + ")";
    }

    public CryptoOrderRecurringHookDataState(String currencyCode, LocalDate nextInvestmentDate, AppType appType, boolean z, CryptoOrderRecurringHookFrequency selectedFrequency) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        this.currencyCode = currencyCode;
        this.nextInvestmentDate = nextInvestmentDate;
        this.appType = appType;
        this.isUsRecurringVTExperimentEnabled = z;
        this.selectedFrequency = selectedFrequency;
        StringResource.Companion companion = StringResource.INSTANCE;
        this.subtitleText = companion.invoke(C40095R.string.crypto_order_recurring_hook_description, currencyCode);
        int i = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
        if (i == 1) {
            stringResourceInvoke = companion.invoke(C40095R.string.crypto_order_recurring_hook_footer, new Object[0]);
        } else {
            if (i != 2) {
                if (i == 3) {
                    throw new IllegalStateException("NCW not supported");
                }
                throw new NoWhenBranchMatchedException();
            }
            int i2 = C40095R.string.rhc_order_recurring_hook_footer_v2;
            LocalTimeFormatter localTimeFormatter = LocalTimeFormatter.SHORT_LOCALIZED;
            LocalTime localTimeM3408of = LocalTime.m3408of(16, 30);
            Intrinsics.checkNotNullExpressionValue(localTimeM3408of, "of(...)");
            String str = localTimeFormatter.format(localTimeM3408of);
            LocalTime localTimeM3408of2 = LocalTime.m3408of(18, 30);
            Intrinsics.checkNotNullExpressionValue(localTimeM3408of2, "of(...)");
            stringResourceInvoke = companion.invoke(i2, str, localTimeFormatter.format(localTimeM3408of2));
        }
        this.footerText = stringResourceInvoke;
    }

    public /* synthetic */ CryptoOrderRecurringHookDataState(String str, LocalDate localDate, AppType appType, boolean z, CryptoOrderRecurringHookFrequency cryptoOrderRecurringHookFrequency, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, localDate, appType, (i & 8) != 0 ? false : z, cryptoOrderRecurringHookFrequency);
    }

    public final LocalDate getNextInvestmentDate() {
        return this.nextInvestmentDate;
    }

    /* renamed from: isUsRecurringVTExperimentEnabled$feature_trade_crypto_externalDebug */
    public final boolean m2899x225649c1() {
        return this.isUsRecurringVTExperimentEnabled;
    }

    public final CryptoOrderRecurringHookFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final StringResource getSubtitleText() {
        return this.subtitleText;
    }

    public final StringResource getFooterText() {
        return this.footerText;
    }

    public final List<CryptoOrderRecurringHookViewState.FrequencyRowItem> getRowItems() {
        EnumEntries<CryptoOrderRecurringHookFrequency> entries = CryptoOrderRecurringHookFrequency.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        Iterator<CryptoOrderRecurringHookFrequency> it = entries.iterator();
        while (it.hasNext()) {
            CryptoOrderRecurringHookFrequency next = it.next();
            arrayList.add(new CryptoOrderRecurringHookViewState.FrequencyRowItem(next, getPrimaryText(next), getSecondaryText(next), this.selectedFrequency == next));
        }
        return arrayList;
    }

    private final StringResource getPrimaryText(CryptoOrderRecurringHookFrequency frequency) {
        int i = WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_recurring_hook_row_one_time_title, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C11595R.string.investment_schedule_frequency_daily_crypto, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C11595R.string.investment_schedule_frequency_weekly, new Object[0]);
        }
        if (i == 4) {
            return StringResource.INSTANCE.invoke(C11595R.string.investment_schedule_frequency_biweekly, new Object[0]);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C11595R.string.investment_schedule_frequency_monthly, new Object[0]);
    }

    private final StringResource getSecondaryText(CryptoOrderRecurringHookFrequency frequency) {
        int i = WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_recurring_hook_row_one_time_description, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C11595R.string.equity_recurring_schedule_daily_crypto_subtitle, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C11595R.string.equity_recurring_schedule_weekly_subtitle, LocalDateFormatter.WEEKDAY_ONLY.format(this.nextInvestmentDate));
        }
        if (i == 4) {
            return StringResource.INSTANCE.invoke(C11595R.string.equity_recurring_schedule_biweekly_subtitle, LocalDateFormatter.WEEKDAY_ONLY.format(this.nextInvestmentDate));
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C11595R.string.equity_recurring_schedule_monthly_subtitle, NumberUtils.getDayOfMonthOrdinalString(this.nextInvestmentDate));
    }
}
