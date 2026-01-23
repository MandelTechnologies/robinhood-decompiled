package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: OptionsDetailPageDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000¨\u0006\n"}, m3636d2 = {"defaultIndex", "", "T", "idList", "", "initialId", "(Ljava/util/List;Ljava/lang/Object;)Ljava/lang/Integer;", "isLegContext", "", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment$Args;", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsDetailPageDuxoKt {
    public static final <T> Integer defaultIndex(List<? extends T> idList, T t) {
        Intrinsics.checkNotNullParameter(idList, "idList");
        if (idList.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RangesKt.coerceAtLeast(CollectionsKt.indexOf((List) idList, (Object) t), 0));
    }

    public static final boolean isLegContext(OptionsDetailPageFragment.Args args) {
        Intrinsics.checkNotNullParameter(args, "<this>");
        OptionsDetailPageLaunchMode launchMode = args.getLaunchMode();
        if (launchMode instanceof OptionsDetailPageLaunchMode.AggregatePositionId) {
            return false;
        }
        if (launchMode instanceof OptionsDetailPageLaunchMode.OptionPositionId) {
            return true;
        }
        if (launchMode instanceof OptionsDetailPageLaunchMode.StrategyCode) {
            return ((OptionsDetailPageLaunchMode.StrategyCode) launchMode).isLegContext();
        }
        throw new NoWhenBranchMatchedException();
    }
}
