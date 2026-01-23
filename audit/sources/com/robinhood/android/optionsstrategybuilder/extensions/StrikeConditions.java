package com.robinhood.android.optionsstrategybuilder.extensions;

import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StrikeConditions.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0000¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"getSecondValuesSatisfyingStrikeCondition", "", "T", "strikeCondition", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$StrikeCondition;", "firstValue", "getEqualValues", "Lkotlin/Function1;", "", "secondValuesSortedSet", "Ljava/util/TreeSet;", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$StrikeCondition;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/TreeSet;)Ljava/util/Collection;", "feature-options-strategy-builder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsstrategybuilder.extensions.StrikeConditionsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class StrikeConditions {

    /* compiled from: StrikeConditions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsstrategybuilder.extensions.StrikeConditionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionStrategyChainTemplate.StrikeCondition.values().length];
            try {
                iArr[OptionStrategyChainTemplate.StrikeCondition.EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionStrategyChainTemplate.StrikeCondition.LESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionStrategyChainTemplate.StrikeCondition.GREATER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionStrategyChainTemplate.StrikeCondition.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T> Collection<T> getSecondValuesSatisfyingStrikeCondition(OptionStrategyChainTemplate.StrikeCondition strikeCondition, T t, Function1<? super T, ? extends List<? extends T>> getEqualValues, TreeSet<T> secondValuesSortedSet) {
        List<? extends T> listTailSet;
        Intrinsics.checkNotNullParameter(strikeCondition, "strikeCondition");
        Intrinsics.checkNotNullParameter(getEqualValues, "getEqualValues");
        Intrinsics.checkNotNullParameter(secondValuesSortedSet, "secondValuesSortedSet");
        int i = WhenMappings.$EnumSwitchMapping$0[strikeCondition.ordinal()];
        if (i == 1) {
            List<? extends T> listInvoke = getEqualValues.invoke(t);
            if (listInvoke == null) {
                listInvoke = CollectionsKt.emptyList();
            }
            listTailSet = listInvoke;
        } else if (i == 2) {
            listTailSet = secondValuesSortedSet.tailSet(t, false);
        } else if (i == 3) {
            listTailSet = secondValuesSortedSet.headSet(t, false);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            listTailSet = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listTailSet);
        return listTailSet;
    }
}
