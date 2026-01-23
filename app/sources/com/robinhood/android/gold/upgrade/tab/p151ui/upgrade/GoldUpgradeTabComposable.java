package com.robinhood.android.gold.upgrade.tab.p151ui.upgrade;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
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
import androidx.compose.p011ui.text.TextStyle;
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
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.gold.upgrade.tab.model.ApiGoldUpgradeTab;
import com.robinhood.android.gold.upgrade.tab.p151ui.upgrade.GoldUpgradeTabState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.app.ErrorScreenComposable;
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
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.bonfire.ApiGoldValueProp;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.extensions.ContextsUiExtensions;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldUpgradeTabComposable.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u001aR\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0001¢\u0006\u0002\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0015\u001aP\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\r2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0019\u001aV\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0003¢\u0006\u0002\u0010!\u001a#\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0002\u0010$\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002"}, m3636d2 = {"GoldUpgradeValuePropsAssetTestTag", "", "getGoldUpgradeValuePropsAssetTestTag$annotations", "()V", "GoldUpgradeValuePropsComposable", "", "onContinue", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabDuxo;", "onLearnMore", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "Lkotlin/ParameterName;", "name", "action", "", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabDuxo;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LoadingContent", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GoldContent", "state", "Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabState$Success;", "(Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabState$Success;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PricingDisclosureSection", "goldMonthlyCost", "goldFreeDays", "disclosureMarkdown", "learnMoreButton", "Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "onClickLearnMore", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/TextButton;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "GoldBottomBar", "ctaText", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-gold-upgrade-tab_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUpgradeTabComposable {
    public static final String GoldUpgradeValuePropsAssetTestTag = "gold_upgrade_value_props_asset";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldBottomBar$lambda$13(String str, Function0 function0, int i, Composer composer, int i2) {
        GoldBottomBar(str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldContent$lambda$6(GoldUpgradeTabState.Success success, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldContent(success, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeValuePropsComposable$lambda$3(Function0 function0, Modifier modifier, GoldUpgradeTabDuxo goldUpgradeTabDuxo, Function1 function1, int i, int i2, Composer composer, int i3) {
        GoldUpgradeValuePropsComposable(function0, modifier, goldUpgradeTabDuxo, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$4(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingContent(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PricingDisclosureSection$lambda$9(String str, String str2, String str3, TextButton textButton, Function1 function1, int i, Composer composer, int i2) {
        PricingDisclosureSection(str, str2, str3, textButton, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getGoldUpgradeValuePropsAssetTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUpgradeValuePropsComposable(final Function0<Unit> onContinue, Modifier modifier, GoldUpgradeTabDuxo goldUpgradeTabDuxo, final Function1<? super DeeplinkAction, Boolean> onLearnMore, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        GoldUpgradeTabDuxo goldUpgradeTabDuxo2;
        int i4;
        int i5;
        Modifier modifier3;
        final GoldUpgradeTabDuxo goldUpgradeTabDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        GoldUpgradeTabState goldUpgradeTabStateGoldUpgradeValuePropsComposable$lambda$0;
        Modifier modifier4;
        GoldUpgradeTabDuxo goldUpgradeTabDuxo4;
        final GoldUpgradeTabDuxo goldUpgradeTabDuxo5;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onLearnMore, "onLearnMore");
        Composer composerStartRestartGroup = composer.startRestartGroup(330273004);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onContinue) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    goldUpgradeTabDuxo2 = goldUpgradeTabDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(goldUpgradeTabDuxo2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    goldUpgradeTabDuxo2 = goldUpgradeTabDuxo;
                }
                i3 |= i7;
            } else {
                goldUpgradeTabDuxo2 = goldUpgradeTabDuxo;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onLearnMore) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    goldUpgradeTabDuxo3 = goldUpgradeTabDuxo2;
                    i5 = i3;
                    modifier3 = modifier2;
                    i4 = 0;
                } else {
                    Modifier modifier6 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
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
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldUpgradeTabDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$GoldUpgradeValuePropsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$GoldUpgradeValuePropsComposable$$inlined$duxo$1.1
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
                        goldUpgradeTabDuxo2 = (GoldUpgradeTabDuxo) baseDuxo;
                        i3 &= -897;
                    } else {
                        i4 = 0;
                    }
                    GoldUpgradeTabDuxo goldUpgradeTabDuxo6 = goldUpgradeTabDuxo2;
                    i5 = i3;
                    modifier3 = modifier6;
                    goldUpgradeTabDuxo3 = goldUpgradeTabDuxo6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(330273004, i5, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeValuePropsComposable (GoldUpgradeTabComposable.kt:69)");
                }
                goldUpgradeTabStateGoldUpgradeValuePropsComposable$lambda$0 = GoldUpgradeValuePropsComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(goldUpgradeTabDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(goldUpgradeTabStateGoldUpgradeValuePropsComposable$lambda$0 instanceof GoldUpgradeTabState.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(-606632538);
                    LoadingContent(modifier3, composerStartRestartGroup, (i5 >> 3) & 14, i4);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (!(goldUpgradeTabStateGoldUpgradeValuePropsComposable$lambda$0 instanceof GoldUpgradeTabState.Error)) {
                    if (!(goldUpgradeTabStateGoldUpgradeValuePropsComposable$lambda$0 instanceof GoldUpgradeTabState.Success)) {
                        composerStartRestartGroup.startReplaceGroup(-435212708);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-606402983);
                    modifier4 = modifier3;
                    goldUpgradeTabDuxo4 = goldUpgradeTabDuxo3;
                    GoldContent((GoldUpgradeTabState.Success) goldUpgradeTabStateGoldUpgradeValuePropsComposable$lambda$0, onContinue, onLearnMore, null, composerStartRestartGroup, ((i5 << 3) & 112) | ((i5 >> 3) & 896), 8);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    goldUpgradeTabDuxo5 = goldUpgradeTabDuxo4;
                    modifier5 = modifier4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-606541832);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(goldUpgradeTabDuxo3);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GoldUpgradeTabComposable.GoldUpgradeValuePropsComposable$lambda$2$lambda$1(goldUpgradeTabDuxo3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    ErrorScreenComposable.ErrorScreenComposable(null, (Function0) objRememberedValue2, 0, null, null, null, null, false, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                }
                modifier4 = modifier3;
                goldUpgradeTabDuxo4 = goldUpgradeTabDuxo3;
                if (ComposerKt.isTraceInProgress()) {
                }
                goldUpgradeTabDuxo5 = goldUpgradeTabDuxo4;
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                goldUpgradeTabDuxo5 = goldUpgradeTabDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUpgradeTabComposable.GoldUpgradeValuePropsComposable$lambda$3(onContinue, modifier5, goldUpgradeTabDuxo5, onLearnMore, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i6 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                GoldUpgradeTabDuxo goldUpgradeTabDuxo62 = goldUpgradeTabDuxo2;
                i5 = i3;
                modifier3 = modifier6;
                goldUpgradeTabDuxo3 = goldUpgradeTabDuxo62;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                goldUpgradeTabStateGoldUpgradeValuePropsComposable$lambda$0 = GoldUpgradeValuePropsComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(goldUpgradeTabDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(goldUpgradeTabStateGoldUpgradeValuePropsComposable$lambda$0 instanceof GoldUpgradeTabState.Loading)) {
                }
                modifier4 = modifier3;
                goldUpgradeTabDuxo4 = goldUpgradeTabDuxo3;
                if (ComposerKt.isTraceInProgress()) {
                }
                goldUpgradeTabDuxo5 = goldUpgradeTabDuxo4;
                modifier5 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeValuePropsComposable$lambda$2$lambda$1(GoldUpgradeTabDuxo goldUpgradeTabDuxo) {
        goldUpgradeTabDuxo.onRefreshRequested();
        return Unit.INSTANCE;
    }

    private static final GoldUpgradeTabState GoldUpgradeValuePropsComposable$lambda$0(SnapshotState4<? extends GoldUpgradeTabState> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final void LoadingContent(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-245117121);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-245117121, i3, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.LoadingContent (GoldUpgradeTabComposable.kt:92)");
            }
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), true, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUpgradeTabComposable.LoadingContent$lambda$4(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldContent(final GoldUpgradeTabState.Success state, final Function0<Unit> onContinue, final Function1<? super DeeplinkAction, Boolean> onLearnMore, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onLearnMore, "onLearnMore");
        Composer composerStartRestartGroup = composer.startRestartGroup(456172591);
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
            i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLearnMore) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(456172591, i3, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldContent (GoldUpgradeTabComposable.kt:106)");
                }
                final ApiGoldUpgradeTab.ApiGoldValueProps goldValueProps = state.getGoldUpgradeTab().getGoldValueProps();
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1393675557, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$GoldContent$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1393675557, i5, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldContent.<anonymous>.<anonymous> (GoldUpgradeTabComposable.kt:110)");
                        }
                        GoldUpgradeTabComposable.GoldBottomBar(goldValueProps.getCtaText(), onContinue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(356723608, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$GoldContent$1$2
                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        ApiGoldUpgradeTab.ApiGoldValueProps apiGoldValueProps;
                        Function1<DeeplinkAction, Boolean> function1;
                        BentoTheme bentoTheme;
                        int i6;
                        Modifier.Companion companion;
                        boolean z;
                        int i7;
                        Modifier.Companion companion2;
                        int i8;
                        BentoValuePropRow2 icon;
                        Object obj;
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(356723608, i5, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldContent.<anonymous>.<anonymous> (GoldUpgradeTabComposable.kt:116)");
                        }
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                        ApiGoldUpgradeTab.ApiGoldValueProps apiGoldValueProps2 = goldValueProps;
                        Function1<DeeplinkAction, Boolean> function12 = onLearnMore;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
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
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion5, 0.0f, composer2, 6, 1);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
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
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(apiGoldValueProps2.getImagePath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer2, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(companion5, C2002Dp.m7995constructorimpl(150)), "gold_upgrade_value_props_asset"), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
                        Composer composer3 = composer2;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme2.getSpacing(composer3, i9).m21591getLargeD9Ej5fM()), composer3, 0);
                        final ApiGoldUpgradeTab.ApiGoldValuePropsInfoTag infoTag = apiGoldValueProps2.getInfoTag();
                        composer3.startReplaceGroup(-1859583608);
                        if (infoTag == null) {
                            bentoTheme = bentoTheme2;
                            i6 = i9;
                            z = false;
                            companion = companion5;
                            apiGoldValueProps = apiGoldValueProps2;
                            function1 = function12;
                        } else {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme2.getSpacing(composer3, i9).m21593getSmallD9Ej5fM()), composer3, 0);
                            apiGoldValueProps = apiGoldValueProps2;
                            function1 = function12;
                            bentoTheme = bentoTheme2;
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, bentoTheme2.getColors(composer3, i9).getSolLight(), 0L, 0L, bentoTheme2.getColors(composer3, i9).getJet(), 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(111159962, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$GoldContent$1$2$1$1$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i10) {
                                    String serverValue;
                                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue;
                                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(111159962, i10, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldUpgradeTabComposable.kt:146)");
                                    }
                                    String label = infoTag.getLabel();
                                    Icon icon2 = infoTag.getIcon();
                                    Integer numValueOf = null;
                                    if (icon2 != null && (serverValue = icon2.getServerValue()) != null && (serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(serverValue)) != null) {
                                        numValueOf = Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId());
                                    }
                                    InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(label, UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.INFO_TAG, infoTag.getIdentifier(), false, composer4, 54, 4), numValueOf, null, null, false, null, null, composer4, 12582912, 120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer2, 805306368, 493);
                            composer3 = composer2;
                            i6 = i9;
                            companion = companion5;
                            z = false;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i6).m21593getSmallD9Ej5fM()), composer3, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer3.endReplaceGroup();
                        String title = apiGoldValueProps.getTitle();
                        TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer3, i6).getDisplayCapsuleLarge();
                        TextAlign.Companion companion6 = TextAlign.INSTANCE;
                        int i10 = i6;
                        Modifier.Companion companion7 = companion;
                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer2, 0, 0, 8126);
                        Composer composer4 = composer2;
                        String subtitleMarkdown = apiGoldValueProps.getSubtitleMarkdown();
                        composer4.startReplaceGroup(-1859542057);
                        if (subtitleMarkdown == null) {
                            companion2 = companion7;
                            i7 = i10;
                            i8 = 0;
                        } else {
                            i7 = i10;
                            companion2 = companion7;
                            i8 = 0;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer4, i7).m21593getSmallD9Ej5fM()), composer4, 0);
                            composer4 = composer2;
                            BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, companion6.m7919getCentere0LSkKk(), 0L, 0L, false, composer2, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, MarkdownStyle.$stable << 6, 26);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer4, i7).m21591getLargeD9Ej5fM()), composer4, i8);
                        composer4.endNode();
                        composer4.startReplaceGroup(-1223772208);
                        for (ApiGoldValueProp apiGoldValueProp : apiGoldValueProps.getValueProps()) {
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
                            BentoValuePropRow3.BentoValuePropRow(title2, content, icon, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), composer4, 27648, 0);
                            composer4 = composer2;
                        }
                        composer2.endReplaceGroup();
                        GoldUpgradeTabComposable.PricingDisclosureSection(apiGoldValueProps.getGoldMonthlyCost(), apiGoldValueProps.getGoldFreeDays(), apiGoldValueProps.getDisclosureMarkdown(), apiGoldValueProps.getLearnMoreButton(), function1, composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUpgradeTabComposable.GoldContent$lambda$6(state, onContinue, onLearnMore, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            final ApiGoldUpgradeTab.ApiGoldValueProps goldValueProps2 = state.getGoldUpgradeTab().getGoldValueProps();
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1393675557, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$GoldContent$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1393675557, i5, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldContent.<anonymous>.<anonymous> (GoldUpgradeTabComposable.kt:110)");
                    }
                    GoldUpgradeTabComposable.GoldBottomBar(goldValueProps2.getCtaText(), onContinue, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(356723608, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$GoldContent$1$2
                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    ApiGoldUpgradeTab.ApiGoldValueProps apiGoldValueProps;
                    Function1<DeeplinkAction, Boolean> function1;
                    BentoTheme bentoTheme;
                    int i6;
                    Modifier.Companion companion;
                    boolean z;
                    int i7;
                    Modifier.Companion companion2;
                    int i8;
                    BentoValuePropRow2 icon;
                    Object obj;
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(356723608, i5, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldContent.<anonymous>.<anonymous> (GoldUpgradeTabComposable.kt:116)");
                    }
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                    ApiGoldUpgradeTab.ApiGoldValueProps apiGoldValueProps2 = goldValueProps2;
                    Function1<DeeplinkAction, Boolean> function12 = onLearnMore;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
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
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion5, 0.0f, composer2, 6, 1);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
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
                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(apiGoldValueProps2.getImagePath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer2, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(companion5, C2002Dp.m7995constructorimpl(150)), "gold_upgrade_value_props_asset"), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
                    Composer composer3 = composer2;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme2.getSpacing(composer3, i9).m21591getLargeD9Ej5fM()), composer3, 0);
                    final ApiGoldUpgradeTab.ApiGoldValuePropsInfoTag infoTag = apiGoldValueProps2.getInfoTag();
                    composer3.startReplaceGroup(-1859583608);
                    if (infoTag == null) {
                        bentoTheme = bentoTheme2;
                        i6 = i9;
                        z = false;
                        companion = companion5;
                        apiGoldValueProps = apiGoldValueProps2;
                        function1 = function12;
                    } else {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme2.getSpacing(composer3, i9).m21593getSmallD9Ej5fM()), composer3, 0);
                        apiGoldValueProps = apiGoldValueProps2;
                        function1 = function12;
                        bentoTheme = bentoTheme2;
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, bentoTheme2.getColors(composer3, i9).getSolLight(), 0L, 0L, bentoTheme2.getColors(composer3, i9).getJet(), 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(111159962, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$GoldContent$1$2$1$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i10) {
                                String serverValue;
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue;
                                if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(111159962, i10, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldUpgradeTabComposable.kt:146)");
                                }
                                String label = infoTag.getLabel();
                                Icon icon2 = infoTag.getIcon();
                                Integer numValueOf = null;
                                if (icon2 != null && (serverValue = icon2.getServerValue()) != null && (serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(serverValue)) != null) {
                                    numValueOf = Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId());
                                }
                                InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(label, UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.INFO_TAG, infoTag.getIdentifier(), false, composer4, 54, 4), numValueOf, null, null, false, null, null, composer4, 12582912, 120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer2, 805306368, 493);
                        composer3 = composer2;
                        i6 = i9;
                        companion = companion5;
                        z = false;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i6).m21593getSmallD9Ej5fM()), composer3, 0);
                        Unit unit = Unit.INSTANCE;
                    }
                    composer3.endReplaceGroup();
                    String title = apiGoldValueProps.getTitle();
                    TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer3, i6).getDisplayCapsuleLarge();
                    TextAlign.Companion companion6 = TextAlign.INSTANCE;
                    int i10 = i6;
                    Modifier.Companion companion7 = companion;
                    BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer2, 0, 0, 8126);
                    Composer composer4 = composer2;
                    String subtitleMarkdown = apiGoldValueProps.getSubtitleMarkdown();
                    composer4.startReplaceGroup(-1859542057);
                    if (subtitleMarkdown == null) {
                        companion2 = companion7;
                        i7 = i10;
                        i8 = 0;
                    } else {
                        i7 = i10;
                        companion2 = companion7;
                        i8 = 0;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer4, i7).m21593getSmallD9Ej5fM()), composer4, 0);
                        composer4 = composer2;
                        BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, companion6.m7919getCentere0LSkKk(), 0L, 0L, false, composer2, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, MarkdownStyle.$stable << 6, 26);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer4, i7).m21591getLargeD9Ej5fM()), composer4, i8);
                    composer4.endNode();
                    composer4.startReplaceGroup(-1223772208);
                    for (ApiGoldValueProp apiGoldValueProp : apiGoldValueProps.getValueProps()) {
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
                        BentoValuePropRow3.BentoValuePropRow(title2, content, icon, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), composer4, 27648, 0);
                        composer4 = composer2;
                    }
                    composer2.endReplaceGroup();
                    GoldUpgradeTabComposable.PricingDisclosureSection(apiGoldValueProps.getGoldMonthlyCost(), apiGoldValueProps.getGoldFreeDays(), apiGoldValueProps.getDisclosureMarkdown(), apiGoldValueProps.getLearnMoreButton(), function1, composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PricingDisclosureSection(final String str, final String str2, final String str3, final TextButton<DeeplinkAction> textButton, final Function1<? super DeeplinkAction, Boolean> function1, Composer composer, final int i) {
        int i2;
        String str4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1777943882);
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
                ComposerKt.traceEventStart(1777943882, i2, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.PricingDisclosureSection (GoldUpgradeTabComposable.kt:206)");
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, i2 & 14, 0, 8126);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
            BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, (i4 >> 3) & 14, 0, 8126);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(textButton);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i4 & 57344) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$PricingDisclosureSection$1$1$1
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
            SduiColumns.SduiColumn(immutableList3PersistentListOf, DeeplinkAction.class, companion, null, (SduiActionHandler) objRememberedValue, HorizontalPadding.Default, arrangement.getTop(), companion2.getStart(), false, composerStartRestartGroup, 100663296, 0);
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
            BentoMarkdownText2.BentoMarkdownText(str4, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), 0, bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, ((i4 >> 6) & 14) | (MarkdownStyle.$stable << 6), 26);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUpgradeTabComposable.PricingDisclosureSection$lambda$9(str, str2, str3, textButton, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GoldBottomBar(final String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-250326410);
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
                ComposerKt.traceEventStart(-250326410, i2, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldBottomBar (GoldUpgradeTabComposable.kt:250)");
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
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldUpgradeTabComposable.GoldBottomBar$lambda$12$lambda$11$lambda$10(function0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUpgradeTabComposable.GoldBottomBar$lambda$13(str, function0, i, (Composer) obj, ((Integer) obj2).intValue());
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
