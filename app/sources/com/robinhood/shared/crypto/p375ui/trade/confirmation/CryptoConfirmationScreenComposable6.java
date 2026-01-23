package com.robinhood.shared.crypto.p375ui.trade.confirmation;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderConfirmationRow;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderConfirmationRowState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoConfirmationScreenComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001am\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0017\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001b\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "cardContent", "CryptoConfirmationScreenComposable", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/shared/crypto/ui/trade/confirmation/CryptoConfirmationState;", "state", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", "onRowTap", "onPrimaryBtnClick", "onSecondaryBtnClick", "tertiaryBtnModifier", "onTertiaryBtnClick", "ConfirmationReceiptCard", "(Lcom/robinhood/shared/crypto/ui/trade/confirmation/CryptoConfirmationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/shared/crypto/ui/trade/confirmation/ReceiptCardPreviewData;", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "ConfirmationReceiptCardPreview", "(Lcom/robinhood/shared/crypto/ui/trade/confirmation/ReceiptCardPreviewData;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/utils/resource/StringResource;", "tertiaryBtnText", "ConfirmationReceiptCardPreviewComposable", "(Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoConfirmationScreenComposable6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmationReceiptCard$lambda$7(CryptoConfirmationState cryptoConfirmationState, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, Modifier modifier2, Function0 function03, int i, int i2, Composer composer, int i3) {
        ConfirmationReceiptCard(cryptoConfirmationState, function1, function0, function02, modifier, modifier2, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmationReceiptCardPreview$lambda$9(ReceiptCardPreviewData receiptCardPreviewData, int i, Composer composer, int i2) {
        ConfirmationReceiptCardPreview(receiptCardPreviewData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmationReceiptCardPreviewComposable$lambda$16(StringResource stringResource, Function0 function0, int i, int i2, Composer composer, int i3) {
        ConfirmationReceiptCardPreviewComposable(stringResource, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CryptoConfirmationScreenComposable$lambda$1$lambda$0(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoConfirmationScreenComposable$lambda$3(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        CryptoConfirmationScreenComposable(animatedVisibilityScope, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$8(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CryptoConfirmationScreenComposable(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> cardContent, Composer composer, final int i, final int i2) {
        int i3;
        AnimatedVisibilityScope animatedVisibilityScope2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(animatedVisibilityScope, "<this>");
        Intrinsics.checkNotNullParameter(cardContent, "cardContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1362723643);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(animatedVisibilityScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(cardContent) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362723643, i3, -1, "com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposable (CryptoConfirmationScreenComposable.kt:48)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(CryptoConfirmationScreenComposable6.CryptoConfirmationScreenComposable$lambda$1$lambda$0(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            animatedVisibilityScope2 = animatedVisibilityScope;
            Modifier modifierAnimateEnterExit$default = AnimatedVisibilityScope.animateEnterExit$default(animatedVisibilityScope2, modifier3, EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null), null, null, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateEnterExit$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            cardContent.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            animatedVisibilityScope2 = animatedVisibilityScope;
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final AnimatedVisibilityScope animatedVisibilityScope3 = animatedVisibilityScope2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoConfirmationScreenComposable6.CryptoConfirmationScreenComposable$lambda$3(animatedVisibilityScope3, modifier2, cardContent, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmationReceiptCard(final CryptoConfirmationState state, final Function1<? super CryptoOrderConfirmationRowState.TapAction, Unit> onRowTap, final Function0<Unit> onPrimaryBtnClick, final Function0<Unit> onSecondaryBtnClick, Modifier modifier, Modifier modifier2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier3;
        int i4;
        Modifier modifier4;
        int i5;
        Function0<Unit> function02;
        Function0<Unit> function03;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier modifier5;
        Modifier.Companion companion;
        int i6;
        Modifier modifier6;
        Function0<Unit> function04;
        final Modifier modifier7;
        final Function0<Unit> function05;
        final Modifier modifier8;
        int i7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onRowTap, "onRowTap");
        Intrinsics.checkNotNullParameter(onPrimaryBtnClick, "onPrimaryBtnClick");
        Intrinsics.checkNotNullParameter(onSecondaryBtnClick, "onSecondaryBtnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(924018162);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRowTap) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryBtnClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSecondaryBtnClick) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier3 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier3) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    modifier4 = modifier2;
                    i3 |= composerStartRestartGroup.changed(modifier4) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    }
                    if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier9 = i8 == 0 ? Modifier.INSTANCE : modifier3;
                        Modifier modifier10 = i4 == 0 ? Modifier.INSTANCE : modifier4;
                        function03 = i5 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(924018162, i3, -1, "com.robinhood.shared.crypto.ui.trade.confirmation.ConfirmationReceiptCard (CryptoConfirmationScreenComposable.kt:68)");
                        }
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier9, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        Modifier modifier11 = modifier9;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(Background3.m4871backgroundbw27NRU(modifierVerticalScroll$default, bentoTheme.getColors(composerStartRestartGroup, i9).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM())), bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5199getHorizontalJoeWqyM()));
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        StringResource title = state.getTitle();
                        int i10 = StringResource.$stable;
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composerStartRestartGroup, i10), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(state.getSubtitle(), composerStartRestartGroup, i10), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM());
                        int i11 = 0;
                        Spacer2.Spacer(modifierM5156height3ABfNKs, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(108870644);
                        int i12 = 0;
                        for (CryptoOrderConfirmationRowState cryptoOrderConfirmationRowState : state.getRows()) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            int i14 = i3;
                            Modifier modifier12 = modifier10;
                            int i15 = i11;
                            CryptoOrderConfirmationRow.CryptoOrderConfirmationRow(cryptoOrderConfirmationRowState, null, onRowTap, composerStartRestartGroup, (i3 << 3) & 896, 2);
                            composerStartRestartGroup.startReplaceGroup(108875904);
                            if (i12 != CollectionsKt.getLastIndex(state.getRows())) {
                                Composer composer2 = composerStartRestartGroup;
                                modifier10 = modifier12;
                                i7 = i15;
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 5);
                                composerStartRestartGroup = composer2;
                            } else {
                                modifier10 = modifier12;
                                i7 = i15;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            i11 = i7;
                            i12 = i13;
                            i3 = i14;
                        }
                        int i16 = i3;
                        int i17 = i11;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i18 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i18).m21593getSmallD9Ej5fM()), composerStartRestartGroup, i17);
                        Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i18).m21590getDefaultD9Ej5fM(), 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i17);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i17);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        BentoButtons.Type type2 = BentoButtons.Type.Primary;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        StringResource primaryBtnText = state.getPrimaryBtnText();
                        int i19 = StringResource.$stable;
                        modifier5 = modifier10;
                        BentoButtonKt.m20586BentoButtonEikTQX8(onPrimaryBtnClick, StringResource2.getString(primaryBtnText, composerStartRestartGroup, i19), modifierFillMaxWidth$default, null, type2, false, state.getPrimaryBtnLoading(), null, null, null, null, false, null, composerStartRestartGroup, ((i16 >> 6) & 14) | 24960, 0, 8104);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i18).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(955538498);
                        if (state.getSecondaryBtnText() == null) {
                            companion = companion4;
                            i6 = i19;
                            BentoButtonKt.m20586BentoButtonEikTQX8(onSecondaryBtnClick, StringResource2.getString(state.getSecondaryBtnText(), composerStartRestartGroup, i19), SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i16 >> 9) & 14) | 24960, 0, 8168);
                        } else {
                            companion = companion4;
                            i6 = i19;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(955549481);
                        if (state.getTertiaryBtnText() != null || function03 == null) {
                            modifier6 = modifier5;
                            function04 = function03;
                        } else {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i18).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                            modifier6 = modifier5;
                            Composer composer3 = composerStartRestartGroup;
                            function04 = function03;
                            BentoButtonKt.m20586BentoButtonEikTQX8(function04, StringResource2.getString(state.getTertiaryBtnText(), composerStartRestartGroup, i6), TestTag3.testTag(SizeKt.fillMaxWidth$default(modifier6, 0.0f, 1, null), CryptoConfirmationScreenComposable9.TERTIARY_BUTTON_TEST_TAG), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer3, ((i16 >> 18) & 14) | 24576, 0, 8168);
                            composerStartRestartGroup = composer3;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier7 = modifier6;
                        function05 = function04;
                        modifier8 = modifier11;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier8 = modifier3;
                        modifier7 = modifier4;
                        function05 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoConfirmationScreenComposable6.ConfirmationReceiptCard$lambda$7(state, onRowTap, onPrimaryBtnClick, onSecondaryBtnClick, modifier8, modifier7, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                function02 = function0;
                if ((599187 & i3) == 599186) {
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier9, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    Modifier modifier112 = modifier9;
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i92 = BentoTheme.$stable;
                    Modifier modifierWindowInsetsPadding2 = WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(Background3.m4871backgroundbw27NRU(modifierVerticalScroll$default2, bentoTheme3.getColors(composerStartRestartGroup, i92).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme3.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM())), bentoTheme3.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM()), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5199getHorizontalJoeWqyM()));
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Column6 column63 = Column6.INSTANCE;
                        StringResource title2 = state.getTitle();
                        int i102 = StringResource.$stable;
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title2, composerStartRestartGroup, i102), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i92).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme3.getSpacing(composerStartRestartGroup, i92).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(state.getSubtitle(), composerStartRestartGroup, i102), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i92).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(companion32, bentoTheme3.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM());
                        int i112 = 0;
                        Spacer2.Spacer(modifierM5156height3ABfNKs2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(108870644);
                        int i122 = 0;
                        while (r17.hasNext()) {
                        }
                        int i162 = i3;
                        int i172 = i112;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i182 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i182).m21593getSmallD9Ej5fM()), composerStartRestartGroup, i172);
                        Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion42, 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i182).m21590getDefaultD9Ej5fM(), 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i172);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i172);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                        ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion52.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion52.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion52.getSetModifier());
                            Column6 column622 = Column6.INSTANCE;
                            BentoButtons.Type type22 = BentoButtons.Type.Primary;
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null);
                            StringResource primaryBtnText2 = state.getPrimaryBtnText();
                            int i192 = StringResource.$stable;
                            modifier5 = modifier10;
                            BentoButtonKt.m20586BentoButtonEikTQX8(onPrimaryBtnClick, StringResource2.getString(primaryBtnText2, composerStartRestartGroup, i192), modifierFillMaxWidth$default2, null, type22, false, state.getPrimaryBtnLoading(), null, null, null, null, false, null, composerStartRestartGroup, ((i162 >> 6) & 14) | 24960, 0, 8104);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i182).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(955538498);
                            if (state.getSecondaryBtnText() == null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(955549481);
                            if (state.getTertiaryBtnText() != null) {
                                modifier6 = modifier5;
                                function04 = function03;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier7 = modifier6;
                                function05 = function04;
                                modifier8 = modifier112;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier4 = modifier2;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier3 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier4 = modifier2;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1536515031);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1536515031, i, -1, "com.robinhood.shared.crypto.ui.trade.confirmation.Preview (CryptoConfirmationScreenComposable.kt:150)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, CryptoConfirmationScreenComposable.INSTANCE.getLambda$400084767$lib_crypto_ui_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoConfirmationScreenComposable6.Preview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoConfirmationScreenComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt$ConfirmationReceiptCardPreview$1 */
    static final class C386331 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ReceiptCardPreviewData $preview;

        C386331(ReceiptCardPreviewData receiptCardPreviewData) {
            this.$preview = receiptCardPreviewData;
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
                ComposerKt.traceEventStart(338693680, i, -1, "com.robinhood.shared.crypto.ui.trade.confirmation.ConfirmationReceiptCardPreview.<anonymous> (CryptoConfirmationScreenComposable.kt:183)");
            }
            StringResource tertiaryBtnText = this.$preview.getTertiaryBtnText();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt$ConfirmationReceiptCardPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            if (this.$preview.getTertiaryBtnText() == null) {
                function0 = null;
            }
            CryptoConfirmationScreenComposable6.ConfirmationReceiptCardPreviewComposable(tertiaryBtnText, function0, composer, StringResource.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void ConfirmationReceiptCardPreview(final ReceiptCardPreviewData preview, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(preview, "preview");
        Composer composerStartRestartGroup = composer.startRestartGroup(1632947320);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(preview) : composerStartRestartGroup.changedInstance(preview) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1632947320, i2, -1, "com.robinhood.shared.crypto.ui.trade.confirmation.ConfirmationReceiptCardPreview (CryptoConfirmationScreenComposable.kt:181)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(338693680, true, new C386331(preview), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoConfirmationScreenComposable6.ConfirmationReceiptCardPreview$lambda$9(preview, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmationReceiptCardPreviewComposable(StringResource stringResource, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function02;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final StringResource stringResource2 = stringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2053034132);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                StringResource stringResource3 = i4 == 0 ? null : stringResource2;
                Function0<Unit> function03 = i5 == 0 ? null : function02;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2053034132, i3, -1, "com.robinhood.shared.crypto.ui.trade.confirmation.ConfirmationReceiptCardPreviewComposable (CryptoConfirmationScreenComposable.kt:194)");
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(Background3.m4871backgroundbw27NRU(companion2, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM())), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM());
                StringResource.Companion companion3 = StringResource.INSTANCE;
                int i7 = i3;
                CryptoConfirmationState cryptoConfirmationState = new CryptoConfirmationState(companion3.invoke("Order filled"), companion3.invoke("Your order to open a [long/short] position on a BTCUSD perpetual contract was filled."), extensions2.persistentListOf(new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion3.invoke("Order size"), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(companion3.invoke("$5,642.16"), null, null, null, null, null, 62, null), null, 10, null), new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion3.invoke("Quantity"), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(companion3.invoke("0.0156"), null, null, null, null, null, 62, null), null, 10, null), new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion3.invoke("Leverage"), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(companion3.invoke("Cross 2x"), null, null, null, null, null, 62, null), null, 10, null), new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion3.invoke("Estimated fees"), null, new CryptoOrderConfirmationRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_FILLED_16), null, 2, null), null, null, null, 58, null), null, new CryptoOrderConfirmationRowState.TextContent(companion3.invoke("$1.65"), null, null, null, null, null, 62, null), null, 10, null)), companion3.invoke("Done"), companion3.invoke("View order details"), false, stringResource3, null, null, 384, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoConfirmationScreenComposable6.ConfirmationReceiptCardPreviewComposable$lambda$11$lambda$10((CryptoOrderConfirmationRowState.TapAction) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function04 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                ConfirmationReceiptCard(cryptoConfirmationState, function1, function04, (Function0) objRememberedValue3, modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, function03, composerStartRestartGroup, ((i7 << 15) & 3670016) | 3504, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function02 = function03;
                stringResource2 = stringResource3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.CryptoConfirmationScreenComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoConfirmationScreenComposable6.ConfirmationReceiptCardPreviewComposable$lambda$16(stringResource2, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        function02 = function0;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier.Companion companion22 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN42 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(Background3.m4871backgroundbw27NRU(companion22, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM())), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM());
            StringResource.Companion companion32 = StringResource.INSTANCE;
            int i72 = i3;
            CryptoConfirmationState cryptoConfirmationState2 = new CryptoConfirmationState(companion32.invoke("Order filled"), companion32.invoke("Your order to open a [long/short] position on a BTCUSD perpetual contract was filled."), extensions2.persistentListOf(new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion32.invoke("Order size"), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(companion32.invoke("$5,642.16"), null, null, null, null, null, 62, null), null, 10, null), new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion32.invoke("Quantity"), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(companion32.invoke("0.0156"), null, null, null, null, null, 62, null), null, 10, null), new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion32.invoke("Leverage"), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(companion32.invoke("Cross 2x"), null, null, null, null, null, 62, null), null, 10, null), new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion32.invoke("Estimated fees"), null, new CryptoOrderConfirmationRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_FILLED_16), null, 2, null), null, null, null, 58, null), null, new CryptoOrderConfirmationRowState.TextContent(companion32.invoke("$1.65"), null, null, null, null, null, 62, null), null, 10, null)), companion32.invoke("Done"), companion32.invoke("View order details"), false, stringResource3, null, null, 384, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            Function1 function12 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            Function0 function042 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            ConfirmationReceiptCard(cryptoConfirmationState2, function12, function042, (Function0) objRememberedValue3, modifierM21620defaultFillMaxWidthPaddingVpY3zN42, null, function03, composerStartRestartGroup, ((i72 << 15) & 3670016) | 3504, 32);
            if (ComposerKt.isTraceInProgress()) {
            }
            function02 = function03;
            stringResource2 = stringResource3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmationReceiptCardPreviewComposable$lambda$11$lambda$10(CryptoOrderConfirmationRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
