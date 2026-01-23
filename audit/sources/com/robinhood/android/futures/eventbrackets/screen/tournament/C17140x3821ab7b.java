package com.robinhood.android.futures.eventbrackets.screen.tournament;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventsTournamentBracketTabComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$EventsTournamentBracketTabComposableKt$lambda$905688784$1 */
/* loaded from: classes3.dex */
final class C17140x3821ab7b implements Function2<Composer, Integer, Unit> {
    public static final C17140x3821ab7b INSTANCE = new C17140x3821ab7b();

    C17140x3821ab7b() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(905688784, i, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$EventsTournamentBracketTabComposableKt.lambda$905688784.<anonymous> (EventsTournamentBracketTabComposable.kt:348)");
        }
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("basketball game");
        Currency currency = Currency.getInstance(Locale.US);
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        AppBarData appBarData = new AppBarData(stringResourceInvoke, new Money(currency, ONE));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$EventsTournamentBracketTabComposableKt$lambda$905688784$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$EventsTournamentBracketTabComposableKt$lambda$905688784$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EventsTournamentBracketTabComposableKt.EventTournamentBracketAppBar(appBarData, function0, (Function0) objRememberedValue2, composer, 432);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
