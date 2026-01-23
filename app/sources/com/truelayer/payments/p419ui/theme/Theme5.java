package com.truelayer.payments.p419ui.theme;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialTheme2;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.p419ui.providers.WindowStateProvider2;
import com.truelayer.payments.p419ui.utils.AnalyticsExtensions3;
import com.truelayer.payments.p419ui.utils.Navigation2;
import com.truelayer.payments.p419ui.utils.Navigation4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Theme.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0097\u0001\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022b\b\u0002\u0010\u0010\u001a\\\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u000e¢\u0006\u0002\b\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aE\u0010\u001b\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022 \b\u0002\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u00120\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/ui/theme/TrueLayerTheme;", "theme", "", "isDarkTheme", "Lkotlin/Function4;", "Landroidx/compose/ui/Modifier;", "Lcom/truelayer/payments/ui/utils/NavigationRoute;", "Lkotlin/ParameterName;", "name", "state", "Landroidx/compose/animation/core/Transition;", NavTransition2.KEY_TRANSITION, "Lcom/truelayer/payments/ui/utils/Direction;", "direction", "Lcom/truelayer/payments/ui/providers/NavigationTransitionType;", "Lkotlin/ExtensionFunctionType;", "navigationTransition", "Lkotlin/Function0;", "", "content", "Theme", "(Lcom/truelayer/payments/ui/theme/TrueLayerTheme;ZLkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "merchantConfig", "Lkotlin/Function1;", "", "", "ConfigurableTheme", "(Lcom/truelayer/payments/core/domain/payments/MerchantConfig;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "createTrueLayerTheme", "(Landroidx/compose/runtime/Composer;I)Lcom/truelayer/payments/ui/theme/TrueLayerTheme;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.theme.ThemeKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Theme5 {
    public static final void Theme(final TrueLayerTheme theme6, final boolean z, Function4<? super Modifier, ? super Navigation4, ? super Transition<Navigation4>, ? super Navigation2, ? extends Modifier> function4, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1956282650);
        if ((i & 14) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changed(theme6)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(z)) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    theme6 = createTrueLayerTheme(composerStartRestartGroup, 0);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    z = DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    i3 &= -113;
                }
                if (i4 != 0) {
                    function4 = new Function4<Modifier, Navigation4, Transition<Navigation4>, Navigation2, Modifier.Companion>() { // from class: com.truelayer.payments.ui.theme.ThemeKt.Theme.1
                        @Override // kotlin.jvm.functions.Function4
                        public final Modifier.Companion invoke(Modifier modifier, Navigation4 navigation4, Transition<Navigation4> transition, Navigation2 navigation2) {
                            Intrinsics.checkNotNullParameter(modifier, "$this$null");
                            Intrinsics.checkNotNullParameter(navigation4, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(transition, "<anonymous parameter 1>");
                            Intrinsics.checkNotNullParameter(navigation2, "<anonymous parameter 2>");
                            return Modifier.INSTANCE;
                        }
                    };
                }
                if (i5 != 0) {
                    function2 = Theme2.INSTANCE.m27160getLambda1$payments_ui_release();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1956282650, i3, -1, "com.truelayer.payments.ui.theme.Theme (Theme.kt:85)");
            }
            WindowStateProvider2.WindowStateProvider(function4, ComposableLambda3.composableLambda(composerStartRestartGroup, -844144224, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.theme.ThemeKt.Theme.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-844144224, i6, -1, "com.truelayer.payments.ui.theme.Theme.<anonymous> (Theme.kt:87)");
                        }
                        MaterialTheme2.MaterialTheme(theme6.colors(z, composer2, 0), theme6.getShapes(), theme6.getTypography(), function2, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final TrueLayerTheme theme62 = theme6;
        final boolean z2 = z;
        final Function4<? super Modifier, ? super Navigation4, ? super Transition<Navigation4>, ? super Navigation2, ? extends Modifier> function42 = function4;
        final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.theme.ThemeKt.Theme.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    Theme5.Theme(theme62, z2, function42, function22, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void ConfigurableTheme(final MerchantConfig merchantConfig, boolean z, Function3<? super Map<String, String>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Typography typographyDefaults;
        Shapes shapeDefaults;
        Composer composerStartRestartGroup = composer.startRestartGroup(1423355020);
        if ((i2 & 2) != 0) {
            z = DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0);
            i3 = i & (-113);
        } else {
            i3 = i;
        }
        final boolean z2 = z;
        if ((i2 & 4) != 0) {
            function3 = Theme2.INSTANCE.m27161getLambda2$payments_ui_release();
        }
        final Function3<? super Map<String, String>, ? super Composer, ? super Integer, Unit> function32 = function3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1423355020, i3, -1, "com.truelayer.payments.ui.theme.ConfigurableTheme (Theme.kt:101)");
        }
        final ColorScheme darkColorDefaults = z2 ? Color7.getDarkColorDefaults() : Color7.getLightColorDefaults();
        composerStartRestartGroup.startReplaceableGroup(1261945096);
        if (merchantConfig != null && merchantConfig.getFonts()) {
            typographyDefaults = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
        } else {
            typographyDefaults = Typography6.getTypographyDefaults();
        }
        Typography typography = typographyDefaults;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1261945384);
        if (merchantConfig != null && merchantConfig.getButtons() && merchantConfig.getInputs()) {
            shapeDefaults = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
        } else {
            shapeDefaults = Shape2.getShapeDefaults();
        }
        Shapes shapes = shapeDefaults;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1261945696);
        ColorScheme colorScheme = (merchantConfig == null || !merchantConfig.getColors()) ? darkColorDefaults : MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable);
        composerStartRestartGroup.endReplaceableGroup();
        MaterialTheme2.MaterialTheme(colorScheme, shapes, typography, ComposableLambda3.composableLambda(composerStartRestartGroup, -1793368224, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.theme.ThemeKt.ConfigurableTheme.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1793368224, i4, -1, "com.truelayer.payments.ui.theme.ConfigurableTheme.<anonymous> (Theme.kt:130)");
                    }
                    function32.invoke(AnalyticsExtensions3.toAnalyticsMap(MaterialTheme.INSTANCE, darkColorDefaults, null, null, composer2, MaterialTheme.$stable, 6), composer2, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 3072, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.theme.ThemeKt.ConfigurableTheme.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    Theme5.ConfigurableTheme(merchantConfig, z2, function32, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final TrueLayerTheme createTrueLayerTheme(Composer composer, int i) {
        composer.startReplaceableGroup(1867462191);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1867462191, i, -1, "com.truelayer.payments.ui.theme.createTrueLayerTheme (Theme.kt:137)");
        }
        TrueLayerTheme theme6 = new TrueLayerTheme(Color7.getLightColorDefaults(), Color7.getDarkColorDefaults(), Typography6.getTypographyDefaults(), Shape2.getShapeDefaults(), false);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return theme6;
    }
}
