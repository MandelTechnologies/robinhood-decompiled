package com.robinhood.trader.onboarding.region;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationUnsupportedRegionComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"UserCreationUnsupportedRegionComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "onBack", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.trader.onboarding.region.UserCreationUnsupportedRegionComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class UserCreationUnsupportedRegionComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserCreationUnsupportedRegionComposable$lambda$0(Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        UserCreationUnsupportedRegionComposable(modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void UserCreationUnsupportedRegionComposable(Modifier modifier, final Function0<Unit> onBack, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1743666887);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1743666887, i3, -1, "com.robinhood.trader.onboarding.region.UserCreationUnsupportedRegionComposable (UserCreationUnsupportedRegionComposable.kt:33)");
            }
            Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(modifier3);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, ComposableLambda3.rememberComposableLambda(1303073525, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationUnsupportedRegionComposableKt.UserCreationUnsupportedRegionComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1303073525, i6, -1, "com.robinhood.trader.onboarding.region.UserCreationUnsupportedRegionComposable.<anonymous> (UserCreationUnsupportedRegionComposable.kt:39)");
                    }
                    Function2<Composer, Integer, Unit> lambda$335707304$feature_onboarding_externalDebug = UserCreationUnsupportedRegionComposable.INSTANCE.getLambda$335707304$feature_onboarding_externalDebug();
                    final Function0<Unit> function0 = onBack;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$335707304$feature_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1007994924, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationUnsupportedRegionComposableKt.UserCreationUnsupportedRegionComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1007994924, i7, -1, "com.robinhood.trader.onboarding.region.UserCreationUnsupportedRegionComposable.<anonymous>.<anonymous> (UserCreationUnsupportedRegionComposable.kt:42)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(887746708, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationUnsupportedRegionComposableKt.UserCreationUnsupportedRegionComposable.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(887746708, i6, -1, "com.robinhood.trader.onboarding.region.UserCreationUnsupportedRegionComposable.<anonymous> (UserCreationUnsupportedRegionComposable.kt:47)");
                    }
                    BentoButtonBar2.BentoButtonBar(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), null, null, false, null, null, onBack, StringResources_androidKt.stringResource(C11048R.string.general_label_okay, composer3, 0), false, null, false, null, null, false, null, false, composer3, 0, 0, 65342);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, UserCreationUnsupportedRegionComposable.INSTANCE.m26532getLambda$1826534390$feature_onboarding_externalDebug(), composer2, 805306800, EnumC7081g.f2774x74902ae0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.trader.onboarding.region.UserCreationUnsupportedRegionComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserCreationUnsupportedRegionComposable4.UserCreationUnsupportedRegionComposable$lambda$0(modifier2, onBack, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
