package com.robinhood.android.equityadvancedorder.composables;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityAdvancedOrderDropdownEditRowComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"EquityAdvancedOrderDropdownEditRowComposable", "", "state", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$DropdownEdit;", "rowClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$DropdownEdit;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderDropdownEditRowComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityAdvancedOrderDropdownEditRowComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityAdvancedOrderDropdownEditRowComposable$lambda$8(EquityOrderFormRowState.DropdownEdit dropdownEdit, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        EquityAdvancedOrderDropdownEditRowComposable(dropdownEdit, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityAdvancedOrderDropdownEditRowComposable(final EquityOrderFormRowState.DropdownEdit state, final Function1<? super EditingField, Unit> rowClicked, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        CharSequence text;
        AnnotatedString.Builder builder;
        long jM21426getFg20d7_KjU;
        int iPushStyle;
        BentoBaseRowState.Meta singleLine;
        BentoBaseRowState.Meta singleLineAndIcon;
        StringResource secondaryTitle;
        final Modifier modifier3;
        CharSequence text2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rowClicked, "rowClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-899234514);
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
            i3 |= composerStartRestartGroup.changedInstance(rowClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-899234514, i3, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderDropdownEditRowComposable (EquityAdvancedOrderDropdownEditRowComposable.kt:29)");
                }
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(-875930595);
                if (state.getSecondaryValue() == null) {
                    builder = new AnnotatedString.Builder(0, 1, null);
                    iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                    try {
                        StringResource value = state.getValue();
                        if (value != null) {
                            Resources resources = context.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            text2 = value.getText(resources);
                        } else {
                            text2 = null;
                        }
                        builder.append(String.valueOf(text2));
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        StringResource secondaryValue = state.getSecondaryValue();
                        Resources resources2 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        AnnotatedString annotatedString2 = new AnnotatedString(secondaryValue.getText(resources2).toString(), null, 2, null);
                        if (state.getOrderFormState() == OrderForm6.EDITING) {
                            singleLineAndIcon = new BentoBaseRowState.Meta.TwoLineAndIcon(annotatedString, annotatedString2, ServerToBentoAssetMapper2.DROPDOWN_16, "", null, null, 48, null);
                            singleLine = singleLineAndIcon;
                            composerStartRestartGroup.endReplaceGroup();
                            StringResource title = state.getTitle();
                            Resources resources3 = context.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                            String string2 = title.getText(resources3).toString();
                            secondaryTitle = state.getSecondaryTitle();
                            if (secondaryTitle == null) {
                                Resources resources4 = context.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                                CharSequence text3 = secondaryTitle.getText(resources4);
                                String string3 = text3 != null ? text3.toString() : null;
                                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, string2, string3, (String) null, singleLine, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (DefaultConstructorMarker) null);
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                int i5 = i3 & 14;
                                boolean z = (i5 == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(state))) | ((i3 & 112) == 32);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderDropdownEditRowComposableKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return EquityAdvancedOrderDropdownEditRowComposable.EquityAdvancedOrderDropdownEditRowComposable$lambda$5$lambda$4(state, rowClicked);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null);
                                Modifier modifier5 = modifier4;
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean z2 = i5 == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(state));
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderDropdownEditRowComposableKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return EquityAdvancedOrderDropdownEditRowComposable.EquityAdvancedOrderDropdownEditRowComposable$lambda$7$lambda$6(state, (SemanticsPropertyReceiver) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(SemanticsModifier6.semantics$default(modifierM4893clickableXHw0xAI$default, false, (Function1) objRememberedValue2, 1, null), bentoBaseRowState, false, false, true, 0L, null, composerStartRestartGroup, (BentoBaseRowState.$stable << 3) | 24576, 108);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier5;
                            }
                        } else {
                            singleLine = new BentoBaseRowState.Meta.TwoLine(annotatedString, annotatedString2);
                            composerStartRestartGroup.endReplaceGroup();
                            StringResource title2 = state.getTitle();
                            Resources resources32 = context.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources32, "getResources(...)");
                            String string22 = title2.getText(resources32).toString();
                            secondaryTitle = state.getSecondaryTitle();
                            if (secondaryTitle == null) {
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    StringResource value2 = state.getValue();
                    if (value2 == null) {
                        value2 = state.getPlaceholderValue();
                    }
                    if (value2 != null) {
                        Resources resources5 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
                        text = value2.getText(resources5);
                    } else {
                        text = null;
                    }
                    String strValueOf = String.valueOf(text);
                    builder = new AnnotatedString.Builder(0, 1, null);
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    if (state.getValue() != null) {
                        composerStartRestartGroup.startReplaceGroup(-1469035559);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1468962120);
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    iPushStyle = builder.pushStyle(new SpanStyle(jM21426getFg20d7_KjU, 0L, bold, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                    try {
                        builder.append(strValueOf);
                        Unit unit2 = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        AnnotatedString annotatedString3 = builder.toAnnotatedString();
                        if (state.getOrderFormState() == OrderForm6.EDITING) {
                            singleLineAndIcon = new BentoBaseRowState.Meta.SingleLineAndIcon(annotatedString3, ServerToBentoAssetMapper2.DROPDOWN_16, "", (Color) null, 8, (DefaultConstructorMarker) null);
                            singleLine = singleLineAndIcon;
                            composerStartRestartGroup.endReplaceGroup();
                            StringResource title22 = state.getTitle();
                            Resources resources322 = context.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources322, "getResources(...)");
                            String string222 = title22.getText(resources322).toString();
                            secondaryTitle = state.getSecondaryTitle();
                            if (secondaryTitle == null) {
                            }
                        } else {
                            singleLine = new BentoBaseRowState.Meta.SingleLine(annotatedString3);
                            composerStartRestartGroup.endReplaceGroup();
                            StringResource title222 = state.getTitle();
                            Resources resources3222 = context.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources3222, "getResources(...)");
                            String string2222 = title222.getText(resources3222).toString();
                            secondaryTitle = state.getSecondaryTitle();
                            if (secondaryTitle == null) {
                            }
                        }
                    } finally {
                        builder.pop(iPushStyle);
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderDropdownEditRowComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityAdvancedOrderDropdownEditRowComposable.EquityAdvancedOrderDropdownEditRowComposable$lambda$8(state, rowClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-875930595);
            if (state.getSecondaryValue() == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityAdvancedOrderDropdownEditRowComposable$lambda$5$lambda$4(EquityOrderFormRowState.DropdownEdit dropdownEdit, Function1 function1) {
        if (dropdownEdit.getOrderFormState() == OrderForm6.EDITING) {
            function1.invoke(dropdownEdit.getRowType());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityAdvancedOrderDropdownEditRowComposable$lambda$7$lambda$6(EquityOrderFormRowState.DropdownEdit dropdownEdit, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTestTag(semantics, dropdownEdit.getTestTag());
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }
}
