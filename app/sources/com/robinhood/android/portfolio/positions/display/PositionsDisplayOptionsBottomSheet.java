package com.robinhood.android.portfolio.positions.display;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Modifier;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.portfolio.contracts.PositionsDisplayOptionsKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PositionsDisplayOptionsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001a7\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, m3636d2 = {"PositionsDisplayOptionsBottomSheetContent", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/portfolio/contracts/PositionsDisplayOptionsKey;", "modifier", "Landroidx/compose/ui/Modifier;", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "duxo", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsDuxo;", "onDisplayTypeSelected", "Lkotlin/Function0;", "(Lcom/robinhood/android/portfolio/contracts/PositionsDisplayOptionsKey;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PositionsDisplayOptionsBottomSheet", "onDismiss", "(Lcom/robinhood/android/portfolio/contracts/PositionsDisplayOptionsKey;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-positions_externalDebug", "viewState", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PositionsDisplayOptionsBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionsDisplayOptionsBottomSheet$lambda$13(PositionsDisplayOptionsKey positionsDisplayOptionsKey, UserInteractionEventDescriptor userInteractionEventDescriptor, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        PositionsDisplayOptionsBottomSheet(positionsDisplayOptionsKey, userInteractionEventDescriptor, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionsDisplayOptionsBottomSheetContent$lambda$7(PositionsDisplayOptionsKey positionsDisplayOptionsKey, Modifier modifier, UserInteractionEventDescriptor userInteractionEventDescriptor, PositionsDisplayOptionsDuxo positionsDisplayOptionsDuxo, Function0 function0, int i, int i2, Composer composer, int i3) {
        PositionsDisplayOptionsBottomSheetContent(positionsDisplayOptionsKey, modifier, userInteractionEventDescriptor, positionsDisplayOptionsDuxo, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PositionsDisplayOptionsBottomSheetContent(PositionsDisplayOptionsKey positionsDisplayOptionsKey, Modifier modifier, UserInteractionEventDescriptor userInteractionEventDescriptor, PositionsDisplayOptionsDuxo positionsDisplayOptionsDuxo, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        UserInteractionEventDescriptor userInteractionEventDescriptor2;
        PositionsDisplayOptionsDuxo positionsDisplayOptionsDuxo2;
        int i5;
        Function0<Unit> function02;
        UserInteractionEventDescriptor userInteractionEventDescriptor3;
        int i6;
        int i7;
        Modifier modifier3;
        int i8;
        final PositionsDisplayOptionsDuxo positionsDisplayOptionsDuxo3;
        final Function0<Unit> function03;
        final EventLogger current;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean z;
        int i9;
        UserInteractionEventDescriptor userInteractionEventDescriptor4;
        Function1 function1;
        Modifier modifierAutoLogEvents$default;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final PositionsDisplayOptionsDuxo positionsDisplayOptionsDuxo4;
        final Modifier modifier4;
        final UserInteractionEventDescriptor userInteractionEventDescriptor5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final PositionsDisplayOptionsKey data = positionsDisplayOptionsKey;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-28622333);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    i3 |= composerStartRestartGroup.changedInstance(userInteractionEventDescriptor2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        positionsDisplayOptionsDuxo2 = positionsDisplayOptionsDuxo;
                        int i11 = composerStartRestartGroup.changedInstance(positionsDisplayOptionsDuxo2) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        positionsDisplayOptionsDuxo2 = positionsDisplayOptionsDuxo;
                    }
                    i3 |= i11;
                } else {
                    positionsDisplayOptionsDuxo2 = positionsDisplayOptionsDuxo;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            userInteractionEventDescriptor3 = i4 == 0 ? null : userInteractionEventDescriptor2;
                            if ((i2 & 8) == 0) {
                                String str = "positions_display_bottom_sheet_" + data.getInstrumentType().getServerValue() + "_" + data.getAccountNumber();
                                composerStartRestartGroup.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current2 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                i6 = -1633490746;
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PositionsDisplayOptionsDuxo.class), current2, str, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt$PositionsDisplayOptionsBottomSheetContent$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt$PositionsDisplayOptionsBottomSheetContent$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                i3 &= -7169;
                                positionsDisplayOptionsDuxo2 = (PositionsDisplayOptionsDuxo) baseDuxo;
                            } else {
                                i6 = -1633490746;
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                i7 = i3;
                                modifier3 = modifier5;
                                i8 = i6;
                                function03 = (Function0) objRememberedValue4;
                                positionsDisplayOptionsDuxo3 = positionsDisplayOptionsDuxo2;
                            } else {
                                i7 = i3;
                                modifier3 = modifier5;
                                i8 = i6;
                                positionsDisplayOptionsDuxo3 = positionsDisplayOptionsDuxo2;
                                function03 = function0;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            i7 = i3;
                            modifier3 = modifier2;
                            userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                            positionsDisplayOptionsDuxo3 = positionsDisplayOptionsDuxo2;
                            function03 = function02;
                            i8 = -1633490746;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-28622333, i7, -1, "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetContent (PositionsDisplayOptionsBottomSheet.kt:35)");
                        }
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        Composer composer2 = composerStartRestartGroup;
                        composerStartRestartGroup = composer2;
                        PositionsDisplayOptionsViewState positionsDisplayOptionsViewStatePositionsDisplayOptionsBottomSheetContent$lambda$2 = PositionsDisplayOptionsBottomSheetContent$lambda$2(FlowExtKt.collectAsStateWithLifecycle(positionsDisplayOptionsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7));
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor3) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(positionsDisplayOptionsDuxo3) | composerStartRestartGroup.changedInstance(data) | ((57344 & i7) != 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z = false;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor6 = userInteractionEventDescriptor3;
                            i9 = i8;
                            Function1 function12 = new Function1() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PositionsDisplayOptionsBottomSheet.PositionsDisplayOptionsBottomSheetContent$lambda$4$lambda$3(userInteractionEventDescriptor6, current, positionsDisplayOptionsDuxo3, data, function03, (String) obj);
                                }
                            };
                            userInteractionEventDescriptor4 = userInteractionEventDescriptor6;
                            data = data;
                            composerStartRestartGroup.updateRememberedValue(function12);
                            objRememberedValue = function12;
                        } else {
                            z = false;
                            userInteractionEventDescriptor4 = userInteractionEventDescriptor3;
                            i9 = i8;
                        }
                        Function1 function13 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        if (userInteractionEventDescriptor4 == null ? true : z) {
                            function1 = function13;
                            modifierAutoLogEvents$default = modifier3;
                        } else {
                            function1 = function13;
                            modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier3, userInteractionEventDescriptor4, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        }
                        PositionsDisplayOptionsComposable3.PositionsDisplayOptionsComposable(positionsDisplayOptionsViewStatePositionsDisplayOptionsBottomSheetContent$lambda$2, function1, modifierAutoLogEvents$default, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.startReplaceGroup(i9);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(positionsDisplayOptionsDuxo3) | composerStartRestartGroup.changedInstance(data);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new PositionsDisplayOptionsBottomSheet3(positionsDisplayOptionsDuxo3, data, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(data, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i7 & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        positionsDisplayOptionsDuxo4 = positionsDisplayOptionsDuxo3;
                        modifier4 = modifier3;
                        userInteractionEventDescriptor5 = userInteractionEventDescriptor4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        userInteractionEventDescriptor5 = userInteractionEventDescriptor2;
                        positionsDisplayOptionsDuxo4 = positionsDisplayOptionsDuxo2;
                        function03 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PositionsDisplayOptionsBottomSheet.PositionsDisplayOptionsBottomSheetContent$lambda$7(data, modifier4, userInteractionEventDescriptor5, positionsDisplayOptionsDuxo4, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i3 & 9363) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 8) == 0) {
                        }
                        if (i5 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        Composer composer22 = composerStartRestartGroup;
                        composerStartRestartGroup = composer22;
                        PositionsDisplayOptionsViewState positionsDisplayOptionsViewStatePositionsDisplayOptionsBottomSheetContent$lambda$22 = PositionsDisplayOptionsBottomSheetContent$lambda$2(FlowExtKt.collectAsStateWithLifecycle(positionsDisplayOptionsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer22, 0, 7));
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor3) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(positionsDisplayOptionsDuxo3) | composerStartRestartGroup.changedInstance(data) | ((57344 & i7) != 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            z = false;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor62 = userInteractionEventDescriptor3;
                            i9 = i8;
                            Function1 function122 = new Function1() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PositionsDisplayOptionsBottomSheet.PositionsDisplayOptionsBottomSheetContent$lambda$4$lambda$3(userInteractionEventDescriptor62, current, positionsDisplayOptionsDuxo3, data, function03, (String) obj);
                                }
                            };
                            userInteractionEventDescriptor4 = userInteractionEventDescriptor62;
                            data = data;
                            composerStartRestartGroup.updateRememberedValue(function122);
                            objRememberedValue = function122;
                            Function1 function132 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            if (userInteractionEventDescriptor4 == null ? true : z) {
                            }
                            PositionsDisplayOptionsComposable3.PositionsDisplayOptionsComposable(positionsDisplayOptionsViewStatePositionsDisplayOptionsBottomSheetContent$lambda$22, function1, modifierAutoLogEvents$default, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.startReplaceGroup(i9);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(positionsDisplayOptionsDuxo3) | composerStartRestartGroup.changedInstance(data);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2) {
                                objRememberedValue2 = new PositionsDisplayOptionsBottomSheet3(positionsDisplayOptionsDuxo3, data, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(data, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i7 & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                positionsDisplayOptionsDuxo4 = positionsDisplayOptionsDuxo3;
                                modifier4 = modifier3;
                                userInteractionEventDescriptor5 = userInteractionEventDescriptor4;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            userInteractionEventDescriptor2 = userInteractionEventDescriptor;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        userInteractionEventDescriptor2 = userInteractionEventDescriptor;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionsDisplayOptionsBottomSheetContent$lambda$4$lambda$3(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, PositionsDisplayOptionsDuxo positionsDisplayOptionsDuxo, PositionsDisplayOptionsKey positionsDisplayOptionsKey, Function0 function0, String displayType) {
        String str;
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        if (userInteractionEventDescriptor != null) {
            str = displayType;
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.ROW, displayType, null, 4, null), new ComponentHierarchy(userInteractionEventDescriptor.getComponent(), null, null, null, null, 30, null), null, false, 49, null);
        } else {
            str = displayType;
        }
        positionsDisplayOptionsDuxo.onDisplayValueSelected(str, positionsDisplayOptionsKey);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PositionsDisplayOptionsBottomSheet(final PositionsDisplayOptionsKey data, final UserInteractionEventDescriptor eventDescriptor, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        final SheetState sheetStateRememberModalBottomSheetState;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(eventDescriptor, "eventDescriptor");
        Composer composerStartRestartGroup = composer.startRestartGroup(371288428);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventDescriptor) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier;
                if (i5 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function03 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    function03 = function02;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(371288428, i3, -1, "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheet (PositionsDisplayOptionsBottomSheet.kt:80)");
                }
                sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PositionsDisplayOptionsBottomSheet.PositionsDisplayOptionsBottomSheet$lambda$12$lambda$11(coroutineScope, sheetStateRememberModalBottomSheetState, function03);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final Function0 function04 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier3;
                GenericActionHandlerKt.SduiModalBottomSheet(function04, sheetStateRememberModalBottomSheetState, modifier4, ComposableLambda3.rememberComposableLambda(-188029544, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt.PositionsDisplayOptionsBottomSheet.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                        invoke(column5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 SduiModalBottomSheet, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                        if ((i6 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-188029544, i6, -1, "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheet.<anonymous> (PositionsDisplayOptionsBottomSheet.kt:97)");
                        }
                        final PositionsDisplayOptionsKey positionsDisplayOptionsKey = data;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor = eventDescriptor;
                        final Function0<Unit> function05 = function04;
                        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-917398218, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt.PositionsDisplayOptionsBottomSheet.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-917398218, i7, -1, "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheet.<anonymous>.<anonymous> (PositionsDisplayOptionsBottomSheet.kt:98)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                PositionsDisplayOptionsBottomSheet.PositionsDisplayOptionsBottomSheetContent(positionsDisplayOptionsKey, PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 1, null), userInteractionEventDescriptor, null, function05, composer3, 0, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 896) | 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                function03 = function02;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PositionsDisplayOptionsBottomSheet.PositionsDisplayOptionsBottomSheet$lambda$13(data, eventDescriptor, modifier2, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        function02 = function0;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PositionsDisplayOptionsBottomSheet.PositionsDisplayOptionsBottomSheet$lambda$12$lambda$11(coroutineScope, sheetStateRememberModalBottomSheetState, function03);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                final Function0<Unit> function042 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier42 = modifier3;
                GenericActionHandlerKt.SduiModalBottomSheet(function042, sheetStateRememberModalBottomSheetState, modifier42, ComposableLambda3.rememberComposableLambda(-188029544, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt.PositionsDisplayOptionsBottomSheet.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                        invoke(column5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 SduiModalBottomSheet, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                        if ((i6 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-188029544, i6, -1, "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheet.<anonymous> (PositionsDisplayOptionsBottomSheet.kt:97)");
                        }
                        final PositionsDisplayOptionsKey positionsDisplayOptionsKey = data;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor = eventDescriptor;
                        final Function0<Unit> function05 = function042;
                        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-917398218, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt.PositionsDisplayOptionsBottomSheet.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-917398218, i7, -1, "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheet.<anonymous>.<anonymous> (PositionsDisplayOptionsBottomSheet.kt:98)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                PositionsDisplayOptionsBottomSheet.PositionsDisplayOptionsBottomSheetContent(positionsDisplayOptionsKey, PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 1, null), userInteractionEventDescriptor, null, function05, composer3, 0, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 896) | 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final PositionsDisplayOptionsViewState PositionsDisplayOptionsBottomSheetContent$lambda$2(SnapshotState4<? extends PositionsDisplayOptionsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionsDisplayOptionsBottomSheet$lambda$12$lambda$11(CoroutineScope coroutineScope, SheetState sheetState, final Function0 function0) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PositionsDisplayOptionsBottomSheet2(sheetState, null), 3, null).invokeOnCompletion(new Function1() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheetKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsDisplayOptionsBottomSheet.PositionsDisplayOptionsBottomSheet$lambda$12$lambda$11$lambda$10(function0, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionsDisplayOptionsBottomSheet$lambda$12$lambda$11$lambda$10(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
