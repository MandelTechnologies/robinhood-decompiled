package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoDataRow.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001aU\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\f\u001ag\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a}\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u001f\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010#\u001a\r\u0010$\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010#\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010#\u001a\r\u0010&\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010#¨\u0006'"}, m3636d2 = {"BentoDataRow", "", "state", "Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;", "modifier", "Landroidx/compose/ui/Modifier;", "onIconClick", "Lkotlin/Function0;", "(Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoCondensedDataRow", "onValueTextClick", "onValueIconClick", "(Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LabelText", "text", "Landroidx/compose/ui/text/AnnotatedString;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "maxLines", "", "colorOverride", "Landroidx/compose/ui/graphics/Color;", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "iconTint", "LabelText-CiF43Yo", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ILandroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Lcom/robinhood/compose/bento/component/BentoIcons;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ValueText", "textStyleOverride", "ValueText-CJN_2NY", "(Landroidx/compose/ui/text/AnnotatedString;ILandroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/TextStyle;Lcom/robinhood/compose/bento/component/BentoIcons;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DescriptionText", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BentoDataRowPreviewDay", "(Landroidx/compose/runtime/Composer;I)V", "BentoDataRowPreviewNight", "PreviewContent", "PreviewContentCondensed", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class BentoDataRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCondensedDataRow$lambda$3(BentoDataRowState bentoDataRowState, Modifier modifier, Function0 function0, Function0 function02, Function0 function03, int i, int i2, Composer composer, int i3) {
        BentoCondensedDataRow(bentoDataRowState, modifier, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoDataRow$lambda$1(BentoDataRowState bentoDataRowState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        BentoDataRow(bentoDataRowState, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoDataRowPreviewDay$lambda$11(int i, Composer composer, int i2) {
        BentoDataRowPreviewDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoDataRowPreviewNight$lambda$12(int i, Composer composer, int i2) {
        BentoDataRowPreviewNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DescriptionText$lambda$10(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DescriptionText(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LabelText_CiF43Yo$lambda$5(AnnotatedString annotatedString, TextStyle textStyle, int i, Modifier modifier, Color color, BentoIcon4 bentoIcon4, Color color2, Function0 function0, int i2, int i3, Composer composer, int i4) {
        m20969LabelTextCiF43Yo(annotatedString, textStyle, i, modifier, color, bentoIcon4, color2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewContent$lambda$14(int i, Composer composer, int i2) {
        PreviewContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewContentCondensed$lambda$16(int i, Composer composer, int i2) {
        PreviewContentCondensed(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValueText_CJN_2NY$lambda$9(AnnotatedString annotatedString, int i, Modifier modifier, Color color, TextStyle textStyle, BentoIcon4 bentoIcon4, Color color2, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        m20970ValueTextCJN_2NY(annotatedString, i, modifier, color, textStyle, bentoIcon4, color2, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoDataRow(final BentoDataRowState state, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Function0<Unit> function03;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1919296813);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
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
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    final Function0<Unit> function04 = i4 == 0 ? null : function02;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1919296813, i3, -1, "com.robinhood.compose.bento.component.rows.BentoDataRow (BentoDataRow.kt:42)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                    BentoDataRowDefaults bentoDataRowDefaults = BentoDataRowDefaults.INSTANCE;
                    Modifier modifier5 = modifier4;
                    Function0<Unit> function05 = function04;
                    BentoBaseRowLayout.BentoBaseRowLayout(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.m5155defaultMinSizeVpY3zN4$default(companion2, 0.0f, bentoDataRowDefaults.m20964getStandardMinHeightD9Ej5fM(), 1, null), bentoDataRowDefaults.m20963getCondensedVerticalPaddingD9Ej5fM(), composerStartRestartGroup, 54, 0), null, null, ComposableLambda3.rememberComposableLambda(-778690662, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$BentoDataRow$1$1
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
                                ComposerKt.traceEventStart(-778690662, i6, -1, "com.robinhood.compose.bento.component.rows.BentoDataRow.<anonymous>.<anonymous> (BentoDataRow.kt:49)");
                            }
                            AnnotatedString label = state.getLabel();
                            TextStyle textS = BentoTheme.INSTANCE.getTypography(composer3, 6).getTextS();
                            BentoIcon4 labelIcon = state.getLabelIcon();
                            Color colorM20980getLabelIconTintQN2ZGVo = state.m20980getLabelIconTintQN2ZGVo();
                            BentoDataRowKt.m20969LabelTextCiF43Yo(label, textS, 2, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowLabelPlaceholder(), null, 2, null), state.m20979getLabelColorOverrideQN2ZGVo(), labelIcon, colorM20980getLabelIconTintQN2ZGVo, function04, composer3, 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1212654343, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$BentoDataRow$1$2
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
                                ComposerKt.traceEventStart(-1212654343, i6, -1, "com.robinhood.compose.bento.component.rows.BentoDataRow.<anonymous>.<anonymous> (BentoDataRow.kt:61)");
                            }
                            BentoDataRowKt.m20970ValueTextCJN_2NY(state.getValue(), 3, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowValuePlaceholder(), null, 2, null), state.m20981getValueColorOverrideQN2ZGVo(), state.getValueTextStyleOverride(), state.getValueIcon(), state.m20982getValueIconTintQN2ZGVo(), null, null, composer3, 48, 384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, false, true, true, null, composerStartRestartGroup, 920349696, 0, 1030);
                    composer2 = composerStartRestartGroup;
                    DescriptionText(state.getDescription(), null, composer2, 0, 2);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function03 = function05;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    function03 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoDataRowKt.BentoDataRow$lambda$1(state, modifier3, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function02 = function0;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                    BentoDataRowDefaults bentoDataRowDefaults2 = BentoDataRowDefaults.INSTANCE;
                    Modifier modifier52 = modifier4;
                    Function0<Unit> function052 = function04;
                    BentoBaseRowLayout.BentoBaseRowLayout(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.m5155defaultMinSizeVpY3zN4$default(companion22, 0.0f, bentoDataRowDefaults2.m20964getStandardMinHeightD9Ej5fM(), 1, null), bentoDataRowDefaults2.m20963getCondensedVerticalPaddingD9Ej5fM(), composerStartRestartGroup, 54, 0), null, null, ComposableLambda3.rememberComposableLambda(-778690662, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$BentoDataRow$1$1
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
                                ComposerKt.traceEventStart(-778690662, i6, -1, "com.robinhood.compose.bento.component.rows.BentoDataRow.<anonymous>.<anonymous> (BentoDataRow.kt:49)");
                            }
                            AnnotatedString label = state.getLabel();
                            TextStyle textS = BentoTheme.INSTANCE.getTypography(composer3, 6).getTextS();
                            BentoIcon4 labelIcon = state.getLabelIcon();
                            Color colorM20980getLabelIconTintQN2ZGVo = state.m20980getLabelIconTintQN2ZGVo();
                            BentoDataRowKt.m20969LabelTextCiF43Yo(label, textS, 2, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowLabelPlaceholder(), null, 2, null), state.m20979getLabelColorOverrideQN2ZGVo(), labelIcon, colorM20980getLabelIconTintQN2ZGVo, function04, composer3, 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1212654343, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$BentoDataRow$1$2
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
                                ComposerKt.traceEventStart(-1212654343, i6, -1, "com.robinhood.compose.bento.component.rows.BentoDataRow.<anonymous>.<anonymous> (BentoDataRow.kt:61)");
                            }
                            BentoDataRowKt.m20970ValueTextCJN_2NY(state.getValue(), 3, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowValuePlaceholder(), null, 2, null), state.m20981getValueColorOverrideQN2ZGVo(), state.getValueTextStyleOverride(), state.getValueIcon(), state.m20982getValueIconTintQN2ZGVo(), null, null, composer3, 48, 384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, false, true, true, null, composerStartRestartGroup, 920349696, 0, 1030);
                    composer2 = composerStartRestartGroup;
                    DescriptionText(state.getDescription(), null, composer2, 0, 2);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function03 = function052;
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoCondensedDataRow(final BentoDataRowState state, Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function04;
        int i5;
        Function0<Unit> function05;
        int i6;
        Function0<Unit> function06;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Function0<Unit> function07;
        final Modifier modifier3;
        final Function0<Unit> function08;
        final Function0<Unit> function09;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-553872226);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
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
                    function04 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function04) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function05 = function02;
                        i3 |= composerStartRestartGroup.changedInstance(function05) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            function06 = function03;
                            i3 |= composerStartRestartGroup.changedInstance(function06) ? 16384 : 8192;
                        }
                        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            final Function0<Unit> function010 = i4 == 0 ? null : function04;
                            final Function0<Unit> function011 = i5 == 0 ? null : function05;
                            final Function0<Unit> function012 = i6 == 0 ? null : function06;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-553872226, i3, -1, "com.robinhood.compose.bento.component.rows.BentoCondensedDataRow (BentoDataRow.kt:88)");
                            }
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                            BentoDataRowDefaults bentoDataRowDefaults = BentoDataRowDefaults.INSTANCE;
                            Function0<Unit> function013 = function010;
                            Function0<Unit> function014 = function011;
                            Function0<Unit> function015 = function012;
                            BentoBaseRowLayout.BentoBaseRowLayout(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.m5155defaultMinSizeVpY3zN4$default(companion2, 0.0f, bentoDataRowDefaults.m20962getCondensedMinHeightD9Ej5fM(), 1, null), bentoDataRowDefaults.m20963getCondensedVerticalPaddingD9Ej5fM(), composerStartRestartGroup, 54, 0), null, null, ComposableLambda3.rememberComposableLambda(1263267153, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$BentoCondensedDataRow$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1263267153, i8, -1, "com.robinhood.compose.bento.component.rows.BentoCondensedDataRow.<anonymous>.<anonymous> (BentoDataRow.kt:95)");
                                    }
                                    Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowLabelPlaceholder(), null, 2, null);
                                    BentoDataRowKt.m20969LabelTextCiF43Yo(state.getLabel(), BentoTheme.INSTANCE.getTypography(composer3, 6).getTextM(), 2, modifierBentoPlaceholder$default, state.m20979getLabelColorOverrideQN2ZGVo(), state.getLabelIcon(), state.m20980getLabelIconTintQN2ZGVo(), function010, composer3, 384, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1601770323, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$BentoCondensedDataRow$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1601770323, i8, -1, "com.robinhood.compose.bento.component.rows.BentoCondensedDataRow.<anonymous>.<anonymous> (BentoDataRow.kt:107)");
                                    }
                                    BentoDataRowKt.m20970ValueTextCJN_2NY(state.getValue(), 1, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowValuePlaceholder(), null, 2, null), state.m20981getValueColorOverrideQN2ZGVo(), state.getValueTextStyleOverride(), state.getValueIcon(), state.m20982getValueIconTintQN2ZGVo(), function011, function012, composer3, 48, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, false, true, true, null, composerStartRestartGroup, 920325120, 0, 1046);
                            composer2 = composerStartRestartGroup;
                            DescriptionText(state.getDescription(), null, composer2, 0, 2);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function07 = function013;
                            modifier3 = modifier4;
                            function08 = function014;
                            function09 = function015;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            Modifier modifier5 = modifier2;
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier5;
                            function07 = function04;
                            function08 = function05;
                            function09 = function06;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoDataRowKt.BentoCondensedDataRow$lambda$3(state, modifier3, function07, function08, function09, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    function06 = function03;
                    if ((i3 & 9363) != 9362) {
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                            BentoDataRowDefaults bentoDataRowDefaults2 = BentoDataRowDefaults.INSTANCE;
                            Function0<Unit> function0132 = function010;
                            Function0<Unit> function0142 = function011;
                            Function0<Unit> function0152 = function012;
                            BentoBaseRowLayout.BentoBaseRowLayout(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.m5155defaultMinSizeVpY3zN4$default(companion22, 0.0f, bentoDataRowDefaults2.m20962getCondensedMinHeightD9Ej5fM(), 1, null), bentoDataRowDefaults2.m20963getCondensedVerticalPaddingD9Ej5fM(), composerStartRestartGroup, 54, 0), null, null, ComposableLambda3.rememberComposableLambda(1263267153, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$BentoCondensedDataRow$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1263267153, i8, -1, "com.robinhood.compose.bento.component.rows.BentoCondensedDataRow.<anonymous>.<anonymous> (BentoDataRow.kt:95)");
                                    }
                                    Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowLabelPlaceholder(), null, 2, null);
                                    BentoDataRowKt.m20969LabelTextCiF43Yo(state.getLabel(), BentoTheme.INSTANCE.getTypography(composer3, 6).getTextM(), 2, modifierBentoPlaceholder$default, state.m20979getLabelColorOverrideQN2ZGVo(), state.getLabelIcon(), state.m20980getLabelIconTintQN2ZGVo(), function010, composer3, 384, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1601770323, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$BentoCondensedDataRow$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1601770323, i8, -1, "com.robinhood.compose.bento.component.rows.BentoCondensedDataRow.<anonymous>.<anonymous> (BentoDataRow.kt:107)");
                                    }
                                    BentoDataRowKt.m20970ValueTextCJN_2NY(state.getValue(), 1, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, state.getShowValuePlaceholder(), null, 2, null), state.m20981getValueColorOverrideQN2ZGVo(), state.getValueTextStyleOverride(), state.getValueIcon(), state.m20982getValueIconTintQN2ZGVo(), function011, function012, composer3, 48, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, false, true, true, null, composerStartRestartGroup, 920325120, 0, 1046);
                            composer2 = composerStartRestartGroup;
                            DescriptionText(state.getDescription(), null, composer2, 0, 2);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function07 = function0132;
                            modifier3 = modifier4;
                            function08 = function0142;
                            function09 = function0152;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function05 = function02;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                function06 = function03;
                if ((i3 & 9363) != 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function04 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function05 = function02;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function06 = function03;
            if ((i3 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function04 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function05 = function02;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function06 = function03;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /* renamed from: LabelText-CiF43Yo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20969LabelTextCiF43Yo(final AnnotatedString annotatedString, final TextStyle textStyle, final int i, Modifier modifier, Color color, BentoIcon4 bentoIcon4, Color color2, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        AnnotatedString annotatedString2;
        int i4;
        TextStyle textStyle2;
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        Color color3;
        int i8;
        BentoIcon4 bentoIcon42;
        int i9;
        int i10;
        int i11;
        BentoIcon4 bentoIcon43;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function0<Unit> function02;
        Composer composer2;
        BentoIcon4 bentoIcon44;
        final Color color4;
        final Modifier modifier3;
        final Color color5;
        final BentoIcon4 bentoIcon45;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(639988557);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i2 & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(annotatedString2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                textStyle2 = textStyle;
                i4 |= composerStartRestartGroup.changed(textStyle2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i5 = i;
                    i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        modifier2 = modifier;
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            color3 = color;
                            i4 |= composerStartRestartGroup.changed(color3) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else {
                            if ((196608 & i2) == 0) {
                                bentoIcon42 = bentoIcon4;
                                i4 |= composerStartRestartGroup.changed(bentoIcon42) ? 131072 : 65536;
                            }
                            i9 = i3 & 64;
                            if (i9 == 0) {
                                i4 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(color2) ? 1048576 : 524288;
                            }
                            i10 = i3 & 128;
                            if (i10 != 0) {
                                if ((i2 & 12582912) == 0) {
                                    i11 = i10;
                                    i4 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                                }
                                if ((i4 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function03 = function0;
                                    composer2 = composerStartRestartGroup;
                                    modifier3 = modifier2;
                                    color4 = color3;
                                    bentoIcon45 = bentoIcon42;
                                    color5 = color2;
                                } else {
                                    if (i6 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    Color color6 = i7 == 0 ? null : color3;
                                    bentoIcon43 = i8 == 0 ? null : bentoIcon42;
                                    Color color7 = i9 == 0 ? null : color2;
                                    Function0<Unit> function04 = i11 == 0 ? function0 : null;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(639988557, i4, -1, "com.robinhood.compose.bento.component.rows.LabelText (BentoDataRow.kt:153)");
                                    }
                                    composerStartRestartGroup.startReplaceGroup(848689747);
                                    long jM21426getFg20d7_KjU = color6 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21426getFg20d7_KjU() : color6.getValue();
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i12 = i4 >> 9;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<Unit> function05 = function04;
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    BentoText2.m20748BentoTextQnj7Zds(annotatedString2, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, i5, 0, null, null, textStyle2, composerStartRestartGroup, (i4 & 14) | ((i4 << 21) & 1879048192), (i4 << 6) & 7168, 7674);
                                    composerStartRestartGroup.startReplaceGroup(-1529771857);
                                    if (bentoIcon43 == null) {
                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(4)), composerStartRestartGroup, 6);
                                        composerStartRestartGroup.startReplaceGroup(-1529769440);
                                        if (color7 == null) {
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            if (!bentoTheme.getColors(composerStartRestartGroup, 6).isAchromatic$lib_compose_bento_externalRelease()) {
                                                jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, 6).m21368getAccent0d7_KjU();
                                            }
                                        } else {
                                            jM21426getFg20d7_KjU = color7.getValue();
                                        }
                                        long j = jM21426getFg20d7_KjU;
                                        composerStartRestartGroup.endReplaceGroup();
                                        function02 = function05;
                                        bentoIcon44 = bentoIcon43;
                                        BentoIcon2.m20644BentoIconFU0evQE(bentoIcon44, null, j, null, function02, false, composerStartRestartGroup, 48 | ((i4 >> 15) & 14) | (i12 & 57344), 40);
                                        composer2 = composerStartRestartGroup;
                                    } else {
                                        function02 = function05;
                                        composer2 = composerStartRestartGroup;
                                        bentoIcon44 = bentoIcon43;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    color4 = color6;
                                    modifier3 = modifier2;
                                    color5 = color7;
                                    bentoIcon45 = bentoIcon44;
                                    function03 = function02;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return BentoDataRowKt.LabelText_CiF43Yo$lambda$5(annotatedString, textStyle, i, modifier3, color4, bentoIcon45, color5, function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i4 |= 12582912;
                            i11 = i10;
                            if ((i4 & 4793491) == 4793490) {
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceGroup(848689747);
                                long jM21426getFg20d7_KjU2 = color6 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21426getFg20d7_KjU() : color6.getValue();
                                composerStartRestartGroup.endReplaceGroup();
                                int i122 = i4 >> 9;
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<Unit> function052 = function04;
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    BentoText2.m20748BentoTextQnj7Zds(annotatedString2, null, Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, null, null, 0, false, i5, 0, null, null, textStyle2, composerStartRestartGroup, (i4 & 14) | ((i4 << 21) & 1879048192), (i4 << 6) & 7168, 7674);
                                    composerStartRestartGroup.startReplaceGroup(-1529771857);
                                    if (bentoIcon43 == null) {
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    color4 = color6;
                                    modifier3 = modifier2;
                                    color5 = color7;
                                    bentoIcon45 = bentoIcon44;
                                    function03 = function02;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        bentoIcon42 = bentoIcon4;
                        i9 = i3 & 64;
                        if (i9 == 0) {
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                        }
                        i11 = i10;
                        if ((i4 & 4793491) == 4793490) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    color3 = color;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    bentoIcon42 = bentoIcon4;
                    i9 = i3 & 64;
                    if (i9 == 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i4 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                color3 = color;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                bentoIcon42 = bentoIcon4;
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i4 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i5 = i;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            modifier2 = modifier;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            color3 = color;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            bentoIcon42 = bentoIcon4;
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i4 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        textStyle2 = textStyle;
        if ((i3 & 4) == 0) {
        }
        i5 = i;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        modifier2 = modifier;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        color3 = color;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        bentoIcon42 = bentoIcon4;
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i4 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* renamed from: ValueText-CJN_2NY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20970ValueTextCJN_2NY(final AnnotatedString annotatedString, final int i, Modifier modifier, Color color, TextStyle textStyle, BentoIcon4 bentoIcon4, Color color2, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i2, final int i3) {
        AnnotatedString annotatedString2;
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        Color color3;
        int i7;
        TextStyle textStyle2;
        int i8;
        BentoIcon4 bentoIcon42;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        BentoIcon4 bentoIcon43;
        Function0<Unit> function03;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function0<Unit> function04;
        Composer composer2;
        BentoIcon4 bentoIcon44;
        final Color color4;
        final Color color5;
        final Function0<Unit> function05;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final BentoIcon4 bentoIcon45;
        final Function0<Unit> function06;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1361165780);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i2 & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(annotatedString2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        color3 = color;
                        i4 |= composerStartRestartGroup.changed(color3) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            textStyle2 = textStyle;
                            i4 |= composerStartRestartGroup.changed(textStyle2) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else {
                            if ((196608 & i2) == 0) {
                                bentoIcon42 = bentoIcon4;
                                i4 |= composerStartRestartGroup.changed(bentoIcon42) ? 131072 : 65536;
                            }
                            i9 = i3 & 64;
                            if (i9 == 0) {
                                i4 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(color2) ? 1048576 : 524288;
                            }
                            i10 = i3 & 128;
                            if (i10 == 0) {
                                i4 |= 12582912;
                            } else {
                                if ((i2 & 12582912) == 0) {
                                    i11 = i10;
                                    i4 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                                }
                                i12 = i3 & 256;
                                if (i12 == 0) {
                                    if ((i2 & 100663296) == 0) {
                                        i13 = i12;
                                        i4 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
                                    }
                                    if ((i4 & 38347923) != 38347922 && composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        function05 = function0;
                                        composer2 = composerStartRestartGroup;
                                        modifier3 = modifier2;
                                        color5 = color3;
                                        textStyle3 = textStyle2;
                                        bentoIcon45 = bentoIcon42;
                                        color4 = color2;
                                        function06 = function02;
                                    } else {
                                        if (i5 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i6 != 0) {
                                            color3 = null;
                                        }
                                        if (i7 != 0) {
                                            textStyle2 = null;
                                        }
                                        bentoIcon43 = i8 == 0 ? null : bentoIcon42;
                                        Color color6 = i9 == 0 ? null : color2;
                                        function03 = i11 == 0 ? null : function0;
                                        Function0<Unit> function07 = i13 == 0 ? function02 : null;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1361165780, i4, -1, "com.robinhood.compose.bento.component.rows.ValueText (BentoDataRow.kt:191)");
                                        }
                                        composerStartRestartGroup.startReplaceGroup(-1884698983);
                                        long jM21425getFg0d7_KjU = color3 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU() : color3.getValue();
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(-1884696764);
                                        TextStyle textM = textStyle2 != null ? BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextM() : textStyle2;
                                        composerStartRestartGroup.endReplaceGroup();
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, 6).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<Unit> function08 = function07;
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
                                        int i14 = i4;
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(137235713);
                                        Modifier modifierM4891clickableO2vRcR0$default = Modifier.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(137236381);
                                        if (function03 != null) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = InteractionSource2.MutableInteractionSource();
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM4891clickableO2vRcR0$default, (InteractionSource3) objRememberedValue, null, false, null, null, function03, 28, null);
                                        }
                                        Function0<Unit> function09 = function03;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endReplaceGroup();
                                        BentoText2.m20748BentoTextQnj7Zds(annotatedString2, modifierM4891clickableO2vRcR0$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, i, 0, null, null, textM, composerStartRestartGroup, (i14 & 14) | ((i14 << 24) & 1879048192), 0, 7672);
                                        composerStartRestartGroup.startReplaceGroup(137251855);
                                        if (bentoIcon43 == null) {
                                            if (color6 != null) {
                                                jM21425getFg0d7_KjU = color6.getValue();
                                            }
                                            function04 = function08;
                                            bentoIcon44 = bentoIcon43;
                                            BentoIcon2.m20644BentoIconFU0evQE(bentoIcon44, null, jM21425getFg0d7_KjU, null, function04, false, composerStartRestartGroup, 48 | ((i14 >> 15) & 14) | ((i14 >> 12) & 57344), 40);
                                            composer2 = composerStartRestartGroup;
                                        } else {
                                            function04 = function08;
                                            composer2 = composerStartRestartGroup;
                                            bentoIcon44 = bentoIcon43;
                                        }
                                        composer2.endReplaceGroup();
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        Color color7 = color3;
                                        color4 = color6;
                                        color5 = color7;
                                        function05 = function09;
                                        modifier3 = modifier2;
                                        textStyle3 = textStyle2;
                                        bentoIcon45 = bentoIcon44;
                                        function06 = function04;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return BentoDataRowKt.ValueText_CJN_2NY$lambda$9(annotatedString, i, modifier3, color5, textStyle3, bentoIcon45, color4, function05, function06, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i4 |= 100663296;
                                i13 = i12;
                                if ((i4 & 38347923) != 38347922) {
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-1884698983);
                                    long jM21425getFg0d7_KjU2 = color3 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU() : color3.getValue();
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-1884696764);
                                    if (textStyle2 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, 6).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<Unit> function082 = function07;
                                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    int i142 = i4;
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                        Row6 row62 = Row6.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(137235713);
                                        Modifier modifierM4891clickableO2vRcR0$default2 = Modifier.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(137236381);
                                        if (function03 != null) {
                                        }
                                        Function0<Unit> function092 = function03;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endReplaceGroup();
                                        BentoText2.m20748BentoTextQnj7Zds(annotatedString2, modifierM4891clickableO2vRcR0$default2, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, i, 0, null, null, textM, composerStartRestartGroup, (i142 & 14) | ((i142 << 24) & 1879048192), 0, 7672);
                                        composerStartRestartGroup.startReplaceGroup(137251855);
                                        if (bentoIcon43 == null) {
                                        }
                                        composer2.endReplaceGroup();
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        Color color72 = color3;
                                        color4 = color6;
                                        color5 = color72;
                                        function05 = function092;
                                        modifier3 = modifier2;
                                        textStyle3 = textStyle2;
                                        bentoIcon45 = bentoIcon44;
                                        function06 = function04;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i11 = i10;
                            i12 = i3 & 256;
                            if (i12 == 0) {
                            }
                            i13 = i12;
                            if ((i4 & 38347923) != 38347922) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        bentoIcon42 = bentoIcon4;
                        i9 = i3 & 64;
                        if (i9 == 0) {
                        }
                        i10 = i3 & 128;
                        if (i10 == 0) {
                        }
                        i11 = i10;
                        i12 = i3 & 256;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        if ((i4 & 38347923) != 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    textStyle2 = textStyle;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    bentoIcon42 = bentoIcon4;
                    i9 = i3 & 64;
                    if (i9 == 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    i12 = i3 & 256;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    if ((i4 & 38347923) != 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                color3 = color;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                textStyle2 = textStyle;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                bentoIcon42 = bentoIcon4;
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i4 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            color3 = color;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            textStyle2 = textStyle;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            bentoIcon42 = bentoIcon4;
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i4 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        color3 = color;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        bentoIcon42 = bentoIcon4;
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i4 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void DescriptionText(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-194733696);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-194733696, i3, -1, "com.robinhood.compose.bento.component.rows.DescriptionText (BentoDataRow.kt:232)");
                }
                if (str == null) {
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    modifier3 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i3 >> 3) & 14, 1), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, 6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, 6).getTextS(), composerStartRestartGroup, i3 & 14, 0, 8184);
                } else {
                    modifier3 = modifier4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoDataRowKt.DescriptionText$lambda$10(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (str == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void BentoDataRowPreviewDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2035773271);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2035773271, i, -1, "com.robinhood.compose.bento.component.rows.BentoDataRowPreviewDay (BentoDataRow.kt:259)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableSingletons$BentoDataRowKt.INSTANCE.getLambda$249029105$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoDataRowKt.BentoDataRowPreviewDay$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoDataRowPreviewNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(187302437);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(187302437, i, -1, "com.robinhood.compose.bento.component.rows.BentoDataRowPreviewNight (BentoDataRow.kt:275)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableSingletons$BentoDataRowKt.INSTANCE.getLambda$1154097517$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoDataRowKt.BentoDataRowPreviewNight$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1770357380);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1770357380, i, -1, "com.robinhood.compose.bento.component.rows.PreviewContent (BentoDataRow.kt:290)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
            BentoDataRow(new BentoDataRowState(null, new AnnotatedString("Annotated label", null, 2, null), null, new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, new AnnotatedString("Value", null, 2, null), null, null, new BentoIcon4.Size16(ServerToBentoAssetMapper2.COPY_16), null, false, false, 3797, null), null, null, composerStartRestartGroup, 0, 6);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(8)), composerStartRestartGroup, 6);
            BentoDataRow(new BentoDataRowState(null, new AnnotatedString("Another row with a very long label because we want to show that labels can wrap", null, 2, null), null, null, null, new AnnotatedString("this row has a very long value and no icon anywhere to be seen. By the way, how is your day going? This can go for up to three lines, did you know that?", null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoDataRowKt.PreviewContent$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewContentCondensed(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1935588005);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1935588005, i, -1, "com.robinhood.compose.bento.component.rows.PreviewContentCondensed (BentoDataRow.kt:317)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
            BentoCondensedDataRow(new BentoDataRowState(null, new AnnotatedString("Annotated label", null, 2, null), null, new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, new AnnotatedString("Value", null, 2, null), null, null, new BentoIcon4.Size16(ServerToBentoAssetMapper2.COPY_16), null, false, false, 3797, null), null, null, null, null, composerStartRestartGroup, 0, 30);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(8)), composerStartRestartGroup, 6);
            BentoCondensedDataRow(new BentoDataRowState(null, new AnnotatedString("Another row with a very long label because we want to show that labels can wrap", null, 2, null), null, null, null, new AnnotatedString("this row has a very long value and no icon anywhere to be seen. By the way, how is your day going? This can go for up to three lines, did you know that?", null, 2, null), null, null, null, null, false, false, 4061, null), null, null, null, null, composerStartRestartGroup, 0, 30);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoDataRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoDataRowKt.PreviewContentCondensed$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
