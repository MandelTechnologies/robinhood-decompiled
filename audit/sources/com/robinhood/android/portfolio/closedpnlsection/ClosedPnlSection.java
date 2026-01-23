package com.robinhood.android.portfolio.closedpnlsection;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
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
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.adjust.sdk.network.ErrorCodes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.contracts.PnlHubContract;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.portfolio.pnlhub.models.C25781R;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.util.Money;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;

/* compiled from: ClosedPnlSection.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"ClosedPnlSection", "", "source", "", "accountNumber", "instrumentId", "Ljava/util/UUID;", "symbol", "duxo", "Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionDuxo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionDuxo;Landroidx/compose/runtime/Composer;II)V", "ClosedPnlSectionComposable", "viewState", "Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionViewState;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionViewState;Landroidx/compose/runtime/Composer;I)V", "lib-closed-pnl-section_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ClosedPnlSection {

    /* compiled from: ClosedPnlSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClosedPnlSection$lambda$4(String str, String str2, UUID uuid, String str3, ClosedPnlSectionDuxo closedPnlSectionDuxo, int i, int i2, Composer composer, int i3) {
        ClosedPnlSection(str, str2, uuid, str3, closedPnlSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClosedPnlSectionComposable$lambda$9(String str, String str2, ClosedPnlSectionViewState closedPnlSectionViewState, int i, Composer composer, int i2) {
        ClosedPnlSectionComposable(str, str2, closedPnlSectionViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ClosedPnlSection(final String source, final String accountNumber, final UUID instrumentId, final String symbol, ClosedPnlSectionDuxo closedPnlSectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        ClosedPnlSectionDuxo closedPnlSectionDuxo2;
        boolean z;
        int i4;
        final ClosedPnlSectionDuxo closedPnlSectionDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1238780826);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(source) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(accountNumber) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(instrumentId) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(symbol) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                closedPnlSectionDuxo2 = closedPnlSectionDuxo;
                int i5 = composerStartRestartGroup.changedInstance(closedPnlSectionDuxo2) ? 16384 : 8192;
                i3 |= i5;
            } else {
                closedPnlSectionDuxo2 = closedPnlSectionDuxo;
            }
            i3 |= i5;
        } else {
            closedPnlSectionDuxo2 = closedPnlSectionDuxo;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    String str = accountNumber + "_" + instrumentId + "_ClosedPnlSection";
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    z = false;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ClosedPnlSectionDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionKt$ClosedPnlSection$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionKt$ClosedPnlSection$$inlined$duxo$1.1
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
                    closedPnlSectionDuxo2 = (ClosedPnlSectionDuxo) baseDuxo;
                    i3 &= -57345;
                }
                i4 = i3;
                closedPnlSectionDuxo3 = closedPnlSectionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1238780826, i4, -1, "com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSection (ClosedPnlSection.kt:45)");
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(closedPnlSectionDuxo3);
                if ((i4 & 112) == 32) {
                    z = true;
                }
                zChangedInstance = zChangedInstance3 | z | composerStartRestartGroup.changedInstance(instrumentId);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ClosedPnlSection.ClosedPnlSection$lambda$2$lambda$1(closedPnlSectionDuxo3, accountNumber, instrumentId, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(accountNumber, instrumentId, null, (Function1) objRememberedValue, composerStartRestartGroup, (i4 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                closedPnlSectionDuxo2 = closedPnlSectionDuxo3;
                int i6 = i4;
                ClosedPnlSectionComposable(source, symbol, ClosedPnlSection$lambda$3(FlowExtKt.collectAsStateWithLifecycle(closedPnlSectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, (i6 & 14) | ((i6 >> 6) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i4 = i3 & (-57345);
                    z = false;
                    closedPnlSectionDuxo3 = closedPnlSectionDuxo2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance32 = composerStartRestartGroup.changedInstance(closedPnlSectionDuxo3);
                    if ((i4 & 112) == 32) {
                    }
                    zChangedInstance = zChangedInstance32 | z | composerStartRestartGroup.changedInstance(instrumentId);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ClosedPnlSection.ClosedPnlSection$lambda$2$lambda$1(closedPnlSectionDuxo3, accountNumber, instrumentId, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        LifecycleEffectKt.LifecycleResumeEffect(accountNumber, instrumentId, null, (Function1) objRememberedValue, composerStartRestartGroup, (i4 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                        closedPnlSectionDuxo2 = closedPnlSectionDuxo3;
                        int i62 = i4;
                        ClosedPnlSectionComposable(source, symbol, ClosedPnlSection$lambda$3(FlowExtKt.collectAsStateWithLifecycle(closedPnlSectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, (i62 & 14) | ((i62 >> 6) & 112));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
            z = false;
            i4 = i3;
            closedPnlSectionDuxo3 = closedPnlSectionDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance322 = composerStartRestartGroup.changedInstance(closedPnlSectionDuxo3);
            if ((i4 & 112) == 32) {
            }
            zChangedInstance = zChangedInstance322 | z | composerStartRestartGroup.changedInstance(instrumentId);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
            }
        }
        final ClosedPnlSectionDuxo closedPnlSectionDuxo4 = closedPnlSectionDuxo2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ClosedPnlSection.ClosedPnlSection$lambda$4(source, accountNumber, instrumentId, symbol, closedPnlSectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult ClosedPnlSection$lambda$2$lambda$1(ClosedPnlSectionDuxo closedPnlSectionDuxo, String str, UUID uuid, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final CompletableJob completableJobBind = closedPnlSectionDuxo.bind(str, uuid);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionKt$ClosedPnlSection$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(completableJobBind, null, 1, null);
            }
        };
    }

    public static final void ClosedPnlSectionComposable(final String source, final String symbol, final ClosedPnlSectionViewState viewState, Composer composer, final int i) {
        int i2;
        Composer composer2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1136749869);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(source) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(symbol) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1136749869, i2, -1, "com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionComposable (ClosedPnlSection.kt:65)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (viewState.getClosedPnl() == null || !viewState.isVisible()) {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(902071402);
                Spacer2.Spacer(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null), null, false, 3, null), composer2, 6);
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(902347550);
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = ((i2 & 112) == 32) | ((i2 & 14) == 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(viewState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ClosedPnlSection.ClosedPnlSectionComposable$lambda$6$lambda$5(navigator, context, viewState, source, symbol);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function0);
                    objRememberedValue = function0;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25616R.string.closed_pnl_section_title, composerStartRestartGroup, 0), companion, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 48, 0, 8188);
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                int i4 = WhenMappings.$EnumSwitchMapping$0[((LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection())).ordinal()];
                if (i4 == 1) {
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_RIGHT_16;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_LEFT_16;
                }
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2), StringResources_androidKt.stringResource(C25616R.string.closed_pnl_section_title, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), modifierM5146paddingqDBjuR0$default2, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
                composerStartRestartGroup.endNode();
                BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C25781R.string.pnl_hub_entry_point_past_month, composerStartRestartGroup, 0), null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, viewState.getClosedPnl().getPastMonth().isZero() ? new AnnotatedString(Money.format$default(viewState.getClosedPnl().getPastMonth(), null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null), null, 2, null) : new AnnotatedString(Formats.getCurrencyDeltaFormat().format(viewState.getClosedPnl().getPastMonth().getDecimalValue()), null, 2, null), null, null, null, null, false, viewState.isStale(), 2009, null);
                int i5 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState, null, null, null, null, composerStartRestartGroup, i5, 30);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C25781R.string.pnl_hub_entry_point_ytd, composerStartRestartGroup, 0), null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, viewState.getClosedPnl().getYearToDate().isZero() ? new AnnotatedString(Money.format$default(viewState.getClosedPnl().getYearToDate(), null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null), null, 2, null) : new AnnotatedString(Formats.getCurrencyDeltaFormat().format(viewState.getClosedPnl().getYearToDate().getDecimalValue()), null, 2, null), null, null, null, null, false, viewState.isStale(), 2009, null), null, null, null, null, composerStartRestartGroup, i5, 30);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ClosedPnlSection.ClosedPnlSectionComposable$lambda$9(source, symbol, viewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ClosedPnlSectionViewState ClosedPnlSection$lambda$3(SnapshotState4<ClosedPnlSectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClosedPnlSectionComposable$lambda$6$lambda$5(Navigator navigator, Context context, ClosedPnlSectionViewState closedPnlSectionViewState, String str, String str2) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new PnlHubContract.Key.ScrollToSymbol(closedPnlSectionViewState.getClosedPnl().getAccountNumber(), str, closedPnlSectionViewState.getSupportedAssetTypes(), null, str2, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }
}
