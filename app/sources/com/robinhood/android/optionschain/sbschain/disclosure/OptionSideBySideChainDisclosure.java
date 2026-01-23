package com.robinhood.android.optionschain.sbschain.disclosure;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
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
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.optionchain.C22987R;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainDisclosure.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"OptionSideBySideChainDisclosure", "", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/optionschain/sbschain/disclosure/OptionSideBySideChainDisclosureDuxo;", "(Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/optionschain/sbschain/disclosure/OptionSideBySideChainDisclosureDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-options-chain_externalDebug", "viewState", "Lcom/robinhood/android/optionschain/sbschain/disclosure/OptionSideBySideChainDisclosureViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainDisclosure {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainDisclosure$lambda$3(OptionChainLaunchMode optionChainLaunchMode, Modifier modifier, OptionSideBySideChainDisclosureDuxo optionSideBySideChainDisclosureDuxo, int i, int i2, Composer composer, int i3) {
        OptionSideBySideChainDisclosure(optionChainLaunchMode, modifier, optionSideBySideChainDisclosureDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionSideBySideChainDisclosure(final OptionChainLaunchMode launchMode, Modifier modifier, OptionSideBySideChainDisclosureDuxo optionSideBySideChainDisclosureDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        OptionSideBySideChainDisclosureDuxo optionSideBySideChainDisclosureDuxo2;
        Modifier modifier3;
        int i4;
        OptionSideBySideChainDisclosureDuxo optionSideBySideChainDisclosureDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final OptionSideBySideChainDisclosureDuxo optionSideBySideChainDisclosureDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2070934910);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(launchMode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    optionSideBySideChainDisclosureDuxo2 = optionSideBySideChainDisclosureDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(optionSideBySideChainDisclosureDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    optionSideBySideChainDisclosureDuxo2 = optionSideBySideChainDisclosureDuxo;
                }
                i3 |= i6;
            } else {
                optionSideBySideChainDisclosureDuxo2 = optionSideBySideChainDisclosureDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionSideBySideChainDisclosureDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureKt$OptionSideBySideChainDisclosure$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureKt$OptionSideBySideChainDisclosure$$inlined$duxo$1.1
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
                        OptionSideBySideChainDisclosureDuxo optionSideBySideChainDisclosureDuxo5 = (OptionSideBySideChainDisclosureDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        optionSideBySideChainDisclosureDuxo3 = optionSideBySideChainDisclosureDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2070934910, i4, -1, "com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosure (OptionSideBySideChainDisclosure.kt:26)");
                    }
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(optionSideBySideChainDisclosureDuxo3) | composerStartRestartGroup.changedInstance(launchMode);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new OptionSideBySideChainDisclosure2(optionSideBySideChainDisclosureDuxo3, launchMode, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(launchMode, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i4 & 14);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(optionSideBySideChainDisclosureDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21594getXlargeD9Ej5fM());
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    OptionSideBySideChainDisclosureDuxo optionSideBySideChainDisclosureDuxo6 = optionSideBySideChainDisclosureDuxo3;
                    Modifier modifier5 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22987R.string.option_chain_disclosure_title, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 24576, 0, 8168);
                    BentoSpannedText.m21106BentoSpannedTextTHkziT8(OptionSideBySideChainDisclosure$lambda$1(snapshotState4CollectAsStateWithLifecycle).getContent(), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, C20690R.attr.textAppearanceRegularSmall, null, 0, 0, null, composerStartRestartGroup, 48, 488);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    optionSideBySideChainDisclosureDuxo4 = optionSideBySideChainDisclosureDuxo6;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                optionSideBySideChainDisclosureDuxo3 = optionSideBySideChainDisclosureDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(optionSideBySideChainDisclosureDuxo3) | composerStartRestartGroup.changedInstance(launchMode);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new OptionSideBySideChainDisclosure2(optionSideBySideChainDisclosureDuxo3, launchMode, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(launchMode, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i4 & 14);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(optionSideBySideChainDisclosureDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    Modifier modifierM5145paddingqDBjuR02 = PaddingKt.m5145paddingqDBjuR0(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default2, bentoTheme2.getColors(composerStartRestartGroup, i72).m21371getBg0d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21594getXlargeD9Ej5fM());
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR02);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
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
                        OptionSideBySideChainDisclosureDuxo optionSideBySideChainDisclosureDuxo62 = optionSideBySideChainDisclosureDuxo3;
                        Modifier modifier52 = modifier3;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22987R.string.option_chain_disclosure_title, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i72).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), composerStartRestartGroup, 24576, 0, 8168);
                        BentoSpannedText.m21106BentoSpannedTextTHkziT8(OptionSideBySideChainDisclosure$lambda$1(snapshotState4CollectAsStateWithLifecycle2).getContent(), SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i72).m21426getFg20d7_KjU()), null, C20690R.attr.textAppearanceRegularSmall, null, 0, 0, null, composerStartRestartGroup, 48, 488);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        optionSideBySideChainDisclosureDuxo4 = optionSideBySideChainDisclosureDuxo62;
                        modifier4 = modifier52;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                optionSideBySideChainDisclosureDuxo4 = optionSideBySideChainDisclosureDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionSideBySideChainDisclosure.OptionSideBySideChainDisclosure$lambda$3(launchMode, modifier4, optionSideBySideChainDisclosureDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                    i4 = i3;
                    optionSideBySideChainDisclosureDuxo3 = optionSideBySideChainDisclosureDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(optionSideBySideChainDisclosureDuxo3) | composerStartRestartGroup.changedInstance(launchMode);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final OptionSideBySideChainDisclosureViewState OptionSideBySideChainDisclosure$lambda$1(SnapshotState4<OptionSideBySideChainDisclosureViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
