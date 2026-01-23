package com.robinhood.android.gold.upgrade.legacy;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
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
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.ScreenLoggable2;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.gold.upgrade.C18003R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.bonfire.ApiGoldValueProp;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import kotlin.Metadata;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: LegacyGoldUpgradeValuePropsComposable.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u001af\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001aV\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001d2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tH\u0003¢\u0006\u0002\u0010\u001f\u001a#\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0003¢\u0006\u0002\u0010\"\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002"}, m3636d2 = {"GoldUpgradeValuePropsAssetTestTag", "", "getGoldUpgradeValuePropsAssetTestTag$annotations", "()V", "GoldUpgradeValuePropsComposable", "", "goldValueProps", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;", "onLearnMore", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "Lkotlin/ParameterName;", "name", "action", "", "onContinue", "Lkotlin/Function0;", "duxo", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeValuePropsDuxo;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeValuePropsDuxo;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "PricingDisclosureSection", "goldMonthlyCost", "goldFreeDays", "disclosureMarkdown", "learnMoreButton", "Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "onClickLearnMore", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/TextButton;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "GoldBottomBar", "ctaText", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeValuePropsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeValuePropsComposable {
    public static final String GoldUpgradeValuePropsAssetTestTag = "gold_upgrade_value_props_asset";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldBottomBar$lambda$13(String str, Function0 function0, int i, Composer composer, int i2) {
        GoldBottomBar(str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeValuePropsComposable$lambda$5(ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps, Function1 function1, Function0 function0, LegacyGoldUpgradeValuePropsDuxo legacyGoldUpgradeValuePropsDuxo, Screen screen, Context context, int i, int i2, Composer composer, int i3) {
        GoldUpgradeValuePropsComposable(apiGoldValueProps, function1, function0, legacyGoldUpgradeValuePropsDuxo, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PricingDisclosureSection$lambda$9(String str, String str2, String str3, TextButton textButton, Function1 function1, int i, Composer composer, int i2) {
        PricingDisclosureSection(str, str2, str3, textButton, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getGoldUpgradeValuePropsAssetTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUpgradeValuePropsComposable(final ApiGoldUpgradeFlow.ApiGoldValueProps goldValueProps, final Function1<? super DeeplinkAction, Boolean> onLearnMore, final Function0<Unit> onContinue, LegacyGoldUpgradeValuePropsDuxo legacyGoldUpgradeValuePropsDuxo, Screen screen, Context context, Composer composer, final int i, final int i2) {
        int i3;
        final LegacyGoldUpgradeValuePropsDuxo legacyGoldUpgradeValuePropsDuxo2;
        Screen screen2;
        Context context2;
        Composer composer2;
        Screen screen3;
        Screen screen4;
        Context context3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer4;
        final LegacyGoldUpgradeValuePropsDuxo legacyGoldUpgradeValuePropsDuxo3;
        final Screen screen5;
        final Context context4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(goldValueProps, "goldValueProps");
        Intrinsics.checkNotNullParameter(onLearnMore, "onLearnMore");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(2116993859);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(goldValueProps) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLearnMore) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                legacyGoldUpgradeValuePropsDuxo2 = legacyGoldUpgradeValuePropsDuxo;
                int i4 = composerStartRestartGroup.changedInstance(legacyGoldUpgradeValuePropsDuxo2) ? 2048 : 1024;
                i3 |= i4;
            } else {
                legacyGoldUpgradeValuePropsDuxo2 = legacyGoldUpgradeValuePropsDuxo;
            }
            i3 |= i4;
        } else {
            legacyGoldUpgradeValuePropsDuxo2 = legacyGoldUpgradeValuePropsDuxo;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                screen2 = screen;
                int i5 = composerStartRestartGroup.changedInstance(screen2) ? 16384 : 8192;
                i3 |= i5;
            } else {
                screen2 = screen;
            }
            i3 |= i5;
        } else {
            screen2 = screen;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                context2 = context;
                i3 |= composerStartRestartGroup.changedInstance(context2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 8) == 0) {
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LegacyGoldUpgradeValuePropsDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$GoldUpgradeValuePropsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$GoldUpgradeValuePropsComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                        legacyGoldUpgradeValuePropsDuxo2 = (LegacyGoldUpgradeValuePropsDuxo) baseDuxo;
                        i3 &= -7169;
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    if ((i2 & 16) == 0) {
                        screen3 = new Screen(Screen.Name.GOLD_VALUE_PROPS, null, null, null, 14, null);
                        i3 &= -57345;
                    } else {
                        screen3 = screen2;
                    }
                    if (i6 == 0) {
                        screen4 = screen3;
                        context3 = null;
                    } else {
                        screen4 = screen3;
                        context3 = context;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    screen4 = screen2;
                    context3 = context2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2116993859, i3, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropsComposable (LegacyGoldUpgradeValuePropsComposable.kt:64)");
                }
                composer3 = composer2;
                LoggableViewState2 loggableViewState2LoadedState = GoldUpgradeValuePropsComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(legacyGoldUpgradeValuePropsDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7)).loadedState();
                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null);
                Screen screen6 = screen4;
                Context context5 = context3;
                composer3.startReplaceGroup(5004770);
                zChangedInstance = composer3.changedInstance(legacyGoldUpgradeValuePropsDuxo2);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeValuePropsComposable.GoldUpgradeValuePropsComposable$lambda$2$lambda$1(legacyGoldUpgradeValuePropsDuxo2);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(5004770);
                zChangedInstance2 = composer3.changedInstance(legacyGoldUpgradeValuePropsDuxo2);
                objRememberedValue2 = composer3.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeValuePropsComposable.GoldUpgradeValuePropsComposable$lambda$4$lambda$3(legacyGoldUpgradeValuePropsDuxo2);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                composer3.endReplaceGroup();
                ScreenLoggable2.ScreenLoggable(loggableViewState2LoadedState, userInteractionEventDescriptor, false, null, null, function0, (Function0) objRememberedValue2, null, ComposableLambda3.rememberComposableLambda(-509995423, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt.GoldUpgradeValuePropsComposable.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i7) {
                        if ((i7 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-509995423, i7, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropsComposable.<anonymous> (LegacyGoldUpgradeValuePropsComposable.kt:76)");
                        }
                        final ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps = goldValueProps;
                        final Function0<Unit> function02 = onContinue;
                        final Function1<DeeplinkAction, Boolean> function1 = onLearnMore;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1701238315, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$GoldUpgradeValuePropsComposable$3$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer6, Integer num) {
                                invoke(bentoButtonBar3, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer6, int i8) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1701238315, i8, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropsComposable.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeValuePropsComposable.kt:79)");
                                }
                                LegacyGoldUpgradeValuePropsComposable.GoldBottomBar(apiGoldValueProps.getCtaText(), function02, composer6, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), ComposableLambda3.rememberComposableLambda(1467396888, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$GoldUpgradeValuePropsComposable$3$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer6, Integer num) {
                                invoke(boxScope, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer6, int i8) {
                                ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps2;
                                BentoTheme bentoTheme;
                                int i9;
                                Modifier.Companion companion;
                                boolean z;
                                int i10;
                                Modifier.Companion companion2;
                                int i11;
                                BentoValuePropRow2 icon;
                                Object obj;
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1467396888, i8, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropsComposable.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeValuePropsComposable.kt:85)");
                                }
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer6, 0, 1), false, null, false, 14, null);
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                                ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps3 = apiGoldValueProps;
                                Function1<DeeplinkAction, Boolean> function12 = function1;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer6, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierVerticalScroll$default);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                if (composer6.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer6.startReusableNode();
                                if (composer6.getInserting()) {
                                    composer6.createNode(constructor);
                                } else {
                                    composer6.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer6, 6, 1);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getCenterHorizontally(), composer6, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer6, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                if (composer6.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer6.startReusableNode();
                                if (composer6.getInserting()) {
                                    composer6.createNode(constructor2);
                                } else {
                                    composer6.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer6);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(apiGoldValueProps3.getImagePath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composer6.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer6, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_value_props_asset_height, composer6, 0)), "gold_upgrade_value_props_asset"), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer6, 24624, 104);
                                Composer composer7 = composer6;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i12 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer7, i12).m21591getLargeD9Ej5fM()), composer7, 0);
                                final ApiGoldUpgradeFlow.ApiGoldValuePropsInfoTag infoTag = apiGoldValueProps3.getInfoTag();
                                composer7.startReplaceGroup(568112220);
                                if (infoTag == null) {
                                    bentoTheme = bentoTheme2;
                                    i9 = i12;
                                    companion = companion3;
                                    z = false;
                                    apiGoldValueProps2 = apiGoldValueProps3;
                                } else {
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer7, i12).m21593getSmallD9Ej5fM()), composer7, 0);
                                    apiGoldValueProps2 = apiGoldValueProps3;
                                    bentoTheme = bentoTheme2;
                                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, bentoTheme2.getColors(composer7, i12).getSolLight(), 0L, 0L, bentoTheme2.getColors(composer7, i12).getJet(), 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-169618858, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$GoldUpgradeValuePropsComposable$3$1$2$1$1$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                                            invoke(composer8, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer8, int i13) {
                                            String serverValue;
                                            ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue;
                                            if ((i13 & 3) == 2 && composer8.getSkipping()) {
                                                composer8.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-169618858, i13, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeValuePropsComposable.kt:115)");
                                            }
                                            String label = infoTag.getLabel();
                                            Icon icon2 = infoTag.getIcon();
                                            Integer numValueOf = null;
                                            if (icon2 != null && (serverValue = icon2.getServerValue()) != null && (serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(serverValue)) != null) {
                                                numValueOf = Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId());
                                            }
                                            InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(label, UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.INFO_TAG, infoTag.getIdentifier(), false, composer8, 54, 4), numValueOf, null, null, false, null, null, composer8, 12582912, 120);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer7, 54), composer6, 805306368, 493);
                                    composer7 = composer6;
                                    i9 = i12;
                                    companion = companion3;
                                    z = false;
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer7, i9).m21593getSmallD9Ej5fM()), composer7, 0);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer7.endReplaceGroup();
                                String title = apiGoldValueProps2.getTitle();
                                TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer7, i9).getDisplayCapsuleLarge();
                                TextAlign.Companion companion6 = TextAlign.INSTANCE;
                                int i13 = i9;
                                Modifier.Companion companion7 = companion;
                                BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer6, 0, 0, 8126);
                                Composer composer8 = composer6;
                                String subtitleMarkdown = apiGoldValueProps2.getSubtitleMarkdown();
                                composer8.startReplaceGroup(568156927);
                                if (subtitleMarkdown == null) {
                                    companion2 = companion7;
                                    i10 = i13;
                                    i11 = 0;
                                } else {
                                    i10 = i13;
                                    companion2 = companion7;
                                    i11 = 0;
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer8, i10).m21593getSmallD9Ej5fM()), composer8, 0);
                                    composer8 = composer6;
                                    BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, companion6.m7919getCentere0LSkKk(), 0L, 0L, false, composer6, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer8, MarkdownStyle.$stable << 6, 26);
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                composer8.endReplaceGroup();
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer8, i10).m21591getLargeD9Ej5fM()), composer8, i11);
                                composer8.endNode();
                                composer8.startReplaceGroup(218399148);
                                for (ApiGoldValueProp apiGoldValueProp : apiGoldValueProps2.getValueProps()) {
                                    String title2 = apiGoldValueProp.getTitle();
                                    String content = apiGoldValueProp.getContent();
                                    ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(apiGoldValueProp.getPogKey());
                                    if (serverToBentoAssetMapper3FromServerValue != null) {
                                        icon = new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue);
                                        obj = null;
                                    } else {
                                        obj = null;
                                        icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null);
                                    }
                                    BentoValuePropRow3.BentoValuePropRow(title2, content, icon, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), composer8, 27648, 0);
                                    composer8 = composer6;
                                }
                                composer6.endReplaceGroup();
                                LegacyGoldUpgradeValuePropsComposable.PricingDisclosureSection(apiGoldValueProps2.getGoldMonthlyCost(), apiGoldValueProps2.getGoldFreeDays(), apiGoldValueProps2.getDisclosureMarkdown(), apiGoldValueProps2.getLearnMoreButton(), function12, composer6, 0);
                                composer6.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), composer5, 3456, 3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 100663296, 156);
                composer4 = composer3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                legacyGoldUpgradeValuePropsDuxo3 = legacyGoldUpgradeValuePropsDuxo2;
                screen5 = screen6;
                context4 = context5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                legacyGoldUpgradeValuePropsDuxo3 = legacyGoldUpgradeValuePropsDuxo2;
                screen5 = screen2;
                context4 = context2;
                composer4 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LegacyGoldUpgradeValuePropsComposable.GoldUpgradeValuePropsComposable$lambda$5(goldValueProps, onLearnMore, onContinue, legacyGoldUpgradeValuePropsDuxo3, screen5, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        context2 = context;
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i6 == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer3 = composer2;
                LoggableViewState2 loggableViewState2LoadedState2 = GoldUpgradeValuePropsComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(legacyGoldUpgradeValuePropsDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7)).loadedState();
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null);
                Screen screen62 = screen4;
                Context context52 = context3;
                composer3.startReplaceGroup(5004770);
                zChangedInstance = composer3.changedInstance(legacyGoldUpgradeValuePropsDuxo2);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeValuePropsComposable.GoldUpgradeValuePropsComposable$lambda$2$lambda$1(legacyGoldUpgradeValuePropsDuxo2);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                    Function0 function02 = (Function0) objRememberedValue;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(5004770);
                    zChangedInstance2 = composer3.changedInstance(legacyGoldUpgradeValuePropsDuxo2);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LegacyGoldUpgradeValuePropsComposable.GoldUpgradeValuePropsComposable$lambda$4$lambda$3(legacyGoldUpgradeValuePropsDuxo2);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                        composer3.endReplaceGroup();
                        ScreenLoggable2.ScreenLoggable(loggableViewState2LoadedState2, userInteractionEventDescriptor2, false, null, null, function02, (Function0) objRememberedValue2, null, ComposableLambda3.rememberComposableLambda(-509995423, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt.GoldUpgradeValuePropsComposable.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i7) {
                                if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-509995423, i7, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropsComposable.<anonymous> (LegacyGoldUpgradeValuePropsComposable.kt:76)");
                                }
                                final ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps = goldValueProps;
                                final Function0<Unit> function022 = onContinue;
                                final Function1<? super DeeplinkAction, Boolean> function1 = onLearnMore;
                                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1701238315, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$GoldUpgradeValuePropsComposable$3$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer6, Integer num) {
                                        invoke(bentoButtonBar3, composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer6, int i8) {
                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                        if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1701238315, i8, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropsComposable.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeValuePropsComposable.kt:79)");
                                        }
                                        LegacyGoldUpgradeValuePropsComposable.GoldBottomBar(apiGoldValueProps.getCtaText(), function022, composer6, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer5, 54), ComposableLambda3.rememberComposableLambda(1467396888, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$GoldUpgradeValuePropsComposable$3$1$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer6, Integer num) {
                                        invoke(boxScope, composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer6, int i8) {
                                        ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps2;
                                        BentoTheme bentoTheme;
                                        int i9;
                                        Modifier.Companion companion;
                                        boolean z;
                                        int i10;
                                        Modifier.Companion companion2;
                                        int i11;
                                        BentoValuePropRow2 icon;
                                        Object obj;
                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                        if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1467396888, i8, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropsComposable.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeValuePropsComposable.kt:85)");
                                        }
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer6, 0, 1), false, null, false, 14, null);
                                        Alignment.Companion companion4 = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                                        ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps3 = apiGoldValueProps;
                                        Function1<DeeplinkAction, Boolean> function12 = function1;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer6, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierVerticalScroll$default);
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                        if (composer6.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer6, 6, 1);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getCenterHorizontally(), composer6, 48);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer6, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                        if (composer6.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor2);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer6);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(apiGoldValueProps3.getImagePath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composer6.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer6, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_value_props_asset_height, composer6, 0)), "gold_upgrade_value_props_asset"), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer6, 24624, 104);
                                        Composer composer7 = composer6;
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i12 = BentoTheme.$stable;
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer7, i12).m21591getLargeD9Ej5fM()), composer7, 0);
                                        final ApiGoldUpgradeFlow.ApiGoldValuePropsInfoTag infoTag = apiGoldValueProps3.getInfoTag();
                                        composer7.startReplaceGroup(568112220);
                                        if (infoTag == null) {
                                            bentoTheme = bentoTheme2;
                                            i9 = i12;
                                            companion = companion3;
                                            z = false;
                                            apiGoldValueProps2 = apiGoldValueProps3;
                                        } else {
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer7, i12).m21593getSmallD9Ej5fM()), composer7, 0);
                                            apiGoldValueProps2 = apiGoldValueProps3;
                                            bentoTheme = bentoTheme2;
                                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, bentoTheme2.getColors(composer7, i12).getSolLight(), 0L, 0L, bentoTheme2.getColors(composer7, i12).getJet(), 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-169618858, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$GoldUpgradeValuePropsComposable$3$1$2$1$1$1$1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                                                    invoke(composer8, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer8, int i13) {
                                                    String serverValue;
                                                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue;
                                                    if ((i13 & 3) == 2 && composer8.getSkipping()) {
                                                        composer8.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-169618858, i13, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeValuePropsComposable.kt:115)");
                                                    }
                                                    String label = infoTag.getLabel();
                                                    Icon icon2 = infoTag.getIcon();
                                                    Integer numValueOf = null;
                                                    if (icon2 != null && (serverValue = icon2.getServerValue()) != null && (serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(serverValue)) != null) {
                                                        numValueOf = Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId());
                                                    }
                                                    InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(label, UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.INFO_TAG, infoTag.getIdentifier(), false, composer8, 54, 4), numValueOf, null, null, false, null, null, composer8, 12582912, 120);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer7, 54), composer6, 805306368, 493);
                                            composer7 = composer6;
                                            i9 = i12;
                                            companion = companion3;
                                            z = false;
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer7, i9).m21593getSmallD9Ej5fM()), composer7, 0);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        composer7.endReplaceGroup();
                                        String title = apiGoldValueProps2.getTitle();
                                        TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer7, i9).getDisplayCapsuleLarge();
                                        TextAlign.Companion companion6 = TextAlign.INSTANCE;
                                        int i13 = i9;
                                        Modifier.Companion companion7 = companion;
                                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer6, 0, 0, 8126);
                                        Composer composer8 = composer6;
                                        String subtitleMarkdown = apiGoldValueProps2.getSubtitleMarkdown();
                                        composer8.startReplaceGroup(568156927);
                                        if (subtitleMarkdown == null) {
                                            companion2 = companion7;
                                            i10 = i13;
                                            i11 = 0;
                                        } else {
                                            i10 = i13;
                                            companion2 = companion7;
                                            i11 = 0;
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer8, i10).m21593getSmallD9Ej5fM()), composer8, 0);
                                            composer8 = composer6;
                                            BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, companion6.m7919getCentere0LSkKk(), 0L, 0L, false, composer6, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer8, MarkdownStyle.$stable << 6, 26);
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                        composer8.endReplaceGroup();
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer8, i10).m21591getLargeD9Ej5fM()), composer8, i11);
                                        composer8.endNode();
                                        composer8.startReplaceGroup(218399148);
                                        for (ApiGoldValueProp apiGoldValueProp : apiGoldValueProps2.getValueProps()) {
                                            String title2 = apiGoldValueProp.getTitle();
                                            String content = apiGoldValueProp.getContent();
                                            ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(apiGoldValueProp.getPogKey());
                                            if (serverToBentoAssetMapper3FromServerValue != null) {
                                                icon = new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue);
                                                obj = null;
                                            } else {
                                                obj = null;
                                                icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null);
                                            }
                                            BentoValuePropRow3.BentoValuePropRow(title2, content, icon, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), composer8, 27648, 0);
                                            composer8 = composer6;
                                        }
                                        composer6.endReplaceGroup();
                                        LegacyGoldUpgradeValuePropsComposable.PricingDisclosureSection(apiGoldValueProps2.getGoldMonthlyCost(), apiGoldValueProps2.getGoldFreeDays(), apiGoldValueProps2.getDisclosureMarkdown(), apiGoldValueProps2.getLearnMoreButton(), function12, composer6, 0);
                                        composer6.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer5, 54), composer5, 3456, 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 100663296, 156);
                        composer4 = composer3;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        legacyGoldUpgradeValuePropsDuxo3 = legacyGoldUpgradeValuePropsDuxo2;
                        screen5 = screen62;
                        context4 = context52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeValuePropsComposable$lambda$2$lambda$1(LegacyGoldUpgradeValuePropsDuxo legacyGoldUpgradeValuePropsDuxo) {
        legacyGoldUpgradeValuePropsDuxo.completePerformanceMetrics();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeValuePropsComposable$lambda$4$lambda$3(LegacyGoldUpgradeValuePropsDuxo legacyGoldUpgradeValuePropsDuxo) {
        legacyGoldUpgradeValuePropsDuxo.failPerformanceMetrics();
        return Unit.INSTANCE;
    }

    private static final LegacyGoldUpgradeValuePropsViewState GoldUpgradeValuePropsComposable$lambda$0(SnapshotState4<LegacyGoldUpgradeValuePropsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PricingDisclosureSection(final String str, final String str2, final String str3, final TextButton<DeeplinkAction> textButton, final Function1<? super DeeplinkAction, Boolean> function1, Composer composer, final int i) {
        int i2;
        String str4;
        int i3;
        BentoTheme bentoTheme;
        int i4;
        int i5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(274100237);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str4 = str3;
            i2 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
        } else {
            str4 = str3;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(textButton) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(274100237, i2, -1, "com.robinhood.android.gold.upgrade.legacy.PricingDisclosureSection (LegacyGoldUpgradeValuePropsComposable.kt:176)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i7).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1604589032);
            if (StringsKt.isBlank(str)) {
                i3 = i2;
                bentoTheme = bentoTheme2;
                i4 = i7;
                i5 = 16384;
            } else {
                int i8 = i2 & 14;
                i5 = 16384;
                i3 = i2;
                i4 = i7;
                bentoTheme = bentoTheme2;
                BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleSmall(), composerStartRestartGroup, i8, 0, 8126);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1604578876);
            if (!StringsKt.isBlank(str2)) {
                Composer composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composer2, (i3 >> 3) & 14, 0, 8126);
                composerStartRestartGroup = composer2;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1604569252);
            if (StringsKt.isBlank(textButton.getLabel())) {
                i6 = 0;
            } else {
                ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(textButton);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z = (i3 & 57344) == i5;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$PricingDisclosureSection$1$1$1
                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                        public final boolean mo15941handle(DeeplinkAction action) {
                            Intrinsics.checkNotNullParameter(action, "action");
                            return function1.invoke(action).booleanValue();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1772220517);
                Composer composer3 = composerStartRestartGroup;
                SduiColumns.SduiColumn(immutableList3PersistentListOf, DeeplinkAction.class, companion, null, (SduiActionHandler) objRememberedValue, HorizontalPadding.Default, arrangement.getTop(), companion2.getStart(), false, composer3, 100663296, 0);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endReplaceGroup();
                i6 = 0;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i6);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            Composer composer4 = composerStartRestartGroup;
            BentoMarkdownText2.BentoMarkdownText(str4, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), 0, bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), false, composer4, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, ((i3 >> 6) & 14) | (MarkdownStyle.$stable << 6), 26);
            composerStartRestartGroup = composer4;
            composerStartRestartGroup.endNode();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeValuePropsComposable.PricingDisclosureSection$lambda$9(str, str2, str3, textButton, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GoldBottomBar(final String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1009827425);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1009827425, i2, -1, "com.robinhood.android.gold.upgrade.legacy.GoldBottomBar (LegacyGoldUpgradeValuePropsComposable.kt:230)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LegacyGoldUpgradeValuePropsComposable.GoldBottomBar$lambda$12$lambda$11$lambda$10(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoSparkleButton2.BentoSparkleButton((Function0) objRememberedValue, str, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, false, false, composerStartRestartGroup, ((i2 << 3) & 112) | 384, 120);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeValuePropsComposable.GoldBottomBar$lambda$13(str, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldBottomBar$lambda$12$lambda$11$lambda$10(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
