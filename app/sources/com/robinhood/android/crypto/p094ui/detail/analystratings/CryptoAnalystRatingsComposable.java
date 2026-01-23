package com.robinhood.android.crypto.p094ui.detail.analystratings;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
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
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingDialog;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposable;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposableState;
import com.robinhood.utils.resource.StringResource;
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

/* compiled from: CryptoAnalystRatingsComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, m3636d2 = {"CryptoAnalystRatingsComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug", "viewState", "Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsViewState;", "analystRatingDialogContent", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$AnalystRating;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.analystratings.CryptoAnalystRatingsComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoAnalystRatingsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAnalystRatingsComposable$lambda$10(Modifier modifier, CryptoAnalystRatingsDuxo cryptoAnalystRatingsDuxo, int i, int i2, Composer composer, int i3) {
        CryptoAnalystRatingsComposable(modifier, cryptoAnalystRatingsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CryptoAnalystRatingsComposable(Modifier modifier, CryptoAnalystRatingsDuxo cryptoAnalystRatingsDuxo, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final CryptoAnalystRatingsDuxo cryptoAnalystRatingsDuxo2;
        CryptoAnalystRatingsDuxo cryptoAnalystRatingsDuxo3;
        Modifier modifier3;
        SnapshotState4 snapshotState4;
        final SnapshotState snapshotState;
        int i4;
        Modifier modifier4;
        Composer composerStartRestartGroup = composer.startRestartGroup(370301440);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                cryptoAnalystRatingsDuxo2 = cryptoAnalystRatingsDuxo;
                int i6 = composerStartRestartGroup.changedInstance(cryptoAnalystRatingsDuxo2) ? 32 : 16;
                i3 |= i6;
            } else {
                cryptoAnalystRatingsDuxo2 = cryptoAnalystRatingsDuxo;
            }
            i3 |= i6;
        } else {
            cryptoAnalystRatingsDuxo2 = cryptoAnalystRatingsDuxo;
        }
        int i7 = i3;
        if ((i7 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoAnalystRatingsDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.detail.analystratings.CryptoAnalystRatingsComposableKt$CryptoAnalystRatingsComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.detail.analystratings.CryptoAnalystRatingsComposableKt$CryptoAnalystRatingsComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i7 &= -113;
                    cryptoAnalystRatingsDuxo3 = (CryptoAnalystRatingsDuxo) baseDuxo;
                } else {
                    cryptoAnalystRatingsDuxo3 = cryptoAnalystRatingsDuxo2;
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                }
                modifier3 = modifier2;
                cryptoAnalystRatingsDuxo3 = cryptoAnalystRatingsDuxo2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(370301440, i7, -1, "com.robinhood.android.crypto.ui.detail.analystratings.CryptoAnalystRatingsComposable (CryptoAnalystRatingsComposable.kt:24)");
            }
            Composer composer2 = composerStartRestartGroup;
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoAnalystRatingsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
            composerStartRestartGroup = composer2;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-622589517);
            if (CryptoAnalystRatingsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isVisible()) {
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                modifier4 = modifier3;
                snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                snapshotState = snapshotState2;
                i4 = 5004770;
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(CryptoAnalystRatingsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHeaderText(), composerStartRestartGroup, StringResource.$stable), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                AnalystRatingsComposableState state = CryptoAnalystRatingsComposable$lambda$0(snapshotState4).getState();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.analystratings.CryptoAnalystRatingsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoAnalystRatingsComposable.CryptoAnalystRatingsComposable$lambda$6$lambda$5$lambda$4(snapshotState, (AnalystRatingsComposableState.AnalystRating) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnalystRatingsComposable.AnalystRatingsComposable(state, (Function1) objRememberedValue3, null, composerStartRestartGroup, AnalystRatingsComposableState.$stable | 48, 4);
                composerStartRestartGroup.endNode();
            } else {
                snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                snapshotState = snapshotState2;
                i4 = 5004770;
                modifier4 = modifier3;
            }
            composerStartRestartGroup.endReplaceGroup();
            AnalystRatingsComposableState.AnalystRating analystRatingCryptoAnalystRatingsComposable$lambda$2 = CryptoAnalystRatingsComposable$lambda$2(snapshotState);
            if (analystRatingCryptoAnalystRatingsComposable$lambda$2 != null) {
                StringResource closeButtonText = CryptoAnalystRatingsComposable$lambda$0(snapshotState4).getCloseButtonText();
                composerStartRestartGroup.startReplaceGroup(i4);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.analystratings.CryptoAnalystRatingsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoAnalystRatingsComposable.CryptoAnalystRatingsComposable$lambda$9$lambda$8$lambda$7(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnalystRatingDialog.AnalystRatingDialog(analystRatingCryptoAnalystRatingsComposable$lambda$2, closeButtonText, (Function0) objRememberedValue4, composerStartRestartGroup, AnalystRatingsComposableState.AnalystRating.$stable | 384 | (StringResource.$stable << 3));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cryptoAnalystRatingsDuxo2 = cryptoAnalystRatingsDuxo3;
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.analystratings.CryptoAnalystRatingsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoAnalystRatingsComposable.CryptoAnalystRatingsComposable$lambda$10(modifier2, cryptoAnalystRatingsDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAnalystRatingsComposable$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState, AnalystRatingsComposableState.AnalystRating it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAnalystRatingsComposable$lambda$9$lambda$8$lambda$7(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    private static final CryptoAnalystRatingsViewState CryptoAnalystRatingsComposable$lambda$0(SnapshotState4<CryptoAnalystRatingsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final AnalystRatingsComposableState.AnalystRating CryptoAnalystRatingsComposable$lambda$2(SnapshotState<AnalystRatingsComposableState.AnalystRating> snapshotState) {
        return snapshotState.getValue();
    }
}
