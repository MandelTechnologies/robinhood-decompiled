package com.robinhood.android.crypto.p094ui.detail.staking.section;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoStakingDetailSectionComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"CryptoStakingDetailSectionComposable", "", "currencyPairId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/ui/detail/staking/section/CryptoStakingDetailSectionDuxo;", "(Ljava/util/UUID;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/ui/detail/staking/section/CryptoStakingDetailSectionDuxo;Landroidx/compose/runtime/Composer;II)V", CryptoStakingDetailSectionComposable.CryptoStakingDetailSectionTestTag, "", "feature-crypto_externalDebug", "viewState", "Lcom/robinhood/android/crypto/ui/detail/staking/section/CryptoStakingDetailSectionViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.staking.section.CryptoStakingDetailSectionComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoStakingDetailSectionComposable {
    public static final String CryptoStakingDetailSectionTestTag = "CryptoStakingDetailSectionTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoStakingDetailSectionComposable$lambda$2(UUID uuid, Modifier modifier, CryptoStakingDetailSectionDuxo cryptoStakingDetailSectionDuxo, int i, int i2, Composer composer, int i3) {
        CryptoStakingDetailSectionComposable(uuid, modifier, cryptoStakingDetailSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoStakingDetailSectionComposable$lambda$3(UUID uuid, Modifier modifier, CryptoStakingDetailSectionDuxo cryptoStakingDetailSectionDuxo, int i, int i2, Composer composer, int i3) {
        CryptoStakingDetailSectionComposable(uuid, modifier, cryptoStakingDetailSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoStakingDetailSectionComposable(final UUID currencyPairId, Modifier modifier, CryptoStakingDetailSectionDuxo cryptoStakingDetailSectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoStakingDetailSectionDuxo cryptoStakingDetailSectionDuxo2;
        Modifier modifier3;
        int i4;
        final Modifier modifier4;
        final CryptoStakingDetailSectionDuxo cryptoStakingDetailSectionDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1193420100);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPairId) ? 4 : 2) | i;
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
                    cryptoStakingDetailSectionDuxo2 = cryptoStakingDetailSectionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoStakingDetailSectionDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoStakingDetailSectionDuxo2 = cryptoStakingDetailSectionDuxo;
                }
                i3 |= i6;
            } else {
                cryptoStakingDetailSectionDuxo2 = cryptoStakingDetailSectionDuxo;
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoStakingDetailSectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.detail.staking.section.CryptoStakingDetailSectionComposableKt$CryptoStakingDetailSectionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.detail.staking.section.CryptoStakingDetailSectionComposableKt$CryptoStakingDetailSectionComposable$$inlined$duxo$1.1
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
                        CryptoStakingDetailSectionDuxo cryptoStakingDetailSectionDuxo4 = (CryptoStakingDetailSectionDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        modifier4 = modifier3;
                        cryptoStakingDetailSectionDuxo3 = cryptoStakingDetailSectionDuxo4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1193420100, i4, -1, "com.robinhood.android.crypto.ui.detail.staking.section.CryptoStakingDetailSectionComposable (CryptoStakingDetailSectionComposable.kt:25)");
                    }
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(cryptoStakingDetailSectionDuxo3) | composerStartRestartGroup.changedInstance(currencyPairId);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new CryptoStakingDetailSectionComposable2(cryptoStakingDetailSectionDuxo3, currencyPairId, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(currencyPairId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i4 & 14);
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingDetailSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (!CryptoStakingDetailSectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle).getComponents().isEmpty()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup2 != null) {
                            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.staking.section.CryptoStakingDetailSectionComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CryptoStakingDetailSectionComposable.CryptoStakingDetailSectionComposable$lambda$2(currencyPairId, modifier4, cryptoStakingDetailSectionDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    Screen.Name name = Screen.Name.CRYPTO_DETAIL_PAGE;
                    String string2 = currencyPairId.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name, null, string2, null, 10, null), null, null, new Component(Component.ComponentType.STAKING_SECTION, null, null, 6, null), null, 45, null), ComposableLambda3.rememberComposableLambda(1083859057, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.staking.section.CryptoStakingDetailSectionComposableKt.CryptoStakingDetailSectionComposable.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1083859057, i7, -1, "com.robinhood.android.crypto.ui.detail.staking.section.CryptoStakingDetailSectionComposable.<anonymous> (CryptoStakingDetailSectionComposable.kt:40)");
                            }
                            final Modifier modifier5 = modifier4;
                            final SnapshotState4<CryptoStakingDetailSectionViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1912347607, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.staking.section.CryptoStakingDetailSectionComposableKt.CryptoStakingDetailSectionComposable.3.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1912347607, i8, -1, "com.robinhood.android.crypto.ui.detail.staking.section.CryptoStakingDetailSectionComposable.<anonymous>.<anonymous> (CryptoStakingDetailSectionComposable.kt:41)");
                                    }
                                    Modifier modifierTestTag = TestTag3.testTag(modifier5, CryptoStakingDetailSectionComposable.CryptoStakingDetailSectionTestTag);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, true, false, false, false, false, null, 125, null);
                                    HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                    ImmutableList<UIComponent<GenericAction>> components = CryptoStakingDetailSectionComposable.CryptoStakingDetailSectionComposable$lambda$1(snapshotState4).getComponents();
                                    composer3.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(components, GenericAction.class, modifierAutoLogEvents$default, null, null, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer3, 196608, 0);
                                    composer3.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 100663296, 255);
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
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                modifier4 = modifier3;
                cryptoStakingDetailSectionDuxo3 = cryptoStakingDetailSectionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoStakingDetailSectionDuxo3) | composerStartRestartGroup.changedInstance(currencyPairId);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new CryptoStakingDetailSectionComposable2(cryptoStakingDetailSectionDuxo3, currencyPairId, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(currencyPairId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i4 & 14);
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingDetailSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (!CryptoStakingDetailSectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle).getComponents().isEmpty()) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoStakingDetailSectionDuxo3 = cryptoStakingDetailSectionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.staking.section.CryptoStakingDetailSectionComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingDetailSectionComposable.CryptoStakingDetailSectionComposable$lambda$3(currencyPairId, modifier4, cryptoStakingDetailSectionDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                    modifier4 = modifier3;
                    cryptoStakingDetailSectionDuxo3 = cryptoStakingDetailSectionDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoStakingDetailSectionDuxo3) | composerStartRestartGroup.changedInstance(currencyPairId);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoStakingDetailSectionViewState CryptoStakingDetailSectionComposable$lambda$1(SnapshotState4<CryptoStakingDetailSectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
