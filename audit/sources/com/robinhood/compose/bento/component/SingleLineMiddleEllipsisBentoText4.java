package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SingleLineMiddleEllipsisBentoText.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\r\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000e\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"SingleLineMiddleEllipsisBentoText", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "SingleLineMiddleEllipsisBentoText-xqIIw2o", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "EllipsisText", "PreviewSingleLineMiddleEllipsisBentoText", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoTextKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class SingleLineMiddleEllipsisBentoText4 {
    private static final String EllipsisText = "…";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSingleLineMiddleEllipsisBentoText$lambda$6(int i, Composer composer, int i2) {
        PreviewSingleLineMiddleEllipsisBentoText(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleLineMiddleEllipsisBentoText_xqIIw2o$lambda$5(String str, Modifier modifier, TextStyle textStyle, Color color, int i, int i2, Composer composer, int i3) {
        m20836SingleLineMiddleEllipsisBentoTextxqIIw2o(str, modifier, textStyle, color, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0148  */
    /* renamed from: SingleLineMiddleEllipsisBentoText-xqIIw2o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20836SingleLineMiddleEllipsisBentoTextxqIIw2o(final String text, Modifier modifier, TextStyle textStyle, Color color, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TextStyle style;
        int i4;
        Color color2;
        int i5;
        boolean z;
        Object objRememberedValue;
        final String str;
        boolean zChanged;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        boolean zChanged2;
        Object objRememberedValue3;
        final TextStyle textStyle2;
        final Color color3;
        final Color color4;
        final TextStyle textStyle3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1293520301);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    style = textStyle;
                    int i7 = composerStartRestartGroup.changed(style) ? 256 : 128;
                    i3 |= i7;
                } else {
                    style = textStyle;
                }
                i3 |= i7;
            } else {
                style = textStyle;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    color2 = color;
                    i3 |= composerStartRestartGroup.changed(color2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    textStyle3 = style;
                    color4 = color2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
                        }
                        if (i4 == 0) {
                            i5 = i3;
                            modifier2 = modifier3;
                            color2 = null;
                        } else {
                            i5 = i3;
                            modifier2 = modifier3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        i5 = i3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1293520301, i5, -1, "com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoText (SingleLineMiddleEllipsisBentoText.kt:34)");
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i8 = i5 & 14;
                    z = i8 != 4;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = text + " …";
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    str = (String) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged2 = composerStartRestartGroup.changed(str) | ((i5 & 7168) != 2048) | composerStartRestartGroup.changed(snapshotState) | ((((i5 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(style)) || (i5 & 384) == 256) | (i8 == 4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        textStyle2 = style;
                        color3 = color2;
                        Function2 function2 = new Function2() { // from class: com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoTextKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SingleLineMiddleEllipsisBentoText4.SingleLineMiddleEllipsisBentoText_xqIIw2o$lambda$4$lambda$3(snapshotState, str, color3, textStyle2, text, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function2);
                        objRememberedValue3 = function2;
                    } else {
                        textStyle2 = style;
                        color3 = color2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(modifier2, (Function2) objRememberedValue3, composerStartRestartGroup, (i5 >> 3) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    TextStyle textStyle4 = textStyle2;
                    color4 = color3;
                    textStyle3 = textStyle4;
                }
                final Modifier modifier4 = modifier2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoTextKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SingleLineMiddleEllipsisBentoText4.SingleLineMiddleEllipsisBentoText_xqIIw2o$lambda$5(text, modifier4, textStyle3, color4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            color2 = color;
            if ((i3 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i82 = i5 & 14;
                    if (i82 != 4) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = text + " …";
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        str = (String) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(str);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            snapshotState = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            if (((i5 & 896) ^ 384) <= 256) {
                                zChanged2 = composerStartRestartGroup.changed(str) | ((i5 & 7168) != 2048) | composerStartRestartGroup.changed(snapshotState) | ((((i5 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(style)) || (i5 & 384) == 256) | (i82 == 4);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    textStyle2 = style;
                                    color3 = color2;
                                    Function2 function22 = new Function2() { // from class: com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoTextKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return SingleLineMiddleEllipsisBentoText4.SingleLineMiddleEllipsisBentoText_xqIIw2o$lambda$4$lambda$3(snapshotState, str, color3, textStyle2, text, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(function22);
                                    objRememberedValue3 = function22;
                                    composerStartRestartGroup.endReplaceGroup();
                                    SubcomposeLayoutKt.SubcomposeLayout(modifier2, (Function2) objRememberedValue3, composerStartRestartGroup, (i5 >> 3) & 14, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    TextStyle textStyle42 = textStyle2;
                                    color4 = color3;
                                    textStyle3 = textStyle42;
                                }
                            } else {
                                zChanged2 = composerStartRestartGroup.changed(str) | ((i5 & 7168) != 2048) | composerStartRestartGroup.changed(snapshotState) | ((((i5 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(style)) || (i5 & 384) == 256) | (i82 == 4);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                }
                            }
                        }
                    }
                }
            }
            final Modifier modifier42 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        color2 = color;
        if ((i3 & 1171) == 1170) {
        }
        final Modifier modifier422 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult SingleLineMiddleEllipsisBentoText_xqIIw2o$lambda$4$lambda$3(SnapshotState snapshotState, String str, Color color, TextStyle textStyle, String str2, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        ((Measurable) CollectionsKt.first((List) SubcomposeLayout.subcompose("measure", ComposableLambda3.composableLambdaInstance(786628604, true, new SingleLineMiddleEllipsisBentoText5(str, color, snapshotState, textStyle))))).mo7239measureBRTryo0(Constraints2.Constraints$default(0, 0, 0, 0, 15, null));
        TextLayoutResult textLayoutResult = (TextLayoutResult) snapshotState.getValue();
        if (textLayoutResult == null) {
            throw new IllegalStateException("onTextLayout was not called before subcompose finishes");
        }
        final Placeable placeableMo7239measureBRTryo0 = SubcomposeLayout.subcompose("visible", ComposableLambda3.composableLambdaInstance(-197747360, true, new SingleLineMiddleEllipsisBentoText6(constraints, str2, textLayoutResult, color, textStyle, str))).get(0).mo7239measureBRTryo0(constraints.getValue());
        return MeasureScope.layout$default(SubcomposeLayout, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1() { // from class: com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoTextKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SingleLineMiddleEllipsisBentoText4.m2576x1549210d(placeableMo7239measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SingleLineMiddleEllipsisBentoText_xqIIw2o$lambda$4$lambda$3$lambda$2 */
    public static final Unit m2576x1549210d(Placeable placeable, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    public static final void PreviewSingleLineMiddleEllipsisBentoText(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1268755384);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1268755384, i, -1, "com.robinhood.compose.bento.component.PreviewSingleLineMiddleEllipsisBentoText (SingleLineMiddleEllipsisBentoText.kt:139)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SingleLineMiddleEllipsisBentoText2.INSTANCE.m20807getLambda$1984910592$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoTextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SingleLineMiddleEllipsisBentoText4.PreviewSingleLineMiddleEllipsisBentoText$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
