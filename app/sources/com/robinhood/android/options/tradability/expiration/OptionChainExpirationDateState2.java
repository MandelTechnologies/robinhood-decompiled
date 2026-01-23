package com.robinhood.android.options.tradability.expiration;

import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionMarketHoursParam2;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.UiOptionChain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: OptionChainExpirationDateState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"getSortedExpirationDateStates", "", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "Lcom/robinhood/models/ui/UiOptionChain;", "adjust", "tradeOnExpirationSettings", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "lib-options-tradability_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateStateKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainExpirationDateState2 {
    public static final List<OptionChainExpirationDateState> getSortedExpirationDateStates(List<UiOptionChain> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<UiOptionChain> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (UiOptionChain uiOptionChain : list2) {
            ImmutableList<LocalDate> expirationDates = uiOptionChain.getOptionChain().getExpirationDates();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(expirationDates, 10));
            Iterator<LocalDate> it = expirationDates.iterator();
            while (it.hasNext()) {
                arrayList2.add(new OptionChainExpirationDateState(it.next(), uiOptionChain));
            }
            arrayList.add(arrayList2);
        }
        return CollectionsKt.sorted(CollectionsKt.flatten(arrayList));
    }

    public static final List<OptionChainExpirationDateState> adjust(List<OptionChainExpirationDateState> list, OptionSettings.TradingOnExpirationState tradeOnExpirationSettings, OptionCurrentOrNextMarketDates currentOrNextMarketDates) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(tradeOnExpirationSettings, "tradeOnExpirationSettings");
        Intrinsics.checkNotNullParameter(currentOrNextMarketDates, "currentOrNextMarketDates");
        if (tradeOnExpirationSettings.isEnabled()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            OptionChainExpirationDateState optionChainExpirationDateState = (OptionChainExpirationDateState) obj;
            if (optionChainExpirationDateState.getExpirationDate().compareTo((ChronoLocalDate) currentOrNextMarketDates.getDate(OptionMarketHoursParam2.getOptionMarketHoursParam$default(optionChainExpirationDateState.getUiOptionChain(), optionChainExpirationDateState.getExpirationDate(), null, 4, null))) > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
