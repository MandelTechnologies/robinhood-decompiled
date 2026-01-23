package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel.RhyOverviewCarouselComposable;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel.RhyOverviewCarouselDuxo;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel.RhyOverviewCarouselViewState;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.RhyOverviewNuxComposable;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.RhyOverviewNuxDuxo;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.RhyOverviewNuxViewState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.rhy.RhyTabCarouselItem;
import com.robinhood.targetbackend.TargetBackend;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: RhyOverviewCarouselOrNuxComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a)\u0010\u0011\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"CarouselOrNuxComposable", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "markwon", "Lio/noties/markwon/Markwon;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "launchGoogleWallet", "Lkotlin/Function0;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "carouselDuxo", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselDuxo;", "nuxDuxo", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDuxo;", "(Lcom/robinhood/android/navigation/Navigator;Lio/noties/markwon/Markwon;Lcom/robinhood/android/rhimage/ImageLoader;Lkotlin/jvm/functions/Function0;Lcom/robinhood/targetbackend/TargetBackend;Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselDuxo;Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDuxo;Landroidx/compose/runtime/Composer;II)V", "DebugAddCardToGooglePayDialog", "onActionConfirmed", "onActionCancelled", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-cash-rhy-tab_externalDebug", "carouselViewState", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState;", "nuxViewState", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCarouselOrNuxComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyOverviewCarouselOrNuxComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CarouselOrNuxComposable$lambda$8(Navigator navigator, Markwon markwon, ImageLoader imageLoader, Function0 function0, TargetBackend targetBackend, RhyOverviewCarouselDuxo rhyOverviewCarouselDuxo, RhyOverviewNuxDuxo rhyOverviewNuxDuxo, int i, int i2, Composer composer, int i3) {
        CarouselOrNuxComposable(navigator, markwon, imageLoader, function0, targetBackend, rhyOverviewCarouselDuxo, rhyOverviewNuxDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DebugAddCardToGooglePayDialog$lambda$9(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        DebugAddCardToGooglePayDialog(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CarouselOrNuxComposable(final Navigator navigator, final Markwon markwon, final ImageLoader imageLoader, final Function0<Unit> launchGoogleWallet, final TargetBackend targetBackend, RhyOverviewCarouselDuxo rhyOverviewCarouselDuxo, RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Composer composer, final int i, final int i2) {
        int i3;
        RhyOverviewCarouselDuxo rhyOverviewCarouselDuxo2;
        RhyOverviewNuxDuxo rhyOverviewNuxDuxo2;
        Composer composer2;
        int i4;
        int i5;
        final RhyOverviewNuxDuxo rhyOverviewNuxDuxo3;
        RhyOverviewNuxViewState rhyOverviewNuxViewStateCarouselOrNuxComposable$lambda$1;
        final RhyOverviewCarouselDuxo rhyOverviewCarouselDuxo3;
        RhyOverviewNuxDuxo rhyOverviewNuxDuxo4;
        Composer composer3;
        final RhyOverviewCarouselDuxo rhyOverviewCarouselDuxo4;
        final RhyOverviewNuxDuxo rhyOverviewNuxDuxo5;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(launchGoogleWallet, "launchGoogleWallet");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Composer composerStartRestartGroup = composer.startRestartGroup(1989843141);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(markwon) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(imageLoader) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(launchGoogleWallet) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(targetBackend) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                rhyOverviewCarouselDuxo2 = rhyOverviewCarouselDuxo;
                int i6 = composerStartRestartGroup.changedInstance(rhyOverviewCarouselDuxo2) ? 131072 : 65536;
                i3 |= i6;
            } else {
                rhyOverviewCarouselDuxo2 = rhyOverviewCarouselDuxo;
            }
            i3 |= i6;
        } else {
            rhyOverviewCarouselDuxo2 = rhyOverviewCarouselDuxo;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                rhyOverviewNuxDuxo2 = rhyOverviewNuxDuxo;
                int i7 = composerStartRestartGroup.changedInstance(rhyOverviewNuxDuxo2) ? 1048576 : 524288;
                i3 |= i7;
            } else {
                rhyOverviewNuxDuxo2 = rhyOverviewNuxDuxo;
            }
            i3 |= i7;
        } else {
            rhyOverviewNuxDuxo2 = rhyOverviewNuxDuxo;
        }
        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            rhyOverviewNuxDuxo5 = rhyOverviewNuxDuxo2;
            composer3 = composerStartRestartGroup;
            rhyOverviewCarouselDuxo4 = rhyOverviewCarouselDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 32) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    i4 = 0;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RhyOverviewCarouselDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCarouselOrNuxComposableKt$CarouselOrNuxComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCarouselOrNuxComposableKt$CarouselOrNuxComposable$$inlined$duxo$1.1
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
                    rhyOverviewCarouselDuxo2 = (RhyOverviewCarouselDuxo) baseDuxo;
                    i3 &= -458753;
                    i5 = -1633490746;
                } else {
                    composer2 = composerStartRestartGroup;
                    i4 = 0;
                    i5 = -1633490746;
                }
                if ((i2 & 64) != 0) {
                    composer2.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current2, composer2, i4);
                    composer2.startReplaceableGroup(1729797275);
                    Composer composer4 = composer2;
                    ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RhyOverviewNuxDuxo.class), current2, (String) null, factoryCreateViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                    composer2 = composer4;
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
                    final Lifecycle lifecycle2 = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(i5);
                    boolean zChangedInstance2 = composer2.changedInstance(baseDuxo2) | composer2.changedInstance(lifecycle2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCarouselOrNuxComposableKt$CarouselOrNuxComposable$$inlined$duxo$2
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                                lifecycle2.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle3 = lifecycle2;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCarouselOrNuxComposableKt$CarouselOrNuxComposable$$inlined$duxo$2.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle3.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, i4);
                    composer2.endReplaceGroup();
                    rhyOverviewNuxDuxo3 = (RhyOverviewNuxDuxo) baseDuxo2;
                    i3 &= -3670017;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1989843141, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.CarouselOrNuxComposable (RhyOverviewCarouselOrNuxComposable.kt:35)");
                }
                Composer composer5 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(rhyOverviewCarouselDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer5, 0, 7);
                rhyOverviewNuxViewStateCarouselOrNuxComposable$lambda$1 = CarouselOrNuxComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(rhyOverviewNuxDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer5, 0, 7));
                if (rhyOverviewNuxViewStateCarouselOrNuxComposable$lambda$1 instanceof RhyOverviewNuxViewState.Loaded) {
                    rhyOverviewCarouselDuxo3 = rhyOverviewCarouselDuxo2;
                    rhyOverviewNuxDuxo4 = rhyOverviewNuxDuxo3;
                    composer5.startReplaceGroup(279655035);
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer5, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                    RhyOverviewCarouselViewState rhyOverviewCarouselViewStateCarouselOrNuxComposable$lambda$0 = CarouselOrNuxComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    composer5.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer5.changedInstance(rhyOverviewCarouselDuxo3);
                    Object objRememberedValue3 = composer5.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCarouselOrNuxComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhyOverviewCarouselOrNuxComposable.CarouselOrNuxComposable$lambda$7$lambda$6(rhyOverviewCarouselDuxo3, (RhyTabCarouselItem) obj);
                            }
                        };
                        composer5.updateRememberedValue(objRememberedValue3);
                    }
                    composer5.endReplaceGroup();
                    RhyOverviewCarouselComposable.RhyOverviewCarousel(modifierM5144paddingVpY3zN4$default, rhyOverviewCarouselViewStateCarouselOrNuxComposable$lambda$0, markwon, imageLoader, navigator, (Function1) objRememberedValue3, composer5, ((i3 << 12) & 57344) | ((i3 << 3) & 8064), 0);
                    composer3 = composer5;
                    composer3.endReplaceGroup();
                } else {
                    composer5.startReplaceGroup(278939059);
                    composer5.startReplaceGroup(978829392);
                    if (((RhyOverviewNuxViewState.Loaded) rhyOverviewNuxViewStateCarouselOrNuxComposable$lambda$1).getShowDebugAddCardToGooglePayDialog()) {
                        composer5.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer5.changedInstance(rhyOverviewNuxDuxo3);
                        Object objRememberedValue4 = composer5.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new RhyOverviewCarouselOrNuxComposable2(rhyOverviewNuxDuxo3);
                            composer5.updateRememberedValue(objRememberedValue4);
                        }
                        KFunction kFunction = (KFunction) objRememberedValue4;
                        composer5.endReplaceGroup();
                        composer5.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composer5.changedInstance(rhyOverviewNuxDuxo3);
                        Object objRememberedValue5 = composer5.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new RhyOverviewCarouselOrNuxComposable3(rhyOverviewNuxDuxo3);
                            composer5.updateRememberedValue(objRememberedValue5);
                        }
                        composer5.endReplaceGroup();
                        DebugAddCardToGooglePayDialog((Function0) ((KFunction) objRememberedValue5), (Function0) kFunction, composer5, i4);
                    }
                    composer5.endReplaceGroup();
                    composer5.startReplaceGroup(-1746271574);
                    int i8 = (composer5.changedInstance(targetBackend) ? 1 : 0) | (composer5.changedInstance(rhyOverviewNuxDuxo3) ? 1 : 0);
                    if ((i3 & 7168) == 2048) {
                        i4 = 1;
                    }
                    int i9 = i8 | i4;
                    Object objRememberedValue6 = composer5.rememberedValue();
                    if (i9 != 0 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCarouselOrNuxComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RhyOverviewCarouselOrNuxComposable.CarouselOrNuxComposable$lambda$5$lambda$4(targetBackend, rhyOverviewNuxDuxo3, launchGoogleWallet);
                            }
                        };
                        composer5.updateRememberedValue(objRememberedValue6);
                    }
                    composer5.endReplaceGroup();
                    rhyOverviewCarouselDuxo3 = rhyOverviewCarouselDuxo2;
                    rhyOverviewNuxDuxo4 = rhyOverviewNuxDuxo3;
                    RhyOverviewNuxComposable.RhyOverviewNux(null, navigator, (Function0) objRememberedValue6, rhyOverviewNuxViewStateCarouselOrNuxComposable$lambda$1, composer5, (i3 << 3) & 112, 1);
                    composer5.endReplaceGroup();
                    composer3 = composer5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                rhyOverviewCarouselDuxo4 = rhyOverviewCarouselDuxo3;
                rhyOverviewNuxDuxo5 = rhyOverviewNuxDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                composer2 = composerStartRestartGroup;
                i4 = 0;
            }
            rhyOverviewNuxDuxo3 = rhyOverviewNuxDuxo2;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Composer composer52 = composer2;
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(rhyOverviewCarouselDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer52, 0, 7);
            rhyOverviewNuxViewStateCarouselOrNuxComposable$lambda$1 = CarouselOrNuxComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(rhyOverviewNuxDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer52, 0, 7));
            if (rhyOverviewNuxViewStateCarouselOrNuxComposable$lambda$1 instanceof RhyOverviewNuxViewState.Loaded) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            rhyOverviewCarouselDuxo4 = rhyOverviewCarouselDuxo3;
            rhyOverviewNuxDuxo5 = rhyOverviewNuxDuxo4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCarouselOrNuxComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewCarouselOrNuxComposable.CarouselOrNuxComposable$lambda$8(navigator, markwon, imageLoader, launchGoogleWallet, targetBackend, rhyOverviewCarouselDuxo4, rhyOverviewNuxDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CarouselOrNuxComposable$lambda$5$lambda$4(TargetBackend targetBackend, RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Function0 function0) {
        if (targetBackend.isApollo()) {
            rhyOverviewNuxDuxo.showDebugAddCardToGooglePayDialog();
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CarouselOrNuxComposable$lambda$7$lambda$6(RhyOverviewCarouselDuxo rhyOverviewCarouselDuxo, RhyTabCarouselItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOverviewCarouselDuxo.dismissCarouselItem(it);
        return Unit.INSTANCE;
    }

    private static final void DebugAddCardToGooglePayDialog(final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1340779220);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1340779220, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.DebugAddCardToGooglePayDialog (RhyOverviewCarouselOrNuxComposable.kt:76)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(910603713, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCarouselOrNuxComposableKt.DebugAddCardToGooglePayDialog.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(910603713, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.DebugAddCardToGooglePayDialog.<anonymous> (RhyOverviewCarouselOrNuxComposable.kt:78)");
                    }
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text("Fake adding a card to Google Wallet");
                    ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.PAYMENT_CARD;
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), function0);
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composer2, 0), function02);
                    Function0<Unit> function03 = function02;
                    int i4 = (BentoAlertDialog2.Body.Text.$stable << 3) | 196614;
                    int i5 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog("Test Add Card to Google Wallet", text, bentoAlertButton, null, bentoAlertButton2, serverToBentoAssetMapper3, false, null, function03, composer2, i4 | (i5 << 6) | (i5 << 12), 200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCarouselOrNuxComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewCarouselOrNuxComposable.DebugAddCardToGooglePayDialog$lambda$9(function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final RhyOverviewCarouselViewState CarouselOrNuxComposable$lambda$0(SnapshotState4<? extends RhyOverviewCarouselViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final RhyOverviewNuxViewState CarouselOrNuxComposable$lambda$1(SnapshotState4<? extends RhyOverviewNuxViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
