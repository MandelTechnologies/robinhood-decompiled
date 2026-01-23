package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: RhyOverviewActionBar.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u000b\u001a+\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"RhyOverviewActionBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "onTransferClick", "Lkotlin/Function0;", "onSendClick", "onRequestClick", "isPaycheckVisible", "", "onPaycheckClick", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LabeledIconButton", AnnotatedPrivateKey.LABEL, "", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "onClick", "(Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewActionBarKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyOverviewActionBar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LabeledIconButton$lambda$3(String str, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Function0 function0, int i, Composer composer, int i2) {
        LabeledIconButton(str, serverToBentoAssetMapper2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewActionBar$lambda$1(Modifier modifier, Function0 function0, Function0 function02, Function0 function03, boolean z, Function0 function04, int i, int i2, Composer composer, int i3) {
        RhyOverviewActionBar(modifier, function0, function02, function03, z, function04, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void RhyOverviewActionBar(Modifier modifier, final Function0<Unit> onTransferClick, final Function0<Unit> onSendClick, final Function0<Unit> onRequestClick, final boolean z, final Function0<Unit> onPaycheckClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        float fM21596getXxlargeD9Ej5fM;
        Intrinsics.checkNotNullParameter(onTransferClick, "onTransferClick");
        Intrinsics.checkNotNullParameter(onSendClick, "onSendClick");
        Intrinsics.checkNotNullParameter(onRequestClick, "onRequestClick");
        Intrinsics.checkNotNullParameter(onPaycheckClick, "onPaycheckClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(630071642);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTransferClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSendClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRequestClick) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPaycheckClick) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(630071642, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewActionBar (RhyOverviewActionBar.kt:29)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1457577319);
                fM21596getXxlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1457647782);
                fM21596getXxlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21596getXxlargeD9Ej5fM();
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, fM21596getXxlargeD9Ej5fM, 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            LabeledIconButton(StringResources_androidKt.stringResource(C10285R.string.rhy_primary_action_transfer, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.ACTIONS_TRANSFERS_32, onTransferClick, composerStartRestartGroup, ((i3 << 3) & 896) | 48);
            LabeledIconButton(StringResources_androidKt.stringResource(C10285R.string.rhy_primary_action_send, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.WITHDRAW_24, onSendClick, composerStartRestartGroup, (i3 & 896) | 48);
            LabeledIconButton(StringResources_androidKt.stringResource(C10285R.string.rhy_primary_action_request, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.DEPOSIT_24, onRequestClick, composerStartRestartGroup, ((i3 >> 3) & 896) | 48);
            composerStartRestartGroup.startReplaceGroup(-866400558);
            if (z) {
                LabeledIconButton(StringResources_androidKt.stringResource(C10285R.string.rhy_primary_action_paychecks, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.PAYCHECK_24, onPaycheckClick, composerStartRestartGroup, ((i3 >> 9) & 896) | 48);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewActionBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewActionBar.RhyOverviewActionBar$lambda$1(modifier4, onTransferClick, onSendClick, onRequestClick, z, onPaycheckClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void LabeledIconButton(String str, final ServerToBentoAssetMapper2 serverToBentoAssetMapper2, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-887854538);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-887854538, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.LabeledIconButton (RhyOverviewActionBar.kt:73)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
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
            int i3 = i2;
            BentoIconButton2.m20641BentoIconButtoncqYvz4g(function0, new BentoIconButton4.Icon.HeroSize24(serverToBentoAssetMapper2), str2, null, BentoIconButton4.Type.Primary, false, null, null, null, null, false, composerStartRestartGroup, ((i3 >> 6) & 14) | 24576 | (BentoIconButton4.Icon.HeroSize24.$stable << 3) | ((i3 << 6) & 896), 0, 2024);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS();
            str2 = str;
            BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, i3 & 14, 0, 8126);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewActionBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewActionBar.LabeledIconButton$lambda$3(str2, serverToBentoAssetMapper2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
