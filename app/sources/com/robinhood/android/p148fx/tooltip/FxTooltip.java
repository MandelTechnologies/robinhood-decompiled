package com.robinhood.android.p148fx.tooltip;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.TextUnit2;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
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
import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.p148fx.tooltip.FxState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p325fx.p326db.FxRate;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.FXRate;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FxTooltip.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\r\u001aE\u0010\u000e\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u001d\u001a\u0014\u0010\u001e\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0002\"\u001c\u0010!\u001a\u00020\"8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u000e\u0010'\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000¨\u0006(²\u0006\n\u0010)\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, m3636d2 = {"FxTooltipButton", "", "usdAmount", "Lcom/robinhood/models/util/Money;", "modifier", "Landroidx/compose/ui/Modifier;", "showTooltip", "", "onShowTooltip", "Lkotlin/Function1;", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "isMinified", "(Lcom/robinhood/models/util/Money;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZLandroidx/compose/runtime/Composer;II)V", "FxTooltipPopup", "position", "Lcom/robinhood/android/fx/tooltip/TooltipPopupPosition;", "onDismissRequest", "Lkotlin/Function0;", "duxo", "Lcom/robinhood/android/fx/tooltip/FxDuxo;", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/fx/tooltip/TooltipPopupPosition;Lkotlin/jvm/functions/Function0;ZLcom/robinhood/android/fx/tooltip/FxDuxo;Landroidx/compose/runtime/Composer;II)V", "TooltipSuccess", "state", "Lcom/robinhood/android/fx/tooltip/FxState$Success;", "(Lcom/robinhood/android/fx/tooltip/FxState$Success;ZLandroidx/compose/runtime/Composer;II)V", "TooltipError", "(Landroidx/compose/runtime/Composer;I)V", "TooltipLoading", "(ZLandroidx/compose/runtime/Composer;II)V", "convert", "rate", "Lcom/robinhood/models/fx/db/FxRate;", "fxTooltipButtonTestTag", "", "getFxTooltipButtonTestTag$annotations", "()V", "getFxTooltipButtonTestTag", "()Ljava/lang/String;", "fxTooltipInfoSheetId", "lib-fx-tooltip_externalDebug", "internalShowTooltip", "viewState", "Lcom/robinhood/android/fx/tooltip/FxViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.fx.tooltip.FxTooltipKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class FxTooltip {
    private static final String fxTooltipButtonTestTag = "fxTooltipButton";
    private static final String fxTooltipInfoSheetId = "foreign_currency_conversion_rate_details";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FxTooltipButton$lambda$14(Money money, Modifier modifier, boolean z, Function1 function1, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z2, int i, int i2, Composer composer, int i3) {
        FxTooltipButton(money, modifier, z, function1, serverToBentoAssetMapper2, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FxTooltipPopup$lambda$22(Money money, TooltipPopupPosition tooltipPopupPosition, Function0 function0, boolean z, FxDuxo fxDuxo, int i, int i2, Composer composer, int i3) {
        FxTooltipPopup(money, tooltipPopupPosition, function0, z, fxDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipError$lambda$26(int i, Composer composer, int i2) {
        TooltipError(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipLoading$lambda$28(boolean z, int i, int i2, Composer composer, int i3) {
        TooltipLoading(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipSuccess$lambda$25(FxState.Success success, boolean z, int i, int i2, Composer composer, int i3) {
        TooltipSuccess(success, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getFxTooltipButtonTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FxTooltipButton(final Money money, Modifier modifier, boolean z, Function1<? super Boolean, Unit> function1, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        Function1<? super Boolean, Unit> function12;
        int i6;
        int i7;
        boolean z4;
        final Function1<? super Boolean, Unit> function13;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        final View rootView;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue3;
        boolean z5;
        Object objRememberedValue4;
        boolean zChangedInstance;
        Object objRememberedValue5;
        Composer composer2;
        boolean z6;
        final Modifier modifier3;
        final boolean z7;
        final Function1<? super Boolean, Unit> function14;
        final boolean z8;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-726952564);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(money) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        function12 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= 196608;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                    }
                    if ((i3 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z9 = i4 == 0 ? false : z3;
                        function13 = i5 == 0 ? null : function12;
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = i6 == 0 ? ServerToBentoAssetMapper2.BUBBLE_UK_POUNDS_FILLED_16 : serverToBentoAssetMapper2;
                        boolean z10 = i7 == 0 ? false : z4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-726952564, i3, -1, "com.robinhood.android.fx.tooltip.FxTooltipButton (FxTooltip.kt:57)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z9), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(new TooltipPopupPosition(0L, null, 0.0f, 7, null), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        rootView = ((View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView())).getRootView();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierTestTag = TestTag3.testTag(modifier4, fxTooltipButtonTestTag);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i9 = i3 & 7168;
                        z5 = i9 != 2048;
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!z5 || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FxTooltip.FxTooltipButton$lambda$13$lambda$8$lambda$7(function13, snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierTestTag, interactionSource3, null, false, null, null, (Function0) objRememberedValue4, 28, null);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(rootView);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return FxTooltip.FxTooltipButton$lambda$13$lambda$10$lambda$9(rootView, snapshotState2, (LayoutCoordinates) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM4891clickableO2vRcR0$default, (Function1) objRememberedValue5);
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper24 = serverToBentoAssetMapper23;
                        composer2 = composerStartRestartGroup;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper23), StringResources_androidKt.stringResource(C11048R.string.general_label_more, composerStartRestartGroup, 0), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), modifierOnGloballyPositioned, null, false, composer2, BentoIcon4.Size16.$stable, 48);
                        composer2.startReplaceGroup(-134440382);
                        if (FxTooltipButton$lambda$1(snapshotState)) {
                            z6 = z10;
                        } else {
                            TooltipPopupPosition tooltipPopupPositionFxTooltipButton$lambda$4 = FxTooltipButton$lambda$4(snapshotState2);
                            composer2.startReplaceGroup(-1633490746);
                            boolean z11 = i9 == 2048;
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (z11 || objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FxTooltip.FxTooltipButton$lambda$13$lambda$12$lambda$11(function13, snapshotState);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            composer2.endReplaceGroup();
                            z6 = z10;
                            FxTooltipPopup(money, tooltipPopupPositionFxTooltipButton$lambda$4, (Function0) objRememberedValue6, z6, null, composer2, (i3 & 14) | ((i3 >> 6) & 7168), 16);
                            composer2 = composer2;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z7 = z9;
                        function14 = function13;
                        z8 = z6;
                        serverToBentoAssetMapper22 = serverToBentoAssetMapper24;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z7 = z3;
                        z8 = z4;
                        function14 = function12;
                        composer2 = composerStartRestartGroup;
                        serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return FxTooltip.FxTooltipButton$lambda$14(money, modifier3, z7, function14, serverToBentoAssetMapper22, z8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function12 = function1;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                if ((i3 & 74899) == 74898) {
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    rootView = ((View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView())).getRootView();
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion22);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier modifierTestTag2 = TestTag3.testTag(modifier4, fxTooltipButtonTestTag);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i92 = i3 & 7168;
                        if (i92 != 2048) {
                        }
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!z5) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FxTooltip.FxTooltipButton$lambda$13$lambda$8$lambda$7(function13, snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifierTestTag2, interactionSource32, null, false, null, null, (Function0) objRememberedValue4, 28, null);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance = composerStartRestartGroup.changedInstance(rootView);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return FxTooltip.FxTooltipButton$lambda$13$lambda$10$lambda$9(rootView, snapshotState2, (LayoutCoordinates) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM4891clickableO2vRcR0$default2, (Function1) objRememberedValue5);
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper242 = serverToBentoAssetMapper23;
                                composer2 = composerStartRestartGroup;
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper23), StringResources_androidKt.stringResource(C11048R.string.general_label_more, composerStartRestartGroup, 0), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), modifierOnGloballyPositioned2, null, false, composer2, BentoIcon4.Size16.$stable, 48);
                                composer2.startReplaceGroup(-134440382);
                                if (FxTooltipButton$lambda$1(snapshotState)) {
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                                z7 = z9;
                                function14 = function13;
                                z8 = z6;
                                serverToBentoAssetMapper22 = serverToBentoAssetMapper242;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function12 = function1;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function12 = function1;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void FxTooltipButton$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult FxTooltipPopup$lambda$19$lambda$18(final EventLogger eventLogger, final Screen screen, final Component component, final Context context, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$FxTooltipPopup$lambda$19$lambda$18$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, screen, component, null, context, 9, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FxTooltipButton$lambda$13$lambda$8$lambda$7(Function1 function1, SnapshotState snapshotState) {
        FxTooltipButton$lambda$2(snapshotState, true);
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FxTooltipButton$lambda$13$lambda$10$lambda$9(View view, SnapshotState snapshotState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNull(view);
        snapshotState.setValue(TooltipPopup4.calculateTooltipPopupPosition(view, coordinates));
        return Unit.INSTANCE;
    }

    private static final boolean FxTooltipButton$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final TooltipPopupPosition FxTooltipButton$lambda$4(SnapshotState<TooltipPopupPosition> snapshotState) {
        return snapshotState.getValue();
    }

    private static final FxViewState FxTooltipPopup$lambda$15(SnapshotState4<FxViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FxTooltipButton$lambda$13$lambda$12$lambda$11(Function1 function1, SnapshotState snapshotState) {
        FxTooltipButton$lambda$2(snapshotState, false);
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FxTooltipPopup(final Money money, final TooltipPopupPosition position, Function0<Unit> function0, boolean z, FxDuxo fxDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        boolean z2;
        FxDuxo fxDuxo2;
        int i5;
        Function0<Unit> function03;
        Composer composer2;
        int i6;
        final boolean z3;
        FxDuxo fxDuxo3;
        Composer composer3;
        final FxState fxState;
        EventLogger current;
        Screen screen;
        final Component component;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        final EventLogger eventLogger;
        final Screen screen2;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Function0 function04;
        Composer composer4;
        final FxDuxo fxDuxo4;
        final boolean z4;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(position, "position");
        Composer composerStartRestartGroup = composer.startRestartGroup(-667538521);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(money) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(position) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        fxDuxo2 = fxDuxo;
                        int i8 = composerStartRestartGroup.changedInstance(fxDuxo2) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        fxDuxo2 = fxDuxo;
                    }
                    i3 |= i8;
                } else {
                    fxDuxo2 = fxDuxo;
                }
                i5 = i3;
                if ((i5 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    function05 = function02;
                    z4 = z2;
                    fxDuxo4 = fxDuxo2;
                    composer4 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        function03 = i7 == 0 ? null : function02;
                        boolean z5 = i4 == 0 ? false : z2;
                        if ((i2 & 16) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current2 == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            composer2 = composerStartRestartGroup;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(FxDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance3 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$FxTooltipPopup$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$FxTooltipPopup$$inlined$duxo$1.1
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
                            i6 = i5 & (-57345);
                            z3 = z5;
                            fxDuxo3 = (FxDuxo) baseDuxo;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-667538521, i6, -1, "com.robinhood.android.fx.tooltip.FxTooltipPopup (FxTooltip.kt:102)");
                            }
                            composer3 = composer2;
                            fxState = FxTooltipPopup$lambda$15(FlowExtKt.collectAsStateWithLifecycle(fxDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7)).getFxState();
                            android.content.Context context2 = (android.content.Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            final Navigator navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context2);
                            FragmentManager supportFragmentManager = appCompatActivityFindActivityBaseContext == null ? appCompatActivityFindActivityBaseContext.getSupportFragmentManager() : null;
                            screen = userInteractionEventDescriptor.getScreen();
                            Component.ComponentType componentType = Component.ComponentType.FX_CONVERSION_TOOLTIP;
                            String identifier = userInteractionEventDescriptor.getIdentifier();
                            component = new Component(componentType, identifier != null ? "" : identifier, null, 4, null);
                            String string2 = fxState instanceof FxState.Success ? ((FxState.Success) fxState).getRate().getRate().toString() : "";
                            Intrinsics.checkNotNull(string2);
                            boolean z6 = false ? 1 : 0;
                            context = new Context(0, 0, 0, false ? 1 : 0, null, z6, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new FXRate(string2, fxState.getErrorMessage(), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -32769, -1, 16383, null);
                            Unit unit = Unit.INSTANCE;
                            composer3.startReplaceGroup(-1224400529);
                            zChangedInstance = composer3.changedInstance(current) | composer3.changedInstance(screen) | composer3.changedInstance(component) | composer3.changedInstance(context);
                            objRememberedValue = composer3.rememberedValue();
                            if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new FxTooltip2(current, screen, component, context, null);
                                eventLogger = current;
                                screen2 = screen;
                                composer3.updateRememberedValue(objRememberedValue);
                            } else {
                                eventLogger = current;
                                screen2 = screen;
                            }
                            composer3.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 6);
                            composer3.startReplaceGroup(-1224400529);
                            zChangedInstance2 = composer3.changedInstance(eventLogger) | composer3.changedInstance(screen2) | composer3.changedInstance(component) | composer3.changedInstance(context);
                            objRememberedValue2 = composer3.rememberedValue();
                            if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return FxTooltip.FxTooltipPopup$lambda$19$lambda$18(eventLogger, screen2, component, context, (DisposableEffectScope) obj);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer3, 6);
                            fxDuxo3.bind(money);
                            composer3.startReplaceGroup(-1554338404);
                            if ((fxState instanceof FxState.Success) || supportFragmentManager == null) {
                                function04 = null;
                            } else {
                                composer3.startReplaceGroup(-1224400529);
                                boolean zChangedInstance4 = composer3.changedInstance(supportFragmentManager) | composer3.changedInstance(navigator) | composer3.changedInstance(eventLogger) | composer3.changedInstance(screen2) | composer3.changedInstance(component) | composer3.changedInstance(context);
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (!zChangedInstance4) {
                                    Object obj = objRememberedValue4;
                                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        final EventLogger eventLogger2 = eventLogger;
                                        final FragmentManager fragmentManager = supportFragmentManager;
                                        final Screen screen3 = screen2;
                                        Object obj2 = new Function0() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return FxTooltip.FxTooltipPopup$lambda$21$lambda$20(fragmentManager, navigator, eventLogger2, screen3, component, context);
                                            }
                                        };
                                        composer3.updateRememberedValue(obj2);
                                        obj = obj2;
                                    }
                                    function04 = (Function0) obj;
                                    composer3.endReplaceGroup();
                                }
                            }
                            composer3.endReplaceGroup();
                            int i9 = i6 >> 3;
                            boolean z7 = z3;
                            FxDuxo fxDuxo5 = fxDuxo3;
                            Function0<Unit> function06 = function03;
                            TooltipPopup4.m14948TooltipPopup2iulXZU(position, z7, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, function04, function06, ComposableLambda3.rememberComposableLambda(-1243780808, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt.FxTooltipPopup.4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i10) {
                                    if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1243780808, i10, -1, "com.robinhood.android.fx.tooltip.FxTooltipPopup.<anonymous> (FxTooltip.kt:176)");
                                    }
                                    FxState fxState2 = fxState;
                                    if (fxState2 instanceof FxState.Success) {
                                        composer5.startReplaceGroup(-1272446213);
                                        FxTooltip.TooltipSuccess((FxState.Success) fxState, z3, composer5, 0, 0);
                                        composer5.endReplaceGroup();
                                    } else if (fxState2 instanceof FxState.Error) {
                                        composer5.startReplaceGroup(-1272444058);
                                        FxTooltip.TooltipError(composer5, 0);
                                        composer5.endReplaceGroup();
                                    } else {
                                        if (!Intrinsics.areEqual(fxState2, FxState.Loading.INSTANCE)) {
                                            composer5.startReplaceGroup(-1272447679);
                                            composer5.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer5.startReplaceGroup(-1272442574);
                                        FxTooltip.TooltipLoading(z3, composer5, 0, 0);
                                        composer5.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, (i9 & 14) | ((i6 >> 6) & 112), (i9 & 112) | 384, 1020);
                            composer4 = composer3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fxDuxo4 = fxDuxo5;
                            z4 = z7;
                            function05 = function06;
                        } else {
                            composer2 = composerStartRestartGroup;
                            i6 = i5;
                            z3 = z5;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        function03 = function02;
                        z3 = z2;
                        i6 = i5;
                        composer2 = composerStartRestartGroup;
                    }
                    fxDuxo3 = fxDuxo2;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer3 = composer2;
                    fxState = FxTooltipPopup$lambda$15(FlowExtKt.collectAsStateWithLifecycle(fxDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7)).getFxState();
                    android.content.Context context22 = (android.content.Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final Navigator navigator2 = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    AppCompatActivity appCompatActivityFindActivityBaseContext2 = BaseContexts.findActivityBaseContext(context22);
                    if (appCompatActivityFindActivityBaseContext2 == null) {
                    }
                    screen = userInteractionEventDescriptor2.getScreen();
                    Component.ComponentType componentType2 = Component.ComponentType.FX_CONVERSION_TOOLTIP;
                    String identifier2 = userInteractionEventDescriptor2.getIdentifier();
                    component = new Component(componentType2, identifier2 != null ? "" : identifier2, null, 4, null);
                    String string22 = fxState instanceof FxState.Success ? ((FxState.Success) fxState).getRate().getRate().toString() : "";
                    Intrinsics.checkNotNull(string22);
                    boolean z62 = false ? 1 : 0;
                    context = new Context(0, 0, 0, false ? 1 : 0, null, z62, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new FXRate(string22, fxState.getErrorMessage(), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -32769, -1, 16383, null);
                    Unit unit2 = Unit.INSTANCE;
                    composer3.startReplaceGroup(-1224400529);
                    zChangedInstance = composer3.changedInstance(current) | composer3.changedInstance(screen) | composer3.changedInstance(component) | composer3.changedInstance(context);
                    objRememberedValue = composer3.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue = new FxTooltip2(current, screen, component, context, null);
                        eventLogger = current;
                        screen2 = screen;
                        composer3.updateRememberedValue(objRememberedValue);
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 6);
                        composer3.startReplaceGroup(-1224400529);
                        zChangedInstance2 = composer3.changedInstance(eventLogger) | composer3.changedInstance(screen2) | composer3.changedInstance(component) | composer3.changedInstance(context);
                        objRememberedValue2 = composer3.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return FxTooltip.FxTooltipPopup$lambda$19$lambda$18(eventLogger, screen2, component, context, (DisposableEffectScope) obj3);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue2);
                            composer3.endReplaceGroup();
                            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer3, 6);
                            fxDuxo3.bind(money);
                            composer3.startReplaceGroup(-1554338404);
                            if (fxState instanceof FxState.Success) {
                                function04 = null;
                                composer3.endReplaceGroup();
                                int i92 = i6 >> 3;
                                boolean z72 = z3;
                                FxDuxo fxDuxo52 = fxDuxo3;
                                Function0<Unit> function062 = function03;
                                TooltipPopup4.m14948TooltipPopup2iulXZU(position, z72, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, function04, function062, ComposableLambda3.rememberComposableLambda(-1243780808, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt.FxTooltipPopup.4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i10) {
                                        if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1243780808, i10, -1, "com.robinhood.android.fx.tooltip.FxTooltipPopup.<anonymous> (FxTooltip.kt:176)");
                                        }
                                        FxState fxState2 = fxState;
                                        if (fxState2 instanceof FxState.Success) {
                                            composer5.startReplaceGroup(-1272446213);
                                            FxTooltip.TooltipSuccess((FxState.Success) fxState, z3, composer5, 0, 0);
                                            composer5.endReplaceGroup();
                                        } else if (fxState2 instanceof FxState.Error) {
                                            composer5.startReplaceGroup(-1272444058);
                                            FxTooltip.TooltipError(composer5, 0);
                                            composer5.endReplaceGroup();
                                        } else {
                                            if (!Intrinsics.areEqual(fxState2, FxState.Loading.INSTANCE)) {
                                                composer5.startReplaceGroup(-1272447679);
                                                composer5.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer5.startReplaceGroup(-1272442574);
                                            FxTooltip.TooltipLoading(z3, composer5, 0, 0);
                                            composer5.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, (i92 & 14) | ((i6 >> 6) & 112), (i92 & 112) | 384, 1020);
                                composer4 = composer3;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                fxDuxo4 = fxDuxo52;
                                z4 = z72;
                                function05 = function062;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            return FxTooltip.FxTooltipPopup$lambda$22(money, position, function05, z4, fxDuxo4, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i3;
            if ((i5 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i3;
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FxTooltipPopup$lambda$21$lambda$20(FragmentManager fragmentManager, Navigator navigator, EventLogger eventLogger, Screen screen, Component component, Context context) {
        if (fragmentManager.findFragmentByTag(fxTooltipInfoSheetId) == null) {
            Navigator.DefaultImpls.createDialogFragment$default(navigator, new SduiInfoSheetKey("", fxTooltipInfoSheetId, null, null, 12, null), null, 2, null).show(fragmentManager, fxTooltipInfoSheetId);
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.LEARN_MORE, screen, component, null, context, false, 40, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v24, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TooltipSuccess(final FxState.Success state, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z2;
        boolean z3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String str;
        String str2;
        int i4;
        Modifier.Companion companion;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(802798987);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                z3 = i5 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802798987, i3, -1, "com.robinhood.android.fx.tooltip.TooltipSuccess (FxTooltip.kt:188)");
                }
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Currency currency = state.getRate().getCurrency();
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                Money money = new Money(currency, ONE);
                float fMo5011toDpGaN1DYA = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5011toDpGaN1DYA(TextUnit2.getSp(2));
                if (!z3) {
                    str = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null) + " ≈ $" + state.getRate().getRate();
                } else {
                    str = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null) + " = $" + state.getRate().getRate();
                }
                composerStartRestartGroup.startReplaceGroup(-1524416304);
                if (z3) {
                    Modifier modifierWeight$default = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                    companion = companion2;
                    String str3 = Money.format$default(convert(state.getUsdAmount(), state.getRate()), null, false, null, false, 0, null, false, null, false, false, 1023, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    str2 = str;
                    i4 = 0;
                    BentoText2.m20747BentoText38GnDrw(str3, modifierWeight$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8184);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    str2 = str;
                    i4 = 0;
                    companion = companion2;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companionM5146paddingqDBjuR0$default = !z3 ? companion : PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, fMo5011toDpGaN1DYA, 0.0f, 0.0f, 13, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Composer composer3 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str2, companionM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i7).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16376);
                composer3.startReplaceGroup(-1524397849);
                if (!z3) {
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.INFO_12), StringResources_androidKt.stringResource(C11048R.string.general_label_more, composer3, i4), bentoTheme2.getColors(composer3, i7).getNova(), PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer3, BentoIcon4.Size12.$stable | 3072, 48);
                }
                composer2 = composer3;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FxTooltip.TooltipSuccess$lambda$25(state, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion22 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion22);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Currency currency2 = state.getRate().getCurrency();
                BigDecimal ONE2 = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE2, "ONE");
                Money money2 = new Money(currency2, ONE2);
                float fMo5011toDpGaN1DYA2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5011toDpGaN1DYA(TextUnit2.getSp(2));
                if (!z3) {
                }
                composerStartRestartGroup.startReplaceGroup(-1524416304);
                if (z3) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (!z3) {
                }
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                Composer composer32 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str2, companionM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme22.getColors(composerStartRestartGroup, i72).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer32, 0, 0, 16376);
                composer32.startReplaceGroup(-1524397849);
                if (!z3) {
                }
                composer2 = composer32;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                z2 = z3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void TooltipError(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1622184997);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1622184997, i, -1, "com.robinhood.android.fx.tooltip.TooltipError (FxTooltip.kt:234)");
            }
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17652R.string.fx_tooltip_error, composerStartRestartGroup, 0), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FxTooltip.TooltipError$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TooltipLoading(boolean z, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        Modifier modifierWeight$default;
        Modifier.Companion companion;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(239321485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = i | (composerStartRestartGroup.changed(z2) ? 4 : 2);
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            boolean z3 = i4 != 0 ? false : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(239321485, i3, -1, "com.robinhood.android.fx.tooltip.TooltipLoading (FxTooltip.kt:244)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            if (z3) {
                companion = companion2;
                modifierWeight$default = companion;
            } else {
                modifierWeight$default = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                companion = companion2;
            }
            String strStringResource = StringResources_androidKt.stringResource(C17652R.string.fx_tooltip_loading, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierWeight$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16376);
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), BentoProgressIndicator3.f5151S, bentoTheme.getColors(composer2, i5).getNova(), composer2, 54, 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fx.tooltip.FxTooltipKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FxTooltip.TooltipLoading$lambda$28(z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Money convert(Money money, FxRate fxRate) {
        return money.copy(fxRate.getCurrency(), BigDecimals7.safeDivide(money.getDecimalValue(), fxRate.getRate()));
    }

    public static final String getFxTooltipButtonTestTag() {
        return fxTooltipButtonTestTag;
    }
}
