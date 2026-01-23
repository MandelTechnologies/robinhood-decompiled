package com.robinhood.shared.crypto.acats.explainer;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.acats.C37511R;
import com.robinhood.shared.crypto.acats.MigrationReviewAssetsDest;
import com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposable3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MigrationExplainerComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"MigrationExplainerComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-acats_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MigrationExplainerComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MigrationExplainerComposable$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        MigrationExplainerComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MigrationExplainerComposable(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-622583320);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-622583320, i3, -1, "com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposable (MigrationExplainerComposable.kt:46)");
            }
            final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_DETAIL, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-130733357, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposableKt.MigrationExplainerComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-130733357, i5, -1, "com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposable.<anonymous> (MigrationExplainerComposable.kt:54)");
                    }
                    final Modifier modifier2 = modifier;
                    final LifecycleAwareNavigator lifecycleAwareNavigator2 = lifecycleAwareNavigator;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1619593368, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposableKt.MigrationExplainerComposable.1.1
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
                                ComposerKt.traceEventStart(-1619593368, i6, -1, "com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposable.<anonymous>.<anonymous> (MigrationExplainerComposable.kt:55)");
                            }
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(modifier2, null, 1, null), false, ComposableLambda3.rememberComposableLambda(-1554559843, true, new C506691(lifecycleAwareNavigator2), composer3, 54), MigrationExplainerComposable.INSTANCE.getLambda$1661947472$feature_acats_externalRelease(), composer3, 3504, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: MigrationExplainerComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposableKt$MigrationExplainerComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C506691 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                            final /* synthetic */ LifecycleAwareNavigator $navigator;

                            C506691(LifecycleAwareNavigator lifecycleAwareNavigator) {
                                this.$navigator = lifecycleAwareNavigator;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                invoke(bentoButtonBar3, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1554559843, i, -1, "com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposable.<anonymous>.<anonymous>.<anonymous> (MigrationExplainerComposable.kt:59)");
                                }
                                final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                                final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(current) | composer.changed(this.$navigator);
                                final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposableKt$MigrationExplainerComposable$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return MigrationExplainerComposable3.C375271.AnonymousClass1.C506691.invoke$lambda$1$lambda$0(current, lifecycleAwareNavigator);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                String strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_label_continue, composer, 0);
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance2 = composer.changedInstance(current) | composer.changedInstance(navigator) | composer.changedInstance(context);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposableKt$MigrationExplainerComposable$1$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return MigrationExplainerComposable3.C375271.AnonymousClass1.C506691.invoke$lambda$3$lambda$2(current, navigator, context);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, function0, strStringResource, false, null, false, (Function0) objRememberedValue2, StringResources_androidKt.stringResource(C37511R.string.crypto_acats_label_learn_more, composer, 0), false, null, false, composer, 0, 0, 59198);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, LifecycleAwareNavigator lifecycleAwareNavigator) throws Resources.NotFoundException {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, null, false, 59, null);
                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, MigrationReviewAssetsDest.INSTANCE, null, null, false, null, 30, null);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Navigator navigator, Context context) {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_LEARN_MORE, null, 4, null), null, null, false, 59, null);
                                Navigators3.showHelpCenterWebViewFragment(navigator, context, "https://robinhood.com/us/en/support/articles/transfer-your-assets-from-Bitstamp/#Transferringyourassets");
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MigrationExplainerComposable3.MigrationExplainerComposable$lambda$0(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
