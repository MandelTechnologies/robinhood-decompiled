package com.robinhood.shared.crypto.movers;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.ApiCryptoTradingOptions3;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.shared.crypto.movers.CryptoDailyMoversComposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Job;

/* compiled from: CryptoDailyMoversComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, m3636d2 = {"CryptoDailyMoversComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "location", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;", "cdpDeeplinkTabOverride", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "duxo", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;Lcom/robinhood/android/navigation/keys/FragmentTab;Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDuxo;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_DAILY_MOVERS_TITLE_INFO_ICON_TEST_TAG", "", "CRYPTO_DAILY_MOVERS_BOTTOM_SHEET_TEST_TAG", "lib-crypto-movers_externalDebug", "shouldShowDailyMoversBottomSheet", "", "viewState", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoDailyMoversComposable {
    public static final String CRYPTO_DAILY_MOVERS_BOTTOM_SHEET_TEST_TAG = "crypto_daily_movers_bottom_sheet_test_tag";
    public static final String CRYPTO_DAILY_MOVERS_TITLE_INFO_ICON_TEST_TAG = "crypto_daily_movers_title_info_icon_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDailyMoversComposable$lambda$10(Modifier modifier, CryptoTradingOptionsLocation cryptoTradingOptionsLocation, FragmentTab fragmentTab, CryptoDailyMoversDuxo cryptoDailyMoversDuxo, int i, int i2, Composer composer, int i3) {
        CryptoDailyMoversComposable(modifier, cryptoTradingOptionsLocation, fragmentTab, cryptoDailyMoversDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CryptoDailyMoversComposable(Modifier modifier, CryptoTradingOptionsLocation cryptoTradingOptionsLocation, FragmentTab fragmentTab, CryptoDailyMoversDuxo cryptoDailyMoversDuxo, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        CryptoDailyMoversDuxo cryptoDailyMoversDuxo2;
        Modifier modifier3;
        final CryptoTradingOptionsLocation cryptoTradingOptionsLocation2;
        boolean z;
        int i4;
        final CryptoDailyMoversDuxo cryptoDailyMoversDuxo3;
        final FragmentTab fragmentTab2;
        final Modifier modifier4;
        final CryptoTradingOptionsLocation cryptoTradingOptionsLocation3;
        final FragmentTab fragmentTab3;
        final CryptoDailyMoversDuxo cryptoDailyMoversDuxo4;
        Composer composerStartRestartGroup = composer.startRestartGroup(2060895672);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(cryptoTradingOptionsLocation == null ? -1 : cryptoTradingOptionsLocation.ordinal()) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(fragmentTab == null ? -1 : fragmentTab.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                cryptoDailyMoversDuxo2 = cryptoDailyMoversDuxo;
                int i8 = composerStartRestartGroup.changedInstance(cryptoDailyMoversDuxo2) ? 2048 : 1024;
                i3 |= i8;
            } else {
                cryptoDailyMoversDuxo2 = cryptoDailyMoversDuxo;
            }
            i3 |= i8;
        } else {
            cryptoDailyMoversDuxo2 = cryptoDailyMoversDuxo;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            cryptoTradingOptionsLocation3 = cryptoTradingOptionsLocation;
            modifier4 = modifier2;
            cryptoDailyMoversDuxo4 = cryptoDailyMoversDuxo2;
            fragmentTab3 = fragmentTab;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                cryptoTradingOptionsLocation2 = i6 != 0 ? CryptoTradingOptionsLocation.DAILY_MOVERS : cryptoTradingOptionsLocation;
                FragmentTab fragmentTab4 = i7 != 0 ? null : fragmentTab;
                if ((i2 & 8) != 0) {
                    String serverValue = cryptoTradingOptionsLocation2.getServerValue();
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    z = false;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoDailyMoversDuxo.class), current, serverValue, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$$inlined$duxo$1.1
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
                    cryptoDailyMoversDuxo3 = (CryptoDailyMoversDuxo) baseDuxo;
                    i4 = i3 & (-7169);
                } else {
                    z = false;
                    i4 = i3;
                    cryptoDailyMoversDuxo3 = cryptoDailyMoversDuxo2;
                }
                fragmentTab2 = fragmentTab4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                modifier3 = modifier2;
                i4 = i3;
                z = false;
                cryptoTradingOptionsLocation2 = cryptoTradingOptionsLocation;
                fragmentTab2 = fragmentTab;
                cryptoDailyMoversDuxo3 = cryptoDailyMoversDuxo2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2060895672, i4, -1, "com.robinhood.shared.crypto.movers.CryptoDailyMoversComposable (CryptoDailyMoversComposable.kt:49)");
            }
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(cryptoDailyMoversDuxo3) | ((i4 & 112) == 32 ? true : z);
            if ((i4 & 896) == 256) {
                z = true;
            }
            boolean z2 = z | zChangedInstance2;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoDailyMoversComposable.CryptoDailyMoversComposable$lambda$2$lambda$1(cryptoDailyMoversDuxo3, cryptoTradingOptionsLocation2, fragmentTab2, (LifecycleResumePauseEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            LifecycleEffectKt.LifecycleResumeEffect(unit, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue2, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            Composer composer2 = composerStartRestartGroup;
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoDailyMoversDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
            String disclosure = CryptoDailyMoversComposable$lambda$6(snapshotState4CollectAsStateWithLifecycle).getDisclosure();
            boolean z3 = !CryptoDailyMoversComposable$lambda$6(snapshotState4CollectAsStateWithLifecycle).getHideEverything();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1564944240, true, new C377332(modifier3, cryptoTradingOptionsLocation2, disclosure, snapshotState4CollectAsStateWithLifecycle, snapshotState), composer2, 54);
            CryptoDailyMoversDuxo cryptoDailyMoversDuxo5 = cryptoDailyMoversDuxo3;
            Modifier modifier5 = modifier3;
            AnimatedVisibilityKt.AnimatedVisibility(z3, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, composableLambdaRememberComposableLambda, composer2, 196608, 30);
            composerStartRestartGroup = composer2;
            final CryptoHomeDailyMoversBottomSheetState dailyMoversBottomSheetState = CryptoDailyMoversComposable$lambda$6(snapshotState4CollectAsStateWithLifecycle).getDailyMoversBottomSheetState();
            if (dailyMoversBottomSheetState != null) {
                composerStartRestartGroup.startReplaceGroup(540971874);
                if (CryptoDailyMoversComposable$lambda$4(snapshotState)) {
                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, CRYPTO_DAILY_MOVERS_BOTTOM_SHEET_TEST_TAG);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoDailyMoversComposable.CryptoDailyMoversComposable$lambda$9$lambda$8$lambda$7(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, modifierTestTag, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1293951665, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$3$2

                        /* compiled from: CryptoDailyMoversComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$3$2$1 */
                        static final class C377351 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ CryptoHomeDailyMoversBottomSheetState $bottomSheetState;
                            final /* synthetic */ SnapshotState<Boolean> $shouldShowDailyMoversBottomSheet$delegate;

                            C377351(CryptoHomeDailyMoversBottomSheetState cryptoHomeDailyMoversBottomSheetState, SnapshotState<Boolean> snapshotState) {
                                this.$bottomSheetState = cryptoHomeDailyMoversBottomSheetState;
                                this.$shouldShowDailyMoversBottomSheet$delegate = snapshotState;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1434734855, i, -1, "com.robinhood.shared.crypto.movers.CryptoDailyMoversComposable.<anonymous>.<anonymous>.<anonymous> (CryptoDailyMoversComposable.kt:154)");
                                }
                                CryptoHomeDailyMoversBottomSheetState cryptoHomeDailyMoversBottomSheetState = this.$bottomSheetState;
                                composer.startReplaceGroup(5004770);
                                final SnapshotState<Boolean> snapshotState = this.$shouldShowDailyMoversBottomSheet$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0037: CONSTRUCTOR (r0v4 'objRememberedValue' java.lang.Object) = (r11v2 'snapshotState' androidx.compose.runtime.MutableState<java.lang.Boolean> A[DONT_INLINE]) A[MD:(androidx.compose.runtime.MutableState):void (m)] (LINE:157) call: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$3$2$1$$ExternalSyntheticLambda0.<init>(androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$3$2.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes6.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$3$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 25 more
                                        */
                                    /*
                                        this = this;
                                        r0 = r11 & 3
                                        r1 = 2
                                        if (r0 != r1) goto L10
                                        boolean r0 = r10.getSkipping()
                                        if (r0 != 0) goto Lc
                                        goto L10
                                    Lc:
                                        r10.skipToGroupEnd()
                                        return
                                    L10:
                                        boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r0 == 0) goto L1f
                                        r0 = -1
                                        java.lang.String r1 = "com.robinhood.shared.crypto.movers.CryptoDailyMoversComposable.<anonymous>.<anonymous>.<anonymous> (CryptoDailyMoversComposable.kt:154)"
                                        r2 = 1434734855(0x55845107, float:1.81854431E13)
                                        androidx.compose.runtime.ComposerKt.traceEventStart(r2, r11, r0, r1)
                                    L1f:
                                        com.robinhood.shared.crypto.movers.CryptoHomeDailyMoversBottomSheetState r3 = r9.$bottomSheetState
                                        r11 = 5004770(0x4c5de2, float:7.013177E-39)
                                        r10.startReplaceGroup(r11)
                                        androidx.compose.runtime.MutableState<java.lang.Boolean> r11 = r9.$shouldShowDailyMoversBottomSheet$delegate
                                        java.lang.Object r0 = r10.rememberedValue()
                                        androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                                        java.lang.Object r1 = r1.getEmpty()
                                        if (r0 != r1) goto L3d
                                        com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$3$2$1$$ExternalSyntheticLambda0 r0 = new com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$3$2$1$$ExternalSyntheticLambda0
                                        r0.<init>(r11)
                                        r10.updateRememberedValue(r0)
                                    L3d:
                                        r4 = r0
                                        kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
                                        r10.endReplaceGroup()
                                        r7 = 48
                                        r8 = 4
                                        r5 = 0
                                        r6 = r10
                                        com.robinhood.shared.crypto.movers.CryptoDailyMoversBottomSheet.CryptoHomeDailyMoversBottomSheet(r3, r4, r5, r6, r7, r8)
                                        boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r10 == 0) goto L54
                                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                                    L54:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposable3.C377351.invoke(androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                                    CryptoDailyMoversComposable.CryptoDailyMoversComposable$lambda$5(snapshotState, false);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer3, Integer num) {
                                invoke(rhModalBottomSheet5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer3, int i9) {
                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                if ((i9 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1293951665, i9, -1, "com.robinhood.shared.crypto.movers.CryptoDailyMoversComposable.<anonymous>.<anonymous> (CryptoDailyMoversComposable.kt:153)");
                                }
                                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1434734855, true, new C377351(dailyMoversBottomSheetState, snapshotState), composer3, 54), composer3, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572918, 60);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
                cryptoTradingOptionsLocation3 = cryptoTradingOptionsLocation2;
                fragmentTab3 = fragmentTab2;
                cryptoDailyMoversDuxo4 = cryptoDailyMoversDuxo5;
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoDailyMoversComposable.CryptoDailyMoversComposable$lambda$10(modifier4, cryptoTradingOptionsLocation3, fragmentTab3, cryptoDailyMoversDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LifecyclePauseOrDisposeEffectResult CryptoDailyMoversComposable$lambda$2$lambda$1(CryptoDailyMoversDuxo cryptoDailyMoversDuxo, CryptoTradingOptionsLocation cryptoTradingOptionsLocation, FragmentTab fragmentTab, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
            Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
            final Job jobBind = cryptoDailyMoversDuxo.bind(cryptoTradingOptionsLocation, fragmentTab);
            return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
                @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
                public void runPauseOrOnDisposeEffect() {
                    Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void CryptoDailyMoversComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* compiled from: CryptoDailyMoversComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$2 */
        static final class C377332 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
            final /* synthetic */ String $disclosure;
            final /* synthetic */ CryptoTradingOptionsLocation $location;
            final /* synthetic */ Modifier $modifier;
            final /* synthetic */ SnapshotState<Boolean> $shouldShowDailyMoversBottomSheet$delegate;
            final /* synthetic */ SnapshotState4<CryptoDailyMoversViewState> $viewState$delegate;

            C377332(Modifier modifier, CryptoTradingOptionsLocation cryptoTradingOptionsLocation, String str, SnapshotState4<CryptoDailyMoversViewState> snapshotState4, SnapshotState<Boolean> snapshotState) {
                this.$modifier = modifier;
                this.$location = cryptoTradingOptionsLocation;
                this.$disclosure = str;
                this.$viewState$delegate = snapshotState4;
                this.$shouldShowDailyMoversBottomSheet$delegate = snapshotState;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                invoke(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                String str;
                SnapshotState4<CryptoDailyMoversViewState> snapshotState4;
                int i2;
                CryptoTradingOptionsLocation cryptoTradingOptionsLocation;
                Modifier.Companion companion;
                BentoTheme bentoTheme;
                CryptoTradingOptionsLocation cryptoTradingOptionsLocation2;
                int i3;
                Composer composer2;
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1564944240, i, -1, "com.robinhood.shared.crypto.movers.CryptoDailyMoversComposable.<anonymous> (CryptoDailyMoversComposable.kt:60)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null);
                CryptoTradingOptionsLocation cryptoTradingOptionsLocation3 = this.$location;
                String str2 = this.$disclosure;
                final SnapshotState4<CryptoDailyMoversViewState> snapshotState42 = this.$viewState$delegate;
                final SnapshotState<Boolean> snapshotState = this.$shouldShowDailyMoversBottomSheet$delegate;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierHeight = Intrinsic3.height(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null), Intrinsic4.Max);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), companion2.getCenterVertically(), composer, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierHeight);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                final Row6 row6 = Row6.INSTANCE;
                LocalShowPlaceholder.Loadable(CryptoDailyMoversComposable.CryptoDailyMoversComposable$lambda$6(snapshotState42).getTitle() == null, null, null, ComposableLambda3.rememberComposableLambda(-970640006, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$2$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-970640006, i5, -1, "com.robinhood.shared.crypto.movers.CryptoDailyMoversComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDailyMoversComposable.kt:69)");
                        }
                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(row6.weight(Modifier.INSTANCE, 1.0f, false), 0.0f, 1, null);
                        String title = CryptoDailyMoversComposable.CryptoDailyMoversComposable$lambda$6(snapshotState42).getTitle();
                        if (title == null) {
                            title = "----------------";
                        }
                        BentoText2.m20747BentoText38GnDrw(title, modifierFillMaxHeight$default, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 3072, 6);
                Composer composer3 = composer;
                composer3.startReplaceGroup(170235923);
                if (CryptoDailyMoversComposable.CryptoDailyMoversComposable$lambda$6(snapshotState42).getDailyMoversBottomSheetState() != null) {
                    Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), CryptoDailyMoversComposable.CRYPTO_DAILY_MOVERS_TITLE_INFO_ICON_TEST_TAG);
                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                    long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer3, i4).m21426getFg20d7_KjU();
                    composer3.startReplaceGroup(5004770);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoDailyMoversComposable.C377332.invoke$lambda$7$lambda$2$lambda$1$lambda$0(snapshotState);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    snapshotState4 = snapshotState42;
                    str = str2;
                    BentoIcon2.m20644BentoIconFU0evQE(size24, "", jM21426getFg20d7_KjU, modifierTestTag, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 27696, 32);
                    composer3 = composer;
                } else {
                    str = str2;
                    snapshotState4 = snapshotState42;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                composer3.startReplaceGroup(-326767367);
                CryptoTradingOptionsLocation cryptoTradingOptionsLocation4 = CryptoTradingOptionsLocation.TRENDING;
                if (cryptoTradingOptionsLocation3 != cryptoTradingOptionsLocation4) {
                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer3, i4).m21593getSmallD9Ej5fM());
                    i2 = 0;
                    Spacer2.Spacer(modifierM5156height3ABfNKs, composer3, 0);
                } else {
                    i2 = 0;
                }
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(-326761856);
                if (cryptoTradingOptionsLocation3 != cryptoTradingOptionsLocation4 || str == null || str.length() == 0) {
                    cryptoTradingOptionsLocation = cryptoTradingOptionsLocation4;
                    companion = companion4;
                    bentoTheme = bentoTheme2;
                    cryptoTradingOptionsLocation2 = cryptoTradingOptionsLocation3;
                    i3 = i4;
                    composer2 = composer3;
                } else {
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer3, i4).m21593getSmallD9Ej5fM()), composer3, i2);
                    cryptoTradingOptionsLocation2 = cryptoTradingOptionsLocation3;
                    String str3 = str;
                    i3 = i4;
                    companion = companion4;
                    bentoTheme = bentoTheme2;
                    cryptoTradingOptionsLocation = cryptoTradingOptionsLocation4;
                    composer2 = composer;
                    BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null), Color.m6701boximpl(bentoTheme2.getColors(composer3, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i4).getTextS(), composer2, 0, 0, 8184);
                    str = str3;
                }
                composer2.endReplaceGroup();
                final float fMo5016toPx0680j_4 = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(24));
                final long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                int i5 = i3;
                final long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i5).m21371getBg0d7_KjU();
                composer2.startReplaceGroup(-326732089);
                Modifier.Companion companion5 = companion;
                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 1, null);
                InstrumentPreviewCard4 instrumentPreviewCard4 = (InstrumentPreviewCard4) CollectionsKt.firstOrNull((List) CryptoDailyMoversComposable.CryptoDailyMoversComposable$lambda$6(snapshotState4).getItems());
                if ((instrumentPreviewCard4 != null ? instrumentPreviewCard4.getStyle() : null) == ApiCryptoTradingOptions3.COMPACT_CARD) {
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChanged = composer2.changed(jM21371getBg0d7_KjU) | composer2.changed(fMo5016toPx0680j_4);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.movers.CryptoDailyMoversComposableKt$CryptoDailyMoversComposable$2$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoDailyMoversComposable.C377332.invoke$lambda$7$lambda$6$lambda$5$lambda$4(jM21371getBg0d7_KjU, jM6725getTransparent0d7_KjU, fMo5016toPx0680j_4, (ContentDrawScope) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    modifierM5144paddingVpY3zN4$default = DrawModifierKt.drawWithContent(modifierM5144paddingVpY3zN4$default, (Function1) objRememberedValue2);
                }
                composer2.endReplaceGroup();
                CryptoTradingOptionsLocation cryptoTradingOptionsLocation5 = cryptoTradingOptionsLocation2;
                CryptoCardsComposable.CryptoCardsComposable(cryptoTradingOptionsLocation5, CryptoDailyMoversComposable.CryptoDailyMoversComposable$lambda$6(snapshotState4).getItems(), modifierM5144paddingVpY3zN4$default, composer2, 0, 0);
                composer2.startReplaceGroup(-326699616);
                if (str != null && str.length() != 0 && cryptoTradingOptionsLocation5 != cryptoTradingOptionsLocation) {
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                    BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion5, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 0, 0, 8184);
                }
                composer.endReplaceGroup();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$7$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
                CryptoDailyMoversComposable.CryptoDailyMoversComposable$lambda$5(snapshotState, true);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4(long j, long j2, float f, ContentDrawScope drawWithContent) {
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                Brush.Companion companion = Brush.INSTANCE;
                DrawScope.m6957drawRectAsUm42w$default(drawWithContent, Brush.Companion.m6676horizontalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(j), Color.m6701boximpl(j2)}), 0.0f, f, 0, 8, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                DrawScope.m6957drawRectAsUm42w$default(drawWithContent, Brush.Companion.m6676horizontalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(j2), Color.m6701boximpl(j)}), Float.intBitsToFloat((int) (drawWithContent.mo6963getSizeNHjbRc() >> 32)) - f, Float.intBitsToFloat((int) (drawWithContent.mo6963getSizeNHjbRc() >> 32)), 0, 8, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                return Unit.INSTANCE;
            }
        }

        private static final boolean CryptoDailyMoversComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CryptoDailyMoversViewState CryptoDailyMoversComposable$lambda$6(SnapshotState4<CryptoDailyMoversViewState> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit CryptoDailyMoversComposable$lambda$9$lambda$8$lambda$7(SnapshotState snapshotState) {
            CryptoDailyMoversComposable$lambda$5(snapshotState, false);
            return Unit.INSTANCE;
        }
    }
