package com.robinhood.android.common.p088ui.daynight;

import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.util.ThemeNode;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: DayNightChanges.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007*\u00020\u0003¨\u0006\b"}, m3636d2 = {"isDayChanges", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "Lcom/robinhood/scarlet/ScarletManager;", "isDay", "", "isDayFlow", "Lkotlinx/coroutines/flow/Flow;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.ui.daynight.DayNightChangesKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class DayNightChanges {
    public static final Observable<DayNightOverlay> isDayChanges(final ScarletManager scarletManager) {
        Intrinsics.checkNotNullParameter(scarletManager, "<this>");
        Observable<DayNightOverlay> observableDistinctUntilChanged = scarletManager.getThemeChanges().map(new Function() { // from class: com.robinhood.android.common.ui.daynight.DayNightChangesKt.isDayChanges.1
            @Override // io.reactivex.functions.Function
            public final DayNightOverlay apply(ThemeNode themeNode) {
                Intrinsics.checkNotNullParameter(themeNode, "<unused var>");
                if (DayNightChanges.isDay(scarletManager)) {
                    return DayNightOverlay.DAY;
                }
                return DayNightOverlay.NIGHT;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public static final boolean isDay(ScarletManager scarletManager) {
        Intrinsics.checkNotNullParameter(scarletManager, "<this>");
        return scarletManager.contains(DayNightOverlay.DAY);
    }

    public static final boolean isDay(DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "<this>");
        return dayNightOverlay == DayNightOverlay.DAY;
    }

    public static final Flow<Boolean> isDayFlow(final ScarletManager scarletManager) {
        Intrinsics.checkNotNullParameter(scarletManager, "<this>");
        ObservableSource map = scarletManager.getThemeChanges().map(new Function() { // from class: com.robinhood.android.common.ui.daynight.DayNightChangesKt.isDayFlow.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(ThemeNode themeNode) {
                Intrinsics.checkNotNullParameter(themeNode, "<unused var>");
                return Boolean.valueOf(DayNightChanges.isDay(scarletManager));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null));
    }
}
