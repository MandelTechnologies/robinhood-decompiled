package com.robinhood.android.designsystem.compose;

import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.designsystem.style.CreditCardSystemOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.designsystem.style.GoldOverlay;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.util.ThemeNode;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScarletComposeInterop.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0003\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\n*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, m3636d2 = {"themeChangesForCompose", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", "Lcom/robinhood/scarlet/ScarletManager;", "themesForCompose", "direction", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet$Direction;", "getDirection", "(Lcom/robinhood/scarlet/ScarletManager;)Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet$Direction;", "isDay", "", "(Lcom/robinhood/scarlet/ScarletManager;)Z", "lib-design-system_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.designsystem.compose.ScarletComposeInteropKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class ScarletComposeInterop {
    public static final Observable<ThemesFromScarlet> themeChangesForCompose(final ScarletManager scarletManager) {
        Intrinsics.checkNotNullParameter(scarletManager, "<this>");
        Observable<ThemesFromScarlet> observableDistinctUntilChanged = scarletManager.getThemeChanges().map(new Function() { // from class: com.robinhood.android.designsystem.compose.ScarletComposeInteropKt.themeChangesForCompose.1
            @Override // io.reactivex.functions.Function
            public final ThemesFromScarlet apply(ThemeNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ScarletComposeInterop.themesForCompose(scarletManager);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public static final ThemesFromScarlet themesForCompose(ScarletManager scarletManager) {
        Intrinsics.checkNotNullParameter(scarletManager, "<this>");
        return new ThemesFromScarlet(isDay(scarletManager), scarletManager.contains(CreditCardSystemOverlay.NIGHT) || scarletManager.contains(CreditCardSystemOverlay.DAY), scarletManager.contains(GoldOverlay.INSTANCE), scarletManager.contains(AchromaticOverlay.INSTANCE), scarletManager.contains(ColorScheme.ALTERNATE), getDirection(scarletManager));
    }

    private static final ThemesFromScarlet.Direction getDirection(ScarletManager scarletManager) {
        if (scarletManager.contains(DirectionOverlay.POSITIVE)) {
            return ThemesFromScarlet.Direction.POSITIVE;
        }
        if (scarletManager.contains(DirectionOverlay.NEGATIVE)) {
            return ThemesFromScarlet.Direction.NEGATIVE;
        }
        return null;
    }

    private static final boolean isDay(ScarletManager scarletManager) {
        if (scarletManager.contains(CreditCardSystemOverlay.NIGHT)) {
            return false;
        }
        return scarletManager.contains(CreditCardSystemOverlay.DAY) || scarletManager.contains(DayNightOverlay.DAY) || !scarletManager.contains(DayNightOverlay.NIGHT);
    }
}
