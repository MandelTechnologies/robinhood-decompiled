package com.robinhood.android.crypto.pulse.feed;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemState;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposable;
import com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState;
import com.robinhood.shared.crypto.p375ui.modifiers.ModifiersKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.DeepLinkAction;
import rh_server_driven_ui.p531v1.GenericAction;

/* compiled from: CryptoPulseFeedComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\u0018\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002"}, m3636d2 = {"CryptoPulseFeedComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_PULSE_FEED_BACK_ICON_TEST_TAG", "", "getCRYPTO_PULSE_FEED_BACK_ICON_TEST_TAG$annotations", "()V", "feature-crypto-pulse_externalDebug", "viewState", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedViewState;", "expandableButtonCoordinatesAndState", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState;", "offsetX", "Landroidx/compose/ui/unit/Dp;", "offsetY", "isExpanded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPulseFeedComposable5 {
    public static final String CRYPTO_PULSE_FEED_BACK_ICON_TEST_TAG = "crypto_pulse_feed_back_icon_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseFeedComposable$lambda$34(Modifier modifier, CryptoPulseFeedDuxo cryptoPulseFeedDuxo, int i, int i2, Composer composer, int i3) {
        CryptoPulseFeedComposable(modifier, cryptoPulseFeedDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCRYPTO_PULSE_FEED_BACK_ICON_TEST_TAG$annotations() {
    }

    public static final void CryptoPulseFeedComposable(Modifier modifier, CryptoPulseFeedDuxo cryptoPulseFeedDuxo, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final CryptoPulseFeedDuxo cryptoPulseFeedDuxo2;
        CryptoPulseFeedDuxo cryptoPulseFeedDuxo3;
        Modifier modifier3;
        SnapshotState snapshotState;
        LayoutCoordinates layoutCoordinates;
        final SnapshotState snapshotState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1709388509);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
                cryptoPulseFeedDuxo2 = cryptoPulseFeedDuxo;
                int i5 = composerStartRestartGroup.changedInstance(cryptoPulseFeedDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                cryptoPulseFeedDuxo2 = cryptoPulseFeedDuxo;
            }
            i3 |= i5;
        } else {
            cryptoPulseFeedDuxo2 = cryptoPulseFeedDuxo;
        }
        int i6 = i3;
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoPulseFeedDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$CryptoPulseFeedComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$CryptoPulseFeedComposable$$inlined$duxo$1.1
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
                    i6 &= -113;
                    cryptoPulseFeedDuxo3 = (CryptoPulseFeedDuxo) baseDuxo;
                } else {
                    cryptoPulseFeedDuxo3 = cryptoPulseFeedDuxo2;
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                modifier3 = modifier2;
                cryptoPulseFeedDuxo3 = cryptoPulseFeedDuxo2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1709388509, i6, -1, "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposable (CryptoPulseFeedComposable.kt:63)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoPulseFeedDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null);
            boolean z = CryptoPulseFeedComposable$lambda$2(snapshotState3) != null;
            Color colorM6701boximpl = Color.m6701boximpl(jM6705copywmQWz5c$default);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoPulseFeedComposable5.CryptoPulseFeedComposable$lambda$33$lambda$5$lambda$4(snapshotState3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Composer composer2 = composerStartRestartGroup;
            Modifier modifier5 = modifier3;
            ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.m25229scrimGUYwDQI(modifierFillMaxSize$default2, z, colorM6701boximpl, (Function0) objRememberedValue4), CryptoPulseFeedComposable.INSTANCE.m12956getLambda$628028691$feature_crypto_pulse_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(643024376, true, new CryptoPulseFeedComposable6(snapshotState4CollectAsStateWithLifecycle, scrollStateRememberScrollState, snapshotState3), composerStartRestartGroup, 54), composer2, 805306416, 508);
            composerStartRestartGroup = composer2;
            Tuples2<LayoutCoordinates, CryptoPulseFeedItemState> tuples2CryptoPulseFeedComposable$lambda$2 = CryptoPulseFeedComposable$lambda$2(snapshotState3);
            composerStartRestartGroup.startReplaceGroup(1268322400);
            if (tuples2CryptoPulseFeedComposable$lambda$2 != null) {
                final LayoutCoordinates layoutCoordinatesComponent1 = tuples2CryptoPulseFeedComposable$lambda$2.component1();
                CryptoPulseFeedItemState cryptoPulseFeedItemStateComponent2 = tuples2CryptoPulseFeedComposable$lambda$2.component2();
                final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                int value = scrollStateRememberScrollState.getValue();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(layoutCoordinatesComponent1);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoPulseFeedComposable5.CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$8$lambda$7(density, layoutCoordinatesComponent1);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                int value2 = scrollStateRememberScrollState.getValue();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged2 = composerStartRestartGroup.changed(value2) | composerStartRestartGroup.changed(layoutCoordinatesComponent1);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoPulseFeedComposable5.m1886x175c67c7(density, layoutCoordinatesComponent1);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                final SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                float fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM((int) (layoutCoordinatesComponent1.mo7241getSizeYbymL2g() >> 32));
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoPulseFeedComposable5.m1887x6aef32cf();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState5 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue7, composerStartRestartGroup, 3072, 6);
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(density.mo5013toDpu2uoSUM((int) (layoutCoordinatesComponent1.mo7241getSizeYbymL2g() & 4294967295L)) + bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM()) * cryptoPulseFeedItemStateComponent2.getExpandableButtonTrayState().getButtons().size());
                float fM21596getXxlargeD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i7).m21596getXxlargeD9Ej5fM();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChanged3 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changedInstance(layoutCoordinatesComponent1) | composerStartRestartGroup.changed(fM7995constructorimpl) | composerStartRestartGroup.changed(fM21596getXxlargeD9Ej5fM) | composerStartRestartGroup.changed(scrollStateRememberScrollState) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(snapshotState5);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue8 == companion.getEmpty()) {
                    snapshotState = snapshotState5;
                    objRememberedValue8 = new CryptoPulseFeedComposable8(density, fM7995constructorimpl, fM21596getXxlargeD9Ej5fM, scrollStateRememberScrollState, coroutineScope, layoutCoordinatesComponent1, snapshotState, null);
                    layoutCoordinates = layoutCoordinatesComponent1;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    snapshotState = snapshotState5;
                    layoutCoordinates = layoutCoordinatesComponent1;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(layoutCoordinates, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged4 = composerStartRestartGroup.changed(snapshotState4) | composerStartRestartGroup.changed(snapshotState42);
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function1() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoPulseFeedComposable5.m1888x1f0e0d45(snapshotState4, snapshotState42, (Density) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(OffsetKt.offset(companion3, (Function1) objRememberedValue9), fMo5013toDpu2uoSUM);
                ExpandableButtonTrayState<Unit> expandableButtonTrayState = cryptoPulseFeedItemStateComponent2.getExpandableButtonTrayState();
                boolean zCryptoPulseFeedComposable$lambda$33$lambda$32$lambda$17 = CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$17(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue10 == companion.getEmpty()) {
                    snapshotState2 = snapshotState3;
                    objRememberedValue10 = new Function2() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Boolean.valueOf(CryptoPulseFeedComposable5.m1889xddbc258b(navigator, context, snapshotState2, (ExpandableButtonTrayState.ActionButton) obj, (GenericAction) obj2));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    snapshotState2 = snapshotState3;
                }
                Function2 function2 = (Function2) objRememberedValue10;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new Function2() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoPulseFeedComposable5.m1890x7858b0f((ExpandableButtonTrayState.ActionButton) obj, (Unit) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                Function2 function22 = (Function2) objRememberedValue11;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == companion.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                Function0 function0 = (Function0) objRememberedValue12;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == companion.getEmpty()) {
                    objRememberedValue13 = new Function0() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoPulseFeedComposable5.m1892x91db0001(snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                composerStartRestartGroup.endReplaceGroup();
                CryptoExpandableButtonTrayComposable.CryptoExpandableButtonTrayComposable(expandableButtonTrayState, zCryptoPulseFeedComposable$lambda$33$lambda$32$lambda$17, function2, function22, function0, (Function0) objRememberedValue13, modifierM5174width3ABfNKs, null, true, true, null, composerStartRestartGroup, ExpandableButtonTrayState.$stable | 906193920, 0, 1152);
                composerStartRestartGroup = composerStartRestartGroup;
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
            cryptoPulseFeedDuxo2 = cryptoPulseFeedDuxo3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPulseFeedComposable5.CryptoPulseFeedComposable$lambda$34(modifier2, cryptoPulseFeedDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoPulseFeedViewState CryptoPulseFeedComposable$lambda$0(SnapshotState4<CryptoPulseFeedViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Tuples2<LayoutCoordinates, CryptoPulseFeedItemState> CryptoPulseFeedComposable$lambda$2(SnapshotState<Tuples2<LayoutCoordinates, CryptoPulseFeedItemState>> snapshotState) {
        return snapshotState.getValue();
    }

    private static final float CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$13(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final boolean CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$17(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$9(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseFeedComposable$lambda$33$lambda$5$lambda$4(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$8$lambda$7(Density density, LayoutCoordinates layoutCoordinates) {
        return C2002Dp.m7993boximpl(density.mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (LayoutCoordinates2.positionInRoot(layoutCoordinates) >> 32))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$12$lambda$11 */
    public static final C2002Dp m1886x175c67c7(Density density, LayoutCoordinates layoutCoordinates) {
        return C2002Dp.m7993boximpl(density.mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (LayoutCoordinates2.positionInRoot(layoutCoordinates) & 4294967295L))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$16$lambda$15 */
    public static final SnapshotState m1887x6aef32cf() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$18(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$22$lambda$21 */
    public static final IntOffset m1888x1f0e0d45(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((offset.mo5010roundToPx0680j_4(CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$13(snapshotState42)) & 4294967295L) | (offset.mo5010roundToPx0680j_4(CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$9(snapshotState4)) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$27$lambda$26 */
    public static final Unit m1890x7858b0f(ExpandableButtonTrayState.ActionButton actionButton, Unit unit) {
        Intrinsics.checkNotNullParameter(actionButton, "<unused var>");
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$25$lambda$24 */
    public static final boolean m1889xddbc258b(Navigator navigator, Context context, SnapshotState snapshotState, ExpandableButtonTrayState.ActionButton actionButton, GenericAction action) {
        Intrinsics.checkNotNullParameter(actionButton, "<unused var>");
        Intrinsics.checkNotNullParameter(action, "action");
        DeepLinkAction deeplink = action.getDeeplink();
        if (deeplink != null) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(deeplink.getUrl()), null, null, false, NavigationType.PRESENT, 28, null);
        }
        snapshotState.setValue(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$31$lambda$30 */
    public static final Unit m1892x91db0001(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
