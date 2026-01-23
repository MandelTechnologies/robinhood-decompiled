package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.p011ui.semantics.Role;
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
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavController;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar3;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsViewState;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.options.comboorders.detail.TestTags;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.MultiAgreementsOption;
import gold_flow.proto.p466v1.StreamMultiAgreementsContentResponse;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import microgram.p507ui.p508v1.ProgressBar;

/* compiled from: GoldUnifiedMultiAgreementsComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001aD\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0016\"\u0016\u0010\u0017\u001a\u00020\u000b8\u0000X\u0081D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002"}, m3636d2 = {"GoldUnifiedMultiAgreementsComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedMultiAgreementsDuxo;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "themeOverride", "", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedMultiAgreementsDuxo;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Loaded", TestTags.LOADED, "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedMultiAgreementsViewState$Loaded;", "onAction", "Lkotlin/Function1;", "Lgold_flow/proto/v1/Action;", "Lkotlin/ParameterName;", "name", "action", "(Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedMultiAgreementsViewState$Loaded;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ctaTestTag", "getCtaTestTag", "()Ljava/lang/String;", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedMultiAgreementsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedMultiAgreementsComposable {
    private static final String ctaTestTag = "GoldUnifiedAgreementsCta";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedMultiAgreementsComposable$lambda$1(Modifier modifier, GoldUnifiedMultiAgreementsDuxo goldUnifiedMultiAgreementsDuxo, Screen screen, Context context, String str, int i, int i2, Composer composer, int i3) {
        GoldUnifiedMultiAgreementsComposable(modifier, goldUnifiedMultiAgreementsDuxo, screen, context, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$3(GoldUnifiedMultiAgreementsViewState.Loaded loaded, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUnifiedMultiAgreementsComposable(Modifier modifier, GoldUnifiedMultiAgreementsDuxo goldUnifiedMultiAgreementsDuxo, Screen screen, Context context, String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        GoldUnifiedMultiAgreementsDuxo goldUnifiedMultiAgreementsDuxo2;
        Screen screen2;
        Context context2;
        int i4;
        String str2;
        final Modifier modifier3;
        int i5;
        Composer composer2;
        Screen screen3;
        final String str3;
        int i6;
        Context context3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        boolean isDay;
        final GoldUnifiedMultiAgreementsDuxo goldUnifiedMultiAgreementsDuxo3;
        final Screen screen4;
        final Context context4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1040316135);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
                goldUnifiedMultiAgreementsDuxo2 = goldUnifiedMultiAgreementsDuxo;
                int i8 = composerStartRestartGroup.changedInstance(goldUnifiedMultiAgreementsDuxo2) ? 32 : 16;
                i3 |= i8;
            } else {
                goldUnifiedMultiAgreementsDuxo2 = goldUnifiedMultiAgreementsDuxo;
            }
            i3 |= i8;
        } else {
            goldUnifiedMultiAgreementsDuxo2 = goldUnifiedMultiAgreementsDuxo;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                screen2 = screen;
                int i9 = composerStartRestartGroup.changedInstance(screen2) ? 256 : 128;
                i3 |= i9;
            } else {
                screen2 = screen;
            }
            i3 |= i9;
        } else {
            screen2 = screen;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                context2 = context;
                i3 |= composerStartRestartGroup.changedInstance(context2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
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
                            composer2 = composerStartRestartGroup;
                            i5 = 0;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldUnifiedMultiAgreementsDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$GoldUnifiedMultiAgreementsComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$GoldUnifiedMultiAgreementsComposable$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                            composer2.endReplaceGroup();
                            goldUnifiedMultiAgreementsDuxo2 = (GoldUnifiedMultiAgreementsDuxo) baseDuxo;
                            i3 &= -113;
                        } else {
                            i5 = 0;
                            composer2 = composerStartRestartGroup;
                        }
                        if ((i2 & 4) == 0) {
                            screen3 = new Screen(Screen.Name.GOLD_AGREEMENTS_LIST, null, null, null, 14, null);
                            i3 &= -897;
                        } else {
                            screen3 = screen2;
                        }
                        str3 = null;
                        Context context5 = i10 == 0 ? null : context;
                        if (i4 == 0) {
                            Context context6 = context5;
                            i6 = i3;
                            context3 = context6;
                        } else {
                            Context context7 = context5;
                            i6 = i3;
                            context3 = context7;
                            str3 = str;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        Context context8 = context2;
                        i6 = i3;
                        context3 = context8;
                        modifier3 = modifier2;
                        screen3 = screen2;
                        str3 = str2;
                        i5 = 0;
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1040316135, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposable (GoldUnifiedMultiAgreementsComposable.kt:53)");
                    }
                    Composer composer4 = composer2;
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedMultiAgreementsDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    composer3 = composer4;
                    composer3.startReplaceGroup(983586573);
                    if (Intrinsics.areEqual(str3, "light")) {
                        isDay = Intrinsics.areEqual(str3, "dark") ? i5 : BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getIsDay();
                    } else {
                        isDay = 1;
                    }
                    composer3.endReplaceGroup();
                    OverrideSystemBarsStyle.OverrideStatusBarStyle(isDay, composer3, i5);
                    final Modifier modifier4 = modifier3;
                    final Context context9 = context3;
                    final GoldUnifiedMultiAgreementsDuxo goldUnifiedMultiAgreementsDuxo4 = goldUnifiedMultiAgreementsDuxo2;
                    final Screen screen5 = screen3;
                    BentoThemeOverlays.DayNightThemeOverlay(isDay, ComposableLambda3.rememberComposableLambda(-834466712, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt.GoldUnifiedMultiAgreementsComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i11) {
                            if ((i11 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-834466712, i11, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposable.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:63)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen5, null, context9, null, null, 53, null);
                            final Context context10 = context9;
                            final Screen screen6 = screen5;
                            final GoldUnifiedMultiAgreementsDuxo goldUnifiedMultiAgreementsDuxo5 = goldUnifiedMultiAgreementsDuxo4;
                            final Modifier modifier5 = modifier4;
                            final SnapshotState4<GoldUnifiedMultiAgreementsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1544999133, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt.GoldUnifiedMultiAgreementsComposable.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    invoke(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer6, int i12) {
                                    if ((i12 & 3) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1544999133, i12, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposable.<anonymous>.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:69)");
                                    }
                                    GoldUnifiedMultiAgreementsViewState goldUnifiedMultiAgreementsViewStateGoldUnifiedMultiAgreementsComposable$lambda$0 = GoldUnifiedMultiAgreementsComposable.GoldUnifiedMultiAgreementsComposable$lambda$0(snapshotState4);
                                    if (goldUnifiedMultiAgreementsViewStateGoldUnifiedMultiAgreementsComposable$lambda$0 instanceof GoldUnifiedMultiAgreementsViewState.Error) {
                                        composer6.startReplaceGroup(-1314513960);
                                        GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context10, screen6, null, null, composer6, 0, 12);
                                        composer6.endReplaceGroup();
                                    } else if (goldUnifiedMultiAgreementsViewStateGoldUnifiedMultiAgreementsComposable$lambda$0 instanceof GoldUnifiedMultiAgreementsViewState.Loaded) {
                                        composer6.startReplaceGroup(-1314506837);
                                        GoldUnifiedMultiAgreementsViewState.Loaded loaded = (GoldUnifiedMultiAgreementsViewState.Loaded) goldUnifiedMultiAgreementsViewStateGoldUnifiedMultiAgreementsComposable$lambda$0;
                                        GoldUnifiedMultiAgreementsDuxo goldUnifiedMultiAgreementsDuxo6 = goldUnifiedMultiAgreementsDuxo5;
                                        composer6.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer6.changedInstance(goldUnifiedMultiAgreementsDuxo6);
                                        Object objRememberedValue2 = composer6.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new GoldUnifiedMultiAgreementsComposable2(goldUnifiedMultiAgreementsDuxo6);
                                            composer6.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer6.endReplaceGroup();
                                        GoldUnifiedMultiAgreementsComposable.Loaded(loaded, (Function1) objRememberedValue2, ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null), composer6, 0, 0);
                                        composer6.endReplaceGroup();
                                    } else {
                                        if (!Intrinsics.areEqual(goldUnifiedMultiAgreementsViewStateGoldUnifiedMultiAgreementsComposable$lambda$0, GoldUnifiedMultiAgreementsViewState.Loading.INSTANCE)) {
                                            composer6.startReplaceGroup(-1314516411);
                                            composer6.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer6.startReplaceGroup(-1314499189);
                                        LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 2, composer6, 3504, 1);
                                        composer6.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54), composer5, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    goldUnifiedMultiAgreementsDuxo3 = goldUnifiedMultiAgreementsDuxo2;
                    screen4 = screen3;
                    context4 = context9;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    goldUnifiedMultiAgreementsDuxo3 = goldUnifiedMultiAgreementsDuxo2;
                    screen4 = screen2;
                    context4 = context2;
                    str3 = str2;
                    composer3 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GoldUnifiedMultiAgreementsComposable.GoldUnifiedMultiAgreementsComposable$lambda$1(modifier3, goldUnifiedMultiAgreementsDuxo3, screen4, context4, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            str2 = str;
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if ((i2 & 2) == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    str3 = null;
                    if (i10 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Composer composer42 = composer2;
                    final SnapshotState4<? extends GoldUnifiedMultiAgreementsViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedMultiAgreementsDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                    composer3 = composer42;
                    composer3.startReplaceGroup(983586573);
                    if (Intrinsics.areEqual(str3, "light")) {
                    }
                    composer3.endReplaceGroup();
                    OverrideSystemBarsStyle.OverrideStatusBarStyle(isDay, composer3, i5);
                    final Modifier modifier42 = modifier3;
                    final Context context92 = context3;
                    final GoldUnifiedMultiAgreementsDuxo goldUnifiedMultiAgreementsDuxo42 = goldUnifiedMultiAgreementsDuxo2;
                    final Screen screen52 = screen3;
                    BentoThemeOverlays.DayNightThemeOverlay(isDay, ComposableLambda3.rememberComposableLambda(-834466712, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt.GoldUnifiedMultiAgreementsComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i11) {
                            if ((i11 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-834466712, i11, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposable.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:63)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen52, null, context92, null, null, 53, null);
                            final Context context10 = context92;
                            final Screen screen6 = screen52;
                            final GoldUnifiedMultiAgreementsDuxo goldUnifiedMultiAgreementsDuxo5 = goldUnifiedMultiAgreementsDuxo42;
                            final Modifier modifier5 = modifier42;
                            final SnapshotState4<? extends GoldUnifiedMultiAgreementsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1544999133, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt.GoldUnifiedMultiAgreementsComposable.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    invoke(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer6, int i12) {
                                    if ((i12 & 3) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1544999133, i12, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposable.<anonymous>.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:69)");
                                    }
                                    GoldUnifiedMultiAgreementsViewState goldUnifiedMultiAgreementsViewStateGoldUnifiedMultiAgreementsComposable$lambda$0 = GoldUnifiedMultiAgreementsComposable.GoldUnifiedMultiAgreementsComposable$lambda$0(snapshotState4);
                                    if (goldUnifiedMultiAgreementsViewStateGoldUnifiedMultiAgreementsComposable$lambda$0 instanceof GoldUnifiedMultiAgreementsViewState.Error) {
                                        composer6.startReplaceGroup(-1314513960);
                                        GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context10, screen6, null, null, composer6, 0, 12);
                                        composer6.endReplaceGroup();
                                    } else if (goldUnifiedMultiAgreementsViewStateGoldUnifiedMultiAgreementsComposable$lambda$0 instanceof GoldUnifiedMultiAgreementsViewState.Loaded) {
                                        composer6.startReplaceGroup(-1314506837);
                                        GoldUnifiedMultiAgreementsViewState.Loaded loaded = (GoldUnifiedMultiAgreementsViewState.Loaded) goldUnifiedMultiAgreementsViewStateGoldUnifiedMultiAgreementsComposable$lambda$0;
                                        GoldUnifiedMultiAgreementsDuxo goldUnifiedMultiAgreementsDuxo6 = goldUnifiedMultiAgreementsDuxo5;
                                        composer6.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer6.changedInstance(goldUnifiedMultiAgreementsDuxo6);
                                        Object objRememberedValue2 = composer6.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new GoldUnifiedMultiAgreementsComposable2(goldUnifiedMultiAgreementsDuxo6);
                                            composer6.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer6.endReplaceGroup();
                                        GoldUnifiedMultiAgreementsComposable.Loaded(loaded, (Function1) objRememberedValue2, ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null), composer6, 0, 0);
                                        composer6.endReplaceGroup();
                                    } else {
                                        if (!Intrinsics.areEqual(goldUnifiedMultiAgreementsViewStateGoldUnifiedMultiAgreementsComposable$lambda$0, GoldUnifiedMultiAgreementsViewState.Loading.INSTANCE)) {
                                            composer6.startReplaceGroup(-1314516411);
                                            composer6.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer6.startReplaceGroup(-1314499189);
                                        LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 2, composer6, 3504, 1);
                                        composer6.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54), composer5, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    goldUnifiedMultiAgreementsDuxo3 = goldUnifiedMultiAgreementsDuxo2;
                    screen4 = screen3;
                    context4 = context92;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        context2 = context;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        str2 = str;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldUnifiedMultiAgreementsViewState GoldUnifiedMultiAgreementsComposable$lambda$0(SnapshotState4<? extends GoldUnifiedMultiAgreementsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loaded(final GoldUnifiedMultiAgreementsViewState.Loaded loaded, final Function1<? super Action, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1255578051);
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
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1255578051, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded (GoldUnifiedMultiAgreementsComposable.kt:96)");
            }
            final NavHostController navController = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
            final StreamMultiAgreementsContentResponse content = loaded.getContent();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-11663948, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1

                /* compiled from: GoldUnifiedMultiAgreementsComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$3 */
                static final class C182303 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ Function1<Action, Unit> $onAction;
                    final /* synthetic */ StreamMultiAgreementsContentResponse $this_with;

                    /* JADX WARN: Multi-variable type inference failed */
                    C182303(StreamMultiAgreementsContentResponse streamMultiAgreementsContentResponse, Function1<? super Action, Unit> function1) {
                        this.$this_with = streamMultiAgreementsContentResponse;
                        this.$onAction = function1;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        int i2;
                        StreamMultiAgreementsContentResponse streamMultiAgreementsContentResponse;
                        Function1<Action, Unit> function1;
                        BentoTheme bentoTheme;
                        int i3;
                        Modifier.Companion companion;
                        int i4;
                        int i5;
                        Iterator it;
                        int i6;
                        MultiAgreementsOption multiAgreementsOption;
                        int i7;
                        int i8;
                        Composer composer2 = composer;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i2 = i | (composer2.changed(paddingValues) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2145754365, i2, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:146)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(companion2, paddingValues), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierVerticalScroll$default, 0.0f, bentoTheme2.getSpacing(composer2, i9).m21590getDefaultD9Ej5fM(), 1, null);
                        StreamMultiAgreementsContentResponse streamMultiAgreementsContentResponse2 = this.$this_with;
                        Function1<Action, Unit> function12 = this.$onAction;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, composer2, 6, 1);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), Intrinsics.areEqual(streamMultiAgreementsContentResponse2.getIs_header_centered(), Boolean.TRUE) ? companion3.getCenterHorizontally() : companion3.getStart(), composer2, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        String title = streamMultiAgreementsContentResponse2.getTitle();
                        composer2.startReplaceGroup(-1387115969);
                        if (title == null) {
                            companion = companion2;
                            bentoTheme = bentoTheme2;
                            i3 = i9;
                            streamMultiAgreementsContentResponse = streamMultiAgreementsContentResponse2;
                            function1 = function12;
                        } else {
                            streamMultiAgreementsContentResponse = streamMultiAgreementsContentResponse2;
                            function1 = function12;
                            bentoTheme = bentoTheme2;
                            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i9).getDisplayCapsuleMedium(), composer2, 0, 0, 8190);
                            i3 = i9;
                            companion = companion2;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM()), composer2, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        int i10 = i3;
                        String description = streamMultiAgreementsContentResponse.getDescription();
                        composer2.startReplaceGroup(-1387104390);
                        if (description == null) {
                            i4 = i10;
                            i5 = 0;
                        } else {
                            BentoText2.m20747BentoText38GnDrw(description, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                            i4 = i10;
                            companion = companion;
                            i5 = 0;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), composer2, 0);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), composer2, i5);
                        composer2.endNode();
                        composer2.startReplaceGroup(-2080485379);
                        Iterator it2 = streamMultiAgreementsContentResponse.getOptions().iterator();
                        int i11 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            final MultiAgreementsOption multiAgreementsOption2 = (MultiAgreementsOption) next;
                            final Boolean is_checked = multiAgreementsOption2.getIs_checked();
                            final Action on_check_action = multiAgreementsOption2.getOn_check_action();
                            if (is_checked == null || on_check_action == null) {
                                it = it2;
                                i6 = i11;
                                multiAgreementsOption = multiAgreementsOption2;
                                composer2.startReplaceGroup(-1623825592);
                                String title2 = multiAgreementsOption.getTitle();
                                if (title2 == null) {
                                    i7 = 6;
                                } else {
                                    FontWeight bold = FontWeight.INSTANCE.getBold();
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(title2, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion5, 0.0f, composer2, 6, 1), null, null, bold, null, null, 0, false, 0, 0, null, 0, null, composer2, 24576, 0, 16364);
                                    i7 = 6;
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, C2002Dp.m7995constructorimpl(12)), composer2, 6);
                                    Unit unit3 = Unit.INSTANCE;
                                }
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1624965896);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                boolean zBooleanValue = is_checked.booleanValue();
                                Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7481getCheckboxo7Vup1c());
                                composer2.startReplaceGroup(-1633490746);
                                final Function1<Action, Unit> function13 = function1;
                                boolean zChanged = composer2.changed(function13) | composer2.changedInstance(on_check_action);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02a5: CONSTRUCTOR (r10v9 'objRememberedValue' java.lang.Object) = 
                                          (r5v12 'function13' kotlin.jvm.functions.Function1<gold_flow.proto.v1.Action, kotlin.Unit> A[DONT_INLINE])
                                          (r4v5 'on_check_action' gold_flow.proto.v1.Action A[DONT_INLINE])
                                         A[MD:(kotlin.jvm.functions.Function1, gold_flow.proto.v1.Action):void (m)] (LINE:186) call: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$3$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function1, gold_flow.proto.v1.Action):void type: CONSTRUCTOR in method: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1.3.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void, file: classes10.dex
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
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$3$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 37 more
                                        */
                                    /*
                                        Method dump skipped, instructions count: 1059
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposable3.C182303.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                    invoke(paddingValues, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$8$lambda$7$lambda$4$lambda$3(Function1 function1, Action action, boolean z) {
                                    function1.invoke(action);
                                    return Unit.INSTANCE;
                                }
                            }

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
                                    ComposerKt.traceEventStart(-11663948, i5, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:101)");
                                }
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i6 = BentoTheme.$stable;
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                                Modifier modifier4 = modifier3;
                                final GoldUnifiedMultiAgreementsViewState.Loaded loaded2 = loaded;
                                final StreamMultiAgreementsContentResponse streamMultiAgreementsContentResponse = content;
                                final NavHostController navHostController = navController;
                                final Function1<Action, Unit> function12 = function1;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, ComposableLambda3.rememberComposableLambda(506622840, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1.1
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
                                            ComposerKt.traceEventStart(506622840, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:106)");
                                        }
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        final ProgressBar progress_bar = loaded2.getContent().getProgress_bar();
                                        composer3.startReplaceGroup(1533266936);
                                        ComposableLambda composableLambdaRememberComposableLambda = progress_bar != null ? ComposableLambda3.rememberComposableLambda(-344531268, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                                invoke(boxScope, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BoxScope let, Composer composer4, int i8) {
                                                Intrinsics.checkNotNullParameter(let, "$this$let");
                                                if ((i8 & 17) == 16 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-344531268, i8, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:122)");
                                                }
                                                BentoProgressBar2.m20698BentoProgressBarjB83MbM((float) progress_bar.getProgress(), null, progress_bar.getSegments_number(), 0L, 0L, false, composer4, 0, 58);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54) : null;
                                        composer3.endReplaceGroup();
                                        final StreamMultiAgreementsContentResponse streamMultiAgreementsContentResponse2 = streamMultiAgreementsContentResponse;
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(342469157, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt.Loaded.1.1.1.2
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i8) {
                                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(342469157, i8, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:108)");
                                                }
                                                String navigation_bar_title = streamMultiAgreementsContentResponse2.getNavigation_bar_title();
                                                if (navigation_bar_title != null) {
                                                    BentoText2.m20747BentoText38GnDrw(navigation_bar_title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16382);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(-414827399, true, new AnonymousClass3(navHostController, function12), composer3, 54), null, composableLambdaRememberComposableLambda, false, false, null, null, 0L, null, composer3, 438, 0, 2024);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: GoldUnifiedMultiAgreementsComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$1$3, reason: invalid class name */
                                    static final class AnonymousClass3 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                        final /* synthetic */ NavHostController $navController;
                                        final /* synthetic */ Function1<Action, Unit> $onAction;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        AnonymousClass3(NavHostController navHostController, Function1<? super Action, Unit> function1) {
                                            this.$navController = navHostController;
                                            this.$onAction = function1;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                            invoke(bentoAppBarScope, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i & 6) == 0) {
                                                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i & 19) == 18 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-414827399, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:115)");
                                            }
                                            composer.startReplaceGroup(-1633490746);
                                            boolean zChangedInstance = composer.changedInstance(this.$navController) | composer.changed(this.$onAction);
                                            final NavHostController navHostController = this.$navController;
                                            final Function1<Action, Unit> function1 = this.$onAction;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = 
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0063: CONSTRUCTOR (r3v1 'objRememberedValue' java.lang.Object) = 
                                                      (r1v3 'navHostController' androidx.navigation.NavHostController A[DONT_INLINE])
                                                      (r2v0 'function1' kotlin.jvm.functions.Function1<gold_flow.proto.v1.Action, kotlin.Unit> A[DONT_INLINE])
                                                     A[MD:(androidx.navigation.NavHostController, kotlin.jvm.functions.Function1):void (m)] (LINE:116) call: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$1$3$$ExternalSyntheticLambda0.<init>(androidx.navigation.NavHostController, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR in method: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt.Loaded.1.1.1.3.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void, file: classes10.dex
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
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$1$3$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                    	... 25 more
                                                    */
                                                /*
                                                    this = this;
                                                    java.lang.String r0 = "$this$BentoAppBar"
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                                                    r0 = r15 & 6
                                                    if (r0 != 0) goto L1c
                                                    r0 = r15 & 8
                                                    if (r0 != 0) goto L12
                                                    boolean r0 = r14.changed(r13)
                                                    goto L16
                                                L12:
                                                    boolean r0 = r14.changedInstance(r13)
                                                L16:
                                                    if (r0 == 0) goto L1a
                                                    r0 = 4
                                                    goto L1b
                                                L1a:
                                                    r0 = 2
                                                L1b:
                                                    r15 = r15 | r0
                                                L1c:
                                                    r0 = r15 & 19
                                                    r1 = 18
                                                    if (r0 != r1) goto L2d
                                                    boolean r0 = r14.getSkipping()
                                                    if (r0 != 0) goto L29
                                                    goto L2d
                                                L29:
                                                    r14.skipToGroupEnd()
                                                    return
                                                L2d:
                                                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                    if (r0 == 0) goto L3c
                                                    r0 = -1
                                                    java.lang.String r1 = "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:115)"
                                                    r2 = -414827399(0xffffffffe7463c79, float:-9.361441E23)
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(r2, r15, r0, r1)
                                                L3c:
                                                    r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                                                    r14.startReplaceGroup(r0)
                                                    androidx.navigation.NavHostController r0 = r12.$navController
                                                    boolean r0 = r14.changedInstance(r0)
                                                    kotlin.jvm.functions.Function1<gold_flow.proto.v1.Action, kotlin.Unit> r1 = r12.$onAction
                                                    boolean r1 = r14.changed(r1)
                                                    r0 = r0 | r1
                                                    androidx.navigation.NavHostController r1 = r12.$navController
                                                    kotlin.jvm.functions.Function1<gold_flow.proto.v1.Action, kotlin.Unit> r2 = r12.$onAction
                                                    java.lang.Object r3 = r14.rememberedValue()
                                                    if (r0 != 0) goto L61
                                                    androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                                                    java.lang.Object r0 = r0.getEmpty()
                                                    if (r3 != r0) goto L69
                                                L61:
                                                    com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$1$3$$ExternalSyntheticLambda0 r3 = new com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$1$3$$ExternalSyntheticLambda0
                                                    r3.<init>(r1, r2)
                                                    r14.updateRememberedValue(r3)
                                                L69:
                                                    r8 = r3
                                                    kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
                                                    r14.endReplaceGroup()
                                                    int r0 = com.robinhood.compose.bento.component.BentoAppBarScope.$stable
                                                    int r0 = r0 << 12
                                                    r1 = 57344(0xe000, float:8.0356E-41)
                                                    int r15 = r15 << 12
                                                    r15 = r15 & r1
                                                    r10 = r0 | r15
                                                    r11 = 7
                                                    r5 = 0
                                                    r6 = 0
                                                    r7 = 0
                                                    r4 = r13
                                                    r9 = r14
                                                    r4.m20575BentoBackButtondrOMvmE(r5, r6, r7, r8, r9, r10, r11)
                                                    boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                    if (r13 == 0) goto L8d
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                                L8d:
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposable3.C182281.AnonymousClass3.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void");
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$1$lambda$0(NavHostController navHostController, Function1 function1) {
                                                GoldUnifiedNavController.navigateBackOrExit(navHostController, function1);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }, composer2, 54), ComposableLambda3.rememberComposableLambda(-1844372551, true, new C182292(content, function1), composer2, 54), null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-2145754365, true, new C182303(content, function1), composer2, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: GoldUnifiedMultiAgreementsComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$2 */
                                static final class C182292 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ Function1<Action, Unit> $onAction;
                                    final /* synthetic */ StreamMultiAgreementsContentResponse $this_with;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    C182292(StreamMultiAgreementsContentResponse streamMultiAgreementsContentResponse, Function1<? super Action, Unit> function1) {
                                        this.$this_with = streamMultiAgreementsContentResponse;
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
                                            ComposerKt.traceEventStart(-1844372551, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:131)");
                                        }
                                        Cta cta = this.$this_with.getCta();
                                        String text = cta != null ? cta.getText() : null;
                                        String disclaimer_markdown = this.$this_with.getDisclaimer_markdown();
                                        Cta cta2 = this.$this_with.getCta();
                                        boolean z = !(cta2 != null ? Intrinsics.areEqual(cta2.getEnabled(), Boolean.FALSE) : false);
                                        Cta cta3 = this.$this_with.getCta();
                                        boolean zAreEqual = cta3 != null ? Intrinsics.areEqual(cta3.getLoading(), Boolean.TRUE) : false;
                                        GoldUnifiedBottomBar3 goldUnifiedBottomBar3 = Intrinsics.areEqual(this.$this_with.getDisable_sparkle_button_styling(), Boolean.TRUE) ? GoldUnifiedBottomBar3.ACHROMATIC : GoldUnifiedBottomBar3.GOLD_SPARKLE;
                                        String ctaTestTag = GoldUnifiedMultiAgreementsComposable.getCtaTestTag();
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance = composer.changedInstance(this.$this_with) | composer.changed(this.$onAction);
                                        final StreamMultiAgreementsContentResponse streamMultiAgreementsContentResponse = this.$this_with;
                                        final Function1<Action, Unit> function1 = this.$onAction;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009f: CONSTRUCTOR (r8v1 'objRememberedValue' java.lang.Object) = 
                                                  (r1v6 'streamMultiAgreementsContentResponse' gold_flow.proto.v1.StreamMultiAgreementsContentResponse A[DONT_INLINE])
                                                  (r3v0 'function1' kotlin.jvm.functions.Function1<gold_flow.proto.v1.Action, kotlin.Unit> A[DONT_INLINE])
                                                 A[MD:(gold_flow.proto.v1.StreamMultiAgreementsContentResponse, kotlin.jvm.functions.Function1):void (m)] (LINE:134) call: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$2$$ExternalSyntheticLambda0.<init>(gold_flow.proto.v1.StreamMultiAgreementsContentResponse, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR in method: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1.2.invoke(androidx.compose.runtime.Composer, int):void, file: classes10.dex
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
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 25 more
                                                */
                                            /*
                                                this = this;
                                                r0 = r15 & 3
                                                r1 = 2
                                                if (r0 != r1) goto L10
                                                boolean r0 = r14.getSkipping()
                                                if (r0 != 0) goto Lc
                                                goto L10
                                            Lc:
                                                r14.skipToGroupEnd()
                                                return
                                            L10:
                                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r0 == 0) goto L1f
                                                r0 = -1
                                                java.lang.String r1 = "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedMultiAgreementsComposable.kt:131)"
                                                r2 = -1844372551(0xffffffff92111bb9, float:-4.5788103E-28)
                                                androidx.compose.runtime.ComposerKt.traceEventStart(r2, r15, r0, r1)
                                            L1f:
                                                gold_flow.proto.v1.StreamMultiAgreementsContentResponse r15 = r13.$this_with
                                                gold_flow.proto.v1.Cta r15 = r15.getCta()
                                                if (r15 == 0) goto L2d
                                                java.lang.String r15 = r15.getText()
                                            L2b:
                                                r0 = r15
                                                goto L2f
                                            L2d:
                                                r15 = 0
                                                goto L2b
                                            L2f:
                                                gold_flow.proto.v1.StreamMultiAgreementsContentResponse r15 = r13.$this_with
                                                java.lang.String r4 = r15.getDisclaimer_markdown()
                                                gold_flow.proto.v1.StreamMultiAgreementsContentResponse r15 = r13.$this_with
                                                gold_flow.proto.v1.Cta r15 = r15.getCta()
                                                r1 = 0
                                                if (r15 == 0) goto L49
                                                java.lang.Boolean r15 = r15.getEnabled()
                                                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                                                boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r2)
                                                goto L4a
                                            L49:
                                                r15 = r1
                                            L4a:
                                                r5 = r15 ^ 1
                                                gold_flow.proto.v1.StreamMultiAgreementsContentResponse r15 = r13.$this_with
                                                gold_flow.proto.v1.Cta r15 = r15.getCta()
                                                if (r15 == 0) goto L5e
                                                java.lang.Boolean r15 = r15.getLoading()
                                                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                                                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r1)
                                            L5e:
                                                r6 = r1
                                                gold_flow.proto.v1.StreamMultiAgreementsContentResponse r15 = r13.$this_with
                                                java.lang.Boolean r15 = r15.getDisable_sparkle_button_styling()
                                                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                                                boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r1)
                                                if (r15 == 0) goto L71
                                                com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedCtaStyle r15 = com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar3.ACHROMATIC
                                            L6f:
                                                r7 = r15
                                                goto L74
                                            L71:
                                                com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedCtaStyle r15 = com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar3.GOLD_SPARKLE
                                                goto L6f
                                            L74:
                                                java.lang.String r2 = com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposable.getCtaTestTag()
                                                r15 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                                                r14.startReplaceGroup(r15)
                                                gold_flow.proto.v1.StreamMultiAgreementsContentResponse r15 = r13.$this_with
                                                boolean r15 = r14.changedInstance(r15)
                                                kotlin.jvm.functions.Function1<gold_flow.proto.v1.Action, kotlin.Unit> r1 = r13.$onAction
                                                boolean r1 = r14.changed(r1)
                                                r15 = r15 | r1
                                                gold_flow.proto.v1.StreamMultiAgreementsContentResponse r1 = r13.$this_with
                                                kotlin.jvm.functions.Function1<gold_flow.proto.v1.Action, kotlin.Unit> r3 = r13.$onAction
                                                java.lang.Object r8 = r14.rememberedValue()
                                                if (r15 != 0) goto L9d
                                                androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.INSTANCE
                                                java.lang.Object r15 = r15.getEmpty()
                                                if (r8 != r15) goto La5
                                            L9d:
                                                com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$2$$ExternalSyntheticLambda0 r8 = new com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$Loaded$1$1$2$$ExternalSyntheticLambda0
                                                r8.<init>(r1, r3)
                                                r14.updateRememberedValue(r8)
                                            La5:
                                                r1 = r8
                                                kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                                                r14.endReplaceGroup()
                                                r11 = 384(0x180, float:5.38E-43)
                                                r12 = 776(0x308, float:1.087E-42)
                                                r3 = 0
                                                r8 = 0
                                                r9 = 0
                                                r10 = r14
                                                com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar.GoldUnifiedBottomBar(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                                                boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r14 == 0) goto Lbf
                                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                            Lbf:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposable3.C182292.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$2$lambda$1(StreamMultiAgreementsContentResponse streamMultiAgreementsContentResponse, Function1 function1) {
                                            Action action;
                                            Cta cta = streamMultiAgreementsContentResponse.getCta();
                                            if (cta != null && (action = cta.getAction()) != null) {
                                                function1.invoke(action);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
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
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return GoldUnifiedMultiAgreementsComposable.Loaded$lambda$3(loaded, function1, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }

                        public static final String getCtaTestTag() {
                            return ctaTestTag;
                        }
                    }
