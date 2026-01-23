package com.robinhood.android.crypto.tab.p093ui.header;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
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
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.p093ui.header.CryptoHomeHeaderComposable;
import com.robinhood.android.dashboardpill.DashboardPillData;
import com.robinhood.android.dashboardpill.DashboardPillData2;
import com.robinhood.android.dashboardpill.p096ui.DashboardPillButton5;
import com.robinhood.android.dashboardpill.p096ui.VisibilityTracking2;
import com.robinhood.android.lib.performancechart.AccountMarketValuesLink;
import com.robinhood.android.lib.performancechart.PerformanceChartComposable;
import com.robinhood.android.lib.performancechart.PerformanceChartDuxo;
import com.robinhood.android.lib.performancechart.PerformanceChartStateProvider3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.shared.crypto.p375ui.reward.CryptoRewardButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import p479j$.time.Clock;
import rh_server_driven_ui.p531v1.ButtonDto;

/* compiled from: CryptoHomeHeaderComposable.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\f\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001aK\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006 ²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001f\u001a\u0004\u0018\u00010\u00148\nX\u008a\u0084\u0002"}, m3636d2 = {"Lkotlin/Function1;", "Lcom/robinhood/compose/bento/theme/Direction;", "", "onDirectionChanged", "", "accountNumber", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDuxo;", "duxo", "Lcom/robinhood/android/lib/performancechart/PerformanceChartDuxo;", "chartDuxo", "CryptoHomeHeaderComposable", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDuxo;Lcom/robinhood/android/lib/performancechart/PerformanceChartDuxo;Landroidx/compose/runtime/Composer;II)V", "j$/time/Clock", Card.Icon.CLOCK, "Lrh_server_driven_ui/v1/ButtonDto;", "rewardButton", "Lcom/robinhood/android/dashboardpill/DashboardPillData;", "dashboardPillData", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "title", "direction", "Lkotlin/Function0;", "onDashboardPillClick", "CryptoHomeHeaderTitle", "(Lj$/time/Clock;Lrh_server_driven_ui/v1/ButtonDto;Lcom/robinhood/android/dashboardpill/DashboardPillData;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Lcom/robinhood/compose/bento/theme/Direction;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderViewState;", "viewState", "Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState;", "chartViewState", "chartTitle", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeHeaderComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeHeaderComposable$lambda$5(Function1 function1, String str, Modifier modifier, CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo, PerformanceChartDuxo performanceChartDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeHeaderComposable(function1, str, modifier, cryptoHomeHeaderDuxo, performanceChartDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeHeaderTitle$lambda$7(Clock clock, ButtonDto buttonDto, DashboardPillData dashboardPillData, RichText richText, BentoTheme4 bentoTheme4, Function0 function0, int i, Composer composer, int i2) {
        CryptoHomeHeaderTitle(clock, buttonDto, dashboardPillData, richText, bentoTheme4, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHomeHeaderComposable(final Function1<? super BentoTheme4, Unit> onDirectionChanged, final String str, Modifier modifier, CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo, PerformanceChartDuxo performanceChartDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo2;
        int i4;
        Modifier modifier3;
        String str2;
        int i5;
        int i6;
        Composer composer2;
        int i7;
        CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo3;
        int i8;
        Object objRememberedValue;
        Composer composer3;
        final Modifier modifier4;
        final CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        PerformanceChartDuxo performanceChartDuxo2 = performanceChartDuxo;
        Intrinsics.checkNotNullParameter(onDirectionChanged, "onDirectionChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-17558365);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDirectionChanged) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoHomeHeaderDuxo2 = cryptoHomeHeaderDuxo;
                    int i11 = composerStartRestartGroup.changedInstance(cryptoHomeHeaderDuxo2) ? 2048 : 1024;
                    i3 |= i11;
                } else {
                    cryptoHomeHeaderDuxo2 = cryptoHomeHeaderDuxo;
                }
                i3 |= i11;
            } else {
                cryptoHomeHeaderDuxo2 = cryptoHomeHeaderDuxo;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    if ((32768 & i) == 0 ? composerStartRestartGroup.changed(performanceChartDuxo2) : composerStartRestartGroup.changedInstance(performanceChartDuxo2)) {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        i5 = -57345;
                        str2 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                        i6 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeHeaderDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt$CryptoHomeHeaderComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt$CryptoHomeHeaderComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                        composer2.endReplaceGroup();
                        i7 = i4 & (-7169);
                        cryptoHomeHeaderDuxo3 = (CryptoHomeHeaderDuxo) baseDuxo;
                    } else {
                        str2 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                        i5 = -57345;
                        i6 = -1633490746;
                        composer2 = composerStartRestartGroup;
                        i7 = i4;
                        cryptoHomeHeaderDuxo3 = cryptoHomeHeaderDuxo2;
                    }
                    if ((i2 & 16) == 0) {
                        String str3 = str + PerformanceChartType.CRYPTO.getServerValue();
                        composer2.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new IllegalStateException(str2);
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current2, composer2, 0);
                        composer2.startReplaceableGroup(1729797275);
                        ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PerformanceChartDuxo.class), current2, str3, factoryCreateViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
                        final Lifecycle lifecycle2 = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(i6);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo2) | composer2.changedInstance(lifecycle2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt$CryptoHomeHeaderComposable$$inlined$duxo$2
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                                    lifecycle2.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle3 = lifecycle2;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt$CryptoHomeHeaderComposable$$inlined$duxo$2.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle3.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                        performanceChartDuxo2 = (PerformanceChartDuxo) baseDuxo2;
                        i8 = i7 & i5;
                    } else {
                        i8 = i7;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                    i8 = i4;
                    cryptoHomeHeaderDuxo3 = cryptoHomeHeaderDuxo2;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-17558365, i8, -1, "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposable (CryptoHomeHeaderComposable.kt:49)");
                }
                Composer composer4 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeHeaderDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(performanceChartDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer4.startReplaceGroup(1849434622);
                objRememberedValue = composer4.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeHeaderComposable.CryptoHomeHeaderComposable$lambda$3$lambda$2(snapshotState4CollectAsStateWithLifecycle2);
                        }
                    });
                    composer4.updateRememberedValue(objRememberedValue);
                }
                composer4.endReplaceGroup();
                onDirectionChanged.invoke(CryptoHomeHeaderComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDirection());
                CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo5 = cryptoHomeHeaderDuxo3;
                Modifier modifier5 = modifier3;
                PerformanceChartComposable.PerformanceChartComposable(str, PerformanceChartType.CRYPTO, CryptoHomeHeaderComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getMarketValueType(), modifier5, false, AnimationSpecKt.tween$default(500, 0, null, 6, null), null, ComposableLambda3.rememberComposableLambda(-1961495567, true, new C131471(cryptoHomeHeaderDuxo5, snapshotState4CollectAsStateWithLifecycle, (Navigator) composer4.consume(LocalNavigator.getLocalNavigator()), (Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (SnapshotState4) objRememberedValue), composer4, 54), false, ComposableLambda3.rememberComposableLambda(1703944587, true, new Function4<Row5, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt.CryptoHomeHeaderComposable.2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, String str4, Composer composer5, Integer num) {
                        invoke(row5, str4, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 PerformanceChartComposable, String str4, Composer composer5, int i12) {
                        Intrinsics.checkNotNullParameter(PerformanceChartComposable, "$this$PerformanceChartComposable");
                        if ((i12 & 48) == 0) {
                            i12 |= composer5.changed(str4) ? 32 : 16;
                        }
                        if ((i12 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1703944587, i12, -1, "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposable.<anonymous> (CryptoHomeHeaderComposable.kt:89)");
                        }
                        AccountMarketValuesType marketValueType = CryptoHomeHeaderComposable.CryptoHomeHeaderComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getMarketValueType();
                        String str5 = str;
                        if (str5 != null && marketValueType != null) {
                            AccountMarketValuesLink.AccountMarketValuesLink(str5, marketValueType, str4, null, composer5, (i12 << 3) & 896, 8);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer4, 54), null, null, null, null, null, null, composer4, ((i8 >> 3) & 14) | 818110512 | ((i8 << 3) & 7168), 0, 64832);
                composer3 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
                cryptoHomeHeaderDuxo4 = cryptoHomeHeaderDuxo5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoHomeHeaderDuxo4 = cryptoHomeHeaderDuxo2;
                composer3 = composerStartRestartGroup;
            }
            final PerformanceChartDuxo performanceChartDuxo3 = performanceChartDuxo2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoHomeHeaderComposable.CryptoHomeHeaderComposable$lambda$5(onDirectionChanged, str, modifier4, cryptoHomeHeaderDuxo4, performanceChartDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if ((i & 24576) == 0) {
        }
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                final SnapshotState4<CryptoHomeHeaderViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeHeaderDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(performanceChartDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer42.startReplaceGroup(1849434622);
                objRememberedValue = composer42.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composer42.endReplaceGroup();
                onDirectionChanged.invoke(CryptoHomeHeaderComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getDirection());
                CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo52 = cryptoHomeHeaderDuxo3;
                Modifier modifier52 = modifier3;
                PerformanceChartComposable.PerformanceChartComposable(str, PerformanceChartType.CRYPTO, CryptoHomeHeaderComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getMarketValueType(), modifier52, false, AnimationSpecKt.tween$default(500, 0, null, 6, null), null, ComposableLambda3.rememberComposableLambda(-1961495567, true, new C131471(cryptoHomeHeaderDuxo52, snapshotState4CollectAsStateWithLifecycle3, (Navigator) composer42.consume(LocalNavigator.getLocalNavigator()), (Context) composer42.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (SnapshotState4) objRememberedValue), composer42, 54), false, ComposableLambda3.rememberComposableLambda(1703944587, true, new Function4<Row5, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt.CryptoHomeHeaderComposable.2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, String str4, Composer composer5, Integer num) {
                        invoke(row5, str4, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 PerformanceChartComposable, String str4, Composer composer5, int i12) {
                        Intrinsics.checkNotNullParameter(PerformanceChartComposable, "$this$PerformanceChartComposable");
                        if ((i12 & 48) == 0) {
                            i12 |= composer5.changed(str4) ? 32 : 16;
                        }
                        if ((i12 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1703944587, i12, -1, "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposable.<anonymous> (CryptoHomeHeaderComposable.kt:89)");
                        }
                        AccountMarketValuesType marketValueType = CryptoHomeHeaderComposable.CryptoHomeHeaderComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getMarketValueType();
                        String str5 = str;
                        if (str5 != null && marketValueType != null) {
                            AccountMarketValuesLink.AccountMarketValuesLink(str5, marketValueType, str4, null, composer5, (i12 << 3) & 896, 8);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer42, 54), null, null, null, null, null, null, composer42, ((i8 >> 3) & 14) | 818110512 | ((i8 << 3) & 7168), 0, 64832);
                composer3 = composer42;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
                cryptoHomeHeaderDuxo4 = cryptoHomeHeaderDuxo52;
            }
        }
        final PerformanceChartDuxo performanceChartDuxo32 = performanceChartDuxo2;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RichText CryptoHomeHeaderComposable$lambda$3$lambda$2(SnapshotState4 snapshotState4) {
        PerformanceChartModel chartModel;
        PerformanceChartStateProvider3 performanceChartStateProvider3CryptoHomeHeaderComposable$lambda$1 = CryptoHomeHeaderComposable$lambda$1(snapshotState4);
        PerformanceChartStateProvider3.Ready ready = performanceChartStateProvider3CryptoHomeHeaderComposable$lambda$1 instanceof PerformanceChartStateProvider3.Ready ? (PerformanceChartStateProvider3.Ready) performanceChartStateProvider3CryptoHomeHeaderComposable$lambda$1 : null;
        if (ready == null || (chartModel = ready.getChartModel()) == null) {
            return null;
        }
        return chartModel.getTitle();
    }

    /* compiled from: CryptoHomeHeaderComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt$CryptoHomeHeaderComposable$1 */
    static final class C131471 implements Function4<Column5, String, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<RichText> $chartTitle$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ CryptoHomeHeaderDuxo $duxo;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ SnapshotState4<CryptoHomeHeaderViewState> $viewState$delegate;

        C131471(CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo, SnapshotState4<CryptoHomeHeaderViewState> snapshotState4, Navigator navigator, Context context, SnapshotState4<RichText> snapshotState42) {
            this.$duxo = cryptoHomeHeaderDuxo;
            this.$viewState$delegate = snapshotState4;
            this.$navigator = navigator;
            this.$context = context;
            this.$chartTitle$delegate = snapshotState42;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, String str, Composer composer, Integer num) {
            invoke(column5, str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Column5 PerformanceChartComposable, String str, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(PerformanceChartComposable, "$this$PerformanceChartComposable");
            if ((i & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1961495567, i, -1, "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposable.<anonymous> (CryptoHomeHeaderComposable.kt:67)");
            }
            Clock clock = this.$duxo.getClock();
            ButtonDto rewardButton = CryptoHomeHeaderComposable.CryptoHomeHeaderComposable$lambda$0(this.$viewState$delegate).getRewardButton();
            DashboardPillData dashboardPillData = CryptoHomeHeaderComposable.CryptoHomeHeaderComposable$lambda$0(this.$viewState$delegate).getDashboardPillData();
            RichText richTextCryptoHomeHeaderComposable$lambda$4 = CryptoHomeHeaderComposable.CryptoHomeHeaderComposable$lambda$4(this.$chartTitle$delegate);
            BentoTheme4 direction = CryptoHomeHeaderComposable.CryptoHomeHeaderComposable$lambda$0(this.$viewState$delegate).getDirection();
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final SnapshotState4<CryptoHomeHeaderViewState> snapshotState4 = this.$viewState$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt$CryptoHomeHeaderComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoHomeHeaderComposable.C131471.invoke$lambda$2$lambda$1(navigator, context, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CryptoHomeHeaderComposable.CryptoHomeHeaderTitle(clock, rewardButton, dashboardPillData, richTextCryptoHomeHeaderComposable$lambda$4, direction, (Function0) objRememberedValue, composer, DashboardPillData.$stable << 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(Navigator navigator, Context context, SnapshotState4 snapshotState4) {
            IntentKey defaultNavigationKey;
            DashboardPillData dashboardPillData = CryptoHomeHeaderComposable.CryptoHomeHeaderComposable$lambda$0(snapshotState4).getDashboardPillData();
            if (dashboardPillData == null) {
                return Unit.INSTANCE;
            }
            String actionUrl = dashboardPillData.getActionUrl();
            if (!Navigator.DefaultImpls.handleDeepLink$default(navigator, context, actionUrl != null ? Uri.parse(actionUrl) : null, null, null, false, null, 44, null) && (defaultNavigationKey = dashboardPillData.getDefaultNavigationKey()) != null) {
                Navigator.DefaultImpls.startActivity$default(navigator, context, defaultNavigationKey, null, false, null, null, 60, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoHomeHeaderViewState CryptoHomeHeaderComposable$lambda$0(SnapshotState4<CryptoHomeHeaderViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final PerformanceChartStateProvider3 CryptoHomeHeaderComposable$lambda$1(SnapshotState4<? extends PerformanceChartStateProvider3> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RichText CryptoHomeHeaderComposable$lambda$4(SnapshotState4<RichText> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final void CryptoHomeHeaderTitle(Clock clock, ButtonDto buttonDto, final DashboardPillData dashboardPillData, final RichText richText, BentoTheme4 direction, final Function0<Unit> onDashboardPillClick, Composer composer, final int i) {
        int i2;
        float f;
        FiniteAnimationSpec finiteAnimationSpec;
        Modifier.Companion companion;
        final Clock clock2;
        final BentoTheme4 bentoTheme4;
        final ButtonDto buttonDto2 = buttonDto;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(onDashboardPillClick, "onDashboardPillClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(651413598);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(clock) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(buttonDto2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(dashboardPillData) : composerStartRestartGroup.changedInstance(dashboardPillData) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(richText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(direction.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDashboardPillClick) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            clock2 = clock;
            bentoTheme4 = direction;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(651413598, i2, -1, "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderTitle (CryptoHomeHeaderComposable.kt:112)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            if (richText != null) {
                composerStartRestartGroup.startReplaceGroup(708252783);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                finiteAnimationSpec = null;
                f = 0.0f;
                companion = companion2;
                BentoRichText.m15949BentoRichText0sCZWFg(richText, PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleLarge(), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composerStartRestartGroup, (i2 >> 9) & 14, 1016);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                f = 0.0f;
                finiteAnimationSpec = null;
                companion = companion2;
                composerStartRestartGroup.startReplaceGroup(708530605);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13013R.string.crypto_home_header, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            clock2 = clock;
            AnimatedVisibilityKt.AnimatedVisibility(row6, dashboardPillData != null, (Modifier) null, EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec, f, 3, finiteAnimationSpec), EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec, f, 3, finiteAnimationSpec), (String) null, ComposableLambda3.rememberComposableLambda(-1265647974, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt$CryptoHomeHeaderTitle$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1265647974, i5, -1, "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderTitle.<anonymous>.<anonymous> (CryptoHomeHeaderComposable.kt:140)");
                    }
                    DashboardPillData dashboardPillData2 = dashboardPillData;
                    if (dashboardPillData2 != null) {
                        DashboardPillButton5.DashboardPillButton(clock2, dashboardPillData2, VisibilityTracking2.trackDashboardPillVisibility(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), 0.0f, composer2, 6, 1), DashboardPillData2.CRYPTO_HOME_TAB), onDashboardPillClick, composer2, DashboardPillData.$stable << 3, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec, f, 3, finiteAnimationSpec);
            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec, f, 3, finiteAnimationSpec);
            buttonDto2 = buttonDto;
            bentoTheme4 = direction;
            AnimatedVisibilityKt.AnimatedVisibility(row6, dashboardPillData == null && buttonDto != null, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambda3.rememberComposableLambda(-1098132015, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt$CryptoHomeHeaderTitle$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1098132015, i5, -1, "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderTitle.<anonymous>.<anonymous> (CryptoHomeHeaderComposable.kt:160)");
                    }
                    ButtonDto buttonDto3 = buttonDto2;
                    if (buttonDto3 != null) {
                        CryptoRewardButton.CryptoRewardButton(buttonDto3, bentoTheme4, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), 0.0f, composer2, 6, 1), composer2, 0, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final BentoTheme4 bentoTheme42 = bentoTheme4;
            final Clock clock3 = clock2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeHeaderComposable.CryptoHomeHeaderTitle$lambda$7(clock3, buttonDto2, dashboardPillData, richText, bentoTheme42, onDashboardPillClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
