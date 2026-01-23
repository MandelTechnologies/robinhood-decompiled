package com.robinhood.android.gold.upgrade.unified.screen.sage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import com.robinhood.android.gold.lib.sage.GoldSageBottomBar3;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposable;
import com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposable4;
import com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationViewState;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.GoldSageMortgageOption;
import gold_flow.proto.p466v1.GoldSageMortgageType;
import gold_flow.proto.p466v1.StreamSageStartApplicationContentResponse;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.Icon;

/* compiled from: GoldSageStartApplicationComposable.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001aD\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2#\u0010\u000e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0014\u001aI\u0010\u0015\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eH\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010!¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002"}, m3636d2 = {"GoldSageStartApplicationComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/screen/sage/GoldSageStartApplicationDuxo;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/unified/screen/sage/GoldSageStartApplicationDuxo;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "Loaded", "state", "Lcom/robinhood/android/gold/upgrade/unified/screen/sage/GoldSageStartApplicationViewState$Loaded;", "onAction", "Lkotlin/Function1;", "Lgold_flow/proto/v1/Action;", "Lkotlin/ParameterName;", "name", "action", "(Lcom/robinhood/android/gold/upgrade/unified/screen/sage/GoldSageStartApplicationViewState$Loaded;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Content", "selectedType", "Lgold_flow/proto/v1/GoldSageMortgageType;", "onClickAction", "Lgold_flow/proto/v1/GoldSageMortgageOption;", "title", "", "descriptionMarkdown", "options", "Lkotlinx/collections/immutable/ImmutableList;", "(Lgold_flow/proto/v1/GoldSageMortgageType;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)V", "ContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/unified/screen/sage/GoldSageStartApplicationViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageStartApplicationComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$8(GoldSageMortgageType goldSageMortgageType, Function1 function1, String str, String str2, ImmutableList immutableList, int i, Composer composer, int i2) {
        Content(goldSageMortgageType, function1, str, str2, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContentPreview$lambda$12(int i, Composer composer, int i2) {
        ContentPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSageStartApplicationComposable$lambda$1(Modifier modifier, GoldSageStartApplicationDuxo goldSageStartApplicationDuxo, Screen screen, Context context, int i, int i2, Composer composer, int i3) {
        GoldSageStartApplicationComposable(modifier, goldSageStartApplicationDuxo, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$2(GoldSageStartApplicationViewState.Loaded loaded, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
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
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldSageStartApplicationComposable(Modifier modifier, GoldSageStartApplicationDuxo goldSageStartApplicationDuxo, Screen screen, Context context, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        GoldSageStartApplicationDuxo goldSageStartApplicationDuxo2;
        Screen screen2;
        Context context2;
        GoldSageStartApplicationDuxo goldSageStartApplicationDuxo3;
        Context context3;
        final Modifier modifier3;
        final GoldSageStartApplicationDuxo goldSageStartApplicationDuxo4;
        CreationExtras defaultViewModelCreationExtras;
        final Modifier modifier4;
        final Screen screen3;
        final GoldSageStartApplicationDuxo goldSageStartApplicationDuxo5;
        final Context context4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(985708270);
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
                goldSageStartApplicationDuxo2 = goldSageStartApplicationDuxo;
                int i5 = composerStartRestartGroup.changedInstance(goldSageStartApplicationDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                goldSageStartApplicationDuxo2 = goldSageStartApplicationDuxo;
            }
            i3 |= i5;
        } else {
            goldSageStartApplicationDuxo2 = goldSageStartApplicationDuxo;
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldSageStartApplicationDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$$inlined$duxo$1.1
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
                        goldSageStartApplicationDuxo3 = (GoldSageStartApplicationDuxo) baseDuxo;
                        i3 &= -113;
                    } else {
                        goldSageStartApplicationDuxo3 = goldSageStartApplicationDuxo2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        screen2 = new Screen(Screen.Name.GOLD_SAGE_START_APPLICATION, null, null, null, 14, null);
                    }
                    if (i6 == 0) {
                        modifier3 = modifier5;
                        goldSageStartApplicationDuxo4 = goldSageStartApplicationDuxo3;
                        context3 = null;
                    } else {
                        context3 = context;
                        modifier3 = modifier5;
                        goldSageStartApplicationDuxo4 = goldSageStartApplicationDuxo3;
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
                    goldSageStartApplicationDuxo4 = goldSageStartApplicationDuxo2;
                    context3 = context2;
                }
                final Screen screen4 = screen2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(985708270, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposable (GoldSageStartApplicationComposable.kt:48)");
                }
                final NavHostController navController = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldSageStartApplicationDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Context context5 = context3;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-525772253, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.1
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
                            ComposerKt.traceEventStart(-525772253, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposable.<anonymous> (GoldSageStartApplicationComposable.kt:58)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU();
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i8).m21371getBg0d7_KjU();
                        Modifier modifier6 = modifier3;
                        final NavHostController navHostController = navController;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(164197607, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.1.1
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
                                    ComposerKt.traceEventStart(164197607, i9, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:63)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Function2<Composer, Integer, Unit> function2M15176getLambda$1511183916$feature_gold_upgrade_externalRelease = GoldSageStartApplicationComposable2.INSTANCE.m15176getLambda$1511183916$feature_gold_upgrade_externalRelease();
                                final NavHostController navHostController2 = navHostController;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M15176getLambda$1511183916$feature_gold_upgrade_externalRelease, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(1113718056, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i10) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i10 & 6) == 0) {
                                            i10 |= (i10 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i10 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1113718056, i10, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:65)");
                                        }
                                        NavHostController navHostController3 = navHostController2;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer4.changedInstance(navHostController3);
                                        Object objRememberedValue2 = composer4.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new GoldSageStartApplicationComposable5(navHostController3);
                                            composer4.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer4.endReplaceGroup();
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue2, composer4, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final Context context6 = context5;
                        final Screen screen5 = screen4;
                        final GoldSageStartApplicationDuxo goldSageStartApplicationDuxo6 = goldSageStartApplicationDuxo4;
                        final SnapshotState4<GoldSageStartApplicationViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(1131166770, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.1.2
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
                                    ComposerKt.traceEventStart(1131166770, i10, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:70)");
                                }
                                GoldSageStartApplicationViewState goldSageStartApplicationViewStateGoldSageStartApplicationComposable$lambda$0 = GoldSageStartApplicationComposable4.GoldSageStartApplicationComposable$lambda$0(snapshotState4);
                                if (goldSageStartApplicationViewStateGoldSageStartApplicationComposable$lambda$0 instanceof GoldSageStartApplicationViewState.Error) {
                                    composer3.startReplaceGroup(424544205);
                                    GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context6, screen5, null, null, composer3, 0, 12);
                                    composer3.endReplaceGroup();
                                } else if (Intrinsics.areEqual(goldSageStartApplicationViewStateGoldSageStartApplicationComposable$lambda$0, GoldSageStartApplicationViewState.Loading.INSTANCE)) {
                                    composer3.startReplaceGroup(424551200);
                                    LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 2, composer3, 3504, 1);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (!(goldSageStartApplicationViewStateGoldSageStartApplicationComposable$lambda$0 instanceof GoldSageStartApplicationViewState.Loaded)) {
                                        composer3.startReplaceGroup(424542132);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(424559168);
                                    GoldSageStartApplicationViewState.Loaded loaded = (GoldSageStartApplicationViewState.Loaded) goldSageStartApplicationViewStateGoldSageStartApplicationComposable$lambda$0;
                                    GoldSageStartApplicationDuxo goldSageStartApplicationDuxo7 = goldSageStartApplicationDuxo6;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer3.changedInstance(goldSageStartApplicationDuxo7);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new GoldSageStartApplicationComposable6(goldSageStartApplicationDuxo7);
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer3.endReplaceGroup();
                                    GoldSageStartApplicationComposable4.Loaded(loaded, (Function1) objRememberedValue2, PaddingKt.padding(ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen5, null, context6, null, null, 53, null)), paddingValues), composer3, 0, 0);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306416, 316);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                screen3 = screen4;
                goldSageStartApplicationDuxo5 = goldSageStartApplicationDuxo4;
                context4 = context3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                goldSageStartApplicationDuxo5 = goldSageStartApplicationDuxo2;
                context4 = context2;
                screen3 = screen2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldSageStartApplicationComposable4.GoldSageStartApplicationComposable$lambda$1(modifier4, goldSageStartApplicationDuxo5, screen3, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                final SnapshotState4<? extends GoldSageStartApplicationViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldSageStartApplicationDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Context context52 = context3;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen42, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-525772253, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.1
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
                            ComposerKt.traceEventStart(-525772253, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposable.<anonymous> (GoldSageStartApplicationComposable.kt:58)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU();
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i8).m21371getBg0d7_KjU();
                        Modifier modifier6 = modifier3;
                        final NavHostController navHostController = navController2;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(164197607, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.1.1
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
                                    ComposerKt.traceEventStart(164197607, i9, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:63)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Function2<Composer, Integer, Unit> function2M15176getLambda$1511183916$feature_gold_upgrade_externalRelease = GoldSageStartApplicationComposable2.INSTANCE.m15176getLambda$1511183916$feature_gold_upgrade_externalRelease();
                                final NavHostController navHostController2 = navHostController;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M15176getLambda$1511183916$feature_gold_upgrade_externalRelease, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(1113718056, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i10) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i10 & 6) == 0) {
                                            i10 |= (i10 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i10 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1113718056, i10, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:65)");
                                        }
                                        NavHostController navHostController3 = navHostController2;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer4.changedInstance(navHostController3);
                                        Object objRememberedValue2 = composer4.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new GoldSageStartApplicationComposable5(navHostController3);
                                            composer4.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer4.endReplaceGroup();
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue2, composer4, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final Context context6 = context52;
                        final Screen screen5 = screen42;
                        final GoldSageStartApplicationDuxo goldSageStartApplicationDuxo6 = goldSageStartApplicationDuxo4;
                        final SnapshotState4<? extends GoldSageStartApplicationViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(1131166770, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.1.2
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
                                    ComposerKt.traceEventStart(1131166770, i10, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:70)");
                                }
                                GoldSageStartApplicationViewState goldSageStartApplicationViewStateGoldSageStartApplicationComposable$lambda$0 = GoldSageStartApplicationComposable4.GoldSageStartApplicationComposable$lambda$0(snapshotState4);
                                if (goldSageStartApplicationViewStateGoldSageStartApplicationComposable$lambda$0 instanceof GoldSageStartApplicationViewState.Error) {
                                    composer3.startReplaceGroup(424544205);
                                    GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context6, screen5, null, null, composer3, 0, 12);
                                    composer3.endReplaceGroup();
                                } else if (Intrinsics.areEqual(goldSageStartApplicationViewStateGoldSageStartApplicationComposable$lambda$0, GoldSageStartApplicationViewState.Loading.INSTANCE)) {
                                    composer3.startReplaceGroup(424551200);
                                    LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 2, composer3, 3504, 1);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (!(goldSageStartApplicationViewStateGoldSageStartApplicationComposable$lambda$0 instanceof GoldSageStartApplicationViewState.Loaded)) {
                                        composer3.startReplaceGroup(424542132);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(424559168);
                                    GoldSageStartApplicationViewState.Loaded loaded = (GoldSageStartApplicationViewState.Loaded) goldSageStartApplicationViewStateGoldSageStartApplicationComposable$lambda$0;
                                    GoldSageStartApplicationDuxo goldSageStartApplicationDuxo7 = goldSageStartApplicationDuxo6;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer3.changedInstance(goldSageStartApplicationDuxo7);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new GoldSageStartApplicationComposable6(goldSageStartApplicationDuxo7);
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer3.endReplaceGroup();
                                    GoldSageStartApplicationComposable4.Loaded(loaded, (Function1) objRememberedValue2, PaddingKt.padding(ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen5, null, context6, null, null, 53, null)), paddingValues), composer3, 0, 0);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306416, 316);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                screen3 = screen42;
                goldSageStartApplicationDuxo5 = goldSageStartApplicationDuxo4;
                context4 = context3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldSageMortgageType ContentPreview$lambda$10(SnapshotState<GoldSageMortgageType> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldSageStartApplicationViewState GoldSageStartApplicationComposable$lambda$0(SnapshotState4<? extends GoldSageStartApplicationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final void Loaded(final GoldSageStartApplicationViewState.Loaded state, final Function1<? super Action, Unit> onAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(325724905);
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
            i3 |= composerStartRestartGroup.changedInstance(onAction) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(325724905, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.Loaded (GoldSageStartApplicationComposable.kt:104)");
            }
            StreamSageStartApplicationContentResponse content = state.getContent();
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier3, false, ComposableLambda3.rememberComposableLambda(1959727828, true, new C182991(content, onAction), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-267975423, true, new C183002(content, onAction), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageStartApplicationComposable4.Loaded$lambda$2(state, onAction, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldSageStartApplicationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$Loaded$1 */
    static final class C182991 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ StreamSageStartApplicationContentResponse $content;
        final /* synthetic */ Function1<Action, Unit> $onAction;

        /* JADX WARN: Multi-variable type inference failed */
        C182991(StreamSageStartApplicationContentResponse streamSageStartApplicationContentResponse, Function1<? super Action, Unit> function1) {
            this.$content = streamSageStartApplicationContentResponse;
            this.$onAction = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1959727828, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.Loaded.<anonymous> (GoldSageStartApplicationComposable.kt:108)");
            }
            Cta cta = this.$content.getCta();
            if (cta != null) {
                final StreamSageStartApplicationContentResponse streamSageStartApplicationContentResponse = this.$content;
                final Function1<Action, Unit> function1 = this.$onAction;
                String text = cta.getText();
                Cta secondary_cta = streamSageStartApplicationContentResponse.getSecondary_cta();
                String text2 = secondary_cta != null ? secondary_cta.getText() : null;
                Icon cta_icon = streamSageStartApplicationContentResponse.getCta_icon();
                String cta_disclosure = streamSageStartApplicationContentResponse.getCta_disclosure();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(streamSageStartApplicationContentResponse);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$Loaded$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldSageStartApplicationComposable4.C182991.invoke$lambda$4$lambda$1$lambda$0(function1, streamSageStartApplicationContentResponse);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer.changed(function1) | composer.changedInstance(streamSageStartApplicationContentResponse);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$Loaded$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldSageStartApplicationComposable4.C182991.invoke$lambda$4$lambda$3$lambda$2(function1, streamSageStartApplicationContentResponse);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                GoldSageBottomBar3.GoldSageBottomBar(text, function0, null, cta_icon, cta_disclosure, text2, (Function0) objRememberedValue2, false, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(Function1 function1, StreamSageStartApplicationContentResponse streamSageStartApplicationContentResponse) {
            Cta cta = streamSageStartApplicationContentResponse.getCta();
            function1.invoke(cta != null ? cta.getAction() : null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function1 function1, StreamSageStartApplicationContentResponse streamSageStartApplicationContentResponse) {
            Cta secondary_cta = streamSageStartApplicationContentResponse.getSecondary_cta();
            function1.invoke(secondary_cta != null ? secondary_cta.getAction() : null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ContentPreview$lambda$11(SnapshotState<GoldSageMortgageType> snapshotState, GoldSageMortgageType goldSageMortgageType) {
        snapshotState.setValue(goldSageMortgageType);
    }

    /* compiled from: GoldSageStartApplicationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$Loaded$2 */
    static final class C183002 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ StreamSageStartApplicationContentResponse $content;
        final /* synthetic */ Function1<Action, Unit> $onAction;

        /* JADX WARN: Multi-variable type inference failed */
        C183002(StreamSageStartApplicationContentResponse streamSageStartApplicationContentResponse, Function1<? super Action, Unit> function1) {
            this.$content = streamSageStartApplicationContentResponse;
            this.$onAction = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-267975423, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.Loaded.<anonymous> (GoldSageStartApplicationComposable.kt:121)");
            }
            GoldSageMortgageType selected_mortgage_type = this.$content.getSelected_mortgage_type();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onAction);
            final Function1<Action, Unit> function1 = this.$onAction;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$Loaded$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldSageStartApplicationComposable4.C183002.invoke$lambda$1$lambda$0(function1, (GoldSageMortgageOption) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            String title = this.$content.getTitle();
            String str = title == null ? "" : title;
            String description_markdown = this.$content.getDescription_markdown();
            GoldSageStartApplicationComposable4.Content(selected_mortgage_type, function12, str, description_markdown == null ? "" : description_markdown, extensions2.toPersistentList(this.$content.getOptions()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, GoldSageMortgageOption option) {
            Intrinsics.checkNotNullParameter(option, "option");
            function1.invoke(option.getOn_select_action());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(final GoldSageMortgageType goldSageMortgageType, final Function1<? super GoldSageMortgageOption, Unit> function1, final String str, final String str2, final ImmutableList<GoldSageMortgageOption> immutableList, Composer composer, final int i) {
        String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1687483301);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(goldSageMortgageType == null ? -1 : goldSageMortgageType.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1687483301, i2, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.Content (GoldSageStartApplicationComposable.kt:140)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            int i3 = i2;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            BentoText2.m20747BentoText38GnDrw(str3, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium(), composerStartRestartGroup, (i3 >> 6) & 14, 0, 8190);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            BentoMarkdownText2.BentoMarkdownText(str2, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, (i3 >> 9) & 14, 30);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(245246929);
            for (final GoldSageMortgageOption goldSageMortgageOption : immutableList) {
                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                String title = goldSageMortgageOption.getTitle();
                if (title == null) {
                    title = "";
                }
                String str4 = title;
                boolean z = goldSageMortgageType == goldSageMortgageOption.getMortgage_type();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(goldSageMortgageOption) | ((i3 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldSageStartApplicationComposable4.Content$lambda$7$lambda$6$lambda$5$lambda$4(function1, goldSageMortgageOption);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer2 = composerStartRestartGroup;
                BentoSelectionRow2.BentoSelectionRow(null, type2, str4, z, null, false, null, false, false, false, (Function0) objRememberedValue, composer2, 48, 0, 1009);
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageStartApplicationComposable4.Content$lambda$8(goldSageMortgageType, function1, str, str2, immutableList, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$7$lambda$6$lambda$5$lambda$4(Function1 function1, GoldSageMortgageOption goldSageMortgageOption) {
        function1.invoke(goldSageMortgageOption);
        return Unit.INSTANCE;
    }

    private static final void ContentPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1533844282);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1533844282, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.ContentPreview (GoldSageStartApplicationComposable.kt:162)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(GoldSageMortgageType.NEW, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1141546366, true, new C182951((SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageStartApplicationComposable4.ContentPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldSageStartApplicationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$ContentPreview$1 */
    static final class C182951 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<GoldSageMortgageType> $selectedType$delegate;

        C182951(SnapshotState<GoldSageMortgageType> snapshotState) {
            this.$selectedType$delegate = snapshotState;
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
                ComposerKt.traceEventStart(-1141546366, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.ContentPreview.<anonymous> (GoldSageStartApplicationComposable.kt:166)");
            }
            GoldSageMortgageType goldSageMortgageTypeContentPreview$lambda$10 = GoldSageStartApplicationComposable4.ContentPreview$lambda$10(this.$selectedType$delegate);
            composer.startReplaceGroup(5004770);
            final SnapshotState<GoldSageMortgageType> snapshotState = this.$selectedType$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$ContentPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldSageStartApplicationComposable4.C182951.invoke$lambda$1$lambda$0(snapshotState, (GoldSageMortgageOption) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GoldSageStartApplicationComposable4.Content(goldSageMortgageTypeContentPreview$lambda$10, (Function1) objRememberedValue, "First step—what’s your goal?", "Tell us more about your home ownership goal to kick off your application with Sage.", extensions2.persistentListOf(new GoldSageMortgageOption("I’m buying a new home", GoldSageMortgageType.NEW, null, null, 12, null), new GoldSageMortgageOption("I’m refinancing my home", GoldSageMortgageType.REFINANCE, null, null, 12, null)), composer, 3504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, GoldSageMortgageOption option) {
            Intrinsics.checkNotNullParameter(option, "option");
            GoldSageMortgageType mortgage_type = option.getMortgage_type();
            if (mortgage_type == null) {
                mortgage_type = GoldSageMortgageType.NEW;
            }
            GoldSageStartApplicationComposable4.ContentPreview$lambda$11(snapshotState, mortgage_type);
            return Unit.INSTANCE;
        }
    }
}
