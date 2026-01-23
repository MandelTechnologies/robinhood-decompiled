package com.robinhood.android.common.options.strategy;

import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionStrategyCodes.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0007¨\u0006\b"}, m3636d2 = {"toStrategyCode", "", "", "Lcom/robinhood/android/common/options/strategy/OptionLegCodeInfo;", "allowZeroOrMoreThanFourLegs", "", "getStrategyCode", "Lcom/robinhood/models/ui/OptionOrderBundle;", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.options.strategy.OptionStrategyCodesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionStrategyCodes2 {

    /* compiled from: OptionStrategyCodes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.strategy.OptionStrategyCodesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ String toStrategyCode$default(List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toStrategyCode(list, z);
    }

    public static final String toStrategyCode(List<OptionLegCodeInfo> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!z) {
            list.isEmpty();
            list.size();
            List<OptionLegCodeInfo> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((OptionLegCodeInfo) it.next()).getOptionInstrumentId());
            }
            CollectionsKt.toSet(arrayList).size();
            list.size();
        }
        List<OptionLegCodeInfo> list3 = list;
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            ((OptionLegCodeInfo) it2.next()).getRatioQuantity();
        }
        List listSortedWith = CollectionsKt.sortedWith(list3, new Comparator() { // from class: com.robinhood.android.common.options.strategy.OptionStrategyCodesKt$toStrategyCode$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((OptionLegCodeInfo) t).getOptionInstrumentId().toString(), ((OptionLegCodeInfo) t2).getOptionInstrumentId().toString());
            }
        });
        Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to(OptionPositionType.LONG, "L"), Tuples4.m3642to(OptionPositionType.SHORT, "S"));
        List<OptionLegCodeInfo> list4 = listSortedWith;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (OptionLegCodeInfo optionLegCodeInfo : list4) {
            arrayList2.add(optionLegCodeInfo.getOptionInstrumentId() + "_" + mapMapOf.get(optionLegCodeInfo.getType()) + optionLegCodeInfo.getRatioQuantity());
        }
        return CollectionsKt.joinToString$default(arrayList2, "_", null, null, 0, null, null, 62, null);
    }

    public static final String getStrategyCode(OptionOrderBundle optionOrderBundle) {
        OptionPositionType optionPositionType;
        Intrinsics.checkNotNullParameter(optionOrderBundle, "<this>");
        ImmutableList<OptionLegBundle> legBundles = optionOrderBundle.getLegBundles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
        for (OptionLegBundle optionLegBundle : legBundles) {
            UUID id = optionLegBundle.getOptionInstrument().getId();
            int i = WhenMappings.$EnumSwitchMapping$0[optionLegBundle.getOptionConfigurationBundle().getOptionSide().ordinal()];
            if (i == 1) {
                optionPositionType = OptionPositionType.LONG;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                optionPositionType = OptionPositionType.SHORT;
            }
            arrayList.add(new OptionLegCodeInfo(id, optionPositionType, optionLegBundle.getRatio()));
        }
        return toStrategyCode$default(arrayList, false, 1, null);
    }
}
