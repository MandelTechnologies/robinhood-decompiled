package com.robinhood.android.optionsupgrade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.data.OptionPage;
import com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposable;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.utils.extensions.ContextSystemServices;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionOnboardingSplashComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ae\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"OptionOnboardingSplashComposable", "", "pages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionsupgrade/SplashPage;", "footerMarkdown", "", "isLoading", "", "onPageLearnMore", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/app/keys/data/OptionPage;", "onBackPressed", "Lkotlin/Function0;", "onContinueClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingSplashComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingSplashComposable$lambda$2(ImmutableList immutableList, String str, boolean z, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionOnboardingSplashComposable(immutableList, str, z, function1, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0197  */
    @SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOnboardingSplashComposable(final ImmutableList<SplashPage> pages, final String footerMarkdown, final boolean z, final Function1<? super OptionPage, Unit> onPageLearnMore, final Function0<Unit> onBackPressed, final Function0<Unit> onContinueClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        boolean z3;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(footerMarkdown, "footerMarkdown");
        Intrinsics.checkNotNullParameter(onPageLearnMore, "onPageLearnMore");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1558754925);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(pages) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(footerMarkdown) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onPageLearnMore) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1558754925, i3, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposable (OptionOnboardingSplashComposable.kt:47)");
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z3 = (i3 & 14) != 4;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(pages.size());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final Modifier modifier5 = modifier4;
                    final PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 6, 2);
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final boolean z4 = z2;
                    composer2 = composerStartRestartGroup;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(1608076337, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt.OptionOnboardingSplashComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1608076337, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposable.<anonymous> (OptionOnboardingSplashComposable.kt:57)");
                            }
                            OptionOnboardingImprovementSplashComposable3.m17404TopbargKt5lHk(onBackPressed, null, null, composer3, 0, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1247616626, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt.OptionOnboardingSplashComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1247616626, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposable.<anonymous> (OptionOnboardingSplashComposable.kt:62)");
                            }
                            OptionOnboardingImprovementSplashComposable3.m17403BottomBar88mDfTA(false, footerMarkdown, z4, onContinueClicked, context, navigator, null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21456getPositive0d7_KjU(), composer3, 6, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1180797372, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt.OptionOnboardingSplashComposable.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: OptionOnboardingSplashComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt$OptionOnboardingSplashComposable$3$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ Modifier $modifier;
                            final /* synthetic */ Function1<OptionPage, Unit> $onPageLearnMore;
                            final /* synthetic */ PaddingValues $paddingValues;
                            final /* synthetic */ PagerState $pagerState;
                            final /* synthetic */ ImmutableList<SplashPage> $pages;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(Modifier modifier, PaddingValues paddingValues, PagerState pagerState, ImmutableList<SplashPage> immutableList, Function1<? super OptionPage, Unit> function1) {
                                this.$modifier = modifier;
                                this.$paddingValues = paddingValues;
                                this.$pagerState = pagerState;
                                this.$pages = immutableList;
                                this.$onPageLearnMore = function1;
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
                                    ComposerKt.traceEventStart(1649522658, i, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposable.<anonymous>.<anonymous> (OptionOnboardingSplashComposable.kt:80)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null), this.$paddingValues);
                                final PagerState pagerState = this.$pagerState;
                                final ImmutableList<SplashPage> immutableList = this.$pages;
                                Function1<OptionPage, Unit> function1 = this.$onPageLearnMore;
                                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                PagerKt.m5301HorizontalPager8jOkeI(pagerState, Column5.weight$default(column6, companion3, 1.0f, false, 2, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(-168557607, true, new OptionOnboardingSplashComposable2(immutableList, function1), composer, 54), composer, 0, 24576, 16380);
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(column6.align(companion3, companion.getCenterHorizontally()), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 1, null);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(immutableList) | composer.changed(pagerState);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt$OptionOnboardingSplashComposable$3$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionOnboardingSplashComposable.C250263.AnonymousClass1.invoke$lambda$5$lambda$2$lambda$1(immutableList, pagerState, (Context) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function1 function12 = (Function1) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                boolean zChanged2 = composer.changed(pagerState);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt$OptionOnboardingSplashComposable$3$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionOnboardingSplashComposable.C250263.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3(pagerState, (DotIndicators) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                AndroidView_androidKt.AndroidView(function12, modifierM5144paddingVpY3zN4$default, (Function1) objRememberedValue2, composer, 0, 0);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final DotIndicators invoke$lambda$5$lambda$2$lambda$1(ImmutableList immutableList, PagerState pagerState, Context context) {
                                Intrinsics.checkNotNullParameter(context, "context");
                                View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(C25121R.layout.include_option_onboarding_splash_dot_indicator, (ViewGroup) null, false);
                                Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.common.ui.view.DotIndicators");
                                DotIndicators dotIndicators = (DotIndicators) viewInflate;
                                dotIndicators.setNumDots(immutableList.size());
                                dotIndicators.setNumActivated(pagerState.getCurrentPage());
                                return dotIndicators;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$5$lambda$4$lambda$3(PagerState pagerState, DotIndicators view) {
                                Intrinsics.checkNotNullParameter(view, "view");
                                view.setNumActivated(pagerState.getCurrentPage());
                                return Unit.INSTANCE;
                            }
                        }

                        public final void invoke(PaddingValues padding, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(padding, "padding");
                            if ((i5 & 6) == 0) {
                                i5 |= composer3.changed(padding) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1180797372, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposable.<anonymous> (OptionOnboardingSplashComposable.kt:73)");
                            }
                            BentoThemeOverlays.DirectionThemeOverlay(BentoTheme4.POSITIVE, ComposableLambda3.rememberComposableLambda(1649522658, true, new AnonymousClass1(modifier5, PaddingKt.m5138PaddingValuesa9UjIt4(((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getTop(), ((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getBottom()), pagerStateRememberPagerState, pages, onPageLearnMore), composer3, 54), composer3, 54);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 805306800, 505);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionOnboardingSplashComposable.OptionOnboardingSplashComposable$lambda$2(pages, footerMarkdown, z, onPageLearnMore, onBackPressed, onContinueClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            modifier2 = modifier;
            if ((599187 & i3) != 599186) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 14) != 4) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z3) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(pages.size());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    final Modifier modifier52 = modifier4;
                    final PagerState pagerStateRememberPagerState2 = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 6, 2);
                    final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final boolean z42 = z2;
                    composer2 = composerStartRestartGroup;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(1608076337, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt.OptionOnboardingSplashComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1608076337, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposable.<anonymous> (OptionOnboardingSplashComposable.kt:57)");
                            }
                            OptionOnboardingImprovementSplashComposable3.m17404TopbargKt5lHk(onBackPressed, null, null, composer3, 0, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1247616626, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt.OptionOnboardingSplashComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1247616626, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposable.<anonymous> (OptionOnboardingSplashComposable.kt:62)");
                            }
                            OptionOnboardingImprovementSplashComposable3.m17403BottomBar88mDfTA(false, footerMarkdown, z42, onContinueClicked, context2, navigator2, null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21456getPositive0d7_KjU(), composer3, 6, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1180797372, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt.OptionOnboardingSplashComposable.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: OptionOnboardingSplashComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt$OptionOnboardingSplashComposable$3$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ Modifier $modifier;
                            final /* synthetic */ Function1<OptionPage, Unit> $onPageLearnMore;
                            final /* synthetic */ PaddingValues $paddingValues;
                            final /* synthetic */ PagerState $pagerState;
                            final /* synthetic */ ImmutableList<SplashPage> $pages;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(Modifier modifier, PaddingValues paddingValues, PagerState pagerState, ImmutableList<SplashPage> immutableList, Function1<? super OptionPage, Unit> function1) {
                                this.$modifier = modifier;
                                this.$paddingValues = paddingValues;
                                this.$pagerState = pagerState;
                                this.$pages = immutableList;
                                this.$onPageLearnMore = function1;
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
                                    ComposerKt.traceEventStart(1649522658, i, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposable.<anonymous>.<anonymous> (OptionOnboardingSplashComposable.kt:80)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null), this.$paddingValues);
                                final PagerState pagerState = this.$pagerState;
                                final ImmutableList immutableList = this.$pages;
                                Function1<OptionPage, Unit> function1 = this.$onPageLearnMore;
                                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                PagerKt.m5301HorizontalPager8jOkeI(pagerState, Column5.weight$default(column6, companion3, 1.0f, false, 2, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(-168557607, true, new OptionOnboardingSplashComposable2(immutableList, function1), composer, 54), composer, 0, 24576, 16380);
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(column6.align(companion3, companion.getCenterHorizontally()), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 1, null);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(immutableList) | composer.changed(pagerState);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt$OptionOnboardingSplashComposable$3$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionOnboardingSplashComposable.C250263.AnonymousClass1.invoke$lambda$5$lambda$2$lambda$1(immutableList, pagerState, (Context) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function1 function12 = (Function1) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                boolean zChanged2 = composer.changed(pagerState);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt$OptionOnboardingSplashComposable$3$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionOnboardingSplashComposable.C250263.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3(pagerState, (DotIndicators) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                AndroidView_androidKt.AndroidView(function12, modifierM5144paddingVpY3zN4$default, (Function1) objRememberedValue2, composer, 0, 0);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final DotIndicators invoke$lambda$5$lambda$2$lambda$1(ImmutableList immutableList, PagerState pagerState, Context context) {
                                Intrinsics.checkNotNullParameter(context, "context");
                                View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(C25121R.layout.include_option_onboarding_splash_dot_indicator, (ViewGroup) null, false);
                                Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.common.ui.view.DotIndicators");
                                DotIndicators dotIndicators = (DotIndicators) viewInflate;
                                dotIndicators.setNumDots(immutableList.size());
                                dotIndicators.setNumActivated(pagerState.getCurrentPage());
                                return dotIndicators;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$5$lambda$4$lambda$3(PagerState pagerState, DotIndicators view) {
                                Intrinsics.checkNotNullParameter(view, "view");
                                view.setNumActivated(pagerState.getCurrentPage());
                                return Unit.INSTANCE;
                            }
                        }

                        public final void invoke(PaddingValues padding, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(padding, "padding");
                            if ((i5 & 6) == 0) {
                                i5 |= composer3.changed(padding) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1180797372, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposable.<anonymous> (OptionOnboardingSplashComposable.kt:73)");
                            }
                            BentoThemeOverlays.DirectionThemeOverlay(BentoTheme4.POSITIVE, ComposableLambda3.rememberComposableLambda(1649522658, true, new AnonymousClass1(modifier52, PaddingKt.m5138PaddingValuesa9UjIt4(((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getTop(), ((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getBottom()), pagerStateRememberPagerState2, pages, onPageLearnMore), composer3, 54), composer3, 54);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 805306800, 505);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
