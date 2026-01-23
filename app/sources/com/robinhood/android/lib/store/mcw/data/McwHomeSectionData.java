package com.robinhood.android.lib.store.mcw.data;

import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.contracts.mcw_cash_balances.proto.p497v1.CtaDto;
import microgram.contracts.mcw_cash_balances.proto.p497v1.DisplayCurrencyDto;
import microgram.contracts.mcw_cash_balances.proto.p497v1.GetCashBalancesHomeSectionResponseDto;

/* compiled from: McwDataModels.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData;", "", "accountNumber", "", "titleData", "Lcom/robinhood/android/lib/store/mcw/data/Cta;", "displayCurrencyBalances", "", "Lcom/robinhood/android/lib/store/mcw/data/DisplayCurrency;", "footerData", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/lib/store/mcw/data/Cta;Ljava/util/List;Lcom/robinhood/android/lib/store/mcw/data/Cta;)V", "getAccountNumber", "()Ljava/lang/String;", "getTitleData", "()Lcom/robinhood/android/lib/store/mcw/data/Cta;", "getDisplayCurrencyBalances", "()Ljava/util/List;", "getFooterData", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class McwHomeSectionData {
    private final String accountNumber;
    private final List<DisplayCurrency> displayCurrencyBalances;
    private final Cta footerData;
    private final Cta titleData;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ McwHomeSectionData copy$default(McwHomeSectionData mcwHomeSectionData, String str, Cta cta, List list, Cta cta2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcwHomeSectionData.accountNumber;
        }
        if ((i & 2) != 0) {
            cta = mcwHomeSectionData.titleData;
        }
        if ((i & 4) != 0) {
            list = mcwHomeSectionData.displayCurrencyBalances;
        }
        if ((i & 8) != 0) {
            cta2 = mcwHomeSectionData.footerData;
        }
        return mcwHomeSectionData.copy(str, cta, list, cta2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Cta getTitleData() {
        return this.titleData;
    }

    public final List<DisplayCurrency> component3() {
        return this.displayCurrencyBalances;
    }

    /* renamed from: component4, reason: from getter */
    public final Cta getFooterData() {
        return this.footerData;
    }

    public final McwHomeSectionData copy(String accountNumber, Cta titleData, List<DisplayCurrency> displayCurrencyBalances, Cta footerData) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(titleData, "titleData");
        Intrinsics.checkNotNullParameter(displayCurrencyBalances, "displayCurrencyBalances");
        Intrinsics.checkNotNullParameter(footerData, "footerData");
        return new McwHomeSectionData(accountNumber, titleData, displayCurrencyBalances, footerData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McwHomeSectionData)) {
            return false;
        }
        McwHomeSectionData mcwHomeSectionData = (McwHomeSectionData) other;
        return Intrinsics.areEqual(this.accountNumber, mcwHomeSectionData.accountNumber) && Intrinsics.areEqual(this.titleData, mcwHomeSectionData.titleData) && Intrinsics.areEqual(this.displayCurrencyBalances, mcwHomeSectionData.displayCurrencyBalances) && Intrinsics.areEqual(this.footerData, mcwHomeSectionData.footerData);
    }

    public int hashCode() {
        return (((((this.accountNumber.hashCode() * 31) + this.titleData.hashCode()) * 31) + this.displayCurrencyBalances.hashCode()) * 31) + this.footerData.hashCode();
    }

    public String toString() {
        return "McwHomeSectionData(accountNumber=" + this.accountNumber + ", titleData=" + this.titleData + ", displayCurrencyBalances=" + this.displayCurrencyBalances + ", footerData=" + this.footerData + ")";
    }

    public McwHomeSectionData(String accountNumber, Cta titleData, List<DisplayCurrency> displayCurrencyBalances, Cta footerData) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(titleData, "titleData");
        Intrinsics.checkNotNullParameter(displayCurrencyBalances, "displayCurrencyBalances");
        Intrinsics.checkNotNullParameter(footerData, "footerData");
        this.accountNumber = accountNumber;
        this.titleData = titleData;
        this.displayCurrencyBalances = displayCurrencyBalances;
        this.footerData = footerData;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Cta getTitleData() {
        return this.titleData;
    }

    public final List<DisplayCurrency> getDisplayCurrencyBalances() {
        return this.displayCurrencyBalances;
    }

    public final Cta getFooterData() {
        return this.footerData;
    }

    /* compiled from: McwDataModels.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData$Companion;", "", "<init>", "()V", "toMcwHomeSectionData", "Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto;", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final McwHomeSectionData toMcwHomeSectionData(GetCashBalancesHomeSectionResponseDto getCashBalancesHomeSectionResponseDto) {
            String title;
            String deeplink;
            String logging_identifier;
            UserInteractionEventData.Action actionFromValue;
            String title2;
            String deeplink2;
            UserInteractionEventData.Action actionFromValue2;
            String logging_identifier2;
            Money money$default;
            Intrinsics.checkNotNullParameter(getCashBalancesHomeSectionResponseDto, "<this>");
            String account_number = getCashBalancesHomeSectionResponseDto.getAccount_number();
            CtaDto title3 = getCashBalancesHomeSectionResponseDto.getTitle();
            String str = "";
            if (title3 == null || (title = title3.getTitle()) == null) {
                title = "";
            }
            CtaDto title4 = getCashBalancesHomeSectionResponseDto.getTitle();
            if (title4 == null || (deeplink = title4.getDeeplink()) == null) {
                deeplink = "";
            }
            CtaDto title5 = getCashBalancesHomeSectionResponseDto.getTitle();
            if (title5 == null || (logging_identifier = title5.getLogging_identifier()) == null) {
                logging_identifier = "";
            }
            CtaDto title6 = getCashBalancesHomeSectionResponseDto.getTitle();
            if (title6 != null) {
                actionFromValue = UserInteractionEventData.Action.INSTANCE.fromValue(title6.getLogging_action_identifier());
                if (actionFromValue == null) {
                    actionFromValue = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                }
            }
            Cta cta = new Cta(title, deeplink, logging_identifier, actionFromValue);
            List<DisplayCurrencyDto> display_currency_balances = getCashBalancesHomeSectionResponseDto.getDisplay_currency_balances();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(display_currency_balances, 10));
            for (DisplayCurrencyDto displayCurrencyDto : display_currency_balances) {
                String title7 = displayCurrencyDto.getTitle();
                MoneyDto money = displayCurrencyDto.getMoney();
                if (money == null || (money$default = Money3.toMoney(money)) == null) {
                    BigDecimal ZERO = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    money$default = Money3.toMoney$default(ZERO, null, 1, null);
                }
                arrayList.add(new DisplayCurrency(title7, money$default, displayCurrencyDto.getSweep_interest_rate_display_label()));
            }
            CtaDto footer = getCashBalancesHomeSectionResponseDto.getFooter();
            if (footer == null || (title2 = footer.getTitle()) == null) {
                title2 = "";
            }
            CtaDto footer2 = getCashBalancesHomeSectionResponseDto.getFooter();
            if (footer2 == null || (deeplink2 = footer2.getDeeplink()) == null) {
                deeplink2 = "";
            }
            CtaDto footer3 = getCashBalancesHomeSectionResponseDto.getFooter();
            if (footer3 != null && (logging_identifier2 = footer3.getLogging_identifier()) != null) {
                str = logging_identifier2;
            }
            CtaDto footer4 = getCashBalancesHomeSectionResponseDto.getFooter();
            if (footer4 != null) {
                actionFromValue2 = UserInteractionEventData.Action.INSTANCE.fromValue(footer4.getLogging_action_identifier());
                if (actionFromValue2 == null) {
                    actionFromValue2 = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                }
            }
            return new McwHomeSectionData(account_number, cta, arrayList, new Cta(title2, deeplink2, str, actionFromValue2));
        }
    }
}
