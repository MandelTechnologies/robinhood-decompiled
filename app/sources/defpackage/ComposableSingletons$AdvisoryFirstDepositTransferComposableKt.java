package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.onboarding.C8825R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFirstDepositTransferComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$AdvisoryFirstDepositTransferComposableKt {
    public static final ComposableSingletons$AdvisoryFirstDepositTransferComposableKt INSTANCE = new ComposableSingletons$AdvisoryFirstDepositTransferComposableKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1849537133 = ComposableLambda3.composableLambdaInstance(1849537133, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: ComposableSingletons$AdvisoryFirstDepositTransferComposableKt$lambda$1849537133$1
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
                ComposerKt.traceEventStart(1849537133, i, -1, "ComposableSingletons$AdvisoryFirstDepositTransferComposableKt.lambda$1849537133.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:521)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8825R.string.f3907x9d12dc6c, composer, 0), modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1888890332, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8526lambda$1888890332 = ComposableLambda3.composableLambdaInstance(-1888890332, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: ComposableSingletons$AdvisoryFirstDepositTransferComposableKt$lambda$-1888890332$1
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
                ComposerKt.traceEventStart(-1888890332, i, -1, "ComposableSingletons$AdvisoryFirstDepositTransferComposableKt.lambda$-1888890332.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:557)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8825R.string.f3906xb585c19e, composer, 0), modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-798090572, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8528lambda$798090572 = ComposableLambda3.composableLambdaInstance(-798090572, false, C0053xb341420f.INSTANCE);

    /* renamed from: lambda$-1980031523, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8527lambda$1980031523 = ComposableLambda3.composableLambdaInstance(-1980031523, false, C0052x7795e2f2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1871968541 = ComposableLambda3.composableLambdaInstance(1871968541, false, new Function2<Composer, Integer, Unit>() { // from class: ComposableSingletons$AdvisoryFirstDepositTransferComposableKt$lambda$1871968541$1
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
                ComposerKt.traceEventStart(1871968541, i, -1, "ComposableSingletons$AdvisoryFirstDepositTransferComposableKt.lambda$1871968541.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:641)");
            }
            CompositionLocal3.CompositionLocalProvider(InspectionMode.getLocalInspectionMode().provides(Boolean.TRUE), ComposableSingletons$AdvisoryFirstDepositTransferComposableKt.INSTANCE.m4310getLambda$1980031523$feature_advisory_onboarding_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1888890332$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m4309getLambda$1888890332$feature_advisory_onboarding_externalDebug() {
        return f8526lambda$1888890332;
    }

    /* renamed from: getLambda$-1980031523$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m4310getLambda$1980031523$feature_advisory_onboarding_externalDebug() {
        return f8527lambda$1980031523;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1849537133$feature_advisory_onboarding_externalDebug() {
        return lambda$1849537133;
    }
}
