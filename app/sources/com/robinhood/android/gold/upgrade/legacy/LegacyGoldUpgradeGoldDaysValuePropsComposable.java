package com.robinhood.android.gold.upgrade.legacy;

import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.gold.BentoAppBarWithTransition;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.ScreenLoggable2;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.gold.upgrade.C18003R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagDefaults;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.bonfire.ApiGoldValueProp;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import java.util.UUID;
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
import kotlin.reflect.KFunction;

/* compiled from: LegacyGoldUpgradeGoldDaysValuePropsComposable.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u001a[\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a3\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u001aH\u0003¢\u0006\u0002\u0010\u001c\u001a5\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\"\u001a\u0015\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010&\u001a-\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u0010)\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0003¢\u0006\u0002\u0010*\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002"}, m3636d2 = {"GoldUpgradeGoldDaysValuePropsAssetTestTag", "", "getGoldUpgradeGoldDaysValuePropsAssetTestTag$annotations", "()V", "GoldUpgradeGoldDaysValuePropsComposable", "", "goldDaysValueProps", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysValueProps;", "onClickCta", "Lkotlin/Function0;", "onClickClose", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeGoldDaysValuePropsDuxo;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysValueProps;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeGoldDaysValuePropsDuxo;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "PlanSelectionSection", "planSelectionSection", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysPlanSelectionSection;", "selectedPlanId", "Ljava/util/UUID;", "onSelectPlanOption", "Lkotlin/Function1;", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanSelectionOption;", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysPlanSelectionSection;Ljava/util/UUID;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PlanSelectionOption", "planSelectionOption", "isSelected", "", "onSelect", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanSelectionOption;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AdditionalValueProps", "additionalValueProps", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysAdditionalValueProps;", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysAdditionalValueProps;Landroidx/compose/runtime/Composer;I)V", "BottomBar", "ctaDisclosureMarkdown", "ctaText", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeGoldDaysValuePropsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeGoldDaysValuePropsComposable {
    public static final String GoldUpgradeGoldDaysValuePropsAssetTestTag = "gold_upgrade_gold_days_value_props_asset";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdditionalValueProps$lambda$19(ApiGoldUpgradeFlow.ApiGoldDaysAdditionalValueProps apiGoldDaysAdditionalValueProps, int i, Composer composer, int i2) {
        AdditionalValueProps(apiGoldDaysAdditionalValueProps, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$22(String str, String str2, Function0 function0, int i, Composer composer, int i2) {
        BottomBar(str, str2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeGoldDaysValuePropsComposable$lambda$1(ApiGoldUpgradeFlow.ApiGoldDaysValueProps apiGoldDaysValueProps, Function0 function0, Function0 function02, Modifier modifier, LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo, Screen screen, Context context, int i, int i2, Composer composer, int i3) {
        GoldUpgradeGoldDaysValuePropsComposable(apiGoldDaysValueProps, function0, function02, modifier, legacyGoldUpgradeGoldDaysValuePropsDuxo, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlanSelectionOption$lambda$13(ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption apiGoldPlanSelectionOption, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlanSelectionOption(apiGoldPlanSelectionOption, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlanSelectionSection$lambda$9(ApiGoldUpgradeFlow.ApiGoldDaysPlanSelectionSection apiGoldDaysPlanSelectionSection, UUID uuid, Function1 function1, int i, Composer composer, int i2) {
        PlanSelectionSection(apiGoldDaysPlanSelectionSection, uuid, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getGoldUpgradeGoldDaysValuePropsAssetTestTag$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyGoldUpgradeGoldDaysValuePropsViewState GoldUpgradeGoldDaysValuePropsComposable$lambda$0(SnapshotState4<LegacyGoldUpgradeGoldDaysValuePropsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUpgradeGoldDaysValuePropsComposable(final ApiGoldUpgradeFlow.ApiGoldDaysValueProps goldDaysValueProps, final Function0<Unit> onClickCta, final Function0<Unit> onClickClose, Modifier modifier, LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo, Screen screen, Context context, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo2;
        final Screen screen2;
        int i4;
        Context context2;
        boolean z;
        final Screen screen3;
        final Modifier modifier3;
        final LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo3;
        int i5;
        final Context context3;
        CreationExtras defaultViewModelCreationExtras;
        final Context context4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(goldDaysValueProps, "goldDaysValueProps");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Intrinsics.checkNotNullParameter(onClickClose, "onClickClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(984082993);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(goldDaysValueProps) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickCta) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickClose) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    legacyGoldUpgradeGoldDaysValuePropsDuxo2 = legacyGoldUpgradeGoldDaysValuePropsDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(legacyGoldUpgradeGoldDaysValuePropsDuxo2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    legacyGoldUpgradeGoldDaysValuePropsDuxo2 = legacyGoldUpgradeGoldDaysValuePropsDuxo;
                }
                i3 |= i7;
            } else {
                legacyGoldUpgradeGoldDaysValuePropsDuxo2 = legacyGoldUpgradeGoldDaysValuePropsDuxo;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    screen2 = screen;
                    int i8 = composerStartRestartGroup.changedInstance(screen2) ? 131072 : 65536;
                    i3 |= i8;
                } else {
                    screen2 = screen;
                }
                i3 |= i8;
            } else {
                screen2 = screen;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    context2 = context;
                    i3 |= composerStartRestartGroup.changedInstance(context2) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 16) == 0) {
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
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LegacyGoldUpgradeGoldDaysValuePropsDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$GoldUpgradeGoldDaysValuePropsComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$GoldUpgradeGoldDaysValuePropsComposable$$inlined$duxo$1.1
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
                            legacyGoldUpgradeGoldDaysValuePropsDuxo2 = (LegacyGoldUpgradeGoldDaysValuePropsDuxo) baseDuxo;
                            i3 &= -57345;
                        } else {
                            z = false;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            screen2 = new Screen(Screen.Name.GOLD_VALUE_PROPS, null, goldDaysValueProps.getLoggingIdentifier(), null, 10, null);
                        }
                        if (i4 == 0) {
                            screen3 = screen2;
                            modifier3 = modifier4;
                            legacyGoldUpgradeGoldDaysValuePropsDuxo3 = legacyGoldUpgradeGoldDaysValuePropsDuxo2;
                            i5 = i3;
                            context3 = null;
                        } else {
                            screen3 = screen2;
                            modifier3 = modifier4;
                            legacyGoldUpgradeGoldDaysValuePropsDuxo3 = legacyGoldUpgradeGoldDaysValuePropsDuxo2;
                            i5 = i3;
                            context3 = context;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        legacyGoldUpgradeGoldDaysValuePropsDuxo3 = legacyGoldUpgradeGoldDaysValuePropsDuxo2;
                        screen3 = screen2;
                        i5 = i3;
                        modifier3 = modifier2;
                        context3 = context2;
                        z = false;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(984082993, i5, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:90)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(legacyGoldUpgradeGoldDaysValuePropsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    OverrideSystemBarsStyle.OverrideStatusBarStyle(z, composerStartRestartGroup, 6);
                    Composer composer2 = composerStartRestartGroup;
                    BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1787547271, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt.GoldUpgradeGoldDaysValuePropsComposable.1
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
                                ComposerKt.traceEventStart(-1787547271, i9, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:96)");
                            }
                            LoggableViewState2 loggableViewState2LoadedState = LegacyGoldUpgradeGoldDaysValuePropsComposable.GoldUpgradeGoldDaysValuePropsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).loadedState();
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen3, null, context3, null, null, 53, null);
                            LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo4 = legacyGoldUpgradeGoldDaysValuePropsDuxo3;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(legacyGoldUpgradeGoldDaysValuePropsDuxo4);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new LegacyGoldUpgradeGoldDaysValuePropsComposable2(legacyGoldUpgradeGoldDaysValuePropsDuxo4);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                            LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo5 = legacyGoldUpgradeGoldDaysValuePropsDuxo3;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer3.changedInstance(legacyGoldUpgradeGoldDaysValuePropsDuxo5);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new LegacyGoldUpgradeGoldDaysValuePropsComposable3(legacyGoldUpgradeGoldDaysValuePropsDuxo5);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceGroup();
                            final ApiGoldUpgradeFlow.ApiGoldDaysValueProps apiGoldDaysValueProps = goldDaysValueProps;
                            final Modifier modifier5 = modifier3;
                            final Function0<Unit> function02 = onClickCta;
                            final LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo6 = legacyGoldUpgradeGoldDaysValuePropsDuxo3;
                            final SnapshotState4<LegacyGoldUpgradeGoldDaysValuePropsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            final Function0<Unit> function03 = onClickClose;
                            ScreenLoggable2.ScreenLoggable(loggableViewState2LoadedState, userInteractionEventDescriptor, false, null, null, function0, (Function0) ((KFunction) objRememberedValue3), null, ComposableLambda3.rememberComposableLambda(-342118885, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt.GoldUpgradeGoldDaysValuePropsComposable.1.3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i10) {
                                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-342118885, i10, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:105)");
                                    }
                                    final ApiGoldUpgradeFlow.ApiGoldDaysValueProps apiGoldDaysValueProps2 = apiGoldDaysValueProps;
                                    Modifier modifier6 = modifier5;
                                    final Function0<Unit> function04 = function02;
                                    final LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo7 = legacyGoldUpgradeGoldDaysValuePropsDuxo6;
                                    final SnapshotState4<LegacyGoldUpgradeGoldDaysValuePropsViewState> snapshotState42 = snapshotState4;
                                    final Function0<Unit> function05 = function03;
                                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(Background3.m4872backgroundbw27NRU$default(ModifiersKt.logScreenTransitions$default(modifier6, null, 1, null), BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), false, ComposableLambda3.rememberComposableLambda(-783685958, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$GoldUpgradeGoldDaysValuePropsComposable$1$3$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer5, Integer num) {
                                            invoke(bentoButtonBar3, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer5, int i11) {
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i11 & 17) == 16 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-783685958, i11, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:108)");
                                            }
                                            LegacyGoldUpgradeGoldDaysValuePropsComposable.BottomBar(apiGoldDaysValueProps2.getCtaDisclosureMarkdown(), apiGoldDaysValueProps2.getCtaText(), function04, composer5, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), ComposableLambda3.rememberComposableLambda(304494573, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$GoldUpgradeGoldDaysValuePropsComposable$1$3$1$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                            invoke(boxScope, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer5, int i11) {
                                            Modifier.Companion companion;
                                            BentoTheme bentoTheme;
                                            int i12;
                                            LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo8;
                                            ApiGoldUpgradeFlow.ApiGoldDaysValueProps apiGoldDaysValueProps3;
                                            boolean z2;
                                            int i13;
                                            Modifier.Companion companion2;
                                            int i14;
                                            int i15;
                                            Modifier.Companion companion3;
                                            int i16;
                                            BentoTheme bentoTheme2;
                                            BentoValuePropRow2 icon;
                                            Object obj;
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i11 & 17) == 16 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(304494573, i11, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:118)");
                                            }
                                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer5, 0, 1);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null);
                                            ApiGoldUpgradeFlow.ApiGoldDaysValueProps apiGoldDaysValueProps4 = apiGoldDaysValueProps2;
                                            LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo9 = legacyGoldUpgradeGoldDaysValuePropsDuxo7;
                                            SnapshotState4<LegacyGoldUpgradeGoldDaysValuePropsViewState> snapshotState43 = snapshotState42;
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.Vertical top = arrangement.getTop();
                                            Alignment.Companion companion5 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion5.getStart(), composer5, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierVerticalScroll$default);
                                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                            if (composer5.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(apiGoldDaysValueProps4.getAssetPath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composer5.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer5, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_gold_days_value_props_asset_height, composer5, 0)), LegacyGoldUpgradeGoldDaysValuePropsComposable.GoldUpgradeGoldDaysValuePropsAssetTestTag), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer5, 24624, 104);
                                            Composer composer6 = composer5;
                                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                            int i17 = BentoTheme.$stable;
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composer6, i17).m21592getMediumD9Ej5fM()), composer6, 0);
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composer6, 6, 1);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composer6, 0);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer6, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                                            final ApiGoldUpgradeFlow.ApiGoldValuePropsInfoTag infoTag = apiGoldDaysValueProps4.getInfoTag();
                                            composer6.startReplaceGroup(-1601023795);
                                            if (infoTag == null) {
                                                i12 = i17;
                                                companion = companion4;
                                                z2 = false;
                                                legacyGoldUpgradeGoldDaysValuePropsDuxo8 = legacyGoldUpgradeGoldDaysValuePropsDuxo9;
                                                bentoTheme = bentoTheme3;
                                                apiGoldDaysValueProps3 = apiGoldDaysValueProps4;
                                            } else {
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composer6, i17).m21593getSmallD9Ej5fM()), composer6, 0);
                                                InfoTagDefaults infoTagDefaults = InfoTagDefaults.INSTANCE;
                                                companion = companion4;
                                                bentoTheme = bentoTheme3;
                                                i12 = i17;
                                                legacyGoldUpgradeGoldDaysValuePropsDuxo8 = legacyGoldUpgradeGoldDaysValuePropsDuxo9;
                                                apiGoldDaysValueProps3 = apiGoldDaysValueProps4;
                                                SurfaceKt.m5967SurfaceT9BRK9s(BorderKt.m4876borderxT4_qwU(UtilKt.autoLogEvents(companion4, Component.ComponentType.BUTTON, infoTag.getIdentifier(), false, composer5, 54, 4), C2002Dp.m7995constructorimpl(1), bentoTheme3.getColors(composer5, i17).m21425getFg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults.m20818getShapeRadiusD9Ej5fM())), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults.m20818getShapeRadiusD9Ej5fM()), bentoTheme3.getColors(composer6, i17).m21371getBg0d7_KjU(), bentoTheme3.getColors(composer6, i17).m21425getFg0d7_KjU(), 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-963651998, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$GoldUpgradeGoldDaysValuePropsComposable$1$3$1$2$1$1$1$1
                                                    public final void invoke(Composer composer7, int i18) {
                                                        if ((i18 & 3) == 2 && composer7.getSkipping()) {
                                                            composer7.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-963651998, i18, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:159)");
                                                        }
                                                        Modifier.Companion companion7 = Modifier.INSTANCE;
                                                        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                                        int i19 = BentoTheme.$stable;
                                                        Modifier modifierM5145paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m5145paddingqDBjuR0(companion7, C2002Dp.m7995constructorimpl(bentoTheme4.getSpacing(composer7, i19).m21593getSmallD9Ej5fM() + bentoTheme4.getSpacing(composer7, i19).m21595getXsmallD9Ej5fM()), bentoTheme4.getSpacing(composer7, i19).m21595getXsmallD9Ej5fM(), bentoTheme4.getSpacing(composer7, i19).m21590getDefaultD9Ej5fM(), bentoTheme4.getSpacing(composer7, i19).m21595getXsmallD9Ej5fM());
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        ApiGoldUpgradeFlow.ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag = infoTag;
                                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer7, 48);
                                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                                        CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer7, modifierM5145paddingqDBjuR0);
                                                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                                                        if (composer7.getApplier() == null) {
                                                            Composables.invalidApplier();
                                                        }
                                                        composer7.startReusableNode();
                                                        if (composer7.getInserting()) {
                                                            composer7.createNode(constructor3);
                                                        } else {
                                                            composer7.useNode();
                                                        }
                                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer7);
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion8.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion8.getSetModifier());
                                                        Row6 row6 = Row6.INSTANCE;
                                                        ServerToBentoAssetMapper2.Companion companion9 = ServerToBentoAssetMapper2.INSTANCE;
                                                        Icon icon2 = apiGoldValuePropsInfoTag.getIcon();
                                                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = companion9.fromServerValue(icon2 != null ? icon2.getServerValue() : null);
                                                        composer7.startReplaceGroup(-134673404);
                                                        if (serverToBentoAssetMapper2FromServerValue != null) {
                                                            composer7.startReplaceGroup(-134671493);
                                                            if (serverToBentoAssetMapper2FromServerValue != ServerToBentoAssetMapper2.UNKNOWN) {
                                                                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(serverToBentoAssetMapper2FromServerValue.getResourceId(), composer7, 0), serverToBentoAssetMapper2FromServerValue.getServerValue(), LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(companion7, C2002Dp.m7995constructorimpl(16)), false, 1, null), bentoTheme4.getColors(composer7, i19).m21425getFg0d7_KjU(), composer7, 0, 0);
                                                            }
                                                            composer7.endReplaceGroup();
                                                        }
                                                        composer7.endReplaceGroup();
                                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion7, bentoTheme4.getSpacing(composer7, i19).m21593getSmallD9Ej5fM()), composer7, 0);
                                                        BentoText2.m20747BentoText38GnDrw(apiGoldValuePropsInfoTag.getLabel(), null, Color.m6701boximpl(bentoTheme4.getColors(composer7, i19).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer7, i19).getTextS(), composer7, 24576, 0, 8170);
                                                        composer7.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                        invoke(composer7, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }
                                                }, composer5, 54), composer5, 12582912, 112);
                                                composer6 = composer5;
                                                z2 = false;
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer6, i12).m21590getDefaultD9Ej5fM()), composer6, 0);
                                                Unit unit = Unit.INSTANCE;
                                            }
                                            composer6.endReplaceGroup();
                                            String title = apiGoldDaysValueProps3.getTitle();
                                            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer6, i12).getDisplayCapsuleLarge();
                                            TextAlign.Companion companion7 = TextAlign.INSTANCE;
                                            BentoTheme bentoTheme4 = bentoTheme;
                                            Modifier.Companion companion8 = companion;
                                            int i18 = i12;
                                            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion7.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer5, 0, 0, 8126);
                                            Composer composer7 = composer5;
                                            String subtitleMarkdown = apiGoldDaysValueProps3.getSubtitleMarkdown();
                                            composer7.startReplaceGroup(-1600907765);
                                            if (subtitleMarkdown == null) {
                                                companion2 = companion8;
                                                i13 = i18;
                                                i15 = 6;
                                                i14 = 0;
                                            } else {
                                                i13 = i18;
                                                companion2 = companion8;
                                                i14 = 0;
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme4.getSpacing(composer7, i13).m21593getSmallD9Ej5fM()), composer7, 0);
                                                i15 = 6;
                                                composer7 = composer5;
                                                BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, companion7.m7924getStarte0LSkKk(), 0L, 0L, false, composer5, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer7, MarkdownStyle.$stable << 6, 26);
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                            composer7.endReplaceGroup();
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme4.getSpacing(composer7, i13).m21591getLargeD9Ej5fM()), composer7, i14);
                                            composer7.endNode();
                                            composer7.startReplaceGroup(929191317);
                                            for (ApiGoldValueProp apiGoldValueProp : apiGoldDaysValueProps3.getValueProps()) {
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
                                                BentoValuePropRow3.BentoValuePropRow(title2, content, icon, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), composer7, 27648, 0);
                                            }
                                            composer7.endReplaceGroup();
                                            Modifier.Companion companion9 = Modifier.INSTANCE;
                                            BentoTheme bentoTheme5 = BentoTheme.INSTANCE;
                                            int i19 = BentoTheme.$stable;
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion9, bentoTheme5.getSpacing(composer7, i19).m21591getLargeD9Ej5fM()), composer7, i14);
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion9, 0.0f, composer7, i15, 1);
                                            Arrangement arrangement2 = Arrangement.INSTANCE;
                                            Arrangement.Vertical top2 = arrangement2.getTop();
                                            Alignment.Companion companion10 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion10.getStart(), composer7, i14);
                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer7, i14);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer7, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                                            ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor3 = companion11.getConstructor();
                                            if (composer7.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer7.startReusableNode();
                                            if (composer7.getInserting()) {
                                                composer7.createNode(constructor3);
                                            } else {
                                                composer7.useNode();
                                            }
                                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer7);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion11.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion11.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion11.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion11.getSetModifier());
                                            Column6 column62 = Column6.INSTANCE;
                                            ApiGoldUpgradeFlow.ApiGoldDaysPlanSelectionSection planSelectionSection = apiGoldDaysValueProps3.getPlanSelectionSection();
                                            UUID selectedPlanId = LegacyGoldUpgradeGoldDaysValuePropsComposable.GoldUpgradeGoldDaysValuePropsComposable$lambda$0(snapshotState43).getSelectedPlanId();
                                            composer7.startReplaceGroup(5004770);
                                            LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo10 = legacyGoldUpgradeGoldDaysValuePropsDuxo8;
                                            boolean zChangedInstance4 = composer7.changedInstance(legacyGoldUpgradeGoldDaysValuePropsDuxo10);
                                            Object objRememberedValue4 = composer7.rememberedValue();
                                            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = new LegacyGoldUpgradeGoldDaysValuePropsComposable7(legacyGoldUpgradeGoldDaysValuePropsDuxo10);
                                                composer7.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer7.endReplaceGroup();
                                            LegacyGoldUpgradeGoldDaysValuePropsComposable.PlanSelectionSection(planSelectionSection, selectedPlanId, (Function1) ((KFunction) objRememberedValue4), composer7, i14);
                                            String goldFreeDays = apiGoldDaysValueProps3.getGoldFreeDays();
                                            composer7.startReplaceGroup(784078336);
                                            if (goldFreeDays == null) {
                                                companion3 = companion9;
                                                bentoTheme2 = bentoTheme5;
                                                i16 = i19;
                                            } else {
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion9, bentoTheme5.getSpacing(composer7, i19).m21592getMediumD9Ej5fM()), composer7, i14);
                                                companion3 = companion9;
                                                i16 = i19;
                                                bentoTheme2 = bentoTheme5;
                                                BentoText2.m20747BentoText38GnDrw(goldFreeDays, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16382);
                                                composer7 = composer5;
                                                Unit unit3 = Unit.INSTANCE;
                                            }
                                            composer7.endReplaceGroup();
                                            int i20 = i16;
                                            Modifier.Companion companion12 = companion3;
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion12, bentoTheme2.getSpacing(composer7, i20).m21591getLargeD9Ej5fM()), composer7, 0);
                                            composer7.endNode();
                                            ApiGoldUpgradeFlow.ApiGoldDaysAdditionalValueProps additionalValueProps = apiGoldDaysValueProps3.getAdditionalValueProps();
                                            composer7.startReplaceGroup(929240344);
                                            if (additionalValueProps != null) {
                                                LegacyGoldUpgradeGoldDaysValuePropsComposable.AdditionalValueProps(additionalValueProps, composer7, 0);
                                                Unit unit4 = Unit.INSTANCE;
                                            }
                                            composer7.endReplaceGroup();
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion12, bentoTheme2.getSpacing(composer7, i20).m21591getLargeD9Ej5fM()), composer7, 0);
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion12, 0.0f, composer7, 6, 1);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion10.getStart(), composer7, 0);
                                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer7, modifierM21623defaultHorizontalPaddingrAjV9yQ3);
                                            Function0<ComposeUiNode> constructor4 = companion11.getConstructor();
                                            if (composer7.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer7.startReusableNode();
                                            if (composer7.getInserting()) {
                                                composer7.createNode(constructor4);
                                            } else {
                                                composer7.useNode();
                                            }
                                            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer7);
                                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy4, companion11.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion11.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion11.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion11.getSetModifier());
                                            BentoMarkdownText2.BentoMarkdownText(apiGoldDaysValueProps3.getDisclosureMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer7, i20).getTextS(), 0, bentoTheme2.getColors(composer7, i20).m21426getFg20d7_KjU(), bentoTheme2.getColors(composer7, i20).m21426getFg20d7_KjU(), false, composer5, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer5, MarkdownStyle.$stable << 6, 26);
                                            composer5.endNode();
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion12, bentoTheme2.getSpacing(composer5, i20).m21592getMediumD9Ej5fM()), composer5, 0);
                                            composer5.endNode();
                                            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_gold_days_value_props_asset_height, composer5, 0);
                                            final Function0<Unit> function06 = function05;
                                            BentoAppBarWithTransition.m12210BentoAppBarWithTransitionzVdqMik(scrollStateRememberScrollState, fDimensionResource, null, ComposableLambda3.rememberComposableLambda(1593032808, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$GoldUpgradeGoldDaysValuePropsComposable$1$3$1$2.2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer8, Integer num) {
                                                    invoke(bentoAppBarScope, composer8, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(final BentoAppBarScope BentoAppBarWithTransition, Composer composer8, int i21) {
                                                    int i22;
                                                    Intrinsics.checkNotNullParameter(BentoAppBarWithTransition, "$this$BentoAppBarWithTransition");
                                                    if ((i21 & 6) == 0) {
                                                        i22 = i21 | ((i21 & 8) == 0 ? composer8.changed(BentoAppBarWithTransition) : composer8.changedInstance(BentoAppBarWithTransition) ? 4 : 2);
                                                    } else {
                                                        i22 = i21;
                                                    }
                                                    if ((i22 & 19) == 18 && composer8.getSkipping()) {
                                                        composer8.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1593032808, i22, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:254)");
                                                    }
                                                    long nova = BentoTheme.INSTANCE.getColors(composer8, BentoTheme.$stable).getNova();
                                                    final Function0<Unit> function07 = function06;
                                                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, nova, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1580718166, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt.GoldUpgradeGoldDaysValuePropsComposable.1.3.1.2.2.1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer9, Integer num) {
                                                            invoke(composer9, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer9, int i23) {
                                                            if ((i23 & 3) == 2 && composer9.getSkipping()) {
                                                                composer9.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1580718166, i23, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:255)");
                                                            }
                                                            BentoAppBarWithTransition.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function07, composer9, BentoAppBarScope.$stable << 12, 7);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer8, 54), composer8, 805306368, 509);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer5, 54), null, null, null, 0L, 0L, composer5, 3072, 500);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), composer4, 3456, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 100663296, 156);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup = composer2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    context4 = context3;
                    legacyGoldUpgradeGoldDaysValuePropsDuxo2 = legacyGoldUpgradeGoldDaysValuePropsDuxo3;
                    modifier2 = modifier3;
                    screen2 = screen3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    context4 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LegacyGoldUpgradeGoldDaysValuePropsComposable.GoldUpgradeGoldDaysValuePropsComposable$lambda$1(goldDaysValueProps, onClickCta, onClickClose, modifier2, legacyGoldUpgradeGoldDaysValuePropsDuxo2, screen2, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            context2 = context;
            if ((599187 & i3) != 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i4 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final SnapshotState4<LegacyGoldUpgradeGoldDaysValuePropsViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(legacyGoldUpgradeGoldDaysValuePropsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    OverrideSystemBarsStyle.OverrideStatusBarStyle(z, composerStartRestartGroup, 6);
                    Composer composer22 = composerStartRestartGroup;
                    BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1787547271, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt.GoldUpgradeGoldDaysValuePropsComposable.1
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
                                ComposerKt.traceEventStart(-1787547271, i9, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:96)");
                            }
                            LoggableViewState2 loggableViewState2LoadedState = LegacyGoldUpgradeGoldDaysValuePropsComposable.GoldUpgradeGoldDaysValuePropsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).loadedState();
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen3, null, context3, null, null, 53, null);
                            LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo4 = legacyGoldUpgradeGoldDaysValuePropsDuxo3;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(legacyGoldUpgradeGoldDaysValuePropsDuxo4);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new LegacyGoldUpgradeGoldDaysValuePropsComposable2(legacyGoldUpgradeGoldDaysValuePropsDuxo4);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                            LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo5 = legacyGoldUpgradeGoldDaysValuePropsDuxo3;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer3.changedInstance(legacyGoldUpgradeGoldDaysValuePropsDuxo5);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new LegacyGoldUpgradeGoldDaysValuePropsComposable3(legacyGoldUpgradeGoldDaysValuePropsDuxo5);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceGroup();
                            final ApiGoldUpgradeFlow.ApiGoldDaysValueProps apiGoldDaysValueProps = goldDaysValueProps;
                            final Modifier modifier5 = modifier3;
                            final Function0<Unit> function02 = onClickCta;
                            final LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo6 = legacyGoldUpgradeGoldDaysValuePropsDuxo3;
                            final SnapshotState4<LegacyGoldUpgradeGoldDaysValuePropsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                            final Function0<Unit> function03 = onClickClose;
                            ScreenLoggable2.ScreenLoggable(loggableViewState2LoadedState, userInteractionEventDescriptor, false, null, null, function0, (Function0) ((KFunction) objRememberedValue3), null, ComposableLambda3.rememberComposableLambda(-342118885, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt.GoldUpgradeGoldDaysValuePropsComposable.1.3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i10) {
                                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-342118885, i10, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:105)");
                                    }
                                    final ApiGoldUpgradeFlow.ApiGoldDaysValueProps apiGoldDaysValueProps2 = apiGoldDaysValueProps;
                                    Modifier modifier6 = modifier5;
                                    final Function0<Unit> function04 = function02;
                                    final LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo7 = legacyGoldUpgradeGoldDaysValuePropsDuxo6;
                                    final SnapshotState4<LegacyGoldUpgradeGoldDaysValuePropsViewState> snapshotState42 = snapshotState4;
                                    final Function0<Unit> function05 = function03;
                                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(Background3.m4872backgroundbw27NRU$default(ModifiersKt.logScreenTransitions$default(modifier6, null, 1, null), BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), false, ComposableLambda3.rememberComposableLambda(-783685958, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$GoldUpgradeGoldDaysValuePropsComposable$1$3$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer5, Integer num) {
                                            invoke(bentoButtonBar3, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer5, int i11) {
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i11 & 17) == 16 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-783685958, i11, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:108)");
                                            }
                                            LegacyGoldUpgradeGoldDaysValuePropsComposable.BottomBar(apiGoldDaysValueProps2.getCtaDisclosureMarkdown(), apiGoldDaysValueProps2.getCtaText(), function04, composer5, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), ComposableLambda3.rememberComposableLambda(304494573, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$GoldUpgradeGoldDaysValuePropsComposable$1$3$1$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                            invoke(boxScope, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer5, int i11) {
                                            Modifier.Companion companion;
                                            BentoTheme bentoTheme;
                                            int i12;
                                            LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo8;
                                            ApiGoldUpgradeFlow.ApiGoldDaysValueProps apiGoldDaysValueProps3;
                                            boolean z2;
                                            int i13;
                                            Modifier.Companion companion2;
                                            int i14;
                                            int i15;
                                            Modifier.Companion companion3;
                                            int i16;
                                            BentoTheme bentoTheme2;
                                            BentoValuePropRow2 icon;
                                            Object obj;
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i11 & 17) == 16 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(304494573, i11, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:118)");
                                            }
                                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer5, 0, 1);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null);
                                            ApiGoldUpgradeFlow.ApiGoldDaysValueProps apiGoldDaysValueProps4 = apiGoldDaysValueProps2;
                                            LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo9 = legacyGoldUpgradeGoldDaysValuePropsDuxo7;
                                            SnapshotState4<LegacyGoldUpgradeGoldDaysValuePropsViewState> snapshotState43 = snapshotState42;
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.Vertical top = arrangement.getTop();
                                            Alignment.Companion companion5 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion5.getStart(), composer5, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierVerticalScroll$default);
                                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                            if (composer5.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(apiGoldDaysValueProps4.getAssetPath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composer5.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer5, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_gold_days_value_props_asset_height, composer5, 0)), LegacyGoldUpgradeGoldDaysValuePropsComposable.GoldUpgradeGoldDaysValuePropsAssetTestTag), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer5, 24624, 104);
                                            Composer composer6 = composer5;
                                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                            int i17 = BentoTheme.$stable;
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composer6, i17).m21592getMediumD9Ej5fM()), composer6, 0);
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composer6, 6, 1);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composer6, 0);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer6, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                                            final ApiGoldUpgradeFlow.ApiGoldValuePropsInfoTag infoTag = apiGoldDaysValueProps4.getInfoTag();
                                            composer6.startReplaceGroup(-1601023795);
                                            if (infoTag == null) {
                                                i12 = i17;
                                                companion = companion4;
                                                z2 = false;
                                                legacyGoldUpgradeGoldDaysValuePropsDuxo8 = legacyGoldUpgradeGoldDaysValuePropsDuxo9;
                                                bentoTheme = bentoTheme3;
                                                apiGoldDaysValueProps3 = apiGoldDaysValueProps4;
                                            } else {
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composer6, i17).m21593getSmallD9Ej5fM()), composer6, 0);
                                                InfoTagDefaults infoTagDefaults = InfoTagDefaults.INSTANCE;
                                                companion = companion4;
                                                bentoTheme = bentoTheme3;
                                                i12 = i17;
                                                legacyGoldUpgradeGoldDaysValuePropsDuxo8 = legacyGoldUpgradeGoldDaysValuePropsDuxo9;
                                                apiGoldDaysValueProps3 = apiGoldDaysValueProps4;
                                                SurfaceKt.m5967SurfaceT9BRK9s(BorderKt.m4876borderxT4_qwU(UtilKt.autoLogEvents(companion4, Component.ComponentType.BUTTON, infoTag.getIdentifier(), false, composer5, 54, 4), C2002Dp.m7995constructorimpl(1), bentoTheme3.getColors(composer5, i17).m21425getFg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults.m20818getShapeRadiusD9Ej5fM())), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults.m20818getShapeRadiusD9Ej5fM()), bentoTheme3.getColors(composer6, i17).m21371getBg0d7_KjU(), bentoTheme3.getColors(composer6, i17).m21425getFg0d7_KjU(), 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-963651998, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$GoldUpgradeGoldDaysValuePropsComposable$1$3$1$2$1$1$1$1
                                                    public final void invoke(Composer composer7, int i18) {
                                                        if ((i18 & 3) == 2 && composer7.getSkipping()) {
                                                            composer7.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-963651998, i18, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:159)");
                                                        }
                                                        Modifier.Companion companion7 = Modifier.INSTANCE;
                                                        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                                        int i19 = BentoTheme.$stable;
                                                        Modifier modifierM5145paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m5145paddingqDBjuR0(companion7, C2002Dp.m7995constructorimpl(bentoTheme4.getSpacing(composer7, i19).m21593getSmallD9Ej5fM() + bentoTheme4.getSpacing(composer7, i19).m21595getXsmallD9Ej5fM()), bentoTheme4.getSpacing(composer7, i19).m21595getXsmallD9Ej5fM(), bentoTheme4.getSpacing(composer7, i19).m21590getDefaultD9Ej5fM(), bentoTheme4.getSpacing(composer7, i19).m21595getXsmallD9Ej5fM());
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        ApiGoldUpgradeFlow.ApiGoldValuePropsInfoTag apiGoldValuePropsInfoTag = infoTag;
                                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer7, 48);
                                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                                        CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer7, modifierM5145paddingqDBjuR0);
                                                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                                                        if (composer7.getApplier() == null) {
                                                            Composables.invalidApplier();
                                                        }
                                                        composer7.startReusableNode();
                                                        if (composer7.getInserting()) {
                                                            composer7.createNode(constructor3);
                                                        } else {
                                                            composer7.useNode();
                                                        }
                                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer7);
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion8.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion8.getSetModifier());
                                                        Row6 row6 = Row6.INSTANCE;
                                                        ServerToBentoAssetMapper2.Companion companion9 = ServerToBentoAssetMapper2.INSTANCE;
                                                        Icon icon2 = apiGoldValuePropsInfoTag.getIcon();
                                                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = companion9.fromServerValue(icon2 != null ? icon2.getServerValue() : null);
                                                        composer7.startReplaceGroup(-134673404);
                                                        if (serverToBentoAssetMapper2FromServerValue != null) {
                                                            composer7.startReplaceGroup(-134671493);
                                                            if (serverToBentoAssetMapper2FromServerValue != ServerToBentoAssetMapper2.UNKNOWN) {
                                                                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(serverToBentoAssetMapper2FromServerValue.getResourceId(), composer7, 0), serverToBentoAssetMapper2FromServerValue.getServerValue(), LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(companion7, C2002Dp.m7995constructorimpl(16)), false, 1, null), bentoTheme4.getColors(composer7, i19).m21425getFg0d7_KjU(), composer7, 0, 0);
                                                            }
                                                            composer7.endReplaceGroup();
                                                        }
                                                        composer7.endReplaceGroup();
                                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion7, bentoTheme4.getSpacing(composer7, i19).m21593getSmallD9Ej5fM()), composer7, 0);
                                                        BentoText2.m20747BentoText38GnDrw(apiGoldValuePropsInfoTag.getLabel(), null, Color.m6701boximpl(bentoTheme4.getColors(composer7, i19).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer7, i19).getTextS(), composer7, 24576, 0, 8170);
                                                        composer7.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                        invoke(composer7, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }
                                                }, composer5, 54), composer5, 12582912, 112);
                                                composer6 = composer5;
                                                z2 = false;
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer6, i12).m21590getDefaultD9Ej5fM()), composer6, 0);
                                                Unit unit = Unit.INSTANCE;
                                            }
                                            composer6.endReplaceGroup();
                                            String title = apiGoldDaysValueProps3.getTitle();
                                            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer6, i12).getDisplayCapsuleLarge();
                                            TextAlign.Companion companion7 = TextAlign.INSTANCE;
                                            BentoTheme bentoTheme4 = bentoTheme;
                                            Modifier.Companion companion8 = companion;
                                            int i18 = i12;
                                            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion7.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer5, 0, 0, 8126);
                                            Composer composer7 = composer5;
                                            String subtitleMarkdown = apiGoldDaysValueProps3.getSubtitleMarkdown();
                                            composer7.startReplaceGroup(-1600907765);
                                            if (subtitleMarkdown == null) {
                                                companion2 = companion8;
                                                i13 = i18;
                                                i15 = 6;
                                                i14 = 0;
                                            } else {
                                                i13 = i18;
                                                companion2 = companion8;
                                                i14 = 0;
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme4.getSpacing(composer7, i13).m21593getSmallD9Ej5fM()), composer7, 0);
                                                i15 = 6;
                                                composer7 = composer5;
                                                BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, companion7.m7924getStarte0LSkKk(), 0L, 0L, false, composer5, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer7, MarkdownStyle.$stable << 6, 26);
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                            composer7.endReplaceGroup();
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme4.getSpacing(composer7, i13).m21591getLargeD9Ej5fM()), composer7, i14);
                                            composer7.endNode();
                                            composer7.startReplaceGroup(929191317);
                                            for (ApiGoldValueProp apiGoldValueProp : apiGoldDaysValueProps3.getValueProps()) {
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
                                                BentoValuePropRow3.BentoValuePropRow(title2, content, icon, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), composer7, 27648, 0);
                                            }
                                            composer7.endReplaceGroup();
                                            Modifier.Companion companion9 = Modifier.INSTANCE;
                                            BentoTheme bentoTheme5 = BentoTheme.INSTANCE;
                                            int i19 = BentoTheme.$stable;
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion9, bentoTheme5.getSpacing(composer7, i19).m21591getLargeD9Ej5fM()), composer7, i14);
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion9, 0.0f, composer7, i15, 1);
                                            Arrangement arrangement2 = Arrangement.INSTANCE;
                                            Arrangement.Vertical top2 = arrangement2.getTop();
                                            Alignment.Companion companion10 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion10.getStart(), composer7, i14);
                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer7, i14);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer7, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                                            ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor3 = companion11.getConstructor();
                                            if (composer7.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer7.startReusableNode();
                                            if (composer7.getInserting()) {
                                                composer7.createNode(constructor3);
                                            } else {
                                                composer7.useNode();
                                            }
                                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer7);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion11.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion11.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion11.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion11.getSetModifier());
                                            Column6 column62 = Column6.INSTANCE;
                                            ApiGoldUpgradeFlow.ApiGoldDaysPlanSelectionSection planSelectionSection = apiGoldDaysValueProps3.getPlanSelectionSection();
                                            UUID selectedPlanId = LegacyGoldUpgradeGoldDaysValuePropsComposable.GoldUpgradeGoldDaysValuePropsComposable$lambda$0(snapshotState43).getSelectedPlanId();
                                            composer7.startReplaceGroup(5004770);
                                            LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo10 = legacyGoldUpgradeGoldDaysValuePropsDuxo8;
                                            boolean zChangedInstance4 = composer7.changedInstance(legacyGoldUpgradeGoldDaysValuePropsDuxo10);
                                            Object objRememberedValue4 = composer7.rememberedValue();
                                            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = new LegacyGoldUpgradeGoldDaysValuePropsComposable7(legacyGoldUpgradeGoldDaysValuePropsDuxo10);
                                                composer7.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer7.endReplaceGroup();
                                            LegacyGoldUpgradeGoldDaysValuePropsComposable.PlanSelectionSection(planSelectionSection, selectedPlanId, (Function1) ((KFunction) objRememberedValue4), composer7, i14);
                                            String goldFreeDays = apiGoldDaysValueProps3.getGoldFreeDays();
                                            composer7.startReplaceGroup(784078336);
                                            if (goldFreeDays == null) {
                                                companion3 = companion9;
                                                bentoTheme2 = bentoTheme5;
                                                i16 = i19;
                                            } else {
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion9, bentoTheme5.getSpacing(composer7, i19).m21592getMediumD9Ej5fM()), composer7, i14);
                                                companion3 = companion9;
                                                i16 = i19;
                                                bentoTheme2 = bentoTheme5;
                                                BentoText2.m20747BentoText38GnDrw(goldFreeDays, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16382);
                                                composer7 = composer5;
                                                Unit unit3 = Unit.INSTANCE;
                                            }
                                            composer7.endReplaceGroup();
                                            int i20 = i16;
                                            Modifier.Companion companion12 = companion3;
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion12, bentoTheme2.getSpacing(composer7, i20).m21591getLargeD9Ej5fM()), composer7, 0);
                                            composer7.endNode();
                                            ApiGoldUpgradeFlow.ApiGoldDaysAdditionalValueProps additionalValueProps = apiGoldDaysValueProps3.getAdditionalValueProps();
                                            composer7.startReplaceGroup(929240344);
                                            if (additionalValueProps != null) {
                                                LegacyGoldUpgradeGoldDaysValuePropsComposable.AdditionalValueProps(additionalValueProps, composer7, 0);
                                                Unit unit4 = Unit.INSTANCE;
                                            }
                                            composer7.endReplaceGroup();
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion12, bentoTheme2.getSpacing(composer7, i20).m21591getLargeD9Ej5fM()), composer7, 0);
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion12, 0.0f, composer7, 6, 1);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion10.getStart(), composer7, 0);
                                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer7, modifierM21623defaultHorizontalPaddingrAjV9yQ3);
                                            Function0<ComposeUiNode> constructor4 = companion11.getConstructor();
                                            if (composer7.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer7.startReusableNode();
                                            if (composer7.getInserting()) {
                                                composer7.createNode(constructor4);
                                            } else {
                                                composer7.useNode();
                                            }
                                            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer7);
                                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy4, companion11.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion11.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion11.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion11.getSetModifier());
                                            BentoMarkdownText2.BentoMarkdownText(apiGoldDaysValueProps3.getDisclosureMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer7, i20).getTextS(), 0, bentoTheme2.getColors(composer7, i20).m21426getFg20d7_KjU(), bentoTheme2.getColors(composer7, i20).m21426getFg20d7_KjU(), false, composer5, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer5, MarkdownStyle.$stable << 6, 26);
                                            composer5.endNode();
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion12, bentoTheme2.getSpacing(composer5, i20).m21592getMediumD9Ej5fM()), composer5, 0);
                                            composer5.endNode();
                                            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_upgrade_gold_days_value_props_asset_height, composer5, 0);
                                            final Function0<Unit> function06 = function05;
                                            BentoAppBarWithTransition.m12210BentoAppBarWithTransitionzVdqMik(scrollStateRememberScrollState, fDimensionResource, null, ComposableLambda3.rememberComposableLambda(1593032808, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$GoldUpgradeGoldDaysValuePropsComposable$1$3$1$2.2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer8, Integer num) {
                                                    invoke(bentoAppBarScope, composer8, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(final BentoAppBarScope BentoAppBarWithTransition, Composer composer8, int i21) {
                                                    int i22;
                                                    Intrinsics.checkNotNullParameter(BentoAppBarWithTransition, "$this$BentoAppBarWithTransition");
                                                    if ((i21 & 6) == 0) {
                                                        i22 = i21 | ((i21 & 8) == 0 ? composer8.changed(BentoAppBarWithTransition) : composer8.changedInstance(BentoAppBarWithTransition) ? 4 : 2);
                                                    } else {
                                                        i22 = i21;
                                                    }
                                                    if ((i22 & 19) == 18 && composer8.getSkipping()) {
                                                        composer8.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1593032808, i22, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:254)");
                                                    }
                                                    long nova = BentoTheme.INSTANCE.getColors(composer8, BentoTheme.$stable).getNova();
                                                    final Function0<Unit> function07 = function06;
                                                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, nova, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1580718166, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt.GoldUpgradeGoldDaysValuePropsComposable.1.3.1.2.2.1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer9, Integer num) {
                                                            invoke(composer9, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer9, int i23) {
                                                            if ((i23 & 3) == 2 && composer9.getSkipping()) {
                                                                composer9.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1580718166, i23, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeGoldDaysValuePropsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:255)");
                                                            }
                                                            BentoAppBarWithTransition.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function07, composer9, BentoAppBarScope.$stable << 12, 7);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer8, 54), composer8, 805306368, 509);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer5, 54), null, null, null, 0L, 0L, composer5, 3072, 500);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), composer4, 3456, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 100663296, 156);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer22, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup = composer22;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    context4 = context3;
                    legacyGoldUpgradeGoldDaysValuePropsDuxo2 = legacyGoldUpgradeGoldDaysValuePropsDuxo3;
                    modifier2 = modifier3;
                    screen2 = screen3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        context2 = context;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlanSelectionSection(final ApiGoldUpgradeFlow.ApiGoldDaysPlanSelectionSection apiGoldDaysPlanSelectionSection, final UUID uuid, final Function1<? super ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption, Unit> function1, Composer composer, final int i) {
        Arrangement arrangement;
        int i2;
        int i3;
        Composer composer2;
        final Function1<? super ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption, Unit> function12 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1692593532);
        int i4 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(apiGoldDaysPlanSelectionSection) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(uuid) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1692593532, i4, -1, "com.robinhood.android.gold.upgrade.legacy.PlanSelectionSection (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:271)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement2.getTop();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1143399631);
            int i5 = i4;
            String title = apiGoldDaysPlanSelectionSection.getTitle();
            composerStartRestartGroup.startReplaceGroup(-1143398870);
            if (title == null) {
                arrangement = arrangement2;
                i2 = 256;
                i3 = i5;
            } else {
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                arrangement = arrangement2;
                i2 = 256;
                i3 = i5;
                BentoText2.m20747BentoText38GnDrw(title, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextL(), composerStartRestartGroup, 24576, 0, 8174);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Intrinsic3.height(companion, Intrinsic4.Max), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(2048719950);
            for (final ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption apiGoldPlanSelectionOption : apiGoldDaysPlanSelectionSection.getOptions()) {
                boolean zAreEqual = Intrinsics.areEqual(apiGoldPlanSelectionOption.getPlanId(), uuid);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i7 = i3;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(apiGoldPlanSelectionOption) | ((i7 & 896) == i2);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeGoldDaysValuePropsComposable.m2054x2f5ef43f(function1, apiGoldPlanSelectionOption);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                PlanSelectionOption(apiGoldPlanSelectionOption, zAreEqual, (Function0) objRememberedValue, SizeKt.fillMaxHeight$default(Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), composerStartRestartGroup, 0, 0);
                i3 = i7;
                i2 = 256;
            }
            function12 = function1;
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeGoldDaysValuePropsComposable.PlanSelectionSection$lambda$9(apiGoldDaysPlanSelectionSection, uuid, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PlanSelectionSection$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3 */
    public static final Unit m2054x2f5ef43f(Function1 function1, ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption apiGoldPlanSelectionOption) {
        function1.invoke(apiGoldPlanSelectionOption);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PlanSelectionOption(final ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption apiGoldPlanSelectionOption, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        final Modifier modifier3;
        long jM21373getBg30d7_KjU;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String descriptionSecondary;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-343603146);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(apiGoldPlanSelectionOption) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-343603146, i3, -1, "com.robinhood.android.gold.upgrade.legacy.PlanSelectionOption (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:310)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(1820997992);
                    jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1821071431);
                    jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(Clip.clip(ClickableKt.m4893clickableXHw0xAI$default(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(BorderKt.m4876borderxT4_qwU(modifier3, fM7995constructorimpl, jM21373getBg30d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_4), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), false, null, null, function02, 7, null), roundedCornerShapeM5327RoundedCornerShape0680j_4), Component.ComponentType.BUTTON, apiGoldPlanSelectionOption.getLoggingIdentifier(), false, composerStartRestartGroup, 48, 4);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), arrangement.getSpaceBetween(), null, null, 0, 0, ComposableLambda3.rememberComposableLambda(-2004531823, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$PlanSelectionOption$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer2, Integer num) {
                        invoke(flowRowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(FlowRowScope FlowRow, Composer composer2, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer2.changed(FlowRow) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2004531823, i7, -1, "com.robinhood.android.gold.upgrade.legacy.PlanSelectionOption.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:336)");
                        }
                        String title = apiGoldPlanSelectionOption.getTitle();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        TextStyle textM = bentoTheme2.getTypography(composer2, i8).getTextM();
                        FontWeight bold = FontWeight.INSTANCE.getBold();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(FlowRow, companion3, 1.0f, false, 2, null);
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(title, FlowRow.align(modifierWeight$default, companion4.getCenterVertically()), null, null, bold, null, null, 0, false, 0, 0, null, 0, textM, composer2, 24576, 0, 8172);
                        String badge = apiGoldPlanSelectionOption.getBadge();
                        if (badge != null) {
                            InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(badge, FlowRow.align(companion3, companion4.getCenterVertically()), null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i8).getSolLight()), null, false, Color.m6701boximpl(bentoTheme2.getColors(composer2, i8).getJet()), null, composer2, 12582912, 52);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572918, 60);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM() + bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM())), composerStartRestartGroup, 0);
                BentoRichText.m15949BentoRichText0sCZWFg(apiGoldPlanSelectionOption.getDescription(), (Modifier) null, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composerStartRestartGroup, 0, 1018);
                composerStartRestartGroup = composerStartRestartGroup;
                descriptionSecondary = apiGoldPlanSelectionOption.getDescriptionSecondary();
                composerStartRestartGroup.startReplaceGroup(-2010950367);
                if (descriptionSecondary != null) {
                    BentoText2.m20747BentoText38GnDrw(descriptionSecondary, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LegacyGoldUpgradeGoldDaysValuePropsComposable.PlanSelectionOption$lambda$13(apiGoldPlanSelectionOption, z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM());
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
            if (!z) {
            }
            Modifier modifierAutoLogEvents2 = UtilKt.autoLogEvents(Clip.clip(ClickableKt.m4893clickableXHw0xAI$default(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(BorderKt.m4876borderxT4_qwU(modifier3, fM7995constructorimpl2, jM21373getBg30d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_42), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), false, null, null, function02, 7, null), roundedCornerShapeM5327RoundedCornerShape0680j_42), Component.ComponentType.BUTTON, apiGoldPlanSelectionOption.getLoggingIdentifier(), false, composerStartRestartGroup, 48, 4);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), arrangement2.getSpaceBetween(), null, null, 0, 0, ComposableLambda3.rememberComposableLambda(-2004531823, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$PlanSelectionOption$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer2, Integer num) {
                        invoke(flowRowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(FlowRowScope FlowRow, Composer composer2, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer2.changed(FlowRow) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2004531823, i7, -1, "com.robinhood.android.gold.upgrade.legacy.PlanSelectionOption.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:336)");
                        }
                        String title = apiGoldPlanSelectionOption.getTitle();
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        TextStyle textM = bentoTheme22.getTypography(composer2, i8).getTextM();
                        FontWeight bold = FontWeight.INSTANCE.getBold();
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(FlowRow, companion32, 1.0f, false, 2, null);
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(title, FlowRow.align(modifierWeight$default, companion4.getCenterVertically()), null, null, bold, null, null, 0, false, 0, 0, null, 0, textM, composer2, 24576, 0, 8172);
                        String badge = apiGoldPlanSelectionOption.getBadge();
                        if (badge != null) {
                            InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(badge, FlowRow.align(companion32, companion4.getCenterVertically()), null, Color.m6701boximpl(bentoTheme22.getColors(composer2, i8).getSolLight()), null, false, Color.m6701boximpl(bentoTheme22.getColors(composer2, i8).getJet()), null, composer2, 12582912, 52);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572918, 60);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM() + bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM())), composerStartRestartGroup, 0);
                BentoRichText.m15949BentoRichText0sCZWFg(apiGoldPlanSelectionOption.getDescription(), (Modifier) null, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composerStartRestartGroup, 0, 1018);
                composerStartRestartGroup = composerStartRestartGroup;
                descriptionSecondary = apiGoldPlanSelectionOption.getDescriptionSecondary();
                composerStartRestartGroup.startReplaceGroup(-2010950367);
                if (descriptionSecondary != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdditionalValueProps(final ApiGoldUpgradeFlow.ApiGoldDaysAdditionalValueProps apiGoldDaysAdditionalValueProps, Composer composer, final int i) {
        Composer composer2;
        BentoValuePropRow2 icon;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2030160686);
        int i2 = (i & 6) == 0 ? i | (composerStartRestartGroup.changedInstance(apiGoldDaysAdditionalValueProps) ? 4 : 2) : i;
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2030160686, i2, -1, "com.robinhood.android.gold.upgrade.legacy.AdditionalValueProps (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:371)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            composerStartRestartGroup.startReplaceGroup(572148587);
            String title = apiGoldDaysAdditionalValueProps.getTitle();
            composerStartRestartGroup.startReplaceGroup(572149489);
            if (title != null) {
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextL(), composerStartRestartGroup, 24576, 0, 8172);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(572162000);
            for (ApiGoldValueProp apiGoldValueProp : apiGoldDaysAdditionalValueProps.getValueProps()) {
                String strNullIfEmpty = StringsKt.nullIfEmpty(apiGoldValueProp.getTitle());
                String content = apiGoldValueProp.getContent();
                ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(apiGoldValueProp.getPogKey());
                if (serverToBentoAssetMapper3FromServerValue != null) {
                    icon = new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue);
                } else {
                    icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null);
                }
                BentoValuePropRow3.BentoValuePropRow(strNullIfEmpty, content, icon, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 27648, 0);
            }
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeGoldDaysValuePropsComposable.AdditionalValueProps$lambda$19(apiGoldDaysAdditionalValueProps, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomBar(String str, String str2, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        int i3;
        Composer composer2;
        final String str3;
        final String str4;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-918970773);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str;
            composer2 = composerStartRestartGroup;
            str4 = str2;
            function02 = function0;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-918970773, i2, -1, "com.robinhood.android.gold.upgrade.legacy.BottomBar (LegacyGoldUpgradeGoldDaysValuePropsComposable.kt:403)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM())), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            composerStartRestartGroup.startReplaceGroup(-1256046723);
            if (str == null) {
                companion = companion2;
                i3 = i2;
            } else {
                BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU();
                long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU();
                companion = companion2;
                i3 = i2;
                composerStartRestartGroup = composerStartRestartGroup;
                BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), iM7919getCentere0LSkKk, jM21426getFg20d7_KjU, jM21426getFg20d7_KjU2, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i5 = ((i3 >> 6) & 14) | 384 | (i3 & 112);
            composer2 = composerStartRestartGroup;
            str3 = str;
            str4 = str2;
            function02 = function0;
            BentoSparkleButton2.BentoSparkleButton(function02, str4, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, false, false, composer2, i5, 120);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeGoldDaysValuePropsComposable.BottomBar$lambda$22(str3, str4, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
