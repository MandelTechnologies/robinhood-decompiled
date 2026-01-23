package com.robinhood.shared.taxLots.views;

import androidx.compose.foundation.BorderKt;
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
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.responsive.WindowSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.taxLots.views.TaxLotTableInputCell3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotTableInputCell.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001aw\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000626\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"TaxLotTableInputCell", "", "T", "state", "Lcom/robinhood/shared/taxLots/views/TaxLotTableInputCellState;", "onTapAction", "Lkotlin/Function1;", "onCheckBoxClicked", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "id", "", "isSelected", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/taxLots/views/TaxLotTableInputCellState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CompactColumnWidth", "", "MediumColumnWidth", "ExpandedColumnWidth", "TaxLotTableInputCellPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-lot-table-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.taxLots.views.TaxLotTableInputCellKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TaxLotTableInputCell3 {
    public static final float CompactColumnWidth = 130.0f;
    public static final float ExpandedColumnWidth = 170.0f;
    public static final float MediumColumnWidth = 150.0f;

    /* compiled from: TaxLotTableInputCell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.taxLots.views.TaxLotTableInputCellKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WindowSize.values().length];
            try {
                iArr[WindowSize.Compact.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WindowSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WindowSize.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotTableInputCell$lambda$0(TaxLotTableInputCellState taxLotTableInputCellState, Function1 function1, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TaxLotTableInputCell(taxLotTableInputCellState, function1, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotTableInputCellPreview$lambda$1(int i, Composer composer, int i2) {
        TaxLotTableInputCellPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void TaxLotTableInputCell(final TaxLotTableInputCellState<T> state, final Function1<? super T, Unit> onTapAction, final Function2<? super String, ? super Boolean, Unit> onCheckBoxClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTapAction, "onTapAction");
        Intrinsics.checkNotNullParameter(onCheckBoxClicked, "onCheckBoxClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1897790724);
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
            i3 |= composerStartRestartGroup.changedInstance(onTapAction) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCheckBoxClicked) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897790724, i3, -1, "com.robinhood.shared.taxLots.views.TaxLotTableInputCell (TaxLotTableInputCell.kt:44)");
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6).ordinal()];
                if (i4 != 1) {
                    f = 130.0f;
                } else if (i4 == 2) {
                    f = 150.0f;
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 170.0f;
                }
                Modifier modifier4 = modifier2;
                CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(new SelectionColors(Color.INSTANCE.m6725getTransparent0d7_KjU(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU(), null)), ComposableLambda3.rememberComposableLambda(-822185916, true, new C400901(modifier4, f, state, onTapAction, onCheckBoxClicked), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableInputCellKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotTableInputCell3.TaxLotTableInputCell$lambda$0(state, onTapAction, onCheckBoxClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6).ordinal()];
            if (i4 != 1) {
            }
            Modifier modifier42 = modifier2;
            CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(new SelectionColors(Color.INSTANCE.m6725getTransparent0d7_KjU(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU(), null)), ComposableLambda3.rememberComposableLambda(-822185916, true, new C400901(modifier42, f, state, onTapAction, onCheckBoxClicked), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: TaxLotTableInputCell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.taxLots.views.TaxLotTableInputCellKt$TaxLotTableInputCell$1 */
    static final class C400901 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ float $maxForScreenWidth;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function2<String, Boolean, Unit> $onCheckBoxClicked;
        final /* synthetic */ Function1<T, Unit> $onTapAction;
        final /* synthetic */ TaxLotTableInputCellState<T> $state;

        /* JADX WARN: Multi-variable type inference failed */
        C400901(Modifier modifier, float f, TaxLotTableInputCellState<T> taxLotTableInputCellState, Function1<? super T, Unit> function1, Function2<? super String, ? super Boolean, Unit> function2) {
            this.$modifier = modifier;
            this.$maxForScreenWidth = f;
            this.$state = taxLotTableInputCellState;
            this.$onTapAction = function1;
            this.$onCheckBoxClicked = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(Function1 function1, Object obj) {
            function1.invoke(obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) {
            Modifier modifier;
            long jM21425getFg0d7_KjU;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-822185916, i, -1, "com.robinhood.shared.taxLots.views.TaxLotTableInputCell.<anonymous> (TaxLotTableInputCell.kt:57)");
            }
            composer.startReplaceGroup(153320955);
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(this.$modifier, C2002Dp.m7995constructorimpl(this.$maxForScreenWidth));
            final Object tapAction = this.$state.getTapAction();
            final Function1<T, Unit> function1 = this.$onTapAction;
            if (tapAction != null) {
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(tapAction);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableInputCellKt$TaxLotTableInputCell$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaxLotTableInputCell3.C400901.invoke$lambda$3$lambda$2$lambda$1(function1, tapAction);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5174width3ABfNKs, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                modifier = modifierM4891clickableO2vRcR0$default == null ? modifierM5174width3ABfNKs : modifierM4891clickableO2vRcR0$default;
            }
            composer.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            final TaxLotTableInputCellState<T> taxLotTableInputCellState = this.$state;
            final Function2<String, Boolean, Unit> function2 = this.$onCheckBoxClicked;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null);
            boolean enabled = taxLotTableInputCellState.getEnabled();
            SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU(), null);
            TextFieldValue textFieldValue = !taxLotTableInputCellState.isFocused() ? new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null) : taxLotTableInputCellState.getIsEmpty() ? taxLotTableInputCellState.getPlaceholderTextFieldValue() : taxLotTableInputCellState.getTextFieldValue();
            KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default = KeyboardOptions.m5353copyINvB4aQ$default(KeyboardOptions.INSTANCE.getDefault(), 0, null, 0, ImeAction.INSTANCE.m7749getNexteUduSuo(), null, null, null, 119, null);
            TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
            int iM7920getEnde0LSkKk = TextAlign.INSTANCE.m7920getEnde0LSkKk();
            if (!taxLotTableInputCellState.isFocused()) {
                composer.startReplaceGroup(1250567339);
                composer.endReplaceGroup();
                jM21425getFg0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
            } else if (taxLotTableInputCellState.isError()) {
                composer.startReplaceGroup(1250569736);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU();
                composer.endReplaceGroup();
            } else if (taxLotTableInputCellState.getIsEmpty()) {
                composer.startReplaceGroup(1250572035);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1250573890);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textS, jM21425getFg0d7_KjU, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, iM7920getEnde0LSkKk, 0, 0L, null, null, null, 0, 0, null, 16744446, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableInputCellKt$TaxLotTableInputCell$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaxLotTableInputCell3.C400901.invoke$lambda$8$lambda$5$lambda$4((TextFieldValue) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            TextFieldValue textFieldValue2 = textFieldValue;
            Function0 function0 = null;
            BasicTextFieldKt.BasicTextField(textFieldValue2, (Function1<? super TextFieldValue, Unit>) objRememberedValue3, modifierM5144paddingVpY3zN4$default, enabled, false, textStyleM7655copyp1EtxEg$default, keyboardOptionsM5353copyINvB4aQ$default, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(555248707, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableInputCellKt$TaxLotTableInputCell$1$2$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function22, Composer composer2, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function22, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer2, int i3) {
                    int i4;
                    long jM21427getFg30d7_KjU;
                    long jM21425getFg0d7_KjU2;
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer2.changedInstance(innerTextField) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(555248707, i4, -1, "com.robinhood.shared.taxLots.views.TaxLotTableInputCell.<anonymous>.<anonymous>.<anonymous> (TaxLotTableInputCell.kt:76)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                    if (taxLotTableInputCellState.isError()) {
                        composer2.startReplaceGroup(1018072011);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21452getNegative0d7_KjU();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1018074278);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                        composer2.endReplaceGroup();
                    }
                    Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(companion5, fM7995constructorimpl, jM21427getFg30d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM4876borderxT4_qwU, bentoTheme2.getSpacing(composer2, i5).m21593getSmallD9Ej5fM());
                    Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                    TaxLotTableInputCellState<T> taxLotTableInputCellState2 = taxLotTableInputCellState;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                    TextStyle textS2 = bentoTheme2.getTypography(composer2, i5).getTextS();
                    if (taxLotTableInputCellState2.isFocused()) {
                        composer2.startReplaceGroup(1509692040);
                        composer2.endReplaceGroup();
                        jM21425getFg0d7_KjU2 = Color.INSTANCE.m6725getTransparent0d7_KjU();
                    } else if (taxLotTableInputCellState2.getIsEmpty()) {
                        composer2.startReplaceGroup(1509694560);
                        jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer2, i5).m21427getFg30d7_KjU();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1509696543);
                        jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer2, i5).m21425getFg0d7_KjU();
                        composer2.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(taxLotTableInputCellState2.isFocused() ? "" : taxLotTableInputCellState2.getIsEmpty() ? taxLotTableInputCellState2.getPlaceholderText() : taxLotTableInputCellState2.getValue(), null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textS2, composer2, 817889280, 0, 7546);
                    innerTextField.invoke(composer2, Integer.valueOf(i4 & 14));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 100663344, 196608, 16016);
            Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(companion3);
            boolean enabled2 = taxLotTableInputCellState.getEnabled();
            ToggleableState toggleableState = taxLotTableInputCellState.getToggleableState();
            composer.startReplaceGroup(1250583224);
            if (taxLotTableInputCellState.getEnabled()) {
                composer.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer.changed(function2) | composer.changedInstance(taxLotTableInputCellState);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue4 == companion4.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableInputCellKt$TaxLotTableInputCell$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaxLotTableInputCell3.C400901.invoke$lambda$8$lambda$7$lambda$6(function2, taxLotTableInputCellState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                function0 = (Function0) objRememberedValue4;
            }
            composer.endReplaceGroup();
            CheckboxKt.TriStateCheckbox(toggleableState, function0, modifierMinimumInteractiveComponentSize, enabled2, CheckboxDefaults.INSTANCE.m5735colors5tl4gsc(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), composer, CheckboxDefaults.$stable << 18, 0), null, composer, 384, 32);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$5$lambda$4(TextFieldValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6(Function2 function2, TaxLotTableInputCellState taxLotTableInputCellState) {
            function2.invoke(taxLotTableInputCellState.getId(), Boolean.valueOf(taxLotTableInputCellState.getToggleableState() != ToggleableState.f174On));
            return Unit.INSTANCE;
        }
    }

    private static final void TaxLotTableInputCellPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-229691197);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-229691197, i, -1, "com.robinhood.shared.taxLots.views.TaxLotTableInputCellPreview (TaxLotTableInputCell.kt:192)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TaxLotTableInputCell.INSTANCE.m25780getLambda$488149893$lib_lot_table_ui_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableInputCellKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotTableInputCell3.TaxLotTableInputCellPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
