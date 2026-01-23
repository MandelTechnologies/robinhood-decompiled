package com.robinhood.android.mcw.homesection;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.lib.store.mcw.data.DisplayCurrency;
import com.robinhood.android.lib.store.mcw.data.McwHomeSectionData;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.mcw.homesection.DashboardMcwSectionState;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;

/* compiled from: DashboardMcwSection.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\n\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"DashboardMcwSection", "", "accountNumber", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionDuxo;Landroidx/compose/runtime/Composer;II)V", "Loaded", "viewState", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View$Loaded;", "(Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-lib-mcw-home-section_externalDebug", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class DashboardMcwSection {

    /* compiled from: DashboardMcwSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$WhenMappings */
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
    public static final Unit DashboardMcwSection$lambda$4(String str, Modifier modifier, DashboardMcwSectionDuxo dashboardMcwSectionDuxo, int i, int i2, Composer composer, int i3) {
        DashboardMcwSection(str, modifier, dashboardMcwSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$12(DashboardMcwSectionState.View.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DashboardMcwSection(final String accountNumber, Modifier modifier, DashboardMcwSectionDuxo dashboardMcwSectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        final DashboardMcwSectionDuxo dashboardMcwSectionDuxo2;
        int i6;
        int i7;
        Object objRememberedValue;
        DashboardMcwSectionState.View viewDashboardMcwSection$lambda$3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        DashboardMcwSectionDuxo dashboardMcwSectionDuxo3 = dashboardMcwSectionDuxo;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(1865910491);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) != 0) {
                    i8 = 128;
                    i3 |= i8;
                } else {
                    if ((i & 512) == 0 ? composerStartRestartGroup.changed(dashboardMcwSectionDuxo3) : composerStartRestartGroup.changedInstance(dashboardMcwSectionDuxo3)) {
                        i8 = 256;
                    }
                    i3 |= i8;
                }
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        String str = accountNumber + "_mcw_home_section";
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DashboardMcwSectionDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$DashboardMcwSection$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$DashboardMcwSection$$inlined$duxo$1.1
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
                        i5 = 0;
                        i6 = i3 & (-897);
                        dashboardMcwSectionDuxo2 = (DashboardMcwSectionDuxo) baseDuxo;
                    } else {
                        i4 = -1633490746;
                        i5 = 0;
                        dashboardMcwSectionDuxo2 = dashboardMcwSectionDuxo3;
                        i6 = i3;
                    }
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    dashboardMcwSectionDuxo2 = dashboardMcwSectionDuxo3;
                    i4 = -1633490746;
                    i5 = 0;
                    i6 = i3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1865910491, i6, -1, "com.robinhood.android.mcw.homesection.DashboardMcwSection (DashboardMcwSection.kt:39)");
                }
                composerStartRestartGroup.startReplaceGroup(i4);
                int i10 = i6 & 14;
                i7 = (((((i6 & 896) ^ 384) > 256 || !composerStartRestartGroup.changedInstance(dashboardMcwSectionDuxo2)) && (i6 & 384) != 256) ? i5 : 1) | (i10 != 4 ? i5 : 1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i7 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DashboardMcwSection.DashboardMcwSection$lambda$2$lambda$1(dashboardMcwSectionDuxo2, accountNumber, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(accountNumber, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i10, 2);
                Modifier modifier5 = modifier2;
                dashboardMcwSectionDuxo3 = dashboardMcwSectionDuxo2;
                int i11 = i6;
                viewDashboardMcwSection$lambda$3 = DashboardMcwSection$lambda$3(FlowExtKt.collectAsStateWithLifecycle(dashboardMcwSectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(viewDashboardMcwSection$lambda$3 instanceof DashboardMcwSectionState.View.Loading)) {
                    if (!(viewDashboardMcwSection$lambda$3 instanceof DashboardMcwSectionState.View.Loaded)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Loaded((DashboardMcwSectionState.View.Loaded) viewDashboardMcwSection$lambda$3, modifier5, composerStartRestartGroup, McwHomeSectionData.$stable | (i11 & 112), i5);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            final DashboardMcwSectionDuxo dashboardMcwSectionDuxo4 = dashboardMcwSectionDuxo3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DashboardMcwSection.DashboardMcwSection$lambda$4(accountNumber, modifier3, dashboardMcwSectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                modifier2 = modifier4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(i4);
                if (((i6 & 896) ^ 384) > 256) {
                    int i102 = i6 & 14;
                    i7 = (((((i6 & 896) ^ 384) > 256 || !composerStartRestartGroup.changedInstance(dashboardMcwSectionDuxo2)) && (i6 & 384) != 256) ? i5 : 1) | (i102 != 4 ? i5 : 1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i7 != 0) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return DashboardMcwSection.DashboardMcwSection$lambda$2$lambda$1(dashboardMcwSectionDuxo2, accountNumber, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        LifecycleEffectKt.LifecycleResumeEffect(accountNumber, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i102, 2);
                        Modifier modifier52 = modifier2;
                        dashboardMcwSectionDuxo3 = dashboardMcwSectionDuxo2;
                        int i112 = i6;
                        viewDashboardMcwSection$lambda$3 = DashboardMcwSection$lambda$3(FlowExtKt.collectAsStateWithLifecycle(dashboardMcwSectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                        if (!(viewDashboardMcwSection$lambda$3 instanceof DashboardMcwSectionState.View.Loading)) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                } else {
                    int i1022 = i6 & 14;
                    i7 = (((((i6 & 896) ^ 384) > 256 || !composerStartRestartGroup.changedInstance(dashboardMcwSectionDuxo2)) && (i6 & 384) != 256) ? i5 : 1) | (i1022 != 4 ? i5 : 1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i7 != 0) {
                    }
                }
            }
        }
        final DashboardMcwSectionDuxo dashboardMcwSectionDuxo42 = dashboardMcwSectionDuxo3;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult DashboardMcwSection$lambda$2$lambda$1(DashboardMcwSectionDuxo dashboardMcwSectionDuxo, String str, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobInitialize = dashboardMcwSectionDuxo.initialize(str);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$DashboardMcwSection$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobInitialize, null, 1, null);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0468  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Loaded(final DashboardMcwSectionState.View.Loaded loaded, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Navigator navigator;
        final Context context;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i5;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        boolean z;
        final DashboardMcwSectionState.View.Loaded loaded2;
        boolean z2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-595136230);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(loaded) : composerStartRestartGroup.changedInstance(loaded) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-595136230, i3, -1, "com.robinhood.android.mcw.homesection.Loaded (DashboardMcwSection.kt:61)");
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                Modifier modifier4 = modifier3;
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.CASH_BALANCES_HOME_SECTION;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                int i8 = i3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                i4 = i8 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | (i4 != 4 || ((i8 & 8) != 0 && composerStartRestartGroup.changedInstance(loaded)));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DashboardMcwSection.Loaded$lambda$11$lambda$6$lambda$5(navigator, context, loaded);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, false, null, null, (Function0) objRememberedValue, 7, null), 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, loaded.getData().getTitleData().getLoggingAction(), null, new Component(componentType, loaded.getData().getTitleData().getLoggingIdentifier(), null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                boolean z3 = true;
                BentoText2.m20747BentoText38GnDrw(loaded.getData().getTitleData().getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                i5 = WhenMappings.$EnumSwitchMapping$0[((LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection())).ordinal()];
                if (i5 != 1) {
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_RIGHT_16;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_LEFT_16;
                }
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2), loaded.getData().getTitleData().getTitle(), bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), modifierM5146paddingqDBjuR0$default2, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
                composerStartRestartGroup.endNode();
                if (loaded.getData().getDisplayCurrencyBalances().isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(1708821799);
                    for (final DisplayCurrency displayCurrency : loaded.getData().getDisplayCurrencyBalances()) {
                        Composer composer2 = composerStartRestartGroup;
                        BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(2104764484, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$Loaded$1$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2104764484, i9, -1, "com.robinhood.android.mcw.homesection.Loaded.<anonymous>.<anonymous>.<anonymous> (DashboardMcwSection.kt:120)");
                                }
                                BentoText2.m20747BentoText38GnDrw(displayCurrency.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(-898403129, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$Loaded$1$3$2
                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-898403129, i9, -1, "com.robinhood.android.mcw.homesection.Loaded.<anonymous>.<anonymous>.<anonymous> (DashboardMcwSection.kt:123)");
                                }
                                Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                                DisplayCurrency displayCurrency2 = displayCurrency;
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, companion4);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(Money.format$default(displayCurrency2.getMoney(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                                String sweepDisplayLabel = displayCurrency2.getSweepDisplayLabel();
                                composer3.startReplaceGroup(41338168);
                                if (sweepDisplayLabel != null && (!StringsKt.isBlank(sweepDisplayLabel))) {
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i10 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(sweepDisplayLabel, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i10).m21368getAccent0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer3, i10).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer3, 0, 0, 8186);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54), false, false, false, null, composer2, 1575936, 0, 1975);
                        composerStartRestartGroup = composer2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    z = false;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1709770058);
                    z = false;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21743R.string.dashboard_cash_balances_empty_desc, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 0, 0, 8184);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, loaded.getData().getFooterData().getLoggingAction(), null, new Component(Component.ComponentType.CASH_BALANCES_HOME_SECTION, loaded.getData().getFooterData().getLoggingIdentifier(), null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null);
                String title = loaded.getData().getFooterData().getTitle();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                if (i4 == 4) {
                    if ((i8 & 8) != 0) {
                        loaded2 = loaded;
                        if (!composerStartRestartGroup.changedInstance(loaded2)) {
                        }
                    } else {
                        loaded2 = loaded;
                    }
                    z3 = z;
                } else {
                    loaded2 = loaded;
                }
                z2 = z3 | zChangedInstance2;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DashboardMcwSection.Loaded$lambda$11$lambda$10$lambda$9(navigator, context, loaded2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, title, modifierAutoLogEvents$default3, null, null, false, null, composerStartRestartGroup, 0, 120);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                loaded2 = loaded;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DashboardMcwSection.Loaded$lambda$12(loaded2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Modifier modifier42 = modifier3;
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType2 = Component.ComponentType.CASH_BALANCES_HOME_SECTION;
            Modifier modifierAutoLogEvents$default4 = ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default3, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(componentType2, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            int i82 = i3;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                i4 = i82 & 14;
                if (i4 != 4) {
                    zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | (i4 != 4 || ((i82 & 8) != 0 && composerStartRestartGroup.changedInstance(loaded)));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DashboardMcwSection.Loaded$lambda$11$lambda$6$lambda$5(navigator, context, loaded);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM21623defaultHorizontalPaddingrAjV9yQ2, false, null, null, (Function0) objRememberedValue, 7, null), 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, loaded.getData().getTitleData().getLoggingAction(), null, new Component(componentType2, loaded.getData().getTitleData().getLoggingIdentifier(), null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default22);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            boolean z32 = true;
                            BentoText2.m20747BentoText38GnDrw(loaded.getData().getTitleData().getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                            i5 = WhenMappings.$EnumSwitchMapping$0[((LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection())).ordinal()];
                            if (i5 != 1) {
                            }
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2), loaded.getData().getTitleData().getTitle(), bentoTheme2.getColors(composerStartRestartGroup, i72).m21426getFg20d7_KjU(), modifierM5146paddingqDBjuR0$default22, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
                            composerStartRestartGroup.endNode();
                            if (loaded.getData().getDisplayCurrencyBalances().isEmpty()) {
                            }
                            Modifier modifierAutoLogEvents$default32 = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, loaded.getData().getFooterData().getLoggingAction(), null, new Component(Component.ComponentType.CASH_BALANCES_HOME_SECTION, loaded.getData().getFooterData().getLoggingIdentifier(), null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null);
                            String title2 = loaded.getData().getFooterData().getTitle();
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                            if (i4 == 4) {
                            }
                            z2 = z32 | zChangedInstance22;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z2) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.homesection.DashboardMcwSectionKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return DashboardMcwSection.Loaded$lambda$11$lambda$10$lambda$9(navigator, context, loaded2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, title2, modifierAutoLogEvents$default32, null, null, false, null, composerStartRestartGroup, 0, 120);
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier42;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$11$lambda$6$lambda$5(Navigator navigator, Context context, DashboardMcwSectionState.View.Loaded loaded) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(loaded.getData().getTitleData().getDeeplink()), null, DeepLinkOrigin.Internal.INSTANCE, false, null, 52, null);
        return Unit.INSTANCE;
    }

    private static final DashboardMcwSectionState.View DashboardMcwSection$lambda$3(SnapshotState4<? extends DashboardMcwSectionState.View> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$11$lambda$10$lambda$9(Navigator navigator, Context context, DashboardMcwSectionState.View.Loaded loaded) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(loaded.getData().getFooterData().getDeeplink()), null, DeepLinkOrigin.Internal.INSTANCE, false, null, 52, null);
        return Unit.INSTANCE;
    }
}
