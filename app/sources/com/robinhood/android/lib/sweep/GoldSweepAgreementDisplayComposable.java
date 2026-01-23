package com.robinhood.android.lib.sweep;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayViewState;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: GoldSweepAgreementDisplayComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001aI\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"GoldSweepAgreementDisplayComposable", "", "onClickCta", "Lkotlin/Function0;", "onClickCtaError", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayDuxo;", "rhToolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayDuxo;Lcom/robinhood/android/common/ui/view/RhToolbar;Landroidx/compose/runtime/Composer;II)V", "ErrorContent", "onClickError", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LoadedContent", "loadedState", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState$Loaded;", "(Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-lib-sweep_externalDebug", "viewState", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState;", "isLoadingState", "", "isErrorState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class GoldSweepAgreementDisplayComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorContent$lambda$10(Function0 function0, int i, Composer composer, int i2) {
        ErrorContent(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSweepAgreementDisplayComposable$lambda$9(Function0 function0, Function0 function02, Modifier modifier, GoldSweepAgreementDisplayDuxo goldSweepAgreementDisplayDuxo, RhToolbar rhToolbar, int i, int i2, Composer composer, int i3) {
        GoldSweepAgreementDisplayComposable(function0, function02, modifier, goldSweepAgreementDisplayDuxo, rhToolbar, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$12(GoldSweepAgreementDisplayViewState.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedContent(loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldSweepAgreementDisplayComposable(final Function0<Unit> onClickCta, final Function0<Unit> onClickCtaError, Modifier modifier, GoldSweepAgreementDisplayDuxo goldSweepAgreementDisplayDuxo, RhToolbar rhToolbar, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        GoldSweepAgreementDisplayDuxo goldSweepAgreementDisplayDuxo2;
        int i4;
        final Modifier modifier3;
        int i5;
        int i6;
        GoldSweepAgreementDisplayDuxo goldSweepAgreementDisplayDuxo3;
        RhToolbar rhToolbar2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState4 snapshotState4;
        Object objRememberedValue2;
        SnapshotState4 snapshotState42;
        boolean z;
        Object objRememberedValue3;
        Continuation continuation;
        boolean z2;
        Object objRememberedValue4;
        final Modifier modifier4;
        final RhToolbar rhToolbar3;
        final GoldSweepAgreementDisplayDuxo goldSweepAgreementDisplayDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Intrinsics.checkNotNullParameter(onClickCtaError, "onClickCtaError");
        Composer composerStartRestartGroup = composer.startRestartGroup(1922597591);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClickCta) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickCtaError) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    goldSweepAgreementDisplayDuxo2 = goldSweepAgreementDisplayDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(goldSweepAgreementDisplayDuxo2) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    goldSweepAgreementDisplayDuxo2 = goldSweepAgreementDisplayDuxo;
                }
                i3 |= i8;
            } else {
                goldSweepAgreementDisplayDuxo2 = goldSweepAgreementDisplayDuxo;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= (i & 32768) == 0 ? composerStartRestartGroup.changed(rhToolbar) : composerStartRestartGroup.changedInstance(rhToolbar) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i5 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldSweepAgreementDisplayDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt$GoldSweepAgreementDisplayComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt$GoldSweepAgreementDisplayComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 &= -7169;
                        goldSweepAgreementDisplayDuxo2 = (GoldSweepAgreementDisplayDuxo) baseDuxo;
                    } else {
                        i5 = -1633490746;
                    }
                    i6 = i3;
                    if (i4 == 0) {
                        goldSweepAgreementDisplayDuxo3 = goldSweepAgreementDisplayDuxo2;
                        rhToolbar2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1922597591, i6, -1, "com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposable (GoldSweepAgreementDisplayComposable.kt:39)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldSweepAgreementDisplayDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(GoldSweepAgreementDisplayComposable.GoldSweepAgreementDisplayComposable$lambda$2$lambda$1(snapshotState4CollectAsStateWithLifecycle));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState4 = (SnapshotState4) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(GoldSweepAgreementDisplayComposable.GoldSweepAgreementDisplayComposable$lambda$5$lambda$4(snapshotState4CollectAsStateWithLifecycle));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState42 = (SnapshotState4) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean boolValueOf = Boolean.valueOf(GoldSweepAgreementDisplayComposable$lambda$3(snapshotState4));
                    composerStartRestartGroup.startReplaceGroup(i5);
                    int i9 = 57344 & i6;
                    z = i9 == 16384 || ((i6 & 32768) != 0 && composerStartRestartGroup.changedInstance(rhToolbar2));
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue3 == companion.getEmpty()) {
                        continuation = null;
                        objRememberedValue3 = new GoldSweepAgreementDisplayComposable2(rhToolbar2, snapshotState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                    Boolean boolValueOf2 = Boolean.valueOf(GoldSweepAgreementDisplayComposable$lambda$6(snapshotState42));
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z2 = i9 != 16384 || ((i6 & 32768) != 0 && composerStartRestartGroup.changedInstance(rhToolbar2));
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new GoldSweepAgreementDisplayComposable3(rhToolbar2, snapshotState42, continuation);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-940877406, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt.GoldSweepAgreementDisplayComposable.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-940877406, i10, -1, "com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposable.<anonymous> (GoldSweepAgreementDisplayComposable.kt:62)");
                            }
                            final Function0<Unit> function0 = onClickCtaError;
                            final Function0<Unit> function02 = onClickCta;
                            final SnapshotState4<GoldSweepAgreementDisplayViewState> snapshotState43 = snapshotState4CollectAsStateWithLifecycle;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1444326451, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt.GoldSweepAgreementDisplayComposable.3.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                                    invoke(bentoButtonBar3, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i11) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i11 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1444326451, i11, -1, "com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposable.<anonymous>.<anonymous> (GoldSweepAgreementDisplayComposable.kt:64)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer3, 6, 0);
                                    Function0<Unit> function03 = function0;
                                    Function0<Unit> function04 = function02;
                                    SnapshotState4<GoldSweepAgreementDisplayViewState> snapshotState44 = snapshotState43;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer3, 0);
                                    GoldSweepAgreementDisplayViewState goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 = GoldSweepAgreementDisplayComposable.GoldSweepAgreementDisplayComposable$lambda$0(snapshotState44);
                                    if (!(goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 instanceof GoldSweepAgreementDisplayViewState.Error)) {
                                        if (!Intrinsics.areEqual(goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0, GoldSweepAgreementDisplayViewState.Loading.INSTANCE) && !(goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 instanceof GoldSweepAgreementDisplayViewState.Loaded)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        function03 = function04;
                                    }
                                    BentoButtonKt.BentoGoldButton(function03, strStringResource, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, GoldSweepAgreementDisplayComposable.GoldSweepAgreementDisplayComposable$lambda$0(snapshotState44) instanceof GoldSweepAgreementDisplayViewState.Loading, (String) null, composer3, 384, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54);
                            final Function0<Unit> function03 = onClickCtaError;
                            final Modifier modifier5 = modifier3;
                            final SnapshotState4<GoldSweepAgreementDisplayViewState> snapshotState44 = snapshotState4CollectAsStateWithLifecycle;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-837986886, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt.GoldSweepAgreementDisplayComposable.3.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                    invoke(boxScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i11) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i11 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-837986886, i11, -1, "com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposable.<anonymous>.<anonymous> (GoldSweepAgreementDisplayComposable.kt:79)");
                                    }
                                    GoldSweepAgreementDisplayViewState goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 = GoldSweepAgreementDisplayComposable.GoldSweepAgreementDisplayComposable$lambda$0(snapshotState44);
                                    if (goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 instanceof GoldSweepAgreementDisplayViewState.Error) {
                                        composer3.startReplaceGroup(-2146509594);
                                        GoldSweepAgreementDisplayComposable.ErrorContent(function03, composer3, 0);
                                        composer3.endReplaceGroup();
                                    } else if (Intrinsics.areEqual(goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0, GoldSweepAgreementDisplayViewState.Loading.INSTANCE)) {
                                        composer3.startReplaceGroup(-2117180402);
                                        composer3.endReplaceGroup();
                                    } else {
                                        if (!(goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 instanceof GoldSweepAgreementDisplayViewState.Loaded)) {
                                            composer3.startReplaceGroup(-2146512192);
                                            composer3.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer3.startReplaceGroup(-2146502100);
                                        GoldSweepAgreementDisplayComposable.LoadedContent((GoldSweepAgreementDisplayViewState.Loaded) goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0, modifier5, composer3, 0, 0);
                                        composer3.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 3456, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    rhToolbar3 = rhToolbar2;
                    goldSweepAgreementDisplayDuxo4 = goldSweepAgreementDisplayDuxo3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i6 = i3;
                    modifier3 = modifier2;
                    i5 = -1633490746;
                }
                rhToolbar2 = rhToolbar;
                goldSweepAgreementDisplayDuxo3 = goldSweepAgreementDisplayDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends GoldSweepAgreementDisplayViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldSweepAgreementDisplayDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState42 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf3 = Boolean.valueOf(GoldSweepAgreementDisplayComposable$lambda$3(snapshotState4));
                composerStartRestartGroup.startReplaceGroup(i5);
                int i92 = 57344 & i6;
                if (i92 == 16384) {
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        continuation = null;
                        objRememberedValue3 = new GoldSweepAgreementDisplayComposable2(rhToolbar2, snapshotState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                        Boolean boolValueOf22 = Boolean.valueOf(GoldSweepAgreementDisplayComposable$lambda$6(snapshotState42));
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        if (i92 != 16384) {
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z2) {
                                objRememberedValue4 = new GoldSweepAgreementDisplayComposable3(rhToolbar2, snapshotState42, continuation);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(boolValueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-940877406, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt.GoldSweepAgreementDisplayComposable.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i10) {
                                        if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-940877406, i10, -1, "com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposable.<anonymous> (GoldSweepAgreementDisplayComposable.kt:62)");
                                        }
                                        final Function0<Unit> function0 = onClickCtaError;
                                        final Function0<Unit> function02 = onClickCta;
                                        final SnapshotState4<? extends GoldSweepAgreementDisplayViewState> snapshotState43 = snapshotState4CollectAsStateWithLifecycle2;
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1444326451, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt.GoldSweepAgreementDisplayComposable.3.1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                                                invoke(bentoButtonBar3, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i11) {
                                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                if ((i11 & 17) == 16 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1444326451, i11, -1, "com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposable.<anonymous>.<anonymous> (GoldSweepAgreementDisplayComposable.kt:64)");
                                                }
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer3, 6, 0);
                                                Function0<Unit> function03 = function0;
                                                Function0<Unit> function04 = function02;
                                                SnapshotState4<GoldSweepAgreementDisplayViewState> snapshotState44 = snapshotState43;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                Column6 column6 = Column6.INSTANCE;
                                                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer3, 0);
                                                GoldSweepAgreementDisplayViewState goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 = GoldSweepAgreementDisplayComposable.GoldSweepAgreementDisplayComposable$lambda$0(snapshotState44);
                                                if (!(goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 instanceof GoldSweepAgreementDisplayViewState.Error)) {
                                                    if (!Intrinsics.areEqual(goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0, GoldSweepAgreementDisplayViewState.Loading.INSTANCE) && !(goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 instanceof GoldSweepAgreementDisplayViewState.Loaded)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    function03 = function04;
                                                }
                                                BentoButtonKt.BentoGoldButton(function03, strStringResource, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, GoldSweepAgreementDisplayComposable.GoldSweepAgreementDisplayComposable$lambda$0(snapshotState44) instanceof GoldSweepAgreementDisplayViewState.Loading, (String) null, composer3, 384, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                                                composer3.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer2, 54);
                                        final Function0<Unit> function03 = onClickCtaError;
                                        final Modifier modifier5 = modifier3;
                                        final SnapshotState4<? extends GoldSweepAgreementDisplayViewState> snapshotState44 = snapshotState4CollectAsStateWithLifecycle2;
                                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-837986886, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt.GoldSweepAgreementDisplayComposable.3.2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                                invoke(boxScope, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i11) {
                                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                if ((i11 & 17) == 16 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-837986886, i11, -1, "com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposable.<anonymous>.<anonymous> (GoldSweepAgreementDisplayComposable.kt:79)");
                                                }
                                                GoldSweepAgreementDisplayViewState goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 = GoldSweepAgreementDisplayComposable.GoldSweepAgreementDisplayComposable$lambda$0(snapshotState44);
                                                if (goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 instanceof GoldSweepAgreementDisplayViewState.Error) {
                                                    composer3.startReplaceGroup(-2146509594);
                                                    GoldSweepAgreementDisplayComposable.ErrorContent(function03, composer3, 0);
                                                    composer3.endReplaceGroup();
                                                } else if (Intrinsics.areEqual(goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0, GoldSweepAgreementDisplayViewState.Loading.INSTANCE)) {
                                                    composer3.startReplaceGroup(-2117180402);
                                                    composer3.endReplaceGroup();
                                                } else {
                                                    if (!(goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0 instanceof GoldSweepAgreementDisplayViewState.Loaded)) {
                                                        composer3.startReplaceGroup(-2146512192);
                                                        composer3.endReplaceGroup();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    composer3.startReplaceGroup(-2146502100);
                                                    GoldSweepAgreementDisplayComposable.LoadedContent((GoldSweepAgreementDisplayViewState.Loaded) goldSweepAgreementDisplayViewStateGoldSweepAgreementDisplayComposable$lambda$0, modifier5, composer3, 0, 0);
                                                    composer3.endReplaceGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer2, 54), composer2, 3456, 3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                                rhToolbar3 = rhToolbar2;
                                goldSweepAgreementDisplayDuxo4 = goldSweepAgreementDisplayDuxo3;
                            }
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                rhToolbar3 = rhToolbar;
                modifier4 = modifier2;
                goldSweepAgreementDisplayDuxo4 = goldSweepAgreementDisplayDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldSweepAgreementDisplayComposable.GoldSweepAgreementDisplayComposable$lambda$9(onClickCta, onClickCtaError, modifier4, goldSweepAgreementDisplayDuxo4, rhToolbar3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                i6 = i3;
                if (i4 == 0) {
                    rhToolbar2 = rhToolbar;
                    goldSweepAgreementDisplayDuxo3 = goldSweepAgreementDisplayDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends GoldSweepAgreementDisplayViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(goldSweepAgreementDisplayDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState42 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf32 = Boolean.valueOf(GoldSweepAgreementDisplayComposable$lambda$3(snapshotState4));
                composerStartRestartGroup.startReplaceGroup(i5);
                int i922 = 57344 & i6;
                if (i922 == 16384) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GoldSweepAgreementDisplayComposable$lambda$2$lambda$1(SnapshotState4 snapshotState4) {
        return GoldSweepAgreementDisplayComposable$lambda$0(snapshotState4) instanceof GoldSweepAgreementDisplayViewState.Loading;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GoldSweepAgreementDisplayComposable$lambda$5$lambda$4(SnapshotState4 snapshotState4) {
        return GoldSweepAgreementDisplayComposable$lambda$0(snapshotState4) instanceof GoldSweepAgreementDisplayViewState.Error;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldSweepAgreementDisplayViewState GoldSweepAgreementDisplayComposable$lambda$0(SnapshotState4<? extends GoldSweepAgreementDisplayViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GoldSweepAgreementDisplayComposable$lambda$3(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GoldSweepAgreementDisplayComposable$lambda$6(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ErrorContent(Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-686070235);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-686070235, i2, -1, "com.robinhood.android.lib.sweep.ErrorContent (GoldSweepAgreementDisplayComposable.kt:96)");
            }
            function02 = function0;
            ErrorScreenComposable.ErrorScreenComposable(null, function02, 0, null, null, null, null, false, composerStartRestartGroup, ((i2 << 3) & 112) | 12582912, 125);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSweepAgreementDisplayComposable.ErrorContent$lambda$10(function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedContent(final GoldSweepAgreementDisplayViewState.Loaded loaded, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(662392920);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(loaded) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(662392920, i3, -1, "com.robinhood.android.lib.sweep.LoadedContent (GoldSweepAgreementDisplayComposable.kt:107)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxSize$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(loaded.getHeaderText(), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 48, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
                BentoMarkdownText2.BentoMarkdownText(loaded.getAgreementMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), 0, 0L, 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldSweepAgreementDisplayComposable.LoadedContent$lambda$12(loaded, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxSize$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(loaded.getHeaderText(), SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 48, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
                BentoMarkdownText2.BentoMarkdownText(loaded.getAgreementMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), 0, 0L, 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
