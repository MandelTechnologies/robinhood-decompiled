package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
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
import androidx.navigation.NavHostController;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.ScreenLoggable2;
import com.robinhood.android.gold.upgrade.C18003R;
import com.robinhood.android.gold.upgrade.unified.component.PlanSelectionSectionComposable;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.options.comboorders.detail.TestTags;
import com.robinhood.android.shared.serverui.utils.IconKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.GoldPlanSelectionSection;
import gold_flow.proto.p466v1.GoldValuePropsInfoTag;
import gold_flow.proto.p466v1.StreamValuePropsContentResponse;
import gold_flow.proto.p466v1.ValueProp;
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
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.Icon;

/* compiled from: GoldUnifiedValuePropsComposable.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a7\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001aD\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132#\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00070\u00152\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001a\u001ad\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2#\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00070\u0015H\u0003¢\u0006\u0002\u0010#\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002"}, m3636d2 = {"GoldUnifiedValuePropsAssetTestTag", "", "getGoldUnifiedValuePropsAssetTestTag$annotations", "()V", "GoldValuePropsCtaTestTag", "getGoldValuePropsCtaTestTag$annotations", "GoldUnifiedValuePropsComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsDuxo;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsDuxo;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "Loaded", TestTags.LOADED, "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState$Loaded;", "onAction", "Lkotlin/Function1;", "Lgold_flow/proto/v1/Action;", "Lkotlin/ParameterName;", "name", "action", "(Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState$Loaded;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PricingDisclosureSection", "goldMonthlyCost", "goldFreeDays", "disclosureMarkdown", "learnMoreCta", "Lgold_flow/proto/v1/Cta;", "planSelectionSection", "Lgold_flow/proto/v1/GoldPlanSelectionSection;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Lgold_flow/proto/v1/GoldPlanSelectionSection;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedValuePropsComposable3 {
    public static final String GoldUnifiedValuePropsAssetTestTag = "gold_unified_value_props_asset";
    public static final String GoldValuePropsCtaTestTag = "gold_value_props_cta";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedValuePropsComposable$lambda$5(Modifier modifier, GoldUnifiedValuePropsDuxo goldUnifiedValuePropsDuxo, Screen screen, Context context, int i, int i2, Composer composer, int i3) {
        GoldUnifiedValuePropsComposable(modifier, goldUnifiedValuePropsDuxo, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$7(GoldUnifiedValuePropsViewState.Loaded loaded, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PricingDisclosureSection$lambda$13(String str, String str2, String str3, Cta cta, GoldPlanSelectionSection goldPlanSelectionSection, Function1 function1, int i, Composer composer, int i2) {
        PricingDisclosureSection(str, str2, str3, cta, goldPlanSelectionSection, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getGoldUnifiedValuePropsAssetTestTag$annotations() {
    }

    public static /* synthetic */ void getGoldValuePropsCtaTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUnifiedValuePropsComposable(Modifier modifier, GoldUnifiedValuePropsDuxo goldUnifiedValuePropsDuxo, Screen screen, Context context, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        GoldUnifiedValuePropsDuxo goldUnifiedValuePropsDuxo2;
        Screen screen2;
        Context context2;
        final GoldUnifiedValuePropsDuxo goldUnifiedValuePropsDuxo3;
        final Context context3;
        final Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final GoldUnifiedValuePropsDuxo goldUnifiedValuePropsDuxo4;
        final Modifier modifier4;
        final Screen screen3;
        final Context context4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(754584717);
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
                goldUnifiedValuePropsDuxo2 = goldUnifiedValuePropsDuxo;
                int i5 = composerStartRestartGroup.changedInstance(goldUnifiedValuePropsDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                goldUnifiedValuePropsDuxo2 = goldUnifiedValuePropsDuxo;
            }
            i3 |= i5;
        } else {
            goldUnifiedValuePropsDuxo2 = goldUnifiedValuePropsDuxo;
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldUnifiedValuePropsDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$GoldUnifiedValuePropsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$GoldUnifiedValuePropsComposable$$inlined$duxo$1.1
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
                        goldUnifiedValuePropsDuxo3 = (GoldUnifiedValuePropsDuxo) baseDuxo;
                        i3 &= -113;
                    } else {
                        goldUnifiedValuePropsDuxo3 = goldUnifiedValuePropsDuxo2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        screen2 = new Screen(Screen.Name.GOLD_VALUE_PROPS, null, null, null, 14, null);
                    }
                    if (i6 == 0) {
                        modifier3 = modifier5;
                        context3 = null;
                    } else {
                        context3 = context;
                        modifier3 = modifier5;
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
                    goldUnifiedValuePropsDuxo3 = goldUnifiedValuePropsDuxo2;
                    context3 = context2;
                }
                final Screen screen4 = screen2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(754584717, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposable (GoldUnifiedValuePropsComposable.kt:72)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedValuePropsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                LoggableViewState2 loggableViewState2LoadedState = GoldUnifiedValuePropsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).loadedState();
                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(goldUnifiedValuePropsDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldUnifiedValuePropsComposable3.GoldUnifiedValuePropsComposable$lambda$2$lambda$1(goldUnifiedValuePropsDuxo3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(goldUnifiedValuePropsDuxo3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldUnifiedValuePropsComposable3.GoldUnifiedValuePropsComposable$lambda$4$lambda$3(goldUnifiedValuePropsDuxo3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                final GoldUnifiedValuePropsDuxo goldUnifiedValuePropsDuxo5 = goldUnifiedValuePropsDuxo3;
                Context context5 = context3;
                Composer composer2 = composerStartRestartGroup;
                ScreenLoggable2.ScreenLoggable(loggableViewState2LoadedState, userInteractionEventDescriptor, false, null, null, function0, (Function0) objRememberedValue2, null, ComposableLambda3.rememberComposableLambda(-295311953, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt.GoldUnifiedValuePropsComposable.3
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
                            ComposerKt.traceEventStart(-295311953, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposable.<anonymous> (GoldUnifiedValuePropsComposable.kt:83)");
                        }
                        GoldUnifiedValuePropsViewState goldUnifiedValuePropsViewStateGoldUnifiedValuePropsComposable$lambda$0 = GoldUnifiedValuePropsComposable3.GoldUnifiedValuePropsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (goldUnifiedValuePropsViewStateGoldUnifiedValuePropsComposable$lambda$0 instanceof GoldUnifiedValuePropsViewState.Error) {
                            composer3.startReplaceGroup(-326942082);
                            GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context3, screen4, null, null, composer3, 0, 12);
                            composer3.endReplaceGroup();
                        } else if (goldUnifiedValuePropsViewStateGoldUnifiedValuePropsComposable$lambda$0 instanceof GoldUnifiedValuePropsViewState.Loaded) {
                            composer3.startReplaceGroup(-326935387);
                            GoldUnifiedValuePropsViewState.Loaded loaded = (GoldUnifiedValuePropsViewState.Loaded) goldUnifiedValuePropsViewStateGoldUnifiedValuePropsComposable$lambda$0;
                            GoldUnifiedValuePropsDuxo goldUnifiedValuePropsDuxo6 = goldUnifiedValuePropsDuxo5;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance4 = composer3.changedInstance(goldUnifiedValuePropsDuxo6);
                            Object objRememberedValue4 = composer3.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new GoldUnifiedValuePropsComposable4(goldUnifiedValuePropsDuxo6);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            composer3.endReplaceGroup();
                            GoldUnifiedValuePropsComposable3.Loaded(loaded, (Function1) objRememberedValue4, ModifiersKt.logScreenTransitions(modifier3, new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null)), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        } else {
                            if (!Intrinsics.areEqual(goldUnifiedValuePropsViewStateGoldUnifiedValuePropsComposable$lambda$0, GoldUnifiedValuePropsViewState.Loading.INSTANCE)) {
                                composer3.startReplaceGroup(-326944060);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-326920851);
                            LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 5, composer3, 3504, 1);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100663296, 156);
                composerStartRestartGroup = composer2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                goldUnifiedValuePropsDuxo4 = goldUnifiedValuePropsDuxo5;
                modifier4 = modifier3;
                screen3 = screen4;
                context4 = context5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                goldUnifiedValuePropsDuxo4 = goldUnifiedValuePropsDuxo2;
                context4 = context2;
                screen3 = screen2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedValuePropsComposable3.GoldUnifiedValuePropsComposable$lambda$5(modifier4, goldUnifiedValuePropsDuxo4, screen3, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                final SnapshotState4<? extends GoldUnifiedValuePropsViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedValuePropsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                LoggableViewState2 loggableViewState2LoadedState2 = GoldUnifiedValuePropsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).loadedState();
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = new UserInteractionEventDescriptor(null, screen42, null, context3, null, null, 53, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(goldUnifiedValuePropsDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldUnifiedValuePropsComposable3.GoldUnifiedValuePropsComposable$lambda$2$lambda$1(goldUnifiedValuePropsDuxo3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function0 function02 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(goldUnifiedValuePropsDuxo3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GoldUnifiedValuePropsComposable3.GoldUnifiedValuePropsComposable$lambda$4$lambda$3(goldUnifiedValuePropsDuxo3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        final GoldUnifiedValuePropsDuxo goldUnifiedValuePropsDuxo52 = goldUnifiedValuePropsDuxo3;
                        Context context52 = context3;
                        Composer composer22 = composerStartRestartGroup;
                        ScreenLoggable2.ScreenLoggable(loggableViewState2LoadedState2, userInteractionEventDescriptor2, false, null, null, function02, (Function0) objRememberedValue2, null, ComposableLambda3.rememberComposableLambda(-295311953, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt.GoldUnifiedValuePropsComposable.3
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
                                    ComposerKt.traceEventStart(-295311953, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposable.<anonymous> (GoldUnifiedValuePropsComposable.kt:83)");
                                }
                                GoldUnifiedValuePropsViewState goldUnifiedValuePropsViewStateGoldUnifiedValuePropsComposable$lambda$0 = GoldUnifiedValuePropsComposable3.GoldUnifiedValuePropsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                                if (goldUnifiedValuePropsViewStateGoldUnifiedValuePropsComposable$lambda$0 instanceof GoldUnifiedValuePropsViewState.Error) {
                                    composer3.startReplaceGroup(-326942082);
                                    GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context3, screen42, null, null, composer3, 0, 12);
                                    composer3.endReplaceGroup();
                                } else if (goldUnifiedValuePropsViewStateGoldUnifiedValuePropsComposable$lambda$0 instanceof GoldUnifiedValuePropsViewState.Loaded) {
                                    composer3.startReplaceGroup(-326935387);
                                    GoldUnifiedValuePropsViewState.Loaded loaded = (GoldUnifiedValuePropsViewState.Loaded) goldUnifiedValuePropsViewStateGoldUnifiedValuePropsComposable$lambda$0;
                                    GoldUnifiedValuePropsDuxo goldUnifiedValuePropsDuxo6 = goldUnifiedValuePropsDuxo52;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance4 = composer3.changedInstance(goldUnifiedValuePropsDuxo6);
                                    Object objRememberedValue4 = composer3.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new GoldUnifiedValuePropsComposable4(goldUnifiedValuePropsDuxo6);
                                        composer3.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer3.endReplaceGroup();
                                    GoldUnifiedValuePropsComposable3.Loaded(loaded, (Function1) objRememberedValue4, ModifiersKt.logScreenTransitions(modifier3, new UserInteractionEventDescriptor(null, screen42, null, context3, null, null, 53, null)), composer3, 0, 0);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (!Intrinsics.areEqual(goldUnifiedValuePropsViewStateGoldUnifiedValuePropsComposable$lambda$0, GoldUnifiedValuePropsViewState.Loading.INSTANCE)) {
                                        composer3.startReplaceGroup(-326944060);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(-326920851);
                                    LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 5, composer3, 3504, 1);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer22, 100663296, 156);
                        composerStartRestartGroup = composer22;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        goldUnifiedValuePropsDuxo4 = goldUnifiedValuePropsDuxo52;
                        modifier4 = modifier3;
                        screen3 = screen42;
                        context4 = context52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedValuePropsComposable$lambda$2$lambda$1(GoldUnifiedValuePropsDuxo goldUnifiedValuePropsDuxo) {
        goldUnifiedValuePropsDuxo.completePerformanceMetrics();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedValuePropsComposable$lambda$4$lambda$3(GoldUnifiedValuePropsDuxo goldUnifiedValuePropsDuxo) {
        goldUnifiedValuePropsDuxo.failPerformanceMetrics();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldUnifiedValuePropsViewState GoldUnifiedValuePropsComposable$lambda$0(SnapshotState4<? extends GoldUnifiedValuePropsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loaded(GoldUnifiedValuePropsViewState.Loaded loaded, final Function1<? super Action, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        GoldUnifiedValuePropsViewState.Loaded loaded2;
        int i3;
        Modifier modifier2;
        Composer composer2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1244531120);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            loaded2 = loaded;
        } else if ((i & 6) == 0) {
            loaded2 = loaded;
            i3 = (composerStartRestartGroup.changedInstance(loaded2) ? 4 : 2) | i;
        } else {
            loaded2 = loaded;
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
                    ComposerKt.traceEventStart(-1244531120, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded (GoldUnifiedValuePropsComposable.kt:115)");
                }
                final NavHostController navController = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
                final StreamValuePropsContentResponse valuePropsContent = loaded2.getValuePropsContent();
                int i5 = ((i3 >> 6) & 14) | 805306800;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(-310531211, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$Loaded$1$1
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
                            ComposerKt.traceEventStart(-310531211, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedValuePropsComposable.kt:123)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> lambda$1189253474$feature_gold_upgrade_externalRelease = GoldUnifiedValuePropsComposable.INSTANCE.getLambda$1189253474$feature_gold_upgrade_externalRelease();
                        final NavHostController navHostController = navController;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1189253474$feature_gold_upgrade_externalRelease, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(1561086134, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$Loaded$1$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1561086134, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedValuePropsComposable.kt:125)");
                                }
                                NavHostController navHostController2 = navHostController;
                                composer4.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer4.changedInstance(navHostController2);
                                Object objRememberedValue = composer4.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new GoldUnifiedValuePropsComposable6(navHostController2);
                                    composer4.updateRememberedValue(objRememberedValue);
                                }
                                composer4.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-2069891082, true, new GoldUnifiedValuePropsComposable7(valuePropsContent, function1), composerStartRestartGroup, 54), null, null, 0, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-663103040, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$Loaded$1$3
                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        char c;
                        StreamValuePropsContentResponse streamValuePropsContentResponse;
                        Function1<Action, Unit> function12;
                        int i7;
                        Object obj;
                        Modifier.Companion companion;
                        int i8;
                        Modifier.Companion companion2;
                        int i9;
                        BentoValuePropRow2 icon;
                        Object obj2;
                        Composer composer4 = composer3;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        int i10 = (i6 & 6) == 0 ? i6 | (composer4.changed(paddingValues) ? 4 : 2) : i6;
                        if ((i10 & 19) == 18 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-663103040, i10, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedValuePropsComposable.kt:140)");
                        }
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.padding(companion3, paddingValues), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                        StreamValuePropsContentResponse streamValuePropsContentResponse2 = valuePropsContent;
                        Function1<Action, Unit> function13 = function1;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer4, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer4, 6, 1);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getCenterHorizontally(), composer4, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor2);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                        String image_path = streamValuePropsContentResponse2.getImage_path();
                        composer4.startReplaceGroup(1349663995);
                        if (image_path == null) {
                            streamValuePropsContentResponse = streamValuePropsContentResponse2;
                            function12 = function13;
                            i7 = 0;
                            c = 2;
                            obj = null;
                        } else {
                            c = 2;
                            streamValuePropsContentResponse = streamValuePropsContentResponse2;
                            function12 = function13;
                            i7 = 0;
                            obj = null;
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(image_path, null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer3, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_value_props_asset_height, composer3, 0)), GoldUnifiedValuePropsComposable3.GoldUnifiedValuePropsAssetTestTag), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                            composer4 = composer3;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer4, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        final GoldValuePropsInfoTag info_tag = streamValuePropsContentResponse.getInfo_tag();
                        composer4.startReplaceGroup(1349693048);
                        if (info_tag == null) {
                            i8 = i7;
                            companion = companion3;
                        } else {
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer4, i11).m21593getSmallD9Ej5fM()), composer4, i7);
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, bentoTheme.getColors(composer4, i11).getSolLight(), 0L, 0L, bentoTheme.getColors(composer4, i11).getJet(), 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-228047385, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$Loaded$1$3$1$1$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i12) {
                                    String serverValue;
                                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue;
                                    if ((i12 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-228047385, i12, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedValuePropsComposable.kt:173)");
                                    }
                                    String label = info_tag.getLabel();
                                    Icon icon2 = info_tag.getIcon();
                                    Integer numValueOf = null;
                                    if (icon2 != null && (serverValue = IconKt.getServerValue(icon2)) != null && (serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(serverValue)) != null) {
                                        numValueOf = Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId());
                                    }
                                    InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(label, UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.INFO_TAG, info_tag.getIdentifier(), false, composer5, 54, 4), numValueOf, null, null, false, null, null, composer5, 12582912, 120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), composer3, 805306368, 493);
                            composer4 = composer3;
                            companion = companion3;
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer4, i11).m21593getSmallD9Ej5fM());
                            i8 = 0;
                            Spacer2.Spacer(modifierM5156height3ABfNKs, composer4, 0);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        Modifier.Companion companion6 = companion;
                        String title = streamValuePropsContentResponse.getTitle();
                        composer4.startReplaceGroup(1349727088);
                        if (title == null) {
                            companion2 = companion6;
                        } else {
                            companion2 = companion6;
                            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getDisplayCapsuleLarge(), composer3, 0, 0, 8126);
                            composer4 = composer3;
                            Unit unit3 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        String subtitle_markdown = streamValuePropsContentResponse.getSubtitle_markdown();
                        composer4.startReplaceGroup(1349737575);
                        if (subtitle_markdown == null) {
                            i9 = 0;
                        } else {
                            i9 = 0;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer4, 0);
                            composer4 = composer3;
                            BentoMarkdownText2.BentoMarkdownText(subtitle_markdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, MarkdownStyle.$stable << 6, 26);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer4, i9);
                        composer4.endNode();
                        composer4.startReplaceGroup(550873418);
                        for (ValueProp valueProp : streamValuePropsContentResponse.getValue_props()) {
                            String title2 = valueProp.getTitle();
                            String content = valueProp.getContent();
                            ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(valueProp.getPog_key());
                            if (serverToBentoAssetMapper3FromServerValue != null) {
                                icon = new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue);
                                obj2 = null;
                            } else {
                                obj2 = null;
                                icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null);
                            }
                            BentoValuePropRow3.BentoValuePropRow(title2, content, icon, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj2), composer4, 27648, 0);
                            composer4 = composer3;
                        }
                        composer3.endReplaceGroup();
                        GoldUnifiedValuePropsComposable3.PricingDisclosureSection(streamValuePropsContentResponse.getGold_monthly_cost(), streamValuePropsContentResponse.getGold_free_days(), streamValuePropsContentResponse.getDisclosure_markdown(), streamValuePropsContentResponse.getLearn_more_cta(), streamValuePropsContentResponse.getPlan_selection_section(), function12, composer3, 0);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, i5, 376);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final GoldUnifiedValuePropsViewState.Loaded loaded3 = loaded2;
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedValuePropsComposable3.Loaded$lambda$7(loaded3, function1, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            final NavHostController navController2 = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
            final StreamValuePropsContentResponse valuePropsContent2 = loaded2.getValuePropsContent();
            int i52 = ((i3 >> 6) & 14) | 805306800;
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(-310531211, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$Loaded$1$1
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
                        ComposerKt.traceEventStart(-310531211, i6, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedValuePropsComposable.kt:123)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> lambda$1189253474$feature_gold_upgrade_externalRelease = GoldUnifiedValuePropsComposable.INSTANCE.getLambda$1189253474$feature_gold_upgrade_externalRelease();
                    final NavHostController navHostController = navController2;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1189253474$feature_gold_upgrade_externalRelease, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(1561086134, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$Loaded$1$1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1561086134, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedValuePropsComposable.kt:125)");
                            }
                            NavHostController navHostController2 = navHostController;
                            composer4.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer4.changedInstance(navHostController2);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new GoldUnifiedValuePropsComposable6(navHostController2);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            composer4.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-2069891082, true, new GoldUnifiedValuePropsComposable7(valuePropsContent2, function1), composerStartRestartGroup, 54), null, null, 0, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-663103040, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$Loaded$1$3
                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    char c;
                    StreamValuePropsContentResponse streamValuePropsContentResponse;
                    Function1<Action, Unit> function12;
                    int i7;
                    Object obj;
                    Modifier.Companion companion;
                    int i8;
                    Modifier.Companion companion2;
                    int i9;
                    BentoValuePropRow2 icon;
                    Object obj2;
                    Composer composer4 = composer3;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    int i10 = (i6 & 6) == 0 ? i6 | (composer4.changed(paddingValues) ? 4 : 2) : i6;
                    if ((i10 & 19) == 18 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-663103040, i10, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedValuePropsComposable.kt:140)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.padding(companion3, paddingValues), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                    StreamValuePropsContentResponse streamValuePropsContentResponse2 = valuePropsContent2;
                    Function1<Action, Unit> function13 = function1;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer4, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer4, 6, 1);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getCenterHorizontally(), composer4, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor2);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    String image_path = streamValuePropsContentResponse2.getImage_path();
                    composer4.startReplaceGroup(1349663995);
                    if (image_path == null) {
                        streamValuePropsContentResponse = streamValuePropsContentResponse2;
                        function12 = function13;
                        i7 = 0;
                        c = 2;
                        obj = null;
                    } else {
                        c = 2;
                        streamValuePropsContentResponse = streamValuePropsContentResponse2;
                        function12 = function13;
                        i7 = 0;
                        obj = null;
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(image_path, null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer3, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_value_props_asset_height, composer3, 0)), GoldUnifiedValuePropsComposable3.GoldUnifiedValuePropsAssetTestTag), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                        composer4 = composer3;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer4, 0);
                        Unit unit = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    final GoldValuePropsInfoTag info_tag = streamValuePropsContentResponse.getInfo_tag();
                    composer4.startReplaceGroup(1349693048);
                    if (info_tag == null) {
                        i8 = i7;
                        companion = companion3;
                    } else {
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i11 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer4, i11).m21593getSmallD9Ej5fM()), composer4, i7);
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, bentoTheme.getColors(composer4, i11).getSolLight(), 0L, 0L, bentoTheme.getColors(composer4, i11).getJet(), 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-228047385, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$Loaded$1$3$1$1$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i12) {
                                String serverValue;
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue;
                                if ((i12 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-228047385, i12, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedValuePropsComposable.kt:173)");
                                }
                                String label = info_tag.getLabel();
                                Icon icon2 = info_tag.getIcon();
                                Integer numValueOf = null;
                                if (icon2 != null && (serverValue = IconKt.getServerValue(icon2)) != null && (serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(serverValue)) != null) {
                                    numValueOf = Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId());
                                }
                                InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(label, UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.INFO_TAG, info_tag.getIdentifier(), false, composer5, 54, 4), numValueOf, null, null, false, null, null, composer5, 12582912, 120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54), composer3, 805306368, 493);
                        composer4 = composer3;
                        companion = companion3;
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer4, i11).m21593getSmallD9Ej5fM());
                        i8 = 0;
                        Spacer2.Spacer(modifierM5156height3ABfNKs, composer4, 0);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    Modifier.Companion companion6 = companion;
                    String title = streamValuePropsContentResponse.getTitle();
                    composer4.startReplaceGroup(1349727088);
                    if (title == null) {
                        companion2 = companion6;
                    } else {
                        companion2 = companion6;
                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getDisplayCapsuleLarge(), composer3, 0, 0, 8126);
                        composer4 = composer3;
                        Unit unit3 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    String subtitle_markdown = streamValuePropsContentResponse.getSubtitle_markdown();
                    composer4.startReplaceGroup(1349737575);
                    if (subtitle_markdown == null) {
                        i9 = 0;
                    } else {
                        i9 = 0;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer4, 0);
                        composer4 = composer3;
                        BentoMarkdownText2.BentoMarkdownText(subtitle_markdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, MarkdownStyle.$stable << 6, 26);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer4, i9);
                    composer4.endNode();
                    composer4.startReplaceGroup(550873418);
                    for (ValueProp valueProp : streamValuePropsContentResponse.getValue_props()) {
                        String title2 = valueProp.getTitle();
                        String content = valueProp.getContent();
                        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(valueProp.getPog_key());
                        if (serverToBentoAssetMapper3FromServerValue != null) {
                            icon = new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue);
                            obj2 = null;
                        } else {
                            obj2 = null;
                            icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null);
                        }
                        BentoValuePropRow3.BentoValuePropRow(title2, content, icon, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj2), composer4, 27648, 0);
                        composer4 = composer3;
                    }
                    composer3.endReplaceGroup();
                    GoldUnifiedValuePropsComposable3.PricingDisclosureSection(streamValuePropsContentResponse.getGold_monthly_cost(), streamValuePropsContentResponse.getGold_free_days(), streamValuePropsContentResponse.getDisclosure_markdown(), streamValuePropsContentResponse.getLearn_more_cta(), streamValuePropsContentResponse.getPlan_selection_section(), function12, composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, i52, 376);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public static final void PricingDisclosureSection(final String str, final String str2, final String str3, final Cta cta, final GoldPlanSelectionSection goldPlanSelectionSection, final Function1<? super Action, Unit> function1, Composer composer, final int i) {
        int i2;
        boolean z;
        int i3;
        Modifier.Companion companion;
        boolean z2;
        Composer composer2;
        int i4;
        BentoTheme bentoTheme;
        Modifier.Companion companion2;
        int i5;
        boolean z3;
        Composer composer3;
        BentoTheme bentoTheme2;
        Modifier.Companion companion3;
        int i6;
        Composer composer4;
        int i7;
        String text;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1892876402);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(cta) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(goldPlanSelectionSection) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer4 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1892876402, i2, -1, "com.robinhood.android.gold.upgrade.unified.screen.PricingDisclosureSection (GoldUnifiedValuePropsComposable.kt:238)");
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion5.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion6.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i8 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme3.getColors(composerStartRestartGroup, i8).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1158330011);
            if (goldPlanSelectionSection == null) {
                companion = companion4;
                i3 = i2;
                z2 = false;
                z = true;
                composer2 = composerStartRestartGroup;
                i4 = i8;
            } else {
                z = true;
                i3 = i2;
                companion = companion4;
                z2 = false;
                composer2 = composerStartRestartGroup;
                i4 = i8;
                PlanSelectionSectionComposable.PlanSelectionSectionComposable(goldPlanSelectionSection.getTitle(), extensions2.toPersistentList(goldPlanSelectionSection.getOptions()), function1, false, composer2, ((i2 >> 9) & 896) | 3072, 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme3.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), composer2, 0);
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1158317475);
            if (str == null || StringsKt.isBlank(str)) {
                bentoTheme = bentoTheme3;
                companion2 = companion;
                i5 = i4;
                z3 = z2;
                composer3 = composer2;
            } else {
                TextStyle displayCapsuleSmall = bentoTheme3.getTypography(composer2, i4).getDisplayCapsuleSmall();
                int i9 = i4;
                composer3 = composer2;
                BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer3, i3 & 14, 0, 8126);
                bentoTheme = bentoTheme3;
                i5 = i9;
                companion2 = companion;
                z3 = false;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i5).m21595getXsmallD9Ej5fM()), composer3, 0);
            }
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(-1158307191);
            ?? r4 = z3;
            if (str2 != null) {
                r4 = z3;
                if (!StringsKt.isBlank(str2)) {
                    TextStyle textM = bentoTheme.getTypography(composer3, i5).getTextM();
                    boolean z4 = z3 ? 1 : 0;
                    BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM, composer3, (i3 >> 3) & 14, 0, 8126);
                    bentoTheme = bentoTheme;
                    i5 = i5;
                    companion2 = companion2;
                    r4 = 0;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM()), composer3, 0);
                }
            }
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(-1158297544);
            if (cta != null && (text = cta.getText()) != null && (!StringsKt.isBlank(text))) {
                String text2 = cta.getText();
                composer3.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer3.changedInstance(cta) | ((i3 & 458752) == 131072 ? true : r4);
                Object objRememberedValue = composer3.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldUnifiedValuePropsComposable3.PricingDisclosureSection$lambda$12$lambda$10$lambda$9(function1, cta);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                Composer composer5 = composer3;
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, text2, null, null, null, false, null, composer5, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                composer3 = composer5;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i5).m21591getLargeD9Ej5fM()), composer3, r4);
            }
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(-1158288198);
            if (str3 != null) {
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composer3, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, r4);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion2);
                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                companion3 = companion2;
                i6 = r4;
                bentoTheme2 = bentoTheme;
                Composer composer6 = composer3;
                i7 = i5;
                BentoMarkdownText2.BentoMarkdownText(str3, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i5).getTextS(), 0, bentoTheme.getColors(composer3, i5).m21426getFg20d7_KjU(), bentoTheme.getColors(composer3, i5).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer6, ((i3 >> 6) & 14) | (MarkdownStyle.$stable << 6), 26);
                composer4 = composer6;
                composer4.endNode();
            } else {
                bentoTheme2 = bentoTheme;
                companion3 = companion2;
                i6 = r4;
                composer4 = composer3;
                i7 = i5;
            }
            composer4.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer4, i7).m21591getLargeD9Ej5fM()), composer4, i6);
            composer4.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedValuePropsComposable3.PricingDisclosureSection$lambda$13(str, str2, str3, cta, goldPlanSelectionSection, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PricingDisclosureSection$lambda$12$lambda$10$lambda$9(Function1 function1, Cta cta) {
        function1.invoke(cta.getAction());
        return Unit.INSTANCE;
    }
}
