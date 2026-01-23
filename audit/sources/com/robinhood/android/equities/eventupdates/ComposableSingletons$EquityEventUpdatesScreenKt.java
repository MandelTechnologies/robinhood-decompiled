package com.robinhood.android.equities.eventupdates;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.equities.eventupdates.EquityEventUpdateRow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityEventUpdatesScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$EquityEventUpdatesScreenKt {
    public static final ComposableSingletons$EquityEventUpdatesScreenKt INSTANCE = new ComposableSingletons$EquityEventUpdatesScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$996735341 = ComposableLambda3.composableLambdaInstance(996735341, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt$lambda$996735341$1
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
                ComposerKt.traceEventStart(996735341, i, -1, "com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt.lambda$996735341.<anonymous> (EquityEventUpdatesScreen.kt:121)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14719R.string.equity_event_updates_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> lambda$1667838024 = ComposableLambda3.composableLambdaInstance(1667838024, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt$lambda$1667838024$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1667838024, i2, -1, "com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt.lambda$1667838024.<anonymous> (EquityEventUpdatesScreen.kt:135)");
            }
            EquityEventUpdateRow.EquityEventUpdatePlaceholderRow(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-741041825, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8882lambda$741041825 = ComposableLambda3.composableLambdaInstance(-741041825, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt$lambda$-741041825$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-741041825, i, -1, "com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt.lambda$-741041825.<anonymous> (EquityEventUpdatesScreen.kt:163)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14719R.string.equity_event_updates_empty_message, composer, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$469836791 = ComposableLambda3.composableLambdaInstance(469836791, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt$lambda$469836791$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(469836791, i, -1, "com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt.lambda$469836791.<anonymous> (EquityEventUpdatesScreen.kt:174)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C14719R.string.equity_event_updates_section_recent, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), composer, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-595130440, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8881lambda$595130440 = ComposableLambda3.composableLambdaInstance(-595130440, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt$lambda$-595130440$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-595130440, i, -1, "com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt.lambda$-595130440.<anonymous> (EquityEventUpdatesScreen.kt:206)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C14719R.string.equity_event_updates_section_older, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), composer, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1569902394 = ComposableLambda3.composableLambdaInstance(1569902394, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt$lambda$1569902394$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1569902394, i, -1, "com.robinhood.android.equities.eventupdates.ComposableSingletons$EquityEventUpdatesScreenKt.lambda$1569902394.<anonymous> (EquityEventUpdatesScreen.kt:243)");
            }
            EquityEventUpdateRow.EquityEventUpdatePlaceholderRow(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-595130440$feature_equity_event_updates_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m13546getLambda$595130440$feature_equity_event_updates_externalDebug() {
        return f8881lambda$595130440;
    }

    /* renamed from: getLambda$-741041825$feature_equity_event_updates_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m13547getLambda$741041825$feature_equity_event_updates_externalDebug() {
        return f8882lambda$741041825;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1569902394$feature_equity_event_updates_externalDebug() {
        return lambda$1569902394;
    }

    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> getLambda$1667838024$feature_equity_event_updates_externalDebug() {
        return lambda$1667838024;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$469836791$feature_equity_event_updates_externalDebug() {
        return lambda$469836791;
    }

    public final Function2<Composer, Integer, Unit> getLambda$996735341$feature_equity_event_updates_externalDebug() {
        return lambda$996735341;
    }
}
