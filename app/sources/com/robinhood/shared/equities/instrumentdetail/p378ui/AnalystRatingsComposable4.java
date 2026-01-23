package com.robinhood.shared.equities.instrumentdetail.p378ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equitydetail.p123ui.about.p124v2.AboutV29;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposableState;
import com.robinhood.shared.equities.models.instrumentdetails.api.RatingType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AnalystRatingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.equities.instrumentdetail.ui.ComposableSingletons$AnalystRatingsComposableKt$lambda$1244533305$1, reason: use source file name */
/* loaded from: classes6.dex */
final class AnalystRatingsComposable4 implements Function2<Composer, Integer, Unit> {
    public static final AnalystRatingsComposable4 INSTANCE = new AnalystRatingsComposable4();

    AnalystRatingsComposable4() {
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
            ComposerKt.traceEventStart(1244533305, i, -1, "com.robinhood.shared.equities.instrumentdetail.ui.ComposableSingletons$AnalystRatingsComposableKt.lambda$1244533305.<anonymous> (AnalystRatingsComposable.kt:51)");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        AnalystRatingsComposableState analystRatingsComposableState = new AnalystRatingsComposableState(companion.invoke(AboutV29.SHOW_MORE_TEXT), new AnalystRatingsComposableState.RatingSummary("47%", 0.47f, companion.invoke("Buy"), "47%", 0.28f, companion.invoke("Hold"), "28%", 0.25f, companion.invoke("Sell"), "25%"), extensions2.toImmutableList(CollectionsKt.listOf((Object[]) new AnalystRatingsComposableState.AnalystRating[]{new AnalystRatingsComposableState.AnalystRating(companion.invoke("Bulls say"), companion.invoke("Published on Nov 1, 2024"), companion.invoke("Morningstar"), companion.invoke("\"Tiger Corp’s margin expansion trajectory is likely to be uneven at times, given its global logistics and content investments. Tiger Corp’s margin expansion trajectory is likely to be uneven at times, given its global logistics and content investments.\""), RatingType.BUY), new AnalystRatingsComposableState.AnalystRating(companion.invoke("Sells say"), companion.invoke("Published on Nov 1, 2024"), companion.invoke("Morningstar"), companion.invoke("\"Tiger Corp’s margin expansion trajectory is likely to be uneven at times, given its global logistics and content investments.\""), RatingType.SELL), new AnalystRatingsComposableState.AnalystRating(companion.invoke("Holds say"), companion.invoke("Published on Nov 1, 2024"), companion.invoke("Morningstar"), companion.invoke("\"Tiger Corp’s margin expansion trajectory is likely to be uneven at times, given its global logistics and content investments.\""), RatingType.HOLD)})));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.ComposableSingletons$AnalystRatingsComposableKt$lambda$1244533305$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnalystRatingsComposable4.invoke$lambda$1$lambda$0((AnalystRatingsComposableState.AnalystRating) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AnalystRatingsComposable.AnalystRatingsComposable(analystRatingsComposableState, (Function1) objRememberedValue, null, composer, StringResource.$stable | 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(AnalystRatingsComposableState.AnalystRating it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
