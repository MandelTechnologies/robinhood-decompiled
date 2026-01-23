package com.robinhood.android.equityadvancedorder.composables;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposable;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.tooltips.ModifiersKt;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityAdvancedOrderEditableValueRowComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u001aq\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"EquityAdvancedOrderEditableValueRowComposable", "", "state", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "rowClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "rowIconClicked", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon$IconId;", "onNumberChange", "Ljava/math/BigDecimal;", "editingField", "bentoNumpadScope", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/advancedorderbottomsheet/EditingField;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EditableValueRowIconTestTag", "", "EditableValueRowSecondaryTextTestTag", "EditableValueRowErrorIconTestTag", "TOOLTIP_DISPLAY_TIME_MS", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityAdvancedOrderEditableValueRowComposable {
    public static final String EditableValueRowErrorIconTestTag = "EditableValueRowErrorIcon";
    public static final String EditableValueRowIconTestTag = "EditableValueRowIcon";
    public static final String EditableValueRowSecondaryTextTestTag = "EditableValueRowSecondaryText";
    private static final long TOOLTIP_DISPLAY_TIME_MS = 8000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityAdvancedOrderEditableValueRowComposable$lambda$2(EquityOrderFormRowState.EditableValue editableValue, Function1 function1, Function1 function12, Function1 function13, EditingField editingField, BentoNumpadScopeV2 bentoNumpadScopeV2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityAdvancedOrderEditableValueRowComposable(editableValue, function1, function12, function13, editingField, bentoNumpadScopeV2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityAdvancedOrderEditableValueRowComposable(final EquityOrderFormRowState.EditableValue state, final Function1<? super EditingField, Unit> rowClicked, final Function1<? super EquityOrderFormRowState.Icon.IconId, Unit> rowIconClicked, final Function1<? super BigDecimal, Unit> onNumberChange, final EditingField editingField, final BentoNumpadScopeV2 bentoNumpadScopeV2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        BentoNumpadScopeV2 bentoNumpadScopeV22;
        int i4;
        Modifier modifier2;
        int i5;
        FocusManager focusManager;
        Object objRememberedValue;
        Composer.Companion companion;
        FocusRequester focusRequester;
        Modifier modifier3;
        Composer composer2;
        boolean z;
        boolean zChangedInstance;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rowClicked, "rowClicked");
        Intrinsics.checkNotNullParameter(rowIconClicked, "rowIconClicked");
        Intrinsics.checkNotNullParameter(onNumberChange, "onNumberChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1180432215);
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
            i3 |= composerStartRestartGroup.changedInstance(rowClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(rowIconClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNumberChange) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(editingField == null ? -1 : editingField.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else {
            if ((i & 196608) == 0) {
                bentoNumpadScopeV22 = bentoNumpadScopeV2;
                i3 |= composerStartRestartGroup.changedInstance(bentoNumpadScopeV22) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                i5 = i3;
                if ((599187 & i5) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1180432215, i5, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposable (EquityAdvancedOrderEditableValueRowComposable.kt:45)");
                    }
                    focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    focusRequester = (FocusRequester) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(524020322);
                    ComposableLambda composableLambdaRememberComposableLambda = (state.getSecondaryText() == null || state.getErrorText() != null) ? ComposableLambda3.rememberComposableLambda(1581893992, true, new C152801(state), composerStartRestartGroup, 54) : null;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z2 = true;
                    modifier3 = modifier2;
                    BentoBaseRowLayout.BentoBaseRowLayout(modifier3, null, null, ComposableLambda3.rememberComposableLambda(2127467668, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt.EquityAdvancedOrderEditableValueRowComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) throws Resources.NotFoundException {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2127467668, i6, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposable.<anonymous> (EquityAdvancedOrderEditableValueRowComposable.kt:52)");
                            }
                            StringResource title = state.getTitle();
                            Resources resources = context.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            InformationRowComposable3.InformationRowTitle(title.getText(resources).toString(), state.getTitleIcon(), rowIconClicked, null, composer3, StringResource.$stable << 3, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-711180394, true, new C152833(state, context, focusRequester, rowClicked, bentoNumpadScopeV22, onNumberChange), composerStartRestartGroup, 54), null, state.getShowDivider(), false, true, null, composerStartRestartGroup, ((i5 >> 18) & 14) | 805506048, 0, 1350);
                    composer2 = composerStartRestartGroup;
                    z = state.getRowType() != editingField && state.getOrderFormState() == OrderForm6.EDITING;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChanged = composer2.changed(z);
                    if ((i5 & 57344) != 16384) {
                        z2 = false;
                    }
                    zChangedInstance = z2 | zChanged | composer2.changedInstance(focusManager);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        EquityAdvancedOrderEditableValueRowComposable3 equityAdvancedOrderEditableValueRowComposable3 = new EquityAdvancedOrderEditableValueRowComposable3(z, focusRequester, editingField, focusManager, null);
                        composer2.updateRememberedValue(equityAdvancedOrderEditableValueRowComposable3);
                        objRememberedValue2 = equityAdvancedOrderEditableValueRowComposable3;
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EquityAdvancedOrderEditableValueRowComposable.EquityAdvancedOrderEditableValueRowComposable$lambda$2(state, rowClicked, rowIconClicked, onNumberChange, editingField, bentoNumpadScopeV2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            modifier2 = modifier;
            i5 = i3;
            if ((599187 & i5) == 599186) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                focusRequester = (FocusRequester) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(524020322);
                if (state.getSecondaryText() == null) {
                    ComposableLambda composableLambdaRememberComposableLambda2 = (state.getSecondaryText() == null || state.getErrorText() != null) ? ComposableLambda3.rememberComposableLambda(1581893992, true, new C152801(state), composerStartRestartGroup, 54) : null;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z22 = true;
                    modifier3 = modifier2;
                    BentoBaseRowLayout.BentoBaseRowLayout(modifier3, null, null, ComposableLambda3.rememberComposableLambda(2127467668, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt.EquityAdvancedOrderEditableValueRowComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) throws Resources.NotFoundException {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2127467668, i6, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposable.<anonymous> (EquityAdvancedOrderEditableValueRowComposable.kt:52)");
                            }
                            StringResource title = state.getTitle();
                            Resources resources = context2.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            InformationRowComposable3.InformationRowTitle(title.getText(resources).toString(), state.getTitleIcon(), rowIconClicked, null, composer3, StringResource.$stable << 3, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(-711180394, true, new C152833(state, context2, focusRequester, rowClicked, bentoNumpadScopeV22, onNumberChange), composerStartRestartGroup, 54), null, state.getShowDivider(), false, true, null, composerStartRestartGroup, ((i5 >> 18) & 14) | 805506048, 0, 1350);
                    composer2 = composerStartRestartGroup;
                    if (state.getRowType() != editingField) {
                        Boolean boolValueOf2 = Boolean.valueOf(z);
                        composer2.startReplaceGroup(-1224400529);
                        boolean zChanged2 = composer2.changed(z);
                        if ((i5 & 57344) != 16384) {
                        }
                        zChangedInstance = z22 | zChanged2 | composer2.changedInstance(focusManager);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!zChangedInstance) {
                            EquityAdvancedOrderEditableValueRowComposable3 equityAdvancedOrderEditableValueRowComposable32 = new EquityAdvancedOrderEditableValueRowComposable3(z, focusRequester, editingField, focusManager, null);
                            composer2.updateRememberedValue(equityAdvancedOrderEditableValueRowComposable32);
                            objRememberedValue2 = equityAdvancedOrderEditableValueRowComposable32;
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        bentoNumpadScopeV22 = bentoNumpadScopeV2;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: EquityAdvancedOrderEditableValueRowComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt$EquityAdvancedOrderEditableValueRowComposable$1 */
    static final class C152801 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ EquityOrderFormRowState.EditableValue $state;

        C152801(EquityOrderFormRowState.EditableValue editableValue) {
            this.$state = editableValue;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$5$lambda$2$lambda$1(int i) {
            return -i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$5$lambda$4$lambda$3(int i) {
            return -i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            EquityOrderFormRowState.EditableValue editableValue;
            boolean z;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1581893992, i, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposable.<anonymous> (EquityAdvancedOrderEditableValueRowComposable.kt:60)");
            }
            EquityOrderFormRowState.EditableValue editableValue2 = this.$state;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Function2<Composer, Integer, AnnotatedString> secondaryText = editableValue2.getSecondaryText();
            composer.startReplaceGroup(990452959);
            if (secondaryText == null) {
                editableValue = editableValue2;
                z = false;
            } else {
                editableValue = editableValue2;
                z = false;
                BentoText2.m20748BentoTextQnj7Zds(secondaryText.invoke(composer, 0), TestTag3.testTag(companion, EquityAdvancedOrderEditableValueRowComposable.EditableValueRowSecondaryTextTestTag), null, null, null, null, null, 0, false, 0, 0, null, null, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 48, 0, 8188);
            }
            composer.endReplaceGroup();
            boolean z2 = editableValue.getErrorText() != null ? true : z;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt$EquityAdvancedOrderEditableValueRowComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(EquityAdvancedOrderEditableValueRowComposable.C152801.invoke$lambda$5$lambda$2$lambda$1(((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt$EquityAdvancedOrderEditableValueRowComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(EquityAdvancedOrderEditableValueRowComposable.C152801.invoke$lambda$5$lambda$4$lambda$3(((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            final EquityOrderFormRowState.EditableValue editableValue3 = editableValue;
            AnimatedVisibilityKt.AnimatedVisibility(column6, z2, (Modifier) null, enterTransitionPlus, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue2, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambda3.rememberComposableLambda(-1079229770, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt$EquityAdvancedOrderEditableValueRowComposable$1$1$4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i2) throws Resources.NotFoundException {
                    CharSequence text;
                    Composer composer3;
                    Modifier.Companion companion4;
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1079229770, i2, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposable.<anonymous>.<anonymous>.<anonymous> (EquityAdvancedOrderEditableValueRowComposable.kt:73)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, bentoTheme.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    EquityOrderFormRowState.EditableValue editableValue4 = editableValue3;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    EquityOrderFormRowState.Icon errorIcon = editableValue4.getErrorIcon();
                    composer2.startReplaceGroup(-1275128167);
                    if (errorIcon == null) {
                        composer3 = composer2;
                        companion4 = companion5;
                    } else {
                        BentoIcon4.Size16 size16 = new BentoIcon4.Size16(errorIcon.getIconAsset());
                        StringResource contentDescription = errorIcon.getContentDescription();
                        composer2.startReplaceGroup(-1275120415);
                        if (contentDescription == null) {
                            text = null;
                        } else {
                            Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            text = contentDescription.getText(resources);
                        }
                        composer2.endReplaceGroup();
                        composer3 = composer2;
                        companion4 = companion5;
                        BentoIcon2.m20644BentoIconFU0evQE(size16, text != null ? text.toString() : null, bentoTheme.getColors(composer2, i3).m21452getNegative0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composer3, BentoIcon4.Size16.$stable, 48);
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1275110035);
                    if (editableValue4.getErrorText() != null) {
                        BentoText2.m20748BentoTextQnj7Zds(editableValue4.getErrorText().invoke(composer3, 0), TestTag3.testTag(companion4, EquityAdvancedOrderEditableValueRowComposable.EditableValueRowErrorIconTestTag), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer3, i3).getTextS(), composer2, 48, 0, 8188);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 1600518, 18);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* compiled from: EquityAdvancedOrderEditableValueRowComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt$EquityAdvancedOrderEditableValueRowComposable$3 */
    static final class C152833 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ BentoNumpadScopeV2 $bentoNumpadScope;
        final /* synthetic */ Context $context;
        final /* synthetic */ FocusRequester $internalFocusRequester;
        final /* synthetic */ Function1<BigDecimal, Unit> $onNumberChange;
        final /* synthetic */ Function1<EditingField, Unit> $rowClicked;
        final /* synthetic */ EquityOrderFormRowState.EditableValue $state;

        /* JADX WARN: Multi-variable type inference failed */
        C152833(EquityOrderFormRowState.EditableValue editableValue, Context context, FocusRequester focusRequester, Function1<? super EditingField, Unit> function1, BentoNumpadScopeV2 bentoNumpadScopeV2, Function1<? super BigDecimal, Unit> function12) {
            this.$state = editableValue;
            this.$context = context;
            this.$internalFocusRequester = focusRequester;
            this.$rowClicked = function1;
            this.$bentoNumpadScope = bentoNumpadScopeV2;
            this.$onNumberChange = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EquityOrderFormRowState.EditableValue editableValue, Function1 function1, FocusState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isFocused() && editableValue.getOrderFormState() == OrderForm6.EDITING) {
                function1.invoke(editableValue.getRowType());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(Function1 function1, EquityOrderFormRowState.EditableValue editableValue) {
            function1.invoke(editableValue.getRowType());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            String string2;
            String string3;
            String string4;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-711180394, i, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposable.<anonymous> (EquityAdvancedOrderEditableValueRowComposable.kt:101)");
            }
            StringResource placeholderValue = this.$state.getPlaceholderValue();
            String string5 = null;
            if (placeholderValue != null) {
                Resources resources = this.$context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                CharSequence text = placeholderValue.getText(resources);
                string2 = text != null ? text.toString() : null;
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, this.$state.getTestTag());
            StringResource metaTooltipText = this.$state.getMetaTooltipText();
            if (metaTooltipText != null) {
                Resources resources2 = this.$context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                CharSequence text2 = metaTooltipText.getText(resources2);
                string3 = text2 != null ? text2.toString() : null;
            }
            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(ModifiersKt.tooltip$default(modifierTestTag, string3, null, new TooltipData.Behavior(null, Long.valueOf(EquityAdvancedOrderEditableValueRowComposable.TOOLTIP_DISPLAY_TIME_MS), null, null, 13, null), null, false, 26, null), this.$internalFocusRequester);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$rowClicked);
            final EquityOrderFormRowState.EditableValue editableValue = this.$state;
            final Function1<EditingField, Unit> function1 = this.$rowClicked;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt$EquityAdvancedOrderEditableValueRowComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityAdvancedOrderEditableValueRowComposable.C152833.invoke$lambda$1$lambda$0(editableValue, function1, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue);
            if (this.$bentoNumpadScope == null) {
                throw new IllegalStateException("BentoNumpadScopeV2 must be provided when using EquityAdvancedOrderInlineTextInputV2");
            }
            if (this.$state.getOrderFormState() == OrderForm6.EDITING) {
                composer.startReplaceGroup(299517647);
                String textFieldId = this.$state.getTextFieldId();
                StringResource value = this.$state.getValue();
                if (value != null) {
                    Resources resources3 = this.$context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                    CharSequence text3 = value.getText(resources3);
                    if (text3 != null) {
                        string5 = text3.toString();
                    }
                }
                boolean z = this.$state.getErrorText() != null;
                BentoNumpadTextInputFormatter numpadTextInputFormatter = this.$state.getNumpadTextInputFormatter();
                BentoNumpadScopeV2 bentoNumpadScopeV2 = this.$bentoNumpadScope;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(this.$rowClicked) | composer.changedInstance(this.$state);
                final Function1<EditingField, Unit> function12 = this.$rowClicked;
                final EquityOrderFormRowState.EditableValue editableValue2 = this.$state;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt$EquityAdvancedOrderEditableValueRowComposable$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityAdvancedOrderEditableValueRowComposable.C152833.invoke$lambda$4$lambda$3(function12, editableValue2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                EquityAdvancedOrderInlineTextInput.EquityAdvancedOrderInlineTextInput(string2, string5, textFieldId, bentoNumpadScopeV2, numpadTextInputFormatter, (Function0) objRememberedValue2, z, modifierOnFocusChanged, this.$onNumberChange, composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(300294445);
                StringResource value2 = this.$state.getValue();
                if (value2 != null) {
                    Resources resources4 = this.$context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                    CharSequence text4 = value2.getText(resources4);
                    if (text4 != null && (string4 = text4.toString()) != null) {
                        string2 = string4;
                    }
                }
                if (string2 != null) {
                    BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
                    Unit unit = Unit.INSTANCE;
                }
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
