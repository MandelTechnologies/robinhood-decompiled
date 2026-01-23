package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
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
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposable;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionViewState;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.StreamSuggestedActionContentResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: GoldUnifiedSuggestedActionComposable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a7\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001aD\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132#\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00070\u00152\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001a\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002"}, m3636d2 = {"SuggestedActionImageTestTag", "", "getSuggestedActionImageTestTag$annotations", "()V", "SuggestedActionPrimaryCtaTestTag", "getSuggestedActionPrimaryCtaTestTag$annotations", "GoldUnifiedSuggestedActionComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSuggestedActionDuxo;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSuggestedActionDuxo;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "Loaded", "state", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSuggestedActionViewState$Loaded;", "onAction", "Lkotlin/Function1;", "Lgold_flow/proto/v1/Action;", "Lkotlin/ParameterName;", "name", "action", "(Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSuggestedActionViewState$Loaded;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSuggestedActionViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedSuggestedActionComposable {
    public static final String SuggestedActionImageTestTag = "suggestedActionImage";
    public static final String SuggestedActionPrimaryCtaTestTag = "suggested_action_primary_cta";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedSuggestedActionComposable$lambda$1(Modifier modifier, GoldUnifiedSuggestedActionDuxo goldUnifiedSuggestedActionDuxo, Screen screen, Context context, int i, int i2, Composer composer, int i3) {
        GoldUnifiedSuggestedActionComposable(modifier, goldUnifiedSuggestedActionDuxo, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$2(GoldUnifiedSuggestedActionViewState.Loaded loaded, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getSuggestedActionImageTestTag$annotations() {
    }

    public static /* synthetic */ void getSuggestedActionPrimaryCtaTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUnifiedSuggestedActionComposable(Modifier modifier, GoldUnifiedSuggestedActionDuxo goldUnifiedSuggestedActionDuxo, Screen screen, Context context, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        GoldUnifiedSuggestedActionDuxo goldUnifiedSuggestedActionDuxo2;
        Screen screen2;
        Context context2;
        boolean z;
        final Context context3;
        final Modifier modifier3;
        final GoldUnifiedSuggestedActionDuxo goldUnifiedSuggestedActionDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        final Screen screen3;
        final Context context4;
        final GoldUnifiedSuggestedActionDuxo goldUnifiedSuggestedActionDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1544400493);
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
                goldUnifiedSuggestedActionDuxo2 = goldUnifiedSuggestedActionDuxo;
                int i5 = composerStartRestartGroup.changedInstance(goldUnifiedSuggestedActionDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                goldUnifiedSuggestedActionDuxo2 = goldUnifiedSuggestedActionDuxo;
            }
            i3 |= i5;
        } else {
            goldUnifiedSuggestedActionDuxo2 = goldUnifiedSuggestedActionDuxo;
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
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        CreationExtras creationExtras = defaultViewModelCreationExtras;
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldUnifiedSuggestedActionDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt$GoldUnifiedSuggestedActionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt$GoldUnifiedSuggestedActionComposable$$inlined$duxo$1.1
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
                        goldUnifiedSuggestedActionDuxo2 = (GoldUnifiedSuggestedActionDuxo) baseDuxo;
                        i3 &= -113;
                    } else {
                        z = false;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        screen2 = new Screen(Screen.Name.GOLD_SUGGESTED_ACTION, null, null, null, 14, null);
                    }
                    if (i6 == 0) {
                        modifier3 = modifier5;
                        goldUnifiedSuggestedActionDuxo3 = goldUnifiedSuggestedActionDuxo2;
                        context3 = null;
                    } else {
                        context3 = context;
                        modifier3 = modifier5;
                        goldUnifiedSuggestedActionDuxo3 = goldUnifiedSuggestedActionDuxo2;
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
                    goldUnifiedSuggestedActionDuxo3 = goldUnifiedSuggestedActionDuxo2;
                    context3 = context2;
                    z = false;
                }
                final Screen screen4 = screen2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1544400493, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposable (GoldUnifiedSuggestedActionComposable.kt:50)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedSuggestedActionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                OverrideSystemBarsStyle.OverrideStatusBarStyle(z, composerStartRestartGroup, 6);
                Context context5 = context3;
                Composer composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1779247067, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt.GoldUnifiedSuggestedActionComposable.1
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
                            ComposerKt.traceEventStart(-1779247067, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposable.<anonymous> (GoldUnifiedSuggestedActionComposable.kt:57)");
                        }
                        GoldUnifiedSuggestedActionViewState goldUnifiedSuggestedActionViewStateGoldUnifiedSuggestedActionComposable$lambda$0 = GoldUnifiedSuggestedActionComposable.GoldUnifiedSuggestedActionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (goldUnifiedSuggestedActionViewStateGoldUnifiedSuggestedActionComposable$lambda$0 instanceof GoldUnifiedSuggestedActionViewState.Error) {
                            composer3.startReplaceGroup(-459444204);
                            GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context3, screen4, null, null, composer3, 0, 12);
                            composer3.endReplaceGroup();
                        } else if (Intrinsics.areEqual(goldUnifiedSuggestedActionViewStateGoldUnifiedSuggestedActionComposable$lambda$0, GoldUnifiedSuggestedActionViewState.Loading.INSTANCE)) {
                            composer3.startReplaceGroup(-459436978);
                            final Modifier modifier6 = modifier3;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1373363627, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt.GoldUnifiedSuggestedActionComposable.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                    invoke(paddingValues, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i8 & 6) == 0) {
                                        i8 |= composer4.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1373363627, i8, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposable.<anonymous>.<anonymous> (GoldUnifiedSuggestedActionComposable.kt:65)");
                                    }
                                    LoadingScreenComposablesKt.PromoLoadingScreenComposable(PaddingKt.padding(Background3.m4872backgroundbw27NRU$default(modifier6, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), paddingValues), 2, composer4, 48, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 805306368, 511);
                            composer3.endReplaceGroup();
                        } else {
                            if (!(goldUnifiedSuggestedActionViewStateGoldUnifiedSuggestedActionComposable$lambda$0 instanceof GoldUnifiedSuggestedActionViewState.Loaded)) {
                                composer3.startReplaceGroup(-459446140);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-459424357);
                            GoldUnifiedSuggestedActionViewState.Loaded loaded = (GoldUnifiedSuggestedActionViewState.Loaded) goldUnifiedSuggestedActionViewStateGoldUnifiedSuggestedActionComposable$lambda$0;
                            GoldUnifiedSuggestedActionDuxo goldUnifiedSuggestedActionDuxo5 = goldUnifiedSuggestedActionDuxo3;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(goldUnifiedSuggestedActionDuxo5);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new GoldUnifiedSuggestedActionComposable2(goldUnifiedSuggestedActionDuxo5);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            GoldUnifiedSuggestedActionComposable.Loaded(loaded, (Function1) objRememberedValue2, ModifiersKt.logScreenTransitions(modifier3, new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null)), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                composerStartRestartGroup = composer2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                screen3 = screen4;
                context4 = context5;
                goldUnifiedSuggestedActionDuxo4 = goldUnifiedSuggestedActionDuxo3;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                goldUnifiedSuggestedActionDuxo4 = goldUnifiedSuggestedActionDuxo2;
                context4 = context2;
                screen3 = screen2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedSuggestedActionComposable.GoldUnifiedSuggestedActionComposable$lambda$1(modifier4, goldUnifiedSuggestedActionDuxo4, screen3, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                final SnapshotState4<? extends GoldUnifiedSuggestedActionViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedSuggestedActionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                OverrideSystemBarsStyle.OverrideStatusBarStyle(z, composerStartRestartGroup, 6);
                Context context52 = context3;
                Composer composer22 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1779247067, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt.GoldUnifiedSuggestedActionComposable.1
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
                            ComposerKt.traceEventStart(-1779247067, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposable.<anonymous> (GoldUnifiedSuggestedActionComposable.kt:57)");
                        }
                        GoldUnifiedSuggestedActionViewState goldUnifiedSuggestedActionViewStateGoldUnifiedSuggestedActionComposable$lambda$0 = GoldUnifiedSuggestedActionComposable.GoldUnifiedSuggestedActionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                        if (goldUnifiedSuggestedActionViewStateGoldUnifiedSuggestedActionComposable$lambda$0 instanceof GoldUnifiedSuggestedActionViewState.Error) {
                            composer3.startReplaceGroup(-459444204);
                            GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context3, screen42, null, null, composer3, 0, 12);
                            composer3.endReplaceGroup();
                        } else if (Intrinsics.areEqual(goldUnifiedSuggestedActionViewStateGoldUnifiedSuggestedActionComposable$lambda$0, GoldUnifiedSuggestedActionViewState.Loading.INSTANCE)) {
                            composer3.startReplaceGroup(-459436978);
                            final Modifier modifier6 = modifier3;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1373363627, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt.GoldUnifiedSuggestedActionComposable.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                    invoke(paddingValues, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i8 & 6) == 0) {
                                        i8 |= composer4.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1373363627, i8, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposable.<anonymous>.<anonymous> (GoldUnifiedSuggestedActionComposable.kt:65)");
                                    }
                                    LoadingScreenComposablesKt.PromoLoadingScreenComposable(PaddingKt.padding(Background3.m4872backgroundbw27NRU$default(modifier6, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), paddingValues), 2, composer4, 48, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 805306368, 511);
                            composer3.endReplaceGroup();
                        } else {
                            if (!(goldUnifiedSuggestedActionViewStateGoldUnifiedSuggestedActionComposable$lambda$0 instanceof GoldUnifiedSuggestedActionViewState.Loaded)) {
                                composer3.startReplaceGroup(-459446140);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-459424357);
                            GoldUnifiedSuggestedActionViewState.Loaded loaded = (GoldUnifiedSuggestedActionViewState.Loaded) goldUnifiedSuggestedActionViewStateGoldUnifiedSuggestedActionComposable$lambda$0;
                            GoldUnifiedSuggestedActionDuxo goldUnifiedSuggestedActionDuxo5 = goldUnifiedSuggestedActionDuxo3;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(goldUnifiedSuggestedActionDuxo5);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new GoldUnifiedSuggestedActionComposable2(goldUnifiedSuggestedActionDuxo5);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            GoldUnifiedSuggestedActionComposable.Loaded(loaded, (Function1) objRememberedValue2, ModifiersKt.logScreenTransitions(modifier3, new UserInteractionEventDescriptor(null, screen42, null, context3, null, null, 53, null)), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer22, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                composerStartRestartGroup = composer22;
                if (ComposerKt.isTraceInProgress()) {
                }
                screen3 = screen42;
                context4 = context52;
                goldUnifiedSuggestedActionDuxo4 = goldUnifiedSuggestedActionDuxo3;
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldUnifiedSuggestedActionViewState GoldUnifiedSuggestedActionComposable$lambda$0(SnapshotState4<? extends GoldUnifiedSuggestedActionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loaded(final GoldUnifiedSuggestedActionViewState.Loaded loaded, final Function1<? super Action, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1796460116);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1796460116, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded (GoldUnifiedSuggestedActionComposable.kt:93)");
                }
                int i5 = ((i3 >> 6) & 14) | 805306752;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, null, ComposableLambda3.rememberComposableLambda(587469255, true, new C182591(loaded, function1), composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1313111741, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt.Loaded.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        int i7;
                        int i8;
                        int i9;
                        Composer composer4;
                        Composer composer5;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1313111741, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous> (GoldUnifiedSuggestedActionComposable.kt:108)");
                        }
                        StreamSuggestedActionContentResponse content = loaded.getContent();
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(modifierFillMaxHeight$default, bentoTheme.getColors(composer3, i10).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), composer3, 0, 0);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getBottom(), centerHorizontally, composer3, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getBottom(), companion2.getStart(), composer3, 6);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        String asset_path = content.getAsset_path();
                        composer3.startReplaceGroup(1465123076);
                        if (asset_path == null) {
                            i8 = 0;
                            composer4 = composer3;
                            i9 = i10;
                        } else {
                            i8 = 0;
                            i9 = i10;
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(asset_path, null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer3, 0, 62), (String) null, TestTag3.testTag(SizeKt.fillMaxWidth$default(AspectRatio3.aspectRatio$default(companion, 1.0f, false, 2, null), 0.0f, 1, null), "suggestedActionImage"), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 25008, 104);
                            composer4 = composer3;
                        }
                        composer4.endReplaceGroup();
                        composer4.endNode();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer4, i9).m21591getLargeD9Ej5fM()), composer4, i8);
                        String title = content.getTitle();
                        composer4.startReplaceGroup(-301533159);
                        if (title == null) {
                            composer5 = composer4;
                        } else {
                            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer4, i9).getDisplayCapsuleLarge();
                            int i11 = i9;
                            composer5 = composer3;
                            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer5, 0, 0, 8126);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer5, i11).m21590getDefaultD9Ej5fM()), composer5, 0);
                        }
                        composer5.endReplaceGroup();
                        String description = content.getDescription();
                        composer5.startReplaceGroup(-301521625);
                        if (description != null) {
                            BentoText2.m20747BentoText38GnDrw(description, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16318);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i5, 506);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedSuggestedActionComposable.Loaded$lambda$2(loaded, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = ((i3 >> 6) & 14) | 805306752;
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, null, ComposableLambda3.rememberComposableLambda(587469255, true, new C182591(loaded, function1), composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1313111741, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt.Loaded.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    int i7;
                    int i8;
                    int i9;
                    Composer composer4;
                    Composer composer5;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1313111741, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous> (GoldUnifiedSuggestedActionComposable.kt:108)");
                    }
                    StreamSuggestedActionContentResponse content = loaded.getContent();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(modifierFillMaxHeight$default, bentoTheme.getColors(composer3, i10).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), composer3, 0, 0);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getBottom(), centerHorizontally, composer3, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getBottom(), companion2.getStart(), composer3, 6);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    String asset_path = content.getAsset_path();
                    composer3.startReplaceGroup(1465123076);
                    if (asset_path == null) {
                        i8 = 0;
                        composer4 = composer3;
                        i9 = i10;
                    } else {
                        i8 = 0;
                        i9 = i10;
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(asset_path, null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer3, 0, 62), (String) null, TestTag3.testTag(SizeKt.fillMaxWidth$default(AspectRatio3.aspectRatio$default(companion, 1.0f, false, 2, null), 0.0f, 1, null), "suggestedActionImage"), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 25008, 104);
                        composer4 = composer3;
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer4, i9).m21591getLargeD9Ej5fM()), composer4, i8);
                    String title = content.getTitle();
                    composer4.startReplaceGroup(-301533159);
                    if (title == null) {
                        composer5 = composer4;
                    } else {
                        TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer4, i9).getDisplayCapsuleLarge();
                        int i11 = i9;
                        composer5 = composer3;
                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer5, 0, 0, 8126);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer5, i11).m21590getDefaultD9Ej5fM()), composer5, 0);
                    }
                    composer5.endReplaceGroup();
                    String description = content.getDescription();
                    composer5.startReplaceGroup(-301521625);
                    if (description != null) {
                        BentoText2.m20747BentoText38GnDrw(description, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16318);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i52, 506);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: GoldUnifiedSuggestedActionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt$Loaded$1 */
    static final class C182591 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<Action, Unit> $onAction;
        final /* synthetic */ GoldUnifiedSuggestedActionViewState.Loaded $state;

        /* JADX WARN: Multi-variable type inference failed */
        C182591(GoldUnifiedSuggestedActionViewState.Loaded loaded, Function1<? super Action, Unit> function1) {
            this.$state = loaded;
            this.$onAction = function1;
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
                ComposerKt.traceEventStart(587469255, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous> (GoldUnifiedSuggestedActionComposable.kt:96)");
            }
            Cta cta = this.$state.getContent().getCta();
            String text = cta != null ? cta.getText() : null;
            String disclosure_markdown = this.$state.getContent().getDisclosure_markdown();
            Cta secondary_cta = this.$state.getContent().getSecondary_cta();
            String text2 = secondary_cta != null ? secondary_cta.getText() : null;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$onAction);
            final GoldUnifiedSuggestedActionViewState.Loaded loaded = this.$state;
            final Function1<Action, Unit> function1 = this.$onAction;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt$Loaded$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldUnifiedSuggestedActionComposable.C182591.invoke$lambda$2$lambda$1(loaded, function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(this.$state) | composer.changed(this.$onAction);
            final GoldUnifiedSuggestedActionViewState.Loaded loaded2 = this.$state;
            final Function1<Action, Unit> function12 = this.$onAction;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposableKt$Loaded$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldUnifiedSuggestedActionComposable.C182591.invoke$lambda$5$lambda$4(loaded2, function12);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            GoldUnifiedBottomBar.GoldUnifiedBottomBar(text, function0, GoldUnifiedSuggestedActionComposable.SuggestedActionPrimaryCtaTestTag, modifierM4872backgroundbw27NRU$default, disclosure_markdown, false, false, null, text2, (Function0) objRememberedValue2, composer, 384, 224);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(GoldUnifiedSuggestedActionViewState.Loaded loaded, Function1 function1) {
            Action action;
            Cta cta = loaded.getContent().getCta();
            if (cta != null && (action = cta.getAction()) != null) {
                function1.invoke(action);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(GoldUnifiedSuggestedActionViewState.Loaded loaded, Function1 function1) {
            Action action;
            Cta secondary_cta = loaded.getContent().getSecondary_cta();
            if (secondary_cta != null && (action = secondary_cta.getAction()) != null) {
                function1.invoke(action);
            }
            return Unit.INSTANCE;
        }
    }
}
