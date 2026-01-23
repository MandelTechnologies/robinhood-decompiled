package com.robinhood.android.gold.upgrade.unified.screen.sage;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.navigation.NavHostController;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks;
import com.robinhood.android.gold.lib.sage.GoldSageWebViewComposable;
import com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavController;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposable;
import com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationViewState;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.StreamSageApplicationContentResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldSageApplicationComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001aL\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"GoldSageApplicationComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/screen/sage/GoldSageApplicationDuxo;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/unified/screen/sage/GoldSageApplicationDuxo;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "Loaded", "state", "Lcom/robinhood/android/gold/upgrade/unified/screen/sage/GoldSageApplicationViewState$Loaded;", "navHostController", "Landroidx/navigation/NavHostController;", "onAction", "Lkotlin/Function1;", "Lgold_flow/proto/v1/Action;", "Lkotlin/ParameterName;", "name", "action", "(Lcom/robinhood/android/gold/upgrade/unified/screen/sage/GoldSageApplicationViewState$Loaded;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/unified/screen/sage/GoldSageApplicationViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageApplicationComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSageApplicationComposable$lambda$1(Modifier modifier, GoldSageApplicationDuxo goldSageApplicationDuxo, Screen screen, Context context, int i, int i2, Composer composer, int i3) {
        GoldSageApplicationComposable(modifier, goldSageApplicationDuxo, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$8(GoldSageApplicationViewState.Loaded loaded, NavHostController navHostController, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, navHostController, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldSageApplicationComposable(Modifier modifier, GoldSageApplicationDuxo goldSageApplicationDuxo, Screen screen, Context context, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        GoldSageApplicationDuxo goldSageApplicationDuxo2;
        Screen screen2;
        Context context2;
        GoldSageApplicationDuxo goldSageApplicationDuxo3;
        final Context context3;
        final Modifier modifier3;
        final GoldSageApplicationDuxo goldSageApplicationDuxo4;
        final Modifier modifier4;
        final Context context4;
        final Screen screen3;
        final GoldSageApplicationDuxo goldSageApplicationDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-653698000);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                goldSageApplicationDuxo2 = goldSageApplicationDuxo;
                int i5 = composerStartRestartGroup.changedInstance(goldSageApplicationDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                goldSageApplicationDuxo2 = goldSageApplicationDuxo;
            }
            i3 |= i5;
        } else {
            goldSageApplicationDuxo2 = goldSageApplicationDuxo;
        }
        if ((i & 384) == 0) {
            screen2 = screen;
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changedInstance(screen2)) ? 256 : 128;
        } else {
            screen2 = screen;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                context2 = context;
                i3 |= composerStartRestartGroup.changedInstance(context2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldSageApplicationDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$GoldSageApplicationComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$GoldSageApplicationComposable$$inlined$duxo$1.1
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
                        goldSageApplicationDuxo3 = (GoldSageApplicationDuxo) baseDuxo;
                        i3 &= -113;
                    } else {
                        goldSageApplicationDuxo3 = goldSageApplicationDuxo2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        screen2 = new Screen(Screen.Name.GOLD_SAGE_APPLICATION, null, null, null, 14, null);
                    }
                    if (i6 == 0) {
                        modifier3 = modifier5;
                        goldSageApplicationDuxo4 = goldSageApplicationDuxo3;
                        context3 = null;
                    } else {
                        context3 = context;
                        modifier3 = modifier5;
                        goldSageApplicationDuxo4 = goldSageApplicationDuxo3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                    goldSageApplicationDuxo4 = goldSageApplicationDuxo2;
                    context3 = context2;
                }
                final Screen screen4 = screen2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-653698000, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposable (GoldSageApplicationComposable.kt:35)");
                }
                final NavHostController navController = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldSageApplicationDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(440882587, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt.GoldSageApplicationComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(440882587, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposable.<anonymous> (GoldSageApplicationComposable.kt:45)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU();
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i8).m21371getBg0d7_KjU();
                        Modifier modifier6 = modifier3;
                        final Context context5 = context3;
                        final Screen screen5 = screen4;
                        final GoldSageApplicationDuxo goldSageApplicationDuxo6 = goldSageApplicationDuxo4;
                        final NavHostController navHostController = navController;
                        final SnapshotState4<GoldSageApplicationViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, null, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-1986758804, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt.GoldSageApplicationComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                                int i10;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i9 & 6) == 0) {
                                    i10 = i9 | (composer3.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i10 = i9;
                                }
                                if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1986758804, i10, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposable.<anonymous>.<anonymous> (GoldSageApplicationComposable.kt:50)");
                                }
                                GoldSageApplicationViewState goldSageApplicationViewStateGoldSageApplicationComposable$lambda$0 = GoldSageApplicationComposable3.GoldSageApplicationComposable$lambda$0(snapshotState4);
                                if (goldSageApplicationViewStateGoldSageApplicationComposable$lambda$0 instanceof GoldSageApplicationViewState.Error) {
                                    composer3.startReplaceGroup(1985240039);
                                    GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context5, screen5, null, null, composer3, 0, 12);
                                    composer3.endReplaceGroup();
                                } else if (Intrinsics.areEqual(goldSageApplicationViewStateGoldSageApplicationComposable$lambda$0, GoldSageApplicationViewState.Loading.INSTANCE)) {
                                    composer3.startReplaceGroup(1985246730);
                                    LoadingScreenComposablesKt.PromoLoadingScreenComposable(null, 0, composer3, 0, 3);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (!(goldSageApplicationViewStateGoldSageApplicationComposable$lambda$0 instanceof GoldSageApplicationViewState.Loaded)) {
                                        composer3.startReplaceGroup(1985238022);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(1413211857);
                                    GoldSageApplicationViewState.Loaded loaded = (GoldSageApplicationViewState.Loaded) goldSageApplicationViewStateGoldSageApplicationComposable$lambda$0;
                                    Modifier modifierPadding = PaddingKt.padding(ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen5, null, context5, null, null, 53, null)), paddingValues);
                                    GoldSageApplicationDuxo goldSageApplicationDuxo7 = goldSageApplicationDuxo6;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer3.changedInstance(goldSageApplicationDuxo7);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new GoldSageApplicationComposable4(goldSageApplicationDuxo7);
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer3.endReplaceGroup();
                                    GoldSageApplicationComposable3.Loaded(loaded, navHostController, (Function1) objRememberedValue2, modifierPadding, composer3, 0, 0);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306368, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                context4 = context3;
                screen3 = screen4;
                goldSageApplicationDuxo5 = goldSageApplicationDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                goldSageApplicationDuxo5 = goldSageApplicationDuxo2;
                context4 = context2;
                screen3 = screen2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldSageApplicationComposable3.GoldSageApplicationComposable$lambda$1(modifier4, goldSageApplicationDuxo5, screen3, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        context2 = context;
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i6 == 0) {
                }
                final Screen screen42 = screen2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final NavHostController navController2 = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
                final SnapshotState4<? extends GoldSageApplicationViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldSageApplicationDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen42, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(440882587, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt.GoldSageApplicationComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(440882587, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposable.<anonymous> (GoldSageApplicationComposable.kt:45)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU();
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i8).m21371getBg0d7_KjU();
                        Modifier modifier6 = modifier3;
                        final Context context5 = context3;
                        final Screen screen5 = screen42;
                        final GoldSageApplicationDuxo goldSageApplicationDuxo6 = goldSageApplicationDuxo4;
                        final NavHostController navHostController = navController2;
                        final SnapshotState4<? extends GoldSageApplicationViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, null, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-1986758804, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt.GoldSageApplicationComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                                int i10;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i9 & 6) == 0) {
                                    i10 = i9 | (composer3.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i10 = i9;
                                }
                                if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1986758804, i10, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposable.<anonymous>.<anonymous> (GoldSageApplicationComposable.kt:50)");
                                }
                                GoldSageApplicationViewState goldSageApplicationViewStateGoldSageApplicationComposable$lambda$0 = GoldSageApplicationComposable3.GoldSageApplicationComposable$lambda$0(snapshotState4);
                                if (goldSageApplicationViewStateGoldSageApplicationComposable$lambda$0 instanceof GoldSageApplicationViewState.Error) {
                                    composer3.startReplaceGroup(1985240039);
                                    GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context5, screen5, null, null, composer3, 0, 12);
                                    composer3.endReplaceGroup();
                                } else if (Intrinsics.areEqual(goldSageApplicationViewStateGoldSageApplicationComposable$lambda$0, GoldSageApplicationViewState.Loading.INSTANCE)) {
                                    composer3.startReplaceGroup(1985246730);
                                    LoadingScreenComposablesKt.PromoLoadingScreenComposable(null, 0, composer3, 0, 3);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (!(goldSageApplicationViewStateGoldSageApplicationComposable$lambda$0 instanceof GoldSageApplicationViewState.Loaded)) {
                                        composer3.startReplaceGroup(1985238022);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(1413211857);
                                    GoldSageApplicationViewState.Loaded loaded = (GoldSageApplicationViewState.Loaded) goldSageApplicationViewStateGoldSageApplicationComposable$lambda$0;
                                    Modifier modifierPadding = PaddingKt.padding(ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen5, null, context5, null, null, 53, null)), paddingValues);
                                    GoldSageApplicationDuxo goldSageApplicationDuxo7 = goldSageApplicationDuxo6;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer3.changedInstance(goldSageApplicationDuxo7);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new GoldSageApplicationComposable4(goldSageApplicationDuxo7);
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer3.endReplaceGroup();
                                    GoldSageApplicationComposable3.Loaded(loaded, navHostController, (Function1) objRememberedValue2, modifierPadding, composer3, 0, 0);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306368, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                context4 = context3;
                screen3 = screen42;
                goldSageApplicationDuxo5 = goldSageApplicationDuxo4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loaded(final GoldSageApplicationViewState.Loaded state, final NavHostController navHostController, final Function1<? super Action, Unit> onAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final android.content.Context context;
        String url;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1068862130);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navHostController) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAction) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1068862130, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.Loaded (GoldSageApplicationComposable.kt:82)");
                }
                GoldSageWebViewCallbacks goldSageWebViewCallbacks = new GoldSageWebViewCallbacks() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$Loaded$callbacks$1
                    @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
                    public void onPageFinished(WebView view, String url2) {
                    }

                    @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
                    public void onSageExit(String redirectUrl) {
                        Function1<Action, Unit> function1 = onAction;
                        if (redirectUrl == null) {
                            redirectUrl = "";
                        }
                        function1.invoke(new Action("close_web_view", MapsKt.mapOf(Tuples4.m3642to("redirect_url", redirectUrl)), null, 4, null));
                    }
                };
                StreamSageApplicationContentResponse content = state.getContent();
                context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                url = content.getUrl();
                if (url == null) {
                    url = "";
                }
                ImmutableList3 persistentList = extensions2.toPersistentList(content.getAllowed_urls());
                ImmutableList3 persistentList2 = extensions2.toPersistentList(content.getAllowed_urls_to_open_externally());
                ImmutableList3 persistentList3 = extensions2.toPersistentList(content.getAllowed_urls_to_open_in_app());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GoldSageApplicationComposable3.Loaded$lambda$3$lambda$2(context, (Uri) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GoldSageApplicationComposable3.Loaded$lambda$5$lambda$4(context, (Uri) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(navHostController);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldSageApplicationComposable3.Loaded$lambda$7$lambda$6(navHostController);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                GoldSageWebViewComposable.GoldSageWebViewComposable(goldSageWebViewCallbacks, url, persistentList, persistentList2, persistentList3, function1, function12, (Function0) objRememberedValue3, ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null), composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldSageApplicationComposable3.Loaded$lambda$8(state, navHostController, onAction, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            GoldSageWebViewCallbacks goldSageWebViewCallbacks2 = new GoldSageWebViewCallbacks() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$Loaded$callbacks$1
                @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
                public void onPageFinished(WebView view, String url2) {
                }

                @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
                public void onSageExit(String redirectUrl) {
                    Function1<Action, Unit> function13 = onAction;
                    if (redirectUrl == null) {
                        redirectUrl = "";
                    }
                    function13.invoke(new Action("close_web_view", MapsKt.mapOf(Tuples4.m3642to("redirect_url", redirectUrl)), null, 4, null));
                }
            };
            StreamSageApplicationContentResponse content2 = state.getContent();
            context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            url = content2.getUrl();
            if (url == null) {
            }
            ImmutableList3 persistentList4 = extensions2.toPersistentList(content2.getAllowed_urls());
            ImmutableList3 persistentList22 = extensions2.toPersistentList(content2.getAllowed_urls_to_open_externally());
            ImmutableList3 persistentList32 = extensions2.toPersistentList(content2.getAllowed_urls_to_open_in_app());
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(context);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldSageApplicationComposable3.Loaded$lambda$3$lambda$2(context, (Uri) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                Function1 function13 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GoldSageApplicationComposable3.Loaded$lambda$5$lambda$4(context, (Uri) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    Function1 function122 = (Function1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(navHostController);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GoldSageApplicationComposable3.Loaded$lambda$7$lambda$6(navHostController);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        GoldSageWebViewComposable.GoldSageWebViewComposable(goldSageWebViewCallbacks2, url, persistentList4, persistentList22, persistentList32, function13, function122, (Function0) objRememberedValue3, ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null), composerStartRestartGroup, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldSageApplicationViewState GoldSageApplicationComposable$lambda$0(SnapshotState4<? extends GoldSageApplicationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$3$lambda$2(android.content.Context context, Uri uri) {
        context.startActivity(new Intent("android.intent.action.VIEW", uri));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$5$lambda$4(android.content.Context context, Uri uri) {
        if (uri != null) {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().setShowTitle(true).build();
            Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "build(...)");
            customTabsIntentBuild.launchUrl(context, uri);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$7$lambda$6(NavHostController navHostController) {
        GoldUnifiedNavController.navigateBackOrExit$default(navHostController, null, 1, null);
        return Unit.INSTANCE;
    }
}
