package com.robinhood.android.event.detail.duel;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: EventDetailDuelContractsHeader.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.duel.ComposableSingletons$EventDetailDuelContractsHeaderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailDuelContractsHeader {
    public static final EventDetailDuelContractsHeader INSTANCE = new EventDetailDuelContractsHeader();

    /* renamed from: lambda$-1151248281, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8940lambda$1151248281 = ComposableLambda3.composableLambdaInstance(-1151248281, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.duel.ComposableSingletons$EventDetailDuelContractsHeaderKt$lambda$-1151248281$1
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
                ComposerKt.traceEventStart(-1151248281, i, -1, "com.robinhood.android.event.detail.duel.ComposableSingletons$EventDetailDuelContractsHeaderKt.lambda$-1151248281.<anonymous> (EventDetailDuelContractsHeader.kt:230)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                Delta delta = new Delta(1, null, 2, null);
                Instant instantPlusSeconds = Instant.now().plusSeconds(2L);
                Intrinsics.checkNotNullExpressionValue(instantPlusSeconds, "plusSeconds(...)");
                objRememberedValue = extensions2.persistentListOf(delta, new Delta(-100, instantPlusSeconds));
                composer.updateRememberedValue(objRememberedValue);
            }
            ImmutableList3 immutableList3 = (ImmutableList3) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                Delta delta2 = new Delta(200, null, 2, null);
                Instant instantPlusSeconds2 = Instant.now().plusSeconds(2L);
                Intrinsics.checkNotNullExpressionValue(instantPlusSeconds2, "plusSeconds(...)");
                objRememberedValue2 = extensions2.persistentListOf(delta2, new Delta(-100, instantPlusSeconds2));
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(400));
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            EventDetailDuelContractsHeader5.EventDetailDuelContractsHeader(true, new DuelEventContractUiDetail("25", "Contract 1", "422,987,001,555", "", new DayNightColor(bentoTheme.getColors(composer, i2).getHydro(), bentoTheme.getColors(composer, i2).getHydro(), null), "49¢", immutableList3), new DuelEventContractUiDetail("12", "Contract 2", "436,576,312,123", "", new DayNightColor(bentoTheme.getColors(composer, i2).getJoule(), bentoTheme.getColors(composer, i2).getJoule(), null), "51¢", (ImmutableList3) objRememberedValue2), modifierM5174width3ABfNKs, false, composer, 3078, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$398915682 = ComposableLambda3.composableLambdaInstance(398915682, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.duel.ComposableSingletons$EventDetailDuelContractsHeaderKt$lambda$398915682$1
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
                ComposerKt.traceEventStart(398915682, i, -1, "com.robinhood.android.event.detail.duel.ComposableSingletons$EventDetailDuelContractsHeaderKt.lambda$398915682.<anonymous> (EventDetailDuelContractsHeader.kt:226)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            SurfaceKt.m5967SurfaceT9BRK9s(null, null, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0.0f, 0.0f, null, EventDetailDuelContractsHeader.INSTANCE.m14147getLambda$1151248281$feature_event_detail_externalDebug(), composer, 12582912, 115);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1151248281$feature_event_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14147getLambda$1151248281$feature_event_detail_externalDebug() {
        return f8940lambda$1151248281;
    }

    public final Function2<Composer, Integer, Unit> getLambda$398915682$feature_event_detail_externalDebug() {
        return lambda$398915682;
    }
}
