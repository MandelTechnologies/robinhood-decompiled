package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavHostController;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.C11182R;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar3;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: GoldUnifiedErrorComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u000f\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"GoldUnifiedErrorPog", "", "getGoldUnifiedErrorPog$annotations", "()V", "ErrorGotItCtaTestTag", "getErrorGotItCtaTestTag$annotations", "GoldUnifiedErrorComposable", "", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "sourceLoggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "modifier", "Landroidx/compose/ui/Modifier;", "errorDescription", "(Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedErrorComposable {
    public static final String ErrorGotItCtaTestTag = "error_got_it_cta";
    public static final String GoldUnifiedErrorPog = "gold_unified_error_composable_pictogram_pog";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedErrorComposable$lambda$0(Context context, Screen screen, Modifier modifier, String str, int i, int i2, Composer composer, int i3) {
        GoldUnifiedErrorComposable(context, screen, modifier, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getErrorGotItCtaTestTag$annotations() {
    }

    public static /* synthetic */ void getGoldUnifiedErrorPog$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUnifiedErrorComposable(final Context context, final Screen screen, Modifier modifier, String str, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        Composer composer2;
        final String str3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(111089019);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    final String str4 = i4 == 0 ? null : str2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(111089019, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposable (GoldUnifiedErrorComposable.kt:54)");
                    }
                    final NavHostController navController = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
                    String str5 = str4;
                    composer2 = composerStartRestartGroup;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, null, ComposableLambda3.rememberComposableLambda(338533376, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposableKt.GoldUnifiedErrorComposable.1
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
                                ComposerKt.traceEventStart(338533376, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposable.<anonymous> (GoldUnifiedErrorComposable.kt:60)");
                            }
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composer3, 0);
                            NavHostController navHostController = navController;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(navHostController);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new GoldUnifiedErrorComposable2(navHostController);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            GoldUnifiedBottomBar.GoldUnifiedBottomBar(strStringResource, (Function0) ((KFunction) objRememberedValue), GoldUnifiedErrorComposable.ErrorGotItCtaTestTag, null, null, false, false, GoldUnifiedBottomBar3.ACHROMATIC, null, null, composer3, 12583296, 888);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1286792266, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposableKt.GoldUnifiedErrorComposable.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1286792266, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposable.<anonymous> (GoldUnifiedErrorComposable.kt:68)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                            Screen.Name name = Screen.Name.GOLD_ONBOARDING_ERROR;
                            Screen screen2 = screen;
                            Screen.Name name2 = screen2 != null ? screen2.getName() : null;
                            String str6 = str4;
                            if (str6 == null) {
                                str6 = AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT;
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions(modifierPadding, new UserInteractionEventDescriptor(null, new Screen(name, null, "source-" + name2 + "_message-" + str6, null, 10, null), null, context, null, null, 53, null)), 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default, bentoTheme.getSpacing(composer3, i8).m21592getMediumD9Ej5fM());
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            String str7 = str4;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, TestTag3.testTag(companion, GoldUnifiedErrorComposable.GoldUnifiedErrorPog), false, BentoPogSize.Hero, null, null, null, composer3, 3120, 116);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11182R.string.gold_upgrade_confirmation_failed_title, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i8).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM()), composer3, 0);
                            composer3.startReplaceGroup(-997681736);
                            String strStringResource = str7 == null ? StringResources_androidKt.stringResource(C11048R.string.error_description, composer3, 0) : str7;
                            composer3.endReplaceGroup();
                            BentoMarkdownText2.BentoMarkdownText(strStringResource, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i8).getTextM(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 28), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, ((i3 >> 6) & 14) | 805306752, 506);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str3 = str5;
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    str3 = str2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GoldUnifiedErrorComposable.GoldUnifiedErrorComposable$lambda$0(context, screen, modifier3, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            str2 = str;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final NavHostController navController2 = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
                String str52 = str4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, null, ComposableLambda3.rememberComposableLambda(338533376, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposableKt.GoldUnifiedErrorComposable.1
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
                            ComposerKt.traceEventStart(338533376, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposable.<anonymous> (GoldUnifiedErrorComposable.kt:60)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composer3, 0);
                        NavHostController navHostController = navController2;
                        composer3.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer3.changedInstance(navHostController);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new GoldUnifiedErrorComposable2(navHostController);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        GoldUnifiedBottomBar.GoldUnifiedBottomBar(strStringResource, (Function0) ((KFunction) objRememberedValue), GoldUnifiedErrorComposable.ErrorGotItCtaTestTag, null, null, false, false, GoldUnifiedBottomBar3.ACHROMATIC, null, null, composer3, 12583296, 888);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1286792266, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposableKt.GoldUnifiedErrorComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1286792266, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposable.<anonymous> (GoldUnifiedErrorComposable.kt:68)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                        Screen.Name name = Screen.Name.GOLD_ONBOARDING_ERROR;
                        Screen screen2 = screen;
                        Screen.Name name2 = screen2 != null ? screen2.getName() : null;
                        String str6 = str4;
                        if (str6 == null) {
                            str6 = AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT;
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions(modifierPadding, new UserInteractionEventDescriptor(null, new Screen(name, null, "source-" + name2 + "_message-" + str6, null, 10, null), null, context, null, null, 53, null)), 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default, bentoTheme.getSpacing(composer3, i8).m21592getMediumD9Ej5fM());
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        String str7 = str4;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, TestTag3.testTag(companion, GoldUnifiedErrorComposable.GoldUnifiedErrorPog), false, BentoPogSize.Hero, null, null, null, composer3, 3120, 116);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11182R.string.gold_upgrade_confirmation_failed_title, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i8).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM()), composer3, 0);
                        composer3.startReplaceGroup(-997681736);
                        String strStringResource = str7 == null ? StringResources_androidKt.stringResource(C11048R.string.error_description, composer3, 0) : str7;
                        composer3.endReplaceGroup();
                        BentoMarkdownText2.BentoMarkdownText(strStringResource, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i8).getTextM(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 28), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, ((i3 >> 6) & 14) | 805306752, 506);
                if (ComposerKt.isTraceInProgress()) {
                }
                str3 = str52;
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        str2 = str;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
