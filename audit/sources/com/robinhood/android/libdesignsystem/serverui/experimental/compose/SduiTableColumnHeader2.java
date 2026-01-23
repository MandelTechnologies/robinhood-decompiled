package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.TableColumnHeader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiTableColumnHeader.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a9\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, m3636d2 = {"SduiTableColumnHeader", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/TableColumnHeader;", "modifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lcom/robinhood/models/serverdriven/experimental/api/TableColumnHeader;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "isClicked", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeaderKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiTableColumnHeader2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTableColumnHeader$lambda$17(TableColumnHeader tableColumnHeader, Modifier modifier, InteractionSource3 interactionSource3, int i, int i2, Composer composer, int i3) {
        SduiTableColumnHeader(tableColumnHeader, modifier, interactionSource3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiTableColumnHeader(final TableColumnHeader<? extends ActionT> component, Modifier modifier, InteractionSource3 interactionSource3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        InteractionSource3 interactionSource32;
        InteractionSource3 interactionSource33;
        final Function0<Unit> function0Handling;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        long jM21426getFg20d7_KjU;
        boolean zChanged2;
        Object objRememberedValue3;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Object objRememberedValue4;
        BentoIcon4 bentoIcon;
        final InteractionSource3 interactionSource34;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1803996358);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    interactionSource32 = interactionSource3;
                    i3 |= composerStartRestartGroup.changed(interactionSource32) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    interactionSource34 = interactionSource32;
                } else {
                    Modifier modifierM4891clickableO2vRcR0$default = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        interactionSource33 = (InteractionSource3) objRememberedValue5;
                    } else {
                        interactionSource33 = interactionSource32;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1803996358, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeader (SduiTableColumnHeader.kt:34)");
                    }
                    Parcelable action = component.getAction();
                    composerStartRestartGroup.startReplaceGroup(-1526278822);
                    function0Handling = action != null ? null : SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), action);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(component);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    if (!SduiTableColumnHeader$lambda$6(snapshotState)) {
                        composerStartRestartGroup.startReplaceGroup(-1526270135);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (component.getActive()) {
                        composerStartRestartGroup.startReplaceGroup(-1526268536);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1526267351);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    long j = jM21426getFg20d7_KjU;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged2 = ((i3 & 896) != 256) | composerStartRestartGroup.changed(function0Handling) | composerStartRestartGroup.changed(snapshotState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new SduiTableColumnHeader3(interactionSource33, function0Handling, snapshotState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(interactionSource33, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i3 >> 6) & 14);
                    composerStartRestartGroup.startReplaceGroup(-1526256422);
                    if (function0Handling != null) {
                        modifier3 = modifierM4891clickableO2vRcR0$default;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged3 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(function0Handling);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeaderKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiTableColumnHeader2.SduiTableColumnHeader$lambda$11$lambda$10$lambda$9(function0Handling, snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifierM4891clickableO2vRcR0$default;
                        modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM4891clickableO2vRcR0$default, interactionSource33, null, false, null, null, (Function0) objRememberedValue6, 28, null);
                    }
                    InteractionSource3 interactionSource35 = interactionSource33;
                    composerStartRestartGroup.endReplaceGroup();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
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
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    String title = component.getTitle();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                    Color colorM6701boximpl = Color.m6701boximpl(j);
                    TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeaderKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiTableColumnHeader2.SduiTableColumnHeader$lambda$16$lambda$15$lambda$13$lambda$12(snapshotState2, (TextLayoutResult) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(title, null, colorM6701boximpl, null, bold, null, textAlignM7912boximpl, 0, false, 0, 0, (Function1) objRememberedValue4, 0, textS, composerStartRestartGroup, 24576, 48, 6058);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Icon icon = component.getIcon();
                    bentoIcon = icon == null ? SduiIcon2.toBentoIcon(icon) : null;
                    composerStartRestartGroup.startReplaceGroup(-1565413135);
                    if (bentoIcon != null) {
                        BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, "", j, PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 48);
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(-911213241);
                    if (SduiTableColumnHeader$lambda$6(snapshotState)) {
                        BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5153XS, bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), composerStartRestartGroup, 48, 1);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    interactionSource34 = interactionSource35;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeaderKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiTableColumnHeader2.SduiTableColumnHeader$lambda$17(component, modifier3, interactionSource34, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            interactionSource32 = interactionSource3;
            if ((i3 & 147) == 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Parcelable action2 = component.getAction();
                composerStartRestartGroup.startReplaceGroup(-1526278822);
                if (action2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(component);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    if (!SduiTableColumnHeader$lambda$6(snapshotState)) {
                    }
                    long j2 = jM21426getFg20d7_KjU;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged2 = ((i3 & 896) != 256) | composerStartRestartGroup.changed(function0Handling) | composerStartRestartGroup.changed(snapshotState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue3 = new SduiTableColumnHeader3(interactionSource33, function0Handling, snapshotState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(interactionSource33, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i3 >> 6) & 14);
                        composerStartRestartGroup.startReplaceGroup(-1526256422);
                        if (function0Handling != null) {
                        }
                        InteractionSource3 interactionSource352 = interactionSource33;
                        composerStartRestartGroup.endReplaceGroup();
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getCenter(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                String title2 = component.getTitle();
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i62 = BentoTheme.$stable;
                                TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS();
                                FontWeight bold2 = FontWeight.INSTANCE.getBold();
                                int iM7919getCentere0LSkKk2 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                Color colorM6701boximpl2 = Color.m6701boximpl(j2);
                                TextAlign textAlignM7912boximpl2 = TextAlign.m7912boximpl(iM7919getCentere0LSkKk2);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(title2, null, colorM6701boximpl2, null, bold2, null, textAlignM7912boximpl2, 0, false, 0, 0, (Function1) objRememberedValue4, 0, textS2, composerStartRestartGroup, 24576, 48, 6058);
                                composerStartRestartGroup = composerStartRestartGroup;
                                Icon icon2 = component.getIcon();
                                if (icon2 == null) {
                                }
                                composerStartRestartGroup.startReplaceGroup(-1565413135);
                                if (bentoIcon != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.startReplaceGroup(-911213241);
                                if (SduiTableColumnHeader$lambda$6(snapshotState)) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                interactionSource34 = interactionSource352;
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        interactionSource32 = interactionSource3;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SduiTableColumnHeader$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTableColumnHeader$lambda$11$lambda$10$lambda$9(Function0 function0, SnapshotState snapshotState) {
        SduiTableColumnHeader$lambda$7(snapshotState, true);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTableColumnHeader$lambda$16$lambda$15$lambda$13$lambda$12(SnapshotState snapshotState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }

    private static final boolean SduiTableColumnHeader$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
