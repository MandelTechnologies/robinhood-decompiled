package com.robinhood.android.dashboard.lib.footer;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import rh_server_driven_ui.p531v1.GenericActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: DashboardFooterContent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"DashboardFooterContent", "", "accountNumber", "", "isFooterVisible", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/dashboard/lib/footer/DashboardFooterDuxo;", "(Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lcom/robinhood/android/dashboard/lib/footer/DashboardFooterDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-account-home_externalDebug", "hasAnimated", "viewState", "Lcom/robinhood/android/dashboard/lib/footer/DashboardFooterViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardFooterContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardFooterContent$lambda$8(String str, boolean z, Modifier modifier, DashboardFooterDuxo dashboardFooterDuxo, int i, int i2, Composer composer, int i3) {
        DashboardFooterContent(str, z, modifier, dashboardFooterDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DashboardFooterContent(final String accountNumber, final boolean z, Modifier modifier, DashboardFooterDuxo dashboardFooterDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DashboardFooterDuxo dashboardFooterDuxo2;
        int i4;
        boolean z2;
        Composer composer2;
        final Modifier modifier3;
        final DashboardFooterDuxo dashboardFooterDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Composer composer3;
        boolean zChanged;
        Object objRememberedValue3;
        final DashboardFooterDuxo dashboardFooterDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(530427301);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    dashboardFooterDuxo2 = dashboardFooterDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(dashboardFooterDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    dashboardFooterDuxo2 = dashboardFooterDuxo;
                }
                i3 |= i6;
            } else {
                dashboardFooterDuxo2 = dashboardFooterDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        Modifier modifier6 = modifier5;
                        i4 = -1633490746;
                        z2 = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DashboardFooterDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt$DashboardFooterContent$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt$DashboardFooterContent$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer2, 0);
                        composer2.endReplaceGroup();
                        dashboardFooterDuxo3 = (DashboardFooterDuxo) baseDuxo;
                        i3 &= -7169;
                        modifier3 = modifier6;
                    } else {
                        Modifier modifier7 = modifier5;
                        i4 = -1633490746;
                        z2 = false;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier7;
                        dashboardFooterDuxo3 = dashboardFooterDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                    dashboardFooterDuxo3 = dashboardFooterDuxo2;
                    i4 = -1633490746;
                    z2 = false;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(530427301, i3, -1, "com.robinhood.android.dashboard.lib.footer.DashboardFooterContent (DashboardFooterContent.kt:27)");
                }
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(i4);
                int i7 = i3 & 14;
                zChangedInstance = composer2.changedInstance(dashboardFooterDuxo3) | (i7 != 4 ? true : z2);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DashboardFooterContent.DashboardFooterContent$lambda$5$lambda$4(dashboardFooterDuxo3, accountNumber, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composer2.endReplaceGroup();
                boolean z3 = z2;
                Composer composer4 = composer2;
                LifecycleEffectKt.LifecycleResumeEffect(accountNumber, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) function1, composer4, i7, 2);
                DashboardFooterDuxo dashboardFooterDuxo5 = dashboardFooterDuxo3;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dashboardFooterDuxo5.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                ImmutableList<UIComponentDto> footerContents = DashboardFooterContent$lambda$6(snapshotState4CollectAsStateWithLifecycle).getFooterContents();
                composer3.startReplaceGroup(i4);
                zChanged = composer3.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue3 = composer3.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new DashboardFooterContent2(snapshotState4CollectAsStateWithLifecycle, snapshotState, null);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                composer3.endReplaceGroup();
                EffectsKt.LaunchedEffect(footerContents, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer3, z3 ? 1 : 0);
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1462725488, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt.DashboardFooterContent.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i8) {
                        if ((i8 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1462725488, i8, -1, "com.robinhood.android.dashboard.lib.footer.DashboardFooterContent.<anonymous> (DashboardFooterContent.kt:45)");
                        }
                        boolean z4 = z && DashboardFooterContent.DashboardFooterContent$lambda$1(snapshotState);
                        final SnapshotState4<DashboardFooterViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        AnimatedFooterContent.AnimatedFooterContent(z4, ComposableLambda3.rememberComposableLambda(1209336927, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt.DashboardFooterContent.3.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i9) {
                                if ((i9 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1209336927, i9, -1, "com.robinhood.android.dashboard.lib.footer.DashboardFooterContent.<anonymous>.<anonymous> (DashboardFooterContent.kt:49)");
                                }
                                final SnapshotState4<DashboardFooterViewState> snapshotState42 = snapshotState4;
                                GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(294789105, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt.DashboardFooterContent.3.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                        invoke(composer7, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer7, int i10) {
                                        if ((i10 & 3) == 2 && composer7.getSkipping()) {
                                            composer7.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(294789105, i10, -1, "com.robinhood.android.dashboard.lib.footer.DashboardFooterContent.<anonymous>.<anonymous>.<anonymous> (DashboardFooterContent.kt:50)");
                                        }
                                        ImmutableList<UIComponentDto> footerContents2 = DashboardFooterContent.DashboardFooterContent$lambda$6(snapshotState42).getFooterContents();
                                        ArrayList arrayList = new ArrayList();
                                        Iterator<UIComponentDto> it = footerContents2.iterator();
                                        while (it.hasNext()) {
                                            UIComponentDto.ConcreteDto concrete = it.next().getConcrete();
                                            if (concrete != null) {
                                                arrayList.add(concrete);
                                            }
                                        }
                                        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                                        composer7.startReplaceGroup(1849434622);
                                        Object objRememberedValue5 = composer7.rememberedValue();
                                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = DashboardFooterContent3.INSTANCE;
                                            composer7.updateRememberedValue(objRememberedValue5);
                                        }
                                        composer7.endReplaceGroup();
                                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer7, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                                        HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                        composer7.startReplaceGroup(40010095);
                                        SduiColumnsIdl.SduiColumn(immutableList, (Function1) ((KFunction) objRememberedValue5), GenericActionDto.class, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer7, 806879280, 0);
                                        composer7.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer6, 54), composer6, 24576, 15);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), modifier3, composer5, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                dashboardFooterDuxo4 = dashboardFooterDuxo5;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                dashboardFooterDuxo4 = dashboardFooterDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DashboardFooterContent.DashboardFooterContent$lambda$8(accountNumber, z, modifier4, dashboardFooterDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(i4);
                int i72 = i3 & 14;
                zChangedInstance = composer2.changedInstance(dashboardFooterDuxo3) | (i72 != 4 ? true : z2);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DashboardFooterContent.DashboardFooterContent$lambda$5$lambda$4(dashboardFooterDuxo3, accountNumber, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                    Function1 function12 = (Function1) objRememberedValue2;
                    composer2.endReplaceGroup();
                    boolean z32 = z2;
                    Composer composer42 = composer2;
                    LifecycleEffectKt.LifecycleResumeEffect(accountNumber, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) function12, composer42, i72, 2);
                    DashboardFooterDuxo dashboardFooterDuxo52 = dashboardFooterDuxo3;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dashboardFooterDuxo52.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                    composer3 = composer42;
                    ImmutableList<UIComponentDto> footerContents2 = DashboardFooterContent$lambda$6(snapshotState4CollectAsStateWithLifecycle).getFooterContents();
                    composer3.startReplaceGroup(i4);
                    zChanged = composer3.changed(snapshotState4CollectAsStateWithLifecycle);
                    objRememberedValue3 = composer3.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new DashboardFooterContent2(snapshotState4CollectAsStateWithLifecycle, snapshotState, null);
                        composer3.updateRememberedValue(objRememberedValue3);
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(footerContents2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer3, z32 ? 1 : 0);
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1462725488, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt.DashboardFooterContent.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i8) {
                                if ((i8 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1462725488, i8, -1, "com.robinhood.android.dashboard.lib.footer.DashboardFooterContent.<anonymous> (DashboardFooterContent.kt:45)");
                                }
                                boolean z4 = z && DashboardFooterContent.DashboardFooterContent$lambda$1(snapshotState);
                                final SnapshotState4<DashboardFooterViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                AnimatedFooterContent.AnimatedFooterContent(z4, ComposableLambda3.rememberComposableLambda(1209336927, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt.DashboardFooterContent.3.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer6, int i9) {
                                        if ((i9 & 3) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1209336927, i9, -1, "com.robinhood.android.dashboard.lib.footer.DashboardFooterContent.<anonymous>.<anonymous> (DashboardFooterContent.kt:49)");
                                        }
                                        final SnapshotState4<DashboardFooterViewState> snapshotState42 = snapshotState4;
                                        GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(294789105, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt.DashboardFooterContent.3.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                invoke(composer7, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer7, int i10) {
                                                if ((i10 & 3) == 2 && composer7.getSkipping()) {
                                                    composer7.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(294789105, i10, -1, "com.robinhood.android.dashboard.lib.footer.DashboardFooterContent.<anonymous>.<anonymous>.<anonymous> (DashboardFooterContent.kt:50)");
                                                }
                                                ImmutableList<UIComponentDto> footerContents22 = DashboardFooterContent.DashboardFooterContent$lambda$6(snapshotState42).getFooterContents();
                                                ArrayList arrayList = new ArrayList();
                                                Iterator<UIComponentDto> it = footerContents22.iterator();
                                                while (it.hasNext()) {
                                                    UIComponentDto.ConcreteDto concrete = it.next().getConcrete();
                                                    if (concrete != null) {
                                                        arrayList.add(concrete);
                                                    }
                                                }
                                                ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                                                composer7.startReplaceGroup(1849434622);
                                                Object objRememberedValue5 = composer7.rememberedValue();
                                                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue5 = DashboardFooterContent3.INSTANCE;
                                                    composer7.updateRememberedValue(objRememberedValue5);
                                                }
                                                composer7.endReplaceGroup();
                                                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer7, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                                                HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                                composer7.startReplaceGroup(40010095);
                                                SduiColumnsIdl.SduiColumn(immutableList, (Function1) ((KFunction) objRememberedValue5), GenericActionDto.class, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer7, 806879280, 0);
                                                composer7.endReplaceGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer6, 54), composer6, 24576, 15);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer5, 54), modifier3, composer5, 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        dashboardFooterDuxo4 = dashboardFooterDuxo52;
                        modifier4 = modifier3;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DashboardFooterContent$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult DashboardFooterContent$lambda$5$lambda$4(DashboardFooterDuxo dashboardFooterDuxo, String str, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = dashboardFooterDuxo.bind(str);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt$DashboardFooterContent$lambda$5$lambda$4$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DashboardFooterContent$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DashboardFooterViewState DashboardFooterContent$lambda$6(SnapshotState4<DashboardFooterViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
