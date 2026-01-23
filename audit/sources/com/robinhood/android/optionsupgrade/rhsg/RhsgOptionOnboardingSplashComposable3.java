package com.robinhood.android.optionsupgrade.rhsg;

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
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
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
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.data.OptionPage;
import com.robinhood.android.optionsupgrade.C25121R;
import com.robinhood.android.optionsupgrade.SplashPage;
import com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposable3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.common.contracts.PdfRendererIntentKey;
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

/* compiled from: RhsgOptionOnboardingSplashComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ae\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"ApacOptionOnboardingSplashComposable", "", "pages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionsupgrade/SplashPage;", "footerMarkdown", "", "isLoading", "", "onPageLearnMore", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/app/keys/data/OptionPage;", "onContinueClicked", "Lkotlin/Function0;", "onCloseClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RhsgOptionOnboardingSplashComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ApacOptionOnboardingSplashComposable$lambda$2(ImmutableList immutableList, String str, boolean z, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ApacOptionOnboardingSplashComposable(immutableList, str, z, function1, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019c  */
    @SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ApacOptionOnboardingSplashComposable(final ImmutableList<SplashPage> pages, final String footerMarkdown, final boolean z, final Function1<? super OptionPage, Unit> onPageLearnMore, final Function0<Unit> onContinueClicked, final Function0<Unit> onCloseClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        boolean z3;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(footerMarkdown, "footerMarkdown");
        Intrinsics.checkNotNullParameter(onPageLearnMore, "onPageLearnMore");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(199751044);
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
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPageLearnMore) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClicked) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(199751044, i3, -1, "com.robinhood.android.optionsupgrade.rhsg.ApacOptionOnboardingSplashComposable (RhsgOptionOnboardingSplashComposable.kt:49)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                z3 = (i3 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(pages.size());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 6, 2);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, ComposableLambda3.rememberComposableLambda(1394597440, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt.ApacOptionOnboardingSplashComposable.1
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
                            ComposerKt.traceEventStart(1394597440, i6, -1, "com.robinhood.android.optionsupgrade.rhsg.ApacOptionOnboardingSplashComposable.<anonymous> (RhsgOptionOnboardingSplashComposable.kt:62)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> lambda$1304430259$feature_options_upgrade_externalDebug = RhsgOptionOnboardingSplashComposable.INSTANCE.getLambda$1304430259$feature_options_upgrade_externalDebug();
                        final Function0<Unit> function0 = onCloseClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1304430259$feature_options_upgrade_externalDebug, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(-761785121, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt.ApacOptionOnboardingSplashComposable.1.1
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
                                    ComposerKt.traceEventStart(-761785121, i7, -1, "com.robinhood.android.optionsupgrade.rhsg.ApacOptionOnboardingSplashComposable.<anonymous>.<anonymous> (RhsgOptionOnboardingSplashComposable.kt:65)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-972080491, true, new C251762(pagerStateRememberPagerState, pages, footerMarkdown, navigator, context, onContinueClicked, z2, onPageLearnMore), composerStartRestartGroup, 54), composer2, 805306416, 316);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhsgOptionOnboardingSplashComposable3.ApacOptionOnboardingSplashComposable$lambda$2(pages, footerMarkdown, z, onPageLearnMore, onContinueClicked, onCloseClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z3) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(pages.size());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                PagerState pagerStateRememberPagerState2 = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 6, 2);
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding2, ComposableLambda3.rememberComposableLambda(1394597440, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt.ApacOptionOnboardingSplashComposable.1
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
                            ComposerKt.traceEventStart(1394597440, i6, -1, "com.robinhood.android.optionsupgrade.rhsg.ApacOptionOnboardingSplashComposable.<anonymous> (RhsgOptionOnboardingSplashComposable.kt:62)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> lambda$1304430259$feature_options_upgrade_externalDebug = RhsgOptionOnboardingSplashComposable.INSTANCE.getLambda$1304430259$feature_options_upgrade_externalDebug();
                        final Function0<Unit> function0 = onCloseClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1304430259$feature_options_upgrade_externalDebug, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(-761785121, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt.ApacOptionOnboardingSplashComposable.1.1
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
                                    ComposerKt.traceEventStart(-761785121, i7, -1, "com.robinhood.android.optionsupgrade.rhsg.ApacOptionOnboardingSplashComposable.<anonymous>.<anonymous> (RhsgOptionOnboardingSplashComposable.kt:65)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-972080491, true, new C251762(pagerStateRememberPagerState2, pages, footerMarkdown, navigator2, context2, onContinueClicked, z2, onPageLearnMore), composerStartRestartGroup, 54), composer2, 805306416, 316);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: RhsgOptionOnboardingSplashComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt$ApacOptionOnboardingSplashComposable$2 */
    static final class C251762 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $footerMarkdown;
        final /* synthetic */ boolean $isLoading;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function0<Unit> $onContinueClicked;
        final /* synthetic */ Function1<OptionPage, Unit> $onPageLearnMore;
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ ImmutableList<SplashPage> $pages;

        /* JADX WARN: Multi-variable type inference failed */
        C251762(PagerState pagerState, ImmutableList<SplashPage> immutableList, String str, Navigator navigator, Context context, Function0<Unit> function0, boolean z, Function1<? super OptionPage, Unit> function1) {
            this.$pagerState = pagerState;
            this.$pages = immutableList;
            this.$footerMarkdown = str;
            this.$navigator = navigator;
            this.$context = context;
            this.$onContinueClicked = function0;
            this.$isLoading = z;
            this.$onPageLearnMore = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-972080491, i2, -1, "com.robinhood.android.optionsupgrade.rhsg.ApacOptionOnboardingSplashComposable.<anonymous> (RhsgOptionOnboardingSplashComposable.kt:69)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
            final PagerState pagerState = this.$pagerState;
            final ImmutableList<SplashPage> immutableList = this.$pages;
            String str = this.$footerMarkdown;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            Function0<Unit> function0 = this.$onContinueClicked;
            boolean z = this.$isLoading;
            Function1<OptionPage, Unit> function1 = this.$onPageLearnMore;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            PagerKt.m5301HorizontalPager8jOkeI(pagerState, Column5.weight$default(column6, companion, 1.0f, false, 2, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(-820815028, true, new RhsgOptionOnboardingSplashComposable4(immutableList, function1), composer, 54), composer, 0, 24576, 16380);
            Modifier modifierAlign = column6.align(companion, companion2.getCenterHorizontally());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierAlign, 0.0f, bentoTheme.getSpacing(composer, i3).m21594getXlargeD9Ej5fM(), 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(immutableList) | composer.changed(pagerState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt$ApacOptionOnboardingSplashComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhsgOptionOnboardingSplashComposable3.C251762.invoke$lambda$7$lambda$2$lambda$1(immutableList, pagerState, (Context) obj);
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
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt$ApacOptionOnboardingSplashComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhsgOptionOnboardingSplashComposable3.C251762.invoke$lambda$7$lambda$4$lambda$3(pagerState, (DotIndicators) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function12, modifierM5144paddingVpY3zN4$default, (Function1) objRememberedValue2, composer, 0, 0);
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i3).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 16);
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashComposableKt$ApacOptionOnboardingSplashComposable$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhsgOptionOnboardingSplashComposable3.C251762.invoke$lambda$7$lambda$6$lambda$5(navigator, context, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BentoMarkdownText2.BentoMarkdownText(str, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue3, composer, MarkdownStyle.$stable << 6, 8);
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), null, null, false, z, null, null, null, null, false, null, composer, 0, 0, 8120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DotIndicators invoke$lambda$7$lambda$2$lambda$1(ImmutableList immutableList, PagerState pagerState, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(C25121R.layout.include_option_onboarding_splash_dot_indicator, (ViewGroup) null, false);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.common.ui.view.DotIndicators");
            DotIndicators dotIndicators = (DotIndicators) viewInflate;
            dotIndicators.setNumDots(immutableList.size());
            dotIndicators.setNumActivated(pagerState.getCurrentPage());
            return dotIndicators;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$4$lambda$3(PagerState pagerState, DotIndicators view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setNumActivated(pagerState.getCurrentPage());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5(Navigator navigator, Context context, String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Navigator.DefaultImpls.startActivity$default(navigator, context, new PdfRendererIntentKey(url, ""), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }
    }
}
