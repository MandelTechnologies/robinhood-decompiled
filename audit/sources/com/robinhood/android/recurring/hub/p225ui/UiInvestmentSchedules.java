package com.robinhood.android.recurring.hub.p225ui;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: UiInvestmentSchedules.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/ui/UiInvestmentSchedules;", "", "", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "investmentSchedules", "<init>", "(Ljava/util/List;)V", "Landroid/content/res/Resources;", "resources", "", "nextInvestmentDateFormatted", "(Landroid/content/res/Resources;)Ljava/lang/String;", "Ljava/util/List;", "totalInvested", "Ljava/lang/String;", "getTotalInvested", "()Ljava/lang/String;", "j$/time/LocalDate", "nextInvestmentDate", "Lj$/time/LocalDate;", "getNextInvestmentDate", "()Lj$/time/LocalDate;", "", "totalActive", "I", "getTotalActive", "()I", "totalPaused", "getTotalPaused", "Ljava/util/UUID;", "id", "getId", "()Ljava/util/List;", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class UiInvestmentSchedules {
    public static final int $stable = 8;
    private final List<UUID> id;
    private final List<InvestmentSchedule> investmentSchedules;
    private final LocalDate nextInvestmentDate;
    private final int totalActive;
    private final String totalInvested;
    private final int totalPaused;

    public UiInvestmentSchedules(List<InvestmentSchedule> investmentSchedules) {
        Money money;
        String str;
        int i;
        Intrinsics.checkNotNullParameter(investmentSchedules, "investmentSchedules");
        this.investmentSchedules = investmentSchedules;
        Iterator<T> it = investmentSchedules.iterator();
        if (it.hasNext()) {
            Money totalInvested = ((InvestmentSchedule) it.next()).getTotalInvested();
            if (totalInvested == null) {
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                totalInvested = Money3.toMoney(ZERO, Currencies.USD);
            }
            while (it.hasNext()) {
                Money totalInvested2 = ((InvestmentSchedule) it.next()).getTotalInvested();
                if (totalInvested2 == null) {
                    BigDecimal ZERO2 = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                    totalInvested2 = Money3.toMoney(ZERO2, Currencies.USD);
                }
                totalInvested = totalInvested.plus(totalInvested2);
            }
            money = totalInvested;
        } else {
            money = null;
        }
        if (money == null || (str = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            BigDecimal ZERO3 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
            str = Money.format$default(Money3.toMoney(ZERO3, Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        this.totalInvested = str;
        List<InvestmentSchedule> list = this.investmentSchedules;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            LocalDate nextInvestmentDate = ((InvestmentSchedule) it2.next()).getNextInvestmentDate();
            if (nextInvestmentDate != null) {
                arrayList.add(nextInvestmentDate);
            }
        }
        this.nextInvestmentDate = (LocalDate) CollectionsKt.minOrNull((Iterable) arrayList);
        List<InvestmentSchedule> list2 = this.investmentSchedules;
        int i2 = 0;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it3 = list2.iterator();
            i = 0;
            while (it3.hasNext()) {
                if (((InvestmentSchedule) it3.next()).isActive() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.totalActive = i;
        List<InvestmentSchedule> list3 = this.investmentSchedules;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                if (((InvestmentSchedule) it4.next()).getState() == ApiInvestmentSchedule.State.PAUSED && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.totalPaused = i2;
        List<InvestmentSchedule> list4 = this.investmentSchedules;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it5 = list4.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((InvestmentSchedule) it5.next()).getId());
        }
        this.id = arrayList2;
    }

    public final String getTotalInvested() {
        return this.totalInvested;
    }

    public final LocalDate getNextInvestmentDate() {
        return this.nextInvestmentDate;
    }

    public final String nextInvestmentDateFormatted(Resources resources) throws Resources.NotFoundException {
        Resources resources2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        LocalDate localDate = this.nextInvestmentDate;
        if (localDate != null) {
            resources2 = resources;
            String recent = LocalDates4.formatRecent(localDate, resources2, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false);
            if (recent != null) {
                return recent;
            }
        } else {
            resources2 = resources;
        }
        String string2 = resources2.getString(C41827R.string.general_label_n_a);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final int getTotalActive() {
        return this.totalActive;
    }

    public final int getTotalPaused() {
        return this.totalPaused;
    }

    public final List<UUID> getId() {
        return this.id;
    }
}
