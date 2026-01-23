package com.robinhood.common.strings;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.lib.formats.FormatAsList2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.p320db.OptionChainCollateral;
import com.robinhood.models.p320db.OptionCollateralEquity;
import com.robinhood.utils.math.BigDecimals7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: OptionChainCollaterals.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"getCashDisplayString", "", "Lcom/robinhood/models/db/OptionChainCollateral;", "getEquityDisplayString", "context", "Landroid/content/Context;", "lib-common-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.common.strings.OptionChainCollateralsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class OptionChainCollaterals {
    public static final String getCashDisplayString(OptionChainCollateral optionChainCollateral) {
        Intrinsics.checkNotNullParameter(optionChainCollateral, "<this>");
        return Formats.getPriceFormat().format(BigDecimals7.safeAdd(optionChainCollateral.getCollateral().getCash().getAmount(), optionChainCollateral.getCollateralHeldForOrders().getCash().getAmount()));
    }

    public static final String getEquityDisplayString(OptionChainCollateral optionChainCollateral, Context context) {
        Intrinsics.checkNotNullParameter(optionChainCollateral, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        List<OptionCollateralEquity> equities = optionChainCollateral.getCollateral().getEquities();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : equities) {
            linkedHashMap.put(((OptionCollateralEquity) obj).getInstrument_id(), obj);
        }
        List<OptionCollateralEquity> equities2 = optionChainCollateral.getCollateralHeldForOrders().getEquities();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(equities2, 10)), 16));
        for (Object obj2 : equities2) {
            linkedHashMap2.put(((OptionCollateralEquity) obj2).getInstrument_id(), obj2);
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj3 = linkedHashMap.get(key);
            if (obj3 != null) {
                value = ((OptionCollateralEquity) obj3).combine((OptionCollateralEquity) value);
            }
            linkedHashMap.put(key, value);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            OptionCollateralEquity optionCollateralEquity = (OptionCollateralEquity) ((Map.Entry) it.next()).getValue();
            arrayList.add(context.getString(C32428R.string.option_collateral_equity_long, Formats.getIntegerFormat().format(Integer.valueOf(optionCollateralEquity.getQuantity().intValue())), optionCollateralEquity.getSymbol()));
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return FormatAsList2.formatAsList(arrayList, resources);
    }
}
