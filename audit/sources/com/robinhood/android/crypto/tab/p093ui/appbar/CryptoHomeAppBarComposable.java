package com.robinhood.android.crypto.tab.p093ui.appbar;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.assethomes.AssetHomeTopAppBar;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.tab.p093ui.appbar.CryptoHomeAppBarComposable;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.appbar.InboxIconButton4;
import com.robinhood.compose.common.appbar.SearchIconButton3;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
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

/* compiled from: CryptoHomeAppBarComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a)\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, m3636d2 = {"CryptoHomeAppBarSearchTestTag", "", "getCryptoHomeAppBarSearchTestTag$annotations", "()V", "getCryptoHomeAppBarSearchTestTag", "()Ljava/lang/String;", "CryptoHomeAppBarInboxTestTag", "getCryptoHomeAppBarInboxTestTag$annotations", "getCryptoHomeAppBarInboxTestTag", "CryptoHomeAppBarComposable", "", "titleContentsAlpha", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarDuxo;", "(FLandroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-tab_externalDebug", "viewState", "Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeAppBarComposable {
    private static final String CryptoHomeAppBarInboxTestTag = "cryptoHomeAppBarInbox";
    private static final String CryptoHomeAppBarSearchTestTag = "cryptoHomeAppBarSearch";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeAppBarComposable$lambda$1(float f, Modifier modifier, CryptoHomeAppBarDuxo cryptoHomeAppBarDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeAppBarComposable(f, modifier, cryptoHomeAppBarDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCryptoHomeAppBarInboxTestTag$annotations() {
    }

    public static /* synthetic */ void getCryptoHomeAppBarSearchTestTag$annotations() {
    }

    public static final String getCryptoHomeAppBarSearchTestTag() {
        return CryptoHomeAppBarSearchTestTag;
    }

    public static final String getCryptoHomeAppBarInboxTestTag() {
        return CryptoHomeAppBarInboxTestTag;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHomeAppBarComposable(final float f, Modifier modifier, CryptoHomeAppBarDuxo cryptoHomeAppBarDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoHomeAppBarDuxo cryptoHomeAppBarDuxo2;
        Modifier modifier3;
        int i4;
        CryptoHomeAppBarDuxo cryptoHomeAppBarDuxo3;
        final CryptoHomeAppBarDuxo cryptoHomeAppBarDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-797879243);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
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
                    cryptoHomeAppBarDuxo2 = cryptoHomeAppBarDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoHomeAppBarDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoHomeAppBarDuxo2 = cryptoHomeAppBarDuxo;
                }
                i3 |= i6;
            } else {
                cryptoHomeAppBarDuxo2 = cryptoHomeAppBarDuxo;
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeAppBarDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposableKt$CryptoHomeAppBarComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposableKt$CryptoHomeAppBarComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-897);
                        cryptoHomeAppBarDuxo3 = (CryptoHomeAppBarDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-797879243, i4, -1, "com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposable (CryptoHomeAppBarComposable.kt:35)");
                        }
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeAppBarDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        Modifier modifier5 = modifier3;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1285443298, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposableKt.CryptoHomeAppBarComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                SnapshotState4<CryptoHomeAppBarViewState> snapshotState4;
                                Modifier.Companion companion;
                                float f2;
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1285443298, i7, -1, "com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposable.<anonymous> (CryptoHomeAppBarComposable.kt:40)");
                                }
                                float f3 = f;
                                SnapshotState4<CryptoHomeAppBarViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                String accountValue = CryptoHomeAppBarComposable.CryptoHomeAppBarComposable$lambda$0(snapshotState42).getAccountValue();
                                composer2.startReplaceGroup(1471989881);
                                if (accountValue == null) {
                                    f2 = f3;
                                    snapshotState4 = snapshotState42;
                                    companion = companion2;
                                } else {
                                    snapshotState4 = snapshotState42;
                                    companion = companion2;
                                    f2 = f3;
                                    BentoText2.m20747BentoText38GnDrw(accountValue, Alpha.alpha(companion2, f3), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer2, 0, 0, 8188);
                                }
                                composer2.endReplaceGroup();
                                Modifier modifierAlpha = Alpha.alpha(companion, f2);
                                String strStringResource = StringResources_androidKt.stringResource(CryptoHomeAppBarComposable.CryptoHomeAppBarComposable$lambda$0(snapshotState4).getTitle(), composer2, 0);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierAlpha, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8184);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), modifier5, null, ComposableLambda3.rememberComposableLambda(-142260649, true, new C130562(snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composerStartRestartGroup, (i4 & 112) | 3078, 0, 2036);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        cryptoHomeAppBarDuxo4 = cryptoHomeAppBarDuxo3;
                        modifier4 = modifier5;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                cryptoHomeAppBarDuxo3 = cryptoHomeAppBarDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<CryptoHomeAppBarViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeAppBarDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Modifier modifier52 = modifier3;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1285443298, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposableKt.CryptoHomeAppBarComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        SnapshotState4<CryptoHomeAppBarViewState> snapshotState4;
                        Modifier.Companion companion;
                        float f2;
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1285443298, i7, -1, "com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposable.<anonymous> (CryptoHomeAppBarComposable.kt:40)");
                        }
                        float f3 = f;
                        SnapshotState4<CryptoHomeAppBarViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle2;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        String accountValue = CryptoHomeAppBarComposable.CryptoHomeAppBarComposable$lambda$0(snapshotState42).getAccountValue();
                        composer2.startReplaceGroup(1471989881);
                        if (accountValue == null) {
                            f2 = f3;
                            snapshotState4 = snapshotState42;
                            companion = companion2;
                        } else {
                            snapshotState4 = snapshotState42;
                            companion = companion2;
                            f2 = f3;
                            BentoText2.m20747BentoText38GnDrw(accountValue, Alpha.alpha(companion2, f3), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer2, 0, 0, 8188);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierAlpha = Alpha.alpha(companion, f2);
                        String strStringResource = StringResources_androidKt.stringResource(CryptoHomeAppBarComposable.CryptoHomeAppBarComposable$lambda$0(snapshotState4).getTitle(), composer2, 0);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierAlpha, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8184);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifier52, null, ComposableLambda3.rememberComposableLambda(-142260649, true, new C130562(snapshotState4CollectAsStateWithLifecycle2), composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composerStartRestartGroup, (i4 & 112) | 3078, 0, 2036);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoHomeAppBarDuxo4 = cryptoHomeAppBarDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoHomeAppBarDuxo4 = cryptoHomeAppBarDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoHomeAppBarComposable.CryptoHomeAppBarComposable$lambda$1(f, modifier4, cryptoHomeAppBarDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoHomeAppBarComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposableKt$CryptoHomeAppBarComposable$2 */
    static final class C130562 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<CryptoHomeAppBarViewState> $viewState$delegate;

        C130562(SnapshotState4<CryptoHomeAppBarViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new SearchFragmentKey(null, null, null, SearchFragmentKey.Source.CRYPTO, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-142260649, i, -1, "com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposable.<anonymous> (CryptoHomeAppBarComposable.kt:57)");
            }
            final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
            composer.startReplaceGroup(726474323);
            if (CryptoHomeAppBarComposable.CryptoHomeAppBarComposable$lambda$0(this.$viewState$delegate).isSearchVisible()) {
                Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.VIEW_SEARCH, null, new Component(Component.ComponentType.BUTTON, AssetHomeTopAppBar.SEARCH_IDENTIFIER, null, 4, null), null, 43, null), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), CryptoHomeAppBarComposable.getCryptoHomeAppBarSearchTestTag());
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposableKt$CryptoHomeAppBarComposable$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeAppBarComposable.C130562.invoke$lambda$1$lambda$0(navigator, context);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                SearchIconButton3.SearchIconButton((Function0) objRememberedValue, modifierTestTag, composer, 0, 0);
            }
            composer.endReplaceGroup();
            if (CryptoHomeAppBarComposable.CryptoHomeAppBarComposable$lambda$0(this.$viewState$delegate).isInboxVisible()) {
                Modifier modifierTestTag2 = TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.VIEW_INBOX, null, new Component(Component.ComponentType.BUTTON, "top_nav-inbox", null, 4, null), null, 43, null), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), CryptoHomeAppBarComposable.getCryptoHomeAppBarInboxTestTag());
                boolean zIsInboxBadgeVisible = CryptoHomeAppBarComposable.CryptoHomeAppBarComposable$lambda$0(this.$viewState$delegate).isInboxBadgeVisible();
                boolean zIsInboxBadgeCritical = CryptoHomeAppBarComposable.CryptoHomeAppBarComposable$lambda$0(this.$viewState$delegate).isInboxBadgeCritical();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(navigator) | composer.changedInstance(context);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarComposableKt$CryptoHomeAppBarComposable$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeAppBarComposable.C130562.invoke$lambda$3$lambda$2(navigator, context);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                InboxIconButton4.InboxIconButton(zIsInboxBadgeVisible, zIsInboxBadgeCritical, (Function0) objRememberedValue2, modifierTestTag2, composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Navigator navigator, Context context) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, LegacyFragmentKey.InboxThreadList.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoHomeAppBarViewState CryptoHomeAppBarComposable$lambda$0(SnapshotState4<CryptoHomeAppBarViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
