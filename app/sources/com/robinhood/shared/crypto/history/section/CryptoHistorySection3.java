package com.robinhood.shared.crypto.history.section;

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
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.common.history.p082ui.section.HistorySection4;
import com.robinhood.android.common.history.p082ui.section.HistorySectionState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.shared.crypto.history.section.CryptoHistorySectionDuxo;
import com.robinhood.shared.history.contracts.AllHistoryFragmentKey;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CryptoHistorySection.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"CryptoHistorySection", "", "initArgs", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionDuxo$Args;", "modifier", "Landroidx/compose/ui/Modifier;", "hideFooterBelowDisplayCount", "", "duxo", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionDuxo;", "(Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionDuxo$Args;Landroidx/compose/ui/Modifier;ZLcom/robinhood/shared/crypto/history/section/CryptoHistorySectionDuxo;Landroidx/compose/runtime/Composer;II)V", "CryptoHistoryFooter", "historyState", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState;", "(Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState;Landroidx/compose/runtime/Composer;I)V", "lib-history-section_externalDebug", "viewState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.history.section.CryptoHistorySectionKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoHistorySection3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHistoryFooter$lambda$2(CryptoHistorySectionState cryptoHistorySectionState, int i, Composer composer, int i2) {
        CryptoHistoryFooter(cryptoHistorySectionState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHistorySection$lambda$1(CryptoHistorySectionDuxo.Args args, Modifier modifier, boolean z, CryptoHistorySectionDuxo cryptoHistorySectionDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHistorySection(args, modifier, z, cryptoHistorySectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHistorySection(final CryptoHistorySectionDuxo.Args initArgs, Modifier modifier, boolean z, CryptoHistorySectionDuxo cryptoHistorySectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        CryptoHistorySectionDuxo cryptoHistorySectionDuxo2;
        Modifier modifier3;
        Composer composer2;
        final CryptoHistorySectionDuxo cryptoHistorySectionDuxo3;
        boolean z3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final Modifier modifier4;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(initArgs, "initArgs");
        Composer composerStartRestartGroup = composer.startRestartGroup(225228992);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(initArgs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        cryptoHistorySectionDuxo2 = cryptoHistorySectionDuxo;
                        int i6 = composerStartRestartGroup.changedInstance(cryptoHistorySectionDuxo2) ? 2048 : 1024;
                        i3 |= i6;
                    } else {
                        cryptoHistorySectionDuxo2 = cryptoHistorySectionDuxo;
                    }
                    i3 |= i6;
                } else {
                    cryptoHistorySectionDuxo2 = cryptoHistorySectionDuxo;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z5 = i4 == 0 ? false : z2;
                        if ((i2 & 8) == 0) {
                            composerStartRestartGroup.startReplaceGroup(2050738472);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            composer2 = composerStartRestartGroup;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHistorySectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.history.section.CryptoHistorySectionKt$CryptoHistorySection$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.history.section.CryptoHistorySectionKt$CryptoHistorySection$$inlined$duxo$1.1
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
                            cryptoHistorySectionDuxo3 = (CryptoHistorySectionDuxo) baseDuxo;
                            i3 &= -7169;
                        } else {
                            composer2 = composerStartRestartGroup;
                            cryptoHistorySectionDuxo3 = cryptoHistorySectionDuxo2;
                        }
                        z3 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier2;
                        z3 = z2;
                        cryptoHistorySectionDuxo3 = cryptoHistorySectionDuxo2;
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(225228992, i3, -1, "com.robinhood.shared.crypto.history.section.CryptoHistorySection (CryptoHistorySection.kt:22)");
                    }
                    Composer composer4 = composer2;
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHistorySectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    Modifier modifier5 = modifier3;
                    HistorySection4.HistorySection(new HistorySectionState(CryptoHistorySection$lambda$0(snapshotState4CollectAsStateWithLifecycle).getState(), CryptoHistorySection$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTransactionTypes(), null, null, CryptoHistorySection$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHistoryStaticFilter(), 0, z3, 44, null), modifier5, CryptoHistorySection.INSTANCE.getLambda$1382321664$lib_history_section_externalDebug(), ComposableLambda3.rememberComposableLambda(1392092225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.section.CryptoHistorySectionKt.CryptoHistorySection.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i7) {
                            if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1392092225, i7, -1, "com.robinhood.shared.crypto.history.section.CryptoHistorySection.<anonymous> (CryptoHistorySection.kt:36)");
                            }
                            CryptoHistorySection3.CryptoHistoryFooter(CryptoHistorySection3.CryptoHistorySection$lambda$0(snapshotState4CollectAsStateWithLifecycle), composer5, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer4, 54), true, false, false, true, null, composer4, 12807552 | HistorySectionState.$stable | (i3 & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
                    composer3 = composer4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    z4 = z3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    z4 = z2;
                    cryptoHistorySectionDuxo3 = cryptoHistorySectionDuxo2;
                    composer3 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.history.section.CryptoHistorySectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoHistorySection3.CryptoHistorySection$lambda$1(initArgs, modifier4, z4, cryptoHistorySectionDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) != 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    z3 = z5;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Composer composer42 = composer2;
                    final SnapshotState4<? extends CryptoHistorySectionState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoHistorySectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                    Modifier modifier52 = modifier3;
                    HistorySection4.HistorySection(new HistorySectionState(CryptoHistorySection$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getState(), CryptoHistorySection$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getTransactionTypes(), null, null, CryptoHistorySection$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getHistoryStaticFilter(), 0, z3, 44, null), modifier52, CryptoHistorySection.INSTANCE.getLambda$1382321664$lib_history_section_externalDebug(), ComposableLambda3.rememberComposableLambda(1392092225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.section.CryptoHistorySectionKt.CryptoHistorySection.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i7) {
                            if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1392092225, i7, -1, "com.robinhood.shared.crypto.history.section.CryptoHistorySection.<anonymous> (CryptoHistorySection.kt:36)");
                            }
                            CryptoHistorySection3.CryptoHistoryFooter(CryptoHistorySection3.CryptoHistorySection$lambda$0(snapshotState4CollectAsStateWithLifecycle2), composer5, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer42, 54), true, false, false, true, null, composer42, 12807552 | HistorySectionState.$stable | (i3 & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
                    composer3 = composer42;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    z4 = z3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void CryptoHistoryFooter(final CryptoHistorySectionState historyState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(historyState, "historyState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1982331925);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(historyState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1982331925, i2, -1, "com.robinhood.shared.crypto.history.section.CryptoHistoryFooter (CryptoHistorySection.kt:49)");
            }
            HistoryRowsKt.DefaultHistoryFooter(null, StringResources_androidKt.stringResource(C37708R.string.crypto_detail_show_more_label, composerStartRestartGroup, 0), new AllHistoryFragmentKey(historyState.getFilterTypes(), historyState.getTransactionTypes(), null, historyState.getHistoryStaticFilter(), true, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, null), composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.history.section.CryptoHistorySectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHistorySection3.CryptoHistoryFooter$lambda$2(historyState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoHistorySectionState CryptoHistorySection$lambda$0(SnapshotState4<? extends CryptoHistorySectionState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
