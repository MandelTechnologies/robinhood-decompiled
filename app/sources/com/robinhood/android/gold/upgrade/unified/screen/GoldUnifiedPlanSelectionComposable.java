package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.RadioButtonColors;
import androidx.compose.material3.RadioButtonDefaults;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
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
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposable;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionViewState;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.GoldPlanSelectionOption;
import gold_flow.proto.p466v1.StreamPlanSelectionContentResponse;
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
import microgram.p507ui.p508v1.ProgressBar;

/* compiled from: GoldUnifiedPlanSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a7\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a5\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u00152\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00012\b\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\"\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002"}, m3636d2 = {"PlanSelectionRadioTestTag", "", "getPlanSelectionRadioTestTag$annotations", "()V", "PlanSelectionCtaTestTag", "getPlanSelectionCtaTestTag$annotations", "GoldUnifiedPlanSelectionComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedPlanSelectionDuxo;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedPlanSelectionDuxo;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "Loaded", "planSelection", "Lgold_flow/proto/v1/StreamPlanSelectionContentResponse;", "onAction", "Lkotlin/Function1;", "Lgold_flow/proto/v1/Action;", "(Lgold_flow/proto/v1/StreamPlanSelectionContentResponse;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlanOption", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lgold_flow/proto/v1/GoldPlanSelectionOption;", "onSelectOption", "Lkotlin/Function0;", "(Lgold_flow/proto/v1/GoldPlanSelectionOption;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TopBar", "title", "progressBar", "Lmicrogram/ui/v1/ProgressBar;", "(Ljava/lang/String;Lmicrogram/ui/v1/ProgressBar;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedPlanSelectionViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedPlanSelectionComposable {
    public static final String PlanSelectionCtaTestTag = "plan_selection_cta";
    public static final String PlanSelectionRadioTestTag = "gold_unified_plan_selection_radio";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedPlanSelectionComposable$lambda$1(Modifier modifier, GoldUnifiedPlanSelectionDuxo goldUnifiedPlanSelectionDuxo, Screen screen, Context context, int i, int i2, Composer composer, int i3) {
        GoldUnifiedPlanSelectionComposable(modifier, goldUnifiedPlanSelectionDuxo, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$3(StreamPlanSelectionContentResponse streamPlanSelectionContentResponse, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(streamPlanSelectionContentResponse, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlanOption$lambda$13(GoldPlanSelectionOption goldPlanSelectionOption, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlanOption(goldPlanSelectionOption, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBar$lambda$14(String str, ProgressBar progressBar, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TopBar(str, progressBar, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPlanSelectionCtaTestTag$annotations() {
    }

    public static /* synthetic */ void getPlanSelectionRadioTestTag$annotations() {
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
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUnifiedPlanSelectionComposable(Modifier modifier, GoldUnifiedPlanSelectionDuxo goldUnifiedPlanSelectionDuxo, Screen screen, Context context, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        GoldUnifiedPlanSelectionDuxo goldUnifiedPlanSelectionDuxo2;
        Screen screen2;
        Context context2;
        GoldUnifiedPlanSelectionDuxo goldUnifiedPlanSelectionDuxo3;
        final Context context3;
        final Modifier modifier3;
        final GoldUnifiedPlanSelectionDuxo goldUnifiedPlanSelectionDuxo4;
        CreationExtras defaultViewModelCreationExtras;
        final Context context4;
        final Screen screen3;
        final GoldUnifiedPlanSelectionDuxo goldUnifiedPlanSelectionDuxo5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(635686255);
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
                goldUnifiedPlanSelectionDuxo2 = goldUnifiedPlanSelectionDuxo;
                int i5 = composerStartRestartGroup.changedInstance(goldUnifiedPlanSelectionDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                goldUnifiedPlanSelectionDuxo2 = goldUnifiedPlanSelectionDuxo;
            }
            i3 |= i5;
        } else {
            goldUnifiedPlanSelectionDuxo2 = goldUnifiedPlanSelectionDuxo;
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldUnifiedPlanSelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$GoldUnifiedPlanSelectionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$GoldUnifiedPlanSelectionComposable$$inlined$duxo$1.1
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
                        goldUnifiedPlanSelectionDuxo3 = (GoldUnifiedPlanSelectionDuxo) baseDuxo;
                        i3 &= -113;
                    } else {
                        goldUnifiedPlanSelectionDuxo3 = goldUnifiedPlanSelectionDuxo2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        screen2 = new Screen(Screen.Name.GOLD_PLAN_SELECTION, null, null, null, 14, null);
                    }
                    if (i6 == 0) {
                        modifier3 = modifier5;
                        goldUnifiedPlanSelectionDuxo4 = goldUnifiedPlanSelectionDuxo3;
                        context3 = null;
                    } else {
                        context3 = context;
                        modifier3 = modifier5;
                        goldUnifiedPlanSelectionDuxo4 = goldUnifiedPlanSelectionDuxo3;
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
                    goldUnifiedPlanSelectionDuxo4 = goldUnifiedPlanSelectionDuxo2;
                    context3 = context2;
                }
                final Screen screen4 = screen2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(635686255, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposable (GoldUnifiedPlanSelectionComposable.kt:66)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedPlanSelectionDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(1817525530, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt.GoldUnifiedPlanSelectionComposable.1
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
                            ComposerKt.traceEventStart(1817525530, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposable.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:69)");
                        }
                        GoldUnifiedPlanSelectionViewState goldUnifiedPlanSelectionViewStateGoldUnifiedPlanSelectionComposable$lambda$0 = GoldUnifiedPlanSelectionComposable.GoldUnifiedPlanSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (goldUnifiedPlanSelectionViewStateGoldUnifiedPlanSelectionComposable$lambda$0 instanceof GoldUnifiedPlanSelectionViewState.Error) {
                            composer2.startReplaceGroup(-1409651831);
                            GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context3, screen4, null, null, composer2, 0, 12);
                            composer2.endReplaceGroup();
                        } else if (goldUnifiedPlanSelectionViewStateGoldUnifiedPlanSelectionComposable$lambda$0 instanceof GoldUnifiedPlanSelectionViewState.Loaded) {
                            composer2.startReplaceGroup(-1409645273);
                            StreamPlanSelectionContentResponse content = ((GoldUnifiedPlanSelectionViewState.Loaded) goldUnifiedPlanSelectionViewStateGoldUnifiedPlanSelectionComposable$lambda$0).getContent();
                            GoldUnifiedPlanSelectionDuxo goldUnifiedPlanSelectionDuxo6 = goldUnifiedPlanSelectionDuxo4;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer2.changedInstance(goldUnifiedPlanSelectionDuxo6);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new GoldUnifiedPlanSelectionComposable2(goldUnifiedPlanSelectionDuxo6);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            GoldUnifiedPlanSelectionComposable.Loaded(content, (Function1) objRememberedValue2, ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), composer2, 0, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(goldUnifiedPlanSelectionViewStateGoldUnifiedPlanSelectionComposable$lambda$0 instanceof GoldUnifiedPlanSelectionViewState.Loading)) {
                                composer2.startReplaceGroup(-1409654033);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-1409637675);
                            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-163497014, true, new AnonymousClass2(modifier3), composer2, 54), composer2, 3078, 6);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: GoldUnifiedPlanSelectionComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$GoldUnifiedPlanSelectionComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Modifier $modifier;

                        AnonymousClass2(Modifier modifier) {
                            this.$modifier = modifier;
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
                                ComposerKt.traceEventStart(-163497014, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposable.<anonymous>.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:82)");
                            }
                            StreamPlanSelectionContentResponse content = GoldUnifiedPlanSelectionViewState.INSTANCE.getLoadingMock$feature_gold_upgrade_externalRelease().getContent();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$GoldUnifiedPlanSelectionComposable$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return GoldUnifiedPlanSelectionComposable.C182381.AnonymousClass2.invoke$lambda$1$lambda$0((Action) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            GoldUnifiedPlanSelectionComposable.Loaded(content, (Function1) objRememberedValue, this.$modifier, composer, 48, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Action action) {
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                context4 = context3;
                screen3 = screen4;
                goldUnifiedPlanSelectionDuxo5 = goldUnifiedPlanSelectionDuxo4;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                goldUnifiedPlanSelectionDuxo5 = goldUnifiedPlanSelectionDuxo2;
                context4 = context2;
                screen3 = screen2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedPlanSelectionComposable.GoldUnifiedPlanSelectionComposable$lambda$1(modifier4, goldUnifiedPlanSelectionDuxo5, screen3, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                final SnapshotState4<? extends GoldUnifiedPlanSelectionViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedPlanSelectionDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen42, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(1817525530, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt.GoldUnifiedPlanSelectionComposable.1
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
                            ComposerKt.traceEventStart(1817525530, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposable.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:69)");
                        }
                        GoldUnifiedPlanSelectionViewState goldUnifiedPlanSelectionViewStateGoldUnifiedPlanSelectionComposable$lambda$0 = GoldUnifiedPlanSelectionComposable.GoldUnifiedPlanSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                        if (goldUnifiedPlanSelectionViewStateGoldUnifiedPlanSelectionComposable$lambda$0 instanceof GoldUnifiedPlanSelectionViewState.Error) {
                            composer2.startReplaceGroup(-1409651831);
                            GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context3, screen42, null, null, composer2, 0, 12);
                            composer2.endReplaceGroup();
                        } else if (goldUnifiedPlanSelectionViewStateGoldUnifiedPlanSelectionComposable$lambda$0 instanceof GoldUnifiedPlanSelectionViewState.Loaded) {
                            composer2.startReplaceGroup(-1409645273);
                            StreamPlanSelectionContentResponse content = ((GoldUnifiedPlanSelectionViewState.Loaded) goldUnifiedPlanSelectionViewStateGoldUnifiedPlanSelectionComposable$lambda$0).getContent();
                            GoldUnifiedPlanSelectionDuxo goldUnifiedPlanSelectionDuxo6 = goldUnifiedPlanSelectionDuxo4;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer2.changedInstance(goldUnifiedPlanSelectionDuxo6);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new GoldUnifiedPlanSelectionComposable2(goldUnifiedPlanSelectionDuxo6);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            GoldUnifiedPlanSelectionComposable.Loaded(content, (Function1) objRememberedValue2, ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), composer2, 0, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(goldUnifiedPlanSelectionViewStateGoldUnifiedPlanSelectionComposable$lambda$0 instanceof GoldUnifiedPlanSelectionViewState.Loading)) {
                                composer2.startReplaceGroup(-1409654033);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-1409637675);
                            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-163497014, true, new AnonymousClass2(modifier3), composer2, 54), composer2, 3078, 6);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: GoldUnifiedPlanSelectionComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$GoldUnifiedPlanSelectionComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Modifier $modifier;

                        AnonymousClass2(Modifier modifier) {
                            this.$modifier = modifier;
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
                                ComposerKt.traceEventStart(-163497014, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposable.<anonymous>.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:82)");
                            }
                            StreamPlanSelectionContentResponse content = GoldUnifiedPlanSelectionViewState.INSTANCE.getLoadingMock$feature_gold_upgrade_externalRelease().getContent();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$GoldUnifiedPlanSelectionComposable$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return GoldUnifiedPlanSelectionComposable.C182381.AnonymousClass2.invoke$lambda$1$lambda$0((Action) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            GoldUnifiedPlanSelectionComposable.Loaded(content, (Function1) objRememberedValue, this.$modifier, composer, 48, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Action action) {
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                context4 = context3;
                screen3 = screen42;
                goldUnifiedPlanSelectionDuxo5 = goldUnifiedPlanSelectionDuxo4;
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldUnifiedPlanSelectionViewState GoldUnifiedPlanSelectionComposable$lambda$0(SnapshotState4<? extends GoldUnifiedPlanSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loaded(final StreamPlanSelectionContentResponse streamPlanSelectionContentResponse, final Function1<? super Action, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(957357232);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(streamPlanSelectionContentResponse) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(957357232, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded (GoldUnifiedPlanSelectionComposable.kt:97)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                int i6 = ((i3 >> 6) & 14) | 805306800;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(-968903045, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$Loaded$1$1
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
                            ComposerKt.traceEventStart(-968903045, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:104)");
                        }
                        GoldUnifiedPlanSelectionComposable.TopBar(streamPlanSelectionContentResponse.getNavigation_bar_title(), streamPlanSelectionContentResponse.getProgress_bar(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 384, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1091019452, true, new GoldUnifiedPlanSelectionComposable4(streamPlanSelectionContentResponse, function1), composerStartRestartGroup, 54), null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(103846406, true, new GoldUnifiedPlanSelectionComposable5(streamPlanSelectionContentResponse, function1), composerStartRestartGroup, 54), composer2, i6, EnumC7081g.f2774x74902ae0);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedPlanSelectionComposable.Loaded$lambda$3(streamPlanSelectionContentResponse, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            int i62 = ((i3 >> 6) & 14) | 805306800;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(-968903045, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$Loaded$1$1
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
                        ComposerKt.traceEventStart(-968903045, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:104)");
                    }
                    GoldUnifiedPlanSelectionComposable.TopBar(streamPlanSelectionContentResponse.getNavigation_bar_title(), streamPlanSelectionContentResponse.getProgress_bar(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1091019452, true, new GoldUnifiedPlanSelectionComposable4(streamPlanSelectionContentResponse, function1), composerStartRestartGroup, 54), null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(103846406, true, new GoldUnifiedPlanSelectionComposable5(streamPlanSelectionContentResponse, function1), composerStartRestartGroup, 54), composer2, i62, EnumC7081g.f2774x74902ae0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x035f  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlanOption(final GoldPlanSelectionOption goldPlanSelectionOption, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        GoldPlanSelectionOption goldPlanSelectionOption2;
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        boolean zAreEqual;
        long jM21373getBg30d7_KjU;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        String title;
        boolean z;
        int i4;
        int i5;
        ?? r0;
        BentoTheme bentoTheme;
        float f;
        Modifier modifier3;
        Modifier.Companion companion;
        String badge;
        String description;
        int i6;
        long jM21425getFg0d7_KjU;
        Composer composer2;
        final boolean z2;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1274228863);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            goldPlanSelectionOption2 = goldPlanSelectionOption;
        } else if ((i & 6) == 0) {
            goldPlanSelectionOption2 = goldPlanSelectionOption;
            i3 = (composerStartRestartGroup.changedInstance(goldPlanSelectionOption2) ? 4 : 2) | i;
        } else {
            goldPlanSelectionOption2 = goldPlanSelectionOption;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1274228863, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.PlanOption (GoldUnifiedPlanSelectionComposable.kt:170)");
                }
                zAreEqual = Intrinsics.areEqual(goldPlanSelectionOption2.getIs_selected(), Boolean.TRUE);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Modifier modifierClip = Clip.clip(modifierFillMaxWidth$default, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM()));
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                if (zAreEqual) {
                    composerStartRestartGroup.startReplaceGroup(-607725858);
                    jM21373getBg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i8).m21373getBg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-607799297);
                    jM21373getBg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Selectable3.m5316selectableXHw0xAI$default(BorderKt.m4876borderxT4_qwU(modifierClip, fM7995constructorimpl, jM21373getBg30d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM())), zAreEqual, false, Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), function02, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM());
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                title = goldPlanSelectionOption2.getTitle();
                composerStartRestartGroup.startReplaceGroup(1188859092);
                if (title != null) {
                    i4 = i3;
                    modifier3 = modifier5;
                    bentoTheme = bentoTheme2;
                    i5 = i8;
                    companion = companion4;
                    z = zAreEqual;
                    r0 = 0;
                    f = 0.0f;
                } else {
                    z = zAreEqual;
                    i4 = i3;
                    i5 = i8;
                    r0 = 0;
                    bentoTheme = bentoTheme2;
                    f = 0.0f;
                    modifier3 = modifier5;
                    companion = companion4;
                    BentoText2.m20747BentoText38GnDrw(title, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i8).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                badge = goldPlanSelectionOption.getBadge();
                composerStartRestartGroup.startReplaceGroup(1188865099);
                if (badge != null) {
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, r0);
                    Composer composer3 = composerStartRestartGroup;
                    InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(badge, null, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getSolLight()), null, false, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getJet()), null, composer3, 12582912, 54);
                    composerStartRestartGroup = composer3;
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, r0);
                description = goldPlanSelectionOption.getDescription();
                composerStartRestartGroup.startReplaceGroup(1947827650);
                if (description != null) {
                    i6 = 1;
                } else {
                    i6 = 1;
                    BentoMarkdownText2.BentoMarkdownText(description, SizeKt.fillMaxWidth$default(companion, f, 1, null), (MarkdownStyle) null, function0, (Function1<? super String, Unit>) null, composerStartRestartGroup, ((i4 << 6) & 7168) | 48, 20);
                    Unit unit3 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, r0);
                RadioButtonDefaults radioButtonDefaults = RadioButtonDefaults.INSTANCE;
                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                if (((Boolean) composerStartRestartGroup.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(1653522331);
                    jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1653447962);
                    jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composer2 = composerStartRestartGroup;
                int i9 = i6;
                RadioButtonColors radioButtonColorsM5934colorsro_MJ88 = radioButtonDefaults.m5934colorsro_MJ88(jM21425getFg0d7_KjU2, jM21425getFg0d7_KjU, 0L, 0L, composer2, RadioButtonDefaults.$stable << 12, 12);
                Modifier modifierTestTag = TestTag3.testTag(companion, PlanSelectionRadioTestTag);
                composer2.startReplaceGroup(5004770);
                z2 = z;
                zChanged = composer2.changed(z2);
                objRememberedValue = composer2.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GoldUnifiedPlanSelectionComposable.PlanOption$lambda$12$lambda$11$lambda$10$lambda$9(z2, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                RadioButtonKt.RadioButton(z2, null, SemanticsModifier6.semantics$default(modifierTestTag, r0, (Function1) objRememberedValue, i9, null), false, radioButtonColorsM5934colorsro_MJ88, null, composer2, 48, 40);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
                Unit unit4 = Unit.INSTANCE;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedPlanSelectionComposable.PlanOption$lambda$13(goldPlanSelectionOption, function0, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            zAreEqual = Intrinsics.areEqual(goldPlanSelectionOption2.getIs_selected(), Boolean.TRUE);
            Alignment.Companion companion22 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
            int i82 = BentoTheme.$stable;
            Modifier modifierClip2 = Clip.clip(modifierFillMaxWidth$default2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21593getSmallD9Ej5fM()));
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
            if (zAreEqual) {
            }
            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(Selectable3.m5316selectableXHw0xAI$default(BorderKt.m4876borderxT4_qwU(modifierClip2, fM7995constructorimpl2, jM21373getBg30d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21593getSmallD9Ej5fM())), zAreEqual, false, Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), function02, 2, null), bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21590getDefaultD9Ej5fM());
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierWeight$default2 = Row5.weight$default(row62, companion42, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                    Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                        title = goldPlanSelectionOption2.getTitle();
                        composerStartRestartGroup.startReplaceGroup(1188859092);
                        if (title != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        badge = goldPlanSelectionOption.getBadge();
                        composerStartRestartGroup.startReplaceGroup(1188865099);
                        if (badge != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, r0);
                        description = goldPlanSelectionOption.getDescription();
                        composerStartRestartGroup.startReplaceGroup(1947827650);
                        if (description != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, r0);
                        RadioButtonDefaults radioButtonDefaults2 = RadioButtonDefaults.INSTANCE;
                        long jM21425getFg0d7_KjU22 = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                        if (((Boolean) composerStartRestartGroup.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue()) {
                        }
                        composer2 = composerStartRestartGroup;
                        int i92 = i6;
                        RadioButtonColors radioButtonColorsM5934colorsro_MJ882 = radioButtonDefaults2.m5934colorsro_MJ88(jM21425getFg0d7_KjU22, jM21425getFg0d7_KjU, 0L, 0L, composer2, RadioButtonDefaults.$stable << 12, 12);
                        Modifier modifierTestTag2 = TestTag3.testTag(companion, PlanSelectionRadioTestTag);
                        composer2.startReplaceGroup(5004770);
                        z2 = z;
                        zChanged = composer2.changed(z2);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GoldUnifiedPlanSelectionComposable.PlanOption$lambda$12$lambda$11$lambda$10$lambda$9(z2, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                            composer2.endReplaceGroup();
                            RadioButtonKt.RadioButton(z2, null, SemanticsModifier6.semantics$default(modifierTestTag2, r0, (Function1) objRememberedValue, i92, null), false, radioButtonColorsM5934colorsro_MJ882, null, composer2, 48, 40);
                            composerStartRestartGroup = composer2;
                            composerStartRestartGroup.endNode();
                            Unit unit42 = Unit.INSTANCE;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
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
    public static final Unit PlanOption$lambda$12$lambda$11$lambda$10$lambda$9(boolean z, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setSelected(semantics, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TopBar(final String str, final ProgressBar progressBar, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-865758014);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(progressBar) ? 32 : 16;
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-865758014, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.TopBar (GoldUnifiedPlanSelectionComposable.kt:247)");
            }
            final NavHostController navController = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
            LocalShowPlaceholder.Loadable(false, null, null, ComposableLambda3.rememberComposableLambda(1771826482, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt.TopBar.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1771826482, i5, -1, "com.robinhood.android.gold.upgrade.unified.screen.TopBar.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:251)");
                    }
                    final ProgressBar progressBar2 = progressBar;
                    composer2.startReplaceGroup(1918211934);
                    ComposableLambda composableLambdaRememberComposableLambda = progressBar2 == null ? null : ComposableLambda3.rememberComposableLambda(1240701967, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$TopBar$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope let, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(let, "$this$let");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1240701967, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.TopBar.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:263)");
                            }
                            BentoProgressBar2.m20698BentoProgressBarjB83MbM((float) progressBar2.getProgress(), null, progressBar2.getSegments_number(), 0L, 0L, false, composer3, 0, 58);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    composer2.endReplaceGroup();
                    final String str2 = str;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(20524453, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt.TopBar.1.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(20524453, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.TopBar.<anonymous>.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:253)");
                            }
                            String str3 = str2;
                            if (str3 != null) {
                                BentoText2.m20747BentoText38GnDrw(str3, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    Modifier modifier2 = modifier;
                    final NavHostController navHostController = navController;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda2, modifier2, ComposableLambda3.rememberComposableLambda(1536728017, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt.TopBar.1.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 6) == 0) {
                                i6 |= (i6 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1536728017, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.TopBar.<anonymous>.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:259)");
                            }
                            NavHostController navHostController2 = navHostController;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(navHostController2);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new GoldUnifiedPlanSelectionComposable7(navHostController2);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, composableLambdaRememberComposableLambda, false, false, null, null, 0L, null, composer2, 390, 0, 2024);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedPlanSelectionComposable.TopBar$lambda$14(str, progressBar, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
