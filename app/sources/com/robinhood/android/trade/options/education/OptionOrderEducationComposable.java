package com.robinhood.android.trade.options.education;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
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
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.trade.options.education.OptionOrderEducationComposable;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionOrderEducationComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a]\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, m3636d2 = {"OptionOrderEducationComposable", "", "primaryButtonOnClick", "Lkotlin/Function0;", "secondaryButtonOnClick", "recordEducationSeen", "side", "Lcom/robinhood/models/db/OrderSide;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/trade/options/education/OptionOrderEducationDuxo;", "showSecondaryButton", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/models/db/OrderSide;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/trade/options/education/OptionOrderEducationDuxo;ZLandroidx/compose/runtime/Composer;II)V", "feature-trade-options_externalDebug", "viewState", "Lcom/robinhood/android/trade/options/education/OptionOrderEducationViewState;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.education.OptionOrderEducationComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderEducationComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOrderEducationComposable$lambda$3(Function0 function0, Function0 function02, Function0 function03, OrderSide orderSide, Modifier modifier, OptionOrderEducationDuxo optionOrderEducationDuxo, boolean z, int i, int i2, Composer composer, int i3) {
        OptionOrderEducationComposable(function0, function02, function03, orderSide, modifier, optionOrderEducationDuxo, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOrderEducationComposable(final Function0<Unit> primaryButtonOnClick, final Function0<Unit> secondaryButtonOnClick, final Function0<Unit> recordEducationSeen, final OrderSide side, Modifier modifier, OptionOrderEducationDuxo optionOrderEducationDuxo, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        OptionOrderEducationDuxo optionOrderEducationDuxo2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        OptionOrderEducationDuxo optionOrderEducationDuxo3;
        OptionOrderEducationDuxo optionOrderEducationDuxo4;
        int i7;
        Modifier modifier3;
        boolean z3;
        SystemUiController systemUiControllerRememberSystemUiController;
        long jM21371getBg0d7_KjU;
        boolean zChanged;
        Object objRememberedValue;
        final boolean z4;
        final Modifier modifier4;
        final OptionOrderEducationDuxo optionOrderEducationDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryButtonOnClick, "primaryButtonOnClick");
        Intrinsics.checkNotNullParameter(secondaryButtonOnClick, "secondaryButtonOnClick");
        Intrinsics.checkNotNullParameter(recordEducationSeen, "recordEducationSeen");
        Intrinsics.checkNotNullParameter(side, "side");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1618958231);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(primaryButtonOnClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(secondaryButtonOnClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(recordEducationSeen) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(side.ordinal()) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    optionOrderEducationDuxo2 = optionOrderEducationDuxo;
                    int i9 = composerStartRestartGroup.changedInstance(optionOrderEducationDuxo2) ? 131072 : 65536;
                    i3 |= i9;
                } else {
                    optionOrderEducationDuxo2 = optionOrderEducationDuxo;
                }
                i3 |= i9;
            } else {
                optionOrderEducationDuxo2 = optionOrderEducationDuxo;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    optionOrderEducationDuxo5 = optionOrderEducationDuxo2;
                    z4 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 32) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            i5 = -1633490746;
                            i6 = 0;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionOrderEducationDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.trade.options.education.OptionOrderEducationComposableKt$OptionOrderEducationComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.trade.options.education.OptionOrderEducationComposableKt$OptionOrderEducationComposable$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            optionOrderEducationDuxo3 = (OptionOrderEducationDuxo) baseDuxo;
                            i3 &= -458753;
                        } else {
                            i5 = -1633490746;
                            i6 = 0;
                            optionOrderEducationDuxo3 = optionOrderEducationDuxo2;
                        }
                        optionOrderEducationDuxo4 = optionOrderEducationDuxo3;
                        i7 = i3;
                        modifier3 = modifier5;
                        z3 = i4 == 0 ? true : z;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        Modifier modifier6 = modifier2;
                        i7 = i3;
                        modifier3 = modifier6;
                        optionOrderEducationDuxo4 = optionOrderEducationDuxo2;
                        z3 = z2;
                        i5 = -1633490746;
                        i6 = 0;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1618958231, i7, -1, "com.robinhood.android.trade.options.education.OptionOrderEducationComposable (OptionOrderEducationComposable.kt:37)");
                    }
                    int i10 = i7;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(optionOrderEducationDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, i6, 1);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i11 = BentoTheme.$stable;
                    jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i11).m21371getBg0d7_KjU();
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(i5);
                    zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new OptionOrderEducationComposable2(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(-1040679915);
                    if (!z3) {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean z5 = (i10 & 896) == 256;
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new OptionOrderEducationComposable3(recordEducationSeen, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier7 = modifier3;
                    Composer composer2 = composerStartRestartGroup;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(PaddingKt.m5144paddingVpY3zN4$default(modifier3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), 1, null), null, null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i11).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(1906973882, true, new C298243(side, primaryButtonOnClick, secondaryButtonOnClick, snapshotState4CollectAsStateWithLifecycle, z3), composerStartRestartGroup, 54), composer2, 805306368, 446);
                    composerStartRestartGroup = composer2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z3;
                    modifier4 = modifier7;
                    optionOrderEducationDuxo5 = optionOrderEducationDuxo4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.education.OptionOrderEducationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionOrderEducationComposable.OptionOrderEducationComposable$lambda$3(primaryButtonOnClick, secondaryButtonOnClick, recordEducationSeen, side, modifier4, optionOrderEducationDuxo5, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            z2 = z;
            if ((599187 & i3) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                    optionOrderEducationDuxo4 = optionOrderEducationDuxo3;
                    i7 = i3;
                    modifier3 = modifier5;
                    if (i4 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i102 = i7;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(optionOrderEducationDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, i6, 1);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i112 = BentoTheme.$stable;
                    jM21371getBg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i112).m21371getBg0d7_KjU();
                    Unit unit2 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(i5);
                    zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new OptionOrderEducationComposable2(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(-1040679915);
                        if (!z3) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier72 = modifier3;
                        Composer composer22 = composerStartRestartGroup;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(PaddingKt.m5144paddingVpY3zN4$default(modifier3, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i112).m21590getDefaultD9Ej5fM(), 1, null), null, null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i112).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(1906973882, true, new C298243(side, primaryButtonOnClick, secondaryButtonOnClick, snapshotState4CollectAsStateWithLifecycle2, z3), composerStartRestartGroup, 54), composer22, 805306368, 446);
                        composerStartRestartGroup = composer22;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z4 = z3;
                        modifier4 = modifier72;
                        optionOrderEducationDuxo5 = optionOrderEducationDuxo4;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        z2 = z;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: OptionOrderEducationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.education.OptionOrderEducationComposableKt$OptionOrderEducationComposable$3 */
    static final class C298243 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $primaryButtonOnClick;
        final /* synthetic */ Function0<Unit> $secondaryButtonOnClick;
        final /* synthetic */ boolean $showSecondaryButton;
        final /* synthetic */ OrderSide $side;
        final /* synthetic */ SnapshotState4<OptionOrderEducationViewState> $viewState$delegate;

        C298243(OrderSide orderSide, Function0<Unit> function0, Function0<Unit> function02, SnapshotState4<OptionOrderEducationViewState> snapshotState4, boolean z) {
            this.$side = orderSide;
            this.$primaryButtonOnClick = function0;
            this.$secondaryButtonOnClick = function02;
            this.$viewState$delegate = snapshotState4;
            this.$showSecondaryButton = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final LottieComposition invoke$lambda$7$lambda$0(LottieCompositionResult lottieCompositionResult) {
            return lottieCompositionResult.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$7$lambda$1(LottieAnimationState lottieAnimationState) {
            return lottieAnimationState.getValue().floatValue();
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) throws Resources.NotFoundException {
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
                ComposerKt.traceEventStart(1906973882, i2, -1, "com.robinhood.android.trade.options.education.OptionOrderEducationComposable.<anonymous> (OptionOrderEducationComposable.kt:56)");
            }
            Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
            OrderSide orderSide = this.$side;
            Function0<Unit> function0 = this.$primaryButtonOnClick;
            Function0<Unit> function02 = this.$secondaryButtonOnClick;
            SnapshotState4<OptionOrderEducationViewState> snapshotState4 = this.$viewState$delegate;
            boolean z = this.$showSecondaryButton;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            OptionOrderEducationViewState optionOrderEducationViewStateOptionOrderEducationComposable$lambda$0 = OptionOrderEducationComposable.OptionOrderEducationComposable$lambda$0(snapshotState4);
            Intrinsics.checkNotNull(resources);
            BentoText2.m20747BentoText38GnDrw(optionOrderEducationViewStateOptionOrderEducationComposable$lambda$0.getTitle(resources), modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8184);
            BentoText2.m20747BentoText38GnDrw(OptionOrderEducationComposable.OptionOrderEducationComposable$lambda$0(snapshotState4).getSubtitle(resources, orderSide), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 8, null), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8184);
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(OptionOrderEducationComposable.OptionOrderEducationComposable$lambda$0(snapshotState4).getLottie(bentoTheme.getColors(composer, i3).getIsDay()))), null, null, null, null, null, composer, 0, 62);
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(invoke$lambda$7$lambda$0(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, 1, null, false, false, composer, 1572864, 958);
            Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            LottieComposition lottieCompositionInvoke$lambda$7$lambda$0 = invoke$lambda$7$lambda$0(lottieCompositionResultRememberLottieComposition);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.trade.options.education.OptionOrderEducationComposableKt$OptionOrderEducationComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(OptionOrderEducationComposable.C298243.invoke$lambda$7$lambda$1(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LottieAnimation2.LottieAnimation(lottieCompositionInvoke$lambda$7$lambda$0, (Function0) objRememberedValue, modifierWeight$default, false, false, false, null, false, null, null, null, false, false, null, null, false, composer, 0, 0, 65528);
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            String bannerText = OptionOrderEducationComposable.OptionOrderEducationComposable$lambda$0(snapshotState4).getBannerText(resources);
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.TRIANGLE_ALERT_24);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.trade.options.education.OptionOrderEducationComposableKt$OptionOrderEducationComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoInfoBanner2.BentoPinnedInfoBanner(modifierM5144paddingVpY3zN4$default2, bannerText, size24, null, (Function0) objRememberedValue2, composer, (BentoIcon4.Size24.$stable << 6) | 27648, 0);
            BentoButtonBar2.BentoButtonBar(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, null, null, function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0), false, null, false, function02, z ? StringResources_androidKt.stringResource(C11048R.string.general_label_dont_show_this_again, composer, 0) : null, false, null, false, composer, 0, 0, 59198);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderEducationViewState OptionOrderEducationComposable$lambda$0(SnapshotState4<OptionOrderEducationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
