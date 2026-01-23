package com.robinhood.android.portfolio.benchmarkIntro;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ContentColor3;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.portfolio.C25550R;
import com.robinhood.android.responsive.AspectRatio;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoColor2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.app.type.AppType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: BenchmarkIntroScreen.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001aq\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\u0002\b\u00142\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\u0002\b\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u001a\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u000f\u0010\u001d\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001d\u0010\u001b¨\u0006\"²\u0006\f\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/app/type/AppType;", "appType", "Lkotlin/Function0;", "", "onDisclosuresClick", "onCtaClick", "onBackClick", "Lcom/robinhood/android/portfolio/benchmarkIntro/BenchmarkIntroDuxo;", "duxo", "BenchmarkIntroScreen", "(Lcom/robinhood/shared/app/type/AppType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/portfolio/benchmarkIntro/BenchmarkIntroDuxo;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "headerPainter", "Landroidx/compose/ui/graphics/Color;", "headerBackgroundColor", "backButtonColor", "", "titleText", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "bodyContent", DirectDepositBrokerageExperimentPage.FOOTER_CONTENT, "BasicIntroScreen-K2djEUw", "(Landroidx/compose/ui/graphics/painter/Painter;JJLjava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BasicIntroScreen", "BenchmarkIntroPreview", "(Landroidx/compose/runtime/Composer;I)V", "BenchmarkIntroPreviewFoldable", "BenchmarkIntroPreviewTablet", "Lcom/robinhood/android/portfolio/benchmarkIntro/BenchmarkIntroViewState;", "viewState", "", "showFooterDivider", "feature-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class BenchmarkIntroScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BasicIntroScreen_K2djEUw$lambda$13(Painter painter, long j, long j2, String str, Function3 function3, Function3 function32, Function0 function0, int i, int i2, Composer composer, int i3) {
        m17620BasicIntroScreenK2djEUw(painter, j, j2, str, function3, function32, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkIntroPreview$lambda$14(int i, Composer composer, int i2) {
        BenchmarkIntroPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkIntroPreviewFoldable$lambda$15(int i, Composer composer, int i2) {
        BenchmarkIntroPreviewFoldable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkIntroPreviewTablet$lambda$16(int i, Composer composer, int i2) {
        BenchmarkIntroPreviewTablet(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkIntroScreen$lambda$1(AppType appType, Function0 function0, Function0 function02, Function0 function03, BenchmarkIntroDuxo benchmarkIntroDuxo, int i, int i2, Composer composer, int i3) {
        BenchmarkIntroScreen(appType, function0, function02, function03, benchmarkIntroDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BenchmarkIntroScreen(final AppType appType, final Function0<Unit> onDisclosuresClick, final Function0<Unit> onCtaClick, final Function0<Unit> onBackClick, BenchmarkIntroDuxo benchmarkIntroDuxo, Composer composer, final int i, final int i2) {
        int i3;
        BenchmarkIntroDuxo benchmarkIntroDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        BenchmarkIntroDuxo benchmarkIntroDuxo3;
        Composer composer3;
        final BenchmarkIntroDuxo benchmarkIntroDuxo4;
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(onDisclosuresClick, "onDisclosuresClick");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(679258091);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(appType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisclosuresClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCtaClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                benchmarkIntroDuxo2 = benchmarkIntroDuxo;
                int i4 = composerStartRestartGroup.changedInstance(benchmarkIntroDuxo2) ? 16384 : 8192;
                i3 |= i4;
            } else {
                benchmarkIntroDuxo2 = benchmarkIntroDuxo;
            }
            i3 |= i4;
        } else {
            benchmarkIntroDuxo2 = benchmarkIntroDuxo;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(BenchmarkIntroDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$BenchmarkIntroScreen$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$BenchmarkIntroScreen$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                    composer2.endReplaceGroup();
                    benchmarkIntroDuxo2 = (BenchmarkIntroDuxo) baseDuxo;
                    i3 &= -57345;
                }
                benchmarkIntroDuxo3 = benchmarkIntroDuxo2;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(679258091, i3, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreen (BenchmarkIntroScreen.kt:68)");
                }
                final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Composer composer4 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(benchmarkIntroDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1564797952, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt.BenchmarkIntroScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i5) {
                        if ((i5 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1564797952, i5, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreen.<anonymous> (BenchmarkIntroScreen.kt:73)");
                        }
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(C25550R.drawable.benchmark_intro_art, composer5, 0);
                        long jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).m21372getBg20d7_KjU();
                        String strStringResource = StringResources_androidKt.stringResource(C25550R.string.benchmark_intro_title, composer5, 0);
                        final AppType appType2 = appType;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                        final Function0<Unit> function0 = onDisclosuresClick;
                        final SnapshotState4<BenchmarkIntroViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1776116331, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt.BenchmarkIntroScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer6, Integer num) {
                                invoke(column5, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Column5 BasicIntroScreen, Composer composer6, int i6) {
                                Intrinsics.checkNotNullParameter(BasicIntroScreen, "$this$BasicIntroScreen");
                                if ((i6 & 17) == 16 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1776116331, i6, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreen.<anonymous>.<anonymous> (BenchmarkIntroScreen.kt:78)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer6, i7).m21590getDefaultD9Ej5fM(), 0.0f, composer6, 6, 2);
                                AppType appType3 = appType2;
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource((appType3 == AppType.RHC || appType3 == AppType.NCW) ? C25550R.string.benchmark_intro_description_with_crypto : (BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInEtfRegionGate() && BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInCryptoRegionGate()) ? C25550R.string.benchmark_intro_description_with_stock_etf_crypto : BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInEtfRegionGate() ? C25550R.string.benchmark_intro_description_with_stock_etf : BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInCryptoRegionGate() ? C25550R.string.benchmark_intro_description_with_stock_crypto : C25550R.string.benchmark_intro_description_with_stock, composer6, 0), modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer6, i7).getTextM(), composer6, 0, 0, 8188);
                                BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C25550R.string.benchmark_intro_disclosures, composer6, 0), ModifiersKt.autoLogEvents$default(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer6, i7).m21590getDefaultD9Ej5fM(), 0.0f, composer6, 6, 2), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.LINK_BUTTON, "disclosures", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.POP_OUT_16, BentoTextButton3.Icon.Position.Trailing), null, false, null, composer6, BentoTextButton3.Icon.Size12.$stable << 9, 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54);
                        final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor;
                        final Function0<Unit> function02 = onCtaClick;
                        BenchmarkIntroScreen.m17620BasicIntroScreenK2djEUw(painterPainterResource, jM21372getBg20d7_KjU, 0L, strStringResource, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1550890036, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt.BenchmarkIntroScreen.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer6, Integer num) {
                                invoke(column5, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Column5 BasicIntroScreen, Composer composer6, int i6) {
                                Intrinsics.checkNotNullParameter(BasicIntroScreen, "$this$BasicIntroScreen");
                                if ((i6 & 17) == 16 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1550890036, i6, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreen.<anonymous>.<anonymous> (BenchmarkIntroScreen.kt:116)");
                                }
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor3, null, null, null, null, new Component(Component.ComponentType.BUTTON, "start-comparing", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                                BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C25550R.string.benchmark_intro_cta, composer6, 0), modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer6, 0, 0, 8184);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), onBackClick, composer5, 221184, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                benchmarkIntroDuxo4 = benchmarkIntroDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    benchmarkIntroDuxo3 = benchmarkIntroDuxo2;
                    composer2 = composerStartRestartGroup;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Composer composer42 = composer2;
                    final SnapshotState4<BenchmarkIntroViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(benchmarkIntroDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                    composer3 = composer42;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1564797952, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt.BenchmarkIntroScreen.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i5) {
                            if ((i5 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1564797952, i5, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreen.<anonymous> (BenchmarkIntroScreen.kt:73)");
                            }
                            Painter painterPainterResource = PainterResources_androidKt.painterResource(C25550R.drawable.benchmark_intro_art, composer5, 0);
                            long jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).m21372getBg20d7_KjU();
                            String strStringResource = StringResources_androidKt.stringResource(C25550R.string.benchmark_intro_title, composer5, 0);
                            final AppType appType2 = appType;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor22 = userInteractionEventDescriptor2;
                            final Function0<Unit> function0 = onDisclosuresClick;
                            final SnapshotState4<BenchmarkIntroViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1776116331, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt.BenchmarkIntroScreen.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer6, Integer num) {
                                    invoke(column5, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Column5 BasicIntroScreen, Composer composer6, int i6) {
                                    Intrinsics.checkNotNullParameter(BasicIntroScreen, "$this$BasicIntroScreen");
                                    if ((i6 & 17) == 16 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1776116331, i6, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreen.<anonymous>.<anonymous> (BenchmarkIntroScreen.kt:78)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i7 = BentoTheme.$stable;
                                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer6, i7).m21590getDefaultD9Ej5fM(), 0.0f, composer6, 6, 2);
                                    AppType appType3 = appType2;
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource((appType3 == AppType.RHC || appType3 == AppType.NCW) ? C25550R.string.benchmark_intro_description_with_crypto : (BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInEtfRegionGate() && BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInCryptoRegionGate()) ? C25550R.string.benchmark_intro_description_with_stock_etf_crypto : BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInEtfRegionGate() ? C25550R.string.benchmark_intro_description_with_stock_etf : BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInCryptoRegionGate() ? C25550R.string.benchmark_intro_description_with_stock_crypto : C25550R.string.benchmark_intro_description_with_stock, composer6, 0), modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer6, i7).getTextM(), composer6, 0, 0, 8188);
                                    BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C25550R.string.benchmark_intro_disclosures, composer6, 0), ModifiersKt.autoLogEvents$default(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer6, i7).m21590getDefaultD9Ej5fM(), 0.0f, composer6, 6, 2), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor22, null, null, null, null, new Component(Component.ComponentType.LINK_BUTTON, "disclosures", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.POP_OUT_16, BentoTextButton3.Icon.Position.Trailing), null, false, null, composer6, BentoTextButton3.Icon.Size12.$stable << 9, 112);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54);
                            final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                            final Function0<Unit> function02 = onCtaClick;
                            BenchmarkIntroScreen.m17620BasicIntroScreenK2djEUw(painterPainterResource, jM21372getBg20d7_KjU, 0L, strStringResource, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1550890036, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt.BenchmarkIntroScreen.1.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer6, Integer num) {
                                    invoke(column5, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Column5 BasicIntroScreen, Composer composer6, int i6) {
                                    Intrinsics.checkNotNullParameter(BasicIntroScreen, "$this$BasicIntroScreen");
                                    if ((i6 & 17) == 16 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1550890036, i6, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreen.<anonymous>.<anonymous> (BenchmarkIntroScreen.kt:116)");
                                    }
                                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor3, null, null, null, null, new Component(Component.ComponentType.BUTTON, "start-comparing", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C25550R.string.benchmark_intro_cta, composer6, 0), modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer6, 0, 0, 8184);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54), onBackClick, composer5, 221184, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    benchmarkIntroDuxo4 = benchmarkIntroDuxo3;
                }
            }
            composer2 = composerStartRestartGroup;
            benchmarkIntroDuxo3 = benchmarkIntroDuxo2;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Composer composer422 = composer2;
            final SnapshotState4<BenchmarkIntroViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(benchmarkIntroDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer422, 0, 7);
            composer3 = composer422;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1564797952, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt.BenchmarkIntroScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i5) {
                    if ((i5 & 3) == 2 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1564797952, i5, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreen.<anonymous> (BenchmarkIntroScreen.kt:73)");
                    }
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(C25550R.drawable.benchmark_intro_art, composer5, 0);
                    long jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).m21372getBg20d7_KjU();
                    String strStringResource = StringResources_androidKt.stringResource(C25550R.string.benchmark_intro_title, composer5, 0);
                    final AppType appType2 = appType;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor222 = userInteractionEventDescriptor22;
                    final Function0<Unit> function0 = onDisclosuresClick;
                    final SnapshotState4<BenchmarkIntroViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle22;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1776116331, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt.BenchmarkIntroScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer6, Integer num) {
                            invoke(column5, composer6, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 BasicIntroScreen, Composer composer6, int i6) {
                            Intrinsics.checkNotNullParameter(BasicIntroScreen, "$this$BasicIntroScreen");
                            if ((i6 & 17) == 16 && composer6.getSkipping()) {
                                composer6.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1776116331, i6, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreen.<anonymous>.<anonymous> (BenchmarkIntroScreen.kt:78)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer6, i7).m21590getDefaultD9Ej5fM(), 0.0f, composer6, 6, 2);
                            AppType appType3 = appType2;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource((appType3 == AppType.RHC || appType3 == AppType.NCW) ? C25550R.string.benchmark_intro_description_with_crypto : (BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInEtfRegionGate() && BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInCryptoRegionGate()) ? C25550R.string.benchmark_intro_description_with_stock_etf_crypto : BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInEtfRegionGate() ? C25550R.string.benchmark_intro_description_with_stock_etf : BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$0(snapshotState4).getInCryptoRegionGate() ? C25550R.string.benchmark_intro_description_with_stock_crypto : C25550R.string.benchmark_intro_description_with_stock, composer6, 0), modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer6, i7).getTextM(), composer6, 0, 0, 8188);
                            BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C25550R.string.benchmark_intro_disclosures, composer6, 0), ModifiersKt.autoLogEvents$default(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer6, i7).m21590getDefaultD9Ej5fM(), 0.0f, composer6, 6, 2), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor222, null, null, null, null, new Component(Component.ComponentType.LINK_BUTTON, "disclosures", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.POP_OUT_16, BentoTextButton3.Icon.Position.Trailing), null, false, null, composer6, BentoTextButton3.Icon.Size12.$stable << 9, 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer5, 54);
                    final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor22;
                    final Function0<Unit> function02 = onCtaClick;
                    BenchmarkIntroScreen.m17620BasicIntroScreenK2djEUw(painterPainterResource, jM21372getBg20d7_KjU, 0L, strStringResource, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1550890036, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt.BenchmarkIntroScreen.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer6, Integer num) {
                            invoke(column5, composer6, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 BasicIntroScreen, Composer composer6, int i6) {
                            Intrinsics.checkNotNullParameter(BasicIntroScreen, "$this$BasicIntroScreen");
                            if ((i6 & 17) == 16 && composer6.getSkipping()) {
                                composer6.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1550890036, i6, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreen.<anonymous>.<anonymous> (BenchmarkIntroScreen.kt:116)");
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor3, null, null, null, null, new Component(Component.ComponentType.BUTTON, "start-comparing", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                            BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C25550R.string.benchmark_intro_cta, composer6, 0), modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer6, 0, 0, 8184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer5, 54), onBackClick, composer5, 221184, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer3, 54), composer3, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            benchmarkIntroDuxo4 = benchmarkIntroDuxo3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            benchmarkIntroDuxo4 = benchmarkIntroDuxo2;
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkIntroScreen.BenchmarkIntroScreen$lambda$1(appType, onDisclosuresClick, onCtaClick, onBackClick, benchmarkIntroDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean BasicIntroScreen_K2djEUw$lambda$4(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BenchmarkIntroViewState BenchmarkIntroScreen$lambda$0(SnapshotState4<BenchmarkIntroViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0176  */
    /* renamed from: BasicIntroScreen-K2djEUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17620BasicIntroScreenK2djEUw(final Painter painter, final long j, long j2, final String str, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function32, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        long jM21356contrastColorRGew2ao;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Composer composer2;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        final SystemUiController systemUiControllerRememberSystemUiController;
        final long jM21371getBg0d7_KjU;
        boolean zChanged;
        Object objRememberedValue2;
        final long j5;
        Composer composerStartRestartGroup = composer.startRestartGroup(876915822);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
            }
        }
        if ((i & 384) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            j5 = j4;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    jM21356contrastColorRGew2ao = BentoColor2.m21356contrastColorRGew2ao(j3, 0L, 0L, composerStartRestartGroup, (i3 >> 3) & 14, 3);
                    composerStartRestartGroup = composerStartRestartGroup;
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(876915822, i3, -1, "com.robinhood.android.portfolio.benchmarkIntro.BasicIntroScreen (BenchmarkIntroScreen.kt:147)");
                }
                final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(BenchmarkIntroScreen.BasicIntroScreen_K2djEUw$lambda$3$lambda$2(lazyListStateRememberLazyListState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                final long j6 = jM21356contrastColorRGew2ao;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Background3.m4872backgroundbw27NRU$default(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), AspectRatio.INSTANCE.getHeroImage(composerStartRestartGroup, AspectRatio.$stable), false, 2, null), j, null, 2, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierStatusBarsPadding);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                ImageKt.Image(painter, (String) null, androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default3, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, (i3 & 14) | 24624, 104);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance.align(companion2, companion3.getBottomCenter()), 0L, 0.0f, composer2, 0, 6);
                composer2.endNode();
                int i5 = i3 >> 9;
                BentoText2.m20747BentoText38GnDrw(str, androidx.compose.foundation.layout.PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getBookCoverCapsuleSmall(), composer2, i5 & 14, 0, 8188);
                function3.invoke(column6, composer2, Integer.valueOf(6 | (i5 & 112)));
                Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer2, 0);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, i4).m21373getBg30d7_KjU(), !BasicIntroScreen_K2djEUw$lambda$4(snapshotState4) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composer2, 0, 5);
                int i6 = i3;
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, 0.0f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), composer2, 6, 1));
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), companion3.getCenterHorizontally(), composer2, 48);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierNavigationBarsPadding);
                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                function32.invoke(column6, composer2, Integer.valueOf(6 | ((i6 >> 12) & 112)));
                composer2.endNode();
                composer2.endNode();
                Modifier modifierAlign = boxScopeInstance.align(companion2, companion3.getTopCenter());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierAlign);
                Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor5);
                }
                composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion4.getSetModifier());
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(BenchmarkIntroScreen3.INSTANCE.m17622getLambda$1737361835$feature_portfolio_externalDebug(), null, ComposableLambda3.rememberComposableLambda(1636059777, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$BasicIntroScreen$1$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i7 & 6) == 0) {
                            i7 |= (i7 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1636059777, i7, -1, "com.robinhood.android.portfolio.benchmarkIntro.BasicIntroScreen.<anonymous>.<anonymous>.<anonymous> (BenchmarkIntroScreen.kt:220)");
                        }
                        ProvidedValue<Color> providedValueProvides = ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(j6));
                        final Function0<Unit> function02 = function0;
                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(637402561, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$BasicIntroScreen$1$2$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(637402561, i8, -1, "com.robinhood.android.portfolio.benchmarkIntro.BasicIntroScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BenchmarkIntroScreen.kt:221)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "back_button"), false, null, function02, composer4, (BentoAppBarScope.$stable << 12) | 6, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, null, true, false, null, null, 0L, null, composer2, 196998, 0, 2010);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiControllerRememberSystemUiController, j, false, null, 6, null);
                Color colorM6701boximpl = Color.m6701boximpl(j);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | ((i6 & 112) == 32) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BenchmarkIntroScreen.BasicIntroScreen_K2djEUw$lambda$12$lambda$11(systemUiControllerRememberSystemUiController, j, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(colorM6701boximpl, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, (i6 >> 3) & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = j6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            jM21356contrastColorRGew2ao = j4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion22 = Modifier.INSTANCE;
            final long j62 = jM21356contrastColorRGew2ao;
            Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
            Alignment.Companion companion32 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default4);
            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor6 = companion42.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, companion42.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap6, companion42.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier6, companion42.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxSize$default22 = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion32.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default22);
                Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy3, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier modifierStatusBarsPadding2 = WindowInsetsPadding_androidKt.statusBarsPadding(Background3.m4872backgroundbw27NRU$default(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), AspectRatio.INSTANCE.getHeroImage(composerStartRestartGroup, AspectRatio.$stable), false, 2, null), j, null, 2, null));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getCenter(), false);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierStatusBarsPadding2);
                    Function0<ComposeUiNode> constructor32 = companion42.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy22, companion42.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion42.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion42.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion42.getSetModifier());
                        Modifier modifierFillMaxSize$default32 = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i42 = BentoTheme.$stable;
                        composer2 = composerStartRestartGroup;
                        ImageKt.Image(painter, (String) null, androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default32, bentoTheme2.getSpacing(composerStartRestartGroup, i42).m21590getDefaultD9Ej5fM()), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, (i3 & 14) | 24624, 104);
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance2.align(companion22, companion32.getBottomCenter()), 0L, 0.0f, composer2, 0, 6);
                        composer2.endNode();
                        int i52 = i3 >> 9;
                        BentoText2.m20747BentoText38GnDrw(str, androidx.compose.foundation.layout.PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), bentoTheme2.getSpacing(composer2, i42).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i42).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i42).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i42).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i42).getBookCoverCapsuleSmall(), composer2, i52 & 14, 0, 8188);
                        function3.invoke(column62, composer2, Integer.valueOf(6 | (i52 & 112)));
                        Spacer2.Spacer(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composer2, 0);
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composer2, i42).m21373getBg30d7_KjU(), !BasicIntroScreen_K2djEUw$lambda$4(snapshotState42) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composer2, 0, 5);
                        int i62 = i3;
                        Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion22, 0.0f, bentoTheme2.getSpacing(composer2, i42).m21590getDefaultD9Ej5fM(), composer2, 6, 1));
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer2, i42).m21590getDefaultD9Ej5fM()), companion32.getCenterHorizontally(), composer2, 48);
                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer2, modifierNavigationBarsPadding2);
                        Function0<ComposeUiNode> constructor42 = companion42.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy22, companion42.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = companion42.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl4.getInserting()) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion42.getSetModifier());
                            function32.invoke(column62, composer2, Integer.valueOf(6 | ((i62 >> 12) & 112)));
                            composer2.endNode();
                            composer2.endNode();
                            Modifier modifierAlign2 = boxScopeInstance2.align(companion22, companion32.getTopCenter());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopStart(), false);
                            currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap52 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composer2, modifierAlign2);
                            Function0<ComposeUiNode> constructor52 = companion42.getConstructor();
                            if (composer2.getApplier() == null) {
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                            }
                            composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy32, companion42.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion42.getSetResolvedCompositionLocals());
                            setCompositeKeyHash5 = companion42.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl5.getInserting()) {
                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion42.getSetModifier());
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(BenchmarkIntroScreen3.INSTANCE.m17622getLambda$1737361835$feature_portfolio_externalDebug(), null, ComposableLambda3.rememberComposableLambda(1636059777, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$BasicIntroScreen$1$2$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                        invoke(bentoAppBarScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer3, int i7) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i7 & 6) == 0) {
                                            i7 |= (i7 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1636059777, i7, -1, "com.robinhood.android.portfolio.benchmarkIntro.BasicIntroScreen.<anonymous>.<anonymous>.<anonymous> (BenchmarkIntroScreen.kt:220)");
                                        }
                                        ProvidedValue<Color> providedValueProvides = ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(j62));
                                        final Function0<Unit> function02 = function0;
                                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(637402561, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$BasicIntroScreen$1$2$1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i8) {
                                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(637402561, i8, -1, "com.robinhood.android.portfolio.benchmarkIntro.BasicIntroScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BenchmarkIntroScreen.kt:221)");
                                                }
                                                BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "back_button"), false, null, function02, composer4, (BentoAppBarScope.$stable << 12) | 6, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), null, null, true, false, null, null, 0L, null, composer2, 196998, 0, 2010);
                                composerStartRestartGroup = composer2;
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                                jM21371getBg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i42).m21371getBg0d7_KjU();
                                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiControllerRememberSystemUiController, j, false, null, 6, null);
                                Color colorM6701boximpl2 = Color.m6701boximpl(j);
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | ((i62 & 112) == 32) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return BenchmarkIntroScreen.BasicIntroScreen_K2djEUw$lambda$12$lambda$11(systemUiControllerRememberSystemUiController, j, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.DisposableEffect(colorM6701boximpl2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, (i62 >> 3) & 14);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    j5 = j62;
                                }
                            }
                        }
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkIntroScreen.BasicIntroScreen_K2djEUw$lambda$13(painter, j, j5, str, function3, function32, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BasicIntroScreen_K2djEUw$lambda$3$lambda$2(LazyListState lazyListState) {
        return !TopBarScrollState3.isScrolledToTheEnd(lazyListState) && TopBarScrollState3.getCanBeScrolled(lazyListState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult BasicIntroScreen_K2djEUw$lambda$12$lambda$11(final SystemUiController systemUiController, long j, final long j2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
        return new DisposableEffectResult() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$BasicIntroScreen_K2djEUw$lambda$12$lambda$11$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j2, false, null, 6, null);
            }
        };
    }

    private static final void BenchmarkIntroPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1816920079);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1816920079, i, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroPreview (BenchmarkIntroScreen.kt:245)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BenchmarkIntroScreen3.INSTANCE.m17623getLambda$949055063$feature_portfolio_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkIntroScreen.BenchmarkIntroPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BenchmarkIntroPreviewFoldable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1168550828);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1168550828, i, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroPreviewFoldable (BenchmarkIntroScreen.kt:258)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BenchmarkIntroScreen3.INSTANCE.getLambda$1936721252$feature_portfolio_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkIntroScreen.BenchmarkIntroPreviewFoldable$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BenchmarkIntroPreviewTablet(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1256331849);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1256331849, i, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroPreviewTablet (BenchmarkIntroScreen.kt:271)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BenchmarkIntroScreen3.INSTANCE.getLambda$576867695$feature_portfolio_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkIntroScreen.BenchmarkIntroPreviewTablet$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
